package com.mipay.sdk.extra;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ExtraProxy implements IMipayExtra {
    private IMipayBindCard getBindCardExtra(Context context) {
        return ExtraUtils.isBindCardAvailable(context) ? new MipayExtraAppImpl() : new MipayExtraWebImpl();
    }

    private IMipayIdentityVerify getVerifyExtra(Context context) {
        return ExtraUtils.isVerifyIdentityAvailable(context) ? new MipayExtraAppImpl() : new MipayExtraWebImpl();
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2) {
        getVerifyExtra(activity).identityVerify(activity, str, str2);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Activity activity, String str) {
        getBindCardExtra(activity).simpleBindCard(activity, str);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2) {
        getVerifyExtra(fragment.getActivity()).identityVerify(fragment, str, str2);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Fragment fragment, String str) {
        getBindCardExtra(fragment.getActivity()).simpleBindCard(fragment, str);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2, boolean z) {
        getVerifyExtra(activity).identityVerify(activity, str, str2, z);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2, boolean z) {
        getVerifyExtra(fragment.getActivity()).identityVerify(fragment, str, str2, z);
    }
}
