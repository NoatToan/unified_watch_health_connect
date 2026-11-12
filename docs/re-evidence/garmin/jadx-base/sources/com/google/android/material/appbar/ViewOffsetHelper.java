package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    private final View f53159view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view2) {
        this.f53159view = view2;
    }

    public void applyOffsets() {
        View view2 = this.f53159view;
        int top = this.offsetTop - (view2.getTop() - this.layoutTop);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        view2.offsetTopAndBottom(top);
        View view3 = this.f53159view;
        view3.offsetLeftAndRight(this.offsetLeft - (view3.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.f53159view.getTop();
        this.layoutLeft = this.f53159view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z14) {
        this.horizontalOffsetEnabled = z14;
    }

    public boolean setLeftAndRightOffset(int i14) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i14) {
            return false;
        }
        this.offsetLeft = i14;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i14) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i14) {
            return false;
        }
        this.offsetTop = i14;
        applyOffsets();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z14) {
        this.verticalOffsetEnabled = z14;
    }
}
