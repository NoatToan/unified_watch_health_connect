package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class s95 implements CurseObserverDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f33427a;

    public s95(RoomDatabase roomDatabase) {
        this.f33427a = roomDatabase;
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object d(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from curse_observer");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer e(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select count(*) from curse_observer");
        try {
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao
    public void clear() {
        DBUtil.performBlocking(this.f33427a, false, true, new Function1() { // from class: r95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return s95.d((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.CurseObserverDao
    public int getCount() {
        return ((Integer) DBUtil.performBlocking(this.f33427a, true, false, new Function1() { // from class: q95
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return s95.e((SQLiteConnection) obj);
            }
        })).intValue();
    }
}
