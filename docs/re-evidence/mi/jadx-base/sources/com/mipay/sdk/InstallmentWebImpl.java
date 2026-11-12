package com.mipay.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.mipay.sdk.app.MipayWebActivity;
import com.mipay.sdk.app.WebConstants;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class InstallmentWebImpl implements ICreditInstallment {
    private static final String TAG = "MipayWeb_installmentWeb";
    private static final String URL_MIPAY_AUTHORITY = "m.mipay.com";
    private static final String URL_MIPAY_AUTHORITY_STAGING = "staging.m.pay.mipay.com";
    private static final String URL_MIPAY_AUTHORITY_TEST = "test.m.pay.xiaomi.com";
    private static final String URL_MIPAY_PAY_PATH = "credit/installment";
    private static final String URL_SCHEME = "https";
    private static final String URL_SCHEME_STAGING = "http";
    private static final String URL_SCHEME_TEST = "http";

    private String buildOrderUrl(String str) {
        TreeMap<String, String> treeMapBuildOrderedMap = buildOrderedMap(str);
        if (treeMapBuildOrderedMap.isEmpty()) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        if (WebConstants.STAGING) {
            builder.authority(URL_MIPAY_AUTHORITY_STAGING);
            builder.scheme("http");
        } else if (WebConstants.TEST) {
            builder.authority(URL_MIPAY_AUTHORITY_TEST);
            builder.scheme("http");
        } else {
            builder.authority(URL_MIPAY_AUTHORITY);
            builder.scheme("https");
        }
        builder.appendPath(URL_MIPAY_PAY_PATH);
        for (String str2 : treeMapBuildOrderedMap.keySet()) {
            builder.appendQueryParameter(str2, treeMapBuildOrderedMap.get(str2));
        }
        return builder.toString();
    }

    private TreeMap<String, String> buildOrderedMap(String str) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append("order info is empty: ");
        sb.append(TextUtils.isEmpty(str));
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                treeMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException unused) {
        }
        return treeMap;
    }

    @Override // com.mipay.sdk.ICreditInstallment
    public void pay(Activity activity, String str, Bundle bundle) {
        if (activity == null) {
            throw new IllegalArgumentException("activity should not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("order cannot be empty");
        }
        String strBuildOrderUrl = buildOrderUrl(str);
        Intent intent = new Intent(activity, (Class<?>) MipayWebActivity.class);
        intent.putExtra(WebConstants.KEY_URL, strBuildOrderUrl);
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, Mipay.REQUEST_CREDIT_INSTALLMENT);
        StringBuilder sb = new StringBuilder();
        sb.append("start web activity using activity, size: ");
        sb.append(strBuildOrderUrl == null ? 0 : strBuildOrderUrl.length());
    }

    @Override // com.mipay.sdk.ICreditInstallment
    public void pay(Fragment fragment, String str, Bundle bundle) {
        if (fragment != null) {
            if (!TextUtils.isEmpty(str)) {
                String strBuildOrderUrl = buildOrderUrl(str);
                Intent intent = new Intent(fragment.getActivity(), (Class<?>) MipayWebActivity.class);
                intent.putExtra(WebConstants.KEY_URL, strBuildOrderUrl);
                intent.setPackage(fragment.getActivity().getPackageName());
                fragment.startActivityForResult(intent, Mipay.REQUEST_CREDIT_INSTALLMENT);
                StringBuilder sb = new StringBuilder();
                sb.append("start web activity using fragment, size: ");
                sb.append(strBuildOrderUrl == null ? 0 : strBuildOrderUrl.length());
                return;
            }
            throw new IllegalArgumentException("order cannot be empty");
        }
        throw new IllegalArgumentException("fragment should not be null");
    }
}
