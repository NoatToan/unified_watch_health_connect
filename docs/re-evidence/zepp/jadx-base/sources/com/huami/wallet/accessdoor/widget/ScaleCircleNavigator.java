package com.huami.wallet.accessdoor.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.NavigatorHelper;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.ArgbEvaluatorHolder;
import net.lucode.hackware.magicindicator.buildins.UIUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ScaleCircleNavigator extends View implements IPagerNavigator, NavigatorHelper.OnNavigatorScrollListener {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Paint g;
    private List<PointF> h;
    private SparseArray<Float> i;
    private boolean j;
    private OnCircleClickListener k;
    private float l;
    private float m;
    private int n;
    private boolean o;
    private NavigatorHelper p;
    private Interpolator q;

    public interface OnCircleClickListener {
        void onClick(int i);
    }

    public ScaleCircleNavigator(Context context) {
        super(context);
        this.c = -3355444;
        this.d = -7829368;
        this.g = new Paint(1);
        this.h = new ArrayList();
        this.i = new SparseArray<>();
        this.o = true;
        this.p = new NavigatorHelper();
        this.q = new LinearInterpolator();
        a(context);
    }

    private void a(Context context) {
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = UIUtil.dip2px(context, 3.0d);
        this.b = UIUtil.dip2px(context, 5.0d);
        this.e = UIUtil.dip2px(context, 8.0d);
        this.p.setNavigatorScrollListener(this);
        this.p.setSkimOver(true);
    }

    private int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (this.b * 2) + getPaddingTop() + getPaddingBottom();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private int c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = this.f;
            return getPaddingRight() + ((i2 - 1) * this.a * 2) + (this.b * 2) + ((i2 - 1) * this.e) + getPaddingLeft();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private void d() {
        this.h.clear();
        if (this.f > 0) {
            int iRound = Math.round(getHeight() / 2.0f);
            int i = (this.a * 2) + this.e;
            int paddingLeft = this.b + getPaddingLeft();
            for (int i2 = 0; i2 < this.f; i2++) {
                this.h.add(new PointF(paddingLeft, iRound));
                paddingLeft += i;
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        d();
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onDeselected(int i, int i2) {
        if (this.o) {
            return;
        }
        this.i.put(i, Float.valueOf(this.a));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onDetachFromMagicIndicator() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.h.get(i);
            float fFloatValue = this.i.get(i, Float.valueOf(this.a)).floatValue();
            Paint paint = this.g;
            int i2 = this.a;
            paint.setColor(ArgbEvaluatorHolder.eval((fFloatValue - i2) / (this.b - i2), this.c, this.d));
            canvas.drawCircle(pointF.x, getHeight() / 2.0f, fFloatValue, this.g);
        }
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onEnter(int i, int i2, float f, boolean z) {
        if (this.o) {
            int i3 = this.a;
            this.i.put(i, Float.valueOf(i3 + ((this.b - i3) * this.q.getInterpolation(f))));
            invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d();
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onLeave(int i, int i2, float f, boolean z) {
        if (this.o) {
            int i3 = this.b;
            this.i.put(i, Float.valueOf(i3 + ((this.a - i3) * this.q.getInterpolation(f))));
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(c(i), b(i2));
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
        this.p.onPageScrollStateChanged(i);
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        this.p.onPageScrolled(i, f, i2);
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        this.p.onPageSelected(i);
    }

    @Override // net.lucode.hackware.magicindicator.NavigatorHelper.OnNavigatorScrollListener
    public void onSelected(int i, int i2) {
        if (this.o) {
            return;
        }
        this.i.put(i, Float.valueOf(this.b));
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.k != null && Math.abs(x - this.l) <= this.n && Math.abs(y - this.m) <= this.n) {
                float f = Float.MAX_VALUE;
                int i = 0;
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    float fAbs = Math.abs(this.h.get(i2).x - x);
                    if (fAbs < f) {
                        i = i2;
                        f = fAbs;
                    }
                }
                this.k.onClick(i);
            }
        } else if (this.j) {
            this.l = x;
            this.m = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OnCircleClickListener onCircleClickListener) {
        if (!this.j) {
            this.j = true;
        }
        this.k = onCircleClickListener;
    }

    public void setCircleCount(int i) {
        this.f = i;
        this.p.setTotalCount(i);
    }

    public void setCircleSpacing(int i) {
        this.e = i;
        d();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.o = z;
    }

    public void setMaxRadius(int i) {
        this.b = i;
        d();
        invalidate();
    }

    public void setMinRadius(int i) {
        this.a = i;
        d();
        invalidate();
    }

    public void setNormalCircleColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setSelectedCircleColor(int i) {
        this.d = i;
        invalidate();
    }

    public void setSkimOver(boolean z) {
        this.p.setSkimOver(z);
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.q = interpolator;
        if (interpolator == null) {
            this.q = new LinearInterpolator();
        }
    }

    public void setTouchable(boolean z) {
        this.j = z;
    }
}
