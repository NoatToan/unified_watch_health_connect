package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.hi;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.ccs;
import defpackage.css;
import defpackage.dys;
import defpackage.fys;
import defpackage.mvs;
import defpackage.x9s;
import defpackage.y0t;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f14218a = new a();

    public static String c(bg.b bVar) {
        if (UserConfig.KEY_LITE_SCENE_ORDER.equals(bVar.h)) {
            return bVar.f14196a + ".permission.MIMC_RECEIVE";
        }
        return bVar.f14196a + ".permission.MIPUSH_RECEIVE";
    }

    public static void e(Context context, Intent intent, bg.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, c(bVar));
        }
    }

    public bg.b a(mvs mvsVar) {
        Collection<bg.b> collectionF = bg.c().f(Integer.toString(mvsVar.a()));
        if (collectionF.isEmpty()) {
            return null;
        }
        Iterator<bg.b> it = collectionF.iterator();
        if (collectionF.size() == 1) {
            return it.next();
        }
        String strF = mvsVar.F();
        while (it.hasNext()) {
            bg.b next = it.next();
            if (TextUtils.equals(strF, next.f14197b)) {
                return next;
            }
        }
        return null;
    }

    public bg.b b(fys fysVar) {
        Collection<bg.b> collectionF = bg.c().f(fysVar.m());
        if (collectionF.isEmpty()) {
            return null;
        }
        Iterator<bg.b> it = collectionF.iterator();
        if (collectionF.size() == 1) {
            return it.next();
        }
        String strQ = fysVar.q();
        String strO = fysVar.o();
        while (it.hasNext()) {
            bg.b next = it.next();
            if (TextUtils.equals(strQ, next.f14197b) || TextUtils.equals(strO, next.f14197b)) {
                return next;
            }
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    public void d(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.service_started");
            if (y0t.r()) {
                intent.addFlags(16777216);
            }
            x9s.o("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
            intent.setPackage("com.android.mms");
            context.sendBroadcast(intent);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void f(Context context, bg.b bVar, int i) {
        if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equalsIgnoreCase(bVar.h)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f14196a);
        intent.putExtra(ccs.s, bVar.h);
        intent.putExtra("ext_reason", i);
        intent.putExtra(ccs.p, bVar.f14197b);
        intent.putExtra(ccs.F, bVar.j);
        if (bVar.f14199r == null || !UserConfig.KEY_LITE_SCENE_ORDER.equals(bVar.h)) {
            x9s.o(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.h, bVar.f14196a, Integer.valueOf(i)));
            e(context, intent, bVar);
            return;
        }
        try {
            bVar.f14199r.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            bVar.f14199r = null;
            StringBuilder sb = new StringBuilder();
            sb.append("peer may died: ");
            String str = bVar.f14197b;
            sb.append(str.substring(str.lastIndexOf(64)));
            x9s.o(sb.toString());
        }
    }

    public void g(Context context, bg.b bVar, String str, String str2) {
        if (bVar == null) {
            x9s.D("error while notify kick by server!");
            return;
        }
        if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equalsIgnoreCase(bVar.h)) {
            x9s.D("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f14196a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.h);
        intent.putExtra(ccs.p, bVar.f14197b);
        intent.putExtra(ccs.F, bVar.j);
        x9s.o(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.h, bVar.f14196a, str2));
        e(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public void h(Context context, bg.b bVar, boolean z, int i, String str) {
        if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equalsIgnoreCase(bVar.h)) {
            this.f14218a.f(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f14196a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.h);
        intent.putExtra(ccs.p, bVar.f14197b);
        intent.putExtra(ccs.F, bVar.j);
        x9s.o(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.h, bVar.f14196a, Boolean.valueOf(z), Integer.valueOf(i)));
        e(context, intent, bVar);
    }

    public void i(XMPushService xMPushService, String str, mvs mvsVar) {
        bg.b bVarA = a(mvsVar);
        if (bVarA == null) {
            x9s.D("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equalsIgnoreCase(str)) {
            this.f14218a.k(xMPushService, mvsVar, bVarA);
            return;
        }
        String str2 = bVarA.f14196a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", mvsVar.q(bVarA.i));
        intent.putExtra(ccs.F, bVarA.j);
        intent.putExtra(ccs.x, bVarA.i);
        if (css.a(mvsVar)) {
            intent.putExtra("ext_downward_pkt_id", mvsVar.D());
        }
        if (bVarA.f14199r != null) {
            try {
                bVarA.f14199r.send(Message.obtain(null, 17, intent));
                x9s.o("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                bVarA.f14199r = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str3 = bVarA.f14197b;
                sb.append(str3.substring(str3.lastIndexOf(64)));
                x9s.o(sb.toString());
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        x9s.o(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVarA.h, bVarA.f14196a, mvsVar.D()));
        if (css.a(mvsVar)) {
            t.a().c(mvsVar.D(), SystemClock.elapsedRealtime());
        }
        e(xMPushService, intent, bVarA);
    }

    public void j(XMPushService xMPushService, String str, fys fysVar) {
        String str2;
        bg.b bVarB = b(fysVar);
        if (bVarB == null) {
            x9s.D("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if (UserConfig.KEY_DEVICE_LITE_SORT_GROUP.equalsIgnoreCase(str)) {
            this.f14218a.l(xMPushService, fysVar, bVarB);
            return;
        }
        String str3 = bVarB.f14196a;
        if (fysVar instanceof dys) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (fysVar instanceof com.xiaomi.push.e) {
            str2 = "com.xiaomi.push.new_iq";
        } else {
            if (!(fysVar instanceof hi)) {
                x9s.D("unknown packet type, drop it");
                return;
            }
            str2 = "com.xiaomi.push.new_pres";
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", fysVar.a());
        intent.putExtra(ccs.F, bVarB.j);
        intent.putExtra(ccs.x, bVarB.i);
        x9s.o(String.format("[Bcst] notify packet arrival. %s,%s,%s", bVarB.h, bVarB.f14196a, fysVar.l()));
        if ("3".equalsIgnoreCase(str)) {
            intent.putExtra(ccs.t, fysVar.j);
            intent.putExtra(ccs.u, System.currentTimeMillis());
        }
        e(xMPushService, intent, bVarB);
    }
}
