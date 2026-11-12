package sw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.data.CandleData;
import com.github.mikephil.chartingv2.data.CandleEntry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lsw/i;", "Lcom/github/mikephil/chartingv2/renderer/LineScatterCandleRadarRenderer;", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "chart", "Lcom/github/mikephil/chartingv2/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "", "xValueCount", "<init>", "(Lcom/github/mikephil/chartingv2/charts/CombinedChart;Lcom/github/mikephil/chartingv2/animation/ChartAnimator;Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;I)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends LineScatterCandleRadarRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedChart f161064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f161066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f161067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ShapeDrawable f161068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f161069f;

    static {
        new a(null);
    }

    public i(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, int i14) {
        super(chartAnimator, viewPortHandler);
        this.f161064a = combinedChart;
        this.f161065b = i14;
        this.f161066c = new float[8];
        this.f161067d = new float[4];
        this.f161068e = new ShapeDrawable();
        this.f161069f = 1122867;
    }

    public final void a(float f14, float f15, float f16, float f17, ShapeDrawable shapeDrawable, Canvas canvas) {
        float f18 = f16 - f14;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f18, f18, f18, f18, f18, f18, f18, f18}, null, null));
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().set(this.mRenderPaint);
        shapeDrawable.setBounds((int) f14, ((int) f15) - 3, (int) f16, ((int) f17) + 3);
        shapeDrawable.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawData(Canvas canvas) {
        List<T> dataSets;
        i iVar = this;
        canvas.getClass();
        CombinedChart combinedChart = iVar.f161064a;
        CandleData candleData = combinedChart != null ? combinedChart.getCandleData() : null;
        Iterator it = (candleData == null || (dataSets = candleData.getDataSets()) == 0) ? null : dataSets.iterator();
        while (it != null && it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ICandleDataSet iCandleDataSet = (ICandleDataSet) next;
            if (iCandleDataSet.isVisible() && iCandleDataSet.getEntryCount() > 0) {
                Transformer transformer = combinedChart != null ? combinedChart.getTransformer(iCandleDataSet.getAxisDependency()) : null;
                float phaseY = iVar.mAnimator.getPhaseY();
                int iMax = Math.max(iVar.mMinX, 0);
                T entryForIndex = iCandleDataSet.getEntryForIndex(iMax);
                entryForIndex.getClass();
                CandleEntry candleEntry = (CandleEntry) entryForIndex;
                int xIndex = candleEntry.getXIndex();
                if (iMax <= xIndex && xIndex < iVar.f161065b) {
                    float open = candleEntry.getOpen();
                    float close = candleEntry.getClose();
                    float high = candleEntry.getHigh();
                    float low = candleEntry.getLow();
                    float f14 = xIndex;
                    float[] fArr = iVar.f161067d;
                    fArr[0] = f14;
                    fArr[1] = low;
                    fArr[2] = f14;
                    fArr[3] = high;
                    if (transformer != null) {
                        transformer.pointValuesToPixel(fArr);
                    }
                    iVar.mRenderPaint.setColor(iCandleDataSet.getColor());
                    iVar.mRenderPaint.setStyle(Paint.Style.FILL);
                    float f15 = 2;
                    float shadowWidth = fArr[0] - (iCandleDataSet.getShadowWidth() / f15);
                    float f16 = fArr[3];
                    float shadowWidth2 = (iCandleDataSet.getShadowWidth() / f15) + fArr[2];
                    float f17 = fArr[1];
                    ShapeDrawable shapeDrawable = iVar.f161068e;
                    iVar.a(shadowWidth, f16, shadowWidth2, f17, shapeDrawable, canvas);
                    float[] fArr2 = iVar.f161066c;
                    fArr2[0] = f14;
                    fArr2[2] = f14;
                    fArr2[4] = f14;
                    fArr2[6] = f14;
                    fArr2[1] = high * phaseY;
                    fArr2[3] = open * phaseY;
                    fArr2[5] = low * phaseY;
                    fArr2[7] = close * phaseY;
                    if (transformer != null) {
                        transformer.pointValuesToPixel(fArr2);
                    }
                    iVar.mRenderPaint.setColor(iCandleDataSet.getShadowColor() == iVar.f161069f ? iCandleDataSet.getColor(iMax) : iCandleDataSet.getShadowColor());
                    iVar.a(fArr2[0] - (iCandleDataSet.getShadowWidth() / f15), fArr2[1], (iCandleDataSet.getShadowWidth() / f15) + fArr2[2], fArr2[3], shapeDrawable, canvas);
                    a(fArr2[4] - (iCandleDataSet.getShadowWidth() / f15), fArr2[7], (iCandleDataSet.getShadowWidth() / f15) + fArr2[6], fArr2[5], shapeDrawable, canvas);
                }
            }
            iVar = this;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawExtras(Canvas canvas) {
        canvas.getClass();
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float[] fArr, ILineScatterCandleRadarDataSet<?> iLineScatterCandleRadarDataSet) {
        canvas.getClass();
        fArr.getClass();
        iLineScatterCandleRadarDataSet.getClass();
        Path path = new Path();
        canvas.restore();
        canvas.save();
        int highLightColor = iLineScatterCandleRadarDataSet.getHighLightColor();
        float highlightLineWidth = iLineScatterCandleRadarDataSet.getHighlightLineWidth();
        path.reset();
        path.moveTo(fArr[0], this.mViewPortHandler.contentTop() - 90.0f);
        path.lineTo(fArr[0], this.mViewPortHandler.contentBottom());
        this.mHighlightPaint.setColor(highLightColor);
        this.mHighlightPaint.setStrokeWidth(highlightLineWidth);
        canvas.drawPath(path, this.mHighlightPaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        Transformer transformer;
        CandleData candleData;
        canvas.getClass();
        highlightArr.getClass();
        int length = highlightArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            int xIndex = highlightArr[i14].getXIndex();
            CombinedChart combinedChart = this.f161064a;
            ICandleDataSet iCandleDataSet = (combinedChart == null || (candleData = combinedChart.getCandleData()) == null) ? null : (ICandleDataSet) candleData.getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (iCandleDataSet != null && iCandleDataSet.isHighlightEnabled()) {
                T entryForXIndex = iCandleDataSet.getEntryForXIndex(xIndex);
                entryForXIndex.getClass();
                CandleEntry candleEntry = (CandleEntry) entryForXIndex;
                if (candleEntry.getXIndex() == xIndex) {
                    float[] fArr = {xIndex, ((this.mAnimator.getPhaseY() * candleEntry.getHigh()) + (this.mAnimator.getPhaseY() * candleEntry.getLow())) / 2.0f};
                    if (combinedChart != null && (transformer = combinedChart.getTransformer(iCandleDataSet.getAxisDependency())) != null) {
                        transformer.pointValuesToPixel(fArr);
                    }
                    drawHighlightLines(canvas, fArr, iCandleDataSet);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawValues(Canvas canvas) {
        CandleData candleData;
        CandleData candleData2;
        i iVar = this;
        canvas.getClass();
        CombinedChart combinedChart = iVar.f161064a;
        Float fValueOf = (combinedChart == null || (candleData2 = combinedChart.getCandleData()) == null) ? null : Float.valueOf(candleData2.getYValCount());
        Float fValueOf2 = combinedChart != null ? Float.valueOf(combinedChart.getMaxVisibleCount()) : null;
        if (fValueOf == null || fValueOf2 == null) {
            return;
        }
        if (fValueOf.floatValue() < iVar.mViewPortHandler.getScaleX() * fValueOf2.floatValue()) {
            List dataSets = (combinedChart == null || (candleData = combinedChart.getCandleData()) == null) ? null : candleData.getDataSets();
            if (dataSets != null) {
                int size = dataSets.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = dataSets.get(i14);
                    obj.getClass();
                    ICandleDataSet iCandleDataSet = (ICandleDataSet) obj;
                    if (iCandleDataSet.isDrawValuesEnabled() && iCandleDataSet.getEntryCount() != 0) {
                        iVar.applyValueTextStyle(iCandleDataSet);
                        Transformer transformer = combinedChart != null ? combinedChart.getTransformer(iCandleDataSet.getAxisDependency()) : null;
                        int iMax = Math.max(iVar.mMinX, 0);
                        float[] fArrGenerateTransformedValuesCandle = transformer != null ? transformer.generateTransformedValuesCandle(iCandleDataSet, iVar.mAnimator.getPhaseX(), iVar.mAnimator.getPhaseY(), iMax, Math.min(iVar.mMaxX + 1, iCandleDataSet.getEntryCount())) : null;
                        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
                        if (fArrGenerateTransformedValuesCandle != null) {
                            int i15 = 0;
                            while (i15 < fArrGenerateTransformedValuesCandle.length) {
                                float f14 = fArrGenerateTransformedValuesCandle[i15];
                                float f15 = fArrGenerateTransformedValuesCandle[i15 + 1];
                                if (!iVar.mViewPortHandler.isInBoundsRight(f14)) {
                                    break;
                                }
                                if (iVar.mViewPortHandler.isInBoundsLeft(f14) && iVar.mViewPortHandler.isInBoundsY(f15)) {
                                    int i16 = i15 / 2;
                                    T entryForIndex = iCandleDataSet.getEntryForIndex(i16 + iMax);
                                    entryForIndex.getClass();
                                    CandleEntry candleEntry = (CandleEntry) entryForIndex;
                                    iVar.drawValue(canvas, iCandleDataSet.getValueFormatter(), candleEntry.getHigh(), candleEntry, i14, f14, f15 - fConvertDpToPixel, iCandleDataSet.getValueTextColor(i16));
                                }
                                i15 += 2;
                                iVar = this;
                            }
                        }
                    }
                    i14++;
                    iVar = this;
                }
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void initBuffers() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lsw/i$a;", "", "<init>", "()V", "", "PERFECT_CIRCLE_ADJUSTMENT", "F", "TOP_OFFSET", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
