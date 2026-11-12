package com.xiaomi.onetrack.b;

import android.text.TextUtils;
import com.xiaomi.onetrack.util.p;
import com.xiaomi.onetrack.util.q;

/* JADX INFO: loaded from: classes11.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f13826a = "ConfigProvider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f13827b = false;
    private static volatile boolean c = true;

    public static boolean a() {
        try {
            String[] strArrB = com.xiaomi.onetrack.d.f.a().b();
            return (!TextUtils.isEmpty(strArrB[0]) && !TextUtils.isEmpty(strArrB[1])) && !q.a(f13826a);
        } catch (Exception e) {
            p.a(f13826a, "ConfigProvider.available", e);
            return false;
        }
    }

    public static synchronized boolean b() {
        return f13827b;
    }

    public static boolean c() {
        return com.xiaomi.onetrack.g.c.a();
    }

    public static int a(int i) {
        int iIntValue;
        if (p.f13987b) {
            p.a(f13826a, "debug upload mode, send events immediately");
            return 0;
        }
        try {
            iIntValue = e.c().get(Integer.valueOf(i + 1)).intValue();
        } catch (Exception unused) {
            iIntValue = 60000;
        }
        p.a(f13826a, "getUploadInterval " + iIntValue);
        return iIntValue;
    }

    public static synchronized void a(boolean z) {
        f13827b = z;
    }
}
