package com.xiaomi.fitness.sport.view.route;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002GHB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u00104\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020-H\u0002J\u0010\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020-H\u0002J \u0010?\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u0011H\u0016J\u0006\u0010A\u001a\u00020;J\u0010\u0010B\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J\u0006\u0010C\u001a\u00020;J\u0006\u0010D\u001a\u00020;J\u0006\u0010E\u001a\u00020;J\u0006\u0010F\u001a\u00020;R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u000e\u0010*\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "createRouteActivity", "Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "getCreateRouteActivity", "()Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;", "setCreateRouteActivity", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteActivity;)V", "midContentView", "maxMidContentViewHeight", "", "minMidContentViewHeight", "getMinMidContentViewHeight", "()I", "setMinMidContentViewHeight", "(I)V", "halfExpandedHeight", "getHalfExpandedHeight", "setHalfExpandedHeight", "currentState", "value", "state", "getState", "setState", "isHideable", "", "()Z", "setHideable", "(Z)V", "draggable", "getDraggable", "setDraggable", "movingLock", "getMovingLock", "setMovingLock", "isDragging", "movingCounts", "currentPosY", "", "currentMidHeight", "activePointerId", "velocityTracker", "Landroid/view/VelocityTracker;", "scroller", "Landroid/widget/OverScroller;", "onTouchEvent", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "event", "Landroid/view/MotionEvent;", "adjustMidContentHeight", "", "dy", "applyFlingAcceleration", "yVelocity", "onLayoutChild", "layoutDirection", "reMeasureMidContent", "applyState", "expand", "collapse", "halfExpand", "hide", "Companion", "FlingRunnable", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateRouteMidCompressionBottomSheetBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRouteMidCompressionBottomSheetBehavior.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,323:1\n65#2,4:324\n37#2:328\n53#2:329\n72#2:330\n*S KotlinDebug\n*F\n+ 1 CreateRouteMidCompressionBottomSheetBehavior.kt\ncom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior\n*L\n207#1:324,4\n207#1:328\n207#1:329\n207#1:330\n*E\n"})
public final class CreateRouteMidCompressionBottomSheetBehavior extends CoordinatorLayout.Behavior<View> {
    public static final int STATE_COLLAPSED = 1;
    public static final int STATE_EXPANDED = 0;
    public static final int STATE_HALF_EXPANDED = 2;
    public static final int STATE_HIDDEN = 3;

    @NotNull
    public static final String TAG = "CreateRouteMidCompressionBottomSheetBehavior";
    private int activePointerId;

    @Nullable
    private CreateRouteActivity createRouteActivity;
    private float currentMidHeight;
    private float currentPosY;
    private int currentState;
    private boolean draggable;
    private int halfExpandedHeight;
    private boolean isDragging;
    private boolean isHideable;
    private int maxMidContentViewHeight;

    @Nullable
    private View midContentView;
    private int minMidContentViewHeight;
    private int movingCounts;
    private boolean movingLock;

    @NotNull
    private final OverScroller scroller;

    @Nullable
    private VelocityTracker velocityTracker;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior$FlingRunnable;", "Ljava/lang/Runnable;", "midView", "Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/sport/view/route/CreateRouteMidCompressionBottomSheetBehavior;Landroid/view/View;)V", "run", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class FlingRunnable implements Runnable {

        @NotNull
        private final View midView;
        final /* synthetic */ CreateRouteMidCompressionBottomSheetBehavior this$0;

        public FlingRunnable(@NotNull CreateRouteMidCompressionBottomSheetBehavior createRouteMidCompressionBottomSheetBehavior, View midView) {
            Intrinsics.checkNotNullParameter(midView, "midView");
            this.this$0 = createRouteMidCompressionBottomSheetBehavior;
            this.midView = midView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.this$0.scroller.computeScrollOffset() || this.this$0.isDragging || this.this$0.getMovingLock()) {
                this.this$0.movingCounts--;
            } else {
                CreateRouteMidCompressionBottomSheetBehavior createRouteMidCompressionBottomSheetBehavior = this.this$0;
                createRouteMidCompressionBottomSheetBehavior.currentMidHeight = createRouteMidCompressionBottomSheetBehavior.scroller.getCurrY();
                ViewExtKt.setHeight(this.midView, this.this$0.scroller.getCurrY());
                androidx.core.view.c.i0(this.midView, this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteMidCompressionBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.minMidContentViewHeight = ExtUtilsKt.getDp(0);
        this.halfExpandedHeight = ExtUtilsKt.getDp(60);
        this.draggable = true;
        this.activePointerId = -1;
        this.scroller = new OverScroller(context, AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in));
    }

    private final void adjustMidContentHeight(float dy) {
        View view;
        if (this.movingLock || (view = this.midContentView) == null) {
            return;
        }
        float fCoerceIn = RangesKt___RangesKt.coerceIn(this.currentMidHeight + dy, this.minMidContentViewHeight, this.maxMidContentViewHeight);
        this.currentMidHeight = fCoerceIn;
        ViewExtKt.setHeight(view, (int) fCoerceIn);
    }

    private final void applyFlingAcceleration(float yVelocity) {
        View view = this.midContentView;
        if (view == null || Math.abs(yVelocity) < 40.0f) {
            return;
        }
        this.scroller.fling(0, (int) this.currentMidHeight, 0, (int) (-yVelocity), 0, 0, this.minMidContentViewHeight, this.maxMidContentViewHeight);
        this.movingCounts++;
        androidx.core.view.c.i0(view, new FlingRunnable(this, view));
    }

    private final void applyState(int state) {
        View view = this.midContentView;
        if (view != null) {
            if (state == 0) {
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.maxMidContentViewHeight;
                view.setLayoutParams(layoutParams);
                return;
            }
            if (state == 1) {
                view.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = this.minMidContentViewHeight;
                view.setLayoutParams(layoutParams2);
                return;
            }
            if (state != 2) {
                if (state == 3 && this.isHideable) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams3.height = this.halfExpandedHeight;
            view.setLayoutParams(layoutParams3);
        }
    }

    public final void collapse() {
        setState(1);
    }

    public final void expand() {
        setState(0);
    }

    @Nullable
    public final CreateRouteActivity getCreateRouteActivity() {
        return this.createRouteActivity;
    }

    public final boolean getDraggable() {
        return this.draggable;
    }

    public final int getHalfExpandedHeight() {
        return this.halfExpandedHeight;
    }

    public final int getMinMidContentViewHeight() {
        return this.minMidContentViewHeight;
    }

    public final boolean getMovingLock() {
        return this.movingLock;
    }

    /* JADX INFO: renamed from: getState, reason: from getter */
    public final int getCurrentState() {
        return this.currentState;
    }

    public final void halfExpand() {
        setState(2);
    }

    public final void hide() {
        setState(3);
    }

    /* JADX INFO: renamed from: isHideable, reason: from getter */
    public final boolean getIsHideable() {
        return this.isHideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull View child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean zOnLayoutChild = super.onLayoutChild(parent, child, layoutDirection);
        View view = this.midContentView;
        if (view != null && view.isAttachedToWindow()) {
            return zOnLayoutChild;
        }
        View viewFindViewById = child.findViewById(xri.I3);
        if (!Intrinsics.areEqual(viewFindViewById, this.midContentView)) {
            this.midContentView = viewFindViewById;
            reMeasureMidContent();
            View view2 = this.midContentView;
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteMidCompressionBottomSheetBehavior.onLayoutChild.1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        if (bottom - top == oldBottom - oldTop || CreateRouteMidCompressionBottomSheetBehavior.this.isDragging || CreateRouteMidCompressionBottomSheetBehavior.this.movingCounts > 0) {
                            return;
                        }
                        CreateRouteMidCompressionBottomSheetBehavior.this.reMeasureMidContent();
                    }
                });
            }
        }
        return zOnLayoutChild;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull MotionEvent event) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        float yVelocity;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (child.getId() != xri.I || !child.isShown() || !this.draggable) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isDragging = true;
            if (this.movingLock) {
                return true;
            }
            this.currentPosY = event.getY();
            View view = this.midContentView;
            this.currentMidHeight = view != null ? view.getHeight() : 0.0f;
            this.activePointerId = event.getPointerId(0);
            this.velocityTracker = VelocityTracker.obtain();
        } else if (actionMasked == 1) {
            velocityTracker = this.velocityTracker;
            if (velocityTracker == null) {
                return false;
            }
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = velocityTracker.getYVelocity();
                if (event.findPointerIndex(this.activePointerId) == -1) {
                    return false;
                }
                applyFlingAcceleration(yVelocity);
            }
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.velocityTracker = null;
            this.activePointerId = -1;
            this.isDragging = false;
        } else if (actionMasked == 2) {
            this.isDragging = true;
            if (this.movingLock) {
                return true;
            }
            int iFindPointerIndex = event.findPointerIndex(this.activePointerId);
            if (iFindPointerIndex == -1) {
                return false;
            }
            float y = event.getY(iFindPointerIndex);
            float f = this.currentPosY - y;
            this.currentPosY = y;
            adjustMidContentHeight(f);
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(event);
            }
        } else if (actionMasked == 3) {
            velocityTracker = this.velocityTracker;
            if (velocityTracker == null) {
                return false;
            }
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = velocityTracker.getYVelocity();
                if (event.findPointerIndex(this.activePointerId) == -1) {
                    return false;
                }
                applyFlingAcceleration(yVelocity);
            }
            velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.velocityTracker = null;
            this.activePointerId = -1;
            this.isDragging = false;
        }
        return true;
    }

    public final void reMeasureMidContent() {
        View view = this.midContentView;
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.xiaomi.fitness.sport.view.route.CreateRouteMidCompressionBottomSheetBehavior$reMeasureMidContent$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        if (this.this$0.isDragging || this.this$0.movingCounts > 0) {
                            return;
                        }
                        this.this$0.setMovingLock(true);
                        int height = view2.getHeight();
                        int width = view2.getWidth();
                        view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                        this.this$0.maxMidContentViewHeight = RangesKt___RangesKt.coerceAtLeast(view2.getMeasuredHeight(), this.this$0.getMinMidContentViewHeight());
                        view2.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                        this.this$0.setMovingLock(false);
                    }
                });
                return;
            }
            if (this.isDragging || this.movingCounts > 0) {
                return;
            }
            setMovingLock(true);
            int height = view.getHeight();
            int width = view.getWidth();
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.maxMidContentViewHeight = RangesKt___RangesKt.coerceAtLeast(view.getMeasuredHeight(), getMinMidContentViewHeight());
            view.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            setMovingLock(false);
        }
    }

    public final void setCreateRouteActivity(@Nullable CreateRouteActivity createRouteActivity) {
        this.createRouteActivity = createRouteActivity;
    }

    public final void setDraggable(boolean z) {
        this.draggable = z;
    }

    public final void setHalfExpandedHeight(int i) {
        this.halfExpandedHeight = i;
    }

    public final void setHideable(boolean z) {
        this.isHideable = z;
    }

    public final void setMinMidContentViewHeight(int i) {
        this.minMidContentViewHeight = i;
    }

    public final void setMovingLock(boolean z) {
        this.movingLock = z;
    }

    public final void setState(int i) {
        if (i == this.currentState) {
            return;
        }
        this.currentState = i;
        applyState(i);
    }
}
