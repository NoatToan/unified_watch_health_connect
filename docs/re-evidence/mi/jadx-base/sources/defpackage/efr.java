package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.migration.weight.v2.WeightItemV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class efr implements bfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f16610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<WeightItemV2> f16611b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<WeightItemV2> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WeightItemV2 weightItemV2) {
            sQLiteStatement.mo50bindLong(1, weightItemV2.f());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `weight` WHERE `recordTime` = ?";
        }
    }

    public efr(RoomDatabase roomDatabase) {
        this.f16610a = roomDatabase;
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List f(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM weight ORDER BY recordTime desc");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordTime");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "record_day_time");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bmi");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source_type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unit");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                WeightItemV2 weightItemV2 = new WeightItemV2((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                Integer numValueOf = null;
                weightItemV2.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                weightItemV2.k(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                }
                weightItemV2.l(iaq.b(numValueOf));
                arrayList.add(weightItemV2);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.bfr
    public List<WeightItemV2> a() {
        return (List) DBUtil.performBlocking(this.f16610a, true, false, new Function1() { // from class: cfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return efr.f((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.bfr
    public void delete(final List<WeightItemV2> list) {
        DBUtil.performBlocking(this.f16610a, false, true, new Function1() { // from class: dfr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15495a.e(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object e(List list, SQLiteConnection sQLiteConnection) {
        this.f16611b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
