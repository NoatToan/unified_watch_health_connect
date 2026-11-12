package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.a;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l7.f;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private final List<CornerData> originalCornerData;
    private final PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public static class CornerData {
        private static final CornerSize noCorner = new AbsoluteCornerSize(0.0f);
        CornerSize bottomLeft;
        CornerSize bottomRight;
        CornerSize topLeft;
        CornerSize topRight;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.topLeft = cornerSize;
            this.topRight = cornerSize3;
            this.bottomRight = cornerSize4;
            this.bottomLeft = cornerSize2;
        }

        public static CornerData bottom(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerData.bottomLeft, cornerSize, cornerData.bottomRight);
        }

        public static CornerData end(CornerData cornerData, View view2) {
            return ViewUtils.isLayoutRtl(view2) ? left(cornerData) : right(cornerData);
        }

        public static CornerData left(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = cornerData.bottomLeft;
            CornerSize cornerSize3 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        public static CornerData right(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerSize, cornerData.topRight, cornerData.bottomRight);
        }

        public static CornerData start(CornerData cornerData, View view2) {
            return ViewUtils.isLayoutRtl(view2) ? right(cornerData) : left(cornerData);
        }

        public static CornerData top(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerData.topRight, cornerSize2);
        }
    }

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i14, boolean z14);
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(MaterialButton materialButton, boolean z14) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i14) {
        int i15 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i14, i15), attributeSet, i14);
        this.originalCornerData = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.childOrderComparator = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i14, i15, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setImportantForAccessibility(1);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i14 = firstVisibleChildIndex + 1; i14 < getChildCount(); i14++) {
            MaterialButton childButton = getChildButton(i14);
            int iMin = Math.min(childButton.getStrokeWidth(), getChildButton(i14 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(-iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = -iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void checkInternal(int i14, boolean z14) {
        if (i14 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z14 && !hashSet.contains(Integer.valueOf(i14))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i14));
        } else {
            if (z14 || !hashSet.contains(Integer.valueOf(i14))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i14));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void dispatchOnButtonChecked(int i14, boolean z14) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i14, z14);
        }
    }

    private MaterialButton getChildButton(int i14) {
        return (MaterialButton) getChildAt(i14);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (isChildVisible(i14)) {
                return i14;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(View view2) {
        if (!(view2 instanceof MaterialButton)) {
            return -1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            if (getChildAt(i15) == view2) {
                return i14;
            }
            if ((getChildAt(i15) instanceof MaterialButton) && isChildVisible(i15)) {
                i14++;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private CornerData getNewCornerData(int i14, int i15, int i16) {
        CornerData cornerData = this.originalCornerData.get(i14);
        if (i15 == i16) {
            return cornerData;
        }
        boolean z14 = getOrientation() == 0;
        if (i14 == i15) {
            return z14 ? CornerData.start(cornerData, this) : CornerData.top(cornerData);
        }
        if (i14 == i16) {
            return z14 ? CornerData.end(cornerData, this) : CornerData.bottom(cornerData);
        }
        return null;
    }

    private int getVisibleButtonCount() {
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            if ((getChildAt(i15) instanceof MaterialButton) && isChildVisible(i15)) {
                i14++;
            }
        }
        return i14;
    }

    private boolean isChildVisible(int i14) {
        return getChildAt(i14).getVisibility() != 8;
    }

    private void resetChildMargins(int i14) {
        if (getChildCount() == 0 || i14 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i14).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedStateForView(int i14, boolean z14) {
        View viewFindViewById = findViewById(i14);
        if (viewFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) viewFindViewById).setChecked(z14);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, CornerData cornerData) {
        if (cornerData == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cornerData.topLeft).setBottomLeftCornerSize(cornerData.bottomLeft).setTopRightCornerSize(cornerData.topRight).setBottomRightCornerSize(cornerData.bottomRight);
        }
    }

    private void updateCheckedIds(Set<Integer> set) {
        Set<Integer> set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            int id3 = getChildButton(i14).getId();
            setCheckedStateForView(id3, set.contains(Integer.valueOf(id3)));
            if (set2.contains(Integer.valueOf(id3)) != set.contains(Integer.valueOf(id3))) {
                dispatchOnButtonChecked(id3, set.contains(Integer.valueOf(id3)));
            }
        }
        invalidate();
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            treeMap.put(getChildButton(i14), Integer.valueOf(i14));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void updateChildrenA11yClassName() {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildButton(i14).setA11yClassName((this.singleSelection ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void addOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        if (view2 instanceof MaterialButton) {
            super.addView(view2, i14, layoutParams);
            MaterialButton materialButton = (MaterialButton) view2;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            checkInternal(materialButton.getId(), materialButton.isChecked());
            ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.originalCornerData.add(new CornerData(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
            materialButton.setEnabled(isEnabled());
            s0.r(materialButton, new a() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
                @Override // androidx.core.view.a
                public void onInitializeAccessibilityNodeInfo(View view3, f fVar) {
                    super.onInitializeAccessibilityNodeInfo(view3, fVar);
                    fVar.q(f.h.a(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view3), 1, false, ((MaterialButton) view3).isChecked()));
                }
            });
        }
    }

    public void check(int i14) {
        checkInternal(i14, true);
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            int id3 = getChildButton(i14).getId();
            if (this.checkedIds.contains(Integer.valueOf(id3))) {
                arrayList.add(Integer.valueOf(id3));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i14, int i15) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i15 >= numArr.length) ? i15 : numArr[i15].intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void onButtonCheckedStateChanged(MaterialButton materialButton, boolean z14) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z14);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i14 = this.defaultCheckId;
        if (i14 != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i14)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f.v(accessibilityNodeInfo).p(f.g.a(1, getVisibleButtonCount(), isSingleSelection() ? 1 : 2, false));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i14, i15);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view2) {
        super.onViewRemoved(view2);
        if (view2 instanceof MaterialButton) {
            ((MaterialButton) view2).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view2);
        if (iIndexOfChild >= 0) {
            this.originalCornerData.remove(iIndexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    public void removeOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildButton(i14).setEnabled(z14);
        }
    }

    public void setSelectionRequired(boolean z14) {
        this.selectionRequired = z14;
    }

    public void setSingleSelection(boolean z14) {
        if (this.singleSelection != z14) {
            this.singleSelection = z14;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    public void uncheck(int i14) {
        checkInternal(i14, false);
    }

    public void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i14 = 0; i14 < childCount; i14++) {
            MaterialButton childButton = getChildButton(i14);
            if (childButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
                updateBuilderWithCornerData(builder, getNewCornerData(i14, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    public void setSingleSelection(int i14) {
        setSingleSelection(getResources().getBoolean(i14));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
