package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.xiaomi.fitness.aggregation.health.dao.StatEntityDao;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.StatDataEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class cco implements StatEntityDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f5191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<StatDataEntity> f5192b = new a();
    public final EntityDeleteOrUpdateAdapter<StatDataEntity> c = new b();

    public class a extends EntityInsertAdapter<StatDataEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StatDataEntity statDataEntity) {
            if (statDataEntity.getTag() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, statDataEntity.getTag());
            }
            if (statDataEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, statDataEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, statDataEntity.getTime());
            sQLiteStatement.mo50bindLong(4, statDataEntity.getZoneOffset());
            sQLiteStatement.mo50bindLong(5, statDataEntity.getTimeInZero());
            if (statDataEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, statDataEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(7, statDataEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(8, statDataEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, statDataEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `stat_data` (`tag`,`key`,`time`,`zoneOffset`,`timeInZero`,`value`,`updateTime`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<StatDataEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, StatDataEntity statDataEntity) {
            if (statDataEntity.getTag() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, statDataEntity.getTag());
            }
            if (statDataEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, statDataEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, statDataEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `stat_data` WHERE `tag` = ? AND `key` = ? AND `time` = ?";
        }
    }

    public cco(RoomDatabase roomDatabase) {
        this.f5191a = roomDatabase;
    }

    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit l(String str, String str2, String str3, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str2);
            }
            if (str3 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str3);
            }
            Iterator it = list.iterator();
            int i = 3;
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo51bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo50bindLong(i, l.longValue());
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List m(String str, String str2, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from stat_data where tag = ? and key = ? and isDeleted = 1 limit ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            sQLiteStatementPrepare.mo50bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tag");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow3;
                StatDataEntity statDataEntity = new StatDataEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                statDataEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                statDataEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                arrayList.add(statDataEntity);
                columnIndexOrThrow3 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ StatDataEntity n(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from stat_data where tag = ? and key = ? and isDeleted = 0 ORDER BY timeInZero desc limit 1");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tag");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            StatDataEntity statDataEntity = null;
            if (sQLiteStatementPrepare.step()) {
                statDataEntity = new StatDataEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                statDataEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                    z = false;
                }
                statDataEntity.setDeleted(z);
            }
            sQLiteStatementPrepare.close();
            return statDataEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ StatDataEntity o(String str, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from stat_data where tag = ? and key = ? and isDeleted = 0 ORDER BY timeInZero desc limit 1");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tag");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            StatDataEntity statDataEntity = null;
            if (sQLiteStatementPrepare.step()) {
                statDataEntity = new StatDataEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                statDataEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                    z = false;
                }
                statDataEntity.setDeleted(z);
            }
            sQLiteStatementPrepare.close();
            return statDataEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Object delete(final StatDataEntity[] statDataEntityArr, Continuation<? super Unit> continuation) {
        statDataEntityArr.getClass();
        return DBUtil.performSuspending(this.f5191a, false, true, new Function1() { // from class: bco
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4065a.j(statDataEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final StatDataEntity h(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "tag");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, CloudContract.COL_ZONE_OFFSET);
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "timeInZero");
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "updateTime");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        long j = columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3);
        int i = columnIndex4 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex4);
        long j2 = columnIndex5 == -1 ? 0L : sQLiteStatement.getLong(columnIndex5);
        if (columnIndex6 != -1 && !sQLiteStatement.isNull(columnIndex6)) {
            text = sQLiteStatement.getText(columnIndex6);
        }
        StatDataEntity statDataEntity = new StatDataEntity(text2, text3, j, i, j2, text, columnIndex7 == -1 ? 0L : sQLiteStatement.getLong(columnIndex7));
        if (columnIndex8 != -1) {
            statDataEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            statDataEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return statDataEntity;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Object insert(final StatDataEntity[] statDataEntityArr, Continuation<? super Unit> continuation) {
        statDataEntityArr.getClass();
        return DBUtil.performSuspending(this.f5191a, false, true, new Function1() { // from class: zbo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f41103a.k(statDataEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit j(StatDataEntity[] statDataEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, statDataEntityArr);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Unit k(StatDataEntity[] statDataEntityArr, SQLiteConnection sQLiteConnection) {
        this.f5192b.insert(sQLiteConnection, statDataEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Object markDelete(final String str, final String str2, final List<Long> list, Continuation<? super Unit> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("update stat_data set isDeleted = 1, isUpload = 0 where tag = ");
        sb.append("?");
        sb.append(" and key = ");
        sb.append("?");
        sb.append(" and time in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        return DBUtil.performSuspending(this.f5191a, false, true, new Function1() { // from class: vbo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return cco.l(string, str, str2, list, (SQLiteConnection) obj);
            }
        }, continuation);
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

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Object queryDeletedDataList(final String str, final String str2, final int i, Continuation<? super List<StatDataEntity>> continuation) {
        return DBUtil.performSuspending(this.f5191a, true, false, new Function1() { // from class: xbo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return cco.m(str, str2, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Flow<StatDataEntity> queryLatestData(final String str, final String str2) {
        return FlowUtil.createFlow(this.f5191a, false, new String[]{CloudContract.TABLE_STAT}, new Function1() { // from class: ybo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return cco.n(str, str2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public StatDataEntity queryLatestDataSync(final String str, final String str2) {
        return (StatDataEntity) DBUtil.performBlocking(this.f5191a, true, false, new Function1() { // from class: aco
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return cco.o(str, str2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.StatEntityDao
    public Object rawQueryStatList(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<StatDataEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f5191a, true, false, new Function1() { // from class: wbo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37816a.p(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }
}
