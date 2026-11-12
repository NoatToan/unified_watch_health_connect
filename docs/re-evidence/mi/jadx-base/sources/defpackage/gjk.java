package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class gjk implements cjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f19057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<bjk> f19058b = new a();
    public final EntityDeleteOrUpdateAdapter<bjk> c = new b();

    public class a extends EntityInsertAdapter<bjk> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, bjk bjkVar) {
            if (bjkVar.c() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, bjkVar.c());
            }
            if (bjkVar.e() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, bjkVar.e());
            }
            sQLiteStatement.mo50bindLong(3, bjkVar.b());
            sQLiteStatement.mo50bindLong(4, bjkVar.a());
            sQLiteStatement.mo50bindLong(5, bjkVar.d());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `reminder_notice_mapping` (`notice_id`,`remind_id`,`last_notice_time`,`display_duration`,`notification_id`) VALUES (?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<bjk> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, bjk bjkVar) {
            if (bjkVar.c() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, bjkVar.c());
            }
            if (bjkVar.e() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, bjkVar.e());
            }
            sQLiteStatement.mo50bindLong(3, bjkVar.b());
            sQLiteStatement.mo50bindLong(4, bjkVar.a());
            sQLiteStatement.mo50bindLong(5, bjkVar.d());
            if (bjkVar.c() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, bjkVar.c());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `reminder_notice_mapping` SET `notice_id` = ?,`remind_id` = ?,`last_notice_time` = ?,`display_duration` = ?,`notification_id` = ? WHERE `notice_id` = ?";
        }
    }

    public gjk(RoomDatabase roomDatabase) {
        this.f19057a = roomDatabase;
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object h(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM reminder_notice_mapping WHERE notice_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List j(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM reminder_notice_mapping");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "notice_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remind_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_notice_time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "display_duration");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "notification_id");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                bjk bjkVar = new bjk(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                bjkVar.h(text);
                bjkVar.g(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                arrayList.add(bjkVar);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.cjk
    public void a(final String str) {
        DBUtil.performBlocking(this.f19057a, false, true, new Function1() { // from class: ejk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return gjk.h(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.cjk
    public void b(final bjk... bjkVarArr) {
        DBUtil.performBlocking(this.f19057a, false, true, new Function1() { // from class: fjk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17851a.i(bjkVarArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.cjk
    public List<bjk> c() {
        return (List) DBUtil.performBlocking(this.f19057a, true, false, new Function1() { // from class: djk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return gjk.j((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object i(bjk[] bjkVarArr, SQLiteConnection sQLiteConnection) {
        this.f19058b.insert(sQLiteConnection, bjkVarArr);
        return null;
    }
}
