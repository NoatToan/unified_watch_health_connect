package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jpg;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes42.dex */
public class MarkTrackSimpleView extends View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[][] f22648c = {new float[]{0.0f, 1.0f}, new float[]{0.0f, -1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, -1.0f}, new float[]{1.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{1.0f, -1.0f}, new float[]{-2.0f, 0.0f}, new float[]{2.0f, 0.0f}, new float[]{0.0f, -2.0f}, new float[]{0.0f, 2.0f}, new float[]{-2.0f, -2.0f}, new float[]{2.0f, 2.0f}, new float[]{-2.0f, 2.0f}, new float[]{2.0f, -2.0f}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<e> f22649a;
    private double aa;
    private double ab;
    private int ac;
    private Set<e> ad;
    private int af;
    private int ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Canvas f22650b;
    private double d;
    private Context e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private List<String> k;
    private List<jpg> l;
    private double m;
    private Paint n;
    private int o;
    private Paint p;
    private Paint q;
    private int r;
    private int s;
    private Paint t;
    private int u;
    private List<jpg> v;
    private float w;
    private Path x;
    private Path y;
    private int z;

    public MarkTrackSimpleView(Context context) {
        super(context);
        this.w = 5.0f;
        this.k = new ArrayList();
        this.f22649a = new HashSet();
        this.ad = new HashSet();
        this.s = 0;
        this.e = context;
        a();
    }

    public MarkTrackSimpleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = 5.0f;
        this.k = new ArrayList();
        this.f22649a = new HashSet();
        this.ad = new HashSet();
        this.s = 0;
        this.e = context;
        a();
    }

    private void a() {
        Paint paint = new Paint(1);
        this.t = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.t.setStrokeWidth(this.w);
        this.t.setStrokeJoin(Paint.Join.ROUND);
        this.t.setAntiAlias(true);
        this.t.setPathEffect(new CornerPathEffect(15.0f));
        Paint paint2 = new Paint(1);
        this.n = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.n.setColor(-16777216);
        this.n.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.q = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.q.setAntiAlias(true);
        Paint paint4 = new Paint(1);
        this.p = paint4;
        paint4.setColor(-16777216);
        this.p.setTextSize(qrs.d(this.e, 10.0f));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
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
        LogUtil.a("Track_MarkTrackSimpleView", "TrackSimpleView onDraw enter.");
        if (njy.e(this.v) || canvas == null) {
            return;
        }
        this.f22650b = canvas;
        d();
    }

    private void d() {
        if (njy.b(this.v)) {
            this.p.setColor(this.r);
            this.n.setColor(this.o);
            this.q.setColor(this.u);
            this.t.setColor(this.u);
            float fB = b(this.v.get(0).f38787a);
            float fE = e(this.v.get(0).d);
            List<jpg> list = this.v;
            float fB2 = b(list.get(list.size() - 1).f38787a);
            List<jpg> list2 = this.v;
            float fE2 = e(list2.get(list2.size() - 1).d);
            this.f22650b.drawPath(this.y, this.t);
            this.f22650b.drawPath(this.x, this.t);
            this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 6.0f), this.q);
            this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 4.0f), this.n);
            c(this.f22650b, fB2, fE2, this.q, qrs.d(this.e, 13.0f));
            c(this.f22650b, fB2, fE2, this.n, qrs.d(this.e, 7.0f));
            if (UnitUtil.f()) {
                return;
            }
            e(this.f22650b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    private void e(Canvas canvas) {
        if (njy.e(this.l) || njy.e(this.k)) {
            return;
        }
        this.ad.clear();
        for (int size = this.l.size() - 1; size >= 0; size--) {
            jpg jpgVar = this.l.get(size);
            float fB = b(jpgVar.f38787a);
            float fE = e(jpgVar.d);
            List<jpg> list = this.v;
            if (list.get(list.size() - 1).d == jpgVar.d) {
                List<jpg> list2 = this.v;
                if (list2.get(list2.size() - 1).f38787a == jpgVar.f38787a) {
                    e(canvas, fB, fE, this.k.get(size), true);
                } else {
                    this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 5.0f), this.q);
                    this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 3.0f), this.n);
                    b(fB, fE, qrs.d(this.e, 5.0f));
                    e(canvas, fB, fE, this.k.get(size), false);
                }
            } else {
                this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 5.0f), this.q);
                this.f22650b.drawCircle(fB, fE, qrs.d(this.e, 3.0f), this.n);
                b(fB, fE, qrs.d(this.e, 5.0f));
                e(canvas, fB, fE, this.k.get(size), false);
            }
        }
    }

    private void b(float f, float f2, float f3) {
        for (int i = 0; i < 5; i++) {
            double radians = (float) Math.toRadians(i * 72);
            c((((float) Math.cos(radians)) * f3) + f, (((float) Math.sin(radians)) * f3) + f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2 A[LOOP:0: B:6:0x0046->B:26:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[SYNTHETIC] */
    private void e(Canvas canvas, float f, float f2, String str, boolean z) {
        float f3;
        float f4;
        float f5;
        int iD = qrs.d(this.e, 4.0f);
        int iD2 = qrs.d(this.e, 5.0f);
        if (z) {
            iD = qrs.d(this.e, 10.0f);
            iD2 = qrs.d(this.e, 13.0f);
        }
        Rect rect = new Rect();
        boolean z2 = false;
        this.p.getTextBounds(str, 0, str.length(), rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f6 = iD;
        float f7 = f - f6;
        float f8 = f2 - f6;
        float[][] fArr = f22648c;
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float[] fArr2 = fArr[i];
            float f9 = fArr2[0];
            if (f9 < 0.0f) {
                f3 = ((f - iD2) + (f9 * f6)) - iWidth;
            } else {
                f3 = f9 == 0.0f ? f - (iWidth / 2.0f) : f + iD2 + (f9 * f6);
            }
            float f10 = fArr2[1];
            if (f10 < 0.0f) {
                f4 = f2 - iD2;
            } else {
                if (f10 == 0.0f) {
                    f5 = f2 + (iHeight / 2.0f);
                } else {
                    f4 = f2 + iD2;
                }
                if (!b(f3, f5, iWidth, iHeight)) {
                    LogUtil.a("Track_MarkTrackSimpleView", "drawTextForMarkPoints text:", str, " strategy[0]:", Float.valueOf(fArr2[0]), " strategy[1]:", Float.valueOf(fArr2[1]));
                    f8 = f5;
                    f7 = f3;
                    z2 = true;
                    break;
                }
                i++;
                f8 = f5;
                f7 = f3;
            }
            f5 = f4 + (f10 * f6);
            if (!b(f3, f5, iWidth, iHeight)) {
                LogUtil.a("Track_MarkTrackSimpleView", "drawTextForMarkPoints text:", str, " strategy[0]:", Float.valueOf(fArr2[0]), " strategy[1]:", Float.valueOf(fArr2[1]));
                f8 = f5;
                f7 = f3;
                z2 = true;
                break;
            }
            i++;
            f8 = f5;
            f7 = f3;
        }
        if (!z2) {
            LogUtil.a("Track_MarkTrackSimpleView", "drawTextForMarkPoints not fount.text：", str);
            return;
        }
        canvas.drawText(str, f7, f8, this.p);
        float f11 = iHeight;
        float f12 = f8 - f11;
        e(f7, f12);
        float f13 = iWidth;
        float f14 = f7 + f13;
        e(f14, f12);
        e((f13 / 2.0f) + f7, f8 - (f11 / 2.0f));
        e(f7, f8);
        e(f14, f8);
    }

    private boolean b(float f, float f2, int i, int i2) {
        if (njy.e(this.f22649a) && njy.e(this.ad)) {
            return false;
        }
        return b(f, f2, i, i2, this.f22649a) || b(f, f2, i, i2, this.ad);
    }

    private boolean b(float f, float f2, int i, int i2, Set<e> set) {
        if (njy.e(set)) {
            return false;
        }
        for (e eVar : set) {
            if (eVar.f22652b >= f && eVar.f22652b <= i + f && eVar.f22651a >= f2 - i2 && eVar.f22651a <= f2) {
                return true;
            }
        }
        return false;
    }

    private void c(Canvas canvas, float f, float f2, Paint paint, float f3) {
        MarkTrackSimpleView markTrackSimpleView = this;
        float f4 = f3;
        Path path = new Path();
        float f5 = 0.38f * f4;
        int i = 0;
        while (i < 5) {
            double d = f;
            double d2 = f4;
            float f6 = (i * 1.2566371f) - 1.5707964f;
            double d3 = f6;
            float fCos = (float) ((Math.cos(d3) * d2) + d);
            double d4 = f2;
            float fSin = (float) ((d2 * Math.sin(d3)) + d4);
            double d5 = f5;
            double d6 = f6 + 0.62831855f;
            float fCos2 = (float) (d + (Math.cos(d6) * d5));
            float fSin2 = (float) (d4 + (d5 * Math.sin(d6)));
            if (i == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
            path.lineTo(fCos2, fSin2);
            c(fCos, fSin);
            c(fCos2, fSin2);
            i++;
            markTrackSimpleView = this;
            f4 = f3;
        }
        path.close();
        canvas.drawPath(path, paint);
    }

    private void e(float f, float f2) {
        Set<e> set = this.ad;
        if (set != null) {
            set.add(new e(f, f2));
        }
    }

    private void c(float f, float f2) {
        Set<e> set = this.f22649a;
        if (set != null) {
            set.add(new e(f, f2));
        }
    }

    private void b() {
        List<jpg> list;
        LogUtil.a("Track_MarkTrackSimpleView", "TrackSimpleView preDraw enter.");
        if (getWidth() == 0 || (list = this.v) == null || list.isEmpty()) {
            return;
        }
        e();
        Path path = this.y;
        if (path == null) {
            this.y = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.x;
        if (path2 == null) {
            this.x = new Path();
        } else {
            path2.reset();
        }
        c();
    }

    private void c() {
        boolean z = false;
        jpg jpgVar = this.v.get(0);
        float fB = b(jpgVar.f38787a);
        float fE = e(jpgVar.d);
        c(fB, fE);
        this.y.moveTo(fB, fE);
        for (jpg jpgVar2 : this.v) {
            float fB2 = b(jpgVar2.f38787a);
            float fE2 = e(jpgVar2.d);
            if (z) {
                this.x.lineTo(fB2, fE2);
            } else {
                float fAbs = Math.abs(fB - fB2);
                float fAbs2 = Math.abs(fE - fE2);
                if (Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2)) > this.w * 1.5f) {
                    this.y.lineTo(fB2, fE2);
                    this.x.moveTo(fB2, fE2);
                    z = true;
                } else {
                    this.y.lineTo(fB2, fE2);
                }
            }
            c(fB2, fE2);
        }
    }

    private float e(double d) {
        if (this.i) {
            int i = this.s;
            if (i == 1 || i == 2 || i == 3) {
                return this.ac;
            }
            int i2 = this.ah;
            return i2 + ((this.ac - i2) / 2.0f);
        }
        int i3 = this.ac;
        double d2 = i3;
        double d3 = i3 - this.ah;
        double d4 = this.aa;
        return (float) (d2 - ((d3 * (d - d4)) / (this.d - d4)));
    }

    private float b(double d) {
        if (this.f) {
            int i = this.s;
            if (i == 2) {
                return this.z;
            }
            if (i == 3) {
                return this.af;
            }
            int i2 = this.z;
            return i2 + ((this.af - i2) / 2.0f);
        }
        int i3 = this.z;
        double d2 = this.af - i3;
        double d3 = this.m;
        return (float) (((double) i3) + ((d2 * (d - d3)) / (this.ab - d3)));
    }

    private void e() {
        jpg jpgVar = this.v.get(0);
        this.m = jpgVar.f38787a;
        this.ab = jpgVar.f38787a;
        this.aa = jpgVar.d;
        this.d = jpgVar.d;
        for (jpg jpgVar2 : this.v) {
            if (jpgVar2.f38787a < this.m) {
                this.m = jpgVar2.f38787a;
            } else if (jpgVar2.f38787a > this.ab) {
                this.ab = jpgVar2.f38787a;
            } else {
                LogUtil.a("Track_MarkTrackSimpleView", "mLeft and mRight is normal");
            }
            if (jpgVar2.d < this.aa) {
                this.aa = jpgVar2.d;
            } else if (jpgVar2.d > this.d) {
                this.d = jpgVar2.d;
            } else {
                LogUtil.a("Track_MarkTrackSimpleView", "mTop and mBottom is normal");
            }
        }
        this.f = Math.abs(this.m - this.ab) < 1.0E-6d;
        this.i = Math.abs(this.aa - this.d) < 1.0E-6d;
        double d = this.ab - this.m;
        double d2 = this.d - this.aa;
        if (d > d2) {
            d((float) ((d - d2) / 2.0d));
        } else {
            c((float) ((d2 - d) / 2.0d));
        }
        this.z = getPaddingStart();
        this.af = getWidth() - getPaddingEnd();
        this.ah = getPaddingTop();
        this.ac = getHeight() - getPaddingBottom();
    }

    private void c(float f) {
        int i = this.s;
        if (i == 2) {
            this.ab += (double) (f * 2.0f);
        } else {
            if (i == 3) {
                this.m -= (double) (f * 2.0f);
                return;
            }
            double d = f;
            this.ab += d;
            this.m -= d;
        }
    }

    private void d(float f) {
        int i = this.s;
        if (i == 1 || i == 2 || i == 3) {
            this.d += (double) (f * 2.0f);
            return;
        }
        double d = f;
        this.d += d;
        this.aa -= d;
    }

    public void b(List<jpg> list, List<jpg> list2, List<String> list3, int i) {
        if (njy.e(list)) {
            return;
        }
        this.s = i;
        this.k = list3;
        this.v = list;
        this.l = list2;
        b();
        invalidate();
    }

    public void setTrackColor(int i, int i2, int i3) {
        this.u = i;
        this.o = i2;
        this.r = i3;
        if (i == this.g && i2 == this.h && i3 == this.j) {
            return;
        }
        this.g = i;
        this.h = i2;
        this.j = i3;
        invalidate();
    }

    public void a(float f) {
        this.w = f;
        this.t.setStrokeWidth(f);
    }

    public List<jpg> getPoints() {
        return this.v;
    }

    public int getPaintColor() {
        return this.u;
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f22651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f22652b;

        public e(float f, float f2) {
            this.f22652b = f;
            this.f22651a = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(eVar.f22652b, this.f22652b) == 0 && Float.compare(eVar.f22651a, this.f22651a) == 0;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f22652b), Float.valueOf(this.f22651a));
        }
    }
}
