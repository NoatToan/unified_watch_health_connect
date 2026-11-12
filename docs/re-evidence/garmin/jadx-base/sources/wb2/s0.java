package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Observable;

/* JADX INFO: loaded from: classes11.dex */
public class s0 extends wb2.a implements la2.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f184129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f184130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HandlerThread f184131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f184132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f184133r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f184134t;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (s0.this.f184130o) {
                try {
                    s0 s0Var = s0.this;
                    if (s0Var.f184134t) {
                        long j8 = s0Var.f184129n;
                        if (j8 > 0 && j8 + 60000 > System.currentTimeMillis()) {
                            s0.this.f184132q.postDelayed(this, 60000L);
                            return;
                        }
                        if (s0.this.m()) {
                            s0.this.f183902a.error("Sync has been inactive for over 60 seconds. Clearing stuck sync.");
                            s0 s0Var2 = s0.this;
                            synchronized (s0Var2.f184133r) {
                            }
                            s0Var2.u();
                            g0 g0Var = s0Var2.f183907f;
                            n0 n0Var = (n0) g0Var;
                            n0Var.k(da2.j.FINISHED_WITH_FAILURE, s0Var2.k());
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public s0(y.b bVar, DeviceProfile deviceProfile, Context context, g0 g0Var) {
        super(bVar, deviceProfile, context, g0Var);
        this.f184129n = 0L;
        this.f184130o = new byte[0];
        HandlerThread handlerThread = new HandlerThread("TimeSyncStrategy_HandlerThread");
        this.f184131p = handlerThread;
        this.f184134t = false;
        z zVar = new z(context, g0Var);
        this.f184133r = zVar;
        zVar.addObserver(this);
        da2.d.c(this.f183906e).f58886a.b(this);
        handlerThread.start();
        this.f184132q = new Handler(handlerThread.getLooper());
    }

    @Override // wb2.a
    public final void c(Bundle bundle) {
        xb2.a aVar = ec2.e.f63798f;
        if (!ec2.e.e() || aVar == null) {
            return;
        }
        r.f().getClass();
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", (hy2.b.f86375c.get() ? h.SYNC_NOT_ENABLED : h.SYNC_STATUS_CHECK_FAILED).name());
        byte b14 = (byte) h().f184038a;
        k0 k0Var = new k0((b14 == ((byte) j.ALWAYS_SHOW_PROGRESS.f184038a) || b14 == ((byte) j.SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND.f184038a)) ? 2 : 1, 0L);
        if (this.f183905d != null) {
            long j8 = j();
            String deviceFullName = this.f183905d.getDeviceFullName();
            int f92745i = this.f183905d.getF92745i();
            int f92744h = this.f183905d.getF92744h();
            k0Var.f184047b = j8;
            k0Var.f184048c = deviceFullName;
            k0Var.f184049d = f92745i;
            k0Var.f184050e = f92744h;
        }
        aVar.b(k0Var, bundle);
    }

    @Override // wb2.a
    public final x d() {
        return null;
    }

    @Override // wb2.a
    public final Bundle e() {
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("extra.sync.result.is.successful", this.f184133r.I());
        bundle.putLong("extra.sync.result.finish.time", this.f183913l);
        return bundle;
    }

    @Override // wb2.a
    public final a0 f() {
        return null;
    }

    @Override // wb2.a
    public final boolean m() {
        boolean z14;
        synchronized (this.f184130o) {
            try {
                z14 = this.f184134t || this.f184133r.F();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z14) {
            this.f183902a.debug("isSyncInProgress: YES! syncStartBroadcasted=" + this.f184134t + "; isOperationRunning=" + this.f184133r.F());
        }
        return z14;
    }

    @Override // wb2.a
    public final void n(Intent intent) {
    }

    @Override // wb2.a
    public final void o(Observable observable, Object obj) {
        String action;
        if (observable == null || !(obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) obj;
        if (TextUtils.isEmpty(intent.getAction()) || (action = intent.getAction()) == null) {
            return;
        }
        synchronized (this.f184130o) {
            this.f184129n = System.currentTimeMillis();
        }
        if (action.equals("com.garmin.android.lib.sync.DeviceSyncTime.action.ACTION_EXECUTED")) {
            u();
            boolean zI = this.f184133r.I();
            g0 g0Var = this.f183907f;
            if (zI) {
                ((n0) g0Var).k(da2.j.FINISHED_WITH_SUCCESS, k());
            } else {
                ((n0) g0Var).k(da2.j.FINISHED_WITH_FAILURE, k());
            }
        }
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (k().equals(hVar.f111673a.getMacAddress())) {
            boolean zM = m();
            z zVar = this.f184133r;
            Logger logger = this.f183902a;
            if (zM) {
                logger.warn("Device disconnected while sync in progress. Fail sync and then cleanup");
                zVar.M();
                u();
            } else {
                logger.debug("Device disconnected while sync isn't running. Cleanup strategy");
            }
            this.f184132q.removeCallbacksAndMessages(null);
            this.f184131p.quit();
            this.f183914m.shutdown();
            this.f183908g.set(true);
            da2.d.c(this.f183906e).f58886a.i(this);
            zVar.T();
        }
    }

    @Override // wb2.a
    public final void p(long j8, j jVar, String str) {
        q(j8, jVar, str, "Normal");
    }

    @Override // wb2.a
    public final void q(long j8, j jVar, String str, String str2) {
        this.f183902a.info("***** TIME SYNC STARTED!!! *****");
        this.f183902a.info("ProgressVisibility=" + jVar + ", supplied downloadBitMask=" + j8);
        if (jVar == null) {
            jVar = j.ALWAYS_SHOW_PROGRESS;
        }
        this.f183909h = jVar;
        this.f183910i = str;
        this.f183913l = -1L;
        synchronized (this.f184130o) {
            this.f184134t = true;
            this.f184129n = System.currentTimeMillis();
        }
        b();
        this.f184132q.postDelayed(new a(), 60000L);
        this.f184133r.A(this.f183905d);
        this.f184133r.execute();
    }

    public final void u() {
        Bundle bundle;
        synchronized (this.f184130o) {
            try {
                bundle = null;
                this.f184132q.removeCallbacksAndMessages(null);
                if (this.f184134t) {
                    this.f183913l = System.currentTimeMillis();
                    bundle = new Bundle();
                    this.f184133r.b(bundle);
                    c(bundle);
                    this.f184134t = false;
                    this.f184129n = 0L;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (bundle != null) {
            a(bundle);
            this.f183902a.info("***** TIME SYNC FINISHED!!! *****");
        }
    }
}
