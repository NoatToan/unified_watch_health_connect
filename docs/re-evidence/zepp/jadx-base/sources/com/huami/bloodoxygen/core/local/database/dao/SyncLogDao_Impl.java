package com.huami.bloodoxygen.core.local.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.SubTypeConverter;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SyncLogDao_Impl implements SyncLogDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<SyncLog> b;
    private final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<SyncLog> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, SyncLog value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            SubTypeConverter subTypeConverter = SubTypeConverter.INSTANCE;
            String stringFromSubType = SubTypeConverter.getStringFromSubType(value.getType());
            if (stringFromSubType == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, stringFromSubType);
            }
            if (value.getDate() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getDate());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sync_log` (`userId`,`type`,`date`) VALUES (?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM sync_log WHERE userId = ?";
        }
    }

    public SyncLogDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.SyncLogDao
    public void clear(final String userId) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (userId == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, userId);
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

    @Override // com.huami.bloodoxygen.core.local.database.dao.SyncLogDao
    public boolean ifRowExists(final String userId, final BloodOxygen.SubType type) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT EXISTS(SELECT * FROM sync_log WHERE userId = ? AND type = ?)", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        SubTypeConverter subTypeConverter = SubTypeConverter.INSTANCE;
        String stringFromSubType = SubTypeConverter.getStringFromSubType(type);
        if (stringFromSubType == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, stringFromSubType);
        }
        this.a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z = cursorQuery.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.SyncLogDao
    public long insert(final SyncLog syncLog) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(syncLog);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.bloodoxygen.core.local.database.dao.SyncLogDao
    public SyncLog query(String str, BloodOxygen.SubType subType, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM sync_log WHERE userId = ? AND type = ? AND date = ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        SubTypeConverter subTypeConverter = SubTypeConverter.INSTANCE;
        String stringFromSubType = SubTypeConverter.getStringFromSubType(subType);
        if (stringFromSubType == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, stringFromSubType);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str2);
        }
        this.a.assertNotSuspendingTransaction();
        SyncLog syncLog = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
            if (cursorQuery.moveToFirst()) {
                String string2 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                BloodOxygen.SubType subTypeFromString = SubTypeConverter.getSubTypeFromString(cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2));
                if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                    string = cursorQuery.getString(columnIndexOrThrow3);
                }
                syncLog = new SyncLog(string2, subTypeFromString, string);
            }
            return syncLog;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
