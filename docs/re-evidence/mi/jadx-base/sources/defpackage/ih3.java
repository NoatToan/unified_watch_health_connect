package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ih3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mCameraCharacteristicsMap")
    public final Map<String, vf3> f21136b = new ArrayMap(4);

    @RequiresApi(21)
    public static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f21137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f21138b;
        public final Object c = new Object();

        @GuardedBy("mLock")
        public boolean d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f21137a = executor;
            this.f21138b = availabilityCallback;
        }

        public final /* synthetic */ void d() {
            zd1.a(this.f21138b);
        }

        public final /* synthetic */ void e(String str) {
            this.f21138b.onCameraAvailable(str);
        }

        public final /* synthetic */ void f(String str) {
            this.f21138b.onCameraUnavailable(str);
        }

        public void g() {
            synchronized (this.c) {
                this.d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @RequiresApi(29)
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f21137a.execute(new Runnable() { // from class: gh3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f18974a.d();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f21137a.execute(new Runnable() { // from class: fh3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f17778a.e(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.f21137a.execute(new Runnable() { // from class: hh3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f20062a.f(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        static b c(Context context, Handler handler) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return new kh3(context);
            }
            return i >= 28 ? jh3.h(context) : lh3.g(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        @RequiresPermission("android.permission.CAMERA")
        void b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        CameraCharacteristics d(String str) throws CameraAccessExceptionCompat;

        String[] e() throws CameraAccessExceptionCompat;

        void f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public ih3(b bVar) {
        this.f21135a = bVar;
    }

    public static ih3 a(Context context) {
        return b(context, y1f.a());
    }

    public static ih3 b(Context context, Handler handler) {
        return new ih3(b.c(context, handler));
    }

    public vf3 c(String str) throws CameraAccessExceptionCompat {
        vf3 vf3VarC;
        synchronized (this.f21136b) {
            vf3VarC = this.f21136b.get(str);
            if (vf3VarC == null) {
                try {
                    vf3VarC = vf3.c(this.f21135a.d(str));
                    this.f21136b.put(str, vf3VarC);
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(10002, e.getMessage(), e);
                }
            }
        }
        return vf3VarC;
    }

    public String[] d() throws CameraAccessExceptionCompat {
        return this.f21135a.e();
    }

    @RequiresPermission("android.permission.CAMERA")
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.f21135a.b(str, executor, stateCallback);
    }

    public void f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21135a.a(executor, availabilityCallback);
    }

    public void g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f21135a.f(availabilityCallback);
    }
}
