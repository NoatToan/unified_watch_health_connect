package om;

import android.graphics.Canvas;
import com.github.mikephil.chartingv2.charts.BarLineChartBase;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.renderer.YAxisRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class c extends YAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f132881a;

    public c(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, int i14) {
        super(viewPortHandler, yAxis, transformer);
        if (i14 == 14) {
            this.f132881a = new String[]{"60% R", "50/50", "60% L"};
            return;
        }
        if (i14 == 19) {
            this.f132881a = new String[]{"100% R", "50/50", "100% L"};
        } else if (i14 == 24 || i14 == 25) {
            this.f132881a = new String[]{"90", "45", "TDC 0", "315", "270"};
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer
    public final void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        int i14 = 0;
        while (true) {
            String[] strArr = this.f132881a;
            if (i14 >= strArr.length) {
                return;
            }
            String str = strArr[i14];
            if (!this.mYAxis.isDrawTopYLabelEntryEnabled() && i14 >= this.mYAxis.mEntryCount - 1) {
                return;
            }
            canvas.drawText(str, f14, fArr[(i14 * 2) + 1] + f15, this.mAxisLabelPaint);
            i14++;
        }
    }

    public c(BarLineChartBase barLineChartBase, YAxis.AxisDependency axisDependency, int i14) {
        this(barLineChartBase.getViewPortHandler(), axisDependency == YAxis.AxisDependency.LEFT ? barLineChartBase.getAxisLeft() : barLineChartBase.getAxisRight(), barLineChartBase.getTransformer(axisDependency), i14);
    }
}
