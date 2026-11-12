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
public final class y3c implements u3c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f39747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<d4c> f39748b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<d4c> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, d4c d4cVar) {
            sQLiteStatement.mo50bindLong(1, d4cVar.H());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_weight` WHERE `id` = ?";
        }
    }

    public y3c(RoomDatabase roomDatabase) {
        this.f39747a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ TimeInfo h(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timestamp) as minTime, max(timestamp) as maxTime from record_weight where deleted = 0 and update_time = 0 and weight > 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List i(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM record_weight WHERE deleted = 0 AND weight > 0 and timestamp between ? and ? and update_time = 0");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_day_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "height");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bmi");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fat_rate");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "body_water_rate");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bone_mass");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metabolism");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "muscle_rate");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "visceral_fat");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impedance");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "protein_rate");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                d4c d4cVar = new d4c();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                d4cVar.k0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                d4cVar.w0(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i3 = columnIndexOrThrow;
                int i4 = columnIndexOrThrow2;
                d4cVar.y0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3));
                d4cVar.j0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4));
                d4cVar.Y((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5));
                d4cVar.h0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow6));
                d4cVar.a0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7));
                d4cVar.e0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8));
                d4cVar.p0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow9));
                d4cVar.q0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow10));
                d4cVar.x0((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow11));
                d4cVar.l0((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                int i5 = columnIndexOrThrow3;
                d4cVar.u0((float) sQLiteStatementPrepare.getDouble(i));
                d4cVar.t(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                int i6 = columnIndexOrThrow15;
                d4cVar.w(sQLiteStatementPrepare.isNull(i6) ? null : sQLiteStatementPrepare.getText(i6));
                int i7 = columnIndexOrThrow16;
                d4cVar.u(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                columnIndexOrThrow17 = columnIndexOrThrow17;
                d4cVar.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
                int i8 = columnIndexOrThrow18;
                columnIndexOrThrow15 = i6;
                d4cVar.x(sQLiteStatementPrepare.getLong(i8));
                int i9 = columnIndexOrThrow4;
                int i10 = columnIndexOrThrow19;
                d4cVar.r(((int) sQLiteStatementPrepare.getLong(i10)) != 0);
                columnIndexOrThrow19 = i10;
                int i11 = columnIndexOrThrow20;
                d4cVar.z(sQLiteStatementPrepare.getLong(i11));
                arrayList2.add(d4cVar);
                arrayList = arrayList2;
                columnIndexOrThrow20 = i11;
                columnIndexOrThrow = i3;
                columnIndexOrThrow3 = i5;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow4 = i9;
                columnIndexOrThrow18 = i8;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.u3c
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f39747a, true, false, new Function1() { // from class: w3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y3c.h((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.u3c
    public List<d4c> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f39747a, true, false, new Function1() { // from class: x3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return y3c.i(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.u3c
    public void delete(final List<d4c> list) {
        DBUtil.performBlocking(this.f39747a, false, true, new Function1() { // from class: v3c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36435a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f39748b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
