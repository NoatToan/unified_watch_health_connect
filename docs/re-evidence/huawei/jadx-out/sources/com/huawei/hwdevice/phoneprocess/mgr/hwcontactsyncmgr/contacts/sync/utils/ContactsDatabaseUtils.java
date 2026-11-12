package com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class ContactsDatabaseUtils {

    public interface ResultCallback<R> {
        void onResult(R r);
    }

    public static void a(e eVar, ResultCallback<Cursor> resultCallback) {
        if (eVar == null || resultCallback == null) {
            LogUtil.j("ContactsDatabaseUtils", "query: input parameter is null.");
            return;
        }
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        if (contentResolver == null) {
            LogUtil.j("ContactsDatabaseUtils", "query: resolver is null.");
            return;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(eVar.d, eVar.f17484c, eVar.f17483b, eVar.f17482a, eVar.e);
            resultCallback.onResult(cursorQuery);
        } catch (CursorIndexOutOfBoundsException | SQLiteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException unused) {
            LogUtil.e("ContactsDatabaseUtils", "getContactIdList: occurred Exception.");
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public static void c(Cursor cursor, int i, ResultCallback<String> resultCallback) {
        if (d(cursor)) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: cursor is null or cannot move.");
            return;
        }
        if (resultCallback == null) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: out data list is null.");
        } else if (!d(cursor, i)) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: columnIndex is invalid.");
        } else {
            do {
                resultCallback.onResult(cursor.getString(i));
            } while (cursor.moveToNext());
        }
    }

    public static void a(Cursor cursor, int i, ResultCallback<String> resultCallback) {
        if (d(cursor)) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: cursor is null or cannot move.");
            return;
        }
        if (resultCallback == null) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: out data list is null.");
            return;
        }
        if (!d(cursor, i)) {
            LogUtil.j("ContactsDatabaseUtils", "parseDataList: columnIndex is invalid.");
            return;
        }
        String str = "-1";
        do {
            String string = cursor.getString(i);
            String string2 = cursor.getString(1);
            if (!string2.equals(str)) {
                resultCallback.onResult(string);
                str = string2;
            } else {
                LogUtil.a("ContactsDatabaseUtils", "preContactId is : ", str, " currentContactId is : ", string2);
            }
        } while (cursor.moveToNext());
    }

    public static boolean d(Cursor cursor) {
        return cursor == null || !cursor.moveToFirst();
    }

    private static boolean d(Cursor cursor, int i) {
        if (cursor != null) {
            return i >= 0 && i < cursor.getColumnCount();
        }
        LogUtil.j("ContactsDatabaseUtils", "isValidIndex: cursor is null.");
        return false;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f17482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f17484c;
        private Uri d;
        private String e;

        public e e(Uri uri) {
            this.d = uri;
            return this;
        }

        public e a(String[] strArr) {
            if (strArr != null) {
                this.f17484c = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            return this;
        }

        public e d(String str) {
            this.f17483b = str;
            return this;
        }

        public e e(String[] strArr) {
            if (strArr != null) {
                this.f17482a = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            return this;
        }

        public e c(String str) {
            this.e = str;
            return this;
        }
    }
}
