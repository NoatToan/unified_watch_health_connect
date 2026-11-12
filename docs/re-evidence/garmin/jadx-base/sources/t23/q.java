package t23;

import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f162046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f162047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f162048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f162049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f162050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f162051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f162052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f162053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f162054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<r> f162055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map<r, Integer> f162056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f162057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f162058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f162059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final c f162060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final w43.l f162061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final HashMap f162062q;

    public static class a implements j43.g {
        @Override // j43.g
        public final p43.n0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class b implements j43.g {
        @Override // j43.g
        public final p43.n0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class c implements j43.g {
        @Override // j43.g
        public final p43.n0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    public static class d extends p {
        public d(m1 m1Var) {
            super(m1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r4v0, types: [t23.l, t23.o] */
        /* JADX WARN: Type inference failed for: r4v6, types: [t23.l] */
        /* JADX WARN: Type inference failed for: r4v7, types: [t23.l] */
        /* JADX WARN: Type inference failed for: r4v9, types: [t23.l] */
        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (b43.i.q(oVar) && b43.i.e(lVar) != z0.f162077a) {
                return q.d(oVar, lVar);
            }
            if (oVar instanceof t23.k) {
                ((t23.k) oVar).d();
            }
            while (oVar != 0) {
                oVar = oVar.d();
                if (((oVar instanceof t23.e) && !b43.i.k(oVar)) || (oVar instanceof h0)) {
                    break;
                }
            }
            if (oVar == 0) {
                return false;
            }
            while (lVar != null) {
                if (oVar == lVar) {
                    return true;
                }
                if (lVar instanceof h0) {
                    return (oVar instanceof h0) && ((h0) oVar).c().equals(((h0) lVar).c()) && b43.i.c(lVar).equals(b43.i.c(oVar));
                }
                lVar = lVar.d();
            }
            return false;
        }
    }

    public static class e extends p {
        public e(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            t23.l lVarH;
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (!q.f162046a.c(gVar, oVar, lVar)) {
                return false;
            }
            if (gVar == q.f162059n) {
                return true;
            }
            if (gVar == q.f162058m || (lVarH = b43.i.h(oVar, t23.e.class, true)) == null || !(gVar instanceof j43.e)) {
                return false;
            }
            return ((j43.e) gVar).f97046a.a().equals(lVarH.a());
        }
    }

    public static class f extends p {
        public f(m1 m1Var) {
            super(m1Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
        
            if ((r1.I0() instanceof p43.b0) == false) goto L49;
         */
        @Override // t23.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            t23.e eVar;
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
            }
            t23.e eVar2 = (t23.e) b43.i.h(oVar, t23.e.class, true);
            t23.e eVar3 = (t23.e) b43.i.h(lVar, t23.e.class, false);
            if (eVar3 != null) {
                if (eVar2 == null || !b43.i.k(eVar2) || (eVar = (t23.e) b43.i.h(eVar2, t23.e.class, true)) == null || !b43.i.p(eVar3.p(), eVar.a())) {
                    o oVarR = oVar instanceof t23.b ? b43.i.r((t23.b) oVar) : oVar;
                    t23.e eVar4 = (t23.e) b43.i.h(oVarR, t23.e.class, true);
                    if (eVar4 != null) {
                        if (b43.i.p(eVar3.p(), eVar4.a()) && gVar != q.f162060o) {
                            if ((oVarR instanceof t23.b) && !(oVarR instanceof t23.k) && gVar != q.f162059n) {
                                if (gVar != q.f162058m && gVar != null) {
                                    p43.n0 n0VarB = gVar instanceof j43.h ? ((j43.h) gVar).b() : gVar.getType();
                                    if (!b43.i.p(n0VarB, eVar3)) {
                                    }
                                }
                            }
                        }
                        return c(gVar, oVar, eVar3.d());
                    }
                }
                return true;
            }
            return false;
        }
    }

    public static class g extends p {
        public g(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!b43.i.c(lVar).D(b43.i.c(oVar))) {
                return false;
            }
            q.f162061p.a(oVar, lVar);
            return true;
        }
    }

    public static class h extends p {
        public h(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    public static class i extends p {
        public i(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    public static class j extends p {
        public j(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    public static class k extends p {
        public k(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    public static class l extends p {
        public l(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, o oVar, t23.l lVar) {
            if (lVar != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        d dVar = new d(l1.e.f162035c);
        f162046a = dVar;
        e eVar = new e(l1.f.f162036c);
        f162047b = eVar;
        f fVar = new f(l1.g.f162037c);
        f162048c = fVar;
        g gVar = new g(l1.b.f162032c);
        f162049d = gVar;
        h hVar = new h(l1.h.f162038c);
        f162050e = hVar;
        i iVar = new i(l1.d.f162034c);
        f162051f = iVar;
        j jVar = new j(l1.a.f162031c);
        f162052g = jVar;
        k kVar = new k(l1.c.f162033c);
        f162053h = kVar;
        l lVar = new l(l1.i.f162039c);
        f162054i = lVar;
        f162055j = Collections.unmodifiableSet(p13.u.m0(new r[]{dVar, eVar, gVar, iVar}));
        HashMap map = new HashMap(6);
        map.put(eVar, 0);
        map.put(dVar, 0);
        map.put(gVar, 1);
        map.put(fVar, 1);
        map.put(hVar, 2);
        f162056k = Collections.unmodifiableMap(map);
        f162057l = hVar;
        f162058m = new a();
        f162059n = new b();
        f162060o = new c();
        try {
            Iterator it = Arrays.asList(new w43.l[0]).iterator();
            f162061p = it.hasNext() ? (w43.l) it.next() : w43.l.a.f182015a;
            f162062q = new HashMap();
            f(dVar);
            f(eVar);
            f(fVar);
            f(gVar);
            f(hVar);
            f(iVar);
            f(jVar);
            f(kVar);
            f(lVar);
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void a(int i14) {
        String str = i14 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 16 ? 3 : 2];
        if (i14 != 1 && i14 != 3 && i14 != 5 && i14 != 7) {
            switch (i14) {
                case 9:
                    objArr[0] = Constants.MessagePayloadKeys.FROM;
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = Constants.MessagePayloadKeys.FROM;
        }
        if (i14 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i14) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(r rVar, r rVar2) {
        if (rVar == null) {
            a(12);
            throw null;
        }
        if (rVar2 == null) {
            a(13);
            throw null;
        }
        Integer numA = rVar.a().a(rVar2.a());
        if (numA != null) {
            return numA;
        }
        Integer numA2 = rVar2.a().a(rVar.a());
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static o c(j43.g gVar, o oVar, t23.l lVar) {
        o oVarC;
        if (oVar == null) {
            a(8);
            throw null;
        }
        if (lVar == null) {
            a(9);
            throw null;
        }
        for (o oVar2 = (o) oVar.a(); oVar2 != null && oVar2.getVisibility() != f162051f; oVar2 = (o) b43.i.h(oVar2, o.class, true)) {
            if (!oVar2.getVisibility().c(gVar, oVar2, lVar)) {
                return oVar2;
            }
        }
        if (!(oVar instanceof w23.t0) || (oVarC = c(gVar, ((w23.t0) oVar).a0(), lVar)) == null) {
            return null;
        }
        return oVarC;
    }

    public static boolean d(o oVar, t23.l lVar) {
        if (lVar == null) {
            a(7);
            throw null;
        }
        z0 z0VarE = b43.i.e(lVar);
        if (z0VarE != z0.f162077a) {
            return z0VarE.equals(b43.i.e(oVar));
        }
        return false;
    }

    public static boolean e(r rVar) {
        if (rVar != null) {
            return rVar == f162046a || rVar == f162047b;
        }
        a(14);
        throw null;
    }

    public static void f(p pVar) {
        f162062q.put(pVar.f162042a, pVar);
    }

    public static r g(m1 m1Var) {
        if (m1Var == null) {
            a(15);
            throw null;
        }
        r rVar = (r) f162062q.get(m1Var);
        if (rVar != null) {
            return rVar;
        }
        com.google.firebase.messaging.l.j(m1Var, "Inapplicable visibility: ");
        return null;
    }
}
