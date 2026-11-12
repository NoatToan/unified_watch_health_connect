package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.push.ha;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.io;
import com.xiaomi.push.ir;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jc;
import com.xiaomi.push.jm;
import com.xiaomi.push.jr;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.ccs;
import defpackage.css;
import defpackage.dgs;
import defpackage.dys;
import defpackage.fds;
import defpackage.fys;
import defpackage.gbs;
import defpackage.lzs;
import defpackage.mvs;
import defpackage.ngt;
import defpackage.oss;
import defpackage.rcs;
import defpackage.s8s;
import defpackage.sls;
import defpackage.v5s;
import defpackage.vus;
import defpackage.vxs;
import defpackage.x9s;
import defpackage.xys;
import defpackage.y0t;
import defpackage.z6s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static Intent a(byte[] bArr, long j) {
        ix ixVarD = d(bArr);
        if (ixVarD == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(ixVarD.f252b);
        return intent;
    }

    public static ix b(Context context, ix ixVar) {
        return c(context, ixVar, null);
    }

    public static ix c(Context context, ix ixVar, Map<String, String> map) {
        ir irVar = new ir();
        irVar.b(ixVar.m748a());
        io ioVarM747a = ixVar.m747a();
        if (ioVarM747a != null) {
            irVar.a(ioVarM747a.m713a());
            irVar.a(ioVarM747a.m711a());
            if (!TextUtils.isEmpty(ioVarM747a.m718b())) {
                irVar.c(ioVarM747a.m718b());
            }
        }
        irVar.a(com.xiaomi.push.i.b(context, ixVar));
        ix ixVarB = i.b(ixVar.b(), ixVar.m748a(), irVar, ib.AckMessage);
        io ioVarM747a2 = ixVar.m747a();
        if (ioVarM747a2 != null) {
            ioVarM747a2 = fds.a(ioVarM747a2.m712a());
            Map<String, String> mapM714a = ioVarM747a2.m714a();
            String str = mapM714a != null ? mapM714a.get("channel_id") : null;
            ioVarM747a2.a("mat", Long.toString(System.currentTimeMillis()));
            ioVarM747a2.a(Language.CS, String.valueOf(vus.b(context, ixVar.f252b, str)));
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str2 : map.keySet()) {
                        ioVarM747a2.a(str2, map.get(str2));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        ixVarB.a(ioVarM747a2);
        return ixVarB;
    }

    public static ix d(byte[] bArr) {
        ix ixVar = new ix();
        try {
            com.xiaomi.push.i.d(ixVar, bArr);
            return ixVar;
        } catch (Throwable th) {
            x9s.s(th);
            return null;
        }
    }

    public static void e(Context context, ix ixVar, byte[] bArr) {
        try {
            l.c cVarQ = l.q(context, ixVar, bArr);
            if (cVarQ.f14237b > 0 && !TextUtils.isEmpty(cVarQ.f14236a)) {
                xys.j(context, cVarQ.f14236a, cVarQ.f14237b, true, false, System.currentTimeMillis());
            }
            if (!y0t.j(context) || !v5s.f(context, ixVar, cVarQ.c)) {
                u(context, ixVar, bArr);
            } else {
                v5s.b(context, ixVar);
                x9s.o("consume this broadcast by tts");
            }
        } catch (Exception e) {
            x9s.o("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    public static void g(XMPushService xMPushService, ix ixVar) {
        xMPushService.a(new b(4, xMPushService, ixVar));
    }

    public static void h(XMPushService xMPushService, ix ixVar, ja jaVar) {
        xMPushService.a(new h(4, jaVar, ixVar, xMPushService));
    }

    public static void i(XMPushService xMPushService, ix ixVar, String str) {
        xMPushService.a(new f(4, xMPushService, ixVar, str));
    }

    public static void j(XMPushService xMPushService, ix ixVar, String str, String str2) {
        xMPushService.a(new g(4, xMPushService, ixVar, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0443  */
    public static void m(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        ix ixVarD = d(bArr);
        io ioVarM747a = ixVarD.m747a();
        jm jmVarA = null;
        if (bArr != null) {
            sls.f(ixVarD.b(), xMPushService.getApplicationContext(), null, ixVarD.a(), bArr.length);
        }
        if (y(ixVarD) && q(xMPushService, str)) {
            if (l.Z(ixVarD)) {
                oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
            }
            x(xMPushService, ixVarD);
            return;
        }
        if (s(ixVarD) && !q(xMPushService, str) && !w(ixVarD)) {
            if (l.Z(ixVarD)) {
                oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), "6");
            }
            z(xMPushService, ixVarD);
            return;
        }
        if ((!l.J(ixVarD) || !com.xiaomi.push.g.p(xMPushService, ixVarD.f252b)) && !p(xMPushService, intent)) {
            if (!com.xiaomi.push.g.p(xMPushService, ixVarD.f252b)) {
                if (l.Z(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).i(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), "2");
                }
                g(xMPushService, ixVarD);
                return;
            } else {
                x9s.o("receive a mipush message, we can see the app, but we can't see the receiver.");
                if (l.Z(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).i(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), "3");
                    return;
                }
                return;
            }
        }
        boolean z = false;
        if (ib.Registration == ixVarD.a()) {
            String strB = ixVarD.b();
            SharedPreferences.Editor editorEdit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
            editorEdit.putString(strB, ixVarD.f248a);
            editorEdit.commit();
            jc jcVarA = j0.a(ixVarD);
            if (jcVarA.a() != 0 || TextUtils.isEmpty(jcVarA.b())) {
                x9s.D("read regSecret failed");
            } else {
                j0.c(xMPushService, strB, jcVarA.b());
            }
            ngt.a(xMPushService).i(strB);
            ngt.a(xMPushService).j(strB);
            oss.a(xMPushService.getApplicationContext()).g(strB, "E100003", ioVarM747a.m713a(), 6003, null);
            if (!TextUtils.isEmpty(ioVarM747a.m713a())) {
                intent.putExtra("messageId", ioVarM747a.m713a());
                intent.putExtra("eventMessageType", 6000);
            }
        }
        if (l.X(ixVarD)) {
            oss.a(xMPushService.getApplicationContext()).f(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), 1001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(ioVarM747a.m713a())) {
                intent.putExtra("messageId", ioVarM747a.m713a());
                intent.putExtra("eventMessageType", 1000);
            }
        }
        if (l.U(ixVarD)) {
            oss.a(xMPushService.getApplicationContext()).f(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), 2001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(ioVarM747a.m713a())) {
                intent.putExtra("messageId", ioVarM747a.m713a());
                intent.putExtra("eventMessageType", 2000);
            }
        }
        if (l.J(ixVarD)) {
            oss.a(xMPushService.getApplicationContext()).f(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), 3001, System.currentTimeMillis(), null);
            if (!TextUtils.isEmpty(ioVarM747a.m713a())) {
                intent.putExtra("messageId", ioVarM747a.m713a());
                intent.putExtra("eventMessageType", 3000);
            }
        }
        if (ioVarM747a != null && !TextUtils.isEmpty(ioVarM747a.m721c()) && !TextUtils.isEmpty(ioVarM747a.d()) && ioVarM747a.f162b != 1 && !l.H(xMPushService, ixVarD.f252b, l.L(ioVarM747a.m714a()))) {
            Map<String, String> map = ioVarM747a.f160a;
            String strM713a = map != null ? map.get("jobkey") : null;
            if (TextUtils.isEmpty(strM713a)) {
                strM713a = ioVarM747a.m713a();
            }
            if (z6s.a(xMPushService, ixVarD.f252b, strM713a)) {
                oss.a(xMPushService.getApplicationContext()).j(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), "1:" + strM713a);
                x9s.o("drop a duplicate message, key=" + strM713a);
            } else if (y0t.j(xMPushService) && v5s.g(ixVarD)) {
                x9s.o("receive pull down message");
            } else {
                e(xMPushService, ixVarD, bArr);
            }
            v(xMPushService, ixVarD);
        } else if ("com.xiaomi.xmsf".contains(ixVarD.f252b) && !ixVarD.m755b() && ioVarM747a != null && ioVarM747a.m714a() != null && ioVarM747a.m714a().containsKey("ab")) {
            v(xMPushService, ixVarD);
            x9s.B("receive abtest message. ack it." + ioVarM747a.m713a());
        } else if (t(xMPushService, str, ixVarD, ioVarM747a)) {
            if (ioVarM747a != null && !TextUtils.isEmpty(ioVarM747a.m713a())) {
                if (l.U(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).g(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), 2002, null);
                } else if (l.J(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP);
                } else if (l.X(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), UserConfig.KEY_MI_BRAIN_SETTING);
                } else if (l.Y(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).g(ixVarD.b(), "E100003", ioVarM747a.m713a(), 6004, null);
                }
            }
            if (ib.Notification == ixVarD.f245a) {
                try {
                    jmVarA = dgs.a(xMPushService, ixVarD);
                    if (jmVarA == null) {
                        x9s.D("receiving an un-recognized notification message. " + ixVarD.f245a);
                    } else {
                        z = true;
                    }
                } catch (jr e) {
                    x9s.D("receive a message which action string is not valid. " + e);
                }
                if (z && (jmVarA instanceof ja)) {
                    ja jaVar = (ja) jmVarA;
                    if (il.CancelPushMessage.f125a.equals(jaVar.f269d) && jaVar.m763a() != null) {
                        String str2 = jaVar.m763a().get(ccs.M);
                        int i = -2;
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                i = Integer.parseInt(str2);
                            } catch (NumberFormatException e2) {
                                x9s.o("parse notifyId from STRING to INT failed: " + e2);
                            }
                        }
                        if (i >= -1) {
                            x9s.o("try to retract a message by notifyId=" + i);
                            l.y(xMPushService, ixVarD.f252b, i);
                        } else {
                            String str3 = jaVar.m763a().get(ccs.K);
                            String str4 = jaVar.m763a().get(ccs.L);
                            x9s.o("try to retract a message by title&description.");
                            l.B(xMPushService, ixVarD.f252b, str3, str4);
                        }
                        if (ioVarM747a != null && ioVarM747a.m714a() != null && y0t.j(xMPushService) && "pulldown".equals(s8s.i(ioVarM747a.m714a()))) {
                            v5s.d(ixVarD);
                        }
                        h(xMPushService, ixVarD, jaVar);
                    } else if (!il.SettingAppNotificationPermission.f125a.equals(jaVar.c())) {
                        x9s.o("broadcast passthrough message.");
                        xMPushService.sendBroadcast(intent, i.g(ixVarD.f252b));
                    } else if (y0t.j(xMPushService)) {
                        v5s.c(xMPushService, ixVarD, jaVar);
                    }
                } else {
                    x9s.o("broadcast passthrough message.");
                    xMPushService.sendBroadcast(intent, i.g(ixVarD.f252b));
                }
            } else {
                x9s.o("broadcast passthrough message.");
                xMPushService.sendBroadcast(intent, i.g(ixVarD.f252b));
            }
        } else {
            oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), UserConfig.KEY_LITE_SCENE_ORDER);
        }
        if (ixVarD.a() != ib.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
            return;
        }
        xMPushService.stopSelf();
    }

    public static void n(XMPushService xMPushService, byte[] bArr, long j) {
        o(xMPushService, bArr, j, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    public static void o(XMPushService xMPushService, byte[] bArr, long j, Map<String, String> map) {
        byte[] bArr2;
        Map<String, String> mapM714a;
        Map<String, String> mapM714a2;
        byte[] bArrE;
        ix ixVarD = d(bArr);
        if (ixVarD == null) {
            return;
        }
        if (TextUtils.isEmpty(ixVarD.f252b)) {
            x9s.o("receive a mipush message without package name");
            return;
        }
        io ioVarM747a = ixVarD.m747a();
        if (ioVarM747a == null || map == null || map.isEmpty() || (mapM714a2 = ioVarM747a.m714a()) == null || mapM714a2.isEmpty()) {
            bArr2 = bArr;
        } else {
            boolean z = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (mapM714a2.containsKey(entry.getKey())) {
                    mapM714a2.put(entry.getKey(), entry.getValue());
                    z = true;
                }
            }
            if (!z || (bArrE = com.xiaomi.push.i.e(ixVarD)) == null || bArrE.length <= 0) {
                bArr2 = bArr;
            } else {
                bArr2 = bArrE;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intent intentA = a(bArr2, jCurrentTimeMillis);
        String strT = l.t(ixVarD);
        xys.j(xMPushService, strT, j, true, true, System.currentTimeMillis());
        if (ioVarM747a != null && ioVarM747a.m713a() != null) {
            x9s.E(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", ixVarD.m748a(), gbs.b(ioVarM747a.m713a()), ixVarD.a()));
        }
        if (ioVarM747a != null) {
            ioVarM747a.a("mrt", Long.toString(jCurrentTimeMillis));
        }
        ib ibVar = ib.SendMessage;
        String strM713a = "";
        if (ibVar == ixVarD.a() && ngt.a(xMPushService).c(ixVarD.f252b) && !l.J(ixVarD)) {
            if (ioVarM747a != null) {
                strM713a = ioVarM747a.m713a();
                if (l.Z(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), strM713a, "1");
                }
            }
            x9s.o("Drop a message for unregistered, msgid=" + strM713a);
            i(xMPushService, ixVarD, ixVarD.f252b);
            return;
        }
        if (ibVar == ixVarD.a() && ngt.a(xMPushService).g(ixVarD.f252b) && !l.J(ixVarD)) {
            if (ioVarM747a != null) {
                strM713a = ioVarM747a.m713a();
                if (l.Z(ixVarD)) {
                    oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), strM713a, "2");
                }
            }
            x9s.o("Drop a message for push closed, msgid=" + strM713a);
            i(xMPushService, ixVarD, ixVarD.f252b);
            return;
        }
        if (ibVar == ixVarD.a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), ixVarD.f252b)) {
            x9s.o("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + ixVarD.f252b);
            j(xMPushService, ixVarD, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + ixVarD.f252b);
            if (ioVarM747a == null || !l.Z(ixVarD)) {
                return;
            }
            oss.a(xMPushService.getApplicationContext()).h(ixVarD.b(), l.P(ixVarD), ioVarM747a.m713a(), "3");
            return;
        }
        if (ibVar != ixVarD.a() || lzs.c() != 999 || !lzs.l(xMPushService, strT)) {
            if (ioVarM747a == null || (mapM714a = ioVarM747a.m714a()) == null || !mapM714a.containsKey("hide") || !"true".equalsIgnoreCase(mapM714a.get("hide"))) {
                m(xMPushService, strT, bArr2, intentA);
                return;
            } else {
                v(xMPushService, ixVarD);
                return;
            }
        }
        x9s.o("Receive the uninstalled dual app message");
        try {
            i.i(xMPushService, i.a(strT, ixVarD.m748a()));
            x9s.o("uninstall " + strT + " msg sent");
        } catch (ha e) {
            x9s.D("Fail to send Message: " + e.getMessage());
            xMPushService.a(10, e);
        }
        l.x(xMPushService, strT);
    }

    public static boolean p(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean q(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() && packageManager.queryIntentServices(intent, 32).isEmpty()) ? false : true;
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }

    public static boolean r(Context context, String str, byte[] bArr) {
        if (!com.xiaomi.push.g.l(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            x9s.o("broadcast message arrived.");
            context.sendBroadcast(intent, i.g(str));
            return true;
        } catch (Exception e) {
            x9s.o("meet error when broadcast message arrived. " + e);
            return false;
        }
    }

    public static boolean s(ix ixVar) {
        return "com.xiaomi.xmsf".equals(ixVar.f252b) && ixVar.m747a() != null && ixVar.m747a().m714a() != null && ixVar.m747a().m714a().containsKey("miui_package_name");
    }

    public static boolean t(XMPushService xMPushService, String str, ix ixVar, io ioVar) {
        boolean z = true;
        if (ioVar != null && ioVar.m714a() != null && ioVar.m714a().containsKey("__check_alive") && ioVar.m714a().containsKey("__awake")) {
            ja jaVar = new ja();
            jaVar.b(ixVar.m748a());
            jaVar.d(str);
            jaVar.c(il.AwakeSystemApp.f125a);
            jaVar.a(ioVar.m713a());
            jaVar.f264a = new HashMap();
            boolean zL = com.xiaomi.push.g.l(xMPushService.getApplicationContext(), str);
            jaVar.f264a.put("app_running", Boolean.toString(zL));
            if (!zL) {
                boolean z2 = Boolean.parseBoolean(ioVar.m714a().get("__awake"));
                jaVar.f264a.put("awaked", Boolean.toString(z2));
                if (!z2) {
                    z = false;
                }
            }
            try {
                i.i(xMPushService, i.b(ixVar.b(), ixVar.m748a(), jaVar, ib.Notification));
            } catch (ha e) {
                x9s.s(e);
            }
        }
        return z;
    }

    public static void u(Context context, ix ixVar, byte[] bArr) {
        if (l.J(ixVar)) {
            return;
        }
        String strT = l.t(ixVar);
        if (TextUtils.isEmpty(strT) || r(context, strT, bArr)) {
            return;
        }
        oss.a(context).i(strT, l.P(ixVar), ixVar.m747a().m713a(), "1");
    }

    public static void v(XMPushService xMPushService, ix ixVar) {
        xMPushService.a(new c(4, xMPushService, ixVar));
    }

    public static boolean w(ix ixVar) {
        Map<String, String> mapM714a = ixVar.m747a().m714a();
        return mapM714a != null && mapM714a.containsKey("notify_effect");
    }

    public static void x(XMPushService xMPushService, ix ixVar) {
        xMPushService.a(new d(4, xMPushService, ixVar));
    }

    public static boolean y(ix ixVar) {
        if (ixVar.m747a() == null || ixVar.m747a().m714a() == null) {
            return false;
        }
        return "1".equals(ixVar.m747a().m714a().get("obslete_ads_message"));
    }

    public static void z(XMPushService xMPushService, ix ixVar) {
        xMPushService.a(new e(4, xMPushService, ixVar));
    }

    public void f(Context context, bg.b bVar, boolean z, int i, String str) {
        n0 n0VarB;
        if (z || (n0VarB = o0.b(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        o0.c(context, n0VarB.f, n0VarB.d, n0VarB.e);
    }

    public void k(XMPushService xMPushService, mvs mvsVar, bg.b bVar) {
        HashMap map;
        try {
            byte[] bArrQ = mvsVar.q(bVar.i);
            if (css.b(mvsVar)) {
                map = new HashMap();
                map.put("t_im", String.valueOf(mvsVar.s()));
                map.put("t_rt", String.valueOf(mvsVar.b()));
            } else {
                map = null;
            }
            o(xMPushService, bArrQ, mvsVar.x(), map);
        } catch (IllegalArgumentException e) {
            x9s.s(e);
        }
    }

    public void l(XMPushService xMPushService, fys fysVar, bg.b bVar) {
        if (!(fysVar instanceof dys)) {
            x9s.o("not a mipush message");
            return;
        }
        dys dysVar = (dys) fysVar;
        vxs vxsVarC = dysVar.c("s");
        if (vxsVarC != null) {
            try {
                n(xMPushService, rcs.h(rcs.g(bVar.i, dysVar.l()), vxsVarC.k()), xys.b(fysVar.f()));
            } catch (IllegalArgumentException e) {
                x9s.s(e);
            }
        }
    }
}
