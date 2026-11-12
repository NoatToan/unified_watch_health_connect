package com.weibo.ssosdk.oaid.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
class d implements IOAID {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            Objects.requireNonNull(cursorQuery);
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
            if (string == null || string.length() == 0) {
                throw new OAIDException("OAID query failed");
            }
            iGetter.onOAIDGetComplete(string);
        } catch (Exception e) {
            iGetter.onOAIDGetError(e);
        }
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        try {
            return this.a.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
