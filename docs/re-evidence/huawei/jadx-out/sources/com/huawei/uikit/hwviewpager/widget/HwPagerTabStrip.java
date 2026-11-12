package com.huawei.uikit.hwviewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes44.dex */
public class HwPagerTabStrip extends HwPagerTitleStrip {
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private float n;
    private int o;
    private final Paint p;
    private final Rect q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int w;

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwViewPager hwViewPager = HwPagerTabStrip.this.f29809a;
            hwViewPager.setCurrentItem(hwViewPager.getCurrentItem() - 1);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwViewPager hwViewPager = HwPagerTabStrip.this.f29809a;
            hwViewPager.setCurrentItem(hwViewPager.getCurrentItem() + 1);
        }
    }

    public HwPagerTabStrip(Context context) {
        this(context, null);
    }

    private void b() {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
    }

    private void e(float f, float f2) {
        if (this.f29809a.getPageScrollDirection() != 0) {
            if (f2 < this.e.getTop() - this.h) {
                HwViewPager hwViewPager = this.f29809a;
                hwViewPager.setCurrentItem(hwViewPager.getCurrentItem() - 1);
                return;
            } else {
                if (f2 > this.e.getBottom() + this.h) {
                    HwViewPager hwViewPager2 = this.f29809a;
                    hwViewPager2.setCurrentItem(hwViewPager2.getCurrentItem() + 1);
                    return;
                }
                return;
            }
        }
        boolean zIsRtlLayout = this.f29809a.isRtlLayout();
        if (f < this.e.getLeft() - this.h) {
            HwViewPager hwViewPager3 = this.f29809a;
            hwViewPager3.setCurrentItem(zIsRtlLayout ? hwViewPager3.getCurrentItem() + 1 : hwViewPager3.getCurrentItem() - 1);
        } else if (f > this.e.getRight() + this.h) {
            HwViewPager hwViewPager4 = this.f29809a;
            hwViewPager4.setCurrentItem(zIsRtlLayout ? hwViewPager4.getCurrentItem() - 1 : hwViewPager4.getCurrentItem() + 1);
        }
    }

    public boolean getDrawFullUnderline() {
        return this.r;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.l);
    }

    public int getTabIndicatorColor() {
        return this.w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        super.onDraw(canvas);
        HwViewPager hwViewPager = this.f29809a;
        boolean z = true;
        boolean zIsRtlLayout = false;
        if (hwViewPager != null) {
            z = hwViewPager.getPageScrollDirection() == 0;
            zIsRtlLayout = this.f29809a.isRtlLayout();
        }
        boolean z2 = z;
        boolean z3 = zIsRtlLayout;
        int height = getHeight();
        int bottom = z2 ? height : this.e.getBottom() + this.u;
        int left = this.e.getLeft();
        int i = this.h;
        int right = this.e.getRight();
        int i2 = this.h;
        int i3 = this.u;
        this.p.setColor((this.j << 24) | (this.w & ViewCompat.MEASURED_SIZE_MASK));
        canvas.drawRect(left - i, bottom - i3, right + i2, bottom, this.p);
        if (this.r) {
            this.p.setColor((this.w & ViewCompat.MEASURED_SIZE_MASK) | (-16777216));
            a(canvas, z2, z3, height);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0 && this.t) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.n = x;
            this.m = y;
            this.t = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.n) > this.i || Math.abs(y - this.m) > this.i)) {
                this.t = true;
            }
        } else if (this.f29809a != null) {
            e(x, y);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.s) {
            return;
        }
        this.r = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.s) {
            return;
        }
        this.r = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.s) {
            return;
        }
        this.r = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.r = z;
        this.s = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.k;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.w = i;
        this.p.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.o;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public HwPagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.p = paint;
        this.q = new Rect();
        this.j = 255;
        this.r = false;
        this.s = false;
        int i = this.d;
        this.w = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.u = (int) ((3.0f * f) + 0.5f);
        this.h = (int) ((16.0f * f) + 0.5f);
        this.g = (int) ((1.0f * f) + 0.5f);
        this.l = (int) ((32.0f * f) + 0.5f);
        this.k = (int) ((6.0f * f) + 0.5f);
        this.o = (int) (f * 64.0f);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        b();
        setWillNotDraw(false);
        this.f29811c.setFocusable(true);
        this.f29811c.setOnClickListener(new d());
        this.f29810b.setFocusable(true);
        this.f29810b.setOnClickListener(new e());
        if (getBackground() == null) {
            this.r = true;
        }
    }

    private void a(Canvas canvas, boolean z, boolean z2, int i) {
        if (z) {
            canvas.drawRect(getPaddingLeft(), i - this.g, getWidth() - getPaddingRight(), i, this.p);
        } else if (z2) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + this.g, i, this.p);
        } else {
            canvas.drawRect((getWidth() - getPaddingRight()) - this.g, getPaddingTop(), getWidth() - getPaddingRight(), i, this.p);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerTitleStrip
    void b(int i, float f, boolean z) {
        Rect rect = this.q;
        int height = getHeight();
        int left = this.e.getLeft();
        int i2 = this.h;
        int right = this.e.getRight();
        int i3 = this.h;
        int i4 = height - this.u;
        rect.set(left - i2, i4, right + i3, height);
        super.b(i, f, z);
        this.j = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.e.getLeft() - this.h, i4, this.e.getRight() + this.h, height);
        invalidate(rect);
    }
}
