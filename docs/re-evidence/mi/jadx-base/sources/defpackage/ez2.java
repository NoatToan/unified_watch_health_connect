package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class ez2 implements az2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f17206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<wz2> f17207b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<wz2> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, wz2 wz2Var) {
            sQLiteStatement.mo50bindLong(1, wz2Var.B());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_blood_pressure` WHERE `id` = ?";
        }
    }

    public ez2(RoomDatabase roomDatabase) {
        this.f17206a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_blood_pressure WHERE timestamp BETWEEN ? And ? AND deleted = 0 and update_time = 0 ORDER BY timestamp DESC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "high_pressure");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "low_pressure");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                wz2 wz2Var = new wz2();
                wz2Var.G(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                wz2Var.F((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                wz2Var.H((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                String text = null;
                wz2Var.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                wz2Var.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                wz2Var.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                }
                wz2Var.q(text);
                wz2Var.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                wz2Var.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                wz2Var.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                arrayList.add(wz2Var);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) as minTime, max(timestamp) as maxTime from record_blood_pressure where update_time = 0 and deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.az2
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f17206a, true, false, new Function1() { // from class: cz2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ez2.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.az2
    public List<wz2> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f17206a, true, false, new Function1() { // from class: bz2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ez2.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.az2
    public void delete(final List<wz2> list) {
        DBUtil.performBlocking(this.f17206a, false, true, new Function1() { // from class: dz2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16085a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f17207b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
