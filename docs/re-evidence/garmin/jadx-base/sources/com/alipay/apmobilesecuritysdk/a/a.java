package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import pg.b;
import pg.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.alipay.apmobilesecuritysdk.b.a f28355b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28356c = 4;

    public a(Context context) {
        this.f28354a = context;
    }

    private b b(Map<String, String> map) {
        com.alipay.apmobilesecuritysdk.e.b bVarB;
        com.alipay.apmobilesecuritysdk.e.b bVarC;
        try {
            Context context = this.f28354a;
            c cVar = new c();
            String strF = oi0.c.f("appName", map);
            String strF2 = oi0.c.f("sessionId", map);
            String strF3 = oi0.c.f("rpcVersion", map);
            String strA = a(context, strF);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strD = h.d(context);
            if (oi0.c.k(strF2)) {
                cVar.f137589c = strF2;
            } else {
                cVar.f137589c = strA;
            }
            cVar.f137590d = securityToken;
            cVar.f137591e = strD;
            cVar.f137587a = "android";
            com.alipay.apmobilesecuritysdk.e.c cVarC = d.c(context);
            String str = cVarC != null ? cVarC.f28364a : "";
            if (oi0.c.g(str) && (bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str = bVarC.f28361a;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = d.b();
            String str2 = cVarB != null ? cVarB.f28364a : "";
            if (oi0.c.g(str2) && (bVarB = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str2 = bVarB.f28361a;
            }
            cVar.f137593g = strF3;
            if (oi0.c.g(str)) {
                cVar.f137588b = str2;
            } else {
                cVar.f137588b = str;
            }
            cVar.f137592f = e.a(context, map);
            return mg.c.a(this.f28354a, this.f28355b.c()).a(cVar);
        } catch (Throwable th3) {
            th3.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    public final int a(Map<String, String> map) {
        boolean z14;
        String str;
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f28354a, oi0.c.f("tid", map), oi0.c.f("utdid", map), a(this.f28354a));
            String strF = oi0.c.f("appName", map);
            b();
            b(this.f28354a);
            a(this.f28354a, strF);
            i.a();
            int i14 = 0;
            if (!a() && !com.alipay.apmobilesecuritysdk.common.a.a(this.f28354a)) {
                e.a();
                if (oi0.c.h(e.b(this.f28354a, map), i.c())) {
                    String strF2 = oi0.c.f("tid", map);
                    String strF3 = oi0.c.f("utdid", map);
                    if ((!oi0.c.k(strF2) || strF2.equals(i.d())) && ((!oi0.c.k(strF3) || strF3.equals(i.e())) && i.a(this.f28354a, strF) && !oi0.c.g(a(this.f28354a, strF)) && !oi0.c.g(b(this.f28354a)))) {
                        z14 = false;
                    }
                }
                z14 = true;
            } else if (oi0.c.g(a(this.f28354a, strF)) || oi0.c.g(b(this.f28354a))) {
                z14 = true;
            } else {
                z14 = false;
            }
            Context context = this.f28354a;
            hg.b.f83645b.f83646a = APSecuritySdk.getInstance(context);
            h.b(context, hg.b.b());
            if (z14) {
                new com.alipay.apmobilesecuritysdk.c.b();
                UmidSdkWrapper.startUmidTaskSync(this.f28354a, com.alipay.apmobilesecuritysdk.b.a.a().b());
                b bVarB = b(map);
                char c14 = 2;
                if (bVarB != null) {
                    if (bVarB.f137576a) {
                        if (!oi0.c.g(bVarB.f137578c)) {
                            c14 = 1;
                        }
                    } else if ("APPKEY_ERROR".equals(bVarB.f137577b)) {
                        c14 = 3;
                    }
                }
                if (c14 == 1) {
                    h.a(this.f28354a, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bVarB.f137580e));
                    Context context2 = this.f28354a;
                    String str2 = bVarB.f137581f;
                    if (str2 == null) {
                        str2 = "0";
                    }
                    h.d(context2, str2);
                    h.e(this.f28354a, bVarB.f137582g);
                    h.a(this.f28354a, bVarB.f137583h);
                    h.f(this.f28354a, bVarB.f137584i);
                    h.g(this.f28354a, bVarB.f137586k);
                    i.c(e.b(this.f28354a, map));
                    i.a(strF, bVarB.f137579d);
                    i.b(bVarB.f137578c);
                    i.d(bVarB.f137585j);
                    String strF4 = oi0.c.f("tid", map);
                    if (!oi0.c.k(strF4) || strF4.equals(i.d())) {
                        strF4 = i.d();
                    } else {
                        i.e(strF4);
                    }
                    i.e(strF4);
                    String strF5 = oi0.c.f("utdid", map);
                    if (!oi0.c.k(strF5) || strF5.equals(i.e())) {
                        strF5 = i.e();
                    } else {
                        i.f(strF5);
                    }
                    i.f(strF5);
                    i.a();
                    d.a(this.f28354a, i.g());
                    d.a();
                    com.alipay.apmobilesecuritysdk.e.a.a(this.f28354a, new com.alipay.apmobilesecuritysdk.e.b(i.b(), i.c(), i.f()));
                    com.alipay.apmobilesecuritysdk.e.a.a();
                    g.a(this.f28354a, strF, i.a(strF));
                    g.a();
                    h.a(this.f28354a, strF, System.currentTimeMillis());
                } else if (c14 != 3) {
                    if (bVarB != null) {
                        str = "Server error, result:" + bVarB.f137577b;
                    } else {
                        str = "Server error, returned null";
                    }
                    com.alipay.apmobilesecuritysdk.c.a.a(str);
                    if (oi0.c.g(a(this.f28354a, strF))) {
                        i14 = 4;
                    }
                } else {
                    i14 = 1;
                }
            }
            this.f28356c = i14;
            rg.b bVarA = mg.c.a(this.f28354a, this.f28355b.c());
            Context context3 = this.f28354a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1 && h.c(context3)) {
                new Thread(new lg.c(new lg.b(context3.getFilesDir().getAbsolutePath() + "/log/ap", bVarA))).start();
            }
        } catch (Exception e4) {
            com.alipay.apmobilesecuritysdk.c.a.a(e4);
        }
        return this.f28356c;
    }

    public static String b(Context context) {
        try {
            String strB = i.b();
            if (!oi0.c.g(strB)) {
                return strB;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = d.b(context);
            if (cVarB != null) {
                i.a(cVarB);
                String str = cVarB.f28364a;
                if (oi0.c.k(str)) {
                    return str;
                }
            }
            com.alipay.apmobilesecuritysdk.e.b bVarB = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (bVarB == null) {
                return "";
            }
            i.a(bVarB);
            String str2 = bVarB.f28361a;
            return oi0.c.k(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i14 = 0; i14 < 5; i14++) {
                String str = strArr[i14];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(Context context) {
        String strB = b(context);
        return oi0.c.g(strB) ? h.f(context) : strB;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!oi0.c.g(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !oi0.c.g(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i14 = 0; i14 < 3; i14++) {
            try {
                String[] strArrSplit = strArr[i14].split(StringUtils.SPACE);
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
}
