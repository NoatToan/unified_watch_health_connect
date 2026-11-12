package defpackage;

import androidx.lifecycle.LiveData;
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
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDailyReportEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class np9 implements FitnessDailyReportDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f28223a;
    public final HomeDataTypeConvert c = new HomeDataTypeConvert();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<FitnessDailyReportEntity> f28224b = new a();

    public class a extends EntityInsertAdapter<FitnessDailyReportEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FitnessDailyReportEntity fitnessDailyReportEntity) {
            if (fitnessDailyReportEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, fitnessDailyReportEntity.getSid());
            }
            String strHomeDataToString = np9.this.c.homeDataToString(fitnessDailyReportEntity.getDataType());
            if (strHomeDataToString == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, strHomeDataToString);
            }
            sQLiteStatement.mo50bindLong(3, fitnessDailyReportEntity.getUpdateTime());
            sQLiteStatement.mo50bindLong(4, fitnessDailyReportEntity.getTimeInZero());
            if (fitnessDailyReportEntity.getViewTag() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, fitnessDailyReportEntity.getViewTag());
            }
            if (fitnessDailyReportEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, fitnessDailyReportEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(7, fitnessDailyReportEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(8, fitnessDailyReportEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `daily_report` (`sid`,`dataType`,`updateTime`,`timeInZero`,`viewTag`,`value`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public np9(RoomDatabase roomDatabase) {
        this.f28223a = roomDatabase;
    }

    public static List<Class<?>> n() {
        return Collections.emptyList();
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public void delete(final HomeDataType homeDataType, final String str, final long j, final String str2) {
        DBUtil.performBlocking(this.f28223a, false, true, new Function1() { // from class: bp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4446a.o(homeDataType, str, j, str2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public void insert(final FitnessDailyReportEntity... fitnessDailyReportEntityArr) {
        fitnessDailyReportEntityArr.getClass();
        DBUtil.performBlocking(this.f28223a, false, true, new Function1() { // from class: mp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f27064a.q(fitnessDailyReportEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object o(HomeDataType homeDataType, String str, long j, String str2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("update daily_report set isDeleted = 1 where dataType = ? and sid = ? and timeInZero = ? and viewTag = ?");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            sQLiteStatementPrepare.mo50bindLong(3, j);
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(4);
            } else {
                sQLiteStatementPrepare.mo52bindText(4, str2);
            }
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object p(String str, HomeDataType homeDataType, List list, SQLiteConnection sQLiteConnection) {
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

    public final /* synthetic */ Object q(FitnessDailyReportEntity[] fitnessDailyReportEntityArr, SQLiteConnection sQLiteConnection) {
        this.f28224b.insert(sQLiteConnection, fitnessDailyReportEntityArr);
        return null;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public LiveData<FitnessDailyReportEntity> queryDailyReportEntity(final HomeDataType homeDataType, final long j) {
        return this.f28223a.getInvalidationTracker().createLiveData(new String[]{"daily_report"}, false, new Function1() { // from class: ep9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f16917a.r(homeDataType, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityList(final HomeDataType homeDataType, final long j, final long j2) {
        return FlowUtil.createFlow(this.f28223a, false, new String[]{"daily_report"}, new Function1() { // from class: kp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f24132a.s(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityListBySid(final String str, final HomeDataType homeDataType, final long j, final long j2) {
        return FlowUtil.createFlow(this.f28223a, false, new String[]{"daily_report"}, new Function1() { // from class: cp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f14584a.u(str, homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public List<FitnessDailyReportEntity> queryDailyReportEntityListNotUpload(final int i, final long j) {
        return (List) DBUtil.performBlocking(this.f28223a, true, false, new Function1() { // from class: jp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23000a.v(j, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public List<FitnessDailyReportEntity> queryDailyReportEntityListSync(final HomeDataType homeDataType, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f28223a, true, false, new Function1() { // from class: dp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f15784a.w(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public FitnessDailyReportEntity queryDailyReportEntitySync(final HomeDataType homeDataType, final long j) {
        return (FitnessDailyReportEntity) DBUtil.performBlocking(this.f28223a, true, false, new Function1() { // from class: lp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f25294a.x(homeDataType, j, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ FitnessDailyReportEntity r(HomeDataType homeDataType, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where dataType = ? and timeInZero = ? and isDeleted = 0");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            boolean z = true;
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            FitnessDailyReportEntity fitnessDailyReportEntity = null;
            if (sQLiteStatementPrepare.step()) {
                fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) == 0) {
                    z = false;
                }
                fitnessDailyReportEntity.setDeleted(z);
            }
            return fitnessDailyReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List s(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0 order by timeInZero desc");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            boolean z = true;
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FitnessDailyReportEntity fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0 ? z : false);
                int i = columnIndexOrThrow2;
                fitnessDailyReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                arrayList.add(fitnessDailyReportEntity);
                columnIndexOrThrow2 = i;
                z = true;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List t(String str, HomeDataType homeDataType, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            boolean z = true;
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FitnessDailyReportEntity fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0 ? z : false);
                int i2 = columnIndexOrThrow2;
                fitnessDailyReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                arrayList.add(fitnessDailyReportEntity);
                columnIndexOrThrow2 = i2;
                z = true;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List u(String str, HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where sid = ? and dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0 order by timeInZero desc");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(3, j);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FitnessDailyReportEntity fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0 ? z : false);
                int i = columnIndexOrThrow2;
                fitnessDailyReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                arrayList.add(fitnessDailyReportEntity);
                columnIndexOrThrow2 = i;
                z = true;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public void update(final HomeDataType homeDataType, final long j) {
        DBUtil.performBlocking(this.f28223a, false, true, new Function1() { // from class: hp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f20310a.y(homeDataType, j, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ List v(long j, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where dataType in ('STEP','CALORIE','VALID_STAND','MH_STRENGTH','SLEEP','HR','SPO2','STRESS') and timeInZero>=? and isUpload = 0 order by timeInZero desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FitnessDailyReportEntity fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                boolean z = false;
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0) {
                    z = true;
                }
                fitnessDailyReportEntity.setDeleted(z);
                arrayList.add(fitnessDailyReportEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ List w(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where dataType = ? and timeInZero >= ? and timeInZero < ? and isDeleted = 0 order by timeInZero desc");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            boolean z = true;
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
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FitnessDailyReportEntity fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0 ? z : false);
                int i = columnIndexOrThrow2;
                fitnessDailyReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                arrayList.add(fitnessDailyReportEntity);
                columnIndexOrThrow2 = i;
                z = true;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ FitnessDailyReportEntity x(HomeDataType homeDataType, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from daily_report where dataType = ? and timeInZero = ? and isDeleted = 0");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            boolean z = true;
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_VIEW_TAG);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            FitnessDailyReportEntity fitnessDailyReportEntity = null;
            if (sQLiteStatementPrepare.step()) {
                fitnessDailyReportEntity = new FitnessDailyReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), this.c.typeStringToHomeDataType(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                fitnessDailyReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) == 0) {
                    z = false;
                }
                fitnessDailyReportEntity.setDeleted(z);
            }
            return fitnessDailyReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object y(HomeDataType homeDataType, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("update daily_report set isUpload = 1 where dataType = ? and timeInZero = ?");
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

    public final /* synthetic */ Object z(HomeDataType homeDataType, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("update daily_report set isUpload = 1 where dataType = ? and timeInZero = ? and updateTime = ?");
        try {
            String strHomeDataToString = this.c.homeDataToString(homeDataType);
            if (strHomeDataToString == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, strHomeDataToString);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public void delete(final HomeDataType homeDataType, final List<Long> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("update daily_report set isDeleted = 1 where dataType = ");
        sb.append("?");
        sb.append(" and timeInZero in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        DBUtil.performBlocking(this.f28223a, false, true, new Function1() { // from class: gp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f19206a.p(string, homeDataType, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public Flow<List<FitnessDailyReportEntity>> queryDailyReportEntityList(final HomeDataType homeDataType, final List<Long> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from daily_report where dataType = ");
        sb.append("?");
        sb.append(" and timeInZero in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") and isDeleted = 0 order by timeInZero desc");
        final String string = sb.toString();
        return FlowUtil.createFlow(this.f28223a, false, new String[]{"daily_report"}, new Function1() { // from class: fp9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18051a.t(string, homeDataType, list, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDao
    public void update(final HomeDataType homeDataType, final long j, final long j2) {
        DBUtil.performBlocking(this.f28223a, false, true, new Function1() { // from class: ip9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f21971a.z(homeDataType, j, j2, (SQLiteConnection) obj);
            }
        });
    }
}
