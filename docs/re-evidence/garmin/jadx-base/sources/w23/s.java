package w23;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p43.m1;
import t23.d1;
import t23.h1;

/* JADX INFO: loaded from: classes3.dex */
public class s extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p43.s f181700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f181701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o43.j<Set<x33.f>> f181702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u23.h f181703l;

    public class a extends i43.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o43.h<x33.f, Collection<? extends t23.x0>> f181704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o43.h<x33.f, Collection<? extends t23.r0>> f181705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o43.j<Collection<t23.l>> f181706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f181707e;

        /* JADX INFO: renamed from: w23.s$a$a, reason: collision with other inner class name */
        public class C3385a implements e23.l<x33.f, Collection<? extends t23.x0>> {
            public C3385a(s sVar) {
            }

            @Override // e23.l
            public final Collection<? extends t23.x0> invoke(x33.f fVar) {
                x33.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(fVar2, aVar.i().c(fVar2, b33.b.FOR_NON_TRACKED_SCOPE));
                }
                aVar.getClass();
                a.h(8);
                throw null;
            }
        }

        public class b implements e23.l<x33.f, Collection<? extends t23.r0>> {
            public b(s sVar) {
            }

            @Override // e23.l
            public final Collection<? extends t23.r0> invoke(x33.f fVar) {
                x33.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(fVar2, aVar.i().a(fVar2, b33.b.FOR_NON_TRACKED_SCOPE));
                }
                aVar.getClass();
                a.h(4);
                throw null;
            }
        }

        public class c implements e23.a<Collection<t23.l>> {
            public c(s sVar) {
            }

            @Override // e23.a
            public final Collection<t23.l> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (x33.f fVar : aVar.f181707e.f181702k.invoke()) {
                    b33.b bVar = b33.b.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.c(fVar, bVar));
                    hashSet.addAll(aVar.a(fVar, bVar));
                }
                return hashSet;
            }
        }

        public a(s sVar, o43.n nVar) {
            if (nVar == null) {
                h(0);
                throw null;
            }
            this.f181707e = sVar;
            this.f181704b = nVar.e(new C3385a(sVar));
            this.f181705c = nVar.e(new b(sVar));
            this.f181706d = nVar.g(new c(sVar));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        public static /* synthetic */ void h(int i14) {
            String str;
            int i15;
            if (i14 != 3 && i14 != 7 && i14 != 9 && i14 != 12) {
                switch (i14) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i14 != 3 && i14 != 7 && i14 != 9 && i14 != 12) {
                switch (i14) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i15 = 2;
                        break;
                    default:
                        i15 = 3;
                        break;
                }
            } else {
                i15 = 2;
            }
            Object[] objArr = new Object[i15];
            switch (i14) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = FirebaseAnalytics.Param.LOCATION;
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i14 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i14 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i14 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i14 != 12) {
                switch (i14) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i14) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i14 != 3 && i14 != 7 && i14 != 9 && i14 != 12) {
                switch (i14) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @Override // i43.m, i43.l
        public final Collection<? extends t23.r0> a(x33.f fVar, b33.b bVar) {
            if (fVar == null) {
                h(1);
                throw null;
            }
            if (bVar == null) {
                h(2);
                throw null;
            }
            Collection<? extends t23.r0> collection = (Collection) ((o43.e.k) this.f181705c).invoke(fVar);
            if (collection != null) {
                return collection;
            }
            h(3);
            throw null;
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> b() {
            Set<x33.f> setInvoke = this.f181707e.f181702k.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(17);
            throw null;
        }

        @Override // i43.m, i43.l
        public final Collection<? extends t23.x0> c(x33.f fVar, b33.b bVar) {
            if (fVar == null) {
                h(5);
                throw null;
            }
            if (bVar == null) {
                h(6);
                throw null;
            }
            Collection<? extends t23.x0> collection = (Collection) ((o43.e.k) this.f181704b).invoke(fVar);
            if (collection != null) {
                return collection;
            }
            h(7);
            throw null;
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> d() {
            Set<x33.f> setInvoke = this.f181707e.f181702k.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(19);
            throw null;
        }

        @Override // i43.m, i43.l
        public final Set<x33.f> e() {
            Set<x33.f> set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        @Override // i43.m, i43.o
        public final Collection<t23.l> g(i43.d dVar, e23.l<? super x33.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
                throw null;
            }
            if (lVar == null) {
                h(14);
                throw null;
            }
            Collection<t23.l> collectionInvoke = this.f181706d.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(15);
            throw null;
        }

        public final i43.l i() {
            i43.l lVarI = ((p43.n) this.f181707e.h()).b().iterator().next().i();
            if (lVarI != null) {
                return lVarI;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(x33.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            p005kotlin.reflect.jvm.internal.impl.resolve.b.f105945f.j(fVar, collection, Collections.EMPTY_SET, this.f181707e, new t(this, linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private s(o43.n nVar, t23.e eVar, p43.n0 n0Var, x33.f fVar, o43.j<Set<x33.f>> jVar, u23.h hVar, t23.y0 y0Var) {
        super(nVar, eVar, fVar, y0Var, false);
        if (nVar == null) {
            T(6);
            throw null;
        }
        if (eVar == null) {
            T(7);
            throw null;
        }
        if (n0Var == null) {
            T(8);
            throw null;
        }
        if (fVar == null) {
            T(9);
            throw null;
        }
        if (jVar == null) {
            T(10);
            throw null;
        }
        if (hVar == null) {
            T(11);
            throw null;
        }
        if (y0Var == null) {
            T(12);
            throw null;
        }
        this.f181703l = hVar;
        this.f181700i = new p43.s(this, Collections.EMPTY_LIST, Collections.singleton(n0Var), nVar);
        this.f181701j = new a(this, nVar);
        this.f181702k = jVar;
    }

    public static s E0(o43.n nVar, t23.e eVar, x33.f fVar, o43.j<Set<x33.f>> jVar, u23.h hVar, t23.y0 y0Var) {
        if (nVar == null) {
            T(0);
            throw null;
        }
        if (eVar == null) {
            T(1);
            throw null;
        }
        if (fVar == null) {
            T(2);
            throw null;
        }
        if (jVar == null) {
            T(3);
            throw null;
        }
        if (y0Var != null) {
            return new s(nVar, eVar, eVar.p(), fVar, jVar, hVar, y0Var);
        }
        T(5);
        throw null;
    }

    public static /* synthetic */ void T(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i15 = 2;
                break;
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i14) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i14) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
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
            T(13);
            throw null;
        }
        a aVar = this.f181701j;
        if (aVar != null) {
            return aVar;
        }
        T(14);
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
        T(15);
        throw null;
    }

    @Override // t23.e
    public final boolean U() {
        return false;
    }

    @Override // t23.e, t23.z
    public final t23.a0 g() {
        t23.a0 a0Var = t23.a0.FINAL;
        if (a0Var != null) {
            return a0Var;
        }
        T(19);
        throw null;
    }

    @Override // u23.a
    public final u23.h getAnnotations() {
        u23.h hVar = this.f181703l;
        if (hVar != null) {
            return hVar;
        }
        T(21);
        throw null;
    }

    @Override // t23.e
    public final t23.f getKind() {
        t23.f fVar = t23.f.ENUM_ENTRY;
        if (fVar != null) {
            return fVar;
        }
        T(18);
        throw null;
    }

    @Override // t23.e, t23.z, t23.o
    public final t23.r getVisibility() {
        t23.q.h hVar = t23.q.f162050e;
        if (hVar != null) {
            return hVar;
        }
        T(20);
        throw null;
    }

    @Override // t23.h
    public final m1 h() {
        p43.s sVar = this.f181700i;
        if (sVar != null) {
            return sVar;
        }
        T(17);
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        T(16);
        throw null;
    }

    @Override // t23.e, t23.i
    public final List<d1> q() {
        List<d1> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        T(22);
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
        return "enum entry " + getName();
    }

    @Override // t23.e
    public final t23.e u0() {
        return null;
    }
}
