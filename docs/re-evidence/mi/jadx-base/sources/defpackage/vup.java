package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateEntity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class vup implements TrainingPlanCurDateDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f37242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<TrainingPlanCurDateEntity> f37243b = new a();
    public final EntityDeleteOrUpdateAdapter<TrainingPlanCurDateEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<TrainingPlanCurDateEntity> d = new c();

    public class a extends EntityInsertAdapter<TrainingPlanCurDateEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingPlanCurDateEntity trainingPlanCurDateEntity) {
            sQLiteStatement.mo50bindLong(1, trainingPlanCurDateEntity.getType());
            sQLiteStatement.mo50bindLong(2, trainingPlanCurDateEntity.getId());
            sQLiteStatement.mo50bindLong(3, trainingPlanCurDateEntity.getDate());
            if (trainingPlanCurDateEntity.getCurDatePlan() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, trainingPlanCurDateEntity.getCurDatePlan());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `training_plan_cur_date` (`type`,`id`,`date`,`curDatePlan`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<TrainingPlanCurDateEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingPlanCurDateEntity trainingPlanCurDateEntity) {
            sQLiteStatement.mo50bindLong(1, trainingPlanCurDateEntity.getId());
            sQLiteStatement.mo50bindLong(2, trainingPlanCurDateEntity.getDate());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `training_plan_cur_date` WHERE `id` = ? AND `date` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<TrainingPlanCurDateEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, TrainingPlanCurDateEntity trainingPlanCurDateEntity) {
            sQLiteStatement.mo50bindLong(1, trainingPlanCurDateEntity.getType());
            sQLiteStatement.mo50bindLong(2, trainingPlanCurDateEntity.getId());
            sQLiteStatement.mo50bindLong(3, trainingPlanCurDateEntity.getDate());
            if (trainingPlanCurDateEntity.getCurDatePlan() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, trainingPlanCurDateEntity.getCurDatePlan());
            }
            sQLiteStatement.mo50bindLong(5, trainingPlanCurDateEntity.getId());
            sQLiteStatement.mo50bindLong(6, trainingPlanCurDateEntity.getDate());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `training_plan_cur_date` SET `type` = ?,`id` = ?,`date` = ?,`curDatePlan` = ? WHERE `id` = ? AND `date` = ?";
        }
    }

    public vup(RoomDatabase roomDatabase) {
        this.f37242a = roomDatabase;
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List i(long j, int i, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM training_plan_cur_date WHERE date = ? AND type = ? AND id = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DialWidgetType.DATE);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "curDatePlan");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TrainingPlanCurDateEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM training_plan_cur_date");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DialWidgetType.DATE);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "curDatePlan");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TrainingPlanCurDateEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List k(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM training_plan_cur_date WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DialWidgetType.DATE);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "curDatePlan");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TrainingPlanCurDateEntity((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public void deleteInfoByPlanId(final TrainingPlanCurDateEntity trainingPlanCurDateEntity) {
        trainingPlanCurDateEntity.getClass();
        DBUtil.performBlocking(this.f37242a, false, true, new Function1() { // from class: pup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30807a.h(trainingPlanCurDateEntity, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public List<TrainingPlanCurDateEntity> getCurDatePlan(final int i, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f37242a, true, false, new Function1() { // from class: sup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return vup.i(j2, i, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public List<TrainingPlanCurDateEntity> getInfoByPlanId(final long j) {
        return (List) DBUtil.performBlocking(this.f37242a, true, false, new Function1() { // from class: rup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return vup.k(j, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object h(TrainingPlanCurDateEntity trainingPlanCurDateEntity, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, trainingPlanCurDateEntity);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public void insert(final TrainingPlanCurDateEntity... trainingPlanCurDateEntityArr) {
        trainingPlanCurDateEntityArr.getClass();
        DBUtil.performBlocking(this.f37242a, false, true, new Function1() { // from class: tup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35064a.l(trainingPlanCurDateEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object l(TrainingPlanCurDateEntity[] trainingPlanCurDateEntityArr, SQLiteConnection sQLiteConnection) {
        this.f37243b.insert(sQLiteConnection, trainingPlanCurDateEntityArr);
        return null;
    }

    public final /* synthetic */ Object m(TrainingPlanCurDateEntity[] trainingPlanCurDateEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, trainingPlanCurDateEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public void update(final TrainingPlanCurDateEntity... trainingPlanCurDateEntityArr) {
        trainingPlanCurDateEntityArr.getClass();
        DBUtil.performBlocking(this.f37242a, false, true, new Function1() { // from class: qup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31867a.m(trainingPlanCurDateEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao
    public List<TrainingPlanCurDateEntity> getCurDatePlan() {
        return (List) DBUtil.performBlocking(this.f37242a, true, false, new Function1() { // from class: uup
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return vup.j((SQLiteConnection) obj);
            }
        });
    }
}
