package defpackage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class xzm implements szm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f39622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<yzm> f39623b = new a();

    public class a extends EntityInsertAdapter<yzm> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, yzm yzmVar) {
            sQLiteStatement.mo50bindLong(1, yzmVar.F());
            sQLiteStatement.mo50bindLong(2, yzmVar.B());
            sQLiteStatement.mo50bindLong(3, yzmVar.C());
            sQLiteStatement.mo50bindLong(4, yzmVar.G());
            sQLiteStatement.mo50bindLong(5, yzmVar.H() ? 1L : 0L);
            if (yzmVar.f() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, yzmVar.f());
            }
            if (yzmVar.i() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, yzmVar.i());
            }
            if (yzmVar.g() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, yzmVar.g());
            }
            if (yzmVar.e() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, yzmVar.e());
            }
            sQLiteStatement.mo50bindLong(10, yzmVar.j());
            sQLiteStatement.mo50bindLong(11, yzmVar.l() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(12, yzmVar.k());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `record_sleep` (`id`,`begin_time`,`end_time`,`stage`,`segEnd`,`device_id`,`device_type`,`device_model`,`data_type`,`timestamp`,`deleted`,`update_time`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public xzm(RoomDatabase roomDatabase) {
        this.f39622a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from record_sleep");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ yzm k(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_sleep WHERE deleted=0 AND end_time >= ? and segEnd = 1 AND update_time = 0 and stage > 0 order by end_time asc limit 1 ");
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "begin_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StepsInfo.KEY_STAGE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "segEnd");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            yzm yzmVar = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                yzm yzmVar2 = new yzm();
                yzmVar2.R(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                yzmVar2.I(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                yzmVar2.L(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                yzmVar2.W((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                yzmVar2.V(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                yzmVar2.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                yzmVar2.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                yzmVar2.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                yzmVar2.q(text);
                yzmVar2.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) == 0) {
                    z = false;
                }
                yzmVar2.r(z);
                yzmVar2.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                yzmVar = yzmVar2;
            }
            return yzmVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List l(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_sleep WHERE deleted=0 AND end_time BETWEEN ? AND ? AND update_time = 0 and stage > 0 order by end_time desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "begin_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, StepsInfo.KEY_STAGE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "segEnd");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                yzm yzmVar = new yzm();
                int i = columnIndexOrThrow12;
                ArrayList arrayList2 = arrayList;
                yzmVar.R(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                yzmVar.I(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                yzmVar.L(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                yzmVar.W((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                yzmVar.V(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                yzmVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                yzmVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                yzmVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                yzmVar.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                int i2 = columnIndexOrThrow;
                int i3 = columnIndexOrThrow2;
                yzmVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                yzmVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                yzmVar.z(sQLiteStatementPrepare.getLong(i));
                arrayList2.add(yzmVar);
                columnIndexOrThrow12 = i;
                arrayList = arrayList2;
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo m(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT min(begin_time) as minTime, max(begin_time) as maxTime FROM record_sleep WHERE deleted=0 AND update_time = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.szm
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f39622a, true, false, new Function1() { // from class: uzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xzm.m((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.szm
    public void b() {
        DBUtil.performBlocking(this.f39622a, false, true, new Function1() { // from class: wzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xzm.j((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.szm
    public List<yzm> c(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f39622a, true, false, new Function1() { // from class: tzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xzm.l(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.szm
    public yzm d(final long j) {
        return (yzm) DBUtil.performBlocking(this.f39622a, true, false, new Function1() { // from class: vzm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xzm.k(j, (SQLiteConnection) obj);
            }
        });
    }
}
