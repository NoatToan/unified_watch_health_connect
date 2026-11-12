package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.renderer.LineChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class qou extends LineChartRenderer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f46580b;
    private HashMap<IDataSet, d> e;

    public qou(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.f46580b = new float[2];
        this.e = new HashMap<>();
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
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        int i2 = circleRadius / 2;
                    }
                    this.mXBounds.set(this.mChart, iLineDataSet);
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    MPPointF mPPointF = MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                    e(canvas, iLineDataSet, fArrGenerateTransformedValuesLine, mPPointF);
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    private void e(Canvas canvas, ILineDataSet iLineDataSet, float[] fArr, MPPointF mPPointF) {
        String str;
        for (int i = 0; i < fArr.length; i += 2) {
            float f = fArr[i];
            float f2 = fArr[i + 1];
            if (!this.mViewPortHandler.isInBoundsRight(f)) {
                return;
            }
            if (this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2)) {
                int i2 = i / 2;
                int i3 = i2 + this.mXBounds.min;
                Entry entryForIndex = iLineDataSet.getEntryForIndex(i3);
                Object data = entryForIndex.getData();
                if (data == null) {
                    str = "";
                } else {
                    str = (String) data;
                }
                if (iLineDataSet.isDrawValuesEnabled()) {
                    if (!"LINE_PATH_BOLD_START".equals(str)) {
                        if ("DASH_PATH_END".equals(str)) {
                            iLineDataSet.setValueTextSize(10.0f);
                            applyValueTextStyle(iLineDataSet);
                            drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i3, f, f2 + Utils.convertDpToPixel(15.0f), Color.parseColor(Constants.CHOOSE_TEXT_COLOR));
                        } else if ("DASH_PATH".equals(str)) {
                            iLineDataSet.setValueTextSize(8.0f);
                            applyValueTextStyle(iLineDataSet);
                            drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i3, f, Utils.convertDpToPixel(13.0f) + f2, iLineDataSet.getValueTextColor(i2));
                        } else {
                            IValueFormatter valueFormatter = iLineDataSet.getValueFormatter();
                            float y = entryForIndex.getY();
                            float fA = qow.a(fArr, i, entryForIndex.getY());
                            float fConvertDpToPixel = Utils.convertDpToPixel(8.0f);
                            drawValue(canvas, valueFormatter, y, entryForIndex, i3, fA + f, qow.e(fArr, i, entryForIndex.getY()) + (f2 - fConvertDpToPixel), iLineDataSet.getValueTextColor(i2));
                        }
                        if (entryForIndex.getIcon() == null) {
                        }
                    }
                } else if (entryForIndex.getIcon() == null && iLineDataSet.isDrawIconsEnabled()) {
                    Drawable icon = entryForIndex.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.LineChartRenderer
    public void drawCircles(Canvas canvas) {
        d dVar;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float[] fArr = this.f46580b;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<T> dataSets = this.mChart.getLineData().getDataSets();
        for (int i = 0; i < dataSets.size(); i++) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z = iLineDataSet.isDrawCircleHoleEnabled() && circleHoleRadius < circleRadius && circleHoleRadius > 0.0f;
                boolean z2 = z && iLineDataSet.getCircleHoleColor() == 1122867;
                if (this.e.containsKey(iLineDataSet)) {
                    dVar = this.e.get(iLineDataSet);
                } else {
                    dVar = new d();
                    this.e.put(iLineDataSet, dVar);
                }
                d dVar2 = dVar;
                if (dVar2.b(iLineDataSet)) {
                    dVar2.d(iLineDataSet, z, z2);
                }
                a(canvas, transformer, iLineDataSet, dVar2, circleRadius);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.charting.data.Entry] */
    private void a(Canvas canvas, Transformer transformer, ILineDataSet iLineDataSet, d dVar, float f) {
        ?? entryForIndex;
        String str;
        Bitmap bitmapE;
        float phaseY = this.mAnimator.getPhaseY();
        int i = this.mXBounds.range;
        int i2 = this.mXBounds.min;
        for (int i3 = this.mXBounds.min; i3 <= i + i2 && (entryForIndex = iLineDataSet.getEntryForIndex(i3)) != 0; i3++) {
            this.f46580b[0] = entryForIndex.getX();
            this.f46580b[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.f46580b);
            Object data = entryForIndex.getData();
            if (data == null) {
                str = "";
            } else {
                str = (String) data;
            }
            if ("LINE_PATH".equals(str)) {
                Paint paint = new Paint();
                paint.setColor(BaseApplication.getContext().getResources().getColor(R.color.colorButtonNormal));
                paint.setStrokeWidth(1.0f);
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                float[] fArr = this.f46580b;
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(this.f46580b[0], this.mViewPortHandler.contentBottom());
                canvas.drawPath(path, paint);
                path.reset();
            }
            if (!this.mViewPortHandler.isInBoundsRight(this.f46580b[0])) {
                return;
            }
            if (this.mViewPortHandler.isInBoundsLeft(this.f46580b[0]) && this.mViewPortHandler.isInBoundsY(this.f46580b[1]) && (bitmapE = dVar.e(i3)) != null) {
                float[] fArr2 = this.f46580b;
                canvas.drawBitmap(bitmapE, fArr2[0] - f, fArr2[1] - f, (Paint) null);
            }
        }
    }

    class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Path f46581b;
        private Bitmap[] e;

        private d() {
            this.f46581b = new Path();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            Bitmap[] bitmapArr = this.e;
            if (bitmapArr == null) {
                this.e = new Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.e = new Bitmap[circleColorCount];
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (((double) circleRadius) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.e[i] = bitmapCreateBitmap;
                qou.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (!z2) {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, qou.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, qou.this.mCirclePaintInner);
                    }
                } else {
                    this.f46581b.reset();
                    this.f46581b.addCircle(circleRadius, circleRadius, circleRadius, Path.Direction.CW);
                    this.f46581b.addCircle(circleRadius, circleRadius, circleHoleRadius, Path.Direction.CCW);
                    canvas.drawPath(this.f46581b, qou.this.mRenderPaint);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Bitmap e(int i) {
            Bitmap[] bitmapArr = this.e;
            return bitmapArr[i % bitmapArr.length];
        }
    }
}
