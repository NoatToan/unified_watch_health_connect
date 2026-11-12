package com.mipay.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class MipayAppImpl implements IMipay {
    private static final String TAG = "MipayWeb_PayApp";
    private final Mipay mMipay;

    public MipayAppImpl(Context context) {
        this.mMipay = Mipay.get(context);
    }

    @Override // com.mipay.sdk.IMipay
    public void pay(Activity activity, String str, Bundle bundle) {
        this.mMipay.pay(activity, str, bundle);
    }

    @Override // com.mipay.sdk.IMipay
    public void pay(Fragment fragment, String str, Bundle bundle) {
        this.mMipay.pay(fragment, str, bundle);
    }
}
