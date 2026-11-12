package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class g4r implements WatchAppCapabilityDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f18595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<WatchAppCapability> f18596b = new a();
    public final EntityInsertAdapter<WatchAppCapability> c = new b();
    public final EntityDeleteOrUpdateAdapter<WatchAppCapability> d = new c();

    public class a extends EntityInsertAdapter<WatchAppCapability> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WatchAppCapability watchAppCapability) {
            if (watchAppCapability.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, watchAppCapability.getPackageName());
            }
            if (watchAppCapability.getAppName() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, watchAppCapability.getAppName());
            }
            sQLiteStatement.mo50bindLong(3, watchAppCapability.getHasNotificationPermission() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, watchAppCapability.getHasObserveStatePermission() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `watch_app_capability` (`packageName`,`appName`,`hasNotificationPermission`,`hasObserveStatePermission`) VALUES (?,?,?,?)";
        }
    }

    public class b extends EntityInsertAdapter<WatchAppCapability> {
        public b() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WatchAppCapability watchAppCapability) {
            if (watchAppCapability.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, watchAppCapability.getPackageName());
            }
            if (watchAppCapability.getAppName() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, watchAppCapability.getAppName());
            }
            sQLiteStatement.mo50bindLong(3, watchAppCapability.getHasNotificationPermission() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, watchAppCapability.getHasObserveStatePermission() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR ABORT INTO `watch_app_capability` (`packageName`,`appName`,`hasNotificationPermission`,`hasObserveStatePermission`) VALUES (?,?,?,?)";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<WatchAppCapability> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, WatchAppCapability watchAppCapability) {
            if (watchAppCapability.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, watchAppCapability.getPackageName());
            }
            if (watchAppCapability.getAppName() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, watchAppCapability.getAppName());
            }
            sQLiteStatement.mo50bindLong(3, watchAppCapability.getHasNotificationPermission() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, watchAppCapability.getHasObserveStatePermission() ? 1L : 0L);
            if (watchAppCapability.getPackageName() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, watchAppCapability.getPackageName());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `watch_app_capability` SET `packageName` = ?,`appName` = ?,`hasNotificationPermission` = ?,`hasObserveStatePermission` = ? WHERE `packageName` = ?";
        }
    }

    public g4r(RoomDatabase roomDatabase) {
        this.f18595a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List k(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM watch_app_capability");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packageName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appName");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasNotificationPermission");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasObserveStatePermission");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                boolean z = false;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0) {
                    z = true;
                }
                arrayList.add(new WatchAppCapability(text2, text, z2, z));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ WatchAppCapability l(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM watch_app_capability WHERE packageName=?");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "packageName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appName");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasNotificationPermission");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasObserveStatePermission");
            WatchAppCapability watchAppCapability = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) == 0) {
                    z = false;
                }
                watchAppCapability = new WatchAppCapability(text2, text, z2, z);
            }
            sQLiteStatementPrepare.close();
            return watchAppCapability;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List p(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(h(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao
    public List<WatchAppCapability> findAll() {
        return (List) DBUtil.performBlocking(this.f18595a, true, false, new Function1() { // from class: a4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return g4r.k((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao
    public WatchAppCapability findByPackageName(final String str) {
        return (WatchAppCapability) DBUtil.performBlocking(this.f18595a, true, false, new Function1() { // from class: z3r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return g4r.l(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super WatchAppCapability> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18595a, true, false, new Function1() { // from class: b4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3800a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final WatchAppCapability h(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "packageName");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "appName");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hasNotificationPermission");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hasObserveStatePermission");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        if (columnIndex2 != -1 && !sQLiteStatement.isNull(columnIndex2)) {
            text = sQLiteStatement.getText(columnIndex2);
        }
        boolean z = false;
        boolean z2 = (columnIndex3 == -1 || ((int) sQLiteStatement.getLong(columnIndex3)) == 0) ? false : true;
        if (columnIndex4 != -1) {
            z = ((int) sQLiteStatement.getLong(columnIndex4)) != 0;
        }
        return new WatchAppCapability(text2, text, z2, z);
    }

    @Override // com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao
    public void insertAll(final List<WatchAppCapability> list) {
        list.getClass();
        DBUtil.performBlocking(this.f18595a, false, true, new Function1() { // from class: c4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4928a.o(list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object insert(final WatchAppCapability[] watchAppCapabilityArr, Continuation<? super Unit> continuation) {
        watchAppCapabilityArr.getClass();
        return DBUtil.performSuspending(this.f18595a, false, true, new Function1() { // from class: f4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f17404a.n(watchAppCapabilityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<WatchAppCapability>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18595a, true, false, new Function1() { // from class: d4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15087a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ WatchAppCapability m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? h(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit n(WatchAppCapability[] watchAppCapabilityArr, SQLiteConnection sQLiteConnection) {
        this.f18596b.insert(sQLiteConnection, watchAppCapabilityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object o(List list, SQLiteConnection sQLiteConnection) {
        this.c.insert(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ Integer q(WatchAppCapability watchAppCapability, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, watchAppCapability));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Object update(final WatchAppCapability watchAppCapability, Continuation<? super Integer> continuation) {
        watchAppCapability.getClass();
        return DBUtil.performSuspending(this.f18595a, false, true, new Function1() { // from class: e4r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16269a.q(watchAppCapability, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
