package com.huawei.health.knit.section.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes29.dex */
public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7221c;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (childAdapterPosition == 0) {
            rect.left = 0;
            rect.right = this.f7221c / 2;
        } else if (childAdapterPosition == itemCount - 1) {
            rect.left = this.f7221c / 2;
            rect.right = 0;
        } else {
            rect.left = this.f7221c / 2;
            rect.right = this.f7221c / 2;
        }
    }
}
