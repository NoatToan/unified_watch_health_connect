package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class fy3 implements ClaimRecordDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f18361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<ClaimRecord> f18362b = new a();
    public final EntityDeleteOrUpdateAdapter<ClaimRecord> c = new b();

    public class a extends EntityInsertAdapter<ClaimRecord> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ClaimRecord claimRecord) {
            if (claimRecord.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, claimRecord.getDid());
            }
            if (claimRecord.getType() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, claimRecord.getType());
            }
            sQLiteStatement.mo49bindDouble(3, claimRecord.getWeight());
            if (claimRecord.getUnit() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, claimRecord.getUnit());
            }
            sQLiteStatement.mo50bindLong(5, claimRecord.getCreateTime());
            sQLiteStatement.mo50bindLong(6, claimRecord.getHeartRate());
            sQLiteStatement.mo50bindLong(7, claimRecord.getLfz12());
            sQLiteStatement.mo50bindLong(8, claimRecord.getLfz13());
            sQLiteStatement.mo50bindLong(9, claimRecord.getLfz14());
            sQLiteStatement.mo50bindLong(10, claimRecord.getLfz23());
            sQLiteStatement.mo50bindLong(11, claimRecord.getLfz24());
            sQLiteStatement.mo50bindLong(12, claimRecord.getLfz34());
            sQLiteStatement.mo50bindLong(13, claimRecord.getHfz12());
            sQLiteStatement.mo50bindLong(14, claimRecord.getHfz13());
            sQLiteStatement.mo50bindLong(15, claimRecord.getHfz14());
            sQLiteStatement.mo50bindLong(16, claimRecord.getHfz23());
            sQLiteStatement.mo50bindLong(17, claimRecord.getHfz24());
            sQLiteStatement.mo50bindLong(18, claimRecord.getHfz34());
            sQLiteStatement.mo50bindLong(19, claimRecord.getId());
            sQLiteStatement.mo50bindLong(20, claimRecord.getIsCloud() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `claim_record` (`did`,`type`,`weight`,`unit`,`createTime`,`heartRate`,`lfz12`,`lfz13`,`lfz14`,`lfz23`,`lfz24`,`lfz34`,`hfz12`,`hfz13`,`hfz14`,`hfz23`,`hfz24`,`hfz34`,`id`,`isCloud`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<ClaimRecord> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ClaimRecord claimRecord) {
            if (claimRecord.getDid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, claimRecord.getDid());
            }
            if (claimRecord.getType() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, claimRecord.getType());
            }
            sQLiteStatement.mo49bindDouble(3, claimRecord.getWeight());
            if (claimRecord.getUnit() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, claimRecord.getUnit());
            }
            sQLiteStatement.mo50bindLong(5, claimRecord.getCreateTime());
            sQLiteStatement.mo50bindLong(6, claimRecord.getHeartRate());
            sQLiteStatement.mo50bindLong(7, claimRecord.getLfz12());
            sQLiteStatement.mo50bindLong(8, claimRecord.getLfz13());
            sQLiteStatement.mo50bindLong(9, claimRecord.getLfz14());
            sQLiteStatement.mo50bindLong(10, claimRecord.getLfz23());
            sQLiteStatement.mo50bindLong(11, claimRecord.getLfz24());
            sQLiteStatement.mo50bindLong(12, claimRecord.getLfz34());
            sQLiteStatement.mo50bindLong(13, claimRecord.getHfz12());
            sQLiteStatement.mo50bindLong(14, claimRecord.getHfz13());
            sQLiteStatement.mo50bindLong(15, claimRecord.getHfz14());
            sQLiteStatement.mo50bindLong(16, claimRecord.getHfz23());
            sQLiteStatement.mo50bindLong(17, claimRecord.getHfz24());
            sQLiteStatement.mo50bindLong(18, claimRecord.getHfz34());
            sQLiteStatement.mo50bindLong(19, claimRecord.getId());
            sQLiteStatement.mo50bindLong(20, claimRecord.getIsCloud() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(21, claimRecord.getCreateTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `claim_record` SET `did` = ?,`type` = ?,`weight` = ?,`unit` = ?,`createTime` = ?,`heartRate` = ?,`lfz12` = ?,`lfz13` = ?,`lfz14` = ?,`lfz23` = ?,`lfz24` = ?,`lfz34` = ?,`hfz12` = ?,`hfz13` = ?,`hfz14` = ?,`hfz23` = ?,`hfz24` = ?,`hfz34` = ?,`id` = ?,`isCloud` = ? WHERE `createTime` = ?";
        }
    }

    public fy3(RoomDatabase roomDatabase) {
        this.f18361a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Integer l(long j, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM claim_record WHERE createTime =? AND did =?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            sQLiteStatementPrepare.step();
            return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List q(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
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

    public static /* synthetic */ List r(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM claim_record WHERE did =? order by createTime desc");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "did");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unit");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "heartRate");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz12");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz13");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz14");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz23");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz24");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lfz34");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz12");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz13");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz14");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz23");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz24");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hfz34");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCloud");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                ClaimRecord claimRecord = new ClaimRecord();
                claimRecord.setDid(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                claimRecord.setType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                claimRecord.setWeight((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3));
                claimRecord.setUnit(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                claimRecord.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                claimRecord.setHeartRate((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                claimRecord.setLfz12((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                claimRecord.setLfz13((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                claimRecord.setLfz14((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                claimRecord.setLfz23((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                claimRecord.setLfz24((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                claimRecord.setLfz34((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                claimRecord.setHfz12((int) sQLiteStatementPrepare.getLong(i));
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                claimRecord.setHfz13((int) sQLiteStatementPrepare.getLong(i2));
                int i5 = columnIndexOrThrow15;
                int i6 = columnIndexOrThrow4;
                claimRecord.setHfz14((int) sQLiteStatementPrepare.getLong(i5));
                int i7 = columnIndexOrThrow16;
                int i8 = columnIndexOrThrow5;
                claimRecord.setHfz23((int) sQLiteStatementPrepare.getLong(i7));
                int i9 = columnIndexOrThrow17;
                claimRecord.setHfz24((int) sQLiteStatementPrepare.getLong(i9));
                int i10 = columnIndexOrThrow18;
                claimRecord.setHfz34((int) sQLiteStatementPrepare.getLong(i10));
                int i11 = columnIndexOrThrow19;
                claimRecord.setId((int) sQLiteStatementPrepare.getLong(i11));
                int i12 = columnIndexOrThrow20;
                claimRecord.setCloud(((int) sQLiteStatementPrepare.getLong(i12)) != 0);
                arrayList2.add(claimRecord);
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow4 = i6;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow5 = i8;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow17 = i9;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao
    public Object deleteClaimRecord(final String str, final long j, Continuation<? super Integer> continuation) {
        return DBUtil.performSuspending(this.f18361a, false, true, new Function1() { // from class: ey3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return fy3.l(j, str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object getOne(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super ClaimRecord> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18361a, true, false, new Function1() { // from class: yx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f40655a.m(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final ClaimRecord i(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "did");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "type");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "weight");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "unit");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "createTime");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "heartRate");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz12");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz13");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz14");
        int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz23");
        int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz24");
        int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "lfz34");
        int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz12");
        int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz13");
        int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz14");
        int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz23");
        int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz24");
        int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "hfz34");
        int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "id");
        int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isCloud");
        ClaimRecord claimRecord = new ClaimRecord();
        if (columnIndex != -1) {
            claimRecord.setDid(sQLiteStatement.isNull(columnIndex) ? null : sQLiteStatement.getText(columnIndex));
        }
        if (columnIndex2 != -1) {
            claimRecord.setType(sQLiteStatement.isNull(columnIndex2) ? null : sQLiteStatement.getText(columnIndex2));
        }
        if (columnIndex3 != -1) {
            claimRecord.setWeight((float) sQLiteStatement.getDouble(columnIndex3));
        }
        if (columnIndex4 != -1) {
            claimRecord.setUnit(sQLiteStatement.isNull(columnIndex4) ? null : sQLiteStatement.getText(columnIndex4));
        }
        if (columnIndex5 != -1) {
            claimRecord.setCreateTime(sQLiteStatement.getLong(columnIndex5));
        }
        if (columnIndex6 != -1) {
            claimRecord.setHeartRate((int) sQLiteStatement.getLong(columnIndex6));
        }
        if (columnIndex7 != -1) {
            claimRecord.setLfz12((int) sQLiteStatement.getLong(columnIndex7));
        }
        if (columnIndex8 != -1) {
            claimRecord.setLfz13((int) sQLiteStatement.getLong(columnIndex8));
        }
        if (columnIndex9 != -1) {
            claimRecord.setLfz14((int) sQLiteStatement.getLong(columnIndex9));
        }
        if (columnIndex10 != -1) {
            claimRecord.setLfz23((int) sQLiteStatement.getLong(columnIndex10));
        }
        if (columnIndex11 != -1) {
            claimRecord.setLfz24((int) sQLiteStatement.getLong(columnIndex11));
        }
        if (columnIndex12 != -1) {
            claimRecord.setLfz34((int) sQLiteStatement.getLong(columnIndex12));
        }
        if (columnIndex13 != -1) {
            claimRecord.setHfz12((int) sQLiteStatement.getLong(columnIndex13));
        }
        if (columnIndex14 != -1) {
            claimRecord.setHfz13((int) sQLiteStatement.getLong(columnIndex14));
        }
        if (columnIndex15 != -1) {
            claimRecord.setHfz14((int) sQLiteStatement.getLong(columnIndex15));
        }
        if (columnIndex16 != -1) {
            claimRecord.setHfz23((int) sQLiteStatement.getLong(columnIndex16));
        }
        if (columnIndex17 != -1) {
            claimRecord.setHfz24((int) sQLiteStatement.getLong(columnIndex17));
        }
        if (columnIndex18 != -1) {
            claimRecord.setHfz34((int) sQLiteStatement.getLong(columnIndex18));
        }
        if (columnIndex19 != -1) {
            claimRecord.setId((int) sQLiteStatement.getLong(columnIndex19));
        }
        if (columnIndex20 != -1) {
            claimRecord.setCloud(((int) sQLiteStatement.getLong(columnIndex20)) != 0);
        }
        return claimRecord;
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao
    public Object insertClaimRecord(final ClaimRecord claimRecord, Continuation<? super Long> continuation) {
        claimRecord.getClass();
        return DBUtil.performSuspending(this.f18361a, false, true, new Function1() { // from class: cy3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14852a.o(claimRecord, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao
    public Object insertClaimRecords(final List<ClaimRecord> list, Continuation<? super Long[]> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.f18361a, false, true, new Function1() { // from class: by3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4717a.p(list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object insert(final ClaimRecord[] claimRecordArr, Continuation<? super Unit> continuation) {
        claimRecordArr.getClass();
        return DBUtil.performSuspending(this.f18361a, false, true, new Function1() { // from class: xx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f39543a.n(claimRecordArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    public Object list(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<ClaimRecord>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f18361a, true, false, new Function1() { // from class: ay3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f3557a.q(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ ClaimRecord m(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            return sQLiteStatementPrepare.step() ? i(sQLiteStatementPrepare) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Unit n(ClaimRecord[] claimRecordArr, SQLiteConnection sQLiteConnection) {
        this.f18362b.insert(sQLiteConnection, claimRecordArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Long o(ClaimRecord claimRecord, SQLiteConnection sQLiteConnection) {
        return Long.valueOf(this.f18362b.insertAndReturnId(sQLiteConnection, claimRecord));
    }

    public final /* synthetic */ Long[] p(List list, SQLiteConnection sQLiteConnection) {
        return this.f18362b.insertAndReturnIdsArrayBox(sQLiteConnection, list);
    }

    @Override // com.xiaomi.fitness.electronic.scale.dao.dao.ClaimRecordDao
    public Object queryByDid(final String str, Continuation<? super List<ClaimRecord>> continuation) {
        return DBUtil.performSuspending(this.f18361a, true, false, new Function1() { // from class: dy3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return fy3.r(str, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Integer s(ClaimRecord claimRecord, SQLiteConnection sQLiteConnection) {
        return Integer.valueOf(this.c.handle(sQLiteConnection, claimRecord));
    }

    @Override // com.xiaomi.fitness.database.BaseDao
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Object update(final ClaimRecord claimRecord, Continuation<? super Integer> continuation) {
        claimRecord.getClass();
        return DBUtil.performSuspending(this.f18361a, false, true, new Function1() { // from class: zx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f41764a.s(claimRecord, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
