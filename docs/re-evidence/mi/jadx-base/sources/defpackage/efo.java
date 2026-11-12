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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class efo implements seo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f16605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<b2c> f16606b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<b2c> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, b2c b2cVar) {
            sQLiteStatement.mo50bindLong(1, b2cVar.C());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `record_step` WHERE `id` = ?";
        }
    }

    public efo(RoomDatabase roomDatabase) {
        this.f16605a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from record_step where ((end_time >= ? and end_time < ?) or (begin_time < ? and end_time > ?)) and update_time = 0 and deleted = 0 order by begin_time desc ");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "begin_time");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "step_distance");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "steps");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_id");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DeviceContractKt.COLUMN_DEVICE_TYPE);
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "device_model");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                b2c b2cVar = new b2c();
                int i = columnIndexOrThrow3;
                b2cVar.G(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                b2cVar.H(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                int i2 = columnIndexOrThrow;
                int i3 = columnIndexOrThrow2;
                b2cVar.L((float) sQLiteStatementPrepare.getDouble(i));
                b2cVar.R((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                b2cVar.I((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                String text = null;
                b2cVar.t(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                b2cVar.w(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                b2cVar.u(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                b2cVar.q(text);
                b2cVar.x(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                b2cVar.r(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                b2cVar.z(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                arrayList.add(b2cVar);
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(begin_time) as minTime, max(begin_time) as maxTime from record_step where update_time = 0 and deleted = 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.seo
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f16605a, true, false, new Function1() { // from class: teo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return efo.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.seo
    public List<b2c> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f16605a, true, false, new Function1() { // from class: xeo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return efo.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.seo
    public void delete(final List<b2c> list) {
        DBUtil.performBlocking(this.f16605a, false, true, new Function1() { // from class: veo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36821a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f16606b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
