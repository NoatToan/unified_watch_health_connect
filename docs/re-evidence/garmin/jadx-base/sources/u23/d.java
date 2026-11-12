package u23;

import java.util.Map;
import p43.n0;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f168206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<x33.f, d43.g<?>> f168207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f168208c;

    public d(n0 n0Var, Map<x33.f, d43.g<?>> map, y0 y0Var) {
        if (n0Var == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        if (y0Var == null) {
            d(2);
            throw null;
        }
        this.f168206a = n0Var;
        this.f168207b = map;
        this.f168208c = y0Var;
    }

    public static /* synthetic */ void d(int i14) {
        String str = (i14 == 3 || i14 == 4 || i14 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 3 || i14 == 4 || i14 == 5) ? 2 : 3];
        if (i14 == 1) {
            objArr[0] = "valueArguments";
        } else if (i14 == 2) {
            objArr[0] = "source";
        } else if (i14 == 3 || i14 == 4 || i14 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i14 == 3) {
            objArr[1] = "getType";
        } else if (i14 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i14 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 3 && i14 != 4 && i14 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u23.c
    public final Map<x33.f, d43.g<?>> b() {
        Map<x33.f, d43.g<?>> map = this.f168207b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
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
    public final y0 getSource() {
        y0 y0Var = this.f168208c;
        if (y0Var != null) {
            return y0Var;
        }
        d(5);
        throw null;
    }

    @Override // u23.c
    public final n0 getType() {
        n0 n0Var = this.f168206a;
        if (n0Var != null) {
            return n0Var;
        }
        d(3);
        throw null;
    }

    public final String toString() {
        return a43.n.f1164b.n(this, null);
    }
}
