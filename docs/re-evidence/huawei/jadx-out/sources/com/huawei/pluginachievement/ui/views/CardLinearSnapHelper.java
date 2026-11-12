package com.huawei.pluginachievement.ui.views;

import android.view.View;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class CardLinearSnapHelper extends LinearSnapHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22287c = true;

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        if (!this.f22287c) {
            return new int[]{0, 0};
        }
        return super.calculateDistanceToFinalSnap(layoutManager, view);
    }

    public void c(boolean z) {
        this.f22287c = z;
    }
}
