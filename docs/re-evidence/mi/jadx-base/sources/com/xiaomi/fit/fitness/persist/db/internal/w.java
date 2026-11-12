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
import com.xiaomi.fit.fitness.persist.db.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements TrainingLoadRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<TrainingLoadRecordEntity> f11446b = new a();
    public final EntityDeleteOrUpdateAdapter<TrainingLoadRecordEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<TrainingLoadRecordEntity> d = new c();

    public class a extends EntityInsertAdapter<TrainingLoadRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingLoadRecordEntity trainingLoadRecordEntity) {
            if (trainingLoadRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, trainingLoadRecordEntity.getKey());
            }
            if (trainingLoadRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, trainingLoadRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, trainingLoadRecordEntity.getTime());
            if (trainingLoadRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, trainingLoadRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, trainingLoadRecordEntity.getZoneOffsetInSec());
            if (trainingLoadRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, trainingLoadRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, trainingLoadRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, trainingLoadRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, trainingLoadRecordEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `training_load_record` (`key`,`sid`,`time`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<TrainingLoadRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingLoadRecordEntity trainingLoadRecordEntity) {
            if (trainingLoadRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, trainingLoadRecordEntity.getKey());
            }
            if (trainingLoadRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, trainingLoadRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, trainingLoadRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `training_load_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<TrainingLoadRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingLoadRecordEntity trainingLoadRecordEntity) {
            if (trainingLoadRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, trainingLoadRecordEntity.getKey());
            }
            if (trainingLoadRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, trainingLoadRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, trainingLoadRecordEntity.getTime());
            if (trainingLoadRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, trainingLoadRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, trainingLoadRecordEntity.getZoneOffsetInSec());
            if (trainingLoadRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, trainingLoadRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, trainingLoadRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, trainingLoadRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, trainingLoadRecordEntity.getIsDeleted() ? 1L : 0L);
            if (trainingLoadRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, trainingLoadRecordEntity.getKey());
            }
            if (trainingLoadRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, trainingLoadRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(12, trainingLoadRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `training_load_record` SET `key` = ?,`sid` = ?,`time` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public w(RoomDatabase roomDatabase) {
        this.f11445a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(g(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(g(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List n(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        TrainingLoadRecordDao.DefaultImpls.deleteAll(this, list);
    }

    public final TrainingLoadRecordEntity g(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        TrainingLoadRecordEntity trainingLoadRecordEntity = new TrainingLoadRecordEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            trainingLoadRecordEntity.setValue(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            trainingLoadRecordEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            trainingLoadRecordEntity.setZoneName(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            trainingLoadRecordEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            trainingLoadRecordEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            trainingLoadRecordEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return trainingLoadRecordEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<TrainingLoadRecordEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11445a, true, false, new Function1() { // from class: ptp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30762a.l(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<TrainingLoadRecordEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11445a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: rtp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32895a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11445a, true, false, new Function1() { // from class: otp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return TrainingLoadRecordDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void delete(final TrainingLoadRecordEntity... trainingLoadRecordEntityArr) {
        trainingLoadRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11445a, false, true, new Function1() { // from class: stp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33983a.k(trainingLoadRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        TrainingLoadRecordDao.DefaultImpls.insertAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void insert(final TrainingLoadRecordEntity... trainingLoadRecordEntityArr) {
        trainingLoadRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11445a, false, true, new Function1() { // from class: qtp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31838a.o(trainingLoadRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(TrainingLoadRecordEntity[] trainingLoadRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, trainingLoadRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object o(TrainingLoadRecordEntity[] trainingLoadRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11446b.insert(sQLiteConnection, trainingLoadRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object p(TrainingLoadRecordEntity[] trainingLoadRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, trainingLoadRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void update(final TrainingLoadRecordEntity... trainingLoadRecordEntityArr) {
        trainingLoadRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11445a, false, true, new Function1() { // from class: ttp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35035a.p(trainingLoadRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingLoadRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        TrainingLoadRecordDao.DefaultImpls.updateAll(this, list);
    }
}
