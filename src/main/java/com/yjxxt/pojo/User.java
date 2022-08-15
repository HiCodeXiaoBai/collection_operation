package com.yjxxt.pojo;

public class User {
    //用户id
    private Integer id;
    //用户名
    private String userName;
    //用户密码
    private String userPwd;
    //用户昵称
    private String nick;
    //用户心情
    private String mood;
    //用户头像
    private String head;

    public User(Integer id, String userName, String userPwd, String nick, String mood, String head) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.nick = nick;
        this.mood = mood;
        this.head = head;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
