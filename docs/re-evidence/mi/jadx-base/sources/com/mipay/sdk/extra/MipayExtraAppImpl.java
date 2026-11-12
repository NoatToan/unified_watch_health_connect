package com.mipay.sdk.extra;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
class MipayExtraAppImpl implements IMipayExtra {
    private static final String TAG = "MipayExtra_AppImpl";
    private static final String URI_APP_BIND_CARD = "mipay://walletapp?id=mipay.bindCard";
    private static final String URI_APP_PARTNRT_IDENTITY_VERIFY = "https://app.mipay.com?id=mipay.partnerIdentityVerify";

    private Intent buildPartnerIdentityVerify(String str, String str2, boolean z) {
        String strEncode;
        try {
            strEncode = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        String str3 = "https://app.mipay.com?id=mipay.partnerIdentityVerify&miref=" + str2 + "&requestData=" + strEncode + "&skipIntroduction=" + z;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str3));
        intent.setPackage("com.mipay.wallet");
        return intent;
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2) {
        identityVerify(activity, str, str2, false);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mipay://walletapp?id=mipay.bindCard&miref=" + str));
        intent.setPackage("com.mipay.wallet");
        activity.startActivityForResult(intent, 10000);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2) {
        identityVerify(fragment, str, str2, false);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2, boolean z) {
        activity.startActivityForResult(buildPartnerIdentityVerify(str, str2, z), 10001);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2, boolean z) {
        fragment.startActivityForResult(buildPartnerIdentityVerify(str, str2, z), 10001);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Fragment fragment, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mipay://walletapp?id=mipay.bindCard&miref=" + str));
        intent.setPackage("com.mipay.wallet");
        fragment.startActivityForResult(intent, 10000);
    }
}
