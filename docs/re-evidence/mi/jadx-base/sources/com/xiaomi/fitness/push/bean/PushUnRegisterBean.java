package com.xiaomi.fitness.push.bean;

/* JADX INFO: loaded from: classes9.dex */
public class PushUnRegisterBean {
    public String deviceid;
    public String package_name;
    public final String pushType = "0";

    public static PushUnRegisterBean create(String str, String str2) {
        PushUnRegisterBean pushUnRegisterBean = new PushUnRegisterBean();
        pushUnRegisterBean.deviceid = str;
        pushUnRegisterBean.package_name = str2;
        return pushUnRegisterBean;
    }
}
