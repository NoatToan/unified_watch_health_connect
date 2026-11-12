package com.xiaomi.hm.health.training.ui.adapter;

import androidx.core.content.ContextCompat;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes21.dex */
public class FilterOptionListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private int A;

    public FilterOptionListAdapter() {
        super(R.layout.tr_item_filter_option);
        this.A = -1;
    }

    public void setItemSelected(String str) {
        int i = this.A;
        int iIndexOf = getData().indexOf(str);
        if (i >= 0) {
            notifyItemChanged(i);
        }
        if (iIndexOf >= 0) {
            notifyItemChanged(iIndexOf);
        }
        this.A = iIndexOf;
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, String str) {
        int i = R.id.text;
        baseViewHolder.setText(i, str);
        baseViewHolder.setTextColor(i, ContextCompat.getColor(baseViewHolder.itemView.getContext(), baseViewHolder.getAdapterPosition() == this.A ? R.color.pumpkin_orange : R.color.black_70));
    }
}
