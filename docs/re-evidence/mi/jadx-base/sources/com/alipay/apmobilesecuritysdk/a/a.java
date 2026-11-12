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
import com.alipay.security.mobile.module.http.model.c;
import com.alipay.security.mobile.module.http.model.d;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.alipay.apmobilesecuritysdk.b.a f5769b = com.alipay.apmobilesecuritysdk.b.a.a();
    private int c = 4;

    public a(Context context) {
        this.f5768a = context;
    }

    private c b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        b bVarB;
        b bVarC;
        String str4 = "";
        try {
            Context context = this.f5768a;
            d dVar = new d();
            String strC = com.alipay.security.mobile.module.a.a.c(map, "appName", "");
            String strC2 = com.alipay.security.mobile.module.a.a.c(map, "sessionId", "");
            String strC3 = com.alipay.security.mobile.module.a.a.c(map, "rpcVersion", "");
            String strA = a(context, strC);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String strD = h.d(context);
            if (com.alipay.security.mobile.module.a.a.g(strC2)) {
                dVar.c = strC2;
            } else {
                dVar.c = strA;
            }
            dVar.d = securityToken;
            dVar.e = strD;
            dVar.f5942a = PluginPackageConstant.RN_DIR_A;
            com.alipay.apmobilesecuritysdk.e.c cVarC = com.alipay.apmobilesecuritysdk.e.d.c(context);
            if (cVarC != null) {
                str2 = cVarC.f5776a;
                str = cVarC.c;
            } else {
                str = "";
                str2 = str;
            }
            if (com.alipay.security.mobile.module.a.a.d(str2) && (bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = bVarC.f5774a;
                str = bVarC.c;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = com.alipay.apmobilesecuritysdk.e.d.b();
            if (cVarB != null) {
                str4 = cVarB.f5776a;
                str3 = cVarB.c;
            } else {
                str3 = "";
            }
            if (com.alipay.security.mobile.module.a.a.d(str4) && (bVarB = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str4 = bVarB.f5774a;
                str3 = bVarB.c;
            }
            dVar.h = str2;
            dVar.g = str4;
            dVar.j = strC3;
            if (com.alipay.security.mobile.module.a.a.d(str2)) {
                dVar.f5943b = str4;
                dVar.i = str3;
            } else {
                dVar.f5943b = str2;
                dVar.i = str;
            }
            dVar.f = e.a(context, map);
            return com.alipay.security.mobile.module.http.d.c(this.f5768a, this.f5769b.c()).a(dVar);
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    public final int a(Map<String, String> map) {
        boolean z;
        String str;
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f5768a, com.alipay.security.mobile.module.a.a.c(map, "tid", ""), com.alipay.security.mobile.module.a.a.c(map, "utdid", ""), a(this.f5768a));
            String strC = com.alipay.security.mobile.module.a.a.c(map, "appName", "");
            b();
            b(this.f5768a);
            a(this.f5768a, strC);
            i.a();
            int i = 0;
            if (!a() && !com.alipay.apmobilesecuritysdk.common.a.a(this.f5768a)) {
                e.a();
                if (!(!com.alipay.security.mobile.module.a.a.e(e.b(this.f5768a, map), i.c()))) {
                    String strC2 = com.alipay.security.mobile.module.a.a.c(map, "tid", "");
                    String strC3 = com.alipay.security.mobile.module.a.a.c(map, "utdid", "");
                    if ((!com.alipay.security.mobile.module.a.a.g(strC2) || com.alipay.security.mobile.module.a.a.e(strC2, i.d())) && ((!com.alipay.security.mobile.module.a.a.g(strC3) || com.alipay.security.mobile.module.a.a.e(strC3, i.e())) && i.a(this.f5768a, strC) && !com.alipay.security.mobile.module.a.a.d(a(this.f5768a, strC)) && !com.alipay.security.mobile.module.a.a.d(b(this.f5768a)))) {
                        z = false;
                    }
                }
                z = true;
            } else if (com.alipay.security.mobile.module.a.a.d(a(this.f5768a, strC)) || com.alipay.security.mobile.module.a.a.d(b(this.f5768a))) {
                z = true;
            } else {
                z = false;
            }
            Context context = this.f5768a;
            com.alipay.security.mobile.module.b.b.a();
            h.b(context, String.valueOf(com.alipay.security.mobile.module.b.b.B()));
            if (z) {
                new com.alipay.apmobilesecuritysdk.c.b();
                UmidSdkWrapper.startUmidTaskSync(this.f5768a, com.alipay.apmobilesecuritysdk.b.a.a().b());
                c cVarB = b(map);
                int iA = cVarB != null ? cVarB.a() : 2;
                if (iA == 1) {
                    h.a(this.f5768a, cVarB.b());
                    h.d(this.f5768a, cVarB.c());
                    h.e(this.f5768a, cVarB.g);
                    h.a(this.f5768a, cVarB.h);
                    h.f(this.f5768a, cVarB.i);
                    h.g(this.f5768a, cVarB.f5941k);
                    i.c(e.b(this.f5768a, map));
                    i.a(strC, cVarB.d);
                    i.b(cVarB.c);
                    i.d(cVarB.j);
                    String strC4 = com.alipay.security.mobile.module.a.a.c(map, "tid", "");
                    if (!com.alipay.security.mobile.module.a.a.g(strC4) || com.alipay.security.mobile.module.a.a.e(strC4, i.d())) {
                        strC4 = i.d();
                    } else {
                        i.e(strC4);
                    }
                    i.e(strC4);
                    String strC5 = com.alipay.security.mobile.module.a.a.c(map, "utdid", "");
                    if (!com.alipay.security.mobile.module.a.a.g(strC5) || com.alipay.security.mobile.module.a.a.e(strC5, i.e())) {
                        strC5 = i.e();
                    } else {
                        i.f(strC5);
                    }
                    i.f(strC5);
                    i.a();
                    com.alipay.apmobilesecuritysdk.e.d.a(this.f5768a, i.g());
                    com.alipay.apmobilesecuritysdk.e.d.a();
                    com.alipay.apmobilesecuritysdk.e.a.a(this.f5768a, new b(i.b(), i.c(), i.f()));
                    com.alipay.apmobilesecuritysdk.e.a.a();
                    g.a(this.f5768a, strC, i.a(strC));
                    g.a();
                    h.a(this.f5768a, strC, System.currentTimeMillis());
                } else if (iA != 3) {
                    if (cVarB != null) {
                        str = "Server error, result:" + cVarB.f5940b;
                    } else {
                        str = "Server error, returned null";
                    }
                    com.alipay.apmobilesecuritysdk.c.a.a(str);
                    if (com.alipay.security.mobile.module.a.a.d(a(this.f5768a, strC))) {
                        i = 4;
                    }
                } else {
                    i = 1;
                }
            }
            this.c = i;
            com.alipay.security.mobile.module.http.v2.a aVarC = com.alipay.security.mobile.module.http.d.c(this.f5768a, this.f5769b.c());
            Context context2 = this.f5768a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1 && h.c(context2)) {
                new com.alipay.security.mobile.module.d.b(context2.getFilesDir().getAbsolutePath() + "/log/ap", aVarC).b();
            }
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
        }
        return this.c;
    }

    public static String a(Context context) {
        String strB = b(context);
        return com.alipay.security.mobile.module.a.a.d(strB) ? h.f(context) : strB;
    }

    private static String b(Context context) {
        try {
            String strB = i.b();
            if (!com.alipay.security.mobile.module.a.a.d(strB)) {
                return strB;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarB = com.alipay.apmobilesecuritysdk.e.d.b(context);
            if (cVarB != null) {
                i.a(cVarB);
                String str = cVarB.f5776a;
                if (com.alipay.security.mobile.module.a.a.g(str)) {
                    return str;
                }
            }
            b bVarB = com.alipay.apmobilesecuritysdk.e.a.b(context);
            if (bVarB == null) {
                return "";
            }
            i.a(bVarB);
            String str2 = bVarB.f5774a;
            return com.alipay.security.mobile.module.a.a.g(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!com.alipay.security.mobile.module.a.a.d(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !com.alipay.security.mobile.module.a.a.d(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
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

    private static boolean a() {
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
}
