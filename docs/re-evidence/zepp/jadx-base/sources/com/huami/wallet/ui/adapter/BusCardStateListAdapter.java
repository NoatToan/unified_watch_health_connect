package com.huami.wallet.ui.adapter;

import android.text.TextUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.entity.BusCardStateItem;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardStateListAdapter extends BaseQuickAdapter<BusCardStateItem, BaseViewHolder> {
    public BusCardStateListAdapter() {
        super(R.layout.wl_item_bus_card_state);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, BusCardStateItem busCardStateItem) {
        baseViewHolder.setText(R.id.title, busCardStateItem.title);
        int i = R.id.value;
        baseViewHolder.setText(i, busCardStateItem.value);
        baseViewHolder.setVisible(i, !TextUtils.isEmpty(busCardStateItem.value));
        baseViewHolder.addOnClickListener(i);
    }
}
