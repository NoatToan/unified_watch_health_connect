package com.unicom.online.account.kernel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.net.InetAddress;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.eclipse.californium.elements.util.JceNames;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class i {
    private static volatile i d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31193b = "cuPreGetToken";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31194c = "checkOk";
    private ExecutorService e = Executors.newSingleThreadExecutor();

    public final void b(String str) {
        ai.a(this.f31192a, str);
    }

    public final boolean a(String str, int i, int i2, h hVar) {
        if (this.f31192a == null || TextUtils.isEmpty(ak.c()) || TextUtils.isEmpty(ak.d())) {
            a(i2, hVar, "sdk未初始化");
            return false;
        }
        al.b();
        al.e(str);
        al.c();
        ak.c(i);
        return true;
    }

    public final boolean a(Context context, String str, String str2, boolean z) {
        al.b();
        al.e("cuPreGetToken");
        al.c();
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (!TextUtils.isEmpty(ak.c())) {
                        aj.c("不可重复初始化");
                        return false;
                    }
                    ac.f31145c = true;
                    ac.f31143a = z;
                    ac.d = true;
                    if (ac.f31143a) {
                        aj.a(" MyApplication.enableGuoMi  ");
                    }
                    this.f31192a = context.getApplicationContext();
                    ak.c(str);
                    ak.f(al.c(this.f31192a));
                    Context context2 = this.f31192a;
                    String strA = am.a(context2, "auth02");
                    if (TextUtils.isEmpty(strA)) {
                        strA = al.b(UUID.randomUUID().toString().replace(Constants.LINK, "") + System.currentTimeMillis());
                        try {
                            SharedPreferences.Editor editorEdit = context2.getSharedPreferences("cu_auth", 0).edit();
                            editorEdit.putString("auth02", strA);
                            editorEdit.commit();
                        } catch (Exception e) {
                            aj.a(e);
                        }
                    }
                    ak.g(strA);
                    ak.e();
                    c(new String(o.b("bXN2Ni53b3Ntcy5jbg==")));
                    aa.f31138a = false;
                    aa.f31139b = false;
                    if (ac.b()) {
                        try {
                            List<d> listB = am.b(this.f31192a, "DNSCache");
                            ak.o = listB;
                            if (listB.isEmpty()) {
                                ak.a(this.f31192a, d());
                            }
                        } catch (Exception unused) {
                            ak.o = new ArrayList();
                        }
                        this.e.submit(new Runnable() { // from class: com.unicom.online.account.kernel.i.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    aj.a("DNS cache size = " + ak.o.size() + "\n");
                                    for (int i = 0; i < ak.o.size(); i++) {
                                        d dVar = ak.o.get(i);
                                        InetAddress[] allByName = InetAddress.getAllByName(dVar.f31181a);
                                        if (allByName != null && allByName.length > 0) {
                                            dVar.f31182b = allByName[i.c(allByName.length)].getHostAddress();
                                            dVar.f31183c = System.currentTimeMillis() + 259200000;
                                        }
                                        aj.a("DNS cache domain = " + dVar.f31181a + "\n");
                                    }
                                    am.a(i.this.f31192a, "DNSCache", new ArrayList(ak.o));
                                    aj.a("DNS cache refresh time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "\n");
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                    aj.a(ae.a());
                    ak.h(Build.BRAND);
                    return true;
                }
            } catch (Exception e2) {
                aj.a(e2);
                return false;
            }
        }
        aj.c("初始化参数不能为空");
        return false;
    }

    public final boolean a(Context context, int i, String str, String str2) {
        if (!str.equals(this.f31193b)) {
            return false;
        }
        return j.a(context, a(i), str + this.f31194c, str2);
    }

    public final void a(Context context, int i) {
        j.b(context, a(i), this.f31193b + this.f31194c);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
    public final String a(String str) {
        if (this.f31192a == null) {
            return "sdk 未初始化, context 为空";
        }
        try {
            switch (str.toLowerCase()) {
                case "apikey":
                case "appid":
                    return ak.c();
                case "packagename":
                    return this.f31192a.getApplicationContext().getPackageName();
                case "md5":
                case "sha1":
                case "sha256":
                    Context context = this.f31192a;
                    return al.a(context, context.getPackageName(), str.toLowerCase());
                case "sm3":
                    if (!ac.f31143a) {
                        return "sdk 未初始化支持国密";
                    }
                    Context context2 = this.f31192a;
                    return al.a(context2, context2.getPackageName());
                case "bcproviderversion":
                    if (!ac.f31143a) {
                        return "sdk 未初始化支持国密";
                    }
                    if (Security.getProvider(JceNames.JCE_PROVIDER_BOUNCY_CASTLE) == null) {
                        return "Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) is null";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Security.getProvider(JceNames.JCE_PROVIDER_BOUNCY_CASTLE).getVersion());
                    return sb.toString();
                case "sdkversion":
                    return ac.d();
                case "testversion":
                    return ac.e();
                case "debuginfo":
                    return al.a(0);
                case "debuginfoall":
                    return al.a(1);
                case "debuginforesult":
                    return al.a(2);
                case "deviceinfo":
                    return ae.a();
                case "debuginfocosttime":
                    return al.a(3);
                default:
                    throw new Exception("no info");
            }
        } catch (Exception e) {
            return "no info:" + e.toString();
        }
    }

    public static String g() {
        return "seqEmpty" + System.currentTimeMillis() + Constants.LINK + UUID.randomUUID().toString().substring(0, 6);
    }

    public static void f() {
        af.a().b();
    }

    public static String e() {
        return ak.i;
    }

    private static boolean d(String str) {
        return str.equalsIgnoreCase(ak.f) || str.equalsIgnoreCase(ak.g) || str.equalsIgnoreCase(ak.e) || str.equalsIgnoreCase(ak.h);
    }

    public static String d() {
        if (an.a(ac.g).booleanValue()) {
            ac.g = ak.e;
        }
        return ac.g;
    }

    public static boolean c(String str) {
        if (d(str)) {
            ac.g = str;
            return true;
        }
        ac.g = ak.e;
        return false;
    }

    public static boolean c() {
        return ac.a();
    }

    public static void c(Context context) {
        j.a(context);
    }

    static /* synthetic */ int c(int i) {
        return Math.abs(new Random().nextInt() % i);
    }

    public static boolean b(Context context) {
        int iB = al.b(context);
        return iB == 0 || iB == 1;
    }

    public static boolean b(int i) {
        if (1 == i) {
            ac.b(true);
            ac.a(true);
            ac.c(false);
        } else {
            ac.b(false);
            ac.a(false);
            ac.c(true);
        }
        return true;
    }

    public static String b() {
        return ac.d();
    }

    public static boolean a(Context context) {
        a();
        k.b(context);
        return k.a(context);
    }

    public static void a(boolean z) {
        aj.a(z);
    }

    private static void a(int i, h hVar, String str) {
        aj.c("type:" + i + "\nmsg:" + str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", 1);
            jSONObject.put("resultMsg", str);
            jSONObject.put("resultData", "");
            jSONObject.put("seq", g());
            if (hVar != null) {
                hVar.onResult(jSONObject.toString());
            }
        } catch (Exception e) {
            aj.a(e);
        }
    }

    public static String a(int i, int i2, String str, int i3, int i4, int i5, String str2) {
        return ai.a(i, i2, str, i3, i4, i5, str2);
    }

    public static String a(int i) {
        return (i == 2 || i == 3 || i == 4 || i == 5 || i == 24 || i == 25) ? FaqConstants.FAQ_UPLOAD_FLAG.concat(String.valueOf(i)) : "";
    }

    public static i a() {
        if (d == null) {
            synchronized (i.class) {
                if (d == null) {
                    d = new i();
                }
            }
        }
        return d;
    }

    private i() {
    }
}
