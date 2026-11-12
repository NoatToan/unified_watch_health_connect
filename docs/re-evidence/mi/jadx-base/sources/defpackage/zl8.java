package defpackage;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class zl8 implements FDSDataIdDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f41423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertAdapter<FDSDataIdEntity> f41424b = new a();
    public final EntityDeleteOrUpdateAdapter<FDSDataIdEntity> c = new b();
    public final EntityDeleteOrUpdateAdapter<FDSDataIdEntity> d = new c();

    public class a extends EntityInsertAdapter<FDSDataIdEntity> {
        public a() {
        }

        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FDSDataIdEntity fDSDataIdEntity) {
            if (fDSDataIdEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, fDSDataIdEntity.getSid());
            }
            if (fDSDataIdEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, fDSDataIdEntity.getIdBytes());
            }
            sQLiteStatement.mo50bindLong(3, fDSDataIdEntity.getTime());
            sQLiteStatement.mo50bindLong(4, fDSDataIdEntity.getDailyType());
            sQLiteStatement.mo50bindLong(5, fDSDataIdEntity.getSportType());
            sQLiteStatement.mo50bindLong(6, fDSDataIdEntity.getFileType());
            sQLiteStatement.mo50bindLong(7, fDSDataIdEntity.getIsUpload() ? 1L : 0L);
            if (fDSDataIdEntity.getExtra() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, fDSDataIdEntity.getExtra());
            }
        }

        @Override // androidx.room.EntityInsertAdapter
        public String createQuery() {
            return "INSERT OR REPLACE INTO `fds_data_id` (`sid`,`idBytes`,`time`,`dailyType`,`sportType`,`fileType`,`isUpload`,`extra`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeleteOrUpdateAdapter<FDSDataIdEntity> {
        public b() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FDSDataIdEntity fDSDataIdEntity) {
            if (fDSDataIdEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, fDSDataIdEntity.getSid());
            }
            if (fDSDataIdEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, fDSDataIdEntity.getIdBytes());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "DELETE FROM `fds_data_id` WHERE `sid` = ? AND `idBytes` = ?";
        }
    }

    public class c extends EntityDeleteOrUpdateAdapter<FDSDataIdEntity> {
        public c() {
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SQLiteStatement sQLiteStatement, FDSDataIdEntity fDSDataIdEntity) {
            if (fDSDataIdEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(1);
            } else {
                sQLiteStatement.mo52bindText(1, fDSDataIdEntity.getSid());
            }
            if (fDSDataIdEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(2);
            } else {
                sQLiteStatement.mo48bindBlob(2, fDSDataIdEntity.getIdBytes());
            }
            sQLiteStatement.mo50bindLong(3, fDSDataIdEntity.getTime());
            sQLiteStatement.mo50bindLong(4, fDSDataIdEntity.getDailyType());
            sQLiteStatement.mo50bindLong(5, fDSDataIdEntity.getSportType());
            sQLiteStatement.mo50bindLong(6, fDSDataIdEntity.getFileType());
            sQLiteStatement.mo50bindLong(7, fDSDataIdEntity.getIsUpload() ? 1L : 0L);
            if (fDSDataIdEntity.getExtra() == null) {
                sQLiteStatement.mo51bindNull(8);
            } else {
                sQLiteStatement.mo52bindText(8, fDSDataIdEntity.getExtra());
            }
            if (fDSDataIdEntity.getSid() == null) {
                sQLiteStatement.mo51bindNull(9);
            } else {
                sQLiteStatement.mo52bindText(9, fDSDataIdEntity.getSid());
            }
            if (fDSDataIdEntity.getIdBytes() == null) {
                sQLiteStatement.mo51bindNull(10);
            } else {
                sQLiteStatement.mo48bindBlob(10, fDSDataIdEntity.getIdBytes());
            }
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public String createQuery() {
            return "UPDATE OR ABORT `fds_data_id` SET `sid` = ?,`idBytes` = ?,`time` = ?,`dailyType` = ?,`sportType` = ?,`fileType` = ?,`isUpload` = ?,`extra` = ? WHERE `sid` = ? AND `idBytes` = ?";
        }
    }

    public zl8(RoomDatabase roomDatabase) {
        this.f41423a = roomDatabase;
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public static /* synthetic */ List l(String str, int i, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM fds_data_id WHERE sid = ? AND dailyType = ? AND time >= ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, i);
            sQLiteStatementPrepare.mo50bindLong(3, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                int i2 = columnIndexOrThrow2;
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                fDSDataIdEntity.setExtra(text);
                arrayList.add(fDSDataIdEntity);
                columnIndexOrThrow2 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List m(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM fds_data_id WHERE isUpload = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                fDSDataIdEntity.setExtra(text);
                arrayList.add(fDSDataIdEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List n(String str, int i, long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM fds_data_id WHERE sid = ? AND sportType = ? AND time = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            sQLiteStatementPrepare.mo50bindLong(2, i);
            sQLiteStatementPrepare.mo50bindLong(3, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                int i2 = columnIndexOrThrow2;
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                fDSDataIdEntity.setExtra(text);
                arrayList.add(fDSDataIdEntity);
                columnIndexOrThrow2 = i2;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List o(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM fds_data_id WHERE sportType > 0 AND fileType = 1 limit ?");
        try {
            sQLiteStatementPrepare.mo50bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                fDSDataIdEntity.setExtra(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                arrayList.add(fDSDataIdEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List p(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM fds_data_id WHERE sid = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo51bindNull(1);
            } else {
                sQLiteStatementPrepare.mo52bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                int i = columnIndexOrThrow2;
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                fDSDataIdEntity.setExtra(text);
                arrayList.add(fDSDataIdEntity);
                columnIndexOrThrow2 = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ List r(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from fds_data_id");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idBytes");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailyType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DailyRecordKey.sportType);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fileType");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpload");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = null;
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getBlob(columnIndexOrThrow2));
                fDSDataIdEntity.setTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                fDSDataIdEntity.setDailyType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                fDSDataIdEntity.setSportType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                fDSDataIdEntity.setFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                fDSDataIdEntity.setUpload(((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                }
                fDSDataIdEntity.setExtra(text);
                arrayList.add(fDSDataIdEntity);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public void delete(final FDSDataIdEntity... fDSDataIdEntityArr) {
        fDSDataIdEntityArr.getClass();
        DBUtil.performBlocking(this.f41423a, false, true, new Function1() { // from class: tl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f34811a.k(fDSDataIdEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> getDailyFDSIds(final String str, final int i, final long j) {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: rl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.l(str, i, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> getNotUploadIds() {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: xl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.m((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> getSportFDSIds(final String str, final int i, final long j) {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: wl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.n(str, i, j, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> getSportReportIds(final int i) {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: ql8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.o(i, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> getTheDeviceAllIds(final String str) {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: vl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.p(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public void insert(final FDSDataIdEntity... fDSDataIdEntityArr) {
        fDSDataIdEntityArr.getClass();
        DBUtil.performBlocking(this.f41423a, false, true, new Function1() { // from class: ul8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f35901a.q(fDSDataIdEntityArr, (SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object k(FDSDataIdEntity[] fDSDataIdEntityArr, SQLiteConnection sQLiteConnection) {
        this.c.handleMultiple(sQLiteConnection, fDSDataIdEntityArr);
        return null;
    }

    public final /* synthetic */ Object q(FDSDataIdEntity[] fDSDataIdEntityArr, SQLiteConnection sQLiteConnection) {
        this.f41424b.insert(sQLiteConnection, fDSDataIdEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public List<FDSDataIdEntity> queryAllIds() {
        return (List) DBUtil.performBlocking(this.f41423a, true, false, new Function1() { // from class: yl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return zl8.r((SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Object s(FDSDataIdEntity[] fDSDataIdEntityArr, SQLiteConnection sQLiteConnection) {
        this.d.handleMultiple(sQLiteConnection, fDSDataIdEntityArr);
        return null;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao
    public void update(final FDSDataIdEntity... fDSDataIdEntityArr) {
        fDSDataIdEntityArr.getClass();
        DBUtil.performBlocking(this.f41423a, false, true, new Function1() { // from class: sl8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f33755a.s(fDSDataIdEntityArr, (SQLiteConnection) obj);
            }
        });
    }
}
