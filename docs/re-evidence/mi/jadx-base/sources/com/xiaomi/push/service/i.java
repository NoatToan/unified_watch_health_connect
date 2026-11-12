package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ha;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.io;
import com.xiaomi.push.iq;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.jr;
import defpackage.fys;
import defpackage.gbs;
import defpackage.gv5;
import defpackage.gws;
import defpackage.iht;
import defpackage.mvs;
import defpackage.sls;
import defpackage.x9s;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static ix a(String str, String str2) {
        ja jaVar = new ja();
        jaVar.b(str2);
        jaVar.c("package uninstalled");
        jaVar.a(fys.k());
        jaVar.a(false);
        return b(str, str2, jaVar, ib.Notification);
    }

    public static <T extends jm<T, ?>> ix b(String str, String str2, T t, ib ibVar) {
        return c(str, str2, t, ibVar, true);
    }

    public static <T extends jm<T, ?>> ix c(String str, String str2, T t, ib ibVar, boolean z) {
        byte[] bArrE = com.xiaomi.push.i.e(t);
        ix ixVar = new ix();
        iq iqVar = new iq();
        iqVar.f173a = 5L;
        iqVar.f174a = "fakeid";
        ixVar.a(iqVar);
        ixVar.a(ByteBuffer.wrap(bArrE));
        ixVar.a(ibVar);
        ixVar.b(z);
        ixVar.b(str);
        ixVar.a(false);
        ixVar.a(str2);
        return ixVar;
    }

    public static mvs d(XMPushService xMPushService, byte[] bArr) {
        ix ixVar = new ix();
        try {
            com.xiaomi.push.i.d(ixVar, bArr);
            return e(o0.b(xMPushService), xMPushService, ixVar);
        } catch (jr e) {
            x9s.s(e);
            return null;
        }
    }

    public static mvs e(n0 n0Var, Context context, ix ixVar) {
        try {
            mvs mvsVar = new mvs();
            mvsVar.h(5);
            mvsVar.B(n0Var.f14246a);
            mvsVar.v(f(ixVar));
            mvsVar.l("SECMSG", "message");
            String str = n0Var.f14246a;
            ixVar.f247a.f174a = str.substring(0, str.indexOf(gv5.CONNECT_VALUE_STR));
            ixVar.f247a.f178c = str.substring(str.indexOf("/") + 1);
            mvsVar.n(com.xiaomi.push.i.e(ixVar), n0Var.c);
            mvsVar.m((short) 1);
            x9s.o("try send mi push message. packagename:" + ixVar.f252b + " action:" + ixVar.f245a);
            return mvsVar;
        } catch (NullPointerException e) {
            x9s.s(e);
            return null;
        }
    }

    public static String f(ix ixVar) {
        Map<String, String> map;
        io ioVar = ixVar.f246a;
        if (ioVar != null && (map = ioVar.f164b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ixVar.f252b;
    }

    public static String g(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    public static void h(XMPushService xMPushService) {
        n0 n0VarB = o0.b(xMPushService.getApplicationContext());
        if (n0VarB != null) {
            bg.b bVarA = o0.b(xMPushService.getApplicationContext()).a(xMPushService);
            x9s.o("prepare account. " + bVarA.f14196a);
            j(xMPushService, bVarA);
            bg.c().l(bVarA);
            k(xMPushService, n0VarB, 172800);
        }
    }

    public static void i(XMPushService xMPushService, ix ixVar) {
        sls.e(ixVar.b(), xMPushService.getApplicationContext(), ixVar, -1);
        gws gwsVarM829a = xMPushService.m829a();
        if (gwsVarM829a == null) {
            throw new ha("try send msg while connection is null.");
        }
        if (!gwsVarM829a.q()) {
            throw new ha("Don't support XMPP connection.");
        }
        mvs mvsVarE = e(o0.b(xMPushService), xMPushService, ixVar);
        if (mvsVarE != null) {
            gwsVarM829a.w(mvsVarE);
        }
    }

    public static void j(XMPushService xMPushService, bg.b bVar) {
        bVar.h(null);
        bVar.i(new k(xMPushService));
    }

    public static void k(XMPushService xMPushService, n0 n0Var, int i) {
        v.c(xMPushService).f(new j("MSAID", i, xMPushService, n0Var));
    }

    public static void l(XMPushService xMPushService, String str, byte[] bArr) {
        sls.g(str, xMPushService.getApplicationContext(), bArr);
        gws gwsVarM829a = xMPushService.m829a();
        if (gwsVarM829a == null) {
            throw new ha("try send msg while connection is null.");
        }
        if (!gwsVarM829a.q()) {
            throw new ha("Don't support XMPP connection.");
        }
        mvs mvsVarD = d(xMPushService, bArr);
        if (mvsVarD != null) {
            gwsVarM829a.w(mvsVarD);
        } else {
            iht.b(xMPushService, str, bArr, 70000003, "not a valid message");
        }
    }

    public static ix m(String str, String str2) {
        ja jaVar = new ja();
        jaVar.b(str2);
        jaVar.c(il.AppDataCleared.f125a);
        jaVar.a(gbs.a());
        jaVar.a(false);
        return b(str, str2, jaVar, ib.Notification);
    }

    public static <T extends jm<T, ?>> ix n(String str, String str2, T t, ib ibVar) {
        return c(str, str2, t, ibVar, false);
    }
}
