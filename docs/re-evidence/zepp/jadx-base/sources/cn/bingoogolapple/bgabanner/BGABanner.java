package cn.bingoogolapple.bgabanner;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import cn.bingoogolapple.bgabanner.transformer.BGAPageTransformer;
import cn.bingoogolapple.bgabanner.transformer.TransitionEffect;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public class BGABanner extends RelativeLayout implements BGAViewPager.AutoPlayDelegate, ViewPager.OnPageChangeListener {
    private static final int R = -1;
    private static final int S = -2;
    private static final int T = -2;
    private static final int U = -1;
    private static final int V = 400;
    private static final ImageView.ScaleType[] W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Adapter A;
    private int B;
    private ViewPager.OnPageChangeListener C;
    private boolean D;
    private TextView E;
    private int F;
    private int G;
    private Drawable H;
    private boolean I;
    private int J;
    private float K;
    private boolean L;
    private View M;
    private View N;
    private GuideDelegate O;
    private boolean P;
    private BGAOnNoDoubleClickListener Q;
    private BGAViewPager a;
    private List<View> b;
    private List<View> c;
    private List<String> d;
    private LinearLayout e;
    private TextView f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private Drawable q;
    private b r;
    private int s;
    private float t;
    private TransitionEffect u;
    private ImageView v;
    private ImageView.ScaleType w;
    private int x;
    private List<? extends Object> y;
    private Delegate z;

    public interface Adapter<V extends View, M> {
        void fillBannerItem(BGABanner bGABanner, V v, @Nullable M m, int i);
    }

    public interface Delegate<V extends View, M> {
        void onBannerItemClick(BGABanner bGABanner, V v, @Nullable M m, int i);
    }

    public interface GuideDelegate {
        void onClickEnterOrSkip();
    }

    public class a extends BGAOnNoDoubleClickListener {
        public a() {
        }

        @Override // cn.bingoogolapple.bgabanner.BGAOnNoDoubleClickListener
        public void onNoDoubleClick(View view) {
            if (BGABanner.this.O != null) {
                BGABanner.this.O.onClickEnterOrSkip();
            }
        }
    }

    public static class b implements Runnable {
        private final WeakReference<BGABanner> a;

        public /* synthetic */ b(BGABanner bGABanner, a aVar) {
            this(bGABanner);
        }

        @Override // java.lang.Runnable
        public void run() {
            BGABanner bGABanner = this.a.get();
            if (bGABanner != null) {
                bGABanner.r();
                bGABanner.startAutoPlay();
            }
        }

        private b(BGABanner bGABanner) {
            this.a = new WeakReference<>(bGABanner);
        }
    }

    public class c extends PagerAdapter {

        public class a extends BGAOnNoDoubleClickListener {
            public a() {
            }

            @Override // cn.bingoogolapple.bgabanner.BGAOnNoDoubleClickListener
            public void onNoDoubleClick(View view) {
                int currentItem = BGABanner.this.a.getCurrentItem() % BGABanner.this.c.size();
                if (BGABannerUtil.isIndexNotOutOfBounds(currentItem, BGABanner.this.y)) {
                    Delegate delegate = BGABanner.this.z;
                    BGABanner bGABanner = BGABanner.this;
                    delegate.onBannerItemClick(bGABanner, view, bGABanner.y.get(currentItem), currentItem);
                } else if (BGABannerUtil.isCollectionEmpty(BGABanner.this.y, new Collection[0])) {
                    BGABanner.this.z.onBannerItemClick(BGABanner.this, view, null, currentItem);
                }
            }
        }

        private c() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            if (BGABanner.this.c == null) {
                return 0;
            }
            if (BGABanner.this.g) {
                return Integer.MAX_VALUE;
            }
            return BGABanner.this.c.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            if (BGABannerUtil.isCollectionEmpty(BGABanner.this.c, new Collection[0])) {
                return null;
            }
            int size = i % BGABanner.this.c.size();
            View view = BGABanner.this.b == null ? (View) BGABanner.this.c.get(size) : (View) BGABanner.this.b.get(i % BGABanner.this.b.size());
            if (BGABanner.this.z != null) {
                view.setOnClickListener(new a());
            }
            if (BGABanner.this.A != null) {
                if (BGABannerUtil.isIndexNotOutOfBounds(size, BGABanner.this.y)) {
                    Adapter adapter = BGABanner.this.A;
                    BGABanner bGABanner = BGABanner.this;
                    adapter.fillBannerItem(bGABanner, view, bGABanner.y.get(size), size);
                } else if (BGABannerUtil.isCollectionEmpty(BGABanner.this.y, new Collection[0])) {
                    BGABanner.this.A.fillBannerItem(BGABanner.this, view, null, size);
                }
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public /* synthetic */ c(BGABanner bGABanner, a aVar) {
            this();
        }
    }

    public BGABanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j(int i, float f) {
        if (this.N == null && this.M == null) {
            return;
        }
        if (i != getItemCount() - 2) {
            if (i == getItemCount() - 1) {
                View view = this.M;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.N;
                if (view2 != null) {
                    view2.setVisibility(0);
                    ViewCompat.setAlpha(this.N, 1.0f);
                    return;
                }
                return;
            }
            View view3 = this.M;
            if (view3 != null) {
                view3.setVisibility(0);
                ViewCompat.setAlpha(this.M, 1.0f);
            }
            View view4 = this.N;
            if (view4 != null) {
                view4.setVisibility(8);
                return;
            }
            return;
        }
        View view5 = this.N;
        if (view5 != null) {
            ViewCompat.setAlpha(view5, f);
        }
        View view6 = this.M;
        if (view6 != null) {
            ViewCompat.setAlpha(view6, 1.0f - f);
        }
        if (f > 0.5f) {
            View view7 = this.N;
            if (view7 != null) {
                view7.setVisibility(0);
            }
            View view8 = this.M;
            if (view8 != null) {
                view8.setVisibility(8);
                return;
            }
            return;
        }
        View view9 = this.N;
        if (view9 != null) {
            view9.setVisibility(8);
        }
        View view10 = this.M;
        if (view10 != null) {
            view10.setVisibility(0);
        }
    }

    private void k(int i, TypedArray typedArray) {
        int i2;
        if (i == R.styleable.BGABanner_banner_pointDrawable) {
            this.p = typedArray.getResourceId(i, R.drawable.bga_banner_selector_point_solid);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointContainerBackground) {
            this.q = typedArray.getDrawable(i);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointLeftRightMargin) {
            this.k = typedArray.getDimensionPixelSize(i, this.k);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointContainerLeftRightPadding) {
            this.m = typedArray.getDimensionPixelSize(i, this.m);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointTopBottomMargin) {
            this.l = typedArray.getDimensionPixelSize(i, this.l);
            return;
        }
        if (i == R.styleable.BGABanner_banner_indicatorGravity) {
            this.j = typedArray.getInt(i, this.j);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointAutoPlayAble) {
            this.g = typedArray.getBoolean(i, this.g);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pointAutoPlayInterval) {
            this.h = typedArray.getInteger(i, this.h);
            return;
        }
        if (i == R.styleable.BGABanner_banner_pageChangeDuration) {
            this.i = typedArray.getInteger(i, this.i);
            return;
        }
        if (i == R.styleable.BGABanner_banner_transitionEffect) {
            this.u = TransitionEffect.values()[typedArray.getInt(i, TransitionEffect.Accordion.ordinal())];
            return;
        }
        if (i == R.styleable.BGABanner_banner_tipTextColor) {
            this.o = typedArray.getColor(i, this.o);
            return;
        }
        if (i == R.styleable.BGABanner_banner_tipTextSize) {
            this.n = typedArray.getDimensionPixelSize(i, this.n);
            return;
        }
        if (i == R.styleable.BGABanner_banner_placeholderDrawable) {
            this.x = typedArray.getResourceId(i, this.x);
            return;
        }
        if (i == R.styleable.BGABanner_banner_isNumberIndicator) {
            this.D = typedArray.getBoolean(i, this.D);
            return;
        }
        if (i == R.styleable.BGABanner_banner_numberIndicatorTextColor) {
            this.F = typedArray.getColor(i, this.F);
            return;
        }
        if (i == R.styleable.BGABanner_banner_numberIndicatorTextSize) {
            this.G = typedArray.getDimensionPixelSize(i, this.G);
            return;
        }
        if (i == R.styleable.BGABanner_banner_numberIndicatorBackground) {
            this.H = typedArray.getDrawable(i);
            return;
        }
        if (i == R.styleable.BGABanner_banner_isNeedShowIndicatorOnOnlyOnePage) {
            this.I = typedArray.getBoolean(i, this.I);
            return;
        }
        if (i == R.styleable.BGABanner_banner_contentBottomMargin) {
            this.J = typedArray.getDimensionPixelSize(i, this.J);
            return;
        }
        if (i == R.styleable.BGABanner_banner_aspectRatio) {
            this.K = typedArray.getFloat(i, this.K);
            return;
        }
        if (i != R.styleable.BGABanner_android_scaleType || (i2 = typedArray.getInt(i, -1)) < 0) {
            return;
        }
        ImageView.ScaleType[] scaleTypeArr = W;
        if (i2 < scaleTypeArr.length) {
            this.w = scaleTypeArr[i2];
        }
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BGABanner);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            k(typedArrayObtainStyledAttributes.getIndex(i), typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void m(Context context) {
        this.r = new b(this, null);
        this.k = BGABannerUtil.dp2px(context, 3.0f);
        this.l = BGABannerUtil.dp2px(context, 6.0f);
        this.m = BGABannerUtil.dp2px(context, 10.0f);
        this.n = BGABannerUtil.sp2px(context, 10.0f);
        this.q = new ColorDrawable(Color.parseColor("#44aaaaaa"));
        this.u = TransitionEffect.Default;
        this.G = BGABannerUtil.sp2px(context, 10.0f);
        this.J = 0;
        this.K = 0.0f;
    }

    private void n() {
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            boolean z = this.I;
            if (z || (!z && this.c.size() > 1)) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int i = this.k;
                layoutParams.setMargins(i, 0, i, 0);
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    ImageView imageView = new ImageView(getContext());
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageResource(this.p);
                    this.e.addView(imageView);
                }
            }
        }
        if (this.E != null) {
            boolean z2 = this.I;
            if (z2 || (!z2 && this.c.size() > 1)) {
                this.E.setVisibility(0);
            } else {
                this.E.setVisibility(4);
            }
        }
    }

    private void o(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            relativeLayout.setBackground(this.q);
        } else {
            relativeLayout.setBackgroundDrawable(this.q);
        }
        int i2 = this.m;
        int i3 = this.l;
        relativeLayout.setPadding(i2, i3, i2, i3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if ((this.j & 112) == 48) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(12);
        }
        addView(relativeLayout, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        if (this.D) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setId(R.id.banner_indicatorId);
            this.E.setGravity(16);
            this.E.setSingleLine(true);
            this.E.setEllipsize(TextUtils.TruncateAt.END);
            this.E.setTextColor(this.F);
            this.E.setTextSize(0, this.G);
            this.E.setVisibility(4);
            Drawable drawable = this.H;
            if (drawable != null) {
                if (i >= 16) {
                    this.E.setBackground(drawable);
                } else {
                    this.E.setBackgroundDrawable(drawable);
                }
            }
            relativeLayout.addView(this.E, layoutParams2);
        } else {
            LinearLayout linearLayout = new LinearLayout(context);
            this.e = linearLayout;
            linearLayout.setId(R.id.banner_indicatorId);
            this.e.setOrientation(0);
            this.e.setGravity(16);
            relativeLayout.addView(this.e, layoutParams2);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(15);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setGravity(16);
        this.f.setSingleLine(true);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        this.f.setTextColor(this.o);
        this.f.setTextSize(0, this.n);
        relativeLayout.addView(this.f, layoutParams3);
        int i4 = this.j & 7;
        if (i4 == 3) {
            layoutParams2.addRule(9);
            layoutParams3.addRule(1, R.id.banner_indicatorId);
            this.f.setGravity(21);
        } else if (i4 == 5) {
            layoutParams2.addRule(11);
            layoutParams3.addRule(0, R.id.banner_indicatorId);
        } else {
            layoutParams2.addRule(14);
            layoutParams3.addRule(0, R.id.banner_indicatorId);
        }
        showPlaceholder();
    }

    private void p() {
        BGAViewPager bGAViewPager = this.a;
        a aVar = null;
        if (bGAViewPager != null && equals(bGAViewPager.getParent())) {
            removeView(this.a);
            this.a = null;
        }
        BGAViewPager bGAViewPager2 = new BGAViewPager(getContext());
        this.a = bGAViewPager2;
        bGAViewPager2.setOffscreenPageLimit(1);
        this.a.setAdapter(new c(this, aVar));
        this.a.addOnPageChangeListener(this);
        this.a.setOverScrollMode(this.B);
        this.a.setAllowUserScrollable(this.L);
        this.a.setPageTransformer(true, BGAPageTransformer.getPageTransformer(this.u));
        setPageChangeDuration(this.i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, this.J);
        addView(this.a, 0, layoutParams);
        if (!this.g) {
            s(0);
            return;
        }
        this.a.setAutoPlayDelegate(this);
        this.a.setCurrentItem(LockFreeTaskQueueCore.MAX_CAPACITY_MASK - (LockFreeTaskQueueCore.MAX_CAPACITY_MASK % this.c.size()));
        startAutoPlay();
    }

    private void q() {
        stopAutoPlay();
        if (!this.P && this.g && this.a != null && getItemCount() > 0 && this.t != 0.0f) {
            BGAViewPager bGAViewPager = this.a;
            bGAViewPager.setCurrentItem(bGAViewPager.getCurrentItem() - 1);
            BGAViewPager bGAViewPager2 = this.a;
            bGAViewPager2.setCurrentItem(bGAViewPager2.getCurrentItem() + 1);
        }
        this.P = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager != null) {
            bGAViewPager.setCurrentItem(bGAViewPager.getCurrentItem() + 1);
        }
    }

    private void s(int i) {
        boolean z;
        boolean z2;
        if (this.f != null) {
            List<String> list = this.d;
            if (list == null || list.size() < 1 || i >= this.d.size()) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setText(this.d.get(i));
            }
        }
        if (this.e != null) {
            List<View> list2 = this.c;
            if (list2 == null || list2.size() <= 0 || i >= this.c.size() || (!(z2 = this.I) && (z2 || this.c.size() <= 1))) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                int i2 = 0;
                while (i2 < this.e.getChildCount()) {
                    this.e.getChildAt(i2).setEnabled(i2 == i);
                    this.e.getChildAt(i2).requestLayout();
                    i2++;
                }
            }
        }
        if (this.E != null) {
            List<View> list3 = this.c;
            if (list3 == null || list3.size() <= 0 || i >= this.c.size() || (!(z = this.I) && (z || this.c.size() <= 1))) {
                this.E.setVisibility(8);
                return;
            }
            this.E.setVisibility(0);
            this.E.setText((i + 1) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.c.size());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            int action = motionEvent.getAction();
            if (action == 0) {
                stopAutoPlay();
            } else if (action == 1 || action == 3) {
                startAutoPlay();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentItem() {
        if (this.a == null || BGABannerUtil.isCollectionEmpty(this.c, new Collection[0])) {
            return -1;
        }
        return this.a.getCurrentItem() % this.c.size();
    }

    public int getItemCount() {
        List<View> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public ImageView getItemImageView(int i) {
        return (ImageView) getItemView(i);
    }

    public <VT extends View> VT getItemView(int i) {
        List<View> list = this.c;
        if (list == null) {
            return null;
        }
        return (VT) list.get(i);
    }

    public List<String> getTips() {
        return this.d;
    }

    public BGAViewPager getViewPager() {
        return this.a;
    }

    public List<? extends View> getViews() {
        return this.c;
    }

    @Override // cn.bingoogolapple.bgabanner.BGAViewPager.AutoPlayDelegate
    public void handleAutoPlayActionUpOrCancel(float f) {
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager != null) {
            if (this.s < bGAViewPager.getCurrentItem()) {
                if (f > 400.0f || (this.t < 0.7f && f > -400.0f)) {
                    this.a.setBannerCurrentItemInternal(this.s, true);
                    return;
                } else {
                    this.a.setBannerCurrentItemInternal(this.s + 1, true);
                    return;
                }
            }
            if (f < -400.0f || (this.t > 0.3f && f < 400.0f)) {
                this.a.setBannerCurrentItemInternal(this.s + 1, true);
            } else {
                this.a.setBannerCurrentItemInternal(this.s, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAutoPlay();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.K > 0.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.K), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.C;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        j(i, f);
        this.s = i;
        this.t = f;
        if (this.f != null) {
            if (BGABannerUtil.isCollectionNotEmpty(this.d, new Collection[0])) {
                this.f.setVisibility(0);
                int size = i % this.d.size();
                int size2 = (i + 1) % this.d.size();
                if (size2 < this.d.size() && size < this.d.size()) {
                    if (f > 0.5d) {
                        this.f.setText(this.d.get(size2));
                        ViewCompat.setAlpha(this.f, f);
                    } else {
                        ViewCompat.setAlpha(this.f, 1.0f - f);
                        this.f.setText(this.d.get(size));
                    }
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.C;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i % this.c.size(), f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int size = i % this.c.size();
        s(size);
        ViewPager.OnPageChangeListener onPageChangeListener = this.C;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(size);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            startAutoPlay();
        } else if (i == 4 || i == 8) {
            q();
        }
    }

    public void removePlaceholder() {
        ImageView imageView = this.v;
        if (imageView == null || !equals(imageView.getParent())) {
            return;
        }
        removeView(this.v);
        this.v = null;
    }

    public void setAdapter(Adapter adapter) {
        this.A = adapter;
    }

    public void setAllowUserScrollable(boolean z) {
        this.L = z;
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager != null) {
            bGAViewPager.setAllowUserScrollable(z);
        }
    }

    public void setAspectRatio(float f) {
        this.K = f;
        requestLayout();
    }

    public void setAutoPlayAble(boolean z) {
        this.g = z;
        stopAutoPlay();
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager == null || bGAViewPager.getAdapter() == null) {
            return;
        }
        this.a.getAdapter().notifyDataSetChanged();
    }

    public void setAutoPlayInterval(int i) {
        this.h = i;
    }

    public void setCurrentItem(int i) {
        if (this.a == null || this.c == null) {
            return;
        }
        if (i > getItemCount() - 1) {
            return;
        }
        if (!this.g) {
            this.a.setCurrentItem(i, false);
            return;
        }
        int currentItem = this.a.getCurrentItem();
        int size = i - (currentItem % this.c.size());
        if (size < 0) {
            for (int i2 = -1; i2 >= size; i2--) {
                this.a.setCurrentItem(currentItem + i2, false);
            }
        } else if (size > 0) {
            for (int i3 = 1; i3 <= size; i3++) {
                this.a.setCurrentItem(currentItem + i3, false);
            }
        }
        startAutoPlay();
    }

    public void setData(List<View> list, List<? extends Object> list2, List<String> list3) {
        if (BGABannerUtil.isCollectionEmpty(list, new Collection[0])) {
            this.g = false;
            list = new ArrayList<>();
            list2 = new ArrayList<>();
            list3 = new ArrayList<>();
        }
        if (this.g && list.size() < 3 && this.b == null) {
            this.g = false;
        }
        this.y = list2;
        this.c = list;
        this.d = list3;
        n();
        p();
        removePlaceholder();
    }

    public void setDelegate(Delegate delegate) {
        this.z = delegate;
    }

    public void setEnterSkipViewId(int i, int i2) {
        if (i != 0) {
            this.N = ((Activity) getContext()).findViewById(i);
        }
        if (i2 != 0) {
            this.M = ((Activity) getContext()).findViewById(i2);
        }
    }

    public void setEnterSkipViewIdAndDelegate(int i, int i2, GuideDelegate guideDelegate) {
        if (guideDelegate != null) {
            this.O = guideDelegate;
            if (i != 0) {
                View viewFindViewById = ((Activity) getContext()).findViewById(i);
                this.N = viewFindViewById;
                viewFindViewById.setOnClickListener(this.Q);
            }
            if (i2 != 0) {
                View viewFindViewById2 = ((Activity) getContext()).findViewById(i2);
                this.M = viewFindViewById2;
                viewFindViewById2.setOnClickListener(this.Q);
            }
        }
    }

    public void setIsNeedShowIndicatorOnOnlyOnePage(boolean z) {
        this.I = z;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.C = onPageChangeListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        this.B = i;
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager != null) {
            bGAViewPager.setOverScrollMode(i);
        }
    }

    public void setPageChangeDuration(int i) {
        if (i < 0 || i > 2000) {
            return;
        }
        this.i = i;
        BGAViewPager bGAViewPager = this.a;
        if (bGAViewPager != null) {
            bGAViewPager.setPageChangeDuration(i);
        }
    }

    public void setPageTransformer(ViewPager.PageTransformer pageTransformer) {
        BGAViewPager bGAViewPager;
        if (pageTransformer == null || (bGAViewPager = this.a) == null) {
            return;
        }
        bGAViewPager.setPageTransformer(true, pageTransformer);
    }

    public void setTransitionEffect(TransitionEffect transitionEffect) {
        this.u = transitionEffect;
        if (this.a != null) {
            p();
            List<View> list = this.b;
            if (list == null) {
                BGABannerUtil.resetPageTransformer(this.c);
            } else {
                BGABannerUtil.resetPageTransformer(list);
            }
        }
    }

    public void showPlaceholder() {
        if (this.v != null || this.x == -1) {
            return;
        }
        this.v = BGABannerUtil.getItemImageView(getContext(), this.x, new BGALocalImageSize(720, 360, 640.0f, 320.0f), this.w);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, this.J);
        addView(this.v, layoutParams);
    }

    public void startAutoPlay() {
        stopAutoPlay();
        if (this.g) {
            postDelayed(this.r, this.h);
        }
    }

    public void stopAutoPlay() {
        b bVar = this.r;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public BGABanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = true;
        this.h = 3000;
        this.i = 800;
        this.j = 81;
        this.o = -1;
        this.p = R.drawable.bga_banner_selector_point_solid;
        this.w = ImageView.ScaleType.CENTER_CROP;
        this.x = -1;
        this.B = 2;
        this.D = false;
        this.F = -1;
        this.L = true;
        this.P = true;
        this.Q = new a();
        m(context);
        l(context, attributeSet);
        o(context);
    }

    public void setData(@LayoutRes int i, List<? extends Object> list, List<String> list2) {
        this.c = new ArrayList();
        if (list == null) {
            list = new ArrayList<>();
            list2 = new ArrayList<>();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.c.add(View.inflate(getContext(), i, null));
        }
        if (this.g && this.c.size() < 3) {
            ArrayList arrayList = new ArrayList(this.c);
            this.b = arrayList;
            arrayList.add(View.inflate(getContext(), i, null));
            if (this.b.size() == 2) {
                this.b.add(View.inflate(getContext(), i, null));
            }
        }
        setData(this.c, list, list2);
    }

    public void setData(List<? extends Object> list, List<String> list2) {
        setData(R.layout.bga_banner_item_image, list, list2);
    }

    public void setData(List<View> list) {
        setData(list, (List<? extends Object>) null, (List<String>) null);
    }

    public void setData(@Nullable BGALocalImageSize bGALocalImageSize, @Nullable ImageView.ScaleType scaleType, @DrawableRes int... iArr) {
        if (bGALocalImageSize == null) {
            bGALocalImageSize = new BGALocalImageSize(720, 1280, 320.0f, 640.0f);
        }
        if (scaleType != null) {
            this.w = scaleType;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(BGABannerUtil.getItemImageView(getContext(), i, bGALocalImageSize, this.w));
        }
        setData(arrayList);
    }
}
