package defpackage;

import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao;
import com.xiaomi.fitness.aggregation.health.entity.DailyGoalReportEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class qaj implements RainbowEntityDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f31288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<DailyGoalReportEntity> f31289b = new a();
    public final EntityDeleteOrUpdateAdapter<DailyGoalReportEntity> c = new b();

    public class a extends EntityInsertAdapter<DailyGoalReportEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DailyGoalReportEntity dailyGoalReportEntity) {
            sQLiteStatement.mo50bindLong(1, dailyGoalReportEntity.getTimeInZero());
            if (dailyGoalReportEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, dailyGoalReportEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(3, dailyGoalReportEntity.getIsUpload() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `rainbow` (`timeInZero`,`value`,`isUpload`) VALUES (?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<DailyGoalReportEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, DailyGoalReportEntity dailyGoalReportEntity) {
            sQLiteStatement.mo50bindLong(1, dailyGoalReportEntity.getTimeInZero());
            if (dailyGoalReportEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, dailyGoalReportEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(3, dailyGoalReportEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, dailyGoalReportEntity.getTimeInZero());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `rainbow` SET `timeInZero` = ?,`value` = ?,`isUpload` = ? WHERE `timeInZero` = ?";
        }
    }

    public qaj(RoomDatabase roomDatabase) {
        this.f31288a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List l(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where isUpload = 0 order by timeInZero desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DailyGoalReportEntity dailyGoalReportEntity = new DailyGoalReportEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                dailyGoalReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0);
                arrayList.add(dailyGoalReportEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List m(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where timeInZero >= ? and timeInZero < ? order by timeInZero desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DailyGoalReportEntity dailyGoalReportEntity = new DailyGoalReportEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                dailyGoalReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0);
                arrayList.add(dailyGoalReportEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ DailyGoalReportEntity n(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where timeInZero = ? order by timeInZero desc limit 1");
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            DailyGoalReportEntity dailyGoalReportEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                DailyGoalReportEntity dailyGoalReportEntity2 = new DailyGoalReportEntity(j2, text);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) == 0) {
                    z = false;
                }
                dailyGoalReportEntity2.setUpload(z);
                dailyGoalReportEntity = dailyGoalReportEntity2;
            }
            return dailyGoalReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List o(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where timeInZero >= ? and timeInZero < ? order by timeInZero desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                DailyGoalReportEntity dailyGoalReportEntity = new DailyGoalReportEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                dailyGoalReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0);
                arrayList.add(dailyGoalReportEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ DailyGoalReportEntity p(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where timeInZero < ? order by timeInZero desc limit 1");
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            DailyGoalReportEntity dailyGoalReportEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                DailyGoalReportEntity dailyGoalReportEntity2 = new DailyGoalReportEntity(j2, text);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) == 0) {
                    z = false;
                }
                dailyGoalReportEntity2.setUpload(z);
                dailyGoalReportEntity = dailyGoalReportEntity2;
            }
            return dailyGoalReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ DailyGoalReportEntity q(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from rainbow where timeInZero < ? order by timeInZero desc limit 1");
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            DailyGoalReportEntity dailyGoalReportEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                DailyGoalReportEntity dailyGoalReportEntity2 = new DailyGoalReportEntity(j2, text);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) == 0) {
                    z = false;
                }
                dailyGoalReportEntity2.setUpload(z);
                dailyGoalReportEntity = dailyGoalReportEntity2;
            }
            return dailyGoalReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object s(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("update rainbow set isUpload = 1 where timeInZero = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public void insert(final DailyGoalReportEntity... dailyGoalReportEntityArr) {
        dailyGoalReportEntityArr.getClass();
        DBUtil.performBlocking(this.f31288a, false, true, new Function1() { // from class: paj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30170a.k(dailyGoalReportEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(DailyGoalReportEntity[] dailyGoalReportEntityArr, SQLiteConnection sQLiteConnection) {
        this.f31289b.insert(sQLiteConnection, dailyGoalReportEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public List<DailyGoalReportEntity> queryDailyGoalNotUploadReport(final int i) {
        return (List) DBUtil.performBlocking(this.f31288a, true, false, new Function1() { // from class: maj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.l(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public List<DailyGoalReportEntity> queryDailyGoalReport(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f31288a, true, false, new Function1() { // from class: oaj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.m(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public LiveData<List<DailyGoalReportEntity>> queryDailyGoalReportAsync(final long j, final long j2) {
        return this.f31288a.getInvalidationTracker().createLiveData(new String[]{"rainbow"}, false, new Function1() { // from class: laj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.o(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public LiveData<DailyGoalReportEntity> queryLatestDailyGoalReportAsync(final long j) {
        return this.f31288a.getInvalidationTracker().createLiveData(new String[]{"rainbow"}, false, new Function1() { // from class: naj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.p(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public DailyGoalReportEntity queryLatestDailyGoalReportBefore(final long j) {
        return (DailyGoalReportEntity) DBUtil.performBlocking(this.f31288a, true, false, new Function1() { // from class: haj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.q(j, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object r(DailyGoalReportEntity dailyGoalReportEntity, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, dailyGoalReportEntity);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public void update(final DailyGoalReportEntity dailyGoalReportEntity) {
        dailyGoalReportEntity.getClass();
        DBUtil.performBlocking(this.f31288a, false, true, new Function1() { // from class: iaj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20944a.r(dailyGoalReportEntity, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public void updateRainBowDataAfterCloud(final long j) {
        DBUtil.performBlocking(this.f31288a, false, true, new Function1() { // from class: kaj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.s(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RainbowEntityDao
    public DailyGoalReportEntity queryDailyGoalReport(final long j) {
        return (DailyGoalReportEntity) DBUtil.performBlocking(this.f31288a, true, false, new Function1() { // from class: jaj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qaj.n(j, (SQLiteConnection) obj);
            }
        });
    }
}
