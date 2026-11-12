package defpackage;

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
public final class hfq implements yeq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f20025a;

    public hfq(RoomDatabase roomDatabase) {
        this.f20025a = roomDatabase;
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public static /* synthetic */ vuf f(SQLiteConnection sQLiteConnection) {
        vuf vufVar;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from height order by recordTime desc limit 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordTime");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unit");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            if (sQLiteStatementPrepare.step()) {
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                vufVar = new vuf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), iaq.a((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)), j);
            } else {
                vufVar = null;
            }
            return vufVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List g(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from weight order by recordTime desc");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordTime");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unit");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new xwf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), iaq.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2))), sQLiteStatementPrepare.getLong(columnIndexOrThrow)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // defpackage.yeq
    public List<xwf> a() {
        return (List) DBUtil.performBlocking(this.f20025a, true, false, new Function1() { // from class: zeq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hfq.g((SQLiteConnection) obj);
            }
        });
    }

    @Override // defpackage.yeq
    public vuf b() {
        return (vuf) DBUtil.performBlocking(this.f20025a, true, false, new Function1() { // from class: bfq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return hfq.f((SQLiteConnection) obj);
            }
        });
    }
}
