package apple.service.core.auth.boundary;

import apple.service.core.auth.control.PasswordHashIng;
import apple.service.core.auth.control.UserDAO;
import apple.service.core.auth.model.Role;
import apple.service.core.auth.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@ViewScoped
public class RegistrationBean implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginBean.class);
    @Inject
    private PasswordHashIng passwordHash;
    @Inject
    private CurrentUser currentUser;
    @Inject
    private UserDAO userDAO;
    @NotBlank(message = "Внимание! Хакер апознан! Я тебе не дам вести пустое поле!!! ")
    @Size(min = 4, message = "Логин минимум - 4 - символа.")
    @Size(max = 20, message = "Вы! Что удумали?! Этоже LOCAL! Не надо так усердствовать. Логин максиму - 20 - символов. ")
    private String loginName;
    @NotBlank(message = "Я не увидела Пароля. (Please) Попытайся ещё разок!")
    @Size(min = 6, message = "Паролик очень кароткий! Сделай минимум - 6 - символов!")
    @Size(max = 20, message = "Не издевайся над собой! c{_]. Максимум - 20 - символов")
    private String password1;
    @NotBlank(message = "(Повтор) Я не прочитала Пароля. ")
    @Size(min = 6, message = "(Повтор)  Лучше проверь, пока я не разозлилась!")
    @Size(max = 20, message = "(Повтор) Не издевайся надо мной!!! c{_]. Максимум - 20 - символов")
    private String password2;

    public String register() {
        if (!Objects.equals(password1, password2)) {
            FacesMessage msg = new FacesMessage(" Пароли не совподают. Повтор- это повторить. 'ctrl+c -> ctrl+v'. Психовать буду ******: АГА!.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
        try {
            UserEntity user = new UserEntity();
            user.setLoginName(loginName);
            String hashedPassword = passwordHash.get().generate(password1.toCharArray());
            user.setPasswordHash(hashedPassword);
            user.setRoleName(Role.USER);
            userDAO.createUser(user);
            LOGGER.debug("User {} registered. Hashed password: {}", loginName, hashedPassword);
            return "ERROR- 2xx. Удачно! Без сарказма!";
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("ERROR-406. Попробуй другой Логин! А? Просто эта персона (пальцами не показоваю) уже скамуниздела!");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            LOGGER.warn("ERROR- 409. Что-то не так? Решай сам(а) свои проблемы!", e);
            return null;
        }
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
