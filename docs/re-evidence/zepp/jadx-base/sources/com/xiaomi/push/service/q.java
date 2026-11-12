package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.xiaomi.push.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class q {
    public final int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f209a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public q(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f209a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.a = i;
    }

    public static boolean a() {
        try {
            return com.xiaomi.channel.commonutils.android.k.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        return PkgNameConstants.XMSF.equals(context.getPackageName()) && a();
    }

    private static String b(Context context) {
        if (!PkgNameConstants.XMSF.equals(context)) {
            return com.xiaomi.channel.commonutils.android.f.b();
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        String strM3425a = com.xiaomi.channel.commonutils.android.f.m3425a("ro.miui.region");
        return TextUtils.isEmpty(strM3425a) ? com.xiaomi.channel.commonutils.android.f.m3425a("ro.product.locale.region") : strM3425a;
    }

    private static boolean c(Context context) {
        return context.getPackageName().equals(PkgNameConstants.XMSF);
    }

    public az.b a(XMPushService xMPushService) {
        az.b bVar = new az.b(xMPushService);
        a(bVar, xMPushService, xMPushService.m3807b(), "c");
        return bVar;
    }

    public az.b a(az.b bVar, Context context, j jVar, String str) {
        bVar.f206a = context.getPackageName();
        bVar.b = this.f209a;
        bVar.h = this.c;
        bVar.c = this.b;
        bVar.g = "5";
        bVar.d = "XMPUSH-PASS";
        bVar.f207a = false;
        com.xiaomi.channel.commonutils.android.l.a aVar = new com.xiaomi.channel.commonutils.android.l.a();
        aVar.a(AbstractContentType.PARAM_SDK_VERSION, 48).a("cpvn", BuildConfig.VERSION_NAME).a("cpvc", Integer.valueOf(BuildConfig.VERSION_CODE)).a("country_code", a.a(context).b()).a("region", a.a(context).a()).a("miui_vn", com.xiaomi.channel.commonutils.android.f.c()).a("miui_vc", Integer.valueOf(com.xiaomi.channel.commonutils.android.f.a(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.channel.commonutils.android.a.a(context, PkgNameConstants.XMSF))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(aq.a(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.channel.commonutils.android.a.a(context)));
        String strB = b(context);
        if (!TextUtils.isEmpty(strB)) {
            aVar.a("latest_country_code", strB);
        }
        bVar.e = aVar.toString();
        String str2 = c(context) ? "1000271" : this.d;
        com.xiaomi.channel.commonutils.android.l.a aVar2 = new com.xiaomi.channel.commonutils.android.l.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a("sync", 1);
        if (a(context)) {
            aVar2.a("ab", str);
        }
        bVar.f = aVar2.toString();
        bVar.f205a = jVar;
        return bVar;
    }
}
