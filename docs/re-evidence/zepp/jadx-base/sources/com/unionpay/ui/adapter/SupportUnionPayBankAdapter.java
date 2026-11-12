package com.unionpay.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.entity.SupportBank;

/* JADX INFO: loaded from: classes18.dex */
public class SupportUnionPayBankAdapter extends BaseQuickAdapter<SupportBank, BaseViewHolder> {
    public SupportUnionPayBankAdapter() {
        super(R.layout.wl_watch_bank_item_support_bank);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, SupportBank supportBank) {
        baseViewHolder.setText(R.id.support_bank_name, supportBank.bankName);
        baseViewHolder.setVisible(R.id.support_bank_debit, supportBank.supportTypes.contains("01"));
        baseViewHolder.setVisible(R.id.support_bank_credit, supportBank.supportTypes.contains("02"));
    }
}
