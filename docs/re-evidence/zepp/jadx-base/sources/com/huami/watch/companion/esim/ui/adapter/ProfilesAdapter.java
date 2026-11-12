package com.huami.watch.companion.esim.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.esim.R;
import com.huami.watch.companion.esim.model.SimpleProfileInfo;

/* JADX INFO: loaded from: classes16.dex */
public class ProfilesAdapter extends BaseQuickAdapter<SimpleProfileInfo, BaseViewHolder> {
    public ProfilesAdapter() {
        super(R.layout.item_profile);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, SimpleProfileInfo simpleProfileInfo) {
        SimpleProfileInfo item = getItem(baseViewHolder.getAdapterPosition());
        if (item != null) {
            baseViewHolder.setText(R.id.tvName, item.getName(this.mContext));
            baseViewHolder.setText(R.id.switchState, item.isEnabled() ? R.string.esim_state_enable : R.string.esim_state_disable);
        }
    }
}
