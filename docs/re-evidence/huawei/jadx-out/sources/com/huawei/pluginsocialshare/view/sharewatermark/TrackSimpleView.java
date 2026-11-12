package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jpg;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class TrackSimpleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Canvas f22691c;
    private Bitmap d;
    private double e;
    private double f;
    private Paint g;
    private boolean h;
    private int i;
    private boolean j;
    private List<jpg> k;
    private float l;
    private int m;
    private Path n;
    private Path o;
    private Paint p;
    private Paint q;
    private Paint r;
    private double s;
    private double t;
    private int u;
    private int v;
    private int w;
    private int y;

    public TrackSimpleView(Context context) {
        super(context);
        this.l = 5.0f;
        this.i = 0;
        d();
    }

    public TrackSimpleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 5.0f;
        this.i = 0;
        d();
    }

    public void e(int i) {
        this.m = i;
        if (i != this.f22690b && this.d != null) {
            this.f22691c.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.p);
            e();
            invalidate();
        }
        this.f22690b = this.m;
    }

    public void a(float f) {
        this.l = f;
        this.g.setStrokeWidth(f);
        this.q.setStrokeWidth(this.l);
    }

    private void d() {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(this.l);
        this.g.setStrokeJoin(Paint.Join.ROUND);
        this.g.setAntiAlias(true);
        this.g.setPathEffect(new CornerPathEffect(15.0f));
        Paint paint2 = new Paint(1);
        this.q = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.q.setStrokeWidth(this.l);
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.r.setStrokeWidth(this.l);
        Paint paint4 = new Paint(1);
        this.p = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.p.setColor(0);
        this.p.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.m = -1;
        this.f22690b = -1;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        LogUtil.a("Track_TrackSimpleView", "TrackSimpleView onDraw enter.");
        if (njy.e(this.k) || canvas == null) {
            return;
        }
        if (this.d == null) {
            this.d = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f22691c = new Canvas(this.d);
            e();
        }
        canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
    }

    private void e() {
        if (njy.b(this.k)) {
            this.q.setColor(this.m);
            this.g.setColor(this.m);
            float fD = d(this.k.get(0).f38787a);
            float fC = c(this.k.get(0).d);
            List<jpg> list = this.k;
            float fD2 = d(list.get(list.size() - 1).f38787a);
            List<jpg> list2 = this.k;
            float fC2 = c(list2.get(list2.size() - 1).d);
            this.f22691c.drawPath(this.o, this.g);
            this.f22691c.drawPath(this.n, this.g);
            this.f22691c.drawCircle(fD, fC, this.l * 1.0f, this.p);
            this.f22691c.drawCircle(fD2, fC2, this.l * 1.0f, this.p);
            int i = this.f22689a;
            if (i != 0) {
                this.r.setColor(i);
                this.f22691c.drawCircle(fD, fC, this.l * 1.5f, this.r);
                this.f22691c.drawCircle(fD2, fC2, this.l * 1.5f, this.r);
            }
            this.f22691c.drawCircle(fD, fC, this.l * 1.5f, this.q);
            this.f22691c.drawCircle(fD2, fC2, this.l * 1.5f, this.q);
        }
    }

    private void a() {
        List<jpg> list;
        LogUtil.a("Track_TrackSimpleView", "TrackSimpleView preDraw enter.");
        if (getWidth() == 0 || (list = this.k) == null || list.isEmpty()) {
            return;
        }
        b();
        Path path = this.o;
        if (path == null) {
            this.o = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.n;
        if (path2 == null) {
            this.n = new Path();
        } else {
            path2.reset();
        }
        c();
    }

    private void c() {
        boolean z = false;
        jpg jpgVar = this.k.get(0);
        float fD = d(jpgVar.f38787a);
        float fC = c(jpgVar.d);
        this.o.moveTo(fD, fC);
        for (jpg jpgVar2 : this.k) {
            float fD2 = d(jpgVar2.f38787a);
            float fC2 = c(jpgVar2.d);
            if (z) {
                this.n.lineTo(fD2, fC2);
            } else {
                float fAbs = Math.abs(fD - fD2);
                float fAbs2 = Math.abs(fC - fC2);
                if (Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2)) > this.l * 1.5f) {
                    this.o.lineTo(fD2, fC2);
                    this.n.moveTo(fD2, fC2);
                    z = true;
                } else {
                    this.o.lineTo(fD2, fC2);
                }
            }
        }
    }

    private float c(double d) {
        if (this.j) {
            int i = this.i;
            if (i == 1 || i == 2 || i == 3) {
                return this.u;
            }
            int i2 = this.v;
            return i2 + ((this.u - i2) / 2.0f);
        }
        int i3 = this.u;
        double d2 = i3;
        double d3 = i3 - this.v;
        double d4 = this.s;
        return (float) (d2 - ((d3 * (d - d4)) / (this.e - d4)));
    }

    private float d(double d) {
        if (this.h) {
            int i = this.i;
            if (i == 2) {
                return this.w;
            }
            if (i == 3) {
                return this.y;
            }
            int i2 = this.w;
            return i2 + ((this.y - i2) / 2.0f);
        }
        int i3 = this.w;
        double d2 = this.y - i3;
        double d3 = this.f;
        return (float) (((double) i3) + ((d2 * (d - d3)) / (this.t - d3)));
    }

    private void b() {
        jpg jpgVar = this.k.get(0);
        this.f = jpgVar.f38787a;
        this.t = jpgVar.f38787a;
        this.s = jpgVar.d;
        this.e = jpgVar.d;
        for (jpg jpgVar2 : this.k) {
            if (jpgVar2.f38787a < this.f) {
                this.f = jpgVar2.f38787a;
            } else if (jpgVar2.f38787a > this.t) {
                this.t = jpgVar2.f38787a;
            } else {
                LogUtil.a("Track_TrackSimpleView", "mLeft and mRight is normal");
            }
            if (jpgVar2.d < this.s) {
                this.s = jpgVar2.d;
            } else if (jpgVar2.d > this.e) {
                this.e = jpgVar2.d;
            } else {
                LogUtil.a("Track_TrackSimpleView", "mTop and mBottom is normal");
            }
        }
        this.h = Math.abs(this.f - this.t) < 1.0E-6d;
        this.j = Math.abs(this.s - this.e) < 1.0E-6d;
        double d = this.t - this.f;
        double d2 = this.e - this.s;
        if (d > d2) {
            d((float) ((d - d2) / 2.0d));
        } else {
            e((float) ((d2 - d) / 2.0d));
        }
        this.w = getPaddingLeft();
        this.y = getWidth() - getPaddingRight();
        this.v = getPaddingTop();
        this.u = getHeight() - getPaddingBottom();
    }

    private void e(float f) {
        int i = this.i;
        if (i == 2) {
            this.t += (double) (f * 2.0f);
        } else {
            if (i == 3) {
                this.f -= (double) (f * 2.0f);
                return;
            }
            double d = f;
            this.t += d;
            this.f -= d;
        }
    }

    private void d(float f) {
        int i = this.i;
        if (i == 1 || i == 2 || i == 3) {
            this.e += (double) (f * 2.0f);
            return;
        }
        double d = f;
        this.e += d;
        this.s -= d;
    }

    private void d(List<jpg> list) {
        if (njy.e(list)) {
            return;
        }
        this.k = list;
        a();
        invalidate();
    }

    public void e(List<jpg> list, int i) {
        this.i = i;
        d(list);
    }

    public List<jpg> getPoints() {
        return this.k;
    }

    public int getPaintColor() {
        return this.m;
    }

    public void c(int i) {
        this.f22689a = i;
    }
}
