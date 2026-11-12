package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class ypf implements upf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f40399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityDeleteOrUpdateAdapter<zpf> f40400b = new a();

    public class a extends EntityDeleteOrUpdateAdapter<zpf> {
        public a() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, zpf zpfVar) {
            sQLiteStatement.mo50bindLong(1, zpfVar.f41549a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `menstruation` WHERE `date_num` = ?";
        }
    }

    public ypf(RoomDatabase roomDatabase) {
        this.f40399a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List h(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from menstruation where date_num between ? and ? order by date_num desc");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date_num");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "auto_end");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                zpf zpfVar = new zpf(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                zpfVar.f41550b = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                zpfVar.c = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                arrayList.add(zpfVar);
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Long i(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(date_num) from menstruation");
        try {
            return Long.valueOf(sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getLong(0) : 0L);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.upf
    public List<zpf> a(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f40399a, true, false, new Function1() { // from class: vpf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ypf.h(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.upf
    public long b() {
        return ((Long) DBUtil.performBlocking(this.f40399a, true, false, new Function1() { // from class: wpf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ypf.i((SQLiteConnection) obj);
            }
        })).longValue();
    }

    @Override // defpackage.upf
    public void delete(final List<zpf> list) {
        DBUtil.performBlocking(this.f40399a, false, true, new Function1() { // from class: xpf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39335a.g(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(List list, SQLiteConnection sQLiteConnection) {
        this.f40400b.handleMultiple(sQLiteConnection, list);
        return null;
    }
}
