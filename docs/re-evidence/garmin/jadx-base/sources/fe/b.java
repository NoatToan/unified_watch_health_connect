package fe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes7.dex */
public class b extends androidx.viewpager.widget.a {
    public int A;
    public boolean B;
    public boolean C;
    public final int D;
    public boolean E;
    public float F;
    public float I;
    public final int P;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f70502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f70503r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f70504t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f70505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f70506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f70507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f70508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f70509z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ViewPager viewPager = b.this.f11320a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* JADX INFO: renamed from: fe.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC1447b implements View.OnClickListener {
        public ViewOnClickListenerC1447b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ViewPager viewPager = b.this.f11320a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f70508y = paint;
        this.f70509z = new Rect();
        this.A = 255;
        this.B = false;
        this.C = false;
        int i14 = this.f11333n;
        this.f70502q = i14;
        paint.setColor(i14);
        float f14 = context.getResources().getDisplayMetrics().density;
        this.f70503r = (int) ((3.0f * f14) + 0.5f);
        this.f70504t = (int) ((6.0f * f14) + 0.5f);
        this.f70505v = (int) (64.0f * f14);
        this.f70507x = (int) ((16.0f * f14) + 0.5f);
        this.D = (int) ((1.0f * f14) + 0.5f);
        this.f70506w = (int) ((f14 * 32.0f) + 0.5f);
        this.P = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f11321b.setFocusable(true);
        this.f11321b.setOnClickListener(new a());
        this.f11323d.setFocusable(true);
        this.f11323d.setOnClickListener(new ViewOnClickListenerC1447b());
        if (getBackground() == null) {
            this.B = true;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void c(int i14, float f14, boolean z14) {
        int height = getHeight();
        TextView textView = this.f11322c;
        int left = textView.getLeft();
        int i15 = this.f70507x;
        int right = textView.getRight() + i15;
        int i16 = height - this.f70503r;
        Rect rect = this.f70509z;
        rect.set(left - i15, i16, right, height);
        super.c(i14, f14, z14);
        this.A = (int) (Math.abs(f14 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i15, i16, textView.getRight() + i15, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.B;
    }

    @Override // androidx.viewpager.widget.a
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f70506w);
    }

    public int getTabIndicatorColor() {
        return this.f70502q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f11322c;
        int left = textView.getLeft();
        int i14 = this.f70507x;
        int i15 = left - i14;
        int right = textView.getRight() + i14;
        int i16 = height - this.f70503r;
        int i17 = (this.A << 24) | (this.f70502q & FlexItem.MAX_SIZE);
        Paint paint = this.f70508y;
        paint.setColor(i17);
        float f14 = height;
        canvas.drawRect(i15, i16, right, f14, paint);
        if (this.B) {
            paint.setColor((this.f70502q & FlexItem.MAX_SIZE) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.D, getWidth() - getPaddingRight(), f14, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.E) {
            return false;
        }
        float x14 = motionEvent.getX();
        float y14 = motionEvent.getY();
        if (action == 0) {
            this.F = x14;
            this.I = y14;
            this.E = false;
            return true;
        }
        if (action == 1) {
            TextView textView = this.f11322c;
            int left = textView.getLeft();
            int i14 = this.f70507x;
            if (x14 < left - i14) {
                ViewPager viewPager = this.f11320a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                return true;
            }
            if (x14 > textView.getRight() + i14) {
                ViewPager viewPager2 = this.f11320a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x14 - this.F);
            float f14 = this.P;
            if (fAbs > f14 || Math.abs(y14 - this.I) > f14) {
                this.E = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i14) {
        super.setBackgroundColor(i14);
        if (this.C) {
            return;
        }
        this.B = (i14 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.C) {
            return;
        }
        this.B = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i14) {
        super.setBackgroundResource(i14);
        if (this.C) {
            return;
        }
        this.B = i14 == 0;
    }

    public void setDrawFullUnderline(boolean z14) {
        this.B = z14;
        this.C = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i14, int i15, int i16, int i17) {
        int i18 = this.f70504t;
        if (i17 < i18) {
            i17 = i18;
        }
        super.setPadding(i14, i15, i16, i17);
    }

    public void setTabIndicatorColor(int i14) {
        this.f70502q = i14;
        this.f70508y.setColor(i14);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i14) {
        setTabIndicatorColor(a7.b.getColor(getContext(), i14));
    }

    @Override // androidx.viewpager.widget.a
    public void setTextSpacing(int i14) {
        int i15 = this.f70505v;
        if (i14 < i15) {
            i14 = i15;
        }
        super.setTextSpacing(i14);
    }

    public b(Context context) {
        this(context, null);
    }
}
