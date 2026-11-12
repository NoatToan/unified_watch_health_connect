package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao;
import com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class p51 implements AlgoCurseDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f30007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<AlgoCurseEntity> f30008b = new a();
    public final EntityDeleteOrUpdateAdapter<AlgoCurseEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<AlgoCurseEntity> d = new c();

    public class a extends EntityInsertAdapter<AlgoCurseEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AlgoCurseEntity algoCurseEntity) {
            sQLiteStatement.mo50bindLong(1, algoCurseEntity.getId());
            sQLiteStatement.mo50bindLong(2, algoCurseEntity.getStartTime());
            sQLiteStatement.mo50bindLong(3, algoCurseEntity.getEndTime());
            sQLiteStatement.mo50bindLong(4, algoCurseEntity.getOvulationTime());
            sQLiteStatement.mo50bindLong(5, algoCurseEntity.getCursePeriod());
            sQLiteStatement.mo50bindLong(6, algoCurseEntity.getMenstrualPeriod());
            sQLiteStatement.mo50bindLong(7, algoCurseEntity.getStatus());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `algo_curse` (`id`,`startTime`,`endTime`,`ovulationTime`,`cursePeriod`,`menstrualPeriod`,`status`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<AlgoCurseEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AlgoCurseEntity algoCurseEntity) {
            sQLiteStatement.mo50bindLong(1, algoCurseEntity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `algo_curse` WHERE `id` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<AlgoCurseEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, AlgoCurseEntity algoCurseEntity) {
            sQLiteStatement.mo50bindLong(1, algoCurseEntity.getId());
            sQLiteStatement.mo50bindLong(2, algoCurseEntity.getStartTime());
            sQLiteStatement.mo50bindLong(3, algoCurseEntity.getEndTime());
            sQLiteStatement.mo50bindLong(4, algoCurseEntity.getOvulationTime());
            sQLiteStatement.mo50bindLong(5, algoCurseEntity.getCursePeriod());
            sQLiteStatement.mo50bindLong(6, algoCurseEntity.getMenstrualPeriod());
            sQLiteStatement.mo50bindLong(7, algoCurseEntity.getStatus());
            sQLiteStatement.mo50bindLong(8, algoCurseEntity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `algo_curse` SET `id` = ?,`startTime` = ?,`endTime` = ?,`ovulationTime` = ?,`cursePeriod` = ?,`menstrualPeriod` = ?,`status` = ? WHERE `id` = ?";
        }
    }

    public p51(RoomDatabase roomDatabase) {
        this.f30007a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ AlgoCurseEntity h(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM algo_curse WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            return sQLiteStatementPrepare.step() ? new AlgoCurseEntity((int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime")), sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ovulationTime")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cursePeriod")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "menstrualPeriod")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM algo_curse");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ovulationTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cursePeriod");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "menstrualPeriod");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                arrayList.add(new AlgoCurseEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao
    public void delete(final List<AlgoCurseEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.f30007a, false, true, new Function1() { // from class: m51
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25758a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, list);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao
    public AlgoCurseEntity getEntityById(final int i) {
        return (AlgoCurseEntity) DBUtil.performBlocking(this.f30007a, true, false, new Function1() { // from class: l51
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return p51.h(i, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object i(AlgoCurseEntity[] algoCurseEntityArr, SQLiteConnection sQLiteConnection) {
        this.f30008b.insert(sQLiteConnection, algoCurseEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao
    public void insert(final AlgoCurseEntity... algoCurseEntityArr) {
        algoCurseEntityArr.getClass();
        DBUtil.performBlocking(this.f30007a, false, true, new Function1() { // from class: n51
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27556a.i(algoCurseEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(AlgoCurseEntity[] algoCurseEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, algoCurseEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao
    public List<AlgoCurseEntity> queryAllEntities() {
        return (List) DBUtil.performBlocking(this.f30007a, true, false, new Function1() { // from class: o51
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return p51.j((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.AlgoCurseDao
    public void update(final AlgoCurseEntity... algoCurseEntityArr) {
        algoCurseEntityArr.getClass();
        DBUtil.performBlocking(this.f30007a, false, true, new Function1() { // from class: k51
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23462a.k(algoCurseEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
