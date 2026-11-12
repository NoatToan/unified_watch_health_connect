package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@dj8
public final class oc3 {
    public final dd3 c;
    public final Executor d;
    public cb3.a<Void> g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28986a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28987b = false;
    public final Object e = new Object();

    @GuardedBy("mLock")
    public pe3.a f = new pe3.a();
    public final dd3.c h = new dd3.c() { // from class: kc3
        @Override // dd3.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            return this.f23706a.q(totalCaptureResult);
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public oc3(dd3 dd3Var, Executor executor) {
        this.c = dd3Var;
        this.d = executor;
    }

    public lhe<Void> g(hk3 hk3Var) {
        h(hk3Var);
        return oua.j(cb3.a(new cb3.c() { // from class: ic3
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f20991a.n(aVar);
            }
        }));
    }

    public final void h(hk3 hk3Var) {
        synchronized (this.e) {
            try {
                for (Config.a<?> aVar : hk3Var.h()) {
                    this.f.a().z(aVar, hk3Var.a(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lhe<Void> i() {
        j();
        return oua.j(cb3.a(new cb3.c() { // from class: lc3
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f24890a.p(aVar);
            }
        }));
    }

    public final void j() {
        synchronized (this.e) {
            this.f = new pe3.a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public pe3 k() {
        pe3 pe3VarC;
        synchronized (this.e) {
            try {
                if (this.g != null) {
                    this.f.a().z(pe3.F, Integer.valueOf(this.g.hashCode()));
                }
                pe3VarC = this.f.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return pe3VarC;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public dd3.c l() {
        return this.h;
    }

    public final /* synthetic */ Object n(final cb3.a aVar) throws Exception {
        this.d.execute(new Runnable() { // from class: mc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f25999a.m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public final /* synthetic */ Object p(final cb3.a aVar) throws Exception {
        this.d.execute(new Runnable() { // from class: nc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f27767a.o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public final /* synthetic */ boolean q(TotalCaptureResult totalCaptureResult) {
        cb3.a<Void> aVar;
        Integer num;
        if (this.g != null) {
            Object tag = totalCaptureResult.getRequest().getTag();
            if ((tag instanceof uzo) && (num = (Integer) ((uzo) tag).c("Camera2CameraControl")) != null && num.equals(Integer.valueOf(this.g.hashCode()))) {
                aVar = this.g;
                this.g = null;
            } else {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return false;
        }
        aVar.c(null);
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void s(final boolean z) {
        this.d.execute(new Runnable() { // from class: jc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f22641a.r(z);
            }
        });
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void r(boolean z) {
        if (this.f28986a == z) {
            return;
        }
        this.f28986a = z;
        if (z) {
            if (this.f28987b) {
                v();
            }
        } else {
            cb3.a<Void> aVar = this.g;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                this.g = null;
            }
        }
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(cb3.a<Void> aVar) {
        this.f28987b = true;
        cb3.a<Void> aVar2 = this.g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.g = aVar;
        if (this.f28986a) {
            v();
        }
        if (aVar2 != null) {
            aVar2.f(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    public final void v() {
        this.c.e0();
        this.f28987b = false;
    }
}
