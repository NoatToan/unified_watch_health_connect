package com.huami.lib.view.quickadapter;

import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public final class SimpleLoadMoreView extends LoadMoreView {
    @Override // com.huami.lib.view.quickadapter.LoadMoreView
    public int getLayoutId() {
        return R.layout.quick_view_load_more;
    }

    @Override // com.huami.lib.view.quickadapter.LoadMoreView
    public int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }

    @Override // com.huami.lib.view.quickadapter.LoadMoreView
    public int getLoadFailViewId() {
        return R.id.load_more_load_fail_view;
    }

    @Override // com.huami.lib.view.quickadapter.LoadMoreView
    public int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }
}
