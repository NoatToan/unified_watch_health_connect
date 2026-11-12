package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import r22.j1;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class CirclePageIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f54849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f54850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f54851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f54852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f54853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewPager.j f54854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f54857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f54862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f54863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54865q;

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        Paint paint = new Paint(1);
        this.f54850b = paint;
        Paint paint2 = new Paint(1);
        this.f54851c = paint2;
        Paint paint3 = new Paint(1);
        this.f54852d = paint3;
        this.f54863o = -1.0f;
        this.f54864p = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = context.getColor(R.color.default_circle_indicator_page_color);
        int color2 = context.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = context.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z14 = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z15 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149699a, i14, 0);
        this.f54860l = typedArrayObtainStyledAttributes.getBoolean(5, z14);
        this.f54859k = typedArrayObtainStyledAttributes.getInt(1, integer);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(12, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(15, color3));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(16, dimension));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(8, color2));
        this.f54849a = typedArrayObtainStyledAttributes.getDimension(13, dimension2);
        this.f54861m = typedArrayObtainStyledAttributes.getBoolean(14, z15);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f54862n = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public final int a(int i14) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode == 1073741824 || (viewPager = this.f54853e) == null) {
            return size;
        }
        int f44034e = viewPager.getAdapter().getF44034e();
        float paddingRight = getPaddingRight() + getPaddingLeft();
        float f14 = this.f54849a;
        int i15 = (int) (((f44034e - 1) * f14) + (f44034e * 2 * f14) + paddingRight + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i15, size) : i15;
    }

    public final int b(int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f54849a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f54852d.getColor();
    }

    public int getOrientation() {
        return this.f54859k;
    }

    public int getPageColor() {
        return this.f54850b.getColor();
    }

    public float getRadius() {
        return this.f54849a;
    }

    public int getStrokeColor() {
        return this.f54851c.getColor();
    }

    public float getStrokeWidth() {
        return this.f54851c.getStrokeWidth();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int f44034e;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f14;
        float f15;
        super.onDraw(canvas);
        ViewPager viewPager = this.f54853e;
        if (viewPager == null || (f44034e = viewPager.getAdapter().getF44034e()) == 0) {
            return;
        }
        if (this.f54855g >= f44034e) {
            setCurrentItem(f44034e - 1);
            return;
        }
        if (this.f54859k == 0) {
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
        float strokeWidth = this.f54849a;
        float f16 = 3.0f * strokeWidth;
        float f17 = paddingLeft + strokeWidth;
        float f18 = paddingTop + strokeWidth;
        if (this.f54860l) {
            f18 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((f44034e * f16) / 2.0f);
        }
        Paint paint = this.f54851c;
        if (paint.getStrokeWidth() > 0.0f) {
            strokeWidth -= paint.getStrokeWidth() / 2.0f;
        }
        for (int i14 = 0; i14 < f44034e; i14++) {
            float f19 = (i14 * f16) + f18;
            if (this.f54859k == 0) {
                f15 = f17;
            } else {
                f15 = f19;
                f19 = f17;
            }
            Paint paint2 = this.f54850b;
            if (paint2.getAlpha() > 0) {
                canvas.drawCircle(f19, f15, strokeWidth, paint2);
            }
            float f22 = this.f54849a;
            if (strokeWidth != f22) {
                canvas.drawCircle(f19, f15, f22, paint);
            }
        }
        boolean z14 = this.f54861m;
        float f24 = (z14 ? this.f54856h : this.f54855g) * f16;
        if (!z14) {
            f24 += this.f54857i * f16;
        }
        if (this.f54859k == 0) {
            float f25 = f18 + f24;
            f14 = f17;
            f17 = f25;
        } else {
            f14 = f18 + f24;
        }
        canvas.drawCircle(f17, f14, this.f54849a, this.f54852d);
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        if (this.f54859k == 0) {
            setMeasuredDimension(a(i14), b(i15));
        } else {
            setMeasuredDimension(b(i14), a(i15));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i14) {
        this.f54858j = i14;
        ViewPager.j jVar = this.f54854f;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i14);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i14, float f14, int i15) {
        this.f54855g = i14;
        this.f54857i = f14;
        invalidate();
        ViewPager.j jVar = this.f54854f;
        if (jVar != null) {
            jVar.onPageScrolled(i14, f14, i15);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i14) {
        if (this.f54861m || this.f54858j == 0) {
            this.f54855g = i14;
            this.f54856h = i14;
            invalidate();
        }
        ViewPager.j jVar = this.f54854f;
        if (jVar != null) {
            jVar.onPageSelected(i14);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        int i14 = aVar.f54866a;
        this.f54855g = i14;
        this.f54856h = i14;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f54866a = this.f54855g;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int f44034e;
        if (!super.onTouchEvent(motionEvent)) {
            ViewPager viewPager2 = this.f54853e;
            if (viewPager2 == null || viewPager2.getAdapter().getF44034e() == 0) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f54864p = motionEvent.getPointerId(0);
                this.f54863o = motionEvent.getX();
                return true;
            }
            if (action == 1) {
                if (this.f54865q) {
                    this.f54865q = false;
                    this.f54864p = -1;
                    viewPager = this.f54853e;
                    if (viewPager.L0) {
                        viewPager.k();
                    }
                } else {
                    f44034e = this.f54853e.getAdapter().getF44034e();
                    float width = getWidth();
                    float f14 = width / 2.0f;
                    float f15 = width / 6.0f;
                    if (this.f54855g > 0 || motionEvent.getX() >= f14 - f15) {
                        if (this.f54855g < f44034e - 1 || motionEvent.getX() <= f14 + f15) {
                            this.f54865q = false;
                            this.f54864p = -1;
                            viewPager = this.f54853e;
                            if (viewPager.L0) {
                                viewPager.k();
                            }
                        } else if (action != 3) {
                            this.f54853e.setCurrentItem(this.f54855g + 1);
                            return true;
                        }
                    } else if (action != 3) {
                        this.f54853e.setCurrentItem(this.f54855g - 1);
                        return true;
                    }
                }
            } else if (action == 2) {
                float x14 = motionEvent.getX(motionEvent.findPointerIndex(this.f54864p));
                float f16 = x14 - this.f54863o;
                if (!this.f54865q && Math.abs(f16) > this.f54862n) {
                    this.f54865q = true;
                }
                if (this.f54865q) {
                    this.f54863o = x14;
                    ViewPager viewPager3 = this.f54853e;
                    if (viewPager3.L0 || viewPager3.e()) {
                        this.f54853e.l(f16);
                        return true;
                    }
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f54863o = motionEvent.getX(actionIndex);
                    this.f54864p = motionEvent.getPointerId(actionIndex);
                    return true;
                }
                if (action == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f54864p) {
                        this.f54864p = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                    this.f54863o = motionEvent.getX(motionEvent.findPointerIndex(this.f54864p));
                    return true;
                }
            } else if (this.f54865q) {
                f44034e = this.f54853e.getAdapter().getF44034e();
                float width2 = getWidth();
                float f17 = width2 / 2.0f;
                float f18 = width2 / 6.0f;
                if (this.f54855g > 0) {
                    if (this.f54855g < f44034e - 1) {
                        this.f54865q = false;
                        this.f54864p = -1;
                        viewPager = this.f54853e;
                        if (viewPager.L0) {
                            viewPager.k();
                        }
                    } else {
                        this.f54865q = false;
                        this.f54864p = -1;
                        viewPager = this.f54853e;
                        if (viewPager.L0) {
                            viewPager.k();
                        }
                    }
                } else if (this.f54855g < f44034e - 1) {
                    this.f54865q = false;
                    this.f54864p = -1;
                    viewPager = this.f54853e;
                    if (viewPager.L0) {
                        viewPager.k();
                    }
                } else {
                    this.f54865q = false;
                    this.f54864p = -1;
                    viewPager = this.f54853e;
                    if (viewPager.L0) {
                        viewPager.k();
                    }
                }
            } else {
                this.f54865q = false;
                this.f54864p = -1;
                viewPager = this.f54853e;
                if (viewPager.L0) {
                    viewPager.k();
                }
            }
        }
        return true;
    }

    public void setCentered(boolean z14) {
        this.f54860l = z14;
        invalidate();
    }

    public void setCurrentItem(int i14) {
        ViewPager viewPager = this.f54853e;
        if (viewPager == null) {
            h.z("ViewPager has not been bound.");
            return;
        }
        viewPager.setCurrentItem(i14);
        this.f54855g = i14;
        invalidate();
    }

    public void setFillColor(int i14) {
        this.f54852d.setColor(i14);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f54854f = jVar;
    }

    public void setOrientation(int i14) {
        if (i14 != 0 && i14 != 1) {
            h.s("Orientation must be either HORIZONTAL or VERTICAL.");
        } else {
            this.f54859k = i14;
            requestLayout();
        }
    }

    public void setPageColor(int i14) {
        this.f54850b.setColor(i14);
        invalidate();
    }

    public void setRadius(float f14) {
        this.f54849a = f14;
        invalidate();
    }

    public void setSnap(boolean z14) {
        this.f54861m = z14;
        invalidate();
    }

    public void setStrokeColor(int i14) {
        this.f54851c.setColor(i14);
        invalidate();
    }

    public void setStrokeWidth(float f14) {
        this.f54851c.setStrokeWidth(f14);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f54853e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            h.z("ViewPager does not have adapter instance.");
            return;
        }
        this.f54853e = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C1193a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f54866a;

        /* JADX INFO: renamed from: com.viewpagerindicator.CirclePageIndicator$a$a, reason: collision with other inner class name */
        public class C1193a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i14) {
                return new a[i14];
            }
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f54866a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.f54866a);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public /* synthetic */ a(Parcel parcel, int i14) {
            this(parcel);
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }
}
