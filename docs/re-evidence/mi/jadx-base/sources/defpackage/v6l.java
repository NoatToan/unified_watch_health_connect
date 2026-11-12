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
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.sport_manager_export.listener.SCMDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class v6l implements SCMDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f36560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<lcn> f36561b = new a();
    public final EntityDeleteOrUpdateAdapter<lcn> c = new b();
    public final EntityDeleteOrUpdateAdapter<lcn> d = new c();

    public class a extends EntityInsertAdapter<lcn> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, lcn lcnVar) {
            sQLiteStatement.mo50bindLong(1, lcnVar.f24908a);
            sQLiteStatement.mo50bindLong(2, lcnVar.f24909b ? 1L : 0L);
            sQLiteStatement.mo50bindLong(3, lcnVar.c ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, lcnVar.d);
            sQLiteStatement.mo50bindLong(5, lcnVar.e ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, lcnVar.f);
            sQLiteStatement.mo49bindDouble(7, lcnVar.g);
            sQLiteStatement.mo50bindLong(8, lcnVar.h ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, lcnVar.i ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, lcnVar.j);
            sQLiteStatement.mo50bindLong(11, lcnVar.f24910k ? 1L : 0L);
            String str = lcnVar.l;
            if (str == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str);
            }
            sQLiteStatement.mo50bindLong(13, lcnVar.m ? 1L : 0L);
            sQLiteStatement.mo50bindLong(14, lcnVar.n ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, lcnVar.o ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scm_table` (`sportType`,`isLight`,`isRemindHr`,`heartRate`,`isRemindSpeed`,`speed`,`riding`,`isNotifyKm`,`isMetronome`,`metronomeRate`,`isLockScreen`,`remindHertRateRange`,`basicVoiceRemind`,`isNotifyHrIntervalChange`,`isAutoPause`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<lcn> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, lcn lcnVar) {
            sQLiteStatement.mo50bindLong(1, lcnVar.f24908a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `scm_table` WHERE `sportType` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<lcn> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, lcn lcnVar) {
            sQLiteStatement.mo50bindLong(1, lcnVar.f24908a);
            sQLiteStatement.mo50bindLong(2, lcnVar.f24909b ? 1L : 0L);
            sQLiteStatement.mo50bindLong(3, lcnVar.c ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, lcnVar.d);
            sQLiteStatement.mo50bindLong(5, lcnVar.e ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, lcnVar.f);
            sQLiteStatement.mo49bindDouble(7, lcnVar.g);
            sQLiteStatement.mo50bindLong(8, lcnVar.h ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, lcnVar.i ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, lcnVar.j);
            sQLiteStatement.mo50bindLong(11, lcnVar.f24910k ? 1L : 0L);
            String str = lcnVar.l;
            if (str == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str);
            }
            sQLiteStatement.mo50bindLong(13, lcnVar.m ? 1L : 0L);
            sQLiteStatement.mo50bindLong(14, lcnVar.n ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, lcnVar.o ? 1L : 0L);
            sQLiteStatement.mo50bindLong(16, lcnVar.f24908a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `scm_table` SET `sportType` = ?,`isLight` = ?,`isRemindHr` = ?,`heartRate` = ?,`isRemindSpeed` = ?,`speed` = ?,`riding` = ?,`isNotifyKm` = ?,`isMetronome` = ?,`metronomeRate` = ?,`isLockScreen` = ?,`remindHertRateRange` = ?,`basicVoiceRemind` = ?,`isNotifyHrIntervalChange` = ?,`isAutoPause` = ? WHERE `sportType` = ?";
        }
    }

    public v6l(RoomDatabase roomDatabase) {
        this.f36560a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List n(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from scm_table");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLight");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRemindHr");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "heartRate");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRemindSpeed");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "riding");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNotifyKm");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isMetronome");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metronomeRate");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLockScreen");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remindHertRateRange");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basicVoiceRemind");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNotifyHrIntervalChange");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isAutoPause");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                lcn lcnVar = new lcn();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                lcnVar.f24908a = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                lcnVar.f24909b = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                lcnVar.c = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                lcnVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                lcnVar.e = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                lcnVar.f = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                lcnVar.g = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                lcnVar.h = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                lcnVar.i = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                lcnVar.j = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                lcnVar.f24910k = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    lcnVar.l = null;
                } else {
                    lcnVar.l = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                lcnVar.m = ((int) sQLiteStatementPrepare.getLong(i)) != 0;
                int i5 = columnIndexOrThrow4;
                lcnVar.n = ((int) sQLiteStatementPrepare.getLong(i2)) != 0;
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow5;
                lcnVar.o = ((int) sQLiteStatementPrepare.getLong(i6)) != 0;
                arrayList2.add(lcnVar);
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow2 = i3;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ lcn p(int i, SQLiteConnection sQLiteConnection) {
        lcn lcnVar;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * from scm_table WHERE sportType = ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLight");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRemindHr");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "heartRate");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRemindSpeed");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "speed");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "riding");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNotifyKm");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isMetronome");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metronomeRate");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isLockScreen");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remindHertRateRange");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "basicVoiceRemind");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isNotifyHrIntervalChange");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isAutoPause");
            if (sQLiteStatementPrepare.step()) {
                lcnVar = new lcn();
                lcnVar.f24908a = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                lcnVar.f24909b = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                lcnVar.c = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                lcnVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                lcnVar.e = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                lcnVar.f = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                lcnVar.g = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                lcnVar.h = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                lcnVar.i = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                lcnVar.j = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                lcnVar.f24910k = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    lcnVar.l = null;
                } else {
                    lcnVar.l = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                lcnVar.m = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                lcnVar.n = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)) != 0;
                lcnVar.o = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0;
            } else {
                lcnVar = null;
            }
            return lcnVar;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List r(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(i(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.SCMDao
    public void addOrUpdateSportConfigModel(final lcn lcnVar) {
        lcnVar.getClass();
        DBUtil.performBlocking(this.f36560a, false, true, new Function1() { // from class: p6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30066a.l(lcnVar, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.SCMDao
    public void deleteSportConfigModel(final lcn lcnVar) {
        lcnVar.getClass();
        DBUtil.performBlocking(this.f36560a, false, true, new Function1() { // from class: l6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f24721a.m(lcnVar, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.SCMDao
    public List<lcn> getAllSportConfigModel() {
        return (List) DBUtil.performBlocking(this.f36560a, true, false, new Function1() { // from class: f6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return v6l.n((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super lcn> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f36560a, true, false, new Function1() { // from class: h6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19750a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.SCMDao
    public lcn getSportConfigModel(final int i) {
        return (lcn) DBUtil.performBlocking(this.f36560a, true, false, new Function1() { // from class: j6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return v6l.p(i, (SQLiteConnection) obj);
            }
        });
    }

    public final lcn i(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, DailyRecordKey.sportType);
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isLight");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isRemindHr");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "heartRate");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isRemindSpeed");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "speed");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "riding");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isNotifyKm");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isMetronome");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "metronomeRate");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isLockScreen");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "remindHertRateRange");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "basicVoiceRemind");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isNotifyHrIntervalChange");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isAutoPause");
        lcn lcnVar = new lcn();
        if (columnIndex != -1) {
            lcnVar.f24908a = (int) sQLiteStatement.getLong(columnIndex);
        }
        if (columnIndex2 != -1) {
            lcnVar.f24909b = ((int) sQLiteStatement.getLong(columnIndex2)) != 0;
        }
        if (columnIndex3 != -1) {
            lcnVar.c = ((int) sQLiteStatement.getLong(columnIndex3)) != 0;
        }
        if (columnIndex4 != -1) {
            lcnVar.d = (int) sQLiteStatement.getLong(columnIndex4);
        }
        if (columnIndex5 != -1) {
            lcnVar.e = ((int) sQLiteStatement.getLong(columnIndex5)) != 0;
        }
        if (columnIndex6 != -1) {
            lcnVar.f = (int) sQLiteStatement.getLong(columnIndex6);
        }
        if (columnIndex7 != -1) {
            lcnVar.g = (float) sQLiteStatement.getDouble(columnIndex7);
        }
        if (columnIndex8 != -1) {
            lcnVar.h = ((int) sQLiteStatement.getLong(columnIndex8)) != 0;
        }
        if (columnIndex9 != -1) {
            lcnVar.i = ((int) sQLiteStatement.getLong(columnIndex9)) != 0;
        }
        if (columnIndex10 != -1) {
            lcnVar.j = (int) sQLiteStatement.getLong(columnIndex10);
        }
        if (columnIndex11 != -1) {
            lcnVar.f24910k = ((int) sQLiteStatement.getLong(columnIndex11)) != 0;
        }
        if (columnIndex12 != -1) {
            if (sQLiteStatement.isNull(columnIndex12)) {
                lcnVar.l = null;
            } else {
                lcnVar.l = sQLiteStatement.getText(columnIndex12);
            }
        }
        if (columnIndex13 != -1) {
            lcnVar.m = ((int) sQLiteStatement.getLong(columnIndex13)) != 0;
        }
        if (columnIndex14 != -1) {
            lcnVar.n = ((int) sQLiteStatement.getLong(columnIndex14)) != 0;
        }
        if (columnIndex15 != -1) {
            lcnVar.o = ((int) sQLiteStatement.getLong(columnIndex15)) != 0;
        }
        return lcnVar;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object insert(final lcn[] lcnVarArr, Continuation<? super Unit> continuation) {
        lcnVarArr.getClass();
        return DBUtil.performSuspending(this.f36560a, false, true, new Function1() { // from class: r6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32246a.q(lcnVarArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Object l(lcn lcnVar, SQLiteConnection sQLiteConnection) {
        this.f36561b.insert(sQLiteConnection, lcnVar);
        return null;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<lcn>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f36560a, true, false, new Function1() { // from class: t6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34376a.r(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Object m(lcn lcnVar, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, lcnVar);
        return null;
    }

    public final /* synthetic */ lcn o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? i(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit q(lcn[] lcnVarArr, SQLiteConnection sQLiteConnection) {
        this.f36561b.insert(sQLiteConnection, lcnVarArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Integer s(lcn lcnVar, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, lcnVar));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object update(final lcn lcnVar, Continuation<? super Integer> continuation) {
        lcnVar.getClass();
        return DBUtil.performSuspending(this.f36560a, false, true, new Function1() { // from class: n6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27602a.s(lcnVar, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
