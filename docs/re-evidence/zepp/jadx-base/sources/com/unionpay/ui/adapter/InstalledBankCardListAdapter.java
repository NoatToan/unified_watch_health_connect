package com.unionpay.ui.adapter;

import android.text.TextUtils;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.util.UnionImageLoadUtils;
import com.unionpay.util.UnionPayUtil;

/* JADX INFO: loaded from: classes18.dex */
public class InstalledBankCardListAdapter extends BaseQuickAdapter<UniteAppDetail, BaseViewHolder> {
    public InstalledBankCardListAdapter() {
        super(R.layout.wl_watch_bank_item_installed_bank_card);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, UniteAppDetail uniteAppDetail) {
        UnionImageLoadUtils.loadImage((ImageView) baseViewHolder.getView(R.id.card_img), uniteAppDetail.getAppIcon(), R.drawable.wl_watch_bank_card_default);
        String string = this.mContext.getString(R.string.wl_support_bank_debit);
        if ("02".equals(uniteAppDetail.getCardType())) {
            string = this.mContext.getString(R.string.wl_support_bank_credit);
        }
        baseViewHolder.setText(R.id.card_info, this.mContext.getString(R.string.wl_union_card_name_no, string, uniteAppDetail.getSPan()));
        String unionCardStatusText = UnionPayUtil.getUnionCardStatusText(this.mContext, uniteAppDetail.getStatus().getStatus());
        int i = R.id.card_state;
        baseViewHolder.setText(i, unionCardStatusText);
        baseViewHolder.setVisible(i, !TextUtils.isEmpty(unionCardStatusText));
    }
}
