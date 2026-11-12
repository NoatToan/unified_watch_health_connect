package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.push.fm;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.in;
import com.xiaomi.push.io;
import com.xiaomi.push.ip;
import com.xiaomi.push.ir;
import com.xiaomi.push.is;
import com.xiaomi.push.iw;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.iz;
import com.xiaomi.push.ja;
import com.xiaomi.push.jc;
import com.xiaomi.push.je;
import com.xiaomi.push.jg;
import com.xiaomi.push.ji;
import com.xiaomi.push.jk;
import com.xiaomi.push.jm;
import com.xiaomi.push.jr;
import com.xiaomi.push.service.l;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import defpackage.b3t;
import defpackage.bas;
import defpackage.ccs;
import defpackage.d6s;
import defpackage.dct;
import defpackage.fds;
import defpackage.gxs;
import defpackage.l4s;
import defpackage.mss;
import defpackage.o7s;
import defpackage.oss;
import defpackage.pl8;
import defpackage.qbt;
import defpackage.qcs;
import defpackage.s8s;
import defpackage.sls;
import defpackage.v4s;
import defpackage.vas;
import defpackage.x9s;
import defpackage.y5s;
import defpackage.yas;
import defpackage.yfs;
import defpackage.yvf;
import defpackage.z2t;
import defpackage.zei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f13647b;
    public static Queue<String> c;
    public static Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13648a;

    public e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f13648a = applicationContext;
        if (applicationContext == null) {
            this.f13648a = context;
        }
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        return l.O(context, str, map, i);
    }

    public static e e(Context context) {
        if (f13647b == null) {
            f13647b = new e(context);
        }
        return f13647b;
    }

    public static boolean m(Context context, String str) {
        synchronized (d) {
            try {
                bas.c(context);
                SharedPreferences sharedPreferencesB = bas.b(context);
                if (c == null) {
                    String[] strArrSplit = sharedPreferencesB.getString("pref_msg_ids", "").split(",");
                    c = new LinkedList();
                    for (String str2 : strArrSplit) {
                        c.add(str2);
                    }
                }
                if (c.contains(str)) {
                    return true;
                }
                c.add(str);
                if (c.size() > 25) {
                    c.poll();
                }
                String strD = qcs.d(c, ",");
                SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
                editorEdit.putString("pref_msg_ids", strD);
                dct.a(editorEdit);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PushMessageHandler.a b(Intent intent) {
        String action = intent.getAction();
        x9s.o("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                x9s.D("receiving an empty message, drop");
                oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, "12");
                return null;
            }
            ix ixVar = new ix();
            try {
                i.d(ixVar, byteArrayExtra);
                bas basVarC = bas.c(this.f13648a);
                io ioVarM747a = ixVar.m747a();
                ib ibVarA = ixVar.a();
                ib ibVar = ib.SendMessage;
                if (ibVarA == ibVar && ioVarM747a != null && !basVarC.w() && !booleanExtra) {
                    ioVarM747a.a("mrt", stringExtra);
                    ioVarM747a.a("mat", Long.toString(System.currentTimeMillis()));
                    if (n(ixVar)) {
                        x9s.y("this is a mina's message, ack later");
                        ioVarM747a.a("__hybrid_message_ts", String.valueOf(ioVarM747a.m711a()));
                        ioVarM747a.a("__hybrid_device_status", String.valueOf((int) i.b(this.f13648a, ixVar)));
                    } else {
                        p(ixVar);
                    }
                }
                if (ixVar.a() == ibVar && !ixVar.m755b()) {
                    if (l.J(ixVar)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = ixVar.b();
                        objArr[1] = ioVarM747a != null ? ioVarM747a.m713a() : "";
                        x9s.o(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                        oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, String.format("13: %1$s", ixVar.b()));
                    } else {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = ixVar.b();
                        objArr2[1] = ioVarM747a != null ? ioVarM747a.m713a() : "";
                        x9s.o(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                        oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, String.format("14: %1$s", ixVar.b()));
                    }
                    qbt.c(this.f13648a, ixVar, booleanExtra);
                    return null;
                }
                if (ixVar.a() == ibVar && ixVar.m755b() && l.J(ixVar) && (!booleanExtra || ioVarM747a == null || ioVarM747a.m714a() == null || !ioVarM747a.m714a().containsKey("notify_effect"))) {
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = ixVar.b();
                    objArr3[1] = ioVarM747a != null ? ioVarM747a.m713a() : "";
                    x9s.o(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                    oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, String.format("25: %1$s", ixVar.b()));
                    qbt.e(this.f13648a, ixVar, booleanExtra);
                    return null;
                }
                if (basVarC.s() || ixVar.f245a == ib.Registration) {
                    if (!basVarC.s() || !basVarC.y()) {
                        return c(ixVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (ixVar.f245a != ib.UnRegistration) {
                        qbt.h(this.f13648a, ixVar, booleanExtra);
                        b.i0(this.f13648a);
                    } else if (ixVar.m755b()) {
                        basVarC.e();
                        b.l(this.f13648a);
                        PushMessageHandler.a();
                    } else {
                        x9s.D("receiving an un-encrypt unregistration message");
                    }
                } else {
                    if (l.J(ixVar)) {
                        return c(ixVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    qbt.h(this.f13648a, ixVar, booleanExtra);
                    boolean zU = basVarC.u();
                    x9s.D("receive message without registration. need re-register!registered?" + zU);
                    oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, "15");
                    if (zU) {
                        g();
                    }
                }
            } catch (jr e) {
                oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, "16");
                x9s.s(e);
            } catch (Exception e2) {
                oss.a(this.f13648a).e(this.f13648a.getPackageName(), intent, "17");
                x9s.s(e2);
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
                ix ixVar2 = new ix();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        i.d(ixVar2, byteArrayExtra2);
                    }
                } catch (jr unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(ixVar2.a()));
                miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                x9s.D("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
                return miPushCommandMessage;
            }
            if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    x9s.D("message arrived: receiving an empty message, drop");
                    return null;
                }
                ix ixVar3 = new ix();
                try {
                    i.d(ixVar3, byteArrayExtra3);
                    bas basVarC2 = bas.c(this.f13648a);
                    if (l.J(ixVar3)) {
                        x9s.D("message arrived: receive ignore reg message, ignore!");
                    } else if (!basVarC2.s()) {
                        x9s.D("message arrived: receive message without registration. need unregister or re-register!");
                    } else {
                        if (!basVarC2.s() || !basVarC2.y()) {
                            return d(ixVar3, byteArrayExtra3);
                        }
                        x9s.D("message arrived: app info is invalidated");
                    }
                } catch (Exception e3) {
                    x9s.D("fail to deal with arrived message. " + e3);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final PushMessageHandler.a c(ix ixVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        String strM705a;
        String str2;
        MiPushMessage miPushMessage;
        ArrayList arrayList = null;
        try {
            jm jmVarD = v4s.d(this.f13648a, ixVar);
            if (jmVarD == null) {
                x9s.D("receiving an un-recognized message. " + ixVar.f245a);
                oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, "18");
                qbt.f(this.f13648a, ixVar, z);
                return null;
            }
            ib ibVarA = ixVar.a();
            x9s.r("processing a message, action=", ibVarA, ", hasNotified=", Boolean.valueOf(z));
            switch (y5s.f39823a[ibVarA.ordinal()]) {
                case 1:
                    if (!ixVar.m755b()) {
                        x9s.D("receiving an un-encrypt message(SendMessage).");
                        return null;
                    }
                    if (bas.c(this.f13648a).w() && !z) {
                        x9s.o("receive a message in pause state. drop it");
                        oss.a(this.f13648a).h(this.f13648a.getPackageName(), mss.j(i), str, "12");
                        return null;
                    }
                    je jeVar = (je) jmVarD;
                    in inVarA = jeVar.a();
                    if (inVarA == null) {
                        x9s.D("receive an empty message without push content, drop it");
                        oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, "22");
                        qbt.g(this.f13648a, ixVar, z);
                        return null;
                    }
                    int intExtra = intent.getIntExtra("notification_click_button", 0);
                    if (z) {
                        if (l.J(ixVar)) {
                            b.T(this.f13648a, inVarA.m705a(), ixVar.m747a(), ixVar.f252b, inVarA.b());
                        } else {
                            io ioVar = ixVar.m747a() != null ? new io(ixVar.m747a()) : new io();
                            if (ioVar.m714a() == null) {
                                ioVar.a(new HashMap());
                            }
                            ioVar.m714a().put("notification_click_button", String.valueOf(intExtra));
                            b.V(this.f13648a, inVarA.m705a(), ioVar, inVarA.b());
                        }
                    }
                    if (!z) {
                        if (!TextUtils.isEmpty(jeVar.d()) && b.j(this.f13648a, jeVar.d()) < 0) {
                            b.f(this.f13648a, jeVar.d());
                        } else if (!TextUtils.isEmpty(jeVar.c()) && b.h0(this.f13648a, jeVar.c()) < 0) {
                            b.i(this.f13648a, jeVar.c());
                        }
                    }
                    io ioVar2 = ixVar.f246a;
                    if (ioVar2 == null || ioVar2.m714a() == null) {
                        strM705a = null;
                        str2 = null;
                    } else {
                        strM705a = ixVar.f246a.f160a.get("jobkey");
                        str2 = strM705a;
                    }
                    if (TextUtils.isEmpty(strM705a)) {
                        strM705a = inVarA.m705a();
                    }
                    if (z || !m(this.f13648a, strM705a)) {
                        MiPushMessage miPushMessageB = zei.b(jeVar, ixVar.m747a(), z);
                        if (miPushMessageB.getPassThrough() == 0 && !z && l.L(miPushMessageB.getExtra())) {
                            l.q(this.f13648a, ixVar, bArr);
                            return null;
                        }
                        String strU = l.u(miPushMessageB.getExtra(), intExtra);
                        x9s.r("receive a message, msgid=", inVarA.m705a(), ", jobkey=", strM705a, ", btn=", Integer.valueOf(intExtra), ", typeId=", strU, ", hasNotified=", Boolean.valueOf(z));
                        if (z && miPushMessageB.getExtra() != null && !TextUtils.isEmpty(strU)) {
                            Map<String, String> extra = miPushMessageB.getExtra();
                            if (intExtra != 0 && ixVar.m747a() != null) {
                                d6s.c(this.f13648a).o(ixVar.m747a().c(), intExtra);
                            }
                            if (l.J(ixVar)) {
                                Intent intentA = a(this.f13648a, ixVar.f252b, extra, intExtra);
                                intentA.putExtra("eventMessageType", i);
                                intentA.putExtra("messageId", str);
                                intentA.putExtra("jobkey", str2);
                                String strC = inVarA.c();
                                if (!TextUtils.isEmpty(strC)) {
                                    intentA.putExtra(TSMAuthContants.PARAM_PAYLOAD, strC);
                                }
                                this.f13648a.startActivity(intentA);
                                qbt.b(this.f13648a, ixVar);
                                oss.a(this.f13648a).g(this.f13648a.getPackageName(), mss.j(i), str, AuthApiStatusCodes.AUTH_APP_CERT_ERROR, strU);
                                x9s.p("PushMessageProcessor", "start business activity succ");
                            } else {
                                Context context = this.f13648a;
                                Intent intentA2 = a(context, context.getPackageName(), extra, intExtra);
                                if (intentA2 != null) {
                                    if (!strU.equals(ccs.c)) {
                                        intentA2.putExtra("key_message", miPushMessageB);
                                        intentA2.putExtra("eventMessageType", i);
                                        intentA2.putExtra("messageId", str);
                                        intentA2.putExtra("jobkey", str2);
                                    }
                                    this.f13648a.startActivity(intentA2);
                                    qbt.b(this.f13648a, ixVar);
                                    x9s.p("PushMessageProcessor", "start activity succ");
                                    oss.a(this.f13648a).g(this.f13648a.getPackageName(), mss.j(i), str, 1006, strU);
                                    if (strU.equals(ccs.c)) {
                                        oss.a(this.f13648a).h(this.f13648a.getPackageName(), mss.j(i), str, "13");
                                    }
                                } else {
                                    x9s.C("PushMessageProcessor", "missing target intent for message: " + inVarA.m705a() + ", typeId=" + strU);
                                }
                            }
                            x9s.p("PushMessageProcessor", "pre-def msg process done.");
                            return null;
                        }
                        miPushMessage = miPushMessageB;
                    } else {
                        x9s.o("drop a duplicate message, key=" + strM705a);
                        oss.a(this.f13648a).j(this.f13648a.getPackageName(), mss.j(i), str, "2:" + strM705a);
                        miPushMessage = null;
                    }
                    if (ixVar.m747a() == null && !z) {
                        k(jeVar, ixVar);
                    }
                    return miPushMessage;
                case 2:
                    jc jcVar = (jc) jmVarD;
                    String str3 = bas.c(this.f13648a).d;
                    if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3, jcVar.m777a())) {
                        x9s.o("bad Registration result:");
                        oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, "21");
                        return null;
                    }
                    long jB = d6s.c(this.f13648a).b();
                    if (jB > 0 && SystemClock.elapsedRealtime() - jB > 900000) {
                        x9s.o("The received registration result has expired.");
                        oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, "26");
                        return null;
                    }
                    bas.c(this.f13648a).d = null;
                    if (jcVar.f308a == 0) {
                        bas.c(this.f13648a).o(jcVar.f320e, jcVar.f321f, jcVar.f327l);
                        pl8.a(this.f13648a);
                        oss.a(this.f13648a).g(this.f13648a.getPackageName(), mss.j(i), str, 6006, "1");
                    } else {
                        oss.a(this.f13648a).g(this.f13648a.getPackageName(), mss.j(i), str, 6006, "2");
                    }
                    if (!TextUtils.isEmpty(jcVar.f320e)) {
                        arrayList = new ArrayList();
                        arrayList.add(jcVar.f320e);
                    }
                    MiPushCommandMessage miPushCommandMessageA = zei.a(fm.COMMAND_REGISTER.f62a, arrayList, jcVar.f308a, jcVar.f319d, null, jcVar.m778a());
                    d6s.c(this.f13648a).W();
                    return miPushCommandMessageA;
                case 3:
                    if (!ixVar.m755b()) {
                        x9s.D("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                    if (((ji) jmVarD).f386a == 0) {
                        bas.c(this.f13648a).e();
                        b.l(this.f13648a);
                    }
                    PushMessageHandler.a();
                    return null;
                case 4:
                    jg jgVar = (jg) jmVarD;
                    if (jgVar.f361a == 0) {
                        b.i(this.f13648a, jgVar.b());
                    }
                    if (!TextUtils.isEmpty(jgVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jgVar.b());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("resp-cmd:");
                    fm fmVar = fm.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(fmVar);
                    sb.append(", ");
                    sb.append(jgVar.a());
                    x9s.E(sb.toString());
                    return zei.a(fmVar.f62a, arrayList, jgVar.f361a, jgVar.f367d, jgVar.c(), null);
                case 5:
                    jk jkVar = (jk) jmVarD;
                    if (jkVar.f406a == 0) {
                        b.S(this.f13648a, jkVar.b());
                    }
                    if (!TextUtils.isEmpty(jkVar.b())) {
                        arrayList = new ArrayList();
                        arrayList.add(jkVar.b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    fm fmVar2 = fm.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(fmVar2);
                    sb2.append(", ");
                    sb2.append(jkVar.a());
                    x9s.E(sb2.toString());
                    return zei.a(fmVar2.f62a, arrayList, jkVar.f406a, jkVar.f412d, jkVar.c(), null);
                case 6:
                    sls.f(this.f13648a.getPackageName(), this.f13648a, jmVarD, ib.Command, bArr.length);
                    iw iwVar = (iw) jmVarD;
                    String strB = iwVar.b();
                    List<String> listM741a = iwVar.m741a();
                    if (iwVar.f233a == 0) {
                        if (TextUtils.equals(strB, fm.COMMAND_SET_ACCEPT_TIME.f62a) && listM741a != null && listM741a.size() > 1) {
                            b.d(this.f13648a, listM741a.get(0), listM741a.get(1));
                            if ("00:00".equals(listM741a.get(0)) && "00:00".equals(listM741a.get(1))) {
                                bas.c(this.f13648a).j(true);
                            } else {
                                bas.c(this.f13648a).j(false);
                            }
                            listM741a = f(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), listM741a);
                        } else if (TextUtils.equals(strB, fm.COMMAND_SET_ALIAS.f62a) && listM741a != null && listM741a.size() > 0) {
                            b.f(this.f13648a, listM741a.get(0));
                        } else if (TextUtils.equals(strB, fm.COMMAND_UNSET_ALIAS.f62a) && listM741a != null && listM741a.size() > 0) {
                            b.O(this.f13648a, listM741a.get(0));
                        } else if (TextUtils.equals(strB, fm.COMMAND_SET_ACCOUNT.f62a) && listM741a != null && listM741a.size() > 0) {
                            b.e(this.f13648a, listM741a.get(0));
                        } else if (TextUtils.equals(strB, fm.COMMAND_UNSET_ACCOUNT.f62a) && listM741a != null && listM741a.size() > 0) {
                            b.N(this.f13648a, listM741a.get(0));
                        } else if (TextUtils.equals(strB, fm.COMMAND_CHK_VDEVID.f62a)) {
                            return null;
                        }
                    }
                    List<String> list = listM741a;
                    x9s.E("resp-cmd:" + strB + ", " + iwVar.a());
                    return zei.a(strB, list, iwVar.f233a, iwVar.f241d, iwVar.c(), null);
                case 7:
                    sls.f(this.f13648a.getPackageName(), this.f13648a, jmVarD, ib.Notification, bArr.length);
                    if (jmVarD instanceof is) {
                        is isVar = (is) jmVarD;
                        String strA = isVar.a();
                        x9s.E("resp-type:" + isVar.b() + ", code:" + isVar.f203a + ", " + strA);
                        if (il.DisablePushMessage.f125a.equalsIgnoreCase(isVar.f210d)) {
                            if (isVar.f203a == 0) {
                                synchronized (l4s.class) {
                                    try {
                                        if (l4s.b(this.f13648a).f(strA)) {
                                            l4s.b(this.f13648a).h(strA);
                                            l4s l4sVarB = l4s.b(this.f13648a);
                                            aq aqVar = aq.DISABLE_PUSH;
                                            if ("syncing".equals(l4sVarB.c(aqVar))) {
                                                l4s.b(this.f13648a).d(aqVar, "synced");
                                                b.o(this.f13648a);
                                                b.n(this.f13648a);
                                                PushMessageHandler.a();
                                                d6s.c(this.f13648a).N();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } else if ("syncing".equals(l4s.b(this.f13648a).c(aq.DISABLE_PUSH))) {
                                synchronized (l4s.class) {
                                    try {
                                        if (l4s.b(this.f13648a).f(strA)) {
                                            if (l4s.b(this.f13648a).a(strA) < 10) {
                                                l4s.b(this.f13648a).g(strA);
                                                d6s.c(this.f13648a).I(true, strA);
                                            } else {
                                                l4s.b(this.f13648a).h(strA);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                l4s.b(this.f13648a).h(strA);
                            }
                            break;
                        } else if (il.EnablePushMessage.f125a.equalsIgnoreCase(isVar.f210d)) {
                            if (isVar.f203a == 0) {
                                synchronized (l4s.class) {
                                    try {
                                        if (l4s.b(this.f13648a).f(strA)) {
                                            l4s.b(this.f13648a).h(strA);
                                            l4s l4sVarB2 = l4s.b(this.f13648a);
                                            aq aqVar2 = aq.ENABLE_PUSH;
                                            if ("syncing".equals(l4sVarB2.c(aqVar2))) {
                                                l4s.b(this.f13648a).d(aqVar2, "synced");
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } else if ("syncing".equals(l4s.b(this.f13648a).c(aq.ENABLE_PUSH))) {
                                synchronized (l4s.class) {
                                    try {
                                        if (l4s.b(this.f13648a).f(strA)) {
                                            if (l4s.b(this.f13648a).a(strA) < 10) {
                                                l4s.b(this.f13648a).g(strA);
                                                d6s.c(this.f13648a).I(false, strA);
                                            } else {
                                                l4s.b(this.f13648a).h(strA);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            } else {
                                l4s.b(this.f13648a).h(strA);
                            }
                            break;
                        } else if (il.ThirdPartyRegUpdate.f125a.equalsIgnoreCase(isVar.f210d)) {
                            o(isVar);
                        } else if (il.UploadTinyData.f125a.equalsIgnoreCase(isVar.f210d)) {
                            h(isVar);
                        }
                    } else if (jmVarD instanceof ja) {
                        ja jaVar = (ja) jmVarD;
                        if ("registration id expired".equalsIgnoreCase(jaVar.f269d)) {
                            List<String> listU = b.u(this.f13648a);
                            List<String> listV = b.v(this.f13648a);
                            List<String> listW = b.w(this.f13648a);
                            String strT = b.t(this.f13648a);
                            x9s.E("resp-type:" + jaVar.f269d + ", " + jaVar.m762a());
                            b.H(this.f13648a, ip.RegIdExpired);
                            for (String str4 : listU) {
                                b.O(this.f13648a, str4);
                                b.Y(this.f13648a, str4, null);
                            }
                            for (String str5 : listV) {
                                b.S(this.f13648a, str5);
                                b.f0(this.f13648a, str5, null);
                            }
                            for (String str6 : listW) {
                                b.N(this.f13648a, str6);
                                b.b0(this.f13648a, str6, null);
                            }
                            String[] strArrSplit = strT.split(",");
                            if (strArrSplit.length == 2) {
                                b.M(this.f13648a);
                                b.d(this.f13648a, strArrSplit[0], strArrSplit[1]);
                            }
                        } else if (!il.ClientInfoUpdateOk.f125a.equalsIgnoreCase(jaVar.f269d)) {
                            try {
                                if (il.NormalClientConfigUpdate.f125a.equalsIgnoreCase(jaVar.f269d)) {
                                    iz izVar = new iz();
                                    i.d(izVar, jaVar.m768a());
                                    yas.d(vas.d(this.f13648a), izVar);
                                } else if (il.CustomClientConfigUpdate.f125a.equalsIgnoreCase(jaVar.f269d)) {
                                    iy iyVar = new iy();
                                    i.d(iyVar, jaVar.m768a());
                                    yas.c(vas.d(this.f13648a), iyVar);
                                } else if (il.SyncInfoResult.f125a.equalsIgnoreCase(jaVar.f269d)) {
                                    o7s.c(this.f13648a, jaVar);
                                } else if (il.ForceSync.f125a.equalsIgnoreCase(jaVar.f269d)) {
                                    x9s.o("receive force sync notification");
                                    o7s.d(this.f13648a, false);
                                } else if (il.CancelPushMessage.f125a.equals(jaVar.f269d)) {
                                    x9s.E("resp-type:" + jaVar.f269d + ", " + jaVar.m762a());
                                    if (jaVar.m763a() != null) {
                                        int i2 = -2;
                                        if (jaVar.m763a().containsKey(ccs.M)) {
                                            String str7 = jaVar.m763a().get(ccs.M);
                                            if (!TextUtils.isEmpty(str7)) {
                                                try {
                                                    i2 = Integer.parseInt(str7);
                                                } catch (NumberFormatException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                        if (i2 >= -1) {
                                            b.p(this.f13648a, i2);
                                        } else {
                                            b.q(this.f13648a, jaVar.m763a().containsKey(ccs.K) ? jaVar.m763a().get(ccs.K) : "", jaVar.m763a().containsKey(ccs.L) ? jaVar.m763a().get(ccs.L) : "");
                                        }
                                    }
                                    j(jaVar);
                                    break;
                                } else if (il.HybridRegisterResult.f125a.equals(jaVar.f269d)) {
                                    try {
                                        jc jcVar2 = new jc();
                                        i.d(jcVar2, jaVar.m768a());
                                        yvf.a(this.f13648a, jcVar2);
                                    } catch (jr e2) {
                                        x9s.s(e2);
                                    }
                                    break;
                                } else if (il.HybridUnregisterResult.f125a.equals(jaVar.f269d)) {
                                    try {
                                        ji jiVar = new ji();
                                        i.d(jiVar, jaVar.m768a());
                                        yvf.b(this.f13648a, jiVar);
                                    } catch (jr e3) {
                                        x9s.s(e3);
                                    }
                                    break;
                                } else if (!il.PushLogUpload.f125a.equals(jaVar.f269d)) {
                                    if (il.DetectAppAlive.f125a.equals(jaVar.f269d)) {
                                        x9s.y("receive detect msg");
                                        q(jaVar);
                                    } else if (b3t.b(jaVar)) {
                                        x9s.y("receive notification handle by cpra");
                                    }
                                }
                                break;
                            } catch (jr unused) {
                            }
                        } else if (jaVar.m763a() != null && jaVar.m763a().containsKey("app_version")) {
                            bas.c(this.f13648a).g(jaVar.m763a().get("app_version"));
                        }
                    }
                    return null;
                default:
                    return null;
            }
        } catch (q e4) {
            x9s.s(e4);
            i(ixVar);
            oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, "19");
            qbt.f(this.f13648a, ixVar, z);
            return null;
        } catch (jr e5) {
            x9s.s(e5);
            x9s.D("receive a message which action string is not valid. is the reg expired?");
            oss.a(this.f13648a).i(this.f13648a.getPackageName(), mss.j(i), str, UserConfig.KEY_CAMERA_LIST_SORT_ORDER);
            qbt.f(this.f13648a, ixVar, z);
            return null;
        }
    }

    public final PushMessageHandler.a d(ix ixVar, byte[] bArr) {
        String str = null;
        try {
            jm jmVarD = v4s.d(this.f13648a, ixVar);
            if (jmVarD == null) {
                x9s.D("message arrived: receiving an un-recognized message. " + ixVar.f245a);
                return null;
            }
            ib ibVarA = ixVar.a();
            x9s.o("message arrived: processing an arrived message, action=" + ibVarA);
            if (y5s.f39823a[ibVarA.ordinal()] != 1) {
                return null;
            }
            if (!ixVar.m755b()) {
                x9s.D("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            je jeVar = (je) jmVarD;
            in inVarA = jeVar.a();
            if (inVarA == null) {
                x9s.D("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            io ioVar = ixVar.f246a;
            if (ioVar != null && ioVar.m714a() != null) {
                str = ixVar.f246a.f160a.get("jobkey");
            }
            MiPushMessage miPushMessageB = zei.b(jeVar, ixVar.m747a(), false);
            miPushMessageB.setArrivedMessage(true);
            x9s.o("message arrived: receive a message, msgid=" + inVarA.m705a() + ", jobkey=" + str);
            return miPushMessageB;
        } catch (q e) {
            x9s.s(e);
            x9s.D("message arrived: receive a message but decrypt failed. report when click.");
            return null;
        } catch (jr e2) {
            x9s.s(e2);
            x9s.D("message arrived: receive a message which action string is not valid. is the reg expired?");
            return null;
        }
    }

    public List<String> f(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long j = Long.parseLong(list.get(0).split(":")[0]);
        long j2 = Long.parseLong(list.get(0).split(":")[1]);
        long j3 = Long.parseLong(list.get(1).split(":")[0]);
        long j4 = Long.parseLong(list.get(1).split(":")[1]);
        long j5 = ((((j * 60) + j2) - rawOffset) + DateTimeHelper.sDayInMinutes) % DateTimeHelper.sDayInMinutes;
        long j6 = ((((j3 * 60) + j4) - rawOffset) + DateTimeHelper.sDayInMinutes) % DateTimeHelper.sDayInMinutes;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j5 / 60), Long.valueOf(j5 % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j6 / 60), Long.valueOf(j6 % 60)));
        return arrayList;
    }

    public final void g() {
        SharedPreferences sharedPreferences = this.f13648a.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - sharedPreferences.getLong("last_reinitialize", 0L)) > SyncEngine.SYNC_WEATHER_DURATION) {
            b.H(this.f13648a, ip.PackageUnregistered);
            sharedPreferences.edit().putLong("last_reinitialize", jCurrentTimeMillis).commit();
        }
    }

    public final void h(is isVar) {
        String strA = isVar.a();
        x9s.y("receive ack " + strA);
        Map<String, String> mapM728a = isVar.m728a();
        if (mapM728a != null) {
            String str = mapM728a.get("real_source");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            x9s.y("receive ack : messageId = " + strA + "  realSource = " + str);
            yfs.b(this.f13648a).j(strA, str, Boolean.valueOf(isVar.f203a == 0));
        }
    }

    public final void i(ix ixVar) {
        x9s.o("receive a message but decrypt failed. report now.");
        ja jaVar = new ja(ixVar.m747a().f158a, false);
        jaVar.c(il.DecryptMessageFail.f125a);
        jaVar.b(ixVar.m748a());
        jaVar.d(ixVar.f252b);
        HashMap map = new HashMap();
        jaVar.f264a = map;
        map.put("regid", b.D(this.f13648a));
        d6s.c(this.f13648a).y(jaVar, ib.Notification, false, null);
    }

    public final void j(ja jaVar) {
        is isVar = new is();
        isVar.c(il.CancelPushMessageACK.f125a);
        isVar.a(jaVar.m762a());
        isVar.a(jaVar.a());
        isVar.b(jaVar.b());
        isVar.e(jaVar.d());
        isVar.a(0L);
        isVar.d("success clear push message.");
        d6s.c(this.f13648a).C(isVar, ib.Notification, false, true, null, false, this.f13648a.getPackageName(), bas.c(this.f13648a).d(), false);
    }

    public final void k(je jeVar, ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        if (ioVarM747a != null) {
            ioVarM747a = fds.a(ioVarM747a.m712a());
        }
        ir irVar = new ir();
        irVar.b(jeVar.b());
        irVar.a(jeVar.m786a());
        irVar.a(jeVar.a().a());
        if (!TextUtils.isEmpty(jeVar.c())) {
            irVar.c(jeVar.c());
        }
        if (!TextUtils.isEmpty(jeVar.d())) {
            irVar.d(jeVar.d());
        }
        irVar.a(i.b(this.f13648a, ixVar));
        d6s.c(this.f13648a).w(irVar, ib.AckMessage, ioVarM747a);
    }

    public final void l(String str, long j, d dVar) {
        aq aqVarA = z2t.a(dVar);
        if (aqVarA == null) {
            return;
        }
        if (j == 0) {
            synchronized (l4s.class) {
                try {
                    if (l4s.b(this.f13648a).f(str)) {
                        l4s.b(this.f13648a).h(str);
                        if ("syncing".equals(l4s.b(this.f13648a).c(aqVarA))) {
                            l4s.b(this.f13648a).d(aqVarA, "synced");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"syncing".equals(l4s.b(this.f13648a).c(aqVarA))) {
            l4s.b(this.f13648a).h(str);
            return;
        }
        synchronized (l4s.class) {
            try {
                if (l4s.b(this.f13648a).f(str)) {
                    if (l4s.b(this.f13648a).a(str) < 10) {
                        l4s.b(this.f13648a).g(str);
                        d6s.c(this.f13648a).E(str, aqVarA, dVar, com.xiaomi.onetrack.api.b.M);
                    } else {
                        l4s.b(this.f13648a).h(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n(ix ixVar) {
        Map<String, String> mapM714a = ixVar.m747a() == null ? null : ixVar.m747a().m714a();
        if (mapM714a == null) {
            return false;
        }
        String str = mapM714a.get("push_server_action");
        return TextUtils.equals(str, "hybrid_message") || TextUtils.equals(str, "platform_message");
    }

    public final void o(is isVar) {
        x9s.B("ASSEMBLE_PUSH : " + isVar.toString());
        String strA = isVar.a();
        Map<String, String> mapM728a = isVar.m728a();
        if (mapM728a != null) {
            String str = mapM728a.get("RegInfo");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("brand:" + ac.FCM.name())) {
                x9s.o("ASSEMBLE_PUSH : receive fcm token sync ack");
                Context context = this.f13648a;
                d dVar = d.ASSEMBLE_PUSH_FCM;
                gxs.m(context, dVar, str);
                l(strA, isVar.f203a, dVar);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("brand:");
            ac acVar = ac.HUAWEI;
            sb.append(acVar.name());
            if (!str.contains(sb.toString())) {
                if (!str.contains("channel:" + acVar.name())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("brand:");
                    ac acVar2 = ac.OPPO;
                    sb2.append(acVar2.name());
                    if (!str.contains(sb2.toString())) {
                        if (!str.contains("channel:" + acVar2.name())) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("brand:");
                            ac acVar3 = ac.VIVO;
                            sb3.append(acVar3.name());
                            if (!str.contains(sb3.toString())) {
                                if (!str.contains("channel:" + acVar3.name())) {
                                    return;
                                }
                            }
                            x9s.o("ASSEMBLE_PUSH : receive FTOS token sync ack");
                            Context context2 = this.f13648a;
                            d dVar2 = d.ASSEMBLE_PUSH_FTOS;
                            gxs.m(context2, dVar2, str);
                            l(strA, isVar.f203a, dVar2);
                            return;
                        }
                    }
                    x9s.o("ASSEMBLE_PUSH : receive COS token sync ack");
                    Context context3 = this.f13648a;
                    d dVar3 = d.ASSEMBLE_PUSH_COS;
                    gxs.m(context3, dVar3, str);
                    l(strA, isVar.f203a, dVar3);
                    return;
                }
            }
            x9s.o("ASSEMBLE_PUSH : receive hw token sync ack");
            Context context4 = this.f13648a;
            d dVar4 = d.ASSEMBLE_PUSH_HUAWEI;
            gxs.m(context4, dVar4, str);
            l(strA, isVar.f203a, dVar4);
        }
    }

    public final void p(ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        if (ioVarM747a != null) {
            ioVarM747a = fds.a(ioVarM747a.m712a());
        }
        ir irVar = new ir();
        irVar.b(ixVar.m748a());
        irVar.a(ioVarM747a.m713a());
        irVar.a(ioVarM747a.m711a());
        if (!TextUtils.isEmpty(ioVarM747a.m718b())) {
            irVar.c(ioVarM747a.m718b());
        }
        irVar.a(i.b(this.f13648a, ixVar));
        d6s.c(this.f13648a).y(irVar, ib.AckMessage, false, ioVarM747a);
    }

    public final void q(ja jaVar) {
        Map<String, String> mapM763a = jaVar.m763a();
        if (mapM763a == null) {
            x9s.o("detect failed because null");
            return;
        }
        String str = (String) s8s.g(mapM763a, "pkgList", null);
        if (TextUtils.isEmpty(str)) {
            x9s.o("detect failed because empty");
            return;
        }
        Map<String, String> mapI = com.xiaomi.push.g.i(this.f13648a, str);
        if (mapI == null) {
            x9s.o("detect failed because get status illegal");
            return;
        }
        String str2 = mapI.get("alive");
        String str3 = mapI.get("notAlive");
        if (TextUtils.isEmpty(str2)) {
            x9s.y("detect failed because no alive process");
            return;
        }
        ja jaVar2 = new ja();
        jaVar2.a(jaVar.m762a());
        jaVar2.b(jaVar.b());
        jaVar2.d(jaVar.d());
        jaVar2.c(il.DetectAppAliveResult.f125a);
        HashMap map = new HashMap();
        jaVar2.f264a = map;
        map.put("alive", str2);
        if (Boolean.parseBoolean((String) s8s.g(mapM763a, "reportNotAliveApp", "false")) && !TextUtils.isEmpty(str3)) {
            jaVar2.f264a.put("notAlive", str3);
        }
        d6s.c(this.f13648a).y(jaVar2, ib.Notification, false, null);
    }
}
