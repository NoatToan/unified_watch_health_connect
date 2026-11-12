package com.huawei.hwdataaccessmodel.db.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HwContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    private DbContentProvider b() {
        return DbContentProvider.b(getContext());
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (uri == null) {
            LogUtil.e("HWContentProvider", "query uri is null");
            return null;
        }
        SQLiteDatabase readableDatabase = b().getReadableDatabase();
        String string = uri.toString();
        String strSubstring = string.substring(string.lastIndexOf("/") + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new IllegalArgumentException("This is a unknown Uri" + string);
        }
        try {
            return readableDatabase.query(strSubstring, strArr, str, strArr2, null, null, str2);
        } catch (SQLiteException e) {
            LogUtil.e("HWContentProvider", "query ex=", LogUtil.c(e));
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (uri == null) {
            LogUtil.e("HWContentProvider", "insert uri is null");
            return null;
        }
        if (contentValues == null) {
            LogUtil.e("HWContentProvider", "insert values is null");
            return null;
        }
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        String string = uri.toString();
        String strSubstring = string.substring(string.lastIndexOf("/") + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new IllegalArgumentException("This is a unknown Uri" + uri.toString());
        }
        Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "/" + writableDatabase.insert(strSubstring, null, contentValues));
        getContext().getContentResolver().notifyChange(uri, null);
        return uriWithAppendedPath;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (uri == null) {
            LogUtil.e("HWContentProvider", "delete uri is null");
            return 0;
        }
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        String string = uri.toString();
        String strSubstring = string.substring(string.lastIndexOf("/") + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new IllegalArgumentException("This is a unknown Uri" + uri.toString());
        }
        return writableDatabase.delete(strSubstring, str, strArr);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (uri == null) {
            LogUtil.e("HWContentProvider", "update uri is null");
            return 0;
        }
        if (contentValues == null) {
            LogUtil.e("HWContentProvider", "update values is null");
            return 0;
        }
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        String string = uri.toString();
        String strSubstring = string.substring(string.lastIndexOf("/") + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new IllegalArgumentException("This is a unknown Uri" + uri.toString());
        }
        return writableDatabase.update(strSubstring, contentValues, str, strArr);
    }
}
