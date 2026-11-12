package com.huami.watch.companion.usersettings;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class SettingsProvider extends ContentProvider {
    public static final Uri CONTENT_URI = Uri.parse("content://com.huami.watch.companion.settings");
    private static final String c = "com.huami.watch.companion.settings";
    private SettingsDBHelper a;
    private SQLiteDatabase b;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.b.delete("Settings", str, strArr);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        if (this.b.insert("Settings", null, contentValues) > 0) {
            return uri;
        }
        throw new SQLException("Failed to add a record into " + uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        SettingsDBHelper settingsDBHelper = new SettingsDBHelper(getContext());
        this.a = settingsDBHelper;
        SQLiteDatabase writableDatabase = settingsDBHelper.getWritableDatabase();
        this.b = writableDatabase;
        return writableDatabase != null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.b.query("Settings", strArr, str, strArr2, str2, null, null);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.b.update("Settings", contentValues, str, strArr);
    }
}
