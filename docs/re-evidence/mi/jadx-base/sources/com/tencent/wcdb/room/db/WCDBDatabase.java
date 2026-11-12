package com.tencent.wcdb.room.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tencent.wcdb.database.SQLiteCursor;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class WCDBDatabase implements SupportSQLiteDatabase {
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final SQLiteDatabase mDelegate;

    public WCDBDatabase(SQLiteDatabase sQLiteDatabase) {
        this.mDelegate = sQLiteDatabase;
    }

    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.mDelegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.mDelegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        this.mDelegate.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        this.mDelegate.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mDelegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String str) {
        return new WCDBStatement(this.mDelegate.compileStatement(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb.toString());
        SimpleSQLiteQuery.bind(supportSQLiteStatementCompileStatement, objArr);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.mDelegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.mDelegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.mDelegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String str) throws SQLException {
        this.mDelegate.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.mDelegate.getAttachedDbs();
    }

    public final SQLiteDatabase getInnerDatabase() {
        return this.mDelegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.mDelegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.mDelegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.mDelegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.mDelegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.mDelegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return this.mDelegate.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.mDelegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.mDelegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.mDelegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.mDelegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.mDelegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i) {
        return this.mDelegate.needUpgrade(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String str) {
        return this.mDelegate.rawQuery(str, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.mDelegate.setForeignKeyConstraintsEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        this.mDelegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i) {
        this.mDelegate.setMaxSqlCacheSize(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j) {
        return this.mDelegate.setMaximumSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.mDelegate.setPageSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.mDelegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.mDelegate.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb.toString());
        SimpleSQLiteQuery.bind(supportSQLiteStatementCompileStatement, objArr2);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.mDelegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.mDelegate.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String str, Object[] objArr) {
        return this.mDelegate.rawQuery(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j) {
        return this.mDelegate.yieldIfContendedSafely(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.mDelegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.room.db.WCDBDatabase.1
            @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
            public com.tencent.wcdb.Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
                supportSQLiteQuery.bindTo(new WCDBProgram(sQLiteProgram));
                return SQLiteCursor.FACTORY.newCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteProgram);
            }

            @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
            public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
                return SQLiteCursor.FACTORY.newQuery(sQLiteDatabase, str, objArr, cancellationSignal);
            }
        }, supportSQLiteQuery.getQuery(), null, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
        final CancellationSignal cancellationSignal2;
        if (cancellationSignal != null) {
            cancellationSignal2 = new CancellationSignal();
            if (cancellationSignal.isCanceled()) {
                cancellationSignal2.cancel();
            }
            cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.wcdb.room.db.WCDBDatabase.2
                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    cancellationSignal2.cancel();
                }
            });
        } else {
            cancellationSignal2 = null;
        }
        return this.mDelegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.tencent.wcdb.room.db.WCDBDatabase.3
            @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
            public com.tencent.wcdb.Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteProgram sQLiteProgram) {
                supportSQLiteQuery.bindTo(new WCDBProgram(sQLiteProgram));
                return SQLiteCursor.FACTORY.newCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteProgram);
            }

            @Override // com.tencent.wcdb.database.SQLiteDatabase.CursorFactory
            public SQLiteProgram newQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal3) {
                return SQLiteCursor.FACTORY.newQuery(sQLiteDatabase, str, objArr, cancellationSignal3);
            }
        }, supportSQLiteQuery.getQuery(), null, null, cancellationSignal2);
    }
}
