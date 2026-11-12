package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.ni4;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public boolean A;
    public int B;
    public boolean C;
    public float D;
    public float E;
    public int F;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3111r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final Paint w;
    public final Rect x;
    public int y;
    public boolean z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3114a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f3114a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void d(int i, float f, boolean z) {
        Rect rect = this.x;
        int height = getHeight();
        int left = this.c.getLeft() - this.v;
        int right = this.c.getRight() + this.v;
        int i2 = height - this.f3111r;
        rect.set(left, i2, right, height);
        super.d(i, f, z);
        this.y = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.c.getLeft() - this.v, i2, this.c.getRight() + this.v, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.z;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.u);
    }

    public int getTabIndicatorColor() {
        return this.q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.c.getLeft() - this.v;
        int right = this.c.getRight() + this.v;
        int i = height - this.f3111r;
        this.w.setColor((this.y << 24) | (this.q & 16777215));
        float f = height;
        canvas.drawRect(left, i, right, f, this.w);
        if (this.z) {
            this.w.setColor((this.q & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.B, getWidth() - getPaddingRight(), f, this.w);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.C) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.D = x;
            this.E = y;
            this.C = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.D) > this.F || Math.abs(y - this.E) > this.F)) {
                this.C = true;
            }
        } else if (x < this.c.getLeft() - this.v) {
            ViewPager viewPager = this.f3114a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > this.c.getRight() + this.v) {
            ViewPager viewPager2 = this.f3114a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.A) {
            return;
        }
        this.z = (i & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.A) {
            return;
        }
        this.z = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.A) {
            return;
        }
        this.z = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.z = z;
        this.A = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.s;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.q = i;
        this.w.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(ni4.c(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        int i2 = this.t;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.w = paint;
        this.x = new Rect();
        this.y = 255;
        this.z = false;
        this.A = false;
        int i = this.n;
        this.q = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3111r = (int) ((3.0f * f) + 0.5f);
        this.s = (int) ((6.0f * f) + 0.5f);
        this.t = (int) (64.0f * f);
        this.v = (int) ((16.0f * f) + 0.5f);
        this.B = (int) ((1.0f * f) + 0.5f);
        this.u = (int) ((f * 32.0f) + 0.5f);
        this.F = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f3115b.setFocusable(true);
        this.f3115b.setOnClickListener(new a());
        this.d.setFocusable(true);
        this.d.setOnClickListener(new b());
        if (getBackground() == null) {
            this.z = true;
        }
    }
}
