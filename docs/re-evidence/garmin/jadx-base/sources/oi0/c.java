package oi0;

import am.x0;
import am.y0;
import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.c2;
import c22.h2;
import ci0.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.y;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import com.garmin.android.library.mobileauth.exception.NoMFATokenException;
import com.garmin.auth.cmc.data.network.CMCNoMFATokenException;
import com.garmin.auth.cmc.data.network.CMCNoNetworkException;
import com.garmin.auth.cmc.data.network.CMCUnknownHostException;
import com.garmin.auth.cmc.data.network.NetworkException;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import com.google.firebase.perf.FirebasePerformance;
import d53.w;
import e23.l;
import i3.e5;
import java.io.ByteArrayOutputStream;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.t1;
import kotlin.t3;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import l72.c1;
import lc.u0;
import o13.p;
import o13.r;
import o4.h1;
import o4.u1;
import o4.v1;
import o53.q1;
import o53.v;
import oi0.c;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p43.f0;
import p43.f2;
import p43.n0;
import p43.v0;
import pn2.t;
import pn2.u;
import ps.d1;
import r1.q2;
import s5.w0;
import sc.j;
import t23.i0;
import t23.m0;
import t70.a1;
import u2.k;
import u62.a2;
import u62.a3;
import u62.a4;
import u62.a5;
import u62.b0;
import u62.b1;
import u62.b2;
import u62.b3;
import u62.b4;
import u62.b5;
import u62.c0;
import u62.c3;
import u62.c4;
import u62.c5;
import u62.d0;
import u62.d2;
import u62.d3;
import u62.d4;
import u62.d5;
import u62.e0;
import u62.e1;
import u62.e2;
import u62.e3;
import u62.e4;
import u62.f1;
import u62.f3;
import u62.f4;
import u62.f5;
import u62.g0;
import u62.g1;
import u62.g2;
import u62.g3;
import u62.g4;
import u62.g5;
import u62.h3;
import u62.h4;
import u62.h5;
import u62.i1;
import u62.i2;
import u62.i3;
import u62.i4;
import u62.i5;
import u62.j0;
import u62.j1;
import u62.j2;
import u62.j3;
import u62.j4;
import u62.j5;
import u62.k0;
import u62.k1;
import u62.k2;
import u62.k3;
import u62.k4;
import u62.k5;
import u62.l0;
import u62.l1;
import u62.l2;
import u62.l3;
import u62.l4;
import u62.l5;
import u62.m1;
import u62.m2;
import u62.m3;
import u62.m4;
import u62.m5;
import u62.n1;
import u62.n2;
import u62.n3;
import u62.n4;
import u62.n5;
import u62.o1;
import u62.o2;
import u62.o3;
import u62.o4;
import u62.o5;
import u62.p1;
import u62.p3;
import u62.p4;
import u62.p5;
import u62.q;
import u62.q0;
import u62.q3;
import u62.q4;
import u62.q5;
import u62.r0;
import u62.r1;
import u62.r2;
import u62.r3;
import u62.r4;
import u62.r5;
import u62.s0;
import u62.s1;
import u62.s2;
import u62.s3;
import u62.s4;
import u62.s5;
import u62.t0;
import u62.t2;
import u62.t4;
import u62.t5;
import u62.u2;
import u62.u3;
import u62.u4;
import u62.u5;
import u62.v2;
import u62.v3;
import u62.v4;
import u62.v5;
import u62.w1;
import u62.w2;
import u62.w3;
import u62.w4;
import u62.w5;
import u62.x;
import u62.x3;
import u62.x4;
import u62.x5;
import u62.y1;
import u62.y2;
import u62.y3;
import u62.y4;
import u62.y5;
import u62.z;
import u62.z0;
import u62.z1;
import u62.z2;
import u62.z3;
import u62.z4;
import u62.z5;
import v2.o;
import v62.u6;
import w2.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f132239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f132240b;

    public static final String A(Context context, l lVar, String str) {
        context.getClass();
        lVar.getClass();
        return C(str, new l22.a(context), lVar);
    }

    public static final String B(String str, l lVar, m mVar) {
        lVar.getClass();
        mVar.C(-1662626259);
        x1 x1Var = n.f135158a;
        if (str == null) {
            mVar.f();
            return "";
        }
        b bVar = new b(a0.s(mVar), str);
        lVar.invoke(bVar);
        String str2 = bVar.f132238b;
        mVar.f();
        return str2;
    }

    public static final String C(String str, l22.b bVar, l lVar) {
        bVar.getClass();
        lVar.getClass();
        if (str == null) {
            return "";
        }
        b bVar2 = new b(bVar, str);
        lVar.invoke(bVar2);
        return bVar2.f132238b;
    }

    public static final tw1.a D(tw1.m mVar) {
        mVar.getClass();
        List<tw1.a> listK = mVar.k();
        Object obj = null;
        if (listK == null) {
            return null;
        }
        for (Object obj2 : listK) {
            if (s.g(((tw1.a) obj2).getCurrentPhase(), Boolean.TRUE)) {
                obj = obj2;
                break;
            }
        }
        return (tw1.a) obj;
    }

    public static final u E(t tVar) {
        tVar.getClass();
        for (u uVar : u.values()) {
            if (s.g(uVar.f138811a, tVar.getGender())) {
                uVar.getClass();
                return uVar;
            }
        }
        uVar = null;
        uVar.getClass();
        return uVar;
    }

    public static final double F(double d14, List list, List list2) {
        Double d15;
        Double d16;
        Double d17;
        Double d18;
        list.getClass();
        list2.getClass();
        int iZ = z(list, d14);
        double dDoubleValue = ((Number) list.get(iZ)).doubleValue();
        if (dDoubleValue == d14) {
            return (iZ < 0 || iZ >= list2.size()) ? ((Number) h0.m0(list2)).doubleValue() : ((Number) list2.get(iZ)).doubleValue();
        }
        double dDoubleValue2 = (d14 >= dDoubleValue || (d18 = (Double) h0.e0(iZ + (-1), list)) == null) ? ((Number) list.get(iZ)).doubleValue() : d18.doubleValue();
        double dDoubleValue3 = (d14 <= dDoubleValue || (d17 = (Double) h0.e0(iZ + 1, list)) == null) ? ((Number) list.get(iZ)).doubleValue() : d17.doubleValue();
        double dDoubleValue4 = (d14 >= dDoubleValue || (d16 = (Double) h0.e0(iZ + (-1), list2)) == null) ? ((Number) list2.get(iZ)).doubleValue() : d16.doubleValue();
        double dDoubleValue5 = (d14 <= dDoubleValue || (d15 = (Double) h0.e0(iZ + 1, list2)) == null) ? ((Number) list2.get(iZ)).doubleValue() : d15.doubleValue();
        return bm.m.j(dDoubleValue2, dDoubleValue4, dDoubleValue3, dDoubleValue5, d14);
    }

    public static final ArrayList G(yo.d dVar) {
        Object next;
        Object next2;
        dVar.getClass();
        Object obj = null;
        y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
        if (dVar.b() == null || dVar.a() == null) {
            return new ArrayList();
        }
        Iterator<T> it = dVar.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!"SUMDISTANCE".equalsIgnoreCase(((y) next).F()));
        y yVar = (y) next;
        int iG = yVar != null ? yVar.G() : -1;
        Iterator<T> it3 = dVar.a().iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!"DIRECTTIMESTAMP".equalsIgnoreCase(((y) next2).F()));
        y yVar2 = (y) next2;
        int iG2 = yVar2 != null ? yVar2.G() : -1;
        for (Object obj2 : dVar.a()) {
            if ("SUMDURATION".equalsIgnoreCase(((y) obj2).F())) {
                obj = obj2;
                break;
            }
        }
        y yVar3 = (y) obj;
        int iG3 = yVar3 != null ? yVar3.G() : -1;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listB = dVar.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            List<Double> listC = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it4.next()).C();
            listC.getClass();
            Double d14 = (Double) h0.e0(iG, listC);
            if (d14 != null) {
                arrayList.add(d14);
            }
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listB2 = dVar.b();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it5 = listB2.iterator();
        while (it5.hasNext()) {
            List<Double> listC2 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it5.next()).C();
            listC2.getClass();
            Double d15 = (Double) h0.e0(iG3, listC2);
            if (d15 != null) {
                arrayList2.add(d15);
            }
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listB3 = dVar.b();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it6 = listB3.iterator();
        while (it6.hasNext()) {
            List<Double> listC3 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it6.next()).C();
            listC3.getClass();
            Double d16 = (Double) h0.e0(iG2, listC3);
            if (d16 != null) {
                arrayList3.add(d16);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        double d17 = 0.0d;
        for (yo.c cVar : h0.N0(dVar.getReconstruct().a(), new vo.c())) {
            double dDoubleValue = ((Number) arrayList2.get(z(arrayList3, cVar.getStartTime()))).doubleValue();
            double dDoubleValue2 = ((Number) arrayList2.get(z(arrayList3, cVar.getEndTime()))).doubleValue();
            double dF = (!arrayList.isEmpty() ? F(dDoubleValue2, arrayList2, arrayList) : 0.0d) - (!arrayList.isEmpty() ? F(dDoubleValue, arrayList2, arrayList) : 0.0d);
            double d18 = dDoubleValue2 - dDoubleValue;
            if (d18 > 0.0d) {
                double d19 = dF / d18;
                if (cVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() != null) {
                    x0 x0VarJ = y0Var.j(cVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String().getTypeId());
                    double d24 = d17 + d18;
                    Long lB = cVar.getActivityId();
                    double d25 = dF > 0.0d ? dF : 0.0d;
                    if (x0VarJ == null) {
                        x0VarJ = x0.f4346x;
                    }
                    arrayList4.add(new d1(lB, d18, d25, d19, d24, x0VarJ, false, cVar.getStartTime() / 1000.0d, cVar.getEndTime() / 1000.0d, null, null, 1536, null));
                    d17 = d24;
                }
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object H(String str, gx2.a aVar, v13.c cVar) throws UnexpectedResponseCodeException {
        vx2.a aVar2;
        if (cVar instanceof vx2.a) {
            aVar2 = (vx2.a) cVar;
            int i14 = aVar2.f180666b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f180666b = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new vx2.a(cVar);
            }
        } else {
            aVar2 = new vx2.a(cVar);
        }
        vx2.a aVar3 = aVar2;
        Object objA = aVar3.f180665a;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar3.f180666b;
        if (i15 == 0) {
            r.b(objA);
            aVar3.f180666b = 1;
            objA = sx2.b.a(FirebasePerformance.HttpMethod.GET, str, aVar, null, null, null, null, null, aVar3);
            if (objA == aVar4) {
                return aVar4;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        qx2.c cVar2 = (qx2.c) objA;
        int i16 = cVar2.f148454c;
        String str2 = cVar2.f148456e;
        if (i16 == 201 || i16 == 202) {
            sx2.b.c().debug(o72.t.u(cVar2));
            return new ox2.b(str2, cVar2.f148455d);
        }
        sx2.b.c().error(cVar2.toString());
        throw new UnexpectedResponseCodeException(cVar2.f148454c, str2, null, 4, null);
    }

    public static final p I(double d14, ArrayList arrayList) {
        int i14;
        int iB;
        int size = arrayList.size();
        int i15 = 1;
        while (true) {
            if (i15 >= size) {
                i14 = -1;
                iB = -1;
                break;
            }
            if (d14 < ((Number) arrayList.get(i15)).doubleValue() || i15 == arrayList.size() - 1) {
                i14 = i15 - 1;
                double dDoubleValue = ((Number) arrayList.get(i14)).doubleValue();
                double d15 = 100;
                iB = MathKt.b((((((d14 - dDoubleValue) * d15) / (((Number) arrayList.get(i15)).doubleValue() - dDoubleValue)) * ((double) (i15 == 1 ? q71.a.POOR : q71.a.FAIR).f143228b)) / d15) + ((double) (i14 <= 0 ? 0.0f : q71.a.POOR.f143228b + ((i15 - 2) * q71.a.FAIR.f143228b))));
                break;
            }
            i15++;
        }
        if (iB < 0) {
            iB = 0;
        }
        return new p(Integer.valueOf(i14), Integer.valueOf(iB <= 100 ? iB : 100));
    }

    public static final NetworkException J(Exception exc) {
        if (exc instanceof UnknownHostException) {
            return new CMCUnknownHostException(exc.getMessage(), exc);
        }
        if (exc instanceof NoNetworkException) {
            return new CMCNoNetworkException(exc.getMessage(), exc);
        }
        return exc instanceof NoMFATokenException ? new CMCNoMFATokenException(exc.getMessage(), exc) : new NetworkException(exc.getMessage(), exc);
    }

    public static final boolean K(tw1.m mVar, ix1.g gVar) {
        mVar.getClass();
        gVar.getClass();
        List<tw1.a> listK = mVar.k();
        Object obj = null;
        if (listK != null) {
            for (Object obj2 : listK) {
                tw1.a aVar = (tw1.a) obj2;
                aVar.getClass();
                ix1.g.a aVar2 = ix1.g.f95734c;
                String strI = aVar.getTrainingPhase();
                aVar2.getClass();
                if (ix1.g.a.a(strI) == gVar) {
                    obj = obj2;
                    break;
                }
            }
            obj = (tw1.a) obj;
        }
        return obj != null;
    }

    public static View L(LinearLayout linearLayout, int i14, int i15) {
        linearLayout.getClass();
        Context context = linearLayout.getContext();
        context.getClass();
        if (c22.b.a(context) >= 1.5f) {
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(i15, (ViewGroup) linearLayout, false);
            viewInflate.getClass();
            return viewInflate;
        }
        View viewInflate2 = LayoutInflater.from(linearLayout.getContext()).inflate(i14, (ViewGroup) linearLayout, false);
        viewInflate2.getClass();
        return viewInflate2;
    }

    public static final boolean M(i0 i0Var, x33.c cVar) {
        i0Var.getClass();
        cVar.getClass();
        return i0Var instanceof m0 ? ((m0) i0Var).b(cVar) : R(i0Var, cVar).isEmpty();
    }

    public static final boolean N(tw1.m mVar) {
        DateTime startDate;
        tw1.p pVarI;
        return s.g((mVar == null || (pVarI = mVar.getTrainingStatus()) == null) ? null : pVarI.getStatusKey(), "Scheduled") && (startDate = mVar.getStartDate()) != null && startDate.isAfterNow();
    }

    public static final boolean O(rs2.c cVar) {
        cVar.getClass();
        return cVar.getConfigurationFlags().contains(90) && !cVar.getConfigurationFlags().contains(5);
    }

    public static final String P(List list) {
        list.getClass();
        return h0.k0(list, ". ", null, null, null, 62);
    }

    public static final v0 Q(n0 n0Var) {
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof f0) {
            return ((f0) f2VarI0).f135829b;
        }
        if (f2VarI0 instanceof v0) {
            return (v0) f2VarI0;
        }
        u0.r();
        return null;
    }

    public static final ArrayList R(i0 i0Var, x33.c cVar) {
        i0Var.getClass();
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        m(i0Var, cVar, arrayList);
        return arrayList;
    }

    public static final void S(k kVar, u2.e eVar, u2.e eVar2, o oVar, boolean z14) {
        q3.c<o.a> cVar = oVar.f175101a;
        int i14 = cVar.f142358c;
        if (i14 > 1) {
            kVar.b(new x2.d(0, eVar.f167839c.toString(), eVar2.f167839c.toString(), eVar.f167840d, eVar2.f167840d, 0L, false, 32, null));
            return;
        }
        if (i14 == 1) {
            o.a aVar = cVar.f142356a[0];
            long jL = og.a.l(aVar.f175105c, aVar.f175106d);
            o.a aVar2 = oVar.f175101a.f142356a[0];
            long jL2 = og.a.l(aVar2.f175103a, aVar2.f175104b);
            if (w0.e(jL) && w0.e(jL2)) {
                return;
            }
            kVar.b(new x2.d(w0.h(jL), og.a.b0(jL, eVar), og.a.b0(jL2, eVar2), eVar.f167840d, eVar2.f167840d, 0L, z14, 32, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    public static final sc.f T(j[] jVarArr, m mVar) {
        x1 x1Var = n.f135158a;
        Object[] objArr = new Object[0];
        tc.a aVar = new tc.a(new tc.b());
        boolean zR = mVar.r(jVarArr);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new ro0.g(jVarArr, 19);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new ro0.g(jVarArr, 19);
                mVar.K(objQ);
            }
        }
        e23.a aVar2 = (e23.a) objQ;
        rd.d dVar = rd.d.f151993d;
        d81.h hVar = new d81.h(13, aVar, dVar);
        cn1.d dVar2 = new cn1.d(29, aVar, dVar);
        d4.l lVar = d4.m.f57455a;
        return (sc.f) d4.a.d(Arrays.copyOf(objArr, 0), new d4.l(hVar, dVar2), null, aVar2, mVar, 384, 0);
    }

    public static final void U(int i14, int i15, Object[] objArr) {
        objArr.getClass();
        while (i14 < i15) {
            objArr[i14] = null;
            i14++;
        }
    }

    public static final Object V(u53.t tVar, boolean z14, u53.t tVar2, e23.p pVar) {
        Object vVar;
        Object objH0;
        try {
            if (pVar instanceof v13.a) {
                p005kotlin.jvm.internal.y0.e(2, pVar);
                vVar = pVar.invoke(tVar2, tVar);
            } else {
                vVar = u13.f.c(pVar, tVar2, tVar);
            }
        } catch (DispatchException e4) {
            tVar.g0(new v(e4.getCause(), false, 2, null));
            throw e4.getCause();
        } catch (Throwable th3) {
            vVar = new v(th3, false, 2, null);
        }
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (vVar == aVar || (objH0 = tVar.h0(vVar)) == q1.f129398b) {
            return aVar;
        }
        tVar.w0();
        if (!(objH0 instanceof v)) {
            return q1.a(objH0);
        }
        if (!z14) {
            Throwable th4 = ((v) objH0).f129416a;
            if ((th4 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th4).coroutine == tVar) {
                if (vVar instanceof v) {
                    throw ((v) vVar).f129416a;
                }
                return vVar;
            }
        }
        throw ((v) objH0).f129416a;
    }

    public static final s13.a W(int i14, e23.a aVar) {
        s13.a aVar2 = new s13.a(aVar);
        if (i14 > 0) {
            aVar2.setPriority(i14);
        }
        aVar2.start();
        return aVar2;
    }

    public static final ArrayList X(Collection collection) {
        collection.getClass();
        Collection<qk0.h> collection2 = collection;
        ArrayList arrayList = new ArrayList(p13.y.r(collection2, 10));
        for (qk0.h hVar : collection2) {
            arrayList.add(new mk0.c(hVar.f145100a, hVar.f145101b, hVar.f145102c));
        }
        return arrayList;
    }

    public static final v0 Y(n0 n0Var) {
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof f0) {
            return ((f0) f2VarI0).f135830c;
        }
        if (f2VarI0 instanceof v0) {
            return (v0) f2VarI0;
        }
        u0.r();
        return null;
    }

    public static final String Z(String str) {
        str.getClass();
        return "  •  ".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public static final void a(e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(117135543);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            p004k6.u uVar = new p004k6.u(false, false, false, 4, (p005kotlin.jvm.internal.j) null);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(aVar, 14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a1(aVar, 14);
                    o0VarE.K(objQ);
                }
            }
            z3.e eVarC = z3.f.c(2039065855, new s70.a0(aVar, 10), o0VarE);
            tg1.h.f164516a.getClass();
            o0Var = o0VarE;
            i3.r.a((e23.a) objQ, eVarC, null, null, tg1.h.f164517b, tg1.h.f164518c, null, 0L, 0L, 0L, 0L, 0.0f, uVar, o0Var, 1769520, 3072, 8092);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.a0(aVar, i14, 11);
        }
    }

    public static final void b(e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1201338989);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.lbl_exit_setup_question), gl1.y.Q(o0VarP, R.string.lbl_exit_plan_setup_message), null, null, gl1.y.Q(o0VarP, R.string.lbl_exit), false, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, (i15 << 24) & 234881024, (i15 >> 3) & 14, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 6);
        }
    }

    public static final void c(m mVar, int i14) {
        o0 o0VarE = mVar.E(337733413);
        int i15 = 0;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-1927418568, new t11.f((t3) o0VarE.A(t1.f91501s), i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    public static final void d(h4.r rVar, jq1.g gVar, l lVar, l lVar2, m mVar, int i14) {
        int i15;
        rVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(273395145);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new tz.a(customLineChart, new vq1.d(context, new yz.k(DateFormat.is24HourFormat(context)), new pq1.d(context)), new vq1.f(customLineChart), new vq1.b(customLineChart, new sq1.e(lVar, i17)), new vq1.c(customLineChart), null, 32, null);
                o0VarE.K(objQ2);
            }
            tz.a aVar = (tz.a) objQ2;
            String strP = null;
            jq1.b bVar = gVar != null ? gVar.f100009a : null;
            if ((bVar != null ? bVar.f99981c : null) != null) {
                o0VarE.C(1457955557);
                o0VarE.g0(false);
            } else {
                if ((bVar != null ? bVar.f99984f : null) == null) {
                    o0VarE.C(1457853846);
                    strP = gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(o0VarE, R.string.lbl_steps)}, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1457955557);
                    o0VarE.g0(false);
                }
            }
            h4.r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 290);
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(customLineChart);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new i(lVar2, customLineChart, i16);
                o0VarE.K(objQ3);
            }
            h4.r rVarB = wz1.i.b(rVarH, (e23.a) objQ3, o0VarE);
            boolean zR2 = o0VarE.r(customLineChart);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new b40.a(customLineChart, 12);
                o0VarE.K(objQ4);
            }
            l lVar3 = (l) objQ4;
            boolean zR3 = o0VarE.r(aVar) | ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(gVar))) | o0VarE.B(strP);
            Object objQ5 = o0VarE.q();
            if (zR3 || objQ5 == c2565a) {
                objQ5 = new rp.b(aVar, 18, gVar, strP);
                o0VarE.K(objQ5);
            }
            p002j6.c.b(lVar3, rVarB, (l) objQ5, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(rVar, gVar, lVar, lVar2, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    public static final void e(final double d14, final l lVar, final e23.a aVar, m mVar, final int i14) {
        o0 o0Var;
        o0 o0VarP = androidx.room.a0.p(lVar, aVar, mVar, 425821590);
        int i15 = i14 | (o0VarP.m(d14) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.personal_records_update_benchmark_title);
            String strQ2 = gl1.y.Q(o0VarP, R.string.personal_records_update_benchmark_msg_alt);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_update);
            String strQ4 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new rf.a(lVar, d14, i16);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new rf.a(lVar, d14, i16);
                    o0VarP.K(objQ);
                }
            }
            o0Var = o0VarP;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, strQ4, aVar, o0Var, 0, (i15 >> 6) & 14, 217);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(d14, lVar, aVar, i14) { // from class: v91.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ double f176287a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f176288b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e23.a f176289c;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    c.e(this.f176287a, this.f176288b, this.f176289c, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static String f(String str, Map map) {
        String str2;
        return (map == null || (str2 = (String) map.get(str)) == null) ? "" : str2;
    }

    public static boolean g(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i14 = 0; i14 < length; i14++) {
                if (!Character.isWhitespace(str.charAt(i14))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean h(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static final String i(Object[] objArr, int i14, int i15, p13.f fVar) {
        StringBuilder sb3 = new StringBuilder((i15 * 3) + 2);
        sb3.append("[");
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 > 0) {
                sb3.append(", ");
            }
            Object obj = objArr[i14 + i16];
            if (obj == fVar) {
                sb3.append("(this Collection)");
            } else {
                sb3.append(obj);
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public static final ArrayList j(List list, double d14) {
        list.getClass();
        if (d14 < 20.0d) {
            d14 = 20.0d;
        } else if (d14 > 60.0d) {
            d14 = 60.0d;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, Double.valueOf(d14 <= 20.0d ? d14 : 20.0d));
        arrayList.add(Double.valueOf(d14 >= 60.0d ? d14 : 60.0d));
        return arrayList;
    }

    public static boolean k(String str) {
        return !g(str);
    }

    public static final String l(String str, m mVar) {
        mVar.C(294427767);
        x1 x1Var = n.f135158a;
        if (str == null || w.J(str)) {
            mVar.C(974456343);
            String strQ = gl1.y.Q(mVar, R.string.gender_not_specified);
            mVar.f();
            mVar.f();
            return strQ;
        }
        mVar.C(974506315);
        mVar.f();
        Parcelable.Creator<h2> creator = h2.CREATOR;
        c2.f23014a.getClass();
        c2 c2VarA = c2.a.a();
        String strD = c2VarA != null ? c2VarA.d(str) : null;
        if (strD == null) {
            strD = sn.a.h(mVar, -522751708, R.string.gender_not_specified, mVar);
        } else {
            mVar.C(-522753134);
            mVar.f();
        }
        mVar.f();
        return strD;
    }

    public static final void m(i0 i0Var, x33.c cVar, ArrayList arrayList) {
        i0Var.getClass();
        cVar.getClass();
        if (i0Var instanceof m0) {
            ((m0) i0Var).c(cVar, arrayList);
        } else {
            arrayList.addAll(i0Var.a(cVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object n(nx2.e eVar, gx2.a aVar, v13.c cVar) throws UnexpectedResponseCodeException {
        ux2.b bVar;
        if (cVar instanceof ux2.b) {
            bVar = (ux2.b) cVar;
            int i14 = bVar.f173075b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f173075b = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new ux2.b(cVar);
            }
        } else {
            bVar = new ux2.b(cVar);
        }
        ux2.b bVar2 = bVar;
        Object objD = bVar2.f173074a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f173075b;
        if (i15 == 0) {
            r.b(objD);
            nx2.b bVar3 = eVar.f128279a;
            try {
                String string = new JSONObject().put("accountAuthCode", bVar3.f128274a).put("deviceId", bVar3.f128275b).toString();
                string.getClass();
                byte[] bytes = string.getBytes(d53.c.f57666b);
                bytes.getClass();
                bVar2.f173075b = 1;
                objD = sx2.b.d("/account/v1/mobile/embeddedHealthToken", aVar, null, bytes, null, null, bVar2, 108);
                if (objD == aVar2) {
                    return aVar2;
                }
            } catch (Throwable th3) {
                ge1.b.L("CreateEmbeddedHealthTokenRequest").error("toGHSJson", th3);
                throw th3;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        qx2.c cVar2 = (qx2.c) objD;
        int i16 = cVar2.f148454c;
        String str = cVar2.f148456e;
        if (i16 == 200) {
            sx2.b.c().debug(o72.t.u(cVar2));
            return new nx2.f(str);
        }
        sx2.b.c().error(cVar2.toString());
        throw new UnexpectedResponseCodeException(cVar2.f148454c, str, null, 4, null);
    }

    public static String o(String str) {
        try {
            if (g(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb3 = new StringBuilder();
            for (byte b14 : bArrDigest) {
                sb3.append(String.format("%02x", Byte.valueOf(b14)));
            }
            return sb3.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String p(String str) {
        try {
            byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(str.length()).array();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] bArr = new byte[byteArrayOutputStream.toByteArray().length + 4];
            System.arraycopy(bArrArray, 0, bArr, 0, 4);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, 4, byteArrayOutputStream.toByteArray().length);
            return Base64.encodeToString(bArr, 8);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object q(boolean z14, mt2.f fVar, Double d14, String str, v13.c cVar) {
        ot2.i iVar;
        if (cVar instanceof ot2.i) {
            iVar = (ot2.i) cVar;
            int i14 = iVar.f133878b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f133878b = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new ot2.i(cVar);
            }
        } else {
            iVar = new ot2.i(cVar);
        }
        ot2.i iVar2 = iVar;
        Object objU = iVar2.f133877a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f133878b;
        if (i15 == 0) {
            r.b(objU);
            iVar2.f133878b = 1;
            objU = u(z14, fVar, d14, str, true, iVar2);
            if (objU != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objU);
                return objU;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objU);
        String str2 = (String) objU;
        if (str2 != null) {
            return str2;
        }
        iVar2.f133878b = 2;
        kt2.f.f106534a.getClass();
        kt2.e.f106460a.getClass();
        Object objA = o73.v.a((o73.u) kt2.e.F0.getValue(), iVar2);
        return objA == aVar ? aVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(Double d14, String str, v13.c cVar) {
        ot2.j jVar;
        if (cVar instanceof ot2.j) {
            jVar = (ot2.j) cVar;
            int i14 = jVar.f133880b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f133880b = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new ot2.j(cVar);
            }
        } else {
            jVar = new ot2.j(cVar);
        }
        Object objB = jVar.f133879a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f133880b;
        if (i15 == 0) {
            r.b(objB);
            if (d14 == null || d14.doubleValue() < 0.0d) {
                return null;
            }
            ot2.a aVar2 = ot2.a.f133852a;
            double dDoubleValue = d14.doubleValue();
            aVar2.getClass();
            String strA = ot2.a.a(dDoubleValue, str);
            if (strA.length() <= 0) {
                return null;
            }
            jVar.f133880b = 1;
            objB = o73.v.b(gg.b.x(kt2.f.f106534a), new Object[]{strA}, jVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        return (String) objB;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0155, code lost:
    
        if (r2 == r3) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Serializable, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(boolean z14, mt2.f fVar, Double d14, Double d15, v13.c cVar) {
        ot2.k kVar;
        boolean z15;
        mt2.f fVar2;
        String str;
        String str2;
        o73.u uVarF;
        ?? r14;
        Object objB;
        Object obj;
        int i14;
        Object[] objArr;
        ?? r15;
        Object[] objArr2;
        Object[] objArr3;
        Double d16 = d15;
        if (cVar instanceof ot2.k) {
            kVar = (ot2.k) cVar;
            int i15 = kVar.f133887g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f133887g = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new ot2.k(cVar);
            }
        } else {
            kVar = new ot2.k(cVar);
        }
        ot2.k kVar2 = kVar;
        Object objU = kVar2.f133886f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar2.f133887g;
        int i17 = 1;
        if (i16 == 0) {
            r.b(objU);
            if (d14 != null && !Double.isNaN(d14.doubleValue()) && d14.doubleValue() >= 0.0d && d16 != null && !Double.isNaN(d16.doubleValue()) && d16.doubleValue() >= 0.0d) {
                kVar2.f133882b = fVar;
                kVar2.f133883c = d16;
                z15 = z14;
                kVar2.f133881a = z15;
                kVar2.f133887g = 1;
                Object objR = r(d14, "#,###,###", kVar2);
                if (objR != aVar) {
                    fVar2 = fVar;
                    objU = objR;
                }
                return aVar;
            }
            return null;
        }
        if (i16 == 1) {
            boolean z16 = kVar2.f133881a;
            d16 = (Double) kVar2.f133883c;
            mt2.f fVar3 = (mt2.f) kVar2.f133882b;
            r.b(objU);
            fVar2 = fVar3;
            z15 = z16;
        } else {
            if (i16 == 2) {
                str = (String) kVar2.f133882b;
                r.b(objU);
                str2 = (String) objU;
                if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
                    uVarF = gg.b.F(kt2.f.f106534a);
                    r14 = new Object[2];
                    kt2.e.f106460a.getClass();
                    kVar2.f133882b = r14;
                    kVar2.f133883c = uVarF;
                    kVar2.f133884d = r14;
                    kVar2.f133885e = 0;
                    kVar2.f133887g = 3;
                    objB = o73.v.b((o73.u) kt2.e.K.getValue(), new Object[]{str, str2}, kVar2);
                    if (objB != aVar) {
                        obj = objB;
                        i14 = 0;
                        objArr = r14;
                        r15 = r14;
                        objArr[i14] = obj;
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar = (o73.u) kt2.e.O.getValue();
                        kVar2.f133882b = r15;
                        kVar2.f133883c = uVarF;
                        kVar2.f133884d = r15;
                        kVar2.f133885e = 1;
                        kVar2.f133887g = 4;
                        objU = o73.v.a(uVar, kVar2);
                        if (objU != aVar) {
                            objArr2 = r15;
                            objArr3 = r15;
                            objArr2[i17] = objU;
                            kVar2.f133882b = null;
                            kVar2.f133883c = null;
                            kVar2.f133884d = null;
                            kVar2.f133887g = 5;
                            objU = o73.v.b(uVarF, objArr3, kVar2);
                        }
                    }
                    return aVar;
                }
                return null;
            }
            if (i16 == 3) {
                i14 = kVar2.f133885e;
                Object[] objArr4 = kVar2.f133884d;
                o73.u uVar2 = (o73.u) kVar2.f133883c;
                Object[] objArr5 = (Object[]) kVar2.f133882b;
                r.b(objU);
                objArr = objArr4;
                uVarF = uVar2;
                r15 = objArr5;
                obj = objU;
                objArr[i14] = obj;
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                o73.u uVar3 = (o73.u) kt2.e.O.getValue();
                kVar2.f133882b = r15;
                kVar2.f133883c = uVarF;
                kVar2.f133884d = r15;
                kVar2.f133885e = 1;
                kVar2.f133887g = 4;
                objU = o73.v.a(uVar3, kVar2);
                if (objU != aVar) {
                    objArr2 = r15;
                    objArr3 = r15;
                    objArr2[i17] = objU;
                    kVar2.f133882b = null;
                    kVar2.f133883c = null;
                    kVar2.f133884d = null;
                    kVar2.f133887g = 5;
                    objU = o73.v.b(uVarF, objArr3, kVar2);
                }
                return aVar;
            }
            if (i16 == 4) {
                i17 = kVar2.f133885e;
                Object[] objArr6 = kVar2.f133884d;
                uVarF = (o73.u) kVar2.f133883c;
                Object[] objArr7 = (Object[]) kVar2.f133882b;
                r.b(objU);
                objArr2 = objArr6;
                objArr3 = objArr7;
                objArr2[i17] = objU;
                kVar2.f133882b = null;
                kVar2.f133883c = null;
                kVar2.f133884d = null;
                kVar2.f133887g = 5;
                objU = o73.v.b(uVarF, objArr3, kVar2);
            } else {
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objU);
            }
        }
        return (String) objU;
        Double d17 = d16;
        str = (String) objU;
        kVar2.f133882b = str;
        kVar2.f133883c = null;
        kVar2.f133887g = 2;
        objU = u(z15, fVar2, d17, "#,###,##0.#", true, kVar2);
        if (objU != aVar) {
            str2 = (String) objU;
            if (str != null) {
                uVarF = gg.b.F(kt2.f.f106534a);
                r14 = new Object[2];
                kt2.e.f106460a.getClass();
                kVar2.f133882b = r14;
                kVar2.f133883c = uVarF;
                kVar2.f133884d = r14;
                kVar2.f133885e = 0;
                kVar2.f133887g = 3;
                objB = o73.v.b((o73.u) kt2.e.K.getValue(), new Object[]{str, str2}, kVar2);
                if (objB != aVar) {
                    obj = objB;
                    i14 = 0;
                    objArr = r14;
                    r15 = r14;
                    objArr[i14] = obj;
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar4 = (o73.u) kt2.e.O.getValue();
                    kVar2.f133882b = r15;
                    kVar2.f133883c = uVarF;
                    kVar2.f133884d = r15;
                    kVar2.f133885e = 1;
                    kVar2.f133887g = 4;
                    objU = o73.v.a(uVar4, kVar2);
                    if (objU != aVar) {
                        objArr2 = r15;
                        objArr3 = r15;
                        objArr2[i17] = objU;
                        kVar2.f133882b = null;
                        kVar2.f133883c = null;
                        kVar2.f133884d = null;
                        kVar2.f133887g = 5;
                        objU = o73.v.b(uVarF, objArr3, kVar2);
                    }
                }
            }
            return null;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0277  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x014c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0153  */
    /* JADX WARN: Code duplicated, block: B:43:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0289, code lost:
    
        if (r3 == r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024a, code lost:
    
        if (r3 == r5) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Serializable, java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(boolean z14, mt2.f fVar, boolean z15, double d14, lt2.e eVar, v13.c cVar) {
        ot2.l lVar;
        mt2.f fVar2;
        boolean z16;
        Object objA;
        lt2.e eVar2;
        String str;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        double d15;
        Double d16;
        String str2;
        double d17;
        double dDoubleValue;
        Object objS;
        String str3;
        Double d18;
        mt2.f fVar3;
        o73.u uVar;
        ?? r14;
        o73.u uVar2;
        ?? r15;
        Object[] objArr;
        Object[] objArr2;
        o73.u uVar3;
        ?? r16;
        boolean z17 = z14;
        if (cVar instanceof ot2.l) {
            lVar = (ot2.l) cVar;
            int i14 = lVar.f133896i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f133896i = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new ot2.l(cVar);
            }
        } else {
            lVar = new ot2.l(cVar);
        }
        Object objQ = lVar.f133895h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = 1;
        switch (lVar.f133896i) {
            case 0:
                r.b(objQ);
                fVar2 = fVar;
                lVar.f133890c = fVar2;
                lVar.f133891d = eVar;
                lVar.f133888a = z17;
                z16 = z15;
                lVar.f133889b = z16;
                lVar.f133896i = 1;
                if (Double.isNaN(d14) || d14 < 1.0d) {
                    objA = "";
                } else if (z17) {
                    if (d14 > 1.0d) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar4 = (o73.u) kt2.e.f106531y0.getValue();
                        ot2.a.f133852a.getClass();
                        objA = o73.v.b(uVar4, new Object[]{ot2.a.a(d14, "#,###,###")}, lVar);
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar5 = (o73.u) kt2.e.f106529x0.getValue();
                        ot2.a.f133852a.getClass();
                        objA = o73.v.b(uVar5, new Object[]{ot2.a.a(d14, "#,###,###")}, lVar);
                    }
                } else if (d14 > 1.0d) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar6 = (o73.u) kt2.e.M.getValue();
                    ot2.a.f133852a.getClass();
                    objA = o73.v.b(uVar6, new Object[]{ot2.a.a(d14, "#,###,###")}, lVar);
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA = o73.v.a((o73.u) kt2.e.f106492k1.getValue(), lVar);
                }
                if (objA != aVar) {
                    eVar2 = eVar;
                    str = (String) objA;
                    if (str.length() > 0) {
                        if (eVar2 != null) {
                            dValueOf = Double.valueOf(eVar2.f114882a);
                        } else {
                            dValueOf = null;
                        }
                        if (eVar2 != null) {
                            dValueOf2 = Double.valueOf(eVar2.f114884c);
                        } else {
                            dValueOf2 = null;
                        }
                        if (eVar2 != null) {
                            dValueOf3 = Double.valueOf(eVar2.f114883b);
                        } else {
                            dValueOf3 = null;
                        }
                        d15 = 0.0d;
                        if (dValueOf2 == null && dValueOf2.doubleValue() >= 0.0d && dValueOf3 != null && dValueOf3.doubleValue() >= 1.0d) {
                            double dDoubleValue2 = dValueOf3.doubleValue();
                            double dDoubleValue3 = dValueOf2.doubleValue();
                            dValueOf = Double.valueOf((dDoubleValue2 < 0.0d || dDoubleValue3 < 0.0d) ? 0.0d : (dDoubleValue2 * dDoubleValue3) / 100.0d);
                        } else if (dValueOf != null || dValueOf.doubleValue() < 0.0d) {
                            dValueOf = null;
                        }
                        if (dValueOf != null && dValueOf.doubleValue() > 0.0d) {
                            if (!z16) {
                                d17 = eVar2.f114883b;
                                if (d17 >= 1.0d) {
                                    dDoubleValue = dValueOf.doubleValue();
                                    if (d17 >= 0.0d && dDoubleValue >= 0.0d) {
                                        d15 = (dDoubleValue * 100.0d) / d17;
                                    }
                                    Double d19 = new Double(d17);
                                    Double d24 = new Double(d15);
                                    lVar.f133890c = fVar2;
                                    lVar.f133891d = str;
                                    lVar.f133892e = dValueOf;
                                    lVar.f133888a = z17;
                                    lVar.f133896i = 2;
                                    objS = s(z17, fVar2, d19, d24, lVar);
                                    if (objS != aVar) {
                                        str3 = str;
                                        d18 = dValueOf;
                                        fVar3 = fVar2;
                                        objQ = objS;
                                        String str4 = str3;
                                        d16 = d18;
                                        str = str4;
                                        mt2.f fVar4 = fVar3;
                                        str2 = (String) objQ;
                                        fVar2 = fVar4;
                                        if (str2 == null && str2.length() != 0) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar7 = (o73.u) kt2.e.W0.getValue();
                                            Object[] objArr3 = new Object[3];
                                            objArr3[0] = str;
                                            lVar.f133890c = str2;
                                            lVar.f133891d = objArr3;
                                            lVar.f133892e = uVar7;
                                            lVar.f133893f = objArr3;
                                            lVar.f133894g = 1;
                                            lVar.f133896i = 5;
                                            objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                            if (objQ != aVar) {
                                                objArr = objArr3;
                                                objArr2 = objArr;
                                                uVar3 = uVar7;
                                                objArr[i15] = objQ;
                                                objArr2[2] = str2;
                                                lVar.f133890c = null;
                                                lVar.f133891d = null;
                                                lVar.f133892e = null;
                                                lVar.f133893f = null;
                                                lVar.f133896i = 6;
                                                objQ = o73.v.b(uVar3, objArr2, lVar);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            uVar = (o73.u) kt2.e.X0.getValue();
                                            r14 = new Object[2];
                                            r14[0] = str;
                                            lVar.f133890c = r14;
                                            lVar.f133891d = uVar;
                                            lVar.f133892e = r14;
                                            lVar.f133894g = 1;
                                            lVar.f133896i = 3;
                                            objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                            if (objQ != aVar) {
                                                uVar2 = uVar;
                                                ?? r17 = r14;
                                                r15 = r17;
                                                r16 = r17;
                                                r16[i15] = objQ;
                                                lVar.f133890c = null;
                                                lVar.f133891d = null;
                                                lVar.f133892e = null;
                                                lVar.f133896i = 4;
                                                objQ = o73.v.b(uVar2, r15, lVar);
                                            }
                                        }
                                    }
                                }
                            }
                            d16 = dValueOf;
                            str2 = null;
                            if (str2 == null) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (o73.u) kt2.e.X0.getValue();
                                r14 = new Object[2];
                                r14[0] = str;
                                lVar.f133890c = r14;
                                lVar.f133891d = uVar;
                                lVar.f133892e = r14;
                                lVar.f133894g = 1;
                                lVar.f133896i = 3;
                                objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                if (objQ != aVar) {
                                    uVar2 = uVar;
                                    ?? r18 = r14;
                                    r15 = r18;
                                    r16 = r18;
                                    r16[i15] = objQ;
                                    lVar.f133890c = null;
                                    lVar.f133891d = null;
                                    lVar.f133892e = null;
                                    lVar.f133896i = 4;
                                    objQ = o73.v.b(uVar2, r15, lVar);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (o73.u) kt2.e.X0.getValue();
                                r14 = new Object[2];
                                r14[0] = str;
                                lVar.f133890c = r14;
                                lVar.f133891d = uVar;
                                lVar.f133892e = r14;
                                lVar.f133894g = 1;
                                lVar.f133896i = 3;
                                objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                if (objQ != aVar) {
                                    uVar2 = uVar;
                                    ?? r19 = r14;
                                    r15 = r19;
                                    r16 = r19;
                                    r16[i15] = objQ;
                                    lVar.f133890c = null;
                                    lVar.f133891d = null;
                                    lVar.f133892e = null;
                                    lVar.f133896i = 4;
                                    objQ = o73.v.b(uVar2, r15, lVar);
                                }
                            }
                        }
                        break;
                    }
                    return str;
                }
                return aVar;
            case 1:
                boolean z18 = lVar.f133889b;
                boolean z19 = lVar.f133888a;
                eVar2 = (lt2.e) lVar.f133891d;
                mt2.f fVar5 = (mt2.f) lVar.f133890c;
                r.b(objQ);
                z16 = z18;
                z17 = z19;
                objA = objQ;
                fVar2 = fVar5;
                str = (String) objA;
                if (str.length() > 0) {
                    if (eVar2 != null) {
                        dValueOf = Double.valueOf(eVar2.f114882a);
                    } else {
                        dValueOf = null;
                    }
                    if (eVar2 != null) {
                        dValueOf2 = Double.valueOf(eVar2.f114884c);
                    } else {
                        dValueOf2 = null;
                    }
                    if (eVar2 != null) {
                        dValueOf3 = Double.valueOf(eVar2.f114883b);
                    } else {
                        dValueOf3 = null;
                    }
                    d15 = 0.0d;
                    if (dValueOf2 == null) {
                        if (dValueOf != null) {
                            dValueOf = null;
                        } else {
                            dValueOf = null;
                        }
                    } else if (dValueOf != null) {
                        dValueOf = null;
                    } else {
                        dValueOf = null;
                    }
                    if (dValueOf != null) {
                        if (!z16) {
                            d17 = eVar2.f114883b;
                            if (d17 >= 1.0d) {
                                dDoubleValue = dValueOf.doubleValue();
                                if (d17 >= 0.0d) {
                                    d15 = (dDoubleValue * 100.0d) / d17;
                                }
                                Double d110 = new Double(d17);
                                Double d25 = new Double(d15);
                                lVar.f133890c = fVar2;
                                lVar.f133891d = str;
                                lVar.f133892e = dValueOf;
                                lVar.f133888a = z17;
                                lVar.f133896i = 2;
                                objS = s(z17, fVar2, d110, d25, lVar);
                                if (objS != aVar) {
                                    str3 = str;
                                    d18 = dValueOf;
                                    fVar3 = fVar2;
                                    objQ = objS;
                                    String str5 = str3;
                                    d16 = d18;
                                    str = str5;
                                    mt2.f fVar6 = fVar3;
                                    str2 = (String) objQ;
                                    fVar2 = fVar6;
                                    if (str2 == null) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        uVar = (o73.u) kt2.e.X0.getValue();
                                        r14 = new Object[2];
                                        r14[0] = str;
                                        lVar.f133890c = r14;
                                        lVar.f133891d = uVar;
                                        lVar.f133892e = r14;
                                        lVar.f133894g = 1;
                                        lVar.f133896i = 3;
                                        objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                        if (objQ != aVar) {
                                            uVar2 = uVar;
                                            ?? r110 = r14;
                                            r15 = r110;
                                            r16 = r110;
                                            r16[i15] = objQ;
                                            lVar.f133890c = null;
                                            lVar.f133891d = null;
                                            lVar.f133892e = null;
                                            lVar.f133896i = 4;
                                            objQ = o73.v.b(uVar2, r15, lVar);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        uVar = (o73.u) kt2.e.X0.getValue();
                                        r14 = new Object[2];
                                        r14[0] = str;
                                        lVar.f133890c = r14;
                                        lVar.f133891d = uVar;
                                        lVar.f133892e = r14;
                                        lVar.f133894g = 1;
                                        lVar.f133896i = 3;
                                        objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                                        if (objQ != aVar) {
                                            uVar2 = uVar;
                                            ?? r111 = r14;
                                            r15 = r111;
                                            r16 = r111;
                                            r16[i15] = objQ;
                                            lVar.f133890c = null;
                                            lVar.f133891d = null;
                                            lVar.f133892e = null;
                                            lVar.f133896i = 4;
                                            objQ = o73.v.b(uVar2, r15, lVar);
                                        }
                                    }
                                }
                                break;
                            }
                            return aVar;
                        }
                        d16 = dValueOf;
                        str2 = null;
                        if (str2 == null) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            uVar = (o73.u) kt2.e.X0.getValue();
                            r14 = new Object[2];
                            r14[0] = str;
                            lVar.f133890c = r14;
                            lVar.f133891d = uVar;
                            lVar.f133892e = r14;
                            lVar.f133894g = 1;
                            lVar.f133896i = 3;
                            objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                            if (objQ != aVar) {
                                uVar2 = uVar;
                                ?? r112 = r14;
                                r15 = r112;
                                r16 = r112;
                                r16[i15] = objQ;
                                lVar.f133890c = null;
                                lVar.f133891d = null;
                                lVar.f133892e = null;
                                lVar.f133896i = 4;
                                objQ = o73.v.b(uVar2, r15, lVar);
                            }
                            break;
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            uVar = (o73.u) kt2.e.X0.getValue();
                            r14 = new Object[2];
                            r14[0] = str;
                            lVar.f133890c = r14;
                            lVar.f133891d = uVar;
                            lVar.f133892e = r14;
                            lVar.f133894g = 1;
                            lVar.f133896i = 3;
                            objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                            if (objQ != aVar) {
                                uVar2 = uVar;
                                ?? r113 = r14;
                                r15 = r113;
                                r16 = r113;
                                r16[i15] = objQ;
                                lVar.f133890c = null;
                                lVar.f133891d = null;
                                lVar.f133892e = null;
                                lVar.f133896i = 4;
                                objQ = o73.v.b(uVar2, r15, lVar);
                            }
                            break;
                        }
                        return aVar;
                    }
                }
                return str;
            case 2:
                z17 = lVar.f133888a;
                d18 = (Double) lVar.f133892e;
                str3 = (String) lVar.f133891d;
                fVar3 = (mt2.f) lVar.f133890c;
                r.b(objQ);
                String str6 = str3;
                d16 = d18;
                str = str6;
                mt2.f fVar7 = fVar3;
                str2 = (String) objQ;
                fVar2 = fVar7;
                if (str2 == null) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    uVar = (o73.u) kt2.e.X0.getValue();
                    r14 = new Object[2];
                    r14[0] = str;
                    lVar.f133890c = r14;
                    lVar.f133891d = uVar;
                    lVar.f133892e = r14;
                    lVar.f133894g = 1;
                    lVar.f133896i = 3;
                    objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                    if (objQ != aVar) {
                        uVar2 = uVar;
                        ?? r114 = r14;
                        r15 = r114;
                        r16 = r114;
                        r16[i15] = objQ;
                        lVar.f133890c = null;
                        lVar.f133891d = null;
                        lVar.f133892e = null;
                        lVar.f133896i = 4;
                        objQ = o73.v.b(uVar2, r15, lVar);
                    }
                    break;
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    uVar = (o73.u) kt2.e.X0.getValue();
                    r14 = new Object[2];
                    r14[0] = str;
                    lVar.f133890c = r14;
                    lVar.f133891d = uVar;
                    lVar.f133892e = r14;
                    lVar.f133894g = 1;
                    lVar.f133896i = 3;
                    objQ = q(z17, fVar2, d16, "#,###,##0.0", lVar);
                    if (objQ != aVar) {
                        uVar2 = uVar;
                        ?? r115 = r14;
                        r15 = r115;
                        r16 = r115;
                        r16[i15] = objQ;
                        lVar.f133890c = null;
                        lVar.f133891d = null;
                        lVar.f133892e = null;
                        lVar.f133896i = 4;
                        objQ = o73.v.b(uVar2, r15, lVar);
                    }
                    break;
                }
                return aVar;
            case 3:
                i15 = lVar.f133894g;
                Object[] objArr4 = (Object[]) lVar.f133892e;
                uVar2 = (o73.u) lVar.f133891d;
                Object[] objArr5 = (Object[]) lVar.f133890c;
                r.b(objQ);
                r16 = objArr4;
                r15 = objArr5;
                r16[i15] = objQ;
                lVar.f133890c = null;
                lVar.f133891d = null;
                lVar.f133892e = null;
                lVar.f133896i = 4;
                objQ = o73.v.b(uVar2, r15, lVar);
                break;
            case 4:
                r.b(objQ);
                return (String) objQ;
            case 5:
                i15 = lVar.f133894g;
                objArr = lVar.f133893f;
                uVar3 = (o73.u) lVar.f133892e;
                objArr2 = (Object[]) lVar.f133891d;
                str2 = (String) lVar.f133890c;
                r.b(objQ);
                objArr[i15] = objQ;
                objArr2[2] = str2;
                lVar.f133890c = null;
                lVar.f133891d = null;
                lVar.f133892e = null;
                lVar.f133893f = null;
                lVar.f133896i = 6;
                objQ = o73.v.b(uVar3, objArr2, lVar);
                break;
            case 6:
                r.b(objQ);
                return (String) objQ;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object u(boolean z14, mt2.f fVar, Double d14, String str, boolean z15, v13.c cVar) {
        ot2.m mVar;
        double dDoubleValue;
        double d15;
        String str2;
        String str3;
        if (cVar instanceof ot2.m) {
            mVar = (ot2.m) cVar;
            int i14 = mVar.f133899c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f133899c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new ot2.m(cVar);
            }
        } else {
            mVar = new ot2.m(cVar);
        }
        Object objA = mVar.f133898b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f133899c;
        if (i15 == 0) {
            r.b(objA);
            if (d14 == null || d14.doubleValue() < 0.0d) {
                return null;
            }
            mt2.f fVar2 = mt2.f.METRIC;
            if (fVar == fVar2) {
                dDoubleValue = d14.doubleValue();
                d15 = 1000;
            } else {
                dDoubleValue = d14.doubleValue();
                d15 = 453.592d;
            }
            double d16 = dDoubleValue / d15;
            ot2.a.f133852a.getClass();
            String strA = ot2.a.a(d16, str);
            if (!z15 || strA.length() <= 0) {
                return strA;
            }
            if (fVar == fVar2) {
                if (z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar = (o73.u) kt2.e.f106467c0.getValue();
                    mVar.f133897a = strA;
                    mVar.f133899c = 1;
                    objA = o73.v.a(uVar, mVar);
                    if (objA != aVar) {
                        str2 = strA;
                        str3 = (String) objA;
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar2 = (o73.u) kt2.e.f106464b0.getValue();
                    mVar.f133897a = strA;
                    mVar.f133899c = 2;
                    objA = o73.v.a(uVar2, mVar);
                    if (objA != aVar) {
                        str2 = strA;
                        str3 = (String) objA;
                    }
                }
            } else if (z14) {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                o73.u uVar3 = (o73.u) kt2.e.f106527w0.getValue();
                mVar.f133897a = strA;
                mVar.f133899c = 3;
                objA = o73.v.a(uVar3, mVar);
                if (objA != aVar) {
                    str2 = strA;
                    str3 = (String) objA;
                }
            } else {
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                o73.u uVar4 = (o73.u) kt2.e.f106479g0.getValue();
                mVar.f133897a = strA;
                mVar.f133899c = 4;
                objA = o73.v.a(uVar4, mVar);
                if (objA != aVar) {
                    str2 = strA;
                    str3 = (String) objA;
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            str2 = mVar.f133897a;
            r.b(objA);
            str3 = (String) objA;
        } else if (i15 == 2) {
            str2 = mVar.f133897a;
            r.b(objA);
            str3 = (String) objA;
        } else if (i15 == 3) {
            str2 = mVar.f133897a;
            r.b(objA);
            str3 = (String) objA;
        } else {
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = mVar.f133897a;
            r.b(objA);
            str3 = (String) objA;
        }
        return e5.g(str2, StringUtils.SPACE, str3);
    }

    public static final t62.a v(s62.a aVar) {
        aVar.getClass();
        return t62.a.f162797a;
    }

    public static final List w(t62.a aVar) {
        long j8;
        long j14;
        u4.d dVarC;
        u4.d dVar;
        aVar.getClass();
        List list = f132239a;
        if (list != null) {
            return list;
        }
        u4.d dVarC2 = u62.o.f168988a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC2 == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar2 = g6.f.f75994b;
            u4.d.a aVar3 = new u4.d.a("BikeCyclingPositionAeroLowered", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL = b71.i.l(h1.f128863b, 17.1683f, 13.2762f, 16.6181f, 11.2762f);
            eVarL.i(16.8582f, 10.9962f);
            eVarL.g(18.0286f);
            eVarL.d(18.1456f, 11.0936f, 18.2718f, 11.1817f, 18.3487f, 11.3162f);
            eVarL.d(18.4738f, 11.5662f, 18.4032f, 11.8895f, 18.1587f, 12.0362f);
            eVarL.i(17.7885f, 12.2762f);
            eVarL.i(18.3387f, 13.1462f);
            eVarL.d(18.8953f, 12.7853f, 19.3812f, 12.3994f, 19.4391f, 11.6762f);
            eVarL.d(19.5027f, 10.8811f, 18.9515f, 10.4179f, 18.4087f, 9.9562f);
            eVarL.i(17.3884f, 9.9762f);
            eVarL.i(15.0276f, 9.1362f);
            eVarL.i(14.1414f, 6.3404f);
            eVarL.d(14.1414f, 6.3404f, 13.4412f, 5.8604f, 12.851f, 5.4604f);
            eVarL.d(12.3908f, 5.1404f, 11.7706f, 5.2004f, 11.3805f, 5.6104f);
            eVarL.i(7.605f, 9.1262f);
            eVarL.d(7.2849f, 9.5362f, 7.2949f, 10.1162f, 7.635f, 10.5062f);
            sn.a.A(eVarL, 7.8851f, 10.7262f, 6.4646f, 11.4162f);
            eVarL.i(7.3949f, 11.8162f);
            eVarL.i(8.1152f, 13.6962f);
            eVarL.d(7.5349f, 13.3962f, 6.8947f, 13.2062f, 6.2045f, 13.2062f);
            eVarL.d(4.5139f, 13.2062f, 2.9533f, 14.2462f, 2.3131f, 15.8062f);
            eVarL.d(1.6729f, 17.3662f, 2.033f, 19.2062f, 3.2234f, 20.3962f);
            eVarL.d(4.4138f, 21.5862f, 6.2545f, 21.9562f, 7.815f, 21.3062f);
            eVarL.d(8.8654f, 20.8762f, 9.6657f, 20.0162f, 10.0958f, 18.9962f);
            eVarL.i(11.0862f, 17.8262f);
            eVarL.o(18.1662f);
            eVarL.i(11.8465f, 18.1962f);
            eVarL.i(12.9368f, 12.6762f);
            eVarL.i(11.1462f, 9.6262f);
            eVarL.i(13.1469f, 8.3962f);
            eVarL.i(14.1673f, 10.1962f);
            eVarL.i(15.2676f, 10.2662f);
            eVarL.d(15.3077f, 10.4062f, 15.3577f, 10.6062f, 15.4277f, 10.8562f);
            eVarL.i(13.2069f, 11.3662f);
            eVarL.i(13.7671f, 12.2662f);
            eVarL.i(14.6274f, 12.0662f);
            eVarL.i(13.6771f, 13.1962f);
            eVarL.i(13.337f, 15.1562f);
            eVarL.i(15.8078f, 12.2362f);
            eVarL.d(15.9179f, 12.6562f, 16.0479f, 13.0962f, 16.168f, 13.5562f);
            eVarL.d(15.1676f, 13.9862f, 14.3273f, 14.7762f, 13.8972f, 15.8162f);
            eVarL.d(13.2569f, 17.3762f, 13.6171f, 19.2162f, 14.8075f, 20.4062f);
            eVarL.d(15.9979f, 21.5962f, 17.8385f, 21.9662f, 19.3991f, 21.3162f);
            eVarL.d(20.9596f, 20.6762f, 22.0f, 19.1062f, 22.0f, 17.4262f);
            eVarL.d(22.0f, 14.8889f, 19.6147f, 12.9094f, 17.1683f, 13.2762f);
            hb.a.r(eVarL, 8.7654f, 11.5262f, 9.5556f, 12.2162f);
            eVarL.i(8.7254f, 12.4062f);
            eVarL.i(8.4453f, 11.6762f);
            sn.a.w(eVarL, 8.7654f, 11.5162f, 11.5262f);
            eVarL.k(6.1945f, 20.5962f);
            eVarL.d(3.451f, 20.5962f, 2.0083f, 17.1509f, 3.9537f, 15.2062f);
            eVarL.d(4.844f, 14.3162f, 6.2245f, 14.0362f, 7.3949f, 14.5262f);
            eVarL.d(8.5653f, 15.0062f, 9.3456f, 16.1762f, 9.3456f, 17.4462f);
            eVarL.d(9.3456f, 19.1662f, 7.9051f, 20.6062f, 6.1845f, 20.6062f);
            q2.y(eVarL, 6.1945f, 20.5962f, 10.3659f, 17.1262f);
            eVarL.d(10.3259f, 16.5562f, 10.1659f, 16.0162f, 9.9058f, 15.5262f);
            eVarL.i(9.3956f, 14.1662f);
            eVarL.i(9.0855f, 13.3462f);
            eVarL.i(10.486f, 13.0262f);
            eVarL.i(10.9661f, 13.4462f);
            eVarL.i(11.0362f, 16.3362f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL, 10.3759f, 17.1162f, 10.3659f, 17.1262f);
            eVarL.k(17.7785f, 20.5962f);
            eVarL.d(16.5181f, 20.5962f, 15.3477f, 19.8162f, 14.8575f, 18.6462f);
            eVarL.d(14.2119f, 17.1052f, 14.9373f, 15.2947f, 16.4281f, 14.5962f);
            eVarL.d(16.8582f, 16.1662f, 17.2583f, 17.5862f, 17.3384f, 17.8162f);
            eVarL.i(18.2287f, 17.1162f);
            eVarL.i(17.4484f, 14.3162f);
            eVarL.d(17.9586f, 14.2662f, 18.4888f, 14.3162f, 18.9789f, 14.5262f);
            eVarL.d(20.1494f, 15.0062f, 20.9296f, 16.1762f, 20.9296f, 17.4462f);
            eVarL.d(20.9296f, 19.1662f, 19.4891f, 20.6062f, 17.7685f, 20.6062f);
            q2.y(eVarL, 17.7785f, 20.5962f, 15.7378f, 3.8562f);
            eVarL.d(15.7378f, 4.6762f, 15.0676f, 5.3462f, 14.2473f, 5.3462f);
            eVarL.d(13.427f, 5.3462f, 12.7568f, 4.6762f, 12.7568f, 3.8562f);
            eVarL.d(12.7568f, 3.0362f, 13.427f, 2.3662f, 14.2473f, 2.3662f);
            eVarL.d(15.0676f, 2.3662f, 15.7378f, 3.0362f, 15.7378f, 3.8562f);
            eVarL.c();
            u4.d.a.b(aVar3, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar3.c();
            u62.o.f168988a = dVarC2;
        }
        u4.d dVar2 = dVarC2;
        u4.d dVarA = m4.a(aVar);
        u4.d dVarA2 = u62.t3.a(aVar);
        u4.d dVarA3 = u62.i0.a(aVar);
        u4.d dVarA4 = c5.a(aVar);
        u4.d dVarA5 = u62.f2.a(aVar);
        u4.d dVarA6 = s0.a(aVar);
        u4.d dVarA7 = y4.a(aVar);
        u4.d dVarA8 = y2.a(aVar);
        u4.d dVarA9 = w3.a(aVar);
        u4.d dVarA10 = b5.a(aVar);
        u4.d dVarA11 = u62.m.a(aVar);
        u4.d dVarC3 = l1.f168969a;
        if (dVarC3 != null) {
            j8 = 4278190080L;
        } else {
            float f15 = (float) 24.0d;
            g6.f.a aVar4 = g6.f.f75994b;
            u4.d.a aVar5 = new u4.d.a("HandcyclingIndoorPara", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            j8 = 4278190080L;
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 10.309f, 4.0623f);
            eVarK.d(10.309f, 4.9629f, 9.5789f, 5.693f, 8.6783f, 5.693f);
            eVarK.d(7.7777f, 5.693f, 7.0476f, 4.9629f, 7.0476f, 4.0623f);
            eVarK.d(7.0476f, 3.1617f, 7.7777f, 2.4316f, 8.6783f, 2.4316f);
            eVarK.d(9.5789f, 2.4316f, 10.309f, 3.1617f, 10.309f, 4.0623f);
            eVarK.c();
            u4.d.a.b(aVar5, eVarK.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            int i14 = h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(9.8867f, 6.9549f, 11.9744f, 8.6946f);
            eVarM.i(15.5342f, 8.2352f);
            eVarM.i(15.7735f, 7.6133f);
            eVarM.i(15.7868f, 7.609f);
            eVarM.i(15.8981f, 7.3028f);
            eVarM.i(16.5196f, 7.53f);
            eVarM.i(15.8378f, 9.3992f);
            eVarM.i(17.7534f, 10.1414f);
            eVarM.d(18.296f, 9.5199f, 19.1495f, 9.1767f, 20.0725f, 9.3621f);
            eVarM.d(21.014f, 9.5476f, 21.7746f, 10.313f, 21.9555f, 11.2592f);
            eVarM.d(22.1318f, 12.2007f, 21.77f, 13.0186f, 21.1207f, 13.5565f);
            sn.a.B(eVarM, 15.5309f, 18.3485f, 18.3564f, 13.7775f);
            eVarM.d(17.4844f, 13.3649f, 17.1551f, 12.4743f, 17.1551f, 11.737f);
            eVarM.d(17.1551f, 11.6766f, 17.1597f, 11.621f, 17.1643f, 11.5653f);
            eVarM.i(15.3137f, 10.851f);
            eVarM.i(14.6366f, 12.7062f);
            eVarM.i(14.0151f, 12.4743f);
            eVarM.i(14.0522f, 12.3723f);
            eVarM.i(12.1737f, 11.672f);
            eVarM.i(10.3506f, 10.9854f);
            eVarM.o(9.6224f);
            eVarM.i(12.9205f, 10.9854f);
            eVarM.i(14.3212f, 11.6441f);
            eVarM.i(14.7201f, 10.5449f);
            eVarM.d(14.5113f, 10.3362f, 14.4371f, 10.0207f, 14.5484f, 9.7285f);
            eVarM.d(14.6551f, 9.4456f, 14.9102f, 9.2693f, 15.1931f, 9.2416f);
            eVarM.i(15.2844f, 8.991f);
            eVarM.i(11.9744f, 9.7384f);
            eVarM.i(9.9756f, 8.609f);
            eVarM.i(9.6221f, 12.1298f);
            eVarM.i(12.67f, 12.9858f);
            eVarM.i(12.8834f, 18.3092f);
            eVarM.i(12.111f, 18.4809f);
            eVarM.i(11.5102f, 14.4471f);
            eVarM.g(10.3087f);
            eVarM.d(9.8795f, 13.646f, 8.5235f, 11.9925f, 6.5323f, 11.7865f);
            eVarM.o(8.4393f);
            eVarM.i(7.2189f, 6.5511f);
            eVarM.i(7.8197f, 6.3795f);
            eVarM.i(8.9354f, 6.4653f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 9.6545f, 6.7229f, 9.8867f, 6.9549f);
            eVarM.k(19.5762f, 13.2768f);
            eVarM.d(18.7274f, 13.2768f, 18.0317f, 12.5857f, 18.0317f, 11.737f);
            eVarM.d(18.0317f, 10.8881f, 18.7227f, 10.1923f, 19.5762f, 10.1923f);
            eVarM.d(20.4249f, 10.1923f, 21.1207f, 10.8834f, 21.1207f, 11.737f);
            eVarM.d(21.1207f, 12.5857f, 20.4249f, 13.2768f, 19.5762f, 13.2768f);
            eVarM.c();
            u4.d.a.b(aVar5, eVarM.f168407a, i14, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), null);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(6.0175f, 12.6866f);
            eVarL2.d(4.0356f, 12.6866f, 2.429f, 14.2932f, 2.429f, 16.2751f);
            eVarL2.d(2.429f, 18.257f, 4.0356f, 19.8637f, 6.0175f, 19.8637f);
            eVarL2.d(7.9995f, 19.8637f, 9.6061f, 18.257f, 9.6061f, 16.2751f);
            eVarL2.d(9.6061f, 14.2932f, 7.9995f, 12.6866f, 6.0175f, 12.6866f);
            eVarL2.c();
            eVarL2.k(3.4266f, 16.2751f);
            eVarL2.d(3.4266f, 14.8442f, 4.5866f, 13.6842f, 6.0175f, 13.6842f);
            eVarL2.d(7.4485f, 13.6842f, 8.6085f, 14.8442f, 8.6085f, 16.2751f);
            eVarL2.d(8.6085f, 17.7061f, 7.4485f, 18.8661f, 6.0175f, 18.8661f);
            eVarL2.d(4.5866f, 18.8661f, 3.4266f, 17.7061f, 3.4266f, 16.2751f);
            eVarL2.c();
            u4.d.a.b(aVar5, eVarL2.f168407a, i14, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), null);
            u4.e eVarJ = sn.a.j(18.3533f, 15.5374f, 14.294f, 20.2926f, 2.6959f);
            eVarJ.i(2.0f, 21.5684f);
            sn.a.x(eVarJ, 17.3095f, 21.1368f, 16.9292f, 15.5374f);
            eVarJ.g(18.3533f);
            eVarJ.c();
            u4.d.a.b(aVar5, eVarJ.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar5.c();
            l1.f168969a = dVarC3;
        }
        u4.d dVar3 = dVarC3;
        u4.d dVarA12 = u2.a(aVar);
        u4.d dVarA13 = u62.u1.a(aVar);
        u4.d dVarA14 = w4.a(aVar);
        u4.d dVarA15 = x.a(aVar);
        u4.d dVarA16 = p4.a(aVar);
        u4.d dVarA17 = z1.a(aVar);
        u4.d dVarA18 = a4.a(aVar);
        u4.d dVarA19 = t0.a(aVar);
        long j15 = j8;
        u4.d dVarA20 = i4.a(aVar);
        u4.d dVarA21 = u62.w0.a(aVar);
        u4.d dVarA22 = u62.x2.a(aVar);
        u4.d dVarA23 = l2.a(aVar);
        u4.d dVarA24 = s3.a(aVar);
        u4.d dVarA25 = e2.a(aVar);
        u4.d dVarA26 = u5.a(aVar);
        u4.d dVarA27 = t2.a(aVar);
        u4.d dVarA28 = q.a(aVar);
        u4.d dVarA29 = x4.a(aVar);
        u4.d dVarA30 = u62.h.a(aVar);
        u4.d dVarA31 = w2.a(aVar);
        u4.d dVarA32 = v2.a(aVar);
        u4.d dVarA33 = s1.a(aVar);
        u4.d dVarA34 = g2.a(aVar);
        u4.d dVarC4 = f4.f168930a;
        if (dVarC4 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar6 = g6.f.f75994b;
            u4.d.a aVar7 = new u4.d.a("Skydiving", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(j15), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(h1.f128863b, 16.8815f, 6.4047f);
            eVarK2.d(16.6877f, 5.7629f, 16.4062f, 5.2017f, 15.9965f, 4.6372f);
            eVarK2.d(13.7595f, 1.5554f, 9.0752f, 1.1103f, 5.5344f, 3.6421f);
            eVarK2.d(1.9936f, 6.174f, 0.9361f, 10.7249f, 3.1731f, 13.8067f);
            eVarK2.d(3.5828f, 14.3712f, 4.0321f, 14.7543f, 4.5841f, 15.14f);
            eVarK2.i(7.7297f, 15.4762f);
            eVarK2.i(7.8514f, 14.8508f);
            eVarK2.i(4.6356f, 14.4957f);
            eVarK2.i(4.4243f, 14.4693f);
            eVarK2.d(4.2176f, 13.2984f, 4.3789f, 12.1055f, 4.8509f, 10.9743f);
            eVarK2.i(11.2352f, 14.3095f);
            eVarK2.d(11.2231f, 14.082f, 11.2496f, 13.8591f, 11.3098f, 13.6483f);
            eVarK2.i(5.1139f, 10.4116f);
            eVarK2.d(5.6908f, 9.2986f, 6.5713f, 8.2619f, 7.6975f, 7.386f);
            eVarK2.i(11.7035f, 12.905f);
            eVarK2.d(11.837f, 12.7451f, 11.9954f, 12.6054f, 12.1744f, 12.4926f);
            eVarK2.i(8.2001f, 7.0172f);
            eVarK2.d(9.3509f, 6.2217f, 10.5881f, 5.6935f, 11.8136f, 5.4561f);
            eVarK2.i(12.9278f, 12.2093f);
            eVarK2.d(13.1427f, 12.1749f, 13.3556f, 12.1763f, 13.5603f, 12.2093f);
            eVarK2.i(12.4304f, 5.3611f);
            eVarK2.d(13.7724f, 5.2082f, 15.0801f, 5.4127f, 16.2225f, 6.0058f);
            eVarK2.i(16.3555f, 6.0674f);
            eVarK2.i(15.4854f, 9.6912f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarK2, 16.0754f, 9.8248f, 16.8815f, 6.4047f);
            u4.d.a.b(aVar7, eVarK2.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(j15), null);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(11.7727f, 15.5813f);
            eVarL3.d(12.2312f, 16.0742f, 12.9252f, 16.3252f, 13.6325f, 16.1846f);
            eVarL3.d(14.7213f, 15.9682f, 15.4294f, 14.9059f, 15.214f, 13.8119f);
            eVarL3.d(15.1321f, 13.3958f, 14.9285f, 13.0352f, 14.6476f, 12.7598f);
            eVarL3.i(15.2646f, 10.7534f);
            eVarL3.i(15.7979f, 10.8742f);
            eVarL3.i(15.3284f, 15.4339f);
            eVarL3.i(16.4415f, 17.7675f);
            eVarL3.i(19.5142f, 17.3718f);
            eVarL3.i(22.0f, 19.176f);
            eVarL3.i(21.8282f, 20.0949f);
            eVarL3.i(19.3994f, 18.4825f);
            eVarL3.i(17.2348f, 19.0674f);
            eVarL3.i(18.7897f, 19.2564f);
            eVarL3.d(18.7897f, 19.2564f, 20.2283f, 20.6671f, 20.6649f, 21.2193f);
            eVarL3.i(20.3858f, 22.0f);
            eVarL3.i(18.3693f, 20.3244f);
            eVarL3.i(16.4903f, 20.5311f);
            eVarL3.d(16.4092f, 20.5346f, 16.3337f, 20.5387f, 16.2647f, 20.5424f);
            eVarL3.d(15.743f, 20.5706f, 15.5411f, 20.5816f, 15.2412f, 20.2077f);
            eVarL3.d(14.9917f, 19.8968f, 13.1448f, 17.5771f, 13.1448f, 17.5771f);
            eVarL3.i(12.7492f, 16.9954f);
            eVarL3.i(8.7791f, 15.7369f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL3, 8.8746f, 15.246f, 11.7727f, 15.5813f);
            u4.d.a.b(aVar7, eVarL3.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(j15), null);
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(14.4206f, 14.6523f);
            eVarL4.d(14.5016f, 14.4382f, 14.5257f, 14.1994f, 14.4782f, 13.9582f);
            eVarL4.d(14.3432f, 13.2724f, 13.6805f, 12.8265f, 12.998f, 12.9621f);
            eVarL4.d(12.6567f, 13.0299f, 12.3752f, 13.2303f, 12.1958f, 13.4995f);
            eVarL4.d(12.1415f, 13.5809f, 12.0965f, 13.6687f, 12.0621f, 13.761f);
            eVarL4.d(11.9829f, 13.9736f, 11.9596f, 14.2103f, 12.0067f, 14.4493f);
            eVarL4.d(12.1417f, 15.1351f, 12.8044f, 15.581f, 13.4869f, 15.4454f);
            eVarL4.d(13.8282f, 15.3775f, 14.1097f, 15.1772f, 14.2891f, 14.9081f);
            eVarL4.d(14.3423f, 14.8283f, 14.3865f, 14.7425f, 14.4206f, 14.6523f);
            eVarL4.c();
            u4.d.a.b(aVar7, eVarL4.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar7.c();
            f4.f168930a = dVarC4;
        }
        u4.d dVarA35 = u62.a0.a(aVar);
        u4.d dVarA36 = d5.a(aVar);
        u4.d dVarA37 = q3.a(aVar);
        u4.d dVarA38 = g3.a(aVar);
        u4.d dVarA39 = e0.a(aVar);
        u4.d dVarA40 = u62.t.a(aVar);
        u4.d dVarA41 = u62.n0.a(aVar);
        u4.d dVarA42 = j5.a(aVar);
        u4.d dVarA43 = r2.a(aVar);
        u4.d dVarA44 = g0.a(aVar);
        u4.d dVarA45 = j3.a(aVar);
        u4.d dVarA46 = v3.a(aVar);
        u4.d dVarA47 = k0.a(aVar);
        u4.d dVarA48 = m3.a(aVar);
        u4.d dVarA49 = l0.a(aVar);
        u4.d dVarA50 = i2.a(aVar);
        u4.d dVarA51 = v5.a(aVar);
        u4.d dVarA52 = z4.a(aVar);
        u4.d dVarA53 = q5.a(aVar);
        u4.d dVarA54 = l4.a(aVar);
        u4.d dVarA55 = u62.g.a(aVar);
        u4.d dVarA56 = e1.a(aVar);
        u4.d dVarA57 = u62.s.a(aVar);
        u4.d dVarA58 = c3.a(aVar);
        u4.d dVarA59 = u62.v1.a(aVar);
        u4.d dVarA60 = u62.n.a(aVar);
        u4.d dVarA61 = o4.a(aVar);
        u4.d dVarA62 = a2.a(aVar);
        u4.d dVarA63 = c4.a(aVar);
        u4.d dVarA64 = b2.a(aVar);
        u4.d dVarA65 = u62.p2.a(aVar);
        u4.d dVarA66 = n1.a(aVar);
        u4.d dVarA67 = p1.a(aVar);
        u4.d dVarA68 = u62.a1.a(aVar);
        u4.d dVarA69 = u62.w.a(aVar);
        u4.d dVarA70 = d4.a(aVar);
        u4.d dVarA71 = i3.a(aVar);
        u4.d dVarA72 = w1.a(aVar);
        u4.d dVarA73 = e3.a(aVar);
        u4.d dVarA74 = o2.a(aVar);
        u4.d dVarA75 = r1.a(aVar);
        u4.d dVarA76 = u62.y.a(aVar);
        u4.d dVarA77 = q0.a(aVar);
        u4.d dVarA78 = s4.a(aVar);
        u4.d dVarA79 = m5.a(aVar);
        u4.d dVarA80 = u62.x1.a(aVar);
        u4.d dVarA81 = i5.a(aVar);
        u4.d dVarA82 = j1.a(aVar);
        aVar.getClass();
        u4.d dVar4 = u62.v.f169037a;
        if (dVar4 != null) {
            j14 = j15;
            dVarC = dVar4;
        } else {
            j14 = j15;
            float f17 = (float) 24.0d;
            g6.f.a aVar8 = g6.f.f75994b;
            u4.d.a aVar9 = new u4.d.a("BikeMountainJump", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(j14), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK3 = b71.i.k(h1.f128863b, 17.4545f, 10.7082f);
            eVarK3.d(16.0636f, 10.7082f, 14.8364f, 11.309f, 14.0f, 12.2361f);
            eVarK3.d(12.9364f, 10.3133f, 10.8091f, 9.0f, 8.3636f, 9.0f);
            eVarK3.d(4.8545f, 9.0f, 2.0f, 11.6953f, 2.0f, 15.0f);
            eVarK3.g(3.8182f);
            eVarK3.d(3.8182f, 12.6395f, 5.8545f, 10.7167f, 8.3636f, 10.7167f);
            eVarK3.d(10.8727f, 10.7167f, 12.9091f, 12.6395f, 12.9091f, 15.0f);
            eVarK3.g(14.7273f);
            eVarK3.d(14.7273f, 13.5751f, 15.9545f, 12.4249f, 17.4545f, 12.4249f);
            eVarK3.d(18.9545f, 12.4249f, 20.1818f, 13.5837f, 20.1818f, 15.0f);
            eVarK3.g(22.0f);
            eVarK3.d(22.0f, 12.6309f, 19.9545f, 10.7082f, 17.4545f, 10.7082f);
            eVarK3.c();
            u4.d.a.b(aVar9, eVarK3.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar9.c();
            u62.v.f169037a = dVarC;
        }
        u4.d dVarA83 = u62.p.a(aVar);
        u4.d dVarA84 = u62.c.a(aVar);
        u4.d dVarA85 = r3.a(aVar);
        u4.d dVarA86 = x3.a(aVar);
        u4.d dVarA87 = u62.f0.a(aVar);
        u4.d dVarA88 = h5.a(aVar);
        u4.d dVarA89 = u62.k.a(aVar);
        u4.d dVarA90 = z5.a(aVar);
        u4.d dVarA91 = y5.a(aVar);
        u4.d dVarA92 = j4.a(aVar);
        u4.d dVarA93 = u62.c1.a(aVar);
        u4.d dVarA94 = b3.a(aVar);
        long j16 = j14;
        u4.d dVarA95 = u62.l.a(aVar);
        u4.d dVarA96 = u62.t1.a(aVar);
        u4.d dVarA97 = b1.a(aVar);
        u4.d dVarA98 = o1.a(aVar);
        u4.d dVarA99 = o3.a(aVar);
        u4.d dVarA100 = u62.c2.a(aVar);
        u4.d dVarA101 = u62.m0.a(aVar);
        u4.d dVarA102 = u62.p0.a(aVar);
        u4.d dVarA103 = u62.b.a(aVar);
        u4.d dVarA104 = z3.a(aVar);
        u4.d dVarA105 = m2.a(aVar);
        u4.d dVarA106 = d2.a(aVar);
        u4.d dVarA107 = k2.a(aVar);
        u4.d dVarA108 = y1.a(aVar);
        u4.d dVarA109 = r4.a(aVar);
        u4.d dVarA110 = i1.a(aVar);
        u4.d dVarA111 = w5.a(aVar);
        u4.d dVarA112 = x5.a(aVar);
        u4.d dVarA113 = r0.a(aVar);
        u4.d dVarA114 = u62.a.a(aVar);
        u4.d dVarA115 = u62.e.a(aVar);
        u4.d dVarA116 = n4.a(aVar);
        u4.d dVarA117 = z0.a(aVar);
        u4.d dVarA118 = u62.o0.a(aVar);
        u4.d dVarA119 = o5.a(aVar);
        u4.d dVarA120 = q4.a(aVar);
        u4.d dVarA121 = t5.a(aVar);
        u4.d dVarA122 = u62.d1.a(aVar);
        u4.d dVarA123 = r5.a(aVar);
        u4.d dVarA124 = u4.a(aVar);
        u4.d dVarA125 = v4.a(aVar);
        u4.d dVarA126 = s5.a(aVar);
        u4.d dVarA127 = u62.e5.a(aVar);
        u4.d dVarA128 = a5.a(aVar);
        u4.d dVarA129 = j0.a(aVar);
        u4.d dVarA130 = u62.x0.a(aVar);
        u4.d dVarA131 = k1.a(aVar);
        u4.d dVarA132 = u62.j.a(aVar);
        u4.d dVarA133 = g1.a(aVar);
        u4.d dVarA134 = p5.a(aVar);
        u4.d dVarA135 = u62.v0.a(aVar);
        u4.d dVarA136 = u3.a(aVar);
        u4.d dVarA137 = u62.i.a(aVar);
        u4.d dVarA138 = u62.h1.a(aVar);
        u4.d dVarA139 = j2.a(aVar);
        u4.d dVarA140 = m1.a(aVar);
        u4.d dVarA141 = u62.h0.a(aVar);
        u4.d dVarA142 = c0.a(aVar);
        u4.d dVarA143 = l5.a(aVar);
        u4.d dVarA144 = g5.a(aVar);
        u4.d dVarA145 = n2.a(aVar);
        u4.d dVarA146 = u62.f.a(aVar);
        u4.d dVarA147 = f5.a(aVar);
        u4.d dVarA148 = s2.a(aVar);
        u4.d dVarA149 = n5.a(aVar);
        u4.d dVarA150 = h3.a(aVar);
        u4.d dVarA151 = d0.a(aVar);
        u4.d dVarA152 = b0.a(aVar);
        u4.d dVarA153 = k4.a(aVar);
        u4.d dVarA154 = n3.a(aVar);
        u4.d dVarA155 = u62.d.a(aVar);
        u4.d dVarA156 = h4.a(aVar);
        u4.d dVarA157 = z2.a(aVar);
        u4.d dVarA158 = u62.h2.a(aVar);
        u4.d dVarA159 = g4.a(aVar);
        u4.d dVarA160 = u62.r.a(aVar);
        u4.d dVarA161 = p3.a(aVar);
        u4.d dVarA162 = y3.a(aVar);
        u4.d dVar5 = u62.u0.f169031a;
        if (dVar5 != null) {
            dVar = dVar5;
        } else {
            float f18 = (float) 24.0d;
            g6.f.a aVar10 = g6.f.f75994b;
            u4.d.a aVar11 = new u4.d.a("DiveSite", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(j16), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL5 = b71.i.l(h1.f128863b, 3.0f, 4.4318f, 16.8068f, 21.0f);
            sn.a.v(eVarL5, 3.0f, 4.4318f);
            u4.d.a.b(aVar11, eVarL5.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(j16), null);
            u4.e eVarJ2 = sn.a.j(21.0001f, 19.5682f, 7.1933f, 3.0f, 21.0001f);
            eVarJ2.o(19.5682f);
            eVarJ2.c();
            u4.d.a.b(aVar11, eVarJ2.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            u4.d dVarC5 = aVar11.c();
            u62.u0.f169031a = dVarC5;
            dVar = dVarC5;
        }
        List listK = p13.x.k(dVar2, dVarA, dVarA2, dVarA3, dVarA4, dVarA5, dVarA6, dVarA7, dVarA8, dVarA9, dVarA10, dVarA11, dVar3, dVarA12, dVarA13, dVarA14, dVarA15, dVarA16, dVarA17, dVarA18, dVarA19, dVarA20, dVarA21, dVarA22, dVarA23, dVarA24, dVarA25, dVarA26, dVarA27, dVarA28, dVarA29, dVarA30, dVarA31, dVarA32, dVarA33, dVarA34, dVarC4, dVarA35, dVarA36, dVarA37, dVarA38, dVarA39, dVarA40, dVarA41, dVarA42, dVarA43, dVarA44, dVarA45, dVarA46, dVarA47, dVarA48, dVarA49, dVarA50, dVarA51, dVarA52, dVarA53, dVarA54, dVarA55, dVarA56, dVarA57, dVarA58, dVarA59, dVarA60, dVarA61, dVarA62, dVarA63, dVarA64, dVarA65, dVarA66, dVarA67, dVarA68, dVarA69, dVarA70, dVarA71, dVarA72, dVarA73, dVarA74, dVarA75, dVarA76, dVarA77, dVarA78, dVarA79, dVarA80, dVarA81, dVarA82, dVarC, dVarA83, dVarA84, dVarA85, dVarA86, dVarA87, dVarA88, dVarA89, dVarA90, dVarA91, dVarA92, dVarA93, dVarA94, dVarA95, dVarA96, dVarA97, dVarA98, dVarA99, dVarA100, dVarA101, dVarA102, dVarA103, dVarA104, dVarA105, dVarA106, dVarA107, dVarA108, dVarA109, dVarA110, dVarA111, dVarA112, dVarA113, dVarA114, dVarA115, dVarA116, dVarA117, dVarA118, dVarA119, dVarA120, dVarA121, dVarA122, dVarA123, dVarA124, dVarA125, dVarA126, dVarA127, dVarA128, dVarA129, dVarA130, dVarA131, dVarA132, dVarA133, dVarA134, dVarA135, dVarA136, dVarA137, dVarA138, dVarA139, dVarA140, dVarA141, dVarA142, dVarA143, dVarA144, dVarA145, dVarA146, dVarA147, dVarA148, dVarA149, dVarA150, dVarA151, dVarA152, dVarA153, dVarA154, dVarA155, dVarA156, dVarA157, dVarA158, dVarA159, dVarA160, dVarA161, dVarA162, dVar, f3.a(aVar), t4.a(aVar), a3.a(aVar), u62.u.a(aVar), u62.y0.a(aVar), u62.q1.a(aVar), b4.a(aVar), l3.a(aVar), d3.a(aVar), e4.a(aVar), f1.a(aVar), u62.q2.a(aVar), k3.a(aVar), k5.a(aVar));
        f132239a = listK;
        listK.getClass();
        return listK;
    }

    public static final List x(u6 u6Var) {
        u6Var.getClass();
        List list = f132240b;
        if (list != null) {
            return list;
        }
        u4.d dVarC = b72.c.f16367a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("BatteryOff", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4294243572L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(21.25f, 3.2f, 22.0f, 4.15f);
            eVarM.i(19.3f, 6.55f);
            eVarM.d(19.4f, 6.7f, 19.5f, 6.9f, 19.5f, 7.15f);
            eVarM.o(16.65f);
            eVarM.d(19.5f, 17.2f, 19.05f, 17.65f, 18.5f, 17.65f);
            eVarM.g(6.45f);
            eVarM.i(2.8f, 20.8f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 2.0f, 19.9f, 21.25f, 3.2f);
            eVarM.k(2.8f, 17.65f);
            eVarM.i(16.05f, 6.15f);
            eVarM.g(3.0f);
            eVarM.d(2.45f, 6.15f, 2.0f, 6.6f, 2.0f, 7.15f);
            eVarM.o(16.65f);
            eVarM.d(2.0f, 17.15f, 2.35f, 17.55f, 2.8f, 17.65f);
            eVarM.c();
            eVarM.k(22.0f, 14.65f);
            eVarM.o(9.15f);
            eVarM.g(20.5f);
            v.e0.p(eVarM, 14.65f, 22.0f);
            u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            b72.c.f16367a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarA = b72.d.a(u6Var);
        u4.d dVarC2 = b72.e.f16369a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("BatteryUnknownSolid", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarQ = z.q(22.0f, 9.0f, 14.5f, 20.5f, 9.0f);
            eVarQ.g(22.0f);
            eVarQ.c();
            eVarQ.k(19.5f, 7.0f);
            eVarQ.o(16.5f);
            eVarQ.d(19.5f, 17.05f, 19.05f, 17.5f, 18.5f, 17.5f);
            eVarQ.g(3.0f);
            eVarQ.d(2.45f, 17.5f, 2.0f, 17.05f, 2.0f, 16.5f);
            eVarQ.o(7.0f);
            eVarQ.d(2.0f, 6.45f, 2.45f, 6.0f, 3.0f, 6.0f);
            eVarQ.g(18.5f);
            eVarQ.d(19.05f, 6.0f, 19.5f, 6.45f, 19.5f, 7.0f);
            z.w(eVarQ, 11.72f, 14.32f, 10.14f, 15.9f);
            z.u(eVarQ, 11.72f, 14.32f, 13.3f, 9.98f);
            eVarQ.d(13.31f, 9.67f, 13.26f, 9.35f, 13.14f, 9.06f);
            eVarQ.d(13.02f, 8.77f, 12.85f, 8.5f, 12.63f, 8.28f);
            eVarQ.d(12.41f, 8.06f, 12.14f, 7.88f, 11.85f, 7.77f);
            eVarQ.d(11.56f, 7.65f, 11.25f, 7.6f, 10.93f, 7.61f);
            eVarQ.d(10.61f, 7.59f, 10.29f, 7.63f, 10.0f, 7.74f);
            eVarQ.d(9.7f, 7.85f, 9.43f, 8.02f, 9.21f, 8.25f);
            eVarQ.d(8.99f, 8.47f, 8.81f, 8.75f, 8.7f, 9.04f);
            eVarQ.d(8.59f, 9.34f, 8.54f, 9.66f, 8.57f, 9.97f);
            eVarQ.g(10.15f);
            eVarQ.d(10.15f, 9.4433f, 10.4133f, 9.18f, 10.94f, 9.18f);
            eVarQ.d(11.73f, 9.18f, 11.73f, 9.57f, 11.73f, 9.97f);
            eVarQ.d(11.76f, 10.23f, 11.7f, 10.49f, 11.55f, 10.71f);
            eVarQ.d(11.41f, 10.93f, 11.19f, 11.09f, 10.94f, 11.16f);
            eVarQ.d(10.69f, 11.23f, 10.47f, 11.39f, 10.33f, 11.61f);
            eVarQ.d(10.19f, 11.83f, 10.12f, 12.09f, 10.15f, 12.35f);
            z.o(eVarQ, 13.14f, 11.73f, 12.51f);
            eVarQ.d(11.73f, 12.39f, 11.77f, 12.27f, 11.84f, 12.17f);
            eVarQ.d(11.91f, 12.07f, 12.01f, 12.0f, 12.12f, 11.96f);
            eVarQ.d(12.5f, 11.8f, 12.82f, 11.52f, 13.03f, 11.16f);
            eVarQ.d(13.24f, 10.81f, 13.34f, 10.39f, 13.3f, 9.98f);
            eVarQ.c();
            u4.d.a.b(aVar4, eVarQ.f168407a, i15, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            b72.e.f16369a = dVarC2;
        }
        u4.d dVarC3 = b72.f.f16370a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("Power", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(16.3641f, 5.0158f, 15.5156f, 6.584f);
            eVarM2.d(16.6529f, 7.1943f, 17.6028f, 8.0998f, 18.2645f, 9.2043f);
            eVarM2.d(18.9261f, 10.3088f, 19.2747f, 11.571f, 19.2732f, 12.8569f);
            eVarM2.o(12.8569f);
            eVarM2.d(19.2574f, 14.7717f, 18.4861f, 16.6035f, 17.1256f, 17.9575f);
            eVarM2.d(15.7651f, 19.3115f, 13.9244f, 20.0791f, 12.0005f, 20.0949f);
            eVarM2.d(10.0814f, 20.0638f, 8.2496f, 19.2913f, 6.8924f, 17.9406f);
            eVarM2.d(5.5352f, 16.5899f, 4.759f, 14.7669f, 4.7277f, 12.8569f);
            eVarM2.d(4.7203f, 11.5771f, 5.0598f, 10.319f, 5.7104f, 9.2151f);
            eVarM2.d(6.3611f, 8.1111f, 7.2987f, 7.2022f, 8.4247f, 6.584f);
            eVarM2.i(7.5762f, 5.0158f);
            eVarM2.d(6.1624f, 5.7851f, 4.9829f, 6.9193f, 4.1617f, 8.2991f);
            eVarM2.d(3.3406f, 9.6788f, 2.908f, 11.2533f, 2.9096f, 12.8569f);
            eVarM2.d(2.8926f, 14.4578f, 3.3027f, 16.0345f, 4.0981f, 17.4261f);
            eVarM2.d(4.8935f, 18.8177f, 6.0458f, 19.9743f, 7.4371f, 20.7779f);
            eVarM2.d(8.8285f, 21.5814f, 10.4092f, 22.0031f, 12.0179f, 22.0f);
            eVarM2.d(13.6266f, 21.9968f, 15.2056f, 21.5689f, 16.5938f, 20.7599f);
            eVarM2.d(17.982f, 19.9509f, 19.1296f, 18.7898f, 19.9195f, 17.3951f);
            eVarM2.d(20.7094f, 16.0004f, 21.1133f, 14.422f, 21.0899f, 12.8212f);
            eVarM2.d(21.0666f, 11.2204f, 20.6168f, 9.6544f, 19.7866f, 8.2831f);
            eVarM2.d(18.9563f, 6.9118f, 17.7753f, 5.7844f, 16.3641f, 5.0158f);
            v.e0.w(eVarM2, 5.0158f, 13.2126f, 2.0f, 10.7884f);
            z.v(eVarM2, 9.238f, 13.2126f, 2.0f);
            u4.d.a.b(aVar6, eVarM2.f168407a, i16, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            b72.f.f16370a = dVarC3;
        }
        u4.d dVarC4 = b72.a.f16365a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("BatteryManager", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(r15), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL = b71.i.l(h1.f128863b, 13.0693f, 12.7227f, 13.8643f, 11.3086f);
            q2.w(eVarL, 17.335f, 12.3184f, 14.5537f);
            eVarL.i(12.8047f, 15.3506f);
            eVarL.i(11.2217f, 10.9297f);
            eVarL.i(9.5156f, 13.6328f);
            eVarL.i(8.0313f, 11.1562f);
            sn.a.A(eVarL, 7.0762f, 12.3184f, 4.0713f, 11.3086f);
            eVarL.g(6.4394f);
            eVarL.i(8.0313f, 9.3379f);
            eVarL.i(9.3574f, 11.5098f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL, 11.4336f, 7.999f, 13.0693f, 12.7227f);
            u4.d.a.b(aVar8, eVarL.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(r15), jVar);
            int i17 = h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(18.5f, 6.0f);
            eVarL2.d(18.7652f, 6.0f, 19.0195f, 6.1054f, 19.207f, 6.293f);
            eVarL2.d(19.3946f, 6.4805f, 19.5f, 6.7348f, 19.5f, 7.0f);
            eVarL2.o(16.5f);
            eVarL2.d(19.5f, 16.7652f, 19.3946f, 17.0195f, 19.207f, 17.207f);
            eVarL2.d(19.0195f, 17.3946f, 18.7652f, 17.5f, 18.5f, 17.5f);
            eVarL2.g(3.0f);
            eVarL2.d(2.7348f, 17.5f, 2.4805f, 17.3946f, 2.293f, 17.207f);
            eVarL2.d(2.1054f, 17.0195f, 2.0f, 16.7652f, 2.0f, 16.5f);
            eVarL2.o(7.0f);
            eVarL2.d(2.0f, 6.7348f, 2.1054f, 6.4805f, 2.293f, 6.293f);
            eVarL2.d(2.4805f, 6.1054f, 2.7348f, 6.0f, 3.0f, 6.0f);
            b71.i.y(eVarL2, 18.5f, 4.0f, 7.5f);
            eVarL2.d(3.8674f, 7.5f, 3.7403f, 7.5527f, 3.6465f, 7.6465f);
            eVarL2.d(3.5527f, 7.7403f, 3.5f, 7.8674f, 3.5f, 8.0f);
            eVarL2.o(15.5f);
            eVarL2.d(3.5f, 15.6326f, 3.5527f, 15.7597f, 3.6465f, 15.8535f);
            eVarL2.d(3.7403f, 15.9473f, 3.8674f, 16.0f, 4.0f, 16.0f);
            eVarL2.g(17.5f);
            eVarL2.d(17.6326f, 16.0f, 17.7597f, 15.9473f, 17.8535f, 15.8535f);
            eVarL2.d(17.9473f, 15.7597f, 18.0f, 15.6326f, 18.0f, 15.5f);
            eVarL2.o(8.0f);
            eVarL2.d(18.0f, 7.8674f, 17.9473f, 7.7403f, 17.8535f, 7.6465f);
            eVarL2.d(17.7597f, 7.5527f, 17.6326f, 7.5f, 17.5f, 7.5f);
            eVarL2.g(4.0f);
            eVarL2.c();
            u4.d.a.b(aVar8, eVarL2.f168407a, i17, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(r15), jVar);
            u4.e eVarL3 = z.l(22.0f, 14.5f, 20.5f, 9.0f, 22.0f);
            eVarL3.o(14.5f);
            eVarL3.c();
            u4.d.a.b(aVar8, eVarL3.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            b72.a.f16365a = dVarC4;
        }
        u4.d dVar2 = dVarC4;
        u4.d dVarC5 = b72.b.f16366a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("BatteryNoCharge", f18, f18, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(r15), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i18 = h1.f128864c;
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(16.9966f, 11.5002f);
            eVarL4.d(17.0885f, 11.5002f, 17.1788f, 11.5258f, 17.2573f, 11.5735f);
            eVarL4.d(17.3358f, 11.6212f, 17.3998f, 11.6894f, 17.4419f, 11.7708f);
            eVarL4.i(21.9194f, 19.6125f);
            eVarL4.d(21.9593f, 19.6917f, 22.0001f, 19.7791f, 22.0063f, 19.8264f);
            eVarL4.d(22.0285f, 19.9952f, 21.9784f, 20.1081f, 21.897f, 20.2092f);
            eVarL4.d(21.8071f, 20.303f, 21.7012f, 20.3879f, 21.4741f, 20.3879f);
            eVarL4.g(12.4497f);
            eVarL4.d(12.3805f, 20.3824f, 12.313f, 20.3625f, 12.2515f, 20.3293f);
            eVarL4.d(12.1695f, 20.2851f, 12.1014f, 20.2185f, 12.0552f, 20.1379f);
            eVarL4.d(12.0089f, 20.0573f, 11.9854f, 19.9651f, 11.9888f, 19.8723f);
            eVarL4.d(11.9922f, 19.7796f, 12.0218f, 19.6896f, 12.0737f, 19.6125f);
            eVarL4.i(16.5513f, 11.7708f);
            eVarL4.d(16.5933f, 11.6894f, 16.6575f, 11.6212f, 16.7358f, 11.5735f);
            eVarL4.d(16.8143f, 11.5258f, 16.9047f, 11.5003f, 16.9966f, 11.5002f);
            z.w(eVarL4, 16.4399f, 19.5579f, 17.5532f, 18.4495f);
            z.u(eVarL4, 16.4399f, 19.5579f, 16.4399f, 17.3401f);
            v.e0.x(eVarL4, 17.5532f, 14.5696f, 16.4399f, 17.3401f);
            u4.d.a.b(aVar10, eVarL4.f168407a, i18, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(r15), jVar);
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(18.4888f, 6.0002f);
            eVarL5.d(18.754f, 6.0002f, 19.0083f, 6.1057f, 19.1958f, 6.2932f);
            eVarL5.d(19.3833f, 6.4808f, 19.4888f, 6.735f, 19.4888f, 7.0002f);
            eVarL5.o(13.3381f);
            eVarL5.i(18.3101f, 11.2747f);
            eVarL5.i(18.3081f, 11.2756f);
            eVarL5.d(18.2247f, 11.1249f, 18.1155f, 10.992f, 17.9888f, 10.8792f);
            eVarL5.o(8.0002f);
            eVarL5.d(17.9888f, 7.8676f, 17.9361f, 7.7405f, 17.8423f, 7.6467f);
            eVarL5.d(17.7485f, 7.553f, 17.6214f, 7.5002f, 17.4888f, 7.5002f);
            eVarL5.g(3.9888f);
            eVarL5.d(3.8562f, 7.5002f, 3.729f, 7.553f, 3.6353f, 7.6467f);
            eVarL5.d(3.5415f, 7.7405f, 3.4888f, 7.8676f, 3.4888f, 8.0002f);
            z.o(eVarL5, 11.0002f, 6.4888f, 10.5002f);
            sn.a.A(eVarL5, 7.4888f, 9.0002f, 12.4888f, 10.0002f);
            q2.x(eVarL5, 14.4888f, 11.0002f, 12.4888f, 12.5002f);
            tn.k.t(eVarL5, 14.4888f, 13.3674f, 14.4126f, 13.5002f);
            q2.w(eVarL5, 12.4888f, 14.5002f, 7.4888f);
            tn.k.r(eVarL5, 6.4888f, 13.0002f, 12.5002f, 3.4888f);
            eVarL5.o(15.5002f);
            eVarL5.d(3.4888f, 15.6329f, 3.5415f, 15.76f, 3.6353f, 15.8538f);
            eVarL5.d(3.729f, 15.9475f, 3.8562f, 16.0002f, 3.9888f, 16.0002f);
            tn.k.u(eVarL5, 12.9849f, 12.1284f, 17.5002f, 2.9888f);
            eVarL5.d(2.7236f, 17.5002f, 2.4693f, 17.3948f, 2.2817f, 17.2073f);
            eVarL5.d(2.0942f, 17.0197f, 1.9888f, 16.7655f, 1.9888f, 16.5002f);
            eVarL5.o(7.0002f);
            eVarL5.d(1.9888f, 6.735f, 2.0942f, 6.4808f, 2.2817f, 6.2932f);
            eVarL5.d(2.4693f, 6.1057f, 2.7236f, 6.0002f, 2.9888f, 6.0002f);
            eVarL5.g(18.4888f);
            eVarL5.c();
            u4.d.a.b(aVar10, eVarL5.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(r15), jVar);
            u4.e eVarL6 = z.l(21.9888f, 14.5002f, 20.4888f, 9.0002f, 21.9888f);
            eVarL6.o(14.5002f);
            eVarL6.c();
            u4.d.a.b(aVar10, eVarL6.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            b72.b.f16366a = dVarC5;
        }
        List listK = p13.x.k(dVar, dVarA, dVarC2, dVarC3, dVar2, dVarC5);
        f132240b = listK;
        listK.getClass();
        return listK;
    }

    public static final pv0.a y(pv0.c cVar) {
        Object next;
        cVar.getClass();
        w13.c cVar2 = pv0.a.f141334g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (s.g(((pv0.a) next).f141335a, cVar.f141354c)) {
                return (pv0.a) next;
            }
        }
        next = null;
        return (pv0.a) next;
    }

    public static final int z(List list, double d14) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(Math.abs(d14 - ((Number) it.next()).doubleValue())));
        }
        return arrayList.indexOf(h0.u0(arrayList));
    }
}
