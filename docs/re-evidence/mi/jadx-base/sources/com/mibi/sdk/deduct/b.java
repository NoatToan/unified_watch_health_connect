package com.mibi.sdk.deduct;

import android.content.Context;
import android.content.Intent;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeMethodParser;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Recharge {
    @Override // com.mibi.sdk.component.recharge.Recharge
    public boolean available(Context context) {
        return true;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public String getChannel() {
        return "ALIPAYDEDUCT";
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public Intent getEntryIntent(boolean z) {
        return null;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public RechargeMethodParser getParser() {
        return new d();
    }
}
