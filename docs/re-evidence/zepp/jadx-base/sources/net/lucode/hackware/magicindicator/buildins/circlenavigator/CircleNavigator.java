package net.lucode.hackware.magicindicator.buildins.circlenavigator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.UIUtil;

/* JADX INFO: loaded from: classes23.dex */
public class CircleNavigator extends View implements IPagerNavigator {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Interpolator g;
    private Paint h;
    private List<PointF> i;
    private float j;
    private boolean k;
    private OnCircleClickListener l;
    private float m;
    private float n;
    private int o;
    private boolean p;

    public interface OnCircleClickListener {
        void onClick(int i);
    }

    public CircleNavigator(Context context) {
        super(context);
        this.g = new LinearInterpolator();
        this.h = new Paint(1);
        this.i = new ArrayList();
        this.p = true;
        c(context);
    }

    private void a(Canvas canvas) {
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(this.c);
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.i.get(i);
            canvas.drawCircle(pointF.x, pointF.y, this.a, this.h);
        }
    }

    private void b(Canvas canvas) {
        this.h.setStyle(Paint.Style.FILL);
        if (this.i.size() > 0) {
            canvas.drawCircle(this.j, (int) ((getHeight() / 2.0f) + 0.5f), this.a, this.h);
        }
    }

    private void c(Context context) {
        this.o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.a = UIUtil.dip2px(context, 3.0d);
        this.d = UIUtil.dip2px(context, 8.0d);
        this.c = UIUtil.dip2px(context, 1.0d);
    }

    private int d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (this.a * 2) + (this.c * 2) + getPaddingTop() + getPaddingBottom();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private int e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = this.f;
            return (this.c * 2) + (this.a * i2 * 2) + ((i2 - 1) * this.d) + getPaddingLeft() + getPaddingRight();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private void f() {
        this.i.clear();
        if (this.f > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.a;
            int i2 = (i * 2) + this.d;
            int paddingLeft = i + ((int) ((this.c / 2.0f) + 0.5f)) + getPaddingLeft();
            for (int i3 = 0; i3 < this.f; i3++) {
                this.i.add(new PointF(paddingLeft, height));
                paddingLeft += i2;
            }
            this.j = this.i.get(this.e).x;
        }
    }

    public OnCircleClickListener getCircleClickListener() {
        return this.l;
    }

    public int getCircleColor() {
        return this.b;
    }

    public int getCircleCount() {
        return this.f;
    }

    public int getCircleSpacing() {
        return this.d;
    }

    public int getRadius() {
        return this.a;
    }

    public Interpolator getStartInterpolator() {
        return this.g;
    }

    public int getStrokeWidth() {
        return this.c;
    }

    public boolean isFollowTouch() {
        return this.p;
    }

    public boolean isTouchable() {
        return this.k;
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void notifyDataSetChanged() {
        f();
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onAttachToMagicIndicator() {
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onDetachFromMagicIndicator() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.h.setColor(this.b);
        a(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(e(i), d(i2));
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrollStateChanged(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageScrolled(int i, float f, int i2) {
        if (!this.p || this.i.isEmpty()) {
            return;
        }
        int iMin = Math.min(this.i.size() - 1, i);
        int iMin2 = Math.min(this.i.size() - 1, i + 1);
        PointF pointF = this.i.get(iMin);
        PointF pointF2 = this.i.get(iMin2);
        float f2 = pointF.x;
        this.j = f2 + ((pointF2.x - f2) * this.g.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        this.e = i;
        if (this.p) {
            return;
        }
        this.j = this.i.get(i).x;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.l != null && Math.abs(x - this.m) <= this.o && Math.abs(y - this.n) <= this.o) {
                float f = Float.MAX_VALUE;
                int i = 0;
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    float fAbs = Math.abs(this.i.get(i2).x - x);
                    if (fAbs < f) {
                        i = i2;
                        f = fAbs;
                    }
                }
                this.l.onClick(i);
            }
        } else if (this.k) {
            this.m = x;
            this.n = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OnCircleClickListener onCircleClickListener) {
        if (!this.k) {
            this.k = true;
        }
        this.l = onCircleClickListener;
    }

    public void setCircleColor(int i) {
        this.b = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f = i;
    }

    public void setCircleSpacing(int i) {
        this.d = i;
        f();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.p = z;
    }

    public void setRadius(int i) {
        this.a = i;
        f();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.g = interpolator;
        if (interpolator == null) {
            this.g = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.c = i;
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.k = z;
    }
}
