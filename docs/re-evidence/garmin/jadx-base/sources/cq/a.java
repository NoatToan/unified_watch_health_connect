package cq;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p13.h0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcq/a;", "Lqz/c;", "Ldq/a;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lm00/a;", "formatter", "<init>", "(Landroid/content/Context;Lm00/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<dq.a, ILineDataSet> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f54975e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m00.a f54977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<LimitLine> f54978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o13.p<o13.p<Double, Double>, o13.p<Double, Double>> f54979d;

    static {
        new C1197a(null);
        f54975e = Utils.convertDpToPixel(0.5f);
    }

    public a(Context context, m00.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f54976a = context;
        this.f54977b = aVar;
        this.f54978c = new ArrayList<>();
    }

    public static Integer A(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!d53.u.q(((com.garmin.android.apps.connectmobile.activities.newmodel.y) next).F(), str, true));
        com.garmin.android.apps.connectmobile.activities.newmodel.y yVar = (com.garmin.android.apps.connectmobile.activities.newmodel.y) next;
        if (yVar != null) {
            return Integer.valueOf(yVar.G());
        }
        return null;
    }

    public static o13.p y(List list, List list2, List list3) {
        Integer numA = A("DIRECTELEVATION", list3);
        int iIntValue = numA != null ? numA.intValue() : -1;
        Integer numA2 = A("SUMDISTANCE", list3);
        int iIntValue2 = numA2 != null ? numA2.intValue() : -1;
        Integer numA3 = A("DIRECTTIMESTAMP", list3);
        int iIntValue3 = numA3 != null ? numA3.intValue() : -1;
        Iterator it = list.iterator();
        double dDoubleValue = Double.MAX_VALUE;
        double dDoubleValue2 = Double.MIN_VALUE;
        double dDoubleValue3 = Double.MIN_VALUE;
        double dDoubleValue4 = Double.MAX_VALUE;
        while (it.hasNext()) {
            x1 x1Var = (x1) it.next();
            DateTime startDateTime = x1Var.getStartDateTime();
            Long lValueOf = startDateTime != null ? Long.valueOf(startDateTime.getMillis()) : null;
            DateTime endDateTime = x1Var.getEndDateTime();
            Long lValueOf2 = endDateTime != null ? Long.valueOf(endDateTime.getMillis()) : null;
            if (lValueOf != null && lValueOf2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    List<Double> listC = ((com.garmin.android.apps.connectmobile.activities.newmodel.b) it3.next()).C();
                    Double d14 = listC.get(iIntValue2);
                    Double d15 = listC.get(iIntValue);
                    Iterator it4 = it;
                    int i14 = iIntValue;
                    long jDoubleValue = (long) listC.get(iIntValue3).doubleValue();
                    long jLongValue = lValueOf.longValue();
                    if (jDoubleValue <= lValueOf2.longValue() && jLongValue <= jDoubleValue) {
                        if (d14.doubleValue() > dDoubleValue2) {
                            dDoubleValue2 = d14.doubleValue();
                        }
                        if (d14.doubleValue() < dDoubleValue) {
                            dDoubleValue = d14.doubleValue();
                        }
                        if (d15.doubleValue() > dDoubleValue3) {
                            dDoubleValue3 = d15.doubleValue();
                        }
                        if (d15.doubleValue() < dDoubleValue4) {
                            dDoubleValue4 = d15.doubleValue();
                        }
                    }
                    it = it4;
                    iIntValue = i14;
                }
            }
            it = it;
            iIntValue = iIntValue;
        }
        return new o13.p(new o13.p(Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2)), new o13.p(Double.valueOf(dDoubleValue4), Double.valueOf(dDoubleValue3)));
    }

    @Override // qz.c
    public final List<ILineDataSet> a(dq.a aVar) {
        return h0.Z(z(aVar));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(dq.a aVar) {
        return 4;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(dq.a aVar) {
        return false;
    }

    @Override // qz.c
    public final float e(dq.a aVar) {
        o13.p<Double, Double> pVar;
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVarX = x(aVar);
        if (pVarX == null || (pVar = pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) pVar.f128594a.doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final boolean h() {
        return true;
    }

    @Override // qz.c
    public final float i(dq.a aVar) {
        o13.p<Double, Double> pVar;
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVarX = x(aVar);
        if (pVarX == null || (pVar = pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.ceil(pVar.f128595b.doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final boolean l() {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(dq.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float q(dq.a aVar) {
        o13.p<Double, Double> pVar;
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVarX = x(aVar);
        if (pVarX == null || (pVar = pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) pVar.f128595b.doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float t(dq.a aVar) {
        o13.p<Double, Double> pVar;
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVarX = x(aVar);
        if (pVarX == null || (pVar = pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.floor(pVar.f128594a.doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(dq.a aVar) {
        return null;
    }

    @Override // qz.c
    public final List v(dq.a aVar) {
        z(aVar);
        return this.f54978c;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(dq.a aVar) {
        return 0.0f;
    }

    public final o13.p<o13.p<Double, Double>, o13.p<Double, Double>> x(dq.a aVar) {
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVarY = null;
        if ((aVar != null ? aVar.getActivityChartDetails() : null) == null) {
            this.f54979d = null;
            return null;
        }
        o13.p<o13.p<Double, Double>, o13.p<Double, Double>> pVar = this.f54979d;
        if (pVar != null) {
            return pVar;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.a activityChartDetails = aVar.getActivityChartDetails();
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityChartDetails.G();
        listG.getClass();
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityChartDetails.C();
        listC.getClass();
        if (aVar.f() != null && !aVar.f().isEmpty()) {
            pVarY = y(aVar.f(), listC, listG);
        } else if (aVar.getSplit() != null) {
            pVarY = y(p13.w.c(aVar.getSplit()), listC, listG);
        }
        this.f54979d = pVarY;
        return pVarY;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    public final ArrayList z(dq.a aVar) {
        List<x1> list;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC;
        Integer numA;
        List listB1;
        ArrayList arrayList = new ArrayList();
        if (aVar != null) {
            List<x1> listF = aVar.f();
            List<x1> listC2 = (listF == null || listF.isEmpty()) ? aVar.getSplit() != null ? p13.w.c(aVar.getSplit()) : null : aVar.f();
            if (listC2 != null) {
                Iterator it = listC2.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    x1 x1Var = (x1) next;
                    boolean z14 = i14 == listC2.size() - 1;
                    com.garmin.android.apps.connectmobile.activities.newmodel.a activityChartDetails = aVar.getActivityChartDetails();
                    ?? arrayList2 = new ArrayList();
                    Context context = this.f54976a;
                    if (activityChartDetails == null || (listG = activityChartDetails.G()) == null || (listC = activityChartDetails.C()) == null || (numA = A("DIRECTELEVATION", listG)) == null) {
                        list = listC2;
                        it = it;
                        x1Var = x1Var;
                        i15 = i15;
                    } else {
                        int iIntValue = numA.intValue();
                        Integer numA2 = A("SUMDISTANCE", listG);
                        if (numA2 != null) {
                            int iIntValue2 = numA2.intValue();
                            Integer numA3 = A("DIRECTTIMESTAMP", listG);
                            if (numA3 != null) {
                                int iIntValue3 = numA3.intValue();
                                Integer numA4 = A("sumDuration", listG);
                                if (numA4 != null) {
                                    int iIntValue4 = numA4.intValue();
                                    list = listC2;
                                    ArrayList arrayList3 = new ArrayList(p13.y.r(listC, 10));
                                    Iterator it3 = listC.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((com.garmin.android.apps.connectmobile.activities.newmodel.b) it3.next()).C().get(iIntValue));
                                    }
                                    ArrayList arrayList4 = new ArrayList(p13.y.r(listC, 10));
                                    Iterator it4 = listC.iterator();
                                    while (it4.hasNext()) {
                                        arrayList4.add(((com.garmin.android.apps.connectmobile.activities.newmodel.b) it4.next()).C().get(iIntValue2));
                                    }
                                    ArrayList arrayList5 = new ArrayList(p13.y.r(listC, 10));
                                    Iterator it5 = listC.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(((com.garmin.android.apps.connectmobile.activities.newmodel.b) it5.next()).C().get(iIntValue3));
                                    }
                                    ArrayList arrayList6 = new ArrayList(p13.y.r(listC, 10));
                                    Iterator it6 = listC.iterator();
                                    while (it6.hasNext()) {
                                        arrayList6.add(((com.garmin.android.apps.connectmobile.activities.newmodel.b) it6.next()).C().get(iIntValue4));
                                    }
                                    DateTime startDateTime = x1Var.getStartDateTime();
                                    if (startDateTime != null) {
                                        long millis = startDateTime.getMillis();
                                        DateTime endDateTime = x1Var.getEndDateTime();
                                        if (endDateTime != null) {
                                            long millis2 = endDateTime.getMillis();
                                            ArrayList arrayList7 = new ArrayList(p13.y.r(arrayList5, 10));
                                            for (Iterator it7 = arrayList5.iterator(); it7.hasNext(); it7 = it7) {
                                                arrayList7.add(Long.valueOf((long) ((Number) it7.next()).doubleValue()));
                                            }
                                            int iR = f0.r(millis, arrayList7);
                                            ArrayList arrayList8 = new ArrayList(p13.y.r(arrayList5, 10));
                                            Iterator it8 = arrayList5.iterator();
                                            while (it8.hasNext()) {
                                                arrayList8.add(Long.valueOf((long) ((Number) it8.next()).doubleValue()));
                                            }
                                            listB1 = h0.b1(new j23.l(iR, f0.r(millis2, arrayList8)));
                                        } else {
                                            listB1 = null;
                                        }
                                    } else {
                                        listB1 = null;
                                    }
                                    if (listB1 != null) {
                                        ArrayList arrayList9 = new ArrayList(p13.y.r(listB1, 10));
                                        for (Iterator it9 = listB1.iterator(); it9.hasNext(); it9 = it9) {
                                            int iIntValue5 = ((Number) it9.next()).intValue();
                                            double dDoubleValue = ((Number) arrayList4.get(iIntValue5)).doubleValue();
                                            double dDoubleValue2 = ((Number) arrayList3.get(iIntValue5)).doubleValue();
                                            ArrayList arrayList10 = arrayList4;
                                            ArrayList arrayList11 = arrayList6;
                                            String strI = com.nimbusds.jose.shaded.gson.internal.a.i("mm:ss", new DateTime(TimeUnit.SECONDS.toMillis((long) ((Number) arrayList6.get(iIntValue5)).doubleValue()), DateTimeZone.UTC));
                                            Double dValueOf = Double.valueOf(dDoubleValue2);
                                            int i16 = m00.a.f115515e;
                                            m00.a aVar2 = this.f54977b;
                                            arrayList9.add(new Entry((float) dDoubleValue, (float) dDoubleValue2, new v(strI, aVar2.a(dValueOf, true), context.getString(R.string.activity_details_elevation), aVar2.d(x1Var.getAverageGrade()), context.getString(R.string.lbl_grade))));
                                            arrayList4 = arrayList10;
                                            arrayList6 = arrayList11;
                                        }
                                        arrayList2.addAll(arrayList9);
                                        if (!z14) {
                                            im.l lVar = new im.l(((Entry) h0.m0(arrayList2)).getX(), ((Entry) h0.m0(arrayList2)).getY());
                                            lVar.setLineWidth(f54975e);
                                            lVar.setLineColor(context.getColor(R.color.gcm_background_hero));
                                            this.f54978c.add(lVar);
                                        }
                                        arrayList2 = h0.N0(arrayList2, new b());
                                    }
                                } else {
                                    list = listC2;
                                    it = it;
                                    x1Var = x1Var;
                                    i15 = i15;
                                }
                            } else {
                                list = listC2;
                                it = it;
                                x1Var = x1Var;
                                i15 = i15;
                            }
                        } else {
                            list = listC2;
                            it = it;
                            x1Var = x1Var;
                            i15 = i15;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        LineDataSet lineDataSet = new LineDataSet(arrayList2, "");
                        lineDataSet.setDrawValues(false);
                        lineDataSet.setDrawCircleHole(false);
                        lineDataSet.setDrawCircles(false);
                        lineDataSet.setDrawHorizontalHighlightIndicator(false);
                        lineDataSet.setDrawFilled(true);
                        y.a aVar3 = y.f55115a;
                        String climbProDifficulty = x1Var.getClimbProDifficulty();
                        aVar3.getClass();
                        lineDataSet.setColor(context.getColor(y.a.b(climbProDifficulty)));
                        lineDataSet.setFillColor(context.getColor(y.a.b(x1Var.getClimbProDifficulty())));
                        lineDataSet.setFillAlpha(255);
                        lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
                        lineDataSet.setHighlightLineWidth(1.0f);
                        arrayList.add(lineDataSet);
                    }
                    it = it;
                    listC2 = list;
                    i14 = i15;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: cq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcq/a$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "LIMIT_LINE_WIDTH", "", "X_AXIS_LABEL_COUNT", "I", "", "TIME_PATTERN_WITH_SECONDS", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1197a {
        public /* synthetic */ C1197a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1197a() {
        }
    }
}
