package com.huawei.health.sport.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gzk;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SugChart extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f8827a;
    private Path aa;
    private boolean ab;
    private float ac;
    private boolean ad;
    private float ae;
    private Path af;
    private int ag;
    private Paint ah;
    private List<PointF> ai;
    private Paint aj;
    private float ak;
    private float al;
    private int am;
    private float an;
    private int[] ao;
    private Paint ap;
    private RectF aq;
    private Paint ar;
    private float[] as;
    private gzk at;
    private float au;
    private Paint av;
    private float aw;
    private gzk ax;
    private int ay;
    private int az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f8828b;
    private int ba;
    private float bb;
    private int bc;
    private int bd;
    private float be;
    private int bf;
    private float bg;
    private float bh;
    private float bk;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8829c;
    private Paint d;
    private int e;
    private float f;
    private PointF g;
    private Paint h;
    private float i;
    private Paint j;
    private float k;
    private Context l;
    private int m;
    private int n;
    private Paint o;
    private List<gzk> p;
    private int q;
    private float[] r;
    private int s;
    private float t;
    private Paint u;
    private float v;
    private float w;
    private int x;
    private float y;
    private boolean z;

    public SugChart(Context context) {
        super(context);
        this.bk = 0.0f;
        this.aw = 15.0f;
        this.e = Color.parseColor("#556A73");
        this.ag = Color.parseColor("#FFE9D1BA");
        this.r = new float[6];
        this.ak = 10.0f;
        this.af = new Path();
        this.aa = new Path();
        this.al = 1.0f;
        this.ai = new ArrayList(10);
        this.ac = 2.1474836E9f;
        this.as = new float[2];
        this.ay = 0;
        this.m = Color.parseColor("#AFAFB0");
        this.s = 0;
        this.q = 0;
        this.p = new ArrayList(10);
        this.n = 2;
        this.f = 2.0f;
        e(context);
    }

    public SugChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bk = 0.0f;
        this.aw = 15.0f;
        this.e = Color.parseColor("#556A73");
        this.ag = Color.parseColor("#FFE9D1BA");
        this.r = new float[6];
        this.ak = 10.0f;
        this.af = new Path();
        this.aa = new Path();
        this.al = 1.0f;
        this.ai = new ArrayList(10);
        this.ac = 2.1474836E9f;
        this.as = new float[2];
        this.ay = 0;
        this.m = Color.parseColor("#AFAFB0");
        this.s = 0;
        this.q = 0;
        this.p = new ArrayList(10);
        this.n = 2;
        this.f = 2.0f;
        e(context);
    }

    public SugChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bk = 0.0f;
        this.aw = 15.0f;
        this.e = Color.parseColor("#556A73");
        this.ag = Color.parseColor("#FFE9D1BA");
        this.r = new float[6];
        this.ak = 10.0f;
        this.af = new Path();
        this.aa = new Path();
        this.al = 1.0f;
        this.ai = new ArrayList(10);
        this.ac = 2.1474836E9f;
        this.as = new float[2];
        this.ay = 0;
        this.m = Color.parseColor("#AFAFB0");
        this.s = 0;
        this.q = 0;
        this.p = new ArrayList(10);
        this.n = 2;
        this.f = 2.0f;
        e(context);
    }

    public void setType(int i) {
        this.ay = i;
    }

    private float f(float f) {
        if (this.ac == 220.0f) {
            return getDrawBaseLine() - ((f - this.bg) * this.v);
        }
        return this.bd + this.ae + getPaddingTop() + ((this.be - f) * this.v);
    }

    private void g() {
        Paint paint = new Paint(1);
        this.av = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(this.e);
        this.d.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.ah = paint3;
        paint3.setStrokeWidth(this.ae);
        this.ah.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint(1);
        this.o = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        Paint paint5 = new Paint(1);
        this.f8828b = paint5;
        paint5.setStrokeWidth(0.25f);
        this.f8828b.setStyle(Paint.Style.STROKE);
        this.f8828b.setColor(this.e);
        this.u = new Paint(1);
        Paint paint6 = new Paint(1);
        this.aj = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        Paint paint7 = new Paint(1);
        this.h = paint7;
        paint7.setColor(-1);
        this.h.setTextAlign(Paint.Align.CENTER);
        this.j = new Paint(1);
    }

    private void e(Context context) {
        if (context == null) {
            return;
        }
        this.l = context;
        d();
        this.am = a(3.0f);
        this.av.setTextSize(this.aw);
        this.aj.setStrokeWidth(this.ak);
        this.aq = new RectF(0.0f, 0.0f, this.bc, this.ba);
        this.u.setStrokeWidth(a(1.0f));
        this.x = -1;
        this.h.setTextSize(a(12.0f));
        this.d.setTextSize(this.f8829c);
        g();
    }

    private void d() {
        this.y = a(20.0f);
        this.aw = c(12.0f);
        this.f8829c = c(12.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ba = i2;
        if (this.z) {
            this.bk = (i2 - this.f8829c) - this.am;
        } else {
            this.bk = i2 - Math.abs(this.f8829c * 2.0f);
        }
        this.bc = i;
        this.g = new PointF(i / 2.0f, i2 / 2.0f);
        if (this.p.size() > 0) {
            e(i);
            h();
        }
    }

    private void e(int i) {
        if (this.ab) {
            String str = new DecimalFormat("##").format(this.be);
            this.d.getTextBounds(str, 0, str.length(), new Rect());
            this.bd = getPaddingTop();
        } else {
            this.bd = getPaddingTop();
        }
        this.an = getPaddingStart();
        if (this.n != 2 || this.p.size() <= 1) {
            return;
        }
        this.y = (((i - this.an) - getPaddingRight()) - (this.f * this.p.size())) / (this.p.size() - 1);
    }

    private int e(float f) {
        return (((int) (f + 1.0f)) / 2) * 2;
    }

    private void h() {
        if (this.p.size() == 0) {
            return;
        }
        n();
        if (this.bk > 0.0f) {
            this.af.reset();
            k();
            c();
            if (this.n == 2) {
                j();
                m();
            }
        }
    }

    private void m() {
        if (this.ai.size() > 0) {
            Path path = this.aa;
            List<PointF> list = this.ai;
            path.lineTo(list.get(list.size() - 1).x, this.bk);
            this.aa.lineTo(this.ai.get(0).x, this.bk);
            this.aa.close();
        }
    }

    private void k() {
        if (this.ac == 220.0f) {
            e();
        } else {
            b();
        }
    }

    private float getDrawBaseLine() {
        return (this.bk - getCalloutHeight()) - a(4.0f);
    }

    private void e() {
        if (this.at.d() == this.ax.d()) {
            this.bg = 0.0f;
            this.k = this.at.d() + this.ax.d();
            this.v = ((((getDrawBaseLine() - this.bd) - getCalloutHeight()) - a(4.0f)) - (this.ae / 2.0f)) / this.k;
        } else {
            this.bg = this.ax.d();
            float drawBaseLine = getDrawBaseLine();
            float f = this.bd;
            float calloutHeight = getCalloutHeight();
            this.v = ((((drawBaseLine - f) - calloutHeight) - a(4.0f)) - (this.ae / 2.0f)) / (this.at.d() - this.ax.d());
        }
        a();
    }

    private void a() {
        int length = this.ao.length * 2;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.ao[i / 2];
        }
        this.ao = iArr;
        float[] fArr = new float[length];
        this.as = fArr;
        b(fArr);
    }

    private void b() {
        if (!this.ad) {
            float f = this.bk;
            float f2 = this.bd;
            float calloutHeight = ((((f - f2) - getCalloutHeight()) - a(4.0f)) - (this.ae / 2.0f)) / (this.at.d() - this.bg);
            this.v = calloutHeight;
            float f3 = (this.bk - this.bd) / calloutHeight;
            this.be = this.be < ((float) e(f3)) ? e(f3) : this.be;
        }
        this.v = (((this.bk - this.bd) - this.ae) - getPaddingTop()) / this.be;
    }

    private void c() {
        for (int i = 0; i < this.p.size(); i++) {
            gzk gzkVar = this.p.get(i);
            gzkVar.d((gzkVar.d() - this.bg) * this.v);
            gzkVar.e(this.f);
            PointF pointFJ = gzkVar.j();
            if (!LanguageUtil.ba(getContext())) {
                float f = i;
                pointFJ.x = getPaddingStart() + (this.y * f) + (this.f * f);
            } else {
                float f2 = i;
                pointFJ.x = getPaddingEnd() + (this.y * f2) + (this.f * f2);
            }
            if (this.ac == 220.0f) {
                pointFJ.y = getDrawBaseLine() - gzkVar.a();
            } else {
                pointFJ.y = (this.bk - this.f8827a) - gzkVar.a();
            }
        }
    }

    private void j() {
        this.ai.clear();
        for (gzk gzkVar : this.p) {
            if (d(gzkVar)) {
                this.ai.add(gzkVar.c());
            }
        }
        for (int i = 0; i < this.ai.size(); i++) {
            if (this.ai.get(i).y >= 0.0f) {
                PointF pointF = this.ai.get(i);
                if (i == 0) {
                    this.af.moveTo(pointF.x, pointF.y);
                    this.aa.moveTo(pointF.x, pointF.y);
                }
                if (i < this.ai.size() - 1) {
                    PointF pointF2 = this.ai.get(i + 1);
                    float f = (pointF.x + pointF2.x) / 2.0f;
                    this.af.cubicTo(f, pointF.y, f, pointF2.y, pointF2.x, pointF2.y);
                    this.aa.cubicTo(f, pointF.y, f, pointF2.y, pointF2.x, pointF2.y);
                }
            }
        }
    }

    private boolean d(gzk gzkVar) {
        return gzkVar.d() <= this.ac * this.v && gzkVar.d() >= 0.0f;
    }

    private void n() {
        if (this.n == 3) {
            float paddingTop = this.ak > ((float) ((this.ba / 2) - getPaddingTop())) ? (this.ba / 2) - getPaddingTop() : this.ak;
            this.ak = paddingTop;
            this.aj.setStrokeWidth(paddingTop);
            float f = this.w;
            float f2 = this.ak / 10.0f;
            if (f < f2) {
                f = f2;
            }
            this.w = f;
            this.i = ((this.ba / 2) - getPaddingTop()) - (this.ak / 2.0f);
            this.aq.set(this.g.x - this.i, this.g.y - this.i, this.g.x + this.i, this.g.y + this.i);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        List<gzk> list = this.p;
        if (list != null && list.size() > 0) {
            int i = this.n;
            if (i == 3) {
                g(canvas);
            } else if (i == 2) {
                i(canvas);
            } else {
                LogUtil.a("Track_SugChart", "don't deal such type");
            }
        }
        e(canvas);
    }

    private void i(Canvas canvas) {
        if (this.ai.size() == 1) {
            this.ah.setColor(this.ag);
            canvas.drawPoint(this.ai.get(0).x, this.ai.get(0).y, this.ah);
            if (this.ay == 0) {
                b(canvas, this.at, true, Color.parseColor("#EC8900"));
            }
        } else {
            d(canvas);
        }
        a(canvas);
        if (this.ab) {
            h(canvas);
        }
    }

    private void h(Canvas canvas) {
        float f = (this.be - this.bg) / this.bh;
        float f2 = this.v;
        float paddingStart = getPaddingStart();
        float paddingEnd = this.bc - getPaddingEnd();
        float fI = i(getPaddingStart());
        if (this.ac == 220.0f) {
            if (this.z) {
                return;
            }
            canvas.drawLine(paddingStart, 2.0f, paddingEnd, 2.0f, this.f8828b);
            canvas.drawLine(paddingStart, f(0.0f), paddingEnd, f(0.0f), this.f8828b);
            canvas.drawText(new DecimalFormat("#").format(0L), fI, f(0.0f) - a(4.0f), this.d);
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Float.valueOf(paddingStart));
        arrayList.add(Float.valueOf(paddingEnd));
        b(canvas, f, f * f2, fI, arrayList);
    }

    private float i(float f) {
        if (!LanguageUtil.ba(getContext())) {
            float paddingEnd = this.bc - getPaddingEnd();
            this.d.setTextAlign(Paint.Align.RIGHT);
            return paddingEnd;
        }
        this.d.setTextAlign(Paint.Align.LEFT);
        return f;
    }

    private void b(Canvas canvas, float f, float f2, float f3, List<Float> list) {
        if (list == null || list.size() < 2) {
            LogUtil.j("Track_SugChart", "line's length is invalid");
            return;
        }
        int i = 0;
        float fFloatValue = list.get(0).floatValue();
        float fFloatValue2 = list.get(1).floatValue();
        while (true) {
            float f4 = i;
            if (f4 > this.bh) {
                return;
            }
            float f5 = this.bk - (f2 * f4);
            if (i > 0) {
                canvas.drawText(new DecimalFormat("#").format(this.bg + (f4 * f)), f3, a(4.0f) + f5 + c(this.d), this.d);
                Path path = new Path();
                path.moveTo(fFloatValue, f5);
                if (njy.e(this.p) && this.p.size() > 0) {
                    path.lineTo(fFloatValue2, f5);
                }
                this.f8828b.setPathEffect(getPathDashEffect());
                canvas.drawPath(path, this.f8828b);
            }
            i++;
        }
    }

    private DashPathEffect getPathDashEffect() {
        return new DashPathEffect(new float[]{4.0f, 4.0f}, this.al);
    }

    private void g(Canvas canvas) {
        this.au = 0.0f;
        for (gzk gzkVar : this.p) {
            this.aj.setColor(gzkVar.e());
            float fD = (gzkVar.d() / (this.t * this.v)) * 360.0f;
            canvas.drawArc(this.aq, this.au, fD, false, this.aj);
            this.au += fD;
        }
        this.u.setStrokeWidth(this.w);
        this.u.setColor(this.x);
        canvas.save();
        Iterator<gzk> it = this.p.iterator();
        while (it.hasNext()) {
            float fD2 = it.next().d() / (this.t * this.v);
            canvas.drawLine(((this.g.x + this.i) - (this.ak / 2.0f)) - 1.0f, this.g.y, this.g.x + this.i + (this.ak / 2.0f) + 1.0f, this.g.y, this.u);
            canvas.rotate(fD2 * 360.0f, this.g.x, this.g.y);
        }
        canvas.restore();
    }

    public void b(float f) {
        this.am = a(f);
    }

    private void e(Canvas canvas) {
        float f = this.bk;
        float f2 = this.am;
        float f3 = this.z ? this.f8829c : this.aw;
        this.d.setTextAlign(Paint.Align.LEFT);
        String strValueOf = String.valueOf((int) this.bb);
        float paddingRight = ((this.bc - this.an) - getPaddingRight()) - this.d.measureText(strValueOf, 0, strValueOf.length());
        for (int i = 0; i < this.bf + 1; i++) {
            String strE = UnitUtil.e(this.az * i, 1, 0);
            float fMeasureText = this.d.measureText(strE, 0, strE.length());
            float paddingStart = this.an + (((this.az * i) / this.bb) * paddingRight);
            if (LanguageUtil.ba(getContext())) {
                paddingStart = (this.bc - getPaddingStart()) - (((this.az * i) / this.bb) * paddingRight);
                this.d.setTextAlign(Paint.Align.RIGHT);
            }
            float f4 = (fMeasureText / 2.0f) + paddingStart;
            float f5 = this.bc;
            if (f4 > f5) {
                paddingStart = f5 - fMeasureText;
            }
            canvas.drawText(strE, paddingStart, f + f2 + f3, this.d);
        }
    }

    private void d(Canvas canvas) {
        if (this.s != 0 && this.q != 0) {
            b(canvas);
        }
        e(this.ah);
        canvas.drawPath(this.af, this.ah);
        c(canvas);
    }

    private void c(Canvas canvas) {
        if (this.h == null || !f() || this.ao == null) {
            return;
        }
        b(canvas, this.at, true, Color.parseColor("#EC8900"));
        gzk gzkVar = this.ax;
        int[] iArr = this.ao;
        b(canvas, gzkVar, false, iArr[iArr.length - 1]);
    }

    private boolean f() {
        return (this.at == null || this.ax == null) ? false : true;
    }

    private void b(Canvas canvas, gzk gzkVar, boolean z, int i) {
        float f;
        if (this.z) {
            PointF pointFC = gzkVar.c();
            canvas.drawCircle(pointFC.x, pointFC.y, this.ae, this.ap);
            return;
        }
        float fA = a(2.0f) + (this.ae / 2.0f);
        this.j.setColor(i);
        if (gzkVar.d() < 0.0f) {
            return;
        }
        PointF pointFC2 = gzkVar.c();
        String strValueOf = String.valueOf(gzkVar.b());
        Path path = new Path();
        float fA2 = a(21.0f);
        float fA3 = a(6.0f);
        float fA4 = a(8.0f);
        float fA5 = a(4.0f);
        if (z) {
            f = fA5;
            c(fA, pointFC2, path, fA4, f);
        } else {
            f = fA5;
            a(fA, pointFC2, path, fA4, f);
        }
        canvas.drawPath(path, this.j);
        float fMeasureText = this.h.measureText(strValueOf) / 2.0f;
        RectF rectF = new RectF((pointFC2.x - fMeasureText) - fA3, ((pointFC2.y - fA) - f) - fA2, pointFC2.x + fMeasureText + fA3, (pointFC2.y - fA) - f);
        if (!z) {
            rectF.offset(0.0f, this.ae + getCalloutHeight() + a(4.0f) + a(2.0f));
        }
        d(canvas, pointFC2, strValueOf, rectF);
    }

    private void d(Canvas canvas, PointF pointF, String str, RectF rectF) {
        float fE = e(pointF, rectF, rectF.right - this.bc, pointF.x, 1.0f);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.j);
        canvas.drawText(str, fE, (rectF.bottom - (rectF.height() / 2.0f)) + (c(this.h) / 2.0f), this.h);
    }

    private float e(PointF pointF, RectF rectF, float f, float f2, float f3) {
        if (f > 0.0f) {
            rectF.right = (rectF.right - f) - f3;
            rectF.left = (rectF.left - f) - f3;
            return (pointF.x - f) - f3;
        }
        if (rectF.left < 0.0f) {
            rectF.right = (rectF.right - rectF.left) + f3;
            float f4 = pointF.x;
            float f5 = rectF.left;
            rectF.left = f3;
            return (f4 - f5) + f3;
        }
        LogUtil.a("Track_SugChart", "limitInside error");
        return f2;
    }

    private void c(float f, PointF pointF, Path path, float f2, float f3) {
        path.moveTo(pointF.x, pointF.y - f);
        float f4 = f2 / 2.0f;
        path.lineTo(pointF.x - f4, ((pointF.y - f) - f3) - 1.0f);
        path.lineTo(pointF.x + f4, ((pointF.y - f) - f3) - 1.0f);
        path.close();
    }

    private void a(float f, PointF pointF, Path path, float f2, float f3) {
        path.moveTo(pointF.x, pointF.y + f);
        float f4 = f2 / 2.0f;
        path.lineTo(pointF.x - f4, pointF.y + f + f3 + 1.0f);
        path.lineTo(pointF.x + f4, pointF.y + f + f3 + 1.0f);
        path.close();
    }

    private float c(Paint paint) {
        return (-paint.ascent()) - paint.descent();
    }

    private float getCalloutHeight() {
        if (this.z) {
            return 0.0f;
        }
        return a(21.0f) + a(2.0f) + a(4.0f);
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.bk, this.q, this.s, Shader.TileMode.MIRROR);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(linearGradient);
        canvas.drawPath(this.aa, paint);
    }

    private void e(Paint paint) {
        if (i()) {
            paint.setShader(new LinearGradient(0.0f, f(getTopZone()), 0.0f, f(getBottomZone()), this.ao, this.as, Shader.TileMode.CLAMP));
        } else {
            this.ah.setColor(this.ag);
        }
    }

    private float getBottomZone() {
        float[] fArr = this.r;
        return fArr[fArr.length - 1] - 10.0f;
    }

    private float getTopZone() {
        return this.r[0];
    }

    private void b(float[] fArr) {
        float bottomZone = getBottomZone();
        float topZone = getTopZone();
        float f = topZone - bottomZone;
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.r;
            if (i >= fArr2.length) {
                return;
            }
            int i3 = i2 + 1;
            fArr[i2] = ((topZone - fArr2[i]) / f) + 1.0E-4f;
            if (i < fArr2.length - 1) {
                i2 += 2;
                fArr[i3] = (topZone - fArr2[i + 1]) / f;
            } else {
                i2 += 2;
                fArr[i3] = 1.0f;
            }
            i++;
        }
    }

    private boolean i() {
        int[] iArr = this.ao;
        return iArr != null && iArr.length > 1 && this.r.length == 6;
    }

    private void a(Canvas canvas) {
        this.o.setColor(this.m);
        this.o.setStrokeWidth(2.0f);
        canvas.drawLine(getPaddingStart(), this.bk, this.bc - getPaddingEnd(), this.bk, this.o);
    }

    public void a(List<gzk> list) {
        String str = String.format("%%s %s", getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.p.clear();
        this.t = 0.0f;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (LanguageUtil.ba(getContext())) {
            Collections.reverse(list);
        }
        a(list, str);
        this.p.addAll(list);
        if (!this.ab && this.be == 0.0f) {
            this.be = list.get(0).d();
        }
        for (gzk gzkVar : list) {
            if (!this.ab || this.n == 3) {
                this.be = this.be > gzkVar.d() ? this.be : gzkVar.d();
            }
            this.t += gzkVar.d() - this.bg;
        }
        int i = this.bc;
        if (i > 0) {
            e(i);
            h();
        }
        postInvalidate();
    }

    private void a(List<gzk> list, String str) {
        gzk gzkVar = (gzk) Collections.max(list, new Comparator<gzk>() { // from class: com.huawei.health.sport.view.SugChart.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar2, gzk gzkVar3) {
                return Float.compare(SugChart.this.h(gzkVar2.d()), SugChart.this.h(gzkVar3.d()));
            }
        });
        this.at = gzkVar;
        this.k = gzkVar.d();
        this.at.b(String.format(str, new DecimalFormat("#").format(this.at.d())));
        gzk gzkVar2 = (gzk) Collections.min(list, new Comparator<gzk>() { // from class: com.huawei.health.sport.view.SugChart.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(gzk gzkVar3, gzk gzkVar4) {
                return Float.compare(SugChart.this.g(gzkVar3.d()), SugChart.this.g(gzkVar4.d()));
            }
        });
        this.ax = gzkVar2;
        gzkVar2.b(String.format(str, new DecimalFormat("#").format(this.ax.d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float h(float f) {
        if (f > this.ac) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float g(float f) {
        return f <= 0.0f ? this.ac : f;
    }

    public void c(int i) {
        this.n = i;
    }

    public float getTextSize() {
        return this.aw;
    }

    public void setTextSize(float f) {
        float fC = c(f);
        this.aw = fC;
        this.bk = 2.0f * fC;
        this.av.setTextSize(fC);
    }

    public void d(float f) {
        this.f8829c = f;
        this.d.setTextSize(f);
        this.bk = this.ba - Math.abs(this.f8829c * 2.0f);
        if (this.bc > 0) {
            h();
        }
    }

    public void e(int i, int i2) {
        this.e = i;
        this.d.setColor(i);
        this.f8828b.setColor(this.e);
        this.m = i2;
    }

    public void setLineWidth(float f) {
        this.ae = f;
        this.ah.setStrokeWidth(f);
    }

    public void setLineColor(int i) {
        this.ag = i;
    }

    public void setYAxisValues(int i, int i2, int i3) {
        if (i > i2) {
            return;
        }
        this.ab = true;
        this.be = i2;
        this.bg = i;
        this.bh = i3;
    }

    public void setAbove(float f) {
        this.f8827a = f;
    }

    public int a(float f) {
        Context context = this.l;
        if (context == null) {
            LogUtil.j("Track_SugChart", "dip2px mContext is null.");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int c(float f) {
        Context context = this.l;
        if (context == null) {
            LogUtil.j("Track_SugChart", "sp2px mContext is null.");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void setXNums(int i, int i2, float f) {
        this.bf = i;
        this.az = i2;
        this.bb = f;
    }

    public void b(boolean z) {
        this.ad = z;
    }

    public void a(int i) {
        this.ac = i;
    }

    public void e(long j) {
        if (j > 0) {
            this.z = true;
            Paint paint = new Paint(1);
            this.ar = paint;
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.ap = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.ap.setColor(-16777216);
        }
    }
}
