package com.miui.tsmclient.database;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.actions.SearchIntents;
import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TSMProvider extends ContentProvider {
    public static final int c = 0;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UriMatcher f10334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f10335b;

    public final int a(Uri uri, String str) {
        int iMatch = a().match(uri);
        if (iMatch < 0) {
            throw new IllegalArgumentException("Unknown uri: " + uri);
        }
        LogUtils.v(str + ": uri=" + uri + ", match is " + iMatch);
        return iMatch;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String str2;
        SQLiteDatabase writableDatabase = this.f10335b.getWritableDatabase();
        int iA = a(uri, "delete");
        if (iA == 0) {
            int iDelete = writableDatabase.delete(DatabaseConstants.TABLE_CACHE, str, strArr);
            if (iDelete > 0) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return iDelete;
        }
        if (iA == 4) {
            str2 = "travel_info";
        } else {
            if (iA != 6) {
                return 0;
            }
            str2 = DatabaseConstants.TABLE_DATA_STAT;
        }
        return writableDatabase.delete(str2, str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) throws Throwable {
        SQLiteDatabase writableDatabase = this.f10335b.getWritableDatabase();
        int iA = a(uri, "insert");
        Cursor cursor = null;
        if (iA == 0) {
            String str = "key='" + contentValues.getAsString("key") + "'";
            try {
                Cursor cursorQuery = writableDatabase.query(DatabaseConstants.TABLE_CACHE, null, str, null, null, null, null);
                try {
                    if (cursorQuery.getCount() > 0) {
                        int iUpdate = update(uri, contentValues, str, null);
                        if (iUpdate > 0) {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, iUpdate);
                            cursorQuery.close();
                            return uriWithAppendedId;
                        }
                    } else {
                        long jInsert = writableDatabase.insert(DatabaseConstants.TABLE_CACHE, null, contentValues);
                        if (jInsert > 0) {
                            getContext().getContentResolver().notifyChange(uri, null);
                            Uri uriWithAppendedId2 = ContentUris.withAppendedId(uri, jInsert);
                            cursorQuery.close();
                            return uriWithAppendedId2;
                        }
                    }
                    cursorQuery.close();
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (iA == 5) {
            long jInsert2 = writableDatabase.insert(DatabaseConstants.TABLE_NO_PROMPT_BULLETIN, null, contentValues);
            if (jInsert2 > 0) {
                return ContentUris.withAppendedId(uri, jInsert2);
            }
        } else if (iA == 6) {
            long jInsert3 = writableDatabase.insert(DatabaseConstants.TABLE_DATA_STAT, null, contentValues);
            if (jInsert3 > 0) {
                return ContentUris.withAppendedId(uri, jInsert3);
            }
        } else if (iA == 7) {
            long jInsert4 = writableDatabase.insert("travel_info", null, contentValues);
            if (jInsert4 > 0) {
                return ContentUris.withAppendedId(uri, jInsert4);
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f10335b = new b(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase = this.f10335b.getReadableDatabase();
        int iA = a(uri, SearchIntents.EXTRA_QUERY);
        if (iA == 0) {
            return readableDatabase.query(DatabaseConstants.TABLE_CACHE, strArr, str, strArr2, null, null, str2);
        }
        switch (iA) {
            case 2:
                return readableDatabase.query("bank_bin", strArr, str, strArr2, null, null, str2);
            case 3:
                return readableDatabase.query("bank_bin,bank_info", strArr, "bank_bin.bank_name=bank_info.bank_name AND " + str, strArr2, null, null, str2);
            case 4:
                return readableDatabase.query("trans_card_info", strArr, str, strArr2, null, null, str2);
            case 5:
                return readableDatabase.query(DatabaseConstants.TABLE_NO_PROMPT_BULLETIN, strArr, str, strArr2, null, null, str2);
            case 6:
                return readableDatabase.query(DatabaseConstants.TABLE_DATA_STAT, strArr, str, strArr2, null, null, str2);
            case 7:
                return readableDatabase.query("travel_info", strArr, str, strArr2, null, null, str2);
            default:
                return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f10335b.getWritableDatabase();
        if (a(uri, "update") != 0) {
            return 0;
        }
        int iUpdate = writableDatabase.update(DatabaseConstants.TABLE_CACHE, contentValues, str, strArr);
        if (iUpdate > 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }
        return iUpdate;
    }

    public final synchronized UriMatcher a() {
        try {
            if (this.f10334a == null) {
                UriMatcher uriMatcher = new UriMatcher(-1);
                this.f10334a = uriMatcher;
                String str = DatabaseConstants.AUTHORITY;
                uriMatcher.addURI(str, DatabaseConstants.TABLE_CACHE, 0);
                this.f10334a.addURI(str, "bank_bin", 2);
                this.f10334a.addURI(str, "bank_info", 3);
                this.f10334a.addURI(str, "trans_card_info", 4);
                this.f10334a.addURI(str, DatabaseConstants.TABLE_NO_PROMPT_BULLETIN, 5);
                this.f10334a.addURI(str, DatabaseConstants.TABLE_DATA_STAT, 6);
                this.f10334a.addURI(str, "travel_info", 7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10334a;
    }
}
