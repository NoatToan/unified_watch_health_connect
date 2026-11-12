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
import com.xiaomi.fit.fitness.persist.db.internal.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements Vo2MaxRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f11455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<Vo2MaxRecordEntity> f11456b = new a();
    public final EntityDeleteOrUpdateAdapter<Vo2MaxRecordEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<Vo2MaxRecordEntity> d = new c();

    public class a extends EntityInsertAdapter<Vo2MaxRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, Vo2MaxRecordEntity vo2MaxRecordEntity) {
            if (vo2MaxRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, vo2MaxRecordEntity.getKey());
            }
            if (vo2MaxRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, vo2MaxRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, vo2MaxRecordEntity.getTime());
            if (vo2MaxRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, vo2MaxRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, vo2MaxRecordEntity.getZoneOffsetInSec());
            if (vo2MaxRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, vo2MaxRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, vo2MaxRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, vo2MaxRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, vo2MaxRecordEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `v02max_record` (`key`,`sid`,`time`,`value`,`zoneOffsetInSec`,`zoneName`,`timeIn0Tz`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<Vo2MaxRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, Vo2MaxRecordEntity vo2MaxRecordEntity) {
            if (vo2MaxRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, vo2MaxRecordEntity.getKey());
            }
            if (vo2MaxRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, vo2MaxRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, vo2MaxRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `v02max_record` WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<Vo2MaxRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, Vo2MaxRecordEntity vo2MaxRecordEntity) {
            if (vo2MaxRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, vo2MaxRecordEntity.getKey());
            }
            if (vo2MaxRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, vo2MaxRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, vo2MaxRecordEntity.getTime());
            if (vo2MaxRecordEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, vo2MaxRecordEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(5, vo2MaxRecordEntity.getZoneOffsetInSec());
            if (vo2MaxRecordEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, vo2MaxRecordEntity.getZoneName());
            }
            sQLiteStatement.mo50bindLong(7, vo2MaxRecordEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(8, vo2MaxRecordEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, vo2MaxRecordEntity.getIsDeleted() ? 1L : 0L);
            if (vo2MaxRecordEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, vo2MaxRecordEntity.getKey());
            }
            if (vo2MaxRecordEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, vo2MaxRecordEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(12, vo2MaxRecordEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `v02max_record` SET `key` = ?,`sid` = ?,`time` = ?,`value` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ? WHERE `key` = ? AND `sid` = ? AND `time` = ?";
        }
    }

    public y(RoomDatabase roomDatabase) {
        this.f11455a = roomDatabase;
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

    @Override // com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void deleteAll(List<? extends DailyRecordBaseEntity> list) {
        Vo2MaxRecordDao.DefaultImpls.deleteAll(this, list);
    }

    public final Vo2MaxRecordEntity g(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneOffsetInSec");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "zoneName");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, FitnessDBConstants.COL_TIME_0_TZ);
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        Vo2MaxRecordEntity vo2MaxRecordEntity = new Vo2MaxRecordEntity((columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex), (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2), columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3));
        if (columnIndex4 != -1) {
            vo2MaxRecordEntity.setValue(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            vo2MaxRecordEntity.setZoneOffsetInSec((int) sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            vo2MaxRecordEntity.setZoneName(sQLiteStatement.isNull(columnIndex6) ? null : sQLiteStatement.getText(columnIndex6));
        }
        if (columnIndex7 != -1) {
            vo2MaxRecordEntity.setTimeIn0Tz(sQLiteStatement.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            vo2MaxRecordEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            vo2MaxRecordEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return vo2MaxRecordEntity;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public List<Vo2MaxRecordEntity> getDailyRecord(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f11455a, true, false, new Function1() { // from class: s2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33222a.l(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Flow<List<Vo2MaxRecordEntity>> getDailyRecordAsync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.f11455a, false, new String[]{FitnessDBConstants.TABLE_RUN_ABILITY_INDEX, FitnessDBConstants.TABLE_BLOOD_SUGAR}, new Function1() { // from class: u2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35320a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public Object getRecordSource(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f11455a, true, false, new Function1() { // from class: x2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y.n(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao, com.xiaomi.fit.fitness.persist.db.internal.PagedLoadDao
    public String getTableName() {
        return Vo2MaxRecordDao.DefaultImpls.getTableName(this);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void delete(final Vo2MaxRecordEntity... vo2MaxRecordEntityArr) {
        vo2MaxRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11455a, false, true, new Function1() { // from class: w2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37490a.k(vo2MaxRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void insertAll(List<? extends DailyRecordBaseEntity> list) {
        Vo2MaxRecordDao.DefaultImpls.insertAll(this, list);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void insert(final Vo2MaxRecordEntity... vo2MaxRecordEntityArr) {
        vo2MaxRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11455a, false, true, new Function1() { // from class: t2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34246a.o(vo2MaxRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(Vo2MaxRecordEntity[] vo2MaxRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, vo2MaxRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object o(Vo2MaxRecordEntity[] vo2MaxRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.f11456b.insert(sQLiteConnection, vo2MaxRecordEntityArr);
        return null;
    }

    public final /* synthetic */ Object p(Vo2MaxRecordEntity[] vo2MaxRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, vo2MaxRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void update(final Vo2MaxRecordEntity... vo2MaxRecordEntityArr) {
        vo2MaxRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f11455a, false, true, new Function1() { // from class: v2r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36419a.p(vo2MaxRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.Vo2MaxRecordDao, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao
    public void updateAll(List<? extends DailyRecordBaseEntity> list) {
        Vo2MaxRecordDao.DefaultImpls.updateAll(this, list);
    }
}
