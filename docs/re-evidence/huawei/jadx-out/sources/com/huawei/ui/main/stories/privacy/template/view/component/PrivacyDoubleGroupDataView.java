package com.huawei.ui.main.stories.privacy.template.view.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyDoubleGroupDataView extends RecyclerView implements BaseComponent {
    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public View getView(Context context) {
        return this;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent
    public void setPresenter(PrivacyDetailFragmentContract.PrivacyFragmentPresenter privacyFragmentPresenter) {
    }

    public PrivacyDoubleGroupDataView(Context context) {
        this(context, null);
    }

    public PrivacyDoubleGroupDataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public PrivacyDoubleGroupDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
