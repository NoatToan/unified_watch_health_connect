package com.huami.lib.view.quickadapter;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes10.dex */
public abstract class LoadMoreView {
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_END = 4;
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_LOADING = 2;
    private int a = 1;
    private boolean b = false;

    private void a(BaseViewHolder baseViewHolder, boolean z) {
        int loadEndViewId = getLoadEndViewId();
        if (loadEndViewId != 0) {
            baseViewHolder.setVisible(loadEndViewId, z);
        }
    }

    private void b(BaseViewHolder baseViewHolder, boolean z) {
        baseViewHolder.setVisible(getLoadFailViewId(), z);
    }

    private void c(BaseViewHolder baseViewHolder, boolean z) {
        baseViewHolder.setVisible(getLoadingViewId(), z);
    }

    public void convert(BaseViewHolder baseViewHolder) {
        int i = this.a;
        if (i == 1) {
            c(baseViewHolder, false);
            b(baseViewHolder, false);
            a(baseViewHolder, false);
            return;
        }
        if (i == 2) {
            c(baseViewHolder, true);
            b(baseViewHolder, false);
            a(baseViewHolder, false);
        } else if (i == 3) {
            c(baseViewHolder, false);
            b(baseViewHolder, true);
            a(baseViewHolder, false);
        } else {
            if (i != 4) {
                return;
            }
            c(baseViewHolder, false);
            b(baseViewHolder, false);
            a(baseViewHolder, true);
        }
    }

    @LayoutRes
    public abstract int getLayoutId();

    @IdRes
    public abstract int getLoadEndViewId();

    @IdRes
    public abstract int getLoadFailViewId();

    public int getLoadMoreStatus() {
        return this.a;
    }

    @IdRes
    public abstract int getLoadingViewId();

    @Deprecated
    public boolean isLoadEndGone() {
        return this.b;
    }

    public final boolean isLoadEndMoreGone() {
        if (getLoadEndViewId() == 0) {
            return true;
        }
        return this.b;
    }

    public final void setLoadMoreEndGone(boolean z) {
        this.b = z;
    }

    public void setLoadMoreStatus(int i) {
        this.a = i;
    }
}
