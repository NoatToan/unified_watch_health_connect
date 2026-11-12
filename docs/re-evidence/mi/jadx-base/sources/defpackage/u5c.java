package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.heartrate.ui.DetectManualActivity;
import com.xiaomi.fitness.migration.TimeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class u5c implements q5c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f35398a;
    public final fhe c = new fhe();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<f6c> f35399b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<f6c> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, f6c f6cVar) {
            sQLiteStatement.mo50bindLong(1, f6cVar.B());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `heart_rate` WHERE `id` = ?";
        }
    }

    public u5c(RoomDatabase roomDatabase) {
        this.f35398a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) as minTime, max(timestamp) as maxTime from heart_rate where deleted = 0 and hrm_ype = 'HRM_ONCE' and hrm > 0 and update_time = 0 ");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.q5c
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f35398a, true, false, new Function1() { // from class: s5c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return u5c.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.q5c
    public List<f6c> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f35398a, true, false, new Function1() { // from class: t5c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34333a.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.q5c
    public void delete(final List<f6c> list) {
        DBUtil.performBlocking(this.f35398a, false, true, new Function1() { // from class: r5c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32202a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f35399b.handleMultiple(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from heart_rate where deleted = 0 and hrm_ype = 'HRM_ONCE' and hrm > 0 and update_time = 0 and (device_type = 'PHONE' or device_type = 'MANUAL') and timestamp between ? and ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hrm_ype");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hrm_record");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rhr_avg");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hrm");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "once_type");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DetectManualActivity.DETECT_TYPE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                f6c f6cVar = new f6c();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                f6cVar.I((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                f6cVar.H(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i3 = columnIndexOrThrow;
                try {
                    f6cVar.G(this.c.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)));
                    int i4 = columnIndexOrThrow2;
                    f6cVar.R((short) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                    f6cVar.F((short) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                    f6cVar.L((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                    f6cVar.C((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                    f6cVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                    f6cVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                    f6cVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                    f6cVar.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                    f6cVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                    int i5 = columnIndexOrThrow3;
                    f6cVar.r(((int) sQLiteStatementPrepare.getLong(i)) != 0);
                    int i6 = columnIndexOrThrow4;
                    f6cVar.z(sQLiteStatementPrepare.getLong(i2));
                    arrayList2.add(f6cVar);
                    columnIndexOrThrow4 = i6;
                    columnIndexOrThrow14 = i2;
                    arrayList = arrayList2;
                    columnIndexOrThrow2 = i4;
                    columnIndexOrThrow3 = i5;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow = i3;
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
