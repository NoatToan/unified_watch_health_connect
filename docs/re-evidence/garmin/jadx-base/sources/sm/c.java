package sm;

import am.x0;
import am.z0;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.y;
import ps.p;
import ps.x1;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/c;", "Lsm/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f160062a = new c();

    private c() {
    }

    public static int b(List list, double d14) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            t.g();
            return 0;
        }
        double dAbs = Math.abs(((Number) it.next()).doubleValue() - d14);
        while (it.hasNext()) {
            dAbs = Math.min(dAbs, Math.abs(((Number) it.next()).doubleValue() - d14));
        }
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(Double.valueOf(Math.abs(((Number) it3.next()).doubleValue() - d14)));
        }
        return arrayList.indexOf(Double.valueOf(dAbs));
    }

    public static final ArrayList c(p pVar, String str, ActivityDetailChartDTO activityDetailChartDTO, fz.c cVar) {
        List<x1> listI;
        x xVar;
        str.getClass();
        activityDetailChartDTO.getClass();
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (pVar != null && (listI = pVar.i()) != null) {
            for (x1 x1Var : listI) {
                x xVarA2 = x1Var.a2();
                f160062a.getClass();
                if (z0.K(str) || z0.b(x0.f4350y, str)) {
                    xVar = x.SURF_ACTIVE;
                } else if (z0.b(x0.O0, str)) {
                    xVar = x.OBSTACLE;
                } else if (z0.b(x0.R0, str)) {
                    xVar = x.DOWNHILL_RUN;
                } else if (z0.b(x0.f4312o, str)) {
                    xVar = x.CLIMB_PRO_CYCLING_CLIMB;
                } else {
                    xVar = z0.P(str) ? x.SKI_RUN : null;
                }
                if (xVarA2 == xVar || x1Var.a2() == x.TRANSITION) {
                    List listI2 = o72.t.I(activityDetailChartDTO, "DIRECTTIMESTAMP");
                    if (listI2 == null) {
                        listI2 = j0.f134944a;
                    }
                    List listI3 = o72.t.I(activityDetailChartDTO, cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE");
                    if (listI3 == null) {
                        listI3 = j0.f134944a;
                    }
                    DateTime startDateTime = x1Var.getStartDateTime();
                    long millis = startDateTime != null ? startDateTime.getMillis() : 0L;
                    DateTime endDateTime = x1Var.getEndDateTime();
                    long millis2 = endDateTime != null ? endDateTime.getMillis() : 0L;
                    int iB = b(listI2, millis);
                    int iB2 = b(listI2, millis2);
                    Double d14 = (Double) h0.e0(iB, listI3);
                    long jD = d14 != null ? MathKt.d(d14.doubleValue()) : 0L;
                    Double d15 = (Double) h0.e0(iB2, listI3);
                    long jD2 = d15 != null ? MathKt.d(d15.doubleValue()) : 0L;
                    Double duration = x1Var.getDuration();
                    long jD3 = MathKt.d((duration != null ? duration.doubleValue() : 0.0d) * 1000.0d);
                    if (millis2 < millis) {
                        arrayList.add(new b(jD, jD + jD3));
                    } else {
                        arrayList.add(new b(jD, jD2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean d(zm.p pVar) {
        pVar.getClass();
        String f113501k1 = pVar.getF113501k1();
        if (f113501k1 != null) {
            if ((z0.K(f113501k1) || z0.b(x0.f4350y, f113501k1)) && p13.x.k(0, 3).contains(Integer.valueOf(pVar.getB1()))) {
                return true;
            }
            if (z0.b(x0.O0, f113501k1) && !p13.x.k(6, 33).contains(Integer.valueOf(pVar.getB1()))) {
                return true;
            }
            if (!z0.b(x0.R0, f113501k1)) {
                if ((z0.b(x0.f4312o, f113501k1) && pVar.getB1() == 2) || z0.o(f113501k1)) {
                    return true;
                }
                z0.x(f113501k1);
                return false;
            }
        }
        return false;
    }

    @Override // sm.a
    public final LineDataSet a(Context context, zm.p pVar, OverlayCombinedChart overlayCombinedChart) {
        context.getClass();
        pVar.getClass();
        int iD3 = pVar.D3();
        double dC = Double.MIN_VALUE;
        double dMax = Double.MIN_VALUE;
        for (int i14 = 0; i14 < iD3; i14++) {
            Iterator<T> it = pVar.P(i14).iterator();
            if (!it.hasNext()) {
                t.g();
                return null;
            }
            o20.a aVar = (o20.a) it.next();
            double D = !Double.isNaN(aVar.D()) ? aVar.D() : Double.MIN_VALUE;
            while (it.hasNext()) {
                o20.a aVar2 = (o20.a) it.next();
                D = Math.max(D, !Double.isNaN(aVar2.D()) ? aVar2.D() : Double.MIN_VALUE);
            }
            dMax = Math.max(dMax, D);
        }
        if (dMax == Double.MIN_VALUE) {
            dMax = 0.0d;
        }
        float f14 = (float) dMax;
        int iD4 = pVar.D3();
        double dMax2 = Double.MIN_VALUE;
        for (int i15 = 0; i15 < iD4; i15++) {
            Iterator<T> it3 = pVar.P(i15).iterator();
            if (!it3.hasNext()) {
                t.g();
                return null;
            }
            o20.a aVar3 = (o20.a) it3.next();
            double dC2 = !Double.isNaN(aVar3.C()) ? aVar3.C() : dC;
            while (it3.hasNext()) {
                o20.a aVar4 = (o20.a) it3.next();
                if (!Double.isNaN(aVar4.C())) {
                    dC = aVar4.C();
                }
                dC2 = Math.max(dC2, dC);
                dC = dC;
            }
            dMax2 = Math.max(dMax2, dC2);
        }
        float f15 = (float) (dMax2 != dC ? dMax2 : 0.0d);
        DateTime f113503m1 = pVar.getF113503m1();
        long millis = f113503m1 != null ? f113503m1.getMillis() : -1L;
        List<b> listR = pVar.R();
        if (listR == null) {
            listR = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        long jD = MathKt.d(millis / 1000.0f);
        for (b bVar : listR) {
            long j8 = bVar.f160060a;
            long j14 = bVar.f160061b;
            while (jD < j8) {
                arrayList.add(new Entry(jD, Float.NaN));
                jD++;
            }
            if (j8 <= j14) {
                while (true) {
                    arrayList.add(new Entry(j8, f14));
                    if (j8 != j14) {
                        j8++;
                    }
                }
            }
            jD = j14 + 1;
        }
        long j15 = (long) f15;
        if (jD <= j15) {
            while (true) {
                arrayList.add(new Entry(jD, Float.NaN));
                if (jD == j15) {
                    break;
                }
                jD++;
            }
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, "SPLITS_UNDERLAY_TYPE_TAG");
        lineDataSet.setMode(LineDataSet.Mode.STEPPED);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setColor(a7.b.getColor(context, R.color.transparent));
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setFillDrawable(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{a7.b.getColor(context, R.color.gray_55_static), a7.b.getColor(context, R.color.gray_55_static)}));
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawHighlightIndicators(false);
        return lineDataSet;
    }
}
