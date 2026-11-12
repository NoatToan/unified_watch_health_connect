package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public class kvs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zxs f24353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kd f24354b;
    public OpenAppModule c;
    public Handler d;
    public HandlerThread e;
    public ConditionVariable f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                kvs.this.h();
            } else if (i == 1) {
                kvs.this.a((b) message.obj);
            } else {
                if (i != 2) {
                    return;
                }
                kvs.this.f();
            }
        }
    }

    public interface b {
        void onHeartRateChanged(int i);

        void onOpen(boolean z);
    }

    public kvs(jet jetVar) {
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.f24353a = new zxs(jetVar);
        c();
    }

    public final void c() {
        HandlerThread handlerThread = new HandlerThread("HMHeartRateController");
        this.e = handlerThread;
        handlerThread.start();
        this.d = new a(this.e.getLooper());
    }

    public void d() {
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public boolean e() {
        t5t.d("HMHeartRateController", "stopManualMeasure");
        this.h = true;
        ConditionVariable conditionVariable = this.f;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
        return true;
    }

    public final boolean f() {
        t5t.d("HMHeartRateController", "stopRealtimeMeasure");
        OpenAppModule openAppModule = this.c;
        boolean zSendRealtimeHrState = openAppModule != null ? openAppModule.sendRealtimeHrState(aq.STOP) : this.f24353a.h(jg.a.b.f22754b, jg.b.a.f22757b);
        this.i = false;
        this.d.removeMessages(0);
        if (this.c != null) {
            this.f24353a.j();
        } else {
            this.f24353a.f();
        }
        this.c = null;
        this.f24353a.o();
        t5t.d("HMHeartRateController", "stopRealtimeMeasure out");
        return zSendRealtimeHrState;
    }

    public void g() {
        this.d.removeMessages(1);
        this.d.removeMessages(2);
        this.d.sendEmptyMessage(2);
    }

    public final void h() {
        Handler handler;
        OpenAppModule openAppModule = this.c;
        t5t.d("HMHeartRateController", "watchDog ret:" + (openAppModule != null ? openAppModule.sendRealtimeHrState(aq.KEEP) : this.f24353a.k()));
        if (!this.i || (handler = this.d) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 10000L);
    }

    public synchronized boolean b(boolean z) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return a(jg.a.c.f22755b, z ? jg.b.C0982b.f22758b : jg.b.a.f22757b, 0);
    }

    public synchronized boolean a(boolean z, int i) {
        jg.a.c cVar;
        jg.b.a aVar;
        cVar = jg.a.c.f22755b;
        aVar = jg.b.a.f22757b;
        if (!z) {
            i = 0;
        }
        return a(cVar, aVar, i);
    }

    public synchronized boolean a(boolean z) {
        if (!this.f24353a.m()) {
            t5t.d("HMHeartRateController", "profile init failed!!!");
            return false;
        }
        boolean zH = this.f24353a.h(jg.a.C0981a.f22753b, z ? jg.b.C0982b.f22758b : jg.b.a.f22757b);
        t5t.d("HMHeartRateController", "atrial op ret :" + zH);
        this.f24353a.f();
        return zH;
    }

    public synchronized boolean b(boolean z, int i) {
        jg.a.c cVar;
        jg.b bVar;
        try {
            cVar = jg.a.c.f22755b;
            bVar = z ? jg.b.C0982b.f22758b : jg.b.a.f22757b;
            if (!z) {
                i = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(cVar, bVar, i);
    }

    public kvs(jet jetVar, kd kdVar) {
        this(jetVar);
        this.f24354b = kdVar;
    }

    public synchronized HeartRateConfig b() {
        if (!this.f24353a.m()) {
            return null;
        }
        HeartRateConfig heartRateConfigL = this.f24353a.l();
        this.f24353a.f();
        return heartRateConfigL;
    }

    public final boolean a(jg.a aVar, jg.b bVar, int i) {
        if (!this.f24353a.m()) {
            t5t.d("HMHeartRateController", "profile init failed!!!");
            return false;
        }
        t5t.d("HMHeartRateController", "setHeartRateMode mode:" + aVar + ",operation:" + bVar + ",ret:" + this.f24353a.h(aVar, bVar));
        boolean zG = this.f24353a.g(i);
        StringBuilder sb = new StringBuilder();
        sb.append("setRealtimeHeartRateInterval interval:");
        sb.append(i);
        sb.append(",ret:");
        sb.append(zG);
        t5t.d("HMHeartRateController", sb.toString());
        this.f24353a.f();
        return zG;
    }

    public void b(b bVar) {
        this.d.removeMessages(1);
        this.d.removeMessages(2);
        Message message = new Message();
        message.what = 1;
        message.obj = bVar;
        this.d.sendMessage(message);
    }

    public synchronized boolean a(int i) {
        if (!this.f24353a.m()) {
            return false;
        }
        boolean zG = this.f24353a.g(i);
        t5t.d("HMHeartRateController", "setRealtimeHeartRateInterval:" + i + ",ret:" + zG);
        this.f24353a.f();
        return zG;
    }

    public final boolean a(final b bVar) {
        boolean zH;
        t5t.d("HMHeartRateController", "startRealtimeMeasure");
        kd kdVar = this.f24354b;
        if (kdVar != null && this.c == null && kdVar.a(29)) {
            this.c = (OpenAppModule) this.f24354b.y(OpenAppModule.class);
        }
        if (this.c == null ? !this.f24353a.m() : !this.f24353a.n()) {
            t5t.d("HMHeartRateController", "init profile failed!!!");
            bVar.onOpen(false);
            return false;
        }
        OpenAppModule openAppModule = this.c;
        if (openAppModule != null) {
            zH = openAppModule.sendRealtimeHrState(aq.OPEN);
        } else {
            zH = this.f24353a.h(jg.a.b.f22754b, jg.b.C0982b.f22758b);
        }
        if (!zH) {
            t5t.d("HMHeartRateController", "return as command failed!!!");
            if (this.c != null) {
                this.f24353a.j();
                this.c = null;
            } else {
                this.f24353a.f();
            }
            bVar.onOpen(false);
            return false;
        }
        bVar.onOpen(true);
        this.f24353a.d(new zxs.a() { // from class: jvs
            @Override // zxs.a
            public final void onHeartRateChanged(int i) {
                kvs.a(bVar, i);
            }
        });
        this.i = true;
        this.d.sendEmptyMessageDelayed(0, 10000L);
        t5t.d("HMHeartRateController", "startRealtimeMeasure out");
        return true;
    }

    public static /* synthetic */ void a(b bVar, int i) {
        t5t.d("HMHeartRateController", "HR_Log Realtime:" + i + "(" + Calendar.getInstance().getTime() + ")");
        if (bVar != null) {
            bVar.onHeartRateChanged(i);
        }
    }

    public void a() {
        this.i = false;
        this.d.removeCallbacksAndMessages(null);
        e();
    }
}
