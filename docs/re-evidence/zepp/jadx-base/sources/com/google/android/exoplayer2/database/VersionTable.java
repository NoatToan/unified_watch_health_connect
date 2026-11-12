package com.google.android.exoplayer2.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionTable {
    public static final int FEATURE_CACHE_CONTENT_METADATA = 1;
    public static final int FEATURE_CACHE_FILE_METADATA = 2;
    public static final int FEATURE_EXTERNAL = 1000;
    public static final int FEATURE_OFFLINE = 0;
    public static final int VERSION_UNSET = -1;
    private static final String a = "ExoPlayerVersions";
    private static final String b = "feature";
    private static final String c = "instance_uid";
    private static final String d = "version";
    private static final String e = "feature = ? AND instance_uid = ?";
    private static final String f = "PRIMARY KEY (feature, instance_uid)";
    private static final String g = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    private VersionTable() {
    }

    private static String[] a(int feature, String instance) {
        return new String[]{Integer.toString(feature), instance};
    }

    public static int getVersion(SQLiteDatabase database, int feature, String instanceUid) throws DatabaseIOException {
        try {
            if (!Util.tableExists(database, a)) {
                return -1;
            }
            Cursor cursorQuery = database.query(a, new String[]{"version"}, e, a(feature, instanceUid), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i = cursorQuery.getInt(0);
                cursorQuery.close();
                return i;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public static void removeVersion(SQLiteDatabase writableDatabase, int feature, String instanceUid) throws DatabaseIOException {
        try {
            if (Util.tableExists(writableDatabase, a)) {
                writableDatabase.delete(a, e, a(feature, instanceUid));
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public static void setVersion(SQLiteDatabase writableDatabase, int feature, String instanceUid, int version) throws DatabaseIOException {
        try {
            writableDatabase.execSQL(g);
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(feature));
            contentValues.put(c, instanceUid);
            contentValues.put("version", Integer.valueOf(version));
            writableDatabase.replaceOrThrow(a, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
