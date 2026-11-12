package pq0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j23.j;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import xz.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpq0/a;", "Lcom/github/mikephil/charting/renderer/BarChartRenderer;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends BarChartRenderer {
    public a(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
    }

    public float a() {
        return -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        char c14;
        int i15;
        canvas.getClass();
        iBarDataSet.getClass();
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarBuffer barBuffer = this.mBarBuffers[i14];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i14);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        int i16 = 0;
        char c15 = 4;
        j jVarN = t.n(4, t.o(0, barBuffer.size()));
        int i17 = jVarN.f96796a;
        int i18 = jVarN.f96797b;
        int i19 = jVarN.f96798c;
        if ((i19 <= 0 || i17 > i18) && (i19 >= 0 || i18 > i17)) {
            return;
        }
        while (true) {
            int i24 = i17 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i24])) {
                i15 = i16;
                c14 = c15;
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i17])) {
                    return;
                }
                T entryForIndex = iBarDataSet.getEntryForIndex(i17 / 4);
                entryForIndex.getClass();
                e eVar = (e) entryForIndex;
                int iC = MathKt.c(barBuffer.buffer[i17]);
                int iC2 = MathKt.c(barBuffer.buffer[i17 + 1]);
                int iC3 = MathKt.c(barBuffer.buffer[i24]);
                int iC4 = MathKt.c(barBuffer.buffer[i17 + 3]);
                int i25 = (iC3 - iC) / 2;
                c14 = c15;
                Drawable drawableMutate = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, eVar.f192734a).mutate();
                drawableMutate.getClass();
                GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
                gradientDrawable.setShape(i16);
                float fA = a() > 0.0f ? a() : i25;
                i15 = i16;
                if (eVar.f192736c) {
                    float[] fArr = new float[8];
                    fArr[i15] = fA;
                    fArr[1] = fA;
                    fArr[2] = fA;
                    fArr[3] = fA;
                    fArr[c14] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                    gradientDrawable.setCornerRadii(fArr);
                }
                gradientDrawable.setBounds(iC, iC2, iC3, iC4);
                gradientDrawable.setUseLevel(true);
                gradientDrawable.setLevel((int) ((eVar.getY() * 10000) / eVar.f192735b));
                gradientDrawable.draw(canvas);
            }
            if (i17 == i18) {
                return;
            }
            i17 += i19;
            c15 = c14;
            i16 = i15;
        }
    }
}
