package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.ha;
import com.xiaomi.push.hi;
import com.xiaomi.push.ib;
import com.xiaomi.push.ig;
import com.xiaomi.push.ix;
import com.xiaomi.push.jb;
import com.xiaomi.push.jr;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.a5t;
import defpackage.c7t;
import defpackage.ccs;
import defpackage.cdt;
import defpackage.css;
import defpackage.cts;
import defpackage.czs;
import defpackage.dys;
import defpackage.eos;
import defpackage.f3s;
import defpackage.fcs;
import defpackage.fys;
import defpackage.ghs;
import defpackage.gv5;
import defpackage.gvs;
import defpackage.gws;
import defpackage.hht;
import defpackage.ifs;
import defpackage.iht;
import defpackage.jcs;
import defpackage.jws;
import defpackage.k5s;
import defpackage.khs;
import defpackage.lb4;
import defpackage.lzs;
import defpackage.mcs;
import defpackage.mss;
import defpackage.mvs;
import defpackage.ncs;
import defpackage.ngt;
import defpackage.nws;
import defpackage.o6s;
import defpackage.obs;
import defpackage.odt;
import defpackage.oss;
import defpackage.phs;
import defpackage.pws;
import defpackage.q7s;
import defpackage.qws;
import defpackage.rds;
import defpackage.sbt;
import defpackage.tos;
import defpackage.uhs;
import defpackage.v5s;
import defpackage.vas;
import defpackage.wjs;
import defpackage.x9s;
import defpackage.xbs;
import defpackage.xhs;
import defpackage.xys;
import defpackage.y0t;
import defpackage.yes;
import defpackage.yls;
import defpackage.z7s;
import defpackage.zks;
import defpackage.zvs;
import defpackage.zxl;
import defpackage.zys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class XMPushService extends Service implements nws {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f14170b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ContentObserver f420a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f422a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private f f423a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private k f424a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private r f425a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private t f426a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private i0 f427a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.s f430a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gws f431a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Object f433a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private jws f436a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private zvs f438a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f439a = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14171a = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f440b = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f419a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected Class f432a = XMJobService.class;
    private int c = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.n f429a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private k0 f428a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Messenger f421a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Collection<q7s> f435a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<n> f434a = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private pws f437a = new y(this);

    public class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public bg.b f14174b;

        public b(bg.b bVar) {
            super(9);
            this.f14174b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind the client. " + this.f14174b.h;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            try {
                if (XMPushService.this.m836c()) {
                    bg bgVarC = bg.c();
                    bg.b bVar = this.f14174b;
                    bg.b bVarB = bgVarC.b(bVar.h, bVar.f14197b);
                    if (bVarB == null) {
                        x9s.o("ignore bind because the channel " + this.f14174b.h + " is removed ");
                    } else if (bVarB.m == bg.c.unbind) {
                        bVarB.k(bg.c.binding, 0, 0, null, null);
                        XMPushService.this.f431a.i(bVarB);
                        gvs.f(XMPushService.this, bVarB);
                    } else {
                        x9s.o("trying duplicate bind, ingore! " + bVarB.m);
                    }
                } else {
                    x9s.D("trying bind while the connection is not created, quit!");
                }
            } catch (Exception e) {
                x9s.D("Meet error when trying to bind. " + e);
                XMPushService.this.a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bg.b f14175b;

        public c(bg.b bVar) {
            super(12);
            this.f14175b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind time out. chid=" + this.f14175b.h;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            this.f14175b.k(bg.c.unbind, 1, 21, null, null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).f14175b.h, this.f14175b.h);
            }
            return false;
        }

        public int hashCode() {
            return this.f14175b.h.hashCode();
        }
    }

    public class d extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public mvs f14176b;

        public d(mvs mvsVar) {
            super(8);
            this.f14176b = mvsVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.f429a.a(this.f14176b);
            if (css.a(this.f14176b)) {
                XMPushService.this.a(new com.xiaomi.push.service.t.a(), 15000L);
            }
        }
    }

    public class e extends j {
        public e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            if (XMPushService.this.m831a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            x9s.o("should not connect. quit the job.");
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            obs.r();
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14179b;
        public Exception c;

        public g(int i, Exception exc) {
            super(2);
            this.f14179b = i;
            this.c = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.a(this.f14179b, this.c);
        }
    }

    public class h extends j {
        public h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.c();
        }
    }

    public class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f14181b;

        public i(Intent intent) {
            super(15);
            this.f14181b = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Handle intent action = " + this.f14181b.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.d(this.f14181b);
        }
    }

    public static abstract class j extends k0.b {
        public j(int i) {
            super(i);
        }

        public abstract String a();

        public abstract void b();

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f14223a;
            if (i != 4 && i != 8) {
                x9s.p(f3s.f17374a, a());
            }
            b();
        }
    }

    public class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            x9s.o("[HB] hold short heartbeat, " + y0t.e(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.f428a.b();
        }
    }

    public class m extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public fys f14184b;

        public m(fys fysVar) {
            super(8);
            this.f14184b = fysVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.f429a.c(this.f14184b);
        }
    }

    public interface n {
        void a();
    }

    public class o extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14185b;

        public o(boolean z) {
            super(4);
            this.f14185b = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            if (XMPushService.this.m836c()) {
                try {
                    if (!this.f14185b) {
                        gvs.a();
                    }
                    XMPushService.this.f431a.A(this.f14185b);
                } catch (ha e) {
                    x9s.s(e);
                    XMPushService.this.a(10, e);
                }
            }
        }
    }

    public class p extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public bg.b f14186b;

        public p(bg.b bVar) {
            super(4);
            this.f14186b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "rebind the client. " + this.f14186b.h;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            try {
                this.f14186b.k(bg.c.unbind, 1, 16, null, null);
                gws gwsVar = XMPushService.this.f431a;
                bg.b bVar = this.f14186b;
                gwsVar.o(bVar.h, bVar.f14197b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(xMPushService.new b(this.f14186b), 300L);
            } catch (ha e) {
                x9s.s(e);
                XMPushService.this.a(10, e);
            }
        }
    }

    public class q extends j {
        public q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m831a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                }
            }
        }
    }

    public class r extends BroadcastReceiver {
        public r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class s extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public bg.b f14189b;
        public int c;
        public String d;
        public String e;

        public s(bg.b bVar, int i, String str, String str2) {
            super(9);
            this.f14189b = bVar;
            this.c = i;
            this.d = str;
            this.e = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "unbind the channel. " + this.f14189b.h;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public void b() {
            if (this.f14189b.m != bg.c.unbind && XMPushService.this.f431a != null) {
                try {
                    gws gwsVar = XMPushService.this.f431a;
                    bg.b bVar = this.f14189b;
                    gwsVar.o(bVar.h, bVar.f14197b);
                } catch (ha e) {
                    x9s.s(e);
                    XMPushService.this.a(10, e);
                }
            }
            this.f14189b.k(bg.c.unbind, this.c, 0, this.e, this.d);
        }
    }

    public class t extends BroadcastReceiver {
        public t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f439a) {
                XMPushService.this.f439a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    private void d() {
        xbs xbsVarE = obs.e();
        cdt.c(getApplicationContext()).f(xbsVarE);
        if (xbsVarE != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[type: " + xbsVarE.e() + "[" + xbsVarE.h() + "], state: " + xbsVarE.c() + "/" + xbsVarE.b());
            x9s.p("XMPushService", sb.toString());
            NetworkInfo.State stateC = xbsVarE.c();
            if (stateC == NetworkInfo.State.SUSPENDED || stateC == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            x9s.p("XMPushService", "network changed, no active network");
        }
        if (com.xiaomi.push.b.f() != null) {
            com.xiaomi.push.b.f().b();
        }
        xys.h(this);
        this.f438a.E();
        if (obs.v(this)) {
            if (m836c() && m823f()) {
                b(false);
            }
            if (!m836c() && !m837d()) {
                this.f428a.c(1);
                a(new e());
            }
            tos.b(this).d();
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m831a()) {
            cts.a();
        } else {
            if (cts.e()) {
                return;
            }
            cts.d(true);
        }
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private boolean m823f() {
        if (SystemClock.elapsedRealtime() - this.f419a < 30000) {
            return false;
        }
        return obs.x(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public boolean m824g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    private void h() {
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    private boolean m826i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && j() && !lzs.q(this) && !lzs.k(getApplicationContext());
    }

    private boolean j() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.f14171a;
        int i3 = this.f440b;
        if (i2 > i3) {
            if (iIntValue >= i2 || iIntValue < i3) {
                return true;
            }
        } else if (i2 < i3 && iIntValue >= i2 && iIntValue < i3) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return vas.d(this).m(ig.ForegroundServiceSwitch.a(), false);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f421a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        x9s.m(getApplicationContext());
        odt.e(this);
        n0 n0VarB = o0.b(this);
        if (n0VarB != null) {
            hht.b(n0VarB.g);
        }
        y yVar = null;
        if (y0t.j(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f422a = new a(this, yVar);
            a5t.d(this, this.f422a, new IntentFilter(ccs.o), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            f14170b = true;
            handler.post(new phs(this));
        }
        this.f421a = new Messenger(new uhs(this));
        fcs.d(this);
        xhs xhsVar = new xhs(this, null, 5222, "xiaomi.com", null);
        this.f436a = xhsVar;
        xhsVar.e(true);
        this.f438a = new zvs(this, this.f436a);
        this.f427a = m828a();
        cts.b(this);
        this.f438a.j(this);
        this.f429a = new com.xiaomi.push.service.n(this);
        this.f430a = new com.xiaomi.push.service.s(this);
        new c7t().b();
        com.xiaomi.push.b.e().j(this);
        this.f428a = new k0("Connection Controller Thread");
        bg bgVarC = bg.c();
        bgVarC.o();
        bgVarC.k(new c0(this));
        if (k()) {
            h();
        }
        czs.a(this).d(new l0(this), "UPLOADER_PUSH_CHANNEL");
        a(new zys(this));
        a(new x(this));
        if (y0t.j(this)) {
            a(new com.xiaomi.push.service.o());
            if (lzs.j()) {
                a(new d0(this));
            }
        }
        a(new h());
        this.f435a.add(v.c(this));
        if (m825h()) {
            this.f423a = new f();
            a5t.c(this, this.f423a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
            this.f433a = obs.i(this);
        }
        if (y0t.j(getApplicationContext())) {
            this.f426a = new t();
            a5t.d(this, this.f426a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            k kVar = new k();
            this.f424a = kVar;
            a5t.d(this, kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f420a = new e0(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f420a);
                } catch (Throwable th) {
                    x9s.D("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] iArrM820a = m820a();
            if (iArrM820a != null) {
                this.f425a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                a5t.c(this, this.f425a, intentFilter, null, null);
                this.f14171a = iArrM820a[0];
                this.f440b = iArrM820a[1];
                x9s.o("falldown initialized: " + this.f14171a + "," + this.f440b);
            }
        }
        zks.d(this, this.f438a);
        yls.b(this, this.f438a);
        String str = "";
        if (n0VarB != null) {
            try {
                if (!TextUtils.isEmpty(n0VarB.f14246a) && (strArrSplit = n0VarB.f14246a.split(gv5.CONNECT_VALUE_STR)) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        eos.a(this);
        x9s.E("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.g.b(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f423a;
        if (fVar != null) {
            a(fVar);
            this.f423a = null;
        }
        Object obj = this.f433a;
        if (obj != null) {
            obs.s(this, obj);
            this.f433a = null;
        }
        t tVar = this.f426a;
        if (tVar != null) {
            a(tVar);
            this.f426a = null;
        }
        k kVar = this.f424a;
        if (kVar != null) {
            a(kVar);
            this.f424a = null;
        }
        r rVar = this.f425a;
        if (rVar != null) {
            a(rVar);
            this.f425a = null;
        }
        a aVar = this.f422a;
        if (aVar != null) {
            a(aVar);
            this.f422a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f420a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f420a);
            } catch (Throwable th) {
                x9s.D("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f435a.clear();
        this.f428a.i();
        a(new b0(this, 2));
        a(new l());
        bg.c().o();
        bg.c().j(this, 15);
        bg.c().h();
        this.f438a.x(this);
        rds.c().i();
        cts.a();
        i();
        zks.i(this, this.f438a);
        yls.f(this, this.f438a);
        super.onDestroy();
        x9s.o("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            x9s.D("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(ccs.s);
                String stringExtra2 = intent.getStringExtra(ccs.B);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    x9s.p("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, y0t.e(intent)));
                } else {
                    x9s.p("XMPushService", String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3));
                }
            } catch (Throwable th) {
                x9s.D("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f428a.g()) {
                    x9s.D("ERROR, the job controller is blocked.");
                    bg.c().j(this, 14);
                    stopSelf();
                } else {
                    a(new i(intent));
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                a(new i(intent));
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            x9s.B("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f14172a;

        public a() {
            this.f14172a = new Object();
        }

        public final void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                x9s.D("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f14172a) {
                try {
                    this.f14172a.notifyAll();
                } catch (Exception e) {
                    x9s.o("[Alarm] notify lock. " + e);
                }
            }
        }

        public final void b(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                x9s.D("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f14172a) {
                try {
                    this.f14172a.wait(j);
                } catch (InterruptedException e) {
                    x9s.o("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            x9s.B("[Alarm] heartbeat alarm has been triggered.");
            if (!ccs.o.equals(intent.getAction())) {
                x9s.o("[Alarm] cancel the old ping timer");
                cts.a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                x9s.B("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    zxl.h(context).i(intent2);
                    b(3000L);
                    x9s.o("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ a(XMPushService xMPushService, y yVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d4 A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #0 {Exception -> 0x00da, blocks: (B:26:0x00ce, B:28:0x00d4), top: B:36:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public void c() {
        String str;
        wjs.c().z();
        cdt.c(getApplicationContext()).d();
        yes yesVarA = yes.a(getApplicationContext());
        String strB = yesVarA.b();
        x9s.p("XMPushService", "region of cache is " + strB);
        String strName = "";
        if (TextUtils.isEmpty(strB)) {
            String strB2 = b();
            str = strB2;
            strB = y0t.c(strB2).name();
        } else {
            str = "";
        }
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        String str2 = ServerConstants.NEW_CN_COUNTRY_CODE;
        try {
            if (zIsEmpty || !com.xiaomi.push.m.China.name().equals(strB)) {
                if (TextUtils.isEmpty(strB)) {
                    strB = com.xiaomi.push.m.China.name();
                } else {
                    if ("com.xiaomi.xmsf".equals(getPackageName())) {
                        str2 = "";
                    } else {
                        strName = com.xiaomi.push.m.China.name();
                    }
                    yesVarA.e(strName, true);
                    yesVarA.g(str2, true);
                    strB = strName;
                }
                x9s.r("XMPushService", "after check, appRegion is ", strB, ", countryCode=", str);
                if (com.xiaomi.push.m.China.name().equals(strB)) {
                    jws.c("cn.app.chat.xiaomi.net");
                }
                a(strB);
                if (m825h()) {
                    x9s.p("XMPushService", "-->postOnCreate(): try trigger connect now");
                    f0 f0Var = new f0(this, 11);
                    a(f0Var);
                    o0.j(new g0(this, f0Var));
                }
                if (odt.f()) {
                    this.f427a.d(this);
                }
                if ("com.xiaomi.xmsf".equals(getPackageName())) {
                    com.xiaomi.push.g.j(this, getApplicationInfo(), true);
                }
            }
            yesVarA.e(strB, true);
            yesVarA.g(ServerConstants.NEW_CN_COUNTRY_CODE, true);
            if (odt.f()) {
                this.f427a.d(this);
            }
        } catch (Exception e2) {
            x9s.s(e2);
        }
        str = str2;
        x9s.r("XMPushService", "after check, appRegion is ", strB, ", countryCode=", str);
        if (com.xiaomi.push.m.China.name().equals(strB)) {
            jws.c("cn.app.chat.xiaomi.net");
        }
        a(strB);
        if (m825h()) {
            x9s.p("XMPushService", "-->postOnCreate(): try trigger connect now");
            f0 f0Var2 = new f0(this, 11);
            a(f0Var2);
            o0.j(new g0(this, f0Var2));
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            com.xiaomi.push.g.j(this, getApplicationInfo(), true);
        }
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    private boolean m825h() {
        boolean zEquals;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            x9s.o("current sdk expect region is cn");
            zEquals = com.xiaomi.push.m.China.name().equals(yes.a(getApplicationContext()).b());
        } else {
            zEquals = !ngt.a(this).e(packageName);
        }
        boolean z = zEquals;
        if (!z) {
            x9s.r("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", yes.a(getApplicationContext()).b());
        }
        return z;
    }

    private String b() {
        String strA;
        o6s.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            jcs jcsVarC = jcs.c(this);
            String strA2 = null;
            while (true) {
                if (!TextUtils.isEmpty(strA2) && jcsVarC.a() != 0) {
                    strA = a();
                    break;
                }
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i2 < 30) {
                            try {
                                obj.wait(1000L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i2++;
            }
        } else {
            strA = ServerConstants.NEW_CN_COUNTRY_CODE;
        }
        x9s.o("wait coutrycode :" + strA + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " , count = " + i2);
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        gws gwsVar = this.f431a;
        if (gwsVar != null && gwsVar.B()) {
            x9s.D("try to connect while connecting.");
            return;
        }
        gws gwsVar2 = this.f431a;
        if (gwsVar2 != null && gwsVar2.D()) {
            x9s.D("try to connect while is connected.");
            return;
        }
        this.f436a.i(obs.j(this));
        g();
        if (this.f431a == null) {
            bg.c().i(this);
            c(false);
        }
    }

    private void g() {
        try {
            this.f438a.l(this.f437a, new ghs(this));
            this.f438a.R();
            this.f431a = this.f438a;
        } catch (ha e2) {
            x9s.q("fail to create Slim connection", e2);
            this.f438a.v(3, e2);
        }
    }

    private void i() {
        synchronized (this.f434a) {
            this.f434a.clear();
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static boolean m822e() {
        return f14170b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int m827a() {
        if (this.c < 0) {
            this.c = com.xiaomi.push.g.b(this, "com.xiaomi.xmsf");
        }
        return this.c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int[] m820a() {
        String[] strArrSplit;
        String strF = vas.d(getApplicationContext()).f(ig.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(strF) && (strArrSplit = strF.split(",")) != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(strArrSplit[0]).intValue();
                int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
                iArr[1] = iIntValue;
                int i2 = iArr[0];
                if (i2 >= 0 && i2 <= 23 && iIntValue >= 0 && iIntValue <= 23 && i2 != iIntValue) {
                    return iArr;
                }
            } catch (NumberFormatException e2) {
                x9s.D("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    private void b(boolean z) {
        this.f419a = SystemClock.elapsedRealtime();
        if (!m836c()) {
            a(true);
        } else if (obs.v(this)) {
            c(new o(z));
        } else {
            c(new g(17, null));
            a(true);
        }
    }

    private String a() {
        String strG = y0t.g("ro.miui.region");
        return TextUtils.isEmpty(strG) ? y0t.g("ro.product.locale.region") : strG;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b8  */
    private void b(Intent intent) {
        long j2;
        mvs mvsVarC;
        String stringExtra = intent.getStringExtra(ccs.B);
        String stringExtra2 = intent.getStringExtra(ccs.F);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        bg bgVarC = bg.c();
        if (bundleExtra != null) {
            dys dysVar = (dys) a(new dys(bundleExtra), stringExtra, stringExtra2);
            if (dysVar == null) {
                return;
            } else {
                mvsVarC = mvs.c(dysVar, bgVarC.b(dysVar.m(), dysVar.q()).i);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(ccs.p));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(ccs.q);
                String stringExtra4 = intent.getStringExtra(ccs.f5199r);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                bg.b bVarB = bgVarC.b(stringExtra5, String.valueOf(j2));
                if (bVarB != null) {
                    mvs mvsVar = new mvs();
                    try {
                        mvsVar.h(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    mvsVar.l("SECMSG", null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    mvsVar.j(j2, stringExtra3, stringExtra4);
                    mvsVar.k(intent.getStringExtra("ext_pkt_id"));
                    mvsVar.n(byteArrayExtra, bVarB.i);
                    x9s.o("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    mvsVarC = mvsVar;
                } else {
                    mvsVarC = null;
                }
            } else {
                mvsVarC = null;
            }
        }
        if (mvsVarC != null) {
            c(new u(this, mvsVarC));
        }
    }

    private static void a(String str) {
        if (com.xiaomi.push.m.China.name().equals(str)) {
            wjs.n("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            wjs.n("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            wjs.n("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            wjs.n("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            wjs.n("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            wjs.n("resolver.msg.xiaomi.net", "111.13.142.153:443");
            wjs.n("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        int i2;
        String strD;
        int intExtra;
        SharedPreferences sharedPreferences;
        bg bgVarC = bg.c();
        boolean z = true;
        if (!ccs.d.equalsIgnoreCase(intent.getAction()) && !ccs.j.equalsIgnoreCase(intent.getAction())) {
            if (ccs.i.equalsIgnoreCase(intent.getAction())) {
                String stringExtra = intent.getStringExtra(ccs.B);
                String stringExtra2 = intent.getStringExtra(ccs.s);
                String stringExtra3 = intent.getStringExtra(ccs.p);
                x9s.o("Service called close channel chid = " + stringExtra2 + " res = " + bg.b.e(stringExtra3));
                if (TextUtils.isEmpty(stringExtra2)) {
                    Iterator<String> it = bgVarC.g(stringExtra).iterator();
                    while (it.hasNext()) {
                        a(it.next(), 2);
                    }
                    return;
                } else if (TextUtils.isEmpty(stringExtra3)) {
                    a(stringExtra2, 2);
                    return;
                } else {
                    a(stringExtra2, stringExtra3, 2, null, null);
                    return;
                }
            }
            if (ccs.e.equalsIgnoreCase(intent.getAction())) {
                b(intent);
                return;
            }
            if (ccs.g.equalsIgnoreCase(intent.getAction())) {
                c(intent);
                return;
            }
            if (ccs.f.equalsIgnoreCase(intent.getAction())) {
                fys fysVarA = a(new com.xiaomi.push.e(intent.getBundleExtra("ext_packet")), intent.getStringExtra(ccs.B), intent.getStringExtra(ccs.F));
                if (fysVarA != null) {
                    c(new u(this, mvs.c(fysVarA, bgVarC.b(fysVarA.m(), fysVarA.q()).i)));
                    return;
                }
                return;
            }
            if (ccs.h.equalsIgnoreCase(intent.getAction())) {
                fys fysVarA2 = a(new hi(intent.getBundleExtra("ext_packet")), intent.getStringExtra(ccs.B), intent.getStringExtra(ccs.F));
                if (fysVarA2 != null) {
                    c(new u(this, mvs.c(fysVarA2, bgVarC.b(fysVarA2.m(), fysVarA2.q()).i)));
                    return;
                }
                return;
            }
            if (ccs.f5198k.equals(intent.getAction())) {
                String stringExtra4 = intent.getStringExtra(ccs.s);
                String stringExtra5 = intent.getStringExtra(ccs.p);
                if (stringExtra4 != null) {
                    x9s.o("request reset connection from chid = " + stringExtra4);
                    bg.b bVarB = bg.c().b(stringExtra4, stringExtra5);
                    if (bVarB != null && bVarB.i.equals(intent.getStringExtra(ccs.x)) && bVarB.m == bg.c.binded) {
                        gws gwsVarM829a = m829a();
                        if (gwsVarM829a == null || !gwsVarM829a.r(SystemClock.elapsedRealtime() - 15000)) {
                            c(new q());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            String string = null;
            string = null;
            bVarB = null;
            bg.b bVarB2 = null;
            boolean z2 = false;
            if (ccs.l.equals(intent.getAction())) {
                String stringExtra6 = intent.getStringExtra(ccs.B);
                List<String> listG = bgVarC.g(stringExtra6);
                if (listG.isEmpty()) {
                    x9s.o("open channel should be called first before update info, pkg=" + stringExtra6);
                    return;
                }
                String stringExtra7 = intent.getStringExtra(ccs.s);
                String stringExtra8 = intent.getStringExtra(ccs.p);
                if (TextUtils.isEmpty(stringExtra7)) {
                    stringExtra7 = listG.get(0);
                }
                if (TextUtils.isEmpty(stringExtra8)) {
                    Collection<bg.b> collectionF = bgVarC.f(stringExtra7);
                    if (collectionF != null && !collectionF.isEmpty()) {
                        bVarB2 = collectionF.iterator().next();
                    }
                } else {
                    bVarB2 = bgVarC.b(stringExtra7, stringExtra8);
                }
                if (bVarB2 != null) {
                    if (intent.hasExtra(ccs.z)) {
                        bVarB2.f = intent.getStringExtra(ccs.z);
                    }
                    if (intent.hasExtra(ccs.A)) {
                        bVarB2.g = intent.getStringExtra(ccs.A);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) && !"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
                    if (jcs.c(getApplicationContext()).d() && jcs.c(getApplicationContext()).a() == 0) {
                        x9s.o("register without being provisioned. " + intent.getStringExtra("mipush_app_package"));
                        return;
                    }
                    byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
                    String stringExtra9 = intent.getStringExtra("mipush_app_package");
                    boolean booleanExtra = intent.getBooleanExtra("mipush_env_chanage", false);
                    int intExtra2 = intent.getIntExtra("mipush_env_type", 1);
                    ngt.a(this).h(stringExtra9);
                    if (booleanExtra && !"com.xiaomi.xmsf".equals(getPackageName())) {
                        c(new z(this, 14, intExtra2, stringExtra9, byteArrayExtra));
                        return;
                    } else {
                        a(byteArrayExtra, stringExtra9);
                        return;
                    }
                }
                if (!"com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) && !"com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                    if (ncs.f27797a.equals(intent.getAction())) {
                        String stringExtra10 = intent.getStringExtra("uninstall_pkg_name");
                        if (stringExtra10 == null || TextUtils.isEmpty(stringExtra10.trim())) {
                            return;
                        }
                        try {
                            PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra10, 0);
                            if (packageInfo == null || packageInfo.applicationInfo == null || !lzs.l(this, packageInfo.packageName)) {
                                z = false;
                            } else {
                                x9s.o("dual space's app uninstalled " + stringExtra10);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if ("com.xiaomi.channel".equals(stringExtra10) && !bg.c().f("1").isEmpty() && z) {
                            a("1", 0);
                            x9s.o("close the miliao channel as the app is uninstalled.");
                            return;
                        }
                        SharedPreferences sharedPreferences2 = getSharedPreferences("pref_registered_pkg_names", 0);
                        String string2 = sharedPreferences2.getString(stringExtra10, null);
                        if (TextUtils.isEmpty(string2) || !z) {
                            return;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                        editorEdit.remove(stringExtra10);
                        editorEdit.commit();
                        if (com.xiaomi.push.service.l.T(this, stringExtra10)) {
                            com.xiaomi.push.service.l.W(this, stringExtra10);
                        }
                        com.xiaomi.push.service.l.x(this, stringExtra10);
                        z7s.f(getApplicationContext(), stringExtra10);
                        if (!m836c() || string2 == null) {
                            return;
                        }
                        try {
                            com.xiaomi.push.service.i.i(this, com.xiaomi.push.service.i.a(stringExtra10, string2));
                            x9s.o("uninstall " + stringExtra10 + " msg sent");
                            return;
                        } catch (ha e2) {
                            x9s.D("Fail to send Message: " + e2.getMessage());
                            a(10, e2);
                            return;
                        }
                    }
                    if (ncs.f27798b.equals(intent.getAction())) {
                        String stringExtra11 = intent.getStringExtra("data_cleared_pkg_name");
                        if (TextUtils.isEmpty(stringExtra11)) {
                            return;
                        }
                        try {
                            sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                            if (sharedPreferences != null) {
                                try {
                                    string = sharedPreferences.getString(stringExtra11, null);
                                } catch (Throwable th) {
                                    th = th;
                                    x9s.o("Fail to get sp or appId : " + th);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sharedPreferences = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            editorEdit2.remove(stringExtra11);
                            editorEdit2.commit();
                            if (com.xiaomi.push.service.l.T(this, stringExtra11)) {
                                com.xiaomi.push.service.l.W(this, stringExtra11);
                            }
                            com.xiaomi.push.service.l.x(this, stringExtra11);
                            a(stringExtra11, com.xiaomi.push.i.e(com.xiaomi.push.service.i.m(stringExtra11, string)), true);
                        }
                        z7s.f(this, stringExtra11);
                        if (y0t.j(getApplicationContext())) {
                            v5s.e(stringExtra11);
                            return;
                        }
                        return;
                    }
                    if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
                        String stringExtra12 = intent.getStringExtra(ccs.B);
                        int intExtra3 = intent.getIntExtra(ccs.C, -2);
                        if (TextUtils.isEmpty(stringExtra12)) {
                            return;
                        }
                        if (intExtra3 >= -1) {
                            com.xiaomi.push.service.l.z(this, stringExtra12, intExtra3, intent.getIntExtra(ccs.D, -1));
                            return;
                        } else {
                            com.xiaomi.push.service.l.B(this, stringExtra12, intent.getStringExtra(ccs.H), intent.getStringExtra(ccs.I));
                            return;
                        }
                    }
                    if ("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION".equals(intent.getAction())) {
                        String stringExtra13 = intent.getStringExtra(ccs.B);
                        if (TextUtils.isEmpty(stringExtra13)) {
                            return;
                        }
                        com.xiaomi.push.service.l.Q(this, stringExtra13);
                        return;
                    }
                    if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
                        String stringExtra14 = intent.getStringExtra(ccs.B);
                        String stringExtra15 = intent.getStringExtra(ccs.G);
                        if (intent.hasExtra(ccs.E)) {
                            intExtra = intent.getIntExtra(ccs.E, 0);
                            strD = mcs.d(stringExtra14 + intExtra);
                        } else {
                            strD = mcs.d(stringExtra14);
                            intExtra = 0;
                            z2 = true;
                        }
                        if (TextUtils.isEmpty(stringExtra14) || !TextUtils.equals(stringExtra15, strD)) {
                            x9s.D("invalid notification for " + stringExtra14);
                            return;
                        }
                        if (z2) {
                            com.xiaomi.push.service.l.W(this, stringExtra14);
                            return;
                        } else {
                            com.xiaomi.push.service.l.R(this, stringExtra14, intExtra);
                            return;
                        }
                    }
                    if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
                        String stringExtra16 = intent.getStringExtra("mipush_app_package");
                        if (!TextUtils.isEmpty(stringExtra16)) {
                            ngt.a(this).d(stringExtra16);
                        }
                        if ("com.xiaomi.xmsf".equals(getPackageName())) {
                            return;
                        }
                        a(19, (Exception) null);
                        e();
                        stopSelf();
                        return;
                    }
                    if (!"com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) && !"com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                            String stringExtra17 = intent.getStringExtra("mipush_app_package");
                            byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                            Cif cif = new Cif();
                            try {
                                com.xiaomi.push.i.d(cif, byteArrayExtra2);
                                czs.a(this).e(cif, stringExtra17);
                                return;
                            } catch (jr e3) {
                                x9s.s(e3);
                                return;
                            }
                        }
                        if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
                            x9s.o("[Alarm] Service called on timer");
                            if (m826i()) {
                                if (cts.e()) {
                                    x9s.o("enter falldown mode, stop alarm");
                                    cts.a();
                                }
                            } else {
                                cts.d(false);
                                if (m823f()) {
                                    b(false);
                                }
                            }
                            a aVar = this.f422a;
                            if (aVar != null) {
                                aVar.a();
                                return;
                            }
                            return;
                        }
                        if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                            x9s.o("Service called on check alive.");
                            if (m823f()) {
                                b(false);
                                return;
                            }
                            return;
                        }
                        if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
                            x9s.o("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
                            cts.c(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
                            return;
                        }
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            d();
                            return;
                        }
                        if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                            a(intent);
                            return;
                        }
                        if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
                            if (intent.getExtras() == null || (i2 = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i2 > 604800) {
                                return;
                            }
                            cdt.c(getApplicationContext()).e(i2);
                            return;
                        }
                        if ("action_cr_config".equals(intent.getAction())) {
                            boolean booleanExtra2 = intent.getBooleanExtra("action_cr_event_switch", false);
                            long longExtra = intent.getLongExtra("action_cr_event_frequency", 86400L);
                            boolean booleanExtra3 = intent.getBooleanExtra("action_cr_perf_switch", false);
                            long longExtra2 = intent.getLongExtra("action_cr_perf_frequency", 86400L);
                            boolean booleanExtra4 = intent.getBooleanExtra("action_cr_event_en", true);
                            long longExtra3 = intent.getLongExtra("action_cr_max_file_size", PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                            lb4 lb4VarH = lb4.b().l(booleanExtra2).k(longExtra).o(booleanExtra3).n(longExtra2).i(ifs.b(getApplicationContext())).j(booleanExtra4).m(longExtra3).h(getApplicationContext());
                            if ("com.xiaomi.xmsf".equals(getPackageName()) || longExtra <= 0 || longExtra2 <= 0 || longExtra3 <= 0) {
                                return;
                            }
                            mss.l(getApplicationContext(), lb4VarH);
                            return;
                        }
                        if (ccs.m.equals(intent.getAction())) {
                            j0.b(getApplicationContext(), intent);
                            return;
                        } else {
                            if (ccs.n.equals(intent.getAction())) {
                                String stringExtra18 = intent.getStringExtra("ext_downward_pkt_id");
                                if (TextUtils.isEmpty(stringExtra18)) {
                                    return;
                                }
                                com.xiaomi.push.service.t.a().f(stringExtra18, intent.getLongExtra("ext_app_receive_time", 0L));
                                return;
                            }
                            return;
                        }
                    }
                    String stringExtra19 = intent.getStringExtra("mipush_app_package");
                    byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                    String stringExtra20 = intent.getStringExtra("mipush_app_id");
                    String stringExtra21 = intent.getStringExtra("mipush_app_token");
                    if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        ngt.a(this).f(stringExtra19);
                    }
                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        ngt.a(this).i(stringExtra19);
                        ngt.a(this).j(stringExtra19);
                    }
                    if (byteArrayExtra3 == null) {
                        iht.b(this, stringExtra19, byteArrayExtra3, 70000003, "null payload");
                        return;
                    }
                    iht.f(stringExtra19, byteArrayExtra3);
                    a(new p0(this, stringExtra19, stringExtra20, stringExtra21, byteArrayExtra3));
                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                        if (this.f423a == null) {
                            this.f423a = new f();
                            a5t.c(this, this.f423a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, null);
                        }
                        if (this.f433a == null) {
                            this.f433a = obs.i(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra22 = intent.getStringExtra("mipush_app_package");
                byte[] byteArrayExtra4 = intent.getByteArrayExtra("mipush_payload");
                boolean booleanExtra5 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                if (sbt.b(byteArrayExtra4, stringExtra22)) {
                    x9s.o("duplicate msg from: " + String.valueOf(stringExtra22));
                    return;
                }
                if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                    ngt.a(this).b(stringExtra22);
                    if (y0t.j(getApplicationContext())) {
                        v5s.e(stringExtra22);
                    }
                }
                a(stringExtra22, byteArrayExtra4, booleanExtra5);
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                if (m826i()) {
                    return;
                }
                x9s.o("exit falldown mode, activate alarm.");
                e();
                if (m836c() || m837d()) {
                    return;
                }
                a(true);
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && m826i() && cts.e()) {
                x9s.o("enter falldown mode, stop alarm.");
                cts.a();
                return;
            }
            return;
        }
        String stringExtra23 = intent.getStringExtra(ccs.s);
        if (TextUtils.isEmpty(intent.getStringExtra(ccs.x))) {
            x9s.o("security is empty. ignore.");
            return;
        }
        if (!TextUtils.isEmpty(stringExtra23)) {
            boolean zM819a = m819a(stringExtra23, intent);
            bg.b bVarA = a(stringExtra23, intent);
            if (!obs.w(this)) {
                this.f427a.h(this, bVarA, false, 2, null);
                return;
            }
            if (m836c()) {
                bg.c cVar = bVarA.m;
                if (cVar == bg.c.unbind) {
                    c(new b(bVarA));
                    return;
                }
                if (zM819a) {
                    c(new p(bVarA));
                    return;
                } else if (cVar == bg.c.binding) {
                    x9s.o(String.format("the client is binding. %1$s %2$s.", bVarA.h, bg.b.e(bVarA.f14197b)));
                    return;
                } else {
                    if (cVar == bg.c.binded) {
                        this.f427a.h(this, bVarA, true, 0, null);
                        return;
                    }
                    return;
                }
            }
            a(true);
            return;
        }
        x9s.D("channel id is empty, do nothing!");
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(ccs.B);
        String stringExtra2 = intent.getStringExtra(ccs.F);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        dys[] dysVarArr = new dys[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            dys dysVar = new dys((Bundle) parcelableArrayExtra[i2]);
            dysVarArr[i2] = dysVar;
            dys dysVar2 = (dys) a(dysVar, stringExtra, stringExtra2);
            dysVarArr[i2] = dysVar2;
            if (dysVar2 == null) {
                return;
            }
        }
        bg bgVarC = bg.c();
        mvs[] mvsVarArr = new mvs[length];
        for (int i3 = 0; i3 < length; i3++) {
            dys dysVar3 = dysVarArr[i3];
            mvsVarArr[i3] = mvs.c(dysVar3, bgVarC.b(dysVar3.m(), dysVar3.q()).i);
        }
        c(new h0(this, mvsVarArr));
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("digest");
        cdt.c(getApplicationContext()).g(string);
        zks.e(this, string);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m830a() {
        if (SystemClock.elapsedRealtime() - this.f419a >= qws.a() && obs.x(this)) {
            b(true);
        }
    }

    public void a(String str, byte[] bArr, boolean z) {
        Collection<bg.b> collectionF = bg.c().f(UserConfig.KEY_DEVICE_LITE_SORT_GROUP);
        if (collectionF.isEmpty()) {
            if (z) {
                iht.f(str, bArr);
            }
        } else if (collectionF.iterator().next().m == bg.c.binded) {
            a(new a0(this, 4, str, bArr));
        } else if (z) {
            iht.f(str, bArr);
        }
    }

    private void c(j jVar) {
        this.f428a.e(jVar);
    }

    private void c(boolean z) {
        try {
            if (odt.f()) {
                if (z) {
                    if (y0t.j(this)) {
                        Intent intent = new Intent("miui.intent.action.NETWORK_CONNECTED");
                        intent.addFlags(1073741824);
                        sendBroadcast(intent);
                    }
                    for (q7s q7sVar : (q7s[]) this.f435a.toArray(new q7s[0])) {
                        q7sVar.a();
                    }
                    return;
                }
                if (y0t.j(this)) {
                    Intent intent2 = new Intent("miui.intent.action.NETWORK_BLOCKED");
                    intent2.addFlags(1073741824);
                    sendBroadcast(intent2);
                }
            }
        } catch (Exception e2) {
            x9s.s(e2);
        }
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            iht.b(this, str, bArr, 70000003, "null payload");
            x9s.o("register request without payload");
            return;
        }
        ix ixVar = new ix();
        try {
            com.xiaomi.push.i.d(ixVar, bArr);
            if (ixVar.f245a == ib.Registration) {
                jb jbVar = new jb();
                try {
                    com.xiaomi.push.i.d(jbVar, ixVar.m753a());
                    a(new p0(this, ixVar.b(), jbVar.b(), jbVar.c(), bArr));
                    oss.a(getApplicationContext()).g(ixVar.b(), "E100003", jbVar.a(), 6002, null);
                } catch (jr e2) {
                    x9s.D("app register error. " + e2);
                    iht.b(this, str, bArr, 70000003, " data action error.");
                }
            } else {
                iht.b(this, str, bArr, 70000003, " registration action required.");
                x9s.o("register request with invalid payload");
            }
        } catch (jr e3) {
            x9s.D("app register fail. " + e3);
            iht.b(this, str, bArr, 70000003, " data container error.");
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m835b() {
        try {
            Class<?> clsC = odt.c(this, "miui.os.Build");
            return clsC.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || clsC.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || clsC.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public i0 m833b() {
        return this.f427a;
    }

    public void b(j jVar) {
        this.f428a.d(jVar.f14223a, jVar);
    }

    @Override // defpackage.nws
    public void b(gws gwsVar) {
        com.xiaomi.push.b.f().b(gwsVar);
        c(true);
        this.f430a.b();
        if (!cts.e() && !m826i()) {
            x9s.o("reconnection successful, reactivate alarm.");
            cts.d(true);
        }
        Iterator<bg.b> it = bg.c().e().iterator();
        while (it.hasNext()) {
            a(new b(it.next()));
        }
        if (this.f439a || !y0t.j(getApplicationContext())) {
            return;
        }
        k5s.a(getApplicationContext()).g(new khs(this));
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m836c() {
        gws gwsVar = this.f431a;
        return gwsVar != null && gwsVar.D();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m834b() {
        cdt.c(getApplicationContext()).u();
        Iterator it = new ArrayList(this.f434a).iterator();
        while (it.hasNext()) {
            ((n) it.next()).a();
        }
    }

    private fys a(fys fysVar, String str, String str2) {
        bg bgVarC = bg.c();
        List<String> listG = bgVarC.g(str);
        if (listG.isEmpty()) {
            x9s.o("open channel should be called first before sending a packet, pkg=" + str);
            return null;
        }
        fysVar.v(str);
        String strM = fysVar.m();
        if (TextUtils.isEmpty(strM)) {
            strM = listG.get(0);
            fysVar.p(strM);
        }
        bg.b bVarB = bgVarC.b(strM, fysVar.q());
        if (!m836c()) {
            x9s.o("drop a packet as the channel is not connected, chid=" + strM);
            return null;
        }
        if (bVarB != null && bVarB.m == bg.c.binded) {
            if (TextUtils.equals(str2, bVarB.j)) {
                return fysVar;
            }
            x9s.o("invalid session. " + str2);
            return null;
        }
        x9s.o("drop a packet as the channel is not opened, chid=" + strM);
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m819a(String str, Intent intent) {
        bg.b bVarB = bg.c().b(str, intent.getStringExtra(ccs.p));
        boolean z = false;
        if (bVarB == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(ccs.F);
        String stringExtra2 = intent.getStringExtra(ccs.x);
        if (!TextUtils.isEmpty(bVarB.j) && !TextUtils.equals(stringExtra, bVarB.j)) {
            x9s.o("session changed. old session=" + bVarB.j + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(bVarB.i)) {
            return z;
        }
        x9s.o("security changed. chid = " + str + " sechash = " + mcs.b(stringExtra2));
        return true;
    }

    private bg.b a(String str, Intent intent) {
        bg.b bVarB = bg.c().b(str, intent.getStringExtra(ccs.p));
        if (bVarB == null) {
            bVarB = new bg.b(this);
        }
        bVarB.h = intent.getStringExtra(ccs.s);
        bVarB.f14197b = intent.getStringExtra(ccs.p);
        bVarB.c = intent.getStringExtra(ccs.v);
        bVarB.f14196a = intent.getStringExtra(ccs.B);
        bVarB.f = intent.getStringExtra(ccs.z);
        bVarB.g = intent.getStringExtra(ccs.A);
        bVarB.e = intent.getBooleanExtra(ccs.y, false);
        bVarB.i = intent.getStringExtra(ccs.x);
        bVarB.j = intent.getStringExtra(ccs.F);
        bVarB.d = intent.getStringExtra(ccs.w);
        bVarB.f14198k = this.f427a;
        bVarB.h((Messenger) intent.getParcelableExtra(ccs.J));
        bVarB.l = getApplicationContext();
        bg.c().l(bVarB);
        return bVarB;
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        bg.b bVarB = bg.c().b(str, str2);
        if (bVarB != null) {
            a(new s(bVarB, i2, str4, str3));
        }
        bg.c().n(str, str2);
    }

    private void a(String str, int i2) {
        Collection<bg.b> collectionF = bg.c().f(str);
        if (collectionF != null) {
            for (bg.b bVar : collectionF) {
                if (bVar != null) {
                    a(new s(bVar, i2, null, null));
                }
            }
        }
        bg.c().m(str);
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j2) {
        try {
            this.f428a.f(jVar, j2);
        } catch (IllegalStateException e2) {
            x9s.o("can't execute job err = " + e2.getMessage());
        }
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                x9s.s(e2);
            }
        }
    }

    public void a(mvs mvsVar) throws ha {
        gws gwsVar = this.f431a;
        if (gwsVar != null) {
            gwsVar.w(mvsVar);
            return;
        }
        throw new ha("try send msg while connection is null.");
    }

    public void a(mvs[] mvsVarArr) throws ha {
        gws gwsVar = this.f431a;
        if (gwsVar != null) {
            gwsVar.p(mvsVarArr);
            return;
        }
        throw new ha("try send msg while connection is null.");
    }

    public void a(boolean z) {
        this.f430a.c(z);
    }

    public void a(bg.b bVar) {
        if (bVar != null) {
            long jA = bVar.a();
            x9s.o("schedule rebind job in " + (jA / 1000));
            a(new b(bVar), jA);
        }
    }

    public void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        gws gwsVar = this.f431a;
        sb.append(gwsVar == null ? null : Integer.valueOf(gwsVar.hashCode()));
        x9s.o(sb.toString());
        gws gwsVar2 = this.f431a;
        if (gwsVar2 != null) {
            gwsVar2.v(i2, exc);
            this.f431a = null;
        }
        a(7);
        a(4);
        bg.c().j(this, i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m831a() {
        boolean zV = obs.v(this);
        boolean z = false;
        boolean z2 = bg.c().a() > 0;
        boolean z3 = !m835b();
        boolean zM825h = m825h();
        boolean z4 = !m824g();
        if (zV && z2 && z3 && zM825h && z4) {
            z = true;
        }
        if (!z) {
            x9s.E(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zV), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(zM825h), Boolean.valueOf(z4)));
        }
        return z;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public i0 m828a() {
        return new i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            o6s.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (obs.w(context)) {
                    x9s.o("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public gws m829a() {
        return this.f431a;
    }

    public void a(int i2) {
        this.f428a.c(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m832a(int i2) {
        return this.f428a.h(i2);
    }

    @Override // defpackage.nws
    public void a(gws gwsVar) {
        x9s.B("begin to connect...");
        com.xiaomi.push.b.f().a(gwsVar);
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, int i2, Exception exc) {
        com.xiaomi.push.b.f().a(gwsVar, i2, exc);
        if (m826i()) {
            return;
        }
        a(false);
    }

    @Override // defpackage.nws
    public void a(gws gwsVar, Exception exc) {
        com.xiaomi.push.b.f().a(gwsVar, exc);
        c(false);
        if (m826i()) {
            return;
        }
        a(false);
    }

    public void a(n nVar) {
        synchronized (this.f434a) {
            this.f434a.add(nVar);
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m837d() {
        gws gwsVar = this.f431a;
        return gwsVar != null && gwsVar.B();
    }
}
