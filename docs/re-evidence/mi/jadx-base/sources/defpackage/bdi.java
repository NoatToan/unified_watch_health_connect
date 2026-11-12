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
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class bdi implements ProjectEntityDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f4089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<ProjectEntity> f4090b = new a();
    public final EntityDeleteOrUpdateAdapter<ProjectEntity> c = new b();

    public class a extends EntityInsertAdapter<ProjectEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ProjectEntity projectEntity) {
            if (projectEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, projectEntity.getSid());
            }
            if (projectEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, projectEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, projectEntity.getProjectId());
            sQLiteStatement.mo50bindLong(4, projectEntity.getTime());
            sQLiteStatement.mo50bindLong(5, projectEntity.getZoneOffset());
            sQLiteStatement.mo50bindLong(6, projectEntity.getTimeInZero());
            if (projectEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, projectEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(8, projectEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(9, projectEntity.getIsDeleted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `data_project` (`sid`,`key`,`projectId`,`time`,`zoneOffset`,`timeInZero`,`value`,`isUpload`,`isDeleted`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<ProjectEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, ProjectEntity projectEntity) {
            if (projectEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, projectEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(2, projectEntity.getTime());
            if (projectEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, projectEntity.getSid());
            }
            sQLiteStatement.mo50bindLong(4, projectEntity.getProjectId());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `data_project` WHERE `key` = ? AND `time` = ? AND `sid` = ? AND `projectId` = ?";
        }
    }

    public bdi(RoomDatabase roomDatabase) {
        this.f4089a = roomDatabase;
    }

    public static List<Class<?>> l() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Unit o(String str, String str2, List list, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str2);
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
            Unit unit = Unit.INSTANCE;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ ProjectEntity p(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from data_project where key = ? ORDER BY timeInZero desc limit 1");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_PROJECT_ID);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ProjectEntity projectEntity = null;
            if (sQLiteStatementPrepare.step()) {
                projectEntity = new ProjectEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                projectEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                    z = false;
                }
                projectEntity.setDeleted(z);
            }
            sQLiteStatementPrepare.close();
            return projectEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List q(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from data_project where isDeleted = 1 limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_PROJECT_ID);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ProjectEntity projectEntity = new ProjectEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                projectEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                projectEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                arrayList.add(projectEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ ProjectEntity r(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from data_project where key = ? and isDeleted = 0 ORDER BY timeInZero desc limit 1");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_PROJECT_ID);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ProjectEntity projectEntity = null;
            if (sQLiteStatementPrepare.step()) {
                projectEntity = new ProjectEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                projectEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                    z = false;
                }
                projectEntity.setDeleted(z);
            }
            sQLiteStatementPrepare.close();
            return projectEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ ProjectEntity s(String str, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from data_project where key = ? and timeInZero < ? and isDeleted = 0 ORDER BY timeInZero desc limit 1");
        boolean z = true;
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_PROJECT_ID);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ProjectEntity projectEntity = null;
            if (sQLiteStatementPrepare.step()) {
                projectEntity = new ProjectEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                projectEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) == 0) {
                    z = false;
                }
                projectEntity.setDeleted(z);
            }
            sQLiteStatementPrepare.close();
            return projectEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List t(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from data_project where isUpload = 0 order by timeInZero desc limit 30");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_PROJECT_ID);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CloudContract.COL_ZONE_OFFSET);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeInZero");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ProjectEntity projectEntity = new ProjectEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                projectEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8)) != 0);
                projectEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                arrayList.add(projectEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Object delete(final ProjectEntity[] projectEntityArr, Continuation<? super Unit> continuation) {
        projectEntityArr.getClass();
        return DBUtil.performSuspending(this.f4089a, false, true, new Function1() { // from class: zci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f41122a.m(projectEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Object insert(final ProjectEntity[] projectEntityArr, Continuation<? super Unit> continuation) {
        projectEntityArr.getClass();
        return DBUtil.performSuspending(this.f4089a, false, true, new Function1() { // from class: sci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33506a.n(projectEntityArr, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final ProjectEntity k(SQLiteStatement sQLiteStatement) {
        int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "sid");
        int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "key");
        int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, CloudContract.COL_PROJECT_ID);
        int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "time");
        int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, CloudContract.COL_ZONE_OFFSET);
        int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "timeInZero");
        int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "value");
        int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isUpload");
        int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatement, "isDeleted");
        String text = null;
        String text2 = (columnIndex == -1 || sQLiteStatement.isNull(columnIndex)) ? null : sQLiteStatement.getText(columnIndex);
        String text3 = (columnIndex2 == -1 || sQLiteStatement.isNull(columnIndex2)) ? null : sQLiteStatement.getText(columnIndex2);
        long j = columnIndex3 == -1 ? 0L : sQLiteStatement.getLong(columnIndex3);
        long j2 = columnIndex4 == -1 ? 0L : sQLiteStatement.getLong(columnIndex4);
        int i = columnIndex5 == -1 ? 0 : (int) sQLiteStatement.getLong(columnIndex5);
        long j3 = columnIndex6 != -1 ? sQLiteStatement.getLong(columnIndex6) : 0L;
        if (columnIndex7 != -1 && !sQLiteStatement.isNull(columnIndex7)) {
            text = sQLiteStatement.getText(columnIndex7);
        }
        ProjectEntity projectEntity = new ProjectEntity(text2, text3, j, j2, i, j3, text);
        if (columnIndex8 != -1) {
            projectEntity.setUpload(((int) sQLiteStatement.getLong(columnIndex8)) != 0);
        }
        if (columnIndex9 != -1) {
            projectEntity.setDeleted(((int) sQLiteStatement.getLong(columnIndex9)) != 0);
        }
        return projectEntity;
    }

    public final /* synthetic */ Unit m(ProjectEntity[] projectEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, projectEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Object markDelete(final String str, final List<Long> list, Continuation<? super Unit> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("update data_project set isDeleted = 1, isUpload = 0 where key = ");
        sb.append("?");
        sb.append(" and time in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        return DBUtil.performSuspending(this.f4089a, false, true, new Function1() { // from class: tci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.o(string, str, list, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit n(ProjectEntity[] projectEntityArr, SQLiteConnection sQLiteConnection) {
        this.f4090b.insert(sQLiteConnection, projectEntityArr);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public ProjectEntity queryDataValid(final String str) {
        return (ProjectEntity) DBUtil.performBlocking(this.f4089a, true, false, new Function1() { // from class: xci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.p(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Object queryDeletedDataList(final int i, Continuation<? super List<ProjectEntity>> continuation) {
        return DBUtil.performSuspending(this.f4089a, true, false, new Function1() { // from class: yci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.q(i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Flow<ProjectEntity> queryLatestData(final String str) {
        return FlowUtil.createFlow(this.f4089a, false, new String[]{CloudContract.TABLE_DATA_PROJECT}, new Function1() { // from class: rci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.r(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Flow<ProjectEntity> queryLatestDataBefore(final String str, final long j) {
        return FlowUtil.createFlow(this.f4089a, false, new String[]{CloudContract.TABLE_DATA_PROJECT}, new Function1() { // from class: adi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.s(str, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public List<ProjectEntity> queryNotUpProjectReportEntityList() {
        return (List) DBUtil.performBlocking(this.f4089a, true, false, new Function1() { // from class: uci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return bdi.t((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public Object rawQueryProjectList(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<ProjectEntity>> continuation) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return DBUtil.performSuspending(this.f4089a, true, false, new Function1() { // from class: vci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f36745a.u(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    @Override // com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDao
    public List<ProjectEntity> rawQueryProjectListSync(SupportSQLiteQuery supportSQLiteQuery) {
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(supportSQLiteQuery).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.f4089a, true, false, new Function1() { // from class: wci
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37843a.v(sql, roomRawQuery, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ List u(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(k(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public final /* synthetic */ List v(String str, RoomRawQuery roomRawQuery, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke2(sQLiteStatementPrepare);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(k(sQLiteStatementPrepare));
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }
}
