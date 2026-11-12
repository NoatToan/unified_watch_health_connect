package d00;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.HorizontalBarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld00/b;", "Lcom/github/mikephil/charting/renderer/HorizontalBarChartRenderer;", "", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends HorizontalBarChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f56996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f56997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f56999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f57000e;

    public b(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.f56997b = 0.85f;
        this.f56998c = Utils.convertDpToPixel(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.HorizontalBarChartRenderer, com.github.mikephil.charting.renderer.BarChartRenderer
    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        canvas.getClass();
        iBarDataSet.getClass();
        Transformer transformer = this.mChart.getTransformer(YAxis.AxisDependency.RIGHT);
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i15 = 0;
        boolean z14 = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF rectF = new RectF();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i16 = 0; i16 < iMin; i16++) {
                float x14 = ((BarEntry) iBarDataSet.getEntryForIndex(i16)).getX();
                rectF.top = x14 - barWidth;
                rectF.bottom = x14 + barWidth;
                transformer.rectValueToPixel(rectF);
                if (this.mViewPortHandler.isInBoundsTop(rectF.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(rectF.top)) {
                        break;
                    }
                    rectF.left = this.mViewPortHandler.contentLeft();
                    rectF.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(rectF, this.mShadowPaint);
                }
            }
        }
        Canvas canvas2 = canvas;
        transformer.getClass();
        BarBuffer barBuffer = this.mBarBuffers[i14];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i14);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z15 = iBarDataSet.getColors().size() == 1;
        if (z15) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i15 < barBuffer.size()) {
            int i17 = i15 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i17])) {
                int i18 = i15 + 3;
                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i18])) {
                    return;
                }
                if (!z15) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i15 / 4));
                }
                if (iBarDataSet.getGradientColor() != null) {
                    GradientColor gradientColor = iBarDataSet.getGradientColor();
                    Paint paint = this.mRenderPaint;
                    float[] fArr = barBuffer.buffer;
                    float f14 = fArr[i15];
                    paint.setShader(new LinearGradient(f14, fArr[i18], f14, fArr[i17], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                }
                if (iBarDataSet.getGradientColors() != null) {
                    Paint paint2 = this.mRenderPaint;
                    float[] fArr2 = barBuffer.buffer;
                    float f15 = fArr2[i15];
                    float f16 = fArr2[i18];
                    float f17 = fArr2[i17];
                    int i19 = i15 / 4;
                    paint2.setShader(new LinearGradient(f15, f16, f15, f17, iBarDataSet.getGradientColor(i19).getStartColor(), iBarDataSet.getGradientColor(i19).getEndColor(), Shader.TileMode.MIRROR));
                }
                this.mRenderPaint.setShader(null);
                float[] fArr3 = barBuffer.buffer;
                int i24 = i15 + 2;
                canvas2.drawRect(fArr3[i15], fArr3[i17], fArr3[i24], fArr3[i18], this.mRenderPaint);
                if (z14) {
                    float[] fArr4 = barBuffer.buffer;
                    canvas.drawRect(fArr4[i15], fArr4[i17], fArr4[i24], fArr4[i18], this.mBarBorderPaint);
                }
                i15 += 4;
                canvas2 = canvas;
            } else {
                i15 += 4;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        canvas.getClass();
        highlightArr.getClass();
        if (this.f56996a == null) {
            super.drawHighlighted(canvas, highlightArr);
            return;
        }
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) this.mChart.getBarData().getDataSetByIndex(highlight.getDataSetIndex());
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
            Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
            if (iBarDataSet.isHighlightEnabled() && isInBoundsX(barEntry, iBarDataSet) && barEntry.getData() != null) {
                this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                this.mHighlightPaint.setStyle(Paint.Style.STROKE);
                this.mHighlightPaint.setStrokeWidth(this.f56998c);
                float[] fArr = {barEntry.getX(), barEntry.getY()};
                transformer.pointValuesToPixel(fArr);
                highlight.setDraw(fArr[0], fArr[1]);
                v vVar = this.f56996a;
                if (vVar != null) {
                    PointF pointF = new PointF(fArr[0], fArr[1]);
                    Paint paint = this.mHighlightPaint;
                    paint.getClass();
                    vVar.b(canvas, pointF, paint);
                }
            }
        }
    }
}
