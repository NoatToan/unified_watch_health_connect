package com.huami.assistant.ui.v2.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.assistant.ui.v2.db.converter.ScheduleConverters;
import com.huami.assistant.ui.v2.model.ScheduleEventModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ScheduleEventDao_Impl implements ScheduleEventDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<ScheduleEventModel> b;
    private final ScheduleConverters c = new ScheduleConverters();
    private final EntityDeletionOrUpdateAdapter<ScheduleEventModel> d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;

    public class a extends EntityInsertionAdapter<ScheduleEventModel> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, ScheduleEventModel value) {
            stmt.bindLong(1, value.getId());
            if (value.getEventSyncId() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getEventSyncId());
            }
            stmt.bindLong(3, value.getScheduleId());
            if (value.getTitle() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, value.getTitle());
            }
            if (value.getSummary() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, value.getSummary());
            }
            stmt.bindLong(6, value.getStartTime());
            stmt.bindLong(7, value.getStopTime());
            stmt.bindLong(8, value.getRepeatMode());
            stmt.bindLong(9, value.getRepeatStopTime());
            stmt.bindLong(10, value.getAlertTime());
            stmt.bindLong(11, ScheduleEventDao_Impl.this.c.booleanToInt(value.isAllDayEvent()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `schedule_event_model` (`id`,`event_sync_id`,`schedule_id`,`title`,`summary`,`start_time`,`stop_time`,`repeat_mode`,`repeat_stop_time`,`alert_time`,`is_all_day_event`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<ScheduleEventModel> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, ScheduleEventModel value) {
            stmt.bindLong(1, value.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `schedule_event_model` WHERE `id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_event_model where id = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_event_model";
        }
    }

    public ScheduleEventDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
        this.e = new c(__db);
        this.f = new d(__db);
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public void clear() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public void delete(final ScheduleEventModel model) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(model);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public void deleteById(final long id) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, id);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public List<ScheduleEventModel> getAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_event_model", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "event_sync_id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "summary");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stop_time");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeat_mode");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeat_stop_time");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alert_time");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_all_day_event");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                int i = columnIndexOrThrow;
                arrayList.add(new ScheduleEventModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getLong(columnIndexOrThrow8), cursorQuery.getLong(columnIndexOrThrow9), cursorQuery.getLong(columnIndexOrThrow10), this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow11))));
                columnIndexOrThrow = i;
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public void save(final ScheduleEventModel model) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(model);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleEventDao
    public void save(final List<ScheduleEventModel> models) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(models);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
