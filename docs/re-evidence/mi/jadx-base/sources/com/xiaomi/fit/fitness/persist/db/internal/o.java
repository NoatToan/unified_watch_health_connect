package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.internal.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements SleepSegmentDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SleepSegmentEntity> f11406b = new a();
    public final EntityDeleteOrUpdateAdapter<SleepSegmentEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<SleepSegmentEntity> d = new c();

    public class a extends EntityInsertAdapter<SleepSegmentEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SleepSegmentEntity sleepSegmentEntity) {
            if (sleepSegmentEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sleepSegmentEntity.getKey());
            }
            if (sleepSegmentEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sleepSegmentEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, sleepSegmentEntity.getTime());
            sQLiteStatement.mo50bindLong(4, sleepSegmentEntity.getIsComplete() ? 1L : 0L);
            if (sleepSegmentEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, sleepSegmentEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(6, sleepSegmentEntity.getZoneOffsetInSec());
            if (sleepSegmentEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, sleepSegmentEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(8, sleepSegmentEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, sleepSegmentEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, sleepSegmentEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sleep_segment` (`key`,`sid`,`time`,`isComplete`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SleepSegmentEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SleepSegmentEntity sleepSegmentEntity) {
            if (sleepSegmentEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sleepSegmentEntity.getKey());
            }
            if (sleepSegmentEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sleepSegmentEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, sleepSegmentEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `sleep_segment` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<SleepSegmentEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SleepSegmentEntity sleepSegmentEntity) {
            if (sleepSegmentEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sleepSegmentEntity.getKey());
            }
            if (sleepSegmentEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sleepSegmentEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, sleepSegmentEntity.getTime());
            sQLiteStatement.mo50bindLong(4, sleepSegmentEntity.getIsComplete() ? 1L : 0L);
            if (sleepSegmentEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, sleepSegmentEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(6, sleepSegmentEntity.getZoneOffsetInSec());
            if (sleepSegmentEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, sleepSegmentEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(8, sleepSegmentEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, sleepSegmentEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, sleepSegmentEntity.getIsDeleted() ? 1L : 0L);
            if (sleepSegmentEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, sleepSegmentEntity.getKey());
            }
            if (sleepSegmentEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, sleepSegmentEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(13, sleepSegmentEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `sleep_segment` SET `key` = ?,`sid` = ?,`time` = ?,`isComplete` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.f11405a = roomDatabase;
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List r(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from sleep_segment order by time desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_IS_SLEEP_COMPLETE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow;
                SleepSegmentEntity sleepSegmentEntity = new SleepSegmentEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sleepSegmentEntity.setComplete(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0);
                sleepSegmentEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                sleepSegmentEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sleepSegmentEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sleepSegmentEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sleepSegmentEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sleepSegmentEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                arrayList.add(sleepSegmentEntity);
                columnIndexOrThrow = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List u(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List v(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sleep_segment WHERE sid = ? AND isComplete = 0 ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_IS_SLEEP_COMPLETE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SleepSegmentEntity sleepSegmentEntity = new SleepSegmentEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sleepSegmentEntity.setComplete(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0);
                sleepSegmentEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i = columnIndexOrThrow3;
                sleepSegmentEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sleepSegmentEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sleepSegmentEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sleepSegmentEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sleepSegmentEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                arrayList.add(sleepSegmentEntity);
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void update(final SleepSegmentEntity... sleepSegmentEntityArr) {
        sleepSegmentEntityArr.getClass();
        DBUtil.performBlocking(this.f11405a, false, true, new Function1() { // from class: vwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37312a.z(sleepSegmentEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        SleepSegmentDao.DefaultImpls.deleteAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao
    public List<SleepSegmentEntity> dumpSleepRecord(final int i) {
        return (List) DBUtil.performBlocking(this.f11405a, true, false, new Function1() { // from class: wwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return o.r(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<SleepSegmentEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11405a, true, false, new Function1() { // from class: swm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34066a.s(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<SleepSegmentEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11405a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: rwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32984a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11405a, true, false, new Function1() { // from class: nwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return o.u(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return SleepSegmentDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao
    public List<SleepSegmentEntity> getUnCompleteSegments(final String str) {
        return (List) DBUtil.performBlocking(this.f11405a, true, false, new Function1() { // from class: xwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return o.v(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        SleepSegmentDao.DefaultImpls.insertAll(this, list);
    }

    public final SleepSegmentEntity l(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_IS_SLEEP_COMPLETE);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        SleepSegmentEntity sleepSegmentEntity = new SleepSegmentEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            sleepSegmentEntity.setComplete(((int) sQLiteStatement.getLong(columnIndex4)) != 0);
        }
        if (columnIndex5 != -1) {
            sleepSegmentEntity.setValue(sQLiteStatement.isNull(columnIndex5) ? null : sQLiteStatement.getText(columnIndex5));
        }
        if (columnIndex6 != -1) {
            sleepSegmentEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            sleepSegmentEntity.setZoneName(sQLiteStatement.isNull(columnIndex7) ? null : sQLiteStatement.getText(columnIndex7));
        }
        if (columnIndex8 != -1) {
            sleepSegmentEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex8));
        }
        if (columnIndex9 != -1) {
            sleepSegmentEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        if (columnIndex10 != -1) {
            sleepSegmentEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex10)) != 0);
        }
        return sleepSegmentEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public List<SleepSegmentEntity> loadDataPaged(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11405a, true, false, new Function1() { // from class: owm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29772a.x(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public List<SleepSegmentEntity> loadDataPagedDesc(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11405a, true, false, new Function1() { // from class: uwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36230a.y(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void delete(final SleepSegmentEntity... sleepSegmentEntityArr) {
        sleepSegmentEntityArr.getClass();
        DBUtil.performBlocking(this.f11405a, false, true, new Function1() { // from class: pwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30861a.p(sleepSegmentEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void insert(final SleepSegmentEntity... sleepSegmentEntityArr) {
        sleepSegmentEntityArr.getClass();
        DBUtil.performBlocking(this.f11405a, false, true, new Function1() { // from class: qwm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31914a.w(sleepSegmentEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object p(SleepSegmentEntity[] sleepSegmentEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, sleepSegmentEntityArr);
        return null;
    }

    public final /* synthetic */ Object q(SleepSegmentEntity sleepSegmentEntity, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, sleepSegmentEntity);
        return null;
    }

    public final /* synthetic */ List s(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(l(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ List t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(l(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        SleepSegmentDao.DefaultImpls.updateAll(this, list);
    }

    public final /* synthetic */ Object w(SleepSegmentEntity[] sleepSegmentEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11406b.insert(sQLiteConnection, sleepSegmentEntityArr);
        return null;
    }

    public final /* synthetic */ List x(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(l(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ List y(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(l(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ Object z(SleepSegmentEntity[] sleepSegmentEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, sleepSegmentEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao
    public void delete(final SleepSegmentEntity sleepSegmentEntity) {
        sleepSegmentEntity.getClass();
        DBUtil.performBlocking(this.f11405a, false, true, new Function1() { // from class: twm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35143a.q(sleepSegmentEntity, (SQLiteConnection) obj);
            }
        });
    }
}
