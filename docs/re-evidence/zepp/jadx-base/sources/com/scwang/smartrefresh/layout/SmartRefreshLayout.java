package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.constant.DimensionStatus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.header.FalsifyHeader;
import com.scwang.smartrefresh.layout.impl.RefreshContentWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.scwang.smartrefresh.layout.util.DelayedRunable;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.scwang.smartrefresh.layout.util.ViscousFluidInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SmartRefreshLayout extends ViewGroup implements RefreshLayout, NestedScrollingParent, NestedScrollingChild {
    public static DefaultRefreshFooterCreater sFooterCreater = new c();
    public static DefaultRefreshHeaderCreater sHeaderCreater = new d();
    public static boolean sManualFooterCreater = false;
    public MotionEvent a;
    public Handler handler;
    public List<DelayedRunable> mDelayedRunables;
    public boolean mDisableContentWhenLoading;
    public boolean mDisableContentWhenRefresh;
    public float mDragRate;
    public boolean mEnableAutoLoadmore;
    public boolean mEnableFooterTranslationContent;
    public boolean mEnableHeaderTranslationContent;
    public boolean mEnableLoadmore;
    public boolean mEnableLoadmoreWhenContentNotFull;
    public boolean mEnableOverScrollBounce;
    public boolean mEnablePreviewInEditMode;
    public boolean mEnablePureScrollMode;
    public boolean mEnableRefresh;
    public boolean mEnableScrollContentWhenLoaded;
    public int mFixedFooterViewId;
    public int mFixedHeaderViewId;
    public int mFooterBackgroundColor;
    public int mFooterExtendHeight;
    public int mFooterHeight;
    public DimensionStatus mFooterHeightStatus;
    public float mFooterMaxDragRate;
    public boolean mFooterNeedTouchEventWhenRefreshing;
    public int mHeaderBackgroundColor;
    public int mHeaderExtendHeight;
    public int mHeaderHeight;
    public DimensionStatus mHeaderHeightStatus;
    public float mHeaderMaxDragRate;
    public boolean mHeaderNeedTouchEventWhenRefreshing;
    public boolean mIsBeingDragged;
    public RefreshKernel mKernel;
    public long mLastLoadingTime;
    public long mLastRefreshingTime;
    public int mLastSpinner;
    public float mLastTouchX;
    public float mLastTouchY;
    public boolean mLoadmoreFinished;
    public OnLoadmoreListener mLoadmoreListener;
    public boolean mManualLoadmore;
    public boolean mManualNestedScrolling;
    public boolean mNestedScrollInProgress;
    public NestedScrollingChildHelper mNestedScrollingChildHelper;
    public NestedScrollingParentHelper mNestedScrollingParentHelper;
    public OnMultiPurposeListener mOnMultiPurposeListener;
    public Paint mPaint;
    public int[] mParentOffsetInWindow;
    public int[] mParentScrollConsumed;
    public int[] mPrimaryColors;
    public int mReboundDuration;
    public Interpolator mReboundInterpolator;
    public RefreshContent mRefreshContent;
    public RefreshFooter mRefreshFooter;
    public RefreshHeader mRefreshHeader;
    public OnRefreshListener mRefreshListener;
    public int mScreenHeightPixels;
    public ScrollBoundaryDecider mScrollBoundaryDecider;
    public int mSpinner;
    public RefreshState mState;
    public int mTotalUnconsumed;
    public int mTouchSlop;
    public int mTouchSpinner;
    public float mTouchX;
    public float mTouchY;
    public RefreshState mViceState;
    public ValueAnimator reboundAnimator;
    public Animator.AnimatorListener reboundAnimatorEndListener;
    public ValueAnimator.AnimatorUpdateListener reboundUpdateListener;

    public class RefreshKernelImpl implements RefreshKernel {
        public RefreshKernelImpl() {
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel animSpinner(int i) {
            SmartRefreshLayout.this.animSpinner(i);
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel animSpinnerBounce(int i) {
            SmartRefreshLayout.this.animSpinnerBounce(i);
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshContent getRefreshContent() {
            return SmartRefreshLayout.this.mRefreshContent;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshLayout getRefreshLayout() {
            return SmartRefreshLayout.this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public int getSpinner() {
            return SmartRefreshLayout.this.mSpinner;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel moveSpinner(int i, boolean z) {
            SmartRefreshLayout.this.moveSpinner(i, z);
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel moveSpinnerInfinitely(float f) {
            SmartRefreshLayout.this.moveSpinnerInfinitely(f);
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel overSpinner() {
            SmartRefreshLayout.this.overSpinner();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDrawBackgoundForFooter(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mPaint == null && i != 0) {
                smartRefreshLayout.mPaint = new Paint();
            }
            SmartRefreshLayout.this.mFooterBackgroundColor = i;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDrawBackgoundForHeader(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mPaint == null && i != 0) {
                smartRefreshLayout.mPaint = new Paint();
            }
            SmartRefreshLayout.this.mHeaderBackgroundColor = i;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestFooterNeedTouchEventWhenLoading(boolean z) {
            SmartRefreshLayout.this.mFooterNeedTouchEventWhenRefreshing = z;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestHeaderNeedTouchEventWhenRefreshing(boolean z) {
            SmartRefreshLayout.this.mHeaderNeedTouchEventWhenRefreshing = z;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestRemeasureHeightForFooter() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            DimensionStatus dimensionStatus = smartRefreshLayout.mFooterHeightStatus;
            if (dimensionStatus.notifyed) {
                smartRefreshLayout.mFooterHeightStatus = dimensionStatus.unNotify();
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestRemeasureHeightForHeader() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            DimensionStatus dimensionStatus = smartRefreshLayout.mHeaderHeightStatus;
            if (dimensionStatus.notifyed) {
                smartRefreshLayout.mHeaderHeightStatus = dimensionStatus.unNotify();
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel resetStatus() {
            SmartRefreshLayout.this.resetStatus();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateLoding() {
            SmartRefreshLayout.this.setStateLoding();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateLodingFinish() {
            SmartRefreshLayout.this.setStateLodingFinish();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStatePullDownCanceled() {
            SmartRefreshLayout.this.setStatePullDownCanceled();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStatePullDownToRefresh() {
            SmartRefreshLayout.this.setStatePullDownToRefresh();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStatePullUpCanceled() {
            SmartRefreshLayout.this.setStatePullUpCanceled();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStatePullUpToLoad() {
            SmartRefreshLayout.this.setStatePullUpToLoad();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateRefresing() {
            SmartRefreshLayout.this.setStateRefresing();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateRefresingFinish() {
            SmartRefreshLayout.this.setStateRefresingFinish();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateReleaseToLoad() {
            SmartRefreshLayout.this.setStateReleaseToLoad();
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setStateReleaseToRefresh() {
            SmartRefreshLayout.this.setStateReleaseToRefresh();
            return this;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ float a;

        /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$a$a, reason: collision with other inner class name */
        public class C0741a implements ValueAnimator.AnimatorUpdateListener {
            public C0741a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        }

        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.reboundAnimator = null;
                if (smartRefreshLayout.mState != RefreshState.ReleaseToRefresh) {
                    smartRefreshLayout.setStateReleaseToRefresh();
                }
                SmartRefreshLayout.this.overSpinner();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.mLastTouchX = smartRefreshLayout.getMeasuredWidth() / 2;
                SmartRefreshLayout.this.setStatePullDownToRefresh();
            }
        }

        public a(float f) {
            this.a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout.mSpinner, (int) (smartRefreshLayout.mHeaderHeight * this.a));
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.reboundAnimator.setDuration(smartRefreshLayout2.mReboundDuration);
            SmartRefreshLayout.this.reboundAnimator.setInterpolator(new DecelerateInterpolator());
            SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new C0741a());
            SmartRefreshLayout.this.reboundAnimator.addListener(new b());
            SmartRefreshLayout.this.reboundAnimator.start();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ float a;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        }

        /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$b$b, reason: collision with other inner class name */
        public class C0742b extends AnimatorListenerAdapter {
            public C0742b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.reboundAnimator = null;
                if (smartRefreshLayout.mState != RefreshState.ReleaseToLoad) {
                    smartRefreshLayout.setStateReleaseToLoad();
                }
                SmartRefreshLayout.this.overSpinner();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.mLastTouchX = smartRefreshLayout.getMeasuredWidth() / 2;
                SmartRefreshLayout.this.setStatePullUpToLoad();
            }
        }

        public b(float f) {
            this.a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout.mSpinner, -((int) (smartRefreshLayout.mFooterHeight * this.a)));
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.reboundAnimator.setDuration(smartRefreshLayout2.mReboundDuration);
            SmartRefreshLayout.this.reboundAnimator.setInterpolator(new DecelerateInterpolator());
            SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new a());
            SmartRefreshLayout.this.reboundAnimator.addListener(new C0742b());
            SmartRefreshLayout.this.reboundAnimator.start();
        }
    }

    public static class c implements DefaultRefreshFooterCreater {
        @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater
        @NonNull
        public RefreshFooter createRefreshFooter(Context context, RefreshLayout refreshLayout) {
            return new BallPulseFooter(context);
        }
    }

    public static class d implements DefaultRefreshHeaderCreater {
        @Override // com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater
        @NonNull
        public RefreshHeader createRefreshHeader(Context context, RefreshLayout refreshLayout) {
            return new BezierRadarHeader(context);
        }
    }

    public class e implements OnRefreshListener {
        public e() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
        public void onRefresh(RefreshLayout refreshLayout) {
            refreshLayout.finishRefresh(3000);
        }
    }

    public class f implements OnLoadmoreListener {
        public f() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
        public void onLoadmore(RefreshLayout refreshLayout) {
            refreshLayout.finishLoadmore(2000);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SmartRefreshLayout smartRefreshLayout;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout.this.reboundAnimator = null;
            if (((Integer) ((ValueAnimator) animator).getAnimatedValue()).intValue() != 0 || (refreshState = (smartRefreshLayout = SmartRefreshLayout.this).mState) == (refreshState2 = RefreshState.None) || refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
                return;
            }
            smartRefreshLayout.notifyStateChanged(refreshState2);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SmartRefreshLayout.this.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout.mSpinner, 0);
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            smartRefreshLayout2.reboundAnimator.setDuration((smartRefreshLayout2.mReboundDuration * 2) / 3);
            SmartRefreshLayout.this.reboundAnimator.setInterpolator(new DecelerateInterpolator());
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.reboundAnimator.addUpdateListener(smartRefreshLayout3.reboundUpdateListener);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            smartRefreshLayout4.reboundAnimator.addListener(smartRefreshLayout4.reboundAnimatorEndListener);
            SmartRefreshLayout.this.reboundAnimator.start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ boolean a;

        public j(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mState == RefreshState.Refreshing) {
                RefreshHeader refreshHeader = smartRefreshLayout.mRefreshHeader;
                if (refreshHeader == null) {
                    smartRefreshLayout.resetStatus();
                    return;
                }
                int iOnFinish = refreshHeader.onFinish(smartRefreshLayout, this.a);
                SmartRefreshLayout.this.notifyStateChanged(RefreshState.RefreshFinish);
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout2.mOnMultiPurposeListener;
                if (onMultiPurposeListener != null) {
                    onMultiPurposeListener.onHeaderFinish(smartRefreshLayout2.mRefreshHeader, this.a);
                }
                if (iOnFinish < Integer.MAX_VALUE) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.mSpinner == 0) {
                        smartRefreshLayout3.resetStatus();
                    } else {
                        smartRefreshLayout3.animSpinner(0, iOnFinish);
                    }
                }
            }
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mState == RefreshState.Loading) {
                RefreshFooter refreshFooter = smartRefreshLayout.mRefreshFooter;
                if (refreshFooter == null || smartRefreshLayout.mKernel == null || smartRefreshLayout.mRefreshContent == null) {
                    smartRefreshLayout.resetStatus();
                    return;
                }
                int iOnFinish = refreshFooter.onFinish(smartRefreshLayout, this.a);
                if (iOnFinish == Integer.MAX_VALUE) {
                    return;
                }
                SmartRefreshLayout.this.notifyStateChanged(RefreshState.LoadFinish);
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListenerOnLoadingFinish = smartRefreshLayout2.mRefreshContent.onLoadingFinish(smartRefreshLayout2.mKernel, smartRefreshLayout2.mFooterHeight, iOnFinish, smartRefreshLayout2.mReboundDuration);
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout3.mOnMultiPurposeListener;
                if (onMultiPurposeListener != null) {
                    onMultiPurposeListener.onFooterFinish(smartRefreshLayout3.mRefreshFooter, this.a);
                }
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                if (smartRefreshLayout4.mSpinner == 0) {
                    smartRefreshLayout4.resetStatus();
                    return;
                }
                ValueAnimator valueAnimatorAnimSpinner = smartRefreshLayout4.animSpinner(0, iOnFinish);
                if (animatorUpdateListenerOnLoadingFinish == null || valueAnimatorAnimSpinner == null) {
                    return;
                }
                valueAnimatorAnimSpinner.addUpdateListener(animatorUpdateListenerOnLoadingFinish);
            }
        }
    }

    public SmartRefreshLayout(Context context) {
        super(context);
        this.mReboundDuration = 250;
        this.mDragRate = 0.5f;
        this.mEnableRefresh = true;
        this.mEnableLoadmore = false;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableAutoLoadmore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableLoadmoreWhenContentNotFull = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mLoadmoreFinished = false;
        this.mManualLoadmore = false;
        this.mManualNestedScrolling = false;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.mHeaderHeightStatus = dimensionStatus;
        this.mFooterHeightStatus = dimensionStatus;
        this.mHeaderMaxDragRate = 2.0f;
        this.mFooterMaxDragRate = 2.0f;
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastLoadingTime = 0L;
        this.mLastRefreshingTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.a = null;
        this.reboundAnimatorEndListener = new g();
        this.reboundUpdateListener = new h();
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setClipToPadding(false);
        this.mScreenHeightPixels = context.getResources().getDisplayMetrics().heightPixels;
        this.mReboundInterpolator = new ViscousFluidInterpolator();
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        DensityUtil densityUtil = new DensityUtil();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout);
        int i2 = R.styleable.SmartRefreshLayout_srlEnableNestedScrolling;
        ViewCompat.setNestedScrollingEnabled(this, typedArrayObtainStyledAttributes.getBoolean(i2, false));
        this.mDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlDragRate, this.mDragRate);
        this.mHeaderMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.mHeaderMaxDragRate);
        this.mFooterMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.mFooterMaxDragRate);
        this.mEnableRefresh = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableRefresh, this.mEnableRefresh);
        this.mReboundDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.SmartRefreshLayout_srlReboundDuration, this.mReboundDuration);
        int i3 = R.styleable.SmartRefreshLayout_srlEnableLoadmore;
        this.mEnableLoadmore = typedArrayObtainStyledAttributes.getBoolean(i3, this.mEnableLoadmore);
        int i4 = R.styleable.SmartRefreshLayout_srlHeaderHeight;
        this.mHeaderHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i4, densityUtil.dip2px(100.0f));
        int i5 = R.styleable.SmartRefreshLayout_srlFooterHeight;
        this.mFooterHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i5, densityUtil.dip2px(60.0f));
        this.mDisableContentWhenRefresh = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.mDisableContentWhenRefresh);
        this.mDisableContentWhenLoading = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.mDisableContentWhenLoading);
        this.mEnableHeaderTranslationContent = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent, this.mEnableHeaderTranslationContent);
        this.mEnableFooterTranslationContent = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterTranslationContent, this.mEnableFooterTranslationContent);
        this.mEnablePreviewInEditMode = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.mEnablePreviewInEditMode);
        this.mEnableAutoLoadmore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableAutoLoadmore, this.mEnableAutoLoadmore);
        this.mEnableOverScrollBounce = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.mEnableOverScrollBounce);
        this.mEnablePureScrollMode = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.mEnablePureScrollMode);
        this.mEnableScrollContentWhenLoaded = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.mEnableScrollContentWhenLoaded);
        this.mEnableLoadmoreWhenContentNotFull = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableLoadmoreWhenContentNotFull, this.mEnableLoadmoreWhenContentNotFull);
        this.mFixedHeaderViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedHeaderViewId, -1);
        this.mFixedFooterViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedFooterViewId, -1);
        this.mManualLoadmore = typedArrayObtainStyledAttributes.hasValue(i3);
        this.mManualNestedScrolling = typedArrayObtainStyledAttributes.hasValue(i2);
        this.mHeaderHeightStatus = typedArrayObtainStyledAttributes.hasValue(i4) ? DimensionStatus.XmlLayoutUnNotify : this.mHeaderHeightStatus;
        this.mFooterHeightStatus = typedArrayObtainStyledAttributes.hasValue(i5) ? DimensionStatus.XmlLayoutUnNotify : this.mFooterHeightStatus;
        this.mHeaderExtendHeight = (int) Math.max(this.mHeaderHeight * (this.mHeaderMaxDragRate - 1.0f), 0.0f);
        this.mFooterExtendHeight = (int) Math.max(this.mFooterHeight * (this.mFooterMaxDragRate - 1.0f), 0.0f);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.mPrimaryColors = new int[]{color2, color};
            } else {
                this.mPrimaryColors = new int[]{color2};
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreater(@NonNull DefaultRefreshFooterCreater defaultRefreshFooterCreater) {
        sFooterCreater = defaultRefreshFooterCreater;
        sManualFooterCreater = true;
    }

    public static void setDefaultRefreshHeaderCreater(@NonNull DefaultRefreshHeaderCreater defaultRefreshHeaderCreater) {
        sHeaderCreater = defaultRefreshHeaderCreater;
    }

    public ValueAnimator animSpinner(int i2) {
        return animSpinner(i2, 0);
    }

    public ValueAnimator animSpinnerBounce(int i2) {
        if (this.reboundAnimator == null) {
            this.mLastTouchX = getMeasuredWidth() / 2;
            RefreshState refreshState = this.mState;
            RefreshState refreshState2 = RefreshState.Refreshing;
            if (refreshState != refreshState2 || i2 <= 0) {
                RefreshState refreshState3 = RefreshState.Loading;
                if (refreshState == refreshState3 && i2 < 0) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mSpinner, Math.max(i2 * 2, -this.mFooterHeight));
                    this.reboundAnimator = valueAnimatorOfInt;
                    valueAnimatorOfInt.addListener(this.reboundAnimatorEndListener);
                } else if (this.mSpinner == 0 && this.mEnableOverScrollBounce) {
                    if (i2 > 0) {
                        if (refreshState != refreshState3) {
                            setStatePullDownToRefresh();
                        }
                        this.reboundAnimator = ValueAnimator.ofInt(0, Math.min(i2, this.mHeaderHeight + this.mHeaderExtendHeight));
                    } else {
                        if (refreshState != refreshState2) {
                            setStatePullUpToLoad();
                        }
                        this.reboundAnimator = ValueAnimator.ofInt(0, Math.max(i2, (-this.mFooterHeight) - this.mFooterExtendHeight));
                    }
                    this.reboundAnimator.addListener(new i());
                }
            } else {
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(this.mSpinner, Math.min(i2 * 2, this.mHeaderHeight));
                this.reboundAnimator = valueAnimatorOfInt2;
                valueAnimatorOfInt2.addListener(this.reboundAnimatorEndListener);
            }
            ValueAnimator valueAnimator = this.reboundAnimator;
            if (valueAnimator != null) {
                valueAnimator.setDuration((this.mReboundDuration * 2) / 3);
                this.reboundAnimator.setInterpolator(new DecelerateInterpolator());
                this.reboundAnimator.addUpdateListener(this.reboundUpdateListener);
                this.reboundAnimator.start();
            }
        }
        return this.reboundAnimator;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadmore() {
        return autoLoadmore(0);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh() {
        return autoRefresh(400);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z = this.mEnablePreviewInEditMode && isInEditMode();
        int i2 = this.mHeaderBackgroundColor;
        if (i2 != 0 && (this.mSpinner > 0 || z)) {
            this.mPaint.setColor(i2);
            canvas.drawRect(0.0f, 0.0f, getWidth(), z ? this.mHeaderHeight : this.mSpinner, this.mPaint);
        } else if (this.mFooterBackgroundColor != 0 && (this.mSpinner < 0 || z)) {
            int height = getHeight();
            this.mPaint.setColor(this.mFooterBackgroundColor);
            canvas.drawRect(0.0f, height - (z ? this.mFooterHeight : -this.mSpinner), getWidth(), height, this.mPaint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.mNestedScrollingChildHelper.dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.mNestedScrollingChildHelper.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0239  */
    /* JADX WARN: Code duplicated, block: B:165:0x023f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0249  */
    /* JADX WARN: Code duplicated, block: B:168:0x024c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0264 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RefreshState refreshState;
        RefreshState refreshState2;
        RefreshState refreshState3;
        int i2;
        RefreshState refreshState4;
        RefreshState refreshState5;
        RefreshFooter refreshFooter;
        RefreshHeader refreshHeader;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        boolean z = actionMasked == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                x += motionEvent.getX(i3);
                y += motionEvent.getY(i3);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f2 = pointerCount;
        float f3 = x / f2;
        float f4 = y / f2;
        if ((actionMasked == 6 || actionMasked == 5) && this.mIsBeingDragged) {
            this.mTouchY += f4 - this.mLastTouchY;
        }
        this.mLastTouchX = f3;
        this.mLastTouchY = f4;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            if (actionMasked == 0) {
                refreshContent.onActionDown(motionEvent);
            } else if (actionMasked == 1 || actionMasked == 3) {
                refreshContent.onActionUpOrCancel();
            }
        }
        if ((this.reboundAnimator != null && !interceptAnimator(actionMasked)) || (((refreshState = this.mState) == (refreshState2 = RefreshState.Loading) && this.mDisableContentWhenLoading) || (refreshState == (refreshState3 = RefreshState.Refreshing) && this.mDisableContentWhenRefresh))) {
            return false;
        }
        if (this.mNestedScrollInProgress) {
            int i4 = this.mTotalUnconsumed;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i4 == this.mTotalUnconsumed) {
                int i5 = (int) this.mLastTouchX;
                int width = getWidth();
                float f5 = this.mLastTouchX / width;
                if (this.mSpinner > 0 && (refreshHeader = this.mRefreshHeader) != null && refreshHeader.isSupportHorizontalDrag()) {
                    this.mRefreshHeader.onHorizontalDrag(f5, i5, width);
                } else if (this.mSpinner < 0 && (refreshFooter = this.mRefreshFooter) != null && refreshFooter.isSupportHorizontalDrag()) {
                    this.mRefreshFooter.onHorizontalDrag(f5, i5, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (!isEnabled() || (!(this.mEnableRefresh || this.mEnableLoadmore) || ((this.mHeaderNeedTouchEventWhenRefreshing && ((refreshState5 = this.mState) == refreshState3 || refreshState5 == RefreshState.RefreshFinish)) || (this.mFooterNeedTouchEventWhenRefreshing && ((refreshState4 = this.mState) == refreshState2 || refreshState4 == RefreshState.LoadFinish))))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.mTouchX = f3;
            this.mTouchY = f4;
            this.mLastTouchY = f4;
            this.mLastSpinner = 0;
            this.mTouchSpinner = this.mSpinner;
            this.mIsBeingDragged = false;
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (actionMasked == 1) {
            this.mIsBeingDragged = false;
            if (this.a != null) {
                this.a = null;
                long eventTime = motionEvent.getEventTime();
                if (this.mSpinner == 0) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                super.dispatchTouchEvent(MotionEvent.obtain(eventTime, eventTime, i2, this.mTouchX, f4, 0));
            }
            if (overSpinner()) {
                return true;
            }
        } else if (actionMasked == 2) {
            float f6 = f3 - this.mTouchX;
            float f7 = f4 - this.mTouchY;
            this.mLastTouchY = f4;
            if (!this.mIsBeingDragged) {
                if (Math.abs(f7) < this.mTouchSlop || Math.abs(f6) >= Math.abs(f7)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (f7 > 0.0f && (this.mSpinner < 0 || (this.mEnableRefresh && this.mRefreshContent.canRefresh()))) {
                    if (this.mSpinner < 0) {
                        setStatePullUpToLoad();
                    } else {
                        setStatePullDownToRefresh();
                    }
                    this.mIsBeingDragged = true;
                    float f8 = f4 - this.mTouchSlop;
                    this.mTouchY = f8;
                    f7 = f4 - f8;
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    if (f7 >= 0.0f || (this.mSpinner <= 0 && !(this.mEnableLoadmore && this.mRefreshContent.canLoadmore()))) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (this.mSpinner > 0) {
                        setStatePullDownToRefresh();
                    } else {
                        setStatePullUpToLoad();
                    }
                    this.mIsBeingDragged = true;
                    float f9 = this.mTouchSlop + f4;
                    this.mTouchY = f9;
                    f7 = f4 - f9;
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                }
            }
            if (this.mIsBeingDragged) {
                float f10 = f7 + this.mTouchSpinner;
                if ((this.mRefreshContent != null && getViceState().isHeader() && (f10 < 0.0f || this.mLastSpinner < 0)) || (getViceState().isFooter() && (f10 > 0.0f || this.mLastSpinner > 0))) {
                    long eventTime2 = motionEvent.getEventTime();
                    if (this.a == null) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(eventTime2, eventTime2, 0, this.mTouchX + f6, this.mTouchY, 0);
                        this.a = motionEventObtain;
                        super.dispatchTouchEvent(motionEventObtain);
                    }
                    super.dispatchTouchEvent(MotionEvent.obtain(eventTime2, eventTime2, 2, this.mTouchX + f6, this.mTouchY + f10, 0));
                    if ((getViceState().isHeader() && f10 < 0.0f) || (getViceState().isFooter() && f10 > 0.0f)) {
                        this.mLastSpinner = (int) f10;
                        if (this.mSpinner != 0) {
                            moveSpinnerInfinitely(0.0f);
                        }
                        return true;
                    }
                    this.mLastSpinner = (int) f10;
                    this.a = null;
                    super.dispatchTouchEvent(MotionEvent.obtain(eventTime2, eventTime2, 3, this.mTouchX, this.mTouchY + f10, 0));
                }
                if (getViceState().isDraging()) {
                    moveSpinnerInfinitely(f10);
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            this.mIsBeingDragged = false;
            if (this.a != null) {
                this.a = null;
                long eventTime3 = motionEvent.getEventTime();
                if (this.mSpinner == 0) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                super.dispatchTouchEvent(MotionEvent.obtain(eventTime3, eventTime3, i2, this.mTouchX, f4, 0));
            }
            if (overSpinner()) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshFooter getRefreshFooter() {
        return this.mRefreshFooter;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshHeader getRefreshHeader() {
        return this.mRefreshHeader;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshState getState() {
        return this.mState;
    }

    public RefreshState getViceState() {
        RefreshState refreshState = this.mState;
        return (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) ? this.mViceState : refreshState;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
    }

    public boolean interceptAnimator(int i2) {
        RefreshState refreshState;
        if (this.reboundAnimator == null || i2 != 0 || (refreshState = this.mState) == RefreshState.LoadFinish || refreshState == RefreshState.RefreshFinish) {
            return false;
        }
        if (refreshState == RefreshState.PullDownCanceled) {
            setStatePullDownToRefresh();
        } else if (refreshState == RefreshState.PullUpCanceled) {
            setStatePullUpToLoad();
        }
        this.reboundAnimator.cancel();
        this.reboundAnimator = null;
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableAutoLoadmore() {
        return this.mEnableAutoLoadmore;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableLoadmore() {
        return this.mEnableLoadmore;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableOverScrollBounce() {
        return this.mEnableOverScrollBounce;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnablePureScrollMode() {
        return this.mEnablePureScrollMode;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableRefresh() {
        return this.mEnableRefresh;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableScrollContentWhenLoaded() {
        return this.mEnableScrollContentWhenLoaded;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isLoading() {
        return this.mState == RefreshState.Loading;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isLoadmoreFinished() {
        return this.mLoadmoreFinished;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isRefreshing() {
        return this.mState == RefreshState.Refreshing;
    }

    public void moveSpinner(int i2, boolean z) {
        RefreshFooter refreshFooter;
        RefreshHeader refreshHeader;
        RefreshHeader refreshHeader2;
        RefreshFooter refreshFooter2;
        if (this.mSpinner != i2 || (((refreshHeader2 = this.mRefreshHeader) != null && refreshHeader2.isSupportHorizontalDrag()) || ((refreshFooter2 = this.mRefreshFooter) != null && refreshFooter2.isSupportHorizontalDrag()))) {
            int i3 = this.mSpinner;
            this.mSpinner = i2;
            if (!z && getViceState().isDraging()) {
                int i4 = this.mSpinner;
                if (i4 > this.mHeaderHeight) {
                    setStateReleaseToRefresh();
                } else if ((-i4) > this.mFooterHeight && !this.mLoadmoreFinished) {
                    setStateReleaseToLoad();
                } else if (i4 < 0 && !this.mLoadmoreFinished) {
                    setStatePullUpToLoad();
                } else if (i4 > 0) {
                    setStatePullDownToRefresh();
                }
            }
            if (this.mRefreshContent != null) {
                if (i2 > 0) {
                    if (this.mEnableHeaderTranslationContent || (refreshHeader = this.mRefreshHeader) == null || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                        this.mRefreshContent.moveSpinner(i2);
                        if (this.mHeaderBackgroundColor != 0) {
                            invalidate();
                        }
                    }
                } else if (this.mEnableFooterTranslationContent || (refreshFooter = this.mRefreshFooter) == null || refreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                    this.mRefreshContent.moveSpinner(i2);
                    if (this.mHeaderBackgroundColor != 0) {
                        invalidate();
                    }
                }
            }
            if ((i2 > 0 || i3 > 0) && this.mRefreshHeader != null) {
                i2 = Math.max(i2, 0);
                if ((this.mEnableRefresh || (this.mState == RefreshState.RefreshFinish && z)) && i3 != this.mSpinner && (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Scale || this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate)) {
                    this.mRefreshHeader.getView().requestLayout();
                }
                int i5 = this.mHeaderHeight;
                int i6 = this.mHeaderExtendHeight;
                float f2 = (i2 * 1.0f) / i5;
                if (z) {
                    this.mRefreshHeader.onReleasing(f2, i2, i5, i6);
                    OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
                    if (onMultiPurposeListener != null) {
                        onMultiPurposeListener.onHeaderReleasing(this.mRefreshHeader, f2, i2, i5, i6);
                    }
                } else {
                    if (this.mRefreshHeader.isSupportHorizontalDrag()) {
                        int i7 = (int) this.mLastTouchX;
                        int width = getWidth();
                        this.mRefreshHeader.onHorizontalDrag(this.mLastTouchX / width, i7, width);
                    }
                    this.mRefreshHeader.onPullingDown(f2, i2, i5, i6);
                    OnMultiPurposeListener onMultiPurposeListener2 = this.mOnMultiPurposeListener;
                    if (onMultiPurposeListener2 != null) {
                        onMultiPurposeListener2.onHeaderPulling(this.mRefreshHeader, f2, i2, i5, i6);
                    }
                }
            }
            if ((i2 < 0 || i3 < 0) && this.mRefreshFooter != null) {
                int iMin = Math.min(i2, 0);
                if ((this.mEnableLoadmore || (this.mState == RefreshState.LoadFinish && z)) && i3 != this.mSpinner && (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Scale || this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Translate)) {
                    this.mRefreshFooter.getView().requestLayout();
                }
                int i8 = -iMin;
                int i9 = this.mFooterHeight;
                int i10 = this.mFooterExtendHeight;
                float f3 = (i8 * 1.0f) / i9;
                if (z) {
                    this.mRefreshFooter.onPullReleasing(f3, i8, i9, i10);
                    OnMultiPurposeListener onMultiPurposeListener3 = this.mOnMultiPurposeListener;
                    if (onMultiPurposeListener3 != null) {
                        onMultiPurposeListener3.onFooterReleasing(this.mRefreshFooter, f3, i8, i9, i10);
                        return;
                    }
                    return;
                }
                if (this.mRefreshFooter.isSupportHorizontalDrag()) {
                    int i11 = (int) this.mLastTouchX;
                    int width2 = getWidth();
                    this.mRefreshFooter.onHorizontalDrag(this.mLastTouchX / width2, i11, width2);
                }
                this.mRefreshFooter.onPullingUp(f3, i8, i9, i10);
                OnMultiPurposeListener onMultiPurposeListener4 = this.mOnMultiPurposeListener;
                if (onMultiPurposeListener4 != null) {
                    onMultiPurposeListener4.onFooterPulling(this.mRefreshFooter, f3, i8, i9, i10);
                }
            }
        }
    }

    public void moveSpinnerInfinitely(float f2) {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing && f2 >= 0.0f) {
            if (f2 < this.mHeaderHeight) {
                moveSpinner((int) f2, false);
                return;
            }
            double d2 = this.mHeaderExtendHeight;
            int iMax = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
            int i2 = this.mHeaderHeight;
            double dMax = Math.max(0.0f, (f2 - i2) * this.mDragRate);
            moveSpinner(((int) Math.min(d2 * (1.0d - Math.pow(100.0d, (-dMax) / ((double) (iMax - i2)))), dMax)) + this.mHeaderHeight, false);
            return;
        }
        if (refreshState == RefreshState.Loading && f2 < 0.0f) {
            if (f2 > (-this.mFooterHeight)) {
                moveSpinner((int) f2, false);
                return;
            }
            double d3 = this.mFooterExtendHeight;
            double dMax2 = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight()) - this.mFooterHeight;
            double d4 = -Math.min(0.0f, (f2 + this.mHeaderHeight) * this.mDragRate);
            moveSpinner(((int) (-Math.min(d3 * (1.0d - Math.pow(100.0d, (-d4) / dMax2)), d4))) - this.mFooterHeight, false);
            return;
        }
        if (f2 >= 0.0f) {
            double d5 = this.mHeaderExtendHeight + this.mHeaderHeight;
            double dMax3 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            double dMax4 = Math.max(0.0f, f2 * this.mDragRate);
            moveSpinner((int) Math.min(d5 * (1.0d - Math.pow(100.0d, (-dMax4) / dMax3)), dMax4), false);
            return;
        }
        double d6 = this.mFooterExtendHeight + this.mFooterHeight;
        double dMax5 = Math.max(this.mScreenHeightPixels / 2, getHeight());
        double d7 = -Math.min(0.0f, f2 * this.mDragRate);
        moveSpinner((int) (-Math.min(d6 * (1.0d - Math.pow(100.0d, (-d7) / dMax5)), d7)), false);
    }

    public void notifyStateChanged(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if (refreshState2 != refreshState) {
            this.mState = refreshState;
            this.mViceState = refreshState;
            RefreshFooter refreshFooter = this.mRefreshFooter;
            if (refreshFooter != null) {
                refreshFooter.onStateChanged(this, refreshState2, refreshState);
            }
            RefreshHeader refreshHeader = this.mRefreshHeader;
            if (refreshHeader != null) {
                refreshHeader.onStateChanged(this, refreshState2, refreshState);
            }
            OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
            if (onMultiPurposeListener != null) {
                onMultiPurposeListener.onStateChanged(this, refreshState2, refreshState);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        RefreshFooter refreshFooter;
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.mKernel == null) {
            this.mKernel = new RefreshKernelImpl();
        }
        if (this.handler == null) {
            this.handler = new Handler();
        }
        List<DelayedRunable> list = this.mDelayedRunables;
        if (list != null) {
            for (DelayedRunable delayedRunable : list) {
                this.handler.postDelayed(delayedRunable, delayedRunable.delayMillis);
            }
            this.mDelayedRunables.clear();
            this.mDelayedRunables = null;
        }
        if (this.mRefreshContent == null && this.mRefreshHeader == null && this.mRefreshFooter == null) {
            onFinishInflate();
        }
        if (this.mRefreshHeader == null) {
            if (this.mEnablePureScrollMode) {
                this.mRefreshHeader = new FalsifyHeader(getContext());
            } else {
                this.mRefreshHeader = sHeaderCreater.createRefreshHeader(getContext(), this);
            }
            if (!(this.mRefreshHeader.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Scale) {
                    addView(this.mRefreshHeader.getView(), -1, -1);
                } else {
                    addView(this.mRefreshHeader.getView(), -1, -2);
                }
            }
        }
        if (this.mRefreshFooter == null) {
            if (this.mEnablePureScrollMode) {
                this.mRefreshFooter = new RefreshFooterWrapper(new FalsifyHeader(getContext()));
                this.mEnableLoadmore = this.mEnableLoadmore || !this.mManualLoadmore;
            } else {
                this.mRefreshFooter = sFooterCreater.createRefreshFooter(getContext(), this);
                this.mEnableLoadmore = this.mEnableLoadmore || (!this.mManualLoadmore && sManualFooterCreater);
            }
            if (!(this.mRefreshFooter.getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Scale) {
                    addView(this.mRefreshFooter.getView(), -1, -1);
                } else {
                    addView(this.mRefreshFooter.getView(), -1, -2);
                }
            }
        }
        if (this.mRefreshContent == null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                RefreshHeader refreshHeader = this.mRefreshHeader;
                if ((refreshHeader == null || childAt != refreshHeader.getView()) && ((refreshFooter = this.mRefreshFooter) == null || childAt != refreshFooter.getView())) {
                    this.mRefreshContent = new RefreshContentWrapper(childAt);
                }
            }
            if (this.mRefreshContent == null) {
                RefreshContentWrapper refreshContentWrapper = new RefreshContentWrapper(getContext());
                this.mRefreshContent = refreshContentWrapper;
                refreshContentWrapper.getView().setLayoutParams(new LayoutParams(-1, -1));
            }
        }
        int i3 = this.mFixedHeaderViewId;
        View viewFindViewById = i3 > 0 ? findViewById(i3) : null;
        int i4 = this.mFixedFooterViewId;
        View viewFindViewById2 = i4 > 0 ? findViewById(i4) : null;
        this.mRefreshContent.setScrollBoundaryDecider(this.mScrollBoundaryDecider);
        this.mRefreshContent.setEnableLoadmoreWhenContentNotFull(this.mEnableLoadmoreWhenContentNotFull || this.mEnablePureScrollMode);
        this.mRefreshContent.setupComponent(this.mKernel, viewFindViewById, viewFindViewById2);
        if (this.mSpinner != 0) {
            notifyStateChanged(RefreshState.None);
            RefreshContent refreshContent = this.mRefreshContent;
            this.mSpinner = 0;
            refreshContent.moveSpinner(0);
        }
        bringChildToFront(this.mRefreshContent.getView());
        SpinnerStyle spinnerStyle = this.mRefreshHeader.getSpinnerStyle();
        SpinnerStyle spinnerStyle2 = SpinnerStyle.FixedBehind;
        if (spinnerStyle != spinnerStyle2) {
            bringChildToFront(this.mRefreshHeader.getView());
        }
        if (this.mRefreshFooter.getSpinnerStyle() != spinnerStyle2) {
            bringChildToFront(this.mRefreshFooter.getView());
        }
        if (this.mRefreshListener == null) {
            this.mRefreshListener = new e();
        }
        if (this.mLoadmoreListener == null) {
            this.mLoadmoreListener = new f();
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null) {
            this.mRefreshHeader.setPrimaryColors(iArr);
            this.mRefreshFooter.setPrimaryColors(this.mPrimaryColors);
        }
        try {
            if (this.mManualNestedScrolling || isNestedScrollingEnabled()) {
                return;
            }
            for (ViewParent parent = this; parent != null; parent = parent.getParent()) {
                if (parent instanceof CoordinatorLayout) {
                    setNestedScrollingEnabled(true);
                    this.mManualNestedScrolling = false;
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mSpinner = 0;
        this.mRefreshContent.moveSpinner(0);
        notifyStateChanged(RefreshState.None);
        this.handler.removeCallbacksAndMessages(null);
        this.handler = null;
        this.mKernel = null;
        this.mManualLoadmore = true;
        this.mManualNestedScrolling = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        if (this.mEnablePureScrollMode && childCount > 1) {
            throw new RuntimeException("PureScrollMode模式只支持一个子View，Most only support one sub view in PureScrollMode");
        }
        boolean[] zArr = new boolean[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof RefreshHeader) && this.mRefreshHeader == null) {
                this.mRefreshHeader = (RefreshHeader) childAt;
            } else if ((childAt instanceof RefreshFooter) && this.mRefreshFooter == null) {
                this.mEnableLoadmore = this.mEnableLoadmore || !this.mManualLoadmore;
                this.mRefreshFooter = (RefreshFooter) childAt;
            } else if (this.mRefreshContent == null && ((childAt instanceof AbsListView) || (childAt instanceof WebView) || (childAt instanceof ScrollView) || (childAt instanceof ScrollingView) || (childAt instanceof NestedScrollingChild) || (childAt instanceof NestedScrollingParent) || (childAt instanceof ViewPager))) {
                this.mRefreshContent = new RefreshContentWrapper(childAt);
            } else if (RefreshHeaderWrapper.isTagedHeader(childAt) && this.mRefreshHeader == null) {
                this.mRefreshHeader = new RefreshHeaderWrapper(childAt);
            } else if (RefreshFooterWrapper.isTagedFooter(childAt) && this.mRefreshFooter == null) {
                this.mRefreshFooter = new RefreshFooterWrapper(childAt);
            } else if (RefreshContentWrapper.isTagedContent(childAt) && this.mRefreshContent == null) {
                this.mRefreshContent = new RefreshContentWrapper(childAt);
            } else {
                zArr[i2] = true;
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            if (zArr[i3]) {
                View childAt2 = getChildAt(i3);
                if (childCount == 1 && this.mRefreshContent == null) {
                    this.mRefreshContent = new RefreshContentWrapper(childAt2);
                } else if (i3 == 0 && this.mRefreshHeader == null) {
                    this.mRefreshHeader = new RefreshHeaderWrapper(childAt2);
                } else if (childCount == 2 && this.mRefreshContent == null) {
                    this.mRefreshContent = new RefreshContentWrapper(childAt2);
                } else if (i3 == 2 && this.mRefreshFooter == null) {
                    this.mEnableLoadmore = this.mEnableLoadmore || !this.mManualLoadmore;
                    this.mRefreshFooter = new RefreshFooterWrapper(childAt2);
                } else if (this.mRefreshContent == null) {
                    this.mRefreshContent = new RefreshContentWrapper(childAt2);
                }
            }
        }
        if (isInEditMode()) {
            int[] iArr = this.mPrimaryColors;
            if (iArr != null) {
                RefreshHeader refreshHeader = this.mRefreshHeader;
                if (refreshHeader != null) {
                    refreshHeader.setPrimaryColors(iArr);
                }
                RefreshFooter refreshFooter = this.mRefreshFooter;
                if (refreshFooter != null) {
                    refreshFooter.setPrimaryColors(this.mPrimaryColors);
                }
            }
            RefreshContent refreshContent = this.mRefreshContent;
            if (refreshContent != null) {
                bringChildToFront(refreshContent.getView());
            }
            RefreshHeader refreshHeader2 = this.mRefreshHeader;
            if (refreshHeader2 != null && refreshHeader2.getSpinnerStyle() != SpinnerStyle.FixedBehind) {
                bringChildToFront(this.mRefreshHeader.getView());
            }
            RefreshFooter refreshFooter2 = this.mRefreshFooter;
            if (refreshFooter2 != null && refreshFooter2.getSpinnerStyle() != SpinnerStyle.FixedBehind) {
                bringChildToFront(this.mRefreshFooter.getView());
            }
            if (this.mKernel == null) {
                this.mKernel = new RefreshKernelImpl();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int iMax;
        int iMax2;
        RefreshHeader refreshHeader;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        boolean z2 = isInEditMode() && this.mEnablePreviewInEditMode;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            LayoutParams layoutParams = (LayoutParams) refreshContent.getLayoutParams();
            int i6 = paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i7 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int measuredWidth = this.mRefreshContent.getMeasuredWidth() + i6;
            int measuredHeight = this.mRefreshContent.getMeasuredHeight() + i7;
            if (z2 && (refreshHeader = this.mRefreshHeader) != null && (this.mEnableHeaderTranslationContent || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                int i8 = this.mHeaderHeight;
                i7 += i8;
                measuredHeight += i8;
            }
            this.mRefreshContent.layout(i6, i7, measuredWidth, measuredHeight);
        }
        RefreshHeader refreshHeader2 = this.mRefreshHeader;
        if (refreshHeader2 != null) {
            View view = refreshHeader2.getView();
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            int i9 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            int iMax3 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            int measuredWidth2 = view.getMeasuredWidth() + i9;
            int measuredHeight2 = view.getMeasuredHeight() + iMax3;
            if (!z2) {
                if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate) {
                    iMax3 = (iMax3 - this.mHeaderHeight) + Math.max(0, this.mSpinner);
                    iMax2 = view.getMeasuredHeight();
                } else if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Scale) {
                    iMax2 = Math.max(Math.max(0, this.mSpinner) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0);
                }
                measuredHeight2 = iMax3 + iMax2;
            }
            view.layout(i9, iMax3, measuredWidth2, measuredHeight2);
        }
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            View view2 = refreshFooter.getView();
            LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
            SpinnerStyle spinnerStyle = this.mRefreshFooter.getSpinnerStyle();
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
            int measuredHeight3 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + getMeasuredHeight();
            if (!z2 && spinnerStyle != SpinnerStyle.FixedFront && spinnerStyle != SpinnerStyle.FixedBehind) {
                if (spinnerStyle == SpinnerStyle.Scale || spinnerStyle == SpinnerStyle.Translate) {
                    iMax = Math.max(Math.max(-this.mSpinner, 0) - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, 0);
                }
                view2.layout(i10, measuredHeight3, view2.getMeasuredWidth() + i10, view2.getMeasuredHeight() + measuredHeight3);
            }
            iMax = this.mFooterHeight;
            measuredHeight3 -= iMax;
            view2.layout(i10, measuredHeight3, view2.getMeasuredWidth() + i10, view2.getMeasuredHeight() + measuredHeight3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0210  */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        RefreshFooter refreshFooter;
        RefreshHeader refreshHeader;
        int i4 = 0;
        boolean z = isInEditMode() && this.mEnablePreviewInEditMode;
        RefreshHeader refreshHeader2 = this.mRefreshHeader;
        if (refreshHeader2 != null) {
            View view = refreshHeader2.getView();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (this.mHeaderHeightStatus.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.mHeaderHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), 1073741824));
            } else if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                view.measure(childMeasureSpec, i3);
            } else {
                int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i5 > 0) {
                    DimensionStatus dimensionStatus = this.mHeaderHeightStatus;
                    DimensionStatus dimensionStatus2 = DimensionStatus.XmlExact;
                    if (dimensionStatus.canReplaceWith(dimensionStatus2)) {
                        this.mHeaderHeightStatus = dimensionStatus2;
                        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        this.mHeaderHeight = i6;
                        int iMax = (int) Math.max(i6 * (this.mHeaderMaxDragRate - 1.0f), 0.0f);
                        this.mHeaderExtendHeight = iMax;
                        this.mRefreshHeader.onInitialized(this.mKernel, this.mHeaderHeight, iMax);
                    }
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).height, 1073741824));
                } else if (i5 == -2) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), Integer.MIN_VALUE));
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (measuredHeight2 > 0) {
                        DimensionStatus dimensionStatus3 = this.mHeaderHeightStatus;
                        DimensionStatus dimensionStatus4 = DimensionStatus.XmlWrap;
                        if (dimensionStatus3.canReplaceWith(dimensionStatus4)) {
                            this.mHeaderHeightStatus = dimensionStatus4;
                            int measuredHeight3 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            this.mHeaderHeight = measuredHeight3;
                            int iMax2 = (int) Math.max(measuredHeight3 * (this.mHeaderMaxDragRate - 1.0f), 0.0f);
                            this.mHeaderExtendHeight = iMax2;
                            this.mRefreshHeader.onInitialized(this.mKernel, this.mHeaderHeight, iMax2);
                        } else if (measuredHeight2 <= 0) {
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.mHeaderHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), 1073741824));
                        }
                    } else if (measuredHeight2 <= 0) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.mHeaderHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), 1073741824));
                    }
                } else if (i5 == -1) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.mHeaderHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), 1073741824));
                } else {
                    view.measure(childMeasureSpec, i3);
                }
            }
            if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Scale && !z) {
                view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(Math.max(0, this.mSpinner) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 0), 1073741824));
            }
            DimensionStatus dimensionStatus5 = this.mHeaderHeightStatus;
            if (!dimensionStatus5.notifyed) {
                this.mHeaderHeightStatus = dimensionStatus5.notifyed();
                this.mRefreshHeader.onInitialized(this.mKernel, this.mHeaderHeight, this.mHeaderExtendHeight);
            }
            if (z) {
                measuredHeight = view.getMeasuredHeight() + 0;
            } else {
                measuredHeight = 0;
            }
        } else {
            measuredHeight = 0;
        }
        RefreshFooter refreshFooter2 = this.mRefreshFooter;
        if (refreshFooter2 != null) {
            View view2 = refreshFooter2.getView();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (this.mFooterHeightStatus.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.mFooterHeight - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), 1073741824));
            } else if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                view2.measure(childMeasureSpec2, i3);
            } else {
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                if (i7 > 0) {
                    DimensionStatus dimensionStatus6 = this.mFooterHeightStatus;
                    DimensionStatus dimensionStatus7 = DimensionStatus.XmlExact;
                    if (dimensionStatus6.canReplaceWith(dimensionStatus7)) {
                        this.mFooterHeightStatus = dimensionStatus7;
                        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams2).height + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        this.mFooterHeight = i8;
                        int iMax3 = (int) Math.max(i8 * (this.mFooterMaxDragRate - 1.0f), 0.0f);
                        this.mFooterExtendHeight = iMax3;
                        this.mRefreshFooter.onInitialized(this.mKernel, this.mFooterHeight, iMax3);
                    }
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams2).height - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 1073741824));
                } else if (i7 == -2) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), Integer.MIN_VALUE));
                    int measuredHeight4 = view2.getMeasuredHeight();
                    if (measuredHeight4 > 0) {
                        DimensionStatus dimensionStatus8 = this.mFooterHeightStatus;
                        DimensionStatus dimensionStatus9 = DimensionStatus.XmlWrap;
                        if (dimensionStatus8.canReplaceWith(dimensionStatus9)) {
                            this.mFooterHeightStatus = dimensionStatus9;
                            int measuredHeight5 = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                            this.mFooterHeight = measuredHeight5;
                            int iMax4 = (int) Math.max(measuredHeight5 * (this.mFooterMaxDragRate - 1.0f), 0.0f);
                            this.mFooterExtendHeight = iMax4;
                            this.mRefreshFooter.onInitialized(this.mKernel, this.mFooterHeight, iMax4);
                        } else if (measuredHeight4 <= 0) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.mFooterHeight - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), 1073741824));
                        }
                    } else if (measuredHeight4 <= 0) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.mFooterHeight - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), 1073741824));
                    }
                } else if (i7 == -1) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.mFooterHeight - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), 1073741824));
                } else {
                    view2.measure(childMeasureSpec2, i3);
                }
            }
            if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Scale && !z) {
                view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(Math.max(0, -this.mSpinner) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, 0), 1073741824));
            }
            DimensionStatus dimensionStatus10 = this.mFooterHeightStatus;
            if (!dimensionStatus10.notifyed) {
                this.mFooterHeightStatus = dimensionStatus10.notifyed();
                this.mRefreshFooter.onInitialized(this.mKernel, this.mFooterHeight, this.mFooterExtendHeight);
            }
            if (z) {
                measuredHeight += view2.getMeasuredHeight();
            }
        }
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            LayoutParams layoutParams3 = (LayoutParams) refreshContent.getLayoutParams();
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).width);
            int paddingTop = getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + ((z && (refreshHeader = this.mRefreshHeader) != null && (this.mEnableHeaderTranslationContent || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind)) ? this.mHeaderHeight : 0);
            if (z && (refreshFooter = this.mRefreshFooter) != null && (this.mEnableFooterTranslationContent || refreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                i4 = this.mFooterHeight;
            }
            this.mRefreshContent.measure(childMeasureSpec3, ViewGroup.getChildMeasureSpec(i3, paddingTop + i4, ((ViewGroup.MarginLayoutParams) layoutParams3).height));
            this.mRefreshContent.onInitialHeaderAndFooter(this.mHeaderHeight, this.mFooterHeight);
            measuredHeight += this.mRefreshContent.getMeasuredHeight();
        }
        setMeasuredDimension(ViewGroup.resolveSize(getSuggestedMinimumWidth(), i2), ViewGroup.resolveSize(measuredHeight, i3));
        this.mLastTouchX = getMeasuredWidth() / 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        RefreshState refreshState;
        return this.reboundAnimator != null || (refreshState = this.mState) == RefreshState.ReleaseToRefresh || refreshState == RefreshState.ReleaseToLoad || (refreshState == RefreshState.PullDownToRefresh && this.mSpinner > 0) || ((refreshState == RefreshState.PullToUpLoad && this.mSpinner > 0) || ((refreshState == RefreshState.Refreshing && this.mSpinner != 0) || ((refreshState == RefreshState.Loading && this.mSpinner != 0) || dispatchNestedPreFling(f2, f3))));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.Refreshing;
        if (refreshState != refreshState2 && refreshState != RefreshState.Loading) {
            if (this.mEnableRefresh && i3 > 0 && (i9 = this.mTotalUnconsumed) > 0) {
                if (i3 > i9) {
                    iArr[1] = i3 - i9;
                    this.mTotalUnconsumed = 0;
                } else {
                    this.mTotalUnconsumed = i9 - i3;
                    iArr[1] = i3;
                }
                moveSpinnerInfinitely(this.mTotalUnconsumed);
            } else if (this.mEnableLoadmore && i3 < 0 && (i8 = this.mTotalUnconsumed) < 0) {
                if (i3 < i8) {
                    iArr[1] = i3 - i8;
                    this.mTotalUnconsumed = 0;
                } else {
                    this.mTotalUnconsumed = i8 - i3;
                    iArr[1] = i3;
                }
                moveSpinnerInfinitely(this.mTotalUnconsumed);
            }
            int[] iArr2 = this.mParentScrollConsumed;
            if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
                iArr[0] = iArr[0] + iArr2[0];
                iArr[1] = iArr[1] + iArr2[1];
                return;
            }
            return;
        }
        int[] iArr3 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i2, i3, iArr3, null)) {
            i3 -= iArr3[1];
        }
        RefreshState refreshState3 = this.mState;
        if (refreshState3 == refreshState2 && (this.mTotalUnconsumed * i3 > 0 || this.mTouchSpinner > 0)) {
            iArr[1] = 0;
            if (Math.abs(i3) > Math.abs(this.mTotalUnconsumed)) {
                iArr[1] = iArr[1] + this.mTotalUnconsumed;
                this.mTotalUnconsumed = 0;
                i6 = i3 - 0;
                if (this.mTouchSpinner <= 0) {
                    moveSpinnerInfinitely(0.0f);
                }
            } else {
                int i10 = this.mTotalUnconsumed - i3;
                this.mTotalUnconsumed = i10;
                iArr[1] = iArr[1] + i3;
                moveSpinnerInfinitely(i10 + this.mTouchSpinner);
                i6 = 0;
            }
            if (i6 <= 0 || (i7 = this.mTouchSpinner) <= 0) {
                return;
            }
            if (i6 > i7) {
                iArr[1] = iArr[1] + i7;
                this.mTouchSpinner = 0;
            } else {
                this.mTouchSpinner = i7 - i6;
                iArr[1] = iArr[1] + i6;
            }
            moveSpinnerInfinitely(this.mTouchSpinner);
            return;
        }
        if (refreshState3 == RefreshState.Loading) {
            if (this.mTotalUnconsumed * i3 > 0 || this.mTouchSpinner < 0) {
                iArr[1] = 0;
                if (Math.abs(i3) > Math.abs(this.mTotalUnconsumed)) {
                    iArr[1] = iArr[1] + this.mTotalUnconsumed;
                    this.mTotalUnconsumed = 0;
                    i4 = i3 - 0;
                    if (this.mTouchSpinner >= 0) {
                        moveSpinnerInfinitely(0.0f);
                    }
                } else {
                    int i11 = this.mTotalUnconsumed - i3;
                    this.mTotalUnconsumed = i11;
                    iArr[1] = iArr[1] + i3;
                    moveSpinnerInfinitely(i11 + this.mTouchSpinner);
                    i4 = 0;
                }
                if (i4 >= 0 || (i5 = this.mTouchSpinner) >= 0) {
                    return;
                }
                if (i4 < i5) {
                    iArr[1] = iArr[1] + i5;
                    this.mTouchSpinner = 0;
                } else {
                    this.mTouchSpinner = i5 - i4;
                    iArr[1] = iArr[1] + i4;
                }
                moveSpinnerInfinitely(this.mTouchSpinner);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        RefreshContent refreshContent;
        RefreshContent refreshContent2;
        dispatchNestedScroll(i2, i3, i4, i5, this.mParentOffsetInWindow);
        int i6 = i5 + this.mParentOffsetInWindow[1];
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            if (this.mEnableRefresh && i6 < 0 && ((refreshContent = this.mRefreshContent) == null || refreshContent.canRefresh())) {
                int iAbs = this.mTotalUnconsumed + Math.abs(i6);
                this.mTotalUnconsumed = iAbs;
                moveSpinnerInfinitely(iAbs + this.mTouchSpinner);
                return;
            } else {
                if (!this.mEnableLoadmore || i6 <= 0) {
                    return;
                }
                RefreshContent refreshContent3 = this.mRefreshContent;
                if (refreshContent3 == null || refreshContent3.canLoadmore()) {
                    int iAbs2 = this.mTotalUnconsumed - Math.abs(i6);
                    this.mTotalUnconsumed = iAbs2;
                    moveSpinnerInfinitely(iAbs2 + this.mTouchSpinner);
                    return;
                }
                return;
            }
        }
        if (this.mEnableRefresh && i6 < 0 && ((refreshContent2 = this.mRefreshContent) == null || refreshContent2.canRefresh())) {
            if (this.mState == RefreshState.None) {
                setStatePullDownToRefresh();
            }
            int iAbs3 = this.mTotalUnconsumed + Math.abs(i6);
            this.mTotalUnconsumed = iAbs3;
            moveSpinnerInfinitely(iAbs3);
            return;
        }
        if (!this.mEnableLoadmore || i6 <= 0) {
            return;
        }
        RefreshContent refreshContent4 = this.mRefreshContent;
        if (refreshContent4 == null || refreshContent4.canLoadmore()) {
            if (this.mState == RefreshState.None && !this.mLoadmoreFinished) {
                setStatePullUpToLoad();
            }
            int iAbs4 = this.mTotalUnconsumed - Math.abs(i6);
            this.mTotalUnconsumed = iAbs4;
            moveSpinnerInfinitely(iAbs4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.mTotalUnconsumed = 0;
        this.mTouchSpinner = this.mSpinner;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (isEnabled() && isNestedScrollingEnabled() && (i2 & 2) != 0) && (this.mEnableRefresh || this.mEnableLoadmore);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        this.mNestedScrollInProgress = false;
        this.mTotalUnconsumed = 0;
        overSpinner();
        stopNestedScroll();
    }

    public boolean overSpinner() {
        boolean z;
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Loading) {
            int i2 = this.mSpinner;
            int i3 = this.mFooterHeight;
            if (i2 < (-i3)) {
                this.mTotalUnconsumed = -i3;
                animSpinner(-i3);
                return true;
            }
            if (i2 <= 0) {
                return false;
            }
            this.mTotalUnconsumed = 0;
            animSpinner(0);
            return true;
        }
        if (refreshState == RefreshState.Refreshing) {
            int i4 = this.mSpinner;
            int i5 = this.mHeaderHeight;
            if (i4 > i5) {
                this.mTotalUnconsumed = i5;
                animSpinner(i5);
                return true;
            }
            if (i4 >= 0) {
                return false;
            }
            this.mTotalUnconsumed = 0;
            animSpinner(0);
            return true;
        }
        if (refreshState == RefreshState.PullDownToRefresh || ((z = this.mEnablePureScrollMode) && refreshState == RefreshState.ReleaseToRefresh)) {
            setStatePullDownCanceled();
            return true;
        }
        if (refreshState == RefreshState.PullToUpLoad || (z && refreshState == RefreshState.ReleaseToLoad)) {
            setStatePullUpCanceled();
            return true;
        }
        if (refreshState == RefreshState.ReleaseToRefresh) {
            setStateRefresing();
            return true;
        }
        if (refreshState == RefreshState.ReleaseToLoad) {
            setStateLoding();
            return true;
        }
        if (this.mSpinner == 0) {
            return false;
        }
        animSpinner(0);
        return true;
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        if (handler != null) {
            return handler.post(new DelayedRunable(runnable));
        }
        List<DelayedRunable> arrayList = this.mDelayedRunables;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mDelayedRunables = arrayList;
        arrayList.add(new DelayedRunable(runnable));
        return false;
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j2) {
        Handler handler = this.handler;
        if (handler != null) {
            return handler.postDelayed(new DelayedRunable(runnable), j2);
        }
        List<DelayedRunable> arrayList = this.mDelayedRunables;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mDelayedRunables = arrayList;
        arrayList.add(new DelayedRunable(runnable, j2));
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View scrollableView = this.mRefreshContent.getScrollableView();
        if (Build.VERSION.SDK_INT >= 21 || !(scrollableView instanceof AbsListView)) {
            if (scrollableView == null || ViewCompat.isNestedScrollingEnabled(scrollableView)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void resetStatus() {
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2 && this.mSpinner == 0) {
            notifyStateChanged(refreshState2);
        }
        if (this.mSpinner != 0) {
            animSpinner(0);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableNestedScroll(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.mManualNestedScrolling = true;
        this.mNestedScrollingChildHelper.setNestedScrollingEnabled(z);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        this.mScrollBoundaryDecider = scrollBoundaryDecider;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            refreshContent.setScrollBoundaryDecider(scrollBoundaryDecider);
        }
        return this;
    }

    public void setStateLoding() {
        this.mLastLoadingTime = System.currentTimeMillis();
        notifyStateChanged(RefreshState.Loading);
        animSpinner(-this.mFooterHeight);
        OnLoadmoreListener onLoadmoreListener = this.mLoadmoreListener;
        if (onLoadmoreListener != null) {
            onLoadmoreListener.onLoadmore(this);
        }
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            refreshFooter.onStartAnimator(this, this.mFooterHeight, this.mFooterExtendHeight);
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            onMultiPurposeListener.onLoadmore(this);
            this.mOnMultiPurposeListener.onFooterStartAnimator(this.mRefreshFooter, this.mFooterHeight, this.mFooterExtendHeight);
        }
    }

    public void setStateLodingFinish() {
        notifyStateChanged(RefreshState.LoadFinish);
    }

    public void setStatePullDownCanceled() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.PullDownCanceled);
        } else {
            notifyStateChanged(RefreshState.PullDownCanceled);
            resetStatus();
        }
    }

    public void setStatePullDownToRefresh() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.PullDownToRefresh);
        } else {
            notifyStateChanged(RefreshState.PullDownToRefresh);
        }
    }

    public void setStatePullUpCanceled() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.PullUpCanceled);
        } else {
            notifyStateChanged(RefreshState.PullUpCanceled);
            resetStatus();
        }
    }

    public void setStatePullUpToLoad() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.PullToUpLoad);
        } else {
            notifyStateChanged(RefreshState.PullToUpLoad);
        }
    }

    public void setStateRefresing() {
        this.mLastRefreshingTime = System.currentTimeMillis();
        notifyStateChanged(RefreshState.Refreshing);
        animSpinner(this.mHeaderHeight);
        OnRefreshListener onRefreshListener = this.mRefreshListener;
        if (onRefreshListener != null) {
            onRefreshListener.onRefresh(this);
        }
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader != null) {
            refreshHeader.onStartAnimator(this, this.mHeaderHeight, this.mHeaderExtendHeight);
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            onMultiPurposeListener.onRefresh(this);
            this.mOnMultiPurposeListener.onHeaderStartAnimator(this.mRefreshHeader, this.mHeaderHeight, this.mHeaderExtendHeight);
        }
    }

    public void setStateRefresingFinish() {
        notifyStateChanged(RefreshState.RefreshFinish);
    }

    public void setStateReleaseToLoad() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.ReleaseToLoad);
        } else {
            notifyStateChanged(RefreshState.ReleaseToLoad);
        }
    }

    public void setStateReleaseToRefresh() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading) {
            setViceState(RefreshState.ReleaseToRefresh);
        } else {
            notifyStateChanged(RefreshState.ReleaseToRefresh);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if ((refreshState2 == RefreshState.Refreshing || refreshState2 == RefreshState.Loading) && this.mViceState != refreshState) {
            this.mViceState = refreshState;
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i2) {
        return this.mNestedScrollingChildHelper.startNestedScroll(i2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.stopNestedScroll();
    }

    public ValueAnimator animSpinner(int i2, int i3) {
        return animSpinner(i2, i3, this.mReboundInterpolator);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadmore(int i2) {
        int i3 = this.mFooterHeight;
        return autoLoadmore(i2, (((this.mFooterExtendHeight / 2) + i3) * 1.0f) / i3);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh(int i2) {
        int i3 = this.mHeaderHeight;
        return autoRefresh(i2, (((this.mHeaderExtendHeight / 2) + i3) * 1.0f) / i3);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDisableContentWhenLoading(boolean z) {
        this.mDisableContentWhenLoading = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDisableContentWhenRefresh(boolean z) {
        this.mDisableContentWhenRefresh = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDragRate(float f2) {
        this.mDragRate = f2;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableAutoLoadmore(boolean z) {
        this.mEnableAutoLoadmore = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableFooterTranslationContent(boolean z) {
        this.mEnableFooterTranslationContent = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableHeaderTranslationContent(boolean z) {
        this.mEnableHeaderTranslationContent = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableLoadmore(boolean z) {
        this.mManualLoadmore = true;
        this.mEnableLoadmore = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableLoadmoreWhenContentNotFull(boolean z) {
        this.mEnableLoadmoreWhenContentNotFull = z;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            refreshContent.setEnableLoadmoreWhenContentNotFull(z || this.mEnablePureScrollMode);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableOverScrollBounce(boolean z) {
        this.mEnableOverScrollBounce = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnablePureScrollMode(boolean z) {
        this.mEnablePureScrollMode = z;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            refreshContent.setEnableLoadmoreWhenContentNotFull(z || this.mEnableLoadmoreWhenContentNotFull);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableRefresh(boolean z) {
        this.mEnableRefresh = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableScrollContentWhenLoaded(boolean z) {
        this.mEnableScrollContentWhenLoaded = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterHeight(float f2) {
        return setFooterHeightPx(DensityUtil.dp2px(f2));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterHeightPx(int i2) {
        if (this.mFooterHeightStatus.canReplaceWith(DimensionStatus.CodeExact)) {
            this.mFooterHeight = i2;
            this.mFooterExtendHeight = (int) Math.max(i2 * (this.mFooterMaxDragRate - 1.0f), 0.0f);
            this.mFooterHeightStatus = DimensionStatus.CodeExactUnNotify;
            RefreshFooter refreshFooter = this.mRefreshFooter;
            if (refreshFooter != null) {
                refreshFooter.getView().requestLayout();
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterMaxDragRate(float f2) {
        RefreshKernel refreshKernel;
        this.mFooterMaxDragRate = f2;
        int iMax = (int) Math.max(this.mFooterHeight * (f2 - 1.0f), 0.0f);
        this.mFooterExtendHeight = iMax;
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter == null || (refreshKernel = this.mKernel) == null) {
            this.mFooterHeightStatus = this.mFooterHeightStatus.unNotify();
        } else {
            refreshFooter.onInitialized(refreshKernel, this.mFooterHeight, iMax);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderHeight(float f2) {
        return setHeaderHeightPx(DensityUtil.dp2px(f2));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderHeightPx(int i2) {
        if (this.mHeaderHeightStatus.canReplaceWith(DimensionStatus.CodeExact)) {
            this.mHeaderHeight = i2;
            this.mHeaderExtendHeight = (int) Math.max(i2 * (this.mHeaderMaxDragRate - 1.0f), 0.0f);
            this.mHeaderHeightStatus = DimensionStatus.CodeExactUnNotify;
            RefreshHeader refreshHeader = this.mRefreshHeader;
            if (refreshHeader != null) {
                refreshHeader.getView().requestLayout();
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderMaxDragRate(float f2) {
        RefreshKernel refreshKernel;
        this.mHeaderMaxDragRate = f2;
        int iMax = (int) Math.max(this.mHeaderHeight * (f2 - 1.0f), 0.0f);
        this.mHeaderExtendHeight = iMax;
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader == null || (refreshKernel = this.mKernel) == null) {
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.unNotify();
        } else {
            refreshHeader.onInitialized(refreshKernel, this.mHeaderHeight, iMax);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setLoadmoreFinished(boolean z) {
        this.mLoadmoreFinished = z;
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            refreshFooter.setLoadmoreFinished(z);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnLoadmoreListener(OnLoadmoreListener onLoadmoreListener) {
        this.mLoadmoreListener = onLoadmoreListener;
        this.mEnableLoadmore = this.mEnableLoadmore || !(this.mManualLoadmore || onLoadmoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnMultiPurposeListener(OnMultiPurposeListener onMultiPurposeListener) {
        this.mOnMultiPurposeListener = onMultiPurposeListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mRefreshListener = onRefreshListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnRefreshLoadmoreListener(OnRefreshLoadmoreListener onRefreshLoadmoreListener) {
        this.mRefreshListener = onRefreshLoadmoreListener;
        this.mLoadmoreListener = onRefreshLoadmoreListener;
        this.mEnableLoadmore = this.mEnableLoadmore || !(this.mManualLoadmore || onRefreshLoadmoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setPrimaryColors(int... iArr) {
        RefreshHeader refreshHeader = this.mRefreshHeader;
        if (refreshHeader != null) {
            refreshHeader.setPrimaryColors(iArr);
        }
        RefreshFooter refreshFooter = this.mRefreshFooter;
        if (refreshFooter != null) {
            refreshFooter.setPrimaryColors(iArr);
        }
        this.mPrimaryColors = iArr;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setPrimaryColorsId(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.getColor(getContext(), iArr[i2]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setReboundDuration(int i2) {
        this.mReboundDuration = i2;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setReboundInterpolator(Interpolator interpolator) {
        this.mReboundInterpolator = interpolator;
        return this;
    }

    public ValueAnimator animSpinner(int i2, int i3, Interpolator interpolator) {
        if (this.mSpinner != i2) {
            ValueAnimator valueAnimator = this.reboundAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mSpinner, i2);
            this.reboundAnimator = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(this.mReboundDuration);
            this.reboundAnimator.setInterpolator(interpolator);
            this.reboundAnimator.addUpdateListener(this.reboundUpdateListener);
            this.reboundAnimator.addListener(this.reboundAnimatorEndListener);
            this.reboundAnimator.setStartDelay(i3);
            this.reboundAnimator.start();
        }
        return this.reboundAnimator;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadmore(int i2, float f2) {
        if (this.mState != RefreshState.None || !this.mEnableLoadmore || this.mLoadmoreFinished) {
            return false;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        b bVar = new b(f2);
        if (i2 > 0) {
            this.reboundAnimator = new ValueAnimator();
            postDelayed(bVar, i2);
            return true;
        }
        bVar.run();
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh(int i2, float f2) {
        if (this.mState != RefreshState.None || !this.mEnableRefresh) {
            return false;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        a aVar = new a(f2);
        if (i2 > 0) {
            this.reboundAnimator = new ValueAnimator();
            postDelayed(aVar, i2);
            return true;
        }
        aVar.run();
        return true;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshFooter(RefreshFooter refreshFooter) {
        if (refreshFooter != null) {
            RefreshFooter refreshFooter2 = this.mRefreshFooter;
            if (refreshFooter2 != null) {
                removeView(refreshFooter2.getView());
            }
            this.mRefreshFooter = refreshFooter;
            this.mFooterHeightStatus = this.mFooterHeightStatus.unNotify();
            this.mEnableLoadmore = !this.mManualLoadmore || this.mEnableLoadmore;
            if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.mRefreshFooter.getView(), 0, new LayoutParams(-1, -2));
            } else {
                addView(this.mRefreshFooter.getView(), -1, -2);
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshHeader(RefreshHeader refreshHeader) {
        if (refreshHeader != null) {
            RefreshHeader refreshHeader2 = this.mRefreshHeader;
            if (refreshHeader2 != null) {
                removeView(refreshHeader2.getView());
            }
            this.mRefreshHeader = refreshHeader;
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.unNotify();
            if (refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.mRefreshHeader.getView(), 0, new LayoutParams(-1, -2));
            } else {
                addView(this.mRefreshHeader.getView(), -1, -2);
            }
        }
        return this;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadmore() {
        return finishLoadmore(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.mLastLoadingTime))));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh() {
        return finishRefresh(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.mLastRefreshingTime))));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadmore(int i2) {
        return finishLoadmore(i2, true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(int i2) {
        return finishRefresh(i2, true);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int backgroundColor;
        public SpinnerStyle spinnerStyle;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout_Layout);
            this.backgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.backgroundColor);
            int i = R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.spinnerStyle = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(i, SpinnerStyle.Translate.ordinal())];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadmore(boolean z) {
        return finishLoadmore(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.mLastLoadingTime))), z);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(boolean z) {
        return finishRefresh(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.mLastRefreshingTime))), z);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadmore(int i2, boolean z) {
        postDelayed(new k(z), i2);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(int i2, boolean z) {
        postDelayed(new j(z), i2);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshHeader(RefreshHeader refreshHeader, int i2, int i3) {
        if (refreshHeader != null) {
            RefreshHeader refreshHeader2 = this.mRefreshHeader;
            if (refreshHeader2 != null) {
                removeView(refreshHeader2.getView());
            }
            this.mRefreshHeader = refreshHeader;
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.unNotify();
            if (refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.mRefreshHeader.getView(), 0, new LayoutParams(i2, i3));
            } else {
                addView(this.mRefreshHeader.getView(), i2, i3);
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshFooter(RefreshFooter refreshFooter, int i2, int i3) {
        if (refreshFooter != null) {
            RefreshFooter refreshFooter2 = this.mRefreshFooter;
            if (refreshFooter2 != null) {
                removeView(refreshFooter2.getView());
            }
            this.mRefreshFooter = refreshFooter;
            this.mFooterHeightStatus = this.mFooterHeightStatus.unNotify();
            this.mEnableLoadmore = !this.mManualLoadmore || this.mEnableLoadmore;
            if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.mRefreshFooter.getView(), 0, new LayoutParams(i2, i3));
            } else {
                addView(this.mRefreshFooter.getView(), i2, i3);
            }
        }
        return this;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mReboundDuration = 250;
        this.mDragRate = 0.5f;
        this.mEnableRefresh = true;
        this.mEnableLoadmore = false;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableAutoLoadmore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableLoadmoreWhenContentNotFull = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mLoadmoreFinished = false;
        this.mManualLoadmore = false;
        this.mManualNestedScrolling = false;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.mHeaderHeightStatus = dimensionStatus;
        this.mFooterHeightStatus = dimensionStatus;
        this.mHeaderMaxDragRate = 2.0f;
        this.mFooterMaxDragRate = 2.0f;
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastLoadingTime = 0L;
        this.mLastRefreshingTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.a = null;
        this.reboundAnimatorEndListener = new g();
        this.reboundUpdateListener = new h();
        a(context, attributeSet);
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mReboundDuration = 250;
        this.mDragRate = 0.5f;
        this.mEnableRefresh = true;
        this.mEnableLoadmore = false;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableAutoLoadmore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableLoadmoreWhenContentNotFull = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mLoadmoreFinished = false;
        this.mManualLoadmore = false;
        this.mManualNestedScrolling = false;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.mHeaderHeightStatus = dimensionStatus;
        this.mFooterHeightStatus = dimensionStatus;
        this.mHeaderMaxDragRate = 2.0f;
        this.mFooterMaxDragRate = 2.0f;
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastLoadingTime = 0L;
        this.mLastRefreshingTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.a = null;
        this.reboundAnimatorEndListener = new g();
        this.reboundUpdateListener = new h();
        a(context, attributeSet);
    }

    @RequiresApi(21)
    public SmartRefreshLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mReboundDuration = 250;
        this.mDragRate = 0.5f;
        this.mEnableRefresh = true;
        this.mEnableLoadmore = false;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableAutoLoadmore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableLoadmoreWhenContentNotFull = false;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mLoadmoreFinished = false;
        this.mManualLoadmore = false;
        this.mManualNestedScrolling = false;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.mHeaderHeightStatus = dimensionStatus;
        this.mFooterHeightStatus = dimensionStatus;
        this.mHeaderMaxDragRate = 2.0f;
        this.mFooterMaxDragRate = 2.0f;
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastLoadingTime = 0L;
        this.mLastRefreshingTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.a = null;
        this.reboundAnimatorEndListener = new g();
        this.reboundUpdateListener = new h();
        a(context, attributeSet);
    }
}
