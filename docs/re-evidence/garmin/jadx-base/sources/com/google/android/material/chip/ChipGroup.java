package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ChipGroup;
    private final CheckableGroup<Chip> checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i14);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, List<Integer> list);
    }

    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view2, View view3) {
            if (view2 == ChipGroup.this && (view3 instanceof Chip)) {
                if (view3.getId() == -1) {
                    WeakHashMap<View, g1> weakHashMap = s0.f6563a;
                    view3.setId(View.generateViewId());
                }
                ChipGroup.this.checkableGroup.addCheckable((Chip) view3);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view2, view3);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view2, View view3) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view2 == chipGroup && (view3 instanceof Chip)) {
                chipGroup.checkableGroup.removeCheckable((Chip) view3);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view2, view3);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i14) {
        int i15 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i15), attributeSet, i14);
        CheckableGroup<Chip> checkableGroup = new CheckableGroup<>();
        this.checkableGroup = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.passThroughListener = passThroughHierarchyChangeListener;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.ChipGroup, i14, i15, new int[0]);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        typedArrayObtainStyledAttributes.recycle();
        checkableGroup.setOnCheckedStateChangeListener(new CheckableGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.1
            @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
            public void onCheckedStateChanged(Set<Integer> set) {
                if (ChipGroup.this.onCheckedStateChangeListener != null) {
                    OnCheckedStateChangeListener onCheckedStateChangeListener = ChipGroup.this.onCheckedStateChangeListener;
                    ChipGroup chipGroup = ChipGroup.this;
                    onCheckedStateChangeListener.onCheckedChanged(chipGroup, chipGroup.checkableGroup.getCheckedIdsSortedByChildOrder(ChipGroup.this));
                }
            }
        });
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            if ((getChildAt(i15) instanceof Chip) && isChildVisible(i15)) {
                i14++;
            }
        }
        return i14;
    }

    private boolean isChildVisible(int i14) {
        return getChildAt(i14).getVisibility() == 0;
    }

    public void check(int i14) {
        this.checkableGroup.check(i14);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public int getIndexOfChip(View view2) {
        if (!(view2 instanceof Chip)) {
            return -1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if ((childAt instanceof Chip) && isChildVisible(i15)) {
                if (((Chip) childAt) == view2) {
                    return i14;
                }
                i14++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i14 = this.defaultCheckedId;
        if (i14 != -1) {
            this.checkableGroup.check(i14);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f.v(accessibilityNodeInfo).p(f.g.a(getRowCount(), isSingleLine() ? getVisibleChipCount() : -1, isSingleSelection() ? 1 : 2, false));
    }

    public void setChipSpacing(int i14) {
        setChipSpacingHorizontal(i14);
        setChipSpacingVertical(i14);
    }

    public void setChipSpacingHorizontal(int i14) {
        if (this.chipSpacingHorizontal != i14) {
            this.chipSpacingHorizontal = i14;
            setItemSpacing(i14);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i14) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i14));
    }

    public void setChipSpacingResource(int i14) {
        setChipSpacing(getResources().getDimensionPixelOffset(i14));
    }

    public void setChipSpacingVertical(int i14) {
        if (this.chipSpacingVertical != i14) {
            this.chipSpacingVertical = i14;
            setLineSpacing(i14);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i14) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i14));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i14) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public void onCheckedChanged(ChipGroup chipGroup, List<Integer> list) {
                    if (ChipGroup.this.checkableGroup.isSingleSelection()) {
                        onCheckedChangeListener.onCheckedChanged(chipGroup, ChipGroup.this.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z14) {
        this.checkableGroup.setSelectionRequired(z14);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i14) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i14) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i14) {
        setSingleLine(getResources().getBoolean(i14));
    }

    public void setSingleSelection(int i14) {
        setSingleSelection(getResources().getBoolean(i14));
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i14, int i15) {
            super(i14, i15);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z14) {
        super.setSingleLine(z14);
    }

    public void setSingleSelection(boolean z14) {
        this.checkableGroup.setSingleSelection(z14);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
