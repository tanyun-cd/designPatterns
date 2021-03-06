package com.designpatterns.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tanyun
 * @Description 具体主题角色（被观察者）
 * @date 2022/2/22 20:13
 */
public class SubscriptionSubject implements Subject {

    /**
     * 定义一个集合，用来存储多个观察者对象
     */
    private List<Observer> weiXinUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    /**
     * 通知观察者们
     * @param message
     */
    @Override
    public void notify(String message) {
        // 遍历所有观察者
        for (Observer observer : weiXinUserList) {
            // 调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
