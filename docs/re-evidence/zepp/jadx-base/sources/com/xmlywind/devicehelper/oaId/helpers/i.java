package com.xmlywind.devicehelper.oaId.helpers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes22.dex */
public class i {
    private Context b;
    private boolean c = false;
    public String a = null;

    public i(Context context) {
        this.b = context;
    }

    public String a() {
        Cursor cursorQuery = this.b.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
