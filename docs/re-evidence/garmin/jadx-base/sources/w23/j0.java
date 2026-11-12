package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p43.m1;
import t23.d1;
import t23.h1;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t23.f f181631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f181632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t23.a0 f181633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t23.r f181634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p43.s f181635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f181636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f181637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o43.n f181638p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t23.l lVar, t23.f fVar, boolean z14, boolean z15, x33.f fVar2, t23.y0 y0Var, o43.n nVar) {
        super(nVar, lVar, fVar2, y0Var, z15);
        if (lVar == null) {
            T(0);
            throw null;
        }
        if (fVar == null) {
            T(1);
            throw null;
        }
        if (fVar2 == null) {
            T(2);
            throw null;
        }
        if (y0Var == null) {
            T(3);
            throw null;
        }
        if (nVar == null) {
            T(4);
            throw null;
        }
        this.f181637o = new ArrayList();
        this.f181638p = nVar;
        this.f181631i = fVar;
        this.f181632j = z14;
    }

    public static /* synthetic */ void T(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i15 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i14) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i14) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // t23.e
    public final h1<p43.v0> J() {
        return null;
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        if (fVar == null) {
            T(16);
            throw null;
        }
        i43.l.b bVar = i43.l.b.f91061b;
        if (bVar != null) {
            return bVar;
        }
        T(17);
        throw null;
    }

    @Override // t23.z
    public final boolean O() {
        return false;
    }

    @Override // t23.e
    public final i43.l P() {
        i43.l.b bVar = i43.l.b.f91061b;
        if (bVar != null) {
            return bVar;
        }
        T(18);
        throw null;
    }

    @Override // t23.e
    public final boolean U() {
        return false;
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        t23.a0 a0Var = this.f181633k;
        if (a0Var != null) {
            return a0Var;
        }
        T(7);
        throw null;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        if (c3153a != null) {
            return c3153a;
        }
        T(5);
        throw null;
    }

    @Override // t23.e
    public final t23.f getKind() {
        t23.f fVar = this.f181631i;
        if (fVar != null) {
            return fVar;
        }
        T(8);
        throw null;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        t23.r rVar = this.f181634l;
        if (rVar != null) {
            return rVar;
        }
        T(10);
        throw null;
    }

    @Override // t23.h
    public final m1 h() {
        p43.s sVar = this.f181635m;
        if (sVar != null) {
            return sVar;
        }
        T(11);
        throw null;
    }

    @Override // t23.e
    public final boolean isInline() {
        return false;
    }

    @Override // t23.e
    public final boolean k() {
        return false;
    }

    @Override // t23.i
    public final boolean l() {
        return this.f181632j;
    }

    @Override // t23.e
    public final Collection n() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        T(13);
        throw null;
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        ArrayList arrayList = this.f181636n;
        if (arrayList != null) {
            return arrayList;
        }
        T(15);
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // t23.e
    public final t23.d s() {
        return null;
    }

    @Override // t23.e
    public final boolean s0() {
        return false;
    }

    @Override // t23.e
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        return o.N(this);
    }

    @Override // t23.e
    public final t23.e u0() {
        return null;
    }
}
