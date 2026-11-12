package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.duokan.airkan.rc_sdk.airkan.AirkanService;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class q6j {
    public static q6j j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static WeakReference<Context> f31168k = null;
    public static boolean l = false;
    public static boolean m = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cpc f31169a;
    public jkk d;
    public String e;
    public String f;
    public boolean h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f31170b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public ikk g = null;
    public final ServiceConnection i = new c();

    public class a implements cqc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31172b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ikk d;

        public a(String str, String str2, String str3, ikk ikkVar) {
            this.f31171a = str;
            this.f31172b = str2;
            this.c = str3;
            this.d = ikkVar;
        }

        @Override // defpackage.cqc
        public void a(int i, String str) {
            jpe.f("RCSDKManager", "onCheckFail code:" + i + " msg:" + str);
            this.d.a(i);
        }

        @Override // defpackage.cqc
        public void b(String str, String str2, boolean z) {
            jpe.f("RCSDKManager", "onCheckSuccess " + str2);
            jpe.h("RCSDKManager", "onCheckSuccess tvId:" + str + " airkanVersion:" + str2 + " auth:" + z);
            q6j.this.f = str;
            if (q6j.m && z) {
                q6j.this.f31169a.d(this.f31171a, true);
                return;
            }
            if (q6j.m) {
                q6j.this.f31169a.e(str, this.f31172b, this.f31171a, this.c, this.d);
                return;
            }
            jpe.f("RCSDKManager", "auth:" + z + " isInControlPage=false");
        }
    }

    public class b implements upc {
        public b() {
        }

        @Override // defpackage.upc
        public void onFail(int i, String str) {
            jpe.f("RCSDKManager", "cancelAuthority fail:" + i + " " + str);
        }

        @Override // defpackage.upc
        public void onSuccess() {
            jpe.f("RCSDKManager", "cancelAuthority success");
        }
    }

    public class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            jpe.h("RCSDKManager", "onServiceConnected");
            q6j.this.c.set(false);
            q6j.this.f31169a = ((cpc.a) iBinder).a();
            q6j.this.f31170b.set(true);
            q6j.this.r();
            jpe.h("RCSDKManager", "end bind airkan service,  " + System.currentTimeMillis());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            jpe.h("RCSDKManager", "onServiceDisconnected!");
            q6j.this.c.set(false);
            q6j.this.f31170b.set(false);
            q6j.this.f31169a = null;
            q6j.this.d.k(null);
        }
    }

    public class d implements cpc.b {
        public d() {
        }

        @Override // cpc.b
        public void a(String str, int i, boolean z) {
            jpe.h("RCSDKManager", "onConnectStart: ip:" + str);
        }

        @Override // cpc.b
        public void b(String str, boolean z, int i, boolean z2, ae4 ae4Var) {
            jpe.f("RCSDKManager", "onConnectEnd connected:" + z);
            if (z) {
                if (q6j.this.g != null) {
                    q6j.this.g.onConnectSuccess();
                }
            } else if (q6j.this.g != null) {
                if (ae4Var != null) {
                    q6j.this.g.a(ae4Var.a());
                } else {
                    q6j.this.g.a(-1);
                }
            }
        }
    }

    public static q6j m() {
        if (j == null) {
            synchronized (q6j.class) {
                try {
                    if (j == null) {
                        j = new q6j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static boolean p() {
        return l;
    }

    public void j(final String str, final String str2, final String str3, final ikk ikkVar) {
        Context context;
        jpe.h("RCSDKManager", "pre connect ip:" + this.e);
        jpe.f("RCSDKManager", "connect");
        this.e = str;
        jpe.h("RCSDKManager", "connect ip:" + str + "sdk init:" + this.h);
        if (!this.h) {
            ikkVar.a(-1008);
        }
        if (jpe.i() && (context = f31168k.get()) != null) {
            jpe.h("RCSDKManager", "local ip:" + ukg.b(context));
        }
        this.g = ikkVar;
        if (this.f31169a != null) {
            m = true;
            if (!TextUtils.equals(str3, "OldSportsHealth") && !TextUtils.equals(str3, "NewSportsHealth")) {
                this.f31169a.b(str, new AirkanService.k() { // from class: p6j
                    @Override // com.duokan.airkan.rc_sdk.airkan.AirkanService.k
                    public final void a(int i) {
                        this.f30064a.q(ikkVar, str, str2, str3, i);
                    }
                });
            } else {
                jpe.f("RCSDKManager", "OldSportsHealth connect");
                this.f31169a.d(str, true);
            }
        }
    }

    public void k() {
        jpe.f("RCSDKManager", "destroy");
        this.e = null;
        this.g = null;
        l();
        t();
        xzd.c().a();
        this.h = false;
    }

    public void l() {
        jpe.f("RCSDKManager", "disConnect");
        m = false;
        if (this.f31169a.a() != null) {
            this.f31169a.h();
            this.f31169a.a().d(new b());
        }
        sz0.o();
        cpc cpcVar = this.f31169a;
        if (cpcVar != null) {
            cpcVar.c();
        }
        this.e = null;
    }

    public jkk n() {
        return this.d;
    }

    public void o(Context context) {
        jpe.f("RCSDKManager", "init start");
        jpe.h("RCSDKManager", "version code:20");
        f31168k = new WeakReference<>(context.getApplicationContext());
        if (!this.f31170b.get() && this.c.compareAndSet(false, true)) {
            this.d = new jkk(context);
            s();
            pe4.a(2, 2, 10L, TimeUnit.SECONDS, "connect");
            jpe.f("RCSDKManager", "init end");
            this.h = true;
            return;
        }
        jpe.h("RCSDKManager", "bound:" + this.f31170b.get() + " mIsBinding:" + this.c.get());
    }

    public final /* synthetic */ void q(ikk ikkVar, String str, String str2, String str3, int i) {
        if (i >= 211) {
            ikkVar.isHighVersionCallback(true);
            l = true;
            this.f31169a.f(str, new a(str, str2, str3, ikkVar));
        } else {
            ikkVar.isHighVersionCallback(false);
            l = false;
            jpe.f("RCSDKManager", "airkanVersionLow connect");
            this.f31169a.d(str, true);
        }
    }

    public final void r() {
        this.d.k(this.f31169a);
        this.f31169a.registeonAirkanConnectListener(new d());
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.f31169a.d(this.e, true);
    }

    public final void s() {
        Context context = f31168k.get();
        if (context == null) {
            jpe.f("RCSDKManager", "startBindService context is null");
            return;
        }
        this.c.set(true);
        Intent intent = new Intent();
        intent.setClass(f31168k.get(), AirkanService.class);
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientid", "881fd5a8c94b4945b46527b07eca2431");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        bundle.putString("extra", jSONObject.toString());
        intent.putExtras(bundle);
        jpe.h("RCSDKManager", "start bind airkan service,  " + System.currentTimeMillis());
        context.bindService(intent, this.i, 1);
        jpe.f("RCSDKManager", "startBindService");
    }

    public final void t() {
        Context context;
        WeakReference<Context> weakReference = f31168k;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(f31168k.get(), AirkanService.class);
        if (this.f31170b.get()) {
            context.unbindService(this.i);
        }
        context.stopService(intent);
        this.c.set(false);
        this.f31169a = null;
        this.f31170b.set(false);
        jpe.f("RCSDKManager", "stopService end");
    }
}
