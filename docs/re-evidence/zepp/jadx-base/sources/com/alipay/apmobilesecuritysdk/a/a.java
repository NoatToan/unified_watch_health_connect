package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.sdk.m.f0.c;
import com.alipay.sdk.m.f0.d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public Context a;
    public com.alipay.apmobilesecuritysdk.b.a b = com.alipay.apmobilesecuritysdk.b.a.a();
    public int c = 4;

    public a(Context context) {
        this.a = context;
    }

    public static String a(Context context) {
        String strB = b(context);
        return com.alipay.sdk.m.z.a.a(strB) ? h.f(context) : strB;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!com.alipay.sdk.m.z.a.a(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !com.alipay.sdk.m.z.a.a(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
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

    private c b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b bVarB;
        b bVarC;
        String str4 = "";
        try {
            Context context = this.a;
            d dVar = new d();
            String strA = com.alipay.sdk.m.z.a.a(map, "appName", "");
            String strA2 = com.alipay.sdk.m.z.a.a(map, "sessionId", "");
            String strA3 = com.alipay.sdk.m.z.a.a(map, "rpcVersion", "");
            String strA4 = a(context, strA);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strD = h.d(context);
            if (com.alipay.sdk.m.z.a.b(strA2)) {
                dVar.c = strA2;
            } else {
                dVar.c = strA4;
            }
            dVar.d = securityToken;
            dVar.e = strD;
            dVar.a = "android";
            com.alipay.apmobilesecuritysdk.e.c cVarC = com.alipay.apmobilesecuritysdk.e.d.c(context);
            if (cVarC != null) {
                str2 = cVarC.a;
                str = cVarC.c;
            } else {
                str = "";
                str2 = str;
            }
            if (com.alipay.sdk.m.z.a.a(str2) && (bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = bVarC.a;
                str = bVarC.c;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = com.alipay.apmobilesecuritysdk.e.d.b();
            if (cVarB != null) {
                str4 = cVarB.a;
                str3 = cVarB.c;
            } else {
                str3 = "";
            }
            if (com.alipay.sdk.m.z.a.a(str4) && (bVarB = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = bVarB.a;
                str3 = bVarB.c;
            }
            dVar.h = str2;
            dVar.g = str4;
            dVar.j = strA3;
            if (com.alipay.sdk.m.z.a.a(str2)) {
                dVar.b = str4;
                str = str3;
            } else {
                dVar.b = str2;
            }
            dVar.i = str;
            dVar.f = e.a(context, map);
            return com.alipay.sdk.m.d0.d.b(this.a, this.b.c()).a(dVar);
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            String strB = i.b();
            if (!com.alipay.sdk.m.z.a.a(strB)) {
                return strB;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = com.alipay.apmobilesecuritysdk.e.d.b(context);
            if (cVarB != null) {
                i.a(cVarB);
                String str = cVarB.a;
                if (com.alipay.sdk.m.z.a.b(str)) {
                    return str;
                }
            }
            b bVarB = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (bVarB == null) {
                return "";
            }
            i.a(bVarB);
            String str2 = bVarB.a;
            return com.alipay.sdk.m.z.a.b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b() {
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

    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe A[Catch: Exception -> 0x023b, TryCatch #0 {Exception -> 0x023b, blocks: (B:3:0x0007, B:5:0x0038, B:8:0x0041, B:37:0x00bf, B:69:0x01e3, B:71:0x01fe, B:73:0x0204, B:75:0x020a, B:79:0x0213, B:81:0x0219, B:40:0x00d3, B:42:0x00eb, B:48:0x00f8, B:49:0x0108, B:51:0x010f, B:55:0x0121, B:57:0x0171, B:59:0x017b, B:61:0x0183, B:63:0x0190, B:65:0x019a, B:67:0x01a2, B:66:0x019e, B:60:0x017f, B:11:0x0056, B:13:0x0064, B:16:0x006f, B:18:0x0075, B:21:0x0080, B:24:0x0089, B:27:0x0096, B:30:0x00a3, B:33:0x00b0), top: B:87:0x0007 }] */
    public final int a(Map<String, String> map) {
        boolean z;
        int i;
        String str;
        com.alipay.sdk.m.g0.a aVarB;
        Context context;
        NetworkInfo activeNetworkInfo;
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.a, com.alipay.sdk.m.z.a.a(map, "tid", ""), com.alipay.sdk.m.z.a.a(map, com.alipay.sdk.m.l.b.g, ""), a(this.a));
            String strA = com.alipay.sdk.m.z.a.a(map, "appName", "");
            b();
            b(this.a);
            a(this.a, strA);
            i.a();
            boolean z2 = false;
            if (!a() && !com.alipay.apmobilesecuritysdk.common.a.a(this.a)) {
                e.a();
                if (!(!com.alipay.sdk.m.z.a.a(e.b(this.a, map), i.c()))) {
                    String strA2 = com.alipay.sdk.m.z.a.a(map, "tid", "");
                    String strA3 = com.alipay.sdk.m.z.a.a(map, com.alipay.sdk.m.l.b.g, "");
                    if ((!com.alipay.sdk.m.z.a.b(strA2) || com.alipay.sdk.m.z.a.a(strA2, i.d())) && ((!com.alipay.sdk.m.z.a.b(strA3) || com.alipay.sdk.m.z.a.a(strA3, i.e())) && i.a(this.a, strA) && !com.alipay.sdk.m.z.a.a(a(this.a, strA)) && !com.alipay.sdk.m.z.a.a(b(this.a)))) {
                        z = false;
                    }
                }
                z = true;
            } else if (com.alipay.sdk.m.z.a.a(a(this.a, strA)) || com.alipay.sdk.m.z.a.a(b(this.a))) {
                z = true;
            } else {
                z = false;
            }
            Context context2 = this.a;
            com.alipay.sdk.m.a0.b.b();
            h.b(context2, String.valueOf(com.alipay.sdk.m.a0.b.n()));
            if (z) {
                new com.alipay.apmobilesecuritysdk.c.b();
                UmidSdkWrapper.startUmidTaskSync(this.a, com.alipay.apmobilesecuritysdk.b.a.a().b());
                c cVarB = b(map);
                int iC = cVarB != null ? cVarB.c() : 2;
                if (iC != 1) {
                    if (iC != 3) {
                        if (cVarB != null) {
                            str = "Server error, result:" + cVarB.b;
                        } else {
                            str = "Server error, returned null";
                        }
                        com.alipay.apmobilesecuritysdk.c.a.a(str);
                        if (com.alipay.sdk.m.z.a.a(a(this.a, strA))) {
                            i = 4;
                        }
                    } else {
                        i = 1;
                    }
                    this.c = i;
                    aVarB = com.alipay.sdk.m.d0.d.b(this.a, this.b.c());
                    context = this.a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                        z2 = true;
                    }
                    if (z2 && h.c(context)) {
                        new com.alipay.sdk.m.c0.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVarB).a();
                    }
                    return this.c;
                }
                h.a(this.a, cVarB.b());
                h.d(this.a, cVarB.a());
                h.e(this.a, cVarB.g);
                h.a(this.a, cVarB.h);
                h.f(this.a, cVarB.i);
                h.g(this.a, cVarB.k);
                i.c(e.b(this.a, map));
                i.a(strA, cVarB.d);
                i.b(cVarB.c);
                i.d(cVarB.j);
                String strA4 = com.alipay.sdk.m.z.a.a(map, "tid", "");
                if (!com.alipay.sdk.m.z.a.b(strA4) || com.alipay.sdk.m.z.a.a(strA4, i.d())) {
                    strA4 = i.d();
                } else {
                    i.e(strA4);
                }
                i.e(strA4);
                String strA5 = com.alipay.sdk.m.z.a.a(map, com.alipay.sdk.m.l.b.g, "");
                if (!com.alipay.sdk.m.z.a.b(strA5) || com.alipay.sdk.m.z.a.a(strA5, i.e())) {
                    strA5 = i.e();
                } else {
                    i.f(strA5);
                }
                i.f(strA5);
                i.a();
                com.alipay.apmobilesecuritysdk.e.d.a(this.a, i.g());
                com.alipay.apmobilesecuritysdk.e.d.a();
                com.alipay.apmobilesecuritysdk.e.a.a(this.a, new b(i.b(), i.c(), i.f()));
                com.alipay.apmobilesecuritysdk.e.a.a();
                g.a(this.a, strA, i.a(strA));
                g.a();
                h.a(this.a, strA, System.currentTimeMillis());
            }
            i = 0;
            this.c = i;
            aVarB = com.alipay.sdk.m.d0.d.b(this.a, this.b.c());
            context = this.a;
            ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager2 != null) {
            }
            if (activeNetworkInfo != null) {
                z2 = true;
            }
            if (z2) {
                new com.alipay.sdk.m.c0.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVarB).a();
            }
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
        return this.c;
    }
}
