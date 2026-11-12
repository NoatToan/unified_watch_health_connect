package com.huami.pai.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.pai.db.DayDateConverter;
import com.huami.pai.db.po.Pai;
import com.huami.pai.koin.PaiScopeNames;
import com.xiaomi.hm.health.Constant;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiDao_Impl implements PaiDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Pai> b;
    private final DayDateConverter c = new DayDateConverter();

    public class a extends EntityInsertionAdapter<Pai> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, Pai value) {
            String strFromTimestamp = PaiDao_Impl.this.c.fromTimestamp(value.getDate());
            if (strFromTimestamp == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, strFromTimestamp);
            }
            stmt.bindLong(2, value.getLp());
            stmt.bindLong(3, value.getMp());
            stmt.bindLong(4, value.getHp());
            stmt.bindLong(5, value.getLm());
            stmt.bindLong(6, value.getMm());
            stmt.bindLong(7, value.getHm());
            stmt.bindLong(8, value.getDp());
            stmt.bindLong(9, value.getTp());
            if (value.getAs() == null) {
                stmt.bindNull(10);
            } else {
                stmt.bindString(10, value.getAs());
            }
            if (value.getNas() == null) {
                stmt.bindNull(11);
            } else {
                stmt.bindString(11, value.getNas());
            }
            stmt.bindLong(12, value.getMaxHr());
            stmt.bindLong(13, value.getRhr());
            stmt.bindLong(14, value.getGender());
            stmt.bindLong(15, value.getHrLowLimit());
            stmt.bindLong(16, value.getHrMediumLimit());
            stmt.bindLong(17, value.getHrHighLimit());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Pai` (`date`,`lp`,`mp`,`hp`,`lm`,`mm`,`hm`,`dp`,`tp`,`as`,`nas`,`maxHr`,`rhr`,`gender`,`hrLowLimit`,`hrMediumLimit`,`hrHighLimit`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b implements Callable<Pai> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pai call() throws Exception {
            Pai pai;
            Cursor cursorQuery = DBUtil.query(PaiDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "date");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_PAI);
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_PAI);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_PAI);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_LOW_ZONE_MINUTES);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES);
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_HIGH_ZONE_MINUTES);
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_DAILY_PAI);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tp");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_ACTIVITY_SCORES);
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nas");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Constant.PAI_KEY_MAX_HR);
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rhr");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gender");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrLowLimit");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrMediumLimit");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrHighLimit");
                if (cursorQuery.moveToFirst()) {
                    pai = new Pai(PaiDao_Impl.this.c.dateToTimestamp(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow)), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16), cursorQuery.getInt(columnIndexOrThrow17));
                } else {
                    pai = null;
                }
                return pai;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public PaiDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.pai.db.dao.PaiDao
    public void insertPai(final Pai pai) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(pai);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.pai.db.dao.PaiDao
    public LiveData<Pai> queryPai(final Date day) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Pai WHERE date == ?", 1);
        String strFromTimestamp = this.c.fromTimestamp(day);
        if (strFromTimestamp == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, strFromTimestamp);
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{PaiScopeNames.PAI}, false, new b(roomSQLiteQueryAcquire));
    }
}
