package com.alipay.sdk.m.s0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public Context d;

    public b(Context context) {
        this.d = context;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public String a(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str);
        } else {
            if (i != 2) {
                if (i != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = this.d.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
                    return null;
                }
                String string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                cursorQuery.close();
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str);
        }
        uri2 = uri;
        cursorQuery = this.d.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
            return null;
        }
        if (cursorQuery.moveToNext()) {
        }
        cursorQuery.close();
        return string;
    }
}
