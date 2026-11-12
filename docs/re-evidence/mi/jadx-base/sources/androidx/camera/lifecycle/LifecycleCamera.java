package androidx.camera.lifecycle;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.c;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.ch3;
import defpackage.nfe;
import defpackage.ue3;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class LifecycleCamera implements nfe, ue3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LifecycleOwner f1828b;
    public final CameraUseCaseAdapter c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1827a = new Object();

    @GuardedBy("mLock")
    public volatile boolean d = false;

    @GuardedBy("mLock")
    public boolean e = false;

    @GuardedBy("mLock")
    public boolean f = false;

    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f1828b = lifecycleOwner;
        this.c = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.l();
        } else {
            cameraUseCaseAdapter.t();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // defpackage.ue3
    public CameraControl a() {
        return this.c.a();
    }

    public void b(Collection<s> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.f1827a) {
            this.c.k(collection);
        }
    }

    public void d(c cVar) {
        this.c.d(cVar);
    }

    public CameraUseCaseAdapter f() {
        return this.c;
    }

    public ch3 getCameraInfo() {
        return this.c.getCameraInfo();
    }

    public LifecycleOwner k() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f1827a) {
            lifecycleOwner = this.f1828b;
        }
        return lifecycleOwner;
    }

    public List<s> l() {
        List<s> listUnmodifiableList;
        synchronized (this.f1827a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.x());
        }
        return listUnmodifiableList;
    }

    public boolean m(s sVar) {
        boolean zContains;
        synchronized (this.f1827a) {
            zContains = this.c.x().contains(sVar);
        }
        return zContains;
    }

    public void n() {
        synchronized (this.f1827a) {
            try {
                if (this.e) {
                    return;
                }
                onStop(this.f1828b);
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        synchronized (this.f1827a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.c;
            cameraUseCaseAdapter.F(cameraUseCaseAdapter.x());
        }
    }

    @androidx.lifecycle.c(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1827a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.c;
            cameraUseCaseAdapter.F(cameraUseCaseAdapter.x());
        }
    }

    @androidx.lifecycle.c(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        this.c.h(false);
    }

    @androidx.lifecycle.c(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        this.c.h(true);
    }

    @androidx.lifecycle.c(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1827a) {
            try {
                if (!this.e && !this.f) {
                    this.c.l();
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.lifecycle.c(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.f1827a) {
            try {
                if (!this.e && !this.f) {
                    this.c.t();
                    this.d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p() {
        synchronized (this.f1827a) {
            try {
                if (this.e) {
                    this.e = false;
                    if (this.f1828b.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        onStart(this.f1828b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
