package com.mipay.sdk.extra;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.mipay.sdk.app.MipayWebActivity;
import com.mipay.sdk.app.WebConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
class MipayExtraWebImpl implements IMipayExtra {
    private static final String TAG = "MipayExtra_WebImpl";
    private static final String URI_PARTNRT_IDENTITY_VERIFY = "https://app.mipay.com?id=mipay.partnerIdentityVerify";
    private static final String URI_PARTNRT_IDENTITY_VERIFY_STAGING = "http://staging.mipay.xiaomi.com/identity/partner/upload";
    private static final String URI_PARTNRT_IDENTITY_VERIFY_TEST = "http://test.mipay.xiaomi.com/identity/partner/upload";
    private static final String URL_BIND_CARD = "https://m.pay.xiaomi.com/home/toOnlyBindPage";
    private static final String URL_BIND_CARD_STAGING = "http://staging.m.pay.xiaomi.com/home/toOnlyBindPage";
    private static final String URL_BIND_CARD_TEST = "http://test.m.pay.xiaomi.com/home/toOnlyBindPage";

    private Intent buildPartnerVerifyIdentity(Activity activity, String str, String str2, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) MipayWebActivity.class);
        intent.putExtra(WebConstants.KEY_URL, getPartnerVerifyIdentityUrl(str, str2, z));
        intent.setPackage(activity.getPackageName());
        return intent;
    }

    private String getBindCardUrl(String str) {
        if (WebConstants.STAGING) {
            return "http://staging.m.pay.xiaomi.com/home/toOnlyBindPage?ref=" + str;
        }
        if (WebConstants.TEST) {
            return "http://test.m.pay.xiaomi.com/home/toOnlyBindPage?ref=" + str;
        }
        return "https://m.pay.xiaomi.com/home/toOnlyBindPage?ref=" + str;
    }

    private String getPartnerVerifyIdentityUrl(String str, String str2, boolean z) {
        String strEncode;
        try {
            strEncode = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        if (WebConstants.STAGING) {
            return URI_PARTNRT_IDENTITY_VERIFY_STAGING + "?requestData=" + strEncode + "&miref=" + str2 + "&skipIntroduction=" + z;
        }
        if (WebConstants.TEST) {
            return URI_PARTNRT_IDENTITY_VERIFY_TEST + "?requestData=" + strEncode + "&miref=" + str2 + "&skipIntroduction=" + z;
        }
        return URI_PARTNRT_IDENTITY_VERIFY + "&requestData=" + strEncode + "&miref=" + str2 + "&skipIntroduction=" + z;
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2) {
        identityVerify(activity, str, str2, false);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Activity activity, String str) {
        if (activity == null) {
            throw new IllegalArgumentException("activity should not be null");
        }
        String bindCardUrl = getBindCardUrl(str);
        Intent intent = new Intent(activity, (Class<?>) MipayWebActivity.class);
        intent.putExtra(WebConstants.KEY_URL, bindCardUrl);
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, 10000);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2) {
        identityVerify(fragment, str, str2, false);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Activity activity, String str, String str2, boolean z) {
        activity.startActivityForResult(buildPartnerVerifyIdentity(activity, str, str2, z), 10001);
    }

    @Override // com.mipay.sdk.extra.IMipayIdentityVerify
    public void identityVerify(Fragment fragment, String str, String str2, boolean z) {
        fragment.startActivityForResult(buildPartnerVerifyIdentity(fragment.getActivity(), str, str2, z), 10001);
    }

    @Override // com.mipay.sdk.extra.IMipayBindCard
    public void simpleBindCard(Fragment fragment, String str) {
        if (fragment != null) {
            String bindCardUrl = getBindCardUrl(str);
            Intent intent = new Intent(fragment.getActivity(), (Class<?>) MipayWebActivity.class);
            intent.putExtra(WebConstants.KEY_URL, bindCardUrl);
            intent.setPackage(fragment.getActivity().getPackageName());
            fragment.startActivityForResult(intent, 10000);
            return;
        }
        throw new IllegalArgumentException("activity should not be null");
    }
}
