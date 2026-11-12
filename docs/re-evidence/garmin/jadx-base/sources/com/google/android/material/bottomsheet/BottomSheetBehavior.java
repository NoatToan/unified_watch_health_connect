package com.google.android.material.bottomsheet;

import am.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.customview.widget.c;
import c7.e;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import g7.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import l7.f;
import l7.h;

/* JADX INFO: loaded from: classes14.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private ColorStateList backgroundTint;
    MaterialBottomContainerBackHelper bottomContainerBackHelper;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0092c dragCallback;
    private boolean draggable;
    float elevation;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    c viewDragHelper;
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public void onLayout(View view2) {
        }

        public abstract void onSlide(View view2, float f14);

        public abstract void onStateChanged(View view2, int i14);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    c cVar = BottomSheetBehavior.this.viewDragHelper;
                    if (cVar != null && cVar.h()) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i14) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i14;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            V v14 = BottomSheetBehavior.this.viewRef.get();
            Runnable runnable = this.continueSettlingRunnable;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            v14.postOnAnimation(runnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i14;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new c.AbstractC0092c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view2) {
                int top = view2.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionHorizontal(View view2, int i15, int i16) {
                return view2.getLeft();
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionVertical(View view2, int i15, int i16) {
                return a.b(i15, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view2));
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int getViewVerticalDragRange(View view2) {
                boolean zCanBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return zCanBeHiddenByDragging ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewDragStateChanged(int i15) {
                if (i15 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewPositionChanged(View view2, int i15, int i16, int i17, int i18) {
                BottomSheetBehavior.this.dispatchOnSlide(i16);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewReleased(View view2, float f14, float f15) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i15 = 6;
                if (f15 < 0.0f) {
                    if (bottomSheetBehavior.fitToContents) {
                        i15 = 3;
                    } else {
                        int top = view2.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        boolean zShouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (zShouldSkipHalfExpandedStateWhenDragging) {
                            if (!bottomSheetBehavior2.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top * 100.0f) / bottomSheetBehavior2.parentHeight)) {
                                i15 = 4;
                            }
                        } else if (top <= bottomSheetBehavior2.halfExpandedOffset) {
                        }
                        i15 = 3;
                    }
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view2, f15)) {
                    if ((Math.abs(f14) < Math.abs(f15) && f15 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view2)) {
                        i15 = 5;
                    } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view2.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view2.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        i15 = 3;
                    }
                } else if (f15 == 0.0f || Math.abs(f14) > Math.abs(f15)) {
                    int top2 = view2.getTop();
                    boolean z14 = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z14) {
                        int i16 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i16) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                i15 = 3;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i15 = 4;
                            }
                        } else if (Math.abs(top2 - i16) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i15 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior3.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                        i15 = 3;
                    } else {
                        i15 = 4;
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i15 = 4;
                } else {
                    int top3 = view2.getTop();
                    if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        i15 = 4;
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view2, i15, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public boolean tryCaptureView(View view2, int i15) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i16 = bottomSheetBehavior.state;
                if (i16 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i16 == 3 && bottomSheetBehavior.activePointerId == i15) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view3 = weakReference != null ? weakReference.get() : null;
                    if (view3 != null && view3.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view2;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i15 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i15);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i16 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, -1));
        }
        int i17 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i17, -1));
        }
        int i18 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i18);
        if (typedValuePeekValue == null || (i14 = typedValuePeekValue.data) != -1) {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i18, -1));
        } else {
            setPeekHeight(i14);
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, HIDE_THRESHOLD));
        int i19 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i19);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i19, 0));
        } else {
            setExpandedOffset(typedValuePeekValue2.data);
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(View view2, int i14, int i15) {
        return s0.a(view2, view2.getResources().getString(i14), createAccessibilityViewCommandForState(i15));
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        boolean z14 = this.fitToContents;
        int i14 = this.parentHeight;
        if (z14) {
            this.collapsedOffset = Math.max(i14 - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i14 - iCalculatePeekHeight;
        }
    }

    private float calculateCornerInterpolation(float f14, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f14 > 0.0f) {
                return radius / f14;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v14 = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v14.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int calculatePeekHeight() {
        int i14;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        return (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i14 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i14 + this.peekHeightGestureInsetBuffer);
    }

    private float calculateSlideOffsetWithTop(int i14) {
        float f14;
        float expandedOffset;
        int i15 = this.collapsedOffset;
        if (i14 > i15 || i15 == getExpandedOffset()) {
            int i16 = this.collapsedOffset;
            f14 = i16 - i14;
            expandedOffset = this.parentHeight - i16;
        } else {
            int i17 = this.collapsedOffset;
            f14 = i17 - i14;
            expandedOffset = i17 - getExpandedOffset();
        }
        return f14 / expandedOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view2, int i14) {
        if (view2 == null) {
            return;
        }
        s0.o(524288, view2);
        s0.j(0, view2);
        s0.o(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, view2);
        s0.j(0, view2);
        s0.o(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view2);
        s0.j(0, view2);
        int i15 = this.expandHalfwayActionIds.get(i14, -1);
        if (i15 != -1) {
            s0.o(i15, view2);
            s0.j(0, view2);
            this.expandHalfwayActionIds.delete(i14);
        }
    }

    private h createAccessibilityViewCommandForState(final int i14) {
        return new h() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // l7.h
            public boolean perform(View view2, h.a aVar) {
                BottomSheetBehavior.this.setState(i14);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v14) {
        ViewGroup.LayoutParams layoutParams = v14.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            vb.h.s("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f6350a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        vb.h.s("The view is not associated with BottomSheetBehavior");
        return null;
    }

    private int getChildMeasureSpec(int i14, int i15, int i16, int i17) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i15, i17);
        if (i16 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i16), 1073741824);
        }
        if (size != 0) {
            i16 = Math.min(size, i16);
        }
        return View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
    }

    private int getTopOffsetForState(int i14) {
        if (i14 == 3) {
            return getExpandedOffset();
        }
        if (i14 == 4) {
            return this.collapsedOffset;
        }
        if (i14 == 5) {
            return this.parentHeight;
        }
        if (i14 == 6) {
            return this.halfExpandedOffset;
        }
        vb.h.s(j.h(i14, "Invalid state to get top offset: "));
        return 0;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.viewRef.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            return this.shouldRemoveExpandedCorners || isAtTopOfScreen();
        }
        return false;
    }

    private boolean isLayouting(V v14) {
        ViewParent parent = v14.getParent();
        if (parent == null || !parent.isLayoutRequested()) {
            return false;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return v14.isAttachedToWindow();
    }

    private void replaceAccessibilityActionForState(View view2, f.a aVar, int i14) {
        s0.p(view2, aVar, null, createAccessibilityViewCommandForState(i14));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i14 = this.saveFlags;
        if (i14 == 0) {
            return;
        }
        if (i14 == -1 || (i14 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i14 == -1 || (i14 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i14 == -1 || (i14 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i14 == -1 || (i14 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v14, Runnable runnable) {
        if (isLayouting(v14)) {
            v14.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view2) {
        final boolean z14 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z14) {
            ViewUtils.doOnApplyWindowInsets(view2, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Code duplicated, block: B:33:0x009f  */
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public m1 onApplyWindowInsets(View view3, m1 m1Var, ViewUtils.RelativePadding relativePadding) {
                    boolean z15;
                    e eVarI = m1Var.f6508a.i(519);
                    e eVarI2 = m1Var.f6508a.i(32);
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i14 = eVarI.f25191b;
                    int i15 = eVarI.f25192c;
                    int i16 = eVarI.f25190a;
                    bottomSheetBehavior.insetTop = i14;
                    boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view3);
                    int paddingBottom = view3.getPaddingBottom();
                    int paddingLeft = view3.getPaddingLeft();
                    int paddingRight = view3.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = m1Var.a();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (zIsLayoutRtl ? relativePadding.end : relativePadding.start) + i16;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + i15;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                    boolean z16 = true;
                    if (!BottomSheetBehavior.this.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == i16) {
                        z15 = false;
                    } else {
                        marginLayoutParams.leftMargin = i16;
                        z15 = true;
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i15) {
                        marginLayoutParams.rightMargin = i15;
                        z15 = true;
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i17 = marginLayoutParams.topMargin;
                        int i18 = eVarI.f25191b;
                        if (i17 != i18) {
                            marginLayoutParams.topMargin = i18;
                        } else {
                            z16 = z15;
                        }
                    } else {
                        z16 = z15;
                    }
                    if (z16) {
                        view3.setLayoutParams(marginLayoutParams);
                    }
                    view3.setPadding(paddingLeft, view3.getPaddingTop(), paddingRight, paddingBottom);
                    if (z14) {
                        BottomSheetBehavior.this.gestureInsetBottom = eVarI2.f25193d;
                    }
                    if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets && !z14) {
                        return m1Var;
                    }
                    BottomSheetBehavior.this.updatePeekHeight(false);
                    return m1Var;
                }
            });
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view2, int i14, boolean z14) {
        int topOffsetForState = getTopOffsetForState(i14);
        c cVar = this.viewDragHelper;
        if (cVar == null || (!z14 ? cVar.u(view2, view2.getLeft(), topOffsetForState) : cVar.s(view2.getLeft(), topOffsetForState))) {
            setStateInternal(i14);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i14, true);
        this.stateSettlingTracker.continueSettlingToState(i14);
    }

    private void updateAccessibilityActions(View view2, int i14) {
        if (view2 == null) {
            return;
        }
        clearAccessibilityAction(view2, i14);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i14, addAccessibilityActionForState(view2, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view2, f.a.f110575n, 5);
        }
        int i15 = this.state;
        if (i15 == 3) {
            replaceAccessibilityActionForState(view2, f.a.f110574m, this.fitToContents ? 4 : 6);
            return;
        }
        if (i15 == 4) {
            replaceAccessibilityActionForState(view2, f.a.f110573l, this.fitToContents ? 3 : 6);
        } else {
            if (i15 != 6) {
                return;
            }
            replaceAccessibilityActionForState(view2, f.a.f110574m, 4);
            replaceAccessibilityActionForState(view2, f.a.f110573l, 3);
        }
    }

    private void updateDrawableForTargetState(int i14, boolean z14) {
        boolean zIsExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i14 == 2 || this.expandedCornersRemoved == (zIsExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = zIsExpandedAndShouldRemoveCorners;
        if (!z14 || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.getInterpolation(), zIsExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z14) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z14) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = coordinatorLayout.getChildAt(i14);
                if (childAt != this.viewRef.get()) {
                    if (z14) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        int iIntValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                        childAt.setImportantForAccessibility(iIntValue);
                    }
                }
            }
            if (!z14) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z14) {
        V v14;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v14 = this.viewRef.get()) == null) {
                return;
            }
            if (z14) {
                setState(4);
            } else {
                v14.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i14) {
        V v14 = this.viewRef.get();
        if (v14 == null || this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i14);
        for (int i15 = 0; i15 < this.callbacks.size(); i15++) {
            this.callbacks.get(i15).onSlide(v14, fCalculateSlideOffsetWithTop);
        }
    }

    public View findScrollingChild(View view2) {
        if (view2.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.isNestedScrollingEnabled()) {
            return view2;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i14));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
        }
        return null;
    }

    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        b.c cVarOnHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        if (cVarOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.hideable ? 5 : 4);
            return;
        }
        boolean z14 = this.hideable;
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper2 = this.bottomContainerBackHelper;
        if (z14) {
            materialBottomContainerBackHelper2.finishBackProgressNotPersistent(cVarOnHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.setStateInternal(5);
                    WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    BottomSheetBehavior.this.viewRef.get().requestLayout();
                }
            });
        } else {
            materialBottomContainerBackHelper2.finishBackProgressPersistent(cVarOnHandleBackInvoked, null);
            setState(4);
        }
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        int i14;
        c cVar;
        if (!v14.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x14 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x14, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v14, x14, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.t(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view3 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i14 = this.initialY) == -1 || Math.abs(((float) i14) - motionEvent.getY()) <= ((float) this.viewDragHelper.f6631b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v14, int i14) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (coordinatorLayout.getFitsSystemWindows() && !v14.getFitsSystemWindows()) {
            v14.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v14);
            s0.t(v14, new InsetsAnimationCallback(v14));
            this.viewRef = new WeakReference<>(v14);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v14);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                v14.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    elevation = v14.getElevation();
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    v14.setBackgroundTintList(colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v14.getImportantForAccessibility() == 0) {
                v14.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = c.j(coordinatorLayout, this.dragCallback);
        }
        int top = v14.getTop();
        coordinatorLayout.onLayoutChild(v14, i14);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v14.getHeight();
        this.childHeight = height;
        int iMin = this.parentHeight;
        int i15 = iMin - height;
        int i16 = this.insetTop;
        if (i15 < i16) {
            boolean z14 = this.paddingTopSystemWindowInsets;
            int i17 = this.maxHeight;
            if (z14) {
                if (i17 != -1) {
                    iMin = Math.min(iMin, i17);
                }
                this.childHeight = iMin;
            } else {
                int iMin2 = iMin - i16;
                if (i17 != -1) {
                    iMin2 = Math.min(iMin2, i17);
                }
                this.childHeight = iMin2;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i18 = this.state;
        if (i18 == 3) {
            v14.offsetTopAndBottom(getExpandedOffset());
        } else if (i18 == 6) {
            v14.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i18 == 5) {
            v14.offsetTopAndBottom(this.parentHeight);
        } else if (i18 == 4) {
            v14.offsetTopAndBottom(this.collapsedOffset);
        } else if (i18 == 1 || i18 == 2) {
            v14.offsetTopAndBottom(top - v14.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v14));
        for (int i19 = 0; i19 < this.callbacks.size(); i19++) {
            this.callbacks.get(i19).onLayout(v14);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, int i16, int i17) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v14.getLayoutParams();
        v14.measure(getChildMeasureSpec(i14, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i15, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i16, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i17, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v14, View view2, float f14, float f15) {
        WeakReference<View> weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view2 == weakReference.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v14, view2, f14, f15));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int[] iArr, int i16) {
        if (i16 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view3 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view2 == view3) {
            int top = v14.getTop();
            int i17 = top - i15;
            if (i15 > 0) {
                if (i17 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    int i18 = -expandedOffset;
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    v14.offsetTopAndBottom(i18);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i15;
                    WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                    v14.offsetTopAndBottom(-i15);
                    setStateInternal(1);
                }
            } else if (i15 < 0 && !view2.canScrollVertically(-1)) {
                if (i17 > this.collapsedOffset && !canBeHiddenByDragging()) {
                    int i19 = top - this.collapsedOffset;
                    iArr[1] = i19;
                    int i24 = -i19;
                    WeakHashMap<View, g1> weakHashMap3 = s0.f6563a;
                    v14.offsetTopAndBottom(i24);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i15;
                    WeakHashMap<View, g1> weakHashMap4 = s0.f6563a;
                    v14.offsetTopAndBottom(-i15);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v14.getTop());
            this.lastNestedScrollDy = i15;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v14, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v14, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i14 = savedState.state;
        if (i14 == 1 || i14 == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i14;
            this.lastStableState = i14;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v14) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v14), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, View view3, int i14, int i15) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i14 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v14, View view2, int i14) {
        WeakReference<View> weakReference;
        int i15 = 3;
        if (v14.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view2 == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents && v14.getTop() > this.halfExpandedOffset) {
                    i15 = 6;
                }
            } else if (this.hideable && shouldHide(v14, getYVelocity())) {
                i15 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v14.getTop();
                if (!this.fitToContents) {
                    int i16 = this.halfExpandedOffset;
                    if (top < i16) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                            if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i15 = 4;
                            } else {
                                i15 = 6;
                            }
                        }
                    } else if (Math.abs(top - i16) < Math.abs(top - this.collapsedOffset)) {
                        i15 = 6;
                    } else {
                        i15 = 4;
                    }
                } else if (Math.abs(top - this.fitToContentsOffset) >= Math.abs(top - this.collapsedOffset)) {
                    i15 = 4;
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v14.getTop();
                    if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        i15 = 6;
                    }
                }
                i15 = 4;
            }
            startSettling(v14, i15, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        if (!v14.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float fAbs = Math.abs(this.initialY - motionEvent.getY());
            c cVar = this.viewDragHelper;
            if (fAbs > cVar.f6631b) {
                cVar.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v14);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(View view2) {
        WeakReference<View> weakReference;
        if (view2 != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view2);
            updateAccessibilityActions(view2, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDraggable(boolean z14) {
        this.draggable = z14;
    }

    public void setExpandedOffset(int i14) {
        if (i14 < 0) {
            vb.h.s("offset must be greater than or equal to 0");
        } else {
            this.expandedOffset = i14;
            updateDrawableForTargetState(this.state, true);
        }
    }

    public void setFitToContents(boolean z14) {
        if (this.fitToContents == z14) {
            return;
        }
        this.fitToContents = z14;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z14) {
        this.gestureInsetBottomIgnored = z14;
    }

    public void setHalfExpandedRatio(float f14) {
        if (f14 <= 0.0f || f14 >= 1.0f) {
            vb.h.s("ratio must be a float value between 0 and 1");
            return;
        }
        this.halfExpandedRatio = f14;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f14) {
        this.hideFriction = f14;
    }

    public void setHideable(boolean z14) {
        if (this.hideable != z14) {
            this.hideable = z14;
            if (!z14 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z14) {
        this.hideable = z14;
    }

    public void setMaxHeight(int i14) {
        this.maxHeight = i14;
    }

    public void setMaxWidth(int i14) {
        this.maxWidth = i14;
    }

    public final void setPeekHeight(int i14, boolean z14) {
        boolean z15 = this.peekHeightAuto;
        if (i14 == -1) {
            if (z15) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!z15 && this.peekHeight == i14) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i14);
        }
        updatePeekHeight(z14);
    }

    public void setSaveFlags(int i14) {
        this.saveFlags = i14;
    }

    public void setShouldRemoveExpandedCorners(boolean z14) {
        if (this.shouldRemoveExpandedCorners != z14) {
            this.shouldRemoveExpandedCorners = z14;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i14) {
        this.significantVelocityThreshold = i14;
    }

    public void setSkipCollapsed(boolean z14) {
        this.skipCollapsed = z14;
    }

    public void setState(int i14) {
        if (i14 == 1 || i14 == 2) {
            throw new IllegalArgumentException(j.o(i14 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        if (this.hideable || i14 != 5) {
            final int i15 = (i14 == 6 && this.fitToContents && getTopOffsetForState(i14) <= this.fitToContentsOffset) ? 3 : i14;
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                setStateInternal(i14);
            } else {
                final V v14 = this.viewRef.get();
                runAfterLayout(v14, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BottomSheetBehavior.this.startSettling(v14, i15, false);
                    }
                });
            }
        }
    }

    public void setStateInternal(int i14) {
        V v14;
        if (this.state == i14) {
            return;
        }
        this.state = i14;
        if (i14 == 4 || i14 == 3 || i14 == 6 || (this.hideable && i14 == 5)) {
            this.lastStableState = i14;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v14 = weakReference.get()) == null) {
            return;
        }
        if (i14 == 3) {
            updateImportantForAccessibility(true);
        } else if (i14 == 6 || i14 == 5 || i14 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i14, true);
        for (int i15 = 0; i15 < this.callbacks.size(); i15++) {
            this.callbacks.get(i15).onStateChanged(v14, i14);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z14) {
        this.updateImportantForAccessibilityOnSiblings = z14;
    }

    public boolean shouldExpandOnUpwardDrag(long j8, float f14) {
        return false;
    }

    public boolean shouldHide(View view2, float f14) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view2.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f14 * this.hideFriction) + ((float) view2.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > HIDE_THRESHOLD;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(b.c cVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(cVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(b.c cVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(cVar);
    }

    public void setPeekHeight(int i14) {
        setPeekHeight(i14, false);
    }

    public static class SavedState extends s7.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i14) {
                return new SavedState[i14];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // s7.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i14) {
            super(parcelable);
            this.state = i14;
        }
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new c.AbstractC0092c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view2) {
                int top = view2.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionHorizontal(View view2, int i15, int i16) {
                return view2.getLeft();
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionVertical(View view2, int i15, int i16) {
                return a.b(i15, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view2));
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int getViewVerticalDragRange(View view2) {
                boolean zCanBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return zCanBeHiddenByDragging ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewDragStateChanged(int i15) {
                if (i15 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewPositionChanged(View view2, int i15, int i16, int i17, int i18) {
                BottomSheetBehavior.this.dispatchOnSlide(i16);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:6:0x0010  */
            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewReleased(View view2, float f14, float f15) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i15 = 6;
                if (f15 < 0.0f) {
                    if (bottomSheetBehavior.fitToContents) {
                        i15 = 3;
                    } else {
                        int top = view2.getTop();
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        boolean zShouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (zShouldSkipHalfExpandedStateWhenDragging) {
                            if (!bottomSheetBehavior2.shouldExpandOnUpwardDrag(jCurrentTimeMillis, (top * 100.0f) / bottomSheetBehavior2.parentHeight)) {
                                i15 = 4;
                            }
                        } else if (top <= bottomSheetBehavior2.halfExpandedOffset) {
                        }
                        i15 = 3;
                    }
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view2, f15)) {
                    if ((Math.abs(f14) < Math.abs(f15) && f15 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view2)) {
                        i15 = 5;
                    } else if (BottomSheetBehavior.this.fitToContents || Math.abs(view2.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view2.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                        i15 = 3;
                    }
                } else if (f15 == 0.0f || Math.abs(f14) > Math.abs(f15)) {
                    int top2 = view2.getTop();
                    boolean z14 = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z14) {
                        int i16 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i16) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                i15 = 3;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i15 = 4;
                            }
                        } else if (Math.abs(top2 - i16) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i15 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior3.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                        i15 = 3;
                    } else {
                        i15 = 4;
                    }
                } else if (BottomSheetBehavior.this.fitToContents) {
                    i15 = 4;
                } else {
                    int top3 = view2.getTop();
                    if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset) || BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                        i15 = 4;
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view2, i15, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public boolean tryCaptureView(View view2, int i15) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i16 = bottomSheetBehavior.state;
                if (i16 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i16 == 3 && bottomSheetBehavior.activePointerId == i15) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view3 = weakReference != null ? weakReference.get() : null;
                    if (view3 != null && view3.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view2;
            }
        };
    }
}
