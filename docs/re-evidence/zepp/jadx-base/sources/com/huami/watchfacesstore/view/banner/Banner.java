package com.huami.watchfacesstore.view.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes17.dex */
public class Banner extends RelativeLayout {
    private static final long u = 2500;
    private static final long v = 800;
    private static final int w = 8;
    private static final int x = 2;
    private ViewPager2.OnPageChangeCallback a;
    private CompositePageTransformer b;
    private d c;
    private HolderRestLoader d;
    private ViewPager2 e;
    private Indicator f;
    private boolean g;
    private long h;
    private long i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final Runnable s;
    private RecyclerView.AdapterDataObserver t;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Banner.this.isAutoPlay()) {
                Banner.this.n++;
                if (Banner.this.n == Banner.this.o + Banner.this.q + 1) {
                    Banner.this.e.setCurrentItem(Banner.this.q, false);
                    Banner banner = Banner.this;
                    banner.post(banner.s);
                } else {
                    Banner.this.e.setCurrentItem(Banner.this.n);
                    Banner banner2 = Banner.this;
                    banner2.postDelayed(banner2.s, Banner.this.h);
                }
            }
        }
    }

    public class b extends RecyclerView.AdapterDataObserver {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (Banner.this.e == null || Banner.this.c == null) {
                return;
            }
            Banner.this.r();
            Banner banner = Banner.this;
            banner.u(banner.getCurrentPager());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int positionStart, int itemCount, @Nullable Object payload) {
            onChanged();
        }
    }

    public class c extends ViewOutlineProvider {
        public final /* synthetic */ float a;

        public c(final float val$radius) {
            this.a = val$radius;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    public class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private RecyclerView.Adapter a;

        private d() {
        }

        public void b(RecyclerView.Adapter adapter) {
            RecyclerView.Adapter adapter2 = this.a;
            if (adapter2 != null) {
                adapter2.unregisterAdapterDataObserver(Banner.this.t);
            }
            this.a = adapter;
            if (adapter != null) {
                adapter.registerAdapterDataObserver(Banner.this.t);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return Banner.this.o > 1 ? Banner.this.p : Banner.this.o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return this.a.getItemViewType(Banner.this.v(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            this.a.onBindViewHolder(holder, Banner.this.v(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return this.a.onCreateViewHolder(parent, viewType);
        }
    }

    public class e extends ViewPager2.OnPageChangeCallback {
        private e() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int state) {
            if (Banner.this.a != null) {
                Banner.this.a.onPageScrollStateChanged(state);
            }
            if (Banner.this.f != null) {
                Banner.this.f.onPageScrollStateChanged(state);
            }
            if (state == 1) {
                if (Banner.this.n == Banner.this.q - 1) {
                    Banner.this.e.setCurrentItem(Banner.this.o + Banner.this.n, false);
                } else if (Banner.this.n == Banner.this.p - Banner.this.q) {
                    Banner.this.e.setCurrentItem(Banner.this.q, false);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            int iV = Banner.this.v(position);
            if (Banner.this.a != null) {
                Banner.this.a.onPageScrolled(iV, positionOffset, positionOffsetPixels);
            }
            if (Banner.this.f != null) {
                Banner.this.f.onPageScrolled(iV, positionOffset, positionOffsetPixels);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            boolean z = true;
            if (Banner.this.n != Banner.this.q - 1 && Banner.this.n != Banner.this.p - (Banner.this.q - 1) && (position == Banner.this.n || Banner.this.p - Banner.this.n != Banner.this.q)) {
                z = false;
            }
            Banner.this.n = position;
            int iV = Banner.this.v(position);
            if (Banner.this.d != null) {
                Banner.this.d.onItemRestLoader(iV, z);
            }
            if (z) {
                return;
            }
            if (Banner.this.a != null) {
                Banner.this.a.onPageSelected(iV);
            }
            if (Banner.this.f != null) {
                Banner.this.f.onPageSelected(iV);
            }
        }
    }

    public class f extends LinearLayoutManager {
        private RecyclerView.LayoutManager a;

        public class a extends LinearSmoothScroller {
            public a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForDeceleration(int dx) {
                return (int) (Banner.this.i * 0.6644d);
            }
        }

        public f(Context context, LinearLayoutManager layoutManager) {
            super(context, layoutManager.getOrientation(), false);
            this.a = layoutManager;
        }

        private int a() {
            int height;
            int paddingBottom;
            RecyclerView recyclerView = (RecyclerView) Banner.this.e.getChildAt(0);
            if (getOrientation() == 0) {
                height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
                paddingBottom = recyclerView.getPaddingRight();
            } else {
                height = recyclerView.getHeight() - recyclerView.getPaddingTop();
                paddingBottom = recyclerView.getPaddingBottom();
            }
            return height - paddingBottom;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] extraLayoutSpace) {
            int offscreenPageLimit = Banner.this.e.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, extraLayoutSpace);
                return;
            }
            int iA = a() * offscreenPageLimit;
            extraLayoutSpace[0] = iA;
            extraLayoutSpace[1] = iA;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat info) {
            this.a.onInitializeAccessibilityNodeInfo(recycler, state, info);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int action, @Nullable Bundle args) {
            return this.a.performAccessibilityAction(recycler, state, action, args);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView parent, @NonNull View child, @NonNull Rect rect, boolean immediate, boolean focusedChildVisible) {
            return this.a.requestChildRectangleOnScreen(parent, child, rect, immediate, focusedChildVisible);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
            a aVar = new a(recyclerView.getContext());
            aVar.setTargetPosition(position);
            startSmoothScroll(aVar);
        }
    }

    public Banner(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        RecyclerView.Adapter adapter = this.c.a;
        if (adapter == null || adapter.getItemCount() == 0) {
            this.o = 0;
            this.p = 0;
        } else {
            int itemCount = adapter.getItemCount();
            this.o = itemCount;
            this.p = itemCount + this.r;
        }
        this.q = this.r / 2;
    }

    private void s() {
        try {
            RecyclerView recyclerView = (RecyclerView) this.e.getChildAt(0);
            recyclerView.setOverScrollMode(2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            f fVar = new f(getContext(), linearLayoutManager);
            recyclerView.setLayoutManager(fVar);
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            declaredField.set(linearLayoutManager, recyclerView);
            Field declaredField2 = ViewPager2.class.getDeclaredField("mLayoutManager");
            declaredField2.setAccessible(true);
            declaredField2.set(this.e, fVar);
            Field declaredField3 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField3.setAccessible(true);
            Object obj = declaredField3.get(this.e);
            if (obj != null) {
                Field declaredField4 = obj.getClass().getDeclaredField("mLayoutManager");
                declaredField4.setAccessible(true);
                declaredField4.set(obj, fVar);
            }
            Field declaredField5 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
            declaredField5.setAccessible(true);
            Object obj2 = declaredField5.get(this.e);
            if (obj2 != null) {
                Field declaredField6 = obj2.getClass().getDeclaredField("mLayoutManager");
                declaredField6.setAccessible(true);
                declaredField6.set(obj2, fVar);
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.e = viewPager2;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager3 = this.e;
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        this.b = compositePageTransformer;
        viewPager3.setPageTransformer(compositePageTransformer);
        this.c = new d();
        this.e.registerOnPageChangeCallback(new e());
        s();
        addView(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public void u(int startPosition) {
        RecyclerView.Adapter adapter = this.e.getAdapter();
        if (adapter == null || this.q == 2) {
            this.e.setAdapter(this.c);
        } else {
            adapter.notifyDataSetChanged();
        }
        this.n = startPosition + this.q;
        this.e.setUserInputEnabled(this.o > 1);
        this.e.setCurrentItem(this.n, false);
        Indicator indicator = this.f;
        if (indicator != null) {
            indicator.initIndicatorCount(this.o);
        }
        if (isAutoPlay()) {
            startTurning();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v(int position) {
        int i = this.o;
        int i2 = i != 0 ? (position - this.q) % i : 0;
        return i2 < 0 ? i2 + i : i2;
    }

    public Banner addItemDecoration(@NonNull RecyclerView.ItemDecoration decor) {
        this.e.addItemDecoration(decor);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (isAutoPlay() && this.e.isUserInputEnabled()) {
            int action = ev.getAction();
            if (action == 1 || action == 3 || action == 4) {
                startTurning();
            } else if (action == 0) {
                stopTurning();
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    public RecyclerView.Adapter getAdapter() {
        return this.c.a;
    }

    public int getCurrentPager() {
        return Math.max(v(this.n), 0);
    }

    public ViewPager2 getViewPager2() {
        return this.e;
    }

    public boolean isAutoPlay() {
        return this.g && this.o > 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAutoPlay()) {
            startTurning();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isAutoPlay()) {
            stopTurning();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 0) {
            float rawX = ev.getRawX();
            this.j = rawX;
            this.l = rawX;
            float rawY = ev.getRawY();
            this.k = rawY;
            this.m = rawY;
        } else {
            boolean z = false;
            if (action == 2) {
                this.j = ev.getRawX();
                this.k = ev.getRawY();
                if (this.e.isUserInputEnabled()) {
                    float fAbs = Math.abs(this.j - this.l);
                    float fAbs2 = Math.abs(this.k - this.m);
                    if (this.e.getOrientation() != 0 ? !(fAbs2 <= 8.0f || fAbs2 <= fAbs) : !(fAbs <= 8.0f || fAbs <= fAbs2)) {
                        z = true;
                    }
                    getParent().requestDisallowInterceptTouchEvent(z);
                }
            } else if (action == 3 || action == 1) {
                return Math.abs(this.j - this.l) > 8.0f || Math.abs(this.k - this.m) > 8.0f;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        setAdapter(adapter, 0);
    }

    public Banner setAutoPlay(boolean autoPlay) {
        this.g = autoPlay;
        if (autoPlay && this.o > 1) {
            startTurning();
        }
        return this;
    }

    public Banner setAutoTurningTime(long autoTurningTime) {
        this.h = autoTurningTime;
        return this;
    }

    public Banner setHolderRestLoader(HolderRestLoader holderRestLoader) {
        this.d = holderRestLoader;
        return this;
    }

    public Banner setIndicator(Indicator indicator) {
        return setIndicator(indicator, true);
    }

    public Banner setOffscreenPageLimit(int limit) {
        this.e.setOffscreenPageLimit(limit);
        return this;
    }

    public Banner setOrientation(int orientation) {
        this.e.setOrientation(orientation);
        return this;
    }

    public Banner setOuterPageChangeListener(ViewPager2.OnPageChangeCallback listener) {
        this.a = listener;
        return this;
    }

    public Banner setPageMargin(int multiWidth, int pageMargin) {
        return setPageMargin(multiWidth, multiWidth, pageMargin);
    }

    public Banner setPageTransformer(ViewPager2.PageTransformer transformer) {
        this.b.addTransformer(transformer);
        return this;
    }

    public Banner setPagerScrollDuration(long pagerScrollDuration) {
        this.i = pagerScrollDuration;
        return this;
    }

    @RequiresApi(api = 21)
    public Banner setRoundCorners(final float radius) {
        setOutlineProvider(new c(radius));
        setClipToOutline(true);
        return this;
    }

    public void startTurning() {
        stopTurning();
        postDelayed(this.s, this.h);
    }

    public void stopTurning() {
        removeCallbacks(this.s);
    }

    public Banner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Banner addItemDecoration(@NonNull RecyclerView.ItemDecoration decor, int index) {
        this.e.addItemDecoration(decor, index);
        return this;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter, int startPosition) {
        this.c.b(adapter);
        r();
        u(startPosition);
    }

    public Banner setIndicator(Indicator indicator, boolean attachToRoot) {
        Indicator indicator2 = this.f;
        if (indicator2 != null) {
            removeView(indicator2.getView());
        }
        if (indicator != null) {
            this.f = indicator;
            if (attachToRoot) {
                addView(indicator.getView(), this.f.getParams());
            }
        }
        return this;
    }

    public Banner setPageMargin(int tlWidth, int brWidth, int pageMargin) {
        this.b.addTransformer(new MarginPageTransformer(pageMargin));
        RecyclerView recyclerView = (RecyclerView) this.e.getChildAt(0);
        if (this.e.getOrientation() == 1) {
            recyclerView.setPadding(this.e.getPaddingLeft(), tlWidth + Math.abs(pageMargin), this.e.getPaddingRight(), brWidth + Math.abs(pageMargin));
        } else {
            recyclerView.setPadding(tlWidth + Math.abs(pageMargin), this.e.getPaddingTop(), brWidth + Math.abs(pageMargin), this.e.getPaddingBottom());
        }
        recyclerView.setClipToPadding(false);
        setOffscreenPageLimit(1);
        this.r = 4;
        return this;
    }

    public Banner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.g = true;
        this.h = u;
        this.i = v;
        this.r = 2;
        this.s = new a();
        this.t = new b();
        t(context);
    }
}
