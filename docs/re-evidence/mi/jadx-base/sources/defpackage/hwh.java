package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieDataSet$ValuePosition;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hwh extends dn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PieChart f20541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f20542b;
    public Paint c;
    public Paint d;
    public TextPaint e;
    public Paint f;
    public StaticLayout g;
    public CharSequence h;
    public RectF i;
    public RectF[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WeakReference<Bitmap> f20543k;
    public Canvas l;
    public Path m;
    public RectF n;
    public Path o;
    public Path p;
    public RectF q;

    public hwh(PieChart pieChart, cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.i = new RectF();
        this.j = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.m = new Path();
        this.n = new RectF();
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
        this.f20541a = pieChart;
        Paint paint = new Paint(1);
        this.f20542b = paint;
        paint.setColor(-1);
        Paint paint2 = this.f20542b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.c = paint3;
        paint3.setColor(-1);
        this.c.setStyle(style);
        this.c.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-16777216);
        this.e.setTextSize(fmq.e(12.0f));
        this.mValuePaint.setTextSize(fmq.e(13.0f));
        this.mValuePaint.setColor(-1);
        Paint paint4 = this.mValuePaint;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.f = paint5;
        paint5.setColor(-1);
        this.f.setTextAlign(align);
        this.f.setTextSize(fmq.e(13.0f));
        Paint paint6 = new Paint(1);
        this.d = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    public float a(wye wyeVar, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = wyeVar.c + (((float) Math.cos(d)) * f);
        float fSin = wyeVar.d + (((float) Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow(fCos - f3, 2.0d) + Math.pow(fSin - f4, 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((wyeVar.c + (((float) Math.cos(d2)) * f)) - ((fCos + f3) / 2.0f), 2.0d) + Math.pow((wyeVar.d + (((float) Math.sin(d2)) * f)) - ((fSin + f4) / 2.0f), 2.0d)));
    }

    public void b(Canvas canvas) {
        CharSequence centerText = this.f20541a.getCenterText();
        if (!this.f20541a.i() || centerText == null) {
            return;
        }
        wye centerCircleBox = this.f20541a.getCenterCircleBox();
        wye centerTextOffset = this.f20541a.getCenterTextOffset();
        float f = centerCircleBox.c + centerTextOffset.c;
        float f2 = centerCircleBox.d + centerTextOffset.d;
        float radius = (!this.f20541a.k() || this.f20541a.m()) ? this.f20541a.getRadius() : this.f20541a.getRadius() * (this.f20541a.getHoleRadius() / 100.0f);
        RectF[] rectFArr = this.j;
        RectF rectF = rectFArr[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.f20541a.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.h) || !rectF2.equals(this.i)) {
            this.i.set(rectF2);
            this.h = centerText;
            this.g = new StaticLayout(centerText, 0, centerText.length(), this.e, (int) Math.max(Math.ceil(this.i.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.g.getHeight();
        canvas.save();
        Path path = this.p;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.g.draw(canvas);
        canvas.restore();
        wye.f(centerCircleBox);
        wye.f(centerTextOffset);
    }

    public void c(Canvas canvas, cwc cwcVar) {
        float f;
        RectF rectF;
        float f2;
        boolean z;
        float fMax;
        wye wyeVar;
        cwc cwcVar2 = cwcVar;
        float rotationAngle = this.f20541a.getRotationAngle();
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        RectF circleBox = this.f20541a.getCircleBox();
        int iO0 = cwcVar.O0();
        float[] drawAngles = this.f20541a.getDrawAngles();
        wye centerCircleBox = this.f20541a.getCenterCircleBox();
        float radius = this.f20541a.getRadius();
        boolean z2 = this.f20541a.k() && !this.f20541a.m();
        float holeRadius = z2 ? (this.f20541a.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.f20541a.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF2 = new RectF();
        boolean z3 = z2 && this.f20541a.l();
        int i = 0;
        for (int i2 = 0; i2 < iO0; i2++) {
            if (Math.abs(cwcVar2.i(i2).getY()) > fmq.e) {
                i++;
            }
        }
        float fJ = i <= 1 ? 0.0f : j(cwcVar2);
        int i3 = 0;
        float f3 = 0.0f;
        while (i3 < iO0) {
            float f4 = drawAngles[i3];
            float fAbs = Math.abs(cwcVar2.i(i3).getY());
            float f5 = fmq.e;
            if (fAbs > f5 && !(cwcVar.R() && this.f20541a.o(i3) && !z3)) {
                boolean z4 = fJ > 0.0f && f4 <= 180.0f;
                this.mRenderPaint.setColor(cwcVar2.E0(i3));
                float f6 = i == 1 ? 0.0f : fJ / (radius * 0.017453292f);
                float f7 = rotationAngle + ((f3 + (f6 / 2.0f)) * fI);
                float f8 = (f4 - f6) * fI;
                float f9 = f8 < 0.0f ? 0.0f : f8;
                this.m.reset();
                if (z3) {
                    float f10 = radius - holeRadius2;
                    double d = f7 * 0.017453292f;
                    float fCos = centerCircleBox.c + (((float) Math.cos(d)) * f10);
                    float fSin = centerCircleBox.d + (f10 * ((float) Math.sin(d)));
                    rectF2.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                }
                double d2 = f7 * 0.017453292f;
                f = holeRadius;
                float fCos2 = centerCircleBox.c + (((float) Math.cos(d2)) * radius);
                float fSin2 = centerCircleBox.d + (((float) Math.sin(d2)) * radius);
                if (f9 < 360.0f || f9 % 360.0f > f5) {
                    if (z3) {
                        this.m.arcTo(rectF2, f7 + 180.0f, -180.0f);
                    }
                    this.m.arcTo(circleBox, f7, f9);
                } else {
                    this.m.addCircle(centerCircleBox.c, centerCircleBox.d, radius, Path.Direction.CW);
                }
                RectF rectF3 = this.n;
                float f11 = centerCircleBox.c;
                float f12 = centerCircleBox.d;
                rectF = rectF2;
                rectF3.set(f11 - f, f12 - f, f11 + f, f12 + f);
                if (z2) {
                    if (f > 0.0f || z4) {
                        if (z4) {
                            f = f;
                            z = true;
                            float fA = a(centerCircleBox, radius, f4 * fI, fCos2, fSin2, f7, f9);
                            if (fA < 0.0f) {
                                fA = -fA;
                            }
                            fMax = Math.max(f, fA);
                        } else {
                            f = f;
                            z = true;
                            fMax = f;
                        }
                        float f13 = (i == z || fMax == 0.0f) ? 0.0f : fJ / (fMax * 0.017453292f);
                        float f14 = rotationAngle + ((f3 + (f13 / 2.0f)) * fI);
                        float f15 = (f4 - f13) * fI;
                        if (f15 < 0.0f) {
                            f15 = 0.0f;
                        }
                        float f16 = f14 + f15;
                        if (f9 < 360.0f || f9 % 360.0f > f5) {
                            if (z3) {
                                float f17 = radius - holeRadius2;
                                double d3 = 0.017453292f * f16;
                                wyeVar = centerCircleBox;
                                float fCos3 = centerCircleBox.c + (((float) Math.cos(d3)) * f17);
                                float fSin3 = wyeVar.d + (f17 * ((float) Math.sin(d3)));
                                rectF = rectF;
                                rectF.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                this.m.arcTo(rectF, f16, 180.0f);
                            } else {
                                wyeVar = centerCircleBox;
                                rectF = rectF;
                                double d4 = f16 * 0.017453292f;
                                this.m.lineTo(wyeVar.c + (((float) Math.cos(d4)) * fMax), wyeVar.d + (fMax * ((float) Math.sin(d4))));
                            }
                            this.m.arcTo(this.n, f16, -f15);
                        } else {
                            this.m.addCircle(centerCircleBox.c, centerCircleBox.d, fMax, Path.Direction.CCW);
                            wyeVar = centerCircleBox;
                            rectF = rectF;
                        }
                        centerCircleBox = wyeVar;
                    } else {
                        f2 = 360.0f;
                    }
                    this.m.close();
                    this.l.drawPath(this.m, this.mRenderPaint);
                    f3 += f4 * fH;
                } else {
                    f2 = 360.0f;
                }
                if (f9 % f2 > f5) {
                    if (z4) {
                        float fA2 = a(centerCircleBox, radius, f4 * fI, fCos2, fSin2, f7, f9);
                        double d5 = 0.017453292f * (f7 + (f9 / 2.0f));
                        this.m.lineTo(centerCircleBox.c + (((float) Math.cos(d5)) * fA2), centerCircleBox.d + (fA2 * ((float) Math.sin(d5))));
                    } else {
                        this.m.lineTo(centerCircleBox.c, centerCircleBox.d);
                    }
                }
                this.m.close();
                this.l.drawPath(this.m, this.mRenderPaint);
                f3 += f4 * fH;
            } else {
                f3 += f4 * fH;
                i3 = i3;
                radius = radius;
                rotationAngle = rotationAngle;
                fH = fH;
                circleBox = circleBox;
                drawAngles = drawAngles;
                i = i;
                rectF = rectF2;
                f = holeRadius;
                centerCircleBox = centerCircleBox;
            }
            i3++;
            cwcVar2 = cwcVar;
            holeRadius = f;
            rectF2 = rectF;
            centerCircleBox = centerCircleBox;
            i = i;
            radius = radius;
            iO0 = iO0;
            circleBox = circleBox;
            rotationAngle = rotationAngle;
            fH = fH;
            drawAngles = drawAngles;
        }
        wye.f(centerCircleBox);
    }

    public void d(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawData(Canvas canvas) {
        int iN = (int) this.mViewPortHandler.n();
        int iM = (int) this.mViewPortHandler.m();
        WeakReference<Bitmap> weakReference = this.f20543k;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iN || bitmapCreateBitmap.getHeight() != iM) {
            if (iN <= 0 || iM <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iN, iM, Bitmap.Config.ARGB_4444);
            this.f20543k = new WeakReference<>(bitmapCreateBitmap);
            this.l = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (cwc cwcVar : ((iwh) this.f20541a.getData()).l()) {
            if (cwcVar.isVisible() && cwcVar.O0() > 0) {
                c(canvas, cwcVar);
            }
        }
    }

    @Override // defpackage.dn5
    public void drawExtras(Canvas canvas) {
        e(canvas);
        canvas.drawBitmap(this.f20543k.get(), 0.0f, 0.0f, (Paint) null);
        b(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn5
    public void drawHighlighted(Canvas canvas, r7c[] r7cVarArr) {
        cwc cwcVarI;
        float f;
        int i;
        wye wyeVar;
        float fA;
        float f2;
        float f3;
        float fMax;
        boolean z = this.f20541a.k() && !this.f20541a.m();
        if (z && this.f20541a.l()) {
            return;
        }
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        float rotationAngle = this.f20541a.getRotationAngle();
        float[] drawAngles = this.f20541a.getDrawAngles();
        float[] absoluteAngles = this.f20541a.getAbsoluteAngles();
        wye centerCircleBox = this.f20541a.getCenterCircleBox();
        float radius = this.f20541a.getRadius();
        float holeRadius = z ? (this.f20541a.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF = this.q;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i2 = 0;
        while (i2 < r7cVarArr.length) {
            int iH = (int) r7cVarArr[i2].h();
            if (iH < drawAngles.length && (cwcVarI = ((iwh) this.f20541a.getData()).i(r7cVarArr[i2].d())) != null && cwcVarI.R()) {
                int iO0 = cwcVarI.O0();
                int i3 = 0;
                for (int i4 = 0; i4 < iO0; i4++) {
                    if (Math.abs(cwcVarI.i(i4).getY()) > fmq.e) {
                        i3++;
                    }
                }
                if (iH == 0) {
                    i = 1;
                    f = 0.0f;
                } else {
                    f = absoluteAngles[iH - 1] * fH;
                    i = 1;
                }
                float fR0 = i3 <= i ? 0.0f : cwcVarI.r0();
                float f4 = drawAngles[iH];
                float fS = cwcVarI.s();
                float f5 = radius + fS;
                rectF.set(this.f20541a.getCircleBox());
                float f6 = -fS;
                rectF.inset(f6, f6);
                boolean z2 = fR0 > 0.0f && f4 <= 180.0f;
                Integer numK = cwcVarI.k();
                if (numK == null) {
                    numK = Integer.valueOf(cwcVarI.E0(iH));
                }
                this.mRenderPaint.setColor(numK.intValue());
                float f7 = i3 == 1 ? 0.0f : fR0 / (radius * 0.017453292f);
                float f8 = i3 == 1 ? 0.0f : fR0 / (f5 * 0.017453292f);
                float f9 = rotationAngle + (((f7 / 2.0f) + f) * fI);
                float f10 = (f4 - f7) * fI;
                float f11 = f10 < 0.0f ? 0.0f : f10;
                float f12 = (((f8 / 2.0f) + f) * fI) + rotationAngle;
                float f13 = (f4 - f8) * fI;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                this.m.reset();
                if (f11 < 360.0f || f11 % 360.0f > fmq.e) {
                    double d = f12 * 0.017453292f;
                    this.m.moveTo(centerCircleBox.c + (((float) Math.cos(d)) * f5), centerCircleBox.d + (f5 * ((float) Math.sin(d))));
                    this.m.arcTo(rectF, f12, f13);
                } else {
                    this.m.addCircle(centerCircleBox.c, centerCircleBox.d, f5, Path.Direction.CW);
                }
                if (z2) {
                    double d2 = f9 * 0.017453292f;
                    wyeVar = centerCircleBox;
                    fA = a(centerCircleBox, radius, f4 * fI, (((float) Math.cos(d2)) * radius) + centerCircleBox.c, centerCircleBox.d + (((float) Math.sin(d2)) * radius), f9, f11);
                } else {
                    wyeVar = centerCircleBox;
                    fA = 0.0f;
                }
                RectF rectF2 = this.n;
                float f14 = wyeVar.c;
                float f15 = wyeVar.d;
                rectF2.set(f14 - r22, f15 - r22, f14 + r22, f15 + r22);
                if (z == 0 || (r22 <= 0.0f && !z2)) {
                    f2 = fH;
                    f3 = fI;
                    if (f11 % 360.0f > fmq.e) {
                        if (z2) {
                            double d3 = (f9 + (f11 / 2.0f)) * 0.017453292f;
                            this.m.lineTo(wyeVar.c + (((float) Math.cos(d3)) * fA), wyeVar.d + (fA * ((float) Math.sin(d3))));
                        } else {
                            this.m.lineTo(wyeVar.c, wyeVar.d);
                        }
                    }
                } else {
                    if (z2) {
                        if (fA < 0.0f) {
                            fA = -fA;
                        }
                        fMax = Math.max(r22, fA);
                    } else {
                        fMax = r22;
                    }
                    float f16 = (i3 == 1 || fMax == 0.0f) ? 0.0f : fR0 / (fMax * 0.017453292f);
                    float f17 = ((f + (f16 / 2.0f)) * fI) + rotationAngle;
                    float f18 = (f4 - f16) * fI;
                    if (f18 < 0.0f) {
                        f18 = 0.0f;
                    }
                    float f19 = f17 + f18;
                    if (f11 < 360.0f || f11 % 360.0f > fmq.e) {
                        double d4 = f19 * 0.017453292f;
                        f2 = fH;
                        f3 = fI;
                        this.m.lineTo(wyeVar.c + (((float) Math.cos(d4)) * fMax), wyeVar.d + (fMax * ((float) Math.sin(d4))));
                        this.m.arcTo(this.n, f19, -f18);
                    } else {
                        this.m.addCircle(wyeVar.c, wyeVar.d, fMax, Path.Direction.CCW);
                        f2 = fH;
                        f3 = fI;
                    }
                }
                this.m.close();
                this.l.drawPath(this.m, this.mRenderPaint);
            } else {
                rectF = rectF;
                drawAngles = drawAngles;
                z = z;
                f2 = fH;
                f3 = fI;
                wyeVar = centerCircleBox;
            }
            i2++;
            fH = f2;
            rectF = rectF;
            holeRadius = holeRadius;
            centerCircleBox = wyeVar;
            fI = f3;
            drawAngles = drawAngles;
            z = z;
        }
        wye.f(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x01d8: MOVE (r4v1 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // defpackage.dn5
    public void drawValues(Canvas canvas) {
        int i;
        List<cwc> list;
        wye wyeVar;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        wye wyeVar2;
        float f4;
        float f5;
        float f6;
        int iE0;
        wye wyeVar3;
        String str;
        cwc cwcVar;
        wye wyeVar4;
        wye wyeVar5;
        wye centerCircleBox = this.f20541a.getCenterCircleBox();
        float radius = this.f20541a.getRadius();
        float rotationAngle = this.f20541a.getRotationAngle();
        float[] drawAngles = this.f20541a.getDrawAngles();
        float[] absoluteAngles = this.f20541a.getAbsoluteAngles();
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        float holeRadius = (radius - ((this.f20541a.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.f20541a.getHoleRadius() / 100.0f;
        float f7 = (radius / 10.0f) * 3.6f;
        if (this.f20541a.k()) {
            f7 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.f20541a.m() && this.f20541a.l()) {
                rotationAngle = (float) (((double) rotationAngle) + (((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)));
            }
        }
        float f8 = rotationAngle;
        float f9 = radius - f7;
        iwh iwhVar = (iwh) this.f20541a.getData();
        List<cwc> listL = iwhVar.l();
        float fA = iwhVar.A();
        boolean zJ = this.f20541a.j();
        canvas.save();
        float fE = fmq.e(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < listL.size()) {
            cwc cwcVar2 = listL.get(i3);
            boolean zL0 = cwcVar2.l0();
            if (zL0 || zJ) {
                PieDataSet$ValuePosition pieDataSet$ValuePositionH = cwcVar2.H();
                PieDataSet$ValuePosition pieDataSet$ValuePositionJ0 = cwcVar2.J0();
                applyValueTextStyle(cwcVar2);
                float fA2 = fmq.a(this.mValuePaint, "Q") + fmq.e(4.0f);
                k0d k0dVarD0 = cwcVar2.d0();
                int iO0 = cwcVar2.O0();
                boolean zJ2 = cwcVar2.J();
                int iD0 = cwcVar2.D0();
                int i4 = i2;
                this.d.setStrokeWidth(fmq.e(cwcVar2.e0()));
                float fJ = j(cwcVar2);
                wye wyeVarD = wye.d(cwcVar2.P0());
                wyeVarD.c = fmq.e(wyeVarD.c);
                wyeVarD.d = fmq.e(wyeVarD.d);
                int i5 = 0;
                while (i5 < iO0) {
                    PieEntry pieEntryI = cwcVar2.i(i5);
                    wye wyeVar6 = wyeVarD;
                    float f10 = f8 + (((i4 == 0 ? 0.0f : absoluteAngles[i4 - 1] * fH) + ((drawAngles[i4] - ((fJ / (f9 * 0.017453292f)) / 2.0f)) / 2.0f)) * fI);
                    int i6 = iO0;
                    float y = this.f20541a.n() ? (pieEntryI.getY() / fA) * 100.0f : pieEntryI.getY();
                    String strC = pieEntryI.c();
                    int i7 = i3;
                    List<cwc> list2 = listL;
                    double d = f10 * 0.017453292f;
                    float[] fArr3 = drawAngles;
                    float[] fArr4 = absoluteAngles;
                    float fCos = (float) Math.cos(d);
                    float f11 = fH;
                    float fSin = (float) Math.sin(d);
                    boolean z = zJ && pieDataSet$ValuePositionH == PieDataSet$ValuePosition.OUTSIDE_SLICE;
                    boolean z2 = zL0 && pieDataSet$ValuePositionJ0 == PieDataSet$ValuePosition.OUTSIDE_SLICE;
                    boolean z3 = zJ && pieDataSet$ValuePositionH == PieDataSet$ValuePosition.INSIDE_SLICE;
                    boolean z4 = zL0 && pieDataSet$ValuePositionJ0 == PieDataSet$ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float fF0 = cwcVar2.f0();
                        float fP = cwcVar2.p();
                        float fM = cwcVar2.M() / 100.0f;
                        if (this.f20541a.k()) {
                            float f12 = radius * holeRadius2;
                            f3 = ((radius - f12) * fM) + f12;
                        } else {
                            f3 = radius * fM;
                        }
                        float fAbs = cwcVar2.K0() ? fP * f9 * ((float) Math.abs(Math.sin(d))) : fP * f9;
                        float f13 = centerCircleBox.c;
                        float f14 = (f3 * fCos) + f13;
                        float f15 = centerCircleBox.d;
                        float f16 = (f3 * fSin) + f15;
                        float f17 = (fF0 + 1.0f) * f9;
                        float f18 = (f17 * fCos) + f13;
                        float f19 = (f17 * fSin) + f15;
                        wyeVar2 = centerCircleBox;
                        f4 = radius;
                        double d2 = ((double) f10) % 360.0d;
                        if (d2 < 90.0d || d2 > 270.0d) {
                            f5 = f18 + fAbs;
                            Paint paint = this.mValuePaint;
                            Paint.Align align = Paint.Align.LEFT;
                            paint.setTextAlign(align);
                            if (z) {
                                this.f.setTextAlign(align);
                            }
                            f6 = f5 + fE;
                        } else {
                            float f20 = f18 - fAbs;
                            Paint paint2 = this.mValuePaint;
                            Paint.Align align2 = Paint.Align.RIGHT;
                            paint2.setTextAlign(align2);
                            if (z) {
                                this.f.setTextAlign(align2);
                            }
                            f5 = f20;
                            f6 = f20 - fE;
                        }
                        if (zJ2) {
                            iE0 = cwcVar2.E0(i5);
                        } else {
                            iE0 = iD0 != 1122867 ? iD0 : 1122867;
                        }
                        if (iE0 != 1122867) {
                            this.d.setColor(iE0);
                            str = strC;
                            wyeVar3 = wyeVar6;
                            canvas.drawLine(f14, f16, f18, f19, this.d);
                            canvas.drawLine(f18, f19, f5, f19, this.d);
                        } else {
                            wyeVar3 = wyeVar6;
                            str = strC;
                        }
                        if (z && z2) {
                            cwc cwcVar3 = cwcVar2;
                            drawValue(canvas, k0dVarD0, y, pieEntryI, 0, f6, f19, cwcVar2.n(i5));
                            if (i5 < iwhVar.m() && str != null) {
                                d(canvas, str, f6, f19 + fA2);
                            }
                            cwcVar = cwcVar3;
                        } else {
                            cwc cwcVar4 = cwcVar2;
                            if (z) {
                                if (i5 < iwhVar.m() && str != null) {
                                    d(canvas, str, f6, f19 + (fA2 / 2.0f));
                                }
                            } else if (z2) {
                                float f21 = f6;
                                cwcVar = cwcVar4;
                                drawValue(canvas, k0dVarD0, y, pieEntryI, 0, f21, f19 + (fA2 / 2.0f), cwcVar4.n(i5));
                            }
                            cwcVar = cwcVar4;
                        }
                    } else {
                        pieDataSet$ValuePositionH = pieDataSet$ValuePositionH;
                        wyeVar2 = centerCircleBox;
                        f4 = radius;
                        wyeVar3 = wyeVar6;
                        i5 = i5;
                        iD0 = iD0;
                        cwcVar = cwcVar2;
                        fSin = fSin;
                        str = strC;
                    }
                    if (z3 || z4) {
                        wye wyeVar7 = wyeVar2;
                        float f22 = (f9 * fCos) + wyeVar7.c;
                        float f23 = (f9 * fSin) + wyeVar7.d;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z3 && z4) {
                            wyeVar2 = wyeVar7;
                            drawValue(canvas, k0dVarD0, y, pieEntryI, 0, f22, f23, cwcVar.n(i5));
                            if (i5 < iwhVar.m() && str != null) {
                                d(canvas, str, f22, f23 + fA2);
                            }
                        } else {
                            wyeVar2 = wyeVar7;
                            if (z3) {
                                if (i5 < iwhVar.m() && str != null) {
                                    d(canvas, str, f22, f23 + (fA2 / 2.0f));
                                }
                            } else if (z4) {
                                drawValue(canvas, k0dVarD0, y, pieEntryI, 0, f22, f23 + (fA2 / 2.0f), cwcVar.n(i5));
                            }
                        }
                    }
                    if (pieEntryI.getIcon() == null || !cwcVar.D()) {
                        wyeVar4 = wyeVar2;
                        wyeVar5 = wyeVar3;
                    } else {
                        Drawable icon = pieEntryI.getIcon();
                        wyeVar5 = wyeVar3;
                        float f24 = wyeVar5.d;
                        wyeVar4 = wyeVar2;
                        fmq.f(canvas, icon, (int) (((f9 + f24) * fCos) + wyeVar4.c), (int) (((f9 + f24) * fSin) + wyeVar4.d + wyeVar5.c), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i4++;
                    i5++;
                    wyeVarD = wyeVar5;
                    cwcVar2 = cwcVar;
                    iO0 = i6;
                    iD0 = iD0;
                    listL = list2;
                    drawAngles = fArr3;
                    absoluteAngles = fArr4;
                    fH = f11;
                    pieDataSet$ValuePositionJ0 = pieDataSet$ValuePositionJ0;
                    pieDataSet$ValuePositionH = pieDataSet$ValuePositionH;
                    radius = f4;
                    centerCircleBox = wyeVar4;
                    i3 = i7;
                }
                i = i3;
                list = listL;
                wyeVar = centerCircleBox;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = fH;
                wye.f(wyeVarD);
                i2 = i4;
            } else {
                i = i3;
                list = listL;
                wyeVar = centerCircleBox;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = fH;
            }
            centerCircleBox = wyeVar;
            listL = list;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            fH = f2;
            radius = f;
            i3 = i + 1;
        }
        wye.f(centerCircleBox);
        canvas.restore();
    }

    public void e(Canvas canvas) {
        if (!this.f20541a.k() || this.l == null) {
            return;
        }
        float radius = this.f20541a.getRadius();
        float holeRadius = (this.f20541a.getHoleRadius() / 100.0f) * radius;
        wye centerCircleBox = this.f20541a.getCenterCircleBox();
        if (Color.alpha(this.f20542b.getColor()) > 0) {
            this.l.drawCircle(centerCircleBox.c, centerCircleBox.d, holeRadius, this.f20542b);
        }
        if (Color.alpha(this.c.getColor()) > 0 && this.f20541a.getTransparentCircleRadius() > this.f20541a.getHoleRadius()) {
            int alpha = this.c.getAlpha();
            float transparentCircleRadius = radius * (this.f20541a.getTransparentCircleRadius() / 100.0f);
            this.c.setAlpha((int) (alpha * this.mAnimator.h() * this.mAnimator.i()));
            this.o.reset();
            this.o.addCircle(centerCircleBox.c, centerCircleBox.d, transparentCircleRadius, Path.Direction.CW);
            this.o.addCircle(centerCircleBox.c, centerCircleBox.d, holeRadius, Path.Direction.CCW);
            this.l.drawPath(this.o, this.c);
            this.c.setAlpha(alpha);
        }
        wye.f(centerCircleBox);
    }

    public TextPaint f() {
        return this.e;
    }

    public Paint g() {
        return this.f;
    }

    public Paint h() {
        return this.f20542b;
    }

    public Paint i() {
        return this.c;
    }

    @Override // defpackage.dn5
    public void initBuffers() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float j(cwc cwcVar) {
        if (cwcVar.h() && cwcVar.r0() / this.mViewPortHandler.t() > (cwcVar.Z() / ((iwh) this.f20541a.getData()).A()) * 2.0f) {
            return 0.0f;
        }
        return cwcVar.r0();
    }

    public void releaseBitmap() {
        Canvas canvas = this.l;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.l = null;
        }
        WeakReference<Bitmap> weakReference = this.f20543k;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f20543k.clear();
            this.f20543k = null;
        }
    }
}
