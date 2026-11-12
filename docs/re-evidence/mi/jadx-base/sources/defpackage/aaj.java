package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarEntry;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;

/* JADX INFO: loaded from: classes4.dex */
public class aaj extends fge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RadarChart f835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f836b;
    public Paint c;
    public Path d;
    public Path e;

    public aaj(RadarChart radarChart, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.d = new Path();
        this.e = new Path();
        this.f835a = radarChart;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mHighlightPaint.setStrokeWidth(2.0f);
        this.mHighlightPaint.setColor(Color.rgb(255, SportReportBaseParser.ReportType.avgAscentRate, 115));
        Paint paint2 = new Paint(1);
        this.f836b = paint2;
        paint2.setStyle(style);
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Canvas canvas, rwc rwcVar, int i) {
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        float sliceAngle = this.f835a.getSliceAngle();
        float factor = this.f835a.getFactor();
        wye centerOffsets = this.f835a.getCenterOffsets();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        Path path = this.d;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < rwcVar.O0(); i2++) {
            this.mRenderPaint.setColor(rwcVar.E0(i2));
            fmq.r(centerOffsets, (((RadarEntry) rwcVar.i(i2)).getY() - this.f835a.getYChartMin()) * factor * fI, (i2 * sliceAngle * fH) + this.f835a.getRotationAngle(), wyeVarC);
            if (!Float.isNaN(wyeVarC.c)) {
                if (z) {
                    path.lineTo(wyeVarC.c, wyeVarC.d);
                } else {
                    path.moveTo(wyeVarC.c, wyeVarC.d);
                    z = true;
                }
            }
        }
        if (rwcVar.O0() > i) {
            path.lineTo(centerOffsets.c, centerOffsets.d);
        }
        path.close();
        if (rwcVar.C0()) {
            Drawable drawableG = rwcVar.g();
            if (drawableG != null) {
                drawFilledPath(canvas, path, drawableG);
            } else {
                drawFilledPath(canvas, path, rwcVar.y(), rwcVar.U());
            }
        }
        this.mRenderPaint.setStrokeWidth(rwcVar.X());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (!rwcVar.C0() || rwcVar.U() < 255) {
            canvas.drawPath(path, this.mRenderPaint);
        }
        wye.f(centerOffsets);
        wye.f(wyeVarC);
    }

    public void b(Canvas canvas, wye wyeVar, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float fE = fmq.e(f2);
        float fE2 = fmq.e(f);
        if (i != 1122867) {
            Path path = this.e;
            path.reset();
            path.addCircle(wyeVar.c, wyeVar.d, fE, Path.Direction.CW);
            if (fE2 > 0.0f) {
                path.addCircle(wyeVar.c, wyeVar.d, fE2, Path.Direction.CCW);
            }
            this.c.setColor(i);
            this.c.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.c);
        }
        if (i2 != 1122867) {
            this.c.setColor(i2);
            this.c.setStyle(Paint.Style.STROKE);
            this.c.setStrokeWidth(fmq.e(f3));
            canvas.drawCircle(wyeVar.c, wyeVar.d, fE, this.c);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(Canvas canvas) {
        float sliceAngle = this.f835a.getSliceAngle();
        float factor = this.f835a.getFactor();
        float rotationAngle = this.f835a.getRotationAngle();
        wye centerOffsets = this.f835a.getCenterOffsets();
        this.f836b.setStrokeWidth(this.f835a.getWebLineWidth());
        this.f836b.setColor(this.f835a.getWebColor());
        this.f836b.setAlpha(this.f835a.getWebAlpha());
        int skipWebLineCount = this.f835a.getSkipWebLineCount() + 1;
        int iO0 = ((baj) this.f835a.getData()).q().O0();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        for (int i = 0; i < iO0; i += skipWebLineCount) {
            fmq.r(centerOffsets, this.f835a.getYRange() * factor, (i * sliceAngle) + rotationAngle, wyeVarC);
            canvas.drawLine(centerOffsets.c, centerOffsets.d, wyeVarC.c, wyeVarC.d, this.f836b);
        }
        wye.f(wyeVarC);
        this.f836b.setStrokeWidth(this.f835a.getWebLineWidthInner());
        this.f836b.setColor(this.f835a.getWebColorInner());
        this.f836b.setAlpha(this.f835a.getWebAlpha());
        int i2 = this.f835a.getYAxis().mEntryCount;
        wye wyeVarC2 = wye.c(0.0f, 0.0f);
        wye wyeVarC3 = wye.c(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((baj) this.f835a.getData()).m()) {
                float yChartMin = (this.f835a.getYAxis().mEntries[i3] - this.f835a.getYChartMin()) * factor;
                fmq.r(centerOffsets, yChartMin, (i4 * sliceAngle) + rotationAngle, wyeVarC2);
                i4++;
                fmq.r(centerOffsets, yChartMin, (i4 * sliceAngle) + rotationAngle, wyeVarC3);
                canvas.drawLine(wyeVarC2.c, wyeVarC2.d, wyeVarC3.c, wyeVarC3.d, this.f836b);
            }
        }
        wye.f(wyeVarC2);
        wye.f(wyeVarC3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        baj bajVar = (baj) this.f835a.getData();
        int iO0 = bajVar.q().O0();
        for (rwc rwcVar : bajVar.l()) {
            if (rwcVar.isVisible()) {
                a(canvas, rwcVar, iO0);
            }
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
        c(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        float sliceAngle = this.f835a.getSliceAngle();
        float factor = this.f835a.getFactor();
        wye centerOffsets = this.f835a.getCenterOffsets();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        baj bajVar = (baj) this.f835a.getData();
        int length = r7cVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            r7c r7cVar = r7cVarArr[i2];
            rwc rwcVarI = bajVar.i(r7cVar.d());
            if (rwcVarI != null && rwcVarI.R()) {
                Entry entry = (RadarEntry) rwcVarI.i((int) r7cVar.h());
                if (isInBoundsX(entry, rwcVarI)) {
                    fmq.r(centerOffsets, (entry.getY() - this.f835a.getYChartMin()) * factor * this.mAnimator.i(), (r7cVar.h() * sliceAngle * this.mAnimator.h()) + this.f835a.getRotationAngle(), wyeVarC);
                    r7cVar.m(wyeVarC.c, wyeVarC.d);
                    drawHighlightLines(canvas, wyeVarC.c, wyeVarC.d, rwcVarI);
                    if (rwcVarI.w0() && !Float.isNaN(wyeVarC.c) && !Float.isNaN(wyeVarC.d)) {
                        int iW = rwcVarI.W();
                        if (iW == 1122867) {
                            iW = rwcVarI.E0(i);
                        }
                        if (rwcVarI.z() < 255) {
                            iW = w44.a(iW, rwcVarI.z());
                        }
                        b(canvas, wyeVarC, rwcVarI.s0(), rwcVarI.a0(), rwcVarI.b(), iW, rwcVarI.p0());
                    }
                }
            }
            i2++;
            i = i;
        }
        wye.f(centerOffsets);
        wye.f(wyeVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        int i;
        float f;
        float f2;
        wye wyeVar;
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        float sliceAngle = this.f835a.getSliceAngle();
        float factor = this.f835a.getFactor();
        wye centerOffsets = this.f835a.getCenterOffsets();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        wye wyeVarC2 = wye.c(0.0f, 0.0f);
        float fE = fmq.e(5.0f);
        int i2 = 0;
        while (i2 < ((baj) this.f835a.getData()).j()) {
            rwc rwcVarI = ((baj) this.f835a.getData()).i(i2);
            if (shouldDrawValues(rwcVarI)) {
                applyValueTextStyle(rwcVarI);
                wye wyeVarD = wye.d(rwcVarI.P0());
                wyeVarD.c = fmq.e(wyeVarD.c);
                wyeVarD.d = fmq.e(wyeVarD.d);
                int i3 = 0;
                while (i3 < rwcVarI.O0()) {
                    RadarEntry radarEntry = (RadarEntry) rwcVarI.i(i3);
                    float f3 = i3 * sliceAngle * fH;
                    fmq.r(centerOffsets, (radarEntry.getY() - this.f835a.getYChartMin()) * factor * fI, f3 + this.f835a.getRotationAngle(), wyeVarC);
                    if (rwcVarI.l0()) {
                        drawValue(canvas, rwcVarI.d0(), radarEntry.getY(), radarEntry, i2, wyeVarC.c, wyeVarC.d - fE, rwcVarI.n(i3));
                    }
                    if (radarEntry.getIcon() != null && rwcVarI.D()) {
                        Drawable icon = radarEntry.getIcon();
                        fmq.r(centerOffsets, (radarEntry.getY() * factor * fI) + wyeVarD.d, f3 + this.f835a.getRotationAngle(), wyeVarC2);
                        float f4 = wyeVarC2.d + wyeVarD.c;
                        wyeVarC2.d = f4;
                        fmq.f(canvas, icon, (int) wyeVarC2.c, (int) f4, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i3++;
                    wyeVarD = wyeVarD;
                    wyeVarC2 = wyeVarC2;
                    sliceAngle = sliceAngle;
                    i2 = i2;
                    fH = fH;
                    rwcVarI = rwcVarI;
                }
                i = i2;
                f = fH;
                f2 = sliceAngle;
                wyeVar = wyeVarC2;
                wye.f(wyeVarD);
            } else {
                i = i2;
                f = fH;
                f2 = sliceAngle;
                wyeVar = wyeVarC2;
            }
            i2 = i + 1;
            wyeVarC2 = wyeVar;
            sliceAngle = f2;
            fH = f;
        }
        wye.f(centerOffsets);
        wye.f(wyeVarC);
        wye.f(wyeVarC2);
    }

    @Override // defpackage.dn5
    public void initBuffers() {
    }
}
