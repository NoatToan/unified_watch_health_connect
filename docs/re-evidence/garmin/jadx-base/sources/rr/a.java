package rr;

import am.v1;
import am.z0;
import android.content.Context;
import c22.b2;
import c22.l3;
import c22.m3;
import c22.q3;
import c22.u;
import c22.v;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.e0;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import com.garmin.android.apps.connectmobile.activities.newmodel.k0;
import com.garmin.android.apps.connectmobile.activities.newmodel.l0;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.data.Entry;
import e23.l;
import i3.e5;
import im.a0;
import im.b0;
import im.n;
import im.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import lc.u0;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.p0;
import p13.q0;
import p13.x;
import p13.y;
import ps.c0;
import ps.d0;
import ps.i1;
import ps.o;
import ps.o0;
import ps.o1;
import ps.p;
import ps.q1;
import ps.r;
import ps.r1;
import ps.w0;
import ps.x0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrr/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f154138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f154139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityDetailChartDTO f154140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f154141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<c0> f154142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<r1> f154143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<r1> f154144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<r1> f154145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Double f154146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f154147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> f154148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f154149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<w0> f154150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l0 f154151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f154152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i1 f154153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f154154r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f154156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f154157c;

        static {
            int[] iArr = new int[fz.c.values().length];
            try {
                iArr[fz.c.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fz.c.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f154155a = iArr;
            int[] iArr2 = new int[e0.values().length];
            try {
                iArr2[e0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e0.STATUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[e0.NAUTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[e0.AVIATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f154156b = iArr2;
            int[] iArr3 = new int[n.values().length];
            try {
                iArr3[n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f154157c = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e22.d, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f154158a;

        public c(l lVar) {
            lVar.getClass();
            this.f154158a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof e22.d) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f154158a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // e22.d
        public final /* synthetic */ Object transform(Object obj) {
            return this.f154158a.invoke(obj);
        }
    }

    static {
        new C2919a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f154137a = context;
        this.f154138b = new l22.a(context);
        this.f154139c = fz.c.TIME;
        this.f154154r = m.b(new ro0.g(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    public static ArrayList m0(ArrayList arrayList, ArrayList arrayList2, double d14, boolean z14, double d15) {
        double dDoubleValue;
        if (z14) {
            Iterator it = arrayList.iterator();
            double dDoubleValue2 = 0.0d;
            while (it.hasNext()) {
                x1 x1Var = (x1) it.next();
                Double distance = x1Var.getDistance();
                dDoubleValue2 += distance != null ? distance.doubleValue() : 0.0d;
                x1Var.f140405y1 = Double.valueOf(dDoubleValue2);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList(size);
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            arrayList3.add(Double.valueOf(0.0d));
        }
        Object obj = arrayList.get(0);
        double d16 = d14 / ((double) 1000);
        double dN0 = n0(z14, (x1) obj, d16);
        double dN1 = dN0;
        int i16 = 0;
        for (Object obj2 : arrayList2) {
            int i17 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            double dDoubleValue3 = ((Number) obj2).doubleValue();
            Double duration = ((x1) obj).getDuration();
            if (dDoubleValue3 > dN1 + (duration != null ? duration.doubleValue() : 0.0d) && i16 < arrayList.size() - 1) {
                i16++;
                obj = arrayList.get(i16);
                dN1 = n0(z14, (x1) obj, d16);
            }
            if (z14) {
                if (dDoubleValue3 <= dN1) {
                    Double avgPower = ((x1) obj).getAvgPower();
                    if (avgPower != null) {
                        dDoubleValue = avgPower.doubleValue() / d15;
                    } else {
                        dDoubleValue = 0.0d;
                    }
                } else {
                    Double d17 = (Double) h0.e0(i14 - 1, arrayList3);
                    if (d17 != null) {
                        dDoubleValue = d17.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                }
                arrayList3.set(i14, Double.valueOf(dDoubleValue));
            } else if (dDoubleValue3 >= dN1) {
                Double avgPower2 = ((x1) obj).getAvgPower();
                arrayList3.set(i14, Double.valueOf(avgPower2 != null ? avgPower2.doubleValue() / d15 : 0.0d));
            }
            i14 = i17;
        }
        return arrayList3;
    }

    public static double n0(boolean z14, x1 x1Var, double d14) {
        if (z14) {
            Double d15 = x1Var.f140405y1;
            if (d15 != null) {
                return d15.doubleValue();
            }
            return 0.0d;
        }
        DateTime startDateTime = x1Var.getStartDateTime();
        if (startDateTime != null) {
            return (startDateTime.getMillis() / ((long) 1000)) - d14;
        }
        return 0.0d;
    }

    public static boolean r0(im.b bVar) {
        List<o20.a> list;
        if (bVar == null || (list = bVar.f94122l) == null || list.isEmpty()) {
            return (bVar != null ? bVar.getF113514x1() : null) == fz.c.DISTANCE;
        }
        return true;
    }

    public static boolean s0(lm.c cVar) {
        if (cVar != null) {
            int iD3 = cVar.D3();
            for (int i14 = 0; i14 < iD3; i14++) {
                if (!cVar.P(i14).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final im.b A() {
        if (!q0("directLeftPowerPhasePeakEnd") || !q0("directRightPowerPhasePeakEnd")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        fz.c cVar2 = fz.c.TIME;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 26, "directLeftPowerPhasePeakEnd", cVar == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        activityDetailChartDTO2.getClass();
        fz.c cVar3 = this.f154139c;
        im.b bVarB2 = im.d.b(activityDetailChartDTO2, 0.0d, 0.0d, 26, "directRightPowerPhasePeakEnd", cVar3 == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar3);
        List<o20.a> list = bVarB.f94122l;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVarB2.b((o20.a) it.next());
            }
        }
        bVarB2.f94119j = p0();
        return bVarB2;
    }

    public final im.b B() {
        if (!q0("directLeftPowerPhasePeakStart") || !q0("directRightPowerPhasePeakStart")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        fz.c cVar2 = fz.c.TIME;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 25, "directLeftPowerPhasePeakStart", cVar == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        activityDetailChartDTO2.getClass();
        fz.c cVar3 = this.f154139c;
        im.b bVarB2 = im.d.b(activityDetailChartDTO2, 0.0d, 0.0d, 25, "directRightPowerPhasePeakStart", cVar3 == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar3);
        if (bVarB == null) {
            return null;
        }
        List<o20.a> list = bVarB2.f94122l;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVarB.b((o20.a) it.next());
            }
        }
        bVarB.f94119j = p0();
        return bVarB;
    }

    public final im.b C() {
        if (q0("directPerformanceCondition")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 33, "directPerformanceCondition", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            if (r0(bVarB)) {
                r rVar = this.f154141e;
                if ((rVar != null ? rVar.getSummaryDTO() : null) != null) {
                    bVarB.f94119j = p0();
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b D() {
        Double maxPower;
        Double averagePower;
        if (q0("DIRECTPOWER")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averagePower = summaryDTO.getAveragePower()) == null) ? Double.NaN : averagePower.doubleValue();
            if (summaryDTO != null && (maxPower = summaryDTO.getMaxPower()) != null) {
                dDoubleValue = maxPower.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 5, "DIRECTPOWER", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b E() {
        Double maxPower;
        Double averagePower;
        if (q0("DIRECTPOWER")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = (summaryDTO == null || (averagePower = summaryDTO.getAveragePower()) == null) ? Double.NaN : averagePower.doubleValue();
            double dDoubleValue2 = (summaryDTO == null || (maxPower = summaryDTO.getMaxPower()) == null) ? Double.NaN : maxPower.doubleValue();
            Double d14 = this.f154146j;
            double dDoubleValue3 = d14 != null ? d14.doubleValue() : Double.NaN;
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 61, "DIRECTPOWER", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            if (r0(bVarB) && b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2)) && dDoubleValue3 > 0.0d) {
                bVarB.f94119j = p0();
                bVarB.f94126p = dDoubleValue / dDoubleValue3;
                bVarB.f94127q = dDoubleValue2 / dDoubleValue3;
                return bVarB;
            }
        }
        return null;
    }

    public final im.b F() {
        q1 summaryDTO;
        com.garmin.android.apps.connectmobile.activities.newmodel.o.c cVarE;
        r rVar = this.f154141e;
        if (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (cVarE = ss.l.e(summaryDTO)) == null) {
            return null;
        }
        if (Double.isNaN(cVarE.f29605a) && Double.isNaN(cVarE.f29606b) && Double.isNaN(cVarE.f29611g) && Double.isNaN(cVarE.f29612h) && Double.isNaN(cVarE.f29609e) && Double.isNaN(cVarE.f29610f) && Double.isNaN(cVarE.f29615k) && Double.isNaN(cVarE.f29616l)) {
            return null;
        }
        im.b bVar = new im.b(27);
        bVar.I = cVarE;
        return bVar;
    }

    public final im.b G() {
        if (!q0("directLeftPowerPhaseEnd") || !q0("directRightPowerPhaseEnd")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        fz.c cVar2 = fz.c.TIME;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 23, "directLeftPowerPhaseEnd", cVar == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        activityDetailChartDTO2.getClass();
        fz.c cVar3 = this.f154139c;
        im.b bVarB2 = im.d.b(activityDetailChartDTO2, 0.0d, 0.0d, 23, "directRightPowerPhaseEnd", cVar3 == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar3);
        if (bVarB == null) {
            return null;
        }
        List<o20.a> list = bVarB2.f94122l;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVarB.b((o20.a) it.next());
            }
        }
        bVarB.f94119j = p0();
        return bVarB;
    }

    public final im.b H() {
        q1 summaryDTO;
        if (!q0("directLeftPowerPhaseStart") || !q0("directRightPowerPhaseStart")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        fz.c cVar2 = fz.c.TIME;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 24, "directLeftPowerPhaseStart", cVar == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        activityDetailChartDTO2.getClass();
        fz.c cVar3 = this.f154139c;
        im.b bVarB2 = im.d.b(activityDetailChartDTO2, 0.0d, 0.0d, 24, "directRightPowerPhaseStart", cVar3 == cVar2 ? "SUMDURATION" : "SUMDISTANCE", null, cVar3);
        List<o20.a> list = bVarB2.f94122l;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVarB.b((o20.a) it.next());
            }
        }
        r rVar = this.f154141e;
        if (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || !r0(bVarB) || !b2.a(summaryDTO.getLeftPowerPhaseStart(), summaryDTO.getRightPowerPhaseStart())) {
            return null;
        }
        List<o20.a> list2 = bVarB2.f94122l;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                bVarB.b((o20.a) it3.next());
            }
        }
        bVarB.f94119j = p0();
        return bVarB;
    }

    public final im.b I() {
        double d14;
        double d15;
        double d16;
        p pVar = this.f154147k;
        if (pVar != null) {
            ArrayList arrayList = new ArrayList();
            List<x0> listG = pVar.g();
            if (listG != null) {
                d14 = 0.0d;
                d15 = 0.0d;
                for (x0 x0Var : listG) {
                    double lapIndex = x0Var.getLapIndex();
                    double d17 = 1;
                    double d18 = (((double) 2) * lapIndex) - d17;
                    Double duration = x0Var.getDuration();
                    double dDoubleValue = duration != null ? duration.doubleValue() : Double.NaN;
                    if (lapIndex == -1.0d || Double.isNaN(dDoubleValue)) {
                        d16 = dDoubleValue;
                    } else {
                        double d19 = d18 - d17;
                        d16 = dDoubleValue;
                        arrayList.add(new o20.a(d19, d16));
                        arrayList.add(new o20.a(d18, d16));
                    }
                    d14 = d18;
                    d15 = d16;
                }
            } else {
                d14 = 0.0d;
                d15 = 0.0d;
            }
            arrayList.add(new o20.a(d14 + ((double) 1), d15));
            List<o20.a> listB1 = h0.b1(arrayList);
            if (!listB1.isEmpty()) {
                im.b bVar = new im.b(42);
                bVar.f94119j = "";
                bVar.k(listB1);
                double D = 0.0d;
                for (o20.a aVar : listB1) {
                    D += aVar.C() == 0.0d ? 0.0d : aVar.D();
                }
                bVar.f94126p = D / ((double) listB1.size());
                bVar.s(pVar.g());
                bVar.f94114e = null;
                return bVar;
            }
        }
        return null;
    }

    public final im.b J() {
        Double maxRespirationRate;
        Double minRespirationRate;
        Double averageRespirationRate;
        if (q0("directRespirationRate")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageRespirationRate = summaryDTO.getAverageRespirationRate()) == null) ? Double.NaN : averageRespirationRate.doubleValue();
            double dDoubleValue3 = (summaryDTO == null || (minRespirationRate = summaryDTO.getMinRespirationRate()) == null) ? Double.NaN : minRespirationRate.doubleValue();
            if (summaryDTO != null && (maxRespirationRate = summaryDTO.getMaxRespirationRate()) != null) {
                dDoubleValue = maxRespirationRate.doubleValue();
            }
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                double d14 = dDoubleValue;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 41, "directRespirationRate", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94124n = dDoubleValue3;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b K() {
        if (q0("directRightPlatformCenterOffset")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 22, "directRightPlatformCenterOffset", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            if (r0(bVarB) && summaryDTO != null && b2.a(summaryDTO.getRightPlatformCenterOffset())) {
                Double rightPlatformCenterOffset = summaryDTO.getRightPlatformCenterOffset();
                bVarB.f94126p = rightPlatformCenterOffset != null ? rightPlatformCenterOffset.doubleValue() : Double.NaN;
                bVarB.f94119j = p0();
                return bVarB;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final wm.a L(int i14) {
        am.x0 x0VarH;
        p pVar;
        List<x1> listI;
        r rVar = this.f154141e;
        if (rVar == null || (x0VarH = rVar.h()) == null || (pVar = this.f154147k) == null || (listI = pVar.i()) == null) {
            return null;
        }
        for (Object obj : listI) {
            x1 x1Var = (x1) obj;
            if (qs.x.CLIMB_ACTIVE == x1Var.a2() && v1.e(x0VarH.f4358a, x1Var.getDifficulty()) != null) {
                if (obj != null) {
                    return new wm.a(i14, x0VarH, listI);
                }
                return null;
            }
        }
        obj = null;
        if (obj != null) {
            return new wm.a(i14, x0VarH, listI);
        }
        return null;
    }

    public final im.b M() {
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        double dC = o72.t.C(this.f154140d);
        double dG = o72.t.G(this.f154140d);
        if (q0("DIRECTSPEED") && summaryDTO != null) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            l3.f23124b.getClass();
            double dQ = l3.a.q(dC);
            double dQ2 = l3.a.q(dG);
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, dQ, dQ2, 69, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, u.f23267l, cVar, null, false);
            Double averageSpeed = summaryDTO.getAverageSpeed();
            double dDoubleValue = averageSpeed != null ? averageSpeed.doubleValue() : Double.NaN;
            Double maxSpeed = summaryDTO.getMaxSpeed();
            double dDoubleValue2 = maxSpeed != null ? maxSpeed.doubleValue() : Double.NaN;
            if (r0(bVarA) && b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2))) {
                ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                if (arrayListI != null && !arrayListI.isEmpty()) {
                    bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                }
                bVarA.f94119j = p0();
                bVarA.f94126p = l3.a.q(dDoubleValue);
                bVarA.f94127q = l3.a.q(dDoubleValue2);
                String string = this.f154137a.getString(R.string.common_abbrev_n_meters_no_space_label, "500");
                string.getClass();
                bVarA.f94113d = this.f154138b.a(R.string.string_slash_string_no_second_space_pattern, "", string);
                return bVarA;
            }
        }
        return null;
    }

    public final lm.d N() {
        List<o1> listT;
        ArrayList arrayList;
        List<x1> listI;
        q1 summaryDTO;
        Double distance;
        q1 summaryDTO2;
        Double duration;
        am.x0 x0VarH;
        r rVar = this.f154141e;
        if (rVar != null && (listT = rVar.t()) != null) {
            r rVar2 = this.f154141e;
            if (g8.i.M((rVar2 == null || (x0VarH = rVar2.h()) == null) ? null : x0VarH.f4358a, listT)) {
                List listK = x.k(qs.x.RWD_RUN, qs.x.RWD_WALK, qs.x.RWD_STAND);
                p pVar = this.f154147k;
                if (pVar == null || (listI = pVar.i()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : listI) {
                        x1 x1Var = (x1) obj;
                        int i14 = b.f154155a[this.f154139c.ordinal()];
                        double dDoubleValue = Double.NaN;
                        if (i14 == 1) {
                            Double duration2 = x1Var.getDuration();
                            double dDoubleValue2 = duration2 != null ? duration2.doubleValue() : Double.NaN;
                            r rVar3 = this.f154141e;
                            if (rVar3 != null && (summaryDTO2 = rVar3.getSummaryDTO()) != null && (duration = summaryDTO2.getDuration()) != null) {
                                dDoubleValue = duration.doubleValue();
                            }
                            if (h0.R(listK, x1Var.a2()) && b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue)) && dDoubleValue2 <= dDoubleValue) {
                                arrayList.add(obj);
                            }
                        } else {
                            if (i14 != 2) {
                                u0.r();
                                return null;
                            }
                            Double distance2 = x1Var.getDistance();
                            double dDoubleValue3 = distance2 != null ? distance2.doubleValue() : Double.NaN;
                            r rVar4 = this.f154141e;
                            if (rVar4 != null && (summaryDTO = rVar4.getSummaryDTO()) != null && (distance = summaryDTO.getDistance()) != null) {
                                dDoubleValue = distance.doubleValue();
                            }
                            if (h0.R(listK, x1Var.a2()) && b2.a(Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue)) && dDoubleValue3 <= dDoubleValue) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    new im.u();
                    lm.d dVarB = im.u.b(56, this.f154139c, arrayList, listK);
                    dVarB.F(x.k(2, 2, 2));
                    dVarB.f113500j1 = p0();
                    fz.c cVar = this.f154139c;
                    cVar.getClass();
                    dVarB.f113514x1 = cVar;
                    return dVarB;
                }
            }
        }
        return null;
    }

    public final im.b O() {
        Double maxRunCadence;
        Double averageRunCadence;
        if (q0("DIRECTDOUBLECADENCE")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageRunCadence = summaryDTO.getAverageRunCadence()) == null) ? Double.NaN : averageRunCadence.doubleValue();
            if (summaryDTO != null && (maxRunCadence = summaryDTO.getMaxRunCadence()) != null) {
                dDoubleValue = maxRunCadence.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 11, "DIRECTDOUBLECADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b P() {
        Double maxRunCadence;
        Double averageRunCadence;
        if (q0("directRunCadence")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageRunCadence = summaryDTO.getAverageRunCadence()) == null) ? Double.NaN : averageRunCadence.doubleValue();
            if (summaryDTO != null && (maxRunCadence = summaryDTO.getMaxRunCadence()) != null) {
                dDoubleValue = maxRunCadence.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 44, "directRunCadence", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b Q() {
        c22.t tVar;
        Double maxSpeed;
        Double averageSpeed;
        com.garmin.android.apps.connectmobile.activities.newmodel.p deviceDisplayUnitsDTO;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (q0("DIRECTSPEED")) {
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            r rVar2 = this.f154141e;
            e0 e0VarA = ss.k.a((rVar2 == null || (deviceDisplayUnitsDTO = rVar2.getDeviceDisplayUnitsDTO()) == null) ? null : deviceDisplayUnitsDTO.getSpeedDisplayMeasure());
            int i14 = b.f154156b[e0VarA.ordinal()];
            c22.t tVar2 = u.f23262g;
            if (i14 == 1) {
                tVar = tVar2;
            } else {
                if (i14 != 2) {
                    c22.t tVar3 = u.f23264i;
                    if (i14 == 3 || i14 == 4) {
                        tVar = tVar3;
                    }
                } else {
                    tVar2 = u.f23263h;
                }
                tVar = tVar2;
            }
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 0, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, tVar, cVar, null, false);
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageSpeed = summaryDTO.getAverageSpeed()) == null) ? Double.NaN : averageSpeed.doubleValue();
            if (summaryDTO != null && (maxSpeed = summaryDTO.getMaxSpeed()) != null) {
                dDoubleValue = maxSpeed.doubleValue();
            }
            boolean zA = b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
            if (bVarA != null && r0(bVarA) && summaryDTO != null && zA) {
                l3.f23124b.getClass();
                double dI = zY ? l3.a.i(dDoubleValue2, q3.KILOMETER_PER_HOUR) : l3.a.i(dDoubleValue2, q3.MILE_PER_HOUR);
                l3.f23124b.getClass();
                double dI2 = zY ? l3.a.i(dDoubleValue, q3.KILOMETER_PER_HOUR) : l3.a.i(dDoubleValue, q3.MILE_PER_HOUR);
                bVarA.f94126p = dI;
                bVarA.f94125o = dI2;
                bVarA.f94127q = dI2;
                bVarA.f94113d = e0VarA.name();
                bVarA.f94119j = p0();
                ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                if (arrayListI != null && !arrayListI.isEmpty()) {
                    bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                }
                return bVarA;
            }
        }
        return null;
    }

    public final im.b R() {
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (summaryDTO != null && q0("DIRECTVERTICALSPEED")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 34, "DIRECTVERTICALSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, u.f23273r, cVar, null, false);
            Double averageVerticalSpeed = summaryDTO.getAverageVerticalSpeed();
            double dDoubleValue = averageVerticalSpeed != null ? averageVerticalSpeed.doubleValue() : Double.NaN;
            Double maxVerticalSpeed = summaryDTO.getMaxVerticalSpeed();
            double dDoubleValue2 = maxVerticalSpeed != null ? maxVerticalSpeed.doubleValue() : Double.NaN;
            if (r0(bVarA) && b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2))) {
                l3.f23124b.getClass();
                bVarA.f94126p = l3.a.A(dDoubleValue);
                bVarA.f94127q = l3.a.A(dDoubleValue2);
                bVarA.f94119j = p0();
                Context context = this.f154137a;
                bVarA.f94113d = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_speed), context.getString(R.string.activities_floors_per_minute));
                return bVarA;
            }
        }
        return null;
    }

    public final im.b S(int i14) {
        ArrayList arrayList;
        double dDoubleValue;
        ArrayList arrayListM0;
        List<x1> listI;
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list = this.f154148l;
        ArrayList arrayList2 = null;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            loop0: while (it.hasNext()) {
                List<com.garmin.android.apps.connectmobile.activities.newmodel.h0> listD = ((com.garmin.android.apps.connectmobile.activities.newmodel.j) it.next()).d();
                if (listD != null && !listD.isEmpty()) {
                    Iterator<T> it3 = listD.iterator();
                    while (it3.hasNext()) {
                        if (((com.garmin.android.apps.connectmobile.activities.newmodel.h0) it3.next()).j()) {
                            if (!q0("DIRECTPOWER")) {
                                break loop0;
                            }
                            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                            activityDetailChartDTO.getClass();
                            fz.c cVar = this.f154139c;
                            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, i14, "DIRECTPOWER", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                            p pVar = this.f154147k;
                            if (pVar == null || (listI = pVar.i()) == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj : listI) {
                                    g0.a aVar = g0.f29436c;
                                    String internalType = ((x1) obj).getInternalType();
                                    aVar.getClass();
                                    if (g0.a.b(internalType)) {
                                        arrayList3.add(obj);
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                            ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                            int i15 = 0;
                            if (arrayListI != null && !arrayListI.isEmpty()) {
                                bVarB.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                            }
                            if (i14 == 63) {
                                Double d14 = this.f154146j;
                                if (d14 == null) {
                                    break loop0;
                                }
                                dDoubleValue = d14.doubleValue();
                            } else {
                                dDoubleValue = 1.0d;
                            }
                            double d15 = dDoubleValue;
                            if (arrayList == null || arrayList.isEmpty() || !r0(bVarB)) {
                                break loop0;
                                break loop0;
                                break loop0;
                            }
                            int i16 = b.f154155a[this.f154139c.ordinal()];
                            if (i16 == 1) {
                                List<o20.a> list2 = bVarB.f94122l;
                                list2.getClass();
                                ArrayList arrayList4 = new ArrayList(y.r(list2, 10));
                                Iterator<T> it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    arrayList4.add(Double.valueOf(((o20.a) it4.next()).C()));
                                }
                                arrayListM0 = m0(arrayList, arrayList4, arrayListI != null ? ((Number) arrayListI.get(0)).doubleValue() : 0.0d, false, d15);
                            } else {
                                if (i16 != 2) {
                                    u0.r();
                                    return null;
                                }
                                List<o20.a> list3 = bVarB.f94122l;
                                list3.getClass();
                                ArrayList arrayList5 = new ArrayList(y.r(list3, 10));
                                Iterator<T> it5 = list3.iterator();
                                while (it5.hasNext()) {
                                    arrayList5.add(Double.valueOf(((o20.a) it5.next()).C()));
                                }
                                arrayListM0 = m0(arrayList, arrayList5, arrayListI != null ? ((Number) arrayListI.get(0)).doubleValue() : 0.0d, true, d15);
                            }
                            bVarB.f94118i = this.f154139c;
                            bVarB.f94119j = p0();
                            List<o20.a> list4 = bVarB.f94122l;
                            if (list4 != null) {
                                ArrayList arrayList6 = new ArrayList(y.r(list4, 10));
                                for (Object obj2 : list4) {
                                    int i17 = i15 + 1;
                                    if (i15 < 0) {
                                        x.q();
                                        throw null;
                                    }
                                    arrayList6.add(new o20.a(((o20.a) obj2).C(), ((Number) arrayListM0.get(i15)).doubleValue()));
                                    i15 = i17;
                                }
                                arrayList2 = arrayList6;
                            }
                            bVarB.k(arrayList2);
                            return bVarB;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final lm.c T() throws Throwable {
        lm.c cVarA;
        int i14;
        double d14;
        lm.c cVar;
        q1 summaryDTO;
        Object next;
        zp1.a aVarB;
        o20.a aVar;
        List list;
        List list2;
        am.x0 x0VarH;
        am.x0 x0VarH2;
        r rVar = this.f154141e;
        String str = (rVar == null || (x0VarH2 = rVar.h()) == null) ? null : x0VarH2.f4358a;
        z0 z0Var = z0.f4390a;
        am.x0 x0Var = am.x0.f4308n;
        String str2 = z0.b(x0Var, str) ? "directStaminaIntensitySpeed" : "directStaminaIntensityPower";
        r rVar2 = this.f154141e;
        boolean zB = z0.b(x0Var, (rVar2 == null || (x0VarH = rVar2.h()) == null) ? null : x0VarH.f4358a);
        if ((!q0("directAvailableStamina") && !q0(str2)) || !q0("directPotentialStamina")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        if (activityDetailChartDTO != null) {
            im.u uVar = new im.u();
            fz.c cVar2 = this.f154139c;
            cVarA = uVar.a(activityDetailChartDTO, 54, cVar2, false, cVar2 == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", "directAvailableStamina", str2, "directPotentialStamina");
        } else {
            cVarA = null;
        }
        int i15 = 2;
        if (cVarA != null) {
            LinkedHashMap linkedHashMap = cVarA.f113497g1;
            List<o20.a> listP = cVarA.P(0);
            List<o20.a> listP2 = cVarA.P(1);
            List<o20.a> listP3 = cVarA.P(2);
            List list3 = this.f154145i;
            if (list3 == null) {
                list3 = j0.f134944a;
            }
            if (list3.isEmpty()) {
                i14 = 2;
                cVar = null;
                linkedHashMap.clear();
                cVarA.D(0, listP);
                cVarA.D(1, listP3);
                int f134973e = zp1.a.f206594h.getF134973e();
                int i16 = 0;
                while (i16 < f134973e) {
                    int i17 = i15 + 1;
                    ArrayList arrayList = new ArrayList(y.r(listP, 10));
                    Iterator<T> it = listP.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new o20.a(((o20.a) it.next()).C(), Double.NaN));
                        i17 = i17;
                    }
                    cVarA.D(i15, arrayList);
                    i16++;
                    i15 = i17;
                }
                int f134973e2 = zp1.a.f206594h.getF134973e();
                int i18 = 0;
                while (i18 < f134973e2) {
                    int i19 = i15 + 1;
                    ArrayList arrayList2 = new ArrayList(y.r(listP, 10));
                    Iterator<T> it3 = listP.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new o20.a(((o20.a) it3.next()).C(), Double.NaN));
                    }
                    cVarA.D(i15, arrayList2);
                    i18++;
                    i15 = i19;
                }
                d14 = Double.NaN;
                cVarA.D(i15, listP3);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                cVar = null;
                w13.c cVar3 = zp1.a.f206594h;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                while (bVarN.hasNext()) {
                    linkedHashMap2.put((zp1.a) bVarN.next(), new ArrayList());
                    i15 = i15;
                }
                i14 = i15;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                w13.c cVar4 = zp1.a.f206594h;
                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                while (bVarN2.hasNext()) {
                    linkedHashMap3.put((zp1.a) bVarN2.next(), new ArrayList());
                }
                zp1.a aVar2 = null;
                for (Iterator it4 = listP.iterator(); it4.hasNext(); it4 = it4) {
                    o20.a aVar3 = (o20.a) it4.next();
                    Iterator<T> it5 = listP2.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                    } while (((o20.a) next).C() != aVar3.C());
                    o20.a aVar4 = (o20.a) next;
                    if (aVar4 != null && zB) {
                        zp1.a.C3847a c3847a = zp1.a.f206590d;
                        double D = aVar4.D();
                        c3847a.getClass();
                        aVarB = zp1.a.C3847a.c(list3, D);
                    } else if (aVar4 != null) {
                        zp1.a.C3847a c3847a2 = zp1.a.f206590d;
                        double D2 = aVar4.D();
                        c3847a2.getClass();
                        aVarB = zp1.a.C3847a.b(list3, D2);
                    } else {
                        aVarB = zp1.a.EASY;
                    }
                    w13.c cVar5 = zp1.a.f206594h;
                    p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar5, cVar5);
                    while (bVarN3.hasNext()) {
                        zp1.a aVar5 = (zp1.a) bVarN3.next();
                        List list4 = (List) linkedHashMap2.get(aVar5);
                        p13.c.b bVar = bVarN3;
                        if (list4 != null) {
                            aVar = aVar3;
                            list4.add(new o20.a(aVar.C(), aVar5 == aVarB ? aVar.D() : -10.0d));
                        } else {
                            aVar = aVar3;
                            list3 = list3;
                            linkedHashMap2 = linkedHashMap2;
                        }
                        if (aVarB != aVar2 && aVar5 == aVar2 && (list2 = (List) linkedHashMap3.get(aVar5)) != null) {
                            list2.add(new o20.a(aVar.C(), aVar.D()));
                        }
                        if (aVarB != aVar2 && aVar5 == aVarB && (list = (List) linkedHashMap3.get(aVar5)) != null) {
                            list.add(new o20.a(aVar.C(), Double.NaN));
                        }
                        List list5 = (List) linkedHashMap3.get(aVar5);
                        if (list5 != null) {
                            list5.add(new o20.a(aVar.C(), aVar5 == aVarB ? aVar.D() : Double.NaN));
                        }
                        listP2 = listP2;
                        listP3 = listP3;
                        bVarN3 = bVar;
                        linkedHashMap = linkedHashMap;
                        aVar3 = aVar;
                        list3 = list3;
                        linkedHashMap2 = linkedHashMap2;
                    }
                    aVar2 = aVarB;
                    zB = zB;
                }
                List<o20.a> list6 = listP3;
                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                linkedHashMap.clear();
                ArrayList arrayList3 = new ArrayList(y.r(listP, 10));
                Iterator<T> it6 = listP.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(new o20.a(((o20.a) it6.next()).C(), -10.0d));
                }
                cVarA.D(0, arrayList3);
                cVarA.D(1, list6);
                Iterator it7 = linkedHashMap4.entrySet().iterator();
                int i24 = i14;
                while (it7.hasNext()) {
                    cVarA.D(i24, (List) ((Map.Entry) it7.next()).getValue());
                    i24++;
                }
                Iterator it8 = linkedHashMap3.entrySet().iterator();
                while (it8.hasNext()) {
                    cVarA.D(i24, (List) ((Map.Entry) it8.next()).getValue());
                    i24++;
                }
                cVarA.D(i24, list6);
                d14 = Double.NaN;
            }
        } else {
            i14 = 2;
            d14 = Double.NaN;
            cVar = null;
            cVarA = null;
        }
        r rVar3 = this.f154141e;
        if (rVar3 == null || (summaryDTO = rVar3.getSummaryDTO()) == null || !s0(cVarA) || cVarA == null) {
            return cVar;
        }
        Double staminaPotentialStart = summaryDTO.getStaminaPotentialStart();
        cVarA.f113510t1 = staminaPotentialStart != null ? staminaPotentialStart.doubleValue() : d14;
        Double staminaPotentialEnd = summaryDTO.getStaminaPotentialEnd();
        cVarA.f113509s1 = staminaPotentialEnd != null ? staminaPotentialEnd.doubleValue() : d14;
        List<r1> list7 = this.f154145i;
        if (list7 == null) {
            list7 = j0.f134944a;
        }
        cVarA.z(list7);
        int f134973e3 = (zp1.a.f206594h.getF134973e() * 2) + 3;
        ArrayList arrayList4 = new ArrayList(f134973e3);
        for (int iD = 0; iD < f134973e3; iD = e5.d(i14, iD, arrayList4, 1)) {
        }
        cVarA.F(arrayList4);
        cVarA.f113500j1 = p0();
        return cVarA;
    }

    public final im.b U() {
        Double averageStress;
        Double d14;
        Double endStress;
        Double startStress;
        if (q0("directCurrentStress")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = (summaryDTO == null || (startStress = summaryDTO.getStartStress()) == null) ? Double.NaN : startStress.doubleValue();
            double dDoubleValue2 = (summaryDTO == null || (endStress = summaryDTO.getEndStress()) == null) ? Double.NaN : endStress.doubleValue();
            if (b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                String str = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 43, "directCurrentStress", str, null, u.f23274s, cVar, null, false);
                ArrayList<o20.a> arrayList = bVarA != null ? new ArrayList(bVarA.f94122l) : new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                for (o20.a aVar : arrayList) {
                    if (Double.isNaN(aVar.D())) {
                        aVar.G(-1.0d);
                    }
                    while (true) {
                        double d15 = i14;
                        if (d15 < aVar.C()) {
                            arrayList2.add(new o20.a(d15, -1.0d));
                            i14++;
                            dDoubleValue = dDoubleValue;
                        }
                    }
                    arrayList2.add(aVar);
                    i14++;
                }
                double d16 = dDoubleValue;
                ArrayList arrayListI = o72.t.I(activityDetailChartDTO, str);
                if (arrayListI != null && !arrayListI.isEmpty() && (d14 = (Double) am.j.f(1, arrayListI)) != null && !d14.isNaN()) {
                    while (true) {
                        double d17 = i14;
                        if (d17 > d14.doubleValue()) {
                            break;
                        }
                        arrayList2.add(new o20.a(d17, -1.0d));
                        i14++;
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (!r0(bVarA)) {
                    return null;
                }
                bVarA.f94119j = p0();
                l3.a aVar2 = l3.f23124b;
                double dDoubleValue3 = (summaryDTO == null || (averageStress = summaryDTO.getAverageStress()) == null) ? Double.NaN : averageStress.doubleValue();
                aVar2.getClass();
                bVarA.f94126p = Math.round(dDoubleValue3);
                bVarA.f94124n = Math.round(d16);
                bVarA.f94127q = Math.round(dDoubleValue2);
                return bVarA;
            }
        }
        return null;
    }

    public final im.b V(int i14) {
        q1 summaryDTO;
        Double strideLength;
        if (!q0("DIRECTSTRIDELENGTH")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, i14, "DIRECTSTRIDELENGTH", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, u.f23260e, cVar, null, false);
        r rVar = this.f154141e;
        if (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (strideLength = summaryDTO.getStrideLength()) == null) {
            return null;
        }
        double dDoubleValue = strideLength.doubleValue();
        if (!r0(bVarA)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        m3 m3Var = m3.CENTIMETER;
        m3 m3Var2 = m3.METER;
        aVar.getClass();
        bVarA.f94126p = l3.a.g(dDoubleValue, m3Var, m3Var2);
        bVarA.f94119j = p0();
        return bVarA;
    }

    public final im.b W() {
        Double maxStrokeCadence;
        Double averageStrokeCadence;
        if (!q0("DIRECTSTROKECADENCE")) {
            return null;
        }
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        double dDoubleValue = Double.NaN;
        double dDoubleValue2 = (summaryDTO == null || (averageStrokeCadence = summaryDTO.getAverageStrokeCadence()) == null) ? Double.NaN : averageStrokeCadence.doubleValue();
        if (summaryDTO != null && (maxStrokeCadence = summaryDTO.getMaxStrokeCadence()) != null) {
            dDoubleValue = maxStrokeCadence.doubleValue();
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        double d14 = dDoubleValue;
        q1 q1Var = summaryDTO;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 8, "DIRECTSTROKECADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        if (!r0(bVarB) || q1Var == null) {
            return null;
        }
        bVarB.f94119j = p0();
        bVarB.f94126p = dDoubleValue2;
        bVarB.f94127q = d14;
        return bVarB;
    }

    public final im.b X() {
        Double minStrokes;
        Double averageStrokes;
        if (q0("SUMSTROKES")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageStrokes = summaryDTO.getAverageStrokes()) == null) ? Double.NaN : averageStrokes.doubleValue();
            if (summaryDTO != null && (minStrokes = summaryDTO.getMinStrokes()) != null) {
                dDoubleValue = minStrokes.doubleValue();
            }
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 7, "SUMSTROKES", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", u.f23257b, u.f23258c, cVar, null, false);
            if (r0(bVarA) && summaryDTO != null) {
                bVarA.f94119j = p0();
                bVarA.f94126p = dDoubleValue2;
                bVarA.f94127q = dDoubleValue;
                return bVarA;
            }
        }
        return null;
    }

    public final im.b Y() {
        Double maxSwimCadence;
        Double averageSwimCadence;
        if (!q0("DIRECTSWIMCADENCE")) {
            return null;
        }
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        double dDoubleValue = Double.NaN;
        double dDoubleValue2 = (summaryDTO == null || (averageSwimCadence = summaryDTO.getAverageSwimCadence()) == null) ? Double.NaN : averageSwimCadence.doubleValue();
        if (summaryDTO != null && (maxSwimCadence = summaryDTO.getMaxSwimCadence()) != null) {
            dDoubleValue = maxSwimCadence.doubleValue();
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        double d14 = dDoubleValue;
        q1 q1Var = summaryDTO;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 65, "DIRECTSWIMCADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        if (!r0(bVarB) || q1Var == null) {
            return null;
        }
        bVarB.f94119j = p0();
        bVarB.f94126p = dDoubleValue2;
        bVarB.f94127q = d14;
        return bVarB;
    }

    public final im.b Z() {
        Double minSWOLF;
        Double averageSWOLF;
        if (q0("WEIGHTEDMEANSWOLF")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageSWOLF = summaryDTO.getAverageSWOLF()) == null) ? Double.NaN : averageSWOLF.doubleValue();
            if (summaryDTO != null && (minSWOLF = summaryDTO.getMinSWOLF()) != null) {
                dDoubleValue = minSWOLF.doubleValue();
            }
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 10, "WEIGHTEDMEANSWOLF", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", u.f23257b, u.f23258c, cVar, null, false);
            if (r0(bVarA) && summaryDTO != null) {
                bVarA.f94119j = p0();
                bVarA.f94126p = dDoubleValue2;
                bVarA.f94127q = dDoubleValue;
                return bVarA;
            }
        }
        return null;
    }

    public final im.b a() {
        q1 summaryDTO;
        r rVar = this.f154141e;
        if (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) {
            return null;
        }
        Double leftPlatformCenterOffset = summaryDTO.getLeftPlatformCenterOffset();
        double dDoubleValue = leftPlatformCenterOffset != null ? leftPlatformCenterOffset.doubleValue() : Double.NaN;
        Double rightPlatformCenterOffset = summaryDTO.getRightPlatformCenterOffset();
        double dDoubleValue2 = rightPlatformCenterOffset != null ? rightPlatformCenterOffset.doubleValue() : Double.NaN;
        if (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2)) {
            return null;
        }
        im.b bVar = new im.b(29);
        bVar.I = ss.l.d(summaryDTO);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<o20.a>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public final im.c0 a0() {
        List<com.garmin.android.apps.connectmobile.activities.newmodel.j0> listB;
        int i14;
        ?? arrayList;
        ?? arrayList2;
        List<double[]> listG;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.j0> list;
        String name;
        Object next;
        Object next2;
        Integer position;
        k0 k0Var;
        Integer position2;
        k0 k0Var2;
        List<double[]> listF;
        l0 l0Var = this.f154151o;
        if (l0Var != null && (listB = l0Var.b()) != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : listB) {
                com.garmin.android.apps.connectmobile.activities.newmodel.j0 j0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.j0) obj;
                if (j0Var != null && (listF = j0Var.f()) != null && (!listF.isEmpty())) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                rm.b bVar = new rm.b();
                l0 l0Var2 = this.f154151o;
                l0Var2.getClass();
                LinkedHashMap linkedHashMap = bVar.f153506a;
                linkedHashMap.clear();
                List<com.garmin.android.apps.connectmobile.activities.newmodel.j0> listB2 = l0Var2.b();
                int iIntValue = -1;
                int size = listB2 != null ? listB2.size() : -1;
                List<com.garmin.android.apps.connectmobile.activities.newmodel.j0> listB3 = l0Var2.b();
                List<k0> listD = l0Var2.d();
                if (listD != null) {
                    Iterator it = listD.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        k0Var2 = (k0) next;
                    } while (!s.g(k0Var2 != null ? k0Var2.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String() : null, "TIMESTAMP"));
                    k0 k0Var3 = (k0) next;
                    int iIntValue2 = (k0Var3 == null || (position2 = k0Var3.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String()) == null) ? -1 : position2.intValue();
                    Iterator it3 = listD.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        k0Var = (k0) next2;
                    } while (!s.g(k0Var != null ? k0Var.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String() : null, "TANK_PRESSURE"));
                    k0 k0Var4 = (k0) next2;
                    if (k0Var4 != null && (position = k0Var4.getCom.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper.POSITION java.lang.String()) != null) {
                        iIntValue = position.intValue();
                    }
                    i14 = iIntValue;
                    iIntValue = iIntValue2;
                } else {
                    i14 = -1;
                }
                if (listB3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (com.garmin.android.apps.connectmobile.activities.newmodel.j0 j0Var2 : listB3) {
                        List<double[]> listG2 = j0Var2 != null ? j0Var2.g() : null;
                        if (listG2 != null) {
                            arrayList4.add(listG2);
                        }
                    }
                    Iterator it4 = arrayList4.iterator();
                    if (!it4.hasNext()) {
                        org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next3 = it4.next();
                    while (it4.hasNext()) {
                        next3 = h0.C0((List) next3, (List) it4.next());
                    }
                    List list2 = (List) next3;
                    if (list2 != null) {
                        arrayList = new ArrayList(y.r(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(Double.valueOf(((double[]) it5.next())[i14]));
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                Iterable iterable = (Iterable) arrayList;
                bVar.f153507b = h0.N(iterable);
                Double dP0 = h0.p0(iterable);
                bVar.f153508c = dP0 != null ? dP0.doubleValue() : 0.0d;
                Double dU0 = h0.u0(iterable);
                bVar.f153509d = dU0 != null ? dU0.doubleValue() : Double.MAX_VALUE;
                if (listB3 != null && iIntValue >= 0 && i14 >= 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (com.garmin.android.apps.connectmobile.activities.newmodel.j0 j0Var3 : listB3) {
                        List<double[]> listG3 = j0Var3 != null ? j0Var3.g() : null;
                        if (listG3 != null) {
                            arrayList5.add(listG3);
                        }
                    }
                    Iterator it6 = new ArrayList(arrayList5).iterator();
                    if (!it6.hasNext()) {
                        org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next4 = it6.next();
                    while (it6.hasNext()) {
                        next4 = h0.C0((List) next4, (List) it6.next());
                    }
                    Iterable iterable2 = (Iterable) next4;
                    ArrayList arrayList6 = new ArrayList(y.r(iterable2, 10));
                    Iterator it7 = iterable2.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(Long.valueOf((long) ((double[]) it7.next())[iIntValue]));
                    }
                    Long l14 = (Long) h0.t0(arrayList6);
                    long jLongValue = l14 != null ? l14.longValue() : 0L;
                    Long l15 = (Long) h0.o0(arrayList6);
                    long jLongValue2 = l15 != null ? l15.longValue() : 0L;
                    int i15 = 0;
                    while (i15 < size) {
                        com.garmin.android.apps.connectmobile.activities.newmodel.j0 j0Var4 = listB3.get(i15);
                        ArrayList arrayList7 = new ArrayList();
                        if (j0Var4 == null || (listG = j0Var4.g()) == null) {
                            listG = j0.f134944a;
                        }
                        for (double[] dArr : listG) {
                            int i16 = i14;
                            arrayList7.add(new Entry((float) dArr[i16], ((int) (((long) dArr[iIntValue]) - jLongValue)) / 1000));
                            size = size;
                            i14 = i16;
                            iIntValue = iIntValue;
                        }
                        int i17 = i14;
                        int i18 = size;
                        int i19 = iIntValue;
                        if (arrayList7.size() > 2) {
                            Entry entry = (Entry) h0.b0(arrayList7);
                            Entry entry2 = (Entry) h0.m0(arrayList7);
                            if (entry.getXIndex() > 0) {
                                arrayList7.add(0, new Entry(entry.getVal(), 0));
                            }
                            list = listB3;
                            long j8 = jLongValue2 - jLongValue;
                            if (entry2.getXIndex() < j8) {
                                arrayList7.add(new Entry(entry2.getVal(), ((int) (j8 - 1)) / 1000));
                            }
                        } else {
                            list = listB3;
                        }
                        if (j0Var4 == null || (name = j0Var4.getName()) == null) {
                            name = "";
                        }
                        linkedHashMap.put(name, arrayList7);
                        i15++;
                        listB3 = list;
                        iIntValue = i19;
                        size = i18;
                        i14 = i17;
                    }
                }
                im.c0 c0Var = new im.c0(45);
                c0Var.X0 = bVar;
                if (linkedHashMap.isEmpty()) {
                    arrayList2 = j0.f134944a;
                } else {
                    ArrayList arrayList8 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList8.add(new o13.p(entry3.getKey(), entry3.getValue()));
                    }
                    ArrayList arrayList9 = new ArrayList(y.r(arrayList8, 10));
                    Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add((List) ((o13.p) it8.next()).f128595b);
                    }
                    Iterator it9 = arrayList9.iterator();
                    if (!it9.hasNext()) {
                        org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next5 = it9.next();
                    while (it9.hasNext()) {
                        next5 = h0.C0(h0.d1((List) next5), (List) it9.next());
                    }
                    Iterable<Entry> iterable3 = (Iterable) next5;
                    arrayList2 = new ArrayList(y.r(iterable3, 10));
                    for (Entry entry4 : iterable3) {
                        arrayList2.add(new o20.a(entry4.getXIndex(), entry4.getVal()));
                    }
                }
                c0Var.f94122l = arrayList2;
                double d14 = bVar.f153508c;
                c0Var.f94126p = bVar.f153507b;
                c0Var.f94127q = d14;
                c0Var.f94119j = p0();
                return c0Var;
            }
        }
        return null;
    }

    public final im.b b() {
        if (!q0("directCda")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 36, "directCda", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (r0(bVarB) && summaryDTO != null) {
            bVarB.f94119j = p0();
            Double averageCda = summaryDTO.getAverageCda();
            bVarB.f94126p = averageCda != null ? averageCda.doubleValue() : Double.NaN;
        }
        return bVarB;
    }

    public final im.b b0() {
        im.b bVarB;
        if (q0("DIRECTAIRTEMPERATURE")) {
            boolean zC = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c();
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            if (zC) {
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                bVarB = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 6, "DIRECTAIRTEMPERATURE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, u.f23272q, cVar, null, false);
            } else {
                activityDetailChartDTO.getClass();
                fz.c cVar2 = this.f154139c;
                bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 6, "DIRECTAIRTEMPERATURE", cVar2 == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar2);
            }
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            if (r0(bVarB) && summaryDTO != null) {
                Double averageTemperature = summaryDTO.getAverageTemperature();
                double dDoubleValue = averageTemperature != null ? averageTemperature.doubleValue() : Double.NaN;
                Double maxTemperature = summaryDTO.getMaxTemperature();
                double dDoubleValue2 = maxTemperature != null ? maxTemperature.doubleValue() : Double.NaN;
                Double minTemperature = summaryDTO.getMinTemperature();
                double dDoubleValue3 = minTemperature != null ? minTemperature.doubleValue() : Double.NaN;
                if (zC) {
                    l3.f23124b.getClass();
                    dDoubleValue3 = l3.a.d(dDoubleValue3);
                }
                bVarB.u(dDoubleValue3);
                if (zC) {
                    l3.f23124b.getClass();
                    dDoubleValue = l3.a.d(dDoubleValue);
                }
                bVarB.h(dDoubleValue);
                if (zC) {
                    l3.f23124b.getClass();
                    dDoubleValue2 = l3.a.d(dDoubleValue2);
                }
                bVarB.t(dDoubleValue2);
                bVarB.q(p0());
                bVarB.f94113d = this.f154138b.getString(zC ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
                return bVarB;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ed  */
    public final ArrayList c() {
        int iG;
        List<c0> list;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> list2;
        int i14;
        Iterator it;
        Object next;
        im.b bVar;
        double dDoubleValue;
        q1 summaryDTO;
        Double duration;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ActivityDetailChartDTO activityDetailChartDTO = aVar.f154140d;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO != null ? activityDetailChartDTO.G() : null;
        ActivityDetailChartDTO activityDetailChartDTO2 = aVar.f154140d;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO2 != null ? activityDetailChartDTO2.C() : null;
        if (listC != null && !listC.isEmpty() && listG != null && !listG.isEmpty()) {
            String str = aVar.f154139c == fz.c.TIME ? "sumDuration" : "SUMDISTANCE";
            Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.y> it3 = listG.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    iG = -1;
                    break;
                }
                com.garmin.android.apps.connectmobile.activities.newmodel.y next2 = it3.next();
                if (next2 != null && next2.F().equalsIgnoreCase(str)) {
                    iG = next2.G();
                    break;
                }
            }
            if (iG != -1 && (list = aVar.f154142f) != null) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    c0 c0Var = (c0) it4.next();
                    ArrayList<d0> arrayListD = c0Var.d();
                    if (arrayListD != null) {
                        for (d0 d0Var : arrayListD) {
                            if (!d0Var.getIsChartVisible() || d0Var.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == null) {
                                list2 = listG;
                                i14 = iG;
                                it = it4;
                            } else {
                                Iterator<T> it5 = listG.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it5.next();
                                    com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
                                    if (g22.n.d(yVar.C()) && d53.u.q(c0Var.getAppID(), yVar.C(), false)) {
                                        Integer num = d0Var.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                        int iD = yVar.D();
                                        if (num != null && num.intValue() == iD) {
                                            break;
                                        }
                                    }
                                }
                                com.garmin.android.apps.connectmobile.activities.newmodel.y yVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
                                if (yVar2 != null) {
                                    r rVar = aVar.f154141e;
                                    double dDoubleValue2 = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (duration = summaryDTO.getDuration()) == null) ? Double.NaN : duration.doubleValue();
                                    if (b2.a(Double.valueOf(dDoubleValue2))) {
                                        bVar = new im.b(20, d0Var.getPrecision());
                                        bVar.f94121k0 = d0Var.d();
                                        bVar.Z = d0Var.f();
                                        bVar.H0 = d0Var.getPrecision();
                                        String unitLabel = d0Var.getUnitLabel();
                                        if (unitLabel == null) {
                                            unitLabel = "";
                                        }
                                        bVar.f94113d = unitLabel;
                                        bVar.f94112c = d0Var.getChartTitle();
                                        bVar.I0 = dDoubleValue2;
                                        bVar.f94118i = aVar.f154139c;
                                        bVar.f94119j = aVar.p0();
                                        ActivityDetailChartDTO activityDetailChartDTO3 = aVar.f154140d;
                                        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC2 = activityDetailChartDTO3 != null ? activityDetailChartDTO3.C() : null;
                                        double dDoubleValue3 = 0.0d;
                                        if (listC2 == null || listC2.isEmpty()) {
                                            list2 = listG;
                                            i14 = iG;
                                            it = it4;
                                            dDoubleValue = 0.0d;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            int iG2 = yVar2.G();
                                            Iterator<T> it6 = listC2.iterator();
                                            dDoubleValue = 0.0d;
                                            while (it6.hasNext()) {
                                                List<Double> listC3 = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it6.next()).C();
                                                Double d14 = listC3.get(iG);
                                                Double d15 = listC3.get(iG2);
                                                if (b2.a(d14, d15)) {
                                                    if (d15.doubleValue() < dDoubleValue3) {
                                                        dDoubleValue3 = d15.doubleValue();
                                                    }
                                                    if (d15.doubleValue() > dDoubleValue) {
                                                        dDoubleValue = d15.doubleValue();
                                                    }
                                                    d14.getClass();
                                                    arrayList2.add(new o20.a(d14.doubleValue(), d15.doubleValue()));
                                                }
                                                iG = iG;
                                                listG = listG;
                                                it4 = it4;
                                            }
                                            list2 = listG;
                                            i14 = iG;
                                            it = it4;
                                            bVar.f94110a = iG2;
                                            bVar.k(arrayList2);
                                        }
                                        bVar.f94124n = dDoubleValue3;
                                        bVar.f94125o = dDoubleValue;
                                    } else {
                                        list2 = listG;
                                        i14 = iG;
                                        it = it4;
                                        bVar = null;
                                    }
                                    if (bVar != null) {
                                        arrayList.add(bVar);
                                    }
                                } else {
                                    list2 = listG;
                                    i14 = iG;
                                    it = it4;
                                }
                            }
                            aVar = this;
                            iG = i14;
                            listG = list2;
                            it4 = it;
                        }
                    }
                    aVar = this;
                    iG = iG;
                    listG = listG;
                    it4 = it4;
                }
            }
        }
        return arrayList;
    }

    public final im.b c0() {
        Double maxRunCadence;
        Double averageRunCadence;
        if (q0("DIRECTDOUBLECADENCE")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageRunCadence = summaryDTO.getAverageRunCadence()) == null) ? Double.NaN : averageRunCadence.doubleValue();
            if (summaryDTO != null && (maxRunCadence = summaryDTO.getMaxRunCadence()) != null) {
                dDoubleValue = maxRunCadence.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 72, "DIRECTDOUBLECADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    bVarB.f94112c = this.f154138b.getString(R.string.lbl_tempo);
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b d() {
        Double maxBikeCadence;
        Double averageBikeCadence;
        if (q0("DIRECTBIKECADENCE")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageBikeCadence = summaryDTO.getAverageBikeCadence()) == null) ? Double.NaN : averageBikeCadence.doubleValue();
            if (summaryDTO != null && (maxBikeCadence = summaryDTO.getMaxBikeCadence()) != null) {
                dDoubleValue = maxBikeCadence.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 4, "DIRECTBIKECADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                bVarB.getClass();
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94116g = this.f154138b.getString(R.string.lbl_maximum);
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b d0() {
        q1 summaryDTO;
        Double duration;
        List<r1> list = this.f154143g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Double secsInZone = ((r1) it.next()).getSecsInZone();
            if ((secsInZone != null ? secsInZone.doubleValue() : 0.0d) > 0.0d) {
                im.b bVar = new im.b(17);
                List<r1> list2 = this.f154143g;
                if (list2 == null) {
                    list2 = j0.f134944a;
                }
                bVar.z(list2);
                r rVar = this.f154141e;
                bVar.I0 = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (duration = summaryDTO.getDuration()) == null) ? Double.NaN : duration.doubleValue();
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [com.garmin.android.apps.connectmobile.activities.newmodel.o$b] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, java.util.Collection] */
    public final lm.c e() throws Throwable {
        ?? arrayList;
        boolean z14;
        Throwable th3;
        Integer num;
        ArrayList arrayList2;
        Object objPrevious;
        o13.p pVar;
        Object objPrevious2;
        Double d14;
        List<Integer> listK;
        Object objI;
        ?? r14;
        ActivityDetailChartDTO activityDetailChartDTO;
        ArrayList arrayListI;
        Integer num2 = 2;
        if (!q0("riderPosition") || (activityDetailChartDTO = this.f154140d) == null || (arrayListI = o72.t.I(activityDetailChartDTO, "riderPosition")) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList(y.r(arrayListI, 10));
            Iterator it = arrayListI.iterator();
            while (it.hasNext()) {
                double dDoubleValue = ((Number) it.next()).doubleValue();
                qs.r.f147152b.getClass();
                arrayList.add(qs.r.a.a(dDoubleValue));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it3 = iterable.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z14 = false;
                    break;
                }
                if (((qs.r) it3.next()) != null) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        if (!z14 && ((r14 = this.f154149m) == 0 || r14.isEmpty())) {
            return null;
        }
        if (z14) {
            String str = this.f154139c == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
            ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
            if (activityDetailChartDTO2 == null || (objI = o72.t.I(activityDetailChartDTO2, str)) == null) {
                objI = j0.f134944a;
            }
            pVar = new o13.p(objI, arrayList);
            num = num2;
            th3 = null;
        } else {
            ActivityDetailChartDTO activityDetailChartDTO3 = this.f154140d;
            ArrayList arrayListI2 = activityDetailChartDTO3 != null ? o72.t.I(activityDetailChartDTO3, "DIRECTTIMESTAMP") : null;
            ActivityDetailChartDTO activityDetailChartDTO4 = this.f154140d;
            ArrayList arrayListI3 = activityDetailChartDTO4 != null ? o72.t.I(activityDetailChartDTO4, "SUMDISTANCE") : null;
            double dDoubleValue2 = arrayListI3 != null ? ((Number) h0.m0(arrayListI3)).doubleValue() : 0.0d;
            long jD = (arrayListI2 == null || arrayListI2.isEmpty()) ? 0L : MathKt.d(((Number) arrayListI2.get(0)).doubleValue());
            th3 = null;
            ActivityDetailChartDTO activityDetailChartDTO5 = this.f154140d;
            ArrayList arrayListI4 = activityDetailChartDTO5 != null ? o72.t.I(activityDetailChartDTO5, "sumDuration") : null;
            double dDoubleValue3 = (arrayListI4 == null || arrayListI4.isEmpty()) ? 0.0d : ((Number) arrayListI4.get(arrayListI4.size() - 1)).doubleValue();
            Object obj = this.f154149m;
            ?? r15 = obj;
            if (obj == null) {
                r15 = j0.f134944a;
            }
            if (this.f154139c != fz.c.TIME) {
                ActivityDetailChartDTO activityDetailChartDTO6 = this.f154140d;
                ArrayList arrayListI5 = activityDetailChartDTO6 != null ? o72.t.I(activityDetailChartDTO6, "directTimestamp") : null;
                ActivityDetailChartDTO activityDetailChartDTO7 = this.f154140d;
                ArrayList arrayListI6 = activityDetailChartDTO7 != null ? o72.t.I(activityDetailChartDTO7, "SUMDISTANCE") : null;
                if (arrayListI6 != null && !arrayListI6.isEmpty() && arrayListI5 != null && !arrayListI5.isEmpty()) {
                    for (o0 o0Var : r15) {
                        o0Var.f139973e = (Double) arrayListI6.get(u.e(o0Var.f(), arrayListI5));
                        num2 = num2;
                    }
                }
            }
            num = num2;
            new im.u();
            fz.c cVar = this.f154139c;
            r15.getClass();
            cVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : r15) {
                if (((o0) obj2).h()) {
                    arrayList3.add(obj2);
                }
            }
            int i14 = im.u.a.f94183a[cVar.ordinal()];
            if (i14 == 1) {
                j23.o oVar = new j23.o(0L, (long) dDoubleValue3);
                ArrayList arrayList4 = new ArrayList(y.r(oVar, 10));
                Iterator<Long> it4 = oVar.iterator();
                while (((j23.n) it4).f96811c) {
                    long jNextLong = (((q0) it4).nextLong() * 1000) + jD;
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (((o0) objPrevious).f() > jNextLong);
                    o0 o0Var2 = (o0) objPrevious;
                    arrayList4.add(o0Var2 != null ? o0Var2.b() : null);
                }
                arrayList2 = arrayList4;
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                j23.o oVar2 = new j23.o(0L, (long) dDoubleValue2);
                arrayList2 = new ArrayList(y.r(oVar2, 10));
                Iterator<Long> it5 = oVar2.iterator();
                while (((j23.n) it5).f96811c) {
                    long jNextLong2 = ((q0) it5).nextLong();
                    ListIterator listIterator2 = arrayList3.listIterator(arrayList3.size());
                    do {
                        if (!listIterator2.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator2.previous();
                        d14 = ((o0) objPrevious2).f139973e;
                    } while ((d14 != null ? d14.doubleValue() : Double.MAX_VALUE) > jNextLong2);
                    o0 o0Var3 = (o0) objPrevious2;
                    arrayList2.add(o0Var3 != null ? o0Var3.b() : null);
                }
            }
            j23.l lVarI = x.i(arrayList2);
            ArrayList arrayList5 = new ArrayList(y.r(lVarI, 10));
            Iterator<Integer> it6 = lVarI.iterator();
            while (((j23.k) it6).f96801c) {
                arrayList5.add(Double.valueOf(((p0) it6).nextInt()));
            }
            pVar = new o13.p(arrayList5, arrayList2);
        }
        List list = (List) pVar.f128594a;
        List list2 = (List) pVar.f128595b;
        im.u uVar = new im.u();
        fz.c cVar2 = this.f154139c;
        t tVar = this.f154154r;
        n nVar = (n) tVar.getValue();
        list.getClass();
        list2.getClass();
        cVar2.getClass();
        nVar.getClass();
        uVar.f94182a.getClass();
        lm.c cVar3 = new lm.c(28, km.b.a(28, nVar), null, 4, null);
        cVar3.f113514x1 = cVar2;
        cVar3.X = nVar;
        int i15 = 0;
        for (Object obj3 : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw th3;
            }
            qs.r rVar = (qs.r) obj3;
            Double d15 = (Double) h0.e0(i15, list);
            double dDoubleValue4 = d15 != null ? d15.doubleValue() : Double.NaN;
            if (!Double.isNaN(dDoubleValue4)) {
                int i17 = im.u.a.f94184b[nVar.ordinal()];
                if (i17 == 1) {
                    cVar3.C(0, new o20.a(dDoubleValue4, (rVar == null || !(rVar == qs.r.SEATED || rVar == qs.r.TRANSITION_TO_SEATED)) ? Double.NaN : 0.0d));
                    cVar3.C(1, new o20.a(dDoubleValue4, (rVar == null || !(rVar == qs.r.STANDING || rVar == qs.r.TRANSITION_TO_STANDING)) ? Double.NaN : 2.0d));
                } else {
                    if (i17 != 2 && i17 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar3.C(0, new o20.a(dDoubleValue4, (rVar != null && rVar == qs.r.A) || (rVar != null && rVar == qs.r.L) ? 0.0d : Double.NaN));
                    cVar3.C(1, new o20.a(dDoubleValue4, (rVar == null || rVar != qs.r.U) ? Double.NaN : 1.0d));
                    cVar3.C(2, new o20.a(dDoubleValue4, (rVar == null || !(rVar == qs.r.STANDING || rVar == qs.r.TRANSITION_TO_STANDING)) ? Double.NaN : 2.0d));
                }
            }
            i15 = i16;
        }
        int i18 = b.f154157c[((n) tVar.getValue()).ordinal()];
        if (i18 == 1 || i18 == 2) {
            Integer num3 = num;
            listK = x.k(num3, num3, num3);
        } else {
            Integer num4 = num;
            listK = x.k(num4, num4);
        }
        r rVar2 = this.f154141e;
        cVar3.f113507q1 = (rVar2 == null || rVar2.getSummaryDTO() == null) ? th3 : com.garmin.android.apps.connectmobile.activities.newmodel.o.b.f29604a;
        fz.c cVar4 = this.f154139c;
        cVar4.getClass();
        cVar3.f113514x1 = cVar4;
        cVar3.f113500j1 = p0();
        cVar3.F(listK);
        return cVar3;
    }

    public final im.b e0() {
        q1 summaryDTO;
        Double duration;
        List<r1> list = this.f154144h;
        if (list == null || list.isEmpty()) {
            return null;
        }
        im.b bVar = new im.b(18);
        List<r1> list2 = this.f154144h;
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        bVar.y(list2);
        r rVar = this.f154141e;
        bVar.I0 = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (duration = summaryDTO.getDuration()) == null) ? Double.NaN : duration.doubleValue();
        return bVar;
    }

    public final b0 f() {
        p pVar;
        List<x1> listI;
        Double maxPower;
        Double avgPower;
        if (q0("DIRECTPOWER")) {
            r rVar = this.f154141e;
            List<o1> listT = rVar != null ? rVar.t() : null;
            qs.x xVar = qs.x.POWER_GUIDE_SPLIT;
            o1 o1VarC = ss.l.c(listT, xVar);
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (o1VarC == null || (avgPower = o1VarC.getAvgPower()) == null) ? Double.NaN : avgPower.doubleValue();
            if (o1VarC != null && (maxPower = o1VarC.getMaxPower()) != null) {
                dDoubleValue = maxPower.doubleValue();
            }
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue)) && (pVar = this.f154147k) != null && (listI = pVar.i()) != null) {
                im.b bVar = new im.b(57);
                ArrayList arrayList = new ArrayList();
                List<x1> listK = tq.k.k(listI, xVar);
                if (!listK.isEmpty()) {
                    int i14 = b.f154155a[this.f154139c.ordinal()];
                    if (i14 == 1) {
                        long j8 = 0;
                        for (x1 x1Var : listK) {
                            Double avgPower2 = x1Var.getAvgPower();
                            Double duration = x1Var.getDuration();
                            long jRint = (long) Math.rint(duration != null ? duration.doubleValue() : 0.0d);
                            if (avgPower2 != null && jRint > 0) {
                                long j14 = jRint + j8;
                                while (j8 < j14) {
                                    Double d14 = avgPower2;
                                    arrayList.add(new o20.a(j8, d14.doubleValue()));
                                    j8++;
                                    avgPower2 = d14;
                                    j14 = j14;
                                }
                                j8 = j14;
                            }
                        }
                    } else {
                        if (i14 != 2) {
                            u0.r();
                            return null;
                        }
                        long j15 = 0;
                        for (x1 x1Var2 : listK) {
                            Double avgPower3 = x1Var2.getAvgPower();
                            Double distance = x1Var2.getDistance();
                            long jRint2 = (long) Math.rint(distance != null ? distance.doubleValue() : 0.0d);
                            if (avgPower3 != null && jRint2 > 0) {
                                long j16 = jRint2 + j15;
                                while (j15 < j16) {
                                    arrayList.add(new o20.a(j15, avgPower3.doubleValue()));
                                    j15++;
                                    j16 = j16;
                                }
                                j15 = j16;
                            }
                        }
                    }
                }
                bVar.f94118i = this.f154139c;
                bVar.k(arrayList);
                bVar.f94119j = p0();
                bVar.f94126p = dDoubleValue2;
                bVar.f94127q = dDoubleValue;
                bVar.C = o0();
                b0.f94135b1.getClass();
                return b0.a.a(bVar, listI);
            }
        }
        return null;
    }

    public final im.b f0() {
        q1 summaryDTO;
        r rVar = this.f154141e;
        if (rVar != null && (summaryDTO = rVar.getSummaryDTO()) != null) {
            Double aerobicTrainingEffect = summaryDTO.getAerobicTrainingEffect();
            double dDoubleValue = aerobicTrainingEffect != null ? aerobicTrainingEffect.doubleValue() : 0.0d;
            Double anaerobicTrainingEffect = summaryDTO.getAnaerobicTrainingEffect();
            double dDoubleValue2 = anaerobicTrainingEffect != null ? anaerobicTrainingEffect.doubleValue() : 0.0d;
            if (dDoubleValue > 0.0d || dDoubleValue2 > 0.0d) {
                im.b bVar = new im.b(32);
                im.d0.f94138c.getClass();
                Double anaerobicTrainingEffect2 = summaryDTO.getAnaerobicTrainingEffect();
                bVar.f94131w = new im.d0(anaerobicTrainingEffect2 != null ? anaerobicTrainingEffect2.doubleValue() : Double.NaN, summaryDTO.getAnaerobicTrainingEffectMessage());
                Double aerobicTrainingEffect2 = summaryDTO.getAerobicTrainingEffect();
                bVar.f94132x = new im.d0(aerobicTrainingEffect2 != null ? aerobicTrainingEffect2.doubleValue() : Double.NaN, summaryDTO.getAerobicTrainingEffectMessage());
                qs.u.a aVar = qs.u.f147173f;
                String trainingEffectLabel = summaryDTO.getTrainingEffectLabel();
                aVar.getClass();
                bVar.f94133y = qs.u.a.a(trainingEffectLabel) != null ? summaryDTO.getTrainingEffectLabel() : null;
                return bVar;
            }
        }
        return null;
    }

    public final im.b g() {
        q1 summaryDTO;
        boolean z14;
        q1 q1Var;
        double d14;
        ArrayList arrayList;
        List<o0> listF;
        ArrayList arrayList2 = null;
        if (q0("DIRECTDEPTH")) {
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            r rVar = this.f154141e;
            if (rVar != null && (summaryDTO = rVar.getSummaryDTO()) != null) {
                rm.a aVar = new rm.a();
                long jC5 = summaryDTO.c5();
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                p pVar = this.f154147k;
                if (pVar != null && (listF = pVar.f()) != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : listF) {
                        if (((o0) obj).g()) {
                            arrayList2.add(obj);
                        }
                    }
                }
                Float fValueOf = Float.valueOf(Float.MAX_VALUE);
                Float fValueOf2 = Float.valueOf(0.0f);
                aVar.f153487a = new ArrayList();
                aVar.f153488b = new ArrayList();
                aVar.f153489c = new ArrayList();
                aVar.f153490d = new ArrayList();
                aVar.f153491e = new ArrayList();
                aVar.f153492f = new HashMap();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(qs.e.SETPOINT_SWITCH_MANUAL_HIGH.name());
                arrayList3.add(qs.e.SETPOINT_SWITCH_MANUAL_LOW.name());
                arrayList3.add(qs.e.SETPOINT_SWITCH_AUTO_HIGH.name());
                arrayList3.add(qs.e.SETPOINT_SWITCH_AUTO_LOW.name());
                Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.y> it = activityDetailChartDTO.G().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = aVar.f153501o;
                        if (yVar == null || aVar.f153505t == null) {
                            z14 = zY;
                            q1Var = summaryDTO;
                        } else {
                            int iG = yVar.G();
                            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar2 = aVar.f153502p;
                            int iG2 = yVar2 != null ? yVar2.G() : -1;
                            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar3 = aVar.f153503q;
                            int iG3 = yVar3 != null ? yVar3.G() : -1;
                            com.garmin.android.apps.connectmobile.activities.newmodel.y yVar4 = aVar.f153504r;
                            int iG4 = yVar4 != null ? yVar4.G() : -1;
                            int iG5 = aVar.f153505t.G();
                            aVar.f153493g = fValueOf2;
                            aVar.f153495i = fValueOf;
                            aVar.f153494h = fValueOf2;
                            aVar.f153497k = fValueOf;
                            aVar.f153496j = fValueOf2;
                            aVar.f153498l = fValueOf2;
                            aVar.f153499m = fValueOf;
                            double d15 = 0.0d;
                            for (com.garmin.android.apps.connectmobile.activities.newmodel.b bVar : activityDetailChartDTO.C()) {
                                boolean z15 = zY;
                                float fFloatValue = bVar.C().get(iG).floatValue();
                                if (fFloatValue > aVar.f153493g.floatValue()) {
                                    aVar.f153493g = Float.valueOf(fFloatValue);
                                }
                                if (fFloatValue < aVar.f153495i.floatValue()) {
                                    aVar.f153495i = Float.valueOf(fFloatValue);
                                }
                                aVar.f153494h = Float.valueOf(aVar.f153494h.floatValue() + fFloatValue);
                                if (iG2 >= 0) {
                                    arrayList = arrayList2;
                                    double dFloatValue = bVar.C().get(iG2).floatValue();
                                    if (dFloatValue > d15) {
                                        d15 = dFloatValue;
                                    }
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (iG3 >= 0) {
                                    float fFloatValue2 = bVar.C().get(iG3).floatValue();
                                    if (fFloatValue2 != Float.NaN && fFloatValue2 <= aVar.f153497k.floatValue()) {
                                        aVar.f153497k = Float.valueOf(fFloatValue2);
                                    }
                                    if (fFloatValue2 != Float.NaN && fFloatValue2 >= aVar.f153496j.floatValue()) {
                                        aVar.f153496j = Float.valueOf(fFloatValue2);
                                    }
                                }
                                if (iG4 >= 0) {
                                    float fFloatValue3 = bVar.C().get(iG4).floatValue();
                                    if (fFloatValue3 > aVar.f153498l.floatValue()) {
                                        aVar.f153498l = Float.valueOf(fFloatValue3);
                                    }
                                    if (fFloatValue3 < aVar.f153499m.floatValue()) {
                                        aVar.f153499m = Float.valueOf(fFloatValue3);
                                    }
                                }
                                zY = z15;
                                arrayList2 = arrayList;
                            }
                            z14 = zY;
                            ArrayList<o0> arrayList4 = arrayList2;
                            aVar.f153494h = Float.valueOf(aVar.f153494h.floatValue() / activityDetailChartDTO.C().size());
                            double dAbs = Math.abs(aVar.f153496j.floatValue() - aVar.f153497k.floatValue());
                            if (dAbs < 1.0d) {
                                dAbs = 1.0d;
                                d14 = 1.0d;
                            } else {
                                d14 = 1.0d;
                            }
                            double dAbs2 = Math.abs(aVar.f153498l.floatValue() - aVar.f153499m.floatValue());
                            if (dAbs2 < d14) {
                                dAbs2 = d14;
                            }
                            if (arrayList4 != null) {
                                for (o0 o0Var : arrayList4) {
                                    double d16 = dAbs;
                                    String diveAlert = o0Var.getDiveAlert();
                                    long jF = o0Var.f();
                                    if (arrayList3.contains(diveAlert)) {
                                        aVar.f153492f.put(Long.valueOf((jF - jC5) / 1000), diveAlert);
                                    }
                                    summaryDTO = summaryDTO;
                                    dAbs = d16;
                                }
                            }
                            double d17 = dAbs;
                            q1Var = summaryDTO;
                            Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it3 = activityDetailChartDTO.C().iterator();
                            while (it3.hasNext()) {
                                List<Double> listC = it3.next().C();
                                float fFloatValue4 = listC.get(iG).floatValue();
                                int iIntValue = iG2 >= 0 ? listC.get(iG2).intValue() : 0;
                                float fFloatValue5 = iG3 >= 0 ? listC.get(iG3).floatValue() : Float.NaN;
                                int iIntValue2 = listC.get(iG5).intValue();
                                int iIntValue3 = iG4 >= 0 ? listC.get(iG4).intValue() : 0;
                                Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it4 = it3;
                                float fFloatValue6 = aVar.f153493g.floatValue() * 0.9f;
                                if (aVar.f153487a.size() > 0) {
                                    ArrayList arrayList5 = aVar.f153487a;
                                    if (((Entry) arrayList5.get(arrayList5.size() - 1)).getXIndex() != iIntValue2) {
                                    }
                                    it3 = it4;
                                }
                                float f14 = iIntValue2;
                                float f15 = fFloatValue5;
                                aVar.f153487a.add(new rm.c(f14, aVar.f153493g.floatValue() - fFloatValue4, iIntValue2));
                                float fFloatValue7 = aVar.f153493g.floatValue();
                                aVar.f153488b.add(new rm.c(f14, iIntValue == 0 ? fFloatValue7 + 1.5f : fFloatValue7 - iIntValue, iIntValue2));
                                if (!Float.isNaN(f15)) {
                                    int iCompare = Float.compare(aVar.f153496j.floatValue(), aVar.f153497k.floatValue());
                                    Float f16 = aVar.f153497k;
                                    aVar.f153489c.add(new rm.c(f14, (float) (((double) (Math.abs(f15 - (iCompare == 0 ? f16.floatValue() - 0.5f : f16.floatValue())) * fFloatValue6)) / d17), iIntValue2));
                                }
                                if (iG4 >= 0) {
                                    int iCompare2 = Float.compare(aVar.f153498l.floatValue(), aVar.f153499m.floatValue());
                                    Float f17 = aVar.f153499m;
                                    aVar.f153490d.add(new rm.c(f14, (float) (((double) (Math.abs(iIntValue3 - (iCompare2 == 0 ? f17.floatValue() - 0.5f : f17.floatValue())) * fFloatValue6)) / dAbs2), iIntValue2));
                                }
                                it3 = it4;
                            }
                            com.garmin.android.apps.connectmobile.activities.newmodel.b bVar2 = activityDetailChartDTO.C().get(activityDetailChartDTO.C().size() - 1);
                            for (int i14 = 0; i14 <= Math.round(bVar2.C().get(iG5).doubleValue()); i14++) {
                                aVar.f153491e.add(Integer.toString(i14));
                            }
                        }
                        im.b bVar3 = new im.b(35);
                        bVar3.r(aVar);
                        Double averageDepth = q1Var.getAverageDepth();
                        double dDoubleValue = averageDepth != null ? averageDepth.doubleValue() : Double.NaN;
                        if (!z14) {
                            l3.f23124b.getClass();
                            dDoubleValue *= 3.2808399d;
                        }
                        bVar3.f94126p = dDoubleValue;
                        Double maxDepth = q1Var.getMaxDepth();
                        double dDoubleValue2 = maxDepth != null ? maxDepth.doubleValue() : Double.NaN;
                        if (!z14) {
                            l3.f23124b.getClass();
                            dDoubleValue2 *= 3.2808399d;
                        }
                        bVar3.f94127q = dDoubleValue2;
                        bVar3.f94119j = p0();
                        bVar3.f94118i = this.f154139c;
                        return bVar3;
                    }
                    com.garmin.android.apps.connectmobile.activities.newmodel.y next = it.next();
                    String strF = next.F();
                    strF.getClass();
                    switch (strF) {
                        case "directDepth":
                            aVar.f153501o = next;
                            aVar.f153500n = next.H().C().equalsIgnoreCase("meter") ? "m" : "ft";
                            break;
                        case "directHeartRate":
                            aVar.f153503q = next;
                            break;
                        case "directNextStopDepth":
                            aVar.f153502p = next;
                            break;
                        case "sumElapsedDuration":
                            aVar.f153505t = next;
                            break;
                        case "directAirTemperature":
                            aVar.f153504r = next;
                            break;
                    }
                }
            }
        }
        return null;
    }

    public final im.b g0() {
        q1 summaryDTO;
        boolean zQ0 = q0("DIRECTVERTICALOSCILLATION");
        r rVar = this.f154141e;
        Double verticalOscillation = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? null : summaryDTO.getVerticalOscillation();
        if (zQ0 && verticalOscillation != null && b2.a(verticalOscillation)) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 13, "DIRECTVERTICALOSCILLATION", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            if (r0(bVarB)) {
                bVarB.f94126p = verticalOscillation.doubleValue();
                bVarB.f94119j = p0();
                r rVar2 = this.f154141e;
                bVarB.J0 = xy2.b.A(rVar2 != null ? rVar2.getMetadataDTO() : null);
                return bVarB;
            }
        }
        return null;
    }

    public final im.b h(boolean z14) {
        q1 summaryDTO;
        Double averageStrokeDistance;
        if (q0("DIRECTSTROKEDISTANCE")) {
            boolean z15 = z14 || ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            m3 m3Var = z15 ? m3.METER : m3.FOOT;
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 9, "DIRECTSTROKEDISTANCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, z15 ? null : u.f23259d, cVar, null, false);
            r rVar = this.f154141e;
            double dDoubleValue = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (averageStrokeDistance = summaryDTO.getAverageStrokeDistance()) == null) ? Double.NaN : averageStrokeDistance.doubleValue();
            if (!z15) {
                l3.a aVar = l3.f23124b;
                m3 m3Var2 = m3.FOOT;
                aVar.getClass();
                dDoubleValue = l3.a.j(dDoubleValue, m3Var2);
            }
            if (r0(bVarA)) {
                if (Double.isNaN(dDoubleValue)) {
                    List<o20.a> list = bVarA.f94122l;
                    dDoubleValue = 0.0d;
                    if (list != null && list.size() != 0) {
                        int size = bVarA.f94122l.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            dDoubleValue += bVarA.f94122l.get(i14).D();
                        }
                        dDoubleValue /= (double) size;
                    }
                }
                bVarA.f94126p = dDoubleValue;
                bVarA.f94119j = p0();
                bVarA.f94113d = this.f154138b.getString(m3Var.f23164e);
                return bVarA;
            }
        }
        return null;
    }

    public final im.b h0() {
        q1 summaryDTO;
        boolean zQ0 = q0("DIRECTVERTICALRATIO");
        r rVar = this.f154141e;
        Double averageVerticalRatio = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? null : summaryDTO.getAverageVerticalRatio();
        if (zQ0 && averageVerticalRatio != null && b2.a(averageVerticalRatio)) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 16, "DIRECTVERTICALRATIO", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            if (r0(bVarB)) {
                bVarB.f94126p = averageVerticalRatio.doubleValue();
                bVarB.f94119j = p0();
                r rVar2 = this.f154141e;
                bVarB.J0 = xy2.b.A(rVar2 != null ? rVar2.getMetadataDTO() : null);
                return bVarB;
            }
        }
        return null;
    }

    public final lm.d i() {
        List<o1> listT;
        ArrayList arrayList;
        DateTime dateTimePlusSeconds;
        lm.d dVarB;
        DateTime endDateTime;
        int seconds;
        q1 summaryDTO;
        Double elapsedDuration;
        List<x1> listI;
        x1 x1Var;
        List<x1> listI2;
        q1 summaryDTO2;
        Double elapsedDuration2;
        r rVar = this.f154141e;
        if (rVar != null && (listT = rVar.t()) != null) {
            ArrayList<String> arrayList2 = new ArrayList();
            Iterator<T> it = listT.iterator();
            while (it.hasNext()) {
                String splitType = ((o1) it.next()).getSplitType();
                if (splitType != null) {
                    arrayList2.add(splitType);
                }
            }
            if (!arrayList2.isEmpty()) {
                for (String str : arrayList2) {
                    qs.x xVar = qs.x.DIVE_INTERVAL_DYN;
                    String str2 = xVar.f147220a;
                    qs.x xVar2 = qs.x.DIVE_INTERVAL_STA;
                    String str3 = xVar2.f147220a;
                    if (x.k(str2, str3, str3).contains(str)) {
                        List listK = x.k(xVar, xVar2, qs.x.DIVE_INTERVAL_REST);
                        p pVar = this.f154147k;
                        if (pVar == null || (listI2 = pVar.i()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj : listI2) {
                                x1 x1Var2 = (x1) obj;
                                Double duration = x1Var2.getDuration();
                                double dDoubleValue = Double.NaN;
                                double dDoubleValue2 = duration != null ? duration.doubleValue() : Double.NaN;
                                r rVar2 = this.f154141e;
                                if (rVar2 != null && (summaryDTO2 = rVar2.getSummaryDTO()) != null && (elapsedDuration2 = summaryDTO2.getElapsedDuration()) != null) {
                                    dDoubleValue = elapsedDuration2.doubleValue();
                                }
                                if (h0.R(listK, x1Var2.a2()) && b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue)) && dDoubleValue2 <= dDoubleValue) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        if (arrayList == null || arrayList.isEmpty()) {
                            break;
                            break;
                        }
                        p pVar2 = this.f154147k;
                        int i14 = 0;
                        DateTime startDateTime = (pVar2 == null || (listI = pVar2.i()) == null || (x1Var = (x1) h0.e0(0, listI)) == null) ? null : x1Var.getStartDateTime();
                        if (startDateTime != null) {
                            r rVar3 = this.f154141e;
                            dateTimePlusSeconds = startDateTime.plusSeconds((int) Math.ceil((rVar3 == null || (summaryDTO = rVar3.getSummaryDTO()) == null || (elapsedDuration = summaryDTO.getElapsedDuration()) == null) ? 0.0d : elapsedDuration.doubleValue()));
                        } else {
                            dateTimePlusSeconds = null;
                        }
                        new im.u();
                        fz.c cVar = fz.c.TIME;
                        cVar.getClass();
                        listK.getClass();
                        if (startDateTime != null) {
                            dVarB = new lm.d(80, listK, arrayList, startDateTime);
                            dVarB.f113514x1 = cVar;
                            int i15 = 0;
                            for (Object obj2 : arrayList) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    x.q();
                                    throw null;
                                }
                                x1 x1Var3 = (x1) obj2;
                                DateTime startDateTime2 = x1Var3.getStartDateTime();
                                if (startDateTime2 != null && (endDateTime = x1Var3.getEndDateTime()) != null) {
                                    int seconds2 = Seconds.secondsBetween(startDateTime, startDateTime2).getSeconds();
                                    int seconds3 = Seconds.secondsBetween(startDateTime2, endDateTime).getSeconds() + seconds2;
                                    if (i15 == 0) {
                                        int i17 = i14;
                                        while (i17 < seconds2) {
                                            im.u.c(listK, null, dVarB, i17);
                                            i17++;
                                            dateTimePlusSeconds = dateTimePlusSeconds;
                                        }
                                    }
                                    DateTime dateTime = dateTimePlusSeconds;
                                    if (seconds2 <= seconds3) {
                                        while (true) {
                                            im.u.c(listK, x1Var3, dVarB, seconds2);
                                            if (seconds2 == seconds3) {
                                                break;
                                            }
                                            seconds2++;
                                        }
                                    }
                                    dateTimePlusSeconds = dateTime;
                                    if (i15 == arrayList.size() - 1 && seconds3 <= (seconds = Seconds.secondsBetween(startDateTime, dateTimePlusSeconds).getSeconds())) {
                                        while (true) {
                                            im.u.c(listK, null, dVarB, seconds3);
                                            if (seconds3 != seconds) {
                                                seconds3++;
                                            }
                                        }
                                    }
                                }
                                i15 = i16;
                                i14 = 0;
                            }
                        } else {
                            dVarB = im.u.b(80, cVar, arrayList, listK);
                        }
                        dVarB.F(x.k(2, 2, 2));
                        return dVarB;
                    }
                }
            }
        }
        return null;
    }

    public final im.b i0() {
        Double maxRunCadence;
        Double averageRunCadence;
        if (q0("DIRECTDOUBLECADENCE")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageRunCadence = summaryDTO.getAverageRunCadence()) == null) ? Double.NaN : averageRunCadence.doubleValue();
            if (summaryDTO != null && (maxRunCadence = summaryDTO.getMaxRunCadence()) != null) {
                dDoubleValue = maxRunCadence.doubleValue();
            }
            double d14 = dDoubleValue;
            if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(d14))) {
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                fz.c cVar = this.f154139c;
                im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 66, "DIRECTDOUBLECADENCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
                if (r0(bVarB)) {
                    bVarB.f94119j = p0();
                    bVarB.f94126p = dDoubleValue2;
                    bVarB.f94127q = d14;
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final im.b j() {
        List<x0> listG;
        double d14;
        Double maxElevation;
        Double minElevation;
        am.x0 x0VarH;
        am.x0 x0VarH2;
        boolean zR = am.r1.r();
        r rVar = this.f154141e;
        boolean zO = z0.o((rVar == null || (x0VarH2 = rVar.h()) == null) ? null : x0VarH2.f4358a);
        r rVar2 = this.f154141e;
        int i14 = z0.b(am.x0.O1, (rVar2 == null || (x0VarH = rVar2.h()) == null) ? null : x0VarH.f4358a) ? 87 : 2;
        if (q0("DIRECTELEVATION")) {
            p pVar = this.f154147k;
            if (pVar == null || (listG = pVar.g()) == null) {
                listG = j0.f134944a;
            }
            List<x0> list = listG;
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            fz.c cVar2 = fz.c.TIME;
            String str = cVar == cVar2 ? "SUMDURATION" : "SUMDISTANCE";
            c22.t tVar = u.f23259d;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, i14, "DIRECTELEVATION", str, null, zR ? null : tVar, cVar, list, zO);
            if (r0(bVarA)) {
                ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                activityDetailChartDTO2.getClass();
                im.b bVarA2 = im.d.a(activityDetailChartDTO2, 0.0d, 0.0d, i14, "SUMDISTANCE", "SUMDURATION", null, zR ? null : tVar, cVar2, list, zO);
                r rVar3 = this.f154141e;
                q1 summaryDTO = rVar3 != null ? rVar3.getSummaryDTO() : null;
                double dDoubleValue = Double.NaN;
                double dDoubleValue2 = (summaryDTO == null || (minElevation = summaryDTO.getMinElevation()) == null) ? Double.NaN : minElevation.doubleValue();
                if (summaryDTO != null && (maxElevation = summaryDTO.getMaxElevation()) != null) {
                    dDoubleValue = maxElevation.doubleValue();
                }
                bVarA.f94119j = p0();
                if (zR) {
                    d14 = dDoubleValue;
                } else {
                    l3.f23124b.getClass();
                    d14 = dDoubleValue * 3.2808399d;
                }
                bVarA.f94125o = d14;
                if (!zR) {
                    l3.f23124b.getClass();
                    dDoubleValue2 *= 3.2808399d;
                }
                bVarA.f94124n = dDoubleValue2;
                if (!zR) {
                    l3.f23124b.getClass();
                    dDoubleValue *= 3.2808399d;
                }
                bVarA.f94127q = dDoubleValue;
                List<o20.a> list2 = bVarA2.f94122l;
                if (bVarA.Q0 == null) {
                    bVarA.Q0 = new ArrayList();
                }
                bVarA.Q0.clear();
                if (list2 != null) {
                    bVarA.Q0.addAll(list2);
                }
                return bVarA;
            }
        }
        return null;
    }

    public final im.b j0() {
        if (!q0("directWattsPerCda")) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 37, "directWattsPerCda", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (r0(bVarB) && summaryDTO != null) {
            bVarB.f94119j = p0();
            Double averageWattsPerCda = summaryDTO.getAverageWattsPerCda();
            bVarB.f94126p = averageWattsPerCda != null ? averageWattsPerCda.doubleValue() : Double.NaN;
        }
        return bVarB;
    }

    public final im.b k() {
        q1 summaryDTO;
        Double averageGradeAdjustedSpeed;
        if (q0("directGradeAdjustedSpeed") && this.f154147k != null) {
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            r rVar = this.f154141e;
            double dDoubleValue = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (averageGradeAdjustedSpeed = summaryDTO.getAverageGradeAdjustedSpeed()) == null) ? Double.NaN : averageGradeAdjustedSpeed.doubleValue();
            double dH = o72.t.H(this.f154140d, this.f154139c);
            l3.f23124b.getClass();
            double dP = l3.a.p(dDoubleValue, zY);
            double dP2 = l3.a.p(dH, zY);
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, dP, dP2, 64, "directGradeAdjustedSpeed", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, zY ? u.f23265j : u.f23266k, cVar, null, false);
            if (r0(bVarA) && b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dH))) {
                bVarA.f94126p = dP;
                bVarA.f94127q = dP2;
                bVarA.f94119j = p0();
                bVarA.f94113d = this.f154138b.getString(zY ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile);
                return bVarA;
            }
        }
        return null;
    }

    public final b0 k0() {
        p pVar = this.f154147k;
        b0 b0Var = null;
        List<x1> listI = pVar != null ? pVar.i() : null;
        if (listI != null && !listI.isEmpty()) {
            z zVar = z.f94209a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((x1) obj).a2() == qs.x.SURF_ACTIVE) {
                    arrayList.add(obj);
                }
            }
            List<x1> listN0 = h0.N0(arrayList, new a0());
            if (!listN0.isEmpty()) {
                b0Var = new b0(listN0);
                b0Var.f94111b = 49;
                b0Var.f94119j = "";
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    Double distance = ((x1) it.next()).getDistance();
                    if (distance != null) {
                        arrayList2.add(distance);
                    }
                }
                Double dP0 = h0.p0(arrayList2);
                for (x1 x1Var : listN0) {
                    Double distance2 = x1Var.getDistance();
                    double dDoubleValue = distance2 != null ? distance2.doubleValue() : 0.0d;
                    b0Var.b(new o20.a(listN0.indexOf(x1Var), dDoubleValue));
                    boolean zC = s.c(dP0, dDoubleValue);
                    int i14 = R.color.palette_red_9;
                    b0Var.f94123m.add(Integer.valueOf(zC ? R.color.palette_red_9 : R.color.palette_blue_8));
                    if (!s.c(dP0, dDoubleValue)) {
                        i14 = R.color.palette_blue_21;
                    }
                    b0Var.f94123m.add(Integer.valueOf(i14));
                }
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    public final im.b l(int i14, String str) {
        ArrayList arrayListI;
        if (this.f154150n == null) {
            arrayListI = null;
        } else {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            ArrayList arrayListI2 = activityDetailChartDTO != null ? o72.t.I(activityDetailChartDTO, "directTimestamp") : null;
            ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
            ArrayList arrayListI3 = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "SUMDISTANCE") : null;
            ActivityDetailChartDTO activityDetailChartDTO3 = this.f154140d;
            arrayListI = activityDetailChartDTO3 != null ? o72.t.I(activityDetailChartDTO3, "sumDuration") : null;
            if (arrayListI == null || arrayListI.isEmpty() || arrayListI3 == null || arrayListI3.isEmpty() || arrayListI2 == null || arrayListI2.isEmpty()) {
                arrayListI = null;
            } else {
                List<w0> list = this.f154150n;
                if (list != null) {
                    for (w0 w0Var : list) {
                        Long timeStamp = w0Var.getTimeStamp();
                        int iE = u.e(timeStamp != null ? timeStamp.longValue() : 0L, arrayListI2);
                        w0Var.f140252h = (int) ((Number) arrayListI.get(iE)).doubleValue();
                        w0Var.f140253i = (int) ((Number) arrayListI3.get(iE)).doubleValue();
                    }
                }
            }
        }
        if (q0(str)) {
            ActivityDetailChartDTO activityDetailChartDTO4 = this.f154140d;
            activityDetailChartDTO4.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO4, 0.0d, 0.0d, i14, str, cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            if (r0(bVarB)) {
                bVarB.f94119j = p0();
                if (arrayListI != null && !arrayListI.isEmpty()) {
                    ((Number) arrayListI.get(0)).doubleValue();
                    ((Number) arrayListI.get(arrayListI.size() - 1)).doubleValue();
                }
                List<w0> list2 = this.f154150n;
                if (bVarB.N0 == null) {
                    bVarB.N0 = new ArrayList();
                }
                bVarB.N0.clear();
                if (list2 != null) {
                    bVarB.N0.addAll(list2);
                }
                return bVarB;
            }
        }
        return null;
    }

    public final im.b l0() {
        Double maxWheelchairCadence;
        Double avgWheelchairCadence;
        if (q0("directWheelchairCadence")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 71, "directWheelchairCadence", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (avgWheelchairCadence = summaryDTO.getAvgWheelchairCadence()) == null) ? Double.NaN : avgWheelchairCadence.doubleValue();
            if (summaryDTO != null && (maxWheelchairCadence = summaryDTO.getMaxWheelchairCadence()) != null) {
                dDoubleValue = maxWheelchairCadence.doubleValue();
            }
            if (r0(bVarB) && b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue))) {
                bVarB.f94126p = dDoubleValue2;
                bVarB.f94127q = dDoubleValue;
                bVarB.f94119j = p0();
                return bVarB;
            }
        }
        return null;
    }

    public final im.b m() {
        q1 summaryDTO;
        Double groundContactBalanceLeft;
        if (!q0("DIRECTGROUNDCONTACTBALANCELEFT")) {
            return null;
        }
        r rVar = this.f154141e;
        double dDoubleValue = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (groundContactBalanceLeft = summaryDTO.getGroundContactBalanceLeft()) == null) ? Double.NaN : groundContactBalanceLeft.doubleValue();
        if (!b2.a(Double.valueOf(dDoubleValue))) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 14, "DIRECTGROUNDCONTACTBALANCELEFT", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, null, cVar, null, false);
        if (!r0(bVarA)) {
            return null;
        }
        bVarA.f94126p = ((double) 100) - dDoubleValue;
        bVarA.f94119j = p0();
        return bVarA;
    }

    public final im.b n() {
        q1 summaryDTO;
        Double groundContactTime;
        if (!q0("DIRECTGROUNDCONTACTTIME")) {
            return null;
        }
        r rVar = this.f154141e;
        double dDoubleValue = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null || (groundContactTime = summaryDTO.getGroundContactTime()) == null) ? Double.NaN : groundContactTime.doubleValue();
        if (!b2.a(Double.valueOf(dDoubleValue))) {
            return null;
        }
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        fz.c cVar = this.f154139c;
        im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 12, "DIRECTGROUNDCONTACTTIME", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
        if (!r0(bVarB)) {
            return null;
        }
        bVarB.f94126p = dDoubleValue;
        bVarB.f94119j = p0();
        return bVarB;
    }

    public final im.b o(int i14) {
        q1 summaryDTO;
        Double averageHR;
        q1 summaryDTO2;
        Double maxHR;
        String str = this.f154139c == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
        boolean zQ0 = q0("DIRECTHEARTRATE");
        boolean zQ1 = q0("WEIGHTEDMEANHEARTRATE");
        boolean zQ2 = q0("CUMULATIVEDURATION");
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        if (activityDetailChartDTO != null && (zQ0 || zQ1)) {
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, i14, zQ1 ? "WEIGHTEDMEANHEARTRATE" : "DIRECTHEARTRATE", (zQ1 && zQ2) ? "CUMULATIVEDURATION" : str, (!zQ1 || zQ2) ? null : u.f23256a, null, this.f154139c, null, false);
            if (r0(bVarA) && bVarA != null) {
                if (i14 == 88) {
                    r rVar = this.f154141e;
                    bVarA.f94127q = (rVar == null || (summaryDTO2 = rVar.getSummaryDTO()) == null || (maxHR = summaryDTO2.getMaxHR()) == null) ? 0.0d : maxHR.doubleValue();
                }
                List<r1> list = this.f154143g;
                if (list == null) {
                    list = j0.f134944a;
                }
                bVarA.z(list);
                r rVar2 = this.f154141e;
                bVarA.f94126p = (rVar2 == null || (summaryDTO = rVar2.getSummaryDTO()) == null || (averageHR = summaryDTO.getAverageHR()) == null) ? Double.NaN : averageHR.doubleValue();
                bVarA.f94119j = p0();
                bVarA.f94113d = this.f154138b.getString(R.string.lbl_bpm);
                return bVarA;
            }
        }
        return null;
    }

    public final DateTime o0() {
        long millis;
        q1 summaryDTO;
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        String startTimeLocal = null;
        ArrayList arrayListI = activityDetailChartDTO != null ? o72.t.I(activityDetailChartDTO, "DIRECTTIMESTAMP") : null;
        if (arrayListI == null || arrayListI.isEmpty()) {
            r rVar = this.f154141e;
            if (rVar != null && (summaryDTO = rVar.getSummaryDTO()) != null) {
                startTimeLocal = summaryDTO.getStartTimeLocal();
            }
            millis = new DateTime(startTimeLocal).getMillis();
        } else {
            millis = MathKt.d(((Number) arrayListI.get(0)).doubleValue());
        }
        DateTime dateTimeWithMillis = DateTime.now().withMillis(millis);
        dateTimeWithMillis.getClass();
        return dateTimeWithMillis;
    }

    public final im.t p() {
        double dDoubleValue;
        Double elevationGain;
        Double minElevation;
        Double maxElevation;
        q1 q1Var;
        boolean z14;
        List list;
        Object next;
        double dC;
        DateTime dateTimeW4;
        if (!q0("DIRECTELEVATION") || this.f154147k == null) {
            return null;
        }
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        long millis = (summaryDTO == null || (dateTimeW4 = summaryDTO.W4()) == null) ? 0L : dateTimeW4.getMillis();
        boolean zR = am.r1.r();
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        ArrayList arrayListI = activityDetailChartDTO != null ? o72.t.I(activityDetailChartDTO, "DIRECTTIMESTAMP") : null;
        if (arrayListI != null && !arrayListI.isEmpty()) {
            millis = MathKt.d(((Number) arrayListI.get(0)).doubleValue());
        }
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        activityDetailChartDTO2.getClass();
        p pVar = this.f154147k;
        pVar.getClass();
        c22.t tVar = zR ? null : u.f23259d;
        fz.c cVar = this.f154139c;
        z zVar = z.f94209a;
        cVar.getClass();
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO2.G();
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO2.C();
        int[] iArr = {ss.a.a(cVar != fz.c.TIME ? "SUMDISTANCE" : "DIRECTTIMESTAMP", listG), ss.a.a("DIRECTELEVATION", listG)};
        int i14 = iArr[0];
        int i15 = iArr[1];
        im.t tVar2 = new im.t(47, pVar, millis);
        tVar2.f94118i = cVar;
        tVar2.k(new ArrayList());
        tVar2.f94110a = i15;
        List<x1> listI = pVar.i();
        List<x1> listZ = listI != null ? h0.Z(listI) : j0.f134944a;
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it = listC.iterator();
        while (true) {
            dDoubleValue = Double.NaN;
            if (!it.hasNext()) {
                break;
            }
            List<Double> listC2 = it.next().C();
            listC2.getClass();
            dDoubleValue = i14 != -1 ? listC2.get(i14).doubleValue() : Double.NaN;
            Iterator it3 = listZ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    q1Var = summaryDTO;
                    z14 = zR;
                    list = listZ;
                    next = null;
                    break;
                }
                next = it3.next();
                x1 x1Var = (x1) next;
                q1Var = summaryDTO;
                z14 = zR;
                if (x1Var.a2() == qs.x.CLIMB_ACTIVE) {
                    DateTime startDateTime = x1Var.getStartDateTime();
                    long millis2 = startDateTime != null ? startDateTime.getMillis() : Long.MAX_VALUE;
                    list = listZ;
                    if (millis2 <= dDoubleValue) {
                        DateTime endDateTime = x1Var.getEndDateTime();
                        if ((endDateTime != null ? endDateTime.getMillis() : -1L) > dDoubleValue) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    list = listZ;
                }
                listZ = list;
                summaryDTO = q1Var;
                zR = z14;
            }
            x1 x1Var2 = (x1) next;
            if (x1Var2 != null) {
                double dDoubleValue2 = listC2.get(i15).doubleValue();
                Double startElevation = x1Var2.getStartElevation();
                dC = dDoubleValue2 - (startElevation != null ? startElevation.doubleValue() : 0.0d);
            } else {
                dC = 0.0d;
            }
            if (tVar != null) {
                dC = tVar.c(i15, listC, i14, dC, 0.0d, 0.0d);
            }
            double d14 = dC;
            if (cVar == fz.c.TIME) {
                tVar2.b(new o20.a((listC2.get(i14).doubleValue() - millis) / ((double) 1000), d14));
                listZ = list;
            } else {
                listZ = list;
            }
            summaryDTO = q1Var;
            zR = z14;
        }
        q1 q1Var2 = summaryDTO;
        boolean z15 = zR;
        double d15 = 0.0d;
        double d16 = 0.0d;
        int i16 = 0;
        for (x1 x1Var3 : listZ) {
            if (s.g(qs.x.CLIMB_ACTIVE.f147220a, x1Var3.getInternalType())) {
                i16++;
                Double elevationGain2 = x1Var3.getElevationGain();
                if (elevationGain2 != null) {
                    double dDoubleValue3 = elevationGain2.doubleValue();
                    d15 += dDoubleValue3;
                    if (dDoubleValue3 > d16) {
                        d16 = dDoubleValue3;
                    }
                }
            }
        }
        if (i16 > 0) {
            tVar2.f94126p = d15 / ((double) i16);
        }
        tVar2.f94127q = d16;
        if (!r0(tVar2)) {
            return null;
        }
        double dDoubleValue4 = (q1Var2 == null || (maxElevation = q1Var2.getMaxElevation()) == null) ? Double.NaN : maxElevation.doubleValue();
        double dDoubleValue5 = (q1Var2 == null || (minElevation = q1Var2.getMinElevation()) == null) ? Double.NaN : minElevation.doubleValue();
        if (q1Var2 != null && (elevationGain = q1Var2.getElevationGain()) != null) {
            dDoubleValue = elevationGain.doubleValue();
        }
        double dDoubleValue6 = dDoubleValue4 - dDoubleValue5;
        o1 o1VarE = tq.k.e(this.f154141e);
        if (o1VarE != null) {
            Double maxElevationGain = o1VarE.getMaxElevationGain();
            if (maxElevationGain != null) {
                dDoubleValue = maxElevationGain.doubleValue();
            }
            Double elevationGain3 = o1VarE.getElevationGain();
            if (elevationGain3 != null) {
                dDoubleValue6 = elevationGain3.doubleValue();
            }
        }
        tVar2.f94119j = p0();
        if (!z15) {
            l3.f23124b.getClass();
            dDoubleValue *= 3.2808399d;
        }
        tVar2.f94127q = dDoubleValue;
        if (!z15) {
            l3.f23124b.getClass();
            dDoubleValue6 *= 3.2808399d;
        }
        tVar2.f94126p = dDoubleValue6;
        tVar2.f94124n = 0.0d;
        return tVar2;
    }

    public final String p0() {
        fz.c cVar = this.f154139c;
        r rVar = this.f154141e;
        am.x0 x0VarC = rVar != null ? fr.a.g(rVar, null).C() : null;
        cVar.getClass();
        l22.a aVar = this.f154138b;
        aVar.getClass();
        int i14 = v.a.f23287a[cVar.ordinal()];
        if (i14 == 1) {
            return aVar.getString(R.string.lbl_time_h_m_s);
        }
        if (i14 == 2) {
            return aVar.a(R.string.chart_distance_title, aVar.getString(ar.b.b(x0VarC, null).f23164e));
        }
        u0.r();
        return null;
    }

    public final im.b q() {
        Double maxJumpRopeCadence;
        Double avgJumpRopeCadence;
        if (q0("directJumpRopeCadence")) {
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            if (activityDetailChartDTO != null) {
                fz.c cVar = this.f154139c;
                String str = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
                p pVar = this.f154147k;
                im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 77, "directJumpRopeCadence", str, null, null, cVar, pVar != null ? pVar.g() : null, false);
                double dDoubleValue = Double.NaN;
                double dDoubleValue2 = (summaryDTO == null || (avgJumpRopeCadence = summaryDTO.getAvgJumpRopeCadence()) == null) ? Double.NaN : avgJumpRopeCadence.doubleValue();
                if (summaryDTO != null && (maxJumpRopeCadence = summaryDTO.getMaxJumpRopeCadence()) != null) {
                    dDoubleValue = maxJumpRopeCadence.doubleValue();
                }
                if (b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue))) {
                    bVarA.f94126p = dDoubleValue2;
                    bVarA.f94127q = dDoubleValue;
                    bVarA.f94119j = p0();
                    ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                    ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                    if (arrayListI != null && !arrayListI.isEmpty()) {
                        bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                    }
                    return bVarA;
                }
            }
        }
        return null;
    }

    public final boolean q0(String str) {
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        return activityDetailChartDTO != null && activityDetailChartDTO.Z(str);
    }

    public final im.b r() {
        List<x0> listG;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (summaryDTO != null && q0("DIRECTSPEED")) {
            boolean z14 = am.j.z(f12.l.f68084a);
            Double averageSpeed = summaryDTO.getAverageSpeed();
            double dDoubleValue = averageSpeed != null ? averageSpeed.doubleValue() : Double.NaN;
            l3.f23124b.getClass();
            double dP = l3.a.p(dDoubleValue, z14);
            p pVar = this.f154147k;
            if (pVar == null || (listG = pVar.g()) == null) {
                listG = j0.f134944a;
            }
            List<x0> list = listG;
            double dP2 = l3.a.p(og.a.H(list), z14);
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, dP, dP2, 50, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, z14 ? u.f23265j : u.f23266k, cVar, list, false);
            if (r0(bVarA)) {
                Double dValueOf = Double.valueOf(dDoubleValue);
                Double maxSpeed = summaryDTO.getMaxSpeed();
                if (b2.a(dValueOf, Double.valueOf(maxSpeed != null ? maxSpeed.doubleValue() : Double.NaN))) {
                    bVarA.f94126p = dP;
                    bVarA.f94127q = dP2;
                    bVarA.f94119j = p0();
                    bVarA.f94113d = this.f154138b.getString(z14 ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile);
                    return bVarA;
                }
            }
        }
        return null;
    }

    public final im.b s() {
        Double averageSpeed;
        p pVar = this.f154147k;
        List<x1> listI = pVar != null ? pVar.i() : null;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (!q0("DIRECTSPEED") || this.f154147k == null || listI == null || listI.isEmpty() || summaryDTO == null) {
            return null;
        }
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        Double averageSpeed2 = summaryDTO.getAverageSpeed();
        double dDoubleValue = averageSpeed2 != null ? averageSpeed2.doubleValue() : Double.NaN;
        p pVar2 = this.f154147k;
        List<x0> listG = pVar2 != null ? pVar2.g() : null;
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        activityDetailChartDTO.getClass();
        l3.f23124b.getClass();
        double dP = l3.a.p(dDoubleValue, zY);
        double dP2 = l3.a.p(og.a.H(listG), zY);
        fz.c cVar = this.f154139c;
        String str = cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE";
        c22.t tVar = zY ? u.f23265j : u.f23266k;
        ArrayList arrayList = new ArrayList();
        for (x1 x1Var : listI) {
            x1Var.getClass();
            Integer messageIndex = x1Var.getMessageIndex();
            int iIntValue = messageIndex != null ? messageIndex.intValue() + 1 : -1;
            DateTime startDateTime = x1Var.getStartDateTime();
            String string = startDateTime != null ? startDateTime.toString() : null;
            Double averageSpeed3 = x1Var.getAverageSpeed();
            double dDoubleValue2 = -1.0d;
            double dDoubleValue3 = averageSpeed3 != null ? averageSpeed3.doubleValue() : -1.0d;
            Double averageMovingSpeed = x1Var.getAverageMovingSpeed();
            double dDoubleValue4 = averageMovingSpeed != null ? averageMovingSpeed.doubleValue() : -1.0d;
            Double distance = x1Var.getDistance();
            double dDoubleValue5 = distance != null ? distance.doubleValue() : -1.0d;
            Double duration = x1Var.getDuration();
            double dDoubleValue6 = duration != null ? duration.doubleValue() : -1.0d;
            Double movingDuration = x1Var.getMovingDuration();
            double dDoubleValue7 = movingDuration != null ? movingDuration.doubleValue() : -1.0d;
            Double averageHR = x1Var.getAverageHR();
            double dDoubleValue8 = averageHR != null ? averageHR.doubleValue() : -1.0d;
            Double maxHR = x1Var.getMaxHR();
            double dDoubleValue9 = maxHR != null ? maxHR.doubleValue() : -1.0d;
            Double elevationGain = x1Var.getElevationGain();
            double dDoubleValue10 = elevationGain != null ? elevationGain.doubleValue() : -1.0d;
            Double elevationLoss = x1Var.getElevationLoss();
            double dDoubleValue11 = elevationLoss != null ? elevationLoss.doubleValue() : -1.0d;
            Double calories = x1Var.getCalories();
            double dDoubleValue12 = calories != null ? calories.doubleValue() : -1.0d;
            Double strideLength = x1Var.getStrideLength();
            double dDoubleValue13 = strideLength != null ? strideLength.doubleValue() : -1.0d;
            String internalType = x1Var.getInternalType();
            Double minTemperature = x1Var.getMinTemperature();
            double dDoubleValue14 = minTemperature != null ? minTemperature.doubleValue() : -1.0d;
            Double maxTemperature = x1Var.getMaxTemperature();
            double dDoubleValue15 = maxTemperature != null ? maxTemperature.doubleValue() : -1.0d;
            Double avgTemperature = x1Var.getAvgTemperature();
            double dDoubleValue16 = avgTemperature != null ? avgTemperature.doubleValue() : -1.0d;
            Double maxSpeed = x1Var.getMaxSpeed();
            double dDoubleValue17 = maxSpeed != null ? maxSpeed.doubleValue() : -1.0d;
            Double startLatitude = x1Var.getStartLatitude();
            double dDoubleValue18 = startLatitude != null ? startLatitude.doubleValue() : Double.NaN;
            Double startLongitude = x1Var.getStartLongitude();
            double dDoubleValue19 = startLongitude != null ? startLongitude.doubleValue() : Double.NaN;
            Double endLatitude = x1Var.getEndLatitude();
            double dDoubleValue20 = endLatitude != null ? endLatitude.doubleValue() : Double.NaN;
            Double endLongitude = x1Var.getEndLongitude();
            double dDoubleValue21 = endLongitude != null ? endLongitude.doubleValue() : Double.NaN;
            Double avgGradeAdjustedSpeed = x1Var.getAvgGradeAdjustedSpeed();
            double dDoubleValue22 = avgGradeAdjustedSpeed != null ? avgGradeAdjustedSpeed.doubleValue() : Double.NaN;
            Double surfaceInterval = x1Var.getSurfaceInterval();
            Double duration2 = x1Var.getDuration();
            if (duration2 != null || (duration2 = x1Var.getBottomTime()) != null) {
                dDoubleValue2 = duration2.doubleValue();
            }
            arrayList.add(new x0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue22), null, Double.valueOf(dDoubleValue8), null, null, Double.valueOf(dDoubleValue4), null, null, null, null, Double.valueOf(dDoubleValue3), null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue16), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue12), null, null, false, null, null, Double.valueOf(dDoubleValue5), Double.valueOf(dDoubleValue6), null, Double.valueOf(dDoubleValue10), Double.valueOf(dDoubleValue11), null, Double.valueOf(dDoubleValue20), Double.valueOf(dDoubleValue21), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, iIntValue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, x1Var.getMaxDepth(), null, Double.valueOf(dDoubleValue9), null, null, null, null, null, null, Double.valueOf(dDoubleValue17), null, null, null, null, Double.valueOf(dDoubleValue15), null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue14), null, Double.valueOf(dDoubleValue7), 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue18), Double.valueOf(dDoubleValue19), null, null, string, null, null, null, null, Double.valueOf(dDoubleValue13), null, null, surfaceInterval, null, null, null, null, null, internalType, null, null, null, null, null, null, null, null, 0, null, 0, null, null, null, -69533697, -57415689, -1342179329, -20972577, -1212940289, 524271, null));
        }
        im.b bVarA = im.d.a(activityDetailChartDTO, dP, dP2, 52, "DIRECTSPEED", str, null, tVar, cVar, arrayList, false);
        Double maxSpeed2 = summaryDTO.getMaxSpeed();
        double dDoubleValue23 = maxSpeed2 != null ? maxSpeed2.doubleValue() : Double.NaN;
        if (!r0(bVarA) || !b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue23))) {
            return null;
        }
        r rVar2 = this.f154141e;
        o1 o1VarC = ss.l.c(rVar2 != null ? rVar2.t() : null, qs.x.RUN_ACTIVE);
        if (o1VarC != null && (averageSpeed = o1VarC.getAverageSpeed()) != null) {
            double dDoubleValue24 = averageSpeed.doubleValue();
            l3.f23124b.getClass();
            bVarA.f94126p = l3.a.p(dDoubleValue24, zY);
        }
        bVarA.f94127q = zm.e0.b(listG);
        bVarA.f94119j = p0();
        l3.f23124b.getClass();
        bVarA.f94113d = this.f154138b.getString(l3.a.N1(zY));
        return bVarA;
    }

    public final im.b t() {
        am.x0 x0VarH;
        Double numberOfActiveLengths;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        double dDoubleValue = (summaryDTO == null || (numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths()) == null) ? 0.0d : numberOfActiveLengths.doubleValue();
        boolean z14 = b2.a(Double.valueOf(dDoubleValue)) && dDoubleValue > 0.0d;
        if (q0("WEIGHTEDMEANSPEED") && summaryDTO != null && z14) {
            r rVar2 = this.f154141e;
            String str = (rVar2 == null || (x0VarH = rVar2.h()) == null) ? null : x0VarH.f4358a;
            Double distance = summaryDTO.getDistance();
            boolean zI = ar.b.i(str, distance != null ? distance.doubleValue() : Double.NaN, summaryDTO.getUnitOfPoolLength(), ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), dDoubleValue);
            Double averageSpeed = summaryDTO.getAverageSpeed();
            double dDoubleValue2 = averageSpeed != null ? averageSpeed.doubleValue() : Double.NaN;
            l3.f23124b.getClass();
            double dR = l3.a.r(dDoubleValue2, zI);
            Double maxSpeed = summaryDTO.getMaxSpeed();
            double dR2 = l3.a.r(maxSpeed != null ? maxSpeed.doubleValue() : Double.NaN, zI);
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, dR, dR2, 68, "WEIGHTEDMEANSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", u.f23257b, zI ? u.f23270o : u.f23271p, cVar, null, false);
            if (r0(bVarA)) {
                bVarA.f94126p = dR;
                bVarA.f94127q = dR2;
                bVarA.f94113d = this.f154138b.getString(l3.a.O1(zI));
                bVarA.f94119j = p0();
                return bVarA;
            }
        }
        return null;
    }

    public final im.b u() {
        q1 summaryDTO;
        im.b bVar;
        im.b bVarO;
        r rVar = this.f154141e;
        if (rVar != null && (summaryDTO = rVar.getSummaryDTO()) != null) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            List<com.garmin.android.apps.connectmobile.activities.newmodel.c> listF = activityDetailChartDTO != null ? activityDetailChartDTO.F() : null;
            if (this.f154140d != null) {
                int i14 = 3;
                if (listF == null || listF.isEmpty()) {
                    bVar = null;
                    bVarO = o(i14);
                } else {
                    ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                    activityDetailChartDTO2.getClass();
                    fz.c cVar = this.f154139c;
                    bVarO = new im.b(3);
                    bVarO.f94118i = cVar;
                    bVarO.k(new ArrayList(0));
                    o20.a aVar = new o20.a(0.0d, 0.0d);
                    double d14 = 0.0d;
                    o20.a aVar2 = new o20.a(-255.0d, -255.0d);
                    String str = "]";
                    String str2 = "Throwing out Heart Rate 'y' value [";
                    bVar = null;
                    if (cVar == fz.c.TIME) {
                        for (com.garmin.android.apps.connectmobile.activities.newmodel.c cVar2 : listF) {
                            double duration = cVar2.getDuration();
                            double bpm = cVar2.getBpm();
                            if (bpm == -1.0d || bpm > d14) {
                                e5.p(duration, bpm, bVarO);
                                if (bpm != -1.0d) {
                                    im.d.f(aVar, aVar2, duration, bpm, false);
                                }
                                str = str;
                                str2 = str2;
                                d14 = d14;
                            } else {
                                i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", str2 + bpm + str);
                            }
                            str = str;
                            str2 = str2;
                            d14 = d14;
                        }
                    } else {
                        ArrayList<Double> arrayListI = o72.t.I(activityDetailChartDTO2, "SUMDISTANCE");
                        if (arrayListI != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            if (!listF.isEmpty()) {
                                ArrayList arrayListI2 = o72.t.I(activityDetailChartDTO2, "CUMULATIVEDURATION");
                                Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.c> it = listF.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Double.valueOf(it.next().getDuration()));
                                    arrayListI2 = arrayListI2;
                                }
                                ArrayList arrayList3 = arrayListI2;
                                if (arrayList3 != null) {
                                    for (Iterator it3 = arrayList3.iterator(); it3.hasNext(); it3 = it3) {
                                        Double d15 = (Double) it3.next();
                                        if (d15.doubleValue() > 0.0d) {
                                            arrayList2.add(Integer.valueOf(listF.get(u.e(d15.longValue(), arrayList)).getBpm()));
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            double dDoubleValue = 0.0d;
                            for (Double d16 : arrayListI) {
                                dDoubleValue += (d16 == null || d16.isNaN()) ? 0.0d : d16.doubleValue();
                                arrayList4.add(Double.valueOf(dDoubleValue));
                            }
                            int i15 = 0;
                            while (i15 < arrayList4.size()) {
                                double dDoubleValue2 = ((Double) arrayList4.get(i15)).doubleValue();
                                double dIntValue = ((Integer) arrayList2.get(i15)).intValue();
                                if (dIntValue == -1.0d || dIntValue > 0.0d) {
                                    e5.p(dDoubleValue2, dIntValue, bVarO);
                                    if (dIntValue != -1.0d) {
                                        im.d.f(aVar, aVar2, dDoubleValue2, dIntValue, false);
                                    }
                                    i15++;
                                    arrayList2 = arrayList2;
                                } else {
                                    i2.a(a2.ACTIVITIES, "ActivityChartDataBuilder", "Throwing out Heart Rate 'y' value [" + dIntValue + "]");
                                }
                                i15++;
                                arrayList2 = arrayList2;
                            }
                        }
                    }
                    bVarO.f94124n = aVar.D();
                    bVarO.f94125o = aVar2.D();
                    i14 = 3;
                }
                if (!r0(bVarO) || bVarO == null) {
                    return bVar;
                }
                bVarO.o(i14);
                Double averageHR = summaryDTO.getAverageHR();
                bVarO.h(averageHR != null ? averageHR.doubleValue() : Double.NaN);
                bVarO.q(p0());
                bVarO.f94113d = this.f154138b.getString(R.string.lbl_bpm);
                return bVarO;
            }
        }
        return null;
    }

    public final im.b v() {
        if (q0("directLeftPlatformCenterOffset")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarB = im.d.b(activityDetailChartDTO, 0.0d, 0.0d, 21, "directLeftPlatformCenterOffset", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, cVar);
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            if (r0(bVarB) && summaryDTO != null && b2.a(summaryDTO.getLeftPlatformCenterOffset())) {
                Double leftPlatformCenterOffset = summaryDTO.getLeftPlatformCenterOffset();
                bVarB.f94126p = leftPlatformCenterOffset != null ? leftPlatformCenterOffset.doubleValue() : Double.NaN;
                bVarB.f94119j = p0();
                return bVarB;
            }
        }
        return null;
    }

    public final im.b w() {
        if (q0("DIRECTRIGHTBALANCE")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 19, "DIRECTRIGHTBALANCE", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, null, cVar, null, false);
            r rVar = this.f154141e;
            q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            if (r0(bVarA) && summaryDTO != null && b2.a(summaryDTO.getLeftBalance(), summaryDTO.getRightBalance())) {
                Double leftBalance = summaryDTO.getLeftBalance();
                bVarA.f94129t = leftBalance != null ? leftBalance.doubleValue() : Double.NaN;
                Double rightBalance = summaryDTO.getRightBalance();
                bVarA.f94130v = rightBalance != null ? rightBalance.doubleValue() : Double.NaN;
                bVarA.f94119j = p0();
                return bVarA;
            }
        }
        return null;
    }

    public final im.b x() {
        Double maxSpeed;
        Double averageSpeed;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (q0("DIRECTSPEED")) {
            ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
            activityDetailChartDTO.getClass();
            fz.c cVar = this.f154139c;
            im.b bVarA = im.d.a(activityDetailChartDTO, 0.0d, 0.0d, 0, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, u.f23264i, cVar, null, false);
            double dDoubleValue = Double.NaN;
            double dDoubleValue2 = (summaryDTO == null || (averageSpeed = summaryDTO.getAverageSpeed()) == null) ? Double.NaN : averageSpeed.doubleValue();
            if (summaryDTO != null && (maxSpeed = summaryDTO.getMaxSpeed()) != null) {
                dDoubleValue = maxSpeed.doubleValue();
            }
            boolean zA = b2.a(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
            if (bVarA != null && r0(bVarA) && summaryDTO != null && zA) {
                l3.f23124b.getClass();
                q3 q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                bVarA.f94126p = l3.a.i(dDoubleValue2, q3Var);
                bVarA.f94127q = l3.a.w(dDoubleValue, q3.METERS_PER_SECOND, q3Var);
                bVarA.f94119j = p0();
                ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                if (arrayListI != null && !arrayListI.isEmpty()) {
                    bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                }
                return bVarA;
            }
        }
        return null;
    }

    public final im.b y() {
        q1 summaryDTO;
        Double averageSpeed;
        if (q0("DIRECTSPEED")) {
            r rVar = this.f154141e;
            if ((rVar != null ? rVar.getSummaryDTO() : null) != null) {
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                double dC = o72.t.C(this.f154140d);
                double dG = o72.t.G(this.f154140d);
                c22.t tVar = zY ? u.f23268m : u.f23269n;
                ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
                activityDetailChartDTO.getClass();
                l3.f23124b.getClass();
                double dR = l3.a.r(dC, zY);
                double dR2 = l3.a.r(dG, zY);
                fz.c cVar = this.f154139c;
                im.b bVarA = im.d.a(activityDetailChartDTO, dR, dR2, 67, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, tVar, cVar, null, false);
                if (bVarA != null) {
                    int iO1 = l3.a.O1(zY);
                    r rVar2 = this.f154141e;
                    double dDoubleValue = (rVar2 == null || (summaryDTO = rVar2.getSummaryDTO()) == null || (averageSpeed = summaryDTO.getAverageSpeed()) == null) ? Double.NaN : averageSpeed.doubleValue();
                    if (r0(bVarA) && b2.a(Double.valueOf(dDoubleValue))) {
                        bVarA.f94126p = l3.a.r(dDoubleValue, zY);
                        bVarA.f94119j = p0();
                        bVarA.f94113d = this.f154138b.getString(iO1);
                        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
                        ArrayList arrayListI = activityDetailChartDTO2 != null ? o72.t.I(activityDetailChartDTO2, "DIRECTTIMESTAMP") : null;
                        if (arrayListI != null && !arrayListI.isEmpty()) {
                            bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                        }
                    }
                }
                return bVarA;
            }
        }
        return null;
    }

    public final im.b z() {
        List<o1> listT;
        r rVar = this.f154141e;
        q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
        if (!q0("DIRECTSPEED") || summaryDTO == null) {
            return null;
        }
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        ActivityDetailChartDTO activityDetailChartDTO = this.f154140d;
        double dC = activityDetailChartDTO != null ? o72.t.C(activityDetailChartDTO) : Double.NaN;
        ActivityDetailChartDTO activityDetailChartDTO2 = this.f154140d;
        double dG = activityDetailChartDTO2 != null ? o72.t.G(activityDetailChartDTO2) : Double.NaN;
        c22.t tVar = zY ? u.f23265j : u.f23266k;
        ActivityDetailChartDTO activityDetailChartDTO3 = this.f154140d;
        activityDetailChartDTO3.getClass();
        l3.f23124b.getClass();
        double dP = l3.a.p(dC, zY);
        double dP2 = l3.a.p(dG, zY);
        fz.c cVar = this.f154139c;
        im.b bVarA = im.d.a(activityDetailChartDTO3, dP, dP2, 1, "DIRECTSPEED", cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", null, tVar, cVar, null, false);
        Double averageSpeed = summaryDTO.getAverageSpeed();
        double dDoubleValue = averageSpeed != null ? averageSpeed.doubleValue() : Double.NaN;
        Double maxSpeed = summaryDTO.getMaxSpeed();
        double dDoubleValue2 = maxSpeed != null ? maxSpeed.doubleValue() : Double.NaN;
        if (r0(bVarA) && b2.a(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2))) {
            if (bVarA != null) {
                ActivityDetailChartDTO activityDetailChartDTO4 = this.f154140d;
                ArrayList arrayListI = activityDetailChartDTO4 != null ? o72.t.I(activityDetailChartDTO4, "DIRECTTIMESTAMP") : null;
                if (arrayListI != null && !arrayListI.isEmpty()) {
                    bVarA.C = DateTime.now().withMillis(MathKt.d(((Number) arrayListI.get(0)).doubleValue()));
                }
                bVarA.f94119j = p0();
                bVarA.f94113d = this.f154138b.getString(l3.a.N1(zY));
                bVarA.f94126p = l3.a.p(dDoubleValue, zY);
                bVarA.f94127q = l3.a.p(dDoubleValue2, zY);
            }
            p pVar = this.f154147k;
            List<x1> listI = pVar != null ? pVar.i() : null;
            r rVar2 = this.f154141e;
            if (rVar2 != null && (listT = rVar2.t()) != null && fr.a.d(listT, qs.x.PACE_PRO_SPLIT) && listI != null && bVarA != null) {
                b0.f94135b1.getClass();
                return b0.a.a(bVarA, listI);
            }
        }
        return bVarA;
    }

    /* JADX INFO: renamed from: rr.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lrr/a$a;", "", "<init>", "()V", "", "TOTAL_GROUND_CONTACT_BALANCE", "I", "", "IMPACT_LOAD_FACTOR_AVG", "D", "IMPACT_LOAD_FACTOR_MIN", "IMPACT_LOAD_FACTOR_MAX", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2919a {
        public /* synthetic */ C2919a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2919a() {
        }
    }
}
