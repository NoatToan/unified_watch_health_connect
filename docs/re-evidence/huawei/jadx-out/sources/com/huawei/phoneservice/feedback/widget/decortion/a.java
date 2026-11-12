package com.huawei.phoneservice.feedback.widget.decortion;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes41.dex */
public class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21799c;
    private int d = Integer.MAX_VALUE;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.top = this.f21798b;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = this.d;
        if (childLayoutPosition < i) {
            rect.top = 0;
        }
        if (i != Integer.MAX_VALUE) {
            int i2 = this.f21799c;
            float f = (((i - 1) * i2) * 1.0f) / i;
            float f2 = (childLayoutPosition % i) * (i2 - f);
            rect.left = (int) f2;
            rect.right = (int) (f - f2);
        }
    }

    public void e(int i) {
        this.f21798b = i;
    }

    public void a(int i) {
        this.f21799c = i;
    }

    public void b(int i) {
        this.d = i;
    }
}
