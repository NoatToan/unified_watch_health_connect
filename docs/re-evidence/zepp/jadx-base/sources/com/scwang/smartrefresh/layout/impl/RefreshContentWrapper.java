package com.scwang.smartrefresh.layout.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.PagerAdapterWrapper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class RefreshContentWrapper implements RefreshContent {
    public static final String TAG_REFRESH_CONTENT_WRAPPER = "TAG_REFRESH_CONTENT_WRAPPER";
    public View mContentView;
    public View mFixedFooter;
    public View mFixedHeader;
    public MotionEvent mMotionEvent;
    public View mRealContentView;
    public View mScrollableView;
    public int mHeaderHeight = Integer.MAX_VALUE;
    public int mFooterHeight = Integer.MAX_VALUE - 1;
    public boolean mEnableRefresh = true;
    public boolean mEnableLoadmore = true;
    public ScrollBoundaryDeciderAdapter mBoundaryAdapter = new ScrollBoundaryDeciderAdapter();

    public class AbsListViewScrollComponent implements AbsListView.OnScrollListener {
        public int a;
        public int b;
        public int c;
        public int d;
        public RefreshKernel e;
        public SparseArray<a> f = new SparseArray<>(0);
        public AbsListView.OnScrollListener g;

        public class a {
            public int a = 0;
            public int b = 0;

            public a() {
            }
        }

        public AbsListViewScrollComponent(RefreshKernel refreshKernel) {
            this.e = refreshKernel;
        }

        public void a(AbsListView absListView) {
            Field[] declaredFields = AbsListView.class.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (AbsListView.OnScrollListener.class.equals(field.getType())) {
                        try {
                            field.setAccessible(true);
                            Object obj = field.get(absListView);
                            if (obj != null && !absListView.equals(obj)) {
                                this.g = (AbsListView.OnScrollListener) obj;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            absListView.setOnScrollListener(this);
        }

        public int getScrollY(AbsListView absListView, int i) {
            View childAt = absListView.getChildAt(0);
            if (childAt == null) {
                return 0;
            }
            a aVar = this.f.get(i);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.a = childAt.getHeight();
            aVar.b = childAt.getTop();
            this.f.append(i, aVar);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                a aVar2 = this.f.get(i4);
                if (aVar2 != null) {
                    i3 = aVar2.a;
                }
                i2 += i3;
            }
            a aVar3 = this.f.get(i);
            if (aVar3 == null) {
                aVar3 = new a();
            }
            return i2 - aVar3.b;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            int lastVisiblePosition;
            AbsListView.OnScrollListener onScrollListener = this.g;
            if (onScrollListener != null) {
                onScrollListener.onScroll(absListView, i, i2, i3);
            }
            this.c = this.a;
            this.d = this.b;
            int scrollY = getScrollY(absListView, i);
            this.a = scrollY;
            int i4 = this.c - scrollY;
            this.b = i4;
            int i5 = this.d + i4;
            if (i3 <= 0 || RefreshContentWrapper.this.mMotionEvent != null) {
                return;
            }
            RefreshLayout refreshLayout = this.e.getRefreshLayout();
            if (i5 > 0) {
                if (i == 0 && refreshLayout.isEnableRefresh()) {
                    if ((refreshLayout.isEnableOverScrollBounce() || refreshLayout.isRefreshing()) && !ScrollBoundaryUtil.canScrollUp(absListView)) {
                        this.e.animSpinnerBounce(Math.min(i5, RefreshContentWrapper.this.mHeaderHeight));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i5 >= 0 || (lastVisiblePosition = absListView.getLastVisiblePosition()) != i3 - 1 || lastVisiblePosition <= 0 || !refreshLayout.isEnableLoadmore() || ScrollBoundaryUtil.canScrollDown(absListView)) {
                return;
            }
            if (refreshLayout.getState() == RefreshState.None && refreshLayout.isEnableAutoLoadmore() && !refreshLayout.isLoadmoreFinished() && !refreshLayout.isEnablePureScrollMode()) {
                refreshLayout.autoLoadmore(0, 1.0f);
            } else if (refreshLayout.isEnableOverScrollBounce() || refreshLayout.isLoading()) {
                this.e.animSpinnerBounce(Math.max(i5, -RefreshContentWrapper.this.mFooterHeight));
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            AbsListView.OnScrollListener onScrollListener = this.g;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i);
            }
        }
    }

    @RequiresApi(api = 23)
    public class Api23ViewScrollComponent implements View.OnScrollChangeListener {
        public long a = 0;
        public long b = 0;
        public int c = 0;
        public int d = 0;
        public RefreshKernel e;
        public View.OnScrollChangeListener f;

        public Api23ViewScrollComponent(RefreshKernel refreshKernel) {
            this.e = refreshKernel;
        }

        public void a(View view) {
            Field[] declaredFields = View.class.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (View.OnScrollChangeListener.class.equals(field.getType())) {
                        try {
                            field.setAccessible(true);
                            Object obj = field.get(view);
                            if (obj != null && !view.equals(obj)) {
                                this.f = (View.OnScrollChangeListener) obj;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            view.setOnScrollChangeListener(RefreshContentWrapper.this.new Api23ViewScrollComponent(this.e));
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View.OnScrollChangeListener onScrollChangeListener = this.f;
            if (onScrollChangeListener != null) {
                onScrollChangeListener.onScrollChange(view, i, i2, i3, i4);
            }
            if (this.c == i2 && this.d == i4) {
                return;
            }
            RefreshLayout refreshLayout = this.e.getRefreshLayout();
            boolean z = refreshLayout.isEnableOverScrollBounce() || refreshLayout.isRefreshing() || refreshLayout.isLoading();
            if (i2 <= 0 && i4 > 0 && RefreshContentWrapper.this.mMotionEvent == null && this.a - this.b > 1000 && z && refreshLayout.isEnableRefresh()) {
                this.e.animSpinnerBounce(Math.min(((this.d - i4) * 16000) / ((int) ((this.a - this.b) / 1000.0f)), RefreshContentWrapper.this.mHeaderHeight));
            } else if (i4 < i2 && RefreshContentWrapper.this.mMotionEvent == null && refreshLayout.isEnableLoadmore()) {
                if (!refreshLayout.isLoadmoreFinished() && refreshLayout.isEnableAutoLoadmore() && !refreshLayout.isEnablePureScrollMode() && refreshLayout.getState() == RefreshState.None && !ScrollBoundaryUtil.canScrollDown(view)) {
                    this.e.getRefreshLayout().autoLoadmore(0, 1.0f);
                } else if (z && this.a - this.b > 1000 && !ScrollBoundaryUtil.canScrollDown(view)) {
                    this.e.animSpinnerBounce(Math.max(((this.d - i4) * 16000) / ((int) ((this.a - this.b) / 1000.0f)), -RefreshContentWrapper.this.mFooterHeight));
                }
            }
            this.c = i2;
            this.d = i4;
            this.b = this.a;
            this.a = System.nanoTime();
        }
    }

    public class NestedScrollViewScrollComponent implements NestedScrollView.OnScrollChangeListener {
        public long a = 0;
        public long b = 0;
        public int c = 0;
        public int d = 0;
        public RefreshKernel e;
        public NestedScrollView.OnScrollChangeListener f;

        public NestedScrollViewScrollComponent(RefreshKernel refreshKernel) {
            this.e = refreshKernel;
        }

        public void a(NestedScrollView nestedScrollView) {
            Field[] declaredFields = NestedScrollView.class.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    if (NestedScrollView.OnScrollChangeListener.class.equals(field.getType())) {
                        try {
                            field.setAccessible(true);
                            Object obj = field.get(nestedScrollView);
                            if (obj != null && !nestedScrollView.equals(obj)) {
                                this.f = (NestedScrollView.OnScrollChangeListener) obj;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            nestedScrollView.setOnScrollChangeListener(this);
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            NestedScrollView.OnScrollChangeListener onScrollChangeListener = this.f;
            if (onScrollChangeListener != null) {
                onScrollChangeListener.onScrollChange(nestedScrollView, i, i2, i3, i4);
            }
            if (this.c == i2 && this.d == i4) {
                return;
            }
            RefreshLayout refreshLayout = this.e.getRefreshLayout();
            boolean z = refreshLayout.isEnableOverScrollBounce() || refreshLayout.isRefreshing() || refreshLayout.isLoading();
            if (i2 <= 0 && i4 > 0 && RefreshContentWrapper.this.mMotionEvent == null && this.a - this.b > 1000 && z && refreshLayout.isEnableRefresh()) {
                this.e.animSpinnerBounce(Math.min(((this.d - i4) * 16000) / ((int) ((this.a - this.b) / 1000.0f)), RefreshContentWrapper.this.mHeaderHeight));
            } else if (i4 < i2 && RefreshContentWrapper.this.mMotionEvent == null && refreshLayout.isEnableLoadmore()) {
                if (!refreshLayout.isLoadmoreFinished() && refreshLayout.isEnableAutoLoadmore() && !refreshLayout.isEnablePureScrollMode() && refreshLayout.getState() == RefreshState.None && !ScrollBoundaryUtil.canScrollDown(nestedScrollView)) {
                    this.e.getRefreshLayout().autoLoadmore(0, 1.0f);
                } else if (z && this.a - this.b > 1000 && !ScrollBoundaryUtil.canScrollDown(RefreshContentWrapper.this.mScrollableView)) {
                    this.e.animSpinnerBounce(Math.max(((this.d - i4) * 16000) / ((int) ((this.a - this.b) / 1000.0f)), -RefreshContentWrapper.this.mFooterHeight));
                }
            }
            this.c = i2;
            this.d = i4;
            this.b = this.a;
            this.a = System.nanoTime();
        }
    }

    public class PagerPrimaryAdapter extends PagerAdapterWrapper {
        public ViewPager mViewPager;

        public PagerPrimaryAdapter(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        public void a(PagerAdapter pagerAdapter) {
            this.wrapped = pagerAdapter;
        }

        @Override // androidx.viewpager.widget.PagerAdapterWrapper
        public void attachViewPager(ViewPager viewPager) {
            this.mViewPager = viewPager;
            super.attachViewPager(viewPager);
        }

        @Override // androidx.viewpager.widget.PagerAdapterWrapper, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            if (obj instanceof View) {
                RefreshContentWrapper.this.mScrollableView = (View) obj;
            } else if (obj instanceof Fragment) {
                RefreshContentWrapper.this.mScrollableView = ((Fragment) obj).getView();
            }
            RefreshContentWrapper refreshContentWrapper = RefreshContentWrapper.this;
            View view = refreshContentWrapper.mScrollableView;
            if (view != null) {
                refreshContentWrapper.mScrollableView = refreshContentWrapper.findScrollableViewInternal(view, true);
                RefreshContentWrapper refreshContentWrapper2 = RefreshContentWrapper.this;
                View view2 = refreshContentWrapper2.mScrollableView;
                if (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild)) {
                    return;
                }
                refreshContentWrapper2.mScrollableView = refreshContentWrapper2.findScrollableViewInternal(view2, false);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapterWrapper, androidx.viewpager.widget.PagerAdapter
        public void setViewPagerObserver(DataSetObserver dataSetObserver) {
            super.setViewPagerObserver(dataSetObserver);
            if (dataSetObserver == null) {
                RefreshContentWrapper.this.wrapperViewPager(this.mViewPager, this);
            }
        }
    }

    public class RecyclerViewScrollComponent extends RecyclerView.OnScrollListener {
        public RefreshKernel a;

        public RecyclerViewScrollComponent(RefreshKernel refreshKernel) {
            this.a = refreshKernel;
        }

        public void a(RecyclerView recyclerView) {
            recyclerView.addOnScrollListener(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (RefreshContentWrapper.this.mMotionEvent == null) {
                RefreshLayout refreshLayout = this.a.getRefreshLayout();
                if (i2 < 0 && refreshLayout.isEnableRefresh() && ((refreshLayout.isEnableOverScrollBounce() || refreshLayout.isRefreshing()) && !ScrollBoundaryUtil.canScrollUp(recyclerView))) {
                    this.a.animSpinnerBounce(Math.min((-i2) * 2, RefreshContentWrapper.this.mHeaderHeight));
                    return;
                }
                if (i2 <= 0 || !refreshLayout.isEnableLoadmore() || ScrollBoundaryUtil.canScrollDown(recyclerView)) {
                    return;
                }
                if (refreshLayout.getState() == RefreshState.None && refreshLayout.isEnableAutoLoadmore() && !refreshLayout.isLoadmoreFinished() && !refreshLayout.isEnablePureScrollMode()) {
                    refreshLayout.autoLoadmore(0, 1.0f);
                } else if (refreshLayout.isEnableOverScrollBounce() || refreshLayout.isLoading()) {
                    this.a.animSpinnerBounce(Math.max((-i2) * 2, -RefreshContentWrapper.this.mFooterHeight));
                }
            }
        }
    }

    public class a implements AppBarLayout.OnOffsetChangedListener {
        public final /* synthetic */ RefreshLayout a;

        public a(RefreshLayout refreshLayout) {
            this.a = refreshLayout;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            RefreshContentWrapper refreshContentWrapper = RefreshContentWrapper.this;
            refreshContentWrapper.mEnableRefresh = i >= 0;
            refreshContentWrapper.mEnableLoadmore = this.a.isEnableLoadmore() && appBarLayout.getTotalScrollRange() + i <= 0;
        }
    }

    public class b implements Runnable {
        public int a = 0;
        public PagerPrimaryAdapter b;
        public final /* synthetic */ PagerPrimaryAdapter c;
        public final /* synthetic */ ViewPager d;

        public b(PagerPrimaryAdapter pagerPrimaryAdapter, ViewPager viewPager) {
            this.c = pagerPrimaryAdapter;
            this.d = viewPager;
            this.b = pagerPrimaryAdapter;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a++;
            PagerAdapter adapter = this.d.getAdapter();
            if (adapter == null) {
                if (this.a < 10) {
                    this.d.postDelayed(this, 500L);
                }
            } else {
                if (adapter instanceof PagerPrimaryAdapter) {
                    if (adapter != this.c || this.a >= 10) {
                        return;
                    }
                    this.d.postDelayed(this, 500L);
                    return;
                }
                PagerPrimaryAdapter pagerPrimaryAdapter = this.b;
                if (pagerPrimaryAdapter == null) {
                    this.b = RefreshContentWrapper.this.new PagerPrimaryAdapter(adapter);
                } else {
                    pagerPrimaryAdapter.a(adapter);
                }
                this.b.attachViewPager(this.d);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((AbsListView) RefreshContentWrapper.this.mScrollableView).smoothScrollBy(this.a, this.b);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public int a;
        public final /* synthetic */ RefreshKernel b;

        public d(RefreshKernel refreshKernel) {
            this.b = refreshKernel;
            this.a = refreshKernel.getSpinner();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View childAt;
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            try {
                View view = RefreshContentWrapper.this.mScrollableView;
                if (!(view instanceof ListView)) {
                    view.scrollBy(0, iIntValue - this.a);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    ((ListView) view).scrollListBy(iIntValue - this.a);
                } else {
                    ListView listView = (ListView) view;
                    int firstVisiblePosition = listView.getFirstVisiblePosition();
                    if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
                        return;
                    } else {
                        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - (iIntValue - this.a));
                    }
                }
            } catch (Throwable unused) {
            }
            this.a = iIntValue;
        }
    }

    public RefreshContentWrapper(View view) {
        this.mRealContentView = view;
        this.mContentView = view;
        view.setTag(1685825348, TAG_REFRESH_CONTENT_WRAPPER);
    }

    public static boolean isTagedContent(View view) {
        return TAG_REFRESH_CONTENT_WRAPPER.equals(view.getTag(1685825348));
    }

    public static int measureViewHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canLoadmore() {
        return this.mEnableLoadmore && this.mBoundaryAdapter.canLoadmore(this.mContentView);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public boolean canRefresh() {
        return this.mEnableRefresh && this.mBoundaryAdapter.canRefresh(this.mContentView);
    }

    public void findScrollableView(View view, RefreshKernel refreshKernel) {
        View viewFindScrollableViewInternal = findScrollableViewInternal(view, true);
        this.mScrollableView = viewFindScrollableViewInternal;
        try {
            if (viewFindScrollableViewInternal instanceof CoordinatorLayout) {
                refreshKernel.getRefreshLayout().setEnableNestedScroll(false);
                wrapperCoordinatorLayout((CoordinatorLayout) this.mScrollableView, refreshKernel.getRefreshLayout());
            }
        } catch (Throwable unused) {
        }
        try {
            View view2 = this.mScrollableView;
            if (view2 instanceof ViewPager) {
                wrapperViewPager((ViewPager) view2);
            }
        } catch (Throwable unused2) {
        }
        View view3 = this.mScrollableView;
        if ((view3 instanceof NestedScrollingParent) && !(view3 instanceof NestedScrollingChild)) {
            this.mScrollableView = findScrollableViewInternal(view3, false);
        }
        if (this.mScrollableView == null) {
            this.mScrollableView = view;
        }
    }

    public View findScrollableViewInternal(View view, boolean z) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(Collections.singletonList(view));
        View view2 = null;
        while (!linkedBlockingQueue.isEmpty() && view2 == null) {
            View view3 = (View) linkedBlockingQueue.poll();
            if (view3 != null) {
                if ((z || view3 != view) && ((view3 instanceof AbsListView) || (view3 instanceof ScrollView) || (view3 instanceof ScrollingView) || (view3 instanceof NestedScrollingChild) || (view3 instanceof NestedScrollingParent) || (view3 instanceof WebView) || (view3 instanceof ViewPager))) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedBlockingQueue.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public ViewGroup.LayoutParams getLayoutParams() {
        return this.mContentView.getLayoutParams();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public int getMeasuredHeight() {
        return this.mContentView.getMeasuredHeight();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public int getMeasuredWidth() {
        return this.mContentView.getMeasuredWidth();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public View getScrollableView() {
        return this.mScrollableView;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    @NonNull
    public View getView() {
        return this.mContentView;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void layout(int i, int i2, int i3, int i4) {
        this.mContentView.layout(i, i2, i3, i4);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void measure(int i, int i2) {
        this.mContentView.measure(i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void moveSpinner(int i) {
        this.mRealContentView.setTranslationY(i);
        View view = this.mFixedHeader;
        if (view != null) {
            view.setTranslationY(Math.max(0, i));
        }
        View view2 = this.mFixedFooter;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i));
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void onActionDown(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.mMotionEvent = motionEventObtain;
        motionEventObtain.offsetLocation(-this.mContentView.getLeft(), -this.mContentView.getTop());
        this.mBoundaryAdapter.a(this.mMotionEvent);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void onActionUpOrCancel() {
        this.mMotionEvent = null;
        this.mBoundaryAdapter.a(null);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void onInitialHeaderAndFooter(int i, int i2) {
        this.mHeaderHeight = i;
        this.mFooterHeight = i2;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public ValueAnimator.AnimatorUpdateListener onLoadingFinish(RefreshKernel refreshKernel, int i, int i2, int i3) {
        if (this.mScrollableView == null || !refreshKernel.getRefreshLayout().isEnableScrollContentWhenLoaded() || !ScrollBoundaryUtil.canScrollDown(this.mScrollableView)) {
            return null;
        }
        View view = this.mScrollableView;
        if (!(view instanceof AbsListView) || (view instanceof ListView) || Build.VERSION.SDK_INT >= 19) {
            return new d(refreshKernel);
        }
        if (i2 > 0) {
            refreshKernel.getRefreshLayout().getLayout().postDelayed(new c(i, i3), i2);
        } else {
            ((AbsListView) view).smoothScrollBy(i, i3);
        }
        return null;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setEnableLoadmoreWhenContentNotFull(boolean z) {
        this.mBoundaryAdapter.setEnableLoadmoreWhenContentNotFull(z);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        if (scrollBoundaryDecider instanceof ScrollBoundaryDeciderAdapter) {
            this.mBoundaryAdapter = (ScrollBoundaryDeciderAdapter) scrollBoundaryDecider;
        } else {
            this.mBoundaryAdapter.b(scrollBoundaryDecider);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshContent
    public void setupComponent(RefreshKernel refreshKernel, View view, View view2) {
        findScrollableView(this.mContentView, refreshKernel);
        try {
            if (this.mScrollableView instanceof RecyclerView) {
                new RecyclerViewScrollComponent(refreshKernel).a((RecyclerView) this.mScrollableView);
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.mScrollableView instanceof NestedScrollView) {
                new NestedScrollViewScrollComponent(refreshKernel).a((NestedScrollView) this.mScrollableView);
            }
        } catch (Throwable unused2) {
        }
        View view3 = this.mScrollableView;
        if (view3 instanceof AbsListView) {
            new AbsListViewScrollComponent(refreshKernel).a((AbsListView) this.mScrollableView);
        } else if (Build.VERSION.SDK_INT >= 23 && view3 != null) {
            new Api23ViewScrollComponent(refreshKernel).a(this.mScrollableView);
        }
        if (view == null && view2 == null) {
            return;
        }
        this.mFixedHeader = view;
        this.mFixedFooter = view2;
        FrameLayout frameLayout = new FrameLayout(this.mContentView.getContext());
        refreshKernel.getRefreshLayout().getLayout().removeView(this.mContentView);
        ViewGroup.LayoutParams layoutParams = this.mContentView.getLayoutParams();
        frameLayout.addView(this.mContentView, -1, -1);
        refreshKernel.getRefreshLayout().getLayout().addView(frameLayout, layoutParams);
        this.mContentView = frameLayout;
        if (view != null) {
            view.setClickable(true);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams2.height = measureViewHeight(view);
            viewGroup.addView(new Space(this.mContentView.getContext()), iIndexOfChild, layoutParams2);
            frameLayout.addView(view);
        }
        if (view2 != null) {
            view2.setClickable(true);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild2 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
            layoutParams3.height = measureViewHeight(view2);
            viewGroup2.addView(new Space(this.mContentView.getContext()), iIndexOfChild2, layoutParams3);
            layoutParams4.gravity = 80;
            frameLayout.addView(view2, layoutParams4);
        }
    }

    public void wrapperCoordinatorLayout(CoordinatorLayout coordinatorLayout, RefreshLayout refreshLayout) {
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (childAt instanceof AppBarLayout) {
                ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a(refreshLayout));
            }
        }
    }

    public void wrapperViewPager(ViewPager viewPager) {
        wrapperViewPager(viewPager, null);
    }

    public void wrapperViewPager(ViewPager viewPager, PagerPrimaryAdapter pagerPrimaryAdapter) {
        viewPager.post(new b(pagerPrimaryAdapter, viewPager));
    }

    public RefreshContentWrapper(Context context) {
        View view = new View(context);
        this.mRealContentView = view;
        this.mContentView = view;
        view.setTag(1685825348, TAG_REFRESH_CONTENT_WRAPPER);
    }
}
