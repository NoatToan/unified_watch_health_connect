package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.migration.TimeInfo;
import com.xiaomi.fitness.migration.exercise.entity.StepDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class ceo implements ydo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f5253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<StepDetail> f5254b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<StepDetail> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StepDetail stepDetail) {
            sQLiteStatement.mo50bindLong(1, stepDetail.e());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `step_detail` WHERE `beginTime` = ?";
        }
    }

    public ceo(RoomDatabase roomDatabase) {
        this.f5253a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM step_detail WHERE ((endTime >= ? AND endTime <= ?) OR (beginTime < ? AND endTime > ?)) AND deleted = 0  AND steps > 0 ORDER BY beginTime DESC ");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "beginTime");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "julianDay");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mode");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "steps");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "distance");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "consumption");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deleted");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                StepDetail stepDetail = new StepDetail();
                stepDetail.i(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                stepDetail.m(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                stepDetail.o((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                stepDetail.q((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                stepDetail.u((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                stepDetail.l((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow6));
                stepDetail.t((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7));
                stepDetail.j((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8));
                stepDetail.k((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                stepDetail.r(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                arrayList.add(stepDetail);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TimeInfo i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(beginTime) as minTime, max(beginTime) as maxTime from step_detail where deleted = 0 and steps > 0");
        try {
            return sQLiteStatementPrepare.step() ? new TimeInfo(sQLiteStatementPrepare.getLong(0), sQLiteStatementPrepare.getLong(1)) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.ydo
    public TimeInfo a() {
        return (TimeInfo) DBUtil.performBlocking(this.f5253a, true, false, new Function1() { // from class: aeo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ceo.i((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.ydo
    public List<StepDetail> b(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f5253a, true, false, new Function1() { // from class: zdo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ceo.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.ydo
    public void delete(final List<StepDetail> list) {
        DBUtil.performBlocking(this.f5253a, false, true, new Function1() { // from class: beo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4130a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f5254b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
