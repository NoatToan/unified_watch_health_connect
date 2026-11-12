package defpackage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDao;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class u0n implements SleepTraceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f35258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SleepTraceLog> f35259b = new a();

    public class a extends EntityInsertAdapter<SleepTraceLog> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SleepTraceLog sleepTraceLog) {
            sQLiteStatement.mo50bindLong(1, sleepTraceLog.getVersion());
            sQLiteStatement.mo50bindLong(2, sleepTraceLog.getCategory());
            sQLiteStatement.mo50bindLong(3, sleepTraceLog.getEvent());
            sQLiteStatement.mo50bindLong(4, sleepTraceLog.getId());
            if (sleepTraceLog.getDescString() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, sleepTraceLog.getDescString());
            }
            sQLiteStatement.mo50bindLong(6, sleepTraceLog.getTimestamp());
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sleep_trace_log` (`version`,`category`,`event`,`id`,`desc`,`timestamp`) VALUES (?,?,?,nullif(?, 0),?,?)";
        }
    }

    public u0n(RoomDatabase roomDatabase) {
        this.f35258a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object g(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM sleep_trace_log WHERE timestamp < ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ SleepTraceLog h(int i, int i2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sleep_trace_log WHERE version = ? AND category = ? ORDER BY timestamp DESC LIMIT 1");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "desc");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            SleepTraceLog sleepTraceLog = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                SleepTraceLog sleepTraceLog2 = new SleepTraceLog();
                sleepTraceLog2.setVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sleepTraceLog2.setCategory((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sleepTraceLog2.setEvent((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sleepTraceLog2.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                sleepTraceLog2.setDescString(text);
                sleepTraceLog2.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                sleepTraceLog = sleepTraceLog2;
            }
            return sleepTraceLog;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List j(int i, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sleep_trace_log WHERE version = ? AND timestamp BETWEEN ? AND ? ORDER BY timestamp");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "desc");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SleepTraceLog sleepTraceLog = new SleepTraceLog();
                sleepTraceLog.setVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sleepTraceLog.setCategory((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sleepTraceLog.setEvent((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sleepTraceLog.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                sleepTraceLog.setDescString(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                sleepTraceLog.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                arrayList.add(sleepTraceLog);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List k(int i, int i2, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sleep_trace_log WHERE version = ? AND category = ? AND timestamp BETWEEN ? AND ? ORDER BY timestamp");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            sQLiteStatementPrepare.mo50bindLong(2, i2);
            sQLiteStatementPrepare.mo50bindLong(3, j);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "event");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "desc");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SleepTraceLog sleepTraceLog = new SleepTraceLog();
                sleepTraceLog.setVersion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                sleepTraceLog.setCategory((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                sleepTraceLog.setEvent((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sleepTraceLog.setId(sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                sleepTraceLog.setDescString(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                sleepTraceLog.setTimestamp(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                arrayList.add(sleepTraceLog);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDao
    public void delete(final long j) {
        DBUtil.performBlocking(this.f35258a, false, true, new Function1() { // from class: r0n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return u0n.g(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDao
    public SleepTraceLog getLast(final int i, final int i2) {
        return (SleepTraceLog) DBUtil.performBlocking(this.f35258a, true, false, new Function1() { // from class: q0n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return u0n.h(i, i2, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object i(SleepTraceLog[] sleepTraceLogArr, SQLiteConnection sQLiteConnection) {
        this.f35259b.insert(sQLiteConnection, sleepTraceLogArr);
        return null;
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDao
    public void insert(final SleepTraceLog... sleepTraceLogArr) {
        sleepTraceLogArr.getClass();
        DBUtil.performBlocking(this.f35258a, false, true, new Function1() { // from class: p0n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f29876a.i(sleepTraceLogArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDao
    public List<SleepTraceLog> query(final int i, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f35258a, true, false, new Function1() { // from class: s0n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return u0n.j(i, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sleep.trace.db.SleepTraceDao
    public List<SleepTraceLog> query(final int i, final int i2, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f35258a, true, false, new Function1() { // from class: t0n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return u0n.k(i, i2, j, j2, (SQLiteConnection) obj);
            }
        });
    }
}
