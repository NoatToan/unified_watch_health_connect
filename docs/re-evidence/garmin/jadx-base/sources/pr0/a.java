package pr0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineDataSet;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.XAxisRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpr0/a;", "Loz/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends oz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x00.a f139600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LayerDrawable f139601g;

    static {
        new C2644a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
        this.f139600f = new x00.a(context);
        Resources resources = context.getResources();
        resources.getClass();
        this.f139601g = r0.a(context, R.drawable.check, R.color.gcm_icon_background_goal_on_chart, R.color.gcm_icon_success, (int) xy2.b.n(resources, 2.0f), R.color.gcm_icon_success, r0.a.SMALL);
    }

    @Override // oz.b, oz.c
    public final void l(LineChart lineChart) {
        super.l(lineChart);
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null) {
            fz.a aVar = fz.a.f73959a;
            lineChart2.setLayerType(1, null);
            lineChart2.setExtraBottomOffset(25.0f);
            lineChart2.setExtraTopOffset(70.0f);
            XAxis xAxis = lineChart2.getXAxis();
            xAxis.setLabelsToSkip(0);
            xAxis.setYOffset(10.0f);
            xAxis.setTextSize(10.0f);
            Context context = this.f134441a;
            xAxis.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
            xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
            xAxis.setDrawAxisLine(false);
            xAxis.setDrawLimitLinesBehindData(true);
            xAxis.setValues(u(0, null, null));
            lineChart2.setXAxisRenderer(t(lineChart2));
            YAxis axisLeft = lineChart2.getAxisLeft();
            axisLeft.setDrawLabels(true);
            axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
            axisLeft.setTextSize(10.0f);
            axisLeft.setGridLineWidth(1.0f);
            axisLeft.setGridColor(a7.b.getColor(context, R.color.gcm_chart_grid));
            axisLeft.setDrawGridLines(true);
            axisLeft.setDrawAxisLine(false);
            axisLeft.setLabelCount(r(), true);
            axisLeft.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
            axisLeft.setValueFormatter(new jz.b());
            lineChart2.getAxisRight().setEnabled(false);
            DataRenderer renderer = lineChart2.getRenderer();
            if (renderer instanceof mz.a) {
                mz.a aVar2 = (mz.a) renderer;
                aVar2.f121609f = true;
                aVar2.f121610g = true;
            }
            lineChart2.getPaint(7).setColor(a7.b.getColor(context, R.color.gcm_text_secondary));
            if (lineChart2 instanceof BaseLineChart) {
                ((BaseLineChart) lineChart2).setShowNoDataTextOnTop(true);
            }
        }
    }

    public final void n(ArrayList arrayList, int i14, float f14, float f15) {
        float val = arrayList.size() > 0 ? ((Entry) h0.m0(arrayList)).getVal() : f14;
        if (f14 < f15 || val >= f15) {
            arrayList.add(new Entry(f14, i14));
        } else {
            arrayList.add(new iz.a(f14, i14, this.f139601g, f15));
        }
    }

    public final hz.e o(List list, boolean z14) {
        float fMin;
        Object obj;
        YAxis axisLeft;
        YAxis axisLeft2;
        hz.e eVar = new hz.e(list, "");
        eVar.setAxisDependency(YAxis.AxisDependency.LEFT);
        eVar.setDrawValues(false);
        eVar.setDrawCircleHole(false);
        eVar.setDrawCircles(false);
        eVar.setDrawCubic(false);
        eVar.setLineWidth(2.0f);
        Context context = this.f134441a;
        eVar.setColor(context.getColor(R.color.gcm_chart_intensity_minutes_data_set));
        eVar.setDrawFilled(true);
        LineChart lineChart = this.f134442b;
        float axisMaximum = 0.0f;
        float axisMinimum = (lineChart == null || (axisLeft2 = lineChart.getAxisLeft()) == null) ? 0.0f : axisLeft2.getAxisMinimum();
        LineChart lineChart2 = this.f134442b;
        if (lineChart2 != null && (axisLeft = lineChart2.getAxisLeft()) != null) {
            axisMaximum = axisLeft.getAxisMaximum();
        }
        if (axisMaximum > axisMinimum) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    float val = ((Entry) next).getVal();
                    do {
                        Object next2 = it.next();
                        float val2 = ((Entry) next2).getVal();
                        if (Float.compare(val, val2) < 0) {
                            next = next2;
                            val = val2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Entry entry = (Entry) obj;
            fMin = (Math.min(entry != null ? entry.getVal() : axisMaximum, axisMaximum) - axisMinimum) / (axisMaximum - axisMinimum);
        } else {
            fMin = 1.0f;
        }
        b bVar = new b(context, fMin);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(bVar);
        eVar.setFillDrawable(paintDrawable);
        eVar.setHighlightEnabled(z14);
        eVar.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        eVar.setHighlightLineWidth(1.0f);
        eVar.setDrawStepped(v());
        eVar.f86390a = false;
        return eVar;
    }

    public final hz.e p(d dVar, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        int i14;
        DateTime dateTime4;
        int i15;
        DateTime dateTime5 = dateTime3;
        ArrayList arrayList = new ArrayList();
        List<hz.d> list = dVar.f139609a;
        float f14 = dVar.f139612d;
        float val = dVar.f139610b;
        if (list.isEmpty()) {
            i14 = 1;
            dateTime4 = null;
        } else {
            int iS = s(dateTime5, dateTime);
            int size = list.size();
            int i16 = 0;
            while (i16 < size) {
                hz.d dVar2 = list.get(i16);
                DateTime dateTime6 = dVar2.f86388a;
                if ((dateTime6.isAfter(dateTime) || dateTime6.isEqual(dateTime)) && (dateTime6.isBefore(dateTime2) || dateTime6.isEqual(dateTime2))) {
                    float f15 = dVar2.f86389b;
                    int iS2 = s(dateTime5, dateTime6);
                    if (i16 > 0) {
                        hz.d dVar3 = list.get(i16 - 1);
                        int iS3 = s(dateTime5, dVar3.f86388a);
                        if (iS2 - iS3 > 1) {
                            int i17 = iS3 + 1;
                            while (i17 < iS2) {
                                arrayList.add(new Entry(dVar3.f86389b, i17));
                                i17++;
                                size = size;
                            }
                        }
                        i15 = size;
                    } else {
                        i15 = size;
                        if (iS2 > iS) {
                            for (int i18 = iS; i18 < iS2; i18++) {
                                arrayList.add(new Entry(val, i18));
                            }
                        }
                    }
                    n(arrayList, iS2, f15, f14);
                } else {
                    i15 = size;
                }
                i16++;
                dateTime5 = dateTime3;
                size = i15;
            }
            i14 = 1;
            dateTime4 = ((hz.d) com.airbnb.lottie.animation.keyframe.a.c(1, list)).f86388a;
        }
        int iS4 = dateTime4 == null ? s(dateTime, dateTime2) + i14 : s(dateTime4, dateTime2);
        if (iS4 > 0) {
            if (arrayList.size() > 0) {
                val = ((Entry) h0.m0(arrayList)).getVal();
            }
            Entry entry = (Entry) h0.n0(arrayList);
            int xIndex = entry != null ? entry.getXIndex() : -1;
            int i19 = iS4 + xIndex;
            int i24 = xIndex + 1;
            if (i24 <= i19 && i24 <= i19) {
                while (true) {
                    n(arrayList, i24, i24 < i19 ? val : dVar.f139611c, f14);
                    if (i24 == i19) {
                        break;
                    }
                    i24++;
                }
            }
        }
        return o(arrayList, true);
    }

    public final LineDataSet q(float f14, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        LineDataSet lineDataSet = new LineDataSet(x.k(new Entry(f14, s(dateTime3, dateTime)), new Entry(f14, s(dateTime3, dateTime2))), "");
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCubic(false);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setColor(this.f134441a.getColor(R.color.gcm_chart_intensity_minutes_data_set));
        lineDataSet.enableDashedLine(10.0f, 10.0f, 1.0f);
        lineDataSet.setHighlightEnabled(false);
        return lineDataSet;
    }

    public abstract int r();

    public abstract int s(DateTime dateTime, DateTime dateTime2);

    public abstract XAxisRenderer t(LineChart lineChart);

    public abstract List u(int i14, DateTime dateTime, DateTime dateTime2);

    public boolean v() {
        return this instanceof f;
    }

    public final void w() {
        LineChart lineChart = this.f134442b;
        if (lineChart != null) {
            g gVar = new g(this.f134441a, lineChart);
            gz.d dVar = gVar.f153412b;
            mz.c cVar = gVar.f153413c;
            if (cVar != null) {
                ArrayList arrayListM = x.m("dashed_two_line_interval");
                Context context = gVar.f153411a;
                dVar.setCustom(x.m(Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_intensity_minutes_data_set))), x.m(context.getString(R.string.lbl_weekly_goal)));
                dVar.setFormSize(16.0f);
                dVar.setFormToTextSpace(context.getResources().getDimension(R.dimen.spacing_micro));
                String[] strArr = (String[]) arrayListM.toArray(new String[0]);
                strArr.getClass();
                cVar.f121614b = strArr;
            }
            if (lineChart instanceof BaseLineChart) {
                ((BaseLineChart) lineChart).a(dVar, gVar.f153413c);
            }
        }
    }

    public final void x(YAxis yAxis, float f14, float f15, float f16) {
        int iR = r() - 1;
        float fMin = Math.min(f16, f14);
        float fMax = Math.max(f16, f15);
        if (fMin != fMax) {
            fMin *= 0.95f;
            fMax *= 1.05f;
        }
        float fMax2 = Math.max(0.0f, fMin);
        float fMax3 = Math.max(150.0f, fMax);
        float f17 = 5;
        int iFloor = ((int) Math.floor(fMax2 / f17)) * 5;
        int iCeil = ((int) Math.ceil(fMax3 / f17)) * 5;
        int i14 = iCeil - iFloor;
        int i15 = iR * 50;
        if (i14 == 0) {
            int i16 = i15 / 2;
            iFloor -= i16;
            iCeil += i16;
        } else if (i14 % i15 != 0) {
            float f18 = i14;
            float f19 = i15;
            iCeil += (int) ((((float) Math.ceil(f18 / f19)) * f19) - f18);
        }
        yAxis.setAxisMinValue(iFloor);
        yAxis.setAxisMaxValue(iCeil);
    }

    /* JADX INFO: renamed from: pr0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpr0/a$a;", "", "<init>", "()V", "", "Y_AXIS_ROUNDING_FACTOR", "I", "Y_AXIS_ROUNDING_FACTOR_MULTIPLIER", "", "Y_AXIS_BUFFER_PERCENT", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2644a {
        public /* synthetic */ C2644a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2644a() {
        }
    }
}
