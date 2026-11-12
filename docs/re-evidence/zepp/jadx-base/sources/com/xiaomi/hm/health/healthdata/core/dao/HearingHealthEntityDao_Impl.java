package com.xiaomi.hm.health.healthdata.core.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.xiaomi.hm.health.healthdata.core.entity.HearingHealthEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class HearingHealthEntityDao_Impl implements HearingHealthEntityDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<HearingHealthEntity> b;
    private final EntityDeletionOrUpdateAdapter<HearingHealthEntity> c;
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<HearingHealthEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, HearingHealthEntity value) {
            stmt.bindLong(1, value.getTimestamp());
            if (value.getUserId() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getUserId());
            }
            if (value.getEventType() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getEventType());
            }
            if (value.getData() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getData());
            }
            stmt.bindLong(5, value.getStatus());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `HearingHealthEntity` (`timestamp`,`userId`,`eventType`,`data`,`status`) VALUES (?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<HearingHealthEntity> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, HearingHealthEntity value) {
            stmt.bindLong(1, value.getTimestamp());
            if (value.getUserId() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getUserId());
            }
            if (value.getEventType() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getEventType());
            }
            if (value.getData() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getData());
            }
            stmt.bindLong(5, value.getStatus());
            stmt.bindLong(6, value.getTimestamp());
            if (value.getUserId() == null) {
                stmt.bindNull(7);
            } else {
                stmt.bindString(7, value.getUserId());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `HearingHealthEntity` SET `timestamp` = ?,`userId` = ?,`eventType` = ?,`data` = ?,`status` = ? WHERE `timestamp` = ? AND `userId` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from HearingHealthEntity";
        }
    }

    public HearingHealthEntityDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao
    public void clean() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao
    public void insert(final HearingHealthEntity... entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao
    public List<HearingHealthEntity> queryEntity(final int status, final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM HearingHealthEntity WHERE status =? AND userId=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, status);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, userId);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "status");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new HearingHealthEntity(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.HearingHealthEntityDao
    public void update(final HearingHealthEntity... entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handleMultiple(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
