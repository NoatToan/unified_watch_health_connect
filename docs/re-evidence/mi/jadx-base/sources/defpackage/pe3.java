package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {dj8.class})
@RequiresApi(21)
public final class pe3 extends hk3 {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<Integer> A = Config.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<CameraDevice.StateCallback> B = Config.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<CameraCaptureSession.StateCallback> C = Config.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<CameraCaptureSession.CaptureCallback> D = Config.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<xg3> E = Config.a.a("camera2.cameraEvent.callback", xg3.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<Object> F = Config.a.a("camera2.captureRequest.tag", Object.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final Config.a<String> G = Config.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    public static final class a implements zj8<pe3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f30310a = m.O();

        @Override // defpackage.zj8
        public l a() {
            return this.f30310a;
        }

        public pe3 c() {
            return new pe3(n.M(this.f30310a));
        }

        public a d(Config config) {
            for (Config.a<?> aVar : config.h()) {
                this.f30310a.z(aVar, config.a(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f30310a.z(pe3.K(key), valuet);
            return this;
        }
    }

    public pe3(Config config) {
        super(config);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Config.a<Object> K(CaptureRequest.Key<?> key) {
        return Config.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public xg3 L(xg3 xg3Var) {
        return (xg3) e().d(E, xg3Var);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hk3 M() {
        return hk3.a.e(e()).d();
    }

    public Object N(Object obj) {
        return e().d(F, obj);
    }

    public int O(int i) {
        return ((Integer) e().d(A, Integer.valueOf(i))).intValue();
    }

    public CameraDevice.StateCallback P(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) e().d(B, stateCallback);
    }

    public String Q(String str) {
        return (String) e().d(G, str);
    }

    public CameraCaptureSession.CaptureCallback R(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) e().d(D, captureCallback);
    }

    public CameraCaptureSession.StateCallback S(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) e().d(C, stateCallback);
    }
}
