package com.google.android.material.navigationrail;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.w0;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import c7.e;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private View headerView;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingStartSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    public NavigationRailView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        w0 w0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationRailView, i14, i15, new int[0]);
        int i16 = R.styleable.NavigationRailView_headerLayout;
        TypedArray typedArray = w0VarObtainTintedStyledAttributes.f5271b;
        TypedArray typedArray2 = w0VarObtainTintedStyledAttributes.f5271b;
        int resourceId = typedArray.getResourceId(i16, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(typedArray2.getInt(R.styleable.NavigationRailView_menuGravity, 49));
        int i17 = R.styleable.NavigationRailView_itemMinHeight;
        if (typedArray2.hasValue(i17)) {
            setItemMinimumHeight(typedArray2.getDimensionPixelSize(i17, -1));
        }
        int i18 = R.styleable.NavigationRailView_paddingTopSystemWindowInsets;
        if (typedArray2.hasValue(i18)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray2.getBoolean(i18, false));
        }
        int i19 = R.styleable.NavigationRailView_paddingBottomSystemWindowInsets;
        if (typedArray2.hasValue(i19)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray2.getBoolean(i19, false));
        }
        int i24 = R.styleable.NavigationRailView_paddingStartSystemWindowInsets;
        if (typedArray2.hasValue(i24)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(typedArray2.getBoolean(i24, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        w0VarObtainTintedStyledAttributes.h();
        applyWindowInsets();
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public m1 onApplyWindowInsets(View view2, m1 m1Var, ViewUtils.RelativePadding relativePadding) {
                e eVarI = m1Var.f6508a.i(519);
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += eVarI.f25191b;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += eVarI.f25193d;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    relativePadding.start += ViewUtils.isLayoutRtl(view2) ? eVarI.f25192c : eVarI.f25190a;
                }
                relativePadding.applyToView(view2);
                return m1Var;
            }
        });
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private boolean isHeaderViewVisible() {
        View view2 = this.headerView;
        return (view2 == null || view2.getVisibility() == 8) ? false : true;
    }

    private int makeMinWidthSpec(int i14) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i14) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i14;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i14), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return getFitsSystemWindows();
    }

    public void addHeaderView(View view2) {
        removeHeaderView();
        this.headerView = view2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view2, 0, layoutParams);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationRailMenuView createNavigationBarMenuView(Context context) {
        return new NavigationRailMenuView(context);
    }

    public View getHeaderView() {
        return this.headerView;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i18 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i18 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i18 = this.topMargin;
        }
        if (i18 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i18, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i18);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        int iMakeMinWidthSpec = makeMinWidthSpec(i14);
        super.onMeasure(iMakeMinWidthSpec, i15);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), iMakeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    public void removeHeaderView() {
        View view2 = this.headerView;
        if (view2 != null) {
            removeView(view2);
            this.headerView = null;
        }
    }

    public void setItemMinimumHeight(int i14) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i14);
    }

    public void setMenuGravity(int i14) {
        getNavigationRailMenuView().setMenuGravity(i14);
    }

    public void addHeaderView(int i14) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i14, (ViewGroup) this, false));
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }
}
