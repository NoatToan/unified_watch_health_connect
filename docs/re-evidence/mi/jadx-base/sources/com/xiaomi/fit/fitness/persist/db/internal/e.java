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
import com.xiaomi.fit.fitness.persist.db.internal.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements EcgMedicalRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<EcgMedicalRecordEntity> f11356b = new a();
    public final EntityDeleteOrUpdateAdapter<EcgMedicalRecordEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<EcgMedicalRecordEntity> d = new c();

    public class a extends EntityInsertAdapter<EcgMedicalRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcgMedicalRecordEntity ecgMedicalRecordEntity) {
            if (ecgMedicalRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecgMedicalRecordEntity.getKey());
            }
            if (ecgMedicalRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, ecgMedicalRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, ecgMedicalRecordEntity.getTime());
            sQLiteStatement.mo50bindLong(4, ecgMedicalRecordEntity.getAnalyzedStatus());
            if (ecgMedicalRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, ecgMedicalRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(6, ecgMedicalRecordEntity.getZoneOffsetInSec());
            if (ecgMedicalRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecgMedicalRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(8, ecgMedicalRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, ecgMedicalRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, ecgMedicalRecordEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ecg_medical_record` (`key`,`sid`,`time`,`analyzedStatus`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<EcgMedicalRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcgMedicalRecordEntity ecgMedicalRecordEntity) {
            if (ecgMedicalRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecgMedicalRecordEntity.getKey());
            }
            if (ecgMedicalRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, ecgMedicalRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, ecgMedicalRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `ecg_medical_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<EcgMedicalRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, EcgMedicalRecordEntity ecgMedicalRecordEntity) {
            if (ecgMedicalRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, ecgMedicalRecordEntity.getKey());
            }
            if (ecgMedicalRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, ecgMedicalRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, ecgMedicalRecordEntity.getTime());
            sQLiteStatement.mo50bindLong(4, ecgMedicalRecordEntity.getAnalyzedStatus());
            if (ecgMedicalRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, ecgMedicalRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(6, ecgMedicalRecordEntity.getZoneOffsetInSec());
            if (ecgMedicalRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, ecgMedicalRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(8, ecgMedicalRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, ecgMedicalRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, ecgMedicalRecordEntity.getIsDeleted() ? 1L : 0L);
            if (ecgMedicalRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, ecgMedicalRecordEntity.getKey());
            }
            if (ecgMedicalRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, ecgMedicalRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(13, ecgMedicalRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `ecg_medical_record` SET `key` = ?,`sid` = ?,`time` = ?,`analyzedStatus` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public e(RoomDatabase roomDatabase) {
        this.f11355a = roomDatabase;
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

    @Override // com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        EcgMedicalRecordDao.DefaultImpls.deleteAll(this, list);
    }

    public final EcgMedicalRecordEntity g(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_ECG_INTERPRET_STATUS);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        EcgMedicalRecordEntity ecgMedicalRecordEntity = new EcgMedicalRecordEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            ecgMedicalRecordEntity.setAnalyzedStatus((int) sQLiteStatement.getLong(columnIndex4));
        }
        if (columnIndex5 != -1) {
            ecgMedicalRecordEntity.setValue(sQLiteStatement.isNull(columnIndex5) ? null : sQLiteStatement.getText(columnIndex5));
        }
        if (columnIndex6 != -1) {
            ecgMedicalRecordEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            ecgMedicalRecordEntity.setZoneName(sQLiteStatement.isNull(columnIndex7) ? null : sQLiteStatement.getText(columnIndex7));
        }
        if (columnIndex8 != -1) {
            ecgMedicalRecordEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex8));
        }
        if (columnIndex9 != -1) {
            ecgMedicalRecordEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        if (columnIndex10 != -1) {
            ecgMedicalRecordEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex10)) != 0);
        }
        return ecgMedicalRecordEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<EcgMedicalRecordEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11355a, true, false, new Function1() { // from class: ub7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35591a.l(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<EcgMedicalRecordEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11355a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: wb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37802a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11355a, true, false, new Function1() { // from class: rb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return e.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return EcgMedicalRecordDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void delete(final EcgMedicalRecordEntity... ecgMedicalRecordEntityArr) {
        ecgMedicalRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11355a, false, true, new Function1() { // from class: tb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34533a.k(ecgMedicalRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        EcgMedicalRecordDao.DefaultImpls.insertAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void insert(final EcgMedicalRecordEntity... ecgMedicalRecordEntityArr) {
        ecgMedicalRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11355a, false, true, new Function1() { // from class: vb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36709a.o(ecgMedicalRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(EcgMedicalRecordEntity[] ecgMedicalRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, ecgMedicalRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object o(EcgMedicalRecordEntity[] ecgMedicalRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11356b.insert(sQLiteConnection, ecgMedicalRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object p(EcgMedicalRecordEntity[] ecgMedicalRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, ecgMedicalRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void update(final EcgMedicalRecordEntity... ecgMedicalRecordEntityArr) {
        ecgMedicalRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11355a, false, true, new Function1() { // from class: sb7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33477a.p(ecgMedicalRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.EcgMedicalRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        EcgMedicalRecordDao.DefaultImpls.updateAll(this, list);
    }
}
