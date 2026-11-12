package p33;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements u23.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f135436a = new g();

    private g() {
    }

    @Override // u23.c
    public final Map<x33.f, d43.g<?>> b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // u23.c
    public final x33.c c() {
        t23.e eVarD = f43.e.d(this);
        if (eVarD != null) {
            if (r43.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return f43.e.c(eVarD);
            }
        }
        return null;
    }

    @Override // u23.c
    public final t23.y0 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // u23.c
    public final p43.n0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
