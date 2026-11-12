package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class y3n implements u3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f39759a;

    public y3n(RoomDatabase roomDatabase) {
        this.f39759a = roomDatabase;
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object h(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from snore_report");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Long i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) from snore_report where deleted = 0 and update_time = 0 ");
        try {
            return Long.valueOf(sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getLong(0) : 0L);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List j(String str, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (list == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                Iterator it = list.iterator();
                int i = 1;
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (l == null) {
                        sQLiteStatementPrepare.mo51bindNull(i);
                    } else {
                        sQLiteStatementPrepare.mo50bindLong(i, l.longValue());
                    }
                    i++;
                }
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "max_noise_decibel");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "snore_frequency");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "max_snore_decibel");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "snore_times");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "snore_duration");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "snore_list");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dream_talk_list");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "noise_list");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                q3n q3nVar = new q3n();
                int i2 = columnIndexOrThrow13;
                int i3 = columnIndexOrThrow14;
                q3nVar.I((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                q3nVar.G((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow2));
                q3nVar.R((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                q3nVar.W((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4));
                q3nVar.X((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                q3nVar.Y((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                String text = null;
                q3nVar.V(lm1.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)));
                q3nVar.H(lm1.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                q3nVar.L(lm1.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                q3nVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                q3nVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                q3nVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                columnIndexOrThrow13 = i2;
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                }
                q3nVar.q(text);
                int i4 = columnIndexOrThrow;
                columnIndexOrThrow14 = i3;
                int i5 = columnIndexOrThrow2;
                q3nVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow3;
                q3nVar.r(((int) sQLiteStatementPrepare.getLong(i6)) != 0);
                int i8 = columnIndexOrThrow16;
                int i9 = columnIndexOrThrow4;
                q3nVar.z(sQLiteStatementPrepare.getLong(i8));
                arrayList2.add(q3nVar);
                columnIndexOrThrow4 = i9;
                columnIndexOrThrow16 = i8;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow3 = i7;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow = i4;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // defpackage.u3n
    public List<q3n> a(final List<Long> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from snore_report where timestamp in (");
        StringUtil.appendPlaceholders(sb, list == null ? 1 : list.size());
        sb.append(") and deleted = 0 and update_time = 0 order by timestamp desc");
        final String string = sb.toString();
        return (List) DBUtil.performBlocking(this.f39759a, true, false, new Function1() { // from class: v3n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y3n.j(string, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.u3n
    public void b() {
        DBUtil.performBlocking(this.f39759a, false, true, new Function1() { // from class: x3n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y3n.h((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.u3n
    public long c() {
        return ((Long) DBUtil.performBlocking(this.f39759a, true, false, new Function1() { // from class: w3n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y3n.i((SQLiteConnection) obj);
            }
        })).longValue();
    }
}
