package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.garmin.proto.generated.a;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class CacheFileMetadataIndex {
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final String COLUMN_NAME = "name";
    private static final String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final String WHERE_NAME_EQUALS = "name = ?";
    private final DatabaseProvider databaseProvider;
    private String tableName;
    private static final String COLUMN_LENGTH = "length";
    private static final String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final String[] COLUMNS = {"name", COLUMN_LENGTH, COLUMN_LAST_TOUCH_TIMESTAMP};

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    public static void delete(DatabaseProvider databaseProvider, long j8) throws DatabaseIOException {
        String hexString = Long.toHexString(j8);
        try {
            String tableName = getTableName(hexString);
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                VersionTable.removeVersion(writableDatabase, 2, hexString);
                dropTable(writableDatabase, tableName);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e4) {
            a.g(e4);
        }
    }

    private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
        String strValueOf = String.valueOf(str);
        sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    private Cursor getCursor() {
        Assertions.checkNotNull(this.tableName);
        return this.databaseProvider.getReadableDatabase().query(this.tableName, COLUMNS, null, null, null, null, null);
    }

    private static String getTableName(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? TABLE_PREFIX.concat(strValueOf) : new String(TABLE_PREFIX);
    }

    public Map<String, CacheFileMetadata> getAll() throws DatabaseIOException {
        try {
            Cursor cursor = getCursor();
            try {
                HashMap map = new HashMap(cursor.getCount());
                while (cursor.moveToNext()) {
                    map.put((String) Assertions.checkNotNull(cursor.getString(0)), new CacheFileMetadata(cursor.getLong(1), cursor.getLong(2)));
                }
                cursor.close();
                return map;
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (SQLException e4) {
            a.g(e4);
            return null;
        }
    }

    public void initialize(long j8) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j8);
            this.tableName = getTableName(hexString);
            if (VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                    dropTable(writableDatabase, this.tableName);
                    String str = this.tableName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 108);
                    sb3.append("CREATE TABLE ");
                    sb3.append(str);
                    sb3.append(" (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.execSQL(sb3.toString());
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e4) {
            a.g(e4);
        }
    }

    public void remove(String str) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            this.databaseProvider.getWritableDatabase().delete(this.tableName, WHERE_NAME_EQUALS, new String[]{str});
        } catch (SQLException e4) {
            a.g(e4);
        }
    }

    public void removeAll(Set<String> set) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.tableName, WHERE_NAME_EQUALS, new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e4) {
            a.g(e4);
        }
    }

    public void set(String str, long j8, long j14) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(COLUMN_LENGTH, Long.valueOf(j8));
            contentValues.put(COLUMN_LAST_TOUCH_TIMESTAMP, Long.valueOf(j14));
            writableDatabase.replaceOrThrow(this.tableName, null, contentValues);
        } catch (SQLException e4) {
            a.g(e4);
        }
    }
}
