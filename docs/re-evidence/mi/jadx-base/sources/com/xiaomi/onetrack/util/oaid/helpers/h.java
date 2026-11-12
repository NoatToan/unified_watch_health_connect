package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.onetrack.util.p;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13976a = "NubiaDeviceIDHelper";

    public String a(Context context) {
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            contentProviderClientAcquireContentProviderClient.close();
            return bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : "";
        } catch (Exception e) {
            p.a(f13976a, e.getMessage());
            return "";
        }
    }
}
