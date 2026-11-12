package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class l1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd3 f24536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f24537b;

    @GuardedBy("mCurrentZoomState")
    public final o1s c;
    public final MutableLiveData<n1s> d;
    public final b e;
    public boolean f = false;
    public dd3.c g = new a();

    public class a implements dd3.c {
        public a() {
        }

        @Override // dd3.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            l1s.this.e.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(pe3.a aVar);

        void e();
    }

    public l1s(dd3 dd3Var, vf3 vf3Var, Executor executor) {
        this.f24536a = dd3Var;
        this.f24537b = executor;
        b bVarB = b(vf3Var);
        this.e = bVarB;
        o1s o1sVar = new o1s(bVarB.c(), bVarB.b());
        this.c = o1sVar;
        o1sVar.f(1.0f);
        this.d = new MutableLiveData<>(a7d.e(o1sVar));
        dd3Var.t(this.g);
    }

    public static b b(vf3 vf3Var) {
        return e(vf3Var) ? new ra1(vf3Var) : new n45(vf3Var);
    }

    @RequiresApi(30)
    public static Range<Float> c(vf3 vf3Var) {
        try {
            return (Range) vf3Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e) {
            zpe.l("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    @VisibleForTesting
    public static boolean e(vf3 vf3Var) {
        return Build.VERSION.SDK_INT >= 30 && c(vf3Var) != null;
    }

    public void a(pe3.a aVar) {
        this.e.d(aVar);
    }

    public LiveData<n1s> d() {
        return this.d;
    }

    public void f(boolean z) {
        n1s n1sVarE;
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (z) {
            return;
        }
        synchronized (this.c) {
            this.c.f(1.0f);
            n1sVarE = a7d.e(this.c);
        }
        g(n1sVarE);
        this.e.e();
        this.f24536a.g0();
    }

    public final void g(n1s n1sVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.d.setValue(n1sVar);
        } else {
            this.d.postValue(n1sVar);
        }
    }
}
