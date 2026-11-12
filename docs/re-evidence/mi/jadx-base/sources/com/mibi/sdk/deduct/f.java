package com.mibi.sdk.deduct;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mibi.sdk.component.recharge.Recharge;
import com.mibi.sdk.component.recharge.RechargeMethodParser;
import com.mibi.sdk.payment.Payment;
import com.miui.tsmclient.util.Constants;

/* JADX INFO: loaded from: classes5.dex */
public class f implements Recharge {
    public final boolean a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.mipay.wallet");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(Constants.URI_SCHEME);
        builder.authority(Constants.URI_AUTHORITY_MIPAY);
        builder.appendQueryParameter("id", "mipay.partnerAutoPay");
        intent.setData(builder.build());
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public boolean available(Context context) {
        return a(context);
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public String getChannel() {
        return Payment.DEDUCT_CHANNEL_MIPAY;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public Intent getEntryIntent(boolean z) {
        return null;
    }

    @Override // com.mibi.sdk.component.recharge.Recharge
    public RechargeMethodParser getParser() {
        return new g();
    }
}
