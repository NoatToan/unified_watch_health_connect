package d00;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ld00/d;", "Ld00/a;", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "", "hasGaps", "", "gapColor", "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;ZLjava/lang/Integer;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends d00.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f57004i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f57005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f57006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f57007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f57008m;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, Integer num) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        barDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
        this.f57003h = z14;
        this.f57004i = num;
        this.f57005j = true;
        this.f57006k = true;
        this.f57007l = 1;
        this.f57008m = 0.5f;
    }

    public static boolean c(int i14, BarBuffer barBuffer) {
        int i15 = i14 + 4;
        float[] fArr = barBuffer.buffer;
        fArr.getClass();
        if (i15 <= fArr.length - 1) {
            float[] fArr2 = barBuffer.buffer;
            if (fArr2[i14] == fArr2[i15]) {
                while (true) {
                    int i16 = i15 + 3;
                    float[] fArr3 = barBuffer.buffer;
                    fArr3.getClass();
                    if (i16 > fArr3.length - 1) {
                        break;
                    }
                    float[] fArr4 = barBuffer.buffer;
                    if (fArr4[i14] != fArr4[i15]) {
                        break;
                    }
                    if (fArr4[i15 + 1] != fArr4[i16]) {
                        return false;
                    }
                    i15 += 4;
                }
            }
        }
        return true;
    }

    public final void b(int i14, int i15, int i16, int i17, ShapeDrawable shapeDrawable, Canvas canvas) {
        float f14 = i16 - i14;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f14, f14, f14, f14, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().set(this.mRenderPaint);
        shapeDrawable.setBounds(i14, i15, i16, i17);
        shapeDrawable.draw(canvas);
    }

    @Override // d00.a, com.github.mikephil.charting.renderer.BarChartRenderer
    public final void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i14) {
        int i15;
        int i16;
        canvas.getClass();
        iBarDataSet.getClass();
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        transformer.getClass();
        BarBuffer barBufferA = a(iBarDataSet, i14, transformer, phaseX, phaseY);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float fConvertDpToPixel = Utils.convertDpToPixel(this.f57007l);
        if (this.mChart.isDrawBarShadowEnabled()) {
            for (int i17 = 0; i17 < barBufferA.size(); i17 += 4) {
                int i18 = i17 + 2;
                if (this.mViewPortHandler.isInBoundsLeft(barBufferA.buffer[i18])) {
                    if (!this.mViewPortHandler.isInBoundsRight(barBufferA.buffer[i17])) {
                        break;
                    } else {
                        canvas.drawRect(barBufferA.buffer[i17], this.mViewPortHandler.contentTop(), barBufferA.buffer[i18], this.mViewPortHandler.contentBottom(), this.mShadowPaint);
                    }
                }
            }
        }
        int size = iBarDataSet.getColors().size();
        boolean z14 = this.f57005j;
        boolean z15 = this.f57006k;
        if (size > 1) {
            int i19 = 0;
            int i24 = 0;
            while (i24 < barBufferA.size()) {
                int i25 = i24 + 2;
                if (!this.mViewPortHandler.isInBoundsLeft(barBufferA.buffer[i25])) {
                    i24 += 4;
                } else {
                    if (!this.mViewPortHandler.isInBoundsRight(barBufferA.buffer[i24])) {
                        return;
                    }
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i24 / 4));
                    float[] fArr = barBufferA.buffer;
                    float f14 = fArr[i24 + 1];
                    float f15 = fArr[i24 + 3];
                    if (z15) {
                        if (f15 >= this.mViewPortHandler.contentBottom()) {
                            i19 = 0;
                        }
                        int i26 = i19 + 1;
                        float f16 = i19 * fConvertDpToPixel;
                        f14 -= f16;
                        f15 -= f16;
                        i16 = i26;
                    } else {
                        i16 = i19;
                    }
                    float f17 = f15;
                    float f18 = f14;
                    if (z14 && c(i24, barBufferA)) {
                        b(MathKt.c(barBufferA.buffer[i24]), MathKt.c(f18), MathKt.c(barBufferA.buffer[i25]), MathKt.c(f17), shapeDrawable, canvas);
                    } else {
                        float[] fArr2 = barBufferA.buffer;
                        canvas.drawRect(fArr2[i24], f18, fArr2[i25], f17, this.mRenderPaint);
                    }
                    i24 += 4;
                    i19 = i16;
                }
            }
            return;
        }
        if (iBarDataSet.getColors().size() != 0) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
            int i27 = 0;
            int i28 = 0;
            while (i28 < barBufferA.size()) {
                int i29 = i28 + 2;
                if (!this.mViewPortHandler.isInBoundsLeft(barBufferA.buffer[i29])) {
                    i28 += 4;
                } else {
                    if (!this.mViewPortHandler.isInBoundsRight(barBufferA.buffer[i28])) {
                        return;
                    }
                    float[] fArr3 = barBufferA.buffer;
                    float f19 = fArr3[i28 + 1];
                    float f22 = fArr3[i28 + 3];
                    if (z15) {
                        if (f22 >= this.mViewPortHandler.contentBottom()) {
                            i27 = 0;
                        }
                        int i30 = i27 + 1;
                        float f24 = i27 * fConvertDpToPixel;
                        f19 -= f24;
                        f22 -= f24;
                        i15 = i30;
                    } else {
                        i15 = i27;
                    }
                    float f25 = f22;
                    float f26 = f19;
                    if (z14 && c(i28, barBufferA)) {
                        b(MathKt.c(barBufferA.buffer[i28]), MathKt.c(f26), MathKt.c(barBufferA.buffer[i29]), MathKt.c(f25), shapeDrawable, canvas);
                    } else {
                        float[] fArr4 = barBufferA.buffer;
                        canvas.drawRect(fArr4[i28], f26, fArr4[i29], f25, this.mRenderPaint);
                        if (this.f57003h) {
                            Integer num = this.f57004i;
                            if (num != null) {
                                this.mRenderPaint.setColor(num.intValue());
                            }
                            float[] fArr5 = barBufferA.buffer;
                            canvas.drawRect(fArr5[i28], f26 + 5.0f, fArr5[i29], f26, this.mRenderPaint);
                        }
                    }
                    i28 += 4;
                    i27 = i15;
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public final void prepareBarHighlight(float f14, float f15, float f16, float f17, Transformer transformer) {
        transformer.getClass();
        float f18 = this.f57008m;
        this.mBarRect.set((f14 - f18) + f17, f15, (f14 + f18) - f17, f16);
        transformer.rectValueToPixel(this.mBarRect);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld00/d$a;", "", "<init>", "()V", "", "DEFAULT_STACK_SPACE_DP", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, boolean z14, Integer num, int i14, j jVar) {
        this(barDataProvider, chartAnimator, viewPortHandler, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : num);
    }
}
