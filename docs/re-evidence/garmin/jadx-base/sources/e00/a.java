package e00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.CandleStickChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le00/a;", "Lcom/github/mikephil/charting/renderer/CandleStickChartRenderer;", "Lcom/github/mikephil/charting/interfaces/dataprovider/CandleDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/CandleDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends CandleStickChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f61833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f61834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f61835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f61836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f61837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(candleDataProvider, chartAnimator, viewPortHandler);
        candleDataProvider.getClass();
        this.f61833a = new float[8];
        this.f61834b = new float[4];
        this.f61835c = new float[4];
        this.f61836d = new float[4];
        this.f61837e = new float[4];
    }

    public final void a(Canvas canvas, float f14, float f15, float f16, float f17) {
        float f18 = f16 - f14;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f18, f18, f18, f18, f18, f18, f18, f18}, null, null));
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().set(this.mRenderPaint);
        shapeDrawable.setBounds((int) f14, (int) f15, (int) f16, (int) f17);
        shapeDrawable.draw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.CandleStickChartRenderer
    public final void drawDataSet(Canvas canvas, ICandleDataSet iCandleDataSet) {
        int color;
        int i14;
        a aVar = this;
        canvas.getClass();
        iCandleDataSet.getClass();
        Transformer transformer = aVar.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        float phaseY = aVar.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        boolean showCandleBar = iCandleDataSet.getShowCandleBar();
        aVar.mXBounds.set(aVar.mChart, iCandleDataSet);
        aVar.mRenderPaint.setStrokeWidth(iCandleDataSet.getShadowWidth());
        BarLineScatterCandleBubbleRenderer.XBounds xBounds = aVar.mXBounds;
        int i15 = xBounds.min;
        int i16 = xBounds.range + i15;
        if (i15 > i16) {
            return;
        }
        int i17 = i15;
        while (true) {
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(i17);
            if (candleEntry == null) {
                phaseY = phaseY;
            } else {
                float x14 = candleEntry.getX();
                float open = candleEntry.getOpen();
                float close = candleEntry.getClose();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (showCandleBar) {
                    float[] fArr = aVar.f61833a;
                    fArr[0] = x14;
                    fArr[2] = x14;
                    fArr[4] = x14;
                    fArr[6] = x14;
                    if (open > close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = open * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = close * phaseY;
                    } else if (open < close) {
                        fArr[1] = high * phaseY;
                        fArr[3] = close * phaseY;
                        fArr[5] = low * phaseY;
                        fArr[7] = open * phaseY;
                    } else {
                        fArr[1] = high * phaseY;
                        float f14 = open * phaseY;
                        fArr[3] = f14;
                        fArr[5] = low * phaseY;
                        fArr[7] = f14;
                    }
                    transformer.pointValuesToPixel(fArr);
                    if (!iCandleDataSet.getShadowColorSameAsCandle()) {
                        aVar.mRenderPaint.setColor(iCandleDataSet.getShadowColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getShadowColor());
                    } else if (open > close) {
                        aVar.mRenderPaint.setColor(iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getDecreasingColor());
                    } else {
                        Paint paint = aVar.mRenderPaint;
                        if (open < close) {
                            paint.setColor(iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getIncreasingColor());
                        } else {
                            paint.setColor(iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getNeutralColor());
                        }
                    }
                    aVar.mRenderPaint.setStyle(Paint.Style.STROKE);
                    if (Float.isNaN(fArr[1]) || Float.isNaN(fArr[3])) {
                        i14 = 1122867;
                    } else {
                        float f15 = 2;
                        i14 = 1122867;
                        aVar.a(canvas, fArr[0] - (iCandleDataSet.getShadowWidth() / f15), fArr[1], (iCandleDataSet.getShadowWidth() / f15) + fArr[2], fArr[3]);
                    }
                    float[] fArr2 = aVar.f61834b;
                    fArr2[0] = (x14 - 0.5f) + barSpace;
                    fArr2[1] = close * phaseY;
                    fArr2[r4] = (x14 + 0.5f) - barSpace;
                    fArr2[3] = open * phaseY;
                    transformer.pointValuesToPixel(fArr2);
                    if (open != 0.0f && close != 0.0f) {
                        if (open > close) {
                            int decreasingColor = iCandleDataSet.getDecreasingColor();
                            Paint paint2 = aVar.mRenderPaint;
                            if (decreasingColor == i14) {
                                paint2.setColor(iCandleDataSet.getColor(i17));
                            } else {
                                paint2.setColor(iCandleDataSet.getDecreasingColor());
                            }
                            aVar.mRenderPaint.setStyle(iCandleDataSet.getDecreasingPaintStyle());
                            aVar.a(canvas, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                        } else if (open < close) {
                            int increasingColor = iCandleDataSet.getIncreasingColor();
                            Paint paint3 = aVar.mRenderPaint;
                            if (increasingColor == i14) {
                                paint3.setColor(iCandleDataSet.getColor(i17));
                            } else {
                                paint3.setColor(iCandleDataSet.getIncreasingColor());
                            }
                            aVar.mRenderPaint.setStyle(iCandleDataSet.getIncreasingPaintStyle());
                            aVar.a(canvas, fArr2[0], fArr2[1], fArr2[r4], fArr2[3]);
                        } else {
                            int neutralColor = iCandleDataSet.getNeutralColor();
                            Paint paint4 = aVar.mRenderPaint;
                            if (neutralColor == i14) {
                                paint4.setColor(iCandleDataSet.getColor(i17));
                            } else {
                                paint4.setColor(iCandleDataSet.getNeutralColor());
                            }
                            aVar.a(canvas, fArr2[0], fArr2[1], fArr2[r4], fArr2[3]);
                        }
                    }
                } else {
                    phaseY = phaseY;
                    float[] fArr3 = aVar.f61835c;
                    fArr3[0] = x14;
                    fArr3[1] = high * phaseY;
                    fArr3[2] = x14;
                    fArr3[3] = low * phaseY;
                    float[] fArr4 = aVar.f61836d;
                    fArr4[0] = (x14 - 0.5f) + barSpace;
                    float f16 = open * phaseY;
                    fArr4[1] = f16;
                    fArr4[2] = x14;
                    fArr4[3] = f16;
                    float[] fArr5 = aVar.f61837e;
                    fArr5[0] = (x14 + 0.5f) - barSpace;
                    float f17 = close * phaseY;
                    fArr5[1] = f17;
                    fArr5[2] = x14;
                    fArr5[3] = f17;
                    transformer.pointValuesToPixel(fArr3);
                    transformer.pointValuesToPixel(fArr4);
                    transformer.pointValuesToPixel(fArr5);
                    if (open > close) {
                        color = iCandleDataSet.getDecreasingColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getDecreasingColor();
                    } else if (open < close) {
                        color = iCandleDataSet.getIncreasingColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getIncreasingColor();
                    } else {
                        color = iCandleDataSet.getNeutralColor() == 1122867 ? iCandleDataSet.getColor(i17) : iCandleDataSet.getNeutralColor();
                    }
                    aVar.mRenderPaint.setColor(color);
                    aVar.a(canvas, fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                    a(canvas, fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    a(canvas, fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                }
            }
            if (i17 == i16) {
                return;
            }
            i17++;
            aVar = this;
            phaseY = phaseY;
        }
    }
}
