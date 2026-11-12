package s42;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import g22.k;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import q42.h;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ls42/g;", "Lqz/c;", "Ls42/f;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements qz.c<f, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f157104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f157105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f157106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f157107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f157109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f157110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f157111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f157112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f157113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f157114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pi0.e f157115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f157116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f157117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f157118p;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157119a;

        static {
            int[] iArr = new int[l42.d.values().length];
            try {
                iArr[l42.d.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l42.d.BMI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l42.d.MUSCLE_MASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l42.d.BONE_MASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l42.d.BODY_FAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l42.d.BODY_WATER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f157119a = iArr;
        }
    }

    static {
        new a(null);
    }

    public g(Context context, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f157103a = context;
        this.f157104b = dateTime;
        this.f157105c = dateTime2;
        this.f157106d = a7.b.getColor(context, R.color.gcm_chart_weight_data_set);
        this.f157107e = a7.b.getColor(context, R.color.gcm_chart_weight_goal);
        this.f157108f = a7.b.getColor(context, R.color.gcm_chart_weight_bmi_data_set);
        this.f157109g = a7.b.getColor(context, R.color.gcm_chart_weight_body_fat_data_set);
        this.f157110h = a7.b.getColor(context, R.color.gcm_chart_weight_muscle_mass_data_set);
        this.f157111i = a7.b.getColor(context, R.color.gcm_chart_weight_bone_mass_data_set);
        this.f157112j = a7.b.getColor(context, R.color.gcm_chart_weight_body_water_data_set);
        this.f157113k = a7.b.getColor(context, R.color.gcm_chart_weight_pregnancy_gain_goal_data_set);
        this.f157114l = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
        this.f157115m = new pi0.e(context);
        this.f157116n = new h(context);
        String string = context.getString(R.string.stress_level_high);
        string.getClass();
        this.f157117o = string;
        String string2 = context.getString(R.string.stress_level_low);
        string2.getClass();
        this.f157118p = string2;
    }

    public static p x(float f14, float f15, Double d14, l42.d dVar) {
        float fFloor;
        double dCeil;
        float f16;
        if (dVar == l42.d.WEIGHT && zf.b.D(d14) && d14.doubleValue() > 0.0d) {
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            float fC = (float) k42.b.c(l3.a.P1(dDoubleValue));
            float fMax = Math.max(Math.abs(f15 - fC), Math.abs(f14 - fC)) / 6;
            float fMin = Math.min(f14, fC);
            float fMax2 = Math.max(f15, fC);
            fFloor = (float) Math.floor(fMin - fMax);
            dCeil = Math.ceil(fMax2 + fMax);
        } else {
            float fCeil = ((float) Math.ceil(f15 - f14)) / 6;
            fFloor = (float) Math.floor(f14 - fCeil);
            dCeil = Math.ceil(f15 + fCeil);
        }
        float f17 = (float) dCeil;
        float f18 = f17 - fFloor;
        float f19 = f18 % 3;
        if (f19 != 1.0f) {
            if (f19 == 2.0f) {
                f17++;
            } else if (f18 == 0.0f) {
                f17 += 2;
                f16 = 1;
            }
            return new p(Float.valueOf(fFloor), Float.valueOf(f17));
        }
        f16 = 1;
        f17 += f16;
        fFloor -= f16;
        return new p(Float.valueOf(fFloor), Float.valueOf(f17));
    }

    @Override // qz.c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(f fVar) {
        List list;
        boolean z14;
        boolean z15;
        DateTime dateTime;
        p pVar;
        List<l42.d> list2;
        DateTime dateTime2;
        String str;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        if (fVar == null) {
            return j0.f134944a;
        }
        List<l42.d> list3 = fVar.f157101b;
        zk0.g gVar = fVar.f157102c;
        List<zk0.f> listA = gVar != null ? gVar.a() : null;
        ArrayList<List> arrayList = new ArrayList();
        List list4 = j0.f134944a;
        List<l42.f> listB = fVar.f157100a.b();
        if (listB.isEmpty()) {
            return list4;
        }
        Iterator<l42.d> it = list3.iterator();
        List list5 = list4;
        while (it.hasNext()) {
            l42.d next = it.next();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList();
            DateTime dateTime3 = this.f157104b;
            DateTime dateTimePlusDays = dateTime3;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = 1;
                dateTime = this.f157105c;
                if (i15 != size) {
                    if (dateTimePlusDays.isBefore(dateTime)) {
                        listA = listA;
                        it = it;
                    } else {
                        listA = listA;
                        it = it;
                        if (Days.daysBetween(dateTimePlusDays, dateTime).getDays() > 7) {
                        }
                    }
                    l42.f fVar2 = listB.get((size - i15) - 1);
                    l42.g weightAverageDto = fVar2.getWeightAverageDto();
                    List<l42.f> list6 = listB;
                    if (Days.daysBetween(dateTimePlusDays, fVar2.getStartDate()).getDays() <= 7) {
                        k42.b.f102880a.getClass();
                        DateTime dateTime4 = dateTime3;
                        int i17 = i15;
                        double dN = k42.b.n(weightAverageDto, next);
                        dateTime2 = dateTime4;
                        if (zf.b.D(Double.valueOf(dN))) {
                            List<l42.d> list7 = list3;
                            if (Double.compare(dN, 0.0d) != 0) {
                                float f14 = i14;
                                float fFloatValue = k42.b.t(dN).floatValue();
                                l42.g weightAverageDto2 = fVar2.getWeightAverageDto();
                                ArrayList arrayList3 = new ArrayList();
                                Context context = this.f157103a;
                                String strQ = k42.b.q(context);
                                list2 = list7;
                                String strL = this.f157115m.l(fVar2.getStartDate(), fVar2.b(), pi0.f.SHORT_MONTH_NO_WEEKDAY);
                                Iterator<l42.d> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    l42.d next2 = it3.next();
                                    if (list2.size() > i16) {
                                        String string = context.getString(next2.f109936b);
                                        if (next2 == l42.d.MUSCLE_MASS) {
                                            string = "SMM";
                                        }
                                        str = string;
                                    } else {
                                        str = null;
                                    }
                                    k42.b bVar = k42.b.f102880a;
                                    bVar.getClass();
                                    double dN2 = k42.b.n(weightAverageDto2, next2);
                                    int i18 = b.f157119a[next2.ordinal()];
                                    Iterator<l42.d> it4 = it3;
                                    h hVar = this.f157116n;
                                    switch (i18) {
                                        case 1:
                                            Double maxWeight = fVar2.getMaxWeight();
                                            if (maxWeight != null) {
                                                double dDoubleValue = maxWeight.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf = Double.valueOf(l3.a.P1(dDoubleValue));
                                            } else {
                                                dValueOf = null;
                                            }
                                            Double minWeight = fVar2.getMinWeight();
                                            if (minWeight != null) {
                                                double dDoubleValue2 = minWeight.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf2 = Double.valueOf(l3.a.P1(dDoubleValue2));
                                            } else {
                                                dValueOf2 = null;
                                            }
                                            Double weight = fVar2.getWeightAverageDto().getWeight();
                                            if (weight != null) {
                                                double dDoubleValue3 = weight.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf3 = Double.valueOf(l3.a.P1(dDoubleValue3));
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            l42.g gVar2 = weightAverageDto2;
                                            String string2 = context.getString(R.string.lbl_weekly_avg);
                                            string2.getClass();
                                            Context context2 = context;
                                            String strE = h.e(hVar, dValueOf2, 6);
                                            String strE2 = h.e(hVar, dValueOf, 6);
                                            String strE3 = h.e(hVar, dValueOf3, 6);
                                            if (!s.d(dValueOf, dValueOf2) || !s.d(dValueOf, dValueOf3)) {
                                                arrayList3.add(new l(strL, strE, this.f157118p, strQ, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                                arrayList3.add(new l(strL, strE2, this.f157117o, strQ, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            }
                                            arrayList3.add(new l(strL, strE3, string2, strQ, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            weightAverageDto2 = gVar2;
                                            context = context2;
                                            break;
                                        case 2:
                                            if (dN2 > 0.0d) {
                                                hVar.getClass();
                                                arrayList3.add(new l(strL, k42.b.d(Double.valueOf(dN2), "", l3.f23126d), str, null, null, null, null, null, 248, null));
                                            }
                                            break;
                                        case 3:
                                        case 4:
                                            if (zf.b.D(Double.valueOf(dN2)) && dN2 > 0.0d) {
                                                arrayList3.add(new l(strL, h.e(hVar, Double.valueOf(dN2), 4), str, strQ, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            }
                                            break;
                                        case 5:
                                        case 6:
                                            if (zf.b.D(Double.valueOf(dN2)) && dN2 > 0.0d) {
                                                Context context3 = hVar.f142645a;
                                                DecimalFormat decimalFormat = l3.f23126d;
                                                bVar.getClass();
                                                decimalFormat.getClass();
                                                String string3 = context3.getString(R.string.lbl_value_percent, decimalFormat.format(dN2));
                                                string3.getClass();
                                                arrayList3.add(new l(strL, string3, str, null, null, null, null, null, 248, null));
                                            }
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                    it3 = it4;
                                    i16 = 1;
                                }
                                arrayList2.add(new Entry(f14, fFloatValue, h0.b1(arrayList3)));
                            } else {
                                list2 = list7;
                            }
                            i15 = i17 + 1;
                        } else {
                            list2 = list3;
                        }
                        i15 = i17 + 1;
                    } else {
                        list2 = list3;
                        list5 = list5;
                        i14 = i14;
                        size = size;
                        dateTime2 = dateTime3;
                    }
                    i14++;
                    dateTimePlusDays = dateTimePlusDays.plusDays(7);
                    dateTimePlusDays.getClass();
                    it = it;
                    listA = listA;
                    listB = list6;
                    dateTime3 = dateTime2;
                    list3 = list2;
                    size = size;
                    list5 = list5;
                } else {
                    listA = listA;
                    it = it;
                }
            }
            listB = listB;
            list3 = list3;
            List list8 = list5;
            DateTime dateTime5 = dateTime3;
            arrayList.add(h0.b1(arrayList2));
            if (next == l42.d.WEIGHT) {
                if (listA == null) {
                    j0 j0Var = j0.f134944a;
                    pVar = new p(j0Var, j0Var);
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    DateTime dateTimePlusDays2 = dateTime5;
                    int i19 = 0;
                    while (true) {
                        if (dateTimePlusDays2.isBefore(dateTime) || k.f(dateTimePlusDays2, dateTime)) {
                            for (zk0.f fVar3 : listA) {
                                DateTime dateTime6 = DateTime.parse(fVar3.getStartDate());
                                DateTime dateTime7 = DateTime.parse(fVar3.getEndDate());
                                l3.a aVar = l3.f23124b;
                                double lowWeightGoal = fVar3.getLowWeightGoal();
                                aVar.getClass();
                                float fC = (float) k42.b.c(l3.a.P1(lowWeightGoal));
                                float fC2 = (float) k42.b.c(l3.a.P1(fVar3.getHighWeightGoal()));
                                if ((dateTime6.isBefore(dateTimePlusDays2) && dateTime7.isAfter(dateTimePlusDays2)) || k.f(dateTimePlusDays2, dateTime6) || k.f(dateTimePlusDays2, dateTime7)) {
                                    float f15 = i19;
                                    arrayList4.add(new Entry(f15, fC));
                                    arrayList5.add(new Entry(f15, fC2));
                                }
                            }
                            dateTimePlusDays2 = dateTimePlusDays2.plusDays(7);
                            dateTimePlusDays2.getClass();
                            i19++;
                        } else {
                            pVar = new p(h0.b1(arrayList4), h0.b1(arrayList5));
                        }
                    }
                }
                list4 = (List) pVar.f128594a;
                list5 = (List) pVar.f128595b;
            } else {
                list5 = list8;
            }
        }
        List<l42.d> list9 = list3;
        List list10 = list5;
        if (arrayList.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int i24 = 0;
        for (List list11 : arrayList) {
            int i25 = i24 + 1;
            if (list4.isEmpty() || list10.isEmpty()) {
                list = list10;
                z14 = false;
            } else {
                LineDataSet lineDataSet = new LineDataSet(list4, "Pregnancy Weight Goal DataSet");
                z14 = false;
                lineDataSet.setDrawValues(false);
                YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
                lineDataSet.setAxisDependency(axisDependency);
                int i26 = this.f157113k;
                lineDataSet.setColor(i26);
                lineDataSet.setLineWidth(0.0f);
                lineDataSet.setFillAlpha(255);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setFillColor(i26);
                lineDataSet.setHighlightEnabled(false);
                arrayList6.add(lineDataSet);
                list = list10;
                LineDataSet lineDataSet2 = new LineDataSet(list, "Pregnancy Weight Goal DataSet");
                lineDataSet2.setDrawValues(false);
                lineDataSet2.setAxisDependency(axisDependency);
                lineDataSet2.setColor(i26);
                lineDataSet2.setLineWidth(0.0f);
                lineDataSet2.setFillAlpha(255);
                lineDataSet2.setDrawCircles(false);
                lineDataSet2.setFillColor(i26);
                lineDataSet2.setDrawFilled(true);
                lineDataSet2.setFillFormatter(new yz.a(lineDataSet));
                lineDataSet2.setHighlightEnabled(false);
                arrayList6.add(lineDataSet2);
            }
            LineDataSet lineDataSet3 = new LineDataSet(list11, "Weights DataSet");
            lineDataSet3.setDrawValues(z14);
            if (i24 == 0) {
                lineDataSet3.setAxisDependency(YAxis.AxisDependency.LEFT);
            } else {
                lineDataSet3.setAxisDependency(YAxis.AxisDependency.RIGHT);
            }
            List<l42.d> list12 = list9;
            lineDataSet3.setColor(z(list12.get(i24)));
            lineDataSet3.setLineWidth(2.0f);
            lineDataSet3.setFillAlpha(255);
            if (list11.size() == 1) {
                lineDataSet3.setCircleRadius(4.0f);
                z15 = false;
            } else {
                z15 = false;
                lineDataSet3.setDrawCircles(false);
            }
            lineDataSet3.setCircleColor(z(list12.get(i24)));
            lineDataSet3.setFillColor(z(list12.get(i24)));
            lineDataSet3.setDrawCircleHole(z15);
            k42.b.f102880a.getClass();
            if (k42.b.r()) {
                lineDataSet3.setHighlightEnabled(true);
                lineDataSet3.setHighLightColor(this.f157114l);
                lineDataSet3.setDrawHorizontalHighlightIndicator(z15);
                lineDataSet3.setHighlightLineWidth(2.0f);
            }
            arrayList6.add(lineDataSet3);
            i24 = i25;
            list10 = list;
            list9 = list12;
        }
        return y.s(x.k(arrayList7, arrayList6));
    }

    @Override // qz.c
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ArrayList o(f fVar) {
        List<l42.f> listB = fVar != null ? fVar.f157100a.b() : null;
        if (listB == null || listB.isEmpty()) {
            return null;
        }
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
        dateTimeFormatterForPattern.getClass();
        return gl1.d.C(this.f157103a, this.f157104b, dateTimeFormatterForPattern);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(f fVar) {
        ArrayList arrayListO = o(fVar);
        if (arrayListO != null) {
            return Integer.valueOf(arrayListO.size());
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(f fVar) {
        return false;
    }

    @Override // qz.c
    public final float e(f fVar) {
        k42.b.f102880a.getClass();
        return k42.b.r() ? -0.5f : 0.0f;
    }

    @Override // qz.c
    public final List f(f fVar) {
        zk0.g gVar;
        List<zk0.e> listB;
        zk0.e eVar;
        f fVar2 = fVar;
        Double dValueOf = (fVar2 == null || (gVar = fVar2.f157102c) == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? null : Double.valueOf(eVar.getGoalValue());
        List<l42.f> listB2 = fVar2 != null ? fVar2.f157100a.b() : null;
        if (listB2 == null || listB2.isEmpty() || !zf.b.D(dValueOf) || dValueOf.doubleValue() <= 0.0d || !fVar2.f157101b.contains(l42.d.WEIGHT)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = dValueOf.doubleValue();
        aVar.getClass();
        LimitLine limitLine = new LimitLine((float) k42.b.c(l3.a.P1(dDoubleValue)));
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(this.f157107e);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_light.ttf", this.f157103a));
        return w.c(limitLine);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(f fVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(f fVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        f fVar2 = fVar;
        Double dValueOf = null;
        if ((fVar2 != null ? fVar2.f157101b : null) != null && !fVar2.f157101b.isEmpty()) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(fVar2);
            if (!listA.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((IBarLineScatterCandleBubbleDataSet) obj).getYMin() > 0.0f) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    float yMin = ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin();
                    while (it.hasNext()) {
                        yMin = Math.min(yMin, ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin());
                    }
                    fValueOf = Float.valueOf(yMin);
                } else {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                Iterator<T> it3 = listA.iterator();
                if (it3.hasNext()) {
                    float yMax = ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax();
                    while (it3.hasNext()) {
                        yMax = Math.max(yMax, ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax());
                    }
                    fValueOf2 = Float.valueOf(yMax);
                } else {
                    fValueOf2 = null;
                }
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
                zk0.g gVar = fVar2.f157102c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, fVar2.f157101b.get(0)).f128595b).floatValue();
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(f fVar) {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float m(f fVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        f fVar2 = fVar;
        Double dValueOf = null;
        if ((fVar2 != null ? fVar2.f157101b : null) != null && fVar2.f157101b.size() > 1) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(fVar2);
            if (!listA.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((IBarLineScatterCandleBubbleDataSet) obj).getYMin() > 0.0f) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    float yMin = ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin();
                    while (it.hasNext()) {
                        yMin = Math.min(yMin, ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin());
                    }
                    fValueOf = Float.valueOf(yMin);
                } else {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                Iterator<T> it3 = listA.iterator();
                if (it3.hasNext()) {
                    float yMax = ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax();
                    while (it3.hasNext()) {
                        yMax = Math.max(yMax, ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax());
                    }
                    fValueOf2 = Float.valueOf(yMax);
                } else {
                    fValueOf2 = null;
                }
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
                zk0.g gVar = fVar2.f157102c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, (l42.d) h0.m0(fVar2.f157101b)).f128594a).floatValue();
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final Integer p(f fVar) {
        f fVar2 = fVar;
        return ((fVar2 != null ? fVar2.f157101b : null) == null || fVar2.f157101b.size() <= 1) ? null : 4;
    }

    @Override // qz.c
    public final float q(f fVar) {
        ArrayList arrayListO = o(fVar);
        Integer numValueOf = arrayListO != null ? Integer.valueOf(arrayListO.size()) : null;
        if (numValueOf == null) {
            return 0.0f;
        }
        float fIntValue = numValueOf.intValue() - 1.0f;
        k42.b.f102880a.getClass();
        return k42.b.r() ? fIntValue + 0.5f : fIntValue;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(f fVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float t(f fVar) {
        Float fValueOf;
        List<zk0.e> listB;
        zk0.e eVar;
        f fVar2 = fVar;
        Float fValueOf2 = null;
        if ((fVar2 != null ? fVar2.f157101b : null) != null && !fVar2.f157101b.isEmpty()) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(fVar2);
            if (!listA.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((IBarLineScatterCandleBubbleDataSet) obj).getYMin() > 0.0f) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    float yMin = ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin();
                    while (it.hasNext()) {
                        yMin = Math.min(yMin, ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin());
                    }
                    fValueOf = Float.valueOf(yMin);
                } else {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                Iterator<T> it3 = listA.iterator();
                if (it3.hasNext()) {
                    float yMax = ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax();
                    while (it3.hasNext()) {
                        yMax = Math.max(yMax, ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax());
                    }
                    fValueOf2 = Float.valueOf(yMax);
                }
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
                zk0.g gVar = fVar2.f157102c;
                return ((Number) x(fFloatValue, fFloatValue2, Double.valueOf((gVar == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? 0.0d : eVar.getGoalValue()), fVar2.f157101b.get(0)).f128594a).floatValue();
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final List u(f fVar) {
        List<zk0.e> listB;
        zk0.e eVar;
        String string;
        f fVar2 = fVar;
        if (fVar2 != null) {
            zk0.g gVar = fVar2.f157102c;
            List<l42.d> list = fVar2.f157101b;
            if (!fVar2.f157100a.b().isEmpty()) {
                Context context = this.f157103a;
                String strG = e5.g(context.getString(R.string.sleep_lbl_average_prefix), StringUtils.SPACE, context.getString(R.string.lbl_body_weight));
                ArrayList arrayList = new ArrayList();
                for (l42.d dVar : list) {
                    if (dVar == l42.d.WEIGHT) {
                        string = strG;
                    } else {
                        switch (b.f157119a[dVar.ordinal()]) {
                            case 1:
                                string = context.getString(R.string.lbl_weight);
                                string.getClass();
                                break;
                            case 2:
                                string = context.getString(R.string.lbl_weight_characteristic_bmi);
                                string.getClass();
                                break;
                            case 3:
                                string = context.getString(R.string.lbl_skeletal_muscle_mass);
                                string.getClass();
                                break;
                            case 4:
                                string = context.getString(R.string.lbl_weight_characteristic_bone_mass);
                                string.getClass();
                                break;
                            case 5:
                                string = context.getString(R.string.lbl_body_fat_percent_sign);
                                string.getClass();
                                break;
                            case 6:
                                string = context.getString(R.string.lbl_body_water_percent_sign);
                                string.getClass();
                                break;
                            default:
                                u0.r();
                                return null;
                        }
                    }
                    arrayList.add(new xz.f(string, null, Integer.valueOf(z(dVar)), null, xz.g.a.f192745a, null, null, 106, null));
                }
                Double dValueOf = (gVar == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? null : Double.valueOf(eVar.getGoalValue());
                if (zf.b.D(dValueOf) && dValueOf.doubleValue() > 0.0d && list.contains(l42.d.WEIGHT)) {
                    arrayList.add(new xz.f(y(dValueOf.doubleValue(), false), null, Integer.valueOf(this.f157107e), null, new xz.g.c(0, 0.0f, 3, null), null, context.getString(R.string.lbl_chart_ada_dashed_line_legend, y(dValueOf.doubleValue(), true)), 42, null));
                }
                List<zk0.f> listA = gVar != null ? gVar.a() : null;
                if (listA != null && !listA.isEmpty() && list.contains(l42.d.WEIGHT)) {
                    String string2 = context.getString(R.string.pregnancy_gain_goal);
                    string2.getClass();
                    arrayList.add(new xz.f(string2, null, Integer.valueOf(this.f157113k), null, xz.g.a.f192745a, null, null, 106, null));
                }
                return h0.b1(arrayList);
            }
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(f fVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float w(f fVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        f fVar2 = fVar;
        Double dValueOf = null;
        if ((fVar2 != null ? fVar2.f157101b : null) != null && fVar2.f157101b.size() > 1) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(fVar2);
            if (!listA.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    if (((IBarLineScatterCandleBubbleDataSet) obj).getYMin() > 0.0f) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    float yMin = ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin();
                    while (it.hasNext()) {
                        yMin = Math.min(yMin, ((IBarLineScatterCandleBubbleDataSet) it.next()).getYMin());
                    }
                    fValueOf = Float.valueOf(yMin);
                } else {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
                Iterator<T> it3 = listA.iterator();
                if (it3.hasNext()) {
                    float yMax = ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax();
                    while (it3.hasNext()) {
                        yMax = Math.max(yMax, ((IBarLineScatterCandleBubbleDataSet) it3.next()).getYMax());
                    }
                    fValueOf2 = Float.valueOf(yMax);
                } else {
                    fValueOf2 = null;
                }
                float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
                zk0.g gVar = fVar2.f157102c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, (l42.d) h0.m0(fVar2.f157101b)).f128595b).floatValue();
            }
        }
        return 0.0f;
    }

    public final String y(double d14, boolean z14) {
        l3.f23124b.getClass();
        return com.nimbusds.jose.shaded.gson.internal.a.h(this.f157103a.getString(R.string.lbl_goal), " (", h.c(this.f157116n, Double.valueOf(l3.a.P1(d14)), null, z14, 6), ")");
    }

    public final int z(l42.d dVar) {
        switch (b.f157119a[dVar.ordinal()]) {
            case 1:
                return this.f157106d;
            case 2:
                return this.f157108f;
            case 3:
                return this.f157110h;
            case 4:
                return this.f157111i;
            case 5:
                return this.f157109g;
            case 6:
                return this.f157112j;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Ls42/g$a;", "", "<init>", "()V", "", "WEIGHTS_TAG", "Ljava/lang/String;", "PREGNANCY_WEIGHT_GOAL_TAG", "", "LINE_WIDTH", "F", "CIRCLE_RADIUS", "DASHED_LINE_LENGTH", "", "DEFAULT_LINE_ALPHA", "I", "Y_AXIS_LABEL_COUNT", "CANDLE_OFFSET", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
