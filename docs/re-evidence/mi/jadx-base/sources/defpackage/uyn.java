package defpackage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserver;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class uyn implements SportReportObserverDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f36285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SportReportObserver> f36286b = new a();

    public class a extends EntityInsertAdapter<SportReportObserver> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportReportObserver sportReportObserver) {
            sQLiteStatement.mo50bindLong(1, sportReportObserver.getId());
            if (sportReportObserver.getName() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportReportObserver.getName());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR IGNORE INTO `sport_report_observer` (`id`,`name`) VALUES (?,?)";
        }
    }

    public uyn(RoomDatabase roomDatabase) {
        this.f36285a = roomDatabase;
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object e(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("delete from sport_report_observer");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer f(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select count(*) from sport_report_observer");
        try {
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao
    public void clear() {
        DBUtil.performBlocking(this.f36285a, false, true, new Function1() { // from class: ryn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return uyn.e((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Long g(SportReportObserver sportReportObserver, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f36286b.insertAndReturnId(sQLiteConnection, sportReportObserver));
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao
    public int getCount() {
        return ((Integer) DBUtil.performBlocking(this.f36285a, true, false, new Function1() { // from class: syn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return uyn.f((SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportObserverDao
    public long insert(final SportReportObserver sportReportObserver) {
        sportReportObserver.getClass();
        return ((Long) DBUtil.performBlocking(this.f36285a, false, true, new Function1() { // from class: tyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35189a.g(sportReportObserver, (SQLiteConnection) obj);
            }
        })).longValue();
    }
}
