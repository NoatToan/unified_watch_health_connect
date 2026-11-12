package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class hvo extends cvo {
    public final Object o;

    @GuardedBy("mObjectLock")
    public List<DeferrableSurface> p;

    @GuardedBy("mObjectLock")
    public lhe<Void> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0a f20524r;
    public final r3r s;
    public final k0a t;

    public hvo(lgi lgiVar, lgi lgiVar2, pk3 pk3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(pk3Var, executor, scheduledExecutorService, handler);
        this.o = new Object();
        this.f20524r = new l0a(lgiVar, lgiVar2);
        this.s = new r3r(lgiVar);
        this.t = new k0a(lgiVar2);
    }

    public void M(String str) {
        zpe.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final /* synthetic */ void N() {
        M("Session call super.close()");
        super.close();
    }

    public final /* synthetic */ void O(wuo wuoVar) {
        super.q(wuoVar);
    }

    public final /* synthetic */ lhe P(CameraDevice cameraDevice, pyl pylVar, List list) {
        return super.l(cameraDevice, pylVar, list);
    }

    public final /* synthetic */ int Q(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.j(captureRequest, captureCallback);
    }

    @Override // defpackage.cvo, defpackage.wuo
    public void close() {
        M("Session call close()");
        this.s.f();
        this.s.c().addListener(new Runnable() { // from class: fvo
            @Override // java.lang.Runnable
            public final void run() {
                this.f18302a.N();
            }
        }, c());
    }

    @Override // defpackage.cvo, defpackage.wuo
    public lhe<Void> h() {
        return this.s.c();
    }

    @Override // defpackage.cvo, defpackage.wuo
    public int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.s.h(captureRequest, captureCallback, new r3r.c() { // from class: dvo
            @Override // r3r.c
            public final int a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                return this.f15978a.Q(captureRequest2, captureCallback2);
            }
        });
    }

    @Override // defpackage.cvo, ivo.b
    public lhe<List<Surface>> k(List<DeferrableSurface> list, long j) {
        lhe<List<Surface>> lheVarK;
        synchronized (this.o) {
            this.p = list;
            lheVarK = super.k(list, j);
        }
        return lheVarK;
    }

    @Override // defpackage.cvo, ivo.b
    public lhe<Void> l(CameraDevice cameraDevice, pyl pylVar, List<DeferrableSurface> list) {
        lhe<Void> lheVarJ;
        synchronized (this.o) {
            lhe<Void> lheVarG = this.s.g(cameraDevice, pylVar, list, this.f14779b.e(), new r3r.b() { // from class: gvo
                @Override // r3r.b
                public final lhe a(CameraDevice cameraDevice2, pyl pylVar2, List list2) {
                    return this.f19378a.P(cameraDevice2, pylVar2, list2);
                }
            });
            this.q = lheVarG;
            lheVarJ = oua.j(lheVarG);
        }
        return lheVarJ;
    }

    @Override // defpackage.cvo, wuo.a
    public void o(wuo wuoVar) {
        synchronized (this.o) {
            this.f20524r.a(this.p);
        }
        M("onClosed()");
        super.o(wuoVar);
    }

    @Override // defpackage.cvo, wuo.a
    public void q(wuo wuoVar) {
        M("Session onConfigured()");
        this.t.c(wuoVar, this.f14779b.f(), this.f14779b.d(), new k0a.a() { // from class: evo
            @Override // k0a.a
            public final void a(wuo wuoVar2) {
                this.f17116a.O(wuoVar2);
            }
        });
    }

    @Override // defpackage.cvo, ivo.b
    public boolean stop() {
        boolean zStop;
        synchronized (this.o) {
            try {
                if (B()) {
                    this.f20524r.a(this.p);
                } else {
                    lhe<Void> lheVar = this.q;
                    if (lheVar != null) {
                        lheVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
