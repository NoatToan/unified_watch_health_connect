package ge1;

import am.x0;
import am.z0;
import android.content.Context;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.emoji2.text.d;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.flexbox.FlexItem;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.google.common.net.HttpHeaders;
import com.google.maps.android.BuildConfig;
import com.google.mlkit.common.MlKitException;
import d53.u;
import ds.e0;
import e23.l;
import e23.q;
import f2.p0;
import f2.r0;
import f5.g0;
import g22.k;
import g6.f;
import g8.i;
import gw0.w;
import h4.r;
import i02.m;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.t1;
import l72.r1;
import lc.k0;
import lc.q0;
import lq.h;
import mr.i0;
import mr.m0;
import mr.n0;
import mr.u0;
import n23.j;
import o13.p;
import o53.b0;
import o53.c2;
import o53.d0;
import o53.d2;
import o53.e1;
import o53.e2;
import o53.f0;
import o53.g2;
import o53.l2;
import o53.p1;
import o53.s1;
import o53.v;
import o53.y0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p1.t0;
import p13.c0;
import p13.h0;
import p13.j0;
import p13.y;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ps.o1;
import ps.q1;
import pv0.o;
import pv0.s;
import t13.e;
import t13.g;
import u53.t;
import u53.z;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final hz.b A(be1.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        DateTime dateTimeQ = null;
        LocalDate localDateW = (aVar == null || (str4 = aVar.f17715b) == null) ? null : k.w(str4, "yyyy-MM-dd");
        DateTime dateTimeQ2 = (aVar == null || (str3 = aVar.f17716c) == null) ? null : k.q(str3, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        DateTime dateTimeQ3 = (aVar == null || (str2 = aVar.f17717d) == null) ? null : k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
        if (aVar != null && (str = aVar.f17719f) != null) {
            dateTimeQ = k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return new hz.c(localDateW, dateTimeQ2, dateTimeQ3, dateTimeQ, 0, 16, null).a();
    }

    public static final int B(ud.c cVar, String str) {
        cVar.getClass();
        int iN = n(cVar, str);
        if (iN >= 0) {
            return iN;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i14 = 0; i14 < columnCount; i14++) {
            arrayList.add(cVar.getColumnName(i14));
        }
        fb1.c.s(93, "Column '", str, "' does not exist. Available columns: [", h0.k0(arrayList, null, null, null, null, 63));
        return 0;
    }

    public static final j20.b C(l20.c cVar) {
        if (cVar.Z()) {
            return j20.b.UNCONFIRMED;
        }
        if (cVar.d() || cVar.I()) {
            return j20.b.DECLINED;
        }
        if (cVar.M()) {
            return j20.b.UNCONFIRMED;
        }
        if (cVar.H()) {
            return j20.b.CONFIRMED;
        }
        return null;
    }

    public static final Integer D(l20.c cVar) {
        if (cVar.I() || cVar.d()) {
            return Integer.valueOf(R.string.assistance_contact_declined);
        }
        if (cVar.H() || cVar.Z() || cVar.M()) {
            return Integer.valueOf(R.string.incident_detection_assistance_contact);
        }
        return null;
    }

    public static final Integer E(l20.c cVar) {
        if (cVar.Z()) {
            return Integer.valueOf(R.string.request_pending);
        }
        if (cVar.d()) {
            return Integer.valueOf(R.string.opted_out_of_emergency_messages);
        }
        if (cVar.M() || cVar.f()) {
            return Integer.valueOf(R.string.send_a_request);
        }
        return null;
    }

    public static final Integer F(l20.a aVar) {
        aVar.getClass();
        if (Q(aVar) && aVar.D()) {
            return 2131231821;
        }
        return (!Q(aVar) || aVar.d()) ? null : 2131231822;
    }

    public static final d G() {
        if (!d.e()) {
            return null;
        }
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return dVarA;
        }
        return null;
    }

    public static final q1 H(List list, h hVar) {
        hVar.getClass();
        if (list == null) {
            return new q1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, FlexItem.MAX_SIZE, null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            if (u.q(o1Var.getSplitType(), M(hVar).f114311a, false)) {
                Double dY = o1Var.getDistance();
                double dDoubleValue = dY != null ? dY.doubleValue() : Double.NaN;
                Double dZ = o1Var.getDuration();
                double dDoubleValue2 = dZ != null ? dZ.doubleValue() : Double.NaN;
                Double dA0 = o1Var.getMovingDuration();
                double dDoubleValue3 = dA0 != null ? dA0.doubleValue() : Double.NaN;
                Double dA = o1Var.getElevationGain();
                double dDoubleValue4 = dA != null ? dA.doubleValue() : Double.NaN;
                Double dC = o1Var.getElevationLoss();
                double dDoubleValue5 = dC != null ? dC.doubleValue() : Double.NaN;
                Double dI = o1Var.getAverageSpeed();
                double dDoubleValue6 = dI != null ? dI.doubleValue() : Double.NaN;
                Double dG = o1Var.getAverageMovingSpeed();
                double dDoubleValue7 = dG != null ? dG.doubleValue() : Double.NaN;
                Double dQ0 = o1Var.getMaxSpeed();
                double dDoubleValue8 = dQ0 != null ? dQ0.doubleValue() : Double.NaN;
                Double dU = o1Var.getCalories();
                double dDoubleValue9 = dU != null ? dU.doubleValue() : Double.NaN;
                Double dF = o1Var.getAverageHR();
                double dDoubleValue10 = dF != null ? dF.doubleValue() : Double.NaN;
                Double dJ0 = o1Var.getMaxHR();
                double dDoubleValue11 = dJ0 != null ? dJ0.doubleValue() : Double.NaN;
                Double dR = o1Var.getAvgPower();
                double dDoubleValue12 = dR != null ? dR.doubleValue() : Double.NaN;
                Double dO0 = o1Var.getMaxPower();
                double dDoubleValue13 = dO0 != null ? dO0.doubleValue() : Double.NaN;
                Double dJ1 = o1Var.getNormalizedPower();
                double dDoubleValue14 = dJ1 != null ? dJ1.doubleValue() : Double.NaN;
                Double dK = o1Var.getAvgBikeForce();
                double dDoubleValue15 = dK != null ? dK.doubleValue() : Double.NaN;
                Double dC0 = o1Var.getMaxBikeForce();
                double dDoubleValue16 = dC0 != null ? dC0.doubleValue() : Double.NaN;
                Double dE0 = o1Var.getNormalizedForce();
                double dDoubleValue17 = dE0 != null ? dE0.doubleValue() : Double.NaN;
                Double dI2 = o1Var.getLeftBalance();
                double dDoubleValue18 = dI2 != null ? dI2.doubleValue() : Double.NaN;
                Double dR0 = o1Var.getRightBalance();
                double dDoubleValue19 = dR0 != null ? dR0.doubleValue() : Double.NaN;
                Double dH = o1Var.getAverageRunCadence();
                double dDoubleValue20 = dH != null ? dH.doubleValue() : Double.NaN;
                Double dP0 = o1Var.getMaxRunCadence();
                double dDoubleValue21 = dP0 != null ? dP0.doubleValue() : Double.NaN;
                Double d14 = o1Var.getAverageBikeCadence();
                double dDoubleValue22 = d14 != null ? d14.doubleValue() : Double.NaN;
                Double dA1 = o1Var.getMaxBikeCadence();
                double dDoubleValue23 = dA1 != null ? dA1.doubleValue() : Double.NaN;
                Double dJ = o1Var.getAverageTemperature();
                double dDoubleValue24 = dJ != null ? dJ.doubleValue() : Double.NaN;
                Double dW0 = o1Var.getMaxTemperature();
                double dDoubleValue25 = dW0 != null ? dW0.doubleValue() : Double.NaN;
                Double dX0 = o1Var.getMinTemperature();
                double dDoubleValue26 = dX0 != null ? dX0.doubleValue() : Double.NaN;
                Double dH2 = o1Var.getGroundContactTime();
                double dDoubleValue27 = dH2 != null ? dH2.doubleValue() : Double.NaN;
                Double dG2 = o1Var.getGroundContactBalanceLeft();
                double dDoubleValue28 = dG2 != null ? dG2.doubleValue() : Double.NaN;
                Double dB1 = o1Var.getStepSpeedLoss();
                double dDoubleValue29 = dB1 != null ? dB1.doubleValue() : Double.NaN;
                Double dC1 = o1Var.getStepSpeedLossPercent();
                double dDoubleValue30 = dC1 != null ? dC1.doubleValue() : Double.NaN;
                Double dE1 = o1Var.getStrideLength();
                double dDoubleValue31 = dE1 != null ? dE1.doubleValue() : Double.NaN;
                Double dJ2 = o1Var.getVerticalOscillation();
                double dDoubleValue32 = dJ2 != null ? dJ2.doubleValue() : Double.NaN;
                Double dS1 = o1Var.getVerticalRatio();
                double dDoubleValue33 = dS1 != null ? dS1.doubleValue() : Double.NaN;
                Double dZ2 = o1Var.getLeftTorqueEffectiveness();
                double dDoubleValue34 = dZ2 != null ? dZ2.doubleValue() : Double.NaN;
                Double dV0 = o1Var.getRightTorqueEffectiveness();
                double dDoubleValue35 = dV0 != null ? dV0.doubleValue() : Double.NaN;
                Double dM = o1Var.getLeftPedalSmoothness();
                double dDoubleValue36 = dM != null ? dM.doubleValue() : Double.NaN;
                Double dS0 = o1Var.getRightPedalSmoothness();
                double dDoubleValue37 = dS0 != null ? dS0.doubleValue() : Double.NaN;
                Double dO = o1Var.getAvgGradeAdjustedSpeed();
                return new q1(null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue22), Double.valueOf(dDoubleValue15), null, null, null, null, Double.valueOf(dO != null ? dO.doubleValue() : Double.NaN), null, Double.valueOf(dDoubleValue10), null, null, null, Double.valueOf(dDoubleValue7), Double.valueOf(dDoubleValue12), null, Double.valueOf(dDoubleValue20), null, Double.valueOf(dDoubleValue6), null, null, null, Double.valueOf(dDoubleValue29), Double.valueOf(dDoubleValue30), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue24), null, null, null, Double.valueOf(dDoubleValue33), null, null, null, null, null, null, Double.valueOf(dDoubleValue9), null, null, null, null, Double.valueOf(dDoubleValue), null, Double.valueOf(dDoubleValue2), null, Double.valueOf(dDoubleValue4), Double.valueOf(dDoubleValue5), null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue28), Double.valueOf(dDoubleValue27), null, null, null, null, Double.valueOf(dDoubleValue18), Double.valueOf(dDoubleValue36), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue34), null, null, null, null, Double.valueOf(dDoubleValue23), Double.valueOf(dDoubleValue16), null, null, Double.valueOf(dDoubleValue11), null, null, null, null, o1Var.getMaxPisteDifficulty(), Double.valueOf(dDoubleValue13), null, null, Double.valueOf(dDoubleValue21), Double.valueOf(dDoubleValue8), null, null, null, null, null, null, Double.valueOf(dDoubleValue25), null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue26), null, Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue17), Double.valueOf(dDoubleValue14), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue19), Double.valueOf(dDoubleValue37), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue35), null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue31), null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue32), null, null, null, null, 1966797823, -889721090, 2079975423, -1061642, -8437877, 16252895, null);
            }
        }
        j.s("Collection contains no element matching the predicate.");
        return null;
    }

    public static final int I(hc1.a aVar) {
        aVar.getClass();
        return (int) aVar.f83273a.b().floatValue();
    }

    public static final int J(hc1.a aVar) {
        aVar.getClass();
        return (int) aVar.f83273a.getStart().floatValue();
    }

    public static final List K(be1.a aVar) {
        Collection collectionB = aVar != null ? aVar.b() : null;
        if (collectionB == null) {
            collectionB = j0.f134944a;
        }
        j0 j0Var = j0.f134944a;
        if (collectionB == null || !collectionB.isEmpty()) {
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                if (((be1.c) it.next()).f17743b > 0.0d) {
                    ArrayList<be1.c> arrayList = new ArrayList();
                    for (Object obj : collectionB) {
                        if (((be1.c) obj).f17743b > 0.0d) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    for (be1.c cVar : arrayList) {
                        arrayList2.add(new hz.d(new DateTime(f0.y(cVar), A(aVar).f86381d), (float) cVar.f17743b));
                    }
                    return arrayList2;
                }
            }
        }
        return j0Var;
    }

    public static final Logger L(String str) {
        Logger logger = LoggerFactory.getLogger("SAMD#".concat(str));
        logger.getClass();
        return logger;
    }

    public static final h M(h hVar) {
        hVar.getClass();
        return (hVar == h.RUN || hVar == h.BIKE) ? h.ACTIVE : hVar;
    }

    public static final p N(l20.c cVar) {
        Integer numValueOf = Integer.valueOf(R.string.assistance_contact_method_opted_out_alert_message);
        Integer numValueOf2 = Integer.valueOf(R.string.opted_out_contact_method_alert_title);
        if (cVar.Z() || cVar.M()) {
            return new p(Integer.valueOf(R.string.send_another_request_alert_title), Integer.valueOf(R.string.assistance_contact_method_receive_another_request_alert_message));
        }
        if (cVar.d()) {
            return new p(numValueOf2, numValueOf);
        }
        if (cVar.I()) {
            return new p(Integer.valueOf(R.string.previously_declined_contact_alert_title), Integer.valueOf(R.string.assistance_contact_method_declined_alert_message));
        }
        return cVar.f() ? new p(numValueOf2, numValueOf) : new p(null, null);
    }

    public static final pv0.h O(pv0.h hVar, s sVar, o oVar) {
        List<o> listC;
        hVar.getClass();
        sVar.getClass();
        String str = hVar.f141379f;
        String str2 = sVar.f141418a;
        if (p005kotlin.jvm.internal.s.g(str, str2) && oVar == null) {
            str2 = null;
        }
        if (sVar == s.YES) {
            listC = hVar.f141378e;
            if (oVar != null) {
                if (listC != null) {
                    Iterator<o> it = listC.iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i14 = -1;
                            break;
                        }
                        if (p005kotlin.jvm.internal.s.g(it.next().f141395a, oVar.f141395a)) {
                            break;
                        }
                        i14++;
                    }
                    ArrayList arrayList = new ArrayList(listC);
                    if (i14 >= 0) {
                        o oVar2 = (o) arrayList.get(i14);
                        arrayList.set(i14, new o(oVar2.f141395a, oVar2.f141396b, oVar.f141397c));
                    } else {
                        arrayList.add(oVar);
                        if (arrayList.size() > 1) {
                            c0.u(arrayList, new w());
                        }
                    }
                    listC = arrayList;
                } else {
                    listC = p13.w.c(oVar);
                }
            }
        } else {
            listC = null;
        }
        return pv0.h.a(hVar, listC, str2, null, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD);
    }

    public static final boolean P(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Q((l20.a) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Q(l20.a aVar) {
        aVar.getClass();
        return p005kotlin.jvm.internal.s.g(aVar.getIsSosDefault(), Boolean.TRUE);
    }

    public static final boolean R(nn0.c cVar) {
        cVar.getClass();
        i53.c<in0.h> cVar2 = cVar.f126686b;
        if (cVar2 == null || cVar2.isEmpty()) {
            return false;
        }
        cVar2.getClass();
        if (cVar2.isEmpty()) {
            return true;
        }
        if (cVar2.isEmpty()) {
            return false;
        }
        Iterator<in0.h> it = cVar2.iterator();
        while (it.hasNext()) {
            if (it.next().f94447b != null) {
                return true;
            }
        }
        return false;
    }

    public static final c2 S(b0 b0Var, g gVar, d0 d0Var, e23.p pVar) {
        g gVarB = o53.y.b(b0Var, gVar);
        d0Var.getClass();
        c2 s1Var = d0Var == d0.LAZY ? new s1(gVarB, pVar) : new c2(gVarB, true);
        s1Var.v0(d0Var, s1Var, pVar);
        return s1Var;
    }

    public static /* synthetic */ c2 T(b0 b0Var, g gVar, d0 d0Var, e23.p pVar, int i14) {
        if ((i14 & 1) != 0) {
            gVar = t13.h.f161748a;
        }
        if ((i14 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return S(b0Var, gVar, d0Var, pVar);
    }

    public static final void U(k0 k0Var, k23.d dVar, Object obj, Map map, l lVar) {
        k0Var.getClass();
        dVar.getClass();
        obj.getClass();
        map.getClass();
        k0 k0Var2 = new k0(k0Var.f111792h, obj, (k23.d<?>) dVar, (Map<k23.p, q0<?>>) map);
        lVar.invoke(k0Var2);
        k0Var.f111797m.add(k0Var2.a());
    }

    public static final m V(e23.p pVar, e23.p pVar2, p3.m mVar, int i14) {
        pVar.getClass();
        p0 p0VarA = r0.a(0, mVar, 3);
        f.a aVar = f.f75994b;
        i02.u uVar = new i02.u(0.0f, 1, null);
        x1 x1Var = n.f135158a;
        float fS0 = ((g6.c) mVar.A(t1.f91490h)).s0(20);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ == obj) {
            objQ = l0.j(t13.h.f161748a, mVar);
            mVar.K(objQ);
        }
        b0 b0Var = (b0) objQ;
        boolean zB = mVar.B(p0VarA);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == obj) {
            objQ2 = new m(p0VarA, b0Var, fS0, pVar, pVar2, null, uVar);
            mVar.K(objQ2);
        }
        m mVar2 = (m) objQ2;
        boolean zR = mVar.r(mVar2);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == obj) {
            objQ3 = new i02.n(mVar2, null);
            mVar.K(objQ3);
        }
        l0.e((e23.p) objQ3, mVar2, mVar);
        boolean zR2 = mVar.r(mVar2) | mVar.B(p0VarA);
        Object objQ4 = mVar.q();
        if (zR2 || objQ4 == obj) {
            objQ4 = new i02.o(mVar2, p0VarA, null);
            mVar.K(objQ4);
        }
        l0.e((e23.p) objQ4, mVar2, mVar);
        return mVar2;
    }

    public static final Object W(g gVar, e23.p pVar) throws Throwable {
        y0 y0VarA;
        g gVarB;
        long jV;
        Thread threadCurrentThread = Thread.currentThread();
        e eVar = (e) gVar.get(e.f161746w0);
        if (eVar == null) {
            g2.f129341a.getClass();
            y0VarA = g2.a();
            gVarB = o53.y.b(e1.f129333a, gVar.plus(y0VarA));
        } else {
            if (eVar instanceof y0) {
            }
            g2.f129341a.getClass();
            y0VarA = g2.f129342b.get();
            gVarB = o53.y.b(e1.f129333a, gVar);
        }
        o53.f fVar = new o53.f(gVarB, threadCurrentThread, y0VarA);
        fVar.v0(d0.DEFAULT, fVar, pVar);
        y0 y0Var = fVar.f129335e;
        if (y0Var != null) {
            int i14 = y0.f129422d;
            y0Var.U(false);
        }
        while (true) {
            if (y0Var != null) {
                try {
                    jV = y0Var.V();
                } catch (Throwable th3) {
                    if (y0Var != null) {
                        int i15 = y0.f129422d;
                        y0Var.H(false);
                    }
                    throw th3;
                }
            } else {
                jV = Long.MAX_VALUE;
            }
            if (fVar.e()) {
                break;
            }
            LockSupport.parkNanos(fVar, jV);
            if (Thread.interrupted()) {
                fVar.D(new InterruptedException());
            }
        }
        if (y0Var != null) {
            int i16 = y0.f129422d;
            y0Var.H(false);
        }
        Object objA = o53.q1.a(p1.f129381a.get(fVar));
        v vVar = objA instanceof v ? (v) objA : null;
        if (vVar == null) {
            return objA;
        }
        throw vVar.f129416a;
    }

    public static final Object Y(e23.p pVar, t13.d dVar) {
        d2 d2Var = new d2(dVar.getF157466b(), dVar);
        Object objV = oi0.c.V(d2Var, true, d2Var, pVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objV;
    }

    public static final ps.j Z(cy0.o oVar) {
        oVar.getClass();
        return new ps.j(oVar.getMediaUuid().getUuid(), oVar.getUrl(), oVar.getMediumUrl(), oVar.getSmallUrl(), oVar.getLargeUrl(), null, null, null, null, 480, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, double d14, Double d15, Double d16, jo.a aVar, jo.a aVar2, q qVar, p3.m mVar, int i14) {
        Object nVar;
        Double d17;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        rVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(526160999);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.m(0.0d) ? 32 : 16) | (o0VarE.m(d14) ? 256 : 128) | (o0VarE.B(d15) ? 2048 : 1024) | (o0VarE.B(d16) ? 16384 : 8192) | (o0VarE.B(aVar) ? 131072 : 65536) | (o0VarE.B(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(qVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(d15);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var3 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(d16);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var4 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(null);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var5 = (p3.p1) objQ3;
            boolean z14 = ((i15 & 7168) == 2048) | ((57344 & i15) == 16384);
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                d17 = d15;
                p1Var = p1Var3;
                p1Var2 = p1Var4;
                nVar = new ho.n(d17, d16, p1Var, p1Var2, null);
                o0VarE.K(nVar);
            } else {
                d17 = d15;
                nVar = objQ4;
                p1Var = p1Var3;
                p1Var2 = p1Var4;
            }
            l0.f(d17, d16, (e23.p) nVar, o0VarE);
            Double d18 = (Double) p1Var.getF182175a();
            Double d19 = (Double) p1Var2.getF182175a();
            eo.e eVar = (eo.e) p1Var5.getF182175a();
            boolean z15 = (i15 & 29360128) == 8388608;
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                objQ5 = new ho.o(qVar, p1Var, p1Var2, p1Var5, null);
                o0VarE.K(objQ5);
            }
            l0.g(d18, d19, eVar, (e23.p) objQ5, o0VarE);
            Double d24 = (Double) p1Var.getF182175a();
            Double d25 = (Double) p1Var2.getF182175a();
            String strValueOf = String.valueOf((int) 0.0d);
            String strP = gl1.y.P(R.string.lbl_string_with_positive_sign_end, new Object[]{String.valueOf((int) d14)}, o0VarE);
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new ho.k(p1Var, p1Var2, p1Var5, 0);
                o0VarE.K(objQ6);
            }
            q qVar2 = (q) objQ6;
            boolean zR = o0VarE.r(context) | ((i15 & 896) == 256);
            Object objQ7 = o0VarE.q();
            if (zR || objQ7 == c2565a) {
                objQ7 = new ho.l(context, d14, 0);
                o0VarE.K(objQ7);
            }
            go.e.a(rVar, d24, d25, strValueOf, strP, aVar, aVar2, qVar2, (e23.p) objQ7, o0VarE, (i15 & 3670016) | (i15 & 14) | 12582912 | (458752 & i15));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho.m(rVar, d14, d15, d16, aVar, aVar2, qVar, i14, 0);
        }
    }

    public static final ps.j a0(jo1.f fVar) {
        fVar.getClass();
        return new ps.j(String.valueOf(fVar.getNewsPostHasImageId()), fVar.getImageUrl(), null, null, fVar.getImageUrl(), null, null, null, null, 492, null);
    }

    public static final void b(n50.e eVar, l lVar, p3.m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(-260831897);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            d40.a.a(gl1.y.Q(o0VarE, R.string.automatic_course_creator_description), eVar, lVar, o0VarE, (i15 << 3) & 1008);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m30.e(eVar, lVar, i14, i16);
        }
    }

    public static final String b0(byte b14) {
        if (b14 == 1) {
            return "quotation mark '\"'";
        }
        if (b14 == 2) {
            return "string escape sequence '\\'";
        }
        if (b14 == 4) {
            return "comma ','";
        }
        if (b14 == 5) {
            return "colon ':'";
        }
        if (b14 == 6) {
            return "start of the object '{'";
        }
        if (b14 == 7) {
            return "end of the object '}'";
        }
        if (b14 == 8) {
            return "start of the array '['";
        }
        if (b14 == 9) {
            return "end of the array ']'";
        }
        if (b14 == 10) {
            return "end of the input";
        }
        return b14 == 127 ? "invalid token" : "valid token";
    }

    public static final void c(boolean z14, boolean z15, boolean z16, m40.b bVar, e23.p pVar, p3.m mVar, int i14) {
        pVar.getClass();
        o0 o0VarE = mVar.E(-1316456335);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.B(bVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r1.b(gl1.y.Q(o0VarE, R.string.lbl_course_line), z3.f.c(1669233548, new n40.h(z14, bVar, pVar, z15, z16), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n40.h(z14, z15, z16, bVar, pVar, i14);
        }
    }

    public static final double c0(long j8) {
        return ((j8 >>> 11) * ((double) 2048)) + (j8 & 2047);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1629187672);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            gl.c.f77766a.getClass();
            m72.f.b(3456, 2, gl.c.a(o0VarE).f(), "Neutral Primary", "GdsColors.dataViz.NeutralPrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).g(), "Neutral Secondary", "GdsColors.dataViz.NeutralSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).b(), "Blue Primary", "GdsColors.dataViz.BluePrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).c(), "Blue Secondary", "GdsColors.dataViz.BlueSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).d(), "Green Primary", "GdsColors.dataViz.GreenPrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).e(), "Green Secondary", "GdsColors.dataViz.GreenSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).h(), "Orange Primary", "GdsColors.dataViz.OrangePrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).i(), "Orange Secondary", "GdsColors.dataViz.OrangeSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).j(), "Purple Primary", "GdsColors.dataViz.PurplePrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).k(), "Purple Secondary", "GdsColors.dataViz.PurpleSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).l(), "Red Primary", "GdsColors.dataViz.RedPrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).m(), "Red Secondary", "GdsColors.dataViz.RedSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).n(), "Teal Primary", "GdsColors.dataViz.TealPrimary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).o(), "Teal Secondary", "GdsColors.dataViz.TealSecondary", o0VarE, false);
            m72.f.b(3456, 2, gl.c.a(o0VarE).r(), "Yellow Primary", "GdsColors.dataViz.YellowPrimary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) gl.c.a(o0VarE).f77764r.getF182175a()).f128833a, "Yellow Secondary", "GdsColors.dataViz.YellowSecondary", o0VarE, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n32.a(i14, 25);
        }
    }

    public static final String d0(int i14, long j8) {
        if (j8 >= 0) {
            d53.a.a(i14);
            String string = Long.toString(j8, i14);
            string.getClass();
            return string;
        }
        long j14 = i14;
        long j15 = ((j8 >>> 1) / j14) << 1;
        long j16 = j8 - (j15 * j14);
        if (j16 >= j14) {
            j16 -= j14;
            j15++;
        }
        d53.a.a(i14);
        String string2 = Long.toString(j15, i14);
        string2.getClass();
        d53.a.a(i14);
        String string3 = Long.toString(j16, i14);
        string3.getClass();
        return string2.concat(string3);
    }

    public static final long e(boolean z14, boolean z15, float f14) {
        return (((z14 ? 1L : 0L) | (z15 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
    }

    public static final Object e0(g gVar, e23.p pVar, t13.d dVar) throws Throwable {
        Object objA;
        g context = dVar.getF157466b();
        g gVarPlus = !((Boolean) gVar.fold(Boolean.FALSE, new o01.e(13))).booleanValue() ? context.plus(gVar) : o53.y.a(context, gVar, false);
        i.v(gVarPlus);
        if (gVarPlus == context) {
            t tVar = new t(gVarPlus, dVar);
            objA = oi0.c.V(tVar, true, tVar, pVar);
        } else {
            e.a aVar = e.f161746w0;
            if (p005kotlin.jvm.internal.s.g(gVarPlus.get(aVar), context.get(aVar))) {
                l2 l2Var = new l2(gVarPlus, dVar);
                g gVar2 = l2Var.f129302c;
                Object objC = z.c(gVar2, null);
                try {
                    Object objV = oi0.c.V(l2Var, true, l2Var, pVar);
                    z.a(gVar2, objC);
                    objA = objV;
                } catch (Throwable th3) {
                    z.a(gVar2, objC);
                    throw th3;
                }
            } else {
                o53.o0 o0Var = new o53.o0(gVarPlus, dVar);
                v53.a.a(pVar, o0Var, o0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o53.o0.f129375e;
                do {
                    int i14 = atomicIntegerFieldUpdater.get(o0Var);
                    if (i14 != 0) {
                        if (i14 != 2) {
                            vb.h.z("Already suspended");
                            return null;
                        }
                        objA = o53.q1.a(p1.f129381a.get(o0Var));
                        if (objA instanceof v) {
                            throw ((v) objA).f129416a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(o0Var, 0, 1));
                objA = u13.a.COROUTINE_SUSPENDED;
            }
        }
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static final void f(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1205264446);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            m72.f.c("Color Palette", o0VarE, 6);
            gl.c.f77766a.getClass();
            gl.e eVar = gl.c.f77767b;
            m72.f.b(3504, 0, eVar.f77769a, "White", "GdsColors.palette.White", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77771b, "Black", "GdsColors.palette.Black", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77773c, "Gray10", "GdsColors.palette.Gray10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77775d, "Gray15", "GdsColors.palette.Gray15", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77777e, "Gray20", "GdsColors.palette.Gray20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77779f, "Gray25", "GdsColors.palette.Gray25", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77781g, "Gray30", "GdsColors.palette.Gray30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77783h, "Gray35", "GdsColors.palette.Gray35", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77785i, "Gray40", "GdsColors.palette.Gray40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77787j, "Gray45", "GdsColors.palette.Gray45", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77789k, "Gray50", "GdsColors.palette.Gray50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77791l, "Gray55", "GdsColors.palette.Gray55", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77793m, "Gray60", "GdsColors.palette.Gray60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77795n, "Gray65", "GdsColors.palette.Gray65", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77797o, "Gray70", "GdsColors.palette.Gray70", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77799p, "Blue10", "GdsColors.palette.Blue10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77801q, "Blue20", "GdsColors.palette.Blue20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77803r, "Blue30", "GdsColors.palette.Blue30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77805s, "Blue40", "GdsColors.palette.Blue40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77807t, "Blue50", "GdsColors.palette.Blue50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77809u, "Blue60", "GdsColors.palette.Blue60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77811v, "Blue70", "GdsColors.palette.Blue70", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77813w, "Green10", "GdsColors.palette.Green10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77815x, "Green20", "GdsColors.palette.Green20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77817y, "Green30", "GdsColors.palette.Green30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77819z, "Green40", "GdsColors.palette.Green40", o0VarE, true);
            m72.f.b(3504, 0, eVar.A, "Green50", "GdsColors.palette.Green50", o0VarE, true);
            m72.f.b(3504, 0, eVar.B, "Green60", "GdsColors.palette.Green60", o0VarE, true);
            m72.f.b(3504, 0, eVar.C, "Green70", "GdsColors.palette.Green70", o0VarE, true);
            m72.f.b(3504, 0, eVar.D, "Lime10", "GdsColors.palette.Lime10", o0VarE, true);
            m72.f.b(3504, 0, eVar.E, "Lime20", "GdsColors.palette.Lime20", o0VarE, true);
            m72.f.b(3504, 0, eVar.F, "Lime30", "GdsColors.palette.Lime30", o0VarE, true);
            m72.f.b(3504, 0, eVar.G, "Lime40", "GdsColors.palette.Lime40", o0VarE, true);
            m72.f.b(3504, 0, eVar.H, "Lime50", "GdsColors.palette.Lime50", o0VarE, true);
            m72.f.b(3504, 0, eVar.I, "Lime60", "GdsColors.palette.Lime60", o0VarE, true);
            m72.f.b(3504, 0, eVar.J, "Lime70", "GdsColors.palette.Lime70", o0VarE, true);
            m72.f.b(3504, 0, eVar.K, "Orange10", "GdsColors.palette.Orange10", o0VarE, true);
            m72.f.b(3504, 0, eVar.L, "Orange20", "GdsColors.palette.Orange20", o0VarE, true);
            m72.f.b(3504, 0, eVar.M, "Orange30", "GdsColors.palette.Orange30", o0VarE, true);
            m72.f.b(3504, 0, eVar.N, "Orange40", "GdsColors.palette.Orange40", o0VarE, true);
            m72.f.b(3504, 0, eVar.O, "Orange50", "GdsColors.palette.Orange50", o0VarE, true);
            m72.f.b(3504, 0, eVar.P, "Orange60", "GdsColors.palette.Orange60", o0VarE, true);
            m72.f.b(3504, 0, eVar.Q, "Orange70", "GdsColors.palette.Orange70", o0VarE, true);
            m72.f.b(3504, 0, eVar.R, "Purple10", "GdsColors.palette.Purple10", o0VarE, true);
            m72.f.b(3504, 0, eVar.S, "Purple20", "GdsColors.palette.Purple20", o0VarE, true);
            m72.f.b(3504, 0, eVar.T, "Purple30", "GdsColors.palette.Purple30", o0VarE, true);
            m72.f.b(3504, 0, eVar.U, "Purple40", "GdsColors.palette.Purple40", o0VarE, true);
            m72.f.b(3504, 0, eVar.V, "Purple50", "GdsColors.palette.Purple50", o0VarE, true);
            m72.f.b(3504, 0, eVar.W, "Purple60", "GdsColors.palette.Purple60", o0VarE, true);
            m72.f.b(3504, 0, eVar.X, "Purple70", "GdsColors.palette.Purple70", o0VarE, true);
            m72.f.b(3504, 0, eVar.Y, "Red10", "GdsColors.palette.Red10", o0VarE, true);
            m72.f.b(3504, 0, eVar.Z, "Red20", "GdsColors.palette.Red20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77770a0, "Red30", "GdsColors.palette.Red30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77772b0, "Red40", "GdsColors.palette.Red40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77774c0, "Red50", "GdsColors.palette.Red50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77776d0, "Red60", "GdsColors.palette.Red60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77778e0, "Red70", "GdsColors.palette.Red70", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77780f0, "Teal10", "GdsColors.palette.Teal10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77782g0, "Teal20", "GdsColors.palette.Teal20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77784h0, "Teal30", "GdsColors.palette.Teal30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77786i0, "Teal40", "GdsColors.palette.Teal40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77788j0, "Teal50", "GdsColors.palette.Teal50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77790k0, "Teal60", "GdsColors.palette.Teal60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77792l0, "Teal70", "GdsColors.palette.Teal70", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77794m0, "Violet10", "GdsColors.palette.Violet10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77796n0, "Violet20", "GdsColors.palette.Violet20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77798o0, "Violet30", "GdsColors.palette.Violet30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77800p0, "Violet40", "GdsColors.palette.Violet40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77802q0, "Violet50", "GdsColors.palette.Violet50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77804r0, "Violet60", "GdsColors.palette.Violet60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77806s0, "Violet70", "GdsColors.palette.Violet70", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77808t0, "Yellow10", "GdsColors.palette.Yellow10", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77810u0, "Yellow20", "GdsColors.palette.Yellow20", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77812v0, "Yellow30", "GdsColors.palette.Yellow30", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77814w0, "Yellow40", "GdsColors.palette.Yellow40", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77816x0, "Yellow50", "GdsColors.palette.Yellow50", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77818y0, "Yellow60", "GdsColors.palette.Yellow60", o0VarE, true);
            m72.f.b(3504, 0, eVar.f77820z0, "Yellow70", "GdsColors.palette.Yellow70", o0VarE, true);
            m72.f.b(3504, 0, eVar.A0, "Yellow80", "GdsColors.palette.Yellow80", o0VarE, true);
            m72.f.b(3504, 0, eVar.B0, "Yellow90", "GdsColors.palette.Yellow90", o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n32.a(i14, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1589732938);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            m72.f.c("Type", o0VarE, 6);
            m72.f.b(3456, 2, e0.d(d92.b.f58623a, o0VarE), "Default", "Gds.colors.text.default", o0VarE, false);
            m72.f.b(3456, 2, vb.h.g(o0VarE), "Secondary", "Gds.colors.text.secondary", o0VarE, false);
            m72.f.b(3456, 2, hb.a.e(o0VarE), "Action", "Gds.colors.text.action", o0VarE, false);
            m72.f.b(3504, 0, d92.b.a(o0VarE).k().f63527d, "Always White", "Gds.colors.text.alwaysWhite", o0VarE, true);
            m72.f.b(3456, 2, d92.b.a(o0VarE).k().f63528e, "Always Black", "Gds.colors.text.alwaysBlack", o0VarE, false);
            m72.f.b(3504, 0, d92.b.a(o0VarE).k().c(), "On Primary", "Gds.colors.text.onPrimary", o0VarE, true);
            m72.f.b(3456, 2, d92.b.a(o0VarE).k().e(), "Text Warning", "Gds.colors.text.warning", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).k().f63530g.getF182175a()).f128833a, "Text Success", "Gds.colors.text.success", o0VarE, false);
            m72.f.c("Background", o0VarE, 6);
            m72.f.b(3504, 0, d92.b.a(o0VarE).c().b(), "Background Default", "Gds.colors.backgrounds.default", o0VarE, true);
            m72.f.b(3504, 0, e0.f(o0VarE), "Background Hero", "Gds.colors.backgrounds.hero", o0VarE, true);
            m72.f.b(3504, 0, v.h.t(o0VarE), "Background Card", "Gds.colors.backgrounds.card", o0VarE, true);
            m72.f.b(3504, 0, p6.b.b(o0VarE), "Surface1", " Gds.colors.backgrounds.surface1", o0VarE, true);
            m72.f.b(3504, 0, e0.w(o0VarE), "Surface2", "Gds.colors.backgrounds.surface2", o0VarE, true);
            m72.f.b(3504, 0, d92.b.a(o0VarE).c().g(), "Surface3", "Gds.colors.backgrounds.surface3", o0VarE, true);
            m72.f.b(3504, 0, ((o4.d0) d92.b.a(o0VarE).c().f63494g.getF182175a()).f128833a, "Void", "Gds.colors.backgrounds.void", o0VarE, true);
            m72.f.b(3504, 0, d92.b.a(o0VarE).c().d(), "Scrim", "Gds.colors.backgrounds.scrim", o0VarE, true);
            m72.f.c("Button Fill", o0VarE, 6);
            m72.f.b(3456, 2, d92.b.a(o0VarE).d().a().a(), "Primary", "Gds.colors.button.fill.primary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76480b.getF182175a()).f128833a, "Primary Hover", "Gds.colors.button.fill.primaryHover", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76481c.getF182175a()).f128833a, "Primary Press", "Gds.colors.button.fill.primaryPress", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).d().a().b(), "Secondary", "Gds.colors.button.fill.secondary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76486h.getF182175a()).f128833a, "Secondary Hover", "Gds.colors.button.fill.secondaryHover", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76487i.getF182175a()).f128833a, "Secondary Press", "Gds.colors.button.fill.secondaryPress", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76488j.getF182175a()).f128833a, "Tertiary", "Gds.colors.button.fill.tertiary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76489k.getF182175a()).f128833a, "Tertiary Press", "Gds.colors.button.fill.tertiaryPress", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).d().a().c(), HttpHeaders.WARNING, "Gds.colors.button.fill.warning", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76491m.getF182175a()).f128833a, "Warning Hover", "Gds.colors.button.fill.warningHover", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76492n.getF182175a()).f128833a, "Warning Press", "Gds.colors.button.fill.warningPress", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76493o.getF182175a()).f128833a, "Warning Tertiary", "Gds.colors.button.fill.warningTertiary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76494p.getF182175a()).f128833a, "Warning Tertiary Press", "Gds.colors.button.fill.warningTertiaryPress", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().a().f76495q.getF182175a()).f128833a, "Success", "Gds.colors.button.fill.success", o0VarE, false);
            m72.f.c("Button Stroke", o0VarE, 6);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().b().f76497a.getF182175a()).f128833a, "Primary", "Gds.colors.button.stroke.primary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().b().f76498b.getF182175a()).f128833a, "Secondary", "Gds.colors.button.stroke.secondary", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).d().b().f76499c.getF182175a()).f128833a, "Focus", "Gds.colors.button.stroke.focus", o0VarE, false);
            m72.f.c("Icons", o0VarE, 6);
            m72.f.b(3456, 2, d92.b.a(o0VarE).f().b(), "Default", "Gds.colors.icon.default", o0VarE, false);
            m72.f.b(3456, 2, sn.a.y(o0VarE), "Secondary", "Gds.colors.icon.secondary", o0VarE, false);
            m72.f.b(3504, 0, d92.b.a(o0VarE).f().f63508c, "Always-White", "Gds.colors.icon.alwaysWhite", o0VarE, true);
            m72.f.b(3456, 2, d92.b.a(o0VarE).f().f63509d, "Always-Black", "Gds.colors.icon.alwaysBlack", o0VarE, false);
            m72.f.b(3504, 0, d92.b.a(o0VarE).f().c(), "On Primary", "Gds.colors.icon.onPrimary", o0VarE, true);
            m72.f.b(3456, 2, hb.a.s(o0VarE), "Action", "Gds.colors.icon.action", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).f().e(), "Success", "Gds.colors.icon.success", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).f().f(), HttpHeaders.WARNING, "Gds.colors.icon.warning", o0VarE, false);
            m72.f.c("Stroke", o0VarE, 6);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().e(), "Selected", "Gds.colors.stroke.selected", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().d(), "Secondary", "Gds.colors.stroke.secondary", o0VarE, false);
            m72.f.b(3456, 2, sn.a.c(o0VarE), "Divider", "Gds.colors.stroke.divider", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().b(), "Container", "Gds.colors.stroke.container", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().a(), "Action", "Gds.colors.stroke.action", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().f(), "Success", "Gds.colors.stroke.success", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).j().g(), HttpHeaders.WARNING, "Gds.colors.stroke.warning", o0VarE, false);
            m72.f.c("Fill", o0VarE, 6);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().e(), "Fill Primary", "Gds.colors.fill.primary", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().f(), "Fill Secondary", "Gds.colors.fill.secondary", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().g(), "Fill Subtle", "Gds.colors.fill.subtle", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().f63499d, "Always White", "Gds.colors.fill.alwaysWhite", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().f63500e, "Always Black", "Gds.colors.fill.alwaysBlack", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).e().f63501f.getF182175a()).f128833a, "Fill Success", "Gds.colors.fill.success", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().h(), "Fill Warning", "Gds.colors.fill.warning", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().c(), "Fill Info", "Gds.colors.fill.info", o0VarE, false);
            m72.f.b(3456, 2, d92.b.a(o0VarE).e().b(), "Fill Caution", "Gds.colors.fill.caution", o0VarE, false);
            m72.f.b(3504, 0, d92.b.a(o0VarE).e().d(), "Fill Overlay", "Gds.colors.fill.overlay", o0VarE, true);
            m72.f.c("Inverse", o0VarE, 6);
            m72.f.b(3456, 2, d92.b.a(o0VarE).h().a(), "Inverse Default", "Gds.colors.inverse.inverse.default", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).h().f63515b.getF182175a()).f128833a, "Inverse Action", "Gds.colors.inverse.inverse.action", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).h().f63516c.getF182175a()).f128833a, "Inverse Surface2", "Gds.colors.inverse.inverse.surface2", o0VarE, false);
            m72.f.c("Switch/Toggle", o0VarE, 6);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).l().f63540i.getF182175a()).f128833a, "Switch/Toggle on background", "Gds.colors.toggle.toggleTrackOn", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).l().f63538g.getF182175a()).f128833a, "Switch/Toggle on circle", "Gds.colors.toggle.toggleThumbOn", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).l().f63541j.getF182175a()).f128833a, "Switch/Toggle off background", "Gds.colors.toggle.toggleTrackOff", o0VarE, false);
            m72.f.b(3456, 2, ((o4.d0) d92.b.a(o0VarE).l().f63539h.getF182175a()).f128833a, "Switch/Toggle off circle", "Gds.colors.toggle.toggleThumbOff", o0VarE, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n32.a(i14, 27);
        }
    }

    public static e2 h() {
        return new e2(null);
    }

    public static final boolean i(p5.q qVar) {
        t0<p5.j0<?>, Object> t0Var = qVar.f136085a;
        p5.d0.f135959a.getClass();
        return t0Var.a(p5.d0.f135977s);
    }

    public static o53.j0 j(b0 b0Var, g gVar, d0 d0Var, e23.p pVar, int i14) {
        if ((i14 & 1) != 0) {
            gVar = t13.h.f161748a;
        }
        if ((i14 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        g gVarB = o53.y.b(b0Var, gVar);
        d0Var.getClass();
        o53.j0 r1Var = d0Var == d0.LAZY ? new o53.r1(gVarB, pVar) : new o53.j0(gVarB, true);
        r1Var.v0(d0Var, r1Var, pVar);
        return r1Var;
    }

    public static final Double k(Double d14) {
        if (d14 == null) {
            return null;
        }
        double d15 = 2;
        return Double.valueOf(Math.ceil(d14.doubleValue() * d15) / d15);
    }

    public static final byte l(char c14) {
        if (c14 < '~') {
            return o63.f.f129851c[c14];
        }
        return (byte) 0;
    }

    public static k33.i m(k33.i iVar, t23.g gVar, o33.f fVar, int i14) {
        if ((i14 & 2) != 0) {
            fVar = null;
        }
        return new k33.i(iVar.f102785a, fVar != null ? new k33.k(iVar, gVar, fVar, 0) : iVar.f102786b, o13.m.a(o13.n.NONE, new k33.a(iVar, gVar)));
    }

    public static final int n(ud.c cVar, String str) {
        cVar.getClass();
        int iO = o(cVar, str);
        if (iO >= 0) {
            return iO;
        }
        int iO2 = o(cVar, "`" + str + '`');
        if (iO2 >= 0) {
            return iO2;
        }
        return -1;
    }

    public static final int o(ud.c cVar, String str) {
        cVar.getClass();
        if (cVar instanceof md.k) {
            Integer num = (Integer) ((md.k) cVar).f117867c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        for (int i14 = 0; i14 < columnCount; i14++) {
            if (str.equals(cVar.getColumnName(i14))) {
                return i14;
            }
        }
        return -1;
    }

    public static final kt1.b p(qs1.b bVar, pi0.e eVar, Boolean bool) {
        String strA;
        bVar.getClass();
        eVar.getClass();
        Long lG = bVar.getImageId();
        long jLongValue = lG != null ? lG.longValue() : -1L;
        String imageUrl = bVar.getImageUrl();
        String strH = bVar.getImageMediumUrl();
        if (strH == null && (strH = bVar.getImageThumbnailUrl()) == null) {
            strH = bVar.getImageUrl();
        }
        Long lJ = bVar.getImageTimestamp();
        long jLongValue2 = lJ != null ? lJ.longValue() : 0L;
        Long lJ2 = bVar.getImageTimestamp();
        if ((lJ2 != null ? lJ2.longValue() : 0L) > 0) {
            Long lJ3 = bVar.getImageTimestamp();
            strA = eVar.a(new DateTime(lJ3 != null ? lJ3.longValue() : 0L), qi0.a.YEAR_ABBREV_MONTH_DAY);
        } else {
            strA = "";
        }
        String str = strA;
        Integer numF = bVar.getImageHelpfulCount();
        int iIntValue = numF != null ? numF.intValue() : 0;
        Integer numB = bVar.getDisplayOrder();
        return new kt1.b(jLongValue, imageUrl, strH, jLongValue2, str, iIntValue, numB != null ? numB.intValue() : 0, bVar.getHidden(), bool != null ? bool.booleanValue() : bVar.getRequesterOwned());
    }

    public static final k33.i q(k33.i iVar, u23.h hVar) {
        iVar.getClass();
        hVar.getClass();
        return hVar.isEmpty() ? iVar : new k33.i(iVar.f102785a, iVar.f102786b, o13.m.a(o13.n.NONE, new k33.b(iVar, hVar)));
    }

    public static final String r(StandardIntegrityException standardIntegrityException) {
        int errorCode = standardIntegrityException.getErrorCode();
        if (errorCode == -100) {
            return "INTERNAL_ERROR";
        }
        if (errorCode == -12) {
            return "GOOGLE_SERVER_UNAVAILABLE";
        }
        if (errorCode == -3) {
            return "NETWORK_ERROR";
        }
        if (errorCode == -2) {
            return "PLAY_STORE_NOT_FOUND";
        }
        if (errorCode == -1) {
            return "API_NOT_AVAILABLE";
        }
        if (errorCode == 0) {
            return "NO_ERROR";
        }
        switch (errorCode) {
            case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                return "INTEGRITY_TOKEN_PROVIDER_INVALID";
            case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                return "CLIENT_TRANSIENT_ERROR";
            case -17:
                return "REQUEST_HASH_TOO_LONG";
            case -16:
                return "CLOUD_PROJECT_NUMBER_IS_INVALID";
            case -15:
                return "PLAY_SERVICES_VERSION_OUTDATED";
            case -14:
                return "PLAY_STORE_VERSION_OUTDATED";
            default:
                switch (errorCode) {
                    case -9:
                        return "CANNOT_BIND_TO_SERVICE";
                    case -8:
                        return "TOO_MANY_REQUESTS";
                    case -7:
                        return "APP_UID_MISMATCH";
                    case -6:
                        return "PLAY_SERVICES_NOT_FOUND";
                    case -5:
                        return "APP_NOT_INSTALLED";
                    default:
                        return v.e0.f(standardIntegrityException.getErrorCode(), "UNKNOWN (", ")");
                }
        }
    }

    public static final ArrayList s(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (((l20.c) obj).G()) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }

    public static final ArrayList t(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Q((l20.a) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.emoji2.text.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final int u(int i14, String str) {
        ?? r14;
        ?? r15;
        int spanEnd;
        d dVarG = G();
        Integer num = null;
        if (dVarG != null) {
            ?? r16 = dVarG.f7036e.f7041b;
            r16.getClass();
            if (i14 < 0 || i14 >= str.length()) {
                r15 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                a8.g[] gVarArr = (a8.g[]) spanned.getSpans(i14, i14 + 1, a8.g.class);
                if (gVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(gVarArr[0]);
                    r15 = str;
                } else {
                    ?? r17 = str;
                    spanEnd = ((androidx.emoji2.text.f.c) r16.c(r17, Math.max(0, i14 - 16), Math.min(str.length(), i14 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.f.c(i14))).f7060c;
                    r15 = r17;
                }
            } else {
                ?? r18 = str;
                spanEnd = ((androidx.emoji2.text.f.c) r16.c(r18, Math.max(0, i14 - 16), Math.min(str.length(), i14 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.f.c(i14))).f7060c;
                r15 = r18;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r14 = r15;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r14 = str;
        }
        if (num != null) {
            r14 = r15;
            return num.intValue();
        }
        r14 = r15;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r14);
        return characterInstance.following(i14);
    }

    public static final int v(int i14, String str) {
        d dVarG = G();
        Integer num = null;
        if (dVarG != null) {
            Integer numValueOf = Integer.valueOf(dVarG.b(Math.max(0, i14 - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i14);
    }

    public static final Double w(Double d14) {
        if (d14 == null) {
            return null;
        }
        double d15 = 2;
        return Double.valueOf(Math.floor(d14.doubleValue() * d15) / d15);
    }

    public static final mr.b x(x0 x0Var) {
        mr.m mVar;
        String str;
        mr.d j0Var;
        os.a iVar;
        String str2 = x0Var != null ? x0Var.f4358a : null;
        z0 z0Var = z0.f4390a;
        x0 x0Var2 = x0.D;
        if (z0.b(x0Var2, str2)) {
            String str3 = x0Var != null ? x0Var.f4358a : null;
            mVar = new mr.m(z0.b(x0Var2, str3) && !z0.M(str3), z0.b(x0.f4296k0, x0Var != null ? x0Var.f4358a : null));
        } else {
            mVar = null;
        }
        if (x0Var == null || (str = x0Var.f4358a) == null) {
            str = "";
        }
        if (z0.b(x0.O0, str)) {
            j0Var = new mr.k0();
        } else if (z0.b(x0.D2, str)) {
            j0Var = new mr.t0();
        } else if (z0.b(x0.R0, str)) {
            j0Var = new mr.n();
        } else if (z0.x(str)) {
            j0Var = new mr.o();
        } else if (z0.b(x0.f4308n, str)) {
            j0Var = new n0();
        } else if (z0.b(x0.f4312o, str)) {
            j0Var = new mr.g();
        } else if (z0.P(str)) {
            j0Var = new m0();
        } else if (z0.b0(str)) {
            j0Var = new mr.o0();
        } else if (z0.d0(str)) {
            j0Var = new u0();
        } else if (z0.X(str)) {
            j0Var = new mr.q0();
        } else if (z0.t(str) || z0.b(x0.A3, str) || z0.b(x0.f4357z3, str)) {
            j0Var = new mr.j0();
        } else if (z0.b(x0.f4352y2, str)) {
            j0Var = new mr.h0();
        } else if (z0.b(x0.E2, str) || z0.a0(str) || z0.o(str)) {
            j0Var = new mr.k();
        } else if (z0.v(str)) {
            j0Var = new mr.f();
        } else if (z0.b(x0.f4297k1, str) || z0.b(x0.f4301l1, str)) {
            j0Var = new i0();
        } else if (z0.J(str) || z0.L(str) || tq.k.j(x0Var)) {
            j0Var = new mr.p0();
        } else {
            z0 z0Var2 = z0.f4390a;
            j0Var = (xy2.b.C(z0Var2, str) || xy2.b.B(z0Var2, str)) ? new mr.l0() : new mr.k();
        }
        mr.i iVar2 = new mr.i();
        String str4 = x0Var != null ? x0Var.f4358a : null;
        if (z0.H(str4)) {
            iVar = new os.g();
        } else if (z0.b(x0.f4312o, str4)) {
            iVar = new os.d();
        } else if (z0.b(x0Var2, str4)) {
            iVar = new os.f();
        } else if (z0.R(str4)) {
            iVar = new os.h();
        } else if (z0.O(str4)) {
            iVar = new os.c();
        } else {
            iVar = tq.k.j(x0Var) ? new os.i() : new os.e();
        }
        return new mr.b(mVar, j0Var, iVar2, iVar, new mr.h());
    }

    public static final String y(f5.y0 y0Var) {
        String string;
        Object objB = g0.b(y0Var);
        if (objB == null) {
            objB = i.B(y0Var);
        }
        return (objB == null || (string = objB.toString()) == null) ? BuildConfig.TRAVIS : string;
    }

    public static final k23.d z(k63.e eVar) {
        eVar.getClass();
        if (eVar instanceof k63.b) {
            return ((k63.b) eVar).f103220b;
        }
        if (eVar instanceof m63.t1) {
            return z(((m63.t1) eVar).f117018a);
        }
        return null;
    }
}
