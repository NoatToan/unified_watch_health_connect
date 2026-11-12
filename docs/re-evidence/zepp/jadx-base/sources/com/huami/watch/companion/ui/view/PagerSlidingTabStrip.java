package com.huami.watch.companion.ui.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes16.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    public static final int DEF_VALUE_TAB_TEXT_ALPHA = 150;
    private static final int[] H = {R.attr.textColorPrimary, R.attr.padding, R.attr.paddingLeft, R.attr.paddingRight};
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 3;
    private boolean A;
    private boolean B;
    private Typeface C;
    private int D;
    private int E;
    private int F;
    private int G;
    private LinearLayout a;
    private LinearLayout.LayoutParams b;
    private final c c;
    private final b d;
    private OnTabReselectedListener e;
    private ViewPager f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private Paint k;
    private int l;
    private int m;
    public ViewPager.OnPageChangeListener mDelegatePageListener;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private ColorStateList v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public interface CustomTabProvider {
        View getCustomTabView(ViewGroup viewGroup, int i);

        void tabSelected(View view);

        void tabUnselected(View view);
    }

    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PagerSlidingTabStrip.this.f.getCurrentItem() != this.a) {
                PagerSlidingTabStrip.this.q(PagerSlidingTabStrip.this.a.getChildAt(PagerSlidingTabStrip.this.f.getCurrentItem()));
                PagerSlidingTabStrip.this.f.setCurrentItem(this.a);
            } else if (PagerSlidingTabStrip.this.e != null) {
                PagerSlidingTabStrip.this.e.onTabReselected(this.a);
            }
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        private b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.n(pagerSlidingTabStrip.f.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.mDelegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            PagerSlidingTabStrip.this.h = i;
            PagerSlidingTabStrip.this.i = f;
            PagerSlidingTabStrip.this.n(i, PagerSlidingTabStrip.this.g > 0 ? (int) (PagerSlidingTabStrip.this.a.getChildAt(i).getWidth() * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.mDelegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            PagerSlidingTabStrip.this.r(i);
            PagerSlidingTabStrip.this.o(PagerSlidingTabStrip.this.a.getChildAt(i));
            if (i > 0) {
                PagerSlidingTabStrip.this.q(PagerSlidingTabStrip.this.a.getChildAt(i - 1));
            }
            if (i < PagerSlidingTabStrip.this.f.getAdapter().getCount() - 1) {
                PagerSlidingTabStrip.this.q(PagerSlidingTabStrip.this.a.getChildAt(i + 1));
            }
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.mDelegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i);
            }
        }

        public /* synthetic */ b(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    private void k(int i, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(com.huami.watch.companionlib.R.id.psts_tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setFocusable(true);
        view.setOnClickListener(new a(i));
        this.a.addView(view, i, this.b);
    }

    private ColorStateList l(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    private ColorStateList m(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{i, i2, i3});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i, int i2) {
        if (this.g == 0) {
            return;
        }
        int left = this.a.getChildAt(i).getLeft() + i2;
        if (i > 0 || i2 > 0) {
            int i3 = left - this.E;
            Pair<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i3 + ((indicatorCoordinates.second.floatValue() - indicatorCoordinates.first.floatValue()) / 2.0f));
        }
        if (left != this.F) {
            this.F = left;
            scrollTo(left, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(com.huami.watch.companionlib.R.id.psts_tab_title);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.setSelected(true);
            }
            if (this.z) {
                ((CustomTabProvider) this.f.getAdapter()).tabSelected(view);
            }
        }
    }

    private void p() {
        int i = this.m;
        int i2 = this.o;
        if (i < i2) {
            i = i2;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(com.huami.watch.companionlib.R.id.psts_tab_title);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
                textView.setSelected(false);
            }
            if (this.z) {
                ((CustomTabProvider) this.f.getAdapter()).tabUnselected(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i) {
        int i2 = 0;
        while (i2 < this.g) {
            View childAt = this.a.getChildAt(i2);
            if (i2 == i) {
                o(childAt);
            } else {
                q(childAt);
            }
            i2++;
        }
    }

    private void s() {
        for (int i = 0; i < this.g; i++) {
            View childAt = this.a.getChildAt(i);
            childAt.setBackgroundResource(this.G);
            childAt.setPadding(this.t, childAt.getPaddingTop(), this.t, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(com.huami.watch.companionlib.R.id.psts_tab_title);
            if (textView != null) {
                textView.setTextColor(this.v);
                textView.setTypeface(this.C, this.D);
                textView.setTextSize(0, this.u);
                if (this.B) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase());
                    }
                }
            }
        }
    }

    public int getCurrentPosition() {
        return this.h;
    }

    public float getCurrentPositionOffset() {
        return this.i;
    }

    public int getDividerColor() {
        return this.s;
    }

    public int getDividerPadding() {
        return this.r;
    }

    public int getDividerWidth() {
        return this.q;
    }

    public int getIndicatorColor() {
        return this.l;
    }

    public Pair<Float, Float> getIndicatorCoordinates() {
        int i;
        View childAt = this.a.getChildAt(this.h);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.i > 0.0f && (i = this.h) < this.g - 1) {
            View childAt2 = this.a.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.i;
            left = (left2 * f) + ((1.0f - f) * left);
            right = (right2 * f) + ((1.0f - f) * right);
        }
        return new Pair<>(Float.valueOf(left), Float.valueOf(right));
    }

    public int getIndicatorHeight() {
        return this.m;
    }

    public int getScrollOffset() {
        return this.E;
    }

    public boolean getShouldExpand() {
        return this.y;
    }

    public int getTabBackground() {
        return this.G;
    }

    public int getTabCount() {
        return this.g;
    }

    public int getTabPaddingLeftRight() {
        return this.t;
    }

    public LinearLayout getTabsContainer() {
        return this.a;
    }

    public ColorStateList getTextColor() {
        return this.v;
    }

    public int getTextSize() {
        return this.u;
    }

    public int getUnderlineColor() {
        return this.p;
    }

    public int getUnderlineHeight() {
        return this.o;
    }

    public boolean isTextAllCaps() {
        return this.B;
    }

    public void notifyDataSetChanged() {
        this.a.removeAllViews();
        this.g = this.f.getAdapter().getCount();
        for (int i = 0; i < this.g; i++) {
            k(i, this.f.getAdapter().getPageTitle(i), this.z ? ((CustomTabProvider) this.f.getAdapter()).getCustomTabView(this, i) : LayoutInflater.from(getContext()).inflate(com.huami.watch.companionlib.R.layout.psts_tab, (ViewGroup) this, false));
        }
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f == null || this.c.a()) {
            return;
        }
        this.f.getAdapter().registerDataSetObserver(this.c);
        this.c.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f == null || !this.c.a()) {
            return;
        }
        this.f.getAdapter().unregisterDataSetObserver(this.c);
        this.c.b(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.g == 0) {
            return;
        }
        int height = getHeight();
        int i = this.q;
        if (i > 0) {
            this.k.setStrokeWidth(i);
            this.k.setColor(this.s);
            for (int i2 = 0; i2 < this.g - 1; i2++) {
                View childAt = this.a.getChildAt(i2);
                canvas.drawLine(childAt.getRight(), this.r, childAt.getRight(), height - this.r, this.k);
            }
        }
        if (this.o > 0) {
            this.j.setColor(this.p);
            canvas.drawRect(this.w, height - this.o, this.a.getWidth() + this.x, height, this.j);
        }
        if (this.m > 0) {
            this.j.setColor(this.l);
            Pair<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            float fFloatValue = indicatorCoordinates.second.floatValue() - indicatorCoordinates.first.floatValue();
            float fFloatValue2 = indicatorCoordinates.first.floatValue() + (fFloatValue / 2.0f);
            int i3 = this.n;
            if (i3 > fFloatValue) {
                canvas.drawRect(indicatorCoordinates.first.floatValue() + this.w, height - this.m, indicatorCoordinates.second.floatValue() + this.w, height, this.j);
            } else {
                canvas.drawRect(fFloatValue2 - (i3 / 2), height - this.m, fFloatValue2 + (i3 / 2), height, this.j);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A && this.a.getChildCount() > 0) {
            int width = (getWidth() / 2) - (this.a.getChildAt(0).getMeasuredWidth() / 2);
            this.x = width;
            this.w = width;
        }
        boolean z2 = this.A;
        if (z2 || this.w > 0 || this.x > 0) {
            this.a.setMinimumWidth(z2 ? getWidth() : (getWidth() - this.w) - this.x);
            setClipToPadding(false);
        }
        setPadding(this.w, getPaddingTop(), this.x, getPaddingBottom());
        if (this.E == 0) {
            this.E = (getWidth() / 2) - this.w;
        }
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            this.h = viewPager.getCurrentItem();
        }
        this.i = 0.0f;
        n(this.h, 0);
        r(this.h);
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.a;
        this.h = i;
        if (i != 0 && this.a.getChildCount() > 0) {
            q(this.a.getChildAt(0));
            o(this.a.getChildAt(this.h));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.h;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        this.B = z;
    }

    public void setDividerColor(int i) {
        this.s = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.s = ContextCompat.getColor(getContext(), i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.r = i;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.q = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.l = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.l = ContextCompat.getColor(getContext(), i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.m = i;
        invalidate();
    }

    public void setIndicatorWidth(int i) {
        this.n = i;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mDelegatePageListener = onPageChangeListener;
    }

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.e = onTabReselectedListener;
    }

    public void setScrollOffset(int i) {
        this.E = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.y = z;
        if (this.f != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i) {
        this.G = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.t = i;
        s();
    }

    public void setTextColor(int i) {
        setTextColor(l(i));
    }

    public void setTextColorResource(int i) {
        setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setTextSize(int i) {
        this.u = i;
        s();
    }

    public void setTypeface(Typeface typeface, int i) {
        this.C = typeface;
        this.D = i;
        s();
    }

    public void setUnderlineColor(int i) {
        this.p = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.p = ContextCompat.getColor(getContext(), i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.o = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.z = viewPager.getAdapter() instanceof CustomTabProvider;
        viewPager.addOnPageChangeListener(this.d);
        viewPager.getAdapter().registerDataSetObserver(this.c);
        this.c.b(true);
        notifyDataSetChanged();
    }

    public class c extends DataSetObserver {
        private boolean a;

        private c() {
            this.a = false;
        }

        public boolean a() {
            return this.a;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.notifyDataSetChanged();
        }

        public /* synthetic */ c(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.v = colorStateList;
        s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        String str;
        LinearLayout.LayoutParams layoutParams;
        super(context, attributeSet, i);
        this.c = new c(this, 0 == true ? 1 : 0);
        this.d = new b(this, 0 == true ? 1 : 0);
        this.e = null;
        this.h = 0;
        this.i = 0.0f;
        this.m = 2;
        this.n = 60;
        this.o = 0;
        this.q = 0;
        this.r = 0;
        this.t = 12;
        this.u = 14;
        this.v = null;
        this.w = 0;
        this.x = 0;
        this.y = true;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = 1;
        this.F = 0;
        this.G = com.huami.watch.companionlib.R.drawable.psts_background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.a);
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.j.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.E = (int) TypedValue.applyDimension(1, this.E, displayMetrics);
        this.m = (int) TypedValue.applyDimension(1, this.m, displayMetrics);
        this.n = (int) TypedValue.applyDimension(1, this.n, displayMetrics);
        this.o = (int) TypedValue.applyDimension(1, this.o, displayMetrics);
        this.r = (int) TypedValue.applyDimension(1, this.r, displayMetrics);
        this.t = (int) TypedValue.applyDimension(1, this.t, displayMetrics);
        this.q = (int) TypedValue.applyDimension(1, this.q, displayMetrics);
        this.u = (int) TypedValue.applyDimension(2, this.u, displayMetrics);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setStrokeWidth(this.q);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H);
        int color = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#dd000000"));
        this.p = color;
        this.s = color;
        this.l = Color.parseColor("#99000000");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.w = dimensionPixelSize > 0 ? dimensionPixelSize : typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.x = dimensionPixelSize <= 0 ? typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.D = 0;
            str = "sans-serif-medium";
        } else {
            str = C.SANS_SERIF_NAME;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip);
        this.l = typedArrayObtainStyledAttributes2.getColor(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsIndicatorColor, this.l);
        this.m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsIndicatorHeight, this.m);
        this.n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsIndicatorWidth, this.n);
        this.p = typedArrayObtainStyledAttributes2.getColor(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsUnderlineColor, this.p);
        this.o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsUnderlineHeight, this.o);
        this.s = typedArrayObtainStyledAttributes2.getColor(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsDividerColor, this.s);
        this.q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsDividerWidth, this.q);
        this.r = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsDividerPadding, this.r);
        this.y = typedArrayObtainStyledAttributes2.getBoolean(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsShouldExpand, this.y);
        this.E = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsScrollOffset, this.E);
        this.A = typedArrayObtainStyledAttributes2.getBoolean(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsPaddingMiddle, this.A);
        this.t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.t);
        this.G = typedArrayObtainStyledAttributes2.getResourceId(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabBackground, this.G);
        this.u = typedArrayObtainStyledAttributes2.getDimensionPixelSize(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextSize, this.u);
        int i2 = com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextColor;
        this.v = typedArrayObtainStyledAttributes2.hasValue(i2) ? typedArrayObtainStyledAttributes2.getColorStateList(i2) : null;
        this.D = typedArrayObtainStyledAttributes2.getInt(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextStyle, this.D);
        this.B = typedArrayObtainStyledAttributes2.getBoolean(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextAllCaps, this.B);
        typedArrayObtainStyledAttributes2.getInt(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextAlpha, 150);
        String string = typedArrayObtainStyledAttributes2.getString(com.huami.watch.companionlib.R.styleable.PagerSlidingTabStrip_pstsTabTextFontFamily);
        typedArrayObtainStyledAttributes2.recycle();
        if (this.v == null) {
            int color2 = Color.parseColor("#4c000000");
            int color3 = Color.parseColor("#dd000000");
            this.v = m(color3, color3, color2);
        }
        this.C = Typeface.create(string != null ? string : str, this.D);
        p();
        if (this.y) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        this.b = layoutParams;
    }
}
