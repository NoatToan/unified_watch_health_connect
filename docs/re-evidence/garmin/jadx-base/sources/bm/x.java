package bm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class x extends mz.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Transformer f18875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f18876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18877l;

    public x(LineChart lineChart, mz.d dVar, int i14, int i15) {
        super(lineChart, dVar);
        this.f18876k = new float[4];
        this.f18877l = false;
        this.f18873h = i14;
        this.f18874i = i15;
    }

    @Override // mz.a, com.github.mikephil.chartingv2.renderer.LineRadarRenderer
    public final void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        if (!this.f18877l) {
            super.drawFilledPath(canvas, path, drawable);
            return;
        }
        canvas.save();
        if (this.f121604a) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            canvas.clipPath(path);
        }
        Transformer transformer = this.f18875j;
        if (transformer != null) {
            float[] fArr = {0.0f, 0.0f};
            fArr[0] = this.f18873h;
            transformer.pointValuesToPixel(fArr);
            drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) fArr[0], (int) this.mViewPortHandler.contentBottom());
            drawable.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        if (this.f121604a) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            canvas.clipPath(path);
        }
        Transformer transformer2 = this.f18875j;
        if (transformer2 != null) {
            float[] fArr2 = {0.0f, 0.0f};
            fArr2[0] = this.f18874i;
            transformer2.pointValuesToPixel(fArr2);
            drawable.setBounds((int) fArr2[0], (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
            drawable.draw(canvas);
        }
        canvas.restore();
        this.f18877l = false;
    }

    /* JADX WARN: Type inference failed for: r14v16, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // mz.a, com.github.mikephil.chartingv2.renderer.LineChartRenderer
    public final void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        int i14;
        char c14;
        char c15;
        boolean z14 = true;
        if (iLineDataSet.getLabel().equals("TrimActivityDataSet")) {
            this.f18877l = true;
        }
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        char c16 = 2;
        int i15 = zIsDrawSteppedEnabled ? 4 : 2;
        this.f18875j = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        int i16 = this.mMinX;
        int i17 = 0;
        if (i16 < 0) {
            i16 = 0;
        }
        T entryForXIndex = iLineDataSet.getEntryForXIndex(i16, DataSet.Rounding.DOWN);
        T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
        int iMax = Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0);
        int iMin = Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount);
        int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
        int size = iLineDataSet.getColors().size();
        float[] fArr = this.f18876k;
        if (size > 1) {
            int i18 = i15 * 2;
            if (fArr.length != i18) {
                this.f18876k = new float[i18];
            }
            int i19 = iMax;
            while (i19 < iCeil && (iCeil <= 1 || i19 != iCeil - 1)) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i19);
                if (entryForIndex == 0) {
                    c14 = c16;
                } else {
                    c14 = c16;
                    this.f18876k[0] = entryForIndex.getXIndex();
                    this.f18876k[1] = entryForIndex.getVal() * phaseY;
                    int i24 = i19 + 1;
                    if (i24 < iCeil) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i24);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        float[] fArr2 = this.f18876k;
                        if (zIsDrawSteppedEnabled) {
                            c15 = 3;
                            fArr2[c14] = entryForIndex2.getXIndex();
                            float[] fArr3 = this.f18876k;
                            float f14 = fArr3[1];
                            fArr3[3] = f14;
                            fArr3[4] = fArr3[c14];
                            fArr3[5] = f14;
                            fArr3[6] = entryForIndex2.getXIndex();
                            this.f18876k[7] = entryForIndex2.getVal() * phaseY;
                        } else {
                            c15 = 3;
                            fArr2[c14] = entryForIndex2.getXIndex();
                            this.f18876k[3] = entryForIndex2.getVal() * phaseY;
                        }
                    } else {
                        c15 = 3;
                        float[] fArr4 = this.f18876k;
                        fArr4[c14] = fArr4[0];
                        fArr4[3] = fArr4[1];
                    }
                    this.f18875j.pointValuesToPixel(this.f18876k);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f18876k[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f18876k[c14]) && (this.mViewPortHandler.isInBoundsTop(this.f18876k[1]) || this.mViewPortHandler.isInBoundsBottom(this.f18876k[c15]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i19));
                        canvas2.drawLines(this.f18876k, 0, i18, this.mRenderPaint);
                    }
                }
                i19++;
                c16 = c14;
            }
            i14 = entryCount;
        } else {
            int i25 = (entryCount - 1) * i15;
            if (fArr.length != Math.max(i25, i15) * 2) {
                this.f18876k = new float[Math.max(i25, i15) * 2];
            }
            int i26 = iCeil > 1 ? iMax + 1 : iMax;
            int i27 = 0;
            while (i26 < iCeil) {
                ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i26 == 0 ? i17 : i26 - 1);
                ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i26);
                if (entryForIndex3 == 0 || entryForIndex4 == 0) {
                    entryCount = entryCount;
                } else {
                    this.f18876k[i27] = entryForIndex3.getXIndex();
                    int i28 = i27 + 2;
                    this.f18876k[i27 + 1] = entryForIndex3.getVal() * phaseY;
                    if (zIsDrawSteppedEnabled) {
                        this.f18876k[i28] = entryForIndex4.getXIndex();
                        this.f18876k[i27 + 3] = entryForIndex3.getVal() * phaseY;
                        this.f18876k[i27 + 4] = entryForIndex4.getXIndex();
                        this.f18876k[i27 + 5] = entryForIndex3.getVal() * phaseY;
                        i28 = i27 + 6;
                    }
                    this.f18876k[i28] = entryForIndex4.getXIndex();
                    i27 = i28 + 2;
                    this.f18876k[i28 + 1] = entryForIndex4.getVal() * phaseY;
                }
                i26++;
                z14 = z14;
                entryCount = entryCount;
                i17 = 0;
            }
            i14 = entryCount;
            this.f18875j.pointValuesToPixel(this.f18876k);
            int iMax2 = Math.max(((iCeil - iMax) - 1) * i15, i15) * 2;
            this.mRenderPaint.setColor(iLineDataSet.getColor());
            canvas2.drawLines(this.f18876k, 0, iMax2, this.mRenderPaint);
        }
        this.mRenderPaint.setPathEffect(null);
        if (!iLineDataSet.isDrawFilledEnabled() || i14 <= 0) {
            return;
        }
        drawLinearFill(canvas, iLineDataSet, iMax, iMin, this.f18875j);
    }
}
