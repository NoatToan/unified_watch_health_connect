package com.huami.wallet.ui.adapter;

import android.content.Context;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.wallet.lib.entity.RechargeRecord;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.utils.DateTimeUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardRechargeListAdapter extends BaseQuickAdapter<RechargeRecord, BaseViewHolder> {
    public BusCardRechargeListAdapter() {
        super(R.layout.wl_item_bus_card_trade_record);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, RechargeRecord rechargeRecord) {
        String string;
        Context context = baseViewHolder.itemView.getContext();
        int i = rechargeRecord.type;
        String string2 = "";
        if (i == 1) {
            string = context.getString(R.string.wl_open_card_and_recharge);
        } else if (i == 2) {
            string = context.getString(R.string.wl_recharge);
        } else if (i == 3) {
            string = context.getString(R.string.wl_open_card);
        } else if (i != 4) {
            string = i != 5 ? "" : context.getString(R.string.wl_r_shift_in_tile);
        } else {
            string = context.getString(R.string.wl_r_shift_out_tile);
        }
        baseViewHolder.setText(R.id.title, string);
        baseViewHolder.setText(R.id.consume_time, DateTimeUtils.formatDateTime(context, rechargeRecord.timestamp));
        String str = "+%s";
        switch (rechargeRecord.state) {
            case 1:
                string2 = context.getString(R.string.wl_recharge_success);
                break;
            case 2:
                string2 = context.getString(R.string.wl_open_card_failed);
                str = "%s";
                break;
            case 3:
                string2 = context.getString(R.string.wl_open_card_success_but_recharge_failed);
                str = "%s";
                break;
            case 4:
                string2 = context.getString(R.string.wl_recharge_success);
                break;
            case 5:
                string2 = context.getString(R.string.wl_recharge_fail);
                str = "%s";
                break;
            case 6:
            default:
                str = "%s";
                break;
            case 7:
                string2 = context.getString(R.string.wl_apply_to_refunding);
                str = "%s";
                break;
            case 8:
                string2 = context.getString(R.string.wl_refund_fail);
                str = "%s";
                break;
            case 9:
                string2 = context.getString(R.string.wl_refund_success);
                str = "%s";
                break;
            case 10:
                string2 = context.getString(R.string.wl_pure_open_card_success);
                break;
            case 11:
                string2 = context.getString(R.string.wl_pure_open_card_fail);
                break;
            case 12:
                string2 = context.getString(R.string.wl_r_shift_result_tip_in_success_0);
                str = "%s";
                break;
            case 13:
                string2 = context.getString(R.string.wl_r_shift_result_tip_in_fail_0);
                str = "%s";
                break;
            case 14:
                string2 = context.getString(R.string.wl_r_shift_result_tip_out_success_0);
                str = "%s";
                break;
            case 15:
                string2 = context.getString(R.string.wl_r_shift_result_tip_out_fail_0);
                str = "%s";
                break;
        }
        baseViewHolder.setText(R.id.state, string2);
        baseViewHolder.setText(R.id.amount, String.format(Locale.getDefault(), str, context.getString(R.string.wl_format_x_yuan, MoneyUtils.formatCentRMB(rechargeRecord.amount))));
    }
}
