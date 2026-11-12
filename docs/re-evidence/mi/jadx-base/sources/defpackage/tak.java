package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.aggregation.db.HomeDataTypeConvert;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDao;
import com.xiaomi.fitness.aggregation.health.entity.RedDotEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class tak implements RedDotDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f34515a;
    public final HomeDataTypeConvert c = new HomeDataTypeConvert();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<RedDotEntity> f34516b = new a();
    public final EntityDeleteOrUpdateAdapter<RedDotEntity> d = new b();

    public class a extends EntityInsertAdapter<RedDotEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, RedDotEntity redDotEntity) {
            if (redDotEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, redDotEntity.getSid());
            }
            String strHomeDataToString = tak.this.c.homeDataToString(redDotEntity.getDataType());
            if (strHomeDataToString == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, strHomeDataToString);
            }
            sQLiteStatement.mo50bindLong(3, redDotEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, redDotEntity.getTimeInZero());
            sQLiteStatement.mo50bindLong(5, redDotEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, redDotEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `red_dot` (`sid`,`dataType`,`updateTime`,`timeInZero`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<RedDotEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, RedDotEntity redDotEntity) {
            String strHomeDataToString = tak.this.c.homeDataToString(redDotEntity.getDataType());
            if (strHomeDataToString == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatement.mo50bindLong(2, redDotEntity.getTimeInZero());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `red_dot` WHERE `dataType` = ? AND `timeInZero` = ?";
        }
    }

    public tak(RoomDatabase roomDatabase) {
        this.f34515a = roomDatabase;
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public void delete(final RedDotEntity... redDotEntityArr) {
        redDotEntityArr.getClass();
        DBUtil.performBlocking(this.f34515a, false, true, new Function1() { // from class: kak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23661a.l(redDotEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public void deleteEntity(final HomeDataType homeDataType, final long j) {
        DBUtil.performBlocking(this.f34515a, false, true, new Function1() { // from class: oak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f28933a.n(homeDataType, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public void insert(final RedDotEntity... redDotEntityArr) {
        redDotEntityArr.getClass();
        DBUtil.performBlocking(this.f34515a, false, true, new Function1() { // from class: mak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25949a.o(redDotEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object l(RedDotEntity[] redDotEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, redDotEntityArr);
        return null;
    }

    public final /* synthetic */ Object m(String str, HomeDataType homeDataType, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            Iterator it = list.iterator();
            int i = 2;
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
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object n(HomeDataType homeDataType, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("update red_dot set isDeleted = 1 where dataType = ? and timeInZero = ?");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object o(RedDotEntity[] redDotEntityArr, SQLiteConnection sQLiteConnection) {
        this.f34516b.insert(sQLiteConnection, redDotEntityArr);
        return null;
    }

    public final /* synthetic */ Integer p(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select count(*) from red_dot where dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List q(String str, List list, int i, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                String strHomeDataToString = this.c.homeDataToString((HomeDataType) it.next());
                if (strHomeDataToString == null) {
                    sQLiteStatementPrepare.mo51bindNull(i2);
                } else {
                    sQLiteStatementPrepare.mo52bindText(i2, strHomeDataToString);
                }
                i2++;
            }
            sQLiteStatementPrepare.mo50bindLong(i + 1, j);
            sQLiteStatementPrepare.mo50bindLong(i + 2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                RedDotEntity redDotEntity = new RedDotEntity(text2, this.c.typeStringToHomeDataType(text), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                boolean z = false;
                redDotEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0) {
                    z = true;
                }
                redDotEntity.setDeleted(z);
                arrayList.add(redDotEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public int queryRedDotCount(final HomeDataType homeDataType, final long j, final long j2) {
        return ((Integer) DBUtil.performBlocking(this.f34515a, true, false, new Function1() { // from class: sak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33461a.p(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        })).intValue();
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public Flow<List<RedDotEntity>> queryRedDotDataTypeList(final List<? extends HomeDataType> list, final long j, final long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from red_dot where dataType IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") and timeInZero >= ");
        sb.append("?");
        sb.append(" and timeInZero < ");
        sb.append("?");
        sb.append(" and isDeleted = 0");
        final String string = sb.toString();
        return FlowUtil.createFlow(this.f34515a, false, new String[]{"red_dot"}, new Function1() { // from class: lak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f24833a.q(string, list, size, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public Flow<List<RedDotEntity>> queryRedDotList(final HomeDataType homeDataType, final long j, final long j2) {
        return FlowUtil.createFlow(this.f34515a, false, new String[]{"red_dot"}, new Function1() { // from class: nak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27712a.r(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public List<RedDotEntity> queryRedDotListSync(final HomeDataType homeDataType, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f34515a, true, false, new Function1() { // from class: pak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f30172a.s(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public List<RedDotEntity> queryRedDotNotUpcloudList(final int i) {
        return (List) DBUtil.performBlocking(this.f34515a, true, false, new Function1() { // from class: rak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32356a.t(i, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ List r(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from red_dot where dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                RedDotEntity redDotEntity = new RedDotEntity(text2, this.c.typeStringToHomeDataType(text), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                boolean z = false;
                redDotEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0) {
                    z = true;
                }
                redDotEntity.setDeleted(z);
                arrayList.add(redDotEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List s(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from red_dot where dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                RedDotEntity redDotEntity = new RedDotEntity(text2, this.c.typeStringToHomeDataType(text), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                boolean z = false;
                redDotEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0) {
                    z = true;
                }
                redDotEntity.setDeleted(z);
                arrayList.add(redDotEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List t(int i, SQLiteConnection sQLiteConnection) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from red_dot where isUpload = 0 order by timeInZero desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                try {
                    RedDotEntity redDotEntity = new RedDotEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                    boolean z = false;
                    redDotEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                    if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0) {
                        z = true;
                    }
                    redDotEntity.setDeleted(z);
                    arrayList.add(redDotEntity);
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.RedDotDao
    public void delete(final HomeDataType homeDataType, final List<Long> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("update red_dot set isDeleted = 1, isUpload = 0 where dataType = ");
        sb.append("?");
        sb.append(" and timeInZero in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        DBUtil.performBlocking(this.f34515a, false, true, new Function1() { // from class: qak
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f31292a.m(string, homeDataType, list, (SQLiteConnection) obj);
            }
        });
    }
}
