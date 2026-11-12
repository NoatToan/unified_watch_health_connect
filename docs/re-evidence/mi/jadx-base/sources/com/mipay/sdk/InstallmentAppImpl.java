package com.mipay.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class InstallmentAppImpl implements ICreditInstallment {
    private static final String TAG = "MipayWeb_installmentApp";
    private final Mipay mMipay;

    public InstallmentAppImpl(Context context) {
        this.mMipay = Mipay.get(context);
    }

    @Override // com.mipay.sdk.ICreditInstallment
    public void pay(Activity activity, String str, Bundle bundle) {
        this.mMipay.installmentPay(activity, str, bundle);
    }

    @Override // com.mipay.sdk.ICreditInstallment
    public void pay(Fragment fragment, String str, Bundle bundle) {
        this.mMipay.installmentPay(fragment, str, bundle);
    }
}
