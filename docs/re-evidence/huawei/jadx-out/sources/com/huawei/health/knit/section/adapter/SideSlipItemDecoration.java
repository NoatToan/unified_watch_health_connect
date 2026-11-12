package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import defpackage.qqp;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class SideSlipItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f7452a;
    private int d;
    private Context e;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.left = this.d;
        rect.right = this.d;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = qqp.a(this.e, R.dimen.cardMarginStart);
        }
        if (recyclerView.getChildAdapterPosition(view) == this.f7452a.size() - 1) {
            rect.right = qqp.a(this.e, R.dimen.cardMarginEnd);
        }
    }
}
