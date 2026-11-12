package com.huami.wallet.ui.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.MoneyUtils;

/* JADX INFO: loaded from: classes16.dex */
public class PayAmountGridAdapter extends BaseQuickAdapter<Fee, BaseViewHolder> {
    private Fee a;

    public PayAmountGridAdapter() {
        super(R.layout.wl_item_pay_amount);
    }

    private void a(int i, boolean z) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) getRecyclerView().findViewHolderForAdapterPosition(i + getHeaderLayoutCount());
        if (baseViewHolder != null) {
            b(baseViewHolder, z);
        }
    }

    private void b(BaseViewHolder baseViewHolder, boolean z) {
        baseViewHolder.itemView.setSelected(z);
        TextViewCompat.setTextAppearance((TextView) baseViewHolder.getView(R.id.original_amount), z ? R.style.TextAppearance_MiFit_Title3_Blue : R.style.TextAppearance_MiFit_Title3_Inverse);
        TextViewCompat.setTextAppearance((TextView) baseViewHolder.getView(R.id.actual_pay_amount), z ? R.style.TextAppearance_MiFit_Caption_Blue : R.style.TextAppearance_MiFit_Caption_Inverse);
    }

    public void selectedItem(Fee fee) {
        int iIndexOf = this.mData.indexOf(this.a);
        int iIndexOf2 = this.mData.indexOf(fee);
        this.a = fee;
        if ((iIndexOf >= 0) & (iIndexOf < this.mData.size())) {
            a(iIndexOf, false);
        }
        if ((iIndexOf2 >= 0) && (iIndexOf2 < this.mData.size())) {
            a(iIndexOf2, true);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, Fee fee) {
        Context context = baseViewHolder.itemView.getContext();
        TextView textView = (TextView) baseViewHolder.getView(R.id.original_amount);
        int i = R.string.wl_format_x_yuan;
        textView.setText(context.getString(i, MoneyUtils.formatCentRMB(fee.rechargeAmountRaw)));
        if (fee.rechargeAmountDiscount == 0) {
            textView.getPaint().setFlags(0);
        } else {
            textView.getPaint().setFlags(16);
        }
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.actual_pay_amount);
        textView2.setText(context.getString(R.string.wl_format_actual_pay_x, context.getString(i, MoneyUtils.formatCentRMB(fee.rechargeAmountRaw - fee.rechargeAmountDiscount))));
        textView2.setVisibility(fee.rechargeAmountDiscount <= 0 ? 8 : 0);
        b(baseViewHolder, fee.equals(this.a));
    }
}
