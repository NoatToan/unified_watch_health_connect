package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class u implements q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f5409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5410b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f5411a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f5412b;

        public a(Handler handler) {
            this.f5412b = handler;
        }
    }

    public u(Context context, Object obj) {
        this.f5409a = (CameraManager) context.getSystemService("camera");
        this.f5410b = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.q.b
    public void a(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        executor.getClass();
        stateCallback.getClass();
        try {
            this.f5409a.openCamera(str, new k.a(executor, stateCallback), ((a) this.f5410b).f5412b);
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.q.b
    public CameraCharacteristics b(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f5409a.getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.q.b
    public void c(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        q.a aVar;
        if (executor == null) {
            vb.h.s("executor was null");
            return;
        }
        a aVar2 = (a) this.f5410b;
        synchronized (aVar2.f5411a) {
            try {
                aVar = (q.a) aVar2.f5411a.get(availabilityCallback);
                if (aVar == null) {
                    aVar = new q.a(executor, availabilityCallback);
                    aVar2.f5411a.put(availabilityCallback, aVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f5409a.registerAvailabilityCallback(aVar, aVar2.f5412b);
    }

    @Override // androidx.camera.camera2.internal.compat.q.b
    public Set<Set<String>> d() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.q.b
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        q.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f5410b;
            synchronized (aVar2.f5411a) {
                aVar = (q.a) aVar2.f5411a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.f5372c) {
                aVar.f5373d = true;
            }
        }
        this.f5409a.unregisterAvailabilityCallback(aVar);
    }
}
