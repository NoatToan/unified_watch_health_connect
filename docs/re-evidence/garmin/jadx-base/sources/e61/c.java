package e61;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import gg1.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.m;
import o13.p;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import p13.y;
import xz.f;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Le61/c;", "Lqz/c;", "", "Lx61/e;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lc61/a;", "acclimationType", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lc61/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<List<? extends x61.e>, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f63169o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f63171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f63172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c61.a f63173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pi0.e f63174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yz.b f63175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f63176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f63177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f63178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f63179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f63180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f63181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f63182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f63183n;

    static {
        new a(null);
    }

    public c(Context context, LocalDate localDate, LocalDate localDate2, c61.a aVar) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        aVar.getClass();
        this.f63170a = context;
        this.f63171b = localDate;
        this.f63172c = localDate2;
        this.f63173d = aVar;
        this.f63174e = new pi0.e(context);
        this.f63175f = new yz.b(0);
        this.f63176g = m.b(new e51.c(2));
        this.f63177h = m.b(new e51.c(3));
        String string = aVar == c61.a.HEAT ? context.getString(R.string.lbl_heat_acclimation) : context.getString(R.string.device_settings_pulse_ox_acclimation_label);
        string.getClass();
        this.f63178i = string;
        String string2 = context.getString(R.string.activity_details_altitude);
        String strD = p6.b.d(context, R.string.lbl_acclimation_boundary, string2);
        int color = a7.b.getColor(context, R.color.gcm_chart_default_data_set);
        int color2 = a7.b.getColor(context, R.color.altitude_acclimation_shaded_background);
        this.f63179j = color2;
        this.f63180k = a7.b.getColor(context, R.color.gcm3_transparent);
        g.a aVar2 = g.a.f192745a;
        this.f63181l = new f(string, null, Integer.valueOf(color), null, aVar2, null, context.getString(R.string.lbl_chart_ada_circle_primary_color_legend, string), 42, null);
        this.f63182m = new f(string2, null, Integer.valueOf(color), null, new g.b(a7.b.getDrawable(context, R.drawable.dashed_line_acclimation)), null, context.getString(R.string.lbl_chart_ada_dashed_line_legend, string2), 42, null);
        this.f63183n = new f(strD, null, Integer.valueOf(color2), null, aVar2, null, context.getString(R.string.lbl_chart_ada_gray_area_legend, strD), 42, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(List<? extends x61.e> list) {
        ?? r14;
        float fC;
        Context context;
        String string;
        c cVar = this;
        List<? extends x61.e> list2 = list;
        Integer numValueOf = Integer.valueOf(R.drawable.gcm_chart_metric_bullet);
        Integer numValueOf2 = Integer.valueOf(R.color.gcm_chart_default_data_set);
        c61.a aVar = c61.a.HEAT;
        t tVar = cVar.f63177h;
        String str = "";
        Context context2 = cVar.f63170a;
        yz.b bVar = cVar.f63175f;
        pi0.e eVar = cVar.f63174e;
        LocalDate localDate = cVar.f63171b;
        f fVar = cVar.f63181l;
        c61.a aVar2 = cVar.f63173d;
        if (aVar2 == aVar) {
            b61.b.f16165a.getClass();
            List listB = b61.b.b(list2, aVar2);
            if (!b61.b.d(listB)) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(y.r(listB, 10));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                x61.e eVar2 = (x61.e) it.next();
                LocalDate localDateM = eVar2.m();
                if (localDateM == null) {
                    localDateM = LocalDate.now();
                }
                LocalDate localDate2 = localDateM;
                Integer heatAcclimationPercentage = eVar2.getHeatAcclimationPercentage();
                float fIntValue = heatAcclimationPercentage != null ? heatAcclimationPercentage.intValue() : 0.0f;
                localDate2.getClass();
                float days = Days.daysBetween(localDate, localDate2).getDays();
                Iterator it3 = it;
                DateTime dateTimeAtStartOfDay = localDate2.toDateTimeAtStartOfDay((DateTimeZone) tVar.getValue());
                dateTimeAtStartOfDay.getClass();
                arrayList.add(new Entry(days, fIntValue, new l(eVar.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY), bVar.getFormattedValue(fIntValue), cVar.f63178i, context2.getString(R.string.percent_sign), null, numValueOf2, numValueOf, null, SyslogConstants.LOG_LOCAL2, null)));
                cVar = this;
                tVar = tVar;
                str = str;
                it = it3;
                context2 = context2;
                bVar = bVar;
                eVar = eVar;
                localDate = localDate;
                fVar = fVar;
            }
            String str2 = str;
            f fVar2 = fVar;
            ArrayList arrayListB = pz.d.b(1, arrayList);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(y.r(arrayListB, 10));
            Iterator it4 = arrayListB.iterator();
            while (it4.hasNext()) {
                LineDataSet lineDataSet = new LineDataSet((List) it4.next(), str2);
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setDrawCircles(true);
                lineDataSet.setCircleRadius(4.0f);
                lineDataSet.setDrawCircleHole(false);
                Integer num = fVar2.f192740c;
                num.getClass();
                lineDataSet.setCircleColor(num.intValue());
                lineDataSet.setColor(num.intValue());
                lineDataSet.setHighLightColor(num.intValue());
                lineDataSet.setLineWidth(2.0f);
                arrayList3.add(lineDataSet);
            }
            arrayList2.addAll(arrayList3);
            return arrayList2;
        }
        Context context3 = context2;
        yz.b bVar2 = bVar;
        pi0.e eVar3 = eVar;
        LocalDate localDate3 = localDate;
        f fVar3 = fVar;
        int i14 = 1;
        float f14 = 0.0f;
        String str3 = "";
        b61.b.f16165a.getClass();
        List<x61.e> listB2 = b61.b.b(list2, aVar2);
        if (!b61.b.d(listB2)) {
            return j0.f134944a;
        }
        ArrayList arrayList4 = new ArrayList(y.r(listB2, 10));
        for (x61.e eVar4 : listB2) {
            LocalDate localDateM2 = eVar4.m();
            if (localDateM2 == null) {
                localDateM2 = LocalDate.now();
            }
            Integer altitudeAcclimationMeters = eVar4.getAltitudeAcclimationMeters();
            if (altitudeAcclimationMeters != null) {
                b61.b bVar3 = b61.b.f16165a;
                o0 o0VarX = x();
                bVar3.getClass();
                fC = (float) b61.b.c(o0VarX, altitudeAcclimationMeters);
            } else {
                fC = f14;
            }
            localDateM2.getClass();
            LocalDate localDate4 = localDate3;
            float days2 = Days.daysBetween(localDate4, localDateM2).getDays();
            ArrayList arrayList5 = arrayList4;
            DateTime dateTimeAtStartOfDay2 = localDateM2.toDateTimeAtStartOfDay((DateTimeZone) tVar.getValue());
            dateTimeAtStartOfDay2.getClass();
            pi0.e eVar5 = eVar3;
            String strA = eVar5.a(dateTimeAtStartOfDay2, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            yz.b bVar4 = bVar2;
            String formattedValue = bVar4.getFormattedValue(fC);
            List list3 = listB2;
            if (x() == o0.STATUTE_US) {
                context = context3;
                string = context.getString(R.string.lbl_ft);
            } else {
                context = context3;
                string = context.getString(R.string.lbl_m);
            }
            localDate3 = localDate4;
            eVar3 = eVar5;
            Context context4 = context;
            arrayList5.add(new Entry(days2, fC, new l(strA, formattedValue, this.f63178i, string, null, numValueOf2, numValueOf, null, SyslogConstants.LOG_LOCAL2, null)));
            arrayList4 = arrayList5;
            str3 = str3;
            listB2 = list3;
            context3 = context4;
            fVar3 = fVar3;
            bVar2 = bVar4;
            i14 = 1;
            f14 = 0.0f;
        }
        List list4 = listB2;
        String str4 = str3;
        f fVar4 = fVar3;
        Context context5 = context3;
        yz.b bVar5 = bVar2;
        LocalDate localDate5 = localDate3;
        ArrayList arrayListB2 = pz.d.b(i14, arrayList4);
        ArrayList<x61.e> arrayList6 = new ArrayList();
        for (Object obj : list4) {
            if (((x61.e) obj).getCurrentAltitude() != null) {
                arrayList6.add(obj);
            }
        }
        ArrayList arrayList7 = new ArrayList(y.r(arrayList6, 10));
        for (x61.e eVar6 : arrayList6) {
            LocalDate localDateM3 = eVar6.m();
            if (localDateM3 == null) {
                localDateM3 = LocalDate.now();
            }
            b61.b bVar6 = b61.b.f16165a;
            Integer currentAltitude = eVar6.getCurrentAltitude();
            currentAltitude.getClass();
            o0 o0VarX2 = x();
            bVar6.getClass();
            float fC2 = (float) b61.b.c(o0VarX2, currentAltitude);
            localDateM3.getClass();
            float days3 = Days.daysBetween(localDate5, localDateM3).getDays();
            DateTime dateTimeAtStartOfDay3 = localDateM3.toDateTimeAtStartOfDay((DateTimeZone) tVar.getValue());
            dateTimeAtStartOfDay3.getClass();
            pi0.e eVar7 = eVar3;
            String strA2 = eVar7.a(dateTimeAtStartOfDay3, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            yz.b bVar7 = bVar5;
            Context context6 = context5;
            arrayList7.add(new Entry(days3, fC2, new l(strA2, bVar7.getFormattedValue(fC2), context6.getString(R.string.activity_details_altitude), x() == o0.STATUTE_US ? context6.getString(R.string.lbl_ft) : context6.getString(R.string.lbl_m), null, Integer.valueOf(R.color.gcm3_transparent), Integer.valueOf(R.drawable.dashed_line_acclimation), null, SyslogConstants.LOG_LOCAL2, null)));
            bVar5 = bVar7;
            eVar3 = eVar7;
            context5 = context6;
        }
        ArrayList arrayListB3 = pz.d.b(1, arrayList7);
        b61.b.f16165a.getClass();
        float fC3 = (float) b61.b.c(x(), 800);
        float fC4 = (float) b61.b.c(x(), 4000);
        float fC5 = (float) b61.b.c(x(), 20000);
        ArrayList arrayList8 = new ArrayList();
        int days4 = Days.daysBetween(localDate5, this.f63172c).getDays();
        if (days4 >= 0) {
            int i15 = 0;
            while (true) {
                r14 = 0;
                arrayList8.add(new BarEntry(i15, new float[]{fC3, fC4 - fC3, fC5 - fC4}));
                if (i15 == days4) {
                    break;
                }
                i15++;
            }
        } else {
            r14 = 0;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList8, str4);
        barDataSet.setDrawValues(r14);
        int i16 = this.f63179j;
        barDataSet.setColors((List<Integer>) x.k(Integer.valueOf(i16), Integer.valueOf(this.f63180k), Integer.valueOf(i16)));
        barDataSet.setBarBorderWidth(0.0f);
        BarLineScatterCandleBubbleDataSet[] barLineScatterCandleBubbleDataSetArr = new BarLineScatterCandleBubbleDataSet[1];
        barLineScatterCandleBubbleDataSetArr[r14] = barDataSet;
        ArrayList arrayListM = x.m(barLineScatterCandleBubbleDataSetArr);
        ArrayList arrayList9 = new ArrayList(y.r(arrayListB2, 10));
        Iterator it5 = arrayListB2.iterator();
        while (it5.hasNext()) {
            LineDataSet lineDataSet2 = new LineDataSet((List) it5.next(), str4);
            lineDataSet2.setDrawValues(r14);
            lineDataSet2.setDrawHorizontalHighlightIndicator(r14);
            lineDataSet2.setDrawCircles(true);
            lineDataSet2.setCircleRadius(4.0f);
            lineDataSet2.setDrawCircleHole(r14);
            Integer num2 = fVar4.f192740c;
            num2.getClass();
            lineDataSet2.setCircleColor(num2.intValue());
            lineDataSet2.setColor(num2.intValue());
            lineDataSet2.setHighLightColor(num2.intValue());
            lineDataSet2.setLineWidth(2.0f);
            arrayList9.add(lineDataSet2);
        }
        arrayListM.addAll(arrayList9);
        ArrayList arrayList10 = new ArrayList(y.r(arrayListB3, 10));
        Iterator it6 = arrayListB3.iterator();
        while (it6.hasNext()) {
            LineDataSet lineDataSet3 = new LineDataSet((List) it6.next(), str4);
            lineDataSet3.setDrawValues(r14);
            lineDataSet3.setDrawHorizontalHighlightIndicator(r14);
            lineDataSet3.setDrawCircles(r14);
            lineDataSet3.setDrawCircleHole(r14);
            f fVar5 = this.f63182m;
            Integer num3 = fVar5.f192740c;
            num3.getClass();
            lineDataSet3.setColor(num3.intValue());
            Integer num4 = fVar5.f192740c;
            num4.getClass();
            lineDataSet3.setHighLightColor(num4.intValue());
            lineDataSet3.setLineWidth(1.5f);
            lineDataSet3.setMode(LineDataSet.Mode.STEPPED);
            lineDataSet3.enableDashedLine(5.0f, 10.0f, 0.0f);
            arrayList10.add(lineDataSet3);
        }
        arrayListM.addAll(arrayList10);
        return arrayListM;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends x61.e> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends x61.e> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends x61.e> list) {
        List<? extends x61.e> list2 = list;
        c61.a aVar = c61.a.HEAT;
        c61.a aVar2 = this.f63173d;
        if (aVar2 == aVar) {
            return 100.0f;
        }
        b61.b.f16165a.getClass();
        return new e61.a(b61.b.b(list2, aVar2)).e(5).f128595b.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends x61.e> list) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends x61.e> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends x61.e> list) {
        return Days.daysBetween(this.f63171b, this.f63172c).getDays();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final float t(List<? extends x61.e> list) {
        List<? extends x61.e> list2 = list;
        c61.a aVar = c61.a.HEAT;
        c61.a aVar2 = this.f63173d;
        if (aVar2 == aVar) {
            return 0.0f;
        }
        b61.b.f16165a.getClass();
        return new e61.a(b61.b.b(list2, aVar2)).e(5).f128594a.floatValue();
    }

    @Override // qz.c
    public final List u(List<? extends x61.e> list) {
        ArrayList arrayList = new ArrayList();
        b61.b.f16165a.getClass();
        c61.a aVar = this.f63173d;
        List listB = b61.b.b(list, aVar);
        if (b61.b.d(listB)) {
            arrayList.add(this.f63181l);
            if (aVar == c61.a.ALTITUDE) {
                if (listB == null || !listB.isEmpty()) {
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        if (((x61.e) it.next()).getCurrentAltitude() != null) {
                            arrayList.add(this.f63182m);
                            break;
                        }
                    }
                }
                p<Float, Float> pVarE = new e61.a(listB).e(5);
                double dFloatValue = pVarE.f128594a.floatValue();
                b61.b.f16165a.getClass();
                if (dFloatValue < b61.b.c(x(), 800) || pVarE.f128595b.floatValue() > b61.b.c(x(), 4000)) {
                    arrayList.add(this.f63183n);
                }
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends x61.e> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends x61.e> list) {
        return 0.0f;
    }

    public final o0 x() {
        return (o0) this.f63176g.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Le61/c$a;", "", "<init>", "()V", "", "HEAT_ACCLIMATION_MIN_VALUE", "F", "HEAT_ACCLIMATION_MAX_VALUE", "DATAPOINT_CIRCLE_RADIUS", "CHART_DASHED_LINE_WIDTH_SMALL", "CHART_DASHED_LINE_LENGTH_SMALL", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
