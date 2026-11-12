package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.bi;
import com.xiaomi.push.cd;
import com.xiaomi.push.cj;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dk;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import com.xiaomi.push.ee;
import com.xiaomi.push.ef;
import com.xiaomi.push.ej;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
final class f {
    public static bi a(XMPushService xMPushService, byte[] bArr) {
        dq dqVar = new dq();
        try {
            ee.a(dqVar, bArr);
            return b(r.a((Context) xMPushService), xMPushService, dqVar);
        } catch (ej e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    public static bi b(q qVar, Context context, dq dqVar) {
        try {
            bi biVar = new bi();
            biVar.a(5);
            biVar.c(qVar.f209a);
            biVar.b(f(dqVar));
            biVar.a("SECMSG", "message");
            String str = qVar.f209a;
            dqVar.f121a.f98a = str.substring(0, str.indexOf("@"));
            dqVar.f121a.c = str.substring(str.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1);
            biVar.a(ee.a(dqVar), qVar.c);
            biVar.a((short) 1);
            com.xiaomi.channel.commonutils.logger.b.m3434a("try send mi push message. packagename:" + dqVar.b + " action:" + dqVar.a);
            return biVar;
        } catch (NullPointerException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    public static dq c(String str, String str2) {
        dt dtVar = new dt();
        dtVar.b(str2);
        dtVar.c("package uninstalled");
        dtVar.a(cj.i());
        dtVar.a(false);
        return d(str, str2, dtVar, cz.Notification);
    }

    public static <T extends ef<T, ?>> dq d(String str, String str2, T t, cz czVar) {
        return e(str, str2, t, czVar, true);
    }

    private static <T extends ef<T, ?>> dq e(String str, String str2, T t, cz czVar, boolean z) {
        byte[] bArrA = ee.a(t);
        dq dqVar = new dq();
        dk dkVar = new dk();
        dkVar.a = 5L;
        dkVar.f98a = "fakeid";
        dqVar.a(dkVar);
        dqVar.a(ByteBuffer.wrap(bArrA));
        dqVar.a(czVar);
        dqVar.b(z);
        dqVar.b(str);
        dqVar.a(false);
        dqVar.a(str2);
        return dqVar;
    }

    private static String f(dq dqVar) {
        Map<String, String> map;
        di diVar = dqVar.f120a;
        if (diVar != null && (map = diVar.f93b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return dqVar.b;
    }

    public static String g(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    public static void h(XMPushService xMPushService) {
        q qVarA = r.a(xMPushService.getApplicationContext());
        if (qVarA != null) {
            az.b bVarA = r.a(xMPushService.getApplicationContext()).a(xMPushService);
            com.xiaomi.channel.commonutils.logger.b.m3434a("prepare account. " + bVarA.f206a);
            j(xMPushService, bVarA);
            az.a().a(bVarA);
            bp.a(xMPushService).a(new g("GAID", 172800L, xMPushService, qVarA));
        }
    }

    public static void i(XMPushService xMPushService, dq dqVar) {
        com.xiaomi.push.bt btVarM3802a = xMPushService.m3802a();
        if (btVarM3802a == null) {
            throw new cd("try send msg while connection is null.");
        }
        if (!btVarM3802a.mo3603a()) {
            throw new cd("Don't support XMPP connection.");
        }
        bi biVarB = b(r.a((Context) xMPushService), xMPushService, dqVar);
        if (biVarB != null) {
            btVarM3802a.b(biVarB);
        }
    }

    public static void j(XMPushService xMPushService, az.b bVar) {
        bVar.f(null);
        bVar.a(new h(xMPushService));
    }

    public static void k(XMPushService xMPushService, String str, byte[] bArr) throws cd {
        com.xiaomi.push.bt btVarM3802a = xMPushService.m3802a();
        if (btVarM3802a == null) {
            throw new cd("try send msg while connection is null.");
        }
        if (!btVarM3802a.mo3603a()) {
            throw new cd("Don't support XMPP connection.");
        }
        bi biVarA = a(xMPushService, bArr);
        if (biVarA != null) {
            btVarM3802a.b(biVarA);
        } else {
            u.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
        }
    }

    public static dq l(String str, String str2) {
        dt dtVar = new dt();
        dtVar.b(str2);
        dtVar.c(df.AppDataCleared.f77a);
        dtVar.a(aw.a());
        dtVar.a(false);
        return d(str, str2, dtVar, cz.Notification);
    }

    public static <T extends ef<T, ?>> dq m(String str, String str2, T t, cz czVar) {
        return e(str, str2, t, czVar, false);
    }
}
