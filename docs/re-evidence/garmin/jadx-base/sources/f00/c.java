package f00;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import zz.j;
import zz.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf00/c;", "Lcom/github/mikephil/charting/renderer/LineChartRenderer;", "", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c extends LineChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f67650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f67651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint.Cap f67652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f67653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Float f67654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f67655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f67656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Float getF67654e() {
        return this.f67654e;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Float getF67653d() {
        return this.f67653d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Paint.Cap getF67652c() {
        return this.f67652c;
    }

    public void d() {
        this.f67653d = Float.valueOf(0.0f);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(Canvas canvas) {
        Shader shader = this.mRenderPaint.getShader();
        this.mRenderPaint.setShader(null);
        super.drawCircles(canvas);
        this.mRenderPaint.setShader(shader);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        List<GradientColor> gradientColors;
        Paint.Cap f67652c = getF67652c();
        if (f67652c != null) {
            this.mRenderPaint.setStrokeCap(f67652c);
        }
        Shader shader = this.mRenderPaint.getShader();
        if (iLineDataSet != null && (gradientColors = iLineDataSet.getGradientColors()) != null) {
            ArrayList arrayList = new ArrayList(y.r(gradientColors, 10));
            Iterator<T> it = gradientColors.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((GradientColor) it.next()).getEndColor()));
            }
            int[] iArrA1 = h0.a1(arrayList);
            RectF contentRect = this.mViewPortHandler.getContentRect();
            this.mRenderPaint.setShader(new LinearGradient(0.0f, contentRect.bottom, 0.0f, contentRect.top, iArrA1, (float[]) null, Shader.TileMode.CLAMP));
        }
        super.drawDataSet(canvas, iLineDataSet);
        this.mRenderPaint.setShader(shader);
    }

    @Override // com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float f14, float f15, ILineScatterCandleRadarDataSet<?> iLineScatterCandleRadarDataSet) {
        canvas.getClass();
        iLineScatterCandleRadarDataSet.getClass();
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()) {
            j jVar = this.f67650a;
            if (jVar != null) {
                PointF pointF = new PointF(f14, f15);
                Paint paint = this.mHighlightPaint;
                paint.getClass();
                jVar.b(canvas, pointF, paint);
            } else {
                Path path = new Path();
                path.moveTo(f14, this.mViewPortHandler.contentTop());
                path.lineTo(f14, f15);
                canvas.drawPath(path, this.mHighlightPaint);
            }
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            Path path2 = new Path();
            path2.moveTo(this.mViewPortHandler.contentLeft(), f15);
            path2.lineTo(this.mViewPortHandler.contentRight(), f15);
            canvas.drawPath(path2, this.mHighlightPaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        canvas.getClass();
        super.drawHighlighted(canvas, highlightArr);
        k kVar = this.f67651b;
        if (kVar != null) {
            kVar.a(canvas, highlightArr);
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i14;
        int i15;
        iLineDataSet.getClass();
        transformer.getClass();
        xBounds.getClass();
        Path path = this.mGenerateFilledPathBuffer;
        int i16 = xBounds.min;
        int i17 = xBounds.range + i16;
        int i18 = 0;
        do {
            i14 = (i18 * 128) + i16;
            i15 = i14 + 129;
            if (i15 > i17) {
                i15 = i17;
            }
            if (i14 <= i15) {
                path.getClass();
                generateFilledPath(iLineDataSet, i14, i15, path);
                transformer.pathValueToPixel(path);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i18++;
        } while (i14 <= i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.BaseEntry] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public void generateFilledPath(ILineDataSet iLineDataSet, int i14, int i15, Path path) {
        ?? entryForIndex;
        path.getClass();
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z14 = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i14);
        path.moveTo(entryForIndex2.getX(), fillLinePosition);
        path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
        int i16 = i14 + 1;
        ?? r14 = entryForIndex2;
        if (i16 <= i15) {
            while (true) {
                entryForIndex = iLineDataSet.getEntryForIndex(i16);
                if (z14) {
                    path.lineTo(entryForIndex.getX(), r14.getY() * phaseY);
                }
                path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
                if (i16 == i15) {
                    break;
                }
                i16++;
                r14 = entryForIndex;
            }
        } else {
            entryForIndex = 0;
        }
        if (entryForIndex != 0) {
            path.lineTo(entryForIndex.getX(), fillLinePosition);
        }
        path.close();
    }
}
