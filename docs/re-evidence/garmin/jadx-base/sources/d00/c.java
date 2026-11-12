package d00;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j23.j;
import j23.t;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld00/c;", "Ld00/a;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BarBuffer[] f57002i;

    public c(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.f57001h = true;
        this.f57002i = new BarBuffer[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d00.a, com.github.mikephil.charting.renderer.BarChartRenderer
    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        f fVar;
        char c14;
        float[] fArr;
        int i15;
        float[] fArr2;
        IBarDataSet iBarDataSet2 = iBarDataSet;
        canvas.getClass();
        iBarDataSet2.getClass();
        Transformer transformer = this.mChart.getTransformer(iBarDataSet2.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            BarBuffer barBuffer = this.f57002i[i14];
            barBuffer.getClass();
            fVar = (f) barBuffer;
            fVar.setPhases(phaseX, phaseY);
            fVar.setDataSet(i14);
            fVar.setInverted(this.mChart.isInverted(iBarDataSet2.getAxisDependency()));
            fVar.feed(iBarDataSet2);
            transformer.pointValuesToPixel(fVar.buffer);
            this.mShadowPaint.setColor(iBarDataSet2.getBarShadowColor());
        } else {
            fVar = null;
        }
        BarBuffer barBuffer2 = this.mBarBuffers[i14];
        barBuffer2.setPhases(phaseX, phaseY);
        barBuffer2.setDataSet(i14);
        barBuffer2.setInverted(this.mChart.isInverted(iBarDataSet2.getAxisDependency()));
        barBuffer2.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer2.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer2.buffer);
        int i16 = 1;
        if (iBarDataSet2.getColors().size() == 1) {
            this.mRenderPaint.setColor(iBarDataSet2.getColor());
        }
        int i17 = 0;
        char c15 = 4;
        j jVarN = t.n(4, t.o(0, barBuffer2.size()));
        int i18 = jVarN.f96796a;
        int i19 = jVarN.f96797b;
        int i24 = jVarN.f96798c;
        if ((i24 <= 0 || i18 > i19) && (i24 >= 0 || i19 > i18)) {
            return;
        }
        while (true) {
            int i25 = i18 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer2.buffer[i25])) {
                i15 = i17;
                c14 = c15;
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer2.buffer[i18])) {
                    return;
                }
                T entryForIndex = iBarDataSet2.getEntryForIndex(i18 / 4);
                entryForIndex.getClass();
                xz.e eVar = (xz.e) entryForIndex;
                int[] iArr = eVar.f192734a;
                boolean z14 = eVar.f192737d;
                c14 = c15;
                int iC = MathKt.c(barBuffer2.buffer[i18]);
                int i26 = i17;
                int i27 = i18 + 1;
                int iC2 = MathKt.c(barBuffer2.buffer[i27]);
                int i28 = i16;
                int iC3 = MathKt.c(barBuffer2.buffer[i25]);
                int iC4 = MathKt.c(barBuffer2.buffer[i18 + 3]);
                int i29 = (iC3 - iC) / 2;
                if (iC4 - iC2 < i29 && this.f57001h && eVar.getY() > 0.0f) {
                    iC4 = iC2 + i29;
                }
                float f14 = i29;
                boolean z15 = eVar.f192736c;
                if (z15 && z14) {
                    fArr = new float[8];
                    fArr[i26] = f14;
                    fArr[i28] = f14;
                    fArr[2] = f14;
                    fArr[3] = f14;
                    fArr[c14] = f14;
                    fArr[5] = f14;
                    fArr[6] = f14;
                    fArr[7] = f14;
                } else if (z15) {
                    fArr = new float[8];
                    fArr[i26] = f14;
                    fArr[i28] = f14;
                    fArr[2] = f14;
                    fArr[3] = f14;
                    fArr[c14] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else if (z14) {
                    fArr = new float[8];
                    fArr[i26] = 0.0f;
                    fArr[i28] = 0.0f;
                    fArr[2] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[c14] = f14;
                    fArr[5] = f14;
                    fArr[6] = f14;
                    fArr[7] = f14;
                } else {
                    fArr = new float[8];
                    fArr[i26] = 0.0f;
                    fArr[i28] = 0.0f;
                    fArr[2] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[c14] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                }
                int i30 = eVar.getY() < eVar.f192735b ? i28 : i26;
                if (this.mChart.isDrawBarShadowEnabled() && i30 != 0) {
                    this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                    shapeDrawable.getPaint().set(this.mShadowPaint);
                    shapeDrawable.setBounds(iC, (fVar == null || (fArr2 = fVar.buffer) == null) ? i26 : MathKt.c(fArr2[i27]), iC3, iC4);
                    shapeDrawable.draw(canvas);
                }
                if (iArr.length <= i28) {
                    this.mRenderPaint.setColor(iArr.length == i28 ? iArr[i26] : iBarDataSet.getColor());
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                    shapeDrawable2.getPaint().set(this.mRenderPaint);
                    shapeDrawable2.setBounds(iC, iC2, iC3, iC4);
                    shapeDrawable2.draw(canvas);
                    i15 = i26;
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                    i15 = i26;
                    gradientDrawable.setShape(i15);
                    gradientDrawable.setCornerRadii(fArr);
                    gradientDrawable.setBounds(iC, iC2, iC3, iC4);
                    gradientDrawable.draw(canvas);
                }
            }
            if (i18 == i19) {
                return;
            }
            i18 += i24;
            iBarDataSet2 = iBarDataSet;
            c15 = c14;
            i17 = i15;
            i16 = 1;
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public final void initBuffers() {
        super.initBuffers();
        BarData barData = this.mChart.getBarData();
        int dataSetCount = barData.getDataSetCount();
        this.f57002i = new BarBuffer[dataSetCount];
        for (int i14 = 0; i14 < dataSetCount; i14++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i14);
            this.f57002i[i14] = new f(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }
}
