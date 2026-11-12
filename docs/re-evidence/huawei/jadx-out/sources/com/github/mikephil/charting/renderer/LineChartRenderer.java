package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LineChartRenderer extends LineRadarRenderer {
    protected Path cubicFillPath;
    protected Path cubicPath;
    protected Canvas mBitmapCanvas;
    protected Bitmap.Config mBitmapConfig;
    protected LineDataProvider mChart;
    public Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mGenerateFilledPathBuffer;
    private HashMap<IDataSet, DataSetImageCache> mImageCaches;
    private float[] mLineBuffer;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public LineChartRenderer(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        this.cubicPath = new Path();
        this.cubicFillPath = new Path();
        this.mLineBuffer = new float[4];
        this.mGenerateFilledPathBuffer = new Path();
        this.mImageCaches = new HashMap<>();
        this.mCirclesBuffer = new float[2];
        this.mChart = lineDataProvider;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (T t : this.mChart.getLineData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.mRenderPaint);
    }

    protected void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
        int i = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[iLineDataSet.getMode().ordinal()];
        if (i == 3) {
            drawCubicBezier(iLineDataSet);
        } else if (i != 4) {
            drawLinear(canvas, iLineDataSet);
        } else {
            drawHorizontalBezier(iLineDataSet);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawHorizontalBezier(ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        if (this.mXBounds.range >= 1) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i = this.mXBounds.min + 1;
            ?? r2 = entryForIndex;
            while (i <= this.mXBounds.range + this.mXBounds.min) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i);
                float x = r2.getX() + ((entryForIndex2.getX() - r2.getX()) / 2.0f);
                Path path = this.cubicPath;
                float y = r2.getY();
                path.cubicTo(x, y * phaseY, x, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i++;
                r2 = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicBezier(ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        if (this.mXBounds.range >= 1) {
            int i = this.mXBounds.min;
            int i2 = this.mXBounds.min;
            int i3 = this.mXBounds.range;
            Object entryForIndex = iLineDataSet.getEntryForIndex(Math.max(i - 1, 0));
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(Math.max(i, 0));
            if (entryForIndex2 != 0) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i4 = -1;
                int i5 = this.mXBounds.min + 1;
                ?? r5 = entryForIndex;
                ?? r4 = entryForIndex2;
                ?? r2 = entryForIndex2;
                while (true) {
                    ?? entryForIndex3 = r2;
                    if (i5 > this.mXBounds.range + this.mXBounds.min) {
                        break;
                    }
                    if (i4 != i5) {
                        entryForIndex3 = iLineDataSet.getEntryForIndex(i5);
                    }
                    int i6 = i5 + 1;
                    if (i6 < iLineDataSet.getEntryCount()) {
                        i5 = i6;
                    }
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i5);
                    float x = entryForIndex3.getX();
                    float x2 = r5.getX();
                    float y = entryForIndex3.getY();
                    float y2 = r5.getY();
                    float x3 = entryForIndex4.getX();
                    float x4 = r4.getX();
                    float y3 = entryForIndex4.getY();
                    float y4 = r4.getY();
                    this.cubicPath.cubicTo(r4.getX() + ((x - x2) * cubicIntensity), (r4.getY() + ((y - y2) * cubicIntensity)) * phaseY, entryForIndex3.getX() - ((x3 - x4) * cubicIntensity), (entryForIndex3.getY() - ((y3 - y4) * cubicIntensity)) * phaseY, entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
                    r5 = r4;
                    i4 = i5;
                    i5 = i6;
                    r4 = entryForIndex3;
                    r2 = entryForIndex4;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicFill(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v15, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        char c2;
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        char c3 = 4;
        int i = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        char c4 = 0;
        char c5 = 1;
        if (iLineDataSet.getColors().size() > 1) {
            int i2 = i * 2;
            if (this.mLineBuffer.length <= i2) {
                this.mLineBuffer = new float[i * 4];
            }
            int i3 = this.mXBounds.min;
            int i4 = this.mXBounds.range;
            int i5 = this.mXBounds.min;
            while (i5 < i3 + i4) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i5);
                if (entryForIndex != 0) {
                    this.mLineBuffer[c4] = entryForIndex.getX();
                    this.mLineBuffer[c5] = entryForIndex.getY() * phaseY;
                    if (i5 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i5 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (zIsDrawSteppedEnabled) {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            float[] fArr = this.mLineBuffer;
                            float f = fArr[c5];
                            fArr[3] = f;
                            fArr[c3] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = entryForIndex2.getX();
                            this.mLineBuffer[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            this.mLineBuffer[3] = entryForIndex2.getY() * phaseY;
                        }
                        c2 = 0;
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        c2 = 0;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[c5];
                    }
                    float[] fArr3 = this.mLineBuffer;
                    float f2 = fArr3[c2];
                    float f3 = fArr3[c5];
                    float f4 = fArr3[i2 - 2];
                    float f5 = fArr3[i2 - 1];
                    if (f2 != f4 || f3 != f5) {
                        transformer.pointValuesToPixel(fArr3);
                        if (!this.mViewPortHandler.isInBoundsRight(f2)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f4) && this.mViewPortHandler.isInBoundsTop(Math.max(f3, f5)) && this.mViewPortHandler.isInBoundsBottom(Math.min(f3, f5))) {
                            this.mRenderPaint.setColor(iLineDataSet.getColor(i5));
                            canvas2.drawLines(this.mLineBuffer, 0, i2, this.mRenderPaint);
                        }
                    }
                }
                i5++;
                c3 = 4;
                c4 = 0;
                c5 = 1;
            }
        } else {
            int i6 = entryCount * i;
            if (this.mLineBuffer.length < Math.max(i6, i) * 2) {
                this.mLineBuffer = new float[Math.max(i6, i) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i7 = this.mXBounds.min;
                int i8 = 0;
                while (i7 <= this.mXBounds.range + this.mXBounds.min) {
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i7 == 0 ? 0 : i7 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i7);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        this.mLineBuffer[i8] = entryForIndex3.getX();
                        int i9 = i8 + 2;
                        this.mLineBuffer[i8 + 1] = entryForIndex3.getY() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            this.mLineBuffer[i9] = entryForIndex4.getX();
                            this.mLineBuffer[i8 + 3] = entryForIndex3.getY() * phaseY;
                            this.mLineBuffer[i8 + 4] = entryForIndex4.getX();
                            i9 = i8 + 6;
                            this.mLineBuffer[i8 + 5] = entryForIndex3.getY() * phaseY;
                        }
                        this.mLineBuffer[i9] = entryForIndex4.getX();
                        this.mLineBuffer[i9 + 1] = entryForIndex4.getY() * phaseY;
                        i8 = i9 + 2;
                    }
                    i7++;
                }
                if (i8 > 0) {
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    int iMax = Math.max((this.mXBounds.range + 1) * i, i);
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.mLineBuffer, 0, iMax * 2, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i;
        int iMin;
        int iMax;
        int iMin2;
        Path path = this.mGenerateFilledPathBuffer;
        int i2 = xBounds.min;
        int i3 = xBounds.range + xBounds.min;
        int i4 = 0;
        do {
            i = (i4 * 128) + i2;
            iMin = Math.min(i + 128, i3);
            if (i <= iMin) {
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    iMax = Math.max(0, i - 1);
                    iMin2 = Math.min(i3, iMin + 1);
                } else {
                    iMax = i;
                    iMin2 = iMin;
                }
                generateFilledPath(iLineDataSet, iMax, iMin2, path);
                transformer.pathValueToPixel(path);
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i4++;
        } while (i <= iMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v4 */
    private void generateFilledPath(ILineDataSet iLineDataSet, int i, int i2, Path path) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i3 = i + 1;
        ?? r4 = 0;
        ?? r3 = entryForIndex;
        while (i3 <= i2) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            if (entryForIndex2 != 0) {
                if (z) {
                    path.lineTo(entryForIndex2.getX(), r3.getY() * phaseY);
                }
                path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                r3 = entryForIndex2;
            }
            i3++;
            r3 = r3;
            r4 = entryForIndex2;
        }
        if (r4 != 0) {
            path.lineTo(r4.getX(), fillLinePosition);
        }
        path.close();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getLineData().getDataSets();
            for (int i = 0; i < dataSets.size(); i++) {
                ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
                if (iLineDataSet.getEntryCount() != 0 && shouldDrawValues(iLineDataSet) && iLineDataSet.getEntryCount() >= 1) {
                    applyValueTextStyle(iLineDataSet);
                    Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i2 = circleRadius;
                    this.mXBounds.set(this.mChart, iLineDataSet);
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    MPPointF mPPointF = MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                    int i3 = 0;
                    while (i3 < fArrGenerateTransformedValuesLine.length) {
                        float f = fArrGenerateTransformedValuesLine[i3];
                        float f2 = fArrGenerateTransformedValuesLine[i3 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2)) {
                            int i4 = i3 / 2;
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min + i4);
                            if (entryForIndex != 0) {
                                if (iLineDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i, f, f2 - i2, iLineDataSet.getValueTextColor(i4));
                                }
                                if (entryForIndex.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entryForIndex.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i3 = i3;
                                mPPointF = mPPointF;
                            }
                        } else {
                            i3 = i3;
                            mPPointF = mPPointF;
                        }
                        i3 += 2;
                        mPPointF = mPPointF;
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCircles(Canvas canvas) {
        DataSetImageCache dataSetImageCache;
        ?? entryForIndex;
        Bitmap bitmap;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.mCirclesBuffer;
        char c2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c3 = 1;
        fArr[1] = 0.0f;
        List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i = 0;
        while (i < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f) ? c2 : c3;
                boolean z2 = (z == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? c2 : c3;
                AnonymousClass1 anonymousClass1 = null;
                if (this.mImageCaches.containsKey(iLineDataSet)) {
                    dataSetImageCache = this.mImageCaches.get(iLineDataSet);
                } else {
                    DataSetImageCache dataSetImageCache2 = new DataSetImageCache(this, anonymousClass1);
                    this.mImageCaches.put(iLineDataSet, dataSetImageCache2);
                    dataSetImageCache = dataSetImageCache2;
                }
                if (dataSetImageCache.init(iLineDataSet)) {
                    dataSetImageCache.fill(iLineDataSet, z, z2);
                }
                int i2 = this.mXBounds.range;
                int i3 = this.mXBounds.min;
                int i4 = this.mXBounds.min;
                while (i4 <= i2 + i3 && (entryForIndex = iLineDataSet.getEntryForIndex(i4)) != 0) {
                    this.mCirclesBuffer[c2] = entryForIndex.getX();
                    this.mCirclesBuffer[c3] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mCirclesBuffer[c2])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mCirclesBuffer[c2]) && this.mViewPortHandler.isInBoundsY(this.mCirclesBuffer[c3]) && (bitmap = dataSetImageCache.getBitmap(i4)) != null) {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmap, fArr2[c2] - circleRadius, fArr2[c3] - circleRadius, (Paint) null);
                    }
                    i4++;
                    c2 = 0;
                    c3 = 1;
                }
            }
            i++;
            c2 = 0;
            f = 0.0f;
            c3 = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        LineData lineData = this.mChart.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iLineDataSet);
                }
            }
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    class DataSetImageCache {
        private Bitmap[] circleBitmaps;
        private Path mCirclePathBuffer;

        private DataSetImageCache() {
            this.mCirclePathBuffer = new Path();
        }

        /* synthetic */ DataSetImageCache(LineChartRenderer lineChartRenderer, AnonymousClass1 anonymousClass1) {
            this();
        }

        protected boolean init(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.circleBitmaps = new Bitmap[circleColorCount];
            return true;
        }

        protected void fill(ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (((double) circleRadius) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.circleBitmaps[i] = bitmapCreateBitmap;
                LineChartRenderer.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (z2) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, LineChartRenderer.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, LineChartRenderer.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, LineChartRenderer.this.mCirclePaintInner);
                    }
                }
            }
        }

        protected Bitmap getBitmap(int i) {
            Bitmap[] bitmapArr = this.circleBitmaps;
            return bitmapArr[i % bitmapArr.length];
        }
    }
}
