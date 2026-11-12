package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportDao;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class qyn implements SportReportDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f31984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<SportReportEntity> f31985b = new a();
    public final EntityDeleteOrUpdateAdapter<SportReportEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<SportReportEntity> d = new c();

    public class a extends EntityInsertAdapter<SportReportEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportReportEntity sportReportEntity) {
            if (sportReportEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sportReportEntity.getSid());
            }
            if (sportReportEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportReportEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, sportReportEntity.getTime());
            if (sportReportEntity.getCategory() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, sportReportEntity.getCategory());
            }
            sQLiteStatement.mo50bindLong(5, sportReportEntity.getZoneOffsetInSec());
            if (sportReportEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, sportReportEntity.getZoneName());
            }
            if (sportReportEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, sportReportEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(8, sportReportEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, sportReportEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, sportReportEntity.getIsDeleted() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(11, sportReportEntity.getOfflineCounted() ? 1L : 0L);
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sport_report` (`sid`,`key`,`time`,`category`,`zoneOffsetInSec`,`zoneName`,`value`,`timeIn0Tz`,`isUpload`,`isDeleted`,`offlineCounted`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<SportReportEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportReportEntity sportReportEntity) {
            if (sportReportEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sportReportEntity.getSid());
            }
            if (sportReportEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportReportEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, sportReportEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `sport_report` WHERE `sid` = ? AND `key` = ? AND `time` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<SportReportEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, SportReportEntity sportReportEntity) {
            if (sportReportEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, sportReportEntity.getSid());
            }
            if (sportReportEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo52bindText(2, sportReportEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(3, sportReportEntity.getTime());
            if (sportReportEntity.getCategory() == null) {
                sQLiteStatement.mo51bindNull(4);
            } else {
                sQLiteStatement.mo52bindText(4, sportReportEntity.getCategory());
            }
            sQLiteStatement.mo50bindLong(5, sportReportEntity.getZoneOffsetInSec());
            if (sportReportEntity.getZoneName() == null) {
                sQLiteStatement.mo51bindNull(6);
            } else {
                sQLiteStatement.mo52bindText(6, sportReportEntity.getZoneName());
            }
            if (sportReportEntity.getValue() == null) {
                sQLiteStatement.mo51bindNull(7);
            } else {
                sQLiteStatement.mo52bindText(7, sportReportEntity.getValue());
            }
            sQLiteStatement.mo50bindLong(8, sportReportEntity.getTimeIn0Tz());
            sQLiteStatement.mo50bindLong(9, sportReportEntity.getIsUpload() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(10, sportReportEntity.getIsDeleted() ? 1L : 0L);
            sQLiteStatement.mo50bindLong(11, sportReportEntity.getOfflineCounted() ? 1L : 0L);
            if (sportReportEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(12);
            } else {
                sQLiteStatement.mo52bindText(12, sportReportEntity.getSid());
            }
            if (sportReportEntity.getKey() == null) {
                sQLiteStatement.mo51bindNull(13);
            } else {
                sQLiteStatement.mo52bindText(13, sportReportEntity.getKey());
            }
            sQLiteStatement.mo50bindLong(14, sportReportEntity.getTime());
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `sport_report` SET `sid` = ?,`key` = ?,`time` = ?,`category` = ?,`zoneOffsetInSec` = ?,`zoneName` = ?,`value` = ?,`timeIn0Tz` = ?,`isUpload` = ?,`isDeleted` = ?,`offlineCounted` = ? WHERE `sid` = ? AND `key` = ? AND `time` = ?";
        }
    }

    public qyn(RoomDatabase roomDatabase) {
        this.f31984a = roomDatabase;
    }

    public static /* synthetic */ List A(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select distinct category from sport_report where isUpload = 0 and isDeleted = 0");
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List B(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isDeleted = 1 LIMIT ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List C(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isUpload = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow;
                int i2 = columnIndexOrThrow2;
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = i;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ SportReportEntity D(long j, SQLiteConnection sQLiteConnection) {
        SportReportEntity sportReportEntity;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isDeleted = 0 AND time < ? ORDER BY time desc LIMIT 1");
        boolean z = true;
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            if (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity2 = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity2.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity2.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity2.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity2.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity2.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity2.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity2.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) == 0) {
                    z = false;
                }
                sportReportEntity2.setOfflineCounted(z);
                sportReportEntity = sportReportEntity2;
            } else {
                sportReportEntity = null;
            }
            return sportReportEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List E(String str, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE category= ? AND timeIn0Tz <= ? AND isDeleted = 0 ORDER BY time DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                int i = columnIndexOrThrow11;
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(i)) != 0);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(sportReportEntity);
                arrayList = arrayList2;
                columnIndexOrThrow11 = i;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ SportReportEntity F(String str, String str2, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE `key` = ? AND sid = ? AND time = ?");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            SportReportEntity sportReportEntity = null;
            String text = null;
            if (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity2 = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity2.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity2.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity2.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                }
                sportReportEntity2.setValue(text);
                sportReportEntity2.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity2.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity2.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity2.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                sportReportEntity = sportReportEntity2;
            }
            sQLiteStatementPrepare.close();
            return sportReportEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Long G(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select min(timeIn0Tz) from sport_report where isUpload = 0 and isDeleted = 0");
        try {
            return Long.valueOf(sQLiteStatementPrepare.step() ? sQLiteStatementPrepare.getLong(0) : 0L);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List H(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isUpload = 0 and category = ? and isDeleted = 0");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                int i = columnIndexOrThrow11;
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(i)) != 0);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(sportReportEntity);
                arrayList = arrayList2;
                columnIndexOrThrow11 = i;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List I(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isUpload = 0 and isDeleted = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow;
                int i2 = columnIndexOrThrow2;
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = i;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List J(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isUpload = 0 and isDeleted = 1 and offlineCounted = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow;
                int i2 = columnIndexOrThrow2;
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = i;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List K(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE isUpload = 0 and offlineCounted = 0 and isDeleted = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow;
                int i2 = columnIndexOrThrow2;
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = i;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Integer M(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select count(*) FROM sport_report WHERE timeIn0Tz >= ? AND isDeleted = 0");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            Integer numValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
            }
            return numValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List N(long j, int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from sport_report where timeIn0Tz < ? order by timeIn0Tz desc limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static List<Class<?>> u() {
        return Collections.emptyList();
    }

    public static /* synthetic */ Object w(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM sport_report");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List x(String str, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE category = ? AND timeIn0Tz >= ? AND timeIn0Tz < ? AND isDeleted = 0 ORDER BY time DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                int i = columnIndexOrThrow11;
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(i)) != 0);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(sportReportEntity);
                arrayList = arrayList2;
                columnIndexOrThrow11 = i;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List y(String str, long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE `key` = ? AND timeIn0Tz >= ? AND timeIn0Tz < ? AND isDeleted = 0 ORDER BY time DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, j);
            sQLiteStatementPrepare.mo50bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                int i = columnIndexOrThrow11;
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(i)) != 0);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(sportReportEntity);
                arrayList = arrayList2;
                columnIndexOrThrow11 = i;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List z(long j, long j2, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM sport_report WHERE timeIn0Tz >= ? AND timeIn0Tz < ? AND isDeleted = 0 ORDER BY time DESC");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, j);
            sQLiteStatementPrepare.mo50bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneOffsetInSec");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "zoneName");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "value");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, FitnessDBConstants.COL_TIME_0_TZ);
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDeleted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "offlineCounted");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                SportReportEntity sportReportEntity = new SportReportEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                sportReportEntity.setCategory(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                sportReportEntity.setZoneOffsetInSec((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                sportReportEntity.setZoneName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                sportReportEntity.setValue(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                sportReportEntity.setTimeIn0Tz(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                sportReportEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0);
                sportReportEntity.setDeleted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)) != 0);
                sportReportEntity.setOfflineCounted(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)) != 0);
                arrayList.add(sportReportEntity);
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public final /* synthetic */ Object L(SportReportEntity[] sportReportEntityArr, SQLiteConnection sQLiteConnection) {
        this.f31985b.insert(sQLiteConnection, sportReportEntityArr);
        return null;
    }

    public final /* synthetic */ Object O(SportReportEntity[] sportReportEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, sportReportEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public void deleteAll(final SportReportEntity... sportReportEntityArr) {
        sportReportEntityArr.getClass();
        DBUtil.performBlocking(this.f31984a, false, true, new Function1() { // from class: fyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f18380a.v(sportReportEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getByCategory(final String str, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: lyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.x(str, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getByKey(final String str, final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: cyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.y(str, j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getByTime(final long j, final long j2) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: wxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.z(j, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<String> getCategoriesNotUpload() {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: hyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.A((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getDeletedReportList(final int i) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: oyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.B(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getNotUploadRecord() {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: ayn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.C((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public SportReportEntity getRecentOneData(final long j) {
        return (SportReportEntity) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: xxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.D(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getRecordBefore(final String str, final long j) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: byn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.E(str, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public SportReportEntity getSpecialSportReport(final String str, final String str2, final long j) {
        return (SportReportEntity) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: dyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.F(str2, str, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public long getStartSec0TZNotUpload() {
        return ((Long) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: yxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.G((SQLiteConnection) obj);
            }
        })).longValue();
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getUnUploadAndUndelete(final String str) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: pyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.H(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getUnUploadDeletedUnCount() {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: nyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.J((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getUnUploadUnCount() {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: eyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.K((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public void insertAll(final SportReportEntity... sportReportEntityArr) {
        sportReportEntityArr.getClass();
        DBUtil.performBlocking(this.f31984a, false, true, new Function1() { // from class: iyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f22232a.L(sportReportEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public Flow<Integer> observerRecentCount(final long j) {
        return FlowUtil.createFlow(this.f31984a, false, new String[]{"sport_report"}, new Function1() { // from class: kyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.M(j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> queryPagedSportEntity(final long j, final int i) {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: gyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.N(j, i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public void updateAll(final SportReportEntity... sportReportEntityArr) {
        sportReportEntityArr.getClass();
        DBUtil.performBlocking(this.f31984a, false, true, new Function1() { // from class: jyn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f23250a.O(sportReportEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object v(SportReportEntity[] sportReportEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, sportReportEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public List<SportReportEntity> getUnUploadAndUndelete() {
        return (List) DBUtil.performBlocking(this.f31984a, true, false, new Function1() { // from class: myn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.I((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.SportReportDao
    public void deleteAll() {
        DBUtil.performBlocking(this.f31984a, false, true, new Function1() { // from class: zxn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return qyn.w((SQLiteConnection) obj);
            }
        });
    }
}
