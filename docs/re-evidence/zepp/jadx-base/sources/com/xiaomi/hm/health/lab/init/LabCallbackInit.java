package com.xiaomi.hm.health.lab.init;

/* JADX INFO: loaded from: classes21.dex */
public class LabCallbackInit {
    private static InitCallBack a;

    public static InitCallBack getInitCallBack() {
        InitCallBack initCallBack = a;
        if (initCallBack != null) {
            return initCallBack;
        }
        throw new IllegalArgumentException("LabInit must init");
    }

    public static void setInitCallBack(InitCallBack initCallBack) {
        a = initCallBack;
    }
}
