package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import defpackage.ch3;
import defpackage.dh3;
import defpackage.m4h;
import defpackage.ue3;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraInternal extends ue3, androidx.camera.core.s.d {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);

        private final boolean mHoldsCameraSlot;

        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @Override // defpackage.ue3
    default CameraControl a() {
        return g();
    }

    dh3 c();

    default void d(c cVar) {
    }

    m4h<State> e();

    CameraControlInternal g();

    default ch3 getCameraInfo() {
        return c();
    }

    default void h(boolean z) {
    }

    void i(Collection<androidx.camera.core.s> collection);

    void j(Collection<androidx.camera.core.s> collection);
}
