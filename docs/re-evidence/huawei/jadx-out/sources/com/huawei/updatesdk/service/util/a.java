package com.huawei.updatesdk.service.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final Map<Integer, String> d;
    private static a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30010b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30011c = "";

    public String f() {
        return this.f30011c;
    }

    public int e() {
        return this.f30010b;
    }

    public int b() {
        return this.f30009a;
    }

    private void h() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build");
            String str = (String) cls.getDeclaredField("MAGIC_VERSION").get(cls);
            if (str == null) {
                str = "";
            }
            this.f30011c = str;
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.c("SystemSupportUtil", "initMagicVersion, error: " + th.getMessage());
        }
    }

    private void g() {
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build$VERSION");
            this.f30010b = cls.getDeclaredField("MAGIC_SDK_INT").getInt(cls);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.a.c("SystemSupportUtil", "initMagicApiLevel, error: " + th.getMessage());
        }
    }

    public static a d() {
        return e;
    }

    private int c() {
        return com.huawei.updatesdk.sdk.foundation.utils.device.c.a("ro.build.hw_emui_api_level", 0);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("_");
        return strArrSplit.length == 2 ? strArrSplit[1] : "";
    }

    private int a() {
        String strA = a(com.huawei.updatesdk.sdk.foundation.utils.device.c.a("ro.build.version.emui", ""));
        if (TextUtils.isEmpty(strA)) {
            return 0;
        }
        for (Map.Entry<Integer, String> entry : d.entrySet()) {
            if (strA.equals(entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return 0;
    }

    private a() {
        int iC = c();
        this.f30009a = iC;
        if (iC == 0) {
            this.f30009a = a();
        }
        g();
        h();
        com.huawei.updatesdk.sdk.foundation.a.b("SystemSupportUtil", "emuiVersion:" + this.f30009a + ", magicApiLevel:" + this.f30010b + ", magicVersion:" + this.f30011c);
    }

    static {
        HashMap map = new HashMap();
        d = map;
        e = new a();
        map.put(1, "1.0");
        map.put(2, "1.5");
        map.put(3, "1.6");
        map.put(4, "2.0");
        map.put(5, "2.0");
        map.put(6, "2.3");
        map.put(7, "3.0");
        map.put(8, "3.0.5");
        map.put(8, "3.1");
        map.put(9, "4.0");
        map.put(10, "4.1");
        map.put(11, "5.0");
        map.put(12, "5.1");
    }
}
