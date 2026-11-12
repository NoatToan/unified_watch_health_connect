package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.det;
import defpackage.odt;
import defpackage.p8s;
import defpackage.y0t;
import defpackage.yes;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14247b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public n0(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f14246a = str;
        this.f14247b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public static String c(Context context) {
        if (!"com.xiaomi.xmsf".equals(context)) {
            return y0t.n();
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        String strG = y0t.g("ro.miui.region");
        return TextUtils.isEmpty(strG) ? y0t.g("ro.product.locale.region") : strG;
    }

    public static boolean d() {
        try {
            return odt.c(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && d();
    }

    public static boolean f(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public bg.b a(XMPushService xMPushService) {
        bg.b bVar = new bg.b(xMPushService);
        b(bVar, xMPushService, xMPushService.m833b(), PluginDeviceInfo.FICONON);
        return bVar;
    }

    public bg.b b(bg.b bVar, Context context, i0 i0Var, String str) {
        bVar.f14196a = context.getPackageName();
        bVar.f14197b = this.f14246a;
        bVar.i = this.c;
        bVar.c = this.f14247b;
        bVar.h = UserConfig.KEY_DEVICE_LITE_SORT_GROUP;
        bVar.d = "XMPUSH-PASS";
        bVar.e = false;
        det.a aVar = new det.a();
        aVar.a("sdk_ver", 48).a("cpvn", "5_7_8-C").a("cpvc", 50708).a("country_code", yes.a(context).f()).a("region", yes.a(context).b()).a("miui_vn", y0t.q()).a("miui_vc", Integer.valueOf(y0t.b(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.push.g.b(context, "com.xiaomi.xmsf"))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(p8s.t(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.push.g.a(context)));
        String strC = c(context);
        if (!TextUtils.isEmpty(strC)) {
            aVar.a("latest_country_code", strC);
        }
        String strS = y0t.s();
        if (!TextUtils.isEmpty(strS)) {
            aVar.a("device_ch", strS);
        }
        String strU = y0t.u();
        if (!TextUtils.isEmpty(strU)) {
            aVar.a("device_mfr", strU);
        }
        bVar.f = aVar.toString();
        String str2 = f(context) ? "1000271" : this.d;
        det.a aVar2 = new det.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a(BaseJavaModule.METHOD_TYPE_SYNC, 1);
        if (e(context)) {
            aVar2.a("ab", str);
        }
        bVar.g = aVar2.toString();
        bVar.f14198k = i0Var;
        return bVar;
    }
}
