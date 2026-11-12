package com.huawei.ui.homewear21.home.holder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeFeatureHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26326b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f26327a;

    public WearHomeFeatureHolder(View view) {
        super(view);
        HealthRecycleView healthRecycleView = (HealthRecycleView) qsp.a(view, R.id.recyclerView);
        this.f26327a = healthRecycleView;
        healthRecycleView.addItemDecoration(new SpaceItemDecoration((int) BaseApplication.getContext().getResources().getDimension(com.huawei.ui.commonui.R.dimen.cardMarginMiddle)));
    }

    public RecyclerView a() {
        return this.f26327a;
    }

    public static void c(int i) {
        f26326b = i;
    }

    public static class SpaceItemDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26328b;

        public SpaceItemDecoration(int i) {
            this.f26328b = i;
        }

        private int c(RecyclerView recyclerView) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                return ((GridLayoutManager) layoutManager).getSpanCount();
            }
            return -1;
        }

        private boolean e(RecyclerView recyclerView, int i, int i2, int i3) {
            return (recyclerView.getLayoutManager() instanceof GridLayoutManager) && i >= i3 - (i3 % i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            int iC = c(recyclerView);
            int itemCount = recyclerView.getAdapter().getItemCount();
            LogUtil.a("WearHomeFeatureHolder", "getItemOffsets itemPosition ", Integer.valueOf(childLayoutPosition), " spanCount ", Integer.valueOf(iC), " childCount ", Integer.valueOf(itemCount));
            if (e(recyclerView, childLayoutPosition, iC, itemCount) && childLayoutPosition == itemCount - 1 && iC == 2) {
                LogUtil.a("WearHomeFeatureHolder", "getItemOffsets itemPosition == childCount -1 spanCount == 2");
                rect.set(0, 0, 0, 0);
            } else {
                e(rect, view);
            }
        }

        private void e(Rect rect, View view) {
            if (view.getLayoutParams() instanceof GridLayoutManager.LayoutParams) {
                GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
                if (layoutParams.getSpanIndex() != -1) {
                    if (LanguageUtil.ba(BaseApplication.getContext())) {
                        if ((layoutParams.getSpanIndex() + 1) % WearHomeFeatureHolder.f26326b != 1) {
                            if ((layoutParams.getSpanIndex() + 1) % WearHomeFeatureHolder.f26326b == 0) {
                                rect.set(0, 0, this.f26328b / 2, 0);
                                return;
                            } else {
                                int i = this.f26328b / 2;
                                rect.set(i, 0, i, 0);
                                return;
                            }
                        }
                        rect.set(this.f26328b / 2, 0, 0, 0);
                        return;
                    }
                    if ((layoutParams.getSpanIndex() + 1) % WearHomeFeatureHolder.f26326b != 1) {
                        if ((layoutParams.getSpanIndex() + 1) % WearHomeFeatureHolder.f26326b == 0) {
                            rect.set(this.f26328b / 2, 0, 0, 0);
                            return;
                        } else {
                            int i2 = this.f26328b / 2;
                            rect.set(i2, 0, i2, 0);
                            return;
                        }
                    }
                    rect.set(0, 0, this.f26328b / 2, 0);
                }
            }
        }
    }
}
