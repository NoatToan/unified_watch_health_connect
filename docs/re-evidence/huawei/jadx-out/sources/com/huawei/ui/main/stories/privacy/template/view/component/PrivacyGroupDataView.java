package com.huawei.ui.main.stories.privacy.template.view.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyGroupDataView extends HealthExpandableListView implements BaseComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbsListView.OnScrollListener f28722b;
    private LoadMoreListener d;

    public interface LoadMoreListener {
        void loadMore();
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public View getView(Context context) {
        return this;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public void setPresenter(PrivacyDetailFragmentContract.PrivacyFragmentPresenter privacyFragmentPresenter) {
    }

    public PrivacyGroupDataView(Context context) {
        this(context, null);
    }

    public PrivacyGroupDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28722b = new AbsListView.OnScrollListener() { // from class: com.huawei.ui.main.stories.privacy.template.view.component.PrivacyGroupDataView.3
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                if (i == 0) {
                    if (PrivacyGroupDataView.this.getLastVisiblePosition() == PrivacyGroupDataView.this.getAdapter().getCount() - 1 || PrivacyGroupDataView.this.getLastVisiblePosition() == PrivacyGroupDataView.this.getAdapter().getCount() - 2) {
                        PrivacyGroupDataView.this.e();
                    }
                }
            }
        };
        setVerticalScrollBarEnabled(false);
        a();
        setSelector(R.color.transparent);
        setGroupIndicator(null);
    }

    private void a() {
        setOnScrollListener(this.f28722b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LoadMoreListener loadMoreListener = this.d;
        if (loadMoreListener != null) {
            loadMoreListener.loadMore();
        }
    }

    public void setLoadMoreListener(LoadMoreListener loadMoreListener) {
        this.d = loadMoreListener;
    }
}
