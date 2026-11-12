package com.xiaomi.hm.health.help;

/* JADX INFO: loaded from: classes21.dex */
public class UserHelp {
    private static UserHelp b;
    private int a = 0;

    private UserHelp() {
    }

    public static synchronized UserHelp getInstance() {
        if (b == null) {
            b = new UserHelp();
        }
        return b;
    }

    public int getCount() {
        return this.a;
    }
}
