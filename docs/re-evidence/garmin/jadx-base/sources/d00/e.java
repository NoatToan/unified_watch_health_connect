package d00;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import w5.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld00/e;", "Ld00/a;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "", "hasGaps", "", "gapColor", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;ZLjava/lang/Integer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f57010i;

    public /* synthetic */ e(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, Integer num, int i14, j jVar) {
        this(barDataProvider, chartAnimator, viewPortHandler, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : num);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0068  */
    @Override // d00.a, com.github.mikephil.charting.renderer.BarChartRenderer
    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        char c14;
        canvas.getClass();
        iBarDataSet.getClass();
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        transformer.getClass();
        BarBuffer barBufferA = a(iBarDataSet, i14, transformer, phaseX, phaseY);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        char c15 = 4;
        int size = barBufferA.size() - 4;
        int iN = r.n(size, 0, -4);
        if (iN <= size) {
            while (true) {
                float[] fArr = barBufferA.buffer;
                float f14 = fArr[size];
                float f15 = fArr[size + 1];
                if (linkedHashMap.containsKey(Float.valueOf(f14))) {
                    Object obj = linkedHashMap.get(Float.valueOf(f14));
                    obj.getClass();
                    if (f15 < ((Number) obj).floatValue()) {
                        linkedHashMap.put(Float.valueOf(f14), Float.valueOf(f15));
                    }
                } else {
                    linkedHashMap.put(Float.valueOf(f14), Float.valueOf(f15));
                }
                if (size == iN) {
                    break;
                } else {
                    size -= 4;
                }
            }
        }
        int size2 = barBufferA.size() - 4;
        int iN2 = r.n(size2, 0, -4);
        if (iN2 > size2) {
            return;
        }
        while (true) {
            int i15 = size2 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBufferA.buffer[i15])) {
                c14 = c15;
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(barBufferA.buffer[size2])) {
                    return;
                }
                float[] fArr2 = barBufferA.buffer;
                float f16 = fArr2[size2];
                float f17 = fArr2[size2 + 1];
                float f18 = fArr2[3];
                this.mRenderPaint.setColor(iBarDataSet.getColor(size2 / 4));
                boolean zE = s.e((Float) linkedHashMap.get(Float.valueOf(f16)), f17);
                float[] fArr3 = barBufferA.buffer;
                if (zE) {
                    int iC = MathKt.c(fArr3[size2]);
                    int iC2 = MathKt.c(f17);
                    int iC3 = MathKt.c(barBufferA.buffer[i15]);
                    int iC4 = MathKt.c(f18);
                    float f19 = iC3 - iC;
                    c14 = c15;
                    float[] fArr4 = new float[8];
                    fArr4[0] = f19;
                    fArr4[1] = f19;
                    fArr4[2] = f19;
                    fArr4[3] = f19;
                    fArr4[c14] = 0.0f;
                    fArr4[5] = 0.0f;
                    fArr4[6] = 0.0f;
                    fArr4[7] = 0.0f;
                    shapeDrawable.setShape(new RoundRectShape(fArr4, null, null));
                    shapeDrawable.getPaint().set(this.mRenderPaint);
                    shapeDrawable.setBounds(iC, iC2, iC3, iC4);
                    shapeDrawable.draw(canvas);
                } else {
                    c14 = c15;
                    canvas.drawRect(fArr3[size2], f17, fArr3[i15], f18, this.mRenderPaint);
                    if (this.f57009h) {
                        Integer num = this.f57010i;
                        if (num != null) {
                            this.mRenderPaint.setColor(num.intValue());
                        }
                        float[] fArr5 = barBufferA.buffer;
                        canvas.drawRect(fArr5[size2], 5.0f + f17, fArr5[i15], f17, this.mRenderPaint);
                    }
                }
            }
            if (size2 == iN2) {
                return;
            }
            size2 -= 4;
            c15 = c14;
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        transformer.getClass();
        this.mBarRect.set((f14 - 0.5f) + f17, f15, (f14 + 0.5f) - f17, f16);
        transformer.rectValueToPixel(this.mBarRect);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, Integer num) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        barDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
        this.f57009h = z14;
        this.f57010i = num;
    }
}
