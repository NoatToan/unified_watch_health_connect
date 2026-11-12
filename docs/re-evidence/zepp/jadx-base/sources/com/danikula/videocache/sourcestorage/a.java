package com.danikula.videocache.sourcestorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.danikula.videocache.Preconditions;
import com.danikula.videocache.SourceInfo;

/* JADX INFO: loaded from: classes2.dex */
class a extends SQLiteOpenHelper implements SourceInfoStorage {
    private static final String a = "SourceInfo";
    private static final String b = "_id";
    private static final String c = "url";
    private static final String d = "length";
    private static final String e = "mime";
    private static final String[] f = {"_id", "url", "length", e};
    private static final String g = "CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);";

    public a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        Preconditions.checkNotNull(context);
    }

    private ContentValues a(SourceInfo sourceInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", sourceInfo.url);
        contentValues.put("length", Long.valueOf(sourceInfo.length));
        contentValues.put(e, sourceInfo.mime);
        return contentValues;
    }

    private SourceInfo b(Cursor cursor) {
        return new SourceInfo(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow(e)));
    }

    @Override // com.danikula.videocache.sourcestorage.SourceInfoStorage
    public SourceInfo get(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Preconditions.checkNotNull(str);
        SourceInfo sourceInfoB = null;
        try {
            cursorQuery = getReadableDatabase().query(a, f, "url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        sourceInfoB = b(cursorQuery);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return sourceInfoB;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Preconditions.checkNotNull(sQLiteDatabase);
        sQLiteDatabase.execSQL(g);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // com.danikula.videocache.sourcestorage.SourceInfoStorage
    public void put(String str, SourceInfo sourceInfo) {
        Preconditions.checkAllNotNull(str, sourceInfo);
        boolean z = get(str) != null;
        ContentValues contentValuesA = a(sourceInfo);
        if (z) {
            getWritableDatabase().update(a, contentValuesA, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert(a, null, contentValuesA);
        }
    }

    @Override // com.danikula.videocache.sourcestorage.SourceInfoStorage
    public void release() {
        close();
    }
}
