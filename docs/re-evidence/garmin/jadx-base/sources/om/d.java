package om;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.github.mikephil.chartingv2.charts.PieChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.PieData;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.renderer.PieChartRenderer;
import com.github.mikephil.chartingv2.utils.Utils;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class d extends PieChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f132882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f132883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f132884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f132885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f132886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PointF f132887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f132888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f132889h;

    public d(PieChart pieChart) {
        super(pieChart, pieChart.getAnimator(), pieChart.getViewPortHandler());
        this.f132888g = new Path();
        this.f132889h = new RectF();
        Context context = pieChart.getContext();
        int color = a7.b.getColor(context, R.color.palette_gray_2);
        int color2 = a7.b.getColor(context, R.color.palette_gray_3);
        this.mHolePaint.setColor(a7.b.getColor(context, R.color.gcm_background_hero));
        Paint paint = new Paint(1);
        this.f132884c = paint;
        paint.setColor(color);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setTextSize(Utils.convertDpToPixel(14.0f));
        Paint paint2 = new Paint(1);
        this.f132882a = paint2;
        paint2.setColor(color);
        paint2.setTextAlign(align);
        paint2.setTextSize(Utils.convertDpToPixel(11.0f));
        Paint paint3 = new Paint(1);
        this.f132883b = paint3;
        paint3.setColor(color2);
        paint3.setTextAlign(align);
        paint3.setTextSize(Utils.convertDpToPixel(7.0f));
        this.f132885d = Utils.calcTextWidth(paint2, "●") / 2;
        this.f132886e = Utils.calcTextWidth(paint3, "●") / 2;
    }

    public final void a(Canvas canvas, double d14, double d15) {
        PointF pointF = this.f132887f;
        canvas.drawText("●", pointF.x + ((float) d14), pointF.y + ((float) d15), this.f132882a);
    }

    public final void b(Canvas canvas, double d14, double d15) {
        double d16 = d14 - 30.0d;
        canvas.drawText("●", (float) ((Math.cos(Math.toRadians(d15)) * d16) + ((double) this.f132887f.x)), (float) ((Math.sin(Math.toRadians(d15)) * d16) + ((double) this.f132887f.y)), this.f132883b);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x027c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.PieChartRenderer
    public final void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f14;
        float f15;
        float f16;
        float f17;
        float fSin;
        float f18;
        float f19;
        float fMax;
        d dVar = this;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        super.drawDataSet(canvas, iPieDataSet);
        float rotationAngle = dVar.mChart.getRotationAngle();
        float phaseX = dVar.mAnimator.getPhaseX();
        float phaseY = dVar.mAnimator.getPhaseY();
        int entryCount = iPieDataSet2.getEntryCount();
        float[] drawAngles = dVar.mChart.getDrawAngles();
        PointF centerCircleBox = dVar.mChart.getCenterCircleBox();
        float radius = dVar.mChart.getRadius();
        boolean z14 = dVar.mChart.isDrawHoleEnabled() && !dVar.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z14 ? (dVar.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float f22 = radius + 16.0f;
        RectF circleBox = dVar.mChart.getCircleBox();
        float f24 = circleBox.left;
        float f25 = circleBox.top;
        float f26 = circleBox.right;
        float f27 = circleBox.bottom;
        float f28 = holeRadius;
        float f29 = f24;
        float f34 = f25;
        circleBox.set(f24 - 16.0f, f25 - 16.0f, f26 + 16.0f, f27 + 16.0f);
        int i14 = 0;
        for (int i15 = 0; i15 < entryCount; i15++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i15).getVal()) > 1.0E-6d) {
                i14++;
            }
        }
        float sliceSpace = i14 <= 1 ? 0.0f : iPieDataSet2.getSliceSpace();
        float f35 = 0.0f;
        int i16 = 0;
        while (i16 < entryCount) {
            float f36 = drawAngles[i16];
            Entry entryForIndex = iPieDataSet2.getEntryForIndex(i16);
            if (Math.abs(entryForIndex.getVal()) > 1.0E-6d) {
                f15 = rotationAngle;
                if (dVar.mChart.needsHighlight(entryForIndex.getXIndex(), ((PieData) dVar.mChart.getData()).getIndexOfDataSet(iPieDataSet2))) {
                    f14 = f34;
                } else {
                    boolean z15 = sliceSpace > 0.0f && f36 <= 180.0f;
                    dVar.mRenderPaint.setColor(iPieDataSet2.getColor(i16));
                    float f37 = i14 == 1 ? 0.0f : sliceSpace / (f22 * 0.017453292f);
                    float f38 = (((f37 / 2.0f) + f35) * phaseY) + f15;
                    float f39 = (f36 - f37) * phaseY;
                    if (f39 < 0.0f) {
                        f39 = 0.0f;
                    }
                    Path path = dVar.f132888g;
                    path.reset();
                    float f44 = f39 % 360.0f;
                    if (f44 == 0.0f) {
                        path.addCircle(centerCircleBox.x, centerCircleBox.y, f22, Path.Direction.CW);
                        f17 = f22;
                        fSin = 0.0f;
                        f18 = 0.0f;
                    } else {
                        f17 = f22;
                        double d14 = f38 * 0.017453292f;
                        float fCos = (((float) Math.cos(d14)) * f17) + centerCircleBox.x;
                        fSin = (((float) Math.sin(d14)) * f17) + centerCircleBox.y;
                        path.moveTo(fCos, fSin);
                        path.arcTo(circleBox, f38, f39);
                        f18 = fCos;
                    }
                    float f45 = centerCircleBox.x;
                    float f46 = fSin;
                    float f47 = centerCircleBox.y;
                    PointF pointF = centerCircleBox;
                    float f48 = f18;
                    RectF rectF = dVar.f132889h;
                    rectF.set(f45 - f28, f47 - f28, f45 + f28, f47 + f28);
                    if (!z14 || (f28 <= 0.0f && !z15)) {
                        float f49 = f34;
                        drawAngles = drawAngles;
                        f14 = f49;
                        phaseX = phaseX;
                        f16 = f28;
                        centerCircleBox = pointF;
                        f22 = f17;
                        phaseY = phaseY;
                        i14 = i14;
                        f29 = f29;
                        entryCount = entryCount;
                        i16 = i16;
                        circleBox = circleBox;
                        if (f44 != 0.0f) {
                            if (z15 != 0) {
                                dVar = this;
                                float fCalculateMinimumRadiusForSpacedSlice = dVar.calculateMinimumRadiusForSpacedSlice(centerCircleBox, f22, f36 * phaseY, f48, f46, f38, f39);
                                double d15 = ((f39 / 2.0f) + f38) * 0.017453292f;
                                path.lineTo((fCalculateMinimumRadiusForSpacedSlice * ((float) Math.cos(d15))) + centerCircleBox.x, (((float) Math.sin(d15)) * fCalculateMinimumRadiusForSpacedSlice) + centerCircleBox.y);
                            } else {
                                dVar = this;
                                path.lineTo(centerCircleBox.x, centerCircleBox.y);
                            }
                        }
                        path.close();
                        if (i16 == 1) {
                            dVar.mBitmapCanvas.drawPath(path, dVar.mRenderPaint);
                        }
                    } else {
                        if (z15 != 0) {
                            f14 = f34;
                            f19 = f17;
                            f16 = f28;
                            centerCircleBox = pointF;
                            float fCalculateMinimumRadiusForSpacedSlice2 = dVar.calculateMinimumRadiusForSpacedSlice(centerCircleBox, f19, f36 * phaseY, f48, f46, f38, f39);
                            if (fCalculateMinimumRadiusForSpacedSlice2 < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice2 = -fCalculateMinimumRadiusForSpacedSlice2;
                            }
                            fMax = Math.max(f16, fCalculateMinimumRadiusForSpacedSlice2);
                        } else {
                            f14 = f34;
                            f19 = f17;
                            f16 = f28;
                            centerCircleBox = pointF;
                            fMax = f16;
                        }
                        float f50 = (i14 == 1 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                        float f54 = (((f50 / 2.0f) + f35) * phaseY) + f15;
                        float f55 = (f36 - f50) * phaseY;
                        if (f55 < 0.0f) {
                            f55 = 0.0f;
                        }
                        float f56 = f54 + f55;
                        float f57 = centerCircleBox.x;
                        if (f44 == 0.0f) {
                            path.addCircle(f57, centerCircleBox.y, fMax, Path.Direction.CCW);
                            f22 = f19;
                        } else {
                            double d16 = f56 * 0.017453292f;
                            f22 = f19;
                            float f58 = fMax;
                            path.lineTo((f58 * ((float) Math.cos(d16))) + f57, (((float) Math.sin(d16)) * f58) + centerCircleBox.y);
                            path.arcTo(rectF, f56, -f55);
                        }
                    }
                    dVar = this;
                    path.close();
                    if (i16 == 1) {
                        dVar.mBitmapCanvas.drawPath(path, dVar.mRenderPaint);
                    }
                }
                f35 = (f36 * phaseX) + f35;
                i16++;
                float[] fArr = drawAngles;
                f34 = f14;
                drawAngles = fArr;
                iPieDataSet2 = iPieDataSet;
                i14 = i14;
                phaseY = phaseY;
                entryCount = entryCount;
                rotationAngle = f15;
                circleBox = circleBox;
                f29 = f29;
                f22 = f22;
                f28 = f16;
                phaseX = phaseX;
            } else {
                f14 = f34;
                f15 = rotationAngle;
            }
            phaseX = phaseX;
            f16 = f28;
            f29 = f29;
            phaseY = phaseY;
            entryCount = entryCount;
            i16 = i16;
            i14 = i14;
            f35 = (f36 * phaseX) + f35;
            i16++;
            float[] fArr2 = drawAngles;
            f34 = f14;
            drawAngles = fArr2;
            iPieDataSet2 = iPieDataSet;
            i14 = i14;
            phaseY = phaseY;
            entryCount = entryCount;
            rotationAngle = f15;
            circleBox = circleBox;
            f29 = f29;
            f22 = f22;
            f28 = f16;
            phaseX = phaseX;
        }
        circleBox.set(f29, f34, f26, f27);
    }

    @Override // com.github.mikephil.chartingv2.renderer.PieChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawExtras(Canvas canvas) {
        if (canvas == null || this.mDrawBitmap == null) {
            return;
        }
        i2.d("PowerPieChartRenderer", "drawExtras" + this.mChart.getId());
        drawHole(canvas);
        Bitmap bitmap = this.mDrawBitmap.get();
        if (bitmap != null) {
            float holeRadius = 0.0f;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            drawCenterText(canvas);
            float radius = this.mChart.getRadius();
            if (this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled()) {
                holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
            }
            float f14 = holeRadius;
            this.f132887f = this.mChart.getCenterCircleBox();
            float f15 = 30.0f - f14;
            float f16 = this.f132885d;
            a(canvas, f15, f16);
            a(canvas, 0.0d, f15 + f16);
            float f17 = f14 - 30.0f;
            a(canvas, f17, f16);
            a(canvas, 0.0d, f17 + f16);
            float f18 = this.f132886e;
            float f19 = f18 / (radius * 0.017453292f);
            double d14 = f14;
            b(canvas, d14, 45.0f + f19);
            b(canvas, d14, 135.0f - f19);
            b(canvas, f14 - f18, 225.0f - f19);
            b(canvas, f14 - f18, f19 + 315.0f);
            PointF pointF = this.f132887f;
            float f22 = pointF.x + 2.0f;
            float f24 = ((pointF.y + 81.0f) - f14) + f16;
            Paint paint = this.f132884c;
            canvas.drawText("TDC", f22, f24, paint);
            PointF pointF2 = this.f132887f;
            canvas.drawText("BDC", pointF2.x + 2.0f, ((pointF2.y + f14) - 81.0f) + f16, paint);
        }
    }
}
