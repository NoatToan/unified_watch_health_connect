package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class zvp implements TrainingPlanWeekDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f41728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<TrainingPlanWeekEntity> f41729b = new a();
    public final EntityDeleteOrUpdateAdapter<TrainingPlanWeekEntity> c = new b();

    public class a extends EntityInsertAdapter<TrainingPlanWeekEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingPlanWeekEntity trainingPlanWeekEntity) {
            sQLiteStatement.mo50bindLong(1, trainingPlanWeekEntity.getType());
            sQLiteStatement.mo50bindLong(2, trainingPlanWeekEntity.getId());
            if (trainingPlanWeekEntity.getCurWeekPlan() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, trainingPlanWeekEntity.getCurWeekPlan());
            }
            sQLiteStatement.mo50bindLong(4, trainingPlanWeekEntity.getStopped());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `training_plan_week` (`type`,`id`,`curWeekPlan`,`stopped`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<TrainingPlanWeekEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingPlanWeekEntity trainingPlanWeekEntity) {
            sQLiteStatement.mo50bindLong(1, trainingPlanWeekEntity.getType());
            sQLiteStatement.mo50bindLong(2, trainingPlanWeekEntity.getId());
            if (trainingPlanWeekEntity.getCurWeekPlan() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, trainingPlanWeekEntity.getCurWeekPlan());
            }
            sQLiteStatement.mo50bindLong(4, trainingPlanWeekEntity.getStopped());
            sQLiteStatement.mo50bindLong(5, trainingPlanWeekEntity.getId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `training_plan_week` SET `type` = ?,`id` = ?,`curWeekPlan` = ?,`stopped` = ? WHERE `id` = ?";
        }
    }

    public zvp(RoomDatabase roomDatabase) {
        this.f41728a = roomDatabase;
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List f(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM training_plan_week WHERE stopped = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "curWeekPlan");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopped");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TrainingPlanWeekEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TrainingPlanWeekEntity g(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM training_plan_week WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "curWeekPlan");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stopped");
            TrainingPlanWeekEntity trainingPlanWeekEntity = null;
            if (sQLiteStatementPrepare.step()) {
                trainingPlanWeekEntity = new TrainingPlanWeekEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
            }
            return trainingPlanWeekEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao
    public List<TrainingPlanWeekEntity> getCurWeekPlan() {
        return (List) DBUtil.performBlocking(this.f41728a, true, false, new Function1() { // from class: vvp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zvp.f((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao
    public TrainingPlanWeekEntity getWeekPlanById(final long j) {
        return (TrainingPlanWeekEntity) DBUtil.performBlocking(this.f41728a, true, false, new Function1() { // from class: wvp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zvp.g(j, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object h(TrainingPlanWeekEntity[] trainingPlanWeekEntityArr, SQLiteConnection sQLiteConnection) {
        this.f41729b.insert(sQLiteConnection, trainingPlanWeekEntityArr);
        return null;
    }

    public final /* synthetic */ Object i(TrainingPlanWeekEntity[] trainingPlanWeekEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, trainingPlanWeekEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao
    public void insert(final TrainingPlanWeekEntity... trainingPlanWeekEntityArr) {
        trainingPlanWeekEntityArr.getClass();
        DBUtil.performBlocking(this.f41728a, false, true, new Function1() { // from class: yvp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f40624a.h(trainingPlanWeekEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao
    public void update(final TrainingPlanWeekEntity... trainingPlanWeekEntityArr) {
        trainingPlanWeekEntityArr.getClass();
        DBUtil.performBlocking(this.f41728a, false, true, new Function1() { // from class: xvp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39518a.i(trainingPlanWeekEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
