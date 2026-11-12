package com.mibi.sdk.channel.mipay;

import android.content.Context;
import android.content.Intent;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeMethodParser;

/* JADX INFO: loaded from: classes5.dex */
public class MipayRecharge implements Recharge {
    public static final String CHANNEL = "MIPAY";

    @Override // com.mibi.sdk.component.recharge.Recharge
    public boolean available(Context context) {
        return true;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public String getChannel() {
        return "MIPAY";
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public Intent getEntryIntent(boolean z) {
        return new Intent("com.mibi.sdk.action.MIPAY");
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public RechargeMethodParser getParser() {
        return new e();
    }
}
