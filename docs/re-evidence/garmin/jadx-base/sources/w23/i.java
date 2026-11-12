package w23;

import com.garmin.android.gncs.NotificationConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p43.g2;
import p43.k1;
import p43.m1;
import t23.b1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends p implements d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g2 f181608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f181609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f181610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o43.j<m1> f181611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o43.j<p43.v0> f181612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o43.n f181613j;

    public class a implements e23.a<m1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o43.n f181614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b1 f181615b;

        public a(o43.n nVar, b1 b1Var) {
            this.f181614a = nVar;
            this.f181615b = b1Var;
        }

        @Override // e23.a
        public final m1 invoke() {
            return new c(i.this, this.f181614a, this.f181615b);
        }
    }

    public class b implements e23.a<p43.v0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x33.f f181617a;

        public b(x33.f fVar) {
            this.f181617a = fVar;
        }

        @Override // e23.a
        public final p43.v0 invoke() {
            k1.f135863b.getClass();
            return p43.q0.g(i.this.h(), Collections.EMPTY_LIST, k1.f135864c, false, new i43.j(new j(this)));
        }
    }

    public class c extends p43.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b1 f181619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f181620d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar, o43.n nVar, b1 b1Var) {
            super(nVar);
            if (nVar == null) {
                l(0);
                throw null;
            }
            this.f181620d = iVar;
            this.f181619c = b1Var;
        }

        public static /* synthetic */ void l(int i14) {
            String str = (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4 || i14 == 5 || i14 == 8) ? 2 : 3];
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i14 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i14 == 2) {
                objArr[1] = "getParameters";
            } else if (i14 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i14 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i14 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i14 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5 && i14 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p43.m1
        public final boolean C() {
            return true;
        }

        @Override // p43.t
        public final boolean a(t23.h hVar) {
            if (!(hVar instanceof d1)) {
                return false;
            }
            p005kotlin.reflect.jvm.internal.impl.resolve.a aVar = p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a;
            aVar.getClass();
            i iVar = this.f181620d;
            iVar.getClass();
            return aVar.b(iVar, (d1) hVar, true, b43.d.f15721a);
        }

        @Override // p43.n
        public final Collection<p43.n0> d() {
            List<p43.n0> listF0 = this.f181620d.F0();
            if (listF0 != null) {
                return listF0;
            }
            l(1);
            throw null;
        }

        @Override // p43.m1
        public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
            p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = f43.e.e(this.f181620d);
            if (dVarE != null) {
                return dVarE;
            }
            l(4);
            throw null;
        }

        @Override // p43.n
        public final p43.n0 f() {
            return r43.l.c(r43.k.f150368g, new String[0]);
        }

        @Override // p43.m1
        public final List<d1> getParameters() {
            List<d1> list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            l(2);
            throw null;
        }

        @Override // p43.n
        public final b1 h() {
            b1 b1Var = this.f181619c;
            if (b1Var != null) {
                return b1Var;
            }
            l(5);
            throw null;
        }

        @Override // p43.n
        public final List<p43.n0> j(List<p43.n0> list) {
            if (list == null) {
                l(7);
                throw null;
            }
            List<p43.n0> listD0 = this.f181620d.D0(list);
            if (listD0 != null) {
                return listD0;
            }
            l(8);
            throw null;
        }

        @Override // p43.n
        public final void k(p43.n0 n0Var) {
            if (n0Var != null) {
                this.f181620d.E0(n0Var);
            } else {
                l(6);
                throw null;
            }
        }

        @Override // p43.m1
        public final t23.h t() {
            i iVar = this.f181620d;
            if (iVar != null) {
                return iVar;
            }
            l(3);
            throw null;
        }

        public final String toString() {
            return this.f181620d.getName().f188605a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o43.n nVar, t23.l lVar, u23.h hVar, x33.f fVar, g2 g2Var, boolean z14, int i14, t23.y0 y0Var, b1 b1Var) {
        super(lVar, hVar, fVar, y0Var);
        if (nVar == null) {
            y(0);
            throw null;
        }
        if (lVar == null) {
            y(1);
            throw null;
        }
        if (hVar == null) {
            y(2);
            throw null;
        }
        if (fVar == null) {
            y(3);
            throw null;
        }
        if (g2Var == null) {
            y(4);
            throw null;
        }
        if (y0Var == null) {
            y(5);
            throw null;
        }
        if (b1Var == null) {
            y(6);
            throw null;
        }
        this.f181608e = g2Var;
        this.f181609f = z14;
        this.f181610g = i14;
        this.f181611h = nVar.g(new a(nVar, b1Var));
        this.f181612i = nVar.g(new b(fVar));
        this.f181613j = nVar;
    }

    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i14) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public List<p43.n0> D0(List<p43.n0> list) {
        if (list == null) {
            y(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        y(13);
        throw null;
    }

    public abstract void E0(p43.n0 n0Var);

    public abstract List<p43.n0> F0();

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.g(this, d14);
    }

    @Override // w23.p
    /* JADX INFO: renamed from: T */
    public final t23.m a() {
        return this;
    }

    @Override // w23.p, w23.o, t23.l
    public final t23.h a() {
        return this;
    }

    @Override // w23.p, w23.o, t23.l
    public final t23.l a() {
        return this;
    }

    @Override // t23.d1
    public final int getIndex() {
        return this.f181610g;
    }

    @Override // t23.d1
    public final List<p43.n0> getUpperBounds() {
        List<p43.n0> listB = ((c) h()).b();
        if (listB != null) {
            return listB;
        }
        y(8);
        throw null;
    }

    @Override // t23.d1, t23.h
    public final m1 h() {
        m1 m1VarInvoke = this.f181611h.invoke();
        if (m1VarInvoke != null) {
            return m1VarInvoke;
        }
        y(9);
        throw null;
    }

    @Override // t23.d1
    public final g2 m() {
        g2 g2Var = this.f181608e;
        if (g2Var != null) {
            return g2Var;
        }
        y(7);
        throw null;
    }

    @Override // t23.d1
    public final o43.n o0() {
        o43.n nVar = this.f181613j;
        if (nVar != null) {
            return nVar;
        }
        y(14);
        throw null;
    }

    @Override // t23.h
    public final p43.v0 p() {
        p43.v0 v0VarInvoke = this.f181612i.invoke();
        if (v0VarInvoke != null) {
            return v0VarInvoke;
        }
        y(10);
        throw null;
    }

    @Override // t23.d1
    public final boolean r() {
        return this.f181609f;
    }

    @Override // t23.d1
    public final boolean u() {
        return false;
    }

    @Override // w23.p, w23.o, t23.l
    public final d1 a() {
        return this;
    }
}
