package com.huami.assistant.ui.v2.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.assistant.ui.v2.db.converter.ScheduleConverters;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public final class ScheduleDao_Impl implements ScheduleDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<ScheduleModel> b;
    private final ScheduleConverters c = new ScheduleConverters();
    private final EntityDeletionOrUpdateAdapter<ScheduleModel> d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;

    public class a extends EntityInsertionAdapter<ScheduleModel> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, ScheduleModel value) {
            stmt.bindLong(1, value.getId());
            if (value.getTitle() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getTitle());
            }
            if (value.getDesc() == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, value.getDesc());
            }
            stmt.bindLong(4, value.getStartTime());
            stmt.bindLong(5, value.getStopTime());
            stmt.bindLong(6, value.getAlertTime());
            stmt.bindLong(7, ScheduleDao_Impl.this.c.repeatModeToLong(value.getRepeatMode()));
            stmt.bindLong(8, value.getRepeatStopTime());
            stmt.bindLong(9, ScheduleDao_Impl.this.c.booleanToInt(value.isAllDayEvent()));
            if (value.getImageUrl() == null) {
                stmt.bindNull(10);
            } else {
                stmt.bindString(10, value.getImageUrl());
            }
            stmt.bindLong(11, ScheduleDao_Impl.this.c.sourceToInt(value.getSource()));
            stmt.bindLong(12, value.getUpdateVersion());
            if (value.getAddress() == null) {
                stmt.bindNull(13);
            } else {
                stmt.bindString(13, value.getAddress());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `schedule_model` (`id`,`title`,`desc`,`startTime`,`stopTime`,`alertTime`,`repeatMode`,`repeatStopTime`,`isAllDayEvent`,`imageUrl`,`source`,`updateVersion`,`address`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<ScheduleModel> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, ScheduleModel value) {
            stmt.bindLong(1, value.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `schedule_model` WHERE `id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_model";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_model where id = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_model where source = 0x10";
        }
    }

    public class f extends SharedSQLiteStatement {
        public f(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from schedule_model where source = ?";
        }
    }

    public class g implements Callable<List<ScheduleModel>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<ScheduleModel> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(ScheduleDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow13;
                    arrayList.add(new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), ScheduleDao_Impl.this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), ScheduleDao_Impl.this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), ScheduleDao_Impl.this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(i4)));
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                    columnIndexOrThrow = i3;
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class h implements Callable<ScheduleModel> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduleModel call() throws Exception {
            ScheduleModel scheduleModel = null;
            Cursor cursorQuery = DBUtil.query(ScheduleDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                if (cursorQuery.moveToFirst()) {
                    scheduleModel = new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), ScheduleDao_Impl.this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), ScheduleDao_Impl.this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), ScheduleDao_Impl.this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13));
                }
                return scheduleModel;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public ScheduleDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.d = new b(__db);
        this.e = new c(__db);
        this.f = new d(__db);
        this.g = new e(__db);
        this.h = new f(__db);
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void delete(final ScheduleModel schedule) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.handle(schedule);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void deleteAll() {
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

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void deleteById(final long id) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        supportSQLiteStatementAcquire.bindLong(1, id);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void deleteLunar() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void deleteModelBySource(final int source) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        supportSQLiteStatementAcquire.bindLong(1, source);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.h.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public List<ScheduleModel> getAll() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_model", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow13;
                    arrayList.add(new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(i4)));
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                    columnIndexOrThrow = i3;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public LiveData<List<ScheduleModel>> getAllData() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"schedule_model"}, false, new g(RoomSQLiteQuery.acquire("select * from schedule_model", 0)));
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public ScheduleModel getById(final long id) {
        ScheduleModel scheduleModel;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_model where id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, id);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            if (cursorQuery.moveToFirst()) {
                scheduleModel = new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(columnIndexOrThrow13));
            } else {
                scheduleModel = null;
            }
            return scheduleModel;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public LiveData<ScheduleModel> getByIdAsData(final long id) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_model where id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, id);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"schedule_model"}, false, new h(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public int getCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select count(*) from schedule_model", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void insertOrUpdate(final ScheduleModel schedule) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(schedule);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public List<ScheduleModel> queryLunar() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_model where source = 0x10 order by startTime", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow13;
                    arrayList.add(new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(i4)));
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                    columnIndexOrThrow = i3;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public List<ScheduleModel> queryModelBySource(final int source) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from schedule_model where source = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, source);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "desc");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "stopTime");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alertTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE);
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "repeatStopTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isAllDayEvent");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updateVersion");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    int i3 = columnIndexOrThrow;
                    int i4 = columnIndexOrThrow13;
                    arrayList.add(new ScheduleModel(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), this.c.longToRepeatMode(cursorQuery.getLong(columnIndexOrThrow7)), cursorQuery.getLong(columnIndexOrThrow8), this.c.intToBoolean(cursorQuery.getInt(columnIndexOrThrow9)), cursorQuery.getString(columnIndexOrThrow10), this.c.intToSource(cursorQuery.getInt(columnIndexOrThrow11)), cursorQuery.getLong(columnIndexOrThrow12), cursorQuery.getString(i4)));
                    columnIndexOrThrow13 = i4;
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                    columnIndexOrThrow = i3;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.assistant.ui.v2.db.dao.ScheduleDao
    public void insertOrUpdate(final List<ScheduleModel> schedules) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(schedules);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
