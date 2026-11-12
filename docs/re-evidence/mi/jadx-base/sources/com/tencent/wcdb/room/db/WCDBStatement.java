package com.tencent.wcdb.room.db;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.tencent.wcdb.database.SQLiteStatement;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class WCDBStatement implements SupportSQLiteStatement {
    private final SQLiteStatement mDelegate;

    public WCDBStatement(SQLiteStatement sQLiteStatement) {
        this.mDelegate = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        this.mDelegate.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.mDelegate.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.mDelegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.mDelegate.bindNull(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        this.mDelegate.bindString(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.mDelegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mDelegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.mDelegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.mDelegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.mDelegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.mDelegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        return this.mDelegate.simpleQueryForString();
    }
}
