package com.huawei.ui.homehealth.device.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes17.dex */
public class RecommendItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25354b;

    public RecommendItemDecoration(int i, int i2) {
        this.f25354b = i;
        this.f25353a = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.top = this.f25353a;
        rect.bottom = this.f25353a;
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        if (layoutParams.getSpanIndex() != -1) {
            b(rect, 0);
            a(rect, 0);
            int itemCount = recyclerView.getAdapter().getItemCount();
            if (itemCount == 1) {
                return;
            }
            if (qrs.af(BaseApplication.getContext())) {
                if (itemCount > 4) {
                    itemCount = 4;
                }
                e(layoutParams, rect, itemCount);
            } else if (view.getLayoutParams() instanceof GridLayoutManager.LayoutParams) {
                GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) view.getLayoutParams();
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    if (layoutParams2.getSpanIndex() % 2 == 0) {
                        a(rect, this.f25354b / 2);
                        return;
                    } else {
                        b(rect, this.f25354b / 2);
                        return;
                    }
                }
                if (layoutParams2.getSpanIndex() % 2 == 0) {
                    b(rect, this.f25354b / 2);
                } else {
                    a(rect, this.f25354b / 2);
                }
            }
        }
    }

    private void e(GridLayoutManager.LayoutParams layoutParams, Rect rect, int i) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            if ((layoutParams.getSpanIndex() + 1) % i == 1) {
                a(rect, this.f25354b / 2);
                return;
            } else if ((layoutParams.getSpanIndex() + 1) % i == 0) {
                b(rect, this.f25354b / 2);
                return;
            } else {
                a(rect, this.f25354b / 2);
                b(rect, this.f25354b / 2);
                return;
            }
        }
        if ((layoutParams.getSpanIndex() + 1) % i == 1) {
            b(rect, this.f25354b / 2);
        } else if ((layoutParams.getSpanIndex() + 1) % i == 0) {
            a(rect, this.f25354b / 2);
        } else {
            a(rect, this.f25354b / 2);
            b(rect, this.f25354b / 2);
        }
    }

    private void b(Rect rect, int i) {
        rect.right = i;
    }

    private void a(Rect rect, int i) {
        rect.left = i;
    }
}
