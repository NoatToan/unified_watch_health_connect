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
import com.example.habit.export.Habit;
import com.xiaomi.fitness.habit.persist.dao.HabitDao;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class web implements HabitDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f37893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<Habit> f37894b = new a();
    public final EntityDeleteOrUpdateAdapter<Habit> c = new b();

    public class a extends EntityInsertAdapter<Habit> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, Habit habit) {
            sQLiteStatement.mo50bindLong(1, habit.type);
            sQLiteStatement.mo50bindLong(2, habit.clockMode);
            sQLiteStatement.mo50bindLong(3, habit.weekDays);
            sQLiteStatement.mo50bindLong(4, habit.isSyncWatch ? 1L : 0L);
            String str = habit.times;
            if (str == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, str);
            }
            sQLiteStatement.mo50bindLong(6, habit.updateTime);
            sQLiteStatement.mo50bindLong(7, habit.isEnable ? 1L : 0L);
            String str2 = habit.name;
            if (str2 == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, str2);
            }
            String str3 = habit.smallIcon;
            if (str3 == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, str3);
            }
            String str4 = habit.middleIcon;
            if (str4 == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, str4);
            }
            String str5 = habit.bigIcon;
            if (str5 == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, str5);
            }
            String str6 = habit.deviceBref;
            if (str6 == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str6);
            }
            String str7 = habit.appBref;
            if (str7 == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, str7);
            }
            sQLiteStatement.mo50bindLong(14, habit.syncCalendar ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, habit.typeId);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `habit` (`type`,`clockMode`,`weekDays`,`isSyncWatch`,`times`,`updateTime`,`isEnable`,`name`,`smallIcon`,`middleIcon`,`bigIcon`,`deviceBref`,`appBref`,`syncCalendar`,`typeId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<Habit> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, Habit habit) {
            sQLiteStatement.mo50bindLong(1, habit.type);
            sQLiteStatement.mo50bindLong(2, habit.clockMode);
            sQLiteStatement.mo50bindLong(3, habit.weekDays);
            sQLiteStatement.mo50bindLong(4, habit.isSyncWatch ? 1L : 0L);
            String str = habit.times;
            if (str == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, str);
            }
            sQLiteStatement.mo50bindLong(6, habit.updateTime);
            sQLiteStatement.mo50bindLong(7, habit.isEnable ? 1L : 0L);
            String str2 = habit.name;
            if (str2 == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, str2);
            }
            String str3 = habit.smallIcon;
            if (str3 == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, str3);
            }
            String str4 = habit.middleIcon;
            if (str4 == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo52bindText(10, str4);
            }
            String str5 = habit.bigIcon;
            if (str5 == null) {
                sQLiteStatement.mo51bindNull(11);
            } else {
                sQLiteStatement.mo52bindText(11, str5);
            }
            String str6 = habit.deviceBref;
            if (str6 == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, str6);
            }
            String str7 = habit.appBref;
            if (str7 == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, str7);
            }
            sQLiteStatement.mo50bindLong(14, habit.syncCalendar ? 1L : 0L);
            sQLiteStatement.mo50bindLong(15, habit.typeId);
            sQLiteStatement.mo50bindLong(16, habit.type);
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `habit` SET `type` = ?,`clockMode` = ?,`weekDays` = ?,`isSyncWatch` = ?,`times` = ?,`updateTime` = ?,`isEnable` = ?,`name` = ?,`smallIcon` = ?,`middleIcon` = ?,`bigIcon` = ?,`deviceBref` = ?,`appBref` = ?,`syncCalendar` = ?,`typeId` = ? WHERE `type` = ?";
        }
    }

    public web(RoomDatabase roomDatabase) {
        this.f37893a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object k(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM habit");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object l(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM habit WHERE typeId=?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List o(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM habit ORDER BY type DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clockMode");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weekDays");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSyncWatch");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "times");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEnable");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "smallIcon");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "middleIcon");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, HabitShareActivity.KEY_BIG_ICON);
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deviceBref");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appBref");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncCalendar");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "typeId");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                Habit habit = new Habit();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                habit.type = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                habit.clockMode = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                habit.weekDays = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                habit.isSyncWatch = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    habit.times = null;
                } else {
                    habit.times = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                }
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                habit.updateTime = sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                habit.isEnable = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    habit.name = null;
                } else {
                    habit.name = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    habit.smallIcon = null;
                } else {
                    habit.smallIcon = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    habit.middleIcon = null;
                } else {
                    habit.middleIcon = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    habit.bigIcon = null;
                } else {
                    habit.bigIcon = sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    habit.deviceBref = null;
                } else {
                    habit.deviceBref = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    habit.appBref = null;
                } else {
                    habit.appBref = sQLiteStatementPrepare.getText(i);
                }
                int i5 = columnIndexOrThrow4;
                int i6 = columnIndexOrThrow5;
                habit.syncCalendar = ((int) sQLiteStatementPrepare.getLong(i2)) != 0;
                int i7 = columnIndexOrThrow15;
                habit.typeId = sQLiteStatementPrepare.getLong(i7);
                arrayList2.add(habit);
                arrayList = arrayList2;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow4 = i5;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow5 = i6;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.habit.persist.dao.HabitDao
    public void clear() {
        DBUtil.performBlocking(this.f37893a, false, true, new Function1() { // from class: seb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return web.k((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.habit.persist.dao.HabitDao
    public void deleteById(final long j) {
        DBUtil.performBlocking(this.f37893a, false, true, new Function1() { // from class: reb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return web.l(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super Habit> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37893a, true, false, new Function1() { // from class: peb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30315a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final Habit h(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "type");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "clockMode");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "weekDays");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isSyncWatch");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "times");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updateTime");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isEnable");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "name");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "smallIcon");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "middleIcon");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, HabitShareActivity.KEY_BIG_ICON);
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "deviceBref");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "appBref");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "syncCalendar");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "typeId");
        Habit habit = new Habit();
        if (columnIndex != -1) {
            habit.type = (int) sQLiteStatement.getLong(columnIndex);
        }
        if (columnIndex2 != -1) {
            habit.clockMode = (int) sQLiteStatement.getLong(columnIndex2);
        }
        if (columnIndex3 != -1) {
            habit.weekDays = (int) sQLiteStatement.getLong(columnIndex3);
        }
        if (columnIndex4 != -1) {
            habit.isSyncWatch = ((int) sQLiteStatement.getLong(columnIndex4)) != 0;
        }
        if (columnIndex5 != -1) {
            if (sQLiteStatement.isNull(columnIndex5)) {
                habit.times = null;
            } else {
                habit.times = sQLiteStatement.getText(columnIndex5);
            }
        }
        if (columnIndex6 != -1) {
            habit.updateTime = sQLiteStatement.getLong(columnIndex6);
        }
        if (columnIndex7 != -1) {
            habit.isEnable = ((int) sQLiteStatement.getLong(columnIndex7)) != 0;
        }
        if (columnIndex8 != -1) {
            if (sQLiteStatement.isNull(columnIndex8)) {
                habit.name = null;
            } else {
                habit.name = sQLiteStatement.getText(columnIndex8);
            }
        }
        if (columnIndex9 != -1) {
            if (sQLiteStatement.isNull(columnIndex9)) {
                habit.smallIcon = null;
            } else {
                habit.smallIcon = sQLiteStatement.getText(columnIndex9);
            }
        }
        if (columnIndex10 != -1) {
            if (sQLiteStatement.isNull(columnIndex10)) {
                habit.middleIcon = null;
            } else {
                habit.middleIcon = sQLiteStatement.getText(columnIndex10);
            }
        }
        if (columnIndex11 != -1) {
            if (sQLiteStatement.isNull(columnIndex11)) {
                habit.bigIcon = null;
            } else {
                habit.bigIcon = sQLiteStatement.getText(columnIndex11);
            }
        }
        if (columnIndex12 != -1) {
            if (sQLiteStatement.isNull(columnIndex12)) {
                habit.deviceBref = null;
            } else {
                habit.deviceBref = sQLiteStatement.getText(columnIndex12);
            }
        }
        if (columnIndex13 != -1) {
            if (sQLiteStatement.isNull(columnIndex13)) {
                habit.appBref = null;
            } else {
                habit.appBref = sQLiteStatement.getText(columnIndex13);
            }
        }
        if (columnIndex14 != -1) {
            habit.syncCalendar = ((int) sQLiteStatement.getLong(columnIndex14)) != 0;
        }
        if (columnIndex15 != -1) {
            habit.typeId = sQLiteStatement.getLong(columnIndex15);
        }
        return habit;
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object insert(final Habit[] habitArr, Continuation<? super Unit> continuation) {
        habitArr.getClass();
        return DBUtil.performSuspending(this.f37893a, false, true, new Function1() { // from class: ueb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35683a.n(habitArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.habit.persist.dao.HabitDao
    public List<Habit> list() {
        return (List) DBUtil.performBlocking(this.f37893a, true, false, new Function1() { // from class: teb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return web.o((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Habit m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? h(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit n(Habit[] habitArr, SQLiteConnection sQLiteConnection) {
        this.f37894b.insert(sQLiteConnection, habitArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ List p(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public final /* synthetic */ Integer q(Habit habit, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, habit));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Object update(final Habit habit, Continuation<? super Integer> continuation) {
        habit.getClass();
        return DBUtil.performSuspending(this.f37893a, false, true, new Function1() { // from class: veb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36798a.q(habit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<Habit>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f37893a, true, false, new Function1() { // from class: qeb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31434a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
