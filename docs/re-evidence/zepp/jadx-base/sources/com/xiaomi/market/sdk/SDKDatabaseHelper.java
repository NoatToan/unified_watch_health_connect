package com.xiaomi.market.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes22.dex */
public class SDKDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "xiaomi_market_sdk_update.db";
    public static final int DATABASE_VERSION = 1;
    private static final String TAG = "MarketSDKDatabaseHelper";
    private static SDKDatabaseHelper mHelper;

    private SDKDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private void createDownloadTable(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(Constants.Update.CREATE_TABLE);
    }

    public static SDKDatabaseHelper getHelper(Context context) {
        if (mHelper == null) {
            mHelper = new SDKDatabaseHelper(context);
        }
        return mHelper;
    }

    public synchronized long insert(String str, ContentValues contentValues) {
        return getWritableDatabase().insert(str, null, contentValues);
    }

    public long insertOrUpdateUpdate(ContentValues contentValues) {
        SQLiteStatement sQLiteStatementCompileStatement = getWritableDatabase().compileStatement("INSERT OR REPLACE INTO update_download(package_name,download_id,version_code,apk_url,apk_hash,diff_url,diff_hash,apk_path) VALUES(?,?,?,?,?,?,?,?)");
        sQLiteStatementCompileStatement.bindString(1, contentValues.getAsString("package_name"));
        sQLiteStatementCompileStatement.bindLong(2, contentValues.getAsLong("download_id").longValue());
        sQLiteStatementCompileStatement.bindLong(3, contentValues.getAsInteger(Constants.Update.VERSION_CODE).intValue());
        sQLiteStatementCompileStatement.bindString(4, contentValues.getAsString(Constants.Update.APK_URL));
        sQLiteStatementCompileStatement.bindString(5, contentValues.getAsString(Constants.Update.APK_HASH));
        sQLiteStatementCompileStatement.bindString(6, contentValues.getAsString(Constants.Update.DIFF_URL));
        sQLiteStatementCompileStatement.bindString(7, contentValues.getAsString(Constants.Update.DIFF_HASH));
        sQLiteStatementCompileStatement.bindString(8, contentValues.getAsString(Constants.Update.APK_PATH));
        sQLiteStatementCompileStatement.execute();
        return 1L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "create database");
        createDownloadTable(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5);
    }
}
