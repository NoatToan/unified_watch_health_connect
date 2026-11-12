package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ozl extends LineChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<IDataSet, a> f45019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f45020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45021c;
    private float[] d;

    public ozl(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.f45021c = 0.0f;
        this.f45020b = 0.0f;
        this.d = new float[2];
        this.f45019a = new HashMap<>(0);
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getLineData().getDataSets();
            for (int i = 0; i < dataSets.size(); i++) {
                ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
                if (shouldDrawValues(iLineDataSet) && iLineDataSet.getEntryCount() != 0) {
                    applyValueTextStyle(iLineDataSet);
                    Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                    this.mXBounds.set(this.mChart, iLineDataSet);
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    MPPointF mPPointF = MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                    for (int i2 = 0; i2 < fArrGenerateTransformedValuesLine.length && this.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesLine[i2]); i2 += 2) {
                        b(new int[]{i, i2}, fArrGenerateTransformedValuesLine, iLineDataSet, mPPointF, canvas);
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    private void b(int[] iArr, float[] fArr, ILineDataSet iLineDataSet, MPPointF mPPointF, Canvas canvas) {
        String str;
        int i = iArr[1];
        float f = fArr[i];
        int i2 = i + 1;
        float f2 = fArr[i2];
        if (i == 0) {
            this.f45021c = f;
        } else if (i2 == fArr.length - 1) {
            this.f45020b = f;
        } else {
            LogUtil.d("HwHealthAchieveReportLineRender", "dealLineLoop positionIndex is normal");
        }
        if (this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2)) {
            int i3 = i / 2;
            int i4 = i3 + this.mXBounds.min;
            Entry entryForIndex = iLineDataSet.getEntryForIndex(i4);
            Object data = entryForIndex.getData();
            if (!(data instanceof String)) {
                str = "";
            } else {
                str = (String) data;
            }
            if (iLineDataSet.isDrawValuesEnabled()) {
                if ("LINE_PATH_BOLD_START".equals(str)) {
                    return;
                }
                if ("DASH_PATH_END".equals(str)) {
                    iLineDataSet.setValueTextSize(10.0f);
                    applyValueTextStyle(iLineDataSet);
                    drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i4, f, f2 + Utils.convertDpToPixel(15.0f), Color.parseColor(Constants.CHOOSE_TEXT_COLOR));
                } else if ("DASH_PATH".equals(str)) {
                    iLineDataSet.setValueTextSize(8.0f);
                    applyValueTextStyle(iLineDataSet);
                    drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i4, f, Utils.convertDpToPixel(13.0f) + f2, iLineDataSet.getValueTextColor(i3));
                } else {
                    IValueFormatter valueFormatter = iLineDataSet.getValueFormatter();
                    float y = entryForIndex.getY();
                    float fA = qow.a(fArr, i, entryForIndex.getY());
                    float fConvertDpToPixel = Utils.convertDpToPixel(8.0f);
                    float fE = qow.e(fArr, i, entryForIndex.getY());
                    drawValue(canvas, valueFormatter, y, entryForIndex, i4, fA + f, (f2 - fConvertDpToPixel) + fE, iLineDataSet.getValueTextColor(i3));
                }
            }
            if (entryForIndex.getIcon() == null || !iLineDataSet.isDrawIconsEnabled()) {
                return;
            }
            Drawable icon = entryForIndex.getIcon();
            Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(Canvas canvas) {
        a aVar;
        Entry entryForIndex;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (T t : this.mChart.getLineData().getDataSets()) {
            if (t.isVisible() && t.isDrawCirclesEnabled() && t.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(t.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(t.getAxisDependency());
                this.mXBounds.set(this.mChart, t);
                float circleRadius = t.getCircleRadius();
                float circleHoleRadius = t.getCircleHoleRadius();
                boolean z = t.isDrawCircleHoleEnabled() && circleHoleRadius < circleRadius && circleHoleRadius > 0.0f;
                boolean z2 = z && t.getCircleHoleColor() == 1122867;
                if (this.f45019a.containsKey(t)) {
                    aVar = this.f45019a.get(t);
                } else {
                    aVar = new a();
                    this.f45019a.put(t, aVar);
                }
                a aVar2 = aVar;
                if (aVar2.e(t)) {
                    aVar2.a(t, z, z2);
                }
                int i = this.mXBounds.min;
                int i2 = this.mXBounds.min;
                for (int i3 = this.mXBounds.range; i2 <= i3 + i && (entryForIndex = t.getEntryForIndex(i2)) != null; i3 = i3) {
                    this.d[0] = entryForIndex.getX();
                    this.d[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.d);
                    b(canvas, entryForIndex, i2, circleRadius, aVar2);
                    i2++;
                    i = i;
                }
            }
        }
    }

    private void b(Canvas canvas, Entry entry, int i, float f, a aVar) {
        String str;
        Bitmap bitmapE;
        Object data = entry.getData();
        if (!(data instanceof String)) {
            str = "";
        } else {
            str = (String) data;
        }
        if ("LINE_PATH".equals(str)) {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#1A000000"));
            paint.setStrokeWidth(1.0f);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            float[] fArr = this.d;
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(this.d[0], this.mViewPortHandler.contentBottom());
            canvas.drawPath(path, paint);
            path.reset();
        }
        if (this.mViewPortHandler.isInBoundsRight(this.d[0]) && this.mViewPortHandler.isInBoundsLeft(this.d[0]) && this.mViewPortHandler.isInBoundsY(this.d[1]) && (bitmapE = aVar.e(i)) != null) {
            float[] fArr2 = this.d;
            canvas.drawBitmap(bitmapE, fArr2[0] - f, fArr2[1] - f, (Paint) null);
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        LineData lineData = this.mChart.getLineData();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                }
            }
        }
    }

    class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap[] f45022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Path f45023c;

        private a() {
            this.f45023c = new Path();
        }

        protected boolean e(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.f45022b;
            if (bitmapArr == null) {
                this.f45022b = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.f45022b = new Bitmap[circleColorCount];
            return true;
        }

        protected void a(ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            int i = (int) (((double) circleRadius) * 2.1d);
            for (int i2 = 0; i2 < circleColorCount; i2++) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.f45022b[i2] = bitmapCreateBitmap;
                ozl.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i2));
                if (!z2) {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, ozl.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, ozl.this.mCirclePaintInner);
                    }
                } else {
                    this.f45023c.reset();
                    this.f45023c.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.f45023c.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.f45023c, ozl.this.mRenderPaint);
                }
            }
        }

        protected Bitmap e(int i) {
            Bitmap[] bitmapArr = this.f45022b;
            return bitmapArr[i % bitmapArr.length];
        }
    }

    public float e() {
        return this.f45021c;
    }

    public float a() {
        return this.f45020b;
    }

    @Override // com.github.mikephil.charting.renderer.LineRadarRenderer
    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.github.mikephil.charting.data.Entry] */
    private void e(ILineDataSet iLineDataSet, int i, int i2, Path path, Transformer transformer) {
        float fContentBottom = this.mViewPortHandler.contentBottom();
        float phaseY = this.mAnimator.getPhaseY();
        boolean z = iLineDataSet.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
        float[] fArr = {entryForIndex.getX(), entryForIndex.getY()};
        transformer.pointValuesToPixel(fArr);
        path.moveTo(fArr[0], fContentBottom);
        path.lineTo(fArr[0], fArr[1] * phaseY);
        int i3 = i + 1;
        ?? r3 = 0;
        while (i3 <= i2) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            fArr[0] = entryForIndex2.getX();
            fArr[1] = entryForIndex2.getY();
            transformer.pointValuesToPixel(fArr);
            if (z && r3 != 0) {
                path.lineTo(fArr[0], fArr[1] * phaseY);
            }
            path.lineTo(fArr[0], fArr[1] * phaseY);
            i3++;
            r3 = entryForIndex2;
        }
        if (r3 != 0) {
            path.lineTo(fArr[0], fContentBottom);
        }
        path.close();
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, Transformer transformer, BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i;
        int i2;
        Path path = this.mGenerateFilledPathBuffer;
        int i3 = xBounds.min;
        int i4 = xBounds.min + xBounds.range;
        int i5 = 0;
        do {
            i = i3 + (i5 * 128);
            int i6 = i + 128;
            i2 = i6 > i4 ? i4 : i6;
            if (i <= i2) {
                e(iLineDataSet, i, i2, path, transformer);
                Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i5++;
        } while (i <= i2);
    }
}
