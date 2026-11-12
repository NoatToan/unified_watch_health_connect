package defpackage;

import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class wlb implements slb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f38100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<xlb> f38101b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<xlb> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, xlb xlbVar) {
            sQLiteStatement.mo50bindLong(1, xlbVar.C());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_head_set` WHERE `id` = ?";
        }
    }

    public wlb(RoomDatabase roomDatabase) {
        this.f38100a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_head_set WHERE deleted = 0 and update_time = 0 and end_time < ? ORDER BY end_time DESC limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "begin_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, OvulationTestRecord.Result.HIGH);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                xlb xlbVar = new xlb();
                int i2 = columnIndexOrThrow11;
                ArrayList arrayList2 = arrayList;
                xlbVar.L(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                xlbVar.G(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                xlbVar.H(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                xlbVar.I(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0);
                String text = null;
                xlbVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                xlbVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                xlbVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                xlbVar.q(text);
                int i3 = columnIndexOrThrow;
                int i4 = columnIndexOrThrow2;
                xlbVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                xlbVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                xlbVar.z(sQLiteStatementPrepare.getLong(i2));
                arrayList2.add(xlbVar);
                columnIndexOrThrow11 = i2;
                arrayList = arrayList2;
                columnIndexOrThrow = i3;
                columnIndexOrThrow2 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) as minTime, max(timestamp) as maxTime from record_head_set where update_time = 0 and deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.slb
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f38100a, true, false, new Function1() { // from class: tlb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return wlb.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.slb
    public List<xlb> b(final long j, final int i) {
        return (List) DBUtil.performBlocking(this.f38100a, true, false, new Function1() { // from class: vlb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return wlb.h(j, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.slb
    public void delete(final List<xlb> list) {
        DBUtil.performBlocking(this.f38100a, false, true, new Function1() { // from class: ulb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35903a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f38101b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
