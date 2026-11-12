package com.huawei.openalliance.ad.utils;

import android.os.Build;
import com.huawei.openalliance.ad.hw;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes12.dex */
public class cv {
    public static SSLContext a() {
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            hw.a("SSLContextUtil", "use tls 1.3");
            str = "TLSv1.3";
        } else {
            hw.a("SSLContextUtil", "use tls 1.2");
            str = "TLSv1.2";
        }
        return SSLContext.getInstance(str);
    }
}
