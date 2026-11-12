package com.huawei.ui.main.stories.health.basehealth;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27809c;
    private int e;

    public SpaceItemDecoration(int i, int i2) {
        this.e = i;
        this.f27809c = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.getOrientation() == 1) {
                if (recyclerView.getChildAdapterPosition(view) == linearLayoutManager.getItemCount() - 1) {
                    rect.bottom = this.f27809c;
                }
                rect.top = this.f27809c;
                rect.left = this.e;
                rect.right = this.e;
                return;
            }
            if (recyclerView.getChildAdapterPosition(view) == linearLayoutManager.getItemCount() - 1) {
                rect.right = this.e;
            }
            rect.top = this.f27809c;
            rect.left = this.e;
            rect.bottom = this.f27809c;
        }
    }
}
