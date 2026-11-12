package com.huami.stress.domain.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes14.dex */
public final class AllDayStressDao_Impl implements AllDayStressDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<AllDayStressDaoBean> b;

    public class a extends EntityInsertionAdapter<AllDayStressDaoBean> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, AllDayStressDaoBean allDayStressDaoBean) {
            supportSQLiteStatement.bindLong(1, allDayStressDaoBean.getTimestamp());
            if (allDayStressDaoBean.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, allDayStressDaoBean.getUserId());
            }
            supportSQLiteStatement.bindLong(3, allDayStressDaoBean.getDeviceSource());
            supportSQLiteStatement.bindLong(4, allDayStressDaoBean.getDeviceType());
            if (allDayStressDaoBean.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, allDayStressDaoBean.getDeviceId());
            }
            if (allDayStressDaoBean.getDeviceMac() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, allDayStressDaoBean.getDeviceMac());
            }
            if (allDayStressDaoBean.getDeviceSn() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, allDayStressDaoBean.getDeviceSn());
            }
            supportSQLiteStatement.bindLong(8, allDayStressDaoBean.getMaxStress());
            supportSQLiteStatement.bindLong(9, allDayStressDaoBean.getMinStress());
            supportSQLiteStatement.bindLong(10, allDayStressDaoBean.getAvgStress());
            supportSQLiteStatement.bindLong(11, allDayStressDaoBean.getRelaxProportion());
            supportSQLiteStatement.bindLong(12, allDayStressDaoBean.getNormalProportion());
            supportSQLiteStatement.bindLong(13, allDayStressDaoBean.getMediumProportion());
            supportSQLiteStatement.bindLong(14, allDayStressDaoBean.getHighProportion());
            if (allDayStressDaoBean.getData() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, allDayStressDaoBean.getData());
            }
            supportSQLiteStatement.bindLong(16, allDayStressDaoBean.getSyncStatus() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `AllDayStress` (`timestamp`,`userId`,`deviceSource`,`deviceType`,`deviceId`,`deviceMac`,`deviceSn`,`maxStress`,`minStress`,`avgStress`,`relaxProportion`,`normalProportion`,`mediumProportion`,`highProportion`,`data`,`syncStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b implements Callable<Unit> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            AllDayStressDao_Impl.this.a.beginTransaction();
            try {
                AllDayStressDao_Impl.this.b.insert((Iterable) this.a);
                AllDayStressDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                AllDayStressDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class c implements Callable<Unit> {
        public final /* synthetic */ AllDayStressDaoBean a;

        public c(AllDayStressDaoBean allDayStressDaoBean) {
            this.a = allDayStressDaoBean;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            AllDayStressDao_Impl.this.a.beginTransaction();
            try {
                AllDayStressDao_Impl.this.b.insert(this.a);
                AllDayStressDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                AllDayStressDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class d implements Callable<AllDayStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllDayStressDaoBean call() throws Exception {
            AllDayStressDaoBean allDayStressDaoBean;
            d dVar = this;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, dVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                    if (cursorQuery.moveToFirst()) {
                        allDayStressDaoBean = new AllDayStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0);
                    } else {
                        allDayStressDaoBean = null;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return allDayStressDaoBean;
                } catch (Throwable th) {
                    th = th;
                    dVar = this;
                    cursorQuery.close();
                    dVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class e implements Callable<AllDayStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllDayStressDaoBean call() throws Exception {
            AllDayStressDaoBean allDayStressDaoBean;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    allDayStressDaoBean = new AllDayStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0);
                } else {
                    allDayStressDaoBean = null;
                }
                return allDayStressDaoBean;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class f implements Callable<AllDayStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllDayStressDaoBean call() throws Exception {
            AllDayStressDaoBean allDayStressDaoBean;
            f fVar = this;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, fVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                    if (cursorQuery.moveToFirst()) {
                        allDayStressDaoBean = new AllDayStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0);
                    } else {
                        allDayStressDaoBean = null;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return allDayStressDaoBean;
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

    public class g implements Callable<AllDayStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AllDayStressDaoBean call() throws Exception {
            AllDayStressDaoBean allDayStressDaoBean;
            g gVar = this;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, gVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                    if (cursorQuery.moveToFirst()) {
                        allDayStressDaoBean = new AllDayStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0);
                    } else {
                        allDayStressDaoBean = null;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return allDayStressDaoBean;
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

    public class h implements Callable<List<AllDayStressDaoBean>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<AllDayStressDaoBean> call() throws Exception {
            h hVar;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        int i2 = i;
                        int i3 = columnIndexOrThrow;
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        arrayList.add(new AllDayStressDaoBean(j, cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(i2), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0));
                        columnIndexOrThrow = i3;
                        i = i2;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    hVar = this;
                    cursorQuery.close();
                    hVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                hVar = this;
            }
        }
    }

    public class i implements Callable<List<AllDayStressDaoBean>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public i(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<AllDayStressDaoBean> call() throws Exception {
            i iVar;
            Cursor cursorQuery = DBUtil.query(AllDayStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxStress");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minStress");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "avgStress");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "relaxProportion");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "normalProportion");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mediumProportion");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "highProportion");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "data");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        int i2 = i;
                        int i3 = columnIndexOrThrow;
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        arrayList.add(new AllDayStressDaoBean(j, cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(i2), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0));
                        columnIndexOrThrow = i3;
                        i = i2;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    iVar = this;
                    cursorQuery.close();
                    iVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                iVar = this;
            }
        }
    }

    public AllDayStressDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object getAllDayStressByBetweenTimestamp(long j, long j2, Continuation<? super List<AllDayStressDaoBean>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayStress where timestamp >=? and timestamp<=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, j2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new h(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object getAllDayStressByTimestamp(long j, Continuation<? super AllDayStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayStress where timestamp = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new g(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object getLatestAllDayStress(Continuation<? super AllDayStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayStress order by timestamp desc limit 1", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new d(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Flow<AllDayStressDaoBean> getLatestAllDayStressFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"AllDayStress"}, new e(RoomSQLiteQuery.acquire("select * from AllDayStress order by timestamp desc limit 1", 0)));
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object getLatestSyncedAllDayStress(Continuation<? super AllDayStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayStress where syncStatus = 1 order by timestamp desc limit 1", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new f(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object getUnSyncAllDayStressList(Continuation<? super List<AllDayStressDaoBean>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from AllDayStress where syncStatus = 0", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new i(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object insertOrUpdateAllDayStress(AllDayStressDaoBean allDayStressDaoBean, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new c(allDayStressDaoBean), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.AllDayStressDao
    public Object insertOrUpdateAllDayStressList(List<AllDayStressDaoBean> list, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new b(list), continuation);
    }
}
