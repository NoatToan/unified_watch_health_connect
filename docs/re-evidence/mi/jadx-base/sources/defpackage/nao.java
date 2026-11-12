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
public final class nao implements jao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f27730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<iao> f27731b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<iao> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, iao iaoVar) {
            sQLiteStatement.mo50bindLong(1, iaoVar.A());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `stand_record` WHERE `id` = ?";
        }
    }

    public nao(RoomDatabase roomDatabase) {
        this.f27730a = roomDatabase;
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List g(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM stand_record WHERE timestamp BETWEEN ? And ? AND deleted = 0 and update_time = 0 ORDER BY timestamp DESC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basis");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                iao iaoVar = new iao();
                iaoVar.C((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                String text = null;
                iaoVar.B(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                iaoVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                iaoVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                iaoVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                }
                iaoVar.q(text);
                iaoVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                iaoVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                iaoVar.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                arrayList.add(iaoVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo h(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT min(timestamp) as minTime, max(timestamp) as maxTime FROM stand_record WHERE update_time = 0 AND deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.jao
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f27730a, true, false, new Function1() { // from class: lao
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return nao.h((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.jao
    public void delete(final List<iao> list) {
        DBUtil.performBlocking(this.f27730a, false, true, new Function1() { // from class: kao
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23664a.f(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object f(List list, SQLiteConnection sQLiteConnection) {
        this.f27731b.handleMultiple(sQLiteConnection, list);
        return null;
    }

    @Override // defpackage.jao
    public List<iao> queryStandRecords(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f27730a, true, false, new Function1() { // from class: mao
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return nao.g(j, j2, (SQLiteConnection) obj);
            }
        });
    }
}
