package d33;

import c33.a0;
import c33.b0;
import c33.c0;
import c33.d0;
import c33.e0;
import c33.f0;
import c33.p;
import c33.q;
import c33.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import p13.h0;
import p13.j0;
import s33.s;
import s33.t;
import s33.u;
import s33.v;
import s33.w;
import s33.x;
import s33.y;
import s33.z;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f57420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f57421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f57422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f57423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f57424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f57425g;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57419a = iArr;
            int[] iArr2 = new int[s.b.c.values().length];
            try {
                iArr2[s.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f57420b = iArr2;
            int[] iArr3 = new int[x.d.values().length];
            try {
                iArr3[x.d.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[x.d.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[x.d.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f57421c = iArr3;
            int[] iArr4 = new int[o13.f.values().length];
            try {
                iArr4[o13.f.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[o13.f.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[o13.f.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f57422d = iArr4;
            int[] iArr5 = new int[s33.g.d.values().length];
            try {
                iArr5[s33.g.d.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[s33.g.d.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[s33.g.d.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f57423e = iArr5;
            int[] iArr6 = new int[s33.g.e.values().length];
            try {
                iArr6[s33.g.e.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[s33.g.e.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[s33.g.e.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f57424f = iArr6;
            int[] iArr7 = new int[s33.i.c.values().length];
            try {
                iArr7[s33.i.c.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[s33.i.c.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[s33.i.c.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f57425g = iArr7;
        }
    }

    public static final int a(int i14) {
        return u33.b.b(u33.b.f168297c.d(i14).booleanValue(), (z) u33.b.f168298d.d(i14), (s33.l) u33.b.f168299e.d(i14));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    public static final d0 b(int i14, m mVar) {
        u33.i.b bVar;
        u33.i.b bVar2;
        int i15;
        o13.f fVar;
        Integer numValueOf;
        String string;
        u33.i iVar;
        f0 f0Var;
        e0 e0Var;
        d0 d0Var = new d0();
        u33.i.a aVar = u33.i.f168331f;
        u33.d dVar = mVar.f57410a;
        u33.j jVar = mVar.f57412c;
        aVar.getClass();
        dVar.getClass();
        jVar.getClass();
        x xVar = (x) h0.e0(i14, jVar.f168345a);
        if (xVar == null) {
            iVar = null;
        } else {
            u33.i.b.a aVar2 = u33.i.b.f168338d;
            Integer numValueOf2 = (xVar.f156997b & 1) == 1 ? Integer.valueOf(xVar.f156998c) : null;
            Integer numValueOf3 = (xVar.f156997b & 2) == 2 ? Integer.valueOf(xVar.f156999d) : null;
            aVar2.getClass();
            if (numValueOf3 != null) {
                bVar = new u33.i.b(numValueOf3.intValue() & 255, (numValueOf3.intValue() >> 8) & 255, (numValueOf3.intValue() >> 16) & 255);
            } else {
                if (numValueOf2 != null) {
                    bVar2 = new u33.i.b(numValueOf2.intValue() & 7, (numValueOf2.intValue() >> 3) & 15, (numValueOf2.intValue() >> 7) & 127);
                } else {
                    bVar = u33.i.b.f168339e;
                }
                x.c cVar = xVar.f157000e;
                cVar.getClass();
                i15 = u33.i.a.C3158a.f168337a[cVar.ordinal()];
                if (i15 != 1) {
                    fVar = o13.f.WARNING;
                } else if (i15 != 2) {
                    fVar = o13.f.ERROR;
                } else {
                    if (i15 == 3) {
                        u0.r();
                        return null;
                    }
                    fVar = o13.f.HIDDEN;
                }
                o13.f fVar2 = fVar;
                if ((xVar.f156997b & 8) == 8) {
                    numValueOf = Integer.valueOf(xVar.f157001f);
                } else {
                    numValueOf = null;
                }
                if ((xVar.f156997b & 16) == 16) {
                    string = dVar.getString(xVar.f157002g);
                } else {
                    string = null;
                }
                x.d dVar2 = xVar.f157003h;
                dVar2.getClass();
                iVar = new u33.i(bVar2, dVar2, fVar2, numValueOf, string);
            }
            bVar2 = bVar;
            x.c cVar2 = xVar.f157000e;
            cVar2.getClass();
            i15 = u33.i.a.C3158a.f168337a[cVar2.ordinal()];
            if (i15 != 1) {
                fVar = o13.f.WARNING;
            } else if (i15 != 2) {
                fVar = o13.f.ERROR;
            } else {
                if (i15 == 3) {
                    u0.r();
                    return null;
                }
                fVar = o13.f.HIDDEN;
            }
            o13.f fVar3 = fVar;
            if ((xVar.f156997b & 8) == 8) {
                numValueOf = Integer.valueOf(xVar.f157001f);
            } else {
                numValueOf = null;
            }
            if ((xVar.f156997b & 16) == 16) {
                string = dVar.getString(xVar.f157002g);
            } else {
                string = null;
            }
            x.d dVar3 = xVar.f157003h;
            dVar3.getClass();
            iVar = new u33.i(bVar2, dVar3, fVar3, numValueOf, string);
        }
        if (iVar == null && !mVar.f57413d) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        x.d dVar4 = iVar != null ? iVar.f168333b : null;
        int i16 = dVar4 == null ? -1 : a.f57421c[dVar4.ordinal()];
        if (i16 == -1) {
            f0Var = f0.UNKNOWN;
        } else if (i16 == 1) {
            f0Var = f0.LANGUAGE_VERSION;
        } else if (i16 == 2) {
            f0Var = f0.COMPILER_VERSION;
        } else {
            if (i16 != 3) {
                u0.r();
                return null;
            }
            f0Var = f0.API_VERSION;
        }
        o13.f fVar4 = iVar != null ? iVar.f168334c : null;
        int i17 = fVar4 == null ? -1 : a.f57422d[fVar4.ordinal()];
        if (i17 == -1) {
            e0Var = e0.HIDDEN;
        } else if (i17 == 1) {
            e0Var = e0.WARNING;
        } else if (i17 != 2) {
            if (i17 != 3) {
                u0.r();
                return null;
            }
            e0Var = e0.HIDDEN;
        } else {
            e0Var = e0.ERROR;
        }
        f0Var.getClass();
        d0Var.f24171a = f0Var;
        e0Var.getClass();
        d0Var.f24172b = e0Var;
        d0Var.f24173c = iVar != null ? iVar.f168335d : null;
        d0Var.f24174d = iVar != null ? iVar.f168336e : null;
        u33.i.b bVar3 = iVar != null ? iVar.f168332a : u33.i.b.f168339e;
        d0Var.f24175e = new c0(bVar3.f168340a, bVar3.f168341b, bVar3.f168342c);
        return d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0241  */
    public static c33.f c(s33.c cVar, u33.d dVar, boolean z14, int i14) {
        boolean z15 = false;
        boolean z16 = (i14 & 2) != 0 ? false : z14;
        j0 j0Var = j0.f134944a;
        cVar.getClass();
        dVar.getClass();
        j0Var.getClass();
        c33.f fVar = new c33.f();
        v vVar = cVar.C;
        vVar.getClass();
        u33.h hVar = new u33.h(vVar);
        u33.j.a aVar = u33.j.f168343b;
        y yVar = cVar.E;
        yVar.getClass();
        aVar.getClass();
        m mVar = new m(dVar, hVar, u33.j.a.a(yVar), z16, null, j0Var, 16, null);
        List<u> list = cVar.f156528g;
        list.getClass();
        m mVarB = mVar.b(list);
        List<e33.k> list2 = mVarB.f57417h;
        u33.h hVar2 = mVarB.f57411b;
        fVar.f24201a = cVar.f156525d;
        int i15 = cVar.f156526e;
        u33.d dVar2 = mVarB.f57410a;
        fVar.f24202b = n.a(dVar2, i15);
        List<u> list3 = cVar.f156528g;
        list3.getClass();
        for (u uVar : list3) {
            uVar.getClass();
            fVar.f24203c.add(h(uVar, mVarB));
        }
        Iterator<T> it = u33.g.j(cVar, hVar2).iterator();
        while (it.hasNext()) {
            fVar.f24204d.add(g((s) it.next(), mVarB));
        }
        List<s33.e> list4 = cVar.f156537p;
        list4.getClass();
        for (s33.e eVar : list4) {
            eVar.getClass();
            c33.i iVar = new c33.i(eVar.f156591d);
            List<w> list5 = eVar.f156592e;
            list5.getClass();
            for (w wVar : list5) {
                wVar.getClass();
                iVar.f24238b.add(i(wVar, mVarB));
            }
            List<Integer> list6 = eVar.f156593f;
            list6.getClass();
            for (Integer num : list6) {
                num.getClass();
                iVar.f24239c.add(b(num.intValue(), mVarB));
            }
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                ((e33.k) it3.next()).p(iVar, eVar, mVarB);
            }
            fVar.f24208h.add(iVar);
        }
        List<s33.j> list7 = cVar.f156538q;
        list7.getClass();
        List<s33.o> list8 = cVar.f156539r;
        list8.getClass();
        List<t> list9 = cVar.f156540t;
        list9.getClass();
        j(fVar, list7, list8, list9, mVarB);
        if ((cVar.f156524c & 4) == 4) {
            dVar2.getString(cVar.f156527f);
        }
        List<Integer> list10 = cVar.f156532k;
        list10.getClass();
        for (Integer num2 : list10) {
            num2.getClass();
            fVar.f24209i.add(dVar2.getString(num2.intValue()));
        }
        Iterator<s33.h> it4 = cVar.f156541v.iterator();
        while (true) {
            if (!it4.hasNext()) {
                List<Integer> list11 = cVar.f156542w;
                list11.getClass();
                for (Integer num3 : list11) {
                    num3.getClass();
                    fVar.f24212l.add(n.a(dVar2, num3.intValue()));
                }
                if ((cVar.f156524c & 8) == 8) {
                    dVar2.getString(cVar.f156544y);
                }
                int i16 = cVar.f156524c;
                s sVarA = (i16 & 16) == 16 ? cVar.f156545z : (i16 & 32) == 32 ? hVar2.a(cVar.A) : null;
                if (sVarA == null) {
                    if ((cVar.f156524c & 8) == 8) {
                        List<s33.o> list12 = cVar.f156539r;
                        list12.getClass();
                        Iterator<T> it5 = list12.iterator();
                        Object obj = null;
                        while (true) {
                            if (!it5.hasNext()) {
                                if (!z15) {
                                    break;
                                }
                                break;
                            }
                            Object next = it5.next();
                            s33.o oVar = (s33.o) next;
                            oVar.getClass();
                            if (u33.g.g(oVar, hVar2) == null && dVar2.getString(oVar.f156771f).equals(dVar2.getString(cVar.f156544y))) {
                                if (!z15) {
                                    obj = next;
                                    z15 = true;
                                }
                            }
                            obj = null;
                            break;
                        }
                        s33.o oVar2 = (s33.o) obj;
                        if (oVar2 != null) {
                            sVarA = u33.g.i(oVar2, hVar2);
                        } else {
                            sVarA = null;
                        }
                    } else {
                        sVarA = null;
                    }
                }
                fVar.f24213m = sVarA != null ? g(sVarA, mVarB) : null;
                Iterator<T> it6 = u33.g.a(cVar, hVar2).iterator();
                while (it6.hasNext()) {
                    fVar.f24215o.add(g((s) it6.next(), mVarB));
                }
                List<Integer> list13 = cVar.D;
                list13.getClass();
                for (Integer num4 : list13) {
                    num4.getClass();
                    fVar.f24216p.add(b(num4.intValue(), mVarB));
                }
                Iterator<T> it7 = list2.iterator();
                while (it7.hasNext()) {
                    ((e33.k) it7.next()).o(fVar, cVar, mVarB);
                }
                return fVar;
            }
            s33.h next2 = it4.next();
            if ((next2.f156647c & 1) != 1) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
            }
            fVar.f24210j.add(dVar2.getString(next2.f156648d));
            p pVar = new p(dVar2.getString(next2.f156648d));
            Iterator<T> it8 = list2.iterator();
            while (it8.hasNext()) {
                ((e33.k) it8.next()).m(pVar, next2, mVarB);
            }
            fVar.f24211k.add(pVar);
        }
    }

    public static final c33.m d(s33.i iVar, m mVar) {
        Boolean bool;
        c33.m mVar2 = new c33.m();
        mVar2.f24248a = iVar.f156659c;
        s sVarA = null;
        if ((iVar.f156658b & 4) == 4) {
            s33.i.c cVar = iVar.f156661e;
            if (cVar == null) {
                vb.h.s("Required value was null.");
                return null;
            }
            int i14 = a.f57425g[cVar.ordinal()];
            if (i14 == 1) {
                bool = Boolean.TRUE;
            } else if (i14 == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                bool = null;
            }
            new c33.h(bool);
        }
        u33.h hVar = mVar.f57411b;
        hVar.getClass();
        int i15 = iVar.f156658b;
        if ((i15 & 8) == 8) {
            sVarA = iVar.f156662f;
        } else if ((i15 & 16) == 16) {
            sVarA = hVar.a(iVar.f156663g);
        }
        if (sVarA != null) {
            g(sVarA, mVar);
        }
        List<s33.i> list = iVar.f156664h;
        list.getClass();
        for (s33.i iVar2 : list) {
            iVar2.getClass();
            mVar2.f24249b.add(d(iVar2, mVar));
        }
        List<s33.i> list2 = iVar.f156665i;
        list2.getClass();
        for (s33.i iVar3 : list2) {
            iVar3.getClass();
            mVar2.f24250c.add(d(iVar3, mVar));
        }
        return mVar2;
    }

    public static final r e(s33.j jVar, m mVar) {
        ArrayList arrayList;
        c33.o oVar;
        c33.n nVar;
        r rVar = new r(jVar.f156683d, mVar.f57410a.getString(jVar.f156685f));
        List<u> list = jVar.f156688i;
        list.getClass();
        m mVarB = mVar.b(list);
        u33.h hVar = mVarB.f57411b;
        List<u> list2 = jVar.f156688i;
        list2.getClass();
        for (u uVar : list2) {
            uVar.getClass();
            rVar.f24264b.add(h(uVar, mVarB));
        }
        s sVarF = u33.g.f(jVar, hVar);
        if (sVarF != null) {
            g(sVarF, mVarB);
        }
        List<w> list3 = jVar.f156694o;
        list3.getClass();
        Iterator<T> it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = rVar.f24267e;
            if (!zHasNext) {
                break;
            }
            w wVar = (w) it.next();
            wVar.getClass();
            arrayList.add(i(wVar, mVarB));
        }
        if (jVar.f156694o.isEmpty()) {
            List<s> list4 = jVar.f156691l;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator<T> it3 = u33.g.b(jVar, hVar).iterator();
                while (it3.hasNext()) {
                    g((s) it3.next(), mVarB);
                    arrayList.add(new a0(0, "_"));
                }
            }
        }
        List<w> list5 = jVar.f156695p;
        list5.getClass();
        for (w wVar2 : list5) {
            wVar2.getClass();
            rVar.f24266d.add(i(wVar2, mVarB));
        }
        g(u33.g.h(jVar, hVar), mVarB);
        if ((jVar.f156682c & 256) == 256) {
            s33.f fVar = jVar.f156698t;
            fVar.getClass();
            c33.j jVar2 = new c33.j();
            for (s33.g gVar : fVar.f156607b) {
                if ((gVar.f156615b & 1) == 1) {
                    s33.g.d dVar = gVar.f156616c;
                    if (dVar == null) {
                        vb.h.s("Required value was null.");
                        return null;
                    }
                    int i14 = a.f57423e[dVar.ordinal()];
                    if (i14 == 1) {
                        oVar = c33.o.RETURNS_CONSTANT;
                    } else if (i14 == 2) {
                        oVar = c33.o.CALLS;
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        oVar = c33.o.RETURNS_NOT_NULL;
                    }
                    if ((gVar.f156615b & 4) == 4) {
                        s33.g.e eVar = gVar.f156619f;
                        if (eVar == null) {
                            vb.h.s("Required value was null.");
                            return null;
                        }
                        int i15 = a.f57424f[eVar.ordinal()];
                        if (i15 == 1) {
                            nVar = c33.n.AT_MOST_ONCE;
                        } else if (i15 == 2) {
                            nVar = c33.n.EXACTLY_ONCE;
                        } else {
                            if (i15 != 3) {
                                u0.r();
                                return null;
                            }
                            nVar = c33.n.AT_LEAST_ONCE;
                        }
                    } else {
                        nVar = null;
                    }
                    c33.l lVar = new c33.l(oVar, nVar);
                    List<s33.i> list6 = gVar.f156617d;
                    list6.getClass();
                    for (s33.i iVar : list6) {
                        iVar.getClass();
                        lVar.f24247a.add(d(iVar, mVarB));
                    }
                    if ((gVar.f156615b & 2) == 2) {
                        s33.i iVar2 = gVar.f156618e;
                        iVar2.getClass();
                        d(iVar2, mVarB);
                    }
                    jVar2.f24246a.add(lVar);
                }
            }
        }
        List<Integer> list7 = jVar.f156697r;
        list7.getClass();
        for (Integer num : list7) {
            num.getClass();
            rVar.f24268f.add(b(num.intValue(), mVarB));
        }
        Iterator<T> it4 = mVarB.f57417h.iterator();
        while (it4.hasNext()) {
            ((e33.k) it4.next()).h(rVar, jVar, mVarB);
        }
        return rVar;
    }

    public static final c33.u f(s33.o oVar, m mVar) {
        ArrayList arrayList;
        oVar.getClass();
        c33.u uVar = new c33.u(oVar.f156769d, mVar.f57410a.getString(oVar.f156771f), (oVar.f156768c & 256) == 256 ? oVar.f156782q : a(oVar.f156769d), (oVar.f156768c & 512) == 512 ? oVar.f156783r : a(oVar.f156769d));
        List<u> list = oVar.f156774i;
        list.getClass();
        m mVarB = mVar.b(list);
        u33.h hVar = mVarB.f57411b;
        List<u> list2 = oVar.f156774i;
        list2.getClass();
        for (u uVar2 : list2) {
            uVar2.getClass();
            uVar.f24279d.add(h(uVar2, mVarB));
        }
        s sVarG = u33.g.g(oVar, hVar);
        if (sVarG != null) {
            g(sVarG, mVarB);
        }
        List<w> list3 = oVar.f156780o;
        list3.getClass();
        Iterator<T> it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = uVar.f24281f;
            if (!zHasNext) {
                break;
            }
            w wVar = (w) it.next();
            wVar.getClass();
            arrayList.add(i(wVar, mVarB));
        }
        if (oVar.f156780o.isEmpty()) {
            List<s> list4 = oVar.f156777l;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator<T> it3 = u33.g.c(oVar, hVar).iterator();
                while (it3.hasNext()) {
                    g((s) it3.next(), mVarB);
                    arrayList.add(new a0(0, "_"));
                }
            }
        }
        if ((oVar.f156768c & 128) == 128) {
            w wVar2 = oVar.f156781p;
            wVar2.getClass();
            i(wVar2, mVarB);
        }
        g(u33.g.i(oVar, hVar), mVarB);
        List<Integer> list5 = oVar.f156784t;
        list5.getClass();
        for (Integer num : list5) {
            num.getClass();
            uVar.f24282g.add(b(num.intValue(), mVarB));
        }
        Iterator<T> it4 = mVarB.f57417h.iterator();
        while (it4.hasNext()) {
            ((e33.k) it4.next()).e(uVar, oVar, mVarB);
        }
        return uVar;
    }

    public static final c33.w g(s sVar, m mVar) {
        c33.g cVar;
        b0 b0Var;
        u33.h hVar = mVar.f57411b;
        u33.d dVar = mVar.f57410a;
        c33.w wVar = new c33.w((sVar.f156855e ? 1 : 0) + (sVar.f156867q << 1));
        if (sVar.m()) {
            cVar = new c33.g.a(n.a(dVar, sVar.f156859i));
        } else {
            int i14 = sVar.f156853c;
            if ((i14 & 128) == 128) {
                cVar = new c33.g.b(n.a(dVar, sVar.f156862l));
            } else if ((i14 & 32) == 32) {
                cVar = new c33.g.c(sVar.f156860j);
            } else {
                if ((i14 & 64) != 64) {
                    throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
                }
                Integer numA = mVar.a(sVar.f156861k);
                if (numA == null) {
                    throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(dVar.getString(sVar.f156861k)), null, 2, null);
                }
                cVar = new c33.g.c(numA.intValue());
            }
        }
        wVar.f24290b = cVar;
        for (s.b bVar : sVar.f156854d) {
            s.b.c cVar2 = bVar.f156875c;
            if (cVar2 == null) {
                vb.h.s("Required value was null.");
                return null;
            }
            int i15 = a.f57420b[cVar2.ordinal()];
            if (i15 == 1) {
                b0Var = b0.IN;
            } else if (i15 == 2) {
                b0Var = b0.OUT;
            } else if (i15 == 3) {
                b0Var = b0.INVARIANT;
            } else {
                if (i15 != 4) {
                    u0.r();
                    return null;
                }
                b0Var = null;
            }
            ArrayList arrayList = wVar.f24291c;
            if (b0Var != null) {
                hVar.getClass();
                int i16 = bVar.f156874b;
                s sVarA = (i16 & 2) == 2 ? bVar.f156876d : (i16 & 4) == 4 ? hVar.a(bVar.f156877e) : null;
                if (sVarA == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                arrayList.add(new c33.z(b0Var, g(sVarA, mVar)));
            } else {
                arrayList.add(c33.z.f24306c);
            }
        }
        hVar.getClass();
        int i17 = sVar.f156853c;
        s sVarA2 = (i17 & 1024) == 1024 ? sVar.f156865o : (i17 & 2048) == 2048 ? hVar.a(sVar.f156866p) : null;
        wVar.f24292d = sVarA2 != null ? g(sVarA2, mVar) : null;
        s sVarE = u33.g.e(sVar, hVar);
        wVar.f24293e = sVarE != null ? g(sVarE, mVar) : null;
        int i18 = sVar.f156853c;
        s sVarA3 = (i18 & 4) == 4 ? sVar.f156857g : (i18 & 8) == 8 ? hVar.a(sVar.f156858h) : null;
        wVar.f24294f = sVarA3 != null ? new q(g(sVarA3, mVar), (sVar.f156853c & 2) == 2 ? dVar.getString(sVar.f156856f) : null) : null;
        Iterator<T> it = mVar.f57417h.iterator();
        while (it.hasNext()) {
            ((e33.k) it.next()).d(wVar, sVar, mVar);
        }
        return wVar;
    }

    public static final c33.y h(u uVar, m mVar) {
        b0 b0Var;
        u.c cVar = uVar.f156940g;
        if (cVar == null) {
            vb.h.s("Required value was null.");
            return null;
        }
        int i14 = a.f57419a[cVar.ordinal()];
        if (i14 == 1) {
            b0Var = b0.IN;
        } else if (i14 == 2) {
            b0Var = b0.OUT;
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            b0Var = b0.INVARIANT;
        }
        boolean z14 = uVar.f156939f;
        c33.y yVar = new c33.y(z14 ? 1 : 0, mVar.f57410a.getString(uVar.f156938e), uVar.f156937d, b0Var);
        Iterator<T> it = u33.g.m(uVar, mVar.f57411b).iterator();
        while (it.hasNext()) {
            yVar.f24304e.add(g((s) it.next(), mVar));
        }
        Iterator<T> it3 = mVar.f57417h.iterator();
        while (it3.hasNext()) {
            ((e33.k) it3.next()).n(yVar, uVar, mVar);
        }
        return yVar;
    }

    public static final a0 i(w wVar, m mVar) {
        s sVarA;
        int i14 = wVar.f156975d;
        int i15 = wVar.f156976e;
        u33.d dVar = mVar.f57410a;
        a0 a0Var = new a0(i14, dVar.getString(i15));
        u33.h hVar = mVar.f57411b;
        g(u33.g.k(wVar, hVar), mVar);
        int i16 = wVar.f156974c;
        if ((i16 & 16) == 16) {
            sVarA = wVar.f156979h;
        } else {
            sVarA = (i16 & 32) == 32 ? hVar.a(wVar.f156980i) : null;
        }
        if (sVarA != null) {
            g(sVarA, mVar);
        }
        if ((wVar.f156974c & 64) == 64) {
            s33.b.C2953b.c cVar = wVar.f156982k;
            cVar.getClass();
            n.c(cVar, dVar);
        }
        Iterator<T> it = mVar.f57417h.iterator();
        while (it.hasNext()) {
            ((e33.k) it.next()).k(a0Var, wVar, mVar);
        }
        return a0Var;
    }

    public static final void j(c33.k kVar, List<s33.j> list, List<s33.o> list2, List<t> list3, m mVar) {
        ArrayList arrayListC = kVar.c();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayListC.add(e((s33.j) it.next(), mVar));
        }
        ArrayList arrayListB = kVar.b();
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayListB.add(f((s33.o) it3.next(), mVar));
        }
        ArrayList arrayListA = kVar.a();
        for (t tVar : list3) {
            c33.x xVar = new c33.x(tVar.f156910d, mVar.f57410a.getString(tVar.f156911e));
            List<u> list4 = tVar.f156912f;
            list4.getClass();
            m mVarB = mVar.b(list4);
            u33.h hVar = mVarB.f57411b;
            List<u> list5 = tVar.f156912f;
            list5.getClass();
            for (u uVar : list5) {
                uVar.getClass();
                xVar.f24297b.add(h(uVar, mVarB));
            }
            g(u33.g.l(tVar, hVar), mVarB);
            g(u33.g.d(tVar, hVar), mVarB);
            List<s33.b> list6 = tVar.f156917k;
            list6.getClass();
            for (s33.b bVar : list6) {
                bVar.getClass();
                xVar.f24298c.add(n.b(bVar, mVarB.f57410a));
            }
            List<Integer> list7 = tVar.f156918l;
            list7.getClass();
            for (Integer num : list7) {
                num.getClass();
                xVar.f24299d.add(b(num.intValue(), mVarB));
            }
            Iterator<T> it4 = mVarB.f57417h.iterator();
            while (it4.hasNext()) {
                ((e33.k) it4.next()).f(xVar, tVar, mVarB);
            }
            arrayListA.add(xVar);
        }
    }
}
