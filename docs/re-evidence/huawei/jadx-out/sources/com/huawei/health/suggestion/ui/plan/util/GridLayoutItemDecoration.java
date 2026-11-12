package com.huawei.health.suggestion.ui.plan.util;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qre;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes9.dex */
public class GridLayoutItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9718a = qre.b(R.dimen.cardMarginMiddle);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9719b = qre.b(R.dimen.health_common_6dp);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, state);
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            LogUtil.e("GridLayoutItemDecoration", "getItemOffsets cast gridLayoutManager false");
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int spanCount = gridLayoutManager.getSpanCount();
        int spanSize = gridLayoutManager.getSpanSizeLookup().getSpanSize(childAdapterPosition);
        if (childAdapterPosition == -1 || spanCount == 0) {
            LogUtil.e("GridLayoutItemDecoration", "getItemOffsets no position or spanCount is 0");
            return;
        }
        if (spanSize >= spanCount) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int spanSize2 = 0;
        for (int i3 = 0; i3 < childAdapterPosition; i3++) {
            spanSize2 += gridLayoutManager.getSpanSizeLookup().getSpanSize(i3);
            if (spanSize2 >= spanCount) {
                spanSize2 = 0;
            }
        }
        if (spanSize2 % spanCount != 0) {
            i2 = this.f9718a;
            i = i2 / spanCount;
        } else {
            int i4 = this.f9718a;
            int i5 = i4 / spanCount;
            i = i4;
            i2 = i5;
        }
        if (LanguageUtil.ba(BaseApplication.b())) {
            int i6 = this.f9719b;
            rect.set(i2, i6, i, i6);
        } else {
            int i7 = this.f9719b;
            rect.set(i, i7, i2, i7);
        }
    }
}
