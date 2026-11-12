package com.huawei.uikit.hwviewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes44.dex */
@HwViewPager.DecorView
public class HwPagerTitleStrip extends ViewGroup {
    private static final int[] i = {R.attr.textAllCaps};
    private static final int[] j = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HwViewPager f29809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f29810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f29811c;
    int d;
    TextView e;
    float f;
    private int g;
    private int h;
    private WeakReference<HwPagerAdapter> k;
    private final d l;
    private boolean m;
    private boolean n;
    private int o;
    private int q;

    class d extends DataSetObserver implements HwViewPager.OnPageChangeListener, HwViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29813c;

        d() {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnAdapterChangeListener
        public void onAdapterChanged(HwViewPager hwViewPager, HwPagerAdapter hwPagerAdapter, HwPagerAdapter hwPagerAdapter2) {
            HwPagerTitleStrip.this.c(hwPagerAdapter, hwPagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            HwPagerTitleStrip hwPagerTitleStrip = HwPagerTitleStrip.this;
            hwPagerTitleStrip.a(hwPagerTitleStrip.f29809a.getCurrentItem(), HwPagerTitleStrip.this.f29809a.getAdapter());
            float f = Float.compare(HwPagerTitleStrip.this.f, 0.0f) >= 0 ? HwPagerTitleStrip.this.f : 0.0f;
            HwPagerTitleStrip hwPagerTitleStrip2 = HwPagerTitleStrip.this;
            hwPagerTitleStrip2.b(hwPagerTitleStrip2.f29809a.getCurrentItem(), f, true);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f29813c = i;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            HwPagerTitleStrip.this.b(i, f, false);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.f29813c == 0) {
                HwPagerTitleStrip hwPagerTitleStrip = HwPagerTitleStrip.this;
                hwPagerTitleStrip.a(hwPagerTitleStrip.f29809a.getCurrentItem(), HwPagerTitleStrip.this.f29809a.getAdapter());
                float f = Float.compare(HwPagerTitleStrip.this.f, 0.0f) >= 0 ? HwPagerTitleStrip.this.f : 0.0f;
                HwPagerTitleStrip hwPagerTitleStrip2 = HwPagerTitleStrip.this;
                hwPagerTitleStrip2.b(hwPagerTitleStrip2.f29809a.getCurrentItem(), f, true);
            }
        }
    }

    static class e extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Locale f29814b;

        e(Context context) {
            this.f29814b = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f29814b);
            }
            return null;
        }
    }

    public HwPagerTitleStrip(Context context) {
        this(context, null);
    }

    private float b(float f) {
        float f2 = f + 0.5f;
        return f2 > 1.0f ? f2 - 1.0f : f2;
    }

    private void d(int i2) {
        setTextSize(0, i2);
    }

    private float e(float f, boolean z) {
        if (z) {
            f = -f;
        }
        float f2 = f + 0.5f;
        if (z) {
            return f2 < 0.0f ? f2 + 1.0f : f2;
        }
        return f2 > 1.0f ? f2 - 1.0f : f2;
    }

    private void e(float f, int i2, int i3) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredHeight = this.e.getMeasuredHeight();
        int i4 = measuredHeight / 2;
        int i5 = paddingBottom + i4;
        float fB = b(f);
        boolean zIsRtlLayout = this.f29809a.isRtlLayout();
        int i6 = ((i3 - i5) - ((int) (((i3 - (paddingTop + i4)) - i5) * fB))) - i4;
        int i7 = measuredHeight + i6;
        int iMax = Math.max(Math.max(this.f29811c.getMeasuredWidth(), this.e.getMeasuredWidth()), this.f29810b.getMeasuredWidth());
        int i8 = this.o & 7;
        if (i8 == 1) {
            paddingLeft = (((i2 - paddingLeft) - paddingRight) - iMax) / 2;
        } else if (i8 == 5) {
            paddingLeft = zIsRtlLayout ? paddingRight : (i2 - paddingRight) - iMax;
        } else if (zIsRtlLayout) {
            paddingLeft = (i2 - iMax) - paddingLeft;
        }
        TextView textView = this.e;
        textView.layout(paddingLeft, i6, textView.getMeasuredWidth() + paddingLeft, i7);
        int measuredHeight2 = this.f29811c.getMeasuredHeight();
        int iMin = Math.min(paddingTop, (i6 - this.h) - measuredHeight2);
        TextView textView2 = this.f29811c;
        textView2.layout(paddingLeft, iMin, textView2.getMeasuredWidth() + paddingLeft, measuredHeight2 + iMin);
        int measuredHeight3 = this.f29810b.getMeasuredHeight();
        int iMax2 = Math.max((i3 - paddingBottom) - measuredHeight3, i7 + this.h);
        TextView textView3 = this.f29810b;
        textView3.layout(paddingLeft, iMax2, textView3.getMeasuredWidth() + paddingLeft, measuredHeight3 + iMax2);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new e(textView.getContext()));
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    int getMinWidth() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicWidth();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof HwViewPager)) {
            throw new IllegalStateException("HwPagerTitleStrip must be a direct child of a ViewPager.");
        }
        HwViewPager hwViewPager = (HwViewPager) parent;
        HwPagerAdapter adapter = hwViewPager.getAdapter();
        hwViewPager.a(this.l);
        hwViewPager.addOnAdapterChangeListener(this.l);
        this.f29809a = hwViewPager;
        if (hwViewPager.getPageScrollDirection() == 0) {
            setGravity(80);
        } else {
            setGravity(1);
        }
        WeakReference<HwPagerAdapter> weakReference = this.k;
        c(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HwViewPager hwViewPager = this.f29809a;
        if (hwViewPager != null) {
            c(hwViewPager.getAdapter(), (HwPagerAdapter) null);
            this.f29809a.a((HwViewPager.OnPageChangeListener) null);
            this.f29809a.removeOnAdapterChangeListener(this.l);
            this.f29809a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f29809a != null) {
            b(this.g, Float.compare(this.f, 0.0f) >= 0 ? this.f : 0.0f, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        HwViewPager hwViewPager = this.f29809a;
        if (hwViewPager == null || hwViewPager.getPageScrollDirection() == 0) {
            c(i2, i3);
        } else {
            d(i2, i3);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.n) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i2) {
        this.o = i2;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i2 = ((int) (f * 255.0f)) & 255;
        this.q = i2;
        int i3 = (i2 << 24) | (this.d & ViewCompat.MEASURED_SIZE_MASK);
        this.f29811c.setTextColor(i3);
        this.f29810b.setTextColor(i3);
    }

    public void setTextColor(int i2) {
        this.d = i2;
        this.e.setTextColor(i2);
        int i3 = (this.q << 24) | (this.d & ViewCompat.MEASURED_SIZE_MASK);
        this.f29811c.setTextColor(i3);
        this.f29810b.setTextColor(i3);
    }

    public void setTextSize(int i2, float f) {
        this.f29811c.setTextSize(i2, f);
        this.e.setTextSize(i2, f);
        this.f29810b.setTextSize(i2, f);
    }

    public void setTextSpacing(int i2) {
        this.h = i2;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
    public HwPagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.f = -1.0f;
        this.l = new d();
        TextView textView = new TextView(context);
        this.f29811c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f29810b = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.f29811c, resourceId);
            TextViewCompat.setTextAppearance(this.e, resourceId);
            TextViewCompat.setTextAppearance(this.f29810b, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            d(dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f29811c.setTextColor(color);
            this.e.setTextColor(color);
            this.f29810b.setTextColor(color);
        }
        this.o = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.d = this.e.getTextColors().getDefaultColor();
        a();
        this.f29811c.setEllipsize(TextUtils.TruncateAt.END);
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.f29810b.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, i);
            boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
            if (z) {
                setSingleLineAllCaps(this.f29811c);
                setSingleLineAllCaps(this.e);
                setSingleLineAllCaps(this.f29810b);
            } else {
                this.f29811c.setSingleLine();
                this.e.setSingleLine();
                this.f29810b.setSingleLine();
            }
        } else {
            this.f29811c.setSingleLine();
            this.e.setSingleLine();
            this.f29810b.setSingleLine();
        }
        this.h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private void a() {
        setNonPrimaryAlpha(0.6f);
    }

    void a(int i2, HwPagerAdapter hwPagerAdapter) {
        int count = hwPagerAdapter != null ? hwPagerAdapter.getCount() : 0;
        boolean z = true;
        this.n = true;
        CharSequence pageTitle = null;
        this.f29811c.setText((i2 < 1 || hwPagerAdapter == null) ? null : hwPagerAdapter.getPageTitle(i2 - 1));
        this.e.setText((hwPagerAdapter == null || i2 >= count) ? null : hwPagerAdapter.getPageTitle(i2));
        int i3 = i2 + 1;
        if (i3 < count && hwPagerAdapter != null) {
            pageTitle = hwPagerAdapter.getPageTitle(i3);
        }
        this.f29810b.setText(pageTitle);
        HwViewPager hwViewPager = this.f29809a;
        if (hwViewPager != null && hwViewPager.getPageScrollDirection() != 0) {
            z = false;
        }
        b(z);
        this.g = i2;
        if (!this.m) {
            b(i2, this.f, false);
        }
        this.n = false;
    }

    private void b(boolean z) {
        float f = z ? 0.8f : 1.0f;
        float f2 = z ? 1.0f : 0.8f;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getHeight() - getPaddingTop()) - getPaddingBottom()) * f2)), Integer.MIN_VALUE);
        this.f29811c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.e.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f29810b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    void c(HwPagerAdapter hwPagerAdapter, HwPagerAdapter hwPagerAdapter2) {
        if (hwPagerAdapter != null) {
            hwPagerAdapter.unregisterDataSetObserver(this.l);
            this.k = null;
        }
        if (hwPagerAdapter2 != null) {
            hwPagerAdapter2.registerDataSetObserver(this.l);
            this.k = new WeakReference<>(hwPagerAdapter2);
        }
        HwViewPager hwViewPager = this.f29809a;
        if (hwViewPager != null) {
            this.g = -1;
            this.f = -1.0f;
            a(hwViewPager.getCurrentItem(), hwPagerAdapter2);
            requestLayout();
        }
    }

    void b(int i2, float f, boolean z) {
        if (i2 != this.g) {
            a(i2, this.f29809a.getAdapter());
        } else if (!z && f == this.f) {
            return;
        }
        this.m = true;
        int width = getWidth();
        int height = getHeight();
        if (this.f29809a.getPageScrollDirection() == 0) {
            b(f, width, height);
        } else {
            e(f, width, height);
        }
        this.f = f;
        this.m = false;
    }

    private void d(int i2, int i3) {
        int iMax;
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            Log.w("HwPagerTitleStrip", "onMeasureVertical: Must measure with an exact height");
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingLeft, -2);
        int size = View.MeasureSpec.getSize(i3);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, (int) (size * 0.19999999f), -2);
        this.f29811c.measure(childMeasureSpec, childMeasureSpec2);
        this.e.measure(childMeasureSpec, childMeasureSpec2);
        this.f29810b.measure(childMeasureSpec, childMeasureSpec2);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinWidth(), this.e.getMeasuredWidth() + paddingLeft);
        }
        this.e.getMeasuredState();
        setMeasuredDimension(View.resolveSize(iMax, i2), size);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0082  */
    /* JADX WARN: Code duplicated, block: B:13:0x008d  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b2  */
    private void b(float f, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int measuredWidth;
        int iMin;
        int measuredWidth2;
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int measuredWidth3 = this.e.getMeasuredWidth();
        int i8 = measuredWidth3 / 2;
        int i9 = paddingRight + i8;
        boolean zIsRtlLayout = this.f29809a.isRtlLayout();
        int iE = ((i2 - i9) - ((int) (((i2 - (paddingLeft + i8)) - i9) * e(f, zIsRtlLayout)))) - i8;
        int i10 = measuredWidth3 + iE;
        int baseline = this.f29811c.getBaseline();
        int baseline2 = this.e.getBaseline();
        int baseline3 = this.f29810b.getBaseline();
        int iMax2 = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax2 - baseline;
        int i12 = iMax2 - baseline2;
        int i13 = iMax2 - baseline3;
        int iE2 = e(i11, i12, i13);
        int i14 = this.o & 112;
        if (i14 == 16) {
            i4 = (((i3 - paddingTop) - paddingBottom) - iE2) / 2;
        } else {
            if (i14 != 80) {
                i5 = i11 + paddingTop;
                i6 = i12 + paddingTop;
                i7 = paddingTop + i13;
            } else {
                i4 = (i3 - paddingBottom) - iE2;
            }
            TextView textView = this.e;
            textView.layout(iE, i6, i10, textView.getMeasuredHeight() + i6);
            measuredWidth = this.f29811c.getMeasuredWidth();
            if (zIsRtlLayout) {
                iMin = Math.max((i2 - paddingRight) - measuredWidth, this.h + i10);
            } else {
                iMin = Math.min(paddingLeft, (iE - this.h) - measuredWidth);
            }
            TextView textView2 = this.f29811c;
            textView2.layout(iMin, i5, measuredWidth + iMin, textView2.getMeasuredHeight() + i5);
            measuredWidth2 = this.f29810b.getMeasuredWidth();
            if (zIsRtlLayout) {
                iMax = Math.min(paddingLeft, (iE - this.h) - measuredWidth2);
            } else {
                iMax = Math.max((i2 - paddingRight) - measuredWidth2, i10 + this.h);
            }
            TextView textView3 = this.f29810b;
            textView3.layout(iMax, i7, measuredWidth2 + iMax, textView3.getMeasuredHeight() + i7);
        }
        i5 = i11 + i4;
        i6 = i12 + i4;
        i7 = i4 + i13;
        TextView textView4 = this.e;
        textView4.layout(iE, i6, i10, textView4.getMeasuredHeight() + i6);
        measuredWidth = this.f29811c.getMeasuredWidth();
        if (zIsRtlLayout) {
            iMin = Math.max((i2 - paddingRight) - measuredWidth, this.h + i10);
        } else {
            iMin = Math.min(paddingLeft, (iE - this.h) - measuredWidth);
        }
        TextView textView5 = this.f29811c;
        textView5.layout(iMin, i5, measuredWidth + iMin, textView5.getMeasuredHeight() + i5);
        measuredWidth2 = this.f29810b.getMeasuredWidth();
        if (zIsRtlLayout) {
            iMax = Math.min(paddingLeft, (iE - this.h) - measuredWidth2);
        } else {
            iMax = Math.max((i2 - paddingRight) - measuredWidth2, i10 + this.h);
        }
        TextView textView6 = this.f29810b;
        textView6.layout(iMax, i7, measuredWidth2 + iMax, textView6.getMeasuredHeight() + i7);
    }

    private int e(int i2, int i3, int i4) {
        return Math.max(Math.max(i2 + this.f29811c.getMeasuredHeight(), i3 + this.e.getMeasuredHeight()), i4 + this.f29810b.getMeasuredHeight());
    }

    private void c(int i2, int i3) {
        int iMax;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            Log.w("HwPagerTitleStrip", "onMeasureVertical: Must measure with an exact width");
            return;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i2);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, (int) (size * 0.19999999f), -2);
        this.f29811c.measure(childMeasureSpec2, childMeasureSpec);
        this.e.measure(childMeasureSpec2, childMeasureSpec);
        this.f29810b.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i3);
        } else {
            iMax = Math.max(getMinHeight(), this.e.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i3, this.e.getMeasuredState() << 16));
    }
}
