package w23;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p43.a2;
import t23.d1;
import t23.j1;
import t23.k1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends p implements k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p43.n0 f181780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(t23.l lVar, u23.h hVar, x33.f fVar, p43.n0 n0Var, t23.y0 y0Var) {
        super(lVar, hVar, fVar, y0Var);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (fVar == null) {
            y(2);
            throw null;
        }
        if (y0Var == null) {
            y(3);
            throw null;
        }
        this.f181780e = n0Var;
    }

    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i15 = 2;
                break;
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i14) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i14) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // w23.p, w23.o, t23.l
    /* JADX INFO: renamed from: D0 */
    public k1 a() {
        return this;
    }

    public t23.u0 H() {
        return null;
    }

    public t23.u0 I() {
        return null;
    }

    public boolean M() {
        return false;
    }

    public /* bridge */ /* synthetic */ t23.m b(a2 a2Var) {
        return b(a2Var);
    }

    @Override // t23.a
    public final List<j1> f() {
        List<j1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y(6);
        throw null;
    }

    public p43.n0 getReturnType() {
        p43.n0 type = getType();
        if (type != null) {
            return type;
        }
        y(10);
        throw null;
    }

    @Override // t23.i1
    public final p43.n0 getType() {
        p43.n0 n0Var = this.f181780e;
        if (n0Var != null) {
            return n0Var;
        }
        y(4);
        throw null;
    }

    public List<d1> getTypeParameters() {
        List<d1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y(8);
        throw null;
    }

    public Collection<? extends t23.a> o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        y(7);
        throw null;
    }
}
