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
import android.net.ConnectivityManager;
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
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.channel.commonutils.android.MIPushProvider;
import com.xiaomi.channel.commonutils.android.Region;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.bc;
import com.xiaomi.push.bi;
import com.xiaomi.push.bu;
import com.xiaomi.push.bx;
import com.xiaomi.push.by;
import com.xiaomi.push.cd;
import com.xiaomi.push.ch;
import com.xiaomi.push.ci;
import com.xiaomi.push.cj;
import com.xiaomi.push.cl;
import com.xiaomi.push.cx;
import com.xiaomi.push.cz;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import com.xiaomi.push.du;
import com.xiaomi.push.ee;
import com.xiaomi.push.ej;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class XMPushService extends Service implements com.xiaomi.push.bv {
    private static boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ContentObserver f182a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.bp f184a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.bt f185a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bu f186a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f188a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private f f189a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private k f190a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private r f191a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private t f192a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private d0 f194a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.j f195a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f200a = false;
    private int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f201b = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f181a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Class f197a = XMJobService.class;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ax f193a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.o f196a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Messenger f183a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Collection<ak> f199a = Collections.synchronizedCollection(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ArrayList<n> f198a = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private bx f187a = new l0(this);

    public class a extends BroadcastReceiver {
        private final Object a;

        private a() {
            this.a = new Object();
        }

        public /* synthetic */ a(XMPushService xMPushService, l0 l0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.a) {
                try {
                    this.a.notifyAll();
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] notify lock. " + e);
                }
            }
        }

        private void b(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.a) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] heartbeat alarm has been triggered.");
            if (!bd.q.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] cancel the old ping timer");
                bc.a();
                return;
            }
            if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, (Class<?>) XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    b(3000L);
                    com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - jCurrentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public class b extends j {
        public az.b b;

        public b(az.b bVar) {
            super(9);
            this.b = null;
            this.b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind the client. " + this.b.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            String str;
            try {
                if (!XMPushService.this.m3811d()) {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                    return;
                }
                az azVarA = az.a();
                az.b bVar = this.b;
                az.b bVarA = azVarA.a(bVar.g, bVar.b);
                if (bVarA == null) {
                    str = "ignore bind because the channel " + this.b.g + " is removed ";
                } else if (bVarA.j == az.c.unbind) {
                    bVarA.a(az.c.binding, 0, 0, null, null);
                    XMPushService.this.f185a.a(bVarA);
                    return;
                } else {
                    str = "trying duplicate bind, ingore! " + bVarA.j;
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("Meet error when trying to bind. " + e);
                XMPushService.this.a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    public static class c extends j {
        private final az.b b;

        public c(az.b bVar) {
            super(12);
            this.b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "bind time out. chid=" + this.b.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            this.b.a(az.c.unbind, 1, 21, null, null);
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return TextUtils.equals(((c) obj).b.g, this.b.g);
            }
            return false;
        }

        public int hashCode() {
            return this.b.g.hashCode();
        }
    }

    public class d extends j {
        private bi b;

        public d(bi biVar) {
            super(8);
            this.b = null;
            this.b = biVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.f193a.a(this.b);
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
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            if (XMPushService.this.m3809b()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("should not connect. quit the job.");
        }
    }

    public class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("network changed, " + com.xiaomi.channel.commonutils.android.f.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    public class g extends j {
        public Exception a;
        public int b;

        public g(int i, Exception exc) {
            super(2);
            this.b = i;
            this.a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.a(this.b, this.a);
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
        /* JADX INFO: renamed from: a */
        public void mo3788a() throws JSONException, IOException {
            XMPushService.this.c();
        }
    }

    public class i extends j {
        private Intent b;

        public i(Intent intent) {
            super(15);
            this.b = null;
            this.b = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "Handle intent action = " + this.b.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.d(this.b);
        }
    }

    public static abstract class j extends com.xiaomi.push.service.o.b {
        public j(int i) {
            super(i);
        }

        public abstract String a();

        /* JADX INFO: renamed from: a */
        public abstract void mo3788a();

        @Override // java.lang.Runnable
        public void run() {
            int i = this.a;
            if (i != 4 && i != 8) {
                com.xiaomi.channel.commonutils.logger.b.m3435a(com.xiaomi.channel.commonutils.logger.a.a, a());
            }
            mo3788a();
        }
    }

    public class k extends BroadcastReceiver {
        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] hold short heartbeat, " + com.xiaomi.channel.commonutils.android.f.a(intent));
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
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.f196a.a();
        }
    }

    public class m extends j {
        private cj b;

        public m(cj cjVar) {
            super(8);
            this.b = null;
            this.b = cjVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.f193a.a(this.b);
        }
    }

    public interface n {
        void a();
    }

    public class o extends j {
        public boolean b;

        public o(boolean z) {
            super(4);
            this.b = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            if (XMPushService.this.m3811d()) {
                try {
                    XMPushService.this.f185a.b(this.b);
                } catch (cd e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
        }
    }

    public class p extends j {
        public az.b b;

        public p(az.b bVar) {
            super(4);
            this.b = null;
            this.b = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "rebind the client. " + this.b.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            try {
                this.b.a(az.c.unbind, 1, 16, null, null);
                com.xiaomi.push.bt btVar = XMPushService.this.f185a;
                az.b bVar = this.b;
                btVar.a(bVar.g, bVar.b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.a(xMPushService.new b(this.b), 300L);
            } catch (cd e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
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
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m3809b()) {
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
        public az.b b;
        public int c;
        public String d;
        public String e;

        public s(az.b bVar, int i, String str, String str2) {
            super(9);
            this.b = null;
            this.b = bVar;
            this.c = i;
            this.d = str;
            this.e = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "unbind the channel. " + this.b.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* JADX INFO: renamed from: a */
        public void mo3788a() {
            if (this.b.j != az.c.unbind && XMPushService.this.f185a != null) {
                try {
                    com.xiaomi.push.bt btVar = XMPushService.this.f185a;
                    az.b bVar = this.b;
                    btVar.a(bVar.g, bVar.b);
                } catch (cd e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
            this.b.a(az.c.unbind, this.c, 0, this.e, this.d);
        }
    }

    public class t extends BroadcastReceiver {
        public t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f200a) {
                XMPushService.this.f200a = true;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("[HB] wifi changed, " + com.xiaomi.channel.commonutils.android.f.a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    private cj a(cj cjVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        az azVarA = az.a();
        List<String> listM3826a = azVarA.m3826a(str);
        if (listM3826a.isEmpty()) {
            sb = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            cjVar.o(str);
            str = cjVar.k();
            if (TextUtils.isEmpty(str)) {
                str = listM3826a.get(0);
                cjVar.l(str);
            }
            az.b bVarA = azVarA.a(str, cjVar.m());
            if (m3811d()) {
                if (bVarA == null || bVarA.j != az.c.binded) {
                    sb = new StringBuilder();
                    str3 = "drop a packet as the channel is not opened, chid=";
                } else {
                    if (TextUtils.equals(str2, bVarA.i)) {
                        return cjVar;
                    }
                    sb = new StringBuilder();
                    sb.append("invalid session. ");
                    sb.append(str2);
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
                return null;
            }
            sb = new StringBuilder();
            str3 = "drop a packet as the channel is not connected, chid=";
        }
        sb.append(str3);
        sb.append(str);
        com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
        return null;
    }

    private az.b a(String str, Intent intent) {
        az.b bVarA = az.a().a(str, intent.getStringExtra(bd.r));
        if (bVarA == null) {
            bVarA = new az.b(this);
        }
        bVarA.g = intent.getStringExtra(bd.u);
        bVarA.b = intent.getStringExtra(bd.r);
        bVarA.c = intent.getStringExtra(bd.w);
        bVarA.f206a = intent.getStringExtra(bd.C);
        bVarA.e = intent.getStringExtra(bd.A);
        bVarA.f = intent.getStringExtra(bd.B);
        bVarA.f207a = intent.getBooleanExtra(bd.z, false);
        bVarA.h = intent.getStringExtra(bd.y);
        bVarA.i = intent.getStringExtra(bd.G);
        bVarA.d = intent.getStringExtra(bd.x);
        bVarA.f205a = this.f195a;
        bVarA.f((Messenger) intent.getParcelableExtra(bd.K));
        bVarA.a = getApplicationContext();
        az.a().a(bVarA);
        return bVarA;
    }

    private String a() {
        String strM3425a = com.xiaomi.channel.commonutils.android.f.m3425a("ro.miui.region");
        return TextUtils.isEmpty(strM3425a) ? com.xiaomi.channel.commonutils.android.f.m3425a("ro.product.locale.region") : strM3425a;
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.b.a(e2);
            }
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        com.xiaomi.push.service.n.a(getApplicationContext()).a(extras.getString("digest"));
    }

    private void a(Intent intent, int i2) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        dt dtVar = new dt();
        try {
            ee.a(dtVar, byteArrayExtra);
            com.xiaomi.push.o.a(getApplicationContext()).a((com.xiaomi.push.o.a) new com.xiaomi.push.service.b(dtVar, new WeakReference(this), booleanExtra), i2);
        } catch (ej unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    private void a(com.xiaomi.push.service.a aVar) {
        String str;
        StringBuilder sb;
        if (aVar == null || !TextUtils.isEmpty(aVar.b()) || TextUtils.isEmpty(aVar.a())) {
            str = "no need to check country code";
        } else {
            String strA = PkgNameConstants.XMSF.equals(getPackageName()) ? a() : com.xiaomi.channel.commonutils.android.f.b();
            if (!TextUtils.isEmpty(strA)) {
                String strName = com.xiaomi.channel.commonutils.android.f.a(strA).name();
                if (TextUtils.equals(strName, aVar.a())) {
                    aVar.b(strA);
                    sb = new StringBuilder();
                    sb.append("update country code： ");
                    sb.append(strA);
                } else {
                    sb = new StringBuilder();
                    sb.append("not update country code, because not equals ");
                    sb.append(strName);
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
                return;
            }
            str = "check no country code";
        }
        com.xiaomi.channel.commonutils.logger.b.b(str);
    }

    private static void a(String str) {
        String str2;
        String str3;
        if (Region.Global.name().equals(str)) {
            com.xiaomi.push.ak.a("app.chat.global.xiaomi.net", "app.chat.global.xiaomi.net");
            str2 = "resolver.msg.global.xiaomi.net";
            com.xiaomi.push.ak.a("resolver.msg.global.xiaomi.net", "47.241.174.254:443");
            str3 = "47.241.56.51:443";
        } else if (Region.Europe.name().equals(str)) {
            com.xiaomi.push.ak.a("fr.app.chat.global.xiaomi.net", "fr.app.chat.global.xiaomi.net");
            str2 = "fr.resolver.msg.global.xiaomi.net";
            str3 = "fr-resolver-msg-global-xiaomi-n-916220403.eu-central-1.elb.amazonaws.com";
        } else if (Region.Russia.name().equals(str)) {
            com.xiaomi.push.ak.a("ru.app.chat.global.xiaomi.net", "ru.app.chat.global.xiaomi.net");
            str2 = "ru.resolver.msg.global.xiaomi.net";
            str3 = "107.155.52.31:443";
        } else {
            if (!Region.India.name().equals(str)) {
                return;
            }
            com.xiaomi.push.ak.a("idmb.app.chat.global.xiaomi.net", "idmb.app.chat.global.xiaomi.net");
            str2 = "mb.resolver.msg.global.xiaomi.net";
            str3 = "resolver-msg-xiaomi-net-665721575.ap-south-1.elb.amazonaws.com";
        }
        com.xiaomi.push.ak.a(str2, str3);
    }

    private void a(String str, int i2) {
        Collection<az.b> collectionA = az.a().a(str);
        if (collectionA != null) {
            for (az.b bVar : collectionA) {
                if (bVar != null) {
                    a(new s(bVar, i2, null, null));
                }
            }
        }
        az.a().m3828a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            com.xiaomi.push.u.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (com.xiaomi.push.y.b(context)) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("network connectivity ok.");
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
    private boolean m3795a(String str, Intent intent) {
        az.b bVarA = az.a().a(str, intent.getStringExtra(bd.r));
        boolean z = false;
        if (bVarA == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(bd.G);
        String stringExtra2 = intent.getStringExtra(bd.y);
        if (!TextUtils.isEmpty(bVarA.i) && !TextUtils.equals(stringExtra, bVarA.i)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("session changed. old session=" + bVarA.i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(bVarA.h)) {
            return z;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("security changed. chid = " + str + " sechash = " + com.xiaomi.push.ac.a(stringExtra2));
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int[] m3796a() {
        String[] strArrSplit;
        if (!TextUtils.isEmpty("") && (strArrSplit = "".split(",")) != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(strArrSplit[0]).intValue();
                iArr[1] = Integer.valueOf(strArrSplit[1]).intValue();
                if (iArr[0] >= 0 && iArr[0] <= 23 && iArr[1] >= 0 && iArr[1] <= 23 && iArr[0] != iArr[1]) {
                    return iArr;
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.b.d("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    private String b() {
        com.xiaomi.push.u.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String strA = null;
        if (PkgNameConstants.XMSF.equals(getPackageName())) {
            bf bfVarA = bf.a(this);
            while (true) {
                if (!TextUtils.isEmpty(strA) && bfVarA.a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(strA)) {
                    strA = a();
                }
                try {
                    synchronized (obj) {
                        try {
                            obj.wait(100L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("wait countryCode :" + strA + " cost = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return strA;
    }

    private void b(Intent intent) {
        long j2;
        String stringExtra = intent.getStringExtra(bd.C);
        String stringExtra2 = intent.getStringExtra(bd.G);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        az azVarA = az.a();
        bi biVarA = null;
        if (bundleExtra != null) {
            ci ciVar = (ci) a(new ci(bundleExtra), stringExtra, stringExtra2);
            if (ciVar == null) {
                return;
            } else {
                biVarA = bi.a(ciVar, azVarA.a(ciVar.k(), ciVar.m()).h);
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(bd.r));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(bd.s);
                String stringExtra4 = intent.getStringExtra(bd.t);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                az.b bVarA = azVarA.a(stringExtra5, String.valueOf(j2));
                if (bVarA != null) {
                    bi biVar = new bi();
                    try {
                        biVar.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    biVar.a("SECMSG", (String) null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    biVar.a(j2, stringExtra3, stringExtra4);
                    biVar.a(intent.getStringExtra("ext_pkt_id"));
                    biVar.a(byteArrayExtra, bVarA.h);
                    com.xiaomi.channel.commonutils.logger.b.m3434a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    biVarA = biVar;
                }
            }
        }
        if (biVarA != null) {
            c(new e0(this, biVarA));
        }
    }

    private void b(boolean z) throws JSONException, IOException {
        if (com.xiaomi.channel.commonutils.android.f.m3426a() || !z) {
            return;
        }
        com.xiaomi.push.ak.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws JSONException, IOException {
        boolean zM3805a = m3805a();
        if (m3801i() && zM3805a) {
            w0 w0Var = new w0(this, 11);
            a(w0Var);
            com.xiaomi.push.service.r.a(new x0(this, w0Var));
        }
        try {
            if (com.xiaomi.channel.commonutils.android.k.m3432a()) {
                this.f195a.a(this);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(bd.C);
        String stringExtra2 = intent.getStringExtra(bd.G);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        ci[] ciVarArr = new ci[length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            ciVarArr[i2] = new ci((Bundle) parcelableArrayExtra[i2]);
            ciVarArr[i2] = (ci) a(ciVarArr[i2], stringExtra, stringExtra2);
            if (ciVarArr[i2] == null) {
                return;
            }
        }
        az azVarA = az.a();
        bi[] biVarArr = new bi[length];
        for (int i3 = 0; i3 < length; i3++) {
            ci ciVar = ciVarArr[i3];
            biVarArr[i3] = bi.a(ciVar, azVarA.a(ciVar.k(), ciVar.m()).h);
        }
        c(new o0(this, biVarArr));
    }

    private void c(j jVar) {
        this.f196a.a(jVar);
    }

    private void c(boolean z) {
        this.f181a = SystemClock.elapsedRealtime();
        if (m3811d()) {
            if (com.xiaomi.push.y.m3842a((Context) this)) {
                c(new o(z));
                return;
            }
            c(new g(17, null));
        }
        a(true);
    }

    private void d() {
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            activeNetworkInfo = null;
        }
        com.xiaomi.push.service.n.a(getApplicationContext()).a(activeNetworkInfo);
        if (activeNetworkInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[type: " + activeNetworkInfo.getTypeName() + "[" + activeNetworkInfo.getSubtypeName() + "], state: " + activeNetworkInfo.getState() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + activeNetworkInfo.getDetailedState());
            com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
            NetworkInfo.State state = activeNetworkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m3434a("network changed, no active network");
        }
        cx.m3649a((Context) this);
        this.f184a.d();
        if (com.xiaomi.push.y.m3842a((Context) this)) {
            if (m3811d() && m3799g()) {
                c(false);
            }
            if (!m3811d() && !m3812e()) {
                this.f196a.a(1);
                a(new e());
            }
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        String str;
        com.xiaomi.push.service.j jVar;
        boolean z;
        int i2;
        String str2;
        j pVar;
        int i3;
        String strB;
        SharedPreferences sharedPreferences;
        String str3;
        e0 e0Var;
        az azVarA = az.a();
        boolean z2 = true;
        int i4 = 0;
        if (bd.d.equalsIgnoreCase(intent.getAction()) || bd.j.equalsIgnoreCase(intent.getAction())) {
            String stringExtra = intent.getStringExtra(bd.u);
            if (!TextUtils.isEmpty(intent.getStringExtra(bd.y))) {
                if (TextUtils.isEmpty(stringExtra)) {
                    str = "channel id is empty, do nothing!";
                    com.xiaomi.channel.commonutils.logger.b.d(str);
                    return;
                }
                boolean zM3795a = m3795a(stringExtra, intent);
                az.b bVarA = a(stringExtra, intent);
                if (com.xiaomi.push.y.b(this)) {
                    if (m3811d()) {
                        az.c cVar = bVarA.j;
                        if (cVar == az.c.unbind) {
                            pVar = new b(bVarA);
                        } else if (zM3795a) {
                            pVar = new p(bVarA);
                        } else if (cVar == az.c.binding) {
                            str2 = String.format("the client is binding. %1$s %2$s.", bVarA.g, az.b.a(bVarA.b));
                        } else {
                            if (cVar != az.c.binded) {
                                return;
                            }
                            jVar = this.f195a;
                            z = true;
                            i2 = 0;
                        }
                        c(pVar);
                        return;
                    }
                    a(true);
                    return;
                }
                jVar = this.f195a;
                z = false;
                i2 = 2;
                jVar.a(this, bVarA, z, i2, null);
                return;
            }
            str2 = "security is empty. ignore.";
            com.xiaomi.channel.commonutils.logger.b.m3434a(str2);
            return;
        }
        if (bd.i.equalsIgnoreCase(intent.getAction())) {
            String stringExtra2 = intent.getStringExtra(bd.C);
            String stringExtra3 = intent.getStringExtra(bd.u);
            String stringExtra4 = intent.getStringExtra(bd.r);
            com.xiaomi.channel.commonutils.logger.b.m3434a("Service called close channel chid = " + stringExtra3 + " res = " + az.b.a(stringExtra4));
            if (TextUtils.isEmpty(stringExtra3)) {
                Iterator<String> it2 = azVarA.m3826a(stringExtra2).iterator();
                while (it2.hasNext()) {
                    a(it2.next(), 2);
                }
                return;
            } else if (TextUtils.isEmpty(stringExtra4)) {
                a(stringExtra3, 2);
                return;
            } else {
                a(stringExtra3, stringExtra4, 2, null, null);
                return;
            }
        }
        if (bd.e.equalsIgnoreCase(intent.getAction())) {
            b(intent);
            return;
        }
        if (bd.g.equalsIgnoreCase(intent.getAction())) {
            c(intent);
            return;
        }
        if (bd.f.equalsIgnoreCase(intent.getAction())) {
            cj cjVarA = a(new ch(intent.getBundleExtra("ext_packet")), intent.getStringExtra(bd.C), intent.getStringExtra(bd.G));
            if (cjVarA == null) {
                return;
            } else {
                e0Var = new e0(this, bi.a(cjVarA, azVarA.a(cjVarA.k(), cjVarA.m()).h));
            }
        } else {
            if (!bd.h.equalsIgnoreCase(intent.getAction())) {
                if (!bd.k.equals(intent.getAction())) {
                    String string = null;
                    bVarA = null;
                    az.b bVarA2 = null;
                    string = null;
                    if (bd.l.equals(intent.getAction())) {
                        String stringExtra5 = intent.getStringExtra(bd.C);
                        List<String> listM3826a = azVarA.m3826a(stringExtra5);
                        if (!listM3826a.isEmpty()) {
                            String stringExtra6 = intent.getStringExtra(bd.u);
                            String stringExtra7 = intent.getStringExtra(bd.r);
                            if (TextUtils.isEmpty(stringExtra6)) {
                                stringExtra6 = listM3826a.get(0);
                            }
                            if (TextUtils.isEmpty(stringExtra7)) {
                                Collection<az.b> collectionA = azVarA.a(stringExtra6);
                                if (collectionA != null && !collectionA.isEmpty()) {
                                    bVarA2 = collectionA.iterator().next();
                                }
                            } else {
                                bVarA2 = azVarA.a(stringExtra6, stringExtra7);
                            }
                            if (bVarA2 != null) {
                                if (intent.hasExtra(bd.A)) {
                                    bVarA2.e = intent.getStringExtra(bd.A);
                                }
                                if (intent.hasExtra(bd.B)) {
                                    bVarA2.f = intent.getStringExtra(bd.B);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        str3 = "open channel should be called first before update info, pkg=" + stringExtra5;
                    } else {
                        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) || "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && j() && bc.m3594a()) {
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("enter falldown mode, stop alarm.");
                                    bc.a();
                                    return;
                                }
                                return;
                            }
                            if (j()) {
                                return;
                            }
                            com.xiaomi.channel.commonutils.logger.b.m3434a("exit falldown mode, activate alarm.");
                            e();
                            if (m3811d() || m3812e()) {
                                return;
                            }
                            a(true);
                            return;
                        }
                        if ("com.xiaomi.mipush.REGISTER_APP".equals(intent.getAction())) {
                            if (bf.a(getApplicationContext()).m3831a() && bf.a(getApplicationContext()).a() == 0) {
                                str3 = "register without being provisioned. " + intent.getStringExtra("mipush_app_package");
                            } else {
                                byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
                                String stringExtra8 = intent.getStringExtra("mipush_app_package");
                                boolean booleanExtra = intent.getBooleanExtra("mipush_region_change", false);
                                boolean booleanExtra2 = intent.getBooleanExtra("mipush_env_chanage", false);
                                int intExtra = intent.getIntExtra("mipush_env_type", 1);
                                com.xiaomi.push.service.s.a(this).d(stringExtra8);
                                if ((!booleanExtra && !booleanExtra2) || PkgNameConstants.XMSF.equals(getPackageName())) {
                                    a(byteArrayExtra, stringExtra8);
                                    return;
                                }
                                pVar = new y0(this, 14, intExtra, booleanExtra, stringExtra8, byteArrayExtra);
                            }
                        } else {
                            if ("com.xiaomi.mipush.SEND_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                                String stringExtra9 = intent.getStringExtra("mipush_app_package");
                                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                                boolean booleanExtra3 = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                                if ("com.xiaomi.mipush.UNREGISTER_APP".equals(intent.getAction())) {
                                    com.xiaomi.push.service.s.a(this).a(stringExtra9);
                                    if (com.xiaomi.channel.commonutils.android.f.m3427a(getApplicationContext())) {
                                        ac.a(stringExtra9);
                                    }
                                }
                                a(stringExtra9, byteArrayExtra2, booleanExtra3);
                                return;
                            }
                            if (!bg.a.equals(intent.getAction())) {
                                if (bg.b.equals(intent.getAction())) {
                                    String stringExtra10 = intent.getStringExtra("data_cleared_pkg_name");
                                    if (TextUtils.isEmpty(stringExtra10)) {
                                        return;
                                    }
                                    try {
                                        sharedPreferences = getSharedPreferences("pref_registered_pkg_names", 0);
                                        if (sharedPreferences != null) {
                                            try {
                                                string = sharedPreferences.getString(stringExtra10, null);
                                            } catch (Throwable th) {
                                                th = th;
                                                com.xiaomi.channel.commonutils.logger.b.m3434a("Fail to get sp or appId : " + th);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sharedPreferences = null;
                                    }
                                    if (!TextUtils.isEmpty(string)) {
                                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                        editorEdit.remove(stringExtra10);
                                        editorEdit.commit();
                                        if (ag.F(this, stringExtra10)) {
                                            ag.B(this, stringExtra10);
                                        }
                                        ag.a((Context) this, stringExtra10);
                                        if (m3811d()) {
                                            try {
                                                com.xiaomi.push.service.f.i(this, com.xiaomi.push.service.f.l(stringExtra10, string));
                                                com.xiaomi.channel.commonutils.logger.b.m3434a("send app data cleared Message pkgName is : " + stringExtra10);
                                            } catch (cd e2) {
                                                com.xiaomi.channel.commonutils.logger.b.d("Fail to send Message: " + e2);
                                                a(10, e2);
                                            }
                                        }
                                    }
                                    am.a(this, stringExtra10);
                                    if (com.xiaomi.channel.commonutils.android.f.m3427a(getApplicationContext())) {
                                        ac.a(stringExtra10);
                                        return;
                                    }
                                    return;
                                }
                                if ("com.xiaomi.mipush.CLEAR_NOTIFICATION".equals(intent.getAction())) {
                                    String stringExtra11 = intent.getStringExtra(bd.C);
                                    int intExtra2 = intent.getIntExtra(bd.D, -2);
                                    if (TextUtils.isEmpty(stringExtra11)) {
                                        return;
                                    }
                                    if (intExtra2 >= -1) {
                                        ag.a(this, stringExtra11, intExtra2, intent.getIntExtra(bd.E, -1));
                                        return;
                                    } else {
                                        ag.a(this, stringExtra11, intent.getStringExtra(bd.I), intent.getStringExtra(bd.J));
                                        return;
                                    }
                                }
                                if ("com.xiaomi.mipush.SET_NOTIFICATION_TYPE".equals(intent.getAction())) {
                                    String stringExtra12 = intent.getStringExtra(bd.C);
                                    String stringExtra13 = intent.getStringExtra(bd.H);
                                    if (intent.hasExtra(bd.F)) {
                                        int intExtra3 = intent.getIntExtra(bd.F, 0);
                                        strB = com.xiaomi.push.ac.b(stringExtra12 + intExtra3);
                                        i4 = intExtra3;
                                        z2 = false;
                                    } else {
                                        strB = com.xiaomi.push.ac.b(stringExtra12);
                                    }
                                    if (!TextUtils.isEmpty(stringExtra12) && TextUtils.equals(stringExtra13, strB)) {
                                        if (z2) {
                                            ag.B(this, stringExtra12);
                                            return;
                                        } else {
                                            ag.C(this, stringExtra12, i4);
                                            return;
                                        }
                                    }
                                    str = "invalid notification for " + stringExtra12;
                                    com.xiaomi.channel.commonutils.logger.b.d(str);
                                    return;
                                }
                                if ("com.xiaomi.mipush.DISABLE_PUSH".equals(intent.getAction())) {
                                    String stringExtra14 = intent.getStringExtra("mipush_app_package");
                                    if (!TextUtils.isEmpty(stringExtra14)) {
                                        com.xiaomi.push.service.s.a(this).b(stringExtra14);
                                    }
                                    if (PkgNameConstants.XMSF.equals(getPackageName())) {
                                        return;
                                    }
                                    a(19, (Exception) null);
                                    e();
                                    stopSelf();
                                    return;
                                }
                                if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction()) || "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                                    String stringExtra15 = intent.getStringExtra("mipush_app_package");
                                    byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                                    String stringExtra16 = intent.getStringExtra("mipush_app_id");
                                    String stringExtra17 = intent.getStringExtra("mipush_app_token");
                                    if ("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                                        com.xiaomi.push.service.s.a(this).c(stringExtra15);
                                    }
                                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction())) {
                                        com.xiaomi.push.service.s.a(this).e(stringExtra15);
                                        com.xiaomi.push.service.s.a(this).f(stringExtra15);
                                    }
                                    if (byteArrayExtra3 == null) {
                                        u.a(this, stringExtra15, byteArrayExtra3, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
                                        return;
                                    }
                                    u.b(stringExtra15, byteArrayExtra3);
                                    a(new com.xiaomi.push.service.t(this, stringExtra15, stringExtra16, stringExtra17, byteArrayExtra3));
                                    if ("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE".equals(intent.getAction()) && this.f189a == null) {
                                        this.f189a = new f();
                                        registerReceiver(this.f189a, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
                                        return;
                                    }
                                    return;
                                }
                                if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                                    return;
                                }
                                if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction())) {
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] Service called on timer");
                                    if (!j()) {
                                        bc.a(false);
                                        if (m3799g()) {
                                            c(false);
                                        }
                                    } else if (bc.m3594a()) {
                                        com.xiaomi.channel.commonutils.logger.b.m3434a("enter falldown mode, stop alarm");
                                        bc.a();
                                    }
                                    a aVar = this.f188a;
                                    if (aVar != null) {
                                        aVar.a();
                                        return;
                                    }
                                    return;
                                }
                                if ("com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("Service called on check alive.");
                                    if (m3799g()) {
                                        c(false);
                                        return;
                                    }
                                    return;
                                }
                                if ("com.xiaomi.mipush.thirdparty".equals(intent.getAction())) {
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("on thirdpart push :" + intent.getStringExtra("com.xiaomi.mipush.thirdparty_DESC"));
                                    bc.a(this, intent.getIntExtra("com.xiaomi.mipush.thirdparty_LEVEL", 0));
                                    return;
                                }
                                if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                                    d();
                                    return;
                                }
                                if ("miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                                    a(intent);
                                    return;
                                }
                                if ("com.xiaomi.xmsf.USE_INTELLIGENT_HB".equals(intent.getAction())) {
                                    if (intent.getExtras() == null || (i3 = intent.getExtras().getInt("effectivePeriod", 0)) <= 0 || i3 > 604800) {
                                        return;
                                    }
                                    com.xiaomi.push.service.n.a(getApplicationContext()).a(i3);
                                    return;
                                }
                                if ("action_cr_config".equals(intent.getAction())) {
                                    return;
                                }
                                if (!"action_help_ping".equals(intent.getAction())) {
                                    if (bd.n.equals(intent.getAction())) {
                                        com.xiaomi.push.service.m.b(getApplicationContext(), intent);
                                        return;
                                    }
                                    return;
                                }
                                boolean booleanExtra4 = intent.getBooleanExtra("extra_help_ping_switch", false);
                                int intExtra4 = intent.getIntExtra("extra_help_ping_frequency", 0);
                                if (intExtra4 >= 0 && intExtra4 < 30) {
                                    com.xiaomi.channel.commonutils.logger.b.c("aw_ping: frquency need > 30s.");
                                    intExtra4 = 30;
                                }
                                boolean z3 = intExtra4 >= 0 ? booleanExtra4 : false;
                                com.xiaomi.channel.commonutils.logger.b.m3434a("aw_ping: receive a aw_ping message. switch: " + z3 + " frequency: " + intExtra4);
                                if (!z3 || intExtra4 <= 0 || PkgNameConstants.XMSF.equals(getPackageName())) {
                                    return;
                                }
                                a(intent, intExtra4);
                                return;
                            }
                            String stringExtra18 = intent.getStringExtra("uninstall_pkg_name");
                            if (stringExtra18 == null || TextUtils.isEmpty(stringExtra18.trim())) {
                                return;
                            }
                            try {
                                PackageInfo packageInfo = getPackageManager().getPackageInfo(stringExtra18, 0);
                                if (packageInfo == null || packageInfo.applicationInfo == null || !com.xiaomi.channel.commonutils.android.c.a(this, packageInfo.packageName)) {
                                    z2 = false;
                                } else {
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("dual space's app uninstalled " + stringExtra18);
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (!PkgNameConstants.MTALKING.equals(stringExtra18) || az.a().a("1").isEmpty() || !z2) {
                                SharedPreferences sharedPreferences2 = getSharedPreferences("pref_registered_pkg_names", 0);
                                String string2 = sharedPreferences2.getString(stringExtra18, null);
                                if (TextUtils.isEmpty(string2) || !z2) {
                                    return;
                                }
                                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                                editorEdit2.remove(stringExtra18);
                                editorEdit2.commit();
                                if (ag.F(this, stringExtra18)) {
                                    ag.B(this, stringExtra18);
                                }
                                ag.a((Context) this, stringExtra18);
                                am.a(getApplicationContext(), stringExtra18);
                                if (!m3811d() || string2 == null) {
                                    return;
                                }
                                try {
                                    com.xiaomi.push.service.f.i(this, com.xiaomi.push.service.f.c(stringExtra18, string2));
                                    com.xiaomi.channel.commonutils.logger.b.m3434a("uninstall " + stringExtra18 + " msg sent");
                                    return;
                                } catch (cd e3) {
                                    com.xiaomi.channel.commonutils.logger.b.d("Fail to send Message: " + e3.getMessage());
                                    a(10, e3);
                                    return;
                                }
                            }
                            a("1", 0);
                            str3 = "close the miliao channel as the app is uninstalled.";
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.m3434a(str3);
                    return;
                }
                String stringExtra19 = intent.getStringExtra(bd.u);
                String stringExtra20 = intent.getStringExtra(bd.r);
                if (stringExtra19 == null) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a("request reset connection from chid = " + stringExtra19);
                az.b bVarA3 = az.a().a(stringExtra19, stringExtra20);
                if (bVarA3 == null || !bVarA3.h.equals(intent.getStringExtra(bd.y)) || bVarA3.j != az.c.binded) {
                    return;
                }
                com.xiaomi.push.bt btVarM3802a = m3802a();
                if (btVarM3802a != null && btVarM3802a.a(SystemClock.elapsedRealtime() - 15000)) {
                    return;
                } else {
                    pVar = new q();
                }
                c(pVar);
                return;
            }
            cj cjVarA2 = a(new cl(intent.getBundleExtra("ext_packet")), intent.getStringExtra(bd.C), intent.getStringExtra(bd.G));
            if (cjVarA2 == null) {
                return;
            } else {
                e0Var = new e0(this, bi.a(cjVarA2, azVarA.a(cjVarA2.k(), cjVarA2.m()).h));
            }
        }
        c(e0Var);
    }

    private void d(boolean z) {
        try {
            if (com.xiaomi.channel.commonutils.android.k.m3432a()) {
                if (!z) {
                    sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                    return;
                }
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (ak akVar : (ak[]) this.f199a.toArray(new ak[0])) {
                    akVar.a();
                }
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m3809b()) {
            bc.a();
        } else {
            if (bc.m3594a()) {
                return;
            }
            bc.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str;
        com.xiaomi.push.bt btVar = this.f185a;
        if (btVar == null || !btVar.m3609b()) {
            com.xiaomi.push.bt btVar2 = this.f185a;
            if (btVar2 == null || !btVar2.m3610c()) {
                this.f186a.b(com.xiaomi.push.y.m3840a((Context) this));
                g();
                if (this.f185a == null) {
                    az.a().a(this);
                    d(false);
                    return;
                }
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public static boolean m3798f() {
        return b;
    }

    private void g() {
        try {
            this.f184a.a(this.f187a, new p0(this));
            this.f184a.e();
            this.f185a = this.f184a;
        } catch (cd e2) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", e2);
            this.f184a.b(3, e2);
        }
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    private boolean m3799g() {
        if (SystemClock.elapsedRealtime() - this.f181a < 30000) {
            return false;
        }
        return com.xiaomi.push.y.c(this);
    }

    private void h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public boolean m3800h() {
        return PkgNameConstants.XMSF.equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    private void i() {
        synchronized (this.f198a) {
            this.f198a.clear();
        }
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    private boolean m3801i() {
        if (!com.xiaomi.channel.commonutils.android.f.m3426a() || !PkgNameConstants.XMSF.equals(getPackageName())) {
            return !com.xiaomi.push.service.s.a(this).m3838b(getPackageName());
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("current sdk expect region is global");
        return !"China".equals(com.xiaomi.push.service.a.a(getApplicationContext()).a());
    }

    private boolean j() {
        return getApplicationContext().getPackageName().equals(PkgNameConstants.XMSF) && k() && !com.xiaomi.channel.commonutils.android.c.m3423c((Context) this) && !com.xiaomi.channel.commonutils.android.c.m3422b(getApplicationContext());
    }

    private boolean k() {
        int iIntValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.a;
        int i3 = this.f201b;
        if (i2 > i3) {
            if (iIntValue >= i2 || iIntValue < i3) {
                return true;
            }
        } else if (i2 < i3 && iIntValue >= i2 && iIntValue < i3) {
            return true;
        }
        return false;
    }

    private boolean l() {
        TextUtils.equals(getPackageName(), PkgNameConstants.XMSF);
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public com.xiaomi.push.bt m3802a() {
        return this.f185a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public com.xiaomi.push.service.j m3803a() {
        return new com.xiaomi.push.service.j();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3804a() {
        if (SystemClock.elapsedRealtime() - this.f181a >= by.a() && com.xiaomi.push.y.c(this)) {
            c(true);
        }
    }

    public void a(int i2) {
        this.f196a.a(i2);
    }

    public void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        com.xiaomi.push.bt btVar = this.f185a;
        sb.append(btVar == null ? null : Integer.valueOf(btVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
        com.xiaomi.push.bt btVar2 = this.f185a;
        if (btVar2 != null) {
            btVar2.b(i2, exc);
            this.f185a = null;
        }
        a(7);
        a(4);
        az.a().a(this, i2);
    }

    public void a(bi biVar) throws cd {
        com.xiaomi.push.bt btVar = this.f185a;
        if (btVar == null) {
            throw new cd("try send msg while connection is null.");
        }
        btVar.b(biVar);
    }

    @Override // com.xiaomi.push.bv
    public void a(com.xiaomi.push.bt btVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
    }

    @Override // com.xiaomi.push.bv
    public void a(com.xiaomi.push.bt btVar, int i2, Exception exc) {
        if (j()) {
            return;
        }
        a(false);
    }

    @Override // com.xiaomi.push.bv
    public void a(com.xiaomi.push.bt btVar, Exception exc) {
        d(false);
        if (j()) {
            return;
        }
        a(false);
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j2) {
        try {
            this.f196a.a(jVar, j2);
        } catch (IllegalStateException e2) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("can't execute job err = " + e2.getMessage());
        }
    }

    public void a(n nVar) {
        synchronized (this.f198a) {
            this.f198a.add(nVar);
        }
    }

    public void a(az.b bVar) {
        if (bVar != null) {
            long jA = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.m3434a("schedule rebind job in " + (jA / 1000));
            a(new b(bVar), jA);
        }
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        az.b bVarA = az.a().a(str, str2);
        if (bVarA != null) {
            a(new s(bVarA, i2, str4, str3));
        }
        az.a().m3829a(str, str2);
    }

    public void a(String str, byte[] bArr, boolean z) {
        Collection<az.b> collectionA = az.a().a("5");
        if (collectionA.isEmpty()) {
            if (!z) {
                return;
            }
        } else if (collectionA.iterator().next().j == az.c.binded) {
            a(new m0(this, 4, str, bArr));
            return;
        } else if (!z) {
            return;
        }
        u.b(str, bArr);
    }

    public void a(boolean z) {
        this.f194a.c(z);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            u.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.b.m3434a("register request without payload");
            return;
        }
        dq dqVar = new dq();
        try {
            ee.a(dqVar, bArr);
            if (dqVar.a == cz.Registration) {
                du duVar = new du();
                try {
                    ee.a(duVar, dqVar.m3707a());
                    a(new com.xiaomi.push.service.t(this, dqVar.b(), duVar.b(), duVar.c(), bArr));
                } catch (ej e2) {
                    com.xiaomi.channel.commonutils.logger.b.d("app register error. " + e2);
                    u.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                u.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.m3434a("register request with invalid payload");
            }
        } catch (ej e3) {
            com.xiaomi.channel.commonutils.logger.b.d("app register fail. " + e3);
            u.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    public void a(bi[] biVarArr) throws cd {
        com.xiaomi.push.bt btVar = this.f185a;
        if (btVar == null) {
            throw new cd("try send msg while connection is null.");
        }
        btVar.a(biVarArr);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3805a() throws JSONException, IOException {
        String str;
        com.xiaomi.push.service.a aVarA = com.xiaomi.push.service.a.a(getApplicationContext());
        String string = "";
        boolean zM3426a = com.xiaomi.channel.commonutils.android.f.m3426a();
        boolean z = false;
        if (com.xiaomi.channel.commonutils.android.f.m3426a()) {
            string = aVarA.a();
            com.xiaomi.channel.commonutils.logger.b.m3434a("region of cache is " + string);
            if (TextUtils.isEmpty(string)) {
                String strB = b();
                String strName = com.xiaomi.channel.commonutils.android.f.a(strB).name();
                aVarA.a(strName);
                aVarA.b(strB);
                string = strName;
            } else {
                a(aVarA);
            }
        } else {
            try {
                Bundle bundleCall = getContentResolver().call(MIPushProvider.a(this), "getUserRegion", (String) null, (Bundle) null);
                if (bundleCall != null) {
                    string = bundleCall.getString("user_region");
                    if (!TextUtils.isEmpty(string)) {
                        zM3426a = true;
                        z = bundleCall.getBoolean("req_hosts");
                        String strB2 = com.xiaomi.channel.commonutils.android.f.b(string);
                        aVarA.a(string);
                        aVarA.b(strB2);
                        if (z) {
                            getContentResolver().call(MIPushProvider.a(this), "reset_req_hosts", (String) null, (Bundle) null);
                        }
                    }
                    com.xiaomi.channel.commonutils.logger.b.m3434a("current region is: " + string);
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("set region error: " + e2);
            }
        }
        if (TextUtils.isEmpty(string)) {
            if (PkgNameConstants.XMSF.equals(getPackageName())) {
                string = Region.Global.name();
            }
        } else if (Region.Global.name().equals(string)) {
            bu.a("app.chat.global.xiaomi.net");
        } else {
            if (Region.Europe.name().equals(string)) {
                str = "fr.app.chat.global.xiaomi.net";
            } else if (Region.Russia.name().equals(string)) {
                str = "ru.app.chat.global.xiaomi.net";
            } else if (Region.India.name().equals(string)) {
                str = "idmb.app.chat.global.xiaomi.net";
            }
            bu.a(str);
        }
        if (Region.Global.name().equals(string)) {
            bu.a("app.chat.global.xiaomi.net");
        }
        b(z);
        a(string);
        return zM3426a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3806a(int i2) {
        return this.f196a.m3835a(i2);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public com.xiaomi.push.service.j m3807b() {
        return this.f195a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3808b() {
        com.xiaomi.push.service.n.a(getApplicationContext()).d();
        Iterator it2 = new ArrayList(this.f198a).iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).a();
        }
    }

    @Override // com.xiaomi.push.bv
    public void b(com.xiaomi.push.bt btVar) {
        d(true);
        this.f194a.b();
        if (!bc.m3594a() && !j()) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("reconnection successful, reactivate alarm.");
            bc.a(true);
        }
        Iterator<az.b> it2 = az.a().m3825a().iterator();
        while (it2.hasNext()) {
            a(new b(it2.next()));
        }
        if (this.f200a || !com.xiaomi.channel.commonutils.android.f.m3427a(getApplicationContext())) {
            return;
        }
        com.xiaomi.push.o.a(getApplicationContext()).a(new q0(this));
    }

    public void b(j jVar) {
        this.f196a.a(jVar.a, jVar);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public boolean m3809b() {
        boolean zM3842a = com.xiaomi.push.y.m3842a((Context) this);
        boolean z = az.a().m3824a() > 0;
        boolean z2 = !m3810c();
        boolean zM3801i = m3801i();
        boolean z3 = !m3800h();
        boolean z4 = zM3842a && z && z2 && zM3801i && z3;
        if (!z4) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(zM3842a), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(zM3801i), Boolean.valueOf(z3)));
        }
        return z4;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public boolean m3810c() {
        try {
            Class<?> clsA = com.xiaomi.channel.commonutils.android.k.a(this, "miui.os.Build");
            return clsA.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean(null) || clsA.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean(null) || clsA.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean(null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean m3811d() {
        com.xiaomi.push.bt btVar = this.f185a;
        return btVar != null && btVar.m3610c();
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public boolean m3812e() {
        com.xiaomi.push.bt btVar = this.f185a;
        return btVar != null && btVar.m3609b();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f183a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] strArrSplit;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.b.a(getApplicationContext());
        com.xiaomi.channel.commonutils.android.k.a((Context) this);
        com.xiaomi.push.service.q qVarA = com.xiaomi.push.service.r.a((Context) this);
        if (qVarA != null) {
            com.xiaomi.push.j.a(qVarA.a);
        }
        l0 l0Var = null;
        if (com.xiaomi.channel.commonutils.android.f.m3427a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f188a = new a(this, l0Var);
            registerReceiver(this.f188a, new IntentFilter(bd.q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler);
            b = true;
            handler.post(new r0(this));
        }
        this.f183a = new Messenger(new s0(this));
        be.a(this);
        t0 t0Var = new t0(this, null, 5222, "xiaomi.com", null);
        this.f186a = t0Var;
        t0Var.a(true);
        this.f184a = new com.xiaomi.push.bp(this, this.f186a);
        this.f195a = m3803a();
        bc.a(this);
        this.f184a.a(this);
        this.f193a = new ax(this);
        this.f194a = new d0(this);
        new com.xiaomi.push.service.k().a();
        this.f196a = new com.xiaomi.push.service.o("Connection Controller Thread");
        az azVarA = az.a();
        azVarA.b();
        azVarA.a(new u0(this));
        if (l()) {
            h();
        }
        a(new bv(this));
        if (com.xiaomi.channel.commonutils.android.f.m3427a((Context) this)) {
            a(new ay());
        }
        a(new h());
        this.f199a.add(bp.a(this));
        if (m3801i()) {
            this.f189a = new f();
            registerReceiver(this.f189a, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        }
        if (com.xiaomi.channel.commonutils.android.f.m3427a(getApplicationContext())) {
            this.f192a = new t();
            registerReceiver(this.f192a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null);
            k kVar = new k();
            this.f190a = kVar;
            registerReceiver(kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null);
        }
        com.xiaomi.push.service.n.a(getApplicationContext()).m3833a();
        if (PkgNameConstants.XMSF.equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f182a = new v0(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f182a);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.d("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] iArrM3796a = m3796a();
            if (iArrM3796a != null) {
                this.f191a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f191a, intentFilter);
                this.a = iArrM3796a[0];
                this.f201b = iArrM3796a[1];
                com.xiaomi.channel.commonutils.logger.b.m3434a("falldown initialized: " + this.a + "," + this.f201b);
            }
        }
        String str = "";
        if (qVarA != null) {
            try {
                if (!TextUtils.isEmpty(qVarA.f209a) && (strArrSplit = qVarA.f209a.split("@")) != null && strArrSplit.length > 0) {
                    str = strArrSplit[0];
                }
            } catch (Exception unused) {
            }
        }
        com.xiaomi.channel.commonutils.logger.b.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.channel.commonutils.android.a.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f189a;
        if (fVar != null) {
            a(fVar);
            this.f189a = null;
        }
        t tVar = this.f192a;
        if (tVar != null) {
            a(tVar);
            this.f192a = null;
        }
        k kVar = this.f190a;
        if (kVar != null) {
            a(kVar);
            this.f190a = null;
        }
        r rVar = this.f191a;
        if (rVar != null) {
            a(rVar);
            this.f191a = null;
        }
        a aVar = this.f188a;
        if (aVar != null) {
            a(aVar);
            this.f188a = null;
        }
        if (PkgNameConstants.XMSF.equals(getPackageName()) && this.f182a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f182a);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f199a.clear();
        this.f196a.b();
        a(new n0(this, 2));
        a(new l());
        az.a().b();
        az.a().a(this, 15);
        az.a().m3827a();
        this.f184a.b(this);
        bn.a().g();
        bc.a();
        i();
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.m3434a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        i iVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            try {
                com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), intent.getStringExtra(bd.u), intent.getStringExtra(bd.C), intent.getStringExtra("mipush_app_package")));
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f196a.m3834a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    az.a().a(this, 14);
                    stopSelf();
                } else {
                    iVar = new i(intent);
                    a(iVar);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                iVar = new i(intent);
                a(iVar);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.b.c("[Prefs] spend " + jCurrentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }
}
