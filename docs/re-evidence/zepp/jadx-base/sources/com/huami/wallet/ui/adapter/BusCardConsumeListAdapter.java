package com.huami.wallet.ui.adapter;

import android.content.Context;
import android.text.format.DateUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.lib.entity.ConsumeRecord;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.MoneyUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardConsumeListAdapter extends BaseQuickAdapter<ConsumeRecord, BaseViewHolder> {
    public final long a;

    public BusCardConsumeListAdapter() {
        super(R.layout.wl_item_bus_card_trade_record);
        this.a = 1483203661000L;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, ConsumeRecord consumeRecord) {
        Context context = baseViewHolder.itemView.getContext();
        baseViewHolder.setText(R.id.title, R.string.wl_consume);
        String dateTime = DateUtils.formatDateTime(context, consumeRecord.timestamp, 21);
        long j = consumeRecord.timestamp;
        if (j <= 1483203661000L) {
            dateTime = DateUtils.formatDateTime(context, j, 25);
        }
        baseViewHolder.setText(R.id.consume_time, dateTime);
        baseViewHolder.setText(R.id.amount, String.format(Locale.getDefault(), "-%s", context.getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(consumeRecord.amount))));
        baseViewHolder.setText(R.id.state, R.string.wl_success);
    }
}
