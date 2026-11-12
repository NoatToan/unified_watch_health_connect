package w23;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p43.a2;
import p43.g2;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends o implements t23.u0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u23.h hVar, x33.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (fVar != null) {
        } else {
            y(2);
            throw null;
        }
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
            case 11:
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
            case 11:
                i15 = 2;
                break;
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i14) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i14) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // t23.a
    public final t23.u0 H() {
        return null;
    }

    @Override // t23.a
    public final t23.u0 I() {
        return null;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.i(this, d14);
    }

    @Override // t23.a
    public final boolean M() {
        return false;
    }

    @Override // w23.o, t23.l
    public final t23.a a() {
        return this;
    }

    @Override // w23.o, t23.l
    public final t23.l a() {
        return this;
    }

    @Override // t23.a1
    public final d b(a2 a2Var) {
        p43.n0 n0VarJ;
        if (a2Var == null) {
            y(3);
            throw null;
        }
        if (!a2Var.f135795a.e()) {
            if (d() instanceof t23.e) {
                n0VarJ = a2Var.j(g2.OUT_VARIANCE, getType());
            } else {
                n0VarJ = a2Var.j(g2.INVARIANT, getType());
            }
            if (n0VarJ == null) {
                return null;
            }
            if (n0VarJ != getType()) {
                return new q0(d(), new j43.i(n0VarJ), getAnnotations());
            }
        }
        return this;
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
        return getType();
    }

    @Override // t23.m
    public final t23.y0 getSource() {
        t23.y0.a aVar = t23.y0.f162076a;
        if (aVar != null) {
            return aVar;
        }
        y(11);
        throw null;
    }

    @Override // t23.i1
    public final p43.n0 getType() {
        p43.n0 type = getValue().getType();
        if (type != null) {
            return type;
        }
        y(6);
        throw null;
    }

    @Override // t23.a
    public final List<d1> getTypeParameters() {
        List<d1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y(5);
        throw null;
    }

    @Override // t23.o
    public final t23.r getVisibility() {
        t23.q.i iVar = t23.q.f162051f;
        if (iVar != null) {
            return iVar;
        }
        y(9);
        throw null;
    }

    @Override // t23.a
    public final Collection<? extends t23.a> o() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        y(8);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u23.h hVar) {
        super(hVar, x33.h.f188613e);
        if (hVar != null) {
        } else {
            y(0);
            throw null;
        }
    }
}
