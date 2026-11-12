package com.huawei.ui.commonui.scrollview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.Scroller;
import androidx.core.view.GestureDetectorCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.njy;
import defpackage.pao;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ScrollScaleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23877a = Color.rgb(251, 101, 34);
    private Paint aa;
    private int ab;
    private float ac;
    private int ad;
    private Scroller af;
    private int ag;
    private int ah;
    private int ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f23879c;
    private Context d;
    private int e;
    private boolean f;
    private List<String> g;
    private GestureDetectorCompat h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private float p;
    private float q;
    private int r;
    private int s;
    private boolean t;
    private OnSelectedListener u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface OnSelectedListener {
        void onSelected(List<String> list, int i);
    }

    public ScrollScaleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollScaleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = true;
        this.z = 24;
        int i2 = f23877a;
        this.ag = i2;
        this.e = i2;
        this.ah = 10;
        this.m = true;
        this.f = true;
        this.t = true;
        this.y = -1;
        this.ad = 10;
        this.k = true;
        this.d = context;
        this.j = context.getResources().getColor(R.color.scale_unselected_color);
        Paint paint = new Paint(1);
        this.aa = paint;
        paint.setStyle(Paint.Style.FILL);
        this.aa.setColor(-16777216);
        this.h = new GestureDetectorCompat(getContext(), new e());
        this.af = new Scroller(getContext());
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 40; i3++) {
            arrayList.add(Integer.toString(i3));
        }
        d(arrayList, 5, 40);
        this.f = false;
        this.i = true;
    }

    public void setCustomStartColor(int i) {
        this.e = i;
        this.ag = i;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i = this.ah / 2;
        int i2 = this.ai / 2;
        int i3 = 1;
        while (i3 <= i + 1 && i3 <= i2) {
            int i4 = this.f23879c;
            int i5 = i4 - i3;
            int i6 = i5 < 0 ? (this.ai + i4) - i3 : i5;
            if (this.f || i5 >= 0) {
                b(canvas, i6, -i3, 0, true);
            }
            int i7 = this.f23879c;
            int i8 = this.ai;
            int i9 = i7 + i3;
            int i10 = i9 >= i8 ? i9 - i8 : i9;
            if (this.f) {
                b(canvas, i10, i3, 0, true);
            } else if (i9 < i8) {
                b(canvas, i10, i3, 0, true);
            }
            i3++;
        }
        int i11 = this.f23879c;
        if (i11 - 3 > 0) {
            b(canvas, i11, -3, 1, false);
        }
        int i12 = this.f23879c;
        if (i12 - 2 > 0) {
            b(canvas, i12, -2, 2, false);
        }
        int i13 = this.f23879c;
        if (i13 - 1 > 0) {
            b(canvas, i13, -1, 3, false);
        }
        b(canvas, this.f23879c, 0, 4, true);
        int i14 = this.f23879c;
        if (i14 + 1 < this.ai) {
            b(canvas, i14, 1, 3, false);
        }
        int i15 = this.f23879c;
        if (i15 + 2 < this.ai) {
            b(canvas, i15, 2, 2, false);
        }
        int i16 = this.f23879c;
        if (i16 + 3 < this.ai) {
            b(canvas, i16, 3, 1, false);
        }
    }

    public void setNoScroll(boolean z) {
        this.t = z;
        if (z) {
            int color = this.e;
            if (color == 0) {
                color = this.d.getResources().getColor(R.color.scale_selected_color);
            }
            this.ag = color;
        } else {
            this.ag = -7829368;
        }
        invalidate();
    }

    private void b(Canvas canvas, int i, int i2, int i3, boolean z) {
        this.aa.setTextAlign(Paint.Align.CENTER);
        this.aa.setTextSize(this.z);
        int i4 = this.f23878b;
        int i5 = this.r;
        float f = i4 + (i2 * i5) + (i5 / 2);
        float f2 = this.ac;
        e(i2);
        e(canvas, f + f2, i3, i, z);
    }

    private void e(Canvas canvas, float f, int i, int i2, boolean z) {
        if (i == 0) {
            a(canvas, f);
        } else if (i == 1) {
            d(canvas, f, 5, 32);
        } else if (i == 2) {
            d(canvas, f, 6, 30);
        } else if (i == 3) {
            d(canvas, f, 7, 28);
        } else if (i == 4) {
            d(canvas, f, 10, 25);
        }
        if (i2 % this.ad == 0 && z) {
            Context context = BaseApplication.getContext();
            this.aa.setTextSize(pao.e(context, 11.0f));
            int i3 = this.ad;
            if (i3 <= 0) {
                return;
            }
            int i4 = i2 / i3;
            if (this.k && njy.c(this.g, i4)) {
                canvas.drawText(this.g.get(i4), f, pao.e(context, 23.0f), this.aa);
            }
        }
    }

    private void a(Canvas canvas, float f) {
        Context context = BaseApplication.getContext();
        int iE = pao.e(context, 1.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(iE);
        paint.setColor(this.j);
        int i = (int) f;
        int i2 = iE / 2;
        Point point = new Point(i, pao.e(context, 33.0f) + i2);
        Point point2 = new Point(i, pao.e(context, 43.0f) - i2);
        canvas.drawLine(point.x, point.y, point2.x, point2.y, paint);
    }

    private void d(Canvas canvas, float f, int i, int i2) {
        Context context = BaseApplication.getContext();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.ag);
        paint.setStrokeWidth(i);
        int i3 = i / 2;
        int i4 = (int) f;
        Point point = new Point(i4, pao.e(context, i2) + i3);
        Point point2 = new Point(i4, pao.e(context, 43.0f) - i3);
        float f2 = i3;
        canvas.drawCircle(point.x, point.y, f2, paint);
        canvas.drawCircle(point2.x, point2.y, f2, paint);
        canvas.drawLine(point.x, point.y, point2.x, point2.y, paint);
    }

    private void e(int i) {
        int iA = this.j;
        if (i == -1 || i == 1) {
            if ((i != -1 || this.ac >= 0.0f) && (i != 1 || this.ac <= 0.0f)) {
                iA = a(this.ag, this.j, (this.r - Math.abs(this.ac)) / this.r);
            }
        } else if (i == 0) {
            iA = a(this.ag, this.j, Math.abs(this.ac) / this.r);
        }
        this.aa.setColor(iA);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ab = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.x = measuredHeight;
        int i3 = this.ah;
        this.s = measuredHeight / i3;
        int i4 = this.ab / i3;
        this.r = i4;
        this.f23878b = (i3 / 2) * i4;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.h.onTouchEvent(motionEvent);
        if (!this.t) {
            return false;
        }
        boolean z = this.k;
        this.k = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d(motionEvent, !z);
        } else if (actionMasked == 1) {
            if (this.l) {
                this.q = motionEvent.getX();
            } else {
                this.p = motionEvent.getY();
            }
            e();
        } else if (actionMasked == 2) {
            if (this.l) {
                if (Math.abs(motionEvent.getX() - this.q) < 0.1f) {
                    return true;
                }
                this.ac += motionEvent.getX() - this.q;
                this.q = motionEvent.getX();
            } else {
                if (Math.abs(motionEvent.getY() - this.p) < 0.1f) {
                    return true;
                }
                this.ac += motionEvent.getY() - this.p;
                this.p = motionEvent.getY();
            }
            a();
            invalidate();
        }
        return true;
    }

    private void d(MotionEvent motionEvent, boolean z) {
        ViewParent parent;
        if (this.i && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        d();
        if (this.l) {
            this.q = motionEvent.getX();
        } else {
            this.p = motionEvent.getY();
        }
        if (z) {
            this.y = -1;
            b();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.af.computeScrollOffset()) {
            if (this.l) {
                this.ac = (this.ac + this.af.getCurrX()) - this.v;
                this.v = this.af.getCurrX();
            } else {
                this.ac = (this.ac + this.af.getCurrY()) - this.w;
                this.w = this.af.getCurrY();
            }
            a();
            invalidate();
            return;
        }
        if (this.n) {
            this.n = false;
            e();
        } else if (this.o) {
            this.o = false;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.n = false;
        this.o = false;
        this.af.abortAnimation();
    }

    private void a() {
        int i;
        if (this.l) {
            i = this.r;
        } else {
            i = this.s;
        }
        float f = this.ac;
        float f2 = i;
        if (f >= f2) {
            int i2 = this.f23879c - 1;
            this.f23879c = i2;
            if (i2 < 0) {
                if (this.f) {
                    this.f23879c = this.ai - 1;
                    this.ac = 0.0f;
                } else {
                    this.f23879c = 0;
                    this.ac = f2;
                    c();
                }
            } else {
                this.ac = 0.0f;
            }
        } else {
            float f3 = -i;
            if (f <= f3) {
                int i3 = this.f23879c + 1;
                this.f23879c = i3;
                int i4 = this.ai;
                if (i3 >= i4) {
                    if (this.f) {
                        this.f23879c = 0;
                        this.ac = 0.0f;
                    } else {
                        this.f23879c = i4 - 1;
                        this.ac = f3;
                        c();
                    }
                } else {
                    this.ac = 0.0f;
                }
            }
        }
        b();
    }

    private void c() {
        if (this.n) {
            this.af.forceFinished(true);
        }
        if (this.o) {
            d(this.ac, 0);
        }
    }

    private void e() {
        int i;
        if (!this.af.isFinished() || this.n) {
            return;
        }
        d();
        if (this.l) {
            i = this.r;
        } else {
            i = this.s;
        }
        LogUtil.a("ScrollScaleView", "value", Integer.toString(i));
        float f = this.ac;
        if (f > 0.0f) {
            if (f < ((float) (((double) i) / 2.0d))) {
                d(f, 0);
                return;
            } else {
                d(f, i);
                return;
            }
        }
        if ((-f) < ((float) (((double) i) / 2.0d))) {
            d(f, 0);
        } else {
            d(f, -i);
        }
    }

    private void d(float f, int i) {
        if (this.l) {
            int i2 = (int) f;
            this.v = i2;
            this.o = true;
            this.af.startScroll(i2, 0, 0, 0);
            this.af.setFinalX(i);
            invalidate();
            return;
        }
        int i3 = (int) f;
        this.w = i3;
        this.o = true;
        this.af.startScroll(0, i3, 0, 0);
        this.af.setFinalY(i);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f, float f2) {
        if (this.l) {
            int i = (int) f;
            this.v = i;
            this.n = true;
            int i2 = this.r;
            this.af.fling(i, 0, (int) f2, 0, i2 * (-1000), i2 * 1000, 0, 0);
            invalidate();
            return;
        }
        int i3 = (int) f;
        this.w = i3;
        this.n = true;
        int i4 = this.s;
        this.af.fling(0, i3, 0, (int) f2, 0, 0, i4 * (-10), i4 * 10);
        invalidate();
    }

    private void b() {
        int i = this.y;
        int i2 = this.f23879c;
        if (i == i2) {
            return;
        }
        this.y = i2;
        if (this.u != null) {
            if (LanguageUtil.ba(this.d)) {
                this.u.onSelected(this.g, ((this.g.size() - 1) * this.ad) - this.f23879c);
                return;
            }
            this.u.onSelected(this.g, this.f23879c);
        }
    }

    /* JADX INFO: loaded from: classes43.dex */
    class e extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!ScrollScaleView.this.m) {
                return true;
            }
            ScrollScaleView.this.d();
            if (ScrollScaleView.this.l) {
                ScrollScaleView scrollScaleView = ScrollScaleView.this;
                scrollScaleView.e(scrollScaleView.ac, f);
                return true;
            }
            ScrollScaleView scrollScaleView2 = ScrollScaleView.this;
            scrollScaleView2.e(scrollScaleView2.ac, f2);
            return true;
        }
    }

    private void d(List<String> list, int i, int i2) {
        if (list == null) {
            this.g = new ArrayList();
        }
        LogUtil.a("ScrollScaleView", "ratio = ", Integer.valueOf(i), "; avaliablecount=", Integer.valueOf(i2));
        if (!LanguageUtil.ba(this.d)) {
            LogUtil.a("ScrollScaleView", "is not RT language");
            this.g = list;
        } else if (list != null) {
            this.g = b(list);
        }
        this.ad = i;
        List<String> list2 = this.g;
        if (list2 == null || list2.size() == 0) {
            this.g = new ArrayList();
            this.ai = 0;
        } else {
            this.ai = ((this.g.size() - 1) * i) + 1;
        }
        LogUtil.a("ScrollScaleView", "mSumScale==", Integer.valueOf(this.ai));
        this.ah = i2;
        if (i2 < 0) {
            this.ah = 0;
        }
        invalidate();
    }

    public void setData(List<String> list, int i, int i2) {
        if (list == null) {
            this.g = new ArrayList();
        }
        if (!LanguageUtil.ba(this.d)) {
            this.g = list;
        } else if (list != null) {
            this.g = b(list);
        }
        this.ad = i;
        List<String> list2 = this.g;
        if (list2 == null || list2.size() == 0) {
            this.g = new ArrayList();
            this.ai = 0;
        } else {
            this.ai = ((this.g.size() - 1) * i) + 1;
        }
        this.ah = i2;
        if (i2 < 0) {
            this.ah = 0;
        }
        invalidate();
    }

    private List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayList.add(list.get(size));
        }
        return arrayList;
    }

    public void setSelectedPosition(int i) {
        if (LanguageUtil.ba(this.d)) {
            i = ((this.g.size() - 1) * this.ad) - i;
        }
        if (i < 0 || i > this.ai - 1 || i == this.f23879c) {
            return;
        }
        this.f23879c = i;
        invalidate();
        b();
    }

    public void setOnSelectedListener(OnSelectedListener onSelectedListener) {
        this.u = onSelectedListener;
    }

    private int a(int i, int i2, float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.argb(Math.round(Color.alpha(i) + ((Color.alpha(i2) - Color.alpha(i)) * f)), Math.round(Color.red(i) + ((Color.red(i2) - Color.red(i)) * f)), Math.round(Color.green(i) + ((Color.green(i2) - Color.green(i)) * f)), Math.round(Color.blue(i) + ((Color.blue(i2) - Color.blue(i)) * f)));
    }

    public void setIsShowText(boolean z) {
        this.k = z;
    }

    public boolean getIsShowText() {
        return this.k;
    }

    public int getSumScale() {
        return this.ai;
    }
}
