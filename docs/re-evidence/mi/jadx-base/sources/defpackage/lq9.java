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
import com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class lq9 implements FitnessDeviceListDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f25347a;
    public final HomeDataTypeConvert c = new HomeDataTypeConvert();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<FitnessDeviceItemEntity> f25348b = new a();
    public final EntityDeleteOrUpdateAdapter<FitnessDeviceItemEntity> d = new b();

    public class a extends EntityInsertAdapter<FitnessDeviceItemEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FitnessDeviceItemEntity fitnessDeviceItemEntity) {
            if (fitnessDeviceItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, fitnessDeviceItemEntity.getSid());
            }
            String strHomeDataToString = lq9.this.c.homeDataToString(fitnessDeviceItemEntity.getDataType());
            if (strHomeDataToString == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, strHomeDataToString);
            }
            sQLiteStatement.mo50bindLong(3, fitnessDeviceItemEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, fitnessDeviceItemEntity.getTimeInZero());
            sQLiteStatement.mo50bindLong(5, fitnessDeviceItemEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(6, fitnessDeviceItemEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `device_list` (`sid`,`dataType`,`updateTime`,`timeInZero`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<FitnessDeviceItemEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FitnessDeviceItemEntity fitnessDeviceItemEntity) {
            String strHomeDataToString = lq9.this.c.homeDataToString(fitnessDeviceItemEntity.getDataType());
            if (strHomeDataToString == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, strHomeDataToString);
            }
            if (fitnessDeviceItemEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, fitnessDeviceItemEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(3, fitnessDeviceItemEntity.getTimeInZero());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `device_list` WHERE `dataType` = ? AND `sid` = ? AND `timeInZero` = ?";
        }
    }

    public lq9(RoomDatabase roomDatabase) {
        this.f25347a = roomDatabase;
    }

    public static List<Class<?>> f() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao
    public void delete(final FitnessDeviceItemEntity... fitnessDeviceItemEntityArr) {
        fitnessDeviceItemEntityArr.getClass();
        DBUtil.performBlocking(this.f25347a, false, true, new Function1() { // from class: hq9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20337a.g(fitnessDeviceItemEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object g(FitnessDeviceItemEntity[] fitnessDeviceItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, fitnessDeviceItemEntityArr);
        return null;
    }

    public final /* synthetic */ Object h(String str, HomeDataType homeDataType, List list, SQLiteConnection sQLiteConnection) {
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

    public final /* synthetic */ Object i(FitnessDeviceItemEntity[] fitnessDeviceItemEntityArr, SQLiteConnection sQLiteConnection) {
        this.f25348b.insert(sQLiteConnection, fitnessDeviceItemEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao
    public void insert(final FitnessDeviceItemEntity... fitnessDeviceItemEntityArr) {
        fitnessDeviceItemEntityArr.getClass();
        DBUtil.performBlocking(this.f25347a, false, true, new Function1() { // from class: kq9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f24187a.i(fitnessDeviceItemEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ List j(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from device_list where dataType = ? and timeInZero >= ? and timeInZero < ?");
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
                FitnessDeviceItemEntity fitnessDeviceItemEntity = new FitnessDeviceItemEntity(text2, this.c.typeStringToHomeDataType(text), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                boolean z = false;
                fitnessDeviceItemEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0) {
                    z = true;
                }
                fitnessDeviceItemEntity.setDeleted(z);
                arrayList.add(fitnessDeviceItemEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao
    public Flow<List<FitnessDeviceItemEntity>> queryDeviceList(final HomeDataType homeDataType, final long j, final long j2) {
        return FlowUtil.createFlow(this.f25347a, false, new String[]{CloudContract.TABLE_DEVICE_LIST}, new Function1() { // from class: jq9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23020a.j(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDeviceListDao
    public void delete(final HomeDataType homeDataType, final List<Long> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("delete from device_list where dataType = ");
        sb.append("?");
        sb.append(" and timeInZero in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        DBUtil.performBlocking(this.f25347a, false, true, new Function1() { // from class: iq9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f21991a.h(string, homeDataType, list, (SQLiteConnection) obj);
            }
        });
    }
}
