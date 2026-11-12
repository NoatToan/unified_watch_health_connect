package com.huami.healthlabel.healthlabelhistory.adapter;

import com.chad.library.adapter.base.loadmore.LoadMoreView;
import com.huami.healthlabel.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelLoadMoreView;", "Lcom/chad/library/adapter/base/loadmore/LoadMoreView;", "", "getLayoutId", "getLoadingViewId", "getLoadEndViewId", "getLoadFailViewId", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class HealthLabelLoadMoreView extends LoadMoreView {
    @Override // com.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLayoutId() {
        return R.layout.health_label_load_more;
    }

    @Override // com.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }

    @Override // com.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadFailViewId() {
        return R.id.load_more_load_fail_view;
    }

    @Override // com.chad.library.adapter.base.loadmore.LoadMoreView
    public int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }
}
