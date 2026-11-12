package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;

/* JADX INFO: loaded from: classes3.dex */
public class igt implements tgt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tgt f21125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f21126b;
    public HandlerThread c;
    public p7t d;
    public c e;
    public boolean f;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kvs f21127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f21128b = false;
        public final /* synthetic */ jet c;
        public final /* synthetic */ kd d;

        /* JADX INFO: renamed from: igt$a$a, reason: collision with other inner class name */
        public class C0964a implements kvs.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f21129a;

            public C0964a(ConditionVariable conditionVariable) {
                this.f21129a = conditionVariable;
            }

            @Override // kvs.b
            public void onHeartRateChanged(int i) {
            }

            @Override // kvs.b
            public void onOpen(boolean z) {
                a.this.f21128b = z;
                this.f21129a.open();
            }
        }

        public a(jet jetVar, kd kdVar) {
            this.c = jetVar;
            this.d = kdVar;
            this.f21127a = new kvs(jetVar, kdVar);
        }

        @Override // igt.c
        public void a() {
            if (this.f21128b) {
                this.f21128b = false;
                this.f21127a.g();
            }
        }

        @Override // igt.c
        public void c() {
            this.f21127a.d();
        }

        @Override // igt.c
        public void b() {
            if (this.f21128b) {
                return;
            }
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f21127a.b(new C0964a(conditionVariable));
            conditionVariable.block();
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                t5t.m("HMProSensorDataController", "MSG_WATCHDOG");
                igt.this.k();
                return;
            }
            if (i == 1) {
                igt.this.h((bft) message.obj);
                return;
            }
            if (i == 2) {
                d dVar = (d) message.obj;
                igt.this.b(dVar.f21133b, dVar.c, dVar.f21132a);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                igt.this.d.a((byte[]) message.obj);
            } else if (igt.this.f) {
                igt.this.f = false;
                CheckData checkDataI = igt.this.i();
                if (igt.this.d == null) {
                    return;
                }
                if (igt.this.d instanceof qr) {
                    ((qr) igt.this.d).a(checkDataI);
                } else {
                    igt.this.d.a(true);
                }
            }
        }
    }

    public interface c {
        void a();

        void b();

        void c();
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p7t f21132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21133b;
        public int c;
    }

    public igt(jet jetVar, kd kdVar) {
        this(a(jetVar, kdVar), jetVar);
    }

    public static c a(jet jetVar, kd kdVar) {
        return new a(jetVar, kdVar);
    }

    public final void b(int i, int i2, p7t p7tVar) {
        this.d = p7tVar;
        p7tVar.a();
        t5t.d("HMProSensorDataController", "in start...");
        if (!this.f21125a.n()) {
            t5t.d("HMProSensorDataController", "init profile failed!!!");
            this.d.a(false);
            return;
        }
        if (!this.f21125a.o(i, (byte) i2)) {
            t5t.d("HMProSensorDataController", "config profile failed!!!");
            this.d.a(false);
            return;
        }
        if ((i & vr.PPG.a()) != 0) {
            this.e.b();
        }
        if (!this.f21125a.p(this)) {
            t5t.d("HMProSensorDataController", "start profile failed!!!");
            this.d.a(false);
        } else {
            this.f = true;
            this.f21126b.removeMessages(0);
            this.f21126b.sendEmptyMessageDelayed(0, CreateRouteLoadingFragment.STYLE_LOADING_DURATION);
            t5t.d("HMProSensorDataController", "out start...");
        }
    }

    public void g() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void h(bft bftVar) {
        this.d.a(bftVar);
    }

    public CheckData i() {
        t5t.d("HMProSensorDataController", "in stop...");
        this.e.a();
        CheckData checkDataC = this.f21125a.C();
        Handler handler = this.f21126b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        t5t.d("HMProSensorDataController", "out stop...");
        return checkDataC;
    }

    public final void k() {
        t5t.m("HMProSensorDataController", "watchDog");
        if (!this.f21125a.J()) {
            t5t.d("HMProSensorDataController", "watchDog failed!!!");
        }
        Handler handler = this.f21126b;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(0, CreateRouteLoadingFragment.STYLE_LOADING_DURATION);
        }
    }

    public igt(c cVar, jet jetVar) {
        this(cVar, new tgt(jetVar));
    }

    @Override // tgt.b
    public void a(bft bftVar) {
        if (this.f21126b == null) {
            t5t.d("HMProSensorDataController", "onECGSensorData handler is null...");
            return;
        }
        Message message = new Message();
        message.what = 1;
        message.obj = bftVar;
        this.f21126b.sendMessage(message);
    }

    public igt(c cVar, tgt tgtVar) {
        this.d = null;
        this.f = false;
        this.e = cVar;
        this.f21125a = tgtVar;
        HandlerThread handlerThread = new HandlerThread("HMProSensorDataController");
        this.c = handlerThread;
        handlerThread.start();
        this.f21126b = new b(this.c.getLooper());
    }

    @Override // tgt.b
    public void a(byte[] bArr) {
        if (this.f21126b != null) {
            Message message = new Message();
            message.what = 4;
            message.obj = bArr;
            this.f21126b.sendMessage(message);
            return;
        }
        t5t.d("HMProSensorDataController", "onOriginData handler is null...");
    }

    @Override // tgt.b
    public boolean a() {
        p7t p7tVar = this.d;
        if (p7tVar instanceof qr) {
            return ((qr) p7tVar).b();
        }
        return false;
    }
}
