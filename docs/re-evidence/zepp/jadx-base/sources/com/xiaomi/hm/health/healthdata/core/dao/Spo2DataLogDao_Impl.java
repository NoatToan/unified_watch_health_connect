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
import com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen.Spo2DataSyncLogEntity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class Spo2DataLogDao_Impl implements Spo2DataLogDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Spo2DataSyncLogEntity> b;
    private final EntityDeletionOrUpdateAdapter<Spo2DataSyncLogEntity> c;
    private final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<Spo2DataSyncLogEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, Spo2DataSyncLogEntity value) {
            if (value.getId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindLong(1, value.getId().intValue());
            }
            if (value.getNextTime() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindLong(2, value.getNextTime().longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Spo2DataSyncLogEntity` (`id`,`nextTime`) VALUES (?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<Spo2DataSyncLogEntity> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, Spo2DataSyncLogEntity value) {
            if (value.getId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindLong(1, value.getId().intValue());
            }
            if (value.getNextTime() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindLong(2, value.getNextTime().longValue());
            }
            if (value.getId() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindLong(3, value.getId().intValue());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `Spo2DataSyncLogEntity` SET `id` = ?,`nextTime` = ? WHERE `id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from Spo2DataSyncLogEntity";
        }
    }

    public Spo2DataLogDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao, com.huami.devicex.injection.data.Spo2DataLogDaoApi
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

    @Override // com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao, com.huami.devicex.injection.data.Spo2DataLogDaoApi
    public Spo2DataSyncLogEntity findLast() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from Spo2DataSyncLogEntity  order by id desc limit 1", 0);
        this.a.assertNotSuspendingTransaction();
        Spo2DataSyncLogEntity spo2DataSyncLogEntity = null;
        Long lValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTime");
            if (cursorQuery.moveToFirst()) {
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow));
                if (!cursorQuery.isNull(columnIndexOrThrow2)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow2));
                }
                spo2DataSyncLogEntity = new Spo2DataSyncLogEntity(numValueOf, lValueOf);
            }
            return spo2DataSyncLogEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao, com.huami.devicex.injection.data.Spo2DataLogDaoApi
    public void insert(final Spo2DataSyncLogEntity entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.xiaomi.hm.health.healthdata.core.dao.Spo2DataLogDao, com.huami.devicex.injection.data.Spo2DataLogDaoApi
    public void update(final Spo2DataSyncLogEntity entity) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handle(entity);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
