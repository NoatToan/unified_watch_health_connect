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
import com.xiaomi.fit.fitness.persist.db.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements StepRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<StepRecordEntity> f11421b = new a();
    public final EntityDeleteOrUpdateAdapter<StepRecordEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<StepRecordEntity> d = new c();

    public class a extends EntityInsertAdapter<StepRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StepRecordEntity stepRecordEntity) {
            if (stepRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, stepRecordEntity.getKey());
            }
            if (stepRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, stepRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, stepRecordEntity.getTime());
            if (stepRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, stepRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, stepRecordEntity.getZoneOffsetInSec());
            if (stepRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, stepRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, stepRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, stepRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, stepRecordEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `step_record` (`key`,`sid`,`time`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<StepRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StepRecordEntity stepRecordEntity) {
            if (stepRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, stepRecordEntity.getKey());
            }
            if (stepRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, stepRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, stepRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `step_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<StepRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StepRecordEntity stepRecordEntity) {
            if (stepRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, stepRecordEntity.getKey());
            }
            if (stepRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, stepRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, stepRecordEntity.getTime());
            if (stepRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, stepRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, stepRecordEntity.getZoneOffsetInSec());
            if (stepRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, stepRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, stepRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, stepRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, stepRecordEntity.getIsDeleted() ? 1L : 0L);
            if (stepRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, stepRecordEntity.getKey());
            }
            if (stepRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, stepRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(12, stepRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `step_record` SET `key` = ?,`sid` = ?,`time` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.f11420a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List n(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from step_record order by time desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                StepRecordEntity stepRecordEntity = new StepRecordEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                stepRecordEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                stepRecordEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                stepRecordEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                stepRecordEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                stepRecordEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                stepRecordEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                arrayList.add(stepRecordEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(i(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List p(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(i(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public static /* synthetic */ List r(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from step_record where time >= ? and time <= ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                StepRecordEntity stepRecordEntity = new StepRecordEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                stepRecordEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                stepRecordEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                stepRecordEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                stepRecordEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                stepRecordEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                stepRecordEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                arrayList.add(stepRecordEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        StepRecordDao.DefaultImpls.deleteAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao
    public List<StepRecordEntity> dumpStepRecord(final int i) {
        return (List) DBUtil.performBlocking(this.f11420a, true, false, new Function1() { // from class: ueo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return r.n(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<StepRecordEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11420a, true, false, new Function1() { // from class: afo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f957a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<StepRecordEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11420a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: dfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15491a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11420a, true, false, new Function1() { // from class: weo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return r.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao
    public List<StepRecordEntity> getStepRecordByTimeRange(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f11420a, true, false, new Function1() { // from class: yeo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return r.r(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return StepRecordDao.DefaultImpls.getTableName(this);
    }

    public final StepRecordEntity i(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        StepRecordEntity stepRecordEntity = new StepRecordEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            stepRecordEntity.setValue(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            stepRecordEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            stepRecordEntity.setZoneName(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            stepRecordEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            stepRecordEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            stepRecordEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return stepRecordEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        StepRecordDao.DefaultImpls.insertAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void delete(final StepRecordEntity... stepRecordEntityArr) {
        stepRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11420a, false, true, new Function1() { // from class: bfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4156a.m(stepRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void insert(final StepRecordEntity... stepRecordEntityArr) {
        stepRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11420a, false, true, new Function1() { // from class: cfo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f5288a.s(stepRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object m(StepRecordEntity[] stepRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, stepRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object s(StepRecordEntity[] stepRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11421b.insert(sQLiteConnection, stepRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object t(StepRecordEntity[] stepRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, stepRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void update(final StepRecordEntity... stepRecordEntityArr) {
        stepRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11420a, false, true, new Function1() { // from class: zeo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f41199a.t(stepRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.StepRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        StepRecordDao.DefaultImpls.updateAll(this, list);
    }
}
