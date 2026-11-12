package x0;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.k0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import b0.i1;
import b0.k;
import b0.k1;
import b0.l;
import b0.r;
import b0.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class b implements m0, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f188206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraUseCaseAdapter f188207c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f188205a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f188208d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f188209e = null;

    public b(n0 n0Var, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f188206b = n0Var;
        this.f188207c = cameraUseCaseAdapter;
        if (n0Var.getF158016a().getF7973d().a(b0.b.STARTED)) {
            cameraUseCaseAdapter.m();
        } else {
            cameraUseCaseAdapter.s();
        }
        n0Var.getF158016a().a(this);
    }

    @Override // b0.k
    public final CameraControl a() {
        return this.f188207c.f5883a.f5529c;
    }

    @Override // b0.k
    public final r b() {
        return this.f188207c.f5883a.f5528b;
    }

    public final void d(s0 s0Var) {
        synchronized (this.f188205a) {
            try {
                s0 s0Var2 = this.f188209e;
                if (s0Var2 == null) {
                    this.f188209e = s0Var;
                } else if (s0Var.f14047i) {
                    if (!s0Var2.f14047i) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f188209e.f14129f);
                    arrayList.addAll(s0Var.f14129f);
                    this.f188209e = new s0(arrayList, s0Var.f14124a, s0Var.f14125b);
                } else {
                    if (s0Var2.f14047i) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f188209e = s0Var;
                    CameraUseCaseAdapter cameraUseCaseAdapter = this.f188207c;
                    cameraUseCaseAdapter.B((ArrayList) cameraUseCaseAdapter.w());
                }
                CameraUseCaseAdapter cameraUseCaseAdapter2 = this.f188207c;
                k1 k1Var = s0Var.f14124a;
                synchronized (cameraUseCaseAdapter2.f5894l) {
                    cameraUseCaseAdapter2.f5890h = k1Var;
                }
                CameraUseCaseAdapter cameraUseCaseAdapter3 = this.f188207c;
                List<l> list = s0Var.f14125b;
                synchronized (cameraUseCaseAdapter3.f5894l) {
                    cameraUseCaseAdapter3.f5891i = list;
                }
                synchronized (this.f188207c.f5894l) {
                }
                CameraUseCaseAdapter cameraUseCaseAdapter4 = this.f188207c;
                Range<Integer> range = s0Var.f14126c;
                synchronized (cameraUseCaseAdapter4.f5894l) {
                    cameraUseCaseAdapter4.f5892j = range;
                }
                k0 k0Var = (k0) b();
                e0.c.a aVar = e0.c.f61820b;
                aVar.getClass();
                k0Var.getClass();
                e0.c cVarA = e0.c.a.a(aVar, s0Var, k0Var);
                s0Var.f14131h.execute(new vg1.d(13, cVarA, s0Var));
                this.f188207c.d(s0Var.f14129f, cVarA);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final n0 k() {
        n0 n0Var;
        synchronized (this.f188205a) {
            n0Var = this.f188206b;
        }
        return n0Var;
    }

    public final List<i1> l() {
        List<i1> listUnmodifiableList;
        synchronized (this.f188205a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f188207c.w());
        }
        return listUnmodifiableList;
    }

    public final void m() {
        synchronized (this.f188205a) {
            try {
                if (this.f188208d) {
                    return;
                }
                onStop(this.f188206b);
                this.f188208d = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @a1(b0.a.ON_DESTROY)
    public void onDestroy(n0 n0Var) {
        synchronized (this.f188205a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f188207c;
            cameraUseCaseAdapter.B((ArrayList) cameraUseCaseAdapter.w());
        }
    }

    @a1(b0.a.ON_PAUSE)
    public void onPause(n0 n0Var) {
        this.f188207c.f5883a.o(false);
    }

    @a1(b0.a.ON_RESUME)
    public void onResume(n0 n0Var) {
        this.f188207c.f5883a.o(true);
    }

    @a1(b0.a.ON_START)
    public void onStart(n0 n0Var) {
        synchronized (this.f188205a) {
            try {
                if (!this.f188208d) {
                    this.f188207c.m();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @a1(b0.a.ON_STOP)
    public void onStop(n0 n0Var) {
        synchronized (this.f188205a) {
            try {
                if (!this.f188208d) {
                    this.f188207c.s();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q(s0 s0Var) {
        boolean z14;
        boolean z15;
        synchronized (this.f188205a) {
            try {
                s0 s0Var2 = this.f188209e;
                if (s0Var2 != null && (z14 = s0Var2.f14047i) == (z15 = s0Var.f14047i)) {
                    s0 s0Var3 = null;
                    if (z14 || z15) {
                        if (z14 && z15) {
                            ArrayList arrayList = new ArrayList(this.f188209e.f14129f);
                            arrayList.removeAll(s0Var.f14129f);
                            if (!arrayList.isEmpty()) {
                                s0 s0Var4 = this.f188209e;
                                s0Var3 = new s0(arrayList, s0Var4.f14124a, s0Var4.f14125b);
                            }
                            this.f188209e = s0Var3;
                        }
                    } else if (s0Var2 != s0Var) {
                        return;
                    } else {
                        this.f188209e = null;
                    }
                    ArrayList arrayList2 = new ArrayList(s0Var.f14129f);
                    arrayList2.retainAll(this.f188207c.w());
                    this.f188207c.B(arrayList2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r() {
        synchronized (this.f188205a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f188207c;
            cameraUseCaseAdapter.B((ArrayList) cameraUseCaseAdapter.w());
            this.f188209e = null;
        }
    }

    public final void s() {
        synchronized (this.f188205a) {
            try {
                if (this.f188208d) {
                    this.f188208d = false;
                    if (this.f188206b.getF158016a().getF7973d().a(b0.b.STARTED)) {
                        onStart(this.f188206b);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
