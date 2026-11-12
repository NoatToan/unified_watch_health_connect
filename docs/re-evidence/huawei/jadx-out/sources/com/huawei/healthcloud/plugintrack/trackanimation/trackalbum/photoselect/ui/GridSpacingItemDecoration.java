package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.photoselect.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10782b;
    private boolean d;
    private int e;

    public GridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f10782b = i;
        this.e = i2;
        this.d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.f10782b;
        int i2 = childAdapterPosition % i;
        if (i == 0) {
            return;
        }
        if (this.d) {
            int i3 = this.e;
            rect.left = i3 - ((i2 * i3) / i);
            rect.right = ((i2 + 1) * this.e) / this.f10782b;
            if (childAdapterPosition < this.f10782b) {
                rect.top = this.e;
            }
            rect.bottom = this.e;
            return;
        }
        rect.left = (this.e * i2) / i;
        int i4 = this.e;
        rect.right = i4 - (((i2 + 1) * i4) / this.f10782b);
        if (childAdapterPosition < this.f10782b) {
            rect.top = this.e;
        }
        rect.bottom = this.e;
    }
}
