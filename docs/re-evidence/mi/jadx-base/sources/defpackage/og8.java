package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.entity.ExerciseRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class og8 implements kg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f29133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<ExerciseRecord> f29134b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<ExerciseRecord> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ExerciseRecord exerciseRecord) {
            sQLiteStatement.mo50bindLong(1, exerciseRecord.I());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_exercise` WHERE `id` = ?";
        }
    }

    public og8(RoomDatabase roomDatabase) {
        this.f29133a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from record_exercise where ((end_time >= ? and end_time < ?) or (begin_time < ? and end_time > ?)) and update_time = 0 and deleted = 0 order by begin_time desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sports_type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "begin_time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "distance");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "calories");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_consume");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "track_filename");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pressure_filename");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "intensity");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "course_id");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "detail");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                ExerciseRecord exerciseRecord = new ExerciseRecord();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                exerciseRecord.p0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                exerciseRecord.w0(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i3 = columnIndexOrThrow;
                int i4 = columnIndexOrThrow2;
                exerciseRecord.Y(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                exerciseRecord.k0(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                exerciseRecord.j0(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                exerciseRecord.h0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                exerciseRecord.a0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                exerciseRecord.x0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                exerciseRecord.y0(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                exerciseRecord.u0(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                exerciseRecord.q0(vcd.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)));
                exerciseRecord.v0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                int i5 = columnIndexOrThrow3;
                int i6 = columnIndexOrThrow4;
                exerciseRecord.e0(sQLiteStatementPrepare.getLong(i));
                exerciseRecord.l0(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                int i7 = columnIndexOrThrow15;
                exerciseRecord.t(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                int i8 = columnIndexOrThrow16;
                exerciseRecord.w(sQLiteStatementPrepare.isNull(i8) ? null : sQLiteStatementPrepare.getText(i8));
                columnIndexOrThrow17 = columnIndexOrThrow17;
                exerciseRecord.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                columnIndexOrThrow18 = columnIndexOrThrow18;
                exerciseRecord.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                columnIndexOrThrow15 = i7;
                int i9 = columnIndexOrThrow19;
                exerciseRecord.x(sQLiteStatementPrepare.getLong(i9));
                columnIndexOrThrow19 = i9;
                int i10 = columnIndexOrThrow20;
                exerciseRecord.r(((int) sQLiteStatementPrepare.getLong(i10)) != 0);
                columnIndexOrThrow20 = i10;
                int i11 = columnIndexOrThrow21;
                exerciseRecord.z(sQLiteStatementPrepare.getLong(i11));
                arrayList2.add(exerciseRecord);
                columnIndexOrThrow21 = i11;
                arrayList = arrayList2;
                columnIndexOrThrow = i3;
                columnIndexOrThrow4 = i6;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i5;
                columnIndexOrThrow16 = i8;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow2 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(begin_time) as minTime, max(begin_time) as maxTime from record_exercise where update_time = 0 and deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.kg8
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f29133a, true, false, new Function1() { // from class: ng8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return og8.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.kg8
    public List<ExerciseRecord> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f29133a, true, false, new Function1() { // from class: lg8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return og8.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.kg8
    public void delete(final List<ExerciseRecord> list) {
        DBUtil.performBlocking(this.f29133a, false, true, new Function1() { // from class: mg8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f26134a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f29134b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
