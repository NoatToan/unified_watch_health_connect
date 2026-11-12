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
public final class gqf implements bqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f19234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<aqf> f19235b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<aqf> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, aqf aqfVar) {
            sQLiteStatement.mo50bindLong(1, aqfVar.B());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_menstruate` WHERE `id` = ?";
        }
    }

    public gqf(RoomDatabase roomDatabase) {
        this.f19234a = roomDatabase;
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public static /* synthetic */ aqf j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from record_menstruate where deleted =0 and status = 1 order by date_num desc limit 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date_num");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_end");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            aqf aqfVar = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                aqf aqfVar2 = new aqf(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                aqfVar2.H((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                aqfVar2.F(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0);
                aqfVar2.G(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                aqfVar2.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                aqfVar2.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                aqfVar2.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                aqfVar2.q(text);
                aqfVar2.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                aqfVar2.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                aqfVar2.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                aqfVar = aqfVar2;
            }
            return aqfVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List k(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from record_menstruate where date_num between ? and ? and update_time = 0 and deleted = 0 order by date_num desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date_num");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_end");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                aqf aqfVar = new aqf(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                aqfVar.H((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                aqfVar.F(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0);
                int i = columnIndexOrThrow;
                int i2 = columnIndexOrThrow2;
                aqfVar.G(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                String text = null;
                aqfVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                aqfVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                aqfVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                aqfVar.q(text);
                aqfVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                aqfVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                aqfVar.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                arrayList.add(aqfVar);
                columnIndexOrThrow = i;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo l(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(date_num) as minTime, max(date_num) as maxTime from record_menstruate where deleted = 0 and update_time = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.bqf
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f19234a, true, false, new Function1() { // from class: cqf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return gqf.l((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.bqf
    public List<aqf> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f19234a, true, false, new Function1() { // from class: fqf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return gqf.k(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.bqf
    public aqf c() {
        return (aqf) DBUtil.performBlocking(this.f19234a, true, false, new Function1() { // from class: dqf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return gqf.j((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.bqf
    public void delete(final List<aqf> list) {
        DBUtil.performBlocking(this.f19234a, false, true, new Function1() { // from class: eqf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16961a.i(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object i(List list, SQLiteConnection sQLiteConnection) {
        this.f19235b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
