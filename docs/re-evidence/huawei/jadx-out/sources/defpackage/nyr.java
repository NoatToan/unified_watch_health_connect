package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nyr extends LineChartRenderer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f43967c;
    private float d;
    private float e;

    public nyr(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
    }

    public void e(float f, float f2, float f3) {
        this.f43967c = f;
        this.d = f2;
        this.e = f3;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStrokeWidth(this.f43967c);
        this.mXBounds.set(this.mChart, iLineDataSet);
        Entry entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min);
        if (entryForIndex != null) {
            Path path = new Path();
            int i = this.mXBounds.min;
            while (i <= this.mXBounds.max) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i == 0 ? 0 : i - 1);
                Entry entryForIndex3 = iLineDataSet.getEntryForIndex(i);
                if (entryForIndex2 == 0 || entryForIndex3 == null) {
                    LogUtil.j("HeartRateControlSportLineRenderer", "point is null index:", Integer.valueOf(i), " form:", Integer.valueOf(this.mXBounds.min), " to:", Integer.valueOf(this.mXBounds.max));
                } else {
                    float[] fArr = {entryForIndex3.getX(), entryForIndex3.getY() * phaseY};
                    transformer.pointValuesToPixel(fArr);
                    if (entryForIndex2.getX() == entryForIndex3.getX() || entryForIndex3.getX() - entryForIndex2.getX() > 8.0f) {
                        path.moveTo(fArr[0], fArr[1]);
                    } else {
                        path.lineTo(fArr[0], fArr[1]);
                    }
                    entryForIndex = entryForIndex3;
                }
                i++;
            }
            canvas.drawPath(path, this.mRenderPaint);
            b(canvas, iLineDataSet, transformer, entryForIndex);
        }
    }

    private void b(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, Entry entry) {
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mRenderPaint.setColor(iLineDataSet.getCircleColor(0));
        this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
        float[] fArr = {entry.getX(), entry.getY() * phaseY};
        transformer.pointValuesToPixel(fArr);
        canvas.drawCircle(fArr[0], fArr[1], this.d, this.mRenderPaint);
        canvas.drawCircle(fArr[0], fArr[1], this.e, this.mCirclePaintInner);
    }
}
