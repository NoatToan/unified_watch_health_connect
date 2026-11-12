package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao;
import com.xiaomi.fitness.aggregation.health.entity.CurseRecordEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class ga5 implements CurseRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<CurseRecordEntity> f18772b = new a();
    public final EntityDeleteOrUpdateAdapter<CurseRecordEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<CurseRecordEntity> d = new c();

    public class a extends EntityInsertAdapter<CurseRecordEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, CurseRecordEntity curseRecordEntity) {
            sQLiteStatement.mo50bindLong(1, curseRecordEntity.getStartSec0TZ());
            sQLiteStatement.mo50bindLong(2, curseRecordEntity.getEndSec0TZ());
            sQLiteStatement.mo50bindLong(3, curseRecordEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, curseRecordEntity.getInterval());
            sQLiteStatement.mo50bindLong(5, curseRecordEntity.getId());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `curse_record` (`startSec0TZ`,`endSec0TZ`,`updateTime`,`interval`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<CurseRecordEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, CurseRecordEntity curseRecordEntity) {
            sQLiteStatement.mo50bindLong(1, curseRecordEntity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `curse_record` WHERE `id` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<CurseRecordEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, CurseRecordEntity curseRecordEntity) {
            sQLiteStatement.mo50bindLong(1, curseRecordEntity.getStartSec0TZ());
            sQLiteStatement.mo50bindLong(2, curseRecordEntity.getEndSec0TZ());
            sQLiteStatement.mo50bindLong(3, curseRecordEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, curseRecordEntity.getInterval());
            sQLiteStatement.mo50bindLong(5, curseRecordEntity.getId());
            sQLiteStatement.mo50bindLong(6, curseRecordEntity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR REPLACE `curse_record` SET `startSec0TZ` = ?,`endSec0TZ` = ?,`updateTime` = ?,`interval` = ?,`id` = ? WHERE `id` = ?";
        }
    }

    public ga5(RoomDatabase roomDatabase) {
        this.f18771a = roomDatabase;
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object o(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from curse_record");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer q(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from curse_record where id =?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ CurseRecordEntity r(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record where id =?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            return sQLiteStatementPrepare.step() ? new CurseRecordEntity(sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List s(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record  where startSec0TZ<=? and endSec0TZ>=? order by startSec0TZ asc ");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CurseRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ CurseRecordEntity t(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record where startSec0TZ > ? and startSec0TZ <=? order by startSec0TZ asc limit 1");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            return sQLiteStatementPrepare.step() ? new CurseRecordEntity(sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ CurseRecordEntity u(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record where endSec0TZ < ? order by endSec0TZ desc limit 1");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            return sQLiteStatementPrepare.step() ? new CurseRecordEntity(sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List v(long j, long j2, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record  where endSec0TZ>=? and startSec0TZ <=? order by startSec0TZ desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CurseRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List w(long j, int i, int i2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record where startSec0TZ <=? order by startSec0TZ desc limit ? offset ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            sQLiteStatementPrepare.mo50bindLong(3, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CurseRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List x(long j, long j2, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from curse_record  where endSec0TZ>=? and endSec0TZ <=? order by startSec0TZ desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startSec0TZ");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endSec0TZ");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new CurseRecordEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Integer z(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select count(*) from curse_record");
        try {
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object A(CurseRecordEntity[] curseRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, curseRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public void clear() {
        DBUtil.performBlocking(this.f18771a, false, true, new Function1() { // from class: t95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.o((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public void delete(final CurseRecordEntity... curseRecordEntityArr) {
        curseRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f18771a, false, true, new Function1() { // from class: ba5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3973a.p(curseRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public CurseRecordEntity getById(final int i) {
        return (CurseRecordEntity) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: x95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.r(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public List<CurseRecordEntity> getByRange(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: fa5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.s(j2, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public CurseRecordEntity getFirstAfter(final long j, final long j2) {
        return (CurseRecordEntity) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: ea5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.t(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public CurseRecordEntity getFirstBefore(final long j) {
        return (CurseRecordEntity) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: aa5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.u(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public List<CurseRecordEntity> getLatest(final long j, final int i, final long j2) {
        return (List) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: da5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.v(j, j2, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public List<CurseRecordEntity> getLatestByPage(final int i, final int i2, final long j) {
        return (List) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: w95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.w(j, i2, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public List<CurseRecordEntity> getLatestEnded(final long j, final int i, final long j2) {
        return (List) DBUtil.performBlocking(this.f18771a, true, false, new Function1() { // from class: v95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.x(j, j2, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public void insert(final CurseRecordEntity... curseRecordEntityArr) {
        curseRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f18771a, false, true, new Function1() { // from class: y95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39948a.y(curseRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public Flow<Integer> observerChange() {
        return FlowUtil.createFlow(this.f18771a, false, new String[]{"curse_record"}, new Function1() { // from class: z95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.z((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object p(CurseRecordEntity[] curseRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, curseRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public void update(final CurseRecordEntity... curseRecordEntityArr) {
        curseRecordEntityArr.getClass();
        DBUtil.performBlocking(this.f18771a, false, true, new Function1() { // from class: u95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35544a.A(curseRecordEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object y(CurseRecordEntity[] curseRecordEntityArr, SQLiteConnection sQLiteConnection) {
        this.f18772b.insert(sQLiteConnection, curseRecordEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.entity.CurseRecordDao
    public int delete(final int i) {
        return ((Integer) DBUtil.performBlocking(this.f18771a, false, true, new Function1() { // from class: ca5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ga5.q(i, (SQLiteConnection) obj);
            }
        })).intValue();
    }
}
