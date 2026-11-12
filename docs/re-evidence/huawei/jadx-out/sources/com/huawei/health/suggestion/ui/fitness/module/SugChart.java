package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.gzx;
import defpackage.hiw;
import defpackage.hmc;
import defpackage.njy;
import defpackage.ped;
import defpackage.qqp;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class SugChart extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f9403a;
    private float aa;
    private Paint ab;
    private int ac;
    private OnHelperGestureListener ad;
    private List<Path> ae;
    private int af;
    private Paint ag;
    private int ah;
    private Path ai;
    private int[] aj;
    private float ak;
    private int al;
    private int am;
    private Paint an;
    private Paint ao;
    private int ap;
    private hmc aq;
    private int ar;
    private Paint as;
    private Paint at;
    private int au;
    private int av;
    private float aw;
    private float ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearGradient f9404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f9405c;
    private float d;
    private int e;
    private float f;
    private int g;
    private float h;
    private int i;
    private Context j;
    private List<Path> k;
    private Paint l;
    private Paint m;
    private int n;
    private PointF o;
    private float p;
    private int q;
    private hmc r;
    private List<hmc> s;
    private Paint t;
    private int u;
    private boolean v;
    private float w;
    private boolean x;
    private boolean y;
    private int z;

    public interface OnHelperGestureListener {
        void scrollX(boolean z);

        void scrollY(boolean z);
    }

    public SugChart(Context context) {
        super(context);
        this.f = 0.0f;
        this.am = -1;
        this.aw = 15.0f;
        this.ar = Color.parseColor("#556A73");
        this.ap = -1;
        this.x = false;
        this.u = Color.parseColor("#ffe9d1ba");
        this.v = false;
        this.ak = 1.0f;
        this.ah = 5;
        this.af = -15823;
        this.o = new PointF(0.0f, 0.0f);
        this.s = new ArrayList();
        this.ac = -12303292;
        this.g = 2;
        this.h = 0.0f;
        this.ai = new Path();
        this.ae = new ArrayList();
        this.k = new ArrayList();
        this.t = new Paint(1);
        this.ao = new Paint(1);
        this.ag = new Paint(1);
        this.at = new Paint(1);
        this.as = new Paint(1);
        this.an = new Paint(1);
        this.f9405c = new Paint(1);
        this.ab = new Paint(1);
        this.m = new Paint(1);
        this.l = new Paint(1);
        this.f9405c.setTextAlign(Paint.Align.CENTER);
        this.ab.setStrokeWidth(2.0f);
        this.ab.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(2.0f);
        this.m.setStyle(Paint.Style.STROKE);
        this.l.setStyle(Paint.Style.STROKE);
        this.at.setTextAlign(Paint.Align.CENTER);
        c(context);
    }

    public SugChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 0.0f;
        this.am = -1;
        this.aw = 15.0f;
        this.ar = Color.parseColor("#556A73");
        this.ap = -1;
        this.x = false;
        this.u = Color.parseColor("#ffe9d1ba");
        this.v = false;
        this.ak = 1.0f;
        this.ah = 5;
        this.af = -15823;
        this.o = new PointF(0.0f, 0.0f);
        this.s = new ArrayList();
        this.ac = -12303292;
        this.g = 2;
        this.h = 0.0f;
        this.ai = new Path();
        this.ae = new ArrayList();
        this.k = new ArrayList();
        this.t = new Paint(1);
        this.ao = new Paint(1);
        this.ag = new Paint(1);
        this.at = new Paint(1);
        this.as = new Paint(1);
        this.an = new Paint(1);
        this.f9405c = new Paint(1);
        this.ab = new Paint(1);
        this.m = new Paint(1);
        this.l = new Paint(1);
        this.f9405c.setTextAlign(Paint.Align.CENTER);
        this.ab.setStrokeWidth(2.0f);
        this.ab.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(2.0f);
        this.m.setStyle(Paint.Style.STROKE);
        this.l.setStyle(Paint.Style.STROKE);
        this.at.setTextAlign(Paint.Align.CENTER);
        c(context);
    }

    public SugChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 0.0f;
        this.am = -1;
        this.aw = 15.0f;
        this.ar = Color.parseColor("#556A73");
        this.ap = -1;
        this.x = false;
        this.u = Color.parseColor("#ffe9d1ba");
        this.v = false;
        this.ak = 1.0f;
        this.ah = 5;
        this.af = -15823;
        this.o = new PointF(0.0f, 0.0f);
        this.s = new ArrayList();
        this.ac = -12303292;
        this.g = 2;
        this.h = 0.0f;
        this.ai = new Path();
        this.ae = new ArrayList();
        this.k = new ArrayList();
        this.t = new Paint(1);
        this.ao = new Paint(1);
        this.ag = new Paint(1);
        this.at = new Paint(1);
        this.as = new Paint(1);
        this.an = new Paint(1);
        this.f9405c = new Paint(1);
        this.ab = new Paint(1);
        this.m = new Paint(1);
        this.l = new Paint(1);
        this.f9405c.setTextAlign(Paint.Align.CENTER);
        this.ab.setStrokeWidth(2.0f);
        this.ab.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(2.0f);
        this.m.setStyle(Paint.Style.STROKE);
        this.l.setStyle(Paint.Style.STROKE);
        this.at.setTextAlign(Paint.Align.CENTER);
        c(context);
    }

    private void c(Context context) {
        this.j = context;
        a();
        this.ar = context.getResources().getColor(R.color.textColorTertiary);
        this.ap = context.getResources().getColor(R.color.textColorPrimaryInverse);
        this.u = context.getResources().getColor(R.color.textColorPrimaryInverse);
        this.ac = context.getResources().getColor(R.color.colorTertiary);
        this.av = ViewConfiguration.get(context).getScaledTouchSlop();
        this.at.setTextSize(this.aw);
        this.as.setColor(this.ar);
        this.f9405c.setTextSize(this.d);
        this.f9405c.setColor(this.e);
        this.ao.setColor(context.getResources().getColor(R.color.textColorPrimary));
        this.ao.setAlpha(10);
    }

    private void a() {
        this.h = qqp.a(getContext(), 36.0f);
        this.w = qqp.a(getContext(), 20.0f);
        this.ax = qqp.a(getContext(), 3.0f);
        this.aw = qqp.a(getContext(), 12.0f);
        this.d = qqp.a(getContext(), 11.0f);
        this.aa = qqp.a(getContext(), 3.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = i2 - getResources().getDimension(com.huawei.health.suggestion.R.dimen.sug_chart_36);
        if (this.g == 2) {
            this.ax *= 2.0f;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        if (Math.abs(f) > 1.0E-6f) {
            this.ah = qqp.a(getContext(), getContext().getResources().getDimensionPixelOffset(R.dimen.maxPaddingStart) / f);
        }
        this.au = i;
        if (this.s.size() <= 0 || i <= 0) {
            return;
        }
        d();
        i();
    }

    private void d() {
        if (this.x) {
            return;
        }
        int i = this.q;
        if (i > 0 && this.g == 1) {
            int i2 = this.au - (this.ah * 2);
            float f = (i2 - ((i + 1) * 2)) / i;
            this.h = f;
            this.w = (i2 - (f * this.s.size())) / this.s.size();
            return;
        }
        this.w = 2.0f;
        this.h = ((this.au - (this.ah * 2)) - ((this.s.size() - 1) * 2.0f)) / this.s.size();
    }

    private void i() {
        if (b()) {
            this.y = false;
            e();
            for (int i = 0; i < this.s.size(); i++) {
                hmc hmcVar = this.s.get(i);
                PointF pointFR = hmcVar.r();
                a(i, pointFR);
                pointFR.y = (this.f - this.f9403a) - hmcVar.d();
                hmcVar.e(this.ac).c(this.p).b(this.h);
            }
            h();
        }
    }

    private void h() {
        hmc hmcVar = this.aq;
        if (hmcVar != null) {
            float f = hmcVar.m().y;
            float f2 = this.aq.r().y;
            int[] iArr = this.aj;
            this.f9404b = new LinearGradient(0.0f, f, 0.0f, f2, iArr[0], iArr[1], Shader.TileMode.CLAMP);
        }
    }

    private void a(int i, PointF pointF) {
        if (this.q > 0 && this.g == 1) {
            float f = i;
            pointF.x = this.ah + (this.w * (0.5f + f)) + (this.h * f);
        } else {
            float f2 = i;
            pointF.x = this.ah + (this.w * f2) + (this.h * f2);
        }
    }

    private boolean b() {
        return this.f > 0.0f && this.y;
    }

    private void e() {
        hmc hmcVar;
        if (this.p != 0.0f || (hmcVar = this.r) == null) {
            return;
        }
        float fD = d((float) Math.ceil(hmcVar.t()));
        if (fD != 0.0f) {
            this.p = ((((this.f - this.f9403a) - hiw.d()) - qqp.a(getContext(), 4.0f)) - this.aa) / fD;
        }
        float f = this.p;
        if (f != 0.0f) {
            b(((this.f - this.f9403a) - 2.0f) / f);
        }
        int i = this.z;
        if (i != 0) {
            this.p = ((this.f - this.f9403a) - 2.0f) / i;
        }
    }

    private void b(float f) {
        if (this.r.h() == 0) {
            this.z = gzx.b((float) Math.ceil(f));
        } else {
            this.z = gzx.c(f);
        }
    }

    private float d(float f) {
        if (this.r.h() == 1) {
            return (this.r.t() / 1000.0f) * 1000.0f;
        }
        if (this.r.h() == 2) {
            return this.r.t();
        }
        return this.r.h() == 3 ? this.r.t() : f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        try {
            if (njy.b(this.s)) {
                b(canvas);
            }
            e(canvas);
            g(canvas);
        } catch (RuntimeException e) {
            LogUtil.e("Suggestion_SugChart", "onDraw RuntimeException : ", LogAnonymous.b(e));
        } catch (Exception e2) {
            LogUtil.e("Suggestion_SugChart", "onDraw Exception : ", LogAnonymous.b(e2));
        }
    }

    private void b(Canvas canvas) {
        if (this.g == 1) {
            j(canvas);
        } else {
            i(canvas);
        }
    }

    private void g(Canvas canvas) {
        if (this.r == null) {
            return;
        }
        float fG = g(this.ah);
        Paint.FontMetricsInt fontMetricsInt = this.f9405c.getFontMetricsInt();
        float f = fontMetricsInt.descent - fontMetricsInt.ascent;
        int iC = gzx.c(this.z / 1000.0f);
        if (hiw.a(this.r)) {
            iC = this.z;
        }
        int i = iC;
        float fB = b(canvas, fG, f, i);
        float f2 = fB + ((this.f - fB) / 2.0f);
        int i2 = this.ah;
        canvas.drawLine(i2, f2, this.au - i2, f2, this.l);
        d(canvas, fG, f, i, f2);
    }

    private float b(Canvas canvas, float f, float f2, int i) {
        String strE;
        if (this.r.h() == 2) {
            strE = new SimpleDateFormat(getResources().getString(com.huawei.health.suggestion.R.string.sug_train_event_pace_format), Locale.getDefault()).format(Integer.valueOf(i * 1000));
        } else {
            strE = UnitUtil.e(i, 1, 0);
        }
        int i2 = this.ah;
        canvas.drawLine(i2, 2.0f, this.au - i2, 2.0f, this.l);
        canvas.drawText(strE, f, f2 + 2.0f, this.f9405c);
        return 2.0f;
    }

    private void d(Canvas canvas, float f, float f2, int i, float f3) {
        String strE;
        if (this.r.h() == 2) {
            strE = new SimpleDateFormat(getResources().getString(com.huawei.health.suggestion.R.string.sug_train_event_pace_format), Locale.getDefault()).format(Integer.valueOf((i / 2) * 1000));
        } else if (this.r.h() == 0) {
            strE = UnitUtil.e(ped.a(i / 2.0f), 1, 0);
        } else {
            strE = UnitUtil.e(i / 2.0f, 1, 0);
        }
        canvas.drawText(strE, f, f3 + f2, this.f9405c);
    }

    private float g(float f) {
        if (LanguageUtil.ba(getContext().getApplicationContext())) {
            this.f9405c.setTextAlign(Paint.Align.LEFT);
            return f;
        }
        this.f9405c.setTextAlign(Paint.Align.RIGHT);
        return this.au - this.ah;
    }

    private void j(Canvas canvas) {
        for (int i = 0; i < this.s.size(); i++) {
            hmc hmcVar = this.s.get(i);
            h(i);
            e(canvas, hmcVar);
            c(canvas, hmcVar);
        }
        f(canvas);
    }

    private void h(int i) {
        if (this.aj != null) {
            this.t.setShader(this.f9404b);
        } else {
            setExcelPaintColor(i);
        }
    }

    private void setExcelPaintColor(int i) {
        if (i != this.am) {
            this.t.setColor(this.ac);
        } else {
            this.t.setColor(this.j.getResources().getColor(R.color.common_colorAccent));
        }
    }

    private void e(Canvas canvas, hmc hmcVar) {
        if (hmcVar.c() > 0.0f) {
            this.ag.setColor(this.af);
            canvas.drawRect(hmcVar.k(), this.t);
            canvas.drawPath(hmcVar.f(), this.ag);
        } else {
            canvas.drawPath(hmcVar.g(), this.t);
            canvas.drawPath(hmcVar.o(), this.ao);
        }
    }

    private void c(Canvas canvas, hmc hmcVar) {
        this.f9405c.setTextAlign(Paint.Align.CENTER);
        if (hmcVar != null) {
            this.f9405c.setColor(this.e);
            PointF pointFB = hmcVar.b();
            if (TextUtils.isEmpty(hmcVar.e())) {
                return;
            }
            String strE = hmcVar.e();
            b(canvas, hmcVar, pointFB, this.f9405c.measureText(strE, 0, strE.length()));
        }
    }

    private boolean c(Canvas canvas, Path path, int i) {
        hmc hmcVar;
        if (path == null) {
            hmcVar = null;
        } else {
            if (njy.e(this.s, i) || (hmcVar = this.s.get(i)) == null) {
                return true;
            }
            b(path, i, b(path, i, hmcVar));
        }
        c(canvas, hmcVar);
        return false;
    }

    private void b(Canvas canvas, hmc hmcVar, PointF pointF, float f) {
        float f2 = f / 2.0f;
        if (pointF.x - f2 < 0.0f) {
            canvas.drawText(hmcVar.e(), f2, this.f + qqp.a(getContext(), 3.0f) + this.aw, this.f9405c);
            return;
        }
        if (pointF.x + f2 > this.au) {
            canvas.drawText(hmcVar.e(), this.au - f2, this.f + qqp.a(getContext(), 3.0f) + this.aw, this.f9405c);
            return;
        }
        canvas.drawText(hmcVar.e(), pointF.x, this.f + qqp.a(getContext(), 3.0f) + this.aw, this.f9405c);
    }

    private void d(Canvas canvas, hmc hmcVar) {
        if (hmcVar.l() <= 0.0f) {
            return;
        }
        this.at.setColor(this.ap);
        this.as.setColor(this.al);
        hiw.b(canvas, hmcVar, new hiw.c(this.aa, this.au, this.as, this.at));
    }

    private void i(Canvas canvas) {
        this.ai.reset();
        j();
        if (d(canvas)) {
            return;
        }
        c(canvas);
        a(canvas);
        if (this.aa > 0.0f) {
            h(canvas);
        }
        f(canvas);
        c();
    }

    private void h(Canvas canvas) {
        List<hmc> list = this.s;
        if (list == null) {
            LogUtil.e("Suggestion_SugChart", "Excel null.");
            return;
        }
        for (hmc hmcVar : list) {
            if (hmcVar != null && hmcVar.l() > 0.0f) {
                PointF pointFB = hmcVar.b();
                this.an.setColor(this.u);
                canvas.drawCircle(pointFB.x, pointFB.y, this.aa, this.an);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                canvas.drawCircle(pointFB.x, pointFB.y, this.aa / 2.5f, paint);
            }
        }
    }

    private void c() {
        if (this.k.size() > 0) {
            this.ak = (this.ak + 1.0f) % 50.0f;
            postInvalidateDelayed(50L);
        }
    }

    private void f(Canvas canvas) {
        int i = this.am;
        if (i > -1) {
            if (njy.c(this.s, i)) {
                d(canvas, this.s.get(this.am));
            }
        } else if (njy.c(this.s, this.r.a())) {
            d(canvas, this.s.get(this.r.a()));
        }
    }

    private void a(Canvas canvas) {
        for (Path path : this.k) {
            this.m.setPathEffect(new DashPathEffect(new float[]{8.0f, 5.0f}, this.ak));
            canvas.drawPath(path, this.m);
        }
    }

    private void j() {
        this.ab.setColor(this.u);
        this.m.setColor(this.n);
    }

    private void c(Canvas canvas) {
        this.v = false;
        this.k.clear();
        for (int i = 0; i < this.ae.size(); i++) {
            Path path = this.ae.get(i);
            PathMeasure pathMeasure = new PathMeasure(path, false);
            float length = pathMeasure.getLength();
            float[] fArr = new float[2];
            pathMeasure.getPosTan(0.0f, fArr, null);
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(length, fArr2, null);
            if (length > 0.001f) {
                canvas.drawPath(path, this.ab);
                path.lineTo(fArr2[0], this.f);
                path.lineTo(fArr[0], this.f);
                path.close();
                Paint paint = this.t;
                float f = this.f;
                int[] iArr = this.aj;
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr[0], iArr[1], Shader.TileMode.CLAMP));
                canvas.drawPath(path, this.t);
            } else {
                fArr2[0] = fArr[0];
                fArr2[1] = fArr[1];
            }
            if (i < this.ae.size() - 1) {
                Path path2 = new Path();
                path2.moveTo(fArr2[0], fArr2[1]);
                new PathMeasure(this.ae.get(i + 1), false).getPosTan(0.0f, fArr, null);
                path2.lineTo(fArr[0], fArr[1]);
                this.k.add(path2);
            }
        }
    }

    private boolean d(Canvas canvas) {
        this.ae.clear();
        Path path = null;
        for (int i = 0; i < this.s.size(); i++) {
            if (!this.v) {
                path = new Path();
            }
            if (c(canvas, path, i)) {
                return true;
            }
        }
        return false;
    }

    private void b(Path path, int i, PointF pointF) {
        if (i == this.s.size() - 1 && this.v) {
            b(path, i, pointF, new PathMeasure(path, false));
            this.ae.add(path);
        }
    }

    private void b(Path path, int i, PointF pointF, PathMeasure pathMeasure) {
        if (i <= 0 || pathMeasure.getLength() >= 0.001f) {
            return;
        }
        path.lineTo(pointF.x, pointF.y + 0.001f);
    }

    private PointF b(Path path, int i, hmc hmcVar) {
        PointF pointFB = hmcVar.b();
        if (hmcVar.l() > 0.0f) {
            b(path, pointFB);
            return pointFB;
        }
        a(path, i);
        return pointFB;
    }

    private void a(Path path, int i) {
        if (!path.isEmpty()) {
            PathMeasure pathMeasure = new PathMeasure(path, false);
            if (i > 0 && pathMeasure.getLength() < 0.001f) {
                PointF pointFB = this.s.get(i - 1).b();
                path.lineTo(pointFB.x, pointFB.y + 0.001f);
            }
            this.ae.add(path);
        }
        this.v = false;
    }

    private void b(Path path, PointF pointF) {
        if (!this.v) {
            path.moveTo(pointF.x, pointF.y);
            this.v = true;
        } else {
            path.lineTo(pointF.x, pointF.y);
        }
    }

    private void e(Canvas canvas) {
        this.l.setColor(this.i);
        this.l.setStrokeWidth(2.0f);
        int i = this.ah;
        float f = this.f;
        canvas.drawLine(i, f, this.au - i, f, this.l);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.s.size() > 0) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.o.x = motionEvent.getX();
                this.o.y = motionEvent.getY();
            } else if (action == 1) {
                hiw.e(motionEvent, this.o, this.av, this.ad);
                this.am = a(new PointF(motionEvent.getX(), motionEvent.getY()));
                invalidate();
            }
        }
        return true;
    }

    public void d(OnHelperGestureListener onHelperGestureListener) {
        this.ad = onHelperGestureListener;
    }

    private int a(PointF pointF) {
        for (int i = 0; i < this.s.size(); i++) {
            hmc hmcVar = this.s.get(i);
            if (hiw.a(pointF, hmcVar, hmcVar.r())) {
                return i;
            }
        }
        return -1;
    }

    public void d(List<hmc> list) {
        if (njy.e(list)) {
            return;
        }
        this.p = 0.0f;
        this.y = true;
        this.v = false;
        this.am = 0;
        this.s.clear();
        this.r = list.get(0);
        this.aq = list.get(0);
        e(list);
        if (this.au > 0) {
            d();
            i();
        }
        postInvalidate();
    }

    private void e(List<hmc> list) {
        c(list);
        this.am = hiw.c(list);
        b(list);
    }

    private void b(List<hmc> list) {
        for (int i = 0; i < list.size(); i++) {
            hmc hmcVar = list.get(i);
            hmcVar.b(this.h);
            PointF pointFR = hmcVar.r();
            if (pointFR != null) {
                pointFR.x = (this.w * (i + 1)) + (this.h * i);
            }
            hmcVar.e(this.ac);
            this.s.add(hmcVar);
        }
    }

    private void c(List<hmc> list) {
        for (hmc hmcVar : list) {
            if (gzx.e(this.r, this.aq)) {
                this.r = hiw.e(hmcVar, this.r);
                this.aq = hiw.a(hmcVar, this.aq);
            }
        }
    }

    public void j(int i) {
        this.ac = i;
        this.u = i;
    }

    public void d(int... iArr) {
        Paint paint = this.ab;
        float f = this.f;
        int[] iArr2 = this.aj;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP));
    }

    public void b(int i) {
        this.g = i;
    }

    public void e(float f) {
        this.d = f;
        this.f9405c.setTextSize(f);
        i();
    }

    public void c(int i) {
        this.e = i;
        this.f9405c.setColor(i);
    }

    public void c(int... iArr) {
        this.aj = iArr;
    }

    public void e(int i) {
        this.x = false;
        this.q = i;
    }

    public void c(float f) {
        this.aa = f;
    }

    public void a(float f) {
        this.ab.setStrokeWidth(f);
        this.m.setStrokeWidth(f);
    }

    public void g(int i) {
        this.al = i;
    }

    public void f(int i) {
        this.af = i;
    }

    public void d(int i) {
        this.n = i;
        this.m.setColor(i);
    }

    public void a(int i) {
        this.i = i;
        this.l.setColor(i);
    }
}
