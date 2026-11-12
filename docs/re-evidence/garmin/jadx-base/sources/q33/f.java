package q33;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import l43.o0;
import org.apache.commons.io.IOUtils;
import p005kotlin.jvm.internal.m0;
import p13.j0;
import q33.f.a;
import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f<A, S extends a<? extends A>> implements l43.h<A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f142458b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f142459a;

    public static abstract class a<A> {
    }

    public enum c {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142464a;

        static {
            int[] iArr = new int[l43.d.values().length];
            try {
                iArr[l43.d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l43.d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l43.d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f142464a = iArr;
        }
    }

    public f(v vVar) {
        vVar.getClass();
        this.f142459a = vVar;
    }

    public static /* synthetic */ List n(f fVar, o0 o0Var, a0 a0Var, Boolean bool, boolean z14, int i14) {
        boolean z15 = (i14 & 4) == 0;
        if ((i14 & 16) != 0) {
            bool = null;
        }
        return fVar.m(o0Var, a0Var, z15, false, bool, (i14 & 32) != 0 ? false : z14);
    }

    public static a0 p(z33.n nVar, u33.d dVar, u33.h hVar, l43.d dVar2, boolean z14) {
        nVar.getClass();
        dVar.getClass();
        hVar.getClass();
        dVar2.getClass();
        if (nVar instanceof s33.e) {
            a0.a aVar = a0.f142442b;
            w33.g.f181902a.getClass();
            w33.d.b bVarA = w33.g.a((s33.e) nVar, dVar, hVar);
            if (bVarA != null) {
                aVar.getClass();
                return a0.a.b(bVarA);
            }
        } else if (nVar instanceof s33.j) {
            a0.a aVar2 = a0.f142442b;
            w33.g.f181902a.getClass();
            w33.d.b bVarC = w33.g.c((s33.j) nVar, dVar, hVar);
            if (bVarC != null) {
                aVar2.getClass();
                return a0.a.b(bVarC);
            }
        } else if (nVar instanceof s33.o) {
            z33.g.f<s33.o, v33.a.d> fVar = v33.a.f175425d;
            fVar.getClass();
            v33.a.d dVar3 = (v33.a.d) u33.f.a((z33.g.d) nVar, fVar);
            if (dVar3 != null) {
                int i14 = d.f142464a[dVar2.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        if ((dVar3.f175459b & 8) != 8) {
                            return null;
                        }
                        a0.a aVar3 = a0.f142442b;
                        v33.a.c cVar = dVar3.f175463f;
                        cVar.getClass();
                        aVar3.getClass();
                        return a0.a.c(dVar, cVar);
                    }
                    if (i14 == 3) {
                        return h.a((s33.o) nVar, dVar, hVar, true, true, z14);
                    }
                } else if (dVar3.d()) {
                    a0.a aVar4 = a0.f142442b;
                    v33.a.c cVar2 = dVar3.f175462e;
                    cVar2.getClass();
                    aVar4.getClass();
                    return a0.a.c(dVar, cVar2);
                }
            }
        }
        return null;
    }

    @Override // l43.h
    public final List<A> a(o0 o0Var, z33.n nVar, l43.d dVar) {
        nVar.getClass();
        dVar.getClass();
        if (dVar == l43.d.PROPERTY) {
            return v(o0Var, (s33.o) nVar, c.PROPERTY);
        }
        a0 a0VarP = p(nVar, o0Var.f110076a, o0Var.f110077b, dVar, false);
        return a0VarP == null ? j0.f134944a : n(this, o0Var, a0VarP, null, false, 60);
    }

    @Override // l43.h
    public final List<A> b(o0 o0Var, z33.n nVar, l43.d dVar, int i14, s33.w wVar) {
        o0Var.getClass();
        nVar.getClass();
        dVar.getClass();
        return u(o0Var, nVar, dVar, i14);
    }

    @Override // l43.h
    public final List<A> d(o0 o0Var, s33.o oVar) {
        oVar.getClass();
        return v(o0Var, oVar, c.BACKING_FIELD);
    }

    @Override // l43.h
    public final ArrayList f(s33.u uVar, u33.d dVar) {
        uVar.getClass();
        List<s33.b> list = uVar.f156944k;
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (s33.b bVar : list) {
            bVar.getClass();
            arrayList.add(((j) this).f142486g.a(bVar, dVar));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> g(o0 o0Var, s33.o oVar) {
        oVar.getClass();
        return v(o0Var, oVar, c.DELEGATE_FIELD);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // l43.h
    public final List<A> h(o0 o0Var, z33.n nVar, l43.d dVar, int i14, s33.w wVar) {
        int size;
        o0Var.getClass();
        nVar.getClass();
        dVar.getClass();
        wVar.getClass();
        boolean z14 = nVar instanceof s33.j;
        int i15 = 0;
        if (z14) {
            size = ((s33.j) nVar).f156694o.size();
        } else {
            size = nVar instanceof s33.o ? ((s33.o) nVar).f156780o.size() : 0;
        }
        if (z14) {
            int i16 = ((s33.j) nVar).f156682c;
            if ((i16 & 32) == 32 || (i16 & 64) == 64) {
                i15 = 1;
            }
        } else if (nVar instanceof s33.o) {
            int i17 = ((s33.o) nVar).f156768c;
            if ((i17 & 32) == 32 || (i17 & 64) == 64) {
                i15 = 1;
            }
        } else {
            if (!(nVar instanceof s33.e)) {
                throw new UnsupportedOperationException("Unsupported message: " + nVar.getClass());
            }
            o0.a aVar = (o0.a) o0Var;
            if (aVar.f110082g == s33.c.EnumC2957c.ENUM_CLASS) {
                i15 = 2;
            } else if (aVar.f110083h) {
                i15 = 1;
            }
        }
        return u(o0Var, nVar, dVar, size + i15 + i14);
    }

    @Override // l43.h
    public final ArrayList i(s33.s sVar, u33.d dVar) {
        sVar.getClass();
        List<s33.b> list = sVar.f156868r;
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (s33.b bVar : list) {
            bVar.getClass();
            arrayList.add(((j) this).f142486g.a(bVar, dVar));
        }
        return arrayList;
    }

    @Override // l43.h
    public final List<A> j(o0 o0Var, s33.h hVar) {
        o0Var.getClass();
        hVar.getClass();
        a0.a aVar = a0.f142442b;
        String string = o0Var.f110076a.getString(hVar.f156648d);
        String strB = w33.b.b(((o0.a) o0Var).f110081f.b());
        aVar.getClass();
        return n(this, o0Var, a0.a.a(string, strB), null, false, 60);
    }

    @Override // l43.h
    public final ArrayList k(o0.a aVar) {
        aVar.getClass();
        y0 y0Var = aVar.f110078c;
        z zVar = y0Var instanceof z ? (z) y0Var : null;
        x xVar = zVar != null ? zVar.f142541b : null;
        if (xVar == null) {
            androidx.core.view.j.x(aVar.f110081f.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        xVar.c(new g(this, arrayList));
        return arrayList;
    }

    @Override // l43.h
    public final List<A> l(o0 o0Var, z33.n nVar, l43.d dVar) {
        int size;
        nVar.getClass();
        dVar.getClass();
        if (nVar instanceof s33.j) {
            size = ((s33.j) nVar).f156694o.size();
        } else {
            size = nVar instanceof s33.o ? ((s33.o) nVar).f156780o.size() : 0;
        }
        return u(o0Var, nVar, dVar, size);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public final List<A> m(o0 o0Var, a0 a0Var, boolean z14, boolean z15, Boolean bool, boolean z16) {
        List<A> list;
        u33.c cVarQ = q();
        f142458b.getClass();
        x xVarA = b.a(o0Var, z14, z15, bool, z16, this.f142459a, cVarQ);
        if (xVarA == null) {
            if (o0Var instanceof o0.a) {
                y0 y0Var = ((o0.a) o0Var).f110078c;
                z zVar = y0Var instanceof z ? (z) y0Var : null;
                if (zVar != null) {
                    xVarA = zVar.f142541b;
                } else {
                    xVarA = null;
                }
            } else {
                xVarA = null;
            }
        }
        return (xVarA == null || (list = o(xVarA).f142481a.get(a0Var)) == null) ? j0.f134944a : list;
    }

    public abstract i o(x xVar);

    public abstract u33.c q();

    public final boolean r(x33.b bVar) {
        x xVarA;
        bVar.getClass();
        if (bVar.e() == null || !p005kotlin.jvm.internal.s.g(bVar.f().b(), "Container") || (xVarA = w.a(this.f142459a, bVar, q())) == null) {
            return false;
        }
        p23.b.f135026a.getClass();
        m0 m0Var = new m0();
        xVarA.c(new p23.a(m0Var));
        return m0Var.f105804a;
    }

    public abstract k s(x33.b bVar, y0 y0Var, List list);

    public final x.a t(x33.b bVar, y23.b bVar2, List list) {
        list.getClass();
        p23.b.f135026a.getClass();
        if (p23.b.f135027b.contains(bVar)) {
            return null;
        }
        return s(bVar, bVar2, list);
    }

    public final List<A> u(o0 o0Var, z33.n nVar, l43.d dVar, int i14) {
        a0 a0VarP = p(nVar, o0Var.f110076a, o0Var.f110077b, dVar, false);
        if (a0VarP == null) {
            return j0.f134944a;
        }
        a0.f142442b.getClass();
        return n(this, o0Var, a0.a.d(a0VarP, i14), null, false, 60);
    }

    public final List<A> v(o0 o0Var, s33.o oVar, c cVar) {
        u33.h hVar = o0Var.f110077b;
        Boolean boolD = u33.b.B.d(oVar.f156769d);
        boolean zD = w33.g.d(oVar);
        c cVar2 = c.PROPERTY;
        u33.d dVar = o0Var.f110076a;
        if (cVar == cVar2) {
            a0 a0VarA = h.a(oVar, dVar, hVar, (40 & 8) == 0, (40 & 16) == 0, true);
            return a0VarA == null ? j0.f134944a : n(this, o0Var, a0VarA, boolD, zD, 8);
        }
        a0 a0VarA2 = h.a(oVar, dVar, hVar, (40 & 8) == 0, (40 & 16) == 0, true);
        if (a0VarA2 == null) {
            return j0.f134944a;
        }
        return d53.w.z(a0VarA2.f142443a, "$delegate", false) != (cVar == c.DELEGATE_FIELD) ? j0.f134944a : m(o0Var, a0VarA2, true, true, boolD, zD);
    }

    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00be  */
        /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
        public static x a(o0 o0Var, boolean z14, boolean z15, Boolean bool, boolean z16, v vVar, u33.c cVar) {
            r rVar;
            x xVar;
            o0.a aVar;
            s33.c.EnumC2957c enumC2957c;
            o0Var.getClass();
            y0 y0Var = o0Var.f110078c;
            cVar.getClass();
            if (z14) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + o0Var + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                }
                if (o0Var instanceof o0.a) {
                    o0.a aVar2 = (o0.a) o0Var;
                    if (aVar2.f110082g == s33.c.EnumC2957c.INTERFACE) {
                        return w.a(vVar, aVar2.f110081f.d(x33.f.e("DefaultImpls")), cVar);
                    }
                }
                if (bool.booleanValue() && (o0Var instanceof o0.b)) {
                    r rVar2 = y0Var instanceof r ? (r) y0Var : null;
                    g43.c cVar2 = rVar2 != null ? rVar2.f142523c : null;
                    if (cVar2 != null) {
                        x33.b.a aVar3 = x33.b.f188590d;
                        String strE = cVar2.e();
                        strE.getClass();
                        String strReplace = strE.replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
                        strReplace.getClass();
                        x33.c cVar3 = new x33.c(strReplace);
                        aVar3.getClass();
                        return w.a(vVar, x33.b.a.b(cVar3), cVar);
                    }
                }
            }
            if (z15 && (o0Var instanceof o0.a)) {
                o0.a aVar4 = (o0.a) o0Var;
                if (aVar4.f110082g == s33.c.EnumC2957c.COMPANION_OBJECT && (aVar = aVar4.f110080e) != null && ((enumC2957c = aVar.f110082g) == s33.c.EnumC2957c.CLASS || enumC2957c == s33.c.EnumC2957c.ENUM_CLASS || (z16 && (enumC2957c == s33.c.EnumC2957c.INTERFACE || enumC2957c == s33.c.EnumC2957c.ANNOTATION_CLASS)))) {
                    y0 y0Var2 = aVar.f110078c;
                    z zVar = y0Var2 instanceof z ? (z) y0Var2 : null;
                    if (zVar != null) {
                        return zVar.f142541b;
                    }
                } else if (o0Var instanceof o0.b) {
                    rVar = (r) y0Var;
                    xVar = rVar.f142524d;
                    if (xVar == null) {
                        return w.a(vVar, rVar.d(), cVar);
                    }
                    return xVar;
                }
            } else if ((o0Var instanceof o0.b) && (y0Var instanceof r)) {
                rVar = (r) y0Var;
                xVar = rVar.f142524d;
                if (xVar == null) {
                    return w.a(vVar, rVar.d(), cVar);
                }
                return xVar;
            }
            return null;
        }

        private b() {
        }
    }
}
