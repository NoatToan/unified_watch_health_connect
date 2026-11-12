package a1;

import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.h;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.x0;
import g1.f0;
import m0.n;
import z0.h0;
import z0.n0;

/* JADX INFO: loaded from: classes.dex */
public final class a<T extends n0> implements b3<h0<T>>, n1, n {
    public static final h O = x0.a.a(n0.class, "camerax.video.VideoCapture.videoOutput");
    public static final h P = x0.a.a(f0.a.class, "camerax.video.VideoCapture.videoEncoderInfoFinder");
    public static final h Q = x0.a.a(Boolean.class, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");
    public final a2 N;

    public a(a2 a2Var) {
        k7.h.a(a2Var.N.containsKey(O));
        this.N = a2Var;
    }

    @Override // androidx.camera.core.impl.j2
    public final x0 getConfig() {
        return this.N;
    }

    @Override // androidx.camera.core.impl.m1
    public final int z() {
        return 34;
    }
}
