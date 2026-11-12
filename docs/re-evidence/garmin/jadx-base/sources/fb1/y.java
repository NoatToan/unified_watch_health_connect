package fb1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.highlight.ChartHighlighter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lfb1/y;", "Loz/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends oz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f70317h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg1.h0 f70318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f2.o0 f70319g;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfb1/y$b;", "Lkotlin/Function1;", "Lcom/github/mikephil/chartingv2/highlight/Highlight;", "", "Lorg/joda/time/DateTime;", "startDate", "Ldb1/m;", "pregnancySnapshotDTO", "<init>", "(Lfb1/y;Lorg/joda/time/DateTime;Ldb1/m;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements e23.l<Highlight, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f70320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final db1.m f70321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f70322c;

        public b(y yVar, DateTime dateTime, db1.m mVar) {
            dateTime.getClass();
            this.f70322c = yVar;
            this.f70320a = dateTime;
            this.f70321b = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v7, types: [com.github.mikephil.chartingv2.data.Entry] */
        @Override // e23.l
        public final Unit invoke(Highlight highlight) throws Exception {
            db1.d dVar;
            LocalDate pregnancyCycleStart;
            LineData lineData;
            Highlight highlight2 = highlight;
            y yVar = this.f70322c;
            if (highlight2 != null) {
                int i14 = y.f70317h;
                LineChart lineChart = yVar.f134442b;
                Context context = yVar.f134441a;
                List<ILineDataSet> dataSets = (lineChart == null || (lineData = (LineData) lineChart.getData()) == null) ? null : lineData.getDataSets();
                ArrayList arrayList = new ArrayList(2);
                LocalDate localDate = this.f70320a.plusDays(highlight2.getXIndex()).toLocalDate();
                pi0.e eVar = new pi0.e(context);
                localDate.getClass();
                String strD = eVar.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                String string = i52.a.i() == gg1.h0.MILLI_GRAMS_PER_DECILITER ? context.getString(R.string.pregnancy_mgdl) : context.getString(R.string.pregnancy_mmol);
                string.getClass();
                db1.m mVar = this.f70321b;
                if (mVar != null && (pregnancyCycleStart = mVar.getPregnancyCycleStart()) != null) {
                    strD = ((Object) strD) + " • " + (Days.daysBetween(pregnancyCycleStart, localDate).getDays() / 7) + "w " + ((Days.daysBetween(pregnancyCycleStart, localDate).getDays() % 7) + 1) + "d";
                }
                String str = strD;
                if (dataSets != null) {
                    for (ILineDataSet iLineDataSet : dataSets) {
                        db1.d.a aVar = db1.d.f58994c;
                        String label = iLineDataSet.getLabel();
                        label.getClass();
                        aVar.getClass();
                        db1.d[] dVarArrValues = db1.d.values();
                        int length = dVarArrValues.length;
                        boolean z14 = false;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                dVar = null;
                                break;
                            }
                            db1.d dVar2 = dVarArrValues[i15];
                            if (p005kotlin.jvm.internal.s.g(dVar2.name(), label)) {
                                dVar = dVar2;
                                break;
                            }
                            i15++;
                        }
                        float yValForXIndex = iLineDataSet.getYValForXIndex(highlight2.getXIndex());
                        ?? entryForXIndex = iLineDataSet.getEntryForXIndex(highlight2.getXIndex());
                        if (entryForXIndex != 0 && entryForXIndex.getXIndex() == highlight2.getXIndex()) {
                            z14 = true;
                        }
                        if (dVar != null && z14 && !Float.isNaN(yValForXIndex) && yValForXIndex > 0.0f) {
                            arrayList.add(new t(yVar.f70318f == gg1.h0.MILLI_GRAMS_PER_DECILITER ? String.valueOf((int) yValForXIndex) : String.valueOf(yValForXIndex), string, Integer.valueOf(a7.b.getColor(context, dVar.f59001b)), context.getString(dVar.f59000a), str));
                        }
                    }
                }
                f2.o0 o0Var = yVar.f70319g;
                if (o0Var != null) {
                    o0Var.invoke(new s(arrayList));
                }
            } else {
                f2.o0 o0Var2 = yVar.f70319g;
                if (o0Var2 != null) {
                    o0Var2.invoke(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context) {
        super(context);
        context.getClass();
        this.f70318f = i52.a.i();
    }

    public static ArrayList p(DateTime dateTime, DateTime dateTime2) {
        ArrayList arrayList = new ArrayList();
        if (dateTime == null || dateTime2 == null) {
            dateTime = DateTime.now().withTimeAtStartOfDay();
            dateTime.getClass();
            dateTime2 = dateTime.withTimeAtStartOfDay().plus(1L);
            dateTime2.getClass();
        }
        MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
        while (mutableDateTime.compareTo((ReadableInstant) dateTime2) <= 0) {
            arrayList.add((mutableDateTime.equals(dateTime) || mutableDateTime.equals(dateTime2)) ? androidx.core.view.j.d(mutableDateTime.getMonthOfYear(), mutableDateTime.getDayOfMonth(), "/") : StringUtils.SPACE);
            mutableDateTime.addDays(1);
        }
        return arrayList;
    }

    @Override // oz.b, oz.c
    public final void l(LineChart lineChart) {
        super.l(lineChart);
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            fz.a aVar = fz.a.f73959a;
            lineChart2.setLayerType(1, null);
            mz.e eVar = new mz.e(lineChart2, new mz.d(), new c(2));
            eVar.f121608e = true;
            lineChart2.setRenderer(eVar);
            lineChart2.setExtraBottomOffset(25.0f);
            lineChart2.setExtraLeftOffset(35.0f);
            lineChart2.setExtraRightOffset(35.0f);
            XAxis xAxis = lineChart2.getXAxis();
            Context context = this.f134441a;
            xAxis.setTypeface(h22.a.a("font/roboto_light.ttf", context));
            xAxis.setLabelsToSkip(0);
            xAxis.setYOffset(10.0f);
            xAxis.setTextSize(10.0f);
            xAxis.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
            xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
            xAxis.setDrawAxisLine(true);
            xAxis.setValues(p(null, null));
            mz.f fVar = new mz.f(lineChart2.getViewPortHandler(), lineChart2.getXAxis(), lineChart2.getTransformer(YAxis.AxisDependency.LEFT), 1, 1, false);
            int color = a7.b.getColor(context, R.color.gcm_chart_mark);
            if (color != 0) {
                fVar.f121634i = color;
            }
            lineChart2.setXAxisRenderer(fVar);
            YAxisValueFormatter aVar2 = this.f70318f == gg1.h0.MILLI_MOLES_PER_LITER ? new mm.a(1) : new jz.b();
            YAxis axisLeft = lineChart2.getAxisLeft();
            axisLeft.setDrawLabels(true);
            axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
            axisLeft.setXOffset(-25.0f);
            axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
            axisLeft.setTextSize(10.0f);
            axisLeft.setDrawGridLines(true);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setLabelCount(5, true);
            axisLeft.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
            axisLeft.setValueFormatter(aVar2);
            lineChart2.getAxisRight().setEnabled(false);
            lineChart2.getPaint(7).setColor(a7.b.getColor(context, R.color.gcm_text_primary));
            if (lineChart2 instanceof BaseLineChart) {
                ((BaseLineChart) lineChart2).setShowNoDataTextOnTop(true);
            }
        }
    }

    @Override // oz.b
    public final ChartHighlighter<? super LineChart> m(LineChart lineChart) {
        lineChart.getClass();
        return new kz.a(lineChart);
    }

    public final hz.h n(List list, db1.d dVar) {
        String strName;
        if (dVar == null || (strName = dVar.name()) == null) {
            strName = "";
        }
        hz.h hVar = new hz.h(list, strName);
        hVar.setAxisDependency(YAxis.AxisDependency.LEFT);
        hVar.setDrawValues(false);
        hVar.setDrawCircleHole(false);
        hVar.setDrawCircles(true);
        hVar.setDrawCubic(false);
        hVar.setLineWidth(1.5f);
        hVar.setCircleRadius(3.0f);
        hVar.setHighlightEnabled(false);
        int i14 = dVar != null ? dVar.f59001b : R.color.transparent;
        Context context = this.f134441a;
        hVar.setCircleColor(a7.b.getColor(context, i14));
        hVar.setColor(a7.b.getColor(context, dVar != null ? dVar.f59001b : R.color.blue_40));
        hVar.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        hVar.setHighlightLineWidth(1.0f);
        return hVar;
    }

    public final hz.h o(ArrayList arrayList, DateTime dateTime, db1.d dVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hz.d dVar2 = (hz.d) it.next();
            int days = Days.daysBetween(dateTime, dVar2.f86388a).getDays();
            float f14 = dVar2.f86389b;
            if (f14 <= 0.0f) {
                f14 = -10.0f;
            }
            arrayList2.add(new Entry(f14, days));
        }
        return n(arrayList2, dVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lfb1/y$a;", "", "<init>", "()V", "", "Y_AXIS_MARGIN", "F", "Y_AXIS_MIN", "Y_AXIS_MAX", "", "Y_AXIS_LABEL_COUNT", "I", "INVALID_VALUE", "TOTAL_NUMBER_OF_DAYS_IN_WEEK", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
