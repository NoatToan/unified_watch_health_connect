package gw0;

import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79574a;

        static {
            int[] iArr = new int[pv0.r.values().length];
            try {
                iArr[pv0.r.OVERNIGHT_HRV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pv0.r.SLEEP_SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pv0.r.OVERNIGHT_STRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79574a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0240  */
    /* JADX WARN: Code duplicated, block: B:165:0x0291 A[PHI: r37
      0x0291: PHI (r37v1 java.lang.String) = 
      (r37v0 java.lang.String)
      (r37v0 java.lang.String)
      (r37v3 java.lang.String)
      (r37v3 java.lang.String)
      (r37v4 java.lang.String)
      (r37v4 java.lang.String)
     binds: [B:256:0x045a, B:258:0x0460, B:202:0x0315, B:204:0x031b, B:162:0x0289, B:164:0x028f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:278:0x049d  */
    /* JADX WARN: Code duplicated, block: B:386:0x0673  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v37, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    public static final void a(u uVar, b63.t tVar, o82.g gVar, pv0.c cVar, mc mcVar, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        int i15;
        Object next;
        u82.f fVar;
        String str;
        ?? arrayList;
        ArrayList arrayList2;
        List list;
        b63.o oVar;
        Object next2;
        boolean z14;
        List listS;
        ?? arrayList3;
        boolean z15;
        kw0.c cVar2;
        List<pv0.h> list2;
        kw0.a aVar2;
        List<pv0.h> list3;
        pv0.h hVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z16;
        kw0.e.c cVar3;
        ArrayList arrayList6;
        boolean z17;
        kw0.e.b bVar;
        b63.o oVar2 = tVar.f16213c;
        b63.o oVar3 = tVar.f16212b;
        uVar.getClass();
        gVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-871987630);
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(uVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(tVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar3 = new aw0.a(w2.a0.s(o0VarE));
            pv0.r rVar = ((h0) s9.c.c(uVar.f79771l, o0VarE).getF182175a()).f79609a;
            Integer numValueOf = null;
            Long lValueOf = cVar != null ? Long.valueOf(cVar.f141352a) : null;
            String str2 = cVar != null ? cVar.f141353b : null;
            pv0.a aVarY = cVar != null ? oi0.c.y(cVar) : null;
            w13.c cVar4 = pv0.w.T0;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
            while (true) {
                if (!bVarN.hasNext()) {
                    i15 = i17;
                    next = null;
                    break;
                }
                next = bVarN.next();
                p13.c.b bVar2 = bVarN;
                i15 = i17;
                if (lValueOf != null && ((pv0.w) next).f141457a == lValueOf.longValue()) {
                    break;
                }
                bVarN = bVar2;
                i17 = i15;
            }
            pv0.w wVar = (pv0.w) next;
            String strA = aVar3.a(lValueOf, str2);
            zv0.d dVar = zv0.d.f207169a;
            l22.a aVarS = w2.a0.s(o0VarE);
            dVar.getClass();
            String strE = zv0.d.e(rVar, aVarS);
            o82.g gVar2 = o82.g.f130851d;
            String strG = gVar == gVar2 ? strA : e5.g(strA, " & ", strE);
            x1 x1Var2 = p3.n.f135158a;
            j0 j0Var = j0.f23099a;
            DateTime dateTimeK = vb.h.k(oVar3);
            DateTime dateTimeAtStartOfDay = g22.l.h(oVar2).toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            j0Var.getClass();
            o13.p pVarS = j0.s(dateTimeK, dateTimeAtStartOfDay, false, false);
            String str3 = pVarS != null ? (String) pVarS.f128594a : null;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = pVarS != null ? (String) pVarS.f128595b : null;
            String strP = gl1.y.P(R.string.string_line_string_pattern, new Object[]{str3, str4 != null ? str4 : ""}, o0VarE);
            boolean z18 = gVar == gVar2 || gVar == o82.g.f130853f;
            e eVar = new e(rVar.f141413a, lValueOf != null ? lValueOf.longValue() : -1L, tVar.f16212b, tVar.f16213c);
            if (z18) {
                o0VarE.C(-1419748216);
                fVar = (u82.f) uVar.f79778t.c(eVar, o0VarE).getF182175a();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1419639065);
                fVar = (u82.f) uVar.f79779v.c(eVar, o0VarE).getF182175a();
                o0VarE.g0(false);
            }
            int i18 = a.f79574a[rVar.ordinal()];
            if (i18 == 1) {
                str = strP;
                pv0.z zVar = (pv0.z) fVar.a();
                List<pv0.t> list4 = zVar != null ? zVar.f141476b : null;
                if (list4 != null) {
                    arrayList = new ArrayList();
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        i41.f fVar2 = ((pv0.t) it.next()).f141424f;
                        if (fVar2 != null) {
                            arrayList.add(fVar2);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = p13.j0.f134944a;
                }
                n41.c.a aVar4 = n41.c.f123606a;
                DateTime dateTimeK2 = vb.h.k(oVar3);
                DateTime dateTimeAtStartOfDay2 = g22.l.h(oVar2).toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                z31.b bVarA = n41.c.a.a(aVar4, arrayList, dateTimeK2, dateTimeAtStartOfDay2);
                if (list4 != null) {
                    ArrayList arrayList7 = new ArrayList();
                    b63.o oVarE = oVar3;
                    while (oVarE.compareTo(oVar2) <= 0) {
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                oVar = oVar2;
                                next2 = null;
                                break;
                            } else {
                                next2 = it3.next();
                                oVar = oVar2;
                                if (p005kotlin.jvm.internal.s.g(pv0.u.a((pv0.t) next2), oVarE)) {
                                    break;
                                } else {
                                    oVar2 = oVar;
                                }
                            }
                        }
                        pv0.t tVar2 = (pv0.t) next2;
                        if (tVar2 != null) {
                            arrayList7.add(tVar2);
                        } else {
                            arrayList7.add(new pv0.t(g22.l.h(oVarE).toString("yyyy-MM-dd"), (Double) null, (Integer) null, (Integer) null, (Integer) null, (i41.f) null, 60, (p005kotlin.jvm.internal.j) null));
                        }
                        b63.i.INSTANCE.getClass();
                        oVarE = b63.q.e(oVarE, 1, b63.i.f16190d);
                        oVar2 = oVar;
                    }
                    arrayList2 = new ArrayList(p13.y.r(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        pv0.t tVar3 = (pv0.t) it4.next();
                        b63.o oVarA = pv0.u.a(tVar3);
                        i41.f fVar3 = tVar3.f141424f;
                        Double d14 = tVar3.f141420b;
                        Iterator it5 = it4;
                        arrayList2.add(new kw0.e.a(oVarA, d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null, tVar3.f141422d, tVar3.f141421c, tVar3.f141423e, bVarA.f202139a, bVarA.f202140b, bVarA.f202141c, bVarA.f202142d, fVar3 != null ? fVar3.getStatus() : null, fVar3 != null ? fVar3.getBaseline() : null, bVarA.f202145g));
                        it4 = it5;
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    list = arrayList6;
                    list = null;
                } else {
                    list = arrayList2;
                }
            } else if (i18 == 2) {
                str = strP;
                pv0.z zVar2 = (pv0.z) fVar.a();
                List<pv0.t> list5 = zVar2 != null ? zVar2.f141476b : null;
                if (list5 != null) {
                    arrayList5 = new ArrayList();
                    for (pv0.t tVar4 : list5) {
                        if ((tVar4 != null ? tVar4.f141420b : null) == null) {
                            z16 = false;
                        } else {
                            Double d15 = tVar4.f141420b;
                            if ((d15 != null ? d15.doubleValue() : 0.0d) > 0.0d) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                        }
                        if (!z16) {
                            tVar4 = null;
                        }
                        if (tVar4 != null) {
                            b63.o oVarA2 = pv0.u.a(tVar4);
                            Double d16 = tVar4.f141420b;
                            cVar3 = new kw0.e.c(oVarA2, d16 != null ? Integer.valueOf((int) d16.doubleValue()) : null, tVar4.f141422d, tVar4.f141421c, tVar4.f141423e);
                        } else {
                            cVar3 = null;
                        }
                        if (cVar3 != null) {
                            arrayList5.add(cVar3);
                        }
                    }
                } else {
                    arrayList5 = null;
                }
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    list = arrayList6;
                    list = null;
                } else {
                    list = arrayList5;
                }
            } else {
                if (i18 != 3) {
                    u0.r();
                    return;
                }
                pv0.z zVar3 = (pv0.z) fVar.a();
                List<pv0.t> list6 = zVar3 != null ? zVar3.f141476b : null;
                if (list6 != null) {
                    arrayList6 = new ArrayList();
                    for (pv0.t tVar5 : list6) {
                        if ((tVar5 != null ? tVar5.f141420b : null) == null) {
                            z17 = false;
                        } else {
                            Double d17 = tVar5.f141420b;
                            if ((d17 != null ? d17.doubleValue() : 0.0d) > 0.0d) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        if (!z17) {
                            tVar5 = null;
                        }
                        if (tVar5 != null) {
                            b63.o oVarA3 = pv0.u.a(tVar5);
                            Double d18 = tVar5.f141420b;
                            bVar = new kw0.e.b(oVarA3, d18 != null ? Integer.valueOf((int) d18.doubleValue()) : null, tVar5.f141422d, tVar5.f141421c, tVar5.f141423e);
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            arrayList6.add(bVar);
                        }
                        strP = strP;
                    }
                } else {
                    arrayList6 = null;
                }
                str = strP;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    list = arrayList6;
                    list = null;
                }
            }
            if (list == null) {
                list = p13.j0.f134944a;
            }
            List list7 = list;
            pv0.z zVar4 = (pv0.z) fVar.a();
            if (zVar4 == null || (list3 = zVar4.f141475a) == null) {
                z14 = z18;
                listS = null;
            } else {
                ArrayList arrayList8 = new ArrayList();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    pv0.h hVar2 = (pv0.h) it6.next();
                    if (hVar2.f141376c == null) {
                        hVar = null;
                    } else if (pv0.j.b(hVar2) != null) {
                        hVar = hVar2;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        Iterable<pv0.o> iterable = hVar.f141378e;
                        if (iterable == null) {
                            iterable = p13.j0.f134944a;
                        }
                        arrayList4 = new ArrayList(p13.y.r(iterable, 10));
                        for (pv0.o oVar4 : iterable) {
                            Iterator it7 = it6;
                            String str5 = hVar2.f141376c;
                            pv0.h hVar3 = hVar2;
                            b63.o oVarB = str5 != null ? b63.o.Companion.b(b63.o.INSTANCE, str5) : null;
                            Integer num = oVar4.f141397c;
                            boolean z19 = z18;
                            pv0.w wVarC = pv0.j.c(hVar3);
                            arrayList4.add(new kw0.d(oVarB, num, wVarC != null ? pv0.x.b(wVarC, oVar4.f141395a) : null));
                            it6 = it7;
                            hVar2 = hVar3;
                            z18 = z19;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    Iterator it8 = it6;
                    boolean z24 = z18;
                    if (arrayList4 != null) {
                        arrayList8.add(arrayList4);
                    }
                    it6 = it8;
                    z18 = z24;
                }
                z14 = z18;
                listS = p13.y.s(arrayList8);
            }
            if (listS == null) {
                listS = p13.j0.f134944a;
            }
            List list8 = listS;
            pv0.z zVar5 = (pv0.z) fVar.a();
            if (zVar5 == null || (list2 = zVar5.f141475a) == null) {
                arrayList3 = 0;
            } else {
                arrayList3 = new ArrayList();
                for (pv0.h hVar4 : list2) {
                    if (hVar4.f141376c == null) {
                        hVar4 = null;
                    }
                    if (hVar4 != null) {
                        String str6 = hVar4.f141376c;
                        aVar2 = new kw0.a(str6 != null ? b63.o.Companion.b(b63.o.INSTANCE, str6) : null, pv0.j.b(hVar4), pv0.j.d(hVar4));
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList3.add(aVar2);
                    }
                }
            }
            if (arrayList3 == 0) {
                arrayList3 = p13.j0.f134944a;
            }
            ?? r34 = arrayList3;
            pv0.z zVar6 = (pv0.z) fVar.a();
            if (zVar6 != null) {
                Integer num2 = zVar6.f141477c;
                Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                Integer num3 = zVar6.f141478d;
                Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : 0);
                Double d19 = zVar6.f141479e;
                Integer numValueOf4 = Integer.valueOf(d19 != null ? (int) d19.doubleValue() : 0);
                Double d24 = zVar6.f141480f;
                Integer numValueOf5 = Integer.valueOf(d24 != null ? (int) d24.doubleValue() : 0);
                Integer num4 = zVar6.f141481g;
                Integer numValueOf6 = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                Integer num5 = zVar6.f141482h;
                Integer numValueOf7 = Integer.valueOf(num5 != null ? num5.intValue() : 0);
                if (aVarY != null) {
                    zv0.d.f207169a.getClass();
                    int i19 = zv0.d.a.f207173d[aVarY.ordinal()];
                    z15 = true;
                    if (i19 == 1) {
                        numValueOf = Integer.valueOf(R.string.pacepro_pacing_strategy_positive_bias);
                    } else if (i19 == 2) {
                        numValueOf = Integer.valueOf(R.string.pacepro_pacing_strategy_negative_bias);
                    } else if (i19 == 3) {
                        numValueOf = Integer.valueOf(R.string.lbl_minimal);
                    } else if (i19 != 4) {
                        u0.r();
                        return;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
                    cVar2 = new kw0.c(numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, iIntValue);
                } else {
                    z15 = true;
                }
                cVar2 = new kw0.c(numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, iIntValue);
            } else {
                z15 = true;
                cVar2 = new kw0.c(null, null, null, null, null, null, 0, 127, null);
            }
            kw0.f fVar4 = new kw0.f(strA, wVar, false, list7, list8, r34, cVar2, 4, null);
            p1 p1VarQ = p0.q(Boolean.valueOf(fVar instanceof u82.f.b), o0VarE);
            l72.w wVar2 = l72.w.f111301a;
            z3.e eVarC = z3.f.c(1209659249, new cq0.p(aVar, 24), o0VarE);
            boolean z25 = (i15 & 458752) == 131072 ? z15 : false;
            Object objQ = o0VarE.q();
            if (z25) {
                objQ = new gt1.s(aVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.s(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            wVar2.f(strG, null, null, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(-554012389, new b(gVar, tVar, fVar4, lVar, rVar, str, z14, uVar, p1VarQ), o0VarE), o0Var, ((i15 << 3) & 458752) | 806882304, 390);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(uVar, tVar, gVar, cVar, mcVar, aVar, lVar, i14, 8);
        }
    }
}
