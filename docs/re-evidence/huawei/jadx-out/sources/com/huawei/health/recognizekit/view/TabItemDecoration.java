package com.huawei.health.recognizekit.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class TabItemDecoration extends RecyclerView.ItemDecoration {
    private int d = 10;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iD;
        int iD2;
        if (!(recyclerView.getAdapter() instanceof RecognizeModeRecyclerAdapter)) {
            LogUtil.d("TabItemDecoration", "adapter invalid");
            return;
        }
        Context contextB = BaseApplication.b();
        RecognizeModeRecyclerAdapter recognizeModeRecyclerAdapter = (RecognizeModeRecyclerAdapter) recyclerView.getAdapter();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recognizeModeRecyclerAdapter.getItemCount();
        int i = qrs.i(contextB);
        if (childAdapterPosition == 0) {
            iD = (int) ((i - recognizeModeRecyclerAdapter.e(childAdapterPosition)) / 2.0f);
        } else {
            iD = qrs.d(contextB, this.d);
        }
        LogUtil.a("TabItemDecoration", "screenWidth:", Integer.valueOf(i), ",view.width:", Float.valueOf(recognizeModeRecyclerAdapter.e(childAdapterPosition)), "leftMargin:", Integer.valueOf(iD));
        if (childAdapterPosition == itemCount - 1) {
            iD2 = (int) ((i - recognizeModeRecyclerAdapter.e(childAdapterPosition)) / 2.0f);
        } else {
            iD2 = qrs.d(contextB, this.d);
        }
        LogUtil.a("TabItemDecoration", "screenWidth:", Integer.valueOf(i), ",view.width:", Float.valueOf(recognizeModeRecyclerAdapter.e(childAdapterPosition)), "rightMargin:", Integer.valueOf(iD2));
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (LanguageUtil.ba(BaseApplication.b())) {
            layoutParams.setMargins(iD2, 0, iD, 0);
        } else {
            layoutParams.setMargins(iD, 0, iD2, 0);
        }
        view.setLayoutParams(layoutParams);
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
