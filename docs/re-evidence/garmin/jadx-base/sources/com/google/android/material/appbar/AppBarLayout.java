package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.e1;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import androidx.core.view.u;
import androidx.core.view.z;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import l7.f;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int DEF_STYLE_RES = R.style.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private final boolean hasLiftOnScrollColor;
    private boolean haveChildWithInterpolator;
    private m1 lastInsets;
    private boolean liftOnScroll;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<LiftOnScrollListener> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void onOffsetChanged(T t7, int i14);
    }

    public static abstract class ChildScrollEffect {
        public abstract void onOffsetChanged(AppBarLayout appBarLayout, View view2, float f14);
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {
        private static final float COMPRESS_DISTANCE_FACTOR = 0.3f;
        private final Rect relativeRect = new Rect();
        private final Rect ghostRect = new Rect();

        private static void updateRelativeRect(Rect rect, AppBarLayout appBarLayout, View view2) {
            view2.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view2, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ChildScrollEffect
        public void onOffsetChanged(AppBarLayout appBarLayout, View view2, float f14) {
            updateRelativeRect(this.relativeRect, appBarLayout, view2);
            float fAbs = this.relativeRect.top - Math.abs(f14);
            if (fAbs > 0.0f) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.setClipBounds(null);
                view2.setTranslationY(0.0f);
                view2.setVisibility(0);
                return;
            }
            float fA = 1.0f - g7.a.a(Math.abs(fAbs / this.relativeRect.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.relativeRect.height() * COMPRESS_DISTANCE_FACTOR) * (1.0f - (fA * fA)));
            view2.setTranslationY(fHeight);
            view2.getDrawingRect(this.ghostRect);
            this.ghostRect.offset(0, (int) (-fHeight));
            if (fHeight >= this.ghostRect.height()) {
                view2.setVisibility(4);
            } else {
                view2.setVisibility(0);
            }
            Rect rect = this.ghostRect;
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            view2.setClipBounds(rect);
        }
    }

    public interface LiftOnScrollListener {
        void onUpdate(float f14, int i14);
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(AppBarLayout appBarLayout, int i14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i14) {
        int i15 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i15), attributeSet, i14);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(this);
        }
        ViewUtilsLollipop.setStateListAnimatorFromAttrs(this, attributeSet, i14, i15);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.AppBarLayout, i14, i15, new int[0]);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_android_background);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setBackground(drawable);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.AppBarLayout_liftOnScrollColor);
        this.hasLiftOnScrollColor = colorStateList != null;
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(getBackground());
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            if (colorStateList != null) {
                initializeLiftOnScrollWithColor(materialShapeDrawable, colorStateListOrNull, colorStateList);
            } else {
                initializeLiftOnScrollWithElevation(context2, materialShapeDrawable);
            }
        }
        this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        int i16 = R.styleable.AppBarLayout_expanded;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setExpanded(typedArrayObtainStyledAttributes.getBoolean(i16, false), false, false);
        }
        int i17 = R.styleable.AppBarLayout_elevation;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i17, 0));
        }
        int i18 = R.styleable.AppBarLayout_android_keyboardNavigationCluster;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setKeyboardNavigationCluster(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = R.styleable.AppBarLayout_android_touchscreenBlocksFocus;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setTouchscreenBlocksFocus(typedArrayObtainStyledAttributes.getBoolean(i19, false));
        }
        this.appBarElevation = getResources().getDimension(R.dimen.design_appbar_elevation);
        this.liftOnScroll = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppBarLayout_liftOnScroll, false);
        this.liftOnScrollTargetViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.AppBarLayout_statusBarForeground));
        typedArrayObtainStyledAttributes.recycle();
        s0.d.c(this, new z() { // from class: com.google.android.material.appbar.AppBarLayout.1
            @Override // androidx.core.view.z
            public m1 onApplyWindowInsets(View view2, m1 m1Var) {
                return AppBarLayout.this.onWindowInsetChanged(m1Var);
            }
        });
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(drawable);
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    private View findLiftOnScrollTargetView(View view2) {
        int i14;
        if (this.liftOnScrollTargetView == null && (i14 = this.liftOnScrollTargetViewId) != -1) {
            View viewFindViewById = view2 != null ? view2.findViewById(i14) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (viewFindViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (((LayoutParams) getChildAt(i14).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(final MaterialShapeDrawable materialShapeDrawable, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53160a.lambda$initializeLiftOnScrollWithColor$0(colorStateList, colorStateList2, materialShapeDrawable, colorOrNull, valueAnimator);
            }
        };
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setBackground(materialShapeDrawable);
    }

    private void initializeLiftOnScrollWithElevation(Context context, MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new e1(1, this, materialShapeDrawable);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setBackground(materialShapeDrawable);
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState savedStateSaveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(s7.a.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (savedStateSaveScrollState != null) {
            this.behavior.restoreScrollState(savedStateSaveScrollState, false);
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, ColorStateList colorStateList2, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iLayer = MaterialColors.layer(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iLayer));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            this.statusBarForeground.setTint(iLayer);
        }
        if (this.liftOnScrollListeners.isEmpty()) {
            return;
        }
        for (LiftOnScrollListener liftOnScrollListener : this.liftOnScrollListeners) {
            if (materialShapeDrawable.getFillColor() != null) {
                liftOnScrollListener.onUpdate(0.0f, iLayer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(fFloatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(fFloatValue);
        }
        Iterator<LiftOnScrollListener> it = this.liftOnScrollListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(fFloatValue, materialShapeDrawable.getResolvedTintColor());
        }
    }

    private void setExpanded(boolean z14, boolean z15, boolean z16) {
        this.pendingAction = (z14 ? 1 : 2) | (z15 ? 4 : 0) | (z16 ? 8 : 0);
        requestLayout();
    }

    private boolean setLiftableState(boolean z14) {
        if (this.liftable == z14) {
            return false;
        }
        this.liftable = z14;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                if (!childAt.getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startLiftOnScrollColorAnimation(float f14, float f15) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f14, f15);
        this.liftOnScrollColorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    public void addLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        this.liftOnScrollListeners.add(liftOnScrollListener);
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (baseOnOffsetChangedListener == null || this.listeners.contains(baseOnOffsetChangedListener)) {
            return;
        }
        this.listeners.add(baseOnOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i14 = this.downPreScrollRange;
        if (i14 != -1) {
            return i14;
        }
        int i15 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = layoutParams.scrollFlags;
                if ((i16 & 5) != 5) {
                    if (i15 > 0) {
                        break;
                    }
                } else {
                    int i17 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i16 & 8) != 0) {
                        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i16 & 2) != 0) {
                            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i17 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap<View, g1> weakHashMap3 = s0.f6563a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i15 += iMin;
                    }
                    iMin = minimumHeight + i17;
                    if (childCount == 0) {
                        WeakHashMap<View, g1> weakHashMap4 = s0.f6563a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i15 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i15);
        this.downPreScrollRange = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i14 = this.downScrollRange;
        if (i14 != -1) {
            return i14;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i16 = layoutParams.scrollFlags;
                if ((i16 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i16 & 2) != 0) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.downScrollRange = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        m1 m1Var = this.lastInsets;
        if (m1Var != null) {
            return m1Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i14 = this.totalScrollRange;
        if (i14 != -1) {
            return i14;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = layoutParams.scrollFlags;
                if ((i16 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i15 == 0) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i16 & 2) != 0) {
                    WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.totalScrollRange = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i14) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i14 + iArr.length);
        boolean z14 = this.liftable;
        int i15 = R.attr.state_liftable;
        if (!z14) {
            i15 = -i15;
        }
        iArr[0] = i15;
        iArr[1] = (z14 && this.lifted) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i16 = R.attr.state_collapsible;
        if (!z14) {
            i16 = -i16;
        }
        iArr[2] = i16;
        iArr[3] = (z14 && this.lifted) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        boolean z15 = true;
        if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            if (((LayoutParams) getChildAt(i18).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z15 = false;
        }
        setLiftableState(z15);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int mode = View.MeasureSpec.getMode(i15);
        if (mode != 1073741824) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = g7.a.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i15));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        invalidateScrollRanges();
    }

    public void onOffsetChanged(int i14) {
        this.currentOffset = i14;
        if (!willNotDraw()) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            postInvalidateOnAnimation();
        }
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                BaseOnOffsetChangedListener baseOnOffsetChangedListener = this.listeners.get(i15);
                if (baseOnOffsetChangedListener != null) {
                    baseOnOffsetChangedListener.onOffsetChanged(this, i14);
                }
            }
        }
    }

    public m1 onWindowInsetChanged(m1 m1Var) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        m1 m1Var2 = getFitsSystemWindows() ? m1Var : null;
        if (!Objects.equals(this.lastInsets, m1Var2)) {
            this.lastInsets = m1Var2;
            updateWillNotDraw();
            requestLayout();
        }
        return m1Var;
    }

    public boolean removeLiftOnScrollListener(LiftOnScrollListener liftOnScrollListener) {
        return this.liftOnScrollListeners.remove(liftOnScrollListener);
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseOnOffsetChangedListener) {
        List<BaseOnOffsetChangedListener> list = this.listeners;
        if (list == null || baseOnOffsetChangedListener == null) {
            return;
        }
        list.remove(baseOnOffsetChangedListener);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    public void setElevation(float f14) {
        super.setElevation(f14);
        MaterialShapeUtils.setElevation(this, f14);
    }

    public void setLiftOnScroll(boolean z14) {
        this.liftOnScroll = z14;
    }

    public void setLiftOnScrollTargetView(View view2) {
        this.liftOnScrollTargetViewId = -1;
        if (view2 == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view2);
        }
    }

    public void setLiftOnScrollTargetViewId(int i14) {
        this.liftOnScrollTargetViewId = i14;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z14) {
        this.liftableOverride = true;
        return setLiftableState(z14);
    }

    public void setLiftableOverrideEnabled(boolean z14) {
        this.liftableOverride = z14;
    }

    public boolean setLifted(boolean z14) {
        return setLiftedState(z14, true);
    }

    public boolean setLiftedState(boolean z14, boolean z15) {
        if (!z15 || this.lifted == z14) {
            return false;
        }
        this.lifted = z14;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.hasLiftOnScrollColor) {
            startLiftOnScrollColorAnimation(z14 ? 0.0f : 1.0f, z14 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z14 ? 0.0f : this.appBarElevation, z14 ? this.appBarElevation : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i14) {
        if (i14 == 1) {
            super.setOrientation(i14);
        } else {
            h.s("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                Drawable drawable4 = this.statusBarForeground;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i14) {
        setStatusBarForeground(new ColorDrawable(i14));
    }

    public void setStatusBarForegroundResource(int i14) {
        setStatusBarForeground(j.a.a(getContext(), i14));
    }

    @Deprecated
    public void setTargetElevation(float f14) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f14);
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
        super.setVisibility(i14);
        boolean z14 = i14 == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z14, false);
        }
    }

    public boolean shouldLift(View view2) {
        View viewFindLiftOnScrollTargetView = findLiftOnScrollTargetView(view2);
        if (viewFindLiftOnScrollTargetView != null) {
            view2 = viewFindLiftOnScrollTargetView;
        }
        if (view2 != null) {
            return view2.canScrollVertically(-1) || view2.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private BaseDragCallback onDragCallback;
        private SavedState savedState;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t7);
        }

        public BaseBehavior() {
        }

        private void addAccessibilityDelegateIfNeeded(final CoordinatorLayout coordinatorLayout, final T t7) {
            if (s0.e(coordinatorLayout) != null) {
                return;
            }
            s0.r(coordinatorLayout, new androidx.core.view.a() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
                    View childWithScrollingBehavior;
                    super.onInitializeAccessibilityNodeInfo(view2, fVar);
                    fVar.n(ScrollView.class.getName());
                    if (t7.getTotalScrollRange() == 0 || (childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout)) == null || !BaseBehavior.this.childrenHaveScrollFlags(t7)) {
                        return;
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != (-t7.getTotalScrollRange())) {
                        fVar.b(f.a.f110571j);
                        fVar.s(true);
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        if (!childWithScrollingBehavior.canScrollVertically(-1)) {
                            fVar.b(f.a.f110572k);
                            fVar.s(true);
                        } else if ((-t7.getDownNestedPreScrollRange()) != 0) {
                            fVar.b(f.a.f110572k);
                            fVar.s(true);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // androidx.core.view.a
                public boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
                    if (i14 == 4096) {
                        t7.setExpanded(false);
                        return true;
                    }
                    if (i14 != 8192) {
                        return super.performAccessibilityAction(view2, i14, bundle);
                    }
                    if (BaseBehavior.this.getTopBottomOffsetForScrollingSibling() != 0) {
                        View childWithScrollingBehavior = BaseBehavior.this.getChildWithScrollingBehavior(coordinatorLayout);
                        boolean zCanScrollVertically = childWithScrollingBehavior.canScrollVertically(-1);
                        AppBarLayout appBarLayout = t7;
                        if (!zCanScrollVertically) {
                            appBarLayout.setExpanded(true);
                            return true;
                        }
                        int i15 = -appBarLayout.getDownNestedPreScrollRange();
                        if (i15 != 0) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, t7, childWithScrollingBehavior, 0, i15, new int[]{0, 0}, 1);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t7, int i14, float f14) {
            int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i14);
            float fAbs = Math.abs(f14);
            animateOffsetWithDuration(coordinatorLayout, t7, i14, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t7.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t7, int i14, int i15) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (topBottomOffsetForScrollingSibling == i14) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.offsetAnimator = valueAnimator2;
                valueAnimator2.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t7, ((Integer) valueAnimator3.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i15, MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i14);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i14, int i15, int i16) {
            return i14 < (i15 + i16) / 2 ? i15 : i16;
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t7, View view2) {
            return t7.hasScrollableChildren() && coordinatorLayout.getHeight() - view2.getHeight() <= t7.getHeight();
        }

        private static boolean checkFlag(int i14, int i15) {
            return (i14 & i15) == i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                if (((LayoutParams) appBarLayout.getChildAt(i14).getLayoutParams()).scrollFlags != 0) {
                    return true;
                }
            }
            return false;
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = coordinatorLayout.getChildAt(i14);
                if ((childAt instanceof u) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i14) {
            int iAbs = Math.abs(i14);
            int childCount = appBarLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = appBarLayout.getChildAt(i15);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(T t7, int i14) {
            int childCount = t7.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = t7.getChildAt(i15);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.getScrollFlags(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i16 = -i14;
                if (top <= i16 && bottom >= i16) {
                    return i15;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = coordinatorLayout.getChildAt(i14);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f6350a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(T t7, int i14) {
            int iAbs = Math.abs(i14);
            int childCount = t7.getChildCount();
            int topInset = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = t7.getChildAt(i15);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (scrollInterpolator == null) {
                        break;
                    }
                    int scrollFlags = layoutParams.getScrollFlags();
                    if ((scrollFlags & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((scrollFlags & 2) != 0) {
                            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= t7.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f14 = topInset;
                    return (childAt.getTop() + Math.round(scrollInterpolator.getInterpolation((iAbs - childAt.getTop()) / f14) * f14)) * Integer.signum(i14);
                }
            }
            return i14;
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t7) {
            List<View> dependents = coordinatorLayout.getDependents(t7);
            int size = dependents.size();
            for (int i14 = 0; i14 < size; i14++) {
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) dependents.get(i14).getLayoutParams()).f6350a;
                if (cVar instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVar).getOverlayTop() != 0;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t7) {
            int paddingTop = t7.getPaddingTop() + t7.getTopInset();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - paddingTop;
            int childIndexOnOffset = getChildIndexOnOffset(t7, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t7.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int scrollFlags = layoutParams.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int topInset = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (childIndexOnOffset == 0) {
                        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                        if (t7.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                            topInset -= t7.getTopInset();
                        }
                    }
                    if (checkFlag(scrollFlags, 2)) {
                        WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (checkFlag(scrollFlags, 5)) {
                        WeakHashMap<View, g1> weakHashMap3 = s0.f6563a;
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (topBottomOffsetForScrollingSibling < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (checkFlag(scrollFlags, 32)) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t7, g7.a.b(calculateSnapOffset(topBottomOffsetForScrollingSibling, minimumHeight, topInset) + paddingTop, -t7.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t7, int i14, int i15, boolean z14) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t7, i14);
            boolean zShouldLift = false;
            if (appBarChildOnOffset != null) {
                int scrollFlags = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    int minimumHeight = appBarChildOnOffset.getMinimumHeight();
                    if (i15 <= 0 || (scrollFlags & 12) == 0 ? !((scrollFlags & 2) == 0 || (-i14) < (appBarChildOnOffset.getBottom() - minimumHeight) - t7.getTopInset()) : (-i14) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t7.getTopInset()) {
                        zShouldLift = true;
                    }
                }
            }
            if (t7.isLiftOnScroll()) {
                zShouldLift = t7.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = t7.setLiftedState(zShouldLift);
            if (z14 || (liftedState && shouldJumpElevationState(coordinatorLayout, t7))) {
                if (t7.getBackground() != null) {
                    t7.getBackground().jumpToCurrentState();
                }
                if (t7.getForeground() != null) {
                    t7.getForeground().jumpToCurrentState();
                }
                if (t7.getStateListAnimator() != null) {
                    t7.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(T t7) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t7);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getMaxDragOffset(T t7) {
            return t7.getTopInset() + (-t7.getDownNestedScrollRange());
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public void onFlingFinished(CoordinatorLayout coordinatorLayout, T t7) {
            snapToChildIfNeeded(coordinatorLayout, t7);
            if (t7.isLiftOnScroll()) {
                t7.setLiftedState(t7.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t7, int i14) {
            int iRound;
            boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, t7, i14);
            int pendingAction = t7.getPendingAction();
            SavedState savedState = this.savedState;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z14 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i15 = -t7.getUpNestedPreScrollRange();
                        if (z14) {
                            animateOffsetTo(coordinatorLayout, t7, i15, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t7, i15);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z14) {
                            animateOffsetTo(coordinatorLayout, t7, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t7, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, t7, -t7.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, t7, 0);
            } else {
                View childAt = t7.getChildAt(savedState.firstVisibleChildIndex);
                int i16 = -childAt.getBottom();
                if (this.savedState.firstVisibleChildAtMinimumHeight) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    iRound = t7.getTopInset() + childAt.getMinimumHeight() + i16;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown) + i16;
                }
                setHeaderTopBottomOffset(coordinatorLayout, t7, iRound);
            }
            t7.resetPendingAction();
            this.savedState = null;
            setTopAndBottomOffset(g7.a.b(getTopAndBottomOffset(), -t7.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t7, getTopAndBottomOffset(), 0, true);
            t7.onOffsetChanged(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t7);
            return zOnLayoutChild;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t7, int i14, int i15, int i16, int i17) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t7.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t7, i14, i15, i16, i17);
            }
            coordinatorLayout.onMeasureChild(t7, i14, i15, View.MeasureSpec.makeMeasureSpec(0, 0), i17);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t7, View view2, int i14, int i15, int[] iArr, int i16) {
            T t14;
            int i17;
            int downNestedPreScrollRange;
            if (i15 == 0) {
                t14 = t7;
            } else {
                if (i15 < 0) {
                    i17 = -t7.getTotalScrollRange();
                    downNestedPreScrollRange = t7.getDownNestedPreScrollRange() + i17;
                } else {
                    i17 = -t7.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i18 = i17;
                int i19 = downNestedPreScrollRange;
                if (i18 != i19) {
                    t14 = t7;
                    iArr[1] = scroll(coordinatorLayout, t14, i15, i18, i19);
                } else {
                    t14 = t7;
                }
            }
            if (t14.isLiftOnScroll()) {
                t14.setLiftedState(t14.shouldLift(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t7, View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t14;
            int i19;
            if (i17 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t14 = t7;
                i19 = i17;
                iArr[1] = scroll(coordinatorLayout2, t14, i19, -t7.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t14 = t7;
                i19 = i17;
            }
            if (i19 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout2, t14);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t7, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                restoreScrollState((SavedState) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, t7, this.savedState.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, t7, parcelable);
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t7) {
            Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t7);
            SavedState savedStateSaveScrollState = saveScrollState(parcelableOnSaveInstanceState, t7);
            return savedStateSaveScrollState == null ? parcelableOnSaveInstanceState : savedStateSaveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t7, View view2, View view3, int i14, int i15) {
            ValueAnimator valueAnimator;
            boolean z14 = (i14 & 2) != 0 && (t7.isLiftOnScroll() || canScrollChildren(coordinatorLayout, t7, view2));
            if (z14 && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i15;
            return z14;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t7, View view2, int i14) {
            if (this.lastStartedType == 0 || i14 == 1) {
                snapToChildIfNeeded(coordinatorLayout, t7);
                if (t7.isLiftOnScroll()) {
                    t7.setLiftedState(t7.shouldLift(view2));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view2);
        }

        public void restoreScrollState(SavedState savedState, boolean z14) {
            if (this.savedState == null || z14) {
                this.savedState = savedState;
            }
        }

        public SavedState saveScrollState(Parcelable parcelable, T t7) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t7.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = t7.getChildAt(i14);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = s7.a.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z14 = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z14;
                    savedState.fullyScrolled = !z14 && (-topAndBottomOffset) >= t7.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i14;
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == t7.getTopInset() + childAt.getMinimumHeight();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t7, int i14, int i15, int i16) {
            CoordinatorLayout coordinatorLayout2;
            T t14;
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i17 = 0;
            if (i15 == 0 || topBottomOffsetForScrollingSibling < i15 || topBottomOffsetForScrollingSibling > i16) {
                coordinatorLayout2 = coordinatorLayout;
                t14 = t7;
                this.offsetDelta = 0;
            } else {
                int iB = g7.a.b(i14, i15, i16);
                if (topBottomOffsetForScrollingSibling != iB) {
                    int iInterpolateOffset = t7.hasChildWithInterpolator() ? interpolateOffset(t7, iB) : iB;
                    boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                    int i18 = topBottomOffsetForScrollingSibling - iB;
                    this.offsetDelta = iB - iInterpolateOffset;
                    if (topAndBottomOffset) {
                        while (i17 < t7.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t7.getChildAt(i17).getLayoutParams();
                            ChildScrollEffect scrollEffect = layoutParams.getScrollEffect();
                            if (scrollEffect != null && (layoutParams.getScrollFlags() & 1) != 0) {
                                scrollEffect.onOffsetChanged(t7, t7.getChildAt(i17), getTopAndBottomOffset());
                            }
                            i17++;
                        }
                    }
                    if (!topAndBottomOffset && t7.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t7);
                    }
                    t7.onOffsetChanged(getTopAndBottomOffset());
                    coordinatorLayout2 = coordinatorLayout;
                    t14 = t7;
                    updateAppBarLayoutDrawableState(coordinatorLayout2, t14, iB, iB < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i17 = i18;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t14 = t7;
                }
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout2, t14);
            return i17;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getScrollRangeForDragFling(T t7) {
            return t7.getTotalScrollRange();
        }

        public static class SavedState extends s7.a {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
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
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // s7.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i14) {
                super.writeToParcel(parcel, i14);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view2, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i14) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i14);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i14, int i15, int i16, int i17) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i14, i15, i16, i17);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, int i14, int i15, int[] iArr, int i16) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view2, i14, i15, iArr, i16);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, int i14, int i15, int i16, int i17, int i18, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view2, i14, i15, i16, i17, i18, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, View view3, int i14, int i15) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view2, view3, i14, i15);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view2, int i14) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view2, i14);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view2, MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view2, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z14) {
            super.setHorizontalOffsetEnabled(z14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i14) {
            return super.setLeftAndRightOffset(i14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i14) {
            return super.setTopAndBottomOffset(i14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z14) {
            super.setVerticalOffsetEnabled(z14);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private ChildScrollEffect scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.scrollFlags = typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(typedArrayObtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0));
            int i14 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i14, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private ChildScrollEffect createScrollEffectFromInt(int i14) {
            if (i14 != 1) {
                return null;
            }
            return new CompressChildScrollEffect();
        }

        public ChildScrollEffect getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i14 = this.scrollFlags;
            return (i14 & 1) == 1 && (i14 & 10) != 0;
        }

        public void setScrollEffect(int i14) {
            this.scrollEffect = createScrollEffectFromInt(i14);
        }

        public void setScrollFlags(int i14) {
            this.scrollFlags = i14;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(ChildScrollEffect childScrollEffect) {
            this.scrollEffect = childScrollEffect;
        }

        public LayoutParams(int i14, int i15) {
            super(i14, i15);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i14, int i15, float f14) {
            super(i14, i15, f14);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        removeOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            setOverlayTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f6350a;
            if (cVar instanceof BaseBehavior) {
                return ((BaseBehavior) cVar).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view2, View view3) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view3.getLayoutParams()).f6350a;
            if (cVar instanceof BaseBehavior) {
                int bottom = ((((BaseBehavior) cVar).offsetDelta + (view3.getBottom() - view2.getTop())) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view3);
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                view2.offsetTopAndBottom(bottom);
            }
        }

        private void updateLiftedStateIfNeeded(View view2, View view3) {
            if (view3 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view3;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view2));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = list.get(i14);
                if (view2 instanceof AppBarLayout) {
                    return (AppBarLayout) view2;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float getOverlapRatioForOffset(View view2) {
            int i14;
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i14 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i14) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int getScrollRange(View view2) {
            return view2 instanceof AppBarLayout ? ((AppBarLayout) view2).getTotalScrollRange() : super.getScrollRange(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view2, View view3) {
            return view3 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view2, View view3) {
            offsetChildAsNeeded(view2, view3);
            updateLiftedStateIfNeeded(view2, view3);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view2, View view3) {
            if (view3 instanceof AppBarLayout) {
                s0.r(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view2, int i14) {
            return super.onLayoutChild(coordinatorLayout, view2, i14);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view2, int i14, int i15, int i16, int i17) {
            return super.onMeasureChild(coordinatorLayout, view2, i14, i15, i16, i17);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view2, Rect rect, boolean z14) {
            AppBarLayout appBarLayoutFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view2));
            if (appBarLayoutFindFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view2.getLeft(), view2.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutFindFirstDependency.setExpanded(false, !z14);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z14) {
            super.setHorizontalOffsetEnabled(z14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i14) {
            return super.setLeftAndRightOffset(i14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i14) {
            return super.setTopAndBottomOffset(i14);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z14) {
            super.setVerticalOffsetEnabled(z14);
        }

        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public /* bridge */ /* synthetic */ View findFirstDependency(List list) {
            return findFirstDependency((List<View>) list);
        }
    }

    public void setExpanded(boolean z14, boolean z15) {
        setExpanded(z14, z15, true);
    }

    public void setExpanded(boolean z14) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setExpanded(z14, isLaidOut());
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onOffsetChangedListener) {
        addOnOffsetChangedListener((BaseOnOffsetChangedListener) onOffsetChangedListener);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean setLiftedState(boolean z14) {
        return setLiftedState(z14, !this.liftableOverride);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
