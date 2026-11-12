package com.xmlywind.devicehelper.oaId.helpers;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public class d {
    private Context a;

    public d(Context context) {
        this.a = context;
    }

    private String a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex > 0) {
                return cursor.getString(columnIndex);
            }
        }
        return null;
    }

    private boolean a() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            return (packageManager == null || packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(DevicesIDsHelper.AppIdsUpdater appIdsUpdater) {
        if (a()) {
            try {
                Cursor cursorQuery = this.a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
                String strA = a(cursorQuery);
                if (appIdsUpdater != null) {
                    appIdsUpdater.OnIdsAvalid(strA);
                }
                cursorQuery.close();
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
        }
    }
}
