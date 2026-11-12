package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.ArrayMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap f5369b = new ArrayMap(4);

    public static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f5370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f5371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f5372c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5373d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f5370a = executor;
            this.f5371b = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f5372c) {
                try {
                    if (!this.f5373d) {
                        this.f5370a.execute(new a0.c(this, 4));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.f5372c) {
                try {
                    if (!this.f5373d) {
                        this.f5370a.execute(new p(this, str, 0));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.f5372c) {
                try {
                    if (!this.f5373d) {
                        this.f5370a.execute(new p(this, str, 1));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public interface b {
        void a(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        CameraCharacteristics b(String str);

        void c(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        Set<Set<String>> d();

        void e(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private q(b bVar) {
        this.f5368a = bVar;
    }

    public static q a(Context context) {
        b sVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            sVar = new t(context);
        } else {
            sVar = i14 >= 29 ? new s(context) : new r(context);
        }
        return new q(sVar);
    }

    public final h b(String str) {
        h hVarE;
        synchronized (this.f5369b) {
            hVarE = (h) this.f5369b.get(str);
            if (hVarE == null) {
                try {
                    hVarE = h.e(this.f5368a.b(str), str);
                    this.f5369b.put(str, hVarE);
                } catch (AssertionError e4) {
                    throw new CameraAccessExceptionCompat(10002, e4.getMessage(), e4);
                }
            }
        }
        return hVarE;
    }

    public final String[] c() throws CameraAccessExceptionCompat {
        u uVar = (u) this.f5368a;
        uVar.getClass();
        try {
            return uVar.f5409a.getCameraIdList();
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }
}
