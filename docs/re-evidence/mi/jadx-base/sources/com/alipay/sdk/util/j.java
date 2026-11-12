package com.alipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static String a(Context context) {
        if (EnvUtils.a()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return com.alipay.sdk.cons.a.f5830a;
        }
        String str = com.alipay.sdk.cons.a.f5830a;
        return TextUtils.isEmpty(str) ? com.alipay.sdk.cons.a.f5830a : str;
    }
}
