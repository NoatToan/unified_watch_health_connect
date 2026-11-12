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
import com.xiaomi.hm.health.healthdata.core.entity.SyncLogEntity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class SyncLogDao_Impl implements SyncLogDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<SyncLogEntity> b;
    private final DateConverter c = new DateConverter();
    private final EntityDeletionOrUpdateAdapter<SyncLogEntity> d;
    private final SharedSQLiteStatement e;

    public class a extends EntityInsertionAdapter<SyncLogEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SyncLogEntity syncLogEntity) {
            if (syncLogEntity.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, syncLogEntity.getId().intValue());
            }
            if (syncLogEntity.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, syncLogEntity.getUserId());
            }
            Long l = SyncLogDao_Impl.this.c.toLong(syncLogEntity.getStartTime());
            if (l == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, l.longValue());
            }
            Long l2 = SyncLogDao_Impl.this.c.toLong(syncLogEntity.getFinishTime());
            if (l2 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, l2.longValue());
            }
            if (syncLogEntity.getDataSize() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, syncLogEntity.getDataSize().intValue());
            }
            supportSQLiteStatement.bindLong(6, syncLogEntity.isFinished() ? 1L : 0L);
            if (syncLogEntity.getNextTime() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, syncLogEntity.getNextTime().longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `SyncLogEntity` (`id`,`userId`,`startTime`,`finishTime`,`dataSize`,`isFinished`,`nextTime`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<SyncLogEntity> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SyncLogEntity syncLogEntity) {
            if (syncLogEntity.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, syncLogEntity.getId().intValue());
            }
            if (syncLogEntity.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, syncLogEntity.getUserId());
            }
            Long l = SyncLogDao_Impl.this.c.toLong(syncLogEntity.getStartTime());
            if (l == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, l.longValue());
            }
            Long l2 = SyncLogDao_Impl.this.c.toLong(syncLogEntity.getFinishTime());
            if (l2 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, l2.longValue());
            }
            if (syncLogEntity.getDataSize() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, syncLogEntity.getDataSize().intValue());
            }
            supportSQLiteStatement.bindLong(6, syncLogEntity.isFinished() ? 1L : 0L);
            if (syncLogEntity.getNextTime() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, syncLogEntity.getNextTime().longValue());
            }
            if (syncLogEntity.getId() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, syncLogEntity.getId().intValue());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `SyncLogEntity` SET `id` = ?,`userId` = ?,`startTime` = ?,`finishTime` = ?,`dataSize` = ?,`isFinished` = ?,`nextTime` = ? WHERE `id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from SyncLogEntity";
        }
    }

    public SyncLogDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
        this.e = new c(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao
    public void clean() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao
    public SyncLogEntity findLast() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SyncLogEntity order by id desc limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        SyncLogEntity syncLogEntity = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "finishTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dataSize");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isFinished");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTime");
            if (cursorQuery.moveToFirst()) {
                syncLogEntity = new SyncLogEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), this.c.toDate(cursorQuery.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow3))), this.c.toDate(cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4))), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.getInt(columnIndexOrThrow6) != 0, cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7)));
            }
            return syncLogEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao
    public void insert(final SyncLogEntity entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao
    public void update(final SyncLogEntity entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
