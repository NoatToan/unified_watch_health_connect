package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {
    public l(Surface surface) {
        super(new OutputConfiguration(surface));
    }

    @Override // w.m, w.h.a
    public final void c(long j8) {
        if (j8 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j8);
    }

    @Override // w.k, w.j, w.i, w.m, w.h.a
    public final void e(long j8) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j8);
    }

    @Override // w.m, w.h.a
    public final void f(int i14) {
        ((OutputConfiguration) g()).setMirrorMode(i14);
    }

    @Override // w.k, w.j, w.i, w.m, w.h.a
    public final Object g() {
        Object obj = this.f180979a;
        k7.h.a(obj instanceof OutputConfiguration);
        return obj;
    }

    public l(int i14, Surface surface) {
        this(new OutputConfiguration(i14, surface));
    }

    public l(Object obj) {
        super(obj);
    }
}
