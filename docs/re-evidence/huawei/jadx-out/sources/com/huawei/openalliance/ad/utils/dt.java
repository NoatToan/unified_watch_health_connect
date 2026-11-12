package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class dt {
    public static String a(Context context) {
        String string = "";
        Cursor cursor = null;
        try {
            try {
                Uri uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
                if (!as.b(context, uri)) {
                    Log.w("VIdentifierManager", "invalid provider");
                    return "";
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return string;
            } catch (Exception unused) {
                hw.c("VIdentifierManager", "contentResolver query exception");
                if (0 != 0) {
                    cursor.close();
                }
                return "";
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
