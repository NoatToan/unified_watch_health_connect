package com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve.auxiliary.CurveColorControl;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jeu;
import defpackage.jex;
import defpackage.jez;
import defpackage.qrs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicCurve extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f10654a = {0.0f, 0.15f, 1.0f};
    private int[] aa;
    private ArrayList<LatLong> ab;
    private int[] ac;
    private int ad;
    private double ae;
    private int af;
    private double ag;
    private int ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f10655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f10656c;
    private Path d;
    private Paint e;
    private int f;
    private int g;
    private Paint h;
    private float i;
    private Paint j;
    private double k;
    private double l;
    private double m;
    private double n;
    private float[] o;
    private Paint p;
    private Paint q;
    private double r;
    private Path s;
    private int[] t;
    private CurveColorControl u;
    private int v;
    private boolean w;
    private int x;
    private boolean y;
    private int[] z;

    public DynamicCurve(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ab = null;
        this.o = null;
        this.s = null;
        this.q = null;
        this.p = null;
        this.d = null;
        this.f10656c = null;
        this.e = null;
        this.j = null;
        this.f10655b = null;
        this.h = null;
        this.af = 0;
        this.ah = 0;
        this.v = 0;
        this.f = 0;
        this.ad = 0;
        this.g = 0;
        this.x = 0;
        this.i = 0.0f;
        this.u = null;
        this.w = true;
        this.y = false;
        this.v = qrs.d(context, 1.0f);
        this.f = qrs.d(context, 3.5f);
        this.ad = qrs.d(context, 4.5f);
    }

    public DynamicCurve b(ReTrackSimplify reTrackSimplify, ArrayList<LatLong> arrayList) {
        if (reTrackSimplify == null || arrayList == null) {
            LogUtil.j("Track_DynamicCurve", "ReTrackData is null");
            return this;
        }
        this.ab = arrayList;
        this.n = ((Double) reTrackSimplify.getMaxMultiplexField().second).doubleValue();
        this.k = ((Double) reTrackSimplify.getMinMultiplexField().second).doubleValue();
        switch (reTrackSimplify.getCurveType()) {
            case 32:
                this.u = new jex();
                break;
            case 33:
                this.u = new jeu();
                break;
            case 34:
                this.u = new jez();
                break;
            case 35:
                this.u = new jex();
                break;
            default:
                this.u = new jex();
                break;
        }
        this.t = this.u.getInitFillingColor();
        this.aa = this.u.getRunCurveColor();
        this.ac = this.u.getRunFillingColor();
        this.z = this.u.getRunLineColor();
        this.w = true;
        invalidate();
        return this;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.af = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.ah = size;
        this.r = 0.0d;
        float f = size;
        float f2 = 0.5f * f;
        this.ag = this.ad + f2;
        this.l = f2;
        this.i = f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.af = getWidth();
            int height = getHeight();
            this.ah = height;
            this.r = 0.0d;
            float f = height;
            float f2 = 0.5f * f;
            this.ag = this.ad + f2;
            this.l = f2;
            this.i = f;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ab == null) {
            LogUtil.j("Track_DynamicCurve", "ReTrack Data is null");
            return;
        }
        e();
        c();
        d(canvas);
        a(this.g);
        c(canvas);
        a(canvas);
    }

    private void e() {
        double d = this.n;
        double d2 = this.k;
        if (d - d2 < 1.0E-6d) {
            this.k = d2 - 10.0d;
            this.n = d + 10.0d;
        }
        this.ae = (this.n - this.k) / this.l;
        this.m = (((double) this.af) - this.r) / ((double) (this.ab.size() - 1));
        int i = this.g;
        if (i == 0) {
            this.i = this.ah;
        }
        float multiplexField = (float) (this.ag - ((this.ab.get(i).getMultiplexField() - this.k) / this.ae));
        float f = this.i;
        if (multiplexField >= f) {
            multiplexField = f;
        }
        this.i = multiplexField;
    }

    private void c(Canvas canvas) {
        if (this.g > 0) {
            this.f10656c.setShader(new LinearGradient(0.0f, 0.0f, this.af, 0.0f, this.aa, f10654a, Shader.TileMode.CLAMP));
            canvas.drawLines(this.o, 0, this.g * 4, this.f10656c);
            int i = this.g;
            int i2 = i * 4;
            int i3 = i2 + 1;
            if (i == this.ab.size() - 1) {
                int i4 = this.g * 4;
                i2 = i4 - 2;
                i3 = i4 - 1;
            }
            if (this.y) {
                return;
            }
            this.j.setShader(new LinearGradient(0.0f, this.o[i3], 0.0f, this.ah, this.z, (float[]) null, Shader.TileMode.CLAMP));
            float[] fArr = this.o;
            float f = fArr[i2];
            canvas.drawLine(f, fArr[i3], f, this.ah, this.j);
            float[] fArr2 = this.o;
            canvas.drawCircle(fArr2[i2], fArr2[i3], this.ad, this.h);
            float[] fArr3 = this.o;
            canvas.drawCircle(fArr3[i2], fArr3[i3], this.f, this.f10655b);
        }
    }

    private void a(Canvas canvas) {
        if (this.g > 0) {
            Path path = new Path();
            path.addPath(this.d);
            path.lineTo((float) ((((double) this.g) * this.m) + this.r), this.ah);
            path.lineTo((float) this.r, this.ah);
            path.lineTo((float) this.r, (float) (this.ag - ((this.ab.get(0).getMultiplexField() - this.k) / this.ae)));
            this.e.setShader(new LinearGradient(0.0f, this.i, 0.0f, this.ah, this.ac, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawPath(path, this.e);
        }
    }

    private void a(int i) {
        double d = i;
        double d2 = this.m;
        double d3 = this.r;
        if (i == 0) {
            Path path = new Path();
            this.d = path;
            path.moveTo((float) ((d * d2) + d3), (float) (this.ag - ((this.ab.get(i).getMultiplexField() - this.k) / this.ae)));
        } else {
            int i2 = this.x;
            while (true) {
                i2++;
                if (i2 > i) {
                    break;
                }
                this.d.lineTo((float) ((((double) i2) * this.m) + this.r), (float) (this.ag - ((this.ab.get(i2).getMultiplexField() - this.k) / this.ae)));
            }
        }
        this.x = i;
    }

    private void c() {
        if (this.w) {
            this.w = false;
            Paint paint = new Paint();
            this.q = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.q.setStrokeWidth(this.v);
            this.q.setAntiAlias(true);
            this.q.setPathEffect(new CornerPathEffect(10.0f));
            this.q.setColor(this.u.getInitCurveColor());
            Paint paint2 = new Paint();
            this.p = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.p.setPathEffect(new CornerPathEffect(10.0f));
            this.p.setAntiAlias(true);
            this.p.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.t, (float[]) null, Shader.TileMode.CLAMP));
            Paint paint3 = new Paint();
            this.f10656c = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.f10656c.setStrokeWidth(this.v);
            this.f10656c.setAntiAlias(true);
            this.f10656c.setPathEffect(new CornerPathEffect(10.0f));
            Paint paint4 = new Paint();
            this.e = paint4;
            paint4.setStyle(Paint.Style.FILL);
            this.e.setAntiAlias(true);
            this.e.setPathEffect(new CornerPathEffect(10.0f));
            Paint paint5 = new Paint();
            this.j = paint5;
            paint5.setStyle(Paint.Style.STROKE);
            this.j.setStrokeWidth(this.v);
            this.j.setAntiAlias(true);
            Paint paint6 = new Paint();
            this.f10655b = paint6;
            paint6.setStyle(Paint.Style.FILL);
            this.f10655b.setAntiAlias(true);
            this.f10655b.setColor(this.u.getRunCircleColor());
            Paint paint7 = new Paint();
            this.h = paint7;
            paint7.setStyle(Paint.Style.FILL);
            this.h.setAntiAlias(true);
            this.h.setColor(this.u.getRunRingColor());
        }
    }

    private void d(Canvas canvas) {
        int i;
        if (this.s == null || this.o == null) {
            this.s = new Path();
            this.o = new float[(this.ab.size() - 1) * 4];
            int i2 = 0;
            for (int i3 = 0; i3 < this.ab.size(); i3++) {
                float f = (float) ((((double) i3) * this.m) + this.r);
                float multiplexField = (float) (this.ag - ((this.ab.get(i3).getMultiplexField() - this.k) / this.ae));
                if (i3 == 0) {
                    this.s.moveTo(f, multiplexField);
                    float[] fArr = this.o;
                    fArr[i2] = f;
                    i = i2 + 2;
                    fArr[i2 + 1] = multiplexField;
                } else if (i3 == this.ab.size() - 1) {
                    this.s.lineTo(f, multiplexField);
                    float[] fArr2 = this.o;
                    fArr2[i2] = f;
                    i = i2 + 2;
                    fArr2[i2 + 1] = multiplexField;
                } else {
                    this.s.lineTo(f, multiplexField);
                    float[] fArr3 = this.o;
                    fArr3[i2] = f;
                    fArr3[i2 + 1] = multiplexField;
                    fArr3[i2 + 2] = f;
                    i = i2 + 4;
                    fArr3[i2 + 3] = multiplexField;
                }
                i2 = i;
            }
        }
        canvas.drawLines(this.o, this.q);
        Path path = new Path();
        path.addPath(this.s);
        path.lineTo((float) ((((double) (this.ab.size() - 1)) * this.m) + this.r), this.ah);
        path.lineTo((float) this.r, this.ah);
        path.lineTo((float) this.r, (float) (this.ag - ((this.ab.get(0).getMultiplexField() - this.k) / this.ae)));
        canvas.drawPath(path, this.p);
    }

    public void c(int i) {
        if (i >= this.ab.size() - 1) {
            this.g = this.ab.size() - 1;
            this.y = true;
        } else {
            this.g = i;
        }
        postInvalidate();
    }

    public void d() {
        this.g = 0;
        this.x = 0;
        this.y = false;
        postInvalidate();
    }
}
