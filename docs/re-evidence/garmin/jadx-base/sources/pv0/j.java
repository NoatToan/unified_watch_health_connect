package pv0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public static final b a(h hVar) {
        hVar.getClass();
        String str = hVar.f141377d;
        if (str == null) {
            return null;
        }
        b.f141341b.getClass();
        return b.a.a(str);
    }

    public static final s b(h hVar) {
        Object next;
        hVar.getClass();
        w13.c cVar = s.f141417e;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((s) next).f141418a, hVar.f141379f)) {
                return (s) next;
            }
        }
        next = null;
        return (s) next;
    }

    public static final w c(h hVar) {
        hVar.getClass();
        w.a aVar = w.f141433b;
        Long l14 = hVar.f141374a;
        aVar.getClass();
        return w.a.a(l14);
    }

    public static final boolean d(h hVar) {
        Object next;
        hVar.getClass();
        Iterator<T> it = k.f141386e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((k) next).f141387a, hVar.f141375b));
        return ((k) next) != k.NONE;
    }
}
