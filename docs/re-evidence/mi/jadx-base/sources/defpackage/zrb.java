package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class zrb implements HealthConnectSyncDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<HealthConnectSyncDaoEntity> f41598b = new a();
    public final EntityDeleteOrUpdateAdapter<HealthConnectSyncDaoEntity> c = new b();

    public class a extends EntityInsertAdapter<HealthConnectSyncDaoEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
            if (healthConnectSyncDaoEntity.getUid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, healthConnectSyncDaoEntity.getUid());
            }
            sQLiteStatement.mo50bindLong(2, healthConnectSyncDaoEntity.getDataType());
            if (healthConnectSyncDaoEntity.getType() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, healthConnectSyncDaoEntity.getType());
            }
            if (healthConnectSyncDaoEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, healthConnectSyncDaoEntity.getSid());
            }
            if (healthConnectSyncDaoEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, healthConnectSyncDaoEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(6, healthConnectSyncDaoEntity.getTime());
            sQLiteStatement.mo50bindLong(7, healthConnectSyncDaoEntity.getTimeZoneOffset());
            if (healthConnectSyncDaoEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, healthConnectSyncDaoEntity.getValue());
            }
            if (healthConnectSyncDaoEntity.getEditedValue() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, healthConnectSyncDaoEntity.getEditedValue());
            }
            sQLiteStatement.mo50bindLong(10, healthConnectSyncDaoEntity.getStatus());
            sQLiteStatement.mo50bindLong(11, healthConnectSyncDaoEntity.isDeleted());
            if (healthConnectSyncDaoEntity.getRecordId() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, healthConnectSyncDaoEntity.getRecordId());
            }
            if (healthConnectSyncDaoEntity.getClientRecordId() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, healthConnectSyncDaoEntity.getClientRecordId());
            }
            if (healthConnectSyncDaoEntity.getStartTime() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo50bindLong(14, healthConnectSyncDaoEntity.getStartTime().longValue());
            }
            if (healthConnectSyncDaoEntity.getEndTime() == null) {
                sQLiteStatement.mo51bindNull(15);
            } else {
                sQLiteStatement.mo50bindLong(15, healthConnectSyncDaoEntity.getEndTime().longValue());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `health_connect_sync_info` (`uid`,`dataType`,`type`,`sid`,`key`,`time`,`timeZoneOffset`,`value`,`editedValue`,`status`,`isDeleted`,`recordId`,`clientRecordId`,`startTime`,`endTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<HealthConnectSyncDaoEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
            if (healthConnectSyncDaoEntity.getUid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, healthConnectSyncDaoEntity.getUid());
            }
            sQLiteStatement.mo50bindLong(2, healthConnectSyncDaoEntity.getDataType());
            if (healthConnectSyncDaoEntity.getType() == null) {
                sQLiteStatement.mo51bindNull(3);
            } else {
                sQLiteStatement.mo52bindText(3, healthConnectSyncDaoEntity.getType());
            }
            if (healthConnectSyncDaoEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, healthConnectSyncDaoEntity.getSid());
            }
            if (healthConnectSyncDaoEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(5);
            } else {
                sQLiteStatement.mo52bindText(5, healthConnectSyncDaoEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(6, healthConnectSyncDaoEntity.getTime());
            sQLiteStatement.mo50bindLong(7, healthConnectSyncDaoEntity.getTimeZoneOffset());
            if (healthConnectSyncDaoEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, healthConnectSyncDaoEntity.getValue());
            }
            if (healthConnectSyncDaoEntity.getEditedValue() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, healthConnectSyncDaoEntity.getEditedValue());
            }
            sQLiteStatement.mo50bindLong(10, healthConnectSyncDaoEntity.getStatus());
            sQLiteStatement.mo50bindLong(11, healthConnectSyncDaoEntity.isDeleted());
            if (healthConnectSyncDaoEntity.getRecordId() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, healthConnectSyncDaoEntity.getRecordId());
            }
            if (healthConnectSyncDaoEntity.getClientRecordId() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, healthConnectSyncDaoEntity.getClientRecordId());
            }
            if (healthConnectSyncDaoEntity.getStartTime() == null) {
                sQLiteStatement.mo51bindNull(14);
            } else {
                sQLiteStatement.mo50bindLong(14, healthConnectSyncDaoEntity.getStartTime().longValue());
            }
            if (healthConnectSyncDaoEntity.getEndTime() == null) {
                sQLiteStatement.mo51bindNull(15);
            } else {
                sQLiteStatement.mo50bindLong(15, healthConnectSyncDaoEntity.getEndTime().longValue());
            }
            if (healthConnectSyncDaoEntity.getUid() == null) {
                sQLiteStatement.mo51bindNull(16);
            } else {
                sQLiteStatement.mo52bindText(16, healthConnectSyncDaoEntity.getUid());
            }
            sQLiteStatement.mo50bindLong(17, healthConnectSyncDaoEntity.getDataType());
            if (healthConnectSyncDaoEntity.getType() == null) {
                sQLiteStatement.mo51bindNull(18);
            } else {
                sQLiteStatement.mo52bindText(18, healthConnectSyncDaoEntity.getType());
            }
            if (healthConnectSyncDaoEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(19);
            } else {
                sQLiteStatement.mo52bindText(19, healthConnectSyncDaoEntity.getSid());
            }
            if (healthConnectSyncDaoEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(20);
            } else {
                sQLiteStatement.mo52bindText(20, healthConnectSyncDaoEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(21, healthConnectSyncDaoEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `health_connect_sync_info` SET `uid` = ?,`dataType` = ?,`type` = ?,`sid` = ?,`key` = ?,`time` = ?,`timeZoneOffset` = ?,`value` = ?,`editedValue` = ?,`status` = ?,`isDeleted` = ?,`recordId` = ?,`clientRecordId` = ?,`startTime` = ?,`endTime` = ? WHERE `uid` = ? AND `dataType` = ? AND `type` = ? AND `sid` = ? AND `key` = ? AND `time` = ?";
        }
    }

    public zrb(RoomDatabase roomDatabase) {
        this.f41597a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ HealthConnectSyncDaoEntity k(String str, int i, String str2, String str3, long j, String str4, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `uid` = ? AND `dataType` = ? AND `type` = ? AND `key`=? AND `time` = ? AND `sid`=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, i);
            if (str2 == null) {
                sQLiteStatementPrepare.mo51bindNull(3);
            } else {
                sQLiteStatementPrepare.mo52bindText(3, str2);
            }
            if (str3 == null) {
                sQLiteStatementPrepare.mo51bindNull(4);
            } else {
                sQLiteStatementPrepare.mo52bindText(4, str3);
            }
            sQLiteStatementPrepare.mo50bindLong(5, j);
            if (str4 == null) {
                sQLiteStatementPrepare.mo51bindNull(6);
            } else {
                sQLiteStatementPrepare.mo52bindText(6, str4);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                healthConnectSyncDaoEntity = new HealthConnectSyncDaoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow15)));
            }
            sQLiteStatementPrepare.close();
            return healthConnectSyncDaoEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List l(String str, String str2, long j, String str3, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `uid` = ? AND `dataType` = 1 AND `key`=? AND `time` = ? AND `sid`=?");
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
            sQLiteStatementPrepare.mo50bindLong(3, j);
            if (str3 == null) {
                sQLiteStatementPrepare.mo51bindNull(4);
            } else {
                sQLiteStatementPrepare.mo52bindText(4, str3);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                int i2 = columnIndexOrThrow;
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow4;
                int i5 = columnIndexOrThrow5;
                int i6 = columnIndexOrThrow15;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new HealthConnectSyncDaoEntity(text, i, text2, sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(i6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i6))));
                columnIndexOrThrow4 = i4;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                columnIndexOrThrow5 = i5;
                columnIndexOrThrow15 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow = i2;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List m(int i, String str, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `dataType` = ? AND `type` = ? AND `time`>=? AND `time` < ? ORDER BY `time` ASC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            sQLiteStatementPrepare.mo50bindLong(3, j);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = columnIndexOrThrow5;
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow15));
                int i9 = columnIndexOrThrow;
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = new HealthConnectSyncDaoEntity(text, i2, text2, text3, text4, j3, i5, text5, text6, i6, i8, text7, text8, lValueOf, lValueOf2);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(healthConnectSyncDaoEntity);
                columnIndexOrThrow = i9;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow4 = columnIndexOrThrow4;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                columnIndexOrThrow15 = columnIndexOrThrow15;
                columnIndexOrThrow5 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List n(int i, String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `dataType` = ? AND `type` = ? AND `status`=0 ");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i2 = columnIndexOrThrow2;
                int i3 = columnIndexOrThrow3;
                int i4 = columnIndexOrThrow5;
                int i5 = columnIndexOrThrow;
                int i6 = columnIndexOrThrow15;
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = new HealthConnectSyncDaoEntity(text, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(i6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i6)));
                ArrayList arrayList2 = arrayList;
                arrayList2.add(healthConnectSyncDaoEntity);
                columnIndexOrThrow = i5;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow4 = columnIndexOrThrow4;
                columnIndexOrThrow5 = i4;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List o(int i, String str, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `dataType` = ? AND `type` = ? AND `status`=0  AND `time` >= ? AND `time` < ? ORDER BY `time` ASC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(2);
            } else {
                sQLiteStatementPrepare.mo52bindText(2, str);
            }
            sQLiteStatementPrepare.mo50bindLong(3, j);
            sQLiteStatementPrepare.mo50bindLong(4, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = columnIndexOrThrow5;
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow15));
                int i9 = columnIndexOrThrow;
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = new HealthConnectSyncDaoEntity(text, i2, text2, text3, text4, j3, i5, text5, text6, i6, i8, text7, text8, lValueOf, lValueOf2);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(healthConnectSyncDaoEntity);
                columnIndexOrThrow = i9;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow4 = columnIndexOrThrow4;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                columnIndexOrThrow15 = columnIndexOrThrow15;
                columnIndexOrThrow5 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List p(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM health_connect_sync_info WHERE `dataType` = 1 AND `status`=0 ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dataType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timeZoneOffset");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "editedValue");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recordId");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "clientRecordId");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startTime");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endTime");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                int i3 = columnIndexOrThrow5;
                int i4 = columnIndexOrThrow;
                int i5 = columnIndexOrThrow15;
                HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = new HealthConnectSyncDaoEntity(text, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow14)), sQLiteStatementPrepare.isNull(i5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i5)));
                ArrayList arrayList2 = arrayList;
                arrayList2.add(healthConnectSyncDaoEntity);
                columnIndexOrThrow = i4;
                columnIndexOrThrow14 = columnIndexOrThrow14;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = columnIndexOrThrow4;
                columnIndexOrThrow5 = i3;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public HealthConnectSyncDaoEntity getItem(final String str, final int i, final String str2, final String str3, final long j, final String str4) {
        return (HealthConnectSyncDaoEntity) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: xrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.k(str, i, str2, str3, j, str4, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public List<HealthConnectSyncDaoEntity> getReportAssociateItem(final String str, final String str2, final long j, final String str3) {
        return (List) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: wrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.l(str, str2, j, str3, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public List<HealthConnectSyncDaoEntity> getSyncedByTypeAndTimeRange(final int i, final String str, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: yrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.m(i, str, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public List<HealthConnectSyncDaoEntity> getUnSyncedList(final int i, final String str) {
        return (List) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: trb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.n(i, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public List<HealthConnectSyncDaoEntity> getUnSyncedListByTimeRange(final int i, final String str, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: urb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.o(i, str, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public List<HealthConnectSyncDaoEntity> getUnSyncedReport() {
        return (List) DBUtil.performBlocking(this.f41597a, true, false, new Function1() { // from class: qrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zrb.p((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public void insert(final HealthConnectSyncDaoEntity... healthConnectSyncDaoEntityArr) {
        healthConnectSyncDaoEntityArr.getClass();
        DBUtil.performBlocking(this.f41597a, false, true, new Function1() { // from class: rrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f32822a.q(healthConnectSyncDaoEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public void insertAll(final List<HealthConnectSyncDaoEntity> list) {
        list.getClass();
        DBUtil.performBlocking(this.f41597a, false, true, new Function1() { // from class: vrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f37156a.r(list, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object q(HealthConnectSyncDaoEntity[] healthConnectSyncDaoEntityArr, SQLiteConnection sQLiteConnection) {
        this.f41598b.insert(sQLiteConnection, healthConnectSyncDaoEntityArr);
        return null;
    }

    public final /* synthetic */ Object r(List list, SQLiteConnection sQLiteConnection) {
        this.f41598b.insert(sQLiteConnection, list);
        return null;
    }

    public final /* synthetic */ Object s(HealthConnectSyncDaoEntity[] healthConnectSyncDaoEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, healthConnectSyncDaoEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao
    public void update(final HealthConnectSyncDaoEntity... healthConnectSyncDaoEntityArr) {
        healthConnectSyncDaoEntityArr.getClass();
        DBUtil.performBlocking(this.f41597a, false, true, new Function1() { // from class: srb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33909a.s(healthConnectSyncDaoEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
