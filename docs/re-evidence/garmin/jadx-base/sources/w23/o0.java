package w23;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class o0 extends m0 implements t23.s0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p43.n0 f181692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t23.s0 f181693n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t23.r0 r0Var, u23.h hVar, t23.a0 a0Var, t23.r rVar, boolean z14, boolean z15, boolean z16, t23.b.a aVar, t23.s0 s0Var, t23.y0 y0Var) {
        super(a0Var, rVar, r0Var, hVar, x33.f.g("<get-" + r0Var.getName() + ">"), z14, z15, z16, aVar, y0Var);
        if (r0Var == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (a0Var == null) {
            y(2);
            throw null;
        }
        if (rVar == null) {
            y(3);
            throw null;
        }
        if (aVar == null) {
            y(4);
            throw null;
        }
        if (y0Var == null) {
            y(5);
            throw null;
        }
        this.f181693n = s0Var != null ? s0Var : this;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 6 || i14 == 7 || i14 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 6 || i14 == 7 || i14 == 8) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i14 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i14 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i14 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i14 != 6 && i14 != 7 && i14 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 6 && i14 != 7 && i14 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.m0, w23.p, w23.o, t23.l
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final t23.s0 a() {
        t23.s0 s0Var = this.f181693n;
        if (s0Var != null) {
            return s0Var;
        }
        y(8);
        throw null;
    }

    public final void G0(p43.n0 n0Var) {
        if (n0Var == null) {
            n0Var = p0().getType();
        }
        this.f181692m = n0Var;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.a(this, d14);
    }

    @Override // t23.a
    public final List<j1> f() {
        List<j1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y(7);
        throw null;
    }

    @Override // t23.a
    public final p43.n0 getReturnType() {
        return this.f181692m;
    }

    @Override // t23.b, t23.a
    public final Collection<? extends t23.s0> o() {
        return E0(true);
    }
}
