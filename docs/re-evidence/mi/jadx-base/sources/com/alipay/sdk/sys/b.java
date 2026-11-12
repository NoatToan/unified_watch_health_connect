package com.alipay.sdk.sys;

import android.content.Context;
import com.alipay.sdk.util.c;
import com.ta.utdid2.device.UTDevice;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f5869b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5870a;

    private b() {
    }

    public static b a() {
        if (f5869b == null) {
            f5869b = new b();
        }
        return f5869b;
    }

    public static boolean e() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public void b(Context context) {
        com.alipay.sdk.data.b.e();
        this.f5870a = context.getApplicationContext();
    }

    public Context c() {
        return this.f5870a;
    }

    public com.alipay.sdk.data.b d() {
        return com.alipay.sdk.data.b.e();
    }

    public String f() {
        try {
            return UTDevice.getUtdid(this.f5870a);
        } catch (Throwable th) {
            c.d(th);
            return "getUtdidEx";
        }
    }
}
