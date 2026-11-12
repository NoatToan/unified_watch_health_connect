package l43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p43.a1;
import p43.c1;
import p43.d2;
import p43.g2;
import p43.j1;
import p43.k1;
import p43.m1;
import p43.t1;
import p43.u1;
import p43.v1;
import p43.z0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f110120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f110121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f110123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o43.i f110124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o43.i f110125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f110126g;

    public x0(p pVar, x0 x0Var, List<s33.u> list, String str, String str2) {
        Map linkedHashMap;
        pVar.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f110120a = pVar;
        this.f110121b = x0Var;
        this.f110122c = str;
        this.f110123d = str2;
        o43.n nVar = pVar.f110085a.f110051a;
        this.f110124e = nVar.h(new s0(this));
        this.f110125f = nVar.h(new t0(this));
        if (list.isEmpty()) {
            linkedHashMap = p13.k0.f134949a;
            linkedHashMap.getClass();
        } else {
            linkedHashMap = new LinkedHashMap();
            int i14 = 0;
            for (s33.u uVar : list) {
                linkedHashMap.put(Integer.valueOf(uVar.f156937d), new n43.k0(this.f110120a, uVar, i14));
                i14++;
            }
        }
        this.f110126g = linkedHashMap;
    }

    public static p43.v0 a(p43.v0 v0Var, p43.n0 n0Var) {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarD = o72.t.D(v0Var);
        u23.h annotations = v0Var.getAnnotations();
        p43.n0 n0VarF = p005kotlin.reflect.jvm.internal.impl.builtins.c.f(v0Var);
        List<p43.n0> listD = p005kotlin.reflect.jvm.internal.impl.builtins.c.d(v0Var);
        List listV = p13.h0.V(1, p005kotlin.reflect.jvm.internal.impl.builtins.c.g(v0Var));
        ArrayList arrayList = new ArrayList(p13.y.r(listV, 10));
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            arrayList.add(((t1) it.next()).getType());
        }
        return p005kotlin.reflect.jvm.internal.impl.builtins.c.b(dVarD, annotations, n0VarF, listD, arrayList, n0Var, true).J0(v0Var.G0());
    }

    public static final ArrayList e(x0 x0Var, s33.s sVar) {
        List<s33.s.b> list = sVar.f156854d;
        list.getClass();
        s33.s sVarE = u33.g.e(sVar, x0Var.f110120a.f110088d);
        Iterable iterableE = sVarE != null ? e(x0Var, sVarE) : null;
        if (iterableE == null) {
            iterableE = p13.j0.f134944a;
        }
        return p13.h0.C0(list, iterableE);
    }

    public static k1 f(List list, u23.h hVar, m1 m1Var, t23.l lVar) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).a(hVar));
        }
        ArrayList arrayListS = p13.y.s(arrayList);
        k1.f135863b.getClass();
        return k1.a.a(arrayListS);
    }

    public static final t23.e h(x0 x0Var, s33.s sVar, int i14) {
        p pVar = x0Var.f110120a;
        x33.b bVarA = m0.a(pVar.f110086b, i14);
        List<Integer> listT = c53.c0.t(c53.c0.o(c53.q.e(new v0(x0Var), sVar), w0.f110118a));
        int iF = c53.c0.f(c53.q.e(new p005kotlin.jvm.internal.i0() { // from class: l43.x0.a
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public final Object get(Object obj) {
                return ((x33.b) obj).e();
            }
        }, bVarA));
        while (true) {
            ArrayList arrayList = (ArrayList) listT;
            if (arrayList.size() >= iF) {
                return pVar.f110085a.f110062l.a(bVarA, listT);
            }
            arrayList.add(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List<d1> b() {
        return p13.h0.b1(this.f110126g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final d1 c(int i14) {
        d1 d1Var = (d1) this.f110126g.get(Integer.valueOf(i14));
        if (d1Var != null) {
            return d1Var;
        }
        x0 x0Var = this.f110121b;
        if (x0Var != null) {
            return x0Var.c(i14);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026b A[PHI: r16
      0x026b: PHI (r16v4 p43.v0) = (r16v0 p43.v0), (r16v3 p43.v0) binds: [B:100:0x0269, B:104:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x026f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0276  */
    /* JADX WARN: Code duplicated, block: B:105:0x028c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0291  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x031a  */
    /* JADX WARN: Code duplicated, block: B:137:0x031d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0320  */
    /* JADX WARN: Code duplicated, block: B:140:0x0325  */
    /* JADX WARN: Code duplicated, block: B:143:0x032e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0333  */
    /* JADX WARN: Code duplicated, block: B:146:0x0339  */
    /* JADX WARN: Code duplicated, block: B:148:0x034a  */
    /* JADX WARN: Code duplicated, block: B:150:0x035e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0367 A[PHI: r4
      0x0367: PHI (r4v9 p43.v0) = (r4v8 p43.v0), (r4v17 p43.v0) binds: [B:151:0x0365, B:145:0x0337] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0369  */
    /* JADX WARN: Code duplicated, block: B:157:0x0379  */
    /* JADX WARN: Code duplicated, block: B:158:0x037c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0381  */
    /* JADX WARN: Code duplicated, block: B:161:0x0388  */
    /* JADX WARN: Code duplicated, block: B:163:0x038c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0396 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:167:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x017f  */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0192  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x0249  */
    /* JADX WARN: Code duplicated, block: B:97:0x0259  */
    /* JADX WARN: Code duplicated, block: B:99:0x0268  */
    /* JADX WARN: Multi-variable type inference failed */
    public final p43.v0 d(s33.s sVar, boolean z14) {
        m1 m1VarD;
        t23.h hVarH;
        Object next;
        int i14;
        k1 k1VarF;
        ArrayList arrayList;
        int i15;
        p43.v0 v0VarE;
        List listB1;
        boolean zBooleanValue;
        boolean z15;
        p43.v0 v0VarE2;
        p43.v0 v0VarA;
        int size;
        t23.h hVarT;
        r23.f fVarE;
        t1 t1Var;
        p43.n0 type;
        t23.h hVarT2;
        x33.c cVarG;
        p43.n0 type2;
        t23.a aVar;
        x33.c cVarC;
        int size2;
        int i16;
        s33.s sVar2;
        s33.s sVarA;
        s33.s sVar3;
        int i17;
        s33.s.b bVar;
        d1 d1Var;
        s33.s.b.c cVar;
        int i18;
        g2 g2Var;
        int i19;
        s33.s sVarA2;
        u1 v1Var;
        p pVar = this.f110120a;
        u33.h hVar = pVar.f110088d;
        n nVar = pVar.f110085a;
        t23.l lVar = pVar.f110087c;
        sVar.getClass();
        if (sVar.m()) {
            if (m0.a(pVar.f110086b, sVar.f156859i).f188593c) {
                pVar.f110085a.f110057g.getClass();
            }
        } else if ((sVar.f156853c & 128) == 128) {
            if (m0.a(pVar.f110086b, sVar.f156862l).f188593c) {
                pVar.f110085a.f110057g.getClass();
            }
        }
        if (!sVar.m()) {
            int i24 = sVar.f156853c;
            if ((i24 & 32) == 32) {
                hVarH = c(sVar.f156860j);
                if (hVarH == null) {
                    r43.l lVar2 = r43.l.f150388a;
                    r43.k kVar = r43.k.f150376o;
                    String[] strArr = {String.valueOf(sVar.f156860j), this.f110123d};
                    lVar2.getClass();
                    m1VarD = r43.l.d(kVar, strArr);
                }
            } else if ((i24 & 64) == 64) {
                String string = pVar.f110086b.getString(sVar.f156861k);
                Iterator<T> it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((d1) next).getName().b(), string));
                d1 d1Var2 = (d1) next;
                if (d1Var2 == null) {
                    r43.l lVar3 = r43.l.f150388a;
                    r43.k kVar2 = r43.k.f150377p;
                    String[] strArr2 = {string, lVar.toString()};
                    lVar3.getClass();
                    m1VarD = r43.l.d(kVar2, strArr2);
                } else {
                    hVarH = d1Var2;
                }
            } else if ((i24 & 128) == 128) {
                hVarH = (t23.h) this.f110125f.invoke(Integer.valueOf(sVar.f156862l));
                if (hVarH == null) {
                    hVarH = h(this, sVar, sVar.f156862l);
                }
            } else {
                r43.l.f150388a.getClass();
                m1VarD = r43.l.d(r43.k.f150379r, new String[0]);
            }
            i14 = 1;
            if (r43.l.f(m1VarD.t())) {
                r43.l lVar4 = r43.l.f150388a;
                r43.k kVar3 = r43.k.f150384y;
                String[] strArr3 = {m1VarD.toString()};
                lVar4.getClass();
                kVar3.getClass();
                return r43.l.e(kVar3, p13.j0.f134944a, m1VarD, (String[]) Arrays.copyOf(strArr3, 1));
            }
            n43.a aVar2 = new n43.a(nVar.f110051a, new u0(this, sVar));
            k1VarF = f(nVar.f110068r, aVar2, m1VarD, lVar);
            ArrayList arrayListE = e(this, sVar);
            arrayList = new ArrayList(p13.y.r(arrayListE, 10));
            i15 = 0;
            for (Object obj : arrayListE) {
                i17 = i15 + 1;
                if (i15 >= 0) {
                    p13.x.q();
                    throw null;
                }
                bVar = (s33.s.b) obj;
                List<d1> parameters = m1VarD.getParameters();
                parameters.getClass();
                d1Var = (d1) p13.h0.e0(i15, parameters);
                cVar = bVar.f156875c;
                if (cVar == s33.s.b.c.STAR) {
                    p0 p0Var = p0.f110094a;
                    cVar.getClass();
                    p0Var.getClass();
                    i18 = p0.a.f110098d[cVar.ordinal()];
                    if (i18 != i14) {
                        g2Var = g2.IN_VARIANCE;
                    } else if (i18 != 2) {
                        g2Var = g2.OUT_VARIANCE;
                    } else {
                        if (i18 != 3) {
                            if (i18 != 4) {
                                lc.u0.r();
                                return null;
                            }
                            com.google.firebase.messaging.l.j(cVar, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        g2Var = g2.INVARIANT;
                    }
                    i19 = bVar.f156874b;
                    if ((i19 & 2) == 2) {
                        sVarA2 = bVar.f156876d;
                    } else if ((i19 & 4) == 4) {
                        sVarA2 = hVar.a(bVar.f156877e);
                    } else {
                        sVarA2 = null;
                    }
                    if (sVarA2 == null) {
                        v1Var = new v1(r43.l.c(r43.k.D, bVar.toString()));
                    } else {
                        v1Var = new v1(g2Var, g(sVarA2));
                    }
                } else if (d1Var == null) {
                    v1Var = new a1(nVar.f110052b.e());
                } else {
                    v1Var = new c1(d1Var);
                }
                arrayList.add(v1Var);
                i15 = i17;
                i14 = 1;
            }
            v0VarE = null;
            listB1 = p13.h0.b1(arrayList);
            t23.h hVarT3 = m1VarD.t();
            if (z14 || !(hVarT3 instanceof t23.c1)) {
                zBooleanValue = u33.b.f168295a.d(sVar.f156867q).booleanValue();
                z15 = sVar.f156855e;
                if (zBooleanValue) {
                    size = m1VarD.getParameters().size() - listB1.size();
                    if (size == 0) {
                        v0VarA = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                        hVarT = v0VarA.F0().t();
                        if (hVarT == null && (hVarT instanceof t23.e) && p005kotlin.reflect.jvm.internal.impl.builtins.d.K(hVarT)) {
                            int i25 = f43.e.f68881a;
                            x33.d dVarF = b43.i.f(hVarT);
                            dVarF.getClass();
                            fVarE = p005kotlin.reflect.jvm.internal.impl.builtins.c.e(dVarF);
                        } else {
                            fVarE = null;
                        }
                        if (p005kotlin.jvm.internal.s.g(fVarE, r23.f.a.f149959c) || (t1Var = (t1) p13.h0.n0(p005kotlin.reflect.jvm.internal.impl.builtins.c.g(v0VarA))) == null || (type = t1Var.getType()) == null) {
                            v0VarA = null;
                        } else {
                            hVarT2 = type.F0().t();
                            if (hVarT2 != null) {
                                cVarG = f43.e.g(hVarT2);
                            } else {
                                cVarG = null;
                            }
                            if (type.D0().size() == 1 && (p005kotlin.jvm.internal.s.g(cVarG, p005kotlin.reflect.jvm.internal.impl.builtins.f.f105855g) || p005kotlin.jvm.internal.s.g(cVarG, y0.f110133a))) {
                                type2 = ((t1) p13.h0.I0(type.D0())).getType();
                                type2.getClass();
                                if (lVar instanceof t23.a) {
                                    aVar = (t23.a) lVar;
                                } else {
                                    aVar = null;
                                }
                                if (aVar != null) {
                                    cVarC = f43.e.c(aVar);
                                } else {
                                    cVarC = null;
                                }
                                if (p005kotlin.jvm.internal.s.g(cVarC, r0.f110102a)) {
                                    v0VarA = a(v0VarA, type2);
                                } else {
                                    v0VarA = a(v0VarA, type2);
                                }
                            }
                        }
                    } else if (size == 1) {
                        size2 = listB1.size() - 1;
                        if (size2 >= 0) {
                            m1 m1VarH = m1VarD.e().w(size2).h();
                            m1VarH.getClass();
                            v0VarE = p43.q0.e(k1VarF, m1VarH, listB1, z15, null);
                            v0VarA = v0VarE;
                        } else {
                            v0VarA = null;
                        }
                    } else {
                        v0VarA = v0VarE;
                    }
                    if (v0VarA == null) {
                        r43.l.f150388a.getClass();
                        v0VarE2 = r43.l.e(r43.k.f150378q, listB1, m1VarD, new String[0]);
                    } else {
                        v0VarE2 = v0VarA;
                    }
                } else {
                    v0VarE2 = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                    if (u33.b.f168296b.d(sVar.f156867q).booleanValue()) {
                        v0VarA = p43.w.a.a(p43.w.f135930d, v0VarE2, true);
                        if (v0VarA == null) {
                            androidx.core.view.j.A(v0VarE2, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        v0VarE2 = v0VarA;
                    }
                }
                v0VarE = null;
            } else {
                p43.v0 v0VarA2 = p43.q0.a((t23.c1) hVarT3, listB1);
                List<j1> list = nVar.f110068r;
                u23.h.a aVar3 = u23.h.f168226x0;
                ArrayList arrayListA0 = p13.h0.A0(aVar2, v0VarA2.getAnnotations());
                aVar3.getClass();
                v0VarE2 = v0VarA2.J0(d2.g(v0VarA2) || sVar.f156855e).L0(f(list, u23.h.a.a(arrayListA0), m1VarD, lVar));
            }
            i16 = sVar.f156853c;
            if ((i16 & 1024) == 1024) {
                sVar3 = sVar.f156865o;
            } else if ((i16 & 2048) == 2048) {
                sVarA = hVar.a(sVar.f156866p);
            } else {
                sVar2 = v0VarE;
            }
            if (sVar2 != 0) {
                sVar2 = sVarA;
                sVar2 = sVar3;
                return z0.c(v0VarE2, d(sVar2, false));
            }
            sVar2 = sVarA;
            sVar2 = sVar3;
            return v0VarE2;
        }
        hVarH = (t23.h) this.f110124e.invoke(Integer.valueOf(sVar.f156859i));
        if (hVarH == null) {
            hVarH = h(this, sVar, sVar.f156859i);
        }
        m1VarD = hVarH.h();
        m1VarD.getClass();
        i14 = 1;
        if (r43.l.f(m1VarD.t())) {
            r43.l lVar5 = r43.l.f150388a;
            r43.k kVar4 = r43.k.f150384y;
            String[] strArr4 = {m1VarD.toString()};
            lVar5.getClass();
            kVar4.getClass();
            return r43.l.e(kVar4, p13.j0.f134944a, m1VarD, (String[]) Arrays.copyOf(strArr4, 1));
        }
        n43.a aVar4 = new n43.a(nVar.f110051a, new u0(this, sVar));
        k1VarF = f(nVar.f110068r, aVar4, m1VarD, lVar);
        ArrayList arrayListE2 = e(this, sVar);
        arrayList = new ArrayList(p13.y.r(arrayListE2, 10));
        i15 = 0;
        while (r11.hasNext()) {
            i17 = i15 + 1;
            if (i15 >= 0) {
                p13.x.q();
                throw null;
            }
            bVar = (s33.s.b) obj;
            List<d1> parameters2 = m1VarD.getParameters();
            parameters2.getClass();
            d1Var = (d1) p13.h0.e0(i15, parameters2);
            cVar = bVar.f156875c;
            if (cVar == s33.s.b.c.STAR) {
                p0 p0Var2 = p0.f110094a;
                cVar.getClass();
                p0Var2.getClass();
                i18 = p0.a.f110098d[cVar.ordinal()];
                if (i18 != i14) {
                    g2Var = g2.IN_VARIANCE;
                } else if (i18 != 2) {
                    g2Var = g2.OUT_VARIANCE;
                } else {
                    if (i18 != 3) {
                        if (i18 != 4) {
                            lc.u0.r();
                            return null;
                        }
                        com.google.firebase.messaging.l.j(cVar, "Only IN, OUT and INV are supported. Actual argument: ");
                        return null;
                    }
                    g2Var = g2.INVARIANT;
                }
                i19 = bVar.f156874b;
                if ((i19 & 2) == 2) {
                    sVarA2 = bVar.f156876d;
                } else if ((i19 & 4) == 4) {
                    sVarA2 = hVar.a(bVar.f156877e);
                } else {
                    sVarA2 = null;
                }
                if (sVarA2 == null) {
                    v1Var = new v1(r43.l.c(r43.k.D, bVar.toString()));
                } else {
                    v1Var = new v1(g2Var, g(sVarA2));
                }
            } else if (d1Var == null) {
                v1Var = new a1(nVar.f110052b.e());
            } else {
                v1Var = new c1(d1Var);
            }
            arrayList.add(v1Var);
            i15 = i17;
            i14 = 1;
        }
        v0VarE = null;
        listB1 = p13.h0.b1(arrayList);
        t23.h hVarT4 = m1VarD.t();
        if (z14) {
            zBooleanValue = u33.b.f168295a.d(sVar.f156867q).booleanValue();
            z15 = sVar.f156855e;
            if (zBooleanValue) {
                size = m1VarD.getParameters().size() - listB1.size();
                if (size == 0) {
                    v0VarA = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                    hVarT = v0VarA.F0().t();
                    if (hVarT == null) {
                        fVarE = null;
                    } else {
                        fVarE = null;
                    }
                    if (p005kotlin.jvm.internal.s.g(fVarE, r23.f.a.f149959c)) {
                        v0VarA = null;
                    } else {
                        hVarT2 = type.F0().t();
                        if (hVarT2 != null) {
                            cVarG = f43.e.g(hVarT2);
                        } else {
                            cVarG = null;
                        }
                        if (type.D0().size() == 1) {
                            type2 = ((t1) p13.h0.I0(type.D0())).getType();
                            type2.getClass();
                            if (lVar instanceof t23.a) {
                                aVar = (t23.a) lVar;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                cVarC = f43.e.c(aVar);
                            } else {
                                cVarC = null;
                            }
                            if (p005kotlin.jvm.internal.s.g(cVarC, r0.f110102a)) {
                                v0VarA = a(v0VarA, type2);
                            } else {
                                v0VarA = a(v0VarA, type2);
                            }
                        }
                    }
                } else if (size == 1) {
                    size2 = listB1.size() - 1;
                    if (size2 >= 0) {
                        m1 m1VarH2 = m1VarD.e().w(size2).h();
                        m1VarH2.getClass();
                        v0VarE = p43.q0.e(k1VarF, m1VarH2, listB1, z15, null);
                        v0VarA = v0VarE;
                    } else {
                        v0VarA = null;
                    }
                } else {
                    v0VarA = v0VarE;
                }
                if (v0VarA == null) {
                    r43.l.f150388a.getClass();
                    v0VarE2 = r43.l.e(r43.k.f150378q, listB1, m1VarD, new String[0]);
                } else {
                    v0VarE2 = v0VarA;
                }
            } else {
                v0VarE2 = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                if (u33.b.f168296b.d(sVar.f156867q).booleanValue()) {
                    v0VarA = p43.w.a.a(p43.w.f135930d, v0VarE2, true);
                    if (v0VarA == null) {
                        androidx.core.view.j.A(v0VarE2, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    v0VarE2 = v0VarA;
                }
            }
            v0VarE = null;
        } else {
            zBooleanValue = u33.b.f168295a.d(sVar.f156867q).booleanValue();
            z15 = sVar.f156855e;
            if (zBooleanValue) {
                size = m1VarD.getParameters().size() - listB1.size();
                if (size == 0) {
                    v0VarA = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                    hVarT = v0VarA.F0().t();
                    if (hVarT == null) {
                        fVarE = null;
                    } else {
                        fVarE = null;
                    }
                    if (p005kotlin.jvm.internal.s.g(fVarE, r23.f.a.f149959c)) {
                        v0VarA = null;
                    } else {
                        hVarT2 = type.F0().t();
                        if (hVarT2 != null) {
                            cVarG = f43.e.g(hVarT2);
                        } else {
                            cVarG = null;
                        }
                        if (type.D0().size() == 1) {
                            type2 = ((t1) p13.h0.I0(type.D0())).getType();
                            type2.getClass();
                            if (lVar instanceof t23.a) {
                                aVar = (t23.a) lVar;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                cVarC = f43.e.c(aVar);
                            } else {
                                cVarC = null;
                            }
                            if (p005kotlin.jvm.internal.s.g(cVarC, r0.f110102a)) {
                                v0VarA = a(v0VarA, type2);
                            } else {
                                v0VarA = a(v0VarA, type2);
                            }
                        }
                    }
                } else if (size == 1) {
                    size2 = listB1.size() - 1;
                    if (size2 >= 0) {
                        m1 m1VarH3 = m1VarD.e().w(size2).h();
                        m1VarH3.getClass();
                        v0VarE = p43.q0.e(k1VarF, m1VarH3, listB1, z15, null);
                        v0VarA = v0VarE;
                    } else {
                        v0VarA = null;
                    }
                } else {
                    v0VarA = v0VarE;
                }
                if (v0VarA == null) {
                    r43.l.f150388a.getClass();
                    v0VarE2 = r43.l.e(r43.k.f150378q, listB1, m1VarD, new String[0]);
                } else {
                    v0VarE2 = v0VarA;
                }
            } else {
                v0VarE2 = p43.q0.e(k1VarF, m1VarD, listB1, z15, null);
                if (u33.b.f168296b.d(sVar.f156867q).booleanValue()) {
                    v0VarA = p43.w.a.a(p43.w.f135930d, v0VarE2, true);
                    if (v0VarA == null) {
                        androidx.core.view.j.A(v0VarE2, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    v0VarE2 = v0VarA;
                }
            }
            v0VarE = null;
        }
        i16 = sVar.f156853c;
        if ((i16 & 1024) == 1024) {
            sVar3 = sVar.f156865o;
        } else if ((i16 & 2048) == 2048) {
            sVarA = hVar.a(sVar.f156866p);
        } else {
            sVar2 = v0VarE;
        }
        if (sVar2 != 0) {
            sVar2 = sVarA;
            sVar2 = sVar3;
            return z0.c(v0VarE2, d(sVar2, false));
        }
        sVar2 = sVarA;
        sVar2 = sVar3;
        return v0VarE2;
    }

    public final p43.n0 g(s33.s sVar) {
        s33.s sVarA;
        sVar.getClass();
        if ((sVar.f156853c & 2) != 2) {
            return d(sVar, true);
        }
        p pVar = this.f110120a;
        String string = pVar.f110086b.getString(sVar.f156856f);
        p43.v0 v0VarD = d(sVar, true);
        u33.h hVar = pVar.f110088d;
        int i14 = sVar.f156853c;
        if ((i14 & 4) == 4) {
            sVarA = sVar.f156857g;
        } else {
            sVarA = (i14 & 8) == 8 ? hVar.a(sVar.f156858h) : null;
        }
        sVarA.getClass();
        return pVar.f110085a.f110060j.a(sVar, string, v0VarD, d(sVarA, true));
    }

    public final String toString() {
        x0 x0Var = this.f110121b;
        return this.f110122c.concat(x0Var == null ? "" : ". Child of ".concat(x0Var.f110122c));
    }
}
