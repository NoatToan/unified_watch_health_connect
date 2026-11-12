package com.mibi.sdk.deduct;

import android.content.Context;
import android.content.Intent;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeMethodParser;
import com.mibi.sdk.payment.Payment;

/* JADX INFO: loaded from: classes5.dex */
public class h implements Recharge {
    @Override // com.mibi.sdk.component.recharge.Recharge
    public boolean available(Context context) {
        return true;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public String getChannel() {
        return Payment.DEDUCT_CHANNEL_UNIONPAY;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public Intent getEntryIntent(boolean z) {
        return null;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public RechargeMethodParser getParser() {
        return new i();
    }
}
