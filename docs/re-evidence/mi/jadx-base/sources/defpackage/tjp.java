package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class tjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd3 f34772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData<Integer> f34773b = new MutableLiveData<>(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public cb3.a<Void> f;
    public boolean g;

    public tjp(dd3 dd3Var, vf3 vf3Var, Executor executor) {
        this.f34772a = dd3Var;
        this.d = executor;
        this.c = gx9.c(vf3Var);
        dd3Var.t(new dd3.c() { // from class: rjp
            @Override // dd3.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return this.f32622a.i(totalCaptureResult);
            }
        });
    }

    public lhe<Void> d(final boolean z) {
        if (this.c) {
            k(this.f34773b, Integer.valueOf(z ? 1 : 0));
            return cb3.a(new cb3.c() { // from class: qjp
                @Override // cb3.c
                public final Object a(cb3.a aVar) {
                    return this.f31577a.h(z, aVar);
                }
            });
        }
        zpe.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return oua.f(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void g(cb3.a<Void> aVar, boolean z) {
        if (!this.c) {
            if (aVar != null) {
                aVar.f(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.e) {
                k(this.f34773b, 0);
                if (aVar != null) {
                    aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.g = z;
            this.f34772a.w(z);
            k(this.f34773b, Integer.valueOf(z ? 1 : 0));
            cb3.a<Void> aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.f(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f = aVar;
        }
    }

    public LiveData<Integer> f() {
        return this.f34773b;
    }

    public final /* synthetic */ Object h(final boolean z, final cb3.a aVar) throws Exception {
        this.d.execute(new Runnable() { // from class: sjp
            @Override // java.lang.Runnable
            public final void run() {
                this.f33714a.g(aVar, z);
            }
        });
        return "enableTorch: " + z;
    }

    public final /* synthetic */ boolean i(TotalCaptureResult totalCaptureResult) {
        if (this.f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.g) {
                this.f.c(null);
                this.f = null;
            }
        }
        return false;
    }

    public void j(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            return;
        }
        if (this.g) {
            this.g = false;
            this.f34772a.w(false);
            k(this.f34773b, 0);
        }
        cb3.a<Void> aVar = this.f;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f = null;
        }
    }

    public final <T> void k(MutableLiveData<T> mutableLiveData, T t) {
        if (adp.b()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
