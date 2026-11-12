package com.xiaomi.hm.health.view.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes22.dex */
public class CirclePageIndicator extends View implements PageIndicator {
    private static final int s = -1;
    private float a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private ViewPager e;
    private ViewPager.OnPageChangeListener f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private float n;
    private int o;
    private float p;
    private int q;
    private boolean r;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.e == null || getCount() == 0) {
            return size;
        }
        int count = getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.a) + ((count - 1) * this.n) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public int getCount() {
        ViewPager viewPager = this.e;
        if (viewPager == null) {
            return 0;
        }
        return viewPager.getAdapter().getCount();
    }

    public int getFillColor() {
        return this.d.getColor();
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public int getOffset() {
        return 0;
    }

    public int getOrientation() {
        return this.k;
    }

    public int getPageColor() {
        return this.b.getColor();
    }

    public float getRadius() {
        return this.a;
    }

    public int getStrokeColor() {
        return this.c.getColor();
    }

    public float getStrokeWidth() {
        return this.c.getStrokeWidth();
    }

    public ViewPager getViewPager() {
        return this.e;
    }

    public boolean isCentered() {
        return this.l;
    }

    public boolean isSnap() {
        return this.m;
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public void notifyDataSetChanged() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.e == null || (count = getCount()) == 0) {
            return;
        }
        if (this.g < 0) {
            setCurrentItem(0);
        }
        if (this.g >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.k == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float strokeWidth = this.a;
        float f3 = paddingLeft + strokeWidth;
        float f4 = paddingTop + strokeWidth;
        if (this.l) {
            f4 += (((height - paddingTop) - paddingBottom) - ((int) ((((count * 2) * strokeWidth) + ((count - 1) * this.n)) + 1.0f))) / 2.0f;
        }
        if (this.c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f5 = (i * (this.n + (this.a * 2.0f))) + f4;
            if (this.k == 0) {
                f2 = f3;
            } else {
                f2 = f5;
                f5 = f3;
            }
            if (this.b.getAlpha() > 0) {
                canvas.drawCircle(f5, f2, strokeWidth, this.b);
            }
            float f6 = this.a;
            if (strokeWidth != f6) {
                canvas.drawCircle(f5, f2, f6, this.c);
            }
        }
        boolean z = this.m;
        int i2 = z ? this.h : this.g;
        float f7 = this.n;
        float f8 = this.a;
        float f9 = i2 * ((f8 * 2.0f) + f7);
        if (!z) {
            f9 += this.i * (f7 + (2.0f * f8));
        }
        if (this.k == 0) {
            float f10 = f4 + f9;
            f = f3;
            f3 = f10;
        } else {
            f = f4 + f9;
        }
        canvas.drawCircle(f3, f, f8, this.d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.k == 0) {
            setMeasuredDimension(a(i), b(i2));
        } else {
            setMeasuredDimension(b(i), a(i2));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.j = i;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.g = i - getOffset();
        this.i = f;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.m || this.j == 0) {
            this.g = i - getOffset();
            this.h = i - getOffset();
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.a;
        this.g = i;
        this.h = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.g;
        return savedState;
    }

    public void setCentered(boolean z) {
        this.l = z;
        invalidate();
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public void setCurrentItem(int i) {
        ViewPager viewPager = this.e;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(getOffset() + i);
        this.g = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f = onPageChangeListener;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.k = i;
        requestLayout();
    }

    public void setPageColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.c.setStrokeWidth(f);
        invalidate();
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.e = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.p = -1.0f;
        this.q = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CirclePageIndicator, i, 0);
        this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_centered, z);
        this.k = typedArrayObtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_pageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_strokeColor, color3));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_strokeWidth, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_fillColor, color2));
        this.a = typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_radius, dimension2);
        this.m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_snap, z2);
        this.n = typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_gap, 12.0f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.o = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    @Override // com.xiaomi.hm.health.view.indicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
