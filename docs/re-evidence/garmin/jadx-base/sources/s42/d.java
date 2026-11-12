package s42;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import g22.k;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import org.joda.time.DateTime;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ls42/d;", "Lqz/c;", "Ls42/c;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.c<c, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f157077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f157078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f157079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f157080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f157081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f157082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f157083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f157084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f157085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f157086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f157087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f157088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DateTimeFormatter f157089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final pi0.e f157090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f157091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f157092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f157093r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157094a;

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
            f157094a = iArr;
        }
    }

    static {
        new a(null);
    }

    public d(Context context, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f157076a = context;
        this.f157077b = dateTime;
        this.f157078c = dateTime2;
        this.f157079d = a7.b.getColor(context, R.color.gcm_chart_weight_data_set);
        this.f157080e = a7.b.getColor(context, R.color.gcm_chart_weight_goal);
        this.f157081f = a7.b.getColor(context, R.color.gcm_chart_weight_bmi_data_set);
        this.f157082g = a7.b.getColor(context, R.color.gcm_chart_weight_body_fat_data_set);
        this.f157083h = a7.b.getColor(context, R.color.gcm_chart_weight_muscle_mass_data_set);
        this.f157084i = a7.b.getColor(context, R.color.gcm_chart_weight_bone_mass_data_set);
        this.f157085j = a7.b.getColor(context, R.color.gcm_chart_weight_body_water_data_set);
        this.f157086k = a7.b.getColor(context, R.color.gcm_chart_weight_high_low_data_set);
        this.f157087l = a7.b.getColor(context, R.color.gcm_chart_weight_pregnancy_gain_goal_data_set);
        this.f157088m = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
        this.f157089n = DateTimeFormat.forPattern("M/yy");
        this.f157090o = new pi0.e(context);
        this.f157091p = new h(context);
        String string = context.getString(R.string.stress_level_high);
        string.getClass();
        this.f157092q = string;
        String string2 = context.getString(R.string.stress_level_low);
        string2.getClass();
        this.f157093r = string2;
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
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(c cVar) {
        float f14;
        List list;
        List list2;
        boolean z14;
        DateTime dateTime;
        p pVar;
        Double dValueOf;
        List<l42.d> list3;
        List list4;
        List list5;
        int i14;
        float fFloatValue;
        float fFloatValue2;
        int i15;
        String str;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Double dValueOf5;
        String str2;
        Double weight;
        l42.c cVar2;
        List list6;
        if (cVar == null) {
            return j0.f134944a;
        }
        List<l42.d> list7 = cVar.f157074b;
        zk0.g gVar = cVar.f157075c;
        List<zk0.f> listA = gVar != null ? gVar.a() : null;
        ArrayList arrayList = new ArrayList();
        List list8 = j0.f134944a;
        List<l42.b> listB = cVar.f157073a.b();
        if (listB.isEmpty()) {
            return list8;
        }
        Iterator<l42.d> it = list7.iterator();
        List list9 = list8;
        List list10 = list9;
        while (it.hasNext()) {
            l42.d next = it.next();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            DateTime dateTime2 = this.f157077b;
            listA = listA;
            DateTime dateTimePlusDays = dateTime2;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int i18 = 1;
                dateTime = this.f157078c;
                if (i16 != size) {
                    if (!dateTimePlusDays.isBefore(dateTime)) {
                        c22.j0.f23099a.getClass();
                        if (!c22.j0.F(dateTimePlusDays, dateTime)) {
                        }
                    }
                    l42.b bVar = listB.get((size - i16) - 1);
                    List<l42.b> list11 = listB;
                    DateTime dateTimeD = bVar.d();
                    l42.c cVarF = bVar.f();
                    if (cVarF != null) {
                        k42.b.f102880a.getClass();
                        dValueOf = Double.valueOf(k42.b.n(cVarF, next));
                    } else {
                        dValueOf = null;
                    }
                    c22.j0.f23099a.getClass();
                    if (c22.j0.F(dateTimePlusDays, dateTimeD)) {
                        Double minWeight = bVar.getMinWeight();
                        if (minWeight != null) {
                            double dDoubleValue = minWeight.doubleValue();
                            k42.b bVar2 = k42.b.f102880a;
                            l3.f23124b.getClass();
                            double dC = k42.b.c(l3.a.P1(dDoubleValue));
                            bVar2.getClass();
                            fFloatValue = k42.b.t(dC).floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        Double maxWeight = bVar.getMaxWeight();
                        if (maxWeight != null) {
                            double dDoubleValue2 = maxWeight.doubleValue();
                            k42.b bVar3 = k42.b.f102880a;
                            l3.f23124b.getClass();
                            double dC2 = k42.b.c(l3.a.P1(dDoubleValue2));
                            bVar3.getClass();
                            fFloatValue2 = k42.b.t(dC2).floatValue();
                        } else {
                            fFloatValue2 = 0.0f;
                        }
                        if (fFloatValue > 0.0f && fFloatValue2 > 0.0f && fFloatValue != fFloatValue2) {
                            arrayList3.add(new CandleEntry(i17, fFloatValue2, fFloatValue, 0.0f, fFloatValue));
                        }
                        if (zf.b.D(dValueOf)) {
                            i15 = i16;
                            i14 = size;
                            list3 = list7;
                            if (Double.compare(dValueOf.doubleValue(), 0.0d) != 0) {
                                float f15 = i17;
                                k42.b bVar4 = k42.b.f102880a;
                                double dDoubleValue3 = dValueOf.doubleValue();
                                bVar4.getClass();
                                float fFloatValue3 = k42.b.t(dDoubleValue3).floatValue();
                                l42.c cVarF2 = bVar.f();
                                ArrayList arrayList4 = new ArrayList();
                                String strA = this.f157090o.a(bVar.d(), qi0.a.RELATIVE_YEAR_MONTH_DAY);
                                Context context = this.f157076a;
                                String strQ = k42.b.q(context);
                                Iterator<l42.d> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    String str3 = strQ;
                                    l42.d next2 = it3.next();
                                    it3 = it3;
                                    list10 = list10;
                                    if (list3.size() > i18) {
                                        String string = context.getString(next2.f109936b);
                                        if (next2 == l42.d.MUSCLE_MASS) {
                                            string = "SMM";
                                        }
                                        str = string;
                                    } else {
                                        str = null;
                                    }
                                    if (cVarF2 != null) {
                                        k42.b.f102880a.getClass();
                                        dValueOf2 = Double.valueOf(k42.b.n(cVarF2, next2));
                                    } else {
                                        dValueOf2 = null;
                                    }
                                    int i19 = b.f157094a[next2.ordinal()];
                                    h hVar = this.f157091p;
                                    switch (i19) {
                                        case 1:
                                            l42.c cVar3 = cVarF2;
                                            List list12 = list9;
                                            Double maxWeight2 = bVar.getMaxWeight();
                                            if (maxWeight2 != null) {
                                                double dDoubleValue4 = maxWeight2.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf3 = Double.valueOf(l3.a.P1(dDoubleValue4));
                                            } else {
                                                dValueOf3 = null;
                                            }
                                            Double minWeight2 = bVar.getMinWeight();
                                            if (minWeight2 != null) {
                                                double dDoubleValue5 = minWeight2.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf4 = Double.valueOf(l3.a.P1(dDoubleValue5));
                                            } else {
                                                dValueOf4 = null;
                                            }
                                            l42.c cVarF3 = bVar.f();
                                            if (cVarF3 == null || (weight = cVarF3.getWeight()) == null) {
                                                dValueOf5 = null;
                                            } else {
                                                double dDoubleValue6 = weight.doubleValue();
                                                l3.f23124b.getClass();
                                                dValueOf5 = Double.valueOf(l3.a.P1(dDoubleValue6));
                                            }
                                            String string2 = context.getString(R.string.lbl_last);
                                            string2.getClass();
                                            Context context2 = context;
                                            String strE = h.e(hVar, dValueOf4, 6);
                                            String strE2 = h.e(hVar, dValueOf3, 6);
                                            String strE3 = h.e(hVar, dValueOf5, 6);
                                            if (s.d(dValueOf3, dValueOf4) && s.d(dValueOf3, dValueOf5)) {
                                                str2 = str3;
                                            } else {
                                                str2 = str3;
                                                arrayList4.add(new l(strA, strE, this.f157093r, str2, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                                arrayList4.add(new l(strA, strE2, this.f157092q, str2, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            }
                                            arrayList4.add(new l(strA, strE3, string2, str2, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            strQ = str2;
                                            cVarF2 = cVar3;
                                            list9 = list12;
                                            context = context2;
                                            i18 = 1;
                                            break;
                                        case 2:
                                            cVar2 = cVarF2;
                                            list6 = list9;
                                            if (dValueOf2 != null && dValueOf2.doubleValue() > 0.0d) {
                                                hVar.getClass();
                                                arrayList4.add(new l(strA, k42.b.d(dValueOf2, "", l3.f23126d), str, null, null, null, null, null, 248, null));
                                            }
                                            list9 = list6;
                                            strQ = str3;
                                            cVarF2 = cVar2;
                                            i18 = 1;
                                            break;
                                        case 3:
                                        case 4:
                                            cVar2 = cVarF2;
                                            list6 = list9;
                                            if (zf.b.D(dValueOf2) && dValueOf2.doubleValue() > 0.0d) {
                                                arrayList4.add(new l(strA, h.e(hVar, dValueOf2, 4), str, str3, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                                            }
                                            list9 = list6;
                                            strQ = str3;
                                            cVarF2 = cVar2;
                                            i18 = 1;
                                            break;
                                        case 5:
                                        case 6:
                                            if (!zf.b.D(dValueOf2) || dValueOf2.doubleValue() <= 0.0d) {
                                                strQ = str3;
                                            } else {
                                                list6 = list9;
                                                double dDoubleValue7 = dValueOf2.doubleValue();
                                                Context context3 = hVar.f142645a;
                                                k42.b bVar5 = k42.b.f102880a;
                                                cVar2 = cVarF2;
                                                DecimalFormat decimalFormat = l3.f23126d;
                                                bVar5.getClass();
                                                decimalFormat.getClass();
                                                String string3 = context3.getString(R.string.lbl_value_percent, decimalFormat.format(dDoubleValue7));
                                                string3.getClass();
                                                arrayList4.add(new l(strA, string3, str, null, null, null, null, null, 248, null));
                                                list9 = list6;
                                                strQ = str3;
                                                cVarF2 = cVar2;
                                            }
                                            i18 = 1;
                                            break;
                                        default:
                                            u0.r();
                                            return null;
                                    }
                                }
                                list4 = list9;
                                list5 = list10;
                                arrayList2.add(new Entry(f15, fFloatValue3, h0.b1(arrayList4)));
                            }
                            i16 = i15 + 1;
                        } else {
                            list3 = list7;
                            i14 = size;
                            i15 = i16;
                        }
                        list4 = list9;
                        list5 = list10;
                        i16 = i15 + 1;
                    } else {
                        list3 = list7;
                        it = it;
                        list4 = list9;
                        list5 = list10;
                        i14 = size;
                        i17 = i17;
                        arrayList3 = arrayList3;
                    }
                    i17++;
                    dateTimePlusDays = dateTimePlusDays.plusDays(1);
                    dateTimePlusDays.getClass();
                    listB = list11;
                    list7 = list3;
                    size = i14;
                    it = it;
                    arrayList3 = arrayList3;
                    list10 = list5;
                    list9 = list4;
                }
            }
            listB = listB;
            list7 = list7;
            it = it;
            List list13 = list9;
            List list14 = list10;
            p pVar2 = new p(h0.b1(arrayList2), h0.b1(arrayList3));
            List list15 = (List) pVar2.f128594a;
            list8 = (List) pVar2.f128595b;
            arrayList.add(list15);
            if (next == l42.d.WEIGHT) {
                if (listA == null) {
                    j0 j0Var = j0.f134944a;
                    pVar = new p(j0Var, j0Var);
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    DateTime dateTimePlusDays2 = dateTime2;
                    int i24 = 0;
                    while (true) {
                        if (dateTimePlusDays2.isBefore(dateTime) || k.f(dateTimePlusDays2, dateTime)) {
                            for (zk0.f fVar : listA) {
                                DateTime dateTime3 = DateTime.parse(fVar.getStartDate());
                                DateTime dateTime4 = DateTime.parse(fVar.getEndDate());
                                l3.a aVar = l3.f23124b;
                                double lowWeightGoal = fVar.getLowWeightGoal();
                                aVar.getClass();
                                float fC = (float) k42.b.c(l3.a.P1(lowWeightGoal));
                                float fC2 = (float) k42.b.c(l3.a.P1(fVar.getHighWeightGoal()));
                                if (k.f(dateTime3, dateTimePlusDays2) || ((k.f(dateTimePlusDays2, dateTime2) && (dateTime3.isBefore(dateTime2) || k.f(dateTime3, dateTime2))) || (k.f(dateTimePlusDays2, dateTime) && (dateTime4.isAfter(dateTime) || k.f(dateTime4, dateTime))))) {
                                    float f16 = i24;
                                    arrayList5.add(new Entry(f16, fC));
                                    arrayList6.add(new Entry(f16, fC2));
                                }
                            }
                            dateTimePlusDays2 = dateTimePlusDays2.plusDays(1);
                            dateTimePlusDays2.getClass();
                            i24++;
                        } else {
                            pVar = new p(h0.b1(arrayList5), h0.b1(arrayList6));
                        }
                    }
                }
                list9 = (List) pVar.f128594a;
                list10 = (List) pVar.f128595b;
            } else {
                list10 = list14;
                list9 = list13;
            }
        }
        List<l42.d> list16 = list7;
        List list17 = list9;
        List list18 = list10;
        float f17 = 0.0f;
        if (arrayList.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int i25 = 0;
        for (Iterator it4 = arrayList.iterator(); it4.hasNext(); it4 = it4) {
            int i26 = i25 + 1;
            List list19 = (List) it4.next();
            if (list17.isEmpty() || list18.isEmpty()) {
                f14 = f17;
                list = list18;
                list2 = list17;
                z14 = false;
            } else {
                list2 = list17;
                LineDataSet lineDataSet = new LineDataSet(list2, "Pregnancy Weight Goal DataSet");
                lineDataSet.setDrawValues(false);
                YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
                lineDataSet.setAxisDependency(axisDependency);
                int i27 = this.f157087l;
                lineDataSet.setColor(i27);
                lineDataSet.setLineWidth(f17);
                lineDataSet.setFillAlpha(255);
                z14 = false;
                lineDataSet.setDrawCircles(false);
                lineDataSet.setFillColor(i27);
                lineDataSet.setHighlightEnabled(false);
                arrayList7.add(lineDataSet);
                list = list18;
                LineDataSet lineDataSet2 = new LineDataSet(list, "Pregnancy Weight Goal DataSet");
                lineDataSet2.setDrawValues(false);
                lineDataSet2.setAxisDependency(axisDependency);
                lineDataSet2.setColor(i27);
                f14 = 0.0f;
                lineDataSet2.setLineWidth(0.0f);
                lineDataSet2.setFillAlpha(255);
                lineDataSet2.setDrawCircles(false);
                lineDataSet2.setFillColor(i27);
                lineDataSet2.setDrawFilled(true);
                lineDataSet2.setFillFormatter(new yz.a(lineDataSet));
                lineDataSet2.setHighlightEnabled(false);
                arrayList7.add(lineDataSet2);
            }
            LineDataSet lineDataSet3 = new LineDataSet(list19, "Weights DataSet");
            lineDataSet3.setDrawValues(z14);
            if (i25 == 0) {
                lineDataSet3.setAxisDependency(YAxis.AxisDependency.LEFT);
            } else {
                lineDataSet3.setAxisDependency(YAxis.AxisDependency.RIGHT);
            }
            List<l42.d> list20 = list16;
            lineDataSet3.setColor(z(list20.get(i25)));
            lineDataSet3.setLineWidth(2.0f);
            lineDataSet3.setFillAlpha(255);
            lineDataSet3.setCircleRadius(4.0f);
            lineDataSet3.setCircleColor(z(list20.get(i25)));
            lineDataSet3.setFillColor(z(list20.get(i25)));
            lineDataSet3.setDrawCircleHole(false);
            k42.b.f102880a.getClass();
            if (k42.b.r()) {
                lineDataSet3.setHighlightEnabled(true);
                lineDataSet3.setHighLightColor(this.f157088m);
                lineDataSet3.setDrawHorizontalHighlightIndicator(false);
                lineDataSet3.setHighlightLineWidth(2.0f);
            }
            arrayList7.add(lineDataSet3);
            list18 = list;
            i25 = i26;
            list16 = list20;
            f17 = f14;
            list17 = list2;
        }
        List<l42.d> list21 = list16;
        if (!list8.isEmpty()) {
            l42.d dVar = l42.d.WEIGHT;
            if (list21.contains(dVar)) {
                k42.b.f102880a.getClass();
                if (k42.b.r()) {
                    CandleDataSet candleDataSet = new CandleDataSet(list8, "Weights DataSet");
                    candleDataSet.setShadowWidth(8.0f);
                    int i28 = this.f157086k;
                    candleDataSet.setColor(i28);
                    candleDataSet.setShadowColor(i28);
                    candleDataSet.setDecreasingColor(i28);
                    Paint.Style style = Paint.Style.FILL;
                    candleDataSet.setDecreasingPaintStyle(style);
                    candleDataSet.setIncreasingColor(i28);
                    candleDataSet.setIncreasingPaintStyle(style);
                    candleDataSet.setNeutralColor(i28);
                    candleDataSet.disableDashedHighlightLine();
                    candleDataSet.setDrawValues(false);
                    candleDataSet.setShowCandleBar(true);
                    candleDataSet.setHighlightEnabled(false);
                    candleDataSet.setDrawHorizontalHighlightIndicator(false);
                    candleDataSet.setDrawVerticalHighlightIndicator(true);
                    if (list21.get(0) == dVar) {
                        candleDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
                    } else {
                        candleDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
                    }
                    arrayList8.add(candleDataSet);
                }
            }
        }
        return y.s(x.k(arrayList8, arrayList7));
    }

    public final String B(l42.d dVar) {
        int i14 = b.f157094a[dVar.ordinal()];
        Context context = this.f157076a;
        switch (i14) {
            case 1:
                String string = context.getString(R.string.lbl_weight);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.lbl_weight_characteristic_bmi);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.lbl_skeletal_muscle_mass);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.lbl_weight_characteristic_bone_mass);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.lbl_body_fat_percent_sign);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.lbl_body_water_percent_sign);
                string6.getClass();
                return string6;
            default:
                u0.r();
                return null;
        }
    }

    @Override // qz.c
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final List<String> o(c cVar) {
        List<l42.b> listB = cVar != null ? cVar.f157073a.b() : null;
        if (listB == null || listB.isEmpty()) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = this.f157089n;
        dateTimeFormatter.getClass();
        return fz.a.e(this.f157076a, 0, this.f157077b, this.f157078c, dateTimeFormatter);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(c cVar) {
        List<String> listO = o(cVar);
        if (listO != null) {
            return Integer.valueOf(((ArrayList) listO).size());
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(c cVar) {
        return false;
    }

    @Override // qz.c
    public final float e(c cVar) {
        k42.b.f102880a.getClass();
        return k42.b.r() ? -0.5f : 0.0f;
    }

    @Override // qz.c
    public final List f(c cVar) {
        zk0.g gVar;
        List<zk0.e> listB;
        zk0.e eVar;
        c cVar2 = cVar;
        Double dValueOf = (cVar2 == null || (gVar = cVar2.f157075c) == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? null : Double.valueOf(eVar.getGoalValue());
        List<l42.b> listB2 = cVar2 != null ? cVar2.f157073a.b() : null;
        if (listB2 == null || listB2.isEmpty() || !zf.b.D(dValueOf) || dValueOf.doubleValue() <= 0.0d || !cVar2.f157074b.contains(l42.d.WEIGHT)) {
            return null;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue = dValueOf.doubleValue();
        aVar.getClass();
        LimitLine limitLine = new LimitLine((float) k42.b.c(l3.a.P1(dDoubleValue)));
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(this.f157080e);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_light.ttf", this.f157076a));
        return w.c(limitLine);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(c cVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(c cVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        c cVar2 = cVar;
        Double dValueOf = null;
        if ((cVar2 != null ? cVar2.f157074b : null) != null && !cVar2.f157074b.isEmpty()) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(cVar2);
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
                zk0.g gVar = cVar2.f157075c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, cVar2.f157074b.get(0)).f128595b).floatValue();
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(c cVar) {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float m(c cVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        c cVar2 = cVar;
        Double dValueOf = null;
        if ((cVar2 != null ? cVar2.f157074b : null) != null && cVar2.f157074b.size() > 1) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(cVar2);
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
                zk0.g gVar = cVar2.f157075c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, (l42.d) h0.m0(cVar2.f157074b)).f128594a).floatValue();
            }
        }
        return 0.0f;
    }

    @Override // qz.c
    public final Integer p(c cVar) {
        c cVar2 = cVar;
        return ((cVar2 != null ? cVar2.f157074b : null) == null || cVar2.f157074b.size() <= 1) ? null : 4;
    }

    @Override // qz.c
    public final float q(c cVar) {
        List<String> listO = o(cVar);
        Integer numValueOf = listO != null ? Integer.valueOf(((ArrayList) listO).size()) : null;
        if (numValueOf == null) {
            return 0.0f;
        }
        float fIntValue = numValueOf.intValue() - 1.0f;
        k42.b.f102880a.getClass();
        return k42.b.r() ? fIntValue + 0.5f : fIntValue;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(c cVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float t(c cVar) {
        Float fValueOf;
        List<zk0.e> listB;
        zk0.e eVar;
        c cVar2 = cVar;
        Float fValueOf2 = null;
        if ((cVar2 != null ? cVar2.f157074b : null) != null && !cVar2.f157074b.isEmpty()) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(cVar2);
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
                zk0.g gVar = cVar2.f157075c;
                return ((Number) x(fFloatValue, fFloatValue2, Double.valueOf((gVar == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? 0.0d : eVar.getGoalValue()), cVar2.f157074b.get(0)).f128594a).floatValue();
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    @Override // qz.c
    public final List u(c cVar) {
        boolean z14;
        List<zk0.e> listB;
        zk0.e eVar;
        String strB;
        c cVar2 = cVar;
        if (cVar2 != null) {
            zk0.g gVar = cVar2.f157075c;
            l42.k kVar = cVar2.f157073a;
            List<l42.d> list = cVar2.f157074b;
            if (!kVar.b().isEmpty()) {
                Context context = this.f157076a;
                String string = context.getString(R.string.lbl_last_weight);
                string.getClass();
                List<l42.b> listB2 = kVar.b();
                if (listB2 != null && listB2.isEmpty()) {
                    z14 = false;
                    break;
                }
                Iterator<T> it = listB2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    l42.b bVar = (l42.b) it.next();
                    if (zf.b.D(bVar.getMinWeight()) && zf.b.D(bVar.getMaxWeight()) && !s.d(bVar.getMinWeight(), bVar.getMaxWeight())) {
                        z14 = true;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (l42.d dVar : list) {
                    if (dVar != l42.d.WEIGHT) {
                        strB = B(dVar);
                    } else if (z14) {
                        k42.b.f102880a.getClass();
                        if (k42.b.r()) {
                            strB = string;
                        } else {
                            strB = B(dVar);
                        }
                    } else {
                        strB = B(dVar);
                    }
                    arrayList.add(new xz.f(strB, null, Integer.valueOf(z(dVar)), null, xz.g.a.f192745a, null, null, 106, null));
                }
                if (z14 && list.contains(l42.d.WEIGHT)) {
                    k42.b.f102880a.getClass();
                    if (k42.b.r()) {
                        String string2 = context.getString(R.string.lbl_high_low);
                        string2.getClass();
                        arrayList.add(0, new xz.f(string2, null, Integer.valueOf(this.f157086k), null, xz.g.a.f192745a, null, null, 106, null));
                    }
                }
                Double dValueOf = (gVar == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.n0(listB)) == null) ? null : Double.valueOf(eVar.getGoalValue());
                if (zf.b.D(dValueOf) && dValueOf.doubleValue() > 0.0d && list.contains(l42.d.WEIGHT)) {
                    arrayList.add(new xz.f(y(dValueOf.doubleValue(), false), null, Integer.valueOf(this.f157080e), null, new xz.g.c(0, 0.0f, 3, null), null, context.getString(R.string.lbl_chart_ada_dashed_line_legend, y(dValueOf.doubleValue(), true)), 42, null));
                }
                List<zk0.f> listA = gVar != null ? gVar.a() : null;
                if (listA != null && !listA.isEmpty() && list.contains(l42.d.WEIGHT)) {
                    String string3 = context.getString(R.string.pregnancy_gain_goal);
                    string3.getClass();
                    arrayList.add(new xz.f(string3, null, Integer.valueOf(this.f157087l), null, xz.g.a.f192745a, null, null, 106, null));
                }
                return h0.b1(arrayList);
            }
        }
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(c cVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float w(c cVar) {
        Float fValueOf;
        Float fValueOf2;
        List<zk0.e> listB;
        zk0.e eVar;
        c cVar2 = cVar;
        Double dValueOf = null;
        if ((cVar2 != null ? cVar2.f157074b : null) != null && cVar2.f157074b.size() > 1) {
            List<IBarLineScatterCandleBubbleDataSet<?>> listA = a(cVar2);
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
                zk0.g gVar = cVar2.f157075c;
                if (gVar != null && (listB = gVar.b()) != null && (eVar = (zk0.e) h0.n0(listB)) != null) {
                    dValueOf = Double.valueOf(eVar.getGoalValue());
                }
                return ((Number) x(fFloatValue, fFloatValue2, dValueOf, (l42.d) h0.m0(cVar2.f157074b)).f128595b).floatValue();
            }
        }
        return 0.0f;
    }

    public final String y(double d14, boolean z14) {
        l3.f23124b.getClass();
        return com.nimbusds.jose.shaded.gson.internal.a.h(this.f157076a.getString(R.string.lbl_goal), " (", h.c(this.f157091p, Double.valueOf(l3.a.P1(d14)), null, z14, 6), ")");
    }

    public final int z(l42.d dVar) {
        switch (b.f157094a[dVar.ordinal()]) {
            case 1:
                return this.f157079d;
            case 2:
                return this.f157081f;
            case 3:
                return this.f157083h;
            case 4:
                return this.f157084i;
            case 5:
                return this.f157082g;
            case 6:
                return this.f157085j;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Ls42/d$a;", "", "<init>", "()V", "", "WEIGHTS_TAG", "Ljava/lang/String;", "PREGNANCY_WEIGHT_GOAL_TAG", "", "LINE_WIDTH", "F", "CANDLE_WIDTH", "CIRCLE_RADIUS", "DASHED_LINE_LENGTH", "", "DEFAULT_LINE_ALPHA", "I", "Y_AXIS_LABEL_COUNT", "CANDLE_OFFSET", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
