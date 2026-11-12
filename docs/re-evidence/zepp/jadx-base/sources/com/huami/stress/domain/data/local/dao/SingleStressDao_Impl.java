package com.huami.stress.domain.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes14.dex */
public final class SingleStressDao_Impl implements SingleStressDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<SingleStressDaoBean> b;
    private final SharedSQLiteStatement c;

    public class a implements Callable<List<SingleStressDaoBean>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public a(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SingleStressDaoBean> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class b implements Callable<List<SingleStressDaoBean>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SingleStressDaoBean> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class c extends EntityInsertionAdapter<SingleStressDaoBean> {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SingleStressDaoBean singleStressDaoBean) {
            supportSQLiteStatement.bindLong(1, singleStressDaoBean.getTimestamp());
            if (singleStressDaoBean.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, singleStressDaoBean.getUserId());
            }
            supportSQLiteStatement.bindLong(3, singleStressDaoBean.getValue());
            supportSQLiteStatement.bindLong(4, singleStressDaoBean.getDeviceSource());
            supportSQLiteStatement.bindLong(5, singleStressDaoBean.getDeviceType());
            if (singleStressDaoBean.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, singleStressDaoBean.getDeviceId());
            }
            if (singleStressDaoBean.getDeviceMac() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, singleStressDaoBean.getDeviceMac());
            }
            if (singleStressDaoBean.getDeviceSn() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, singleStressDaoBean.getDeviceSn());
            }
            supportSQLiteStatement.bindLong(9, singleStressDaoBean.getSyncStatus() ? 1L : 0L);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SingleStress` (`timestamp`,`userId`,`value`,`deviceSource`,`deviceType`,`deviceId`,`deviceMac`,`deviceSn`,`syncStatus`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from SingleStress where timestamp = ? ";
        }
    }

    public class e implements Callable<Unit> {
        public final /* synthetic */ List a;

        public e(List list) {
            this.a = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            SingleStressDao_Impl.this.a.beginTransaction();
            try {
                SingleStressDao_Impl.this.b.insert((Iterable) this.a);
                SingleStressDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                SingleStressDao_Impl.this.a.endTransaction();
            }
        }
    }

    public class f implements Callable<Unit> {
        public final /* synthetic */ long a;

        public f(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementAcquire = SingleStressDao_Impl.this.c.acquire();
            supportSQLiteStatementAcquire.bindLong(1, this.a);
            SingleStressDao_Impl.this.a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                SingleStressDao_Impl.this.a.setTransactionSuccessful();
                return Unit.INSTANCE;
            } finally {
                SingleStressDao_Impl.this.a.endTransaction();
                SingleStressDao_Impl.this.c.release(supportSQLiteStatementAcquire);
            }
        }
    }

    public class g implements Callable<List<SingleStressDaoBean>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SingleStressDaoBean> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class h implements Callable<SingleStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleStressDaoBean call() throws Exception {
            SingleStressDaoBean singleStressDaoBean = null;
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    singleStressDaoBean = new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0);
                }
                return singleStressDaoBean;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class i implements Callable<SingleStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public i(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleStressDaoBean call() throws Exception {
            SingleStressDaoBean singleStressDaoBean = null;
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    singleStressDaoBean = new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0);
                }
                return singleStressDaoBean;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class j implements Callable<SingleStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public j(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleStressDaoBean call() throws Exception {
            SingleStressDaoBean singleStressDaoBean = null;
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    singleStressDaoBean = new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0);
                }
                return singleStressDaoBean;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public class k implements Callable<SingleStressDaoBean> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public k(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleStressDaoBean call() throws Exception {
            SingleStressDaoBean singleStressDaoBean = null;
            Cursor cursorQuery = DBUtil.query(SingleStressDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "value");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceSource");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceType");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deviceId");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceMac);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, ParamKey.deviceSn);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "syncStatus");
                if (cursorQuery.moveToFirst()) {
                    singleStressDaoBean = new SingleStressDaoBean(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9) != 0);
                }
                return singleStressDaoBean;
            } finally {
                cursorQuery.close();
                this.a.release();
            }
        }
    }

    public SingleStressDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new c(roomDatabase);
        this.c = new d(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object deleteSingleStressByTime(long j2, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new f(j2), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object getLatestSyncedSingleStress(Continuation<? super SingleStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress where syncStatus = 1 order by timestamp desc limit 1", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new j(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object getSingleStressByBetweenTimestamp(long j2, long j3, Continuation<? super List<SingleStressDaoBean>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress where timestamp >=? and timestamp<=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        roomSQLiteQueryAcquire.bindLong(2, j3);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new a(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object getSingleStressByTimestamp(long j2, Continuation<? super SingleStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress where timestamp = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new k(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object getUnSyncSingleStressList(Continuation<? super List<SingleStressDaoBean>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress where syncStatus = 0", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new b(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object insertOrUpdateSingleStress(List<SingleStressDaoBean> list, Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.a, true, new e(list), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object loadLatestSingleStress(Continuation<? super SingleStressDaoBean> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress order by timestamp desc limit 1", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new h(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Flow<SingleStressDaoBean> loadLatestSingleStressFlow() {
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"SingleStress"}, new i(RoomSQLiteQuery.acquire("select * from SingleStress order by timestamp desc limit 1", 0)));
    }

    @Override // com.huami.stress.domain.data.local.dao.SingleStressDao
    public Object loadSingleStressList(Continuation<? super List<SingleStressDaoBean>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from SingleStress order by timestamp desc", 0);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new g(roomSQLiteQueryAcquire), continuation);
    }
}
