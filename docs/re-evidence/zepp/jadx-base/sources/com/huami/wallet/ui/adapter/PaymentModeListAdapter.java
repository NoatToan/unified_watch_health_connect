package com.huami.wallet.ui.adapter;

import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.RichPayMode;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PaymentModeListAdapter extends BaseQuickAdapter<RichPayMode, BaseViewHolder> {
    private RichPayMode a;

    public PaymentModeListAdapter(int i, @Nullable List<RichPayMode> list) {
        super(i, list);
    }

    private void a(int i, boolean z) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) getRecyclerView().findViewHolderForAdapterPosition(i);
        if (baseViewHolder != null) {
            baseViewHolder.setChecked(R.id.checkbox, z);
        }
    }

    public RichPayMode getCheckedItem() {
        return this.a;
    }

    public void setItemChecked(RichPayMode richPayMode) {
        int iIndexOf;
        int iIndexOf2;
        RichPayMode richPayMode2 = this.a;
        this.a = richPayMode;
        if (richPayMode2 != null && (iIndexOf2 = getData().indexOf(richPayMode2)) >= 0) {
            a(iIndexOf2 + getHeaderLayoutCount(), false);
        }
        if (richPayMode == null || (iIndexOf = getData().indexOf(richPayMode)) < 0) {
            return;
        }
        a(iIndexOf + getHeaderLayoutCount(), true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, RichPayMode richPayMode) {
        baseViewHolder.setImageResource(R.id.icon, richPayMode.icon);
        baseViewHolder.setText(R.id.name, richPayMode.name);
        int i = R.id.checkbox;
        RichPayMode richPayMode2 = this.a;
        baseViewHolder.setChecked(i, richPayMode2 != null && richPayMode2 == richPayMode);
    }
}
