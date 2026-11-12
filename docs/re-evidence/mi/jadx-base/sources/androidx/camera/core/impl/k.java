package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.RequiresApi;
import defpackage.hk1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface k extends p {
    public static final Config.a<Integer> l = Config.a.a("camerax.core.imageOutput.targetAspectRatio", hk1.class);
    public static final Config.a<Integer> m;
    public static final Config.a<Integer> n;
    public static final Config.a<Size> o;
    public static final Config.a<Size> p;
    public static final Config.a<Size> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Config.a<List<Pair<Integer, Size[]>>> f1738r;

    static {
        Class cls = Integer.TYPE;
        m = Config.a.a("camerax.core.imageOutput.targetRotation", cls);
        n = Config.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        o = Config.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        p = Config.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        q = Config.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f1738r = Config.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
    }

    default boolean C() {
        return f(l);
    }

    default int E() {
        return ((Integer) a(l)).intValue();
    }

    default Size F(Size size) {
        return (Size) d(p, size);
    }

    default Size j(Size size) {
        return (Size) d(q, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) d(f1738r, list);
    }

    default int q(int i) {
        return ((Integer) d(n, Integer.valueOf(i))).intValue();
    }

    default int u(int i) {
        return ((Integer) d(m, Integer.valueOf(i))).intValue();
    }

    default Size v(Size size) {
        return (Size) d(o, size);
    }
}
