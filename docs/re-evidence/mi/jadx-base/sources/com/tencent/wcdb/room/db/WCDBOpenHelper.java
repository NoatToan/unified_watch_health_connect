package com.tencent.wcdb.room.db;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
class WCDBOpenHelper implements SupportSQLiteOpenHelper {
    private final OpenHelper mDelegate;

    public static class OpenHelper extends SQLiteOpenHelper {
        boolean mAsyncCheckpoint;
        final SupportSQLiteOpenHelper.Callback mCallback;
        final WCDBDatabase[] mDbRef;

        public OpenHelper(Context context, String str, final WCDBDatabase[] wCDBDatabaseArr, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, final SupportSQLiteOpenHelper.Callback callback) {
            super(context, str, bArr, sQLiteCipherSpec, null, callback.version, new DatabaseErrorHandler() { // from class: com.tencent.wcdb.room.db.WCDBOpenHelper.OpenHelper.1
                @Override // com.tencent.wcdb.DatabaseErrorHandler
                public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    WCDBDatabase wCDBDatabase = wCDBDatabaseArr[0];
                    if (wCDBDatabase != null) {
                        callback.onCorruption(wCDBDatabase);
                    }
                }
            });
            this.mCallback = callback;
            this.mDbRef = wCDBDatabaseArr;
            this.mAsyncCheckpoint = false;
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public synchronized void close() {
            super.close();
            this.mDbRef[0] = null;
        }

        public SupportSQLiteDatabase getReadableSupportDatabase() {
            return getWrappedDb(super.getReadableDatabase());
        }

        public WCDBDatabase getWrappedDb(SQLiteDatabase sQLiteDatabase) {
            if (this.mDbRef[0] == null) {
                this.mDbRef[0] = new WCDBDatabase(sQLiteDatabase);
            }
            return this.mDbRef[0];
        }

        public SupportSQLiteDatabase getWritableSupportDatabase() {
            return getWrappedDb(super.getWritableDatabase());
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.setAsyncCheckpointEnabled(this.mAsyncCheckpoint);
            this.mCallback.onConfigure(getWrappedDb(sQLiteDatabase));
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.mCallback.onCreate(getWrappedDb(sQLiteDatabase));
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.mCallback.onDowngrade(getWrappedDb(sQLiteDatabase), i, i2);
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            this.mCallback.onOpen(getWrappedDb(sQLiteDatabase));
        }

        @Override // com.tencent.wcdb.database.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.mCallback.onUpgrade(getWrappedDb(sQLiteDatabase), i, i2);
        }
    }

    public WCDBOpenHelper(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SupportSQLiteOpenHelper.Callback callback) {
        this.mDelegate = createDelegate(context, str, bArr, sQLiteCipherSpec, callback);
    }

    private OpenHelper createDelegate(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, SupportSQLiteOpenHelper.Callback callback) {
        return new OpenHelper(context, str, new WCDBDatabase[1], bArr, sQLiteCipherSpec, callback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDelegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.mDelegate.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return this.mDelegate.getReadableSupportDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.mDelegate.getWritableSupportDatabase();
    }

    public void setAsyncCheckpointEnabled(boolean z) {
        this.mDelegate.mAsyncCheckpoint = z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.mDelegate.setWriteAheadLoggingEnabled(z);
    }
}
