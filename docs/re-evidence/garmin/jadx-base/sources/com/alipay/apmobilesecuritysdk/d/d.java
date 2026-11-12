package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static synchronized Map<String, String> a(Context context) {
        HashMap map;
        String str;
        try {
            int i14 = hg.e.f83651a;
            hg.b.f83645b.f83646a = APSecuritySdk.getInstance(context);
            map = new HashMap();
            map.put("AE1", "android");
            map.put("AE2", hg.e.a() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            StringBuilder sb3 = new StringBuilder();
            try {
                str = (Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic")) ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
            } catch (Exception unused) {
            }
            sb3.append(str);
            map.put("AE3", sb3.toString());
            map.put("AE4", Build.BOARD);
            map.put("AE5", Build.BRAND);
            map.put("AE6", Build.DEVICE);
            map.put("AE7", Build.DISPLAY);
            map.put("AE8", Build.VERSION.INCREMENTAL);
            map.put("AE9", Build.MANUFACTURER);
            map.put("AE10", Build.MODEL);
            map.put("AE11", Build.PRODUCT);
            map.put("AE12", Build.VERSION.RELEASE);
            map.put("AE13", Build.VERSION.SDK);
            map.put("AE14", Build.TAGS);
            String str2 = "0";
            try {
                str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "ro.kernel.qemu", "0");
            } catch (Exception unused2) {
            }
            map.put("AE15", str2);
            map.put("AE21", hg.b.a());
        } catch (Throwable th3) {
            throw th3;
        }
        return map;
    }

    public static synchronized Map<String, String> a() {
        HashMap map;
        map = new HashMap();
        try {
            new com.alipay.apmobilesecuritysdk.c.b();
            map.put("AE16", "");
        } catch (Throwable unused) {
        }
        return map;
    }
}
