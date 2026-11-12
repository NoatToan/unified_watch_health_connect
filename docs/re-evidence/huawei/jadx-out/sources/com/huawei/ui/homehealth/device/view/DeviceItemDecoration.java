package com.huawei.ui.homehealth.device.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25345c;

    public DeviceItemDecoration(int i, int i2) {
        this.f25345c = i;
        this.f25344b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.top = this.f25344b;
        rect.bottom = this.f25344b;
        GridLayoutManager.LayoutParams layoutParams = view.getLayoutParams() instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) view.getLayoutParams() : null;
        if (layoutParams != null) {
            c(rect, recyclerView, layoutParams);
        }
    }

    private void c(Rect rect, RecyclerView recyclerView, GridLayoutManager.LayoutParams layoutParams) {
        if (layoutParams.getSpanIndex() != -1) {
            rect.right = 0;
            rect.left = 0;
            if (recyclerView.getAdapter().getItemCount() == 1) {
                return;
            }
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (layoutParams.getSpanIndex() % 2 == 0) {
                    rect.left = this.f25345c / 2;
                    return;
                } else {
                    rect.right = this.f25345c / 2;
                    return;
                }
            }
            if (layoutParams.getSpanIndex() % 2 == 0) {
                rect.right = this.f25345c / 2;
            } else {
                rect.left = this.f25345c / 2;
            }
        }
    }
}
