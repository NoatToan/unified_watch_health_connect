package com.huami.training.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.huami.training.ui.R;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.abs.IPagerNavigator;
import net.lucode.hackware.magicindicator.buildins.UIUtil;

/* JADX INFO: loaded from: classes15.dex */
public class BannerLineNavigator extends View implements IPagerNavigator {
    private int a;
    private int b;
    private Interpolator c;
    private Paint d;
    private List<PointF> e;
    private float f;
    private boolean g;
    private OnNavigatorClickListener h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    public int lineHeight;
    public int lineWidth;
    private OnNavigatorChangeListener m;
    public int rectRadius;
    public int selectedColor;
    public int spacing;
    public int totalCount;
    public int unSelectedColor;

    public interface OnNavigatorChangeListener {
        void onPageSelected(int i);
    }

    public interface OnNavigatorClickListener {
        void onClick(int i);
    }

    public BannerLineNavigator(Context context) {
        super(context);
        this.c = new LinearInterpolator();
        this.d = new Paint(1);
        this.e = new ArrayList();
        this.l = true;
        c(context);
    }

    private void a(Canvas canvas) {
        this.d.setColor(this.selectedColor);
        if (this.e.size() > 0) {
            float f = this.f - (this.rectRadius / 4);
            int height = (getHeight() / 2) - (this.lineHeight / 2);
            int i = this.rectRadius;
            RectF rectF = new RectF(f, height - (i / 4), this.f + this.lineWidth + (i / 4), (getHeight() / 2) + (this.lineHeight / 2) + (this.rectRadius / 4));
            int i2 = this.rectRadius;
            canvas.drawRoundRect(rectF, i2, i2, this.d);
        }
    }

    private void b(Canvas canvas) {
        this.d.setColor(this.unSelectedColor);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = this.e.get(i);
            RectF rectF = new RectF(pointF.x, (getHeight() / 2) - (this.lineHeight / 2), pointF.x + this.lineWidth, (getHeight() / 2) + (this.lineHeight / 2));
            int i2 = this.rectRadius;
            canvas.drawRoundRect(rectF, i2, i2, this.d);
        }
    }

    private void c(Context context) {
        this.k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.rectRadius = UIUtil.dip2px(context, 2.0d);
        this.spacing = UIUtil.dip2px(context, 5.0d);
        this.a = UIUtil.dip2px(context, 20.0d);
        this.lineHeight = UIUtil.dip2px(context, 2.0d);
        this.lineWidth = UIUtil.dip2px(context, 7.7d);
        this.lineWidth = UIUtil.dip2px(context, 7.7d);
        this.selectedColor = ContextCompat.getColor(context, R.color.tr_orange);
        this.unSelectedColor = ContextCompat.getColor(context, R.color.tr_white);
    }

    private int d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return this.lineHeight + (this.rectRadius * 4) + getPaddingTop() + getPaddingBottom();
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
            int i2 = this.totalCount;
            return this.spacing + (this.lineWidth * i2) + ((i2 - 1) * this.spacing) + getPaddingLeft() + getPaddingRight();
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private void f() {
        this.e.clear();
        if (this.totalCount > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.spacing;
            int paddingLeft = ((int) ((this.rectRadius / 2.0f) + 0.5f)) + getPaddingLeft();
            for (int i2 = 0; i2 < this.totalCount; i2++) {
                this.e.add(new PointF(paddingLeft, height));
                paddingLeft += this.lineWidth + i;
            }
            this.f = this.e.get(this.b).x;
            requestLayout();
        }
    }

    public int getCircleColor() {
        return this.selectedColor;
    }

    public int getCircleSpacing() {
        return this.spacing;
    }

    public OnNavigatorClickListener getNavigatorClickListener() {
        return this.h;
    }

    public int getRadius() {
        return this.rectRadius;
    }

    public Interpolator getStartInterpolator() {
        return this.c;
    }

    public int getStrokeWidth() {
        return this.a;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean isFollowTouch() {
        return this.l;
    }

    public boolean isTouchable() {
        return this.g;
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
        this.d.setStyle(Paint.Style.FILL);
        b(canvas);
        a(canvas);
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
        if (!this.l || this.e.isEmpty()) {
            return;
        }
        int iMin = Math.min(this.e.size() - 1, i);
        int iMin2 = Math.min(this.e.size() - 1, i + 1);
        PointF pointF = this.e.get(iMin);
        PointF pointF2 = this.e.get(iMin2);
        float f2 = pointF.x;
        this.f = f2 + ((pointF2.x - f2) * this.c.getInterpolation(f));
        invalidate();
    }

    @Override // net.lucode.hackware.magicindicator.abs.IPagerNavigator
    public void onPageSelected(int i) {
        this.b = i;
        OnNavigatorChangeListener onNavigatorChangeListener = this.m;
        if (onNavigatorChangeListener != null) {
            onNavigatorChangeListener.onPageSelected(i);
        }
        if (this.l) {
            return;
        }
        this.f = this.e.get(this.b).x;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.h != null && Math.abs(x - this.i) <= this.k && Math.abs(y - this.j) <= this.k) {
                float f = Float.MAX_VALUE;
                int i = 0;
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    float fAbs = Math.abs(this.e.get(i2).x - x);
                    if (fAbs < f) {
                        i = i2;
                        f = fAbs;
                    }
                }
                this.h.onClick(i);
            }
        } else if (this.g) {
            this.i = x;
            this.j = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFollowTouch(boolean z) {
        this.l = z;
    }

    public void setNavigatorChangeListener(OnNavigatorChangeListener onNavigatorChangeListener) {
        if (!this.g) {
            this.g = true;
        }
        this.m = onNavigatorChangeListener;
    }

    public void setNavigatorClickListener(OnNavigatorClickListener onNavigatorClickListener) {
        if (!this.g) {
            this.g = true;
        }
        this.h = onNavigatorClickListener;
    }

    public void setRadius(int i) {
        this.rectRadius = i;
        f();
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.selectedColor = i;
        invalidate();
    }

    public void setSpacing(int i) {
        this.spacing = i;
        f();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.c = interpolator;
        if (interpolator == null) {
            this.c = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.a = i;
        invalidate();
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setTouchable(boolean z) {
        this.g = z;
    }

    public void setUnSelectedColor(int i) {
        this.unSelectedColor = i;
        invalidate();
    }
}
