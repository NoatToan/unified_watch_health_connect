package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.a1;
import androidx.core.view.g1;
import androidx.core.view.s0;
import b7.g;
import java.util.WeakHashMap;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements o.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final androidx.core.view.a accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    boolean isBold;
    private j itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.isBold = true;
        androidx.core.view.a aVar = new androidx.core.view.a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
                super.onInitializeAccessibilityNodeInfo(view2, fVar);
                fVar.l(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        s0.r(checkedTextView, aVar);
    }

    private void adjustAppearance() {
        boolean zShouldExpandActionArea = shouldExpandActionArea();
        CheckedTextView checkedTextView = this.textView;
        if (zShouldExpandActionArea) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.actionArea.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.actionArea.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(com.garmin.android.apps.connectmobile.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view2) {
        if (view2 != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view2);
        }
    }

    private boolean shouldExpandActionArea() {
        j jVar = this.itemData;
        return jVar.f4777e == null && jVar.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(j jVar, int i14) {
        this.itemData = jVar;
        int i15 = jVar.f4773a;
        if (i15 > 0) {
            setId(i15);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            setBackground(stateListDrawableCreateDefaultBackground);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f4777e);
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.f4789q);
        a1.a(this, jVar.f4790r);
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i14) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i14 + 1);
        j jVar = this.itemData;
        if (jVar != null && jVar.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z14) {
        refreshDrawableState();
        if (this.checkable != z14) {
            this.checkable = z14;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z14) {
        refreshDrawableState();
        this.textView.setChecked(z14);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z14 && this.isBold) ? 1 : 0);
    }

    public void setHorizontalPadding(int i14) {
        setPadding(i14, getPaddingTop(), i14, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.iconTintList);
            }
            int i14 = this.iconSize;
            drawable.setBounds(0, 0, i14, i14);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Resources resources = getResources();
                int i15 = com.google.android.material.R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = g.f16255a;
                Drawable drawable2 = resources.getDrawable(i15, theme);
                this.emptyDrawable = drawable2;
                if (drawable2 != null) {
                    int i16 = this.iconSize;
                    drawable2.setBounds(0, 0, i16, i16);
                }
            }
            drawable = this.emptyDrawable;
        }
        this.textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i14) {
        this.textView.setCompoundDrawablePadding(i14);
    }

    public void setIconSize(int i14) {
        this.iconSize = i14;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        j jVar = this.itemData;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i14) {
        this.textView.setMaxLines(i14);
    }

    public void setNeedsEmptyIcon(boolean z14) {
        this.needsEmptyIcon = z14;
    }

    public void setShortcut(boolean z14, char c14) {
    }

    public void setTextAppearance(int i14) {
        this.textView.setTextAppearance(i14);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public void initialize(j jVar, boolean z14) {
        this.isBold = z14;
        initialize(jVar, 0);
    }
}
