package com.nowcoder.async;

/**
 * Created by nowcoder on 2016/7/30.
 */
public enum EventType {
    LIKE(0),//喜欢
    COMMENT(1),//评论
    LOGIN(2),//登录异常
    MAIL(3);//邮件

    private int value;
    EventType(int value) { this.value = value; }
    public int getValue() { return value; }
}
