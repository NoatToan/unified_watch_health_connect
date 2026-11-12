package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;

/* JADX INFO: loaded from: classes16.dex */
public class qnz extends qmm {
    private float i;

    public qnz(Context context, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(context, viewPortHandler, yAxis, transformer, hwHealthBaseBarLineChart);
        this.i = 0.5f;
        this.d = context;
        this.f46486a = hwHealthBaseBarLineChart;
        this.f46487b = new qng();
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        float fB = b();
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), f, fArr[(i2 * 2) + 1] + fB, this.mAxisLabelPaint);
        }
    }

    @Override // defpackage.qmm, com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (canvas == null || this.mYAxis == null || !this.mYAxis.isEnabled()) {
            return;
        }
        if (this.mYAxis.isDrawGridLinesEnabled()) {
            canvas.clipRect(new RectF(0.0f, 0.0f, this.mViewPortHandler.getChartWidth(), this.mViewPortHandler.getChartHeight()));
            this.mGridPaint.setColor(this.mYAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(qqp.a(this.d, this.i));
            Path path = this.mRenderGridLinesPath;
            path.reset();
            float[] transformedPositions = getTransformedPositions();
            boolean z = true;
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{d(2.0f), d(1.0f)}, 0.0f);
            for (int i = 0; i < transformedPositions.length; i += 2) {
                int i2 = i + 1;
                if (i2 >= transformedPositions.length || transformedPositions[i2] <= this.f46486a.getContentRect().bottom) {
                    if (z) {
                        this.mGridPaint.setPathEffect(null);
                        z = false;
                    } else {
                        this.mGridPaint.setPathEffect(dashPathEffect);
                    }
                    int gridColor = this.mYAxis.getGridColor();
                    this.mGridPaint.setColor(((this.mYAxis instanceof HwHealthYAxis) && ((HwHealthYAxis) this.mYAxis).a()) ? gridColor : ((HwHealthYAxis) this.mYAxis).e());
                    canvas.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                    path.reset();
                    this.mGridPaint.setColor(gridColor);
                }
            }
        }
        if (this.mYAxis.isDrawZeroLineEnabled()) {
            drawZeroLine(canvas);
        }
    }

    public static int d(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
