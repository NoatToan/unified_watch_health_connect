package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.message.api.WebConst;
import com.xiaomi.push.bi;
import com.xiaomi.push.cd;
import com.xiaomi.push.cg;
import com.xiaomi.push.ci;
import com.xiaomi.push.cj;
import com.xiaomi.push.cx;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dl;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import com.xiaomi.push.dv;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.ej;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes22.dex */
public class v {
    public static Intent a(byte[] bArr, long j) {
        dq dqVarA = a(bArr);
        if (dqVarA == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(dqVarA.b);
        return intent;
    }

    public static dq a(Context context, dq dqVar) {
        return a(context, dqVar, (Map<String, String>) null);
    }

    public static dq a(Context context, dq dqVar, Map<String, String> map) {
        dl dlVar = new dl();
        dlVar.b(dqVar.m3702a());
        di diVarM3701a = dqVar.m3701a();
        if (diVarM3701a != null) {
            dlVar.a(diVarM3701a.m3670a());
            dlVar.a(diVarM3701a.m3668a());
            if (!TextUtils.isEmpty(diVarM3701a.m3675b())) {
                dlVar.c(diVarM3701a.m3675b());
            }
        }
        dlVar.a(ee.a(context, dqVar));
        dq dqVarD = f.d(dqVar.b(), dqVar.m3702a(), dlVar, cz.AckMessage);
        di diVarM3701a2 = dqVar.m3701a();
        if (diVarM3701a2 != null) {
            diVarM3701a2 = bj.a(diVarM3701a2.m3669a());
        }
        diVarM3701a2.a("mat", Long.toString(System.currentTimeMillis()));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        diVarM3701a2.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        dqVarD.a(diVarM3701a2);
        return dqVarD;
    }

    public static dq a(byte[] bArr) {
        dq dqVar = new dq();
        try {
            ee.a(dqVar, bArr);
            return dqVar;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
            return null;
        }
    }

    public static void a(Context context, dq dqVar, byte[] bArr) {
        try {
            ag.a(dqVar);
            dqVar.m3701a();
            ag.c cVarA = ag.a(context, dqVar, bArr);
            if (cVarA.a > 0 && !TextUtils.isEmpty(cVarA.f202a)) {
                cx.a(context, cVarA.f202a, cVarA.a, true, false, System.currentTimeMillis());
            }
            if (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || !ac.a(context, dqVar, cVarA.f203a)) {
                k(context, dqVar, bArr);
            } else {
                ac.m3813a(context, dqVar);
                com.xiaomi.channel.commonutils.logger.b.m3434a("consume this broadcast by tts");
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    public static void a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        boolean z;
        String str2;
        dq dqVarA = a(bArr);
        di diVarM3701a = dqVarA.m3701a();
        if (o(dqVarA) && h(xMPushService, str)) {
            l(xMPushService, dqVarA);
            return;
        }
        if (i(dqVarA) && !h(xMPushService, str) && !m(dqVarA)) {
            n(xMPushService, dqVarA);
            return;
        }
        if (!ag.m3818a(dqVarA) && !g(xMPushService, intent)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("receive a mipush message, we can see the app, but we can't see the receiver.");
            return;
        }
        boolean z2 = false;
        if (cz.Registration == dqVarA.a()) {
            String strB = dqVarA.b();
            SharedPreferences.Editor editorEdit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
            editorEdit.putString(strB, dqVarA.f122a);
            editorEdit.commit();
            dv dvVarA = m.a(dqVarA);
            if (dvVarA.a() != 0 || TextUtils.isEmpty(dvVarA.b())) {
                com.xiaomi.channel.commonutils.logger.b.d("read regSecret failed");
            } else {
                m.a(xMPushService, strB, dvVarA.b());
            }
            s.a(xMPushService).e(strB);
            s.a(xMPushService).f(strB);
            if (!TextUtils.isEmpty(diVarM3701a.m3670a())) {
                intent.putExtra(WebConst.QueryParam.MESSAGE_ID, diVarM3701a.m3670a());
                intent.putExtra("eventMessageType", 6000);
            }
        }
        if (ag.c(dqVarA) && !TextUtils.isEmpty(diVarM3701a.m3670a())) {
            intent.putExtra(WebConst.QueryParam.MESSAGE_ID, diVarM3701a.m3670a());
            intent.putExtra("eventMessageType", 1000);
        }
        if (ag.b(dqVarA) && !TextUtils.isEmpty(diVarM3701a.m3670a())) {
            intent.putExtra(WebConst.QueryParam.MESSAGE_ID, diVarM3701a.m3670a());
            intent.putExtra("eventMessageType", 2000);
        }
        if (ag.m3818a(dqVarA) && !TextUtils.isEmpty(diVarM3701a.m3670a())) {
            intent.putExtra(WebConst.QueryParam.MESSAGE_ID, diVarM3701a.m3670a());
            intent.putExtra("eventMessageType", 3000);
        }
        ef efVarA = null;
        if (diVarM3701a != null && !TextUtils.isEmpty(diVarM3701a.m3678c()) && !TextUtils.isEmpty(diVarM3701a.d()) && diVarM3701a.b != 1 && !ag.a(xMPushService, dqVarA.b, ag.a(diVarM3701a.m3671a()))) {
            Map<String, String> map = diVarM3701a.f90a;
            String strM3670a = map != null ? map.get("jobkey") : null;
            if (TextUtils.isEmpty(strM3670a)) {
                strM3670a = diVarM3701a.m3670a();
            }
            if (ai.a(xMPushService, dqVarA.b, strM3670a)) {
                str2 = "drop a duplicate message, key=" + strM3670a;
            } else {
                if (com.xiaomi.channel.commonutils.android.f.m3427a((Context) xMPushService) && ac.m3814a(dqVarA)) {
                    str2 = "receive pull down message";
                } else {
                    a(xMPushService, dqVarA, bArr);
                }
                b(xMPushService, dqVarA);
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a(str2);
            b(xMPushService, dqVarA);
        } else if (PkgNameConstants.XMSF.contains(dqVarA.b) && !dqVarA.m3709b() && diVarM3701a != null && diVarM3701a.m3671a() != null && diVarM3701a.m3671a().containsKey("ab")) {
            b(xMPushService, dqVarA);
            com.xiaomi.channel.commonutils.logger.b.c("receive abtest message. ack it." + diVarM3701a.m3670a());
        } else if (j(xMPushService, str, dqVarA, diVarM3701a)) {
            if (cz.Notification == dqVarA.a) {
                try {
                    efVarA = bt.a(xMPushService, dqVarA);
                    if (efVarA == null) {
                        com.xiaomi.channel.commonutils.logger.b.d("receiving an un-recognized notification message. " + dqVarA.a);
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (ej e) {
                    com.xiaomi.channel.commonutils.logger.b.d("receive a message which action string is not valid. " + e);
                }
                if (z && (efVarA instanceof dt)) {
                    dt dtVar = (dt) efVarA;
                    if (!df.CancelPushMessage.f77a.equals(dtVar.d) || dtVar.m3717a() == null) {
                        z2 = true;
                    } else {
                        String str3 = dtVar.m3717a().get(bd.N);
                        int i = -2;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                i = Integer.parseInt(str3);
                            } catch (NumberFormatException e2) {
                                com.xiaomi.channel.commonutils.logger.b.m3434a("parse notifyId from STRING to INT failed: " + e2);
                            }
                        }
                        if (i >= -1) {
                            com.xiaomi.channel.commonutils.logger.b.m3434a("try to retract a message by notifyId=" + i);
                            ag.a(xMPushService, dqVarA.b, i);
                        } else {
                            String str4 = dtVar.m3717a().get(bd.L);
                            String str5 = dtVar.m3717a().get(bd.M);
                            com.xiaomi.channel.commonutils.logger.b.m3434a("try to retract a message by title&description.");
                            ag.a(xMPushService, dqVarA.b, str4, str5);
                        }
                        if (diVarM3701a != null && diVarM3701a.m3671a() != null && com.xiaomi.channel.commonutils.android.f.m3427a((Context) xMPushService) && WorkoutExercises.PULLDOWN.equals(ar.a((Object) diVarM3701a.m3671a()))) {
                            ac.a(dqVarA);
                        }
                        c(xMPushService, dqVarA, dtVar);
                    }
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            if (z2) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, f.g(dqVarA.b));
            }
        }
        if (dqVarA.a() != cz.UnRegistration || PkgNameConstants.XMSF.equals(xMPushService.getPackageName())) {
            return;
        }
        xMPushService.stopSelf();
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        if (!com.xiaomi.channel.commonutils.android.a.m3418a(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("broadcast message arrived.");
            context.sendBroadcast(intent, f.g(str));
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("meet error when broadcast message arrived. " + e);
            return false;
        }
    }

    private static void b(XMPushService xMPushService, dq dqVar) {
        xMPushService.a(new e1(4, xMPushService, dqVar));
    }

    private static void c(XMPushService xMPushService, dq dqVar, dt dtVar) {
        xMPushService.a(new e(4, dtVar, dqVar, xMPushService));
    }

    private static void d(XMPushService xMPushService, dq dqVar, String str) {
        xMPushService.a(new h1(4, xMPushService, dqVar, str));
    }

    private static void e(XMPushService xMPushService, dq dqVar, String str, String str2) {
        xMPushService.a(new c(4, xMPushService, dqVar, str, str2));
    }

    private static void f(XMPushService xMPushService, byte[] bArr, long j) {
        Map<String, String> mapM3671a;
        dq dqVarA = a(bArr);
        if (dqVarA == null) {
            return;
        }
        if (TextUtils.isEmpty(dqVarA.b)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("receive a mipush message without package name");
            return;
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Intent intentA = a(bArr, lValueOf.longValue());
        String strA = ag.a(dqVarA);
        cx.a(xMPushService, strA, j, true, true, System.currentTimeMillis());
        di diVarM3701a = dqVarA.m3701a();
        if (diVarM3701a != null && diVarM3701a.m3670a() != null) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", dqVarA.m3702a(), aw.a(diVarM3701a.m3670a()), dqVarA.a()));
        }
        if (diVarM3701a != null) {
            diVarM3701a.a("mrt", Long.toString(lValueOf.longValue()));
        }
        cz czVar = cz.SendMessage;
        if (czVar == dqVarA.a() && s.a(xMPushService).m3837a(dqVarA.b) && !ag.m3818a(dqVarA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Drop a message for unregistered, msgid=" + (diVarM3701a != null ? diVarM3701a.m3670a() : ""));
            d(xMPushService, dqVarA, dqVarA.b);
            return;
        }
        if (czVar == dqVarA.a() && s.a(xMPushService).m3839c(dqVarA.b) && !ag.m3818a(dqVarA)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Drop a message for push closed, msgid=" + (diVarM3701a != null ? diVarM3701a.m3670a() : ""));
            d(xMPushService, dqVarA, dqVarA.b);
            return;
        }
        if (czVar != dqVarA.a() || TextUtils.equals(xMPushService.getPackageName(), PkgNameConstants.XMSF) || TextUtils.equals(xMPushService.getPackageName(), dqVarA.b)) {
            if (diVarM3701a == null || (mapM3671a = diVarM3701a.m3671a()) == null || !mapM3671a.containsKey("hide") || !"true".equalsIgnoreCase(mapM3671a.get("hide"))) {
                a(xMPushService, strA, bArr, intentA);
                return;
            } else {
                b(xMPushService, dqVarA);
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + dqVarA.b);
        e(xMPushService, dqVarA, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + dqVarA.b);
    }

    private static boolean g(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean h(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() && packageManager.queryIntentServices(intent, 32).isEmpty()) ? false : true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    private static boolean i(dq dqVar) {
        return PkgNameConstants.XMSF.equals(dqVar.b) && dqVar.m3701a() != null && dqVar.m3701a().m3671a() != null && dqVar.m3701a().m3671a().containsKey("miui_package_name");
    }

    private static boolean j(XMPushService xMPushService, String str, dq dqVar, di diVar) {
        boolean z = true;
        if (diVar != null && diVar.m3671a() != null && diVar.m3671a().containsKey("__check_alive") && diVar.m3671a().containsKey("__awake")) {
            dt dtVar = new dt();
            dtVar.b(dqVar.m3702a());
            dtVar.d(str);
            dtVar.c(df.AwakeSystemApp.f77a);
            dtVar.a(diVar.m3670a());
            dtVar.f129a = new HashMap();
            boolean zM3418a = com.xiaomi.channel.commonutils.android.a.m3418a(xMPushService.getApplicationContext(), str);
            dtVar.f129a.put("app_running", Boolean.toString(zM3418a));
            if (!zM3418a) {
                boolean z2 = Boolean.parseBoolean(diVar.m3671a().get("__awake"));
                dtVar.f129a.put("awaked", Boolean.toString(z2));
                if (!z2) {
                    z = false;
                }
            }
            try {
                f.i(xMPushService, f.d(dqVar.b(), dqVar.m3702a(), dtVar, cz.Notification));
            } catch (cd e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
        return z;
    }

    private static void k(Context context, dq dqVar, byte[] bArr) {
        if (ag.m3818a(dqVar)) {
            return;
        }
        String strA = ag.a(dqVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        a(context, strA, bArr);
    }

    private static void l(XMPushService xMPushService, dq dqVar) {
        xMPushService.a(new f1(4, xMPushService, dqVar));
    }

    private static boolean m(dq dqVar) {
        Map<String, String> mapM3671a = dqVar.m3701a().m3671a();
        return mapM3671a != null && mapM3671a.containsKey("notify_effect");
    }

    private static void n(XMPushService xMPushService, dq dqVar) {
        xMPushService.a(new g1(4, xMPushService, dqVar));
    }

    private static boolean o(dq dqVar) {
        if (dqVar.m3701a() == null || dqVar.m3701a().m3671a() == null) {
            return false;
        }
        return "1".equals(dqVar.m3701a().m3671a().get("obslete_ads_message"));
    }

    public void a(Context context, az.b bVar, boolean z, int i, String str) {
        q qVarA;
        if (z || (qVarA = r.a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        r.a(context, qVarA.f, qVarA.d, qVarA.e);
    }

    public void a(XMPushService xMPushService, bi biVar, az.b bVar) {
        try {
            f(xMPushService, biVar.m3599a(bVar.h), biVar.c());
        } catch (IllegalArgumentException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    public void a(XMPushService xMPushService, cj cjVar, az.b bVar) {
        if (!(cjVar instanceof ci)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("not a mipush message");
            return;
        }
        ci ciVar = (ci) cjVar;
        cg cgVarA = ciVar.a(SOAP.XMLNS);
        if (cgVarA != null) {
            try {
                f(xMPushService, bh.a(bh.a(bVar.h, ciVar.j()), cgVarA.c()), cx.a(cjVar.mo3639a()));
            } catch (IllegalArgumentException e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
    }
}
