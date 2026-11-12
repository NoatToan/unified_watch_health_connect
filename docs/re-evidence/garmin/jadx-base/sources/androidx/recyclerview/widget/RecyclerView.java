package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.view.x0;
import androidx.core.view.z0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import i3.e5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.t {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final c0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.f0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.r mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<f0> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.r.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.v mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final e0 mViewFlinger;
    private final l0.b mViewInfoProcessCallback;
    final l0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            m mVar = recyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.l();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10285a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10286b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10287c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10288d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10289e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f10290f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f10291g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f10292h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f10293i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f10294j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f10295k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f10297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10298n;

        public final void a(int i14) {
            if ((this.f10288d & i14) != 0) {
                return;
            }
            androidx.core.view.j.y("Layout state should be one of ", Integer.toBinaryString(i14), " but it is ", Integer.toBinaryString(this.f10288d));
        }

        public final int b() {
            return this.f10291g ? this.f10286b - this.f10287c : this.f10289e;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("State{mTargetPosition=");
            sb3.append(this.f10285a);
            sb3.append(", mData=null, mItemCount=");
            sb3.append(this.f10289e);
            sb3.append(", mIsMeasuring=");
            sb3.append(this.f10293i);
            sb3.append(", mPreviousLayoutItemCount=");
            sb3.append(this.f10286b);
            sb3.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb3.append(this.f10287c);
            sb3.append(", mStructureChanged=");
            sb3.append(this.f10290f);
            sb3.append(", mInPreLayout=");
            sb3.append(this.f10291g);
            sb3.append(", mRunSimpleAnimations=");
            sb3.append(this.f10294j);
            sb3.append(", mRunPredictiveAnimations=");
            return am.j.t(sb3, this.f10295k, CoreConstants.CURLY_RIGHT);
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            float f15 = f14 - 1.0f;
            return (f15 * f15 * f15 * f15 * f15) + 1.0f;
        }
    }

    public static class c0 extends l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class d implements l0.b {
        public d() {
        }
    }

    public static abstract class d0 {
        public abstract View a();
    }

    public class e implements androidx.recyclerview.widget.f.b {
        public e() {
        }

        public final void a(int i14) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i14);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i14);
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public OverScroller f10303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f10304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f10306f;

        public e0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f10304d = interpolator;
            this.f10305e = false;
            this.f10306f = false;
            this.f10303c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i14, int i15) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f10302b = 0;
            this.f10301a = 0;
            Interpolator interpolator = this.f10304d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f10304d = interpolator2;
                this.f10303c = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.f10303c.fling(0, 0, i14, i15, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f10305e) {
                this.f10306f = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i14, int i15, int i16, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i16 == Integer.MIN_VALUE) {
                int iAbs = Math.abs(i14);
                int iAbs2 = Math.abs(i15);
                boolean z14 = iAbs > iAbs2;
                int width = z14 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z14) {
                    iAbs = iAbs2;
                }
                i16 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
            }
            int i17 = i16;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f10304d != interpolator) {
                this.f10304d = interpolator;
                this.f10303c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f10302b = 0;
            this.f10301a = 0;
            recyclerView.setScrollState(2);
            this.f10303c.startScroll(0, 0, i14, i15, i17);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f10303c.abortAnimation();
                return;
            }
            this.f10306f = false;
            this.f10305e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f10303c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i19 = currX - this.f10301a;
                int i24 = currY - this.f10302b;
                this.f10301a = currX;
                this.f10302b = currY;
                int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i19);
                int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i24);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i25 = iArr4[0];
                    int i26 = iArr4[1];
                    int i27 = iConsumeFlingInHorizontalStretch - i25;
                    int i28 = iConsumeFlingInVerticalStretch - i26;
                    a0 a0Var = recyclerView.mLayout.mSmoothScroller;
                    if (a0Var != null && !a0Var.isPendingInitialRun() && a0Var.isRunning()) {
                        int iB = recyclerView.mState.b();
                        if (iB == 0) {
                            a0Var.stop();
                        } else if (a0Var.getTargetPosition() >= iB) {
                            a0Var.setTargetPosition(iB - 1);
                            a0Var.onAnimation(i25, i26);
                        } else {
                            a0Var.onAnimation(i25, i26);
                        }
                    }
                    i14 = i27;
                    i16 = i25;
                    i15 = i28;
                    i17 = i26;
                } else {
                    i14 = iConsumeFlingInHorizontalStretch;
                    i15 = iConsumeFlingInVerticalStretch;
                    i16 = 0;
                    i17 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i16, i17, i14, i15, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i29 = i14 - iArr6[0];
                int i30 = i15 - iArr6[1];
                if (i16 != 0 || i17 != 0) {
                    recyclerView.dispatchOnScrolled(i16, i17);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z14 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i29 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i30 != 0));
                a0 a0Var2 = recyclerView.mLayout.mSmoothScroller;
                if ((a0Var2 == null || !a0Var2.isPendingInitialRun()) && z14) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i29 < 0) {
                            i18 = -currVelocity;
                        } else {
                            i18 = i29 > 0 ? currVelocity : 0;
                        }
                        if (i30 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i30 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i18, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        androidx.recyclerview.widget.r.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.f10626c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f10627d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.r rVar = recyclerView.mGapWorker;
                    if (rVar != null) {
                        rVar.a(recyclerView, i16, i17);
                    }
                }
            }
            a0 a0Var3 = recyclerView.mLayout.mSmoothScroller;
            if (a0Var3 != null && a0Var3.isPendingInitialRun()) {
                a0Var3.onAnimation(0, 0);
            }
            this.f10305e = false;
            if (!this.f10306f) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public class f implements androidx.recyclerview.widget.a.InterfaceC0144a {
        public f() {
        }

        public final void a(androidx.recyclerview.widget.a.b bVar) {
            int i14 = bVar.f10407a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i14 == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f10408b, bVar.f10410d);
                return;
            }
            if (i14 == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, bVar.f10408b, bVar.f10410d);
            } else if (i14 == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, bVar.f10408b, bVar.f10410d, bVar.f10409c);
            } else {
                if (i14 != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, bVar.f10408b, bVar.f10410d, 1);
            }
        }
    }

    public static abstract class f0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends f0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        f0 mShadowedHolder = null;
        f0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public f0(View view2) {
            if (view2 != null) {
                this.itemView = view2;
            } else {
                vb.h.s("itemView may not be null");
                throw null;
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i14) {
            this.mFlags = i14 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view2 = this.itemView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return view2.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i14, int i15, boolean z14) {
            addFlags(8);
            offsetPosition(i15, z14);
            this.mPosition = i14;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends f0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i14 = this.mPreLayoutPosition;
            return i14 == -1 ? this.mPosition : i14;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i14 = this.mPreLayoutPosition;
            return i14 == -1 ? this.mPosition : i14;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i14) {
            return (i14 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view2 = this.itemView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return !view2.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i14, boolean z14) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z14) {
                this.mPreLayoutPosition += i14;
            }
            this.mPosition += i14;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i14 = this.mPendingAccessibilityState;
            if (i14 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i14;
            } else {
                View view2 = this.itemView;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                this.mWasImportantForAccessibilityBeforeHidden = view2.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                kg.f.o("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
                return;
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i14, int i15) {
            this.mFlags = (i14 & i15) | (this.mFlags & (~i15));
        }

        public final void setIsRecyclable(boolean z14) {
            int i14 = this.mIsRecyclableCount;
            int i15 = z14 ? i14 - 1 : i14 + 1;
            this.mIsRecyclableCount = i15;
            if (i15 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    androidx.core.view.j.r(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    return;
                }
                toString();
            } else if (!z14 && i15 == 1) {
                this.mFlags |= 16;
            } else if (z14 && i15 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                toString();
            }
        }

        public void setScrapContainer(w wVar, boolean z14) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z14;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbI = sn.a.i(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbI.append(Integer.toHexString(hashCode()));
            sbI.append(" position=");
            sbI.append(this.mPosition);
            sbI.append(" id=");
            sbI.append(this.mItemId);
            sbI.append(", oldPos=");
            sbI.append(this.mOldPosition);
            sbI.append(", pLpos:");
            sbI.append(this.mPreLayoutPosition);
            StringBuilder sb3 = new StringBuilder(sbI.toString());
            if (isScrap()) {
                sb3.append(" scrap ");
                sb3.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb3.append(" invalid");
            }
            if (!isBound()) {
                sb3.append(" unbound");
            }
            if (needsUpdate()) {
                sb3.append(" update");
            }
            if (isRemoved()) {
                sb3.append(" removed");
            }
            if (shouldIgnore()) {
                sb3.append(" ignored");
            }
            if (isTmpDetached()) {
                sb3.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb3.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb3.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb3.append(" no parent");
            }
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return sb3.toString();
        }

        public void unScrap() {
            this.mScrapContainer.o(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10309a;

        static {
            int[] iArr = new int[h.a.values().length];
            f10309a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10309a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class i extends Observable<j> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public final void c(int i14, int i15) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i14, i15, 1);
            }
        }

        public final void d(int i14, int i15, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i14, i15, obj);
            }
        }

        public final void e(int i14, int i15) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i14, i15);
            }
        }

        public final void f(int i14, int i15) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i14, i15);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public interface k {
    }

    public static class l {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f10314a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<a> f10315b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10316c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f10317d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f10318e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f10319f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10321b;
        }

        public static int e(f0 f0Var) {
            int i14 = f0Var.mFlags;
            int i15 = i14 & 14;
            if (f0Var.isInvalid()) {
                return 4;
            }
            if ((i14 & 4) == 0) {
                int oldPosition = f0Var.getOldPosition();
                int absoluteAdapterPosition = f0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i15 | 2048;
                }
            }
            return i15;
        }

        public abstract boolean a(f0 f0Var, c cVar, c cVar2);

        public abstract boolean b(f0 f0Var, f0 f0Var2, c cVar, c cVar2);

        public abstract boolean c(f0 f0Var, c cVar, c cVar2);

        public abstract boolean d(f0 f0Var, c cVar, c cVar2);

        public boolean f(f0 f0Var) {
            return true;
        }

        public boolean g(f0 f0Var, List<Object> list) {
            return f(f0Var);
        }

        public final void h(f0 f0Var) {
            b bVar = this.f10314a;
            if (bVar != null) {
                RecyclerView recyclerView = RecyclerView.this;
                f0Var.setIsRecyclable(true);
                if (f0Var.mShadowedHolder != null && f0Var.mShadowingHolder == null) {
                    f0Var.mShadowedHolder = null;
                }
                f0Var.mShadowingHolder = null;
                if (f0Var.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(f0Var.itemView) || !f0Var.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(f0Var.itemView, false);
            }
        }

        public abstract void i(f0 f0Var);

        public abstract void j();

        public abstract boolean k();

        public abstract void l();
    }

    public class n implements m.b {
        public n() {
        }
    }

    public interface r {
        void a(View view2);

        void d(View view2);
    }

    public static abstract class s {
        public abstract boolean onFling(int i14, int i15);
    }

    public interface t {
        void b(boolean z14);

        boolean c(MotionEvent motionEvent);

        void onTouchEvent(MotionEvent motionEvent);
    }

    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i14) {
        }

        public void onScrolled(RecyclerView recyclerView, int i14, int i15) {
        }
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f10329a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10330b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<h<?>> f10331c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<f0> f10332a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f10333b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f10334c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f10335d = 0;
        }

        public final a a(int i14) {
            SparseArray<a> sparseArray = this.f10329a;
            a aVar = sparseArray.get(i14);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i14, aVar2);
            return aVar2;
        }
    }

    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<f0> f10336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<f0> f10337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<f0> f10338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<f0> f10339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v f10342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d0 f10343h;

        public w() {
            ArrayList<f0> arrayList = new ArrayList<>();
            this.f10336a = arrayList;
            this.f10337b = null;
            this.f10338c = new ArrayList<>();
            this.f10339d = Collections.unmodifiableList(arrayList);
            this.f10340e = 2;
            this.f10341f = 2;
        }

        public static void f(ViewGroup viewGroup, boolean z14) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    f((ViewGroup) childAt, true);
                }
            }
            if (z14) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(f0 f0Var, boolean z14) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
            View view2 = f0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.f0 f0Var2 = recyclerView.mAccessibilityDelegate;
            if (f0Var2 != null) {
                androidx.core.view.a itemDelegate = f0Var2.getItemDelegate();
                s0.r(view2, itemDelegate instanceof androidx.recyclerview.widget.f0.a ? (androidx.core.view.a) ((androidx.recyclerview.widget.f0.a) itemDelegate).f10456b.remove(view2) : null);
            }
            if (z14) {
                x xVar = recyclerView.mRecyclerListener;
                if (xVar != null) {
                    xVar.a(f0Var);
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i14 = 0; i14 < size; i14++) {
                    recyclerView.mRecyclerListeners.get(i14).a(f0Var);
                }
                h hVar = recyclerView.mAdapter;
                if (hVar != null) {
                    hVar.onViewRecycled(f0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(f0Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(f0Var);
                }
            }
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
            v vVarD = d();
            vVarD.getClass();
            int itemViewType = f0Var.getItemViewType();
            ArrayList<f0> arrayList = vVarD.a(itemViewType).f10332a;
            if (vVarD.f10329a.get(itemViewType).f10333b <= arrayList.size()) {
                oe2.f.h(f0Var.itemView);
            } else if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f0Var)) {
                vb.h.s("this scrap item already exists");
            } else {
                f0Var.resetInternal();
                arrayList.add(f0Var);
            }
        }

        public final void b() {
            this.f10336a.clear();
            i();
        }

        public final int c(int i14) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i14 >= 0 && i14 < recyclerView.mState.b()) {
                return !recyclerView.mState.f10291g ? i14 : recyclerView.mAdapterHelper.f(i14, 0);
            }
            StringBuilder sbI = b71.i.i(i14, "invalid position ", ". State item count is ");
            sbI.append(recyclerView.mState.b());
            sbI.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(sbI.toString());
        }

        public final v d() {
            if (this.f10342g == null) {
                this.f10342g = new v();
                g();
            }
            return this.f10342g;
        }

        public final View e(int i14) {
            return n(i14, Long.MAX_VALUE).itemView;
        }

        public final void g() {
            if (this.f10342g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                v vVar = this.f10342g;
                vVar.f10331c.add(recyclerView.mAdapter);
            }
        }

        public final void h(h<?> hVar, boolean z14) {
            v vVar = this.f10342g;
            if (vVar != null) {
                SparseArray<v.a> sparseArray = vVar.f10329a;
                Set<h<?>> set = vVar.f10331c;
                set.remove(hVar);
                if (set.size() != 0 || z14) {
                    return;
                }
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    ArrayList<f0> arrayList = sparseArray.get(sparseArray.keyAt(i14)).f10332a;
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        oe2.f.h(arrayList.get(i15).itemView);
                    }
                }
            }
        }

        public final void i() {
            ArrayList<f0> arrayList = this.f10338c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                androidx.recyclerview.widget.r.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f10626c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f10627d = 0;
            }
        }

        public final void j(int i14) {
            int i15 = RecyclerView.HORIZONTAL;
            ArrayList<f0> arrayList = this.f10338c;
            f0 f0Var = arrayList.get(i14);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(f0Var);
            }
            a(f0Var, true);
            arrayList.remove(i14);
        }

        public final void k(View view2) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            boolean zIsTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsTmpDetached) {
                recyclerView.removeDetachedView(view2, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            l(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.i(childViewHolderInt);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:61:0x00c1 A[LOOP:2: B:57:0x00b6->B:61:0x00c1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00c4 A[EDGE_INSN: B:87:0x00c4->B:62:0x00c4 BREAK  A[LOOP:1: B:53:0x00a1->B:60:0x00be], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00c4 A[EDGE_INSN: B:88:0x00c4->B:62:0x00c4 BREAK  A[LOOP:1: B:53:0x00a1->B:60:0x00be, LOOP_LABEL: LOOP:1: B:53:0x00a1->B:60:0x00be], SYNTHETIC] */
        public final void l(f0 f0Var) {
            boolean z14;
            int i14;
            int i15;
            androidx.recyclerview.widget.r.b bVar;
            int i16;
            int i17;
            boolean zIsScrap = f0Var.isScrap();
            boolean z15 = false;
            boolean z16 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (zIsScrap || f0Var.itemView.getParent() != null) {
                StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb3.append(f0Var.isScrap());
                sb3.append(" isAttached:");
                sb3.append(f0Var.itemView.getParent() != null);
                sb3.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            }
            if (f0Var.isTmpDetached()) {
                StringBuilder sb4 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb4.append(f0Var);
                vb.h.s(androidx.core.view.j.g(recyclerView, sb4));
                return;
            }
            if (f0Var.shouldIgnore()) {
                vb.h.s(androidx.core.view.j.g(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                return;
            }
            boolean zDoesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
            h hVar = recyclerView.mAdapter;
            boolean z17 = hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f0Var);
            boolean z18 = RecyclerView.sDebugAssertionsEnabled;
            ArrayList<f0> arrayList = this.f10338c;
            if (z18 && arrayList.contains(f0Var)) {
                StringBuilder sb5 = new StringBuilder("cached view received recycle internal? ");
                sb5.append(f0Var);
                vb.h.s(androidx.core.view.j.g(recyclerView, sb5));
                return;
            }
            if (z17 || f0Var.isRecyclable()) {
                if (this.f10341f <= 0 || f0Var.hasAnyOfTheFlags(526)) {
                    z14 = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f10341f && size > 0) {
                        j(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        androidx.recyclerview.widget.r.b bVar2 = recyclerView.mPrefetchRegistry;
                        int i18 = f0Var.mPosition;
                        if (bVar2.f10626c != null) {
                            int i19 = bVar2.f10627d * 2;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= i19) {
                                    i14 = size - 1;
                                    loop1: while (i14 >= 0) {
                                        i15 = arrayList.get(i14).mPosition;
                                        bVar = recyclerView.mPrefetchRegistry;
                                        if (bVar.f10626c != null) {
                                            break;
                                        }
                                        i16 = bVar.f10627d * 2;
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < i16) {
                                                break loop1;
                                            } else if (bVar.f10626c[i17] == i15) {
                                                break;
                                            } else {
                                                i17 += 2;
                                            }
                                        }
                                        i14--;
                                    }
                                    size = i14 + 1;
                                } else if (bVar2.f10626c[i24] != i18) {
                                    i24 += 2;
                                }
                            }
                        } else {
                            i14 = size - 1;
                            loop1: while (i14 >= 0) {
                                i15 = arrayList.get(i14).mPosition;
                                bVar = recyclerView.mPrefetchRegistry;
                                if (bVar.f10626c != null) {
                                    break;
                                    break;
                                }
                                i16 = bVar.f10627d * 2;
                                i17 = 0;
                                while (true) {
                                    if (i17 < i16) {
                                        break loop1;
                                        break loop1;
                                    } else if (bVar.f10626c[i17] == i15) {
                                        break;
                                    } else {
                                        i17 += 2;
                                    }
                                }
                                i14--;
                            }
                            size = i14 + 1;
                        }
                    }
                    arrayList.add(size, f0Var);
                    z14 = true;
                }
                if (z14) {
                    z16 = false;
                } else {
                    a(f0Var, true);
                }
                z15 = z14;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    recyclerView.exceptionLabel();
                }
                z16 = false;
            }
            recyclerView.mViewInfoStore.d(f0Var);
            if (z15 || z16 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            oe2.f.h(f0Var.itemView);
            f0Var.mBindingAdapter = null;
            f0Var.mOwnerRecyclerView = null;
        }

        public final void m(View view2) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            boolean zHasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!zHasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f10337b == null) {
                    this.f10337b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f10337b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                vb.h.s(androidx.core.view.j.g(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f10336a.add(childViewHolderInt);
            }
        }

        /* JADX WARN: Code duplicated, block: B:106:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:121:0x01e8  */
        /* JADX WARN: Code duplicated, block: B:123:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:124:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:126:0x0201  */
        /* JADX WARN: Code duplicated, block: B:128:0x0209  */
        /* JADX WARN: Code duplicated, block: B:131:0x021e  */
        /* JADX WARN: Code duplicated, block: B:134:0x0229  */
        /* JADX WARN: Code duplicated, block: B:196:0x0350 A[EDGE_INSN: B:196:0x0350->B:197:0x0351 BREAK  A[LOOP:3: B:191:0x0338->B:195:0x034d]] */
        /* JADX WARN: Code duplicated, block: B:228:0x03e3  */
        /* JADX WARN: Code duplicated, block: B:236:0x0400  */
        /* JADX WARN: Code duplicated, block: B:242:0x0436  */
        /* JADX WARN: Code duplicated, block: B:244:0x043c  */
        /* JADX WARN: Code duplicated, block: B:250:0x044e  */
        /* JADX WARN: Code duplicated, block: B:252:0x0452  */
        /* JADX WARN: Code duplicated, block: B:259:0x0481  */
        /* JADX WARN: Code duplicated, block: B:261:0x048d  */
        /* JADX WARN: Code duplicated, block: B:265:0x0498  */
        /* JADX WARN: Code duplicated, block: B:266:0x04aa  */
        /* JADX WARN: Code duplicated, block: B:269:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:273:0x04cd  */
        /* JADX WARN: Code duplicated, block: B:276:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:278:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:279:0x04ec  */
        /* JADX WARN: Code duplicated, block: B:283:0x04f3  */
        /* JADX WARN: Code duplicated, block: B:285:0x04fb  */
        /* JADX WARN: Code duplicated, block: B:288:0x0505  */
        /* JADX WARN: Code duplicated, block: B:290:0x0509  */
        /* JADX WARN: Code duplicated, block: B:291:0x050e  */
        /* JADX WARN: Code duplicated, block: B:293:0x0515 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:296:0x0520  */
        /* JADX WARN: Code duplicated, block: B:299:0x0528  */
        /* JADX WARN: Code duplicated, block: B:303:0x0533  */
        /* JADX WARN: Code duplicated, block: B:304:0x053f  */
        /* JADX WARN: Code duplicated, block: B:306:0x0545  */
        /* JADX WARN: Code duplicated, block: B:307:0x0551  */
        /* JADX WARN: Code duplicated, block: B:310:0x0558 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:312:0x055b  */
        /* JADX WARN: Code duplicated, block: B:323:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:339:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:344:0x0182 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0082 A[EDGE_INSN: B:35:0x0082->B:36:0x0083 BREAK  A[LOOP:0: B:14:0x0026->B:20:0x0040]] */
        /* JADX WARN: Code duplicated, block: B:42:0x008f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0096  */
        /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:70:0x0112  */
        /* JADX WARN: Code duplicated, block: B:72:0x0118  */
        /* JADX WARN: Code duplicated, block: B:74:0x0127 A[EDGE_INSN: B:74:0x0127->B:95:0x0183 BREAK  A[LOOP:1: B:43:0x0094->B:55:0x00c2]] */
        /* JADX WARN: Code duplicated, block: B:75:0x0136  */
        /* JADX WARN: Code duplicated, block: B:77:0x0148  */
        /* JADX WARN: Code duplicated, block: B:79:0x014e  */
        /* JADX WARN: Code duplicated, block: B:81:0x0154  */
        /* JADX WARN: Code duplicated, block: B:83:0x015b  */
        /* JADX WARN: Code duplicated, block: B:96:0x0185  */
        /* JADX WARN: Code duplicated, block: B:98:0x018b  */
        public final f0 n(int i14, long j8) {
            f0 childViewHolder;
            boolean z14;
            ArrayList<f0> arrayList;
            ArrayList<f0> arrayList2;
            boolean z15;
            long j14;
            long j15;
            int itemViewType;
            boolean z16;
            long nanoTime;
            long j16;
            boolean z17;
            Object[] objArr;
            View view2;
            androidx.recyclerview.widget.f0 f0Var;
            androidx.core.view.a itemDelegate;
            androidx.recyclerview.widget.f0.a aVar;
            View.AccessibilityDelegate accessibilityDelegateE;
            long j17;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            int iF;
            RecyclerView recyclerViewFindNestedRecyclerView;
            f0 f0VarRemove;
            d0 d0Var;
            View viewA;
            int size;
            int i15;
            androidx.recyclerview.widget.f fVar;
            ArrayList arrayList3;
            int size2;
            int i16;
            View view3;
            int size3;
            int i17;
            f0 f0Var2;
            f0 childViewHolderInt;
            androidx.recyclerview.widget.f fVar2;
            androidx.recyclerview.widget.f.a aVar2;
            int iIndexOfChild;
            int iJ;
            f0 childViewHolderInt2;
            int i18;
            boolean z18;
            f0 f0Var3;
            int size4;
            int iF2;
            RecyclerView recyclerView = RecyclerView.this;
            if (i14 < 0 || i14 >= recyclerView.mState.b()) {
                StringBuilder sbJ = e5.j(i14, i14, "Invalid item position ", "(", "). Item count:");
                sbJ.append(recyclerView.mState.b());
                sbJ.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbJ.toString());
            }
            androidx.core.view.a aVar3 = null;
            if (recyclerView.mState.f10291g) {
                ArrayList<f0> arrayList4 = this.f10337b;
                if (arrayList4 != null && (size4 = arrayList4.size()) != 0) {
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size4) {
                            if (recyclerView.mAdapter.hasStableIds() && (iF2 = recyclerView.mAdapterHelper.f(i14, 0)) > 0 && iF2 < recyclerView.mAdapter.getItemCount()) {
                                long itemId = recyclerView.mAdapter.getItemId(iF2);
                                int i24 = 0;
                                while (true) {
                                    if (i24 >= size4) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    f0 f0Var4 = this.f10337b.get(i24);
                                    if (!f0Var4.wasReturnedFromScrap() && f0Var4.getItemId() == itemId) {
                                        f0Var4.addFlags(32);
                                        childViewHolder = f0Var4;
                                        break;
                                    }
                                    i24++;
                                }
                            } else {
                                childViewHolder = null;
                                break;
                            }
                        } else {
                            childViewHolder = this.f10337b.get(i19);
                            if (!childViewHolder.wasReturnedFromScrap() && childViewHolder.getLayoutPosition() == i14) {
                                childViewHolder.addFlags(32);
                                break;
                            }
                            i19++;
                        }
                    }
                } else {
                    childViewHolder = null;
                    break;
                }
                if (childViewHolder != null) {
                    z14 = true;
                }
                arrayList = this.f10336a;
                arrayList2 = this.f10338c;
                if (childViewHolder == null) {
                    size = arrayList.size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            fVar = recyclerView.mChildHelper;
                            arrayList3 = fVar.f10450c;
                            size2 = arrayList3.size();
                            i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    z15 = true;
                                    view3 = null;
                                    break;
                                }
                                view3 = (View) arrayList3.get(i16);
                                ((e) fVar.f10448a).getClass();
                                childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                                z15 = true;
                                if (childViewHolderInt2.getLayoutPosition() != i14 && !childViewHolderInt2.isInvalid() && !childViewHolderInt2.isRemoved()) {
                                    break;
                                }
                                i16++;
                            }
                            if (view3 != null) {
                                size3 = arrayList2.size();
                                i17 = 0;
                                while (true) {
                                    if (i17 < size3) {
                                        childViewHolder = null;
                                        break;
                                    }
                                    f0Var2 = arrayList2.get(i17);
                                    if (f0Var2.isInvalid() && f0Var2.getLayoutPosition() == i14 && !f0Var2.isAttachedToTransitionOverlay()) {
                                        arrayList2.remove(i17);
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            f0Var2.toString();
                                        }
                                        childViewHolder = f0Var2;
                                        break;
                                    }
                                    i17++;
                                }
                            } else {
                                childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                                fVar2 = recyclerView.mChildHelper;
                                aVar2 = fVar2.f10449b;
                                iIndexOfChild = RecyclerView.this.indexOfChild(view3);
                                if (iIndexOfChild >= 0) {
                                    com.google.firebase.messaging.l.j(view3, "view is not a child, cannot hide ");
                                    return null;
                                }
                                if (aVar2.d(iIndexOfChild)) {
                                    androidx.core.view.j.r(view3, "trying to unhide a view that was not hidden");
                                    return null;
                                }
                                aVar2.a(iIndexOfChild);
                                fVar2.l(view3);
                                iJ = recyclerView.mChildHelper.j(view3);
                                if (iJ != -1) {
                                    StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb3.append(childViewHolderInt);
                                    vb.h.z(androidx.core.view.j.g(recyclerView, sb3));
                                    return null;
                                }
                                recyclerView.mChildHelper.c(iJ);
                                m(view3);
                                childViewHolderInt.addFlags(8224);
                                childViewHolder = childViewHolderInt;
                                break;
                            }
                        } else {
                            f0Var3 = arrayList.get(i15);
                            if (f0Var3.wasReturnedFromScrap() && f0Var3.getLayoutPosition() == i14 && !f0Var3.isInvalid() && (recyclerView.mState.f10291g || !f0Var3.isRemoved())) {
                                f0Var3.addFlags(32);
                                childViewHolder = f0Var3;
                                z15 = true;
                                break;
                            }
                            i15++;
                        }
                    }
                    if (childViewHolder != null) {
                        if (childViewHolder.isRemoved()) {
                            i18 = childViewHolder.mPosition;
                            if (i18 >= 0 || i18 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder sb4 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb4.append(childViewHolder);
                                org.apache.commons.lang3.e.v(androidx.core.view.j.g(recyclerView, sb4));
                                return null;
                            }
                            z18 = ((recyclerView.mState.f10291g || recyclerView.mAdapter.getItemViewType(childViewHolder.mPosition) == childViewHolder.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || childViewHolder.getItemId() == recyclerView.mAdapter.getItemId(childViewHolder.mPosition))) ? z15 : false;
                        } else {
                            if (!RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.f10291g) {
                                vb.h.z(androidx.core.view.j.g(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                                return null;
                            }
                            z18 = recyclerView.mState.f10291g;
                        }
                        if (z18) {
                            z14 = z15;
                        } else {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                recyclerView.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            l(childViewHolder);
                            childViewHolder = null;
                        }
                    }
                } else {
                    z15 = true;
                }
                if (childViewHolder == null) {
                    iF = recyclerView.mAdapterHelper.f(i14, 0);
                    if (iF >= 0 || iF >= recyclerView.mAdapter.getItemCount()) {
                        StringBuilder sbJ2 = e5.j(i14, iF, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                        sbJ2.append(recyclerView.mState.b());
                        sbJ2.append(recyclerView.exceptionLabel());
                        throw new IndexOutOfBoundsException(sbJ2.toString());
                    }
                    int itemViewType2 = recyclerView.mAdapter.getItemViewType(iF);
                    j14 = 3;
                    if (recyclerView.mAdapter.hasStableIds()) {
                        long itemId2 = recyclerView.mAdapter.getItemId(iF);
                        int size5 = arrayList.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                j15 = 4;
                                int size6 = arrayList2.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        f0 f0Var5 = arrayList2.get(size6);
                                        if (f0Var5.getItemId() != itemId2 || f0Var5.isAttachedToTransitionOverlay()) {
                                            size6--;
                                        } else {
                                            if (itemViewType2 == f0Var5.getItemViewType()) {
                                                arrayList2.remove(size6);
                                                childViewHolder = f0Var5;
                                                break;
                                            }
                                            j(size6);
                                        }
                                    }
                                    childViewHolder = null;
                                    break;
                                }
                            }
                            j15 = 4;
                            f0 f0Var6 = arrayList.get(size5);
                            if (f0Var6.getItemId() == itemId2 && !f0Var6.wasReturnedFromScrap()) {
                                if (itemViewType2 == f0Var6.getItemViewType()) {
                                    f0Var6.addFlags(32);
                                    if (f0Var6.isRemoved() && !recyclerView.mState.f10291g) {
                                        f0Var6.setFlags(2, 14);
                                    }
                                    childViewHolder = f0Var6;
                                    break;
                                }
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(f0Var6.itemView, false);
                                f0 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(f0Var6.itemView);
                                childViewHolderInt3.mScrapContainer = null;
                                childViewHolderInt3.mInChangeScrap = false;
                                childViewHolderInt3.clearReturnedFromScrapFlag();
                                l(childViewHolderInt3);
                            }
                            size5--;
                        }
                        if (childViewHolder != null) {
                            childViewHolder.mPosition = iF;
                            z14 = z15;
                        }
                    } else {
                        j15 = 4;
                    }
                    if (childViewHolder == null && (d0Var = this.f10343h) != null && (viewA = d0Var.a()) != null) {
                        childViewHolder = recyclerView.getChildViewHolder(viewA);
                        if (childViewHolder == null) {
                            vb.h.s(androidx.core.view.j.g(recyclerView, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                            return null;
                        }
                        if (childViewHolder.shouldIgnore()) {
                            vb.h.s(androidx.core.view.j.g(recyclerView, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                            return null;
                        }
                    }
                    if (childViewHolder == null) {
                        int i25 = RecyclerView.HORIZONTAL;
                        v.a aVar4 = d().f10329a.get(itemViewType2);
                        if (aVar4 == null) {
                            f0VarRemove = null;
                            break;
                        }
                        ArrayList<f0> arrayList5 = aVar4.f10332a;
                        if (!arrayList5.isEmpty()) {
                            int size7 = arrayList5.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    f0VarRemove = null;
                                    break;
                                }
                                if (!arrayList5.get(size7).isAttachedToTransitionOverlay()) {
                                    f0VarRemove = arrayList5.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            f0VarRemove = null;
                            break;
                        }
                        if (f0VarRemove != null) {
                            f0VarRemove.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view4 = f0VarRemove.itemView;
                                if (view4 instanceof ViewGroup) {
                                    f((ViewGroup) view4, false);
                                }
                            }
                        }
                        childViewHolder = f0VarRemove;
                    }
                    if (childViewHolder == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j8 != Long.MAX_VALUE) {
                            long j18 = this.f10342g.a(itemViewType2).f10334c;
                            if (!((j18 == 0 || j18 + nanoTime2 < j8) ? z15 : false)) {
                                return null;
                            }
                        }
                        f0 f0VarCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType2);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(f0VarCreateViewHolder.itemView)) != null) {
                            f0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                        v.a aVarA = this.f10342g.a(itemViewType2);
                        long j19 = aVarA.f10334c;
                        if (j19 != 0) {
                            nanoTime3 = (nanoTime3 / j15) + ((j19 / j15) * 3);
                        }
                        aVarA.f10334c = nanoTime3;
                        childViewHolder = f0VarCreateViewHolder;
                    }
                } else {
                    j14 = 3;
                    j15 = 4;
                }
                if (z14 && !recyclerView.mState.f10291g && childViewHolder.hasAnyOfTheFlags(8192)) {
                    childViewHolder.setFlags(0, 8192);
                    if (recyclerView.mState.f10294j) {
                        m.e(childViewHolder);
                        m mVar = recyclerView.mItemAnimator;
                        childViewHolder.getUnmodifiedPayloads();
                        mVar.getClass();
                        m.c cVar = new m.c();
                        View view5 = childViewHolder.itemView;
                        cVar.f10320a = view5.getLeft();
                        cVar.f10321b = view5.getTop();
                        view5.getRight();
                        view5.getBottom();
                        recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolder, cVar);
                    }
                }
                if (recyclerView.mState.f10291g || !childViewHolder.isBound()) {
                    if (childViewHolder.isBound() || childViewHolder.needsUpdate() || childViewHolder.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && childViewHolder.isRemoved()) {
                            StringBuilder sb5 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb5.append(childViewHolder);
                            vb.h.z(androidx.core.view.j.g(recyclerView, sb5));
                            return null;
                        }
                        int iF3 = recyclerView.mAdapterHelper.f(i14, 0);
                        childViewHolder.mBindingAdapter = null;
                        childViewHolder.mOwnerRecyclerView = recyclerView;
                        itemViewType = childViewHolder.getItemViewType();
                        long nanoTime4 = recyclerView.getNanoTime();
                        if (j8 != Long.MAX_VALUE) {
                            j17 = this.f10342g.a(itemViewType).f10335d;
                            if (j17 != 0 || j17 + nanoTime4 < j8) {
                            }
                        }
                        if (childViewHolder.isTmpDetached()) {
                            recyclerView.attachViewToParent(childViewHolder.itemView, recyclerView.getChildCount(), childViewHolder.itemView.getLayoutParams());
                            z16 = z15;
                        } else {
                            z16 = false;
                        }
                        recyclerView.mAdapter.bindViewHolder(childViewHolder, iF3);
                        if (z16) {
                            recyclerView.detachViewFromParent(childViewHolder.itemView);
                        }
                        nanoTime = recyclerView.getNanoTime() - nanoTime4;
                        v.a aVarA2 = this.f10342g.a(childViewHolder.getItemViewType());
                        j16 = aVarA2.f10335d;
                        if (j16 != 0) {
                            nanoTime = (nanoTime / j15) + ((j16 / j15) * j14);
                        }
                        aVarA2.f10335d = nanoTime;
                        if (recyclerView.isAccessibilityEnabled()) {
                            view2 = childViewHolder.itemView;
                            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                            if (view2.getImportantForAccessibility() == 0) {
                                z17 = z15;
                                view2.setImportantForAccessibility(z17 ? 1 : 0);
                            } else {
                                z17 = z15;
                            }
                            f0Var = recyclerView.mAccessibilityDelegate;
                            if (f0Var != null) {
                                itemDelegate = f0Var.getItemDelegate();
                                if (itemDelegate instanceof androidx.recyclerview.widget.f0.a) {
                                    aVar = (androidx.recyclerview.widget.f0.a) itemDelegate;
                                    accessibilityDelegateE = s0.e(view2);
                                    if (accessibilityDelegateE != null) {
                                        if (accessibilityDelegateE instanceof androidx.core.view.a.C0086a) {
                                            aVar3 = ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a;
                                        } else {
                                            aVar3 = new androidx.core.view.a(accessibilityDelegateE);
                                        }
                                    }
                                    if (aVar3 != null && aVar3 != aVar) {
                                        aVar.f10456b.put(view2, aVar3);
                                    }
                                }
                                s0.r(view2, itemDelegate);
                            }
                        } else {
                            z17 = z15;
                        }
                        if (recyclerView.mState.f10291g) {
                            childViewHolder.mPreLayoutPosition = i14;
                        }
                        objArr = z17 ? 1 : 0;
                    }
                    layoutParams = childViewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) recyclerView.generateDefaultLayoutParams();
                        childViewHolder.itemView.setLayoutParams(qVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) recyclerView.generateLayoutParams(layoutParams);
                        childViewHolder.itemView.setLayoutParams(qVar);
                    }
                    qVar.mViewHolder = childViewHolder;
                    if (z14 || objArr == null) {
                        z17 = false;
                    }
                    qVar.mPendingInvalidate = z17;
                    return childViewHolder;
                }
                childViewHolder.mPreLayoutPosition = i14;
                objArr = null;
                z17 = z15;
                layoutParams = childViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (q) recyclerView.generateDefaultLayoutParams();
                    childViewHolder.itemView.setLayoutParams(qVar);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    qVar = (q) recyclerView.generateLayoutParams(layoutParams);
                    childViewHolder.itemView.setLayoutParams(qVar);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.mViewHolder = childViewHolder;
                if (z14) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                qVar.mPendingInvalidate = z17;
                return childViewHolder;
            }
            childViewHolder = null;
            z14 = false;
            arrayList = this.f10336a;
            arrayList2 = this.f10338c;
            if (childViewHolder == null) {
                size = arrayList.size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        fVar = recyclerView.mChildHelper;
                        arrayList3 = fVar.f10450c;
                        size2 = arrayList3.size();
                        i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                z15 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList3.get(i16);
                            ((e) fVar.f10448a).getClass();
                            childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view3);
                            z15 = true;
                            if (childViewHolderInt2.getLayoutPosition() != i14) {
                            }
                            i16++;
                        }
                        if (view3 != null) {
                            size3 = arrayList2.size();
                            i17 = 0;
                            while (true) {
                                if (i17 < size3) {
                                    childViewHolder = null;
                                    break;
                                }
                                f0Var2 = arrayList2.get(i17);
                                if (f0Var2.isInvalid()) {
                                }
                                i17++;
                            }
                        } else {
                            childViewHolderInt = RecyclerView.getChildViewHolderInt(view3);
                            fVar2 = recyclerView.mChildHelper;
                            aVar2 = fVar2.f10449b;
                            iIndexOfChild = RecyclerView.this.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                com.google.firebase.messaging.l.j(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (aVar2.d(iIndexOfChild)) {
                                androidx.core.view.j.r(view3, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            aVar2.a(iIndexOfChild);
                            fVar2.l(view3);
                            iJ = recyclerView.mChildHelper.j(view3);
                            if (iJ != -1) {
                                StringBuilder sb6 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb6.append(childViewHolderInt);
                                vb.h.z(androidx.core.view.j.g(recyclerView, sb6));
                                return null;
                            }
                            recyclerView.mChildHelper.c(iJ);
                            m(view3);
                            childViewHolderInt.addFlags(8224);
                            childViewHolder = childViewHolderInt;
                            break;
                        }
                    } else {
                        f0Var3 = arrayList.get(i15);
                        if (f0Var3.wasReturnedFromScrap()) {
                        }
                        i15++;
                    }
                }
                if (childViewHolder != null) {
                    if (childViewHolder.isRemoved()) {
                        i18 = childViewHolder.mPosition;
                        if (i18 >= 0) {
                        }
                        StringBuilder sb7 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb7.append(childViewHolder);
                        org.apache.commons.lang3.e.v(androidx.core.view.j.g(recyclerView, sb7));
                        return null;
                    }
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    z18 = recyclerView.mState.f10291g;
                    if (z18) {
                        childViewHolder.addFlags(4);
                        if (childViewHolder.isScrap()) {
                            recyclerView.removeDetachedView(childViewHolder.itemView, false);
                            childViewHolder.unScrap();
                        } else if (childViewHolder.wasReturnedFromScrap()) {
                            childViewHolder.clearReturnedFromScrapFlag();
                        }
                        l(childViewHolder);
                        childViewHolder = null;
                    } else {
                        z14 = z15;
                    }
                }
            } else {
                z15 = true;
            }
            if (childViewHolder == null) {
                iF = recyclerView.mAdapterHelper.f(i14, 0);
                if (iF >= 0) {
                }
                StringBuilder sbJ3 = e5.j(i14, iF, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbJ3.append(recyclerView.mState.b());
                sbJ3.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(sbJ3.toString());
            }
            j14 = 3;
            j15 = 4;
            if (z14) {
                childViewHolder.setFlags(0, 8192);
                if (recyclerView.mState.f10294j) {
                    m.e(childViewHolder);
                    m mVar2 = recyclerView.mItemAnimator;
                    childViewHolder.getUnmodifiedPayloads();
                    mVar2.getClass();
                    m.c cVar2 = new m.c();
                    View view6 = childViewHolder.itemView;
                    cVar2.f10320a = view6.getLeft();
                    cVar2.f10321b = view6.getTop();
                    view6.getRight();
                    view6.getBottom();
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(childViewHolder, cVar2);
                }
            }
            if (recyclerView.mState.f10291g) {
                if (childViewHolder.isBound()) {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    int iF4 = recyclerView.mAdapterHelper.f(i14, 0);
                    childViewHolder.mBindingAdapter = null;
                    childViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime5 = recyclerView.getNanoTime();
                    if (j8 != Long.MAX_VALUE) {
                        j17 = this.f10342g.a(itemViewType).f10335d;
                        if (j17 != 0) {
                        }
                    }
                    if (childViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(childViewHolder.itemView, recyclerView.getChildCount(), childViewHolder.itemView.getLayoutParams());
                        z16 = z15;
                    } else {
                        z16 = false;
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolder, iF4);
                    if (z16) {
                        recyclerView.detachViewFromParent(childViewHolder.itemView);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime5;
                    v.a aVarA3 = this.f10342g.a(childViewHolder.getItemViewType());
                    j16 = aVarA3.f10335d;
                    if (j16 != 0) {
                        nanoTime = (nanoTime / j15) + ((j16 / j15) * j14);
                    }
                    aVarA3.f10335d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view2 = childViewHolder.itemView;
                        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                        if (view2.getImportantForAccessibility() == 0) {
                            z17 = z15;
                            view2.setImportantForAccessibility(z17 ? 1 : 0);
                        } else {
                            z17 = z15;
                        }
                        f0Var = recyclerView.mAccessibilityDelegate;
                        if (f0Var != null) {
                            itemDelegate = f0Var.getItemDelegate();
                            if (itemDelegate instanceof androidx.recyclerview.widget.f0.a) {
                                aVar = (androidx.recyclerview.widget.f0.a) itemDelegate;
                                accessibilityDelegateE = s0.e(view2);
                                if (accessibilityDelegateE != null) {
                                    if (accessibilityDelegateE instanceof androidx.core.view.a.C0086a) {
                                        aVar3 = ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a;
                                    } else {
                                        aVar3 = new androidx.core.view.a(accessibilityDelegateE);
                                    }
                                }
                                if (aVar3 != null) {
                                    aVar.f10456b.put(view2, aVar3);
                                }
                            }
                            s0.r(view2, itemDelegate);
                        }
                    } else {
                        z17 = z15;
                    }
                    if (recyclerView.mState.f10291g) {
                        childViewHolder.mPreLayoutPosition = i14;
                    }
                    objArr = z17 ? 1 : 0;
                } else {
                    if (!RecyclerView.sDebugAssertionsEnabled) {
                    }
                    int iF5 = recyclerView.mAdapterHelper.f(i14, 0);
                    childViewHolder.mBindingAdapter = null;
                    childViewHolder.mOwnerRecyclerView = recyclerView;
                    itemViewType = childViewHolder.getItemViewType();
                    long nanoTime6 = recyclerView.getNanoTime();
                    if (j8 != Long.MAX_VALUE) {
                        j17 = this.f10342g.a(itemViewType).f10335d;
                        if (j17 != 0) {
                        }
                    }
                    if (childViewHolder.isTmpDetached()) {
                        recyclerView.attachViewToParent(childViewHolder.itemView, recyclerView.getChildCount(), childViewHolder.itemView.getLayoutParams());
                        z16 = z15;
                    } else {
                        z16 = false;
                    }
                    recyclerView.mAdapter.bindViewHolder(childViewHolder, iF5);
                    if (z16) {
                        recyclerView.detachViewFromParent(childViewHolder.itemView);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime6;
                    v.a aVarA4 = this.f10342g.a(childViewHolder.getItemViewType());
                    j16 = aVarA4.f10335d;
                    if (j16 != 0) {
                        nanoTime = (nanoTime / j15) + ((j16 / j15) * j14);
                    }
                    aVarA4.f10335d = nanoTime;
                    if (recyclerView.isAccessibilityEnabled()) {
                        view2 = childViewHolder.itemView;
                        WeakHashMap<View, g1> weakHashMap3 = s0.f6563a;
                        if (view2.getImportantForAccessibility() == 0) {
                            z17 = z15;
                            view2.setImportantForAccessibility(z17 ? 1 : 0);
                        } else {
                            z17 = z15;
                        }
                        f0Var = recyclerView.mAccessibilityDelegate;
                        if (f0Var != null) {
                            itemDelegate = f0Var.getItemDelegate();
                            if (itemDelegate instanceof androidx.recyclerview.widget.f0.a) {
                                aVar = (androidx.recyclerview.widget.f0.a) itemDelegate;
                                accessibilityDelegateE = s0.e(view2);
                                if (accessibilityDelegateE != null) {
                                    if (accessibilityDelegateE instanceof androidx.core.view.a.C0086a) {
                                        aVar3 = ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a;
                                    } else {
                                        aVar3 = new androidx.core.view.a(accessibilityDelegateE);
                                    }
                                }
                                if (aVar3 != null) {
                                    aVar.f10456b.put(view2, aVar3);
                                }
                            }
                            s0.r(view2, itemDelegate);
                        }
                    } else {
                        z17 = z15;
                    }
                    if (recyclerView.mState.f10291g) {
                        childViewHolder.mPreLayoutPosition = i14;
                    }
                    objArr = z17 ? 1 : 0;
                }
            } else if (childViewHolder.isBound()) {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iF6 = recyclerView.mAdapterHelper.f(i14, 0);
                childViewHolder.mBindingAdapter = null;
                childViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime7 = recyclerView.getNanoTime();
                if (j8 != Long.MAX_VALUE) {
                    j17 = this.f10342g.a(itemViewType).f10335d;
                    if (j17 != 0) {
                    }
                }
                if (childViewHolder.isTmpDetached()) {
                    recyclerView.attachViewToParent(childViewHolder.itemView, recyclerView.getChildCount(), childViewHolder.itemView.getLayoutParams());
                    z16 = z15;
                } else {
                    z16 = false;
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolder, iF6);
                if (z16) {
                    recyclerView.detachViewFromParent(childViewHolder.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime7;
                v.a aVarA5 = this.f10342g.a(childViewHolder.getItemViewType());
                j16 = aVarA5.f10335d;
                if (j16 != 0) {
                    nanoTime = (nanoTime / j15) + ((j16 / j15) * j14);
                }
                aVarA5.f10335d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view2 = childViewHolder.itemView;
                    WeakHashMap<View, g1> weakHashMap4 = s0.f6563a;
                    if (view2.getImportantForAccessibility() == 0) {
                        z17 = z15;
                        view2.setImportantForAccessibility(z17 ? 1 : 0);
                    } else {
                        z17 = z15;
                    }
                    f0Var = recyclerView.mAccessibilityDelegate;
                    if (f0Var != null) {
                        itemDelegate = f0Var.getItemDelegate();
                        if (itemDelegate instanceof androidx.recyclerview.widget.f0.a) {
                            aVar = (androidx.recyclerview.widget.f0.a) itemDelegate;
                            accessibilityDelegateE = s0.e(view2);
                            if (accessibilityDelegateE != null) {
                                if (accessibilityDelegateE instanceof androidx.core.view.a.C0086a) {
                                    aVar3 = ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a;
                                } else {
                                    aVar3 = new androidx.core.view.a(accessibilityDelegateE);
                                }
                            }
                            if (aVar3 != null) {
                                aVar.f10456b.put(view2, aVar3);
                            }
                        }
                        s0.r(view2, itemDelegate);
                    }
                } else {
                    z17 = z15;
                }
                if (recyclerView.mState.f10291g) {
                    childViewHolder.mPreLayoutPosition = i14;
                }
                objArr = z17 ? 1 : 0;
            } else {
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                int iF7 = recyclerView.mAdapterHelper.f(i14, 0);
                childViewHolder.mBindingAdapter = null;
                childViewHolder.mOwnerRecyclerView = recyclerView;
                itemViewType = childViewHolder.getItemViewType();
                long nanoTime8 = recyclerView.getNanoTime();
                if (j8 != Long.MAX_VALUE) {
                    j17 = this.f10342g.a(itemViewType).f10335d;
                    if (j17 != 0) {
                    }
                }
                if (childViewHolder.isTmpDetached()) {
                    recyclerView.attachViewToParent(childViewHolder.itemView, recyclerView.getChildCount(), childViewHolder.itemView.getLayoutParams());
                    z16 = z15;
                } else {
                    z16 = false;
                }
                recyclerView.mAdapter.bindViewHolder(childViewHolder, iF7);
                if (z16) {
                    recyclerView.detachViewFromParent(childViewHolder.itemView);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime8;
                v.a aVarA6 = this.f10342g.a(childViewHolder.getItemViewType());
                j16 = aVarA6.f10335d;
                if (j16 != 0) {
                    nanoTime = (nanoTime / j15) + ((j16 / j15) * j14);
                }
                aVarA6.f10335d = nanoTime;
                if (recyclerView.isAccessibilityEnabled()) {
                    view2 = childViewHolder.itemView;
                    WeakHashMap<View, g1> weakHashMap5 = s0.f6563a;
                    if (view2.getImportantForAccessibility() == 0) {
                        z17 = z15;
                        view2.setImportantForAccessibility(z17 ? 1 : 0);
                    } else {
                        z17 = z15;
                    }
                    f0Var = recyclerView.mAccessibilityDelegate;
                    if (f0Var != null) {
                        itemDelegate = f0Var.getItemDelegate();
                        if (itemDelegate instanceof androidx.recyclerview.widget.f0.a) {
                            aVar = (androidx.recyclerview.widget.f0.a) itemDelegate;
                            accessibilityDelegateE = s0.e(view2);
                            if (accessibilityDelegateE != null) {
                                if (accessibilityDelegateE instanceof androidx.core.view.a.C0086a) {
                                    aVar3 = ((androidx.core.view.a.C0086a) accessibilityDelegateE).f6402a;
                                } else {
                                    aVar3 = new androidx.core.view.a(accessibilityDelegateE);
                                }
                            }
                            if (aVar3 != null) {
                                aVar.f10456b.put(view2, aVar3);
                            }
                        }
                        s0.r(view2, itemDelegate);
                    }
                } else {
                    z17 = z15;
                }
                if (recyclerView.mState.f10291g) {
                    childViewHolder.mPreLayoutPosition = i14;
                }
                objArr = z17 ? 1 : 0;
            }
            layoutParams = childViewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) recyclerView.generateDefaultLayoutParams();
                childViewHolder.itemView.setLayoutParams(qVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                qVar = (q) recyclerView.generateLayoutParams(layoutParams);
                childViewHolder.itemView.setLayoutParams(qVar);
            } else {
                qVar = (q) layoutParams;
            }
            qVar.mViewHolder = childViewHolder;
            if (z14) {
                z17 = false;
            } else {
                z17 = false;
            }
            qVar.mPendingInvalidate = z17;
            return childViewHolder;
        }

        public final void o(f0 f0Var) {
            if (f0Var.mInChangeScrap) {
                this.f10337b.remove(f0Var);
            } else {
                this.f10336a.remove(f0Var);
            }
            f0Var.mScrapContainer = null;
            f0Var.mInChangeScrap = false;
            f0Var.clearReturnedFromScrapFlag();
        }

        public final void p() {
            p pVar = RecyclerView.this.mLayout;
            this.f10341f = this.f10340e + (pVar != null ? pVar.mPrefetchMaxCountObserved : 0);
            ArrayList<f0> arrayList = this.f10338c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f10341f; size--) {
                j(size);
            }
        }
    }

    public interface x {
        void a(f0 f0Var);
    }

    public class y extends j {
        public y() {
        }

        public final void a() {
            boolean z14 = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z14 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onChanged() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f10290f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i14, int i15, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f10401b;
            if (i15 < 1) {
                return;
            }
            arrayList.add(aVar.h(4, i14, i15, obj));
            aVar.f10406g |= 4;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i14, int i15) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f10401b;
            if (i15 < 1) {
                return;
            }
            arrayList.add(aVar.h(1, i14, i15, null));
            aVar.f10406g |= 1;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i14, int i15, int i16) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f10401b;
            if (i14 == i15) {
                return;
            }
            if (i16 != 1) {
                vb.h.s("Moving more than 1 item is not supported yet");
                return;
            }
            arrayList.add(aVar.h(8, i14, i15, null));
            aVar.f10406g |= 8;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i14, int i15) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f10401b;
            if (i15 < 1) {
                return;
            }
            arrayList.add(aVar.h(2, i14, i15, null));
            aVar.f10406g |= 2;
            if (arrayList.size() == 1) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new c0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new l0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.i();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new e0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new androidx.recyclerview.widget.r.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f10314a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.f0(this));
        int[] iArr = hd.a.f83306a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i14, 0);
        s0.q(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i14, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z14;
        if (z14) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i14, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i14, 0);
        s0.q(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i14, 0);
        boolean z15 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z15);
        setTag(com.garmin.android.apps.connectmobile.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private void addAnimatingView(f0 f0Var) {
        View view2 = f0Var.itemView;
        boolean z14 = view2.getParent() == this;
        this.mRecycler.o(getChildViewHolder(view2));
        if (f0Var.isTmpDetached()) {
            this.mChildHelper.b(view2, -1, view2.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.f fVar = this.mChildHelper;
        if (!z14) {
            fVar.a(view2, -1, true);
            return;
        }
        int iIndexOfChild = RecyclerView.this.indexOfChild(view2);
        if (iIndexOfChild < 0) {
            com.google.firebase.messaging.l.j(view2, "view is not a child, cannot hide ");
        } else {
            fVar.f10449b.h(iIndexOfChild);
            fVar.i(view2);
        }
    }

    private void animateChange(f0 f0Var, f0 f0Var2, m.c cVar, m.c cVar2, boolean z14, boolean z15) {
        f0Var.setIsRecyclable(false);
        if (z14) {
            addAnimatingView(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z15) {
                addAnimatingView(f0Var2);
            }
            f0Var.mShadowedHolder = f0Var2;
            addAnimatingView(f0Var);
            this.mRecycler.o(f0Var);
            f0Var2.setIsRecyclable(false);
            f0Var2.mShadowingHolder = f0Var;
        }
        if (this.mItemAnimator.b(f0Var, f0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(f0 f0Var) {
        WeakReference<RecyclerView> weakReference = f0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i14, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i15) {
        if (i14 > 0 && edgeEffect != null && p7.c.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(p7.c.b(edgeEffect, ((-i14) * FLING_DESTRETCH_FACTOR) / i15, 0.5f) * ((-i15) / FLING_DESTRETCH_FACTOR));
            if (iRound != i14) {
                edgeEffect.finish();
            }
            return i14 - iRound;
        }
        if (i14 >= 0 || edgeEffect2 == null || p7.c.a(edgeEffect2) == 0.0f) {
            return i14;
        }
        float f14 = i15;
        int iRound2 = Math.round(p7.c.b(edgeEffect2, (i14 * FLING_DESTRETCH_FACTOR) / f14, 0.5f) * (f14 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i14) {
            edgeEffect2.finish();
        }
        return i14 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i14, int i15) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i14), Integer.valueOf(i15)};
                } catch (NoSuchMethodException e4) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e14) {
                        e14.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e14);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e15) {
                androidx.core.view.j.q(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", fullClassName, e15);
            } catch (ClassNotFoundException e16) {
                androidx.core.view.j.q(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", fullClassName, e16);
            } catch (IllegalAccessException e17) {
                androidx.core.view.j.q(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", fullClassName, e17);
            } catch (InstantiationException e18) {
                androidx.core.view.j.q(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e18);
            } catch (InvocationTargetException e19) {
                androidx.core.view.j.q(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e19);
            }
        }
    }

    private boolean didChildRangeChange(int i14, int i15) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i14 && iArr[1] == i15) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i14 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i14 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i14);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        l0.a aVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f10293i = false;
        startInterceptRequestLayout();
        l0 l0Var = this.mViewInfoStore;
        l0Var.f10535a.clear();
        l0Var.f10536b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        b0Var.f10292h = b0Var.f10294j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f10291g = b0Var.f10295k;
        b0Var.f10289e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f10294j) {
            int iE = this.mChildHelper.e();
            for (int i14 = 0; i14 < iE; i14++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i14));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    m mVar = this.mItemAnimator;
                    m.e(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    mVar.getClass();
                    m.c cVar = new m.c();
                    View view2 = childViewHolderInt.itemView;
                    cVar.f10320a = view2.getLeft();
                    cVar.f10321b = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    k1<f0, l0.a> k1Var = this.mViewInfoStore.f10535a;
                    l0.a aVarA = k1Var.get(childViewHolderInt);
                    if (aVarA == null) {
                        aVarA = l0.a.a();
                        k1Var.put(childViewHolderInt, aVarA);
                    }
                    aVarA.f10539b = cVar;
                    aVarA.f10538a |= 4;
                    if (this.mState.f10292h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f10536b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f10295k) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z14 = b0Var2.f10290f;
            b0Var2.f10290f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, b0Var2);
            this.mState.f10290f = z14;
            for (int i15 = 0; i15 < this.mChildHelper.e(); i15++) {
                f0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i15));
                if (!childViewHolderInt2.shouldIgnore() && ((aVar = this.mViewInfoStore.f10535a.get(childViewHolderInt2)) == null || (aVar.f10538a & 4) == 0)) {
                    m.e(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    m mVar2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    mVar2.getClass();
                    m.c cVar2 = new m.c();
                    View view3 = childViewHolderInt2.itemView;
                    cVar2.f10320a = view3.getLeft();
                    cVar2.f10321b = view3.getTop();
                    view3.getRight();
                    view3.getBottom();
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                    } else {
                        k1<f0, l0.a> k1Var2 = this.mViewInfoStore.f10535a;
                        l0.a aVarA2 = k1Var2.get(childViewHolderInt2);
                        if (aVarA2 == null) {
                            aVarA2 = l0.a.a();
                            k1Var2.put(childViewHolderInt2, aVarA2);
                        }
                        aVarA2.f10538a |= 2;
                        aVarA2.f10539b = cVar2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f10288d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f10289e = this.mAdapter.getItemCount();
        this.mState.f10287c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f10346a;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.f10291g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f10290f = false;
        b0Var2.f10294j = b0Var2.f10294j && this.mItemAnimator != null;
        b0Var2.f10288d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.f10288d = 1;
        if (b0Var.f10294j) {
            for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(iE));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    m.c cVar = new m.c();
                    View view2 = childViewHolderInt.itemView;
                    cVar.f10320a = view2.getLeft();
                    cVar.f10321b = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    f0 f0VarB = this.mViewInfoStore.f10536b.b(changedHolderKey);
                    if (f0VarB == null || f0VarB.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, cVar);
                    } else {
                        l0.a aVar = this.mViewInfoStore.f10535a.get(f0VarB);
                        boolean z14 = (aVar == null || (aVar.f10538a & 1) == 0) ? false : true;
                        l0.a aVar2 = this.mViewInfoStore.f10535a.get(childViewHolderInt);
                        boolean z15 = (aVar2 == null || (aVar2.f10538a & 1) == 0) ? false : true;
                        if (z14 && f0VarB == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            m.c cVarB = this.mViewInfoStore.b(4, f0VarB);
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                            m.c cVarB2 = this.mViewInfoStore.b(8, childViewHolderInt);
                            if (cVarB == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, f0VarB);
                            } else {
                                animateChange(f0VarB, childViewHolderInt, cVarB, cVarB2, z14, z15);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            l0 l0Var = recyclerView.mViewInfoStore;
            l0.b bVar = recyclerView.mViewInfoProcessCallback;
            k1<f0, l0.a> k1Var = l0Var.f10535a;
            for (int i14 = k1Var.f134761c - 1; i14 >= 0; i14--) {
                f0 f0VarG = k1Var.g(i14);
                l0.a aVarI = k1Var.i(i14);
                int i15 = aVarI.f10538a;
                if ((i15 & 3) == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.removeAndRecycleView(f0VarG.itemView, recyclerView2.mRecycler);
                } else if ((i15 & 1) != 0) {
                    m.c cVar2 = aVarI.f10539b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mLayout.removeAndRecycleView(f0VarG.itemView, recyclerView3.mRecycler);
                    } else {
                        m.c cVar3 = aVarI.f10540c;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        recyclerView4.mRecycler.o(f0VarG);
                        recyclerView4.animateDisappearance(f0VarG, cVar2, cVar3);
                    }
                } else if ((i15 & 14) == 14) {
                    RecyclerView.this.animateAppearance(f0VarG, aVarI.f10539b, aVarI.f10540c);
                } else if ((i15 & 12) == 12) {
                    m.c cVar4 = aVarI.f10539b;
                    m.c cVar5 = aVarI.f10540c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    f0VarG.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    boolean z16 = recyclerView5.mDataSetHasChangedAfterLayout;
                    m mVar = recyclerView5.mItemAnimator;
                    if (z16) {
                        if (mVar.b(f0VarG, f0VarG, cVar4, cVar5)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else if (mVar.d(f0VarG, cVar4, cVar5)) {
                        recyclerView5.postAnimationRunner();
                    }
                } else if ((i15 & 4) != 0) {
                    m.c cVar6 = aVarI.f10539b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.mRecycler.o(f0VarG);
                    recyclerView6.animateDisappearance(f0VarG, cVar6, null);
                } else if ((i15 & 8) != 0) {
                    RecyclerView.this.animateAppearance(f0VarG, aVarI.f10539b, aVarI.f10540c);
                }
                aVarI.f10538a = 0;
                aVarI.f10539b = null;
                aVarI.f10540c = null;
                l0.a.f10537d.a(aVarI);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        b0 b0Var2 = recyclerView.mState;
        b0Var2.f10286b = b0Var2.f10289e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        b0Var2.f10294j = false;
        b0Var2.f10295k = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<f0> arrayList = recyclerView.mRecycler.f10337b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.mLayout;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.p();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        l0 l0Var2 = recyclerView.mViewInfoStore;
        l0Var2.f10535a.clear();
        l0Var2.f10536b.a();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i14 = 0; i14 < size; i14++) {
            t tVar = this.mOnItemTouchListeners.get(i14);
            if (tVar.c(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 = 0; i16 < iE; i16++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i16));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i14) {
                    i14 = layoutPosition;
                }
                if (layoutPosition > i15) {
                    i15 = layoutPosition;
                }
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
    }

    public static RecyclerView findNestedRecyclerView(View view2) {
        if (!(view2 instanceof ViewGroup)) {
            return null;
        }
        if (view2 instanceof RecyclerView) {
            return (RecyclerView) view2;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i14));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        f0 f0VarFindViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i14 = b0Var.f10296l;
        if (i14 == -1) {
            i14 = 0;
        }
        int iB = b0Var.b();
        for (int i15 = i14; i15 < iB; i15++) {
            f0 f0VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i15);
            if (f0VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (f0VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return f0VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i14);
        do {
            iMin--;
            if (iMin < 0 || (f0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!f0VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return f0VarFindViewHolderForAdapterPosition.itemView;
    }

    public static f0 getChildViewHolderInt(View view2) {
        if (view2 == null) {
            return null;
        }
        return ((q) view2.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view2, Rect rect) {
        q qVar = (q) view2.getLayoutParams();
        Rect rect2 = qVar.mDecorInsets;
        rect.set((view2.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view2.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view2.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view2.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view2) {
        int id3 = view2.getId();
        while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
            view2 = ((ViewGroup) view2).getFocusedChild();
            if (view2.getId() != -1) {
                id3 = view2.getId();
            }
        }
        return id3;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private androidx.core.view.v getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.v(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i14) {
        double dLog = Math.log((Math.abs(i14) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f14 = DECELERATION_RATE;
        return (float) (Math.exp((((double) f14) / (((double) f14) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    private void handleMissingPreInfoForChangeError(long j8, f0 f0Var, f0 f0Var2) {
        int iE = this.mChildHelper.e();
        for (int i14 = 0; i14 < iE; i14++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i14));
            if (childViewHolderInt != f0Var && getChangedHolderKey(childViewHolderInt) == j8) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb3.append(childViewHolderInt);
                    sb3.append(" \n View Holder 2:");
                    sb3.append(f0Var);
                    vb.h.z(androidx.core.view.j.g(this, sb3));
                    return;
                }
                StringBuilder sb4 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb4.append(childViewHolderInt);
                sb4.append(" \n View Holder 2:");
                sb4.append(f0Var);
                vb.h.z(androidx.core.view.j.g(this, sb4));
                return;
            }
        }
        Objects.toString(f0Var2);
        Objects.toString(f0Var);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i14 = 0; i14 < iE; i14++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (s0.g.a(this) == 0) {
            s0.g.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.f(new e());
    }

    private boolean isPreferredNextFocus(View view2, View view3, int i14) {
        int i15;
        if (view3 == null || view3 == this || view3 == view2 || findContainingItemView(view3) == null) {
            return false;
        }
        if (view2 == null || findContainingItemView(view2) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view2.getWidth(), view2.getHeight());
        this.mTempRect2.set(0, 0, view3.getWidth(), view3.getHeight());
        offsetDescendantRectToMyCoords(view2, this.mTempRect);
        offsetDescendantRectToMyCoords(view3, this.mTempRect2);
        byte b14 = -1;
        int i16 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i17 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i18 = rect2.left;
        if ((i17 < i18 || rect.right <= i18) && rect.right < rect2.right) {
            i15 = 1;
        } else {
            int i19 = rect.right;
            int i24 = rect2.right;
            i15 = ((i19 > i24 || i17 >= i24) && i17 > i18) ? -1 : 0;
        }
        int i25 = rect.top;
        int i26 = rect2.top;
        if ((i25 < i26 || rect.bottom <= i26) && rect.bottom < rect2.bottom) {
            b14 = 1;
        } else {
            int i27 = rect.bottom;
            int i28 = rect2.bottom;
            if ((i27 <= i28 && i25 < i28) || i25 <= i26) {
                b14 = 0;
            }
        }
        if (i14 == 1) {
            return b14 < 0 || (b14 == 0 && i15 * i16 < 0);
        }
        if (i14 == 2) {
            return b14 > 0 || (b14 == 0 && i15 * i16 > 0);
        }
        if (i14 == 17) {
            return i15 < 0;
        }
        if (i14 == 33) {
            return b14 < 0;
        }
        if (i14 == 66) {
            return i15 > 0;
        }
        if (i14 == 130) {
            return b14 > 0;
        }
        StringBuilder sb3 = new StringBuilder("Invalid direction: ");
        sb3.append(i14);
        vb.h.s(androidx.core.view.j.g(this, sb3));
        return false;
    }

    private void nestedScrollByInternal(int i14, int i15, MotionEvent motionEvent, int i16) {
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i17 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i14 - releaseHorizontalGlow(i14, height);
        int iReleaseVerticalGlow = i15 - releaseVerticalGlow(i15, width);
        startNestedScroll(i17, i16);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i16)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i16);
        androidx.recyclerview.widget.r rVar = this.mGapWorker;
        if (rVar != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            rVar.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i16);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i14 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i14);
            int x14 = (int) (motionEvent.getX(i14) + 0.5f);
            this.mLastTouchX = x14;
            this.mInitialTouchX = x14;
            int y14 = (int) (motionEvent.getY(i14) + 0.5f);
            this.mLastTouchY = y14;
            this.mInitialTouchY = y14;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z14;
        boolean z15 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.l(aVar.f10401b);
            aVar.l(aVar.f10402c);
            aVar.f10406g = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        boolean zPredictiveItemAnimationsEnabled = predictiveItemAnimationsEnabled();
        androidx.recyclerview.widget.a aVar2 = this.mAdapterHelper;
        if (zPredictiveItemAnimationsEnabled) {
            aVar2.j();
        } else {
            aVar2.c();
        }
        boolean z16 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f10294j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z14 = this.mDataSetHasChangedAfterLayout) || z16 || this.mLayout.mRequestedSimpleAnimations) && (!z14 || this.mAdapter.hasStableIds());
        b0 b0Var = this.mState;
        if (b0Var.f10294j && z16 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z15 = true;
        }
        b0Var.f10295k = z15;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f14, float f15, float f16, float f17) {
        boolean z14;
        boolean z15 = true;
        if (f15 >= 0.0f) {
            if (f15 > 0.0f) {
                ensureRightGlow();
                p7.c.b(this.mRightGlow, f15 / getWidth(), f16 / getHeight());
            } else {
                z14 = false;
            }
            if (f17 < 0.0f) {
                ensureTopGlow();
                p7.c.b(this.mTopGlow, (-f17) / getHeight(), f14 / getWidth());
            } else if (f17 > 0.0f) {
                ensureBottomGlow();
                p7.c.b(this.mBottomGlow, f17 / getHeight(), 1.0f - (f14 / getWidth()));
            } else {
                z15 = z14;
            }
            if (z15 && f15 == 0.0f && f17 == 0.0f) {
                return;
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        p7.c.b(this.mLeftGlow, (-f15) / getWidth(), 1.0f - (f16 / getHeight()));
        z14 = true;
        if (f17 < 0.0f) {
            ensureTopGlow();
            p7.c.b(this.mTopGlow, (-f17) / getHeight(), f14 / getWidth());
        } else if (f17 > 0.0f) {
            ensureBottomGlow();
            p7.c.b(this.mBottomGlow, f17 / getHeight(), 1.0f - (f14 / getWidth()));
        } else {
            z15 = z14;
        }
        if (z15) {
        }
        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f10450c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        f0 f0VarFindViewHolderForItemId = (this.mState.f10297m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f10297m);
        if (f0VarFindViewHolderForItemId != null) {
            if (!this.mChildHelper.f10450c.contains(f0VarFindViewHolderForItemId.itemView) && f0VarFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = f0VarFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.e() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        } else if (this.mChildHelper.e() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i14 = this.mState.f10298n;
            if (i14 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i14)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i14, float f14) {
        float height = f14 / getHeight();
        float width = i14 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f15 = 0.0f;
        if (edgeEffect == null || p7.c.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && p7.c.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = p7.c.b(edgeEffect3, width, height);
                    if (p7.c.a(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f15 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f16 = -p7.c.b(edgeEffect4, -width, 1.0f - height);
                if (p7.c.a(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f15 = f16;
            }
            invalidate();
        }
        return Math.round(f15 * getWidth());
    }

    private int releaseVerticalGlow(int i14, float f14) {
        float width = f14 / getWidth();
        float height = i14 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f15 = 0.0f;
        if (edgeEffect == null || p7.c.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && p7.c.a(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fB = p7.c.b(edgeEffect3, height, 1.0f - width);
                    if (p7.c.a(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f15 = fB;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f16 = -p7.c.b(edgeEffect4, -height, width);
                if (p7.c.a(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f15 = f16;
            }
            invalidate();
        }
        return Math.round(f15 * getHeight());
    }

    private void requestChildOnScreen(View view2, View view3) {
        View view4 = view3 != null ? view3 : view2;
        this.mTempRect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.mInsetsDirty) {
                Rect rect = qVar.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view3 != null) {
            offsetDescendantRectToMyCoords(view3, this.mTempRect);
            offsetRectIntoDescendantCoords(view2, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view2, this.mTempRect, !this.mFirstLayoutComplete, view3 == null);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f10297m = -1L;
        b0Var.f10296l = -1;
        b0Var.f10298n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        f0 f0VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (f0VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f10297m = this.mAdapter.hasStableIds() ? f0VarFindContainingViewHolder.getItemId() : -1L;
        b0 b0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = f0VarFindContainingViewHolder.isRemoved() ? f0VarFindContainingViewHolder.mOldPosition : f0VarFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        b0Var.f10296l = absoluteAdapterPosition;
        this.mState.f10298n = getDeepestFocusedViewWithId(f0VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z14, boolean z15) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z14 || z15) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.l(aVar.f10401b);
        aVar.l(aVar.f10402c);
        aVar.f10406g = 0;
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.mAdapter);
        }
        w wVar = this.mRecycler;
        h hVar4 = this.mAdapter;
        wVar.b();
        wVar.h(hVar3, true);
        v vVarD = wVar.d();
        if (hVar3 != null) {
            vVarD.f10330b--;
        }
        if (!z14 && vVarD.f10330b == 0) {
            SparseArray<v.a> sparseArray = vVarD.f10329a;
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                v.a aVarValueAt = sparseArray.valueAt(i14);
                Iterator<f0> it = aVarValueAt.f10332a.iterator();
                while (it.hasNext()) {
                    oe2.f.h(it.next().itemView);
                }
                aVarValueAt.f10332a.clear();
            }
        }
        if (hVar4 != null) {
            vVarD.f10330b++;
        } else {
            vVarD.getClass();
        }
        wVar.g();
        this.mState.f10290f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z14) {
        sDebugAssertionsEnabled = z14;
    }

    public static void setVerboseLoggingEnabled(boolean z14) {
        sVerboseLoggingEnabled = z14;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i14, int i15) {
        if (i14 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i14) < p7.c.a(edgeEffect) * ((float) i15);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z14;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || p7.c.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z14 = false;
        } else {
            p7.c.b(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z14 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && p7.c.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            p7.c.b(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z14 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && p7.c.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            p7.c.b(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z14 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || p7.c.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z14;
        }
        p7.c.b(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        e0 e0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(e0Var);
        e0Var.f10303c.abortAnimation();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i14, int i15) {
        if (i14 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i14);
            }
        } else if (i14 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i14);
            }
        }
        if (i15 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i15);
            }
        } else if (i15 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i15);
            }
        }
        if (i14 == 0 && i15 == 0) {
            return;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i14, int i15) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i14, i15)) {
            super.addFocusables(arrayList, i14, i15);
        }
    }

    public void addItemDecoration(o oVar, int i14) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<o> arrayList = this.mItemDecorations;
        if (i14 < 0) {
            arrayList.add(oVar);
        } else {
            arrayList.add(i14, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        k7.h.b(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    public void animateAppearance(f0 f0Var, m.c cVar, m.c cVar2) {
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(f0 f0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(f0Var);
        f0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(f0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            vb.h.z(androidx.core.view.j.g(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        } else {
            vb.h.z(androidx.core.view.j.g(this, e5.k(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                new IllegalStateException(androidx.core.view.j.g(this, new StringBuilder("")));
            }
        } else if (str == null) {
            vb.h.z(androidx.core.view.j.g(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else {
            vb.h.z(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(f0 f0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.g(f0Var, f0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.checkLayoutParams((q) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i14 = 0; i14 < iH; i14++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.f10336a;
        ArrayList<f0> arrayList2 = wVar.f10338c;
        int size = arrayList2.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList2.get(i15).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            arrayList.get(i16).clearOldPosition();
        }
        ArrayList<f0> arrayList3 = wVar.f10337b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i17 = 0; i17 < size3; i17++) {
                wVar.f10337b.get(i17).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i14, int i15) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i14 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i14 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i15 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i15 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i14) {
        return consumeFlingInStretch(i14, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i14) {
        return consumeFlingInStretch(i14, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i14 = h7.j.f82330a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i15 = aVar.f10406g;
            if ((i15 & 4) == 0 || (i15 & 11) != 0) {
                if (aVar.g()) {
                    int i16 = h7.j.f82330a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i17 = h7.j.f82330a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i14, int i15) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setMeasuredDimension(p.chooseSize(i14, paddingRight, getMinimumWidth()), p.chooseSize(i15, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view2) {
        f0 childViewHolderInt = getChildViewHolderInt(view2);
        onChildAttachedToWindow(view2);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view2);
            }
        }
    }

    public void dispatchChildDetached(View view2) {
        f0 childViewHolderInt = getChildViewHolderInt(view2);
        onChildDetachedFromWindow(view2);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view2);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f10293i = false;
        boolean z14 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f10288d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            if ((aVar.f10402c.isEmpty() || aVar.f10401b.isEmpty()) && !z14 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f14, float f15, boolean z14) {
        return getScrollingChildHelper().a(f14, f15, z14);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f14, float f15) {
        return getScrollingChildHelper().b(f14, f15);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i14, int i15, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i14, i15, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i14, int i15, int i16, int i17, int[] iArr) {
        return getScrollingChildHelper().d(i14, i15, i16, i17, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i14) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onScrollStateChanged(i14);
        }
        onScrollStateChanged(i14);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i14);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i14);
            }
        }
    }

    public void dispatchOnScrolled(int i14, int i15) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i14, scrollY - i15);
        onScrolled(i14, i15);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i14, i15);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i14, i15);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i14;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<f0> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            f0 f0Var = list.get(size);
            if (f0Var.itemView.getParent() == this && !f0Var.shouldIgnore() && (i14 = f0Var.mPendingAccessibilityState) != -1) {
                View view2 = f0Var.itemView;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.setImportantForAccessibility(i14);
                f0Var.mPendingAccessibilityState = -1;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z14;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z15 = false;
        for (int i14 = 0; i14 < size; i14++) {
            this.mItemDecorations.get(i14).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z14 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z14 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z14 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z14 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z15 = true;
            }
            z14 |= z15;
            canvas.restoreToCount(iSave4);
        }
        if ((z14 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.k()) ? z14 : true) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view2, long j8) {
        return super.drawChild(canvas, view2, j8);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return StringUtils.SPACE + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f10303c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        b0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f14, float f15) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f14 >= viewD.getLeft() + translationX && f14 <= viewD.getRight() + translationX && f15 >= viewD.getTop() + translationY && f15 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(View view2) {
        ViewParent parent = view2.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view2 = parent;
            parent = view2.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    public f0 findContainingViewHolder(View view2) {
        View viewFindContainingItemView = findContainingItemView(view2);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public f0 findViewHolderForAdapterPosition(int i14) {
        f0 f0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i15 = 0; i15 < iH; i15++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i15));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i14) {
                androidx.recyclerview.widget.f fVar = this.mChildHelper;
                if (!fVar.f10450c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f0Var = childViewHolderInt;
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForItemId(long j8) {
        h hVar = this.mAdapter;
        f0 f0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i14 = 0; i14 < iH; i14++) {
                f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j8) {
                    androidx.recyclerview.widget.f fVar = this.mChildHelper;
                    if (!fVar.f10450c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    public f0 findViewHolderForLayoutPosition(int i14) {
        return findViewHolderForPosition(i14, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public f0 findViewHolderForPosition(int i14, boolean z14) {
        androidx.recyclerview.widget.f fVar;
        int iH = this.mChildHelper.h();
        f0 f0Var = null;
        for (int i15 = 0; i15 < iH; i15++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i15));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z14) {
                    if (childViewHolderInt.mPosition != i14) {
                        continue;
                    } else {
                        fVar = this.mChildHelper;
                        if (fVar.f10450c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        f0Var = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i14) {
                    continue;
                } else {
                    fVar = this.mChildHelper;
                    if (fVar.f10450c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f0Var = childViewHolderInt;
                }
            }
        }
        return f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i14, int i15) {
        int iMax;
        int i16;
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i14) < this.mMinFlingVelocity) {
            i14 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i15) < this.mMinFlingVelocity) {
            i15 = 0;
        }
        if (i14 == 0 && i15 == 0) {
            return false;
        }
        if (i14 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || p7.c.a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || p7.c.a(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i14, getWidth())) {
                    this.mRightGlow.onAbsorb(i14);
                    i14 = 0;
                }
            } else {
                int i17 = -i14;
                if (shouldAbsorb(this.mLeftGlow, i17, getWidth())) {
                    this.mLeftGlow.onAbsorb(i17);
                    i14 = 0;
                }
            }
            iMax = i14;
            i14 = 0;
        }
        if (i15 == 0) {
            i16 = i15;
            i15 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || p7.c.a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || p7.c.a(edgeEffect4) == 0.0f) {
                    i16 = i15;
                    i15 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i15, getHeight())) {
                    this.mBottomGlow.onAbsorb(i15);
                    i15 = 0;
                }
            } else {
                int i18 = -i15;
                if (shouldAbsorb(this.mTopGlow, i18, getHeight())) {
                    this.mTopGlow.onAbsorb(i18);
                    i15 = 0;
                }
            }
            i16 = 0;
        }
        if (iMax != 0 || i15 != 0) {
            int i19 = this.mMaxFlingVelocity;
            iMax = Math.max(-i19, Math.min(iMax, i19));
            int i24 = this.mMaxFlingVelocity;
            i15 = Math.max(-i24, Math.min(i15, i24));
            this.mViewFlinger.a(iMax, i15);
        }
        if (i14 == 0 && i16 == 0) {
            return (iMax == 0 && i15 == 0) ? false : true;
        }
        float f14 = i14;
        float f15 = i16;
        if (!dispatchNestedPreFling(f14, f15)) {
            boolean z14 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f14, f15, z14);
            s sVar = this.mOnFlingListener;
            if (sVar != null && sVar.onFling(i14, i16)) {
                return true;
            }
            if (z14) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i25 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i25, Math.min(i14, i25));
                int i26 = this.mMaxFlingVelocity;
                this.mViewFlinger.a(iMax2, Math.max(-i26, Math.min(i16, i26)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view2, int i14) {
        View viewOnFocusSearchFailed;
        boolean z14;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view2, i14);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z15 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z15 && (i14 == 2 || i14 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i15 = i14 == 2 ? 130 : 33;
                z14 = focusFinder.findNextFocus(this, view2, i15) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i14 = i15;
                }
            } else {
                z14 = false;
            }
            if (!z14 && this.mLayout.canScrollHorizontally()) {
                int i16 = (this.mLayout.getLayoutDirection() == 1) ^ (i14 == 2) ? 66 : 17;
                boolean z16 = focusFinder.findNextFocus(this, view2, i16) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i14 = i16;
                }
                z14 = z16;
            }
            if (z14) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view2) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view2, i14, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view2, i14);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view2, i14);
            if (viewFindNextFocus == null && z15) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view2) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view2, i14, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view2, viewOnFocusSearchFailed, i14) ? viewOnFocusSearchFailed : super.focusSearch(view2, i14);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view2, i14);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        vb.h.z(androidx.core.view.j.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        vb.h.z(androidx.core.view.j.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(f0 f0Var) {
        if (f0Var.hasAnyOfTheFlags(524) || !f0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        int i14 = f0Var.mPosition;
        ArrayList<androidx.recyclerview.widget.a.b> arrayList = aVar.f10401b;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.recyclerview.widget.a.b bVar = arrayList.get(i15);
            int i16 = bVar.f10407a;
            if (i16 != 1) {
                if (i16 == 2) {
                    int i17 = bVar.f10408b;
                    if (i17 <= i14) {
                        int i18 = bVar.f10410d;
                        if (i17 + i18 > i14) {
                            return -1;
                        }
                        i14 -= i18;
                    } else {
                        continue;
                    }
                } else if (i16 == 8) {
                    int i19 = bVar.f10408b;
                    if (i19 == i14) {
                        i14 = bVar.f10410d;
                    } else {
                        if (i19 < i14) {
                            i14--;
                        }
                        if (bVar.f10410d <= i14) {
                            i14++;
                        }
                    }
                }
            } else if (bVar.f10408b <= i14) {
                i14 += bVar.f10410d;
            }
        }
        return i14;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        return pVar != null ? pVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(f0 f0Var) {
        return this.mAdapter.hasStableIds() ? f0Var.getItemId() : f0Var.mPosition;
    }

    public int getChildAdapterPosition(View view2) {
        f0 childViewHolderInt = getChildViewHolderInt(view2);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i14, int i15) {
        return super.getChildDrawingOrder(i14, i15);
    }

    public long getChildItemId(View view2) {
        f0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view2)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view2) {
        f0 childViewHolderInt = getChildViewHolderInt(view2);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view2) {
        return getChildAdapterPosition(view2);
    }

    public f0 getChildViewHolder(View view2) {
        ViewParent parent = view2.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view2);
        }
        c22.t.i("View ", view2, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.f0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view2, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view2, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view2) {
        q qVar = (q) view2.getLayoutParams();
        if (!qVar.mInsetsDirty) {
            return qVar.mDecorInsets;
        }
        if (this.mState.f10291g && (qVar.isItemChanged() || qVar.isViewInvalid())) {
            return qVar.mDecorInsets;
        }
        Rect rect = qVar.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i14).getItemOffsets(this.mTempRect, view2, this, this.mState);
            int i15 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i15 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.mInsetsDirty = false;
        return rect;
    }

    public o getItemDecorationAt(int i14) {
        int itemDecorationCount = getItemDecorationCount();
        if (i14 >= 0 && i14 < itemDecorationCount) {
            return this.mItemDecorations.get(i14);
        }
        org.apache.commons.lang3.e.v(androidx.core.view.j.d(i14, itemDecorationCount, " is an invalid index for size "));
        return null;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            vb.h.s(androidx.core.view.j.g(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        } else {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.q(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.garmin.android.apps.connectmobile.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.garmin.android.apps.connectmobile.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.garmin.android.apps.connectmobile.R.dimen.fastscroll_margin));
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.k();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f6582d;
    }

    public void jumpToPositionForSmoothScroller(int i14) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i14);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i14 = 0; i14 < iH; i14++) {
            ((q) this.mChildHelper.g(i14).getLayoutParams()).mInsetsDirty = true;
        }
        ArrayList<f0> arrayList = this.mRecycler.f10338c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            q qVar = (q) arrayList.get(i15).itemView.getLayoutParams();
            if (qVar != null) {
                qVar.mInsetsDirty = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i14 = 0; i14 < iH; i14++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.f10338c;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            f0 f0Var = arrayList.get(i15);
            if (f0Var != null) {
                f0Var.addFlags(6);
                f0Var.addChangePayload(null);
            }
        }
        h hVar = RecyclerView.this.mAdapter;
        if (hVar == null || !hVar.hasStableIds()) {
            wVar.i();
        }
    }

    public void nestedScrollBy(int i14, int i15) {
        nestedScrollByInternal(i14, i15, null, 1);
    }

    public void offsetChildrenHorizontal(int i14) {
        int iE = this.mChildHelper.e();
        for (int i15 = 0; i15 < iE; i15++) {
            this.mChildHelper.d(i15).offsetLeftAndRight(i14);
        }
    }

    public void offsetChildrenVertical(int i14) {
        int iE = this.mChildHelper.e();
        for (int i15 = 0; i15 < iE; i15++) {
            this.mChildHelper.d(i15).offsetTopAndBottom(i14);
        }
    }

    public void offsetPositionRecordsForInsert(int i14, int i15) {
        int iH = this.mChildHelper.h();
        for (int i16 = 0; i16 < iH; i16++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i16));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i14) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i15, false);
                this.mState.f10290f = true;
            }
        }
        ArrayList<f0> arrayList = this.mRecycler.f10338c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            f0 f0Var = arrayList.get(i17);
            if (f0Var != null && f0Var.mPosition >= i14) {
                if (sVerboseLoggingEnabled) {
                    f0Var.toString();
                }
                f0Var.offsetPosition(i15, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int iH = this.mChildHelper.h();
        int i27 = -1;
        if (i14 < i15) {
            i17 = i14;
            i16 = i15;
            i18 = -1;
        } else {
            i16 = i14;
            i17 = i15;
            i18 = 1;
        }
        for (int i28 = 0; i28 < iH; i28++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i28));
            if (childViewHolderInt != null && (i26 = childViewHolderInt.mPosition) >= i17 && i26 <= i16) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i14) {
                    childViewHolderInt.offsetPosition(i15 - i14, false);
                } else {
                    childViewHolderInt.offsetPosition(i18, false);
                }
                this.mState.f10290f = true;
            }
        }
        ArrayList<f0> arrayList = this.mRecycler.f10338c;
        if (i14 < i15) {
            i24 = i14;
            i19 = i15;
        } else {
            i19 = i14;
            i27 = 1;
            i24 = i15;
        }
        int size = arrayList.size();
        for (int i29 = 0; i29 < size; i29++) {
            f0 f0Var = arrayList.get(i29);
            if (f0Var != null && (i25 = f0Var.mPosition) >= i24 && i25 <= i19) {
                if (i25 == i14) {
                    f0Var.offsetPosition(i15 - i14, false);
                } else {
                    f0Var.offsetPosition(i27, false);
                }
                if (sVerboseLoggingEnabled) {
                    f0Var.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i14, int i15, boolean z14) {
        int i16 = i14 + i15;
        int iH = this.mChildHelper.h();
        for (int i17 = 0; i17 < iH; i17++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i17));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i18 = childViewHolderInt.mPosition;
                if (i18 >= i16) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i15, z14);
                    this.mState.f10290f = true;
                } else if (i18 >= i14) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i14 - 1, -i15, z14);
                    this.mState.f10290f = true;
                }
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.f10338c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = arrayList.get(size);
            if (f0Var != null) {
                int i19 = f0Var.mPosition;
                if (i19 >= i16) {
                    if (sVerboseLoggingEnabled) {
                        f0Var.toString();
                    }
                    f0Var.offsetPosition(-i15, z14);
                } else if (i19 >= i14) {
                    f0Var.addFlags(8);
                    wVar.j(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.g();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.r> threadLocal = androidx.recyclerview.widget.r.f10618e;
            androidx.recyclerview.widget.r rVar = threadLocal.get();
            this.mGapWorker = rVar;
            if (rVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.r();
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.r rVar2 = this.mGapWorker;
                rVar2.f10622c = (long) (1.0E9f / refreshRate);
                threadLocal.set(rVar2);
            }
            ArrayList<RecyclerView> arrayList = this.mGapWorker.f10620a;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                vb.h.z("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    public void onChildAttachedToWindow(View view2) {
    }

    public void onChildDetachedFromWindow(View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.r rVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.j();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (l0.a.f10537d.acquire() != null) {
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.f10338c;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            oe2.f.h(arrayList.get(i14).itemView);
        }
        wVar.h(RecyclerView.this.mAdapter, false);
        Iterator<View> it = new x0(this).iterator();
        while (true) {
            z0 z0Var = (z0) it;
            if (!z0Var.hasNext()) {
                break;
            }
            ArrayList<r7.a> arrayList2 = oe2.f.v((View) z0Var.next()).f151034a;
            for (int iJ = p13.x.j(arrayList2); -1 < iJ; iJ--) {
                arrayList2.get(iJ).a();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (rVar = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = rVar.f10620a.remove(this);
        if (!sDebugAssertionsEnabled || zRemove) {
            this.mGapWorker = null;
        } else {
            vb.h.z("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.mItemDecorations.get(i14).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z14) {
        int i14 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i14;
        if (i14 < 1) {
            if (sDebugAssertionsEnabled && i14 < 0) {
                vb.h.z(androidx.core.view.j.g(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z14) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f14;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f14 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f14 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f14 = 0.0f;
                } else {
                    f14 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f14 = 0.0f;
                axisValue = 0.0f;
            }
            if (f14 != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f14 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z14;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x14 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x14;
            this.mInitialTouchX = x14;
            int y14 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y14;
            this.mInitialTouchY = y14;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i14 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i14 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i14, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x15 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y15 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i15 = x15 - this.mInitialTouchX;
                int i16 = y15 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i15) <= this.mTouchSlop) {
                    z14 = false;
                } else {
                    this.mLastTouchX = x15;
                    z14 = true;
                }
                if (zCanScrollVertically && Math.abs(i16) > this.mTouchSlop) {
                    this.mLastTouchY = y15;
                    z14 = true;
                }
                if (z14) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x16 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x16;
            this.mInitialTouchX = x16;
            int y16 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y16;
            this.mInitialTouchY = y16;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        int i18 = h7.j.f82330a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i14, int i15) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i14, i15);
            return;
        }
        boolean z14 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i14);
            int mode2 = View.MeasureSpec.getMode(i15);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i14, i15);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z14 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z14;
            if (z14 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f10288d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i14, i15);
            this.mState.f10293i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i14, i15);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f10293i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i14, i15);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i14, i15);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            b0 b0Var = this.mState;
            if (b0Var.f10295k) {
                b0Var.f10291g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f10291g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f10295k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        b0 b0Var2 = this.mState;
        if (hVar != null) {
            b0Var2.f10289e = hVar.getItemCount();
        } else {
            b0Var2.f10289e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i14, i15);
        stopInterceptRequestLayout(false);
        this.mState.f10291g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i14, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i14, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.f10346a = zVar2.f10346a;
            return zVar;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            zVar.f10346a = pVar.onSaveInstanceState();
            return zVar;
        }
        zVar.f10346a = null;
        return zVar;
    }

    public void onScrollStateChanged(int i14) {
    }

    public void onScrolled(int i14, int i15) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        if (i14 == i16 && i15 == i17) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[PHI: r1
      0x00c0: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:40:0x00ab, B:45:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i14;
        boolean z14;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f14 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f15 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f14 == 0.0f && f15 == 0.0f) || !fling((int) f14, (int) f15)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x14 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y14 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x14;
                int iMax2 = this.mLastTouchY - y14;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        int i15 = this.mTouchSlop;
                        iMax = iMax > 0 ? Math.max(0, iMax - i15) : Math.min(0, iMax + i15);
                        if (iMax != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    if (zCanScrollVertically) {
                        int i16 = this.mTouchSlop;
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i16) : Math.min(0, iMax2 + i16);
                        if (iMax2 != 0) {
                            z14 = true;
                        }
                    }
                    if (z14) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i17 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i17 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x14 - iArr7[0];
                    this.mLastTouchY = y14 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.r rVar = this.mGapWorker;
                    if (rVar != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        rVar.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x15 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x15;
                this.mInitialTouchX = x15;
                int y15 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y15;
                this.mInitialTouchY = y15;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x16 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x16;
        this.mInitialTouchX = x16;
        int y16 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y16;
        this.mInitialTouchY = y16;
        if (zCanScrollVertically) {
            i14 = zCanScrollHorizontally;
            i14 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i14 = zCanScrollHorizontally;
        startNestedScroll(i14, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z14) {
        this.mDispatchItemsChangedEvent = z14 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(f0 f0Var, m.c cVar) {
        f0Var.setFlags(0, 8192);
        if (this.mState.f10292h && f0Var.isUpdated() && !f0Var.isRemoved() && !f0Var.shouldIgnore()) {
            this.mViewInfoStore.f10536b.f(getChangedHolderKey(f0Var), f0Var);
        }
        k1<f0, l0.a> k1Var = this.mViewInfoStore.f10535a;
        l0.a aVarA = k1Var.get(f0Var);
        if (aVarA == null) {
            aVarA = l0.a.a();
            k1Var.put(f0Var, aVarA);
        }
        aVarA.f10539b = cVar;
        aVarA.f10538a |= 4;
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.j();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.b();
    }

    public boolean removeAnimatingView(View view2) {
        startInterceptRequestLayout();
        androidx.recyclerview.widget.f fVar = this.mChildHelper;
        androidx.recyclerview.widget.f.a aVar = fVar.f10449b;
        androidx.recyclerview.widget.f.b bVar = fVar.f10448a;
        int i14 = fVar.f10451d;
        boolean z14 = false;
        if (i14 == 1) {
            if (fVar.f10452e != view2) {
                vb.h.z("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return false;
            }
        } else {
            if (i14 == 2) {
                vb.h.z("Cannot call removeViewIfHidden within removeViewIfHidden");
                return false;
            }
            try {
                fVar.f10451d = 2;
                int iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                if (iIndexOfChild == -1) {
                    fVar.l(view2);
                } else if (aVar.d(iIndexOfChild)) {
                    aVar.f(iIndexOfChild);
                    fVar.l(view2);
                    ((e) bVar).a(iIndexOfChild);
                } else {
                    fVar.f10451d = 0;
                }
                fVar.f10451d = 0;
                z14 = true;
            } catch (Throwable th3) {
                fVar.f10451d = 0;
                throw th3;
            }
        }
        if (z14) {
            f0 childViewHolderInt = getChildViewHolderInt(view2);
            this.mRecycler.o(childViewHolderInt);
            this.mRecycler.l(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view2);
                toString();
            }
        }
        stopInterceptRequestLayout(!z14);
        return z14;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view2, boolean z14) {
        f0 childViewHolderInt = getChildViewHolderInt(view2);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb3 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb3.append(childViewHolderInt);
                vb.h.s(androidx.core.view.j.g(this, sb3));
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb4 = new StringBuilder("No ViewHolder found for child: ");
            sb4.append(view2);
            vb.h.s(androidx.core.view.j.g(this, sb4));
            return;
        }
        view2.clearAnimation();
        dispatchChildDetached(view2);
        super.removeDetachedView(view2, z14);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i14) {
        int itemDecorationCount = getItemDecorationCount();
        if (i14 < 0 || i14 >= itemDecorationCount) {
            org.apache.commons.lang3.e.v(androidx.core.view.j.d(i14, itemDecorationCount, " is an invalid index for size "));
        } else {
            removeItemDecoration(getItemDecorationAt(i14));
        }
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    public void repositionShadowingViews() {
        f0 f0Var;
        int iE = this.mChildHelper.e();
        for (int i14 = 0; i14 < iE; i14++) {
            View viewD = this.mChildHelper.d(i14);
            f0 childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (f0Var = childViewHolder.mShadowingHolder) != null) {
                View view2 = f0Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view2.getLeft() || top != view2.getTop()) {
                    view2.layout(left, top, view2.getWidth() + left, view2.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view2, View view3) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view2, view3) && view3 != null) {
            requestChildOnScreen(view2, view3);
        }
        super.requestChildFocus(view2, view3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z14) {
        return this.mLayout.requestChildRectangleOnScreen(this, view2, rect, z14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z14) {
        int size = this.mOnItemTouchListeners.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.mOnItemTouchListeners.get(i14).b(z14);
        }
        super.requestDisallowInterceptTouchEvent(z14);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i14 = 0; i14 < iH; i14++) {
            f0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                vb.h.z(androidx.core.view.j.g(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                return;
            } else {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.saveOldPosition();
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i14, int i15) {
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = pVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i14 = 0;
            }
            if (!zCanScrollVertically) {
                i15 = 0;
            }
            scrollByInternal(i14, i15, null, 0);
        }
    }

    public boolean scrollByInternal(int i14, int i15, MotionEvent motionEvent, int i16) {
        int i17;
        int i18;
        int i19;
        int i24;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i14, i15, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i25 = iArr2[0];
            int i26 = iArr2[1];
            i19 = i14 - i25;
            i24 = i15 - i26;
            i18 = i26;
            i17 = i25;
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i24 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i17, i18, i19, i24, this.mScrollOffset, i16, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i27 = iArr4[0];
        int i28 = i19 - i27;
        int i29 = iArr4[1];
        int i30 = i24 - i29;
        boolean z14 = (i27 == 0 && i29 == 0) ? false : true;
        int i34 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i35 = iArr5[0];
        this.mLastTouchX = i34 - i35;
        int i36 = this.mLastTouchY;
        int i37 = iArr5[1];
        this.mLastTouchY = i36 - i37;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i35;
        iArr6[1] = iArr6[1] + i37;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i28, motionEvent.getY(), i30);
            }
            considerReleasingGlowsOnScroll(i14, i15);
        }
        if (i17 != 0 || i18 != 0) {
            dispatchOnScrolled(i17, i18);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z14 && i17 == 0 && i18 == 0) ? false : true;
    }

    public void scrollStep(int i14, int i15, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i16 = h7.j.f82330a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i14 != 0 ? this.mLayout.scrollHorizontallyBy(i14, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i15 != 0 ? this.mLayout.scrollVerticallyBy(i15, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i14, int i15) {
    }

    public void scrollToPosition(int i14) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            return;
        }
        pVar.scrollToPosition(i14);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.f0 f0Var) {
        this.mAccessibilityDelegate = f0Var;
        s0.r(this, f0Var);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(f0 f0Var, int i14) {
        if (isComputingLayout()) {
            f0Var.mPendingAccessibilityState = i14;
            this.mPendingAccessibilityImportanceChange.add(f0Var);
            return false;
        }
        View view2 = f0Var.itemView;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        view2.setImportantForAccessibility(i14);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z14) {
        if (z14 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z14;
        super.setClipToPadding(z14);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        lVar.getClass();
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z14) {
        this.mHasFixedSize = z14;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.j();
            this.mItemAnimator.f10314a = null;
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.f10314a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i14) {
        w wVar = this.mRecycler;
        wVar.f10340e = i14;
        wVar.p();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z14) {
        suppressLayout(z14);
    }

    public void setLayoutManager(p pVar) {
        androidx.recyclerview.widget.f.b bVar;
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.j();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.b();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.b();
        }
        androidx.recyclerview.widget.f fVar = this.mChildHelper;
        fVar.f10449b.g();
        ArrayList arrayList = fVar.f10450c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = fVar.f10448a;
            if (size < 0) {
                break;
            }
            View view2 = (View) arrayList.get(size);
            e eVar = (e) bVar;
            eVar.getClass();
            f0 childViewHolderInt = getChildViewHolderInt(view2);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
            arrayList.remove(size);
        }
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView != null) {
                StringBuilder sb3 = new StringBuilder("LayoutManager ");
                sb3.append(pVar);
                sb3.append(" is already attached to a RecyclerView:");
                vb.h.s(androidx.core.view.j.g(pVar.mRecyclerView, sb3));
                return;
            }
            pVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.p();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            vb.h.s("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z14) {
        getScrollingChildHelper().g(z14);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z14) {
        this.mPreserveFocusAfterLayout = z14;
    }

    public void setRecycledViewPool(v vVar) {
        w wVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        wVar.h(recyclerView.mAdapter, false);
        v vVar2 = wVar.f10342g;
        if (vVar2 != null) {
            vVar2.f10330b--;
        }
        wVar.f10342g = vVar;
        if (vVar != null && recyclerView.getAdapter() != null) {
            wVar.f10342g.f10330b++;
        }
        wVar.g();
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    public void setScrollState(int i14) {
        if (i14 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i14;
        if (i14 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i14);
    }

    public void setScrollingTouchSlop(int i14) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i14 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.mRecycler.f10343h = d0Var;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i14, int i15, Interpolator interpolator, int i16, boolean z14) {
        p pVar = this.mLayout;
        if (pVar == null || this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i14 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i15 = 0;
        }
        if (i14 == 0 && i15 == 0) {
            return;
        }
        if (i16 != Integer.MIN_VALUE && i16 <= 0) {
            scrollBy(i14, i15);
            return;
        }
        if (z14) {
            int i17 = i14 != 0 ? 1 : 0;
            if (i15 != 0) {
                i17 |= 2;
            }
            startNestedScroll(i17, 1);
        }
        this.mViewFlinger.c(i14, i15, i16, interpolator);
    }

    public void smoothScrollToPosition(int i14) {
        p pVar;
        if (this.mLayoutSuppressed || (pVar = this.mLayout) == null) {
            return;
        }
        pVar.smoothScrollToPosition(this, this.mState, i14);
    }

    public void startInterceptRequestLayout() {
        int i14 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i14;
        if (i14 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i14) {
        return getScrollingChildHelper().h(i14, 0);
    }

    public void stopInterceptRequestLayout(boolean z14) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                vb.h.z(androidx.core.view.j.g(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
                return;
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z14 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z14 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z14) {
        if (z14 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z14) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(h hVar, boolean z14) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z14);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i14, int i15, Object obj) {
        int i16;
        int i17;
        int iH = this.mChildHelper.h();
        int i18 = i15 + i14;
        for (int i19 = 0; i19 < iH; i19++) {
            View viewG = this.mChildHelper.g(i19);
            f0 childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i17 = childViewHolderInt.mPosition) >= i14 && i17 < i18) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) viewG.getLayoutParams()).mInsetsDirty = true;
            }
        }
        w wVar = this.mRecycler;
        ArrayList<f0> arrayList = wVar.f10338c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f0 f0Var = arrayList.get(size);
            if (f0Var != null && (i16 = f0Var.mPosition) >= i14 && i16 < i18) {
                f0Var.addFlags(2);
                wVar.j(size);
            }
        }
    }

    public static abstract class j {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i14, int i15, Object obj) {
            onItemRangeChanged(i14, i15);
        }

        public void onItemRangeInserted(int i14, int i15) {
        }

        public void onItemRangeMoved(int i14, int i15, int i16) {
        }

        public void onItemRangeRemoved(int i14, int i15) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i14, int i15) {
        }
    }

    public static abstract class o {
        public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, b0 b0Var) {
            getItemOffsets(rect, ((q) view2.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDrawOver(canvas, recyclerView);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void getItemOffsets(Rect rect, int i14, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
    }

    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.f mChildHelper;
        private int mHeight;
        private int mHeightMode;
        k0 mHorizontalBoundCheck;
        private final k0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        a0 mSmoothScroller;
        k0 mVerticalBoundCheck;
        private final k0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements k0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int a() {
                p pVar = p.this;
                return pVar.getWidth() - pVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final View b(int i14) {
                return p.this.getChildAt(i14);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int c(View view2) {
                return p.this.getDecoratedLeft(view2) - ((ViewGroup.MarginLayoutParams) ((q) view2.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int d() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int e(View view2) {
                return p.this.getDecoratedRight(view2) + ((ViewGroup.MarginLayoutParams) ((q) view2.getLayoutParams())).rightMargin;
            }
        }

        public class b implements k0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int a() {
                p pVar = p.this;
                return pVar.getHeight() - pVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final View b(int i14) {
                return p.this.getChildAt(i14);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int c(View view2) {
                return p.this.getDecoratedTop(view2) - ((ViewGroup.MarginLayoutParams) ((q) view2.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int d() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public final int e(View view2) {
                return p.this.getDecoratedBottom(view2) + ((ViewGroup.MarginLayoutParams) ((q) view2.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f10327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f10328d;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new k0(aVar);
            this.mVerticalBoundCheck = new k0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view2, int i14, boolean z14) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            if (z14 || childViewHolderInt.isRemoved()) {
                k1<f0, l0.a> k1Var = this.mRecyclerView.mViewInfoStore.f10535a;
                l0.a aVarA = k1Var.get(childViewHolderInt);
                if (aVarA == null) {
                    aVarA = l0.a.a();
                    k1Var.put(childViewHolderInt, aVarA);
                }
                aVarA.f10538a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            q qVar = (q) view2.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view2, i14, view2.getLayoutParams(), false);
            } else {
                ViewParent parent = view2.getParent();
                RecyclerView recyclerView = this.mRecyclerView;
                androidx.recyclerview.widget.f fVar = this.mChildHelper;
                if (parent == recyclerView) {
                    int iJ = fVar.j(view2);
                    if (i14 == -1) {
                        i14 = this.mChildHelper.e();
                    }
                    if (iJ == -1) {
                        StringBuilder sb3 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb3.append(this.mRecyclerView.indexOfChild(view2));
                        vb.h.z(androidx.core.view.j.g(this.mRecyclerView, sb3));
                        return;
                    } else if (iJ != i14) {
                        this.mRecyclerView.mLayout.moveView(iJ, i14);
                    }
                } else {
                    fVar.a(view2, i14, false);
                    qVar.mInsetsDirty = true;
                    a0 a0Var = this.mSmoothScroller;
                    if (a0Var != null && a0Var.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view2);
                    }
                }
            }
            if (qVar.mPendingInvalidate) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(qVar.mViewHolder);
                }
                childViewHolderInt.itemView.invalidate();
                qVar.mPendingInvalidate = false;
            }
        }

        public static int chooseSize(int i14, int i15, int i16) {
            int mode = View.MeasureSpec.getMode(i14);
            int size = View.MeasureSpec.getSize(i14);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i15, i16) : size;
            }
            return Math.min(size, Math.max(i15, i16));
        }

        private void detachViewInternal(int i14, View view2) {
            this.mChildHelper.c(i14);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i14, int i15, int i16, int i17, boolean z14) {
            int iMax = Math.max(0, i14 - i16);
            if (z14) {
                if (i17 >= 0) {
                    i15 = 1073741824;
                } else if (i17 != -1 || (i15 != Integer.MIN_VALUE && (i15 == 0 || i15 != 1073741824))) {
                    i15 = 0;
                    i17 = 0;
                } else {
                    i17 = iMax;
                }
            } else if (i17 >= 0) {
                i15 = 1073741824;
            } else if (i17 == -1) {
                i17 = iMax;
            } else if (i17 != -2) {
                i15 = 0;
                i17 = 0;
            } else if (i15 == Integer.MIN_VALUE || i15 == 1073741824) {
                i17 = iMax;
                i15 = Integer.MIN_VALUE;
            } else {
                i17 = iMax;
                i15 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i17, i15);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view2, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view2.getLeft() + rect.left) - view2.getScrollX();
            int top = (view2.getTop() + rect.top) - view2.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i14 = left - paddingLeft;
            int iMin = Math.min(0, i14);
            int i15 = top - paddingTop;
            int iMin2 = Math.min(0, i15);
            int i16 = iWidth - width;
            int iMax = Math.max(0, i16);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i14, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i16);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i15, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i14, int i15) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hd.a.f83306a, i14, i15);
            dVar.f10325a = typedArrayObtainStyledAttributes.getInt(0, 1);
            dVar.f10326b = typedArrayObtainStyledAttributes.getInt(10, 1);
            dVar.f10327c = typedArrayObtainStyledAttributes.getBoolean(9, false);
            dVar.f10328d = typedArrayObtainStyledAttributes.getBoolean(11, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i14, int i15) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i14 < width && rect.right - i14 > paddingLeft && rect.top - i15 < height && rect.bottom - i15 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i14, int i15, int i16) {
            int mode = View.MeasureSpec.getMode(i15);
            int size = View.MeasureSpec.getSize(i15);
            if (i16 > 0 && i14 != i16) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i14;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i14;
            }
            return true;
        }

        private void scrapOrRecycleView(w wVar, int i14, View view2) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i14);
                wVar.l(childViewHolderInt);
            } else {
                detachViewAt(i14);
                wVar.m(view2);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view2) {
            addDisappearingView(view2, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view2) {
            addView(view2, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view2, int i14, q qVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            boolean zIsRemoved = childViewHolderInt.isRemoved();
            RecyclerView recyclerView = this.mRecyclerView;
            if (zIsRemoved) {
                k1<f0, l0.a> k1Var = recyclerView.mViewInfoStore.f10535a;
                l0.a aVarA = k1Var.get(childViewHolderInt);
                if (aVarA == null) {
                    aVarA = l0.a.a();
                    k1Var.put(childViewHolderInt, aVarA);
                }
                aVarA.f10538a |= 1;
            } else {
                recyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view2, i14, qVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view2, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i14, int i15, b0 b0Var, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i14, c cVar) {
        }

        public int computeHorizontalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(b0 b0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view2, w wVar) {
            scrapOrRecycleView(wVar, this.mChildHelper.j(view2), view2);
        }

        public void detachAndScrapViewAt(int i14, w wVar) {
            scrapOrRecycleView(wVar, i14, getChildAt(i14));
        }

        public void detachView(View view2) {
            int iJ = this.mChildHelper.j(view2);
            if (iJ >= 0) {
                detachViewInternal(iJ, view2);
            }
        }

        public void detachViewAt(int i14) {
            detachViewInternal(i14, getChildAt(i14));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view2) {
            m mVar = this.mRecyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.i(RecyclerView.getChildViewHolderInt(view2));
            }
        }

        public View findContainingItemView(View view2) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view2)) == null || this.mChildHelper.f10450c.contains(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i14) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i14 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f10291g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view2) {
            return ((q) view2.getLayoutParams()).mDecorInsets.bottom;
        }

        public View getChildAt(int i14) {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.d(i14);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getDecoratedBottom(View view2) {
            return getBottomDecorationHeight(view2) + view2.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view2, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view2, rect);
        }

        public int getDecoratedLeft(View view2) {
            return view2.getLeft() - getLeftDecorationWidth(view2);
        }

        public int getDecoratedMeasuredHeight(View view2) {
            Rect rect = ((q) view2.getLayoutParams()).mDecorInsets;
            return view2.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view2) {
            Rect rect = ((q) view2.getLayoutParams()).mDecorInsets;
            return view2.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view2) {
            return getRightDecorationWidth(view2) + view2.getRight();
        }

        public int getDecoratedTop(View view2) {
            return view2.getTop() - getTopDecorationHeight(view2);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f10450c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view2) {
            return RecyclerView.getChildViewHolderInt(view2).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(View view2) {
            return ((q) view2.getLayoutParams()).mDecorInsets.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view2) {
            return ((q) view2.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(View view2) {
            return ((q) view2.getLayoutParams()).mDecorInsets.right;
        }

        public int getRowCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, b0 b0Var) {
            return 0;
        }

        public int getTopDecorationHeight(View view2) {
            return ((q) view2.getLayoutParams()).mDecorInsets.top;
        }

        public void getTransformedBoundingBox(View view2, boolean z14, Rect rect) {
            Matrix matrix;
            if (z14) {
                Rect rect2 = ((q) view2.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view2.getWidth() + rect2.right, view2.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view2.getWidth(), view2.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view2.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view2.getLeft(), view2.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i14).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view2) {
            ViewParent parent = view2.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view2) == -1) {
                vb.h.s(androidx.core.view.j.g(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            } else {
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
            }
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(w wVar, b0 b0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            a0 a0Var = this.mSmoothScroller;
            return a0Var != null && a0Var.isRunning();
        }

        public boolean isViewPartiallyVisible(View view2, boolean z14, boolean z15) {
            boolean z16 = this.mHorizontalBoundCheck.b(view2) && this.mVerticalBoundCheck.b(view2);
            return z14 ? z16 : !z16;
        }

        public void layoutDecorated(View view2, int i14, int i15, int i16, int i17) {
            Rect rect = ((q) view2.getLayoutParams()).mDecorInsets;
            view2.layout(i14 + rect.left, i15 + rect.top, i16 - rect.right, i17 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view2, int i14, int i15, int i16, int i17) {
            q qVar = (q) view2.getLayoutParams();
            Rect rect = qVar.mDecorInsets;
            view2.layout(i14 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i15 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i16 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i17 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChild(View view2, int i14, int i15) {
            q qVar = (q) view2.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view2);
            int i16 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i14;
            int i17 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i15;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i16, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i17, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view2, childMeasureSpec, childMeasureSpec2, qVar)) {
                view2.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view2, int i14, int i15) {
            q qVar = (q) view2.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view2);
            int i16 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i14;
            int i17 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i15;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i16, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i17, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view2, childMeasureSpec, childMeasureSpec2, qVar)) {
                view2.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i14, int i15) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                detachViewAt(i14);
                attachView(childAt, i15);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i14 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i14) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i14);
            }
        }

        public void offsetChildrenVertical(int i14) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i14);
            }
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i14, int i15) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view2, int i14, w wVar, b0 b0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z14 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z14 = false;
            }
            accessibilityEvent.setScrollable(z14);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, b0 b0Var, l7.f fVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.s(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.s(true);
            }
            fVar.p(l7.f.g.a(getRowCountForAccessibility(wVar, b0Var), getColumnCountForAccessibility(wVar, b0Var), getSelectionModeForAccessibility(wVar, b0Var), isLayoutHierarchical(wVar, b0Var)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view2, l7.f fVar) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            androidx.recyclerview.widget.f fVar2 = this.mChildHelper;
            if (fVar2.f10450c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view2, fVar);
        }

        public View onInterceptFocusSearch(View view2, int i14) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i14, int i15) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i14, int i15, int i16) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i14, int i15) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i14, int i15, Object obj) {
            onItemsUpdated(recyclerView, i14, i15);
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(w wVar, b0 b0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(b0 b0Var) {
        }

        public void onMeasure(w wVar, b0 b0Var, int i14, int i15) {
            this.mRecyclerView.defaultOnMeasure(i14, i15);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view2, View view3) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i14) {
        }

        public void onSmoothScrollerStopped(a0 a0Var) {
            if (this.mSmoothScroller == a0Var) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(w wVar, b0 b0Var, int i14, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i15;
            int i16;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i14 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i15 = paddingTop;
                    i16 = paddingLeft;
                } else {
                    i15 = paddingTop;
                    i16 = 0;
                }
            } else if (i14 != 8192) {
                i16 = 0;
                i15 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i15 = paddingTop;
                    i16 = paddingLeft;
                } else {
                    i15 = paddingTop;
                    i16 = 0;
                }
            }
            if (i15 == 0 && i16 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i16, i15, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view2, int i14, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view2, i14, bundle);
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.k(childCount);
            }
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(w wVar) {
            ArrayList<f0> arrayList;
            int size = wVar.f10336a.size();
            int i14 = size - 1;
            while (true) {
                arrayList = wVar.f10336a;
                if (i14 < 0) {
                    break;
                }
                View view2 = arrayList.get(i14).itemView;
                f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view2, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.i(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    f0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view2);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    wVar.l(childViewHolderInt2);
                }
                i14--;
            }
            arrayList.clear();
            ArrayList<f0> arrayList2 = wVar.f10337b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view2, w wVar) {
            removeView(view2);
            wVar.k(view2);
        }

        public void removeAndRecycleViewAt(int i14, w wVar) {
            View childAt = getChildAt(i14);
            removeViewAt(i14);
            wVar.k(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view2) {
            this.mRecyclerView.removeDetachedView(view2, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view2) {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            androidx.recyclerview.widget.f.b bVar = fVar.f10448a;
            int i14 = fVar.f10451d;
            if (i14 == 1) {
                vb.h.z("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i14 == 2) {
                vb.h.z("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                fVar.f10451d = 1;
                fVar.f10452e = view2;
                int iIndexOfChild = RecyclerView.this.indexOfChild(view2);
                if (iIndexOfChild < 0) {
                    return;
                }
                if (fVar.f10449b.f(iIndexOfChild)) {
                    fVar.l(view2);
                }
                ((e) bVar).a(iIndexOfChild);
            } finally {
                fVar.f10451d = 0;
                fVar.f10452e = null;
            }
        }

        public void removeViewAt(int i14) {
            if (getChildAt(i14) != null) {
                this.mChildHelper.k(i14);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view2, Rect rect, boolean z14, boolean z15) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view2, rect);
            int i14 = childRectangleOnScreenScrollAmount[0];
            int i15 = childRectangleOnScreenScrollAmount[1];
            if ((z15 && !isFocusedChildVisibleAfterScrolling(recyclerView, i14, i15)) || (i14 == 0 && i15 == 0)) {
                return false;
            }
            if (z14) {
                recyclerView.scrollBy(i14, i15);
            } else {
                recyclerView.smoothScrollBy(i14, i15);
            }
            return true;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i14, w wVar, b0 b0Var) {
            return 0;
        }

        public void scrollToPosition(int i14) {
            int i15 = RecyclerView.HORIZONTAL;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i14, w wVar, b0 b0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z14) {
            this.mAutoMeasure = z14;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z14) {
            if (z14 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z14;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.p();
                }
            }
        }

        public void setMeasureSpecs(int i14, int i15) {
            this.mWidth = View.MeasureSpec.getSize(i14);
            int mode = View.MeasureSpec.getMode(i14);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i15);
            int mode2 = View.MeasureSpec.getMode(i15);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i14, int i15) {
            setMeasuredDimension(chooseSize(i14, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i15, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i14, int i15) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i14, i15);
                return;
            }
            int i16 = Integer.MIN_VALUE;
            int i17 = Integer.MAX_VALUE;
            int i18 = Integer.MIN_VALUE;
            int i19 = Integer.MAX_VALUE;
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt = getChildAt(i24);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i25 = rect.left;
                if (i25 < i19) {
                    i19 = i25;
                }
                int i26 = rect.right;
                if (i26 > i16) {
                    i16 = i26;
                }
                int i27 = rect.top;
                if (i27 < i17) {
                    i17 = i27;
                }
                int i28 = rect.bottom;
                if (i28 > i18) {
                    i18 = i28;
                }
            }
            this.mRecyclerView.mTempRect.set(i19, i17, i16, i18);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i14, i15);
        }

        public void setMeasurementCacheEnabled(boolean z14) {
            this.mMeasurementCacheEnabled = z14;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view2, int i14, int i15, q qVar) {
            return (!view2.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view2.getWidth(), i14, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view2.getHeight(), i15, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view2, int i14, int i15, q qVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view2.getMeasuredWidth(), i14, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view2.getMeasuredHeight(), i15, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, b0 b0Var, int i14) {
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(a0 a0Var) {
            a0 a0Var2 = this.mSmoothScroller;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = a0Var;
            a0Var.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view2) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view2);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            a0 a0Var = this.mSmoothScroller;
            if (a0Var != null) {
                a0Var.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i14, int i15) {
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view2, int i14) {
            addViewInt(view2, i14, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view2, int i14) {
            addViewInt(view2, i14, false);
        }

        public boolean performAccessibilityActionForItem(w wVar, b0 b0Var, View view2, int i14, Bundle bundle) {
            return false;
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, b0 b0Var, View view2, View view3) {
            return onRequestChildFocus(recyclerView, view2, view3);
        }

        @SuppressLint({"UnknownNullness"})
        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, b0 b0Var, View view2, l7.f fVar) {
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view2, Rect rect, boolean z14) {
            return requestChildRectangleOnScreen(recyclerView, view2, rect, z14, false);
        }

        public void setMeasuredDimension(int i14, int i15) {
            this.mRecyclerView.setMeasuredDimension(i14, i15);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i14, int i15, int i16, boolean z14) {
            int i17 = i14 - i15;
            int i18 = 0;
            int iMax = Math.max(0, i17);
            if (z14) {
                if (i16 >= 0) {
                    i18 = 1073741824;
                } else {
                    i16 = 0;
                }
            } else if (i16 >= 0) {
                i18 = 1073741824;
            } else if (i16 == -1) {
                i16 = iMax;
                i18 = 1073741824;
            } else if (i16 == -2) {
                i18 = Integer.MIN_VALUE;
                i16 = iMax;
            } else {
                i16 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i16, i18);
        }

        public void attachView(View view2, int i14) {
            attachView(view2, i14, (q) view2.getLayoutParams());
        }

        public void attachView(View view2) {
            attachView(view2, -1);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(l7.f fVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, fVar);
        }

        public boolean performAccessibilityAction(int i14, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i14, bundle);
        }
    }

    public static class z extends s7.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Parcelable f10346a;

        public z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10346a = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        @Override // s7.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeParcelable(this.f10346a, 0);
        }

        public class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i14) {
                return new z[i14];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }
        }

        public z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class h<VH extends f0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh3, int i14) {
            boolean z14 = vh3.mBindingAdapter == null;
            if (z14) {
                vh3.mPosition = i14;
                if (hasStableIds()) {
                    vh3.mItemId = getItemId(i14);
                }
                vh3.setFlags(1, 519);
                int i15 = h7.j.f82330a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh3.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh3.itemView.getParent() == null) {
                    View view2 = vh3.itemView;
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    if (view2.isAttachedToWindow() != vh3.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh3.isTmpDetached() + ", attached to window: " + vh3.itemView.isAttachedToWindow() + ", holder: " + vh3);
                    }
                }
                if (vh3.itemView.getParent() == null) {
                    View view3 = vh3.itemView;
                    WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                    if (view3.isAttachedToWindow()) {
                        com.google.firebase.messaging.l.n(vh3, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return;
                    }
                }
            }
            onBindViewHolder(vh3, i14, vh3.getUnmodifiedPayloads());
            if (z14) {
                vh3.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh3.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).mInsetsDirty = true;
                }
                int i16 = h7.j.f82330a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int i14 = g.f10309a[this.mStateRestorationPolicy.ordinal()];
            return i14 != 1 && (i14 != 2 || getItemCount() > 0);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i14) {
            try {
                int i15 = h7.j.f82330a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh3 = (VH) onCreateViewHolder(viewGroup, i14);
                if (vh3.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh3.mItemViewType = i14;
                Trace.endSection();
                return vh3;
            } catch (Throwable th3) {
                int i16 = h7.j.f82330a;
                Trace.endSection();
                throw th3;
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends f0> hVar, f0 f0Var, int i14) {
            if (hVar == this) {
                return i14;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i14) {
            return -1L;
        }

        public int getItemViewType(int i14) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i14) {
            this.mObservable.d(i14, 1, null);
        }

        public final void notifyItemInserted(int i14) {
            this.mObservable.e(i14, 1);
        }

        public final void notifyItemMoved(int i14, int i15) {
            this.mObservable.c(i14, i15);
        }

        public final void notifyItemRangeChanged(int i14, int i15) {
            this.mObservable.d(i14, i15, null);
        }

        public final void notifyItemRangeInserted(int i14, int i15) {
            this.mObservable.e(i14, i15);
        }

        public final void notifyItemRangeRemoved(int i14, int i15) {
            this.mObservable.f(i14, i15);
        }

        public final void notifyItemRemoved(int i14) {
            this.mObservable.f(i14, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh3, int i14);

        public void onBindViewHolder(VH vh3, int i14, List<Object> list) {
            onBindViewHolder(vh3, i14);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i14);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh3) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh3) {
        }

        public void onViewDetachedFromWindow(VH vh3) {
        }

        public void onViewRecycled(VH vh3) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z14) {
            if (hasObservers()) {
                vb.h.z("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else {
                this.mHasStableIds = z14;
            }
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemRangeChanged(int i14, int i15, Object obj) {
            this.mObservable.d(i14, i15, obj);
        }

        public final void notifyItemChanged(int i14, Object obj) {
            this.mObservable.d(i14, 1, obj);
        }
    }

    @Override // androidx.core.view.t
    public void stopNestedScroll(int i14) {
        getScrollingChildHelper().i(i14);
    }

    public boolean hasNestedScrollingParent(int i14) {
        return getScrollingChildHelper().f(i14);
    }

    public boolean startNestedScroll(int i14, int i15) {
        return getScrollingChildHelper().h(i14, i15);
    }

    public boolean dispatchNestedPreScroll(int i14, int i15, int[] iArr, int[] iArr2, int i16) {
        return getScrollingChildHelper().c(i14, i15, iArr, iArr2, i16);
    }

    public static abstract class a0 {
        private p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public interface b {
            PointF computeScrollVectorForPosition(int i14);
        }

        public PointF computeScrollVectorForPosition(int i14) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i14);
            }
            return null;
        }

        public View findViewByPosition(int i14) {
            return this.mRecyclerView.mLayout.findViewByPosition(i14);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view2) {
            return this.mRecyclerView.getChildLayoutPosition(view2);
        }

        public p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i14) {
            this.mRecyclerView.scrollToPosition(i14);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f14 = pointF.x;
            float f15 = pointF.y;
            float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i14, int i15) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f14 = pointFComputeScrollVectorForPosition.x;
                if (f14 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f14), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view2 = this.mTargetView;
            if (view2 != null) {
                if (getChildPosition(view2) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i14, i15, recyclerView.mState, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                boolean z14 = aVar.f10281d >= 0;
                aVar.a(recyclerView);
                if (z14 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public void onChildAttachedToWindow(View view2) {
            if (getChildPosition(view2) == getTargetPosition()) {
                this.mTargetView = view2;
                int i14 = RecyclerView.HORIZONTAL;
            }
        }

        public abstract void onSeekTargetStep(int i14, int i15, b0 b0Var, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view2, b0 b0Var, a aVar);

        public void setTargetPosition(int i14) {
            this.mTargetPosition = i14;
        }

        public void start(RecyclerView recyclerView, p pVar) {
            e0 e0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(e0Var);
            e0Var.f10303c.abortAnimation();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = pVar;
            int i14 = this.mTargetPosition;
            if (i14 == -1) {
                vb.h.s("Invalid target position");
                return;
            }
            recyclerView.mState.f10285a = i14;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.b();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f10285a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10278a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10279b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f10280c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f10281d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Interpolator f10282e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f10283f;

            public a(int i14, int i15, int i16, Interpolator interpolator) {
                this.f10281d = -1;
                this.f10283f = false;
                this.f10278a = i14;
                this.f10279b = i15;
                this.f10280c = i16;
                this.f10282e = interpolator;
            }

            public final void a(RecyclerView recyclerView) {
                int i14 = this.f10281d;
                if (i14 >= 0) {
                    this.f10281d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i14);
                    this.f10283f = false;
                } else if (this.f10283f) {
                    Interpolator interpolator = this.f10282e;
                    if (interpolator != null && this.f10280c < 1) {
                        vb.h.z("If you provide an interpolator, you must set a positive duration");
                        return;
                    }
                    int i15 = this.f10280c;
                    if (i15 < 1) {
                        vb.h.z("Scroll duration must be a positive number");
                    } else {
                        recyclerView.mViewFlinger.c(this.f10278a, this.f10279b, i15, interpolator);
                        this.f10283f = false;
                    }
                }
            }

            public final void b(int i14, int i15, int i16, Interpolator interpolator) {
                this.f10278a = i14;
                this.f10279b = i15;
                this.f10280c = i16;
                this.f10282e = interpolator;
                this.f10283f = true;
            }

            public a(int i14, int i15, int i16) {
                this(i14, i15, i16, null);
            }

            public a(int i14, int i15) {
                this(i14, i15, Integer.MIN_VALUE, null);
            }
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        f0 mViewHolder;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public q(int i14, int i15) {
            super(i14, i15);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    public boolean dispatchNestedScroll(int i14, int i15, int i16, int i17, int[] iArr, int i18) {
        return getScrollingChildHelper().d(i14, i15, i16, i17, iArr, i18, null);
    }

    public final void dispatchNestedScroll(int i14, int i15, int i16, int i17, int[] iArr, int i18, int[] iArr2) {
        getScrollingChildHelper().d(i14, i15, i16, i17, iArr, i18, iArr2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        vb.h.z(androidx.core.view.j.g(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Deprecated
    public f0 findViewHolderForPosition(int i14) {
        return findViewHolderForPosition(i14, false);
    }

    public void smoothScrollBy(int i14, int i15, Interpolator interpolator) {
        smoothScrollBy(i14, i15, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i14, int i15, Interpolator interpolator, int i16) {
        smoothScrollBy(i14, i15, interpolator, i16, false);
    }

    public void smoothScrollBy(int i14, int i15) {
        smoothScrollBy(i14, i15, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
