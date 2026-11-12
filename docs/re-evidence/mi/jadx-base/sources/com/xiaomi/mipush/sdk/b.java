package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.push.fm;
import com.xiaomi.push.ib;
import com.xiaomi.push.ig;
import com.xiaomi.push.il;
import com.xiaomi.push.io;
import com.xiaomi.push.ip;
import com.xiaomi.push.iv;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jf;
import com.xiaomi.push.jh;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import defpackage.a3t;
import defpackage.a5t;
import defpackage.bas;
import defpackage.c14;
import defpackage.cct;
import defpackage.d6s;
import defpackage.dct;
import defpackage.eos;
import defpackage.gbs;
import defpackage.gxs;
import defpackage.h3s;
import defpackage.i4s;
import defpackage.k3s;
import defpackage.k5s;
import defpackage.k8s;
import defpackage.kss;
import defpackage.l4s;
import defpackage.lb4;
import defpackage.lzs;
import defpackage.mps;
import defpackage.mss;
import defpackage.o7s;
import defpackage.obs;
import defpackage.odt;
import defpackage.pns;
import defpackage.qcs;
import defpackage.qqs;
import defpackage.rf4;
import defpackage.t8t;
import defpackage.uei;
import defpackage.uvf;
import defpackage.vas;
import defpackage.vvf;
import defpackage.wvf;
import defpackage.x9s;
import defpackage.xpe;
import defpackage.xvf;
import defpackage.y0t;
import defpackage.zei;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f13638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f13639b = System.currentTimeMillis();

    public interface a<R> {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b$b, reason: collision with other inner class name */
    @Deprecated
    public static abstract class AbstractC0828b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13640a;

        public String a() {
            return this.f13640a;
        }

        public void b(String str, long j, String str2, List<String> list) {
        }

        public void c(long j, String str, String str2) {
        }

        public void d(MiPushMessage miPushMessage) {
        }

        public void e(String str, String str2, String str3, boolean z) {
        }

        public void f(long j, String str, String str2) {
        }

        public void g(long j, String str, String str2) {
        }
    }

    public static boolean A(Context context) {
        k(context, "context");
        return pns.e(context).m(d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean B(Context context) {
        k(context, "context");
        return pns.e(context).m(d.ASSEMBLE_PUSH_COS);
    }

    public static boolean C(Context context) {
        return pns.e(context).m(d.ASSEMBLE_PUSH_FTOS);
    }

    public static String D(Context context) {
        if (bas.c(context).s()) {
            return bas.c(context).q();
        }
        return null;
    }

    public static void E(Context context) {
        mss.o(new wvf());
        lb4 lb4VarC = mss.c(context);
        h3s.e(context).o("5_7_8-C");
        c14.a(context, lb4VarC, new qqs(context), new kss(context));
        k3s.b(context);
        cct.a(context, lb4VarC);
        vas.d(context).j(new xvf(100, "perf event job update", context));
    }

    public static void F(Context context, String str, String str2, AbstractC0828b abstractC0828b, String str3, a aVar) {
        try {
            x9s.m(context.getApplicationContext());
            x9s.E("sdk_version = 5_7_8-C");
            k8s.a(context).c();
            eos.a(context);
            if (abstractC0828b != null) {
                PushMessageHandler.a(abstractC0828b);
            }
            if (aVar != null) {
                PushMessageHandler.a(aVar);
            }
            if (odt.g(f13638a)) {
                r.b(f13638a);
            }
            boolean z = bas.c(f13638a).a() != rf4.a();
            if (!z && !d0(f13638a)) {
                d6s.c(f13638a).m();
                x9s.o("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !bas.c(f13638a).l(str, str2) || bas.c(f13638a).y()) {
                String strA = qcs.a(6);
                bas.c(f13638a).e();
                bas.c(f13638a).f(rf4.a());
                bas.c(f13638a).i(str, str2, strA);
                c.a.b().h("com.xiaomi.xmpushsdk.tinydataPending.appId");
                l(f13638a);
                o(context);
                jb jbVar = new jb();
                jbVar.a(gbs.c());
                jbVar.b(str);
                jbVar.e(str2);
                jbVar.d(f13638a.getPackageName());
                jbVar.f(strA);
                Context context2 = f13638a;
                jbVar.c(com.xiaomi.push.g.h(context2, context2.getPackageName()));
                Context context3 = f13638a;
                jbVar.b(com.xiaomi.push.g.b(context3, context3.getPackageName()));
                jbVar.h("5_7_8-C");
                jbVar.a(50708);
                jbVar.a(ip.Init);
                if (!TextUtils.isEmpty(str3)) {
                    jbVar.g(str3);
                }
                if (!y0t.t()) {
                    String strW = lzs.w(f13638a);
                    if (!TextUtils.isEmpty(strW)) {
                        jbVar.i(qcs.b(strW) + "," + lzs.y(f13638a));
                    }
                }
                int iC = lzs.c();
                if (iC >= 0) {
                    jbVar.c(iC);
                }
                d6s.c(f13638a).u(jbVar, z);
                f13638a.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == zei.c(f13638a)) {
                    k(abstractC0828b, "callback");
                    abstractC0828b.c(0L, null, bas.c(f13638a).q());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bas.c(f13638a).q());
                    zei.f(f13638a, zei.a(fm.COMMAND_REGISTER.f62a, arrayList, 0L, null, null, null));
                }
                d6s.c(f13638a).m();
                if (bas.c(f13638a).k()) {
                    ja jaVar = new ja();
                    jaVar.b(bas.c(f13638a).d());
                    jaVar.c(il.ClientInfoUpdate.f125a);
                    jaVar.a(gbs.a());
                    HashMap map = new HashMap();
                    jaVar.f264a = map;
                    Context context4 = f13638a;
                    map.put("app_version", com.xiaomi.push.g.h(context4, context4.getPackageName()));
                    Map<String, String> map2 = jaVar.f264a;
                    Context context5 = f13638a;
                    map2.put("app_version_code", Integer.toString(com.xiaomi.push.g.b(context5, context5.getPackageName())));
                    jaVar.f264a.put("push_sdk_vn", "5_7_8-C");
                    jaVar.f264a.put("push_sdk_vc", Integer.toString(50708));
                    String strV = bas.c(f13638a).v();
                    if (!TextUtils.isEmpty(strV)) {
                        jaVar.f264a.put("deviceid", strV);
                    }
                    d6s.c(f13638a).y(jaVar, ib.Notification, false, null);
                    d6s.c(f13638a).r(f13638a);
                }
                if (!a3t.d(f13638a, "update_devId", false)) {
                    j0();
                    a3t.b(f13638a, "update_devId", true);
                }
                if (e0(f13638a) && c0(f13638a)) {
                    ja jaVar2 = new ja();
                    jaVar2.b(bas.c(f13638a).d());
                    jaVar2.c(il.PullOfflineMessage.f125a);
                    jaVar2.a(gbs.a());
                    jaVar2.a(false);
                    d6s.c(f13638a).z(jaVar2, ib.Notification, false, null, false);
                    g(f13638a);
                }
            }
            h(f13638a);
            X();
            W(f13638a);
            E(f13638a);
            o7s.b(f13638a);
            if (!f13638a.getPackageName().equals("com.xiaomi.xmsf")) {
                if (xpe.a() != null) {
                    xpe.b(f13638a, xpe.a());
                }
                x9s.h(2);
            }
            G(context);
        } catch (Throwable th) {
            x9s.s(th);
        }
    }

    public static void G(Context context) {
        if ("syncing".equals(l4s.b(f13638a).c(aq.DISABLE_PUSH))) {
            r(f13638a);
        }
        if ("syncing".equals(l4s.b(f13638a).c(aq.ENABLE_PUSH))) {
            s(f13638a);
        }
        l4s l4sVarB = l4s.b(f13638a);
        aq aqVar = aq.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(l4sVarB.c(aqVar))) {
            d6s.c(f13638a).E(null, aqVar, d.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(l4s.b(f13638a).c(aq.UPLOAD_FCM_TOKEN))) {
            g0(f13638a);
        }
        l4s l4sVarB2 = l4s.b(f13638a);
        aq aqVar2 = aq.UPLOAD_COS_TOKEN;
        if ("syncing".equals(l4sVarB2.c(aqVar2))) {
            d6s.c(f13638a).E(null, aqVar2, d.ASSEMBLE_PUSH_COS, "init");
        }
        l4s l4sVarB3 = l4s.b(f13638a);
        aq aqVar3 = aq.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(l4sVarB3.c(aqVar3))) {
            d6s.c(context).E(null, aqVar3, d.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void H(Context context, ip ipVar) {
        x9s.E("re-register reason: " + ipVar);
        String strA = qcs.a(6);
        String strD = bas.c(context).d();
        String strM = bas.c(context).m();
        bas.c(context).e();
        m(context);
        o(context);
        bas.c(context).f(rf4.a());
        bas.c(context).i(strD, strM, strA);
        jb jbVar = new jb();
        jbVar.a(gbs.c());
        jbVar.b(strD);
        jbVar.e(strM);
        jbVar.f(strA);
        jbVar.d(context.getPackageName());
        jbVar.c(com.xiaomi.push.g.h(context, context.getPackageName()));
        jbVar.b(com.xiaomi.push.g.b(context, context.getPackageName()));
        jbVar.h("5_7_8-C");
        jbVar.a(50708);
        jbVar.a(ipVar);
        int iC = lzs.c();
        if (iC >= 0) {
            jbVar.c(iC);
        }
        d6s.c(context).u(jbVar, false);
    }

    public static void I(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            a5t.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            x9s.o("dynamic register network status receiver failed:" + th);
        }
        obs.i(f13638a);
    }

    public static void J(Context context, String str, String str2) {
        K(context, str, str2, new uei());
    }

    public static void K(Context context, String str, String str2, uei ueiVar) {
        L(context, str, str2, ueiVar, null, null);
    }

    public static void L(Context context, String str, String str2, uei ueiVar, String str3, a aVar) {
        k(context, "context");
        k(str, "appID");
        k(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        f13638a = applicationContext;
        if (applicationContext == null) {
            f13638a = context;
        }
        Context context2 = f13638a;
        odt.e(context2);
        if (!NetworkStatusReceiver.a()) {
            I(f13638a);
        }
        pns.e(f13638a).g(ueiVar);
        k5s.a(context2).g(new com.xiaomi.mipush.sdk.a(str, str2, str3, aVar));
    }

    public static synchronized void M(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.remove("accept_time");
        dct.a(editorEdit);
    }

    public static synchronized void N(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
    }

    public static synchronized void O(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
    }

    public static synchronized void P(Context context) {
        Iterator<String> it = w(context).iterator();
        while (it.hasNext()) {
            N(context, it.next());
        }
    }

    public static synchronized void Q(Context context) {
        Iterator<String> it = u(context).iterator();
        while (it.hasNext()) {
            O(context, it.next());
        }
    }

    public static synchronized void R(Context context) {
        Iterator<String> it = v(context).iterator();
        while (it.hasNext()) {
            S(context, it.next());
        }
    }

    public static synchronized void S(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
    }

    public static void T(Context context, String str, io ioVar, String str2, String str3) {
        ja jaVar = new ja();
        if (TextUtils.isEmpty(str3)) {
            x9s.D("do not report clicked message");
            return;
        }
        jaVar.b(str3);
        jaVar.c("bar:click");
        jaVar.a(str);
        jaVar.a(false);
        d6s.c(context).B(jaVar, ib.Notification, false, true, ioVar, true, str2, str3);
    }

    public static void U(Context context, MiPushMessage miPushMessage) {
        io ioVar = new io();
        ioVar.a(miPushMessage.getMessageId());
        ioVar.b(miPushMessage.getTopic());
        ioVar.d(miPushMessage.getDescription());
        ioVar.c(miPushMessage.getTitle());
        ioVar.c(miPushMessage.getNotifyId());
        ioVar.a(miPushMessage.getNotifyType());
        ioVar.b(miPushMessage.getPassThrough());
        ioVar.a(miPushMessage.getExtra());
        V(context, miPushMessage.getMessageId(), ioVar, null);
    }

    public static void V(Context context, String str, io ioVar, String str2) {
        ja jaVar = new ja();
        if (!TextUtils.isEmpty(str2)) {
            jaVar.b(str2);
        } else {
            if (!bas.c(context).p()) {
                x9s.D("do not report clicked message");
                return;
            }
            jaVar.b(bas.c(context).d());
        }
        jaVar.c("bar:click");
        jaVar.a(str);
        jaVar.a(false);
        d6s.c(context).y(jaVar, ib.Notification, false, ioVar);
    }

    public static void W(Context context) {
        if (vas.d(f13638a).m(ig.DataCollectionSwitch.a(), y())) {
            mps.b().c(new t8t(context));
            k5s.a(f13638a).h(new uvf(), 10);
        }
    }

    public static void X() {
        k5s.a(f13638a).k(new i4s(f13638a), vas.d(f13638a).a(ig.OcVersionCheckFrequency.a(), RepositoryManager.GAP_A_DAY), 5);
    }

    public static void Y(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Z(context, fm.COMMAND_SET_ALIAS.f62a, str, str2);
    }

    public static void Z(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        fm fmVar = fm.COMMAND_SET_ALIAS;
        if (fmVar.f62a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - j(context, str2)) < 86400000) {
            if (1 == zei.c(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                zei.f(context, zei.a(fmVar.f62a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (fm.COMMAND_UNSET_ALIAS.f62a.equalsIgnoreCase(str) && j(context, str2) < 0) {
            x9s.o("Don't cancel alias for " + qcs.c(arrayList.toString(), 3) + " is unseted");
            return;
        }
        fm fmVar2 = fm.COMMAND_SET_ACCOUNT;
        if (fmVar2.f62a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - c(context, str2)) < 3600000) {
            if (1 == zei.c(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                zei.f(context, zei.a(fmVar2.f62a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!fm.COMMAND_UNSET_ACCOUNT.f62a.equalsIgnoreCase(str) || c(context, str2) >= 0) {
            a0(context, str, arrayList, str3);
            return;
        }
        x9s.o("Don't cancel account for " + qcs.c(arrayList.toString(), 3) + " is unseted");
    }

    public static void a0(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(bas.c(context).d())) {
            return;
        }
        iv ivVar = new iv();
        String strA = gbs.a();
        ivVar.a(strA);
        ivVar.b(bas.c(context).d());
        ivVar.c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            ivVar.m738a(it.next());
        }
        ivVar.e(str2);
        ivVar.d(context.getPackageName());
        x9s.E("cmd:" + str + ", " + strA);
        d6s.c(context).w(ivVar, ib.Command, null);
    }

    public static void b0(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Z(context, fm.COMMAND_SET_ACCOUNT.f62a, str, str2);
    }

    public static long c(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    public static boolean c0(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    public static synchronized void d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString("accept_time", str + "," + str2);
        dct.a(editorEdit);
    }

    public static boolean d0(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static synchronized void e(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
    }

    public static boolean e0(Context context) {
        return d6s.c(context).J();
    }

    public static synchronized void f(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
    }

    public static void f0(Context context, String str, String str2) {
        if (TextUtils.isEmpty(bas.c(context).d()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - h0(context, str)) <= 86400000) {
            if (1 == zei.c(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            zei.f(context, zei.a(fm.COMMAND_SUBSCRIBE_TOPIC.f62a, arrayList, 0L, null, null, null));
            return;
        }
        jf jfVar = new jf();
        String strA = gbs.a();
        jfVar.a(strA);
        jfVar.b(bas.c(context).d());
        jfVar.c(str);
        jfVar.d(context.getPackageName());
        jfVar.e(str2);
        x9s.E("cmd:" + fm.COMMAND_SUBSCRIBE_TOPIC + ", " + strA);
        d6s.c(context).w(jfVar, ib.Subscription, null);
    }

    public static void g(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_pull_notification", System.currentTimeMillis());
        dct.a(editorEdit);
    }

    public static void g0(Context context) {
        d6s.c(context).E(null, aq.UPLOAD_FCM_TOKEN, d.ASSEMBLE_PUSH_FCM, "");
    }

    public static void h(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putLong("last_reg_request", System.currentTimeMillis());
        dct.a(editorEdit);
    }

    public static long h0(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    public static synchronized void i(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
    }

    public static void i0(Context context) {
        gxs.n(context);
        vas.d(context).h();
        if (bas.c(context).p()) {
            jh jhVar = new jh();
            jhVar.a(gbs.a());
            jhVar.b(bas.c(context).d());
            jhVar.c(bas.c(context).q());
            jhVar.e(bas.c(context).m());
            jhVar.d(context.getPackageName());
            d6s.c(context).v(jhVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            bas.c(context).n();
            n(context);
            o(context);
            l(context);
        }
    }

    public static long j(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    public static void j0() {
        new Thread(new vvf()).start();
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    public static void l(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static void m(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = u(context).iterator();
        while (it.hasNext()) {
            editorEdit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = w(context).iterator();
        while (it2.hasNext()) {
            editorEdit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = v(context).iterator();
        while (it3.hasNext()) {
            editorEdit.remove("topic_" + it3.next());
        }
        editorEdit.remove("accept_time");
        editorEdit.commit();
    }

    public static void n(Context context) {
        d6s.c(context).b0();
    }

    public static void o(Context context) {
        d6s.c(context).n(-1);
    }

    public static void p(Context context, int i) {
        d6s.c(context).n(i);
    }

    public static void q(Context context, String str, String str2) {
        d6s.c(context).G(str, str2);
    }

    public static void r(Context context) {
        d6s.c(context).H(true);
    }

    public static void s(Context context) {
        d6s.c(context).H(false);
    }

    public static String t(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString("accept_time", "00:00-23:59");
    }

    public static List<String> u(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> v(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> w(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String x(Context context) {
        if (bas.c(context).s()) {
            return bas.c(context).x();
        }
        return null;
    }

    public static boolean y() {
        return y0t.p();
    }

    public static boolean z(Context context) {
        k(context, "context");
        return pns.e(context).m(d.ASSEMBLE_PUSH_FCM);
    }
}
