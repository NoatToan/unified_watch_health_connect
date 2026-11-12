package com.miui.tsmclient.database;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.util.ResUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TSMPublicProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10336a = "cards_info";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10337b = "bank_cards_count";
    public static final String c = "all_cards_count";

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        Context context = getContext();
        Bundle bundle2 = new Bundle();
        if (f10336a.equals(str)) {
            int issuedTransCardsCount = CardInfoManager.getInstance(context).getIssuedTransCardsCount();
            int bankCardsCount = CardInfoManager.getInstance(context).getBankCardsCount();
            String str4 = "";
            if (bankCardsCount == 0) {
                str3 = "";
            } else {
                str3 = bankCardsCount + ResUtils.getString(context, "bank_card_unit");
            }
            bundle2.putString(f10337b, str3);
            int mifareCardsCount = issuedTransCardsCount + bankCardsCount + CardInfoManager.getInstance(context).getMifareCardsCount();
            if (mifareCardsCount != 0) {
                str4 = mifareCardsCount + ResUtils.getString(context, "card_unit");
            }
            bundle2.putString(c, str4);
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
