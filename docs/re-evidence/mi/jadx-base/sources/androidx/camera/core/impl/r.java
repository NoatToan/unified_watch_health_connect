package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.core.s;
import defpackage.w0p;
import defpackage.wdq;
import defpackage.xh3;
import defpackage.zj8;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface r<T extends androidx.camera.core.s> extends w0p<T>, wdq, j {
    public static final Config.a<SessionConfig> s = Config.a.a("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.a<e> t = Config.a.a("camerax.core.useCase.defaultCaptureConfig", e.class);
    public static final Config.a<SessionConfig.d> u = Config.a.a("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.d.class);
    public static final Config.a<e.b> v = Config.a.a("camerax.core.useCase.captureConfigUnpacker", e.b.class);
    public static final Config.a<Integer> w = Config.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final Config.a<xh3> x = Config.a.a("camerax.core.useCase.cameraSelector", xh3.class);
    public static final Config.a<Range<Integer>> y = Config.a.a("camerax.core.useCase.targetFrameRate", xh3.class);

    public interface a<T extends androidx.camera.core.s, C extends r<T>, B> extends zj8<T> {
        C b();
    }

    default e A(e eVar) {
        return (e) d(t, eVar);
    }

    default SessionConfig.d I(SessionConfig.d dVar) {
        return (SessionConfig.d) d(u, dVar);
    }

    default SessionConfig n(SessionConfig sessionConfig) {
        return (SessionConfig) d(s, sessionConfig);
    }

    default e.b p(e.b bVar) {
        return (e.b) d(v, bVar);
    }

    default int s(int i) {
        return ((Integer) d(w, Integer.valueOf(i))).intValue();
    }

    default xh3 x(xh3 xh3Var) {
        return (xh3) d(x, xh3Var);
    }
}
