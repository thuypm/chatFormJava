/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.Chat;

/**
 *
 * @author MINH THUY
 */
public class messageData {
    private String user;
    private String textContent;

    public void setUser(String user) {
        this.user = user;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getUser() {
        return user;
    }

    public String getTextContent() {
        return textContent;
    }

    public messageData(String user, String textContent) {
        this.user = user;
        this.textContent = textContent;
    }
    
}
