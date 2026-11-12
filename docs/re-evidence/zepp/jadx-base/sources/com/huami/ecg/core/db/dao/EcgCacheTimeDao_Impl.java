package com.huami.ecg.core.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.ecg.core.db.entity.EcgCacheTime;

/* JADX INFO: loaded from: classes8.dex */
public final class EcgCacheTimeDao_Impl implements EcgCacheTimeDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<EcgCacheTime> b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<EcgCacheTime> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EcgCacheTime ecgCacheTime) {
            if (ecgCacheTime.getUserId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, ecgCacheTime.getUserId());
            }
            supportSQLiteStatement.bindLong(2, ecgCacheTime.getCacheStartDay());
            supportSQLiteStatement.bindLong(3, ecgCacheTime.getCacheEndDay());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ecg_sync_time` (`userId`,`cacheStartDay`,`cacheEndDay`) VALUES (?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_sync_time where userId != ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from ecg_sync_time where userId = ?";
        }
    }

    public EcgCacheTimeDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    @Override // com.huami.ecg.core.db.dao.EcgCacheTimeDao
    public void clearCache(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgCacheTimeDao
    public void clearFriendCache(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgCacheTimeDao
    public EcgCacheTime getSyncTime(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from ecg_sync_time where userId = ? limit 1", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new EcgCacheTime(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId")), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgCacheTime.CACHE_START_DAY)), cursorQuery.getLong(CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgCacheTime.CACHE_END_DAY))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.ecg.core.db.dao.EcgCacheTimeDao
    public void updateSyncTime(EcgCacheTime ecgCacheTime) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(ecgCacheTime);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
