package h00;

import android.graphics.Canvas;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomHorizontalBarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import g22.n;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh00/d;", "Lh00/a;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;", "chart", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomHorizontalBarChart;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends h00.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f80610g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h00/d$a", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public final String getFormattedValue(float f14) {
            int iC = MathKt.c(f14);
            List<String> list = d.this.f80591a;
            if (list != null) {
                String str = (iC < 0 || iC >= list.size()) ? "" : list.get(iC);
                if (str != null) {
                    return str;
                }
            }
            return "";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, CustomHorizontalBarChart customHorizontalBarChart) {
        super(viewPortHandler, xAxis, transformer, customHorizontalBarChart);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        customHorizontalBarChart.getClass();
        this.f80594d = new a();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public final void computeAxisValues(float f14, float f15) {
        List<String> list = this.f80591a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                Float fValueOf = n.d((String) obj) ? Float.valueOf(i14) : null;
                if (fValueOf != null) {
                    arrayList.add(fValueOf);
                }
                i14 = i15;
            }
            float[] fArrY0 = h0.Y0(arrayList);
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = fArrY0;
            axisBase.mEntryCount = fArrY0.length;
            this.f80595e = fArrY0.length;
        }
        computeSize();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        float f17;
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, str) / 2;
        int i14 = this.f80610g;
        if (i14 == 0) {
            if (fCalcTextHeight > f15) {
                f17 = fCalcTextHeight;
            } else {
                f17 = f15;
            }
        } else if (i14 == this.f80595e - 1) {
            float chartHeight = this.mViewPortHandler.getChartHeight() - fCalcTextHeight;
            if (chartHeight < f15) {
                f17 = chartHeight;
            } else {
                f17 = f15;
            }
        } else {
            f17 = f15;
        }
        Utils.drawXAxisValue(canvas, str, f14, f17, this.f80592b, mPPointF, f16);
        this.f80610g++;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRendererHorizontalBarChart, com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        canvas.getClass();
        mPPointF.getClass();
        this.f80610g = 0;
        super.drawLabels(canvas, f14, mPPointF);
    }
}
