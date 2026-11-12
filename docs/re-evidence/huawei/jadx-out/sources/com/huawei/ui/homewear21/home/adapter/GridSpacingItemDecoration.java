package com.huawei.ui.homewear21.home.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes18.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26266c;

    public GridSpacingItemDecoration(boolean z, int i) {
        this.f26266c = i;
        this.f26265b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i = qrs.af(BaseApplication.getContext()) ? 3 : 2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = childAdapterPosition % i;
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z = this.f26265b;
        if (z) {
            rect.top = this.f26266c;
            return;
        }
        if (!z && childAdapterPosition >= i) {
            rect.top = this.f26266c;
        }
        if (i == 2 && itemCount >= 0 && itemCount % 2 == 1 && childAdapterPosition == itemCount - 1) {
            return;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            rect.right = (this.f26266c * i2) / i;
            int i3 = this.f26266c;
            rect.left = i3 - (((i2 + 1) * i3) / i);
        } else {
            rect.left = (this.f26266c * i2) / i;
            int i4 = this.f26266c;
            rect.right = i4 - (((i2 + 1) * i4) / i);
        }
    }
}
