package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class TrackSimpleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11359c;
    private Bitmap d;
    private boolean e;
    private float f;
    private Paint g;
    private int h;
    private int i;
    private float j;
    private float k;
    private List<PointF> l;
    private Path m;
    private Paint n;
    private Path o;
    private int p;
    private float q;
    private int r;
    private Paint s;
    private int t;
    private int w;

    public TrackSimpleView(Context context) {
        super(context);
        this.f = 5.0f;
        this.h = 0;
        b();
    }

    public TrackSimpleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 5.0f;
        this.h = 0;
        b();
    }

    private void b() {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(this.f);
        this.g.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = new Paint(1);
        this.n = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(this.f);
        Paint paint3 = new Paint(1);
        this.s = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.s.setColor(0);
        this.s.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.i = -1;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e();
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
        if (this.l.isEmpty() || canvas == null) {
            return;
        }
        if (this.d == null) {
            this.d = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f11357a = new Canvas(this.d);
            c();
        }
        canvas.drawBitmap(this.d, 0.0f, 0.0f, (Paint) null);
    }

    private void c() {
        if (njy.e(this.l)) {
            LogUtil.j("Track_TrackSimpleView", "CollectionUtils.isEmpty(mPoints)");
            return;
        }
        this.n.setColor(this.i);
        this.g.setColor(this.i);
        float fA = a(this.l.get(0).x);
        float fB = b(this.l.get(0).y);
        List<PointF> list = this.l;
        float fA2 = a(list.get(list.size() - 1).x);
        List<PointF> list2 = this.l;
        float fB2 = b(list2.get(list2.size() - 1).y);
        this.f11357a.drawPath(this.m, this.g);
        this.f11357a.drawCircle(fA, fB, this.f * 1.5f, this.n);
        this.f11357a.drawCircle(fA, fB, this.f * 1.0f, this.s);
        this.f11357a.drawPath(this.o, this.g);
        this.f11357a.drawCircle(fA2, fB2, this.f * 1.5f, this.n);
        this.f11357a.drawCircle(fA2, fB2, this.f * 1.0f, this.s);
    }

    private void e() {
        List<PointF> list;
        if (getWidth() == 0 || (list = this.l) == null || list.isEmpty()) {
            return;
        }
        d();
        Path path = this.m;
        if (path == null) {
            this.m = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.o;
        if (path2 == null) {
            this.o = new Path();
        } else {
            path2.reset();
        }
        a();
    }

    private void a() {
        boolean z = false;
        PointF pointF = this.l.get(0);
        float fA = a(pointF.x);
        float fB = b(pointF.y);
        this.m.moveTo(fA, fB);
        for (PointF pointF2 : this.l) {
            float fA2 = a(pointF2.x);
            float fB2 = b(pointF2.y);
            if (z) {
                this.o.lineTo(fA2, fB2);
            } else {
                float fAbs = Math.abs(fA - fA2);
                float fAbs2 = Math.abs(fB - fB2);
                if (Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2)) > this.f * 1.5f) {
                    this.m.lineTo(fA2, fB2);
                    this.o.moveTo(fA2, fB2);
                    z = true;
                } else {
                    this.m.lineTo(fA2, fB2);
                }
            }
        }
    }

    private float b(float f) {
        if (this.e) {
            int i = this.h;
            if (i == 1 || i == 2 || i == 3) {
                return this.r;
            }
            int i2 = this.w;
            return i2 + ((this.r - i2) / 2.0f);
        }
        int i3 = this.r;
        float f2 = i3;
        float f3 = i3 - this.w;
        float f4 = this.q;
        return f2 - ((f3 * (f - f4)) / (this.f11358b - f4));
    }

    private float a(float f) {
        int i;
        if (this.f11359c) {
            int i2 = this.h;
            if (i2 == 2) {
                i = this.p;
            } else if (i2 == 3) {
                i = this.t;
            } else {
                int i3 = this.p;
                return i3 + ((this.t - i3) / 2.0f);
            }
            return i;
        }
        int i4 = this.p;
        float f2 = i4;
        float f3 = this.t - i4;
        float f4 = this.j;
        return f2 + ((f3 * (f - f4)) / (this.k - f4));
    }

    private void d() {
        PointF pointF = this.l.get(0);
        this.j = pointF.x;
        this.k = pointF.x;
        this.q = pointF.y;
        this.f11358b = pointF.y;
        for (PointF pointF2 : this.l) {
            if (pointF2.x < this.j) {
                this.j = pointF2.x;
            } else if (pointF2.x > this.k) {
                this.k = pointF2.x;
            } else {
                LogUtil.a("Track_TrackSimpleView", "mLeft and mRight is normal");
            }
            if (pointF2.y < this.q) {
                this.q = pointF2.y;
            } else if (pointF2.y > this.f11358b) {
                this.f11358b = pointF2.y;
            } else {
                LogUtil.a("Track_TrackSimpleView", "mTop and mBottom is normal");
            }
        }
        this.f11359c = ((double) Math.abs(this.j - this.k)) < 1.0E-6d;
        this.e = ((double) Math.abs(this.q - this.f11358b)) < 1.0E-6d;
        float f = this.k - this.j;
        float f2 = this.f11358b - this.q;
        if (f > f2) {
            d((f - f2) / 2.0f);
        } else {
            c((f2 - f) / 2.0f);
        }
        this.p = getPaddingLeft();
        this.t = getWidth() - getPaddingRight();
        this.w = getPaddingTop();
        this.r = getHeight() - getPaddingBottom();
    }

    private void c(float f) {
        int i = this.h;
        if (i == 2) {
            this.k += f * 2.0f;
        } else if (i == 3) {
            this.j -= f * 2.0f;
        } else {
            this.k += f;
            this.j -= f;
        }
    }

    private void d(float f) {
        int i = this.h;
        if (i == 1 || i == 2 || i == 3) {
            this.f11358b += f * 2.0f;
        } else {
            this.f11358b += f;
            this.q -= f;
        }
    }
}
