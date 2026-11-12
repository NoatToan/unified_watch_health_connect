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
import com.xiaomi.fit.fitness.persist.db.internal.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements BloodSugarDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<BloodSugarEntity> f11346b = new a();
    public final EntityDeleteOrUpdateAdapter<BloodSugarEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<BloodSugarEntity> d = new C0369c();

    public class a extends EntityInsertAdapter<BloodSugarEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, BloodSugarEntity bloodSugarEntity) {
            if (bloodSugarEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, bloodSugarEntity.getKey());
            }
            if (bloodSugarEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, bloodSugarEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, bloodSugarEntity.getTime());
            if (bloodSugarEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, bloodSugarEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, bloodSugarEntity.getZoneOffsetInSec());
            if (bloodSugarEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, bloodSugarEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, bloodSugarEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, bloodSugarEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, bloodSugarEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `blood_sugar_record` (`key`,`sid`,`time`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<BloodSugarEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, BloodSugarEntity bloodSugarEntity) {
            if (bloodSugarEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, bloodSugarEntity.getKey());
            }
            if (bloodSugarEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, bloodSugarEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, bloodSugarEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `blood_sugar_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.internal.c$c, reason: collision with other inner class name */
    public class C0369c extends EntityDeleteOrUpdateAdapter<BloodSugarEntity> {
        public C0369c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, BloodSugarEntity bloodSugarEntity) {
            if (bloodSugarEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, bloodSugarEntity.getKey());
            }
            if (bloodSugarEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, bloodSugarEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, bloodSugarEntity.getTime());
            if (bloodSugarEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, bloodSugarEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, bloodSugarEntity.getZoneOffsetInSec());
            if (bloodSugarEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, bloodSugarEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, bloodSugarEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, bloodSugarEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, bloodSugarEntity.getIsDeleted() ? 1L : 0L);
            if (bloodSugarEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, bloodSugarEntity.getKey());
            }
            if (bloodSugarEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, bloodSugarEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(12, bloodSugarEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `blood_sugar_record` SET `key` = ?,`sid` = ?,`time` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.f11345a = roomDatabase;
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

    @Override // com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        BloodSugarDao.DefaultImpls.deleteAll(this, list);
    }

    public final BloodSugarEntity g(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        BloodSugarEntity bloodSugarEntity = new BloodSugarEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            bloodSugarEntity.setValue(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            bloodSugarEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            bloodSugarEntity.setZoneName(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            bloodSugarEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            bloodSugarEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            bloodSugarEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return bloodSugarEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<BloodSugarEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11345a, true, false, new Function1() { // from class: e13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16142a.l(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<BloodSugarEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11345a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: g13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18451a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11345a, true, false, new Function1() { // from class: h13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return c.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return BloodSugarDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void delete(final BloodSugarEntity... bloodSugarEntityArr) {
        bloodSugarEntityArr.getClass();
        DBUtil.performBlocking(this.f11345a, false, true, new Function1() { // from class: c13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4814a.k(bloodSugarEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        BloodSugarDao.DefaultImpls.insertAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void insert(final BloodSugarEntity... bloodSugarEntityArr) {
        bloodSugarEntityArr.getClass();
        DBUtil.performBlocking(this.f11345a, false, true, new Function1() { // from class: f13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17279a.o(bloodSugarEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(BloodSugarEntity[] bloodSugarEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, bloodSugarEntityArr);
        return null;
    }

    public final /* synthetic */ Object o(BloodSugarEntity[] bloodSugarEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11346b.insert(sQLiteConnection, bloodSugarEntityArr);
        return null;
    }

    public final /* synthetic */ Object p(BloodSugarEntity[] bloodSugarEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, bloodSugarEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void update(final BloodSugarEntity... bloodSugarEntityArr) {
        bloodSugarEntityArr.getClass();
        DBUtil.performBlocking(this.f11345a, false, true, new Function1() { // from class: d13
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14947a.p(bloodSugarEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.BloodSugarDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        BloodSugarDao.DefaultImpls.updateAll(this, list);
    }
}
