package com.huawei.wear.wallet.proxy.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.wallet.proxy.InitWalletProxy;
import defpackage.xnd;
import defpackage.xyc;

/* JADX INFO: loaded from: classes46.dex */
public class ThirdContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        xnd.b("ThirdContentProvider", "getType enter", false);
        xyc.c("ThirdContentProvider", getContext());
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            Context context = getContext();
            if (!xyc.b(context)) {
                xnd.d("ThirdContentProvider", "getType, agreement is not accepted");
                return "ERROR:AGREEMENT_NOT_ACCEPTED";
            }
            if (initWalletProxyE != null) {
                Object contentProvider = initWalletProxyE.getContentProvider(context, "ThirdContentProvider", uri);
                xnd.b("ThirdContentProvider", "getType getContentProvider", false);
                if (contentProvider != null && (contentProvider instanceof String)) {
                    return contentProvider.toString();
                }
            }
            xnd.b("ThirdContentProvider", "getType is null", false);
            return "";
        } catch (ClassNotFoundException unused) {
            xnd.b("ThirdContentProvider", "getType, not PluginAvailable", false);
            return "ERROR:WALLET_PLUGIN_IS_UNAVAILABLE";
        }
    }
}
