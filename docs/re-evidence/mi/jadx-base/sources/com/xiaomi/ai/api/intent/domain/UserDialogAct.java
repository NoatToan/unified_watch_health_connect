package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.fitness.pay.export.data.response.OrderStatus;

/* JADX INFO: loaded from: classes7.dex */
public enum UserDialogAct {
    Request(1, "Request"),
    Inform(2, "Inform"),
    Cancel(3, OrderStatus.CANCEL),
    Confirm(4, "Confirm"),
    Select(5, "Select");

    private int id;
    private String name;

    UserDialogAct(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static UserDialogAct find(String str) {
        for (UserDialogAct userDialogAct : values()) {
            if (userDialogAct.name.equals(str)) {
                return userDialogAct;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static UserDialogAct read(String str) {
        return find(str);
    }

    public static String write(UserDialogAct userDialogAct) {
        return userDialogAct.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
