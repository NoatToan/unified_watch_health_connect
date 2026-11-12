package com.huami.bloodpressure_core.dc.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class IBloodPressureDao_Impl implements IBloodPressureDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<BloodPressureDbVo> b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public class a implements Callable<BloodPressureDbVo> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public a(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BloodPressureDbVo call() throws Exception {
            BloodPressureDbVo bloodPressureDbVo = null;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                if (cursorQuery.moveToFirst()) {
                    bloodPressureDbVo = new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                }
                return bloodPressureDbVo;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class b implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            b bVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, bVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    cursorQuery.close();
                    bVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class c implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            c cVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, cVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    cVar = this;
                    cursorQuery.close();
                    cVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class d implements Callable<Integer> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class e implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            e eVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, eVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    eVar = this;
                    cursorQuery.close();
                    eVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class f implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            f fVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, fVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    fVar = this;
                    cursorQuery.close();
                    fVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class g implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            g gVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, gVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    gVar = this;
                    cursorQuery.close();
                    gVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class h implements Callable<Long> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class i extends EntityInsertionAdapter<BloodPressureDbVo> {
        public i(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, BloodPressureDbVo bloodPressureDbVo) {
            supportSQLiteStatement.bindLong(1, bloodPressureDbVo.getMeasureTime());
            supportSQLiteStatement.bindLong(2, bloodPressureDbVo.getSbp());
            supportSQLiteStatement.bindLong(3, bloodPressureDbVo.getDbp());
            if (bloodPressureDbVo.getBpm() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, bloodPressureDbVo.getBpm().intValue());
            }
            if (bloodPressureDbVo.getTimeZone() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, bloodPressureDbVo.getTimeZone().intValue());
            }
            if (bloodPressureDbVo.getUserId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, bloodPressureDbVo.getUserId());
            }
            if (bloodPressureDbVo.getEventType() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, bloodPressureDbVo.getEventType());
            }
            if (bloodPressureDbVo.getSubType() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, bloodPressureDbVo.getSubType());
            }
            supportSQLiteStatement.bindLong(9, bloodPressureDbVo.isUpload() ? 1L : 0L);
            if (bloodPressureDbVo.getDateStr() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, bloodPressureDbVo.getDateStr());
            }
            supportSQLiteStatement.bindLong(11, bloodPressureDbVo.getDataSource());
            if (bloodPressureDbVo.getExtra1() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, bloodPressureDbVo.getExtra1());
            }
            if (bloodPressureDbVo.getExtra2() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, bloodPressureDbVo.getExtra2());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `BloodPressureDbVo` (`measureTime`,`sbp`,`dbp`,`bpm`,`timeZone`,`userId`,`eventType`,`subType`,`isUpload`,`dateStr`,`dataSource`,`extra1`,`extra2`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class j extends SharedSQLiteStatement {
        public j(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM BloodPressureDbVo";
        }
    }

    public class k extends SharedSQLiteStatement {
        public k(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM BloodPressureDbVo WHERE userId = ? AND measureTime = ?";
        }
    }

    public class l implements Callable<Unit> {
        public final /* synthetic */ List a;

        public l(final List val$list) {
            this.a = val$list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            IBloodPressureDao_Impl.this.a.beginTransaction();
            try {
                IBloodPressureDao_Impl.this.b.insert((Iterable) this.a);
                IBloodPressureDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                IBloodPressureDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class m implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public m(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class n implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public n(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class o implements Callable<Long> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public o(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class p implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public p(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class q implements Callable<List<BloodPressureDbVo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public q(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BloodPressureDbVo> call() throws Exception {
            q qVar = this;
            Cursor cursorQuery = DBUtil.query(IBloodPressureDao_Impl.this.a, qVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, BloodPressureConst.ParamKey.MEASURETIME);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sbp");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dbp");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bpm");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeZone");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventType");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subType");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isUpload");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateStr");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.dataSource);
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra1");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extra2");
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new BloodPressureDbVo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    qVar = this;
                    cursorQuery.close();
                    qVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public IBloodPressureDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new i(__db);
        this.c = new j(__db);
        this.d = new k(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public void clean() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public void delDataByUserId(final String userId, final long timeStamp) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (userId == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, userId);
        }
        supportSQLiteStatementAcquire.bindLong(2, timeStamp);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getAllData(final String userId, final int dataSource, final Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND sbp >= dbp AND dataSource = ?", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, dataSource);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new g(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getAllDataByUserId(final String userId, final Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND sbp >= dbp", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new c(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getBetweenDataByDateStr(final String userId, final String fromDate, final String endDate, final Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND sbp >= dbp AND dateStr BETWEEN ? AND ?", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (fromDate == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, fromDate);
        }
        if (endDate == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, endDate);
        }
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new e(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getBetweenDataByUserId(final String userId, final long startTime, final long endTime, final Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND measureTime BETWEEN ? AND ? AND sbp >= dbp", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, startTime);
        roomSQLiteQueryAcquire.bindLong(3, endTime);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new q(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Flow<List<BloodPressureDbVo>> getBetweenDataFlowByUserId(final String userId, final long startTime, final long endTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND measureTime BETWEEN ? AND ? AND sbp >= dbp", 3);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, startTime);
        roomSQLiteQueryAcquire.bindLong(3, endTime);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"BloodPressureDbVo"}, new p(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getDataCountByDataSource(final String userId, final int dataSource, final Continuation<? super Integer> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(*) FROM BloodPressureDbVo WHERE userId = ? AND dataSource = ? AND sbp >= dbp", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, dataSource);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new d(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Flow<List<BloodPressureDbVo>> getDateFlowByUserId(final String userId, final String dateString) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId = ? AND dateStr=? AND sbp >= dbp", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        if (dateString == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, dateString);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"BloodPressureDbVo"}, new n(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getLocalData(String str, boolean z, int i2, int i3, Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId =? AND sbp >= dbp AND isUpload = ? AND dataSource = ? ORDER BY measureTime DESC LIMIT ?", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, z ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(3, i3);
        roomSQLiteQueryAcquire.bindLong(4, i2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new f(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getLocalDataByUserId(String str, boolean z, int i2, Continuation<? super List<BloodPressureDbVo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId =? AND sbp >= dbp AND isUpload = ? ORDER BY measureTime DESC LIMIT ?", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, z ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new b(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Flow<BloodPressureDbVo> getMaxDataByUserId(final String userId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo WHERE userId=? AND sbp >= dbp ORDER BY measureTime DESC LIMIT 1", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"BloodPressureDbVo"}, new a(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getMaxTimeByUserId(final String userId, final Continuation<? super Long> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT max(measureTime) FROM BloodPressureDbVo WHERE userId=? AND sbp >= dbp", 1);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new o(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Flow<List<BloodPressureDbVo>> getUserDataByUserId(String str, boolean z) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM BloodPressureDbVo  WHERE userId = ? AND sbp >= dbp ORDER BY CASE WHEN ? =1 THEN measureTime END DESC, CASE WHEN? = 0 THEN measureTime END ASC", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, z ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(3, z ? 1L : 0L);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"BloodPressureDbVo"}, new m(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object insertOrUpdate(final List<BloodPressureDbVo> list, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new l(list), continuation);
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public void setDataUploadedByUserId(String str, boolean z, List<Long> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE BloodPressureDbVo SET isUpload = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE measureTime in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(") AND userId = ");
        sbNewStringBuilder.append("?");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        supportSQLiteStatementCompileStatement.bindLong(1, z ? 1L : 0L);
        int i2 = 2;
        for (Long l2 : list) {
            if (l2 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindLong(i2, l2.longValue());
            }
            i2++;
        }
        int i3 = size + 2;
        if (str == null) {
            supportSQLiteStatementCompileStatement.bindNull(i3);
        } else {
            supportSQLiteStatementCompileStatement.bindString(i3, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.bloodpressure_core.dc.local.IBloodPressureDao
    public Object getDataCountByDataSource(String str, int i2, boolean z, Continuation<? super Long> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(*) FROM BloodPressureDbVo WHERE userId = ? AND isUpload = ? AND dataSource = ? AND sbp >= dbp", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, z ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new h(roomSQLiteQueryAcquire), continuation);
    }
}
