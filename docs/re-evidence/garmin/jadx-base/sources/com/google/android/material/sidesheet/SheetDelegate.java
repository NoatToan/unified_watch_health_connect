package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes14.dex */
abstract class SheetDelegate {
    public abstract int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float calculateSlideOffset(int i14);

    public abstract int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract int getMaxViewPositionHorizontal();

    public abstract int getMinViewPositionHorizontal();

    public abstract <V extends View> int getOuterEdge(V v14);

    public abstract int getParentInnerEdge(CoordinatorLayout coordinatorLayout);

    public abstract int getSheetEdge();

    public abstract boolean isExpandingOutwards(float f14);

    public abstract boolean isReleasedCloseToInnerEdge(View view2);

    public abstract boolean isSwipeSignificant(float f14, float f15);

    public abstract boolean shouldHide(View view2, float f14);

    public abstract void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams, int i14);

    public abstract void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i14, int i15);
}
