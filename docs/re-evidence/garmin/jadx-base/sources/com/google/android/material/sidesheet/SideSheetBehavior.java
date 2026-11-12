package com.google.android.material.sidesheet;

import a73.m;
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
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.media3.exoplayer.d;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import l7.f;
import l7.h;
import org.apache.commons.lang3.e;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;
    private int coplanarSiblingViewId;
    private WeakReference<View> coplanarSiblingViewRef;
    private final androidx.customview.widget.c.AbstractC0092c dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    private VelocityTracker velocityTracker;
    private androidx.customview.widget.c viewDragHelper;
    private WeakReference<V> viewRef;

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f53246a.lambda$new$0();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        public StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.h()) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        public void continueSettlingToState(int i14) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i14;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            View view2 = (View) SideSheetBehavior.this.viewRef.get();
            Runnable runnable = this.continueSettlingRunnable;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.postOnAnimation(runnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new androidx.customview.widget.c.AbstractC0092c() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionHorizontal(View view2, int i14, int i15) {
                return g7.a.b(i14, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionVertical(View view2, int i14, int i15) {
                return view2.getTop();
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int getViewHorizontalDragRange(View view2) {
                return SideSheetBehavior.this.getInnerMargin() + SideSheetBehavior.this.childWidth;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewDragStateChanged(int i14) {
                if (i14 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view2.getLeft(), view2.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view2, i14);
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewReleased(View view2, float f14, float f15) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view2, f14, f15);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view2, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public boolean tryCaptureView(View view2, int i14) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view2) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        int i14 = R.styleable.SideSheetBehavior_Layout_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i14);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        int i15 = R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(i15, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int calculateCurrentOffset(int i14, V v14) {
        int i15 = this.state;
        if (i15 == 1 || i15 == 2) {
            return i14 - this.sheetDelegate.getOuterEdge(v14);
        }
        if (i15 == 3) {
            return 0;
        }
        if (i15 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        e.i(this.state, "Unexpected value: ");
        return 0;
    }

    private float calculateDragDistance(float f14, float f15) {
        return Math.abs(f14 - f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(View view2, float f14, float f15) {
        if (isExpandingOutwards(f14)) {
            return 3;
        }
        if (shouldHide(view2, f14)) {
            return (this.sheetDelegate.isSwipeSignificant(f14, f15) || this.sheetDelegate.isReleasedCloseToInnerEdge(view2)) ? 5 : 3;
        }
        if (f14 != 0.0f && SheetUtils.isSwipeMostlyHorizontal(f14, f15)) {
            return 5;
        }
        int left = view2.getLeft();
        return Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset()) ? 3 : 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private h createAccessibilityViewCommandForState(int i14) {
        return new m(this, i14, 3);
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(View view2, int i14) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i14);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view2, fCalculateSlideOffset);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view2) {
        if (s0.f(view2) == null) {
            s0.s(view2, view2.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    public static <V extends View> SideSheetBehavior<V> from(V v14) {
        ViewGroup.LayoutParams layoutParams = v14.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            vb.h.s("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f6350a;
        if (cVar instanceof SideSheetBehavior) {
            return (SideSheetBehavior) cVar;
        }
        vb.h.s("The view is not associated with SideSheetBehavior");
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

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53242a.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f getViewLayoutParams() {
        V v14;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v14 = weakReference.get()) == null || !(v14.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v14.getLayoutParams();
    }

    private boolean hasLeftMargin() {
        CoordinatorLayout.f viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private boolean hasRightMargin() {
        CoordinatorLayout.f viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean isDraggedFarEnough(MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.f6631b);
    }

    private boolean isExpandingOutwards(float f14) {
        return this.sheetDelegate.isExpandingOutwards(f14);
    }

    private boolean isLayingOut(V v14) {
        ViewParent parent = v14.getParent();
        if (parent == null || !parent.isLayoutRequested()) {
            return false;
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return v14.isAttachedToWindow();
    }

    private boolean isSettling(View view2, int i14, boolean z14) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i14);
        androidx.customview.widget.c viewDragHelper = getViewDragHelper();
        if (viewDragHelper == null) {
            return false;
        }
        if (z14) {
            return viewDragHelper.s(outerEdgeOffsetForState, view2.getTop());
        }
        return viewDragHelper.u(view2, outerEdgeOffsetForState, view2.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i14, View view2, h.a aVar) {
        setState(i14);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i14, View view2, ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i14, 0, valueAnimator.getAnimatedFraction()));
        view2.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i14) {
        V v14 = this.viewRef.get();
        if (v14 != null) {
            startSettling(v14, i14, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(CoordinatorLayout coordinatorLayout) {
        int i14;
        View viewFindViewById;
        if (this.coplanarSiblingViewRef != null || (i14 = this.coplanarSiblingViewId) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i14)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
    }

    private void replaceAccessibilityActionForState(V v14, f.a aVar, int i14) {
        s0.p(v14, aVar, null, createAccessibilityViewCommandForState(i14));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(V v14, Runnable runnable) {
        if (isLayingOut(v14)) {
            v14.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(int i14) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i14) {
            if (i14 == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i14 != 1) {
                vb.h.s(e0.f(i14, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                return;
            }
            this.sheetDelegate = new LeftSheetDelegate(this);
            if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                return;
            }
            ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
            builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
            updateMaterialShapeDrawable(builder2.build());
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private boolean shouldInterceptTouchEvent(V v14) {
        return (v14.isShown() || s0.f(v14) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view2, int i14, boolean z14) {
        if (!isSettling(view2, i14, z14)) {
            setStateInternal(i14);
        } else {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i14);
        }
    }

    private void updateAccessibilityActions() {
        V v14;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v14 = weakReference.get()) == null) {
            return;
        }
        s0.o(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, v14);
        s0.j(0, v14);
        s0.o(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, v14);
        s0.j(0, v14);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v14, f.a.f110575n, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v14, f.a.f110573l, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v14 = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((v14.getScaleX() * this.childWidth) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(View view2) {
        int i14 = this.state == 5 ? 4 : 0;
        if (view2.getVisibility() != i14) {
            view2.setVisibility(i14);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return HIDE_THRESHOLD;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int i14) {
        if (i14 == 3) {
            return getExpandedOffset();
        }
        if (i14 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        vb.h.s(j.h(i14, "Invalid state to get outer edge offset: "));
        return 0;
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    public androidx.customview.widget.c getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        b.c cVarOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (cVarOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(cVarOnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v14, MotionEvent motionEvent) {
        androidx.customview.widget.c cVar;
        if (!shouldInterceptTouchEvent(v14)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (cVar = this.viewDragHelper) == null || !cVar.t(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v14, int i14) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (coordinatorLayout.getFitsSystemWindows() && !v14.getFitsSystemWindows()) {
            v14.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v14);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v14);
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
            updateSheetVisibility(v14);
            updateAccessibilityActions();
            if (v14.getImportantForAccessibility() == 0) {
                v14.setImportantForAccessibility(1);
            }
            ensureAccessibilityPaneTitleIsSet(v14);
        }
        setSheetEdge(v14, i14);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = androidx.customview.widget.c.j(coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v14);
        coordinatorLayout.onLayoutChild(v14, i14);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v14.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v14.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        v14.offsetLeftAndRight(calculateCurrentOffset(outerEdge, v14));
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v14);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v14, int i14, int i15, int i16, int i17) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v14.getLayoutParams();
        v14.measure(getChildMeasureSpec(i14, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i15, -1, marginLayoutParams.width), getChildMeasureSpec(i16, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i17, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v14, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v14, savedState.getSuperState());
        }
        int i14 = savedState.state;
        if (i14 == 1 || i14 == 2) {
            i14 = 5;
        }
        this.state = i14;
        this.lastStableState = i14;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v14) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v14), (SideSheetBehavior<?>) this);
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
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v14);
        }
        return !this.ignoreEvents;
    }

    public void setCoplanarSiblingView(View view2) {
        this.coplanarSiblingViewId = -1;
        if (view2 == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view2);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v14 = weakReference.get();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (v14.isLaidOut()) {
                v14.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(int i14) {
        this.coplanarSiblingViewId = i14;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v14 = weakReference.get();
            if (i14 != -1) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (v14.isLaidOut()) {
                    v14.requestLayout();
                }
            }
        }
    }

    public void setDraggable(boolean z14) {
        this.draggable = z14;
    }

    public void setHideFriction(float f14) {
        this.hideFriction = f14;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(int i14) {
        if (i14 == 1 || i14 == 2) {
            throw new IllegalArgumentException(j.o(i14 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.", new StringBuilder("STATE_")));
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i14);
        } else {
            runAfterLayout(this.viewRef.get(), new d(this, i14, 3));
        }
    }

    public void setStateInternal(int i14) {
        V v14;
        if (this.state == i14) {
            return;
        }
        this.state = i14;
        if (i14 == 3 || i14 == 5) {
            this.lastStableState = i14;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v14 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v14);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v14, i14);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(View view2, float f14) {
        return this.sheetDelegate.shouldHide(view2, f14);
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(b.c cVar) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(cVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(b.c cVar) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(cVar, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    public static class SavedState extends s7.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
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
        final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // s7.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i14) {
            super.writeToParcel(parcel, i14);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    private void setSheetEdge(V v14, int i14) {
        setSheetEdge(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v14.getLayoutParams()).f6352c, i14) == 3 ? 1 : 0);
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = 0.1f;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new androidx.customview.widget.c.AbstractC0092c() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionHorizontal(View view2, int i14, int i15) {
                return g7.a.b(i14, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int clampViewPositionVertical(View view2, int i14, int i15) {
                return view2.getTop();
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public int getViewHorizontalDragRange(View view2) {
                return SideSheetBehavior.this.getInnerMargin() + SideSheetBehavior.this.childWidth;
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewDragStateChanged(int i14) {
                if (i14 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewPositionChanged(View view2, int i14, int i15, int i16, int i17) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view2.getLeft(), view2.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view2, i14);
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public void onViewReleased(View view2, float f14, float f15) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view2, f14, f15);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view2, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.c.AbstractC0092c
            public boolean tryCaptureView(View view2, int i14) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view2) ? false : true;
            }
        };
    }
}
