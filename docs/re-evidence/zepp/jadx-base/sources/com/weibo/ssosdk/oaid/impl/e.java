package com.weibo.ssosdk.oaid.impl;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;

/* JADX INFO: loaded from: classes18.dex */
class e implements IOAID {
    private final Context a;

    public e(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        if (!supported()) {
            iGetter.onOAIDGetError(new OAIDException("Only supports Android 10.0 and above for Nubia"));
            return;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient == null) {
                return;
            }
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            if (Build.VERSION.SDK_INT >= 24) {
                contentProviderClientAcquireContentProviderClient.close();
            } else {
                contentProviderClientAcquireContentProviderClient.release();
            }
            if (bundleCall == null) {
                throw new OAIDException("OAID query failed: bundle is null");
            }
            String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
            if (string != null && string.length() != 0) {
                iGetter.onOAIDGetComplete(string);
            } else {
                throw new OAIDException("OAID query failed: " + bundleCall.getString("message"));
            }
        } catch (Exception e) {
            iGetter.onOAIDGetError(e);
        }
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
