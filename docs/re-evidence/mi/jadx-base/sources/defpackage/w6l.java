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
import com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class w6l implements SCMDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f37662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<mcn> f37663b = new a();
    public final EntityDeleteOrUpdateAdapter<mcn> c = new b();
    public final EntityDeleteOrUpdateAdapter<mcn> d = new c();

    public class a extends EntityInsertAdapter<mcn> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, mcn mcnVar) {
            sQLiteStatement.mo50bindLong(1, mcnVar.f26018a);
            sQLiteStatement.mo50bindLong(2, mcnVar.f26019b ? 1L : 0L);
            sQLiteStatement.mo50bindLong(3, mcnVar.c ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, mcnVar.d);
            sQLiteStatement.mo50bindLong(5, mcnVar.e ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, mcnVar.f);
            sQLiteStatement.mo49bindDouble(7, mcnVar.g);
            sQLiteStatement.mo50bindLong(8, mcnVar.h ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, mcnVar.i ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, mcnVar.j);
            sQLiteStatement.mo50bindLong(11, mcnVar.f26020k ? 1L : 0L);
            String str = mcnVar.l;
            if (str == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str);
            }
            sQLiteStatement.mo50bindLong(13, mcnVar.m ? 1L : 0L);
            sQLiteStatement.mo50bindLong(14, mcnVar.n ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, mcnVar.o ? 1L : 0L);
            sQLiteStatement.mo50bindLong(16, mcnVar.p);
            sQLiteStatement.mo50bindLong(17, mcnVar.q);
            sQLiteStatement.mo50bindLong(18, mcnVar.f26021r);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `eco_scm_table` (`sportType`,`isLight`,`isRemindHr`,`heartRate`,`isRemindSpeed`,`speed`,`riding`,`isNotifyKm`,`isMetronome`,`metronomeRate`,`isLockScreen`,`remindHertRateRange`,`basicVoiceRemind`,`isNotifyHrIntervalChange`,`isAutoPause`,`countdown`,`countingInterval`,`reportingInterval`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<mcn> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, mcn mcnVar) {
            sQLiteStatement.mo50bindLong(1, mcnVar.f26018a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `eco_scm_table` WHERE `sportType` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<mcn> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, mcn mcnVar) {
            sQLiteStatement.mo50bindLong(1, mcnVar.f26018a);
            sQLiteStatement.mo50bindLong(2, mcnVar.f26019b ? 1L : 0L);
            sQLiteStatement.mo50bindLong(3, mcnVar.c ? 1L : 0L);
            sQLiteStatement.mo50bindLong(4, mcnVar.d);
            sQLiteStatement.mo50bindLong(5, mcnVar.e ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, mcnVar.f);
            sQLiteStatement.mo49bindDouble(7, mcnVar.g);
            sQLiteStatement.mo50bindLong(8, mcnVar.h ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, mcnVar.i ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, mcnVar.j);
            sQLiteStatement.mo50bindLong(11, mcnVar.f26020k ? 1L : 0L);
            String str = mcnVar.l;
            if (str == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str);
            }
            sQLiteStatement.mo50bindLong(13, mcnVar.m ? 1L : 0L);
            sQLiteStatement.mo50bindLong(14, mcnVar.n ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, mcnVar.o ? 1L : 0L);
            sQLiteStatement.mo50bindLong(16, mcnVar.p);
            sQLiteStatement.mo50bindLong(17, mcnVar.q);
            sQLiteStatement.mo50bindLong(18, mcnVar.f26021r);
            sQLiteStatement.mo50bindLong(19, mcnVar.f26018a);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `eco_scm_table` SET `sportType` = ?,`isLight` = ?,`isRemindHr` = ?,`heartRate` = ?,`isRemindSpeed` = ?,`speed` = ?,`riding` = ?,`isNotifyKm` = ?,`isMetronome` = ?,`metronomeRate` = ?,`isLockScreen` = ?,`remindHertRateRange` = ?,`basicVoiceRemind` = ?,`isNotifyHrIntervalChange` = ?,`isAutoPause` = ?,`countdown` = ?,`countingInterval` = ?,`reportingInterval` = ? WHERE `sportType` = ?";
        }
    }

    public w6l(RoomDatabase roomDatabase) {
        this.f37662a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List n(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from eco_scm_table");
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
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DialWidgetType.COUNT_DOWN);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countingInterval");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reportingInterval");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                mcn mcnVar = new mcn();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                mcnVar.f26018a = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                mcnVar.f26019b = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                mcnVar.c = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                mcnVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                mcnVar.e = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                mcnVar.f = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                mcnVar.g = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                mcnVar.h = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                mcnVar.i = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                mcnVar.j = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                mcnVar.f26020k = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    mcnVar.l = null;
                } else {
                    mcnVar.l = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                mcnVar.m = ((int) sQLiteStatementPrepare.getLong(i)) != 0;
                int i5 = columnIndexOrThrow4;
                mcnVar.n = ((int) sQLiteStatementPrepare.getLong(i2)) != 0;
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow5;
                mcnVar.o = ((int) sQLiteStatementPrepare.getLong(i6)) != 0;
                int i8 = columnIndexOrThrow16;
                mcnVar.p = (int) sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow17;
                mcnVar.q = (int) sQLiteStatementPrepare.getLong(i9);
                int i10 = columnIndexOrThrow18;
                mcnVar.f26021r = (int) sQLiteStatementPrepare.getLong(i10);
                arrayList2.add(mcnVar);
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow16 = i8;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i4;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ mcn p(int i, SQLiteConnection sQLiteConnection) {
        mcn mcnVar;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * from eco_scm_table WHERE sportType = ?");
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
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DialWidgetType.COUNT_DOWN);
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countingInterval");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reportingInterval");
            if (sQLiteStatementPrepare.step()) {
                mcnVar = new mcn();
                mcnVar.f26018a = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                mcnVar.f26019b = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                mcnVar.c = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0;
                mcnVar.d = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                mcnVar.e = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0;
                mcnVar.f = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                mcnVar.g = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                mcnVar.h = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0;
                mcnVar.i = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                mcnVar.j = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                mcnVar.f26020k = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    mcnVar.l = null;
                } else {
                    mcnVar.l = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                mcnVar.m = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13)) != 0;
                mcnVar.n = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14)) != 0;
                mcnVar.o = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0;
                mcnVar.p = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16);
                mcnVar.q = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17);
                mcnVar.f26021r = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow18);
            } else {
                mcnVar = null;
            }
            return mcnVar;
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

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao
    public void addOrUpdateSportConfigModel(final mcn mcnVar) {
        mcnVar.getClass();
        DBUtil.performBlocking(this.f37662a, false, true, new Function1() { // from class: i6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20835a.l(mcnVar, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao
    public void deleteSportConfigModel(final mcn mcnVar) {
        mcnVar.getClass();
        DBUtil.performBlocking(this.f37662a, false, true, new Function1() { // from class: s6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33350a.m(mcnVar, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao
    public List<mcn> getAllSportConfigModel() {
        return (List) DBUtil.performBlocking(this.f37662a, true, false, new Function1() { // from class: m6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w6l.n((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super mcn> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37662a, true, false, new Function1() { // from class: q6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31176a.o(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao
    public mcn getSportConfigModel(final int i) {
        return (mcn) DBUtil.performBlocking(this.f37662a, true, false, new Function1() { // from class: g6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return w6l.p(i, (SQLiteConnection) obj);
            }
        });
    }

    public final mcn i(SQLiteStatement sQLiteStatement) {
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
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, DialWidgetType.COUNT_DOWN);
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "countingInterval");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "reportingInterval");
        mcn mcnVar = new mcn();
        if (columnIndex != -1) {
            mcnVar.f26018a = (int) sQLiteStatement.getLong(columnIndex);
        }
        if (columnIndex2 != -1) {
            mcnVar.f26019b = ((int) sQLiteStatement.getLong(columnIndex2)) != 0;
        }
        if (columnIndex3 != -1) {
            mcnVar.c = ((int) sQLiteStatement.getLong(columnIndex3)) != 0;
        }
        if (columnIndex4 != -1) {
            mcnVar.d = (int) sQLiteStatement.getLong(columnIndex4);
        }
        if (columnIndex5 != -1) {
            mcnVar.e = ((int) sQLiteStatement.getLong(columnIndex5)) != 0;
        }
        if (columnIndex6 != -1) {
            mcnVar.f = (int) sQLiteStatement.getLong(columnIndex6);
        }
        if (columnIndex7 != -1) {
            mcnVar.g = (float) sQLiteStatement.getDouble(columnIndex7);
        }
        if (columnIndex8 != -1) {
            mcnVar.h = ((int) sQLiteStatement.getLong(columnIndex8)) != 0;
        }
        if (columnIndex9 != -1) {
            mcnVar.i = ((int) sQLiteStatement.getLong(columnIndex9)) != 0;
        }
        if (columnIndex10 != -1) {
            mcnVar.j = (int) sQLiteStatement.getLong(columnIndex10);
        }
        if (columnIndex11 != -1) {
            mcnVar.f26020k = ((int) sQLiteStatement.getLong(columnIndex11)) != 0;
        }
        if (columnIndex12 != -1) {
            if (sQLiteStatement.isNull(columnIndex12)) {
                mcnVar.l = null;
            } else {
                mcnVar.l = sQLiteStatement.getText(columnIndex12);
            }
        }
        if (columnIndex13 != -1) {
            mcnVar.m = ((int) sQLiteStatement.getLong(columnIndex13)) != 0;
        }
        if (columnIndex14 != -1) {
            mcnVar.n = ((int) sQLiteStatement.getLong(columnIndex14)) != 0;
        }
        if (columnIndex15 != -1) {
            mcnVar.o = ((int) sQLiteStatement.getLong(columnIndex15)) != 0;
        }
        if (columnIndex16 != -1) {
            mcnVar.p = (int) sQLiteStatement.getLong(columnIndex16);
        }
        if (columnIndex17 != -1) {
            mcnVar.q = (int) sQLiteStatement.getLong(columnIndex17);
        }
        if (columnIndex18 != -1) {
            mcnVar.f26021r = (int) sQLiteStatement.getLong(columnIndex18);
        }
        return mcnVar;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object insert(final mcn[] mcnVarArr, Continuation<? super Unit> continuation) {
        mcnVarArr.getClass();
        return DBUtil.performSuspending(this.f37662a, false, true, new Function1() { // from class: o6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28796a.q(mcnVarArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Object l(mcn mcnVar, SQLiteConnection sQLiteConnection) {
        this.f37663b.insert(sQLiteConnection, mcnVar);
        return null;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<mcn>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37662a, true, false, new Function1() { // from class: k6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23526a.r(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Object m(mcn mcnVar, SQLiteConnection sQLiteConnection) {
        this.c.handle(sQLiteConnection, mcnVar);
        return null;
    }

    public final /* synthetic */ mcn o(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? i(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit q(mcn[] mcnVarArr, SQLiteConnection sQLiteConnection) {
        this.f37663b.insert(sQLiteConnection, mcnVarArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Integer s(mcn mcnVar, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.d.handle(sQLiteConnection, mcnVar));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object update(final mcn mcnVar, Continuation<? super Integer> continuation) {
        mcnVar.getClass();
        return DBUtil.performSuspending(this.f37662a, false, true, new Function1() { // from class: u6l
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35472a.s(mcnVar, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
