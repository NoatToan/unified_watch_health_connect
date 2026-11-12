package com.huawei.ui.commonui.ruler.circlescaleruler;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.ui.commonui.R;
import defpackage.qox;
import defpackage.qre;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CircleScaleRuler extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f23849a;
    private float aa;
    private int ab;
    private float ac;
    private float ad;
    private int ae;
    private int af;
    private float ag;
    private float ah;
    private float ai;
    private float aj;
    private final List<Integer> ak;
    private float al;
    private Paint am;
    private Paint an;
    private float ao;
    private float ap;
    private int aq;
    private int ar;
    private float as;
    private Rect at;
    private float au;
    private final List<String> av;
    private Path aw;
    private Paint ax;
    private float ay;
    private float az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23850b;
    private float ba;
    private RectF bb;
    private float bc;
    private Paint bd;
    private float be;
    private int bf;
    private RectF bg;
    private float bh;
    private float bi;
    private int bj;
    private String bk;
    private float bl;
    private Paint bm;
    private float bn;
    private Path bo;
    private Rect bp;
    private RectF bq;
    private float br;
    private float bs;
    private float bu;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23851c;
    private Drawable d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private PaintFlagsDrawFilter l;
    private int m;
    private Paint n;
    private float o;
    private int p;
    private int[] q;
    private float r;
    private int s;
    private float t;
    private Paint u;
    private float v;
    private RectF w;
    private float x;
    private float[] y;
    private float z;

    private float e(float f, float f2) {
        return (float) (((double) ((f / 2.0f) * 180.0f)) / (((double) f2) * 3.141592653589793d));
    }

    public CircleScaleRuler(Context context) {
        super(context);
        this.av = new ArrayList();
        this.ak = new ArrayList();
        this.bs = 1.0f;
        e(context, (AttributeSet) null);
    }

    public CircleScaleRuler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.av = new ArrayList();
        this.ak = new ArrayList();
        this.bs = 1.0f;
        e(context, attributeSet);
    }

    public CircleScaleRuler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.av = new ArrayList();
        this.ak = new ArrayList();
        this.bs = 1.0f;
        e(context, attributeSet);
    }

    private void e(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        Paint paint = new Paint();
        this.n = paint;
        a(paint, this.k, this.m);
        Paint paint2 = new Paint();
        this.u = paint2;
        d(paint2, this.z * this.bs);
        this.w = new RectF();
        Paint paint3 = new Paint();
        this.ax = paint3;
        b(paint3, this.ay, this.ar);
        this.bb = new RectF();
        this.at = new Rect();
        this.aw = new Path();
        Paint paint4 = new Paint();
        this.an = paint4;
        a(paint4, this.bc, this.af);
        Paint paint5 = new Paint();
        this.am = paint5;
        a(paint5, this.aj, this.ae);
        Paint paint6 = new Paint();
        this.bd = paint6;
        a(paint6, this.bu * this.bs, this.bf);
        this.bg = new RectF();
        Paint paint7 = new Paint();
        this.bm = paint7;
        b(paint7, this.bn, this.bj);
        this.bq = new RectF();
        this.bp = new Rect();
        this.bo = new Path();
        this.ad = this.t - this.aa;
        this.ba = this.ap - this.az;
        this.as = this.ah - this.ao;
        this.bi = this.be - this.bl;
        this.l = new PaintFlagsDrawFilter(0, 3);
        this.q = new int[]{this.ab, this.s, this.p};
        this.y = new float[]{this.ac, this.r, this.v};
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (context == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "initTypedArray context is null attributeSet", attributeSet);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleScaleRuler);
        if (typedArrayObtainStyledAttributes == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "initTypedArray typedArray is null context", context, " attributeSet ", attributeSet);
            return;
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleScaleRuler_isMini, true);
        this.m = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_miniCursorColor, qre.e(R.color.circle_scale_mini_cursor));
        this.k = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_miniCursorWidth, qre.a(R.dimen.health_common_2dp));
        this.o = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_miniCursorHeight, qre.a(R.dimen.health_common_10dp));
        this.d = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CircleScaleRuler_background);
        this.f23849a = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CircleScaleRuler_cursor);
        this.f23851c = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_cursorAngle, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_cursorRadius, qre.a(R.dimen.health_common_65dp));
        this.aa = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_outRingStartAngle, 195.0f);
        this.t = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_outRingEndAngle, 345.0f);
        this.x = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_outRingRadius, qre.a(R.dimen.health_common_109dp));
        this.z = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_outRingWidth, qre.a(R.dimen.health_common_8dp));
        this.ab = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_outRingStartColor, qre.e(R.color.circle_scale_ring_start));
        this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_outRingEndColor, qre.e(R.color.circle_scale_ring_end));
        this.s = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_outRingColor, qre.e(R.color.circle_scale_ring_center));
        this.ac = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_outRingStartColorProportion, 0.0f);
        this.v = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_outRingEndColorProportion, 1.0f);
        this.r = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_outRingColorProportion, 0.5f);
        this.az = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_rulerTextStartAngle, 200.0f);
        this.ap = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_rulerTextEndAngle, 340.0f);
        this.au = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerTextRadius, qre.a(R.dimen.health_common_94dp));
        this.ay = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerTextSize, qre.a(R.dimen.health_common_10dp));
        this.ar = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_rulerTextColor, qre.e(R.color.circle_scale_ruler_text));
        this.aq = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleScaleRuler_rulerCount, 35);
        this.ao = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_rulerStartAngle, 195.625f);
        this.ah = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_rulerEndAngle, 344.375f);
        this.al = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerRadius, qre.a(R.dimen.health_common_84dp));
        this.ag = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerHeight, qre.a(R.dimen.health_common_4_5dp));
        this.bc = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerWidth, qre.a(R.dimen.health_common_0_6dp));
        this.af = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_rulerColor, qre.e(R.color.circle_scale_ruler));
        this.ai = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerHighlightHeight, qre.a(R.dimen.health_common_4_5dp));
        this.aj = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_rulerHighlightWidth, qre.a(R.dimen.health_common_0_8dp));
        this.ae = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_rulerHighlightColor, qre.e(R.color.circle_scale_ruler_highlight));
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleScaleRuler_isScopeEdge, false);
        this.bl = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_scopeStartAngle, 270.0f);
        this.be = typedArrayObtainStyledAttributes.getFloat(R.styleable.CircleScaleRuler_scopeEndAngle, 270.0f);
        this.bh = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_scopeRadius, qre.a(R.dimen.health_common_86dp));
        this.bu = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_scopeWidth, qre.a(R.dimen.health_common_10dp));
        this.bf = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_scopeColor, qre.e(R.color.circle_scale_scope));
        this.br = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_scopeTextRadius, qre.a(R.dimen.health_common_68dp));
        this.bn = typedArrayObtainStyledAttributes.getDimension(R.styleable.CircleScaleRuler_scopeTextSize, qre.a(R.dimen.health_common_10dp));
        this.bj = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleScaleRuler_scopeTextColor, qre.e(R.color.circle_scale_scope_text));
        this.bk = typedArrayObtainStyledAttributes.getString(R.styleable.CircleScaleRuler_scopeText);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d(Paint paint, Paint.Style style) {
        paint.setAntiAlias(true);
        paint.setStyle(style);
    }

    private void d(Paint paint, float f) {
        d(paint, Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private void a(Paint paint, float f, int i) {
        d(paint, f);
        paint.setColor(i);
    }

    private void b(Paint paint, float f, int i) {
        d(paint, Paint.Style.FILL_AND_STROKE);
        paint.setTextSize(f);
        paint.setColor(i);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.j = getMeasuredWidth();
        this.f = getMeasuredHeight();
        canvas.setDrawFilter(this.l);
        if (this.h) {
            float f = this.j / 2.0f;
            d(canvas, f, this.f);
            b(canvas, f, this.f);
            return;
        }
        if (this.d == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "onDraw mBackground is null");
            return;
        }
        d(canvas);
        Rect bounds = this.d.getBounds();
        if (bounds == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "onDraw rect is null");
            return;
        }
        this.e = bounds.left + (bounds.width() / 2.0f);
        float f2 = bounds.bottom;
        this.f23850b = f2;
        d(canvas, this.e, f2);
        b(canvas);
        a(canvas);
        c(canvas);
        f(canvas);
        e(canvas);
    }

    private void b(Canvas canvas, float f, float f2) {
        double radians = Math.toRadians(this.f23851c + 270.0f);
        float f3 = this.o / 2.0f;
        float f4 = this.x * this.bs;
        double d = f;
        double d2 = f4 - f3;
        double d3 = f4 + f3;
        double d4 = f2;
        canvas.drawLine((float) ((Math.cos(radians) * d2) + d), (float) ((Math.sin(radians) * d2) + d4), (float) (d + (Math.cos(radians) * d3)), (float) (d4 + (Math.sin(radians) * d3)), this.n);
        canvas.save();
    }

    private void d(Canvas canvas) {
        float intrinsicWidth = this.d.getIntrinsicWidth();
        float intrinsicHeight = this.d.getIntrinsicHeight();
        if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
            ReleaseLogUtil.d("CircleScaleRuler", "drawBackground intrinsicWidth ", Float.valueOf(intrinsicWidth), " intrinsicHeight ", Float.valueOf(intrinsicHeight));
            return;
        }
        float fMin = Math.min(this.j / intrinsicWidth, this.f / intrinsicHeight);
        float f = (intrinsicWidth * fMin) / 2.0f;
        float f2 = (intrinsicHeight * fMin) / 2.0f;
        float f3 = this.j / 2.0f;
        float f4 = this.f / 2.0f;
        this.d.setBounds((int) (f3 - f), (int) (f4 - f2), (int) (f3 + f), (int) (f4 + f2));
        this.d.draw(canvas);
        canvas.save();
    }

    private void d(Canvas canvas, float f, float f2) {
        float f3 = this.x * this.bs;
        this.w.left = f - f3;
        this.w.top = f2 - f3;
        this.w.right = f + f3;
        this.w.bottom = f2 + f3;
        this.u.setShader(new LinearGradient(this.w.left, this.w.bottom, this.w.right, this.w.bottom, this.q, this.y, Shader.TileMode.CLAMP));
        canvas.drawArc(this.w, this.aa, this.ad, false, this.u);
        canvas.save();
    }

    private void b(Canvas canvas) {
        this.bb.left = this.e - this.au;
        this.bb.top = this.f23850b - this.au;
        this.bb.right = this.e + this.au;
        this.bb.bottom = this.f23850b + this.au;
        int size = this.av.size();
        for (int i = 0; i < size; i++) {
            String str = this.av.get(i);
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.d("CircleScaleRuler", "drawRulerText text ", str);
            } else {
                this.ax.getTextBounds(str, 0, str.length(), this.at);
                float fE = (this.az + (i * (this.ba / (size - 1)))) - e(this.at.width(), this.au - this.at.height());
                this.aw.reset();
                this.aw.addArc(this.bb, fE, 360.0f - fE);
                canvas.drawTextOnPath(str, this.aw, 0.0f, 0.0f, this.ax);
            }
        }
        canvas.save();
    }

    private void a(Canvas canvas) {
        float f;
        float f2;
        CircleScaleRuler circleScaleRuler;
        CircleScaleRuler circleScaleRuler2 = this;
        float f3 = circleScaleRuler2.al;
        float f4 = circleScaleRuler2.bs;
        float f5 = f3 * f4;
        float f6 = circleScaleRuler2.ag;
        float f7 = circleScaleRuler2.ai;
        float f8 = circleScaleRuler2.as / (circleScaleRuler2.aq - 1);
        int i = 0;
        while (i < circleScaleRuler2.aq) {
            double radians = Math.toRadians(circleScaleRuler2.ao + (i * f8));
            double d = f5;
            double dCos = ((double) circleScaleRuler2.e) + (Math.cos(radians) * d);
            double dSin = ((double) circleScaleRuler2.f23850b) + (Math.sin(radians) * d);
            if (circleScaleRuler2.ak.contains(Integer.valueOf(i))) {
                double d2 = (f7 * f4) + f5;
                f = f5;
                f2 = f4;
                canvas.drawLine((float) dCos, (float) dSin, (float) (((double) circleScaleRuler2.e) + (Math.cos(radians) * d2)), (float) (((double) circleScaleRuler2.f23850b) + (Math.sin(radians) * d2)), circleScaleRuler2.am);
                circleScaleRuler = circleScaleRuler2;
            } else {
                f = f5;
                f2 = f4;
                double d3 = (f6 * f2) + f;
                circleScaleRuler = this;
                canvas.drawLine((float) dCos, (float) dSin, (float) ((Math.cos(radians) * d3) + ((double) circleScaleRuler2.e)), (float) (((double) circleScaleRuler2.f23850b) + (Math.sin(radians) * d3)), circleScaleRuler.an);
            }
            i++;
            circleScaleRuler2 = circleScaleRuler;
            f7 = f7;
            f8 = f8;
            f4 = f2;
            f5 = f;
        }
        canvas.save();
    }

    private void c(Canvas canvas) {
        float f = this.bi;
        if (f <= 0.0f) {
            ReleaseLogUtil.d("CircleScaleRuler", "drawScope mScopeSweepAngle ", Float.valueOf(f));
            return;
        }
        float f2 = this.bh * this.bs;
        this.bg.left = this.e - f2;
        this.bg.top = this.f23850b - f2;
        this.bg.right = this.e + f2;
        this.bg.bottom = this.f23850b + f2;
        float fE = this.i ? e(this.bu * this.bs, f2) : 0.0f;
        canvas.drawArc(this.bg, this.bl + fE, this.bi - (fE * 2.0f), false, this.bd);
        canvas.save();
    }

    private void f(Canvas canvas) {
        if (TextUtils.isEmpty(this.bk)) {
            ReleaseLogUtil.d("CircleScaleRuler", "drawScopeText mScopeText ", this.bk);
            return;
        }
        this.bq.left = this.e - this.br;
        this.bq.top = this.f23850b - this.br;
        this.bq.right = this.e + this.br;
        this.bq.bottom = this.f23850b + this.br;
        Paint paint = this.bm;
        String str = this.bk;
        paint.getTextBounds(str, 0, str.length(), this.bp);
        float fE = (this.bl + (this.bi / 2.0f)) - e(this.bp.width(), this.br - this.bp.height());
        this.bo.reset();
        this.bo.addArc(this.bq, fE, 360.0f - fE);
        canvas.drawTextOnPath(this.bk, this.bo, 0.0f, 0.0f, this.bm);
        canvas.save();
    }

    private void e(Canvas canvas) {
        Drawable drawable = this.f23849a;
        if (drawable == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "drawCursor mCursor is null");
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.f23849a.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            ReleaseLogUtil.d("CircleScaleRuler", "drawCursor intrinsicWidth ", Integer.valueOf(intrinsicWidth), " intrinsicHeight ", Integer.valueOf(intrinsicHeight));
            return;
        }
        this.f23849a.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float f = intrinsicWidth / 2.0f;
        float f2 = intrinsicHeight;
        canvas.translate(this.e - f, this.f23850b - f2);
        canvas.rotate(this.f23851c, f, f2);
        canvas.translate(0.0f, -(this.g * this.bs));
        this.f23849a.draw(canvas);
        canvas.restore();
        canvas.save();
    }

    public void setCircleScaleRulerData(qox qoxVar) {
        if (qoxVar == null) {
            ReleaseLogUtil.d("CircleScaleRuler", "setCircleScaleRulerData circleScaleRulerData is null");
            return;
        }
        float fL = qoxVar.l();
        if (fL > 0.0f) {
            this.bs = fL;
            d(this.u, this.z * fL);
            a(this.bd, this.bu * this.bs, this.bf);
        }
        boolean zM = qoxVar.m();
        this.h = zM;
        if (zM) {
            int iE = qre.e(qoxVar.e());
            this.m = iE;
            a(this.n, this.k, iE);
        } else {
            this.bl = qoxVar.k();
            float fH = qoxVar.h();
            this.be = fH;
            this.bi = fH - this.bl;
            this.bk = qoxVar.o();
            this.av.clear();
            this.av.addAll(qoxVar.f());
            this.ak.clear();
            this.ak.addAll(qoxVar.i());
            Drawable drawableC = qoxVar.c();
            if (drawableC == null) {
                ReleaseLogUtil.d("CircleScaleRuler", "setCircleScaleRulerData background is null");
            } else {
                this.d = drawableC;
            }
            Drawable drawableA = qoxVar.a();
            if (drawableA == null) {
                ReleaseLogUtil.d("CircleScaleRuler", "setCircleScaleRulerData cursor is null");
            } else {
                this.f23849a = drawableA;
            }
        }
        this.ab = qre.e(qoxVar.j());
        this.s = qre.e(qoxVar.d());
        int iE2 = qre.e(qoxVar.g());
        this.p = iE2;
        this.q = new int[]{this.ab, this.s, iE2};
        this.f23851c = qoxVar.b();
        invalidate();
    }
}
