package com.huawei.pluginachievement.ui.linechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes41.dex */
public class HwHealthAchieveReportMarkView extends MarkerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthAchieveReportLineChart f22246c;
    private float d;
    private ViewPortHandler e;

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
    }

    public HwHealthAchieveReportMarkView(Context context, int i, HwHealthAchieveReportLineChart hwHealthAchieveReportLineChart) {
        super(context, i);
        this.e = null;
        this.d = 300.0f;
        this.f22246c = hwHealthAchieveReportLineChart;
        this.e = hwHealthAchieveReportLineChart.getViewPortHandler();
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF offsetForDrawingAtPoint = super.getOffsetForDrawingAtPoint(f, f2);
        offsetForDrawingAtPoint.x = -(getWidth() / 2);
        offsetForDrawingAtPoint.y = -getHeight();
        return offsetForDrawingAtPoint;
    }

    void d(float f) {
        this.d = f;
    }

    float getmMarkDrawX() {
        return this.d;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f, float f2) {
        LogUtil.a("PLGACHIEVE_HwHealthAchieveReportMarkView", "markerView draw");
        int iSave = canvas.save();
        HwHealthAchieveReportLineChart hwHealthAchieveReportLineChart = this.f22246c;
        if (hwHealthAchieveReportLineChart == null) {
            draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        hwHealthAchieveReportLineChart.b();
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(this.d, hwHealthAchieveReportLineChart.getViewPortHandler().contentBottom() + hwHealthAchieveReportLineChart.getXAxis().getYOffset() + Utils.convertDpToPixel(40.0f));
        canvas.scale(1.0f, -1.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        paint.setAlpha(0);
        paint.setXfermode(porterDuffXfermode);
        Path path = new Path();
        float fConvertDpToPixel = Utils.convertDpToPixel(36.0f);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(13.5f);
        path.moveTo(-fConvertDpToPixel, 0.0f);
        float f3 = fConvertDpToPixel * 3.0f;
        float f4 = fConvertDpToPixel * 2.0f;
        path.cubicTo((-f3) / 6.0f, 0.0f, (-f4) / 6.0f, fConvertDpToPixel2, 0.0f, fConvertDpToPixel2);
        path.cubicTo(f4 / 6.0f, fConvertDpToPixel2, f3 / 6.0f, 0.0f, fConvertDpToPixel, 0.0f);
        canvas.drawPath(path, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(Utils.convertDpToPixel(7.0f), 0.0f, Utils.convertDpToPixel(-3.0f), Color.argb(51, 0, 0, 0));
        paint.setColor(Color.argb(0, 0, 0, 0));
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        b(paint, canvas, path, iSave2, porterDuffXfermode);
    }

    private void b(Paint paint, Canvas canvas, Path path, int i, PorterDuffXfermode porterDuffXfermode) {
        paint.setXfermode(porterDuffXfermode);
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2.0f);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(0.0f, -Utils.convertDpToPixel(1.0f));
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        boolean zIsAntiAlias = paint.isAntiAlias();
        paint.setAntiAlias(true);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Utils.convertDpToPixel(0.5f));
        paint.setColor(Color.argb(8, 255, 140, 0));
        paint.setAntiAlias(true);
        canvas.drawCircle(0.0f, 0.0f, Utils.convertDpToPixel(11.25f), paint);
        paint.setAntiAlias(zIsAntiAlias);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getMarkerViewButtonColor());
        paint.setColor(Color.argb(255, 250, 101, 33));
        paint.setStrokeWidth(10.0f);
        path.reset();
        path.addCircle(0.0f, 0.0f, Utils.convertDpToPixel(3.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(0.0f, Utils.convertDpToPixel(1.0f));
        int markerViewButtonColor = getMarkerViewButtonColor();
        int iArgb = Color.argb(0, Color.red(markerViewButtonColor), Color.green(markerViewButtonColor), Color.blue(markerViewButtonColor));
        a(canvas, new int[]{iArgb, markerViewButtonColor, iArgb}, new float[]{0.0f, 0.5f, 1.0f}, paint);
        canvas.restoreToCount(i);
    }

    private int getMarkerViewButtonColor() {
        return Color.rgb(47, FitnessSportType.HW_FITNESS_SPORT_ALL, 47);
    }

    private void a(Canvas canvas, int[] iArr, float[] fArr, Paint paint) {
        paint.reset();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        float fConvertDpToPixel = Utils.convertDpToPixel(20.0f);
        float yOffset = this.f22246c.getXAxis().getYOffset() + this.e.contentHeight() + Utils.convertDpToPixel(40.0f);
        paint.setShader(new LinearGradient(0.0f, fConvertDpToPixel, 0.0f, yOffset, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.drawLine(0.0f, fConvertDpToPixel, 0.0f, yOffset, paint);
    }
}
