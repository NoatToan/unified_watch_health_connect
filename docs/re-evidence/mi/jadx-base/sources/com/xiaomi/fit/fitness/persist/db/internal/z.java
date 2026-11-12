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
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.internal.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements WeightItemDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<WeightItemEntity> f11461b = new a();
    public final EntityDeleteOrUpdateAdapter<WeightItemEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<WeightItemEntity> d = new c();

    public class a extends EntityInsertAdapter<WeightItemEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WeightItemEntity weightItemEntity) {
            if (weightItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, weightItemEntity.getKey());
            }
            if (weightItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, weightItemEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, weightItemEntity.getTime());
            sQLiteStatement.mo50bindLong(4, weightItemEntity.getZeroTimeIn0Tz());
            sQLiteStatement.mo49bindDouble(5, weightItemEntity.getWeight());
            if (weightItemEntity.getBmi() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo49bindDouble(6, weightItemEntity.getBmi().floatValue());
            }
            if (weightItemEntity.getBodyFatRate() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo49bindDouble(7, weightItemEntity.getBodyFatRate().floatValue());
            }
            if (weightItemEntity.getMoistureRate() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo49bindDouble(8, weightItemEntity.getMoistureRate().floatValue());
            }
            if (weightItemEntity.getBoneMass() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo49bindDouble(9, weightItemEntity.getBoneMass().floatValue());
            }
            if (weightItemEntity.getBasalMetabolism() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo50bindLong(10, weightItemEntity.getBasalMetabolism().intValue());
            }
            if (weightItemEntity.getMuscleRate() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo49bindDouble(11, weightItemEntity.getMuscleRate().floatValue());
            }
            if (weightItemEntity.getProteinRate() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo49bindDouble(12, weightItemEntity.getProteinRate().floatValue());
            }
            if (weightItemEntity.getVisceralFat() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo49bindDouble(13, weightItemEntity.getVisceralFat().floatValue());
            }
            if (weightItemEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo52bindText(14, weightItemEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(15, weightItemEntity.getZoneOffsetInSec());
            if (weightItemEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, weightItemEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(17, weightItemEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(18, weightItemEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(19, weightItemEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `weight_item_record` (`key`,`sid`,`time`,`zeroTimeIn0Tz`,`weight`,`bmi`,`bodyFatRate`,`moistureRate`,`boneMass`,`basalMetabolism`,`muscleMass`,`proteinRate`,`visceralFat`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<WeightItemEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WeightItemEntity weightItemEntity) {
            if (weightItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, weightItemEntity.getKey());
            }
            if (weightItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, weightItemEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, weightItemEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `weight_item_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<WeightItemEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WeightItemEntity weightItemEntity) {
            if (weightItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, weightItemEntity.getKey());
            }
            if (weightItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, weightItemEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, weightItemEntity.getTime());
            sQLiteStatement.mo50bindLong(4, weightItemEntity.getZeroTimeIn0Tz());
            sQLiteStatement.mo49bindDouble(5, weightItemEntity.getWeight());
            if (weightItemEntity.getBmi() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo49bindDouble(6, weightItemEntity.getBmi().floatValue());
            }
            if (weightItemEntity.getBodyFatRate() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo49bindDouble(7, weightItemEntity.getBodyFatRate().floatValue());
            }
            if (weightItemEntity.getMoistureRate() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo49bindDouble(8, weightItemEntity.getMoistureRate().floatValue());
            }
            if (weightItemEntity.getBoneMass() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo49bindDouble(9, weightItemEntity.getBoneMass().floatValue());
            }
            if (weightItemEntity.getBasalMetabolism() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo50bindLong(10, weightItemEntity.getBasalMetabolism().intValue());
            }
            if (weightItemEntity.getMuscleRate() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo49bindDouble(11, weightItemEntity.getMuscleRate().floatValue());
            }
            if (weightItemEntity.getProteinRate() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo49bindDouble(12, weightItemEntity.getProteinRate().floatValue());
            }
            if (weightItemEntity.getVisceralFat() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo49bindDouble(13, weightItemEntity.getVisceralFat().floatValue());
            }
            if (weightItemEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo52bindText(14, weightItemEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(15, weightItemEntity.getZoneOffsetInSec());
            if (weightItemEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, weightItemEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(17, weightItemEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(18, weightItemEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(19, weightItemEntity.getIsDeleted() ? 1L : 0L);
            if (weightItemEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(20);
            } else {
                sQLiteStatement.mo52bindText(20, weightItemEntity.getKey());
            }
            if (weightItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(21);
            } else {
                sQLiteStatement.mo52bindText(21, weightItemEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(22, weightItemEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `weight_item_record` SET `key` = ?,`sid` = ?,`time` = ?,`zeroTimeIn0Tz` = ?,`weight` = ?,`bmi` = ?,`bodyFatRate` = ?,`moistureRate` = ?,`boneMass` = ?,`basalMetabolism` = ?,`muscleMass` = ?,`proteinRate` = ?,`visceralFat` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public z(RoomDatabase roomDatabase) {
        this.f11460a = roomDatabase;
    }

    public static List<Class<?>> l() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(j(sQLiteStatementPrepare));
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
                arrayList.add(j(sQLiteStatementPrepare));
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

    public static /* synthetic */ List r(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List t(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(j(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List u(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(j(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        WeightItemDao.DefaultImpls.deleteAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<WeightItemEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11460a, true, false, new Function1() { // from class: ufr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35725a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<WeightItemEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11460a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: vfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36856a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11460a, true, false, new Function1() { // from class: yfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return z.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao
    public List<Long> getRecordTime(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11460a, true, false, new Function1() { // from class: zfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return z.r(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return WeightItemDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao
    public String getWeightColumnInfo(BodyComposition bodyComposition) {
        return WeightItemDao.DefaultImpls.getWeightColumnInfo(this, bodyComposition);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        WeightItemDao.DefaultImpls.insertAll(this, list);
    }

    public final WeightItemEntity j(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_ZERO_TIME_0_TZ);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "weight");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "bmi");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_BODY_FAT_RATE);
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_MOISTURE_RATE);
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_BONE_MASS);
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_BASAL_METABOLISM);
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_MUSCLE_RATE);
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_PROTEIN_RATE);
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, WeightRecordDaoKt.COL_VISCERAL_FAT);
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        WeightItemEntity weightItemEntity = new WeightItemEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            weightItemEntity.setZeroTimeIn0Tz(sQLiteStatement.getLong(columnIndex4));
        }
        if (columnIndex5 != -1) {
            weightItemEntity.setWeight((float) sQLiteStatement.getDouble(columnIndex5));
        }
        if (columnIndex6 != -1) {
            weightItemEntity.setBmi(sQLiteStatement.isNull(columnIndex6) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex6)));
        }
        if (columnIndex7 != -1) {
            weightItemEntity.setBodyFatRate(sQLiteStatement.isNull(columnIndex7) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex7)));
        }
        if (columnIndex8 != -1) {
            weightItemEntity.setMoistureRate(sQLiteStatement.isNull(columnIndex8) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex8)));
        }
        if (columnIndex9 != -1) {
            weightItemEntity.setBoneMass(sQLiteStatement.isNull(columnIndex9) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex9)));
        }
        if (columnIndex10 != -1) {
            weightItemEntity.setBasalMetabolism(sQLiteStatement.isNull(columnIndex10) ? null : Integer.valueOf((int) sQLiteStatement.getLong(columnIndex10)));
        }
        if (columnIndex11 != -1) {
            weightItemEntity.setMuscleRate(sQLiteStatement.isNull(columnIndex11) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex11)));
        }
        if (columnIndex12 != -1) {
            weightItemEntity.setProteinRate(sQLiteStatement.isNull(columnIndex12) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex12)));
        }
        if (columnIndex13 != -1) {
            weightItemEntity.setVisceralFat(sQLiteStatement.isNull(columnIndex13) ? null : Float.valueOf((float) sQLiteStatement.getDouble(columnIndex13)));
        }
        if (columnIndex14 != -1) {
            weightItemEntity.setValue(sQLiteStatement.isNull(columnIndex14) ? null : sQLiteStatement.getText(columnIndex14));
        }
        if (columnIndex15 != -1) {
            weightItemEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex15));
        }
        if (columnIndex16 != -1) {
            weightItemEntity.setZoneName(sQLiteStatement.isNull(columnIndex16) ? null : sQLiteStatement.getText(columnIndex16));
        }
        if (columnIndex17 != -1) {
            weightItemEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex17));
        }
        if (columnIndex18 != -1) {
            weightItemEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex18)) != 0);
        }
        if (columnIndex19 != -1) {
            weightItemEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex19)) != 0);
        }
        return weightItemEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void delete(final WeightItemEntity... weightItemEntityArr) {
        weightItemEntityArr.getClass();
        DBUtil.performBlocking(this.f11460a, false, true, new Function1() { // from class: xfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39084a.n(weightItemEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public List<WeightItemEntity> loadDataPaged(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11460a, true, false, new Function1() { // from class: bgr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4194a.t(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public List<WeightItemEntity> loadDataPagedDesc(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11460a, true, false, new Function1() { // from class: cgr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f5319a.u(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void insert(final WeightItemEntity... weightItemEntityArr) {
        weightItemEntityArr.getClass();
        DBUtil.performBlocking(this.f11460a, false, true, new Function1() { // from class: agr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f1001a.s(weightItemEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object n(WeightItemEntity[] weightItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, weightItemEntityArr);
        return null;
    }

    public final /* synthetic */ Object s(WeightItemEntity[] weightItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11461b.insert(sQLiteConnection, weightItemEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        WeightItemDao.DefaultImpls.updateAll(this, list);
    }

    public final /* synthetic */ Object v(WeightItemEntity[] weightItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, weightItemEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void update(final WeightItemEntity... weightItemEntityArr) {
        weightItemEntityArr.getClass();
        DBUtil.performBlocking(this.f11460a, false, true, new Function1() { // from class: wfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37929a.v(weightItemEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
