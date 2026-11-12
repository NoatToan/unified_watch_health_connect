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
import com.google.android.flexbox.FlexItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@ViewPager.e
public class a extends ViewGroup {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f11318o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f11319p = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f11320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f11321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f11322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f11323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0160a f11330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference<fe.a> f11331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11333n;

    /* JADX INFO: renamed from: androidx.viewpager.widget.a$a, reason: collision with other inner class name */
    public class C0160a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11334a;

        public C0160a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void onAdapterChanged(ViewPager viewPager, fe.a aVar, fe.a aVar2) {
            a.this.a(aVar, aVar2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.b(aVar.f11320a.getCurrentItem(), aVar.f11320a.getAdapter());
            float f14 = aVar.f11325f;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            aVar.c(aVar.f11320a.getCurrentItem(), f14, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
            this.f11334a = i14;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            if (f14 > 0.5f) {
                i14++;
            }
            a.this.c(i14, f14, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            if (this.f11334a == 0) {
                a aVar = a.this;
                aVar.b(aVar.f11320a.getCurrentItem(), aVar.f11320a.getAdapter());
                float f14 = aVar.f11325f;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                aVar.c(aVar.f11320a.getCurrentItem(), f14, true);
            }
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f11336a;

        public b(Context context) {
            this.f11336a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view2) {
            CharSequence transformation = super.getTransformation(charSequence, view2);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f11336a);
            }
            return null;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11324e = -1;
        this.f11325f = -1.0f;
        this.f11330k = new C0160a();
        TextView textView = new TextView(context);
        this.f11321b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f11322c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f11323d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11318o);
        boolean z14 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f14 = dimensionPixelSize;
            textView.setTextSize(0, f14);
            textView2.setTextSize(0, f14);
            textView3.setTextSize(0, f14);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f11327h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f11333n = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f11319p);
            z14 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z14) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.f11326g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public final void a(fe.a aVar, fe.a aVar2) {
        C0160a c0160a = this.f11330k;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(c0160a);
            this.f11331l = null;
        }
        if (aVar2 != null) {
            aVar2.registerDataSetObserver(c0160a);
            this.f11331l = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f11320a;
        if (viewPager != null) {
            this.f11324e = -1;
            this.f11325f = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public final void b(int i14, fe.a aVar) {
        int f149591t = aVar != null ? aVar.getF149591t() : 0;
        this.f11328i = true;
        CharSequence pageTitle = null;
        CharSequence pageTitle2 = (i14 < 1 || aVar == null) ? null : aVar.getPageTitle(i14 - 1);
        TextView textView = this.f11321b;
        textView.setText(pageTitle2);
        CharSequence pageTitle3 = (aVar == null || i14 >= f149591t) ? null : aVar.getPageTitle(i14);
        TextView textView2 = this.f11322c;
        textView2.setText(pageTitle3);
        int i15 = i14 + 1;
        if (i15 < f149591t && aVar != null) {
            pageTitle = aVar.getPageTitle(i15);
        }
        TextView textView3 = this.f11323d;
        textView3.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f11324e = i14;
        if (!this.f11329j) {
            c(i14, this.f11325f, false);
        }
        this.f11328i = false;
    }

    public void c(int i14, float f14, boolean z14) {
        int i15;
        int i16;
        int i17;
        int i18;
        if (i14 != this.f11324e) {
            b(i14, this.f11320a.getAdapter());
        } else if (!z14 && f14 == this.f11325f) {
            return;
        }
        this.f11329j = true;
        TextView textView = this.f11321b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f11322c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f11323d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i19 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = paddingRight + i19;
        int i25 = (width - (paddingLeft + i19)) - i24;
        float f15 = f14 + 0.5f;
        if (f15 > 1.0f) {
            f15 -= 1.0f;
        }
        int i26 = ((width - i24) - ((int) (i25 * f15))) - i19;
        int i27 = measuredWidth2 + i26;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i28 = iMax - baseline;
        int i29 = iMax - baseline2;
        int i30 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i28, textView2.getMeasuredHeight() + i29), textView3.getMeasuredHeight() + i30);
        int i34 = this.f11327h & 112;
        if (i34 != 16) {
            if (i34 != 80) {
                i16 = i28 + paddingTop;
                i17 = paddingTop + i29;
                i18 = paddingTop + i30;
            } else {
                i15 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i26, i17, i27, textView2.getMeasuredHeight() + i17);
            int iMin = Math.min(paddingLeft, (i26 - this.f11326g) - measuredWidth);
            textView.layout(iMin, i16, iMin + measuredWidth, textView.getMeasuredHeight() + i16);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i27 + this.f11326g);
            textView3.layout(iMax3, i18, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i18);
            this.f11325f = f14;
            this.f11329j = false;
        }
        i15 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i16 = i28 + i15;
        i17 = i15 + i29;
        i18 = i15 + i30;
        textView2.layout(i26, i17, i27, textView2.getMeasuredHeight() + i17);
        int iMin2 = Math.min(paddingLeft, (i26 - this.f11326g) - measuredWidth);
        textView.layout(iMin2, i16, iMin2 + measuredWidth, textView.getMeasuredHeight() + i16);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i27 + this.f11326g);
        textView3.layout(iMax4, i18, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i18);
        this.f11325f = f14;
        this.f11329j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f11326g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            h.z("PagerTitleStrip must be a direct child of a ViewPager.");
            return;
        }
        ViewPager viewPager = (ViewPager) parent;
        fe.a adapter = viewPager.getAdapter();
        C0160a c0160a = this.f11330k;
        viewPager.U0 = c0160a;
        viewPager.b(c0160a);
        this.f11320a = viewPager;
        WeakReference<fe.a> weakReference = this.f11331l;
        a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f11320a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f11320a;
            ViewPager.j jVar = viewPager2.U0;
            viewPager2.U0 = null;
            ArrayList arrayList = viewPager2.V0;
            if (arrayList != null) {
                arrayList.remove(this.f11330k);
            }
            this.f11320a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        if (this.f11320a != null) {
            float f14 = this.f11325f;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            c(this.f11324e, f14, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int iMax;
        if (View.MeasureSpec.getMode(i14) != 1073741824) {
            h.z("Must measure with an exact width");
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i14);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, (int) (size * 0.2f), -2);
        this.f11321b.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f11322c;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f11323d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i15) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i15);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i15, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f11328i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i14) {
        this.f11327h = i14;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f14) {
        int i14 = ((int) (f14 * 255.0f)) & 255;
        this.f11332m = i14;
        int i15 = (i14 << 24) | (this.f11333n & FlexItem.MAX_SIZE);
        this.f11321b.setTextColor(i15);
        this.f11323d.setTextColor(i15);
    }

    public void setTextColor(int i14) {
        this.f11333n = i14;
        this.f11322c.setTextColor(i14);
        int i15 = (this.f11332m << 24) | (this.f11333n & FlexItem.MAX_SIZE);
        this.f11321b.setTextColor(i15);
        this.f11323d.setTextColor(i15);
    }

    public void setTextSpacing(int i14) {
        this.f11326g = i14;
        requestLayout();
    }

    public a(Context context) {
        this(context, null);
    }
}
