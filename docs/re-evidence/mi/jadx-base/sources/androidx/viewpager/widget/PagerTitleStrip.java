package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import defpackage.eih;
import defpackage.s8p;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.e
public class PagerTitleStrip extends ViewGroup {
    public static final int[] o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] p = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f3114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f3115b;
    public TextView c;
    public TextView d;
    public int e;
    public float f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f3116k;
    public WeakReference<eih> l;
    public int m;
    public int n;

    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3117a;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, eih eihVar, eih eihVar2) {
            PagerTitleStrip.this.b(eihVar, eihVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.c(pagerTitleStrip.f3114a.getCurrentItem(), PagerTitleStrip.this.f3114a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.d(pagerTitleStrip2.f3114a.getCurrentItem(), f, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i) {
            this.f3117a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.d(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i) {
            if (this.f3117a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.c(pagerTitleStrip.f3114a.getCurrentItem(), PagerTitleStrip.this.f3114a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.d(pagerTitleStrip2.f3114a.getCurrentItem(), f, true);
            }
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Locale f3119a;

        public b(Context context) {
            this.f3119a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3119a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i, float f) {
        this.f3115b.setTextSize(i, f);
        this.c.setTextSize(i, f);
        this.d.setTextSize(i, f);
    }

    public void b(eih eihVar, eih eihVar2) {
        if (eihVar != null) {
            eihVar.unregisterDataSetObserver(this.f3116k);
            this.l = null;
        }
        if (eihVar2 != null) {
            eihVar2.registerDataSetObserver(this.f3116k);
            this.l = new WeakReference<>(eihVar2);
        }
        ViewPager viewPager = this.f3114a;
        if (viewPager != null) {
            this.e = -1;
            this.f = -1.0f;
            c(viewPager.getCurrentItem(), eihVar2);
            requestLayout();
        }
    }

    public void c(int i, eih eihVar) {
        int count = eihVar != null ? eihVar.getCount() : 0;
        this.i = true;
        CharSequence pageTitle = null;
        this.f3115b.setText((i < 1 || eihVar == null) ? null : eihVar.getPageTitle(i - 1));
        this.c.setText((eihVar == null || i >= count) ? null : eihVar.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && eihVar != null) {
            pageTitle = eihVar.getPageTitle(i2);
        }
        this.d.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f3115b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.e = i;
        if (!this.j) {
            d(i, this.f, false);
        }
        this.i = false;
    }

    public void d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.e) {
            c(i, this.f3114a.getAdapter());
        } else if (!z && f == this.f) {
            return;
        }
        this.j = true;
        int measuredWidth = this.f3115b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredWidth3 = this.d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f3115b.getBaseline();
        int baseline2 = this.c.getBaseline();
        int baseline3 = this.d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f3115b.getMeasuredHeight() + i11, this.c.getMeasuredHeight() + i12), this.d.getMeasuredHeight() + i13);
        int i14 = this.h & 112;
        if (i14 != 16) {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
            } else {
                i2 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.c;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int iMin = Math.min(paddingLeft, (i9 - this.g) - measuredWidth);
            TextView textView2 = this.f3115b;
            textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.g);
            TextView textView3 = this.d;
            textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.f = f;
            this.j = false;
        }
        i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.c;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.g) - measuredWidth);
        TextView textView5 = this.f3115b;
        textView5.layout(iMin2, i3, measuredWidth + iMin2, textView5.getMeasuredHeight() + i3);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.g);
        TextView textView6 = this.d;
        textView6.layout(iMax4, i5, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i5);
        this.f = f;
        this.j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        eih adapter = viewPager.getAdapter();
        viewPager.O(this.f3116k);
        viewPager.addOnAdapterChangeListener(this.f3116k);
        this.f3114a = viewPager;
        WeakReference<eih> weakReference = this.l;
        b(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f3114a;
        if (viewPager != null) {
            b(viewPager.getAdapter(), null);
            this.f3114a.O(null);
            this.f3114a.removeOnAdapterChangeListener(this.f3116k);
            this.f3114a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f3114a != null) {
            float f = this.f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            d(this.e, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f3115b.measure(childMeasureSpec2, childMeasureSpec);
        this.c.measure(childMeasureSpec2, childMeasureSpec);
        this.d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.h = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.m = i;
        int i2 = (i << 24) | (this.n & 16777215);
        this.f3115b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.n = i;
        this.c.setTextColor(i);
        int i2 = (this.m << 24) | (this.n & 16777215);
        this.f3115b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.g = i;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1.0f;
        this.f3116k = new a();
        TextView textView = new TextView(context);
        this.f3115b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            s8p.o(this.f3115b, resourceId);
            s8p.o(this.c, resourceId);
            s8p.o(this.d, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f3115b.setTextColor(color);
            this.c.setTextColor(color);
            this.d.setTextColor(color);
        }
        this.h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.n = this.c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f3115b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.c.setEllipsize(truncateAt);
        this.d.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, p);
            boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
            if (z) {
                setSingleLineAllCaps(this.f3115b);
                setSingleLineAllCaps(this.c);
                setSingleLineAllCaps(this.d);
            } else {
                this.f3115b.setSingleLine();
                this.c.setSingleLine();
                this.d.setSingleLine();
            }
        } else {
            this.f3115b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
