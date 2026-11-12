package w23;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p43.m1;
import t23.d1;
import t23.h1;

/* JADX INFO: loaded from: classes3.dex */
public class m extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t23.a0 f181648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t23.f f181649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p43.s f181650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i43.l f181651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set<t23.d> f181652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t23.d f181653n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t23.l lVar, x33.f fVar, t23.a0 a0Var, t23.f fVar2, Collection<p43.n0> collection, t23.y0 y0Var, boolean z14, o43.n nVar) {
        super(nVar, lVar, fVar, y0Var, z14);
        if (lVar == null) {
            T(0);
            throw null;
        }
        if (fVar == null) {
            T(1);
            throw null;
        }
        if (a0Var == null) {
            T(2);
            throw null;
        }
        if (fVar2 == null) {
            T(3);
            throw null;
        }
        if (collection == null) {
            T(4);
            throw null;
        }
        if (y0Var == null) {
            T(5);
            throw null;
        }
        if (nVar == null) {
            T(6);
            throw null;
        }
        this.f181648i = a0Var;
        this.f181649j = fVar2;
        this.f181650k = new p43.s(this, Collections.EMPTY_LIST, collection, nVar);
    }

    public static /* synthetic */ void T(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i15 = 2;
                break;
            case 12:
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i14) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i14) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final void E0(i43.l lVar, Set set, k kVar) {
        if (lVar == null) {
            T(7);
            throw null;
        }
        if (set == null) {
            T(8);
            throw null;
        }
        this.f181651l = lVar;
        this.f181652m = set;
        this.f181653n = kVar;
    }

    @Override // t23.e
    public final h1<p43.v0> J() {
        return null;
    }

    @Override // w23.e0
    public final i43.l N(q43.f fVar) {
        if (fVar == null) {
            T(12);
            throw null;
        }
        i43.l lVar = this.f181651l;
        if (lVar != null) {
            return lVar;
        }
        T(13);
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
        T(14);
        throw null;
    }

    @Override // t23.e
    public final boolean U() {
        return false;
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        t23.a0 a0Var = this.f181648i;
        if (a0Var != null) {
            return a0Var;
        }
        T(16);
        throw null;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        u23.h.f168226x0.getClass();
        u23.h.a.C3153a c3153a = u23.h.a.f168228b;
        if (c3153a != null) {
            return c3153a;
        }
        T(9);
        throw null;
    }

    @Override // t23.e
    public final t23.f getKind() {
        t23.f fVar = this.f181649j;
        if (fVar != null) {
            return fVar;
        }
        T(15);
        throw null;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        t23.q.h hVar = t23.q.f162050e;
        if (hVar != null) {
            return hVar;
        }
        T(17);
        throw null;
    }

    @Override // t23.h
    public final m1 h() {
        p43.s sVar = this.f181650k;
        if (sVar != null) {
            return sVar;
        }
        T(10);
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
        return false;
    }

    @Override // t23.e
    public final Collection<t23.d> n() {
        Set<t23.d> set = this.f181652m;
        if (set != null) {
            return set;
        }
        T(11);
        throw null;
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        List<d1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        T(18);
        throw null;
    }

    @Override // t23.z
    public final boolean q0() {
        return false;
    }

    @Override // t23.e
    public final t23.d s() {
        return this.f181653n;
    }

    @Override // t23.e
    public final boolean s0() {
        return false;
    }

    @Override // t23.e
    public final boolean t0() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // t23.e
    public final t23.e u0() {
        return null;
    }
}
