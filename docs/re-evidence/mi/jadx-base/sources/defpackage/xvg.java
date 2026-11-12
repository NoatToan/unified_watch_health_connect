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
public final class xvg implements tvg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f39508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<yvg> f39509b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<yvg> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, yvg yvgVar) {
            sQLiteStatement.mo50bindLong(1, yvgVar.B());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_noise` WHERE `id` = ?";
        }
    }

    public xvg(RoomDatabase roomDatabase) {
        this.f39508a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_noise WHERE deleted = 0 and update_time = 0 and timestamp < ? ORDER BY timestamp DESC limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "decibel");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                yvg yvgVar = new yvg();
                yvgVar.F(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                yvgVar.C((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text = null;
                yvgVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                yvgVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                yvgVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                yvgVar.q(text);
                yvgVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                yvgVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                yvgVar.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                arrayList.add(yvgVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) as minTime, max(timestamp) as maxTime from record_noise where update_time = 0 and deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.tvg
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f39508a, true, false, new Function1() { // from class: uvg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xvg.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.tvg
    public List<yvg> b(final long j, final int i) {
        return (List) DBUtil.performBlocking(this.f39508a, true, false, new Function1() { // from class: vvg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return xvg.h(j, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.tvg
    public void delete(final List<yvg> list) {
        DBUtil.performBlocking(this.f39508a, false, true, new Function1() { // from class: wvg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f38404a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f39509b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
