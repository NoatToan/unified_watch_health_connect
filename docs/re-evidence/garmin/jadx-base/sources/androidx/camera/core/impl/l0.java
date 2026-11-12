package androidx.camera.core.impl;

import androidx.camera.core.CameraControl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface l0 extends b0.k, b0.i1.c {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5600a;

        a(boolean z14) {
            this.f5600a = z14;
        }
    }

    @Override // b0.k
    default CameraControl a() {
        return n();
    }

    @Override // b0.k
    default b0.r b() {
        return c();
    }

    k0 c();

    default boolean e() {
        return b().b() == 0;
    }

    default void f(e0 e0Var) {
    }

    default void g(boolean z14) {
    }

    z1<a> getCameraState();

    default e0 h() {
        return g0.f5557a;
    }

    void i(Collection<b0.i1> collection);

    default boolean j() {
        return true;
    }

    CameraControlInternal n();

    default void o(boolean z14) {
    }

    default void onRemoved() {
    }

    void p(Collection<b0.i1> collection);

    ListenableFuture<Void> release();
}
