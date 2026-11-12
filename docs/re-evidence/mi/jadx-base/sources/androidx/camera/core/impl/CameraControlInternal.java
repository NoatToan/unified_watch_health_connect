package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import defpackage.lhe;
import defpackage.oua;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CameraControlInternal f1712a = new a();

    public class a implements CameraControlInternal {
        @Override // androidx.camera.core.impl.CameraControlInternal
        public void a(boolean z) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void b(Size size, SessionConfig.b bVar) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public lhe<List<Void>> c(List<e> list, int i, int i2) {
            return oua.h(Collections.emptyList());
        }

        @Override // androidx.camera.core.CameraControl
        public lhe<Void> d(boolean z) {
            return oua.h(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void e(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Rect f() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void g(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Config h() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void i() {
        }
    }

    public interface b {
        void a(List<e> list);

        void b();
    }

    void a(boolean z);

    void b(Size size, SessionConfig.b bVar);

    lhe<List<Void>> c(List<e> list, int i, int i2);

    void e(Config config);

    Rect f();

    void g(int i);

    Config h();

    void i();

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }
}
