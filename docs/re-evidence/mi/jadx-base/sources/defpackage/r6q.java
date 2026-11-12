package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.duokan.airkan.common.aidl.ParcelDeviceData;
import com.duokan.airkan.common.aidl.ParcelService;
import com.example.statistics.export.OneTrackConstant;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes11.dex */
public class r6q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f32252r = "r6q";
    public final Context h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, zzc> f32253a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, String> f32254b = new Hashtable();
    public kyl c = new kyl();
    public kyl d = new kyl();
    public Map<String, e7q> e = new Hashtable();
    public myl f = new myl();
    public t6q g = null;
    public String i = "";
    public TimerTask j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Timer f32255k = null;
    public Handler l = null;
    public byte[] m = new byte[0];
    public BroadcastReceiver n = new h();
    public BroadcastReceiver o = new i();
    public BroadcastReceiver p = new j();
    public BroadcastReceiver q = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = r6q.f32252r;
            if (!intent.getAction().equals("com.duokan.duokantv.DEVICE_NAME_CHANGED")) {
                String unused2 = r6q.f32252r;
                return;
            }
            String unused3 = r6q.f32252r;
            r6q.this.d.f24425a = n6q.b(r6q.this.h);
            r6q.this.y();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            r6q.this.l = new Handler();
            r6q.this.v();
            Looper.loop();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r6q.this.l.getLooper().quit();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = r6q.f32252r;
            r6q.this.R();
            String unused2 = r6q.f32252r;
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = r6q.f32252r;
            r6q.this.O();
            String unused2 = r6q.f32252r;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String unused = r6q.f32252r;
            r6q.this.q();
            String unused2 = r6q.f32252r;
        }
    }

    public class g extends TimerTask {
        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            r6q.this.n();
        }
    }

    public class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = r6q.f32252r;
            if (1 != intent.getIntExtra("eth_state", -1)) {
                String unused2 = r6q.f32252r;
            } else {
                String unused3 = r6q.f32252r;
                r6q.this.u();
            }
        }
    }

    public class i extends BroadcastReceiver {
        public i() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = r6q.f32252r;
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null || !networkInfo.isConnected()) {
                String unused2 = r6q.f32252r;
            } else {
                String unused3 = r6q.f32252r;
                r6q.this.u();
            }
        }
    }

    public class j extends BroadcastReceiver {
        public j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String unused = r6q.f32252r;
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                String unused2 = r6q.f32252r;
            } else {
                String unused3 = r6q.f32252r;
                r6q.this.Q();
            }
        }
    }

    public r6q(Context context) {
        this.h = context;
    }

    public final void A() {
        if (this.h != null) {
            D();
            I();
            F();
            C();
        }
    }

    public int B(int i2, zzc zzcVar) {
        this.f32253a.put(Integer.valueOf(i2), zzcVar);
        return 0;
    }

    public final void C() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.duokan.duokantv.DEVICE_NAME_CHANGED");
        intentFilter.setPriority(Integer.MAX_VALUE);
        this.h.registerReceiver(this.q, intentFilter);
    }

    public final void D() {
        this.h.registerReceiver(this.n, new IntentFilter("android.net.ethernet.ETH_STATE_CHANGED"));
    }

    public int E(int i2, String str) {
        String str2 = this.f32254b.get(Integer.valueOf(i2));
        String str3 = i2 + "=" + str;
        String str4 = String.format("%c%s", Integer.valueOf(str3.length()), str3);
        if (str4.equals(str2)) {
            return -1;
        }
        this.f32254b.put(Integer.valueOf(i2), str4);
        y();
        return 0;
    }

    public final void F() {
        this.h.registerReceiver(this.p, new IntentFilter("android.intent.action.SCREEN_ON"));
    }

    public int G(int i2, ParcelService parcelService) {
        kyl kylVar = new kyl(parcelService);
        if (this.f.b(kylVar) != null) {
            return -1;
        }
        this.f.a(kylVar);
        t6q t6qVar = this.g;
        if (t6qVar == null) {
            return -1;
        }
        t6qVar.o(kylVar);
        return 0;
    }

    public int H(int i2, String str) {
        e7q e7qVar = this.e.get(str);
        if (e7qVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" now listened, no need regist");
            e7qVar.d(i2, this.f32253a.get(Integer.valueOf(i2)));
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" not listened, Try to regist!");
        e7q e7qVar2 = new e7q(str);
        e7qVar2.d(i2, this.f32253a.get(Integer.valueOf(i2)));
        this.e.put(str, e7qVar2);
        t6q t6qVar = this.g;
        if (t6qVar != null) {
            t6qVar.p(str);
        }
        return 0;
    }

    public final void I() {
        this.h.registerReceiver(this.o, new IntentFilter("android.net.wifi.STATE_CHANGE"));
    }

    public final void J() {
        Context context = this.h;
        if (context != null) {
            context.unregisterReceiver(this.n);
            this.h.unregisterReceiver(this.o);
            this.h.unregisterReceiver(this.p);
            this.h.unregisterReceiver(this.q);
        }
    }

    public int K(int i2) {
        this.f32254b.remove(Integer.valueOf(i2));
        return 0;
    }

    public int L(int i2, String str) {
        String str2 = i2 + "=" + str;
        if (!String.format("%c%s", Integer.valueOf(str2.length()), str2).equals(this.f32254b.get(Integer.valueOf(i2)))) {
            return -1;
        }
        this.f32254b.remove(Integer.valueOf(i2));
        y();
        return 0;
    }

    public int M(int i2, ParcelService parcelService) {
        kyl kylVar = new kyl(parcelService);
        if (this.f.b(kylVar) == null) {
            return -1;
        }
        this.f.e(kylVar);
        t6q t6qVar = this.g;
        if (t6qVar == null) {
            return -1;
        }
        t6qVar.q(kylVar);
        return 0;
    }

    public int N(int i2, String str) {
        e7q e7qVar = this.e.get(str);
        if (e7qVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not listened, No need remove");
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" is listening, Try to remove!");
        e7qVar.e(i2);
        if (e7qVar.b()) {
            this.e.remove(str);
            t6q t6qVar = this.g;
            if (t6qVar != null) {
                t6qVar.r(str);
            }
        }
        return 0;
    }

    public final void O() {
        synchronized (this.m) {
            try {
                t6q t6qVar = this.g;
                if (t6qVar == null) {
                    t6q t6qVar2 = new t6q(this.h, this);
                    this.g = t6qVar2;
                    t6qVar2.start();
                    if (!s()) {
                        return;
                    }
                    y();
                    z();
                    x();
                } else {
                    t6qVar.s();
                    y();
                    z();
                    x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void P() {
        r();
        A();
        new Thread(new b()).start();
    }

    public final void Q() {
        p();
        this.j = new g();
        try {
            Timer timer = new Timer();
            this.f32255k = timer;
            timer.schedule(this.j, 20000L, 60000L);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e2.toString());
        }
    }

    public final void R() {
        synchronized (this.m) {
            try {
                t6q t6qVar = this.g;
                if (t6qVar == null) {
                    t6q t6qVar2 = new t6q(this.h, this);
                    this.g = t6qVar2;
                    t6qVar2.start();
                    if (!s()) {
                        return;
                    }
                    y();
                    z();
                    x();
                } else {
                    t6qVar.s();
                    y();
                    z();
                    x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.h.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        t6q t6qVar = this.g;
        if (t6qVar == null) {
            v();
        } else {
            if (t6qVar.k()) {
                return;
            }
            u();
        }
    }

    public void o() {
        J();
        p();
        t();
        this.l.post(new c());
    }

    public final void p() {
        if (this.f32255k != null) {
            this.j.cancel();
            this.f32255k.cancel();
            this.f32255k.purge();
            this.f32255k = null;
            this.j = null;
        }
    }

    public final void q() {
        synchronized (this.m) {
            t6q t6qVar = this.g;
            if (t6qVar != null) {
                t6qVar.n();
                try {
                    this.g.join();
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception: ");
                    sb.append(e2.toString());
                }
                this.g = null;
            }
        }
    }

    public final void r() {
        this.d.f24425a = n6q.b(this.h);
        kyl kylVar = this.d;
        kylVar.f24426b = "_milink._tcp.local.";
        kylVar.c = 6093;
        kylVar.d = new String[]{"127.0.0.1"};
        this.c.f24425a = n6q.b(this.h);
        kyl kylVar2 = this.c;
        kylVar2.f24426b = "_milink._tcp.local.";
        kylVar2.c = 6093;
        kylVar2.d = new String[]{"127.0.0.1"};
        String str = "mac=" + n6q.c();
        this.i = String.format("%c%s%c%s%c%s", Integer.valueOf(str.length()), str, 8, "tcp=6093", 8, "udp=6094");
    }

    public final boolean s() {
        int i2 = 1;
        while (true) {
            t6q t6qVar = this.g;
            if (t6qVar == null || t6qVar.l()) {
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e2.toString());
            }
            if (i2 > 20) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public final void t() {
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new f());
        }
    }

    public final void u() {
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public final void v() {
        Handler handler = this.l;
        if (handler != null) {
            handler.post(new d());
        }
    }

    public int w(String str, List<ParcelDeviceData> list) {
        e7q e7qVar = this.e.get(str);
        if (e7qVar != null) {
            e7qVar.c(list);
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" not listened, query failed!");
        return -1;
    }

    public final void x() {
        if (this.g != null) {
            Iterator<e7q> it = this.e.values().iterator();
            while (it.hasNext()) {
                this.g.p(it.next().a());
            }
        }
    }

    public final void y() {
        t6q t6qVar = this.g;
        if (t6qVar != null) {
            t6qVar.q(this.c);
            if (this.f32254b.isEmpty()) {
                return;
            }
            this.d.f = this.i;
            Iterator<String> it = this.f32254b.values().iterator();
            String str = "feature=";
            while (it.hasNext()) {
                str = str + it.next();
            }
            StringBuilder sb = new StringBuilder();
            kyl kylVar = this.d;
            sb.append(kylVar.f);
            sb.append(String.format("%c%s", Integer.valueOf(str.length()), str));
            kylVar.f = sb.toString();
            kyl kylVar2 = new kyl();
            this.c = kylVar2;
            kylVar2.f24425a = new String(this.d.f24425a);
            this.c.f24426b = new String(this.d.f24426b);
            kyl kylVar3 = this.c;
            kyl kylVar4 = this.d;
            kylVar3.c = kylVar4.c;
            kylVar3.d = new String[]{"127.0.0.1"};
            kylVar3.f = new String(kylVar4.f);
            this.g.o(this.d);
        }
    }

    public final void z() {
        if (this.g != null) {
            Iterator<kyl> it = this.f.d().iterator();
            while (it.hasNext()) {
                this.g.o(it.next());
            }
        }
    }
}
