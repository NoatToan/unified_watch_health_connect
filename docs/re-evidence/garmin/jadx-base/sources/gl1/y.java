package gl1;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Environment;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.shareableevents.ShareableEventActivity;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import h5.c1;
import i3.e5;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.serialization.SerializationException;
import lc.m0;
import lc.u0;
import lc.v0;
import m63.a2;
import m63.g0;
import m63.g1;
import m63.i0;
import m63.j1;
import m63.k1;
import m63.q0;
import m63.r1;
import m63.w0;
import o53.d1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.math.MathKt;
import p006l2.h0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.c0;
import p5.d0;
import t23.r0;
import z2.h2;
import z2.o1;

/* JADX INFO: loaded from: classes10.dex */
public final class y {
    public static final boolean A(r0 r0Var) {
        r0Var.getClass();
        return r0Var.getGetter() == null;
    }

    public static final boolean B(int i14) {
        return p13.x.k(1, 50, 67, 69, 68).contains(Integer.valueOf(i14));
    }

    public static final long C(long j8, long j14, float f14) {
        float fJ = gl.b.J(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j14 >> 32)), f14);
        float fJ2 = gl.b.J(Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j14 & 4294967295L)), f14);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final ArrayList D(Map map, e23.l lVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            lc.t tVar = (lc.t) entry.getValue();
            Boolean boolValueOf = tVar != null ? Boolean.valueOf(tVar.f111867b) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !tVar.f111868c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void E(lc.y yVar, long j8, String str, boolean z14) {
        yVar.getClass();
        yVar.h(new o(z14, yVar, 1), new s(j8, str));
        if (z14) {
            yVar.f111904b.k().q(new s(j8, str));
        }
    }

    public static final i63.c F(k23.d dVar, ArrayList arrayList, e23.a aVar) {
        i63.c eVar;
        i63.c g1Var;
        dVar.getClass();
        t0 t0Var = s0.f105811a;
        if (dVar.equals(t0Var.b(Collection.class)) || dVar.equals(t0Var.b(List.class)) || dVar.equals(t0Var.b(List.class)) || dVar.equals(t0Var.b(ArrayList.class))) {
            eVar = new m63.e((i63.c) arrayList.get(0));
        } else if (dVar.equals(t0Var.b(HashSet.class))) {
            eVar = new i0((i63.c) arrayList.get(0));
        } else if (dVar.equals(t0Var.b(Set.class)) || dVar.equals(t0Var.b(Set.class)) || dVar.equals(t0Var.b(LinkedHashSet.class))) {
            eVar = new m63.s0((i63.c) arrayList.get(0));
        } else if (dVar.equals(t0Var.b(HashMap.class))) {
            eVar = new g0((i63.c) arrayList.get(0), (i63.c) arrayList.get(1));
        } else if (dVar.equals(t0Var.b(Map.class)) || dVar.equals(t0Var.b(Map.class)) || dVar.equals(t0Var.b(LinkedHashMap.class))) {
            eVar = new q0((i63.c) arrayList.get(0), (i63.c) arrayList.get(1));
        } else {
            if (dVar.equals(t0Var.b(Map.Entry.class))) {
                i63.c cVar = (i63.c) arrayList.get(0);
                i63.c cVar2 = (i63.c) arrayList.get(1);
                cVar.getClass();
                cVar2.getClass();
                g1Var = new w0(cVar, cVar2);
            } else if (dVar.equals(t0Var.b(o13.p.class))) {
                i63.c cVar3 = (i63.c) arrayList.get(0);
                i63.c cVar4 = (i63.c) arrayList.get(1);
                cVar3.getClass();
                cVar4.getClass();
                g1Var = new g1(cVar3, cVar4);
            } else if (dVar.equals(t0Var.b(o13.u.class))) {
                i63.c cVar5 = (i63.c) arrayList.get(0);
                i63.c cVar6 = (i63.c) arrayList.get(1);
                i63.c cVar7 = (i63.c) arrayList.get(2);
                cVar5.getClass();
                cVar6.getClass();
                cVar7.getClass();
                eVar = new a2(cVar5, cVar6, cVar7);
            } else if (dh.b.u(dVar).isArray()) {
                Object objInvoke = aVar.invoke();
                objInvoke.getClass();
                eVar = j63.a.a((k23.d) objInvoke, (i63.c) arrayList.get(0));
            } else {
                eVar = null;
            }
            eVar = g1Var;
        }
        if (eVar != null) {
            return eVar;
        }
        i63.c[] cVarArr = (i63.c[]) arrayList.toArray(new i63.c[0]);
        i63.c[] cVarArr2 = (i63.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        return j1.a(dh.b.u(dVar), (i63.c[]) Arrays.copyOf(cVarArr2, cVarArr2.length));
    }

    public static final void G(p1.a aVar, e23.l lVar) {
        aVar.getClass();
        p1.a aVar2 = new p1.a(999);
        int i14 = aVar.f134761c;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            aVar2.put(aVar.g(i15), aVar.k(i15));
            i15++;
            i16++;
            if (i16 == 999) {
                lVar.invoke(aVar2);
                aVar2.clear();
                i16 = 0;
            }
        }
        if (i16 > 0) {
            lVar.invoke(aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    public static final f4.s H(Object[] objArr, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        int i14 = 0;
        Object[] objArr2 = new Object[0];
        d4.l lVarB = d4.a.b(new o01.e(11), new ne2.t(25));
        boolean zR = mVar.r(objArr);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new o02.a(objArr, i14);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new o02.a(objArr, i14);
                mVar.K(objQ);
            }
        }
        return (f4.s) d4.a.c(objArr2, lVarB, (e23.a) objQ, mVar, 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    public static final m0 I(v0[] v0VarArr, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Object[] objArrCopyOf = Arrays.copyOf(v0VarArr, v0VarArr.length);
        n82.a aVar = new n82.a(5);
        a51.m mVar2 = new a51.m(context, 24);
        d4.l lVar = d4.m.f57455a;
        d4.l lVar2 = new d4.l(aVar, mVar2);
        boolean zR = mVar.r(context);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new l71.g(context, 10);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new l71.g(context, 10);
                mVar.K(objQ);
            }
        }
        m0 m0Var = (m0) d4.a.d(objArrCopyOf, lVar2, null, (e23.a) objQ, mVar, 0, 4);
        for (v0 v0Var : v0VarArr) {
            m0Var.f111904b.f144333t.a(v0Var);
        }
        x1 x1Var2 = p3.n.f135158a;
        return m0Var;
    }

    public static final i63.c J(k23.d dVar) {
        dVar.getClass();
        i63.c cVarL = L(dVar);
        if (cVarL != null) {
            return cVarL;
        }
        throw new SerializationException(k1.g(dVar));
    }

    public static final i63.c K(p63.e eVar, Type type) {
        eVar.getClass();
        type.getClass();
        i63.c<Object> cVarC = i63.k.c(eVar, type, true);
        if (cVarC != null) {
            return cVarC;
        }
        Class<?> clsA = i63.k.a(type);
        clsA.getClass();
        throw new SerializationException(k1.g(s0.f105811a.b(clsA)));
    }

    public static final i63.c L(k23.d dVar) {
        dVar.getClass();
        i63.c cVarA = j1.a(dh.b.u(dVar), (i63.c[]) Arrays.copyOf(new i63.c[0], 0));
        return cVarA == null ? (i63.c) r1.f117011a.get(dVar) : cVarA;
    }

    public static final i63.c M(p63.e eVar, k23.p pVar) {
        eVar.getClass();
        pVar.getClass();
        return i63.l.a(eVar, pVar, false);
    }

    public static final ArrayList N(p63.e eVar, List list, boolean z14) {
        eVar.getClass();
        list.getClass();
        if (!z14) {
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i63.c cVarM = M(eVar, (k23.p) it.next());
                if (cVarM == null) {
                    return null;
                }
                arrayList.add(cVarM);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            k23.p pVar = (k23.p) it3.next();
            pVar.getClass();
            i63.c<Object> cVarA = i63.l.a(eVar, pVar, true);
            if (cVarA == null) {
                throw new SerializationException(k1.g(k1.f(pVar)));
            }
            arrayList2.add(cVarA);
        }
        return arrayList2;
    }

    public static final void O(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ShareableEventActivity.class);
        intent.putExtra("eventUuidExtraKey", str);
        context.startActivity(intent);
    }

    public static final String P(int i14, Object[] objArr, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return ((Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c)).getString(i14, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String Q(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        return ((Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c)).getString(i14);
    }

    public static final void R(int i14) {
        throw new SerializationException(am.j.h(i14, "An unknown field for index "));
    }

    public static final g21.b S(k01.k kVar) {
        return new g21.b(kVar != null ? kVar.f102073b : null, kVar != null ? kVar.f102074c : null, kVar != null ? kVar.f102075d : null, kVar != null ? kVar.f102076e : null);
    }

    public static final g21.c T(k01.k kVar) {
        return new g21.c(kVar != null ? kVar.f102078g : null, kVar != null ? kVar.f102080i : null, kVar != null ? kVar.f102081j : null, kVar != null ? kVar.f102088q : null, kVar != null ? kVar.f102090s : null, kVar != null ? kVar.f102092u : null, kVar != null ? kVar.f102089r : null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public static final void U(k30.u uVar) {
        Iterator it;
        List<k30.w> list;
        ClimbDTO climbDTO;
        Double dValueOf;
        uVar.getClass();
        List<ClimbDTO> listB = uVar.b();
        if (listB == null) {
            return;
        }
        k30.x xVarG = uVar.getUnpavedSections();
        List<k30.w> listD = xVarG != null ? xVarG.d() : null;
        if (listD == null || listD.isEmpty()) {
            return;
        }
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            ClimbDTO climbDTO2 = (ClimbDTO) it3.next();
            double dF = climbDTO2.getDistance();
            double dQ = climbDTO2.getStartDistance();
            double dF2 = climbDTO2.getDistance();
            if (Double.isNaN(dQ)) {
                it = it3;
                list = listD;
                climbDTO = climbDTO2;
                dValueOf = null;
            } else {
                double d14 = 0.0d;
                if (dQ <= 0.0d || Double.isNaN(dF2) || dF2 <= 0.0d) {
                    it = it3;
                    list = listD;
                    climbDTO = climbDTO2;
                    dValueOf = null;
                } else {
                    j23.d dVar = new j23.d(dQ, dQ + dF2);
                    for (k30.w wVar : listD) {
                        ClimbDTO climbDTO3 = climbDTO2;
                        j23.d dVar2 = new j23.d(wVar.getStartDistance(), wVar.getEndDistance());
                        double dMax = Math.max(Double.valueOf(dVar2.f96787a).doubleValue(), Double.valueOf(dVar.f96787a).doubleValue());
                        double dDoubleValue = Double.valueOf(dVar2.f96788b).doubleValue();
                        Iterator it4 = it3;
                        List<k30.w> list2 = listD;
                        double dMin = Math.min(dDoubleValue, Double.valueOf(dVar.f96788b).doubleValue());
                        j23.d dVar3 = dMax <= dMin ? new j23.d(dMax, dMin) : null;
                        if (dVar3 != null) {
                            d14 = (dVar3.f96788b - dVar3.f96787a) + d14;
                        }
                        listD = list2;
                        climbDTO2 = climbDTO3;
                        it3 = it4;
                    }
                    it = it3;
                    list = listD;
                    climbDTO = climbDTO2;
                    dValueOf = Double.valueOf(dF2 - d14);
                }
            }
            climbDTO.r(dValueOf);
            climbDTO.s((zf.b.D(Double.valueOf(dF)) && zf.b.D(dValueOf)) ? Double.valueOf(MathKt.d((dValueOf.doubleValue() * ((double) 100)) / dF)) : null);
            listD = list;
            it3 = it;
        }
    }

    public static final void V(p5.y yVar, int i14, o5.h hVar) {
        q3.c cVar = new q3.c(new p5.y[16], 0);
        List listI = yVar.i(false, false);
        while (true) {
            cVar.c(cVar.f142358c, listI);
            while (true) {
                int i15 = cVar.f142358c;
                if (i15 == 0) {
                    return;
                }
                p5.y yVar2 = (p5.y) cVar.k(i15 - 1);
                boolean zE = c0.e(yVar2);
                p5.q qVar = yVar2.f136098d;
                if (!zE) {
                    d0.f135959a.getClass();
                    if (qVar.f136085a.b(d0.f135969k)) {
                        continue;
                    } else {
                        c1 c1VarD = yVar2.d();
                        if (c1VarD == null) {
                            throw e5.m("Expected semantics node to have a coordinator.");
                        }
                        g6.l lVarF = lg.d.F(f5.d0.b(c1VarD, true));
                        if (lVarF.f76008a < lVarF.f76010c && lVarF.f76009b < lVarF.f76011d) {
                            p5.p.f136057a.getClass();
                            e23.p pVar = (e23.p) p5.r.a(qVar, p5.p.f136062f);
                            p5.n nVar = (p5.n) p5.r.a(qVar, d0.f135982x);
                            if (pVar == null || nVar == null || nVar.f136047b.invoke().floatValue() <= 0.0f) {
                                listI = yVar2.i(false, false);
                            } else {
                                int i16 = 1 + i14;
                                hVar.invoke(new o5.l(yVar2, i16, lVarF, c1VarD));
                                V(yVar2, i16, hVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void a(int i14, b63.t tVar, gw0.u uVar, String str, kw0.f fVar, p3.m mVar, pv0.r rVar, boolean z14) {
        o0 o0Var;
        uVar.getClass();
        str.getClass();
        rVar.getClass();
        o0 o0VarE = mVar.E(333105272);
        int i15 = (o0VarE.r(uVar) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(tVar) ? 256 : 128) | (o0VarE.r(fVar) ? 2048 : 1024) | (o0VarE.k(rVar.ordinal()) ? 16384 : 8192) | 196608;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            pv0.w wVar = fVar.f106945b;
            List<pv0.y> listA = wVar != null ? pv0.x.a(wVar) : null;
            if (listA == null || listA.isEmpty()) {
                o0Var = o0VarE;
                o0Var.C(-2129488119);
                mw0.g.a((i15 >> 3) & 524286, tVar, str, fVar, o0Var, rVar, z14);
                o0Var.g0(false);
            } else {
                o0VarE.C(-2129861545);
                int i16 = i15 >> 3;
                mw0.j.c(((i15 << 9) & 57344) | (i15 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | 196608, tVar, uVar, str, fVar, o0VarE, rVar, z14);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(uVar, str, tVar, fVar, rVar, z14, i14, 18);
        }
    }

    public static final void b(w2.n nVar, boolean z14, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-579239002);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p006l2.r0.a(nVar, z14, eVar, o0VarE, i15 & 1022);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(nVar, z14, eVar, i14, 1);
        }
    }

    public static final void c(o1 o1Var, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-954926513);
        int i15 = (o0VarE.r(o1Var) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p006l2.r0.b(o1Var, eVar, o0VarE, i15 & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.i0(o1Var, eVar, i14, i16);
        }
    }

    public static final void d(h2 h2Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(2080741862);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(h2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p006l2.r0.c(h2Var, eVar, o0VarE, i15 & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p006l2.g0(h2Var, eVar, i14, i16);
        }
    }

    public static final void e(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1915545750);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.c1.f110940a.a(false, Q(o0VarP, R.string.lbl_location_permissions_needed), Q(o0VarP, R.string.msg_location_permissions_needed_to_use_feature), null, null, Q(o0VarP, R.string.lbl_settings), false, false, aVar, Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 20);
        }
    }

    public static final long f(float f14, float f15) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static boolean g() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }

    public static final x33.c h(String str, x33.c cVar) {
        return cVar.a(x33.f.e(str));
    }

    public static final Object[] i(Object[] objArr, int i14, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14 + 2, i14, objArr.length);
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] j(int i14, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        p13.s.j(objArr, objArr2, 0, i14, 6);
        p13.s.h(objArr, objArr2, i14, i14 + 2, objArr.length);
        return objArr2;
    }

    public static final com.garmin.android.apps.connectmobile.workouts.data.model.v k(int i14, List list) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i15 = i14 + 1;
                int iAbs = Math.abs(i15 - ((com.garmin.android.apps.connectmobile.workouts.data.model.v) next).getDuration());
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(i15 - ((com.garmin.android.apps.connectmobile.workouts.data.model.v) next2).getDuration());
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (com.garmin.android.apps.connectmobile.workouts.data.model.v) obj;
    }

    public static final p1 l(lc.y yVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        return p0.b(r53.s.c(yVar.f111904b.A), null, null, mVar, 48, 2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public static final String m(int i14, int i15, int i16, List list, Context context) {
        int power;
        String string;
        Object next;
        context.getClass();
        String strH = v52.f.h(context, i14);
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((com.garmin.android.apps.connectmobile.workouts.data.model.v) next).getDuration() != i14);
            com.garmin.android.apps.connectmobile.workouts.data.model.v vVar = (com.garmin.android.apps.connectmobile.workouts.data.model.v) next;
            if (vVar != null) {
                power = vVar.getPower();
            } else {
                power = 0;
            }
        } else {
            power = 0;
        }
        int i17 = (int) ((power * i15) / 100.0f);
        int i18 = i17 - i16;
        int i19 = i18 >= 0 ? i18 : 0;
        int i24 = i17 + i16;
        if (power > 0) {
            string = i19 + " - " + i24 + StringUtils.SPACE + context.getString(R.string.lbl_watts);
        } else {
            string = context.getString(R.string.no_data_label);
            string.getClass();
        }
        String string2 = context.getString(R.string.power_curve_target_format, String.valueOf(i15), strH, string);
        string2.getClass();
        return string2;
    }

    public static final String n(Context context, long j8) {
        String strI;
        context.getClass();
        if (j8 == 0) {
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }
        if (j8 < 60) {
            String string2 = context.getString(R.string.less_than_string_pattern, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            string2.getClass();
            String string3 = context.getString(R.string.sleep_my_day_minute_unit);
            string3.getClass();
            return hb.a.i(string2.concat(string3));
        }
        long j14 = DateTimeConstants.SECONDS_PER_HOUR;
        long j15 = j8 / j14;
        long j16 = (j8 % j14) / ((long) 60);
        String string4 = context.getString(R.string.sleep_my_day_hour_unit);
        String strD = p6.b.d(context, R.string.sleep_my_day_minute_unit, string4);
        if (j15 > 0 && j16 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j15);
            sb3.append(string4);
            sb3.append(StringUtils.SPACE);
            strI = am.j.i(j16, strD, sb3);
        } else if (j15 > 0) {
            strI = j15 + string4;
        } else {
            strI = j16 + strD;
        }
        return u0.j(context.getString(R.string.plus_string_pattern, strI));
    }

    public static final o53.z o(Executor executor) {
        o53.z zVar;
        o53.r0 r0Var = executor instanceof o53.r0 ? (o53.r0) executor : null;
        return (r0Var == null || (zVar = r0Var.f129404a) == null) ? new d1(executor) : zVar;
    }

    public static final nd.e p(View view2) {
        view2.getClass();
        while (view2 != null) {
            Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
            nd.e eVar = tag instanceof nd.e ? (nd.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objA = d.A(view2);
            view2 = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final String q(int i14, int i15, Context context) {
        String string;
        if (i15 > 0) {
            string = org.apache.commons.lang3.e.d(i15, StringUtils.SPACE, context.getString(R.string.lbl_watts));
        } else {
            string = context.getString(R.string.no_data_label);
            string.getClass();
        }
        String string2 = context.getString(R.string.power_curve_duration_power_format, v52.f.h(context, i14), string);
        string2.getClass();
        return string2;
    }

    public static final String r() {
        StringBuilder sb3 = new StringBuilder("NOTE: Remember to return this flag to its original value after testing is done!\nDefault API Level: 24 - (Android N)\nAPI Level: ");
        lm2.h.d();
        kg1.a.f104701a.getClass();
        sb3.append(kg1.a.C2003a.a().E());
        return sb3.toString();
    }

    public static final Float s(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fMax = ((hz.d) it.next()).f86389b;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((hz.d) it.next()).f86389b);
        }
        return Float.valueOf(fMax);
    }

    public static final float t(int i14, int i15) {
        if (i14 <= i15) {
            i14 = i15;
        }
        if (i14 < 100) {
            return c02.a.b(i14, 10);
        }
        if (i14 < 1000) {
            return c02.a.b(i14, 100);
        }
        return i14 >= 1000 ? c02.a.b(i14, 1000) : i14;
    }

    public static final Float u(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fMin = ((hz.d) it.next()).f86389b;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((hz.d) it.next()).f86389b);
        }
        return Float.valueOf(fMin);
    }

    public static final String v(int i14, int i15, Context context) {
        if (i15 <= 0) {
            return i14 + "% (" + context.getString(R.string.no_data_label) + ")";
        }
        return i14 + "% (" + i15 + StringUtils.SPACE + context.getString(R.string.lbl_watts) + ")";
    }

    public static final Intent w(lv0.d dVar) {
        dVar.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", dVar.f115046a);
        ClipData clipData = dVar.f115047b;
        if (clipData != null) {
            intent.setClipData(clipData);
            intent.setFlags(1);
        }
        return intent;
    }

    public static final double x(List list, o71.h hVar) {
        list.getClass();
        hVar.getClass();
        Iterator it = list.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += hVar.f130227a.invoke((com.garmin.android.apps.connectmobile.performance.dto.d) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final LocalDate y(mm1.g gVar) {
        gVar.getClass();
        String strC = gVar.getWeekStartDate();
        if (strC != null) {
            return g22.k.w(strC, "yyyy-MM-dd");
        }
        return null;
    }

    public static final int z(int i14, int i15) {
        return (i14 >> i15) & 31;
    }
}
