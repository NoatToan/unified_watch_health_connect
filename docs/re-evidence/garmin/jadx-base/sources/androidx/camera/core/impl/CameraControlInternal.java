package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5462a = new a();

    public class a implements CameraControlInternal {
        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture<Void> a(float f14) {
            l0.j.a aVar = l0.j.f107810a;
            return l0.m.c.f107817b;
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture<Void> b(float f14) {
            l0.j.a aVar = l0.j.f107810a;
            return l0.m.c.f107817b;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void c() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final x0 d() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void e() {
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture<Void> g(boolean z14) {
            l0.j.a aVar = l0.j.f107810a;
            return l0.m.c.f107817b;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void i(x0 x0Var) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final ListenableFuture j(int i14, int i15, List list) {
            return l0.j.e(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.CameraControl
        public final ListenableFuture<b0.e0> l(b0.d0 d0Var) {
            return l0.j.e(b0.e0.b());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void m(int i14) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public final void n(l2.b bVar) {
        }
    }

    public interface b {
    }

    void c();

    x0 d();

    void e();

    default void f() {
    }

    default void h() {
    }

    void i(x0 x0Var);

    ListenableFuture j(int i14, int i15, List list);

    default void k(b0.l0.j jVar) {
    }

    void m(int i14);

    void n(l2.b bVar);

    default ListenableFuture o(int i14) {
        return l0.j.e(new h0(this));
    }

    public static final class CameraControlException extends Exception {
        private u mCameraCaptureFailure;

        public CameraControlException(u uVar) {
            this.mCameraCaptureFailure = uVar;
        }

        public u getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(u uVar, Throwable th3) {
            super(th3);
            this.mCameraCaptureFailure = uVar;
        }
    }
}
