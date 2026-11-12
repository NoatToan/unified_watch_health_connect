package l43;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.c0 f110011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.g0 f110012b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f110013a;

        static {
            int[] iArr = new int[s33.b.C2953b.c.EnumC2956c.values().length];
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s33.b.C2953b.c.EnumC2956c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f110013a = iArr;
        }
    }

    public g(t23.c0 c0Var, t23.g0 g0Var) {
        c0Var.getClass();
        g0Var.getClass();
        this.f110011a = c0Var;
        this.f110012b = g0Var;
    }

    public final u23.d a(s33.b bVar, u33.d dVar) {
        bVar.getClass();
        dVar.getClass();
        t23.e eVarC = t23.u.c(this.f110011a, m0.a(dVar, bVar.f156461c), this.f110012b);
        Map mapL = p13.k0.f134949a;
        mapL.getClass();
        if (bVar.f156462d.size() != 0 && !r43.l.f(eVarC)) {
            int i14 = b43.i.f15728a;
            if (b43.i.l(eVarC, t23.f.ANNOTATION_CLASS)) {
                Collection<t23.d> collectionN = eVarC.n();
                collectionN.getClass();
                t23.d dVar2 = (t23.d) p13.h0.J0(collectionN);
                if (dVar2 != null) {
                    List<j1> listF = dVar2.f();
                    listF.getClass();
                    int iA = p13.t0.a(p13.y.r(listF, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : listF) {
                        linkedHashMap.put(((j1) obj).getName(), obj);
                    }
                    List<s33.b.C2953b> list = bVar.f156462d;
                    ArrayList arrayListL = androidx.core.view.j.l(list);
                    for (s33.b.C2953b c2953b : list) {
                        c2953b.getClass();
                        j1 j1Var = (j1) linkedHashMap.get(x33.f.d(dVar.getString(c2953b.f156469c)));
                        Object pVar = null;
                        if (j1Var != null) {
                            x33.f fVarD = x33.f.d(dVar.getString(c2953b.f156469c));
                            p43.n0 type = j1Var.getType();
                            type.getClass();
                            s33.b.C2953b.c cVar = c2953b.f156470d;
                            cVar.getClass();
                            d43.g<?> gVarC = c(type, cVar, dVar);
                            pVar = b(gVarC, type, cVar) ? gVarC : null;
                            if (pVar == null) {
                                d43.l.a aVar = d43.l.f57486b;
                                String str = "Unexpected argument value: actual type " + cVar.f156480c + " != expected type " + type;
                                aVar.getClass();
                                pVar = new d43.l.b(str);
                            }
                            pVar = new o13.p(fVarD, pVar);
                        }
                        if (pVar != null) {
                            arrayListL.add(pVar);
                        }
                    }
                    mapL = p13.u0.l(arrayListL);
                }
            }
        }
        return new u23.d(eVarC.p(), mapL, t23.y0.f162076a);
    }

    public final boolean b(d43.g<?> gVar, p43.n0 n0Var, s33.b.C2953b.c cVar) {
        s33.b.C2953b.c.EnumC2956c enumC2956c = cVar.f156480c;
        int i14 = enumC2956c == null ? -1 : a.f110013a[enumC2956c.ordinal()];
        if (i14 != 10) {
            t23.c0 c0Var = this.f110011a;
            if (i14 != 13) {
                return p005kotlin.jvm.internal.s.g(gVar.a(c0Var), n0Var);
            }
            if (gVar instanceof d43.b) {
                T t7 = ((d43.b) gVar).f57481a;
                if (((List) t7).size() == cVar.f156488k.size()) {
                    p43.n0 n0VarG = c0Var.e().g(n0Var);
                    if (n0VarG != null) {
                        Iterable iterableI = p13.x.i((Collection) t7);
                        if ((iterableI instanceof Collection) && ((Collection) iterableI).isEmpty()) {
                            return true;
                        }
                        Iterator<Integer> it = iterableI.iterator();
                        while (((j23.k) it).f96801c) {
                            int iNextInt = ((p13.p0) it).nextInt();
                            d43.g<?> gVar2 = (d43.g) ((List) t7).get(iNextInt);
                            s33.b.C2953b.c cVar2 = cVar.f156488k.get(iNextInt);
                            cVar2.getClass();
                            if (!b(gVar2, n0VarG, cVar2)) {
                            }
                        }
                        return true;
                    }
                }
            }
            o2.c.s(gVar, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
            return false;
        }
        t23.h hVarT = n0Var.F0().t();
        t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
        if (eVar == null) {
            return true;
        }
        x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.R)) {
            return true;
        }
        return false;
    }

    public final d43.g<?> c(p43.n0 n0Var, s33.b.C2953b.c cVar, u33.d dVar) {
        cVar.getClass();
        dVar.getClass();
        boolean zBooleanValue = u33.b.P.d(cVar.f156490m).booleanValue();
        s33.b.C2953b.c.EnumC2956c enumC2956c = cVar.f156480c;
        switch (enumC2956c == null ? -1 : a.f110013a[enumC2956c.ordinal()]) {
            case 1:
                byte b14 = (byte) cVar.f156481d;
                return zBooleanValue ? new d43.a0(b14) : new d43.d(b14);
            case 2:
                return new d43.e((char) cVar.f156481d);
            case 3:
                short s8 = (short) cVar.f156481d;
                return zBooleanValue ? new d43.d0(s8) : new d43.w(s8);
            case 4:
                int i14 = (int) cVar.f156481d;
                return zBooleanValue ? new d43.b0(i14) : new d43.n(i14);
            case 5:
                long j8 = cVar.f156481d;
                return zBooleanValue ? new d43.c0(j8) : new d43.u(j8);
            case 6:
                return new d43.m(cVar.f156482e);
            case 7:
                return new d43.j(cVar.f156483f);
            case 8:
                return new d43.c(cVar.f156481d != 0);
            case 9:
                return new d43.x(dVar.getString(cVar.f156484g));
            case 10:
                return new d43.t(m0.a(dVar, cVar.f156485h), cVar.f156489l);
            case 11:
                return new d43.k(m0.a(dVar, cVar.f156485h), x33.f.d(dVar.getString(cVar.f156486i)));
            case 12:
                s33.b bVar = cVar.f156487j;
                bVar.getClass();
                return new d43.a(a(bVar, dVar));
            case 13:
                d43.i iVar = d43.i.f57483a;
                List<s33.b.C2953b.c> list = cVar.f156488k;
                list.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (s33.b.C2953b.c cVar2 : list) {
                    p43.v0 v0VarE = this.f110011a.e().e();
                    v0VarE.getClass();
                    cVar2.getClass();
                    arrayList.add(c(v0VarE, cVar2, dVar));
                }
                iVar.getClass();
                return new d43.z(arrayList, n0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.f156480c + " (expected " + n0Var + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }
}
