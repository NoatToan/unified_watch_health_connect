package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.push.bi;
import com.xiaomi.push.ch;
import com.xiaomi.push.ci;
import com.xiaomi.push.cj;
import com.xiaomi.push.cl;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public class j {
    private v a = new v();

    public static String a(az.b bVar) {
        StringBuilder sb;
        String str;
        if ("9".equals(bVar.g)) {
            sb = new StringBuilder();
            sb.append(bVar.f206a);
            str = ".permission.MIMC_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f206a);
            str = ".permission.MIPUSH_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    private static void c(Context context, Intent intent, az.b bVar) {
        if (PkgNameConstants.XMSF.equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    public az.b a(bi biVar) {
        Collection<az.b> collectionA = az.a().a(Integer.toString(biVar.a()));
        if (collectionA.isEmpty()) {
            return null;
        }
        Iterator<az.b> it2 = collectionA.iterator();
        if (collectionA.size() == 1) {
            return it2.next();
        }
        String strG = biVar.g();
        while (it2.hasNext()) {
            az.b next = it2.next();
            if (TextUtils.equals(strG, next.b)) {
                return next;
            }
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (com.xiaomi.channel.commonutils.android.f.m3429b()) {
            intent.addFlags(16777216);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, az.b bVar, int i) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f206a);
        intent.putExtra(bd.u, bVar.g);
        intent.putExtra("ext_reason", i);
        intent.putExtra(bd.r, bVar.b);
        intent.putExtra(bd.G, bVar.i);
        if (bVar.o == null || !"9".equals(bVar.g)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.g, bVar.f206a, Integer.valueOf(i)));
            c(context, intent, bVar);
            return;
        }
        try {
            bVar.o.send(Message.obtain(null, 17, intent));
        } catch (RemoteException unused) {
            bVar.o = null;
            StringBuilder sb = new StringBuilder();
            sb.append("peer may died: ");
            String str = bVar.b;
            sb.append(str.substring(str.lastIndexOf(64)));
            com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
        }
    }

    public void a(Context context, az.b bVar, String str, String str2) {
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.g)) {
            com.xiaomi.channel.commonutils.logger.b.d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f206a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(bd.r, bVar.b);
        intent.putExtra(bd.G, bVar.i);
        com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.g, bVar.f206a, str2));
        c(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, az.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            this.a.a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f206a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(bd.r, bVar.b);
        intent.putExtra(bd.G, bVar.i);
        com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.g, bVar.f206a, Boolean.valueOf(z), Integer.valueOf(i)));
        c(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, bi biVar) {
        az.b bVarA = a(biVar);
        if (bVarA == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.a.a(xMPushService, biVar, bVarA);
            return;
        }
        String str2 = bVarA.f206a;
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", biVar.m3599a(bVarA.h));
        intent.putExtra(bd.G, bVarA.i);
        intent.putExtra(bd.y, bVarA.h);
        if (bVarA.o != null) {
            try {
                bVarA.o.send(Message.obtain(null, 17, intent));
                com.xiaomi.channel.commonutils.logger.b.m3434a("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                bVarA.o = null;
                StringBuilder sb = new StringBuilder();
                sb.append("peer may died: ");
                String str3 = bVarA.b;
                sb.append(str3.substring(str3.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
            }
        }
        if (PkgNameConstants.XMSF.equals(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVarA.g, bVarA.f206a, biVar.e()));
        c(xMPushService, intent, bVarA);
    }

    public void a(XMPushService xMPushService, String str, cj cjVar) {
        String str2;
        String str3;
        az.b bVarB = b(cjVar);
        if (bVarB != null) {
            if ("5".equalsIgnoreCase(str)) {
                this.a.a(xMPushService, cjVar, bVarB);
                return;
            }
            String str4 = bVarB.f206a;
            if (cjVar instanceof ci) {
                str3 = "com.xiaomi.push.new_msg";
            } else if (cjVar instanceof ch) {
                str3 = "com.xiaomi.push.new_iq";
            } else if (cjVar instanceof cl) {
                str3 = "com.xiaomi.push.new_pres";
            } else {
                str2 = "unknown packet type, drop it";
            }
            Intent intent = new Intent();
            intent.setAction(str3);
            intent.setPackage(str4);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", cjVar.a());
            intent.putExtra(bd.G, bVarB.i);
            intent.putExtra(bd.y, bVarB.h);
            com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("[Bcst] notify packet arrival. %s,%s,%s", bVarB.g, bVarB.f206a, cjVar.j()));
            c(xMPushService, intent, bVarB);
            return;
        }
        str2 = "error while notify channel closed! channel " + str + " not registered";
        com.xiaomi.channel.commonutils.logger.b.d(str2);
    }

    public az.b b(cj cjVar) {
        Collection<az.b> collectionA = az.a().a(cjVar.k());
        if (collectionA.isEmpty()) {
            return null;
        }
        Iterator<az.b> it2 = collectionA.iterator();
        if (collectionA.size() == 1) {
            return it2.next();
        }
        String strM = cjVar.m();
        String strL = cjVar.l();
        while (it2.hasNext()) {
            az.b next = it2.next();
            if (TextUtils.equals(strM, next.b) || TextUtils.equals(strL, next.b)) {
                return next;
            }
        }
        return null;
    }
}
