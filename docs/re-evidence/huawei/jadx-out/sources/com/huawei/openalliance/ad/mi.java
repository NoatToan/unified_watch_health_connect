package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class mi {
    public static boolean a(String str) {
        try {
            Class.forName(str);
            hw.b("OMSDKCheckUtil", str);
            return true;
        } catch (ClassNotFoundException unused) {
            hw.b("OMSDKCheckUtil", str + " is not avaliable");
            return false;
        }
    }
}
