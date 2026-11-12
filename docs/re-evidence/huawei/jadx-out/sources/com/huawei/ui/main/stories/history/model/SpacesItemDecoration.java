package com.huawei.ui.main.stories.history.model;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28345c;

    public SpacesItemDecoration(int i) {
        this.f28345c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.left = this.f28345c;
        rect.right = this.f28345c;
        rect.bottom = this.f28345c;
        if (recyclerView.getChildPosition(view) == 0) {
            rect.top = 0;
        }
    }
}
