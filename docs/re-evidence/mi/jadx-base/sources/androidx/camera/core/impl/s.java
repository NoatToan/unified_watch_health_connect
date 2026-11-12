package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.t;
import defpackage.mcp;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class s implements r<t>, k, mcp {
    public static final Config.a<Integer> A;
    public static final Config.a<Integer> B;
    public static final Config.a<Integer> C;
    public static final Config.a<Integer> D;
    public static final Config.a<Integer> E;
    public static final Config.a<Integer> F;
    public static final Config.a<Integer> G;
    public final n z;

    static {
        Class cls = Integer.TYPE;
        A = Config.a.a("camerax.core.videoCapture.recordingFrameRate", cls);
        B = Config.a.a("camerax.core.videoCapture.bitRate", cls);
        C = Config.a.a("camerax.core.videoCapture.intraFrameInterval", cls);
        D = Config.a.a("camerax.core.videoCapture.audioBitRate", cls);
        E = Config.a.a("camerax.core.videoCapture.audioSampleRate", cls);
        F = Config.a.a("camerax.core.videoCapture.audioChannelCount", cls);
        G = Config.a.a("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public s(n nVar) {
        this.z = nVar;
    }

    public int K() {
        return ((Integer) a(D)).intValue();
    }

    public int L() {
        return ((Integer) a(F)).intValue();
    }

    public int M() {
        return ((Integer) a(G)).intValue();
    }

    public int N() {
        return ((Integer) a(E)).intValue();
    }

    public int O() {
        return ((Integer) a(B)).intValue();
    }

    public int P() {
        return ((Integer) a(C)).intValue();
    }

    public int Q() {
        return ((Integer) a(A)).intValue();
    }

    @Override // androidx.camera.core.impl.p
    public Config e() {
        return this.z;
    }

    @Override // androidx.camera.core.impl.j
    public int m() {
        return 34;
    }
}
