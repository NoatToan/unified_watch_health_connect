package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraState;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {dj8.class})
@RequiresApi(21)
public final class ud3 implements dh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf3 f35644b;
    public final sd3 c;

    @GuardedBy("mLock")
    public dd3 e;
    public final a<CameraState> h;
    public final lgi j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final dc3 f35645k;
    public final ih3 l;
    public final Object d = new Object();

    @GuardedBy("mLock")
    public a<Integer> f = null;

    @GuardedBy("mLock")
    public a<n1s> g = null;

    @GuardedBy("mLock")
    public List<Pair<we3, Executor>> i = null;

    public static class a<T> extends gmf<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LiveData<T> f35646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f35647b;

        public a(T t) {
            this.f35647b = t;
        }

        @Override // defpackage.gmf
        public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f35646a;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.f35646a = liveData;
            super.addSource(liveData, new Observer() { // from class: td3
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.f34584a.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.f35646a;
            return liveData == null ? this.f35647b : liveData.getValue();
        }
    }

    public ud3(String str, ih3 ih3Var) throws CameraAccessExceptionCompat {
        String str2 = (String) g6i.g(str);
        this.f35643a = str2;
        this.l = ih3Var;
        vf3 vf3VarC = ih3Var.c(str2);
        this.f35644b = vf3VarC;
        this.c = new sd3(this);
        this.j = sh3.a(str, vf3VarC);
        this.f35645k = new gc3(str, vf3VarC);
        this.h = new a<>(CameraState.a(CameraState.Type.CLOSED));
    }

    @Override // defpackage.dh3
    public String a() {
        return this.f35643a;
    }

    @Override // defpackage.dh3
    public Integer b() {
        Integer num = (Integer) this.f35644b.a(CameraCharacteristics.LENS_FACING);
        g6i.g(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            return iIntValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // defpackage.dh3
    public void c(Executor executor, we3 we3Var) {
        synchronized (this.d) {
            try {
                dd3 dd3Var = this.e;
                if (dd3Var != null) {
                    dd3Var.u(executor, we3Var);
                    return;
                }
                if (this.i == null) {
                    this.i = new ArrayList();
                }
                this.i.add(new Pair<>(we3Var, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dh3
    public void d(we3 we3Var) {
        synchronized (this.d) {
            try {
                dd3 dd3Var = this.e;
                if (dd3Var != null) {
                    dd3Var.Y(we3Var);
                    return;
                }
                List<Pair<we3, Executor>> list = this.i;
                if (list == null) {
                    return;
                }
                Iterator<Pair<we3, Executor>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().first == we3Var) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // defpackage.ch3
    public int e(int i) {
        boolean z;
        int i2 = i();
        int iB = ph3.b(i);
        Integer numB = b();
        if (numB != null) {
            z = 1 == numB.intValue();
        }
        return ph3.a(iB, i2, z);
    }

    @Override // defpackage.dh3
    public lgi f() {
        return this.j;
    }

    @Override // defpackage.ch3
    public String g() {
        return j() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    public vf3 h() {
        return this.f35644b;
    }

    public int i() {
        Integer num = (Integer) this.f35644b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        g6i.g(num);
        return num.intValue();
    }

    public int j() {
        Integer num = (Integer) this.f35644b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        g6i.g(num);
        return num.intValue();
    }

    public void k(dd3 dd3Var) {
        synchronized (this.d) {
            try {
                this.e = dd3Var;
                a<n1s> aVar = this.g;
                if (aVar != null) {
                    aVar.b(dd3Var.G().d());
                }
                a<Integer> aVar2 = this.f;
                if (aVar2 != null) {
                    aVar2.b(this.e.E().f());
                }
                List<Pair<we3, Executor>> list = this.i;
                if (list != null) {
                    for (Pair<we3, Executor> pair : list) {
                        this.e.u((Executor) pair.second, (we3) pair.first);
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l();
    }

    public final void l() {
        m();
    }

    public final void m() {
        String str;
        int iJ = j();
        if (iJ == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iJ == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iJ == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iJ == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iJ != 4) {
            str = "Unknown value: " + iJ;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        zpe.e("Camera2CameraInfo", "Device Level: " + str);
    }

    public void n(LiveData<CameraState> liveData) {
        this.h.b(liveData);
    }
}
