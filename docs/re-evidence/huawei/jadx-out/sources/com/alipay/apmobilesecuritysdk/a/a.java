package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.c.c;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import defpackage.kj;
import defpackage.ky;
import defpackage.ly;
import defpackage.md;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.alipay.apmobilesecuritysdk.b.a f2022b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2023c = 4;

    public int a(Map<String, String> map) {
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f2021a, kj.e(map, "tid", ""), kj.e(map, "utdid", ""), b(this.f2021a));
            this.f2023c = b(map);
            com.alipay.apmobilesecuritysdk.c.a.a(this.f2021a, ly.a(this.f2021a, this.f2022b.c()));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
        return this.f2023c;
    }

    private String e(Map<String, String> map) {
        String strE = kj.e(map, "tid", "");
        if (!kj.e(strE) || kj.c(strE, i.d())) {
            return i.d();
        }
        i.e(strE);
        return strE;
    }

    private String d(Map<String, String> map) {
        String strE = kj.e(map, "utdid", "");
        if (!kj.e(strE) || kj.c(strE, i.e())) {
            return i.e();
        }
        i.f(strE);
        return strE;
    }

    private md c(Map<String, String> map) {
        try {
            return ly.a(this.f2021a, this.f2022b.c()).a(b.a(this.f2021a, map));
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    private void b(String str) {
        a(this.f2021a);
        a(this.f2021a, str);
        i.a();
    }

    private static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        String strA = a(context);
        return kj.c(strA) ? h.f(context) : strA;
    }

    private int b(Map<String, String> map) {
        String str;
        String strE = kj.e(map, "appName", "");
        b();
        b(strE);
        boolean zA = a(map, strE);
        Context context = this.f2021a;
        h.b(context, String.valueOf(ky.c(APSecuritySdk.getInstance(context)).n()));
        if (!zA) {
            return 0;
        }
        c.a(this.f2021a).b();
        UmidSdkWrapper.startUmidTaskSync(this.f2021a, com.alipay.apmobilesecuritysdk.b.a.a().b());
        md mdVarC = c(map);
        int iB = mdVarC != null ? mdVarC.b() : 2;
        if (iB == 1) {
            a(strE, mdVarC, map);
            return 0;
        }
        if (iB == 3) {
            return 1;
        }
        if (mdVarC != null) {
            str = "Server error, result:" + mdVarC.f41641c;
        } else {
            str = "Server error, returned null";
        }
        com.alipay.apmobilesecuritysdk.c.a.a(str);
        return kj.c(a(this.f2021a, strE)) ? 4 : 0;
    }

    private boolean a(Map<String, String> map, String str) {
        if (a() || com.alipay.apmobilesecuritysdk.common.a.a(this.f2021a)) {
            return a(str);
        }
        e.a();
        if (!kj.c(e.b(this.f2021a, map), i.c())) {
            return true;
        }
        String strE = kj.e(map, "tid", "");
        String strE2 = kj.e(map, "utdid", "");
        if (!kj.e(strE) || kj.c(strE, i.d())) {
            return (kj.e(strE2) && !kj.c(strE2, i.e())) || !i.a(this.f2021a, str) || kj.c(a(this.f2021a, str)) || kj.c(a(this.f2021a));
        }
        return true;
    }

    private boolean a(String str) {
        return kj.c(a(this.f2021a, str)) || kj.c(a(this.f2021a));
    }

    private boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i = 0; i < 3; i++) {
            try {
                String[] strArrSplit = strArr[i].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void a(String str, md mdVar, Map<String, String> map) {
        h.a(this.f2021a, mdVar.c());
        h.d(this.f2021a, mdVar.a());
        h.e(this.f2021a, mdVar.j);
        h.a(this.f2021a, mdVar.g);
        h.f(this.f2021a, mdVar.i);
        h.g(this.f2021a, mdVar.m);
        i.c(e.b(this.f2021a, map));
        i.a(str, mdVar.e);
        i.b(mdVar.f41449a);
        i.d(mdVar.h);
        i.e(e(map));
        i.f(d(map));
        i.a();
        d.a(this.f2021a, i.g());
        d.b(this.f2021a);
        com.alipay.apmobilesecuritysdk.e.a.a(this.f2021a, new com.alipay.apmobilesecuritysdk.e.b(i.b(), i.c(), i.f()));
        com.alipay.apmobilesecuritysdk.e.a.a(this.f2021a);
        g.a(this.f2021a, str, i.a(str));
        g.b(this.f2021a, str);
        h.a(this.f2021a, str, System.currentTimeMillis());
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!kj.c(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !kj.c(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        try {
            String strB = i.b();
            if (!kj.c(strB)) {
                return strB;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarC = d.c(context);
            if (cVarC != null) {
                i.a(cVarC);
                String str = cVarC.f2031a;
                if (kj.e(str)) {
                    return str;
                }
            }
            com.alipay.apmobilesecuritysdk.e.b bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context);
            if (bVarC == null) {
                return "";
            }
            i.a(bVarC);
            String str2 = bVarC.f2028a;
            return kj.e(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public a(Context context) {
        this.f2021a = context;
    }
}
