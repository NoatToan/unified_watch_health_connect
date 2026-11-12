package com.xiaomi.fitness.push.bean;

import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.mipush.sdk.b;

/* JADX INFO: loaded from: classes9.dex */
public class PushRegisterBean {
    public String deviceid;
    public String package_name;
    public String pushid;
    public String region;
    public final int appid = 10;
    public final String pushType = "0";
    public String app_tag = "default";

    public static PushRegisterBean create(String str, String str2, String str3) {
        PushRegisterBean pushRegisterBean = new PushRegisterBean();
        pushRegisterBean.pushid = str;
        pushRegisterBean.deviceid = str2;
        pushRegisterBean.region = b.x(AppUtil.getApp());
        pushRegisterBean.package_name = str3;
        return pushRegisterBean;
    }
}
