package com.google.android.material.bottomnavigation;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.w0;
import androidx.core.view.g1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        Context context2 = getContext();
        w0 w0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.BottomNavigationView, i14, i15, new int[0]);
        setItemHorizontalTranslationEnabled(w0VarObtainTintedStyledAttributes.f5271b.getBoolean(R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i16 = R.styleable.BottomNavigationView_android_minHeight;
        TypedArray typedArray = w0VarObtainTintedStyledAttributes.f5271b;
        if (typedArray.hasValue(i16)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(i16, 0));
        }
        if (typedArray.getBoolean(R.styleable.BottomNavigationView_compatShadowEnabled, true) && shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        w0VarObtainTintedStyledAttributes.h();
        applyWindowInsets();
    }

    private void addCompatibilityTopDivider(Context context) {
        View view2 = new View(context);
        view2.setBackgroundColor(b.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view2);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public m1 onApplyWindowInsets(View view2, m1 m1Var, ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom = m1Var.a() + relativePadding.bottom;
                WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                boolean z14 = view2.getLayoutDirection() == 1;
                int iB = m1Var.b();
                int iC = m1Var.c();
                relativePadding.start += z14 ? iC : iB;
                int i14 = relativePadding.end;
                if (!z14) {
                    iB = iC;
                }
                relativePadding.end = i14 + iB;
                relativePadding.applyToView(view2);
                return m1Var;
            }
        });
    }

    private int makeMinHeightSpec(int i14) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i14) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i14;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i14), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationBarMenuView createNavigationBarMenuView(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, makeMinHeightSpec(i15));
    }

    public void setItemHorizontalTranslationEnabled(boolean z14) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z14) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z14);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }
}
