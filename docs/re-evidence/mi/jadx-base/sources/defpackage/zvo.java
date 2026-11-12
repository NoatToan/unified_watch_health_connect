package defpackage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zvo implements SystemIdInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f41723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<SystemIdInfo> f41724b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<SystemIdInfo> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SystemIdInfo systemIdInfo) {
            supportSQLiteStatement.bindString(1, systemIdInfo.workSpecId);
            supportSQLiteStatement.bindLong(2, systemIdInfo.getGeneration());
            supportSQLiteStatement.bindLong(3, systemIdInfo.systemId);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public zvo(RoomDatabase roomDatabase) {
        this.f41723a = roomDatabase;
        this.f41724b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String str, int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        roomSQLiteQueryAcquire.bindString(1, str);
        roomSQLiteQueryAcquire.bindLong(2, i);
        this.f41723a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f41723a, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new SystemIdInfo(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "work_spec_id")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "generation")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "system_id"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f41723a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f41723a, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
        this.f41723a.assertNotSuspendingTransaction();
        this.f41723a.beginTransaction();
        try {
            this.f41724b.insert(systemIdInfo);
            this.f41723a.setTransactionSuccessful();
        } finally {
            this.f41723a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str, int i) {
        this.f41723a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        supportSQLiteStatementAcquire.bindLong(2, i);
        try {
            this.f41723a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f41723a.setTransactionSuccessful();
                this.f41723a.endTransaction();
                this.c.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f41723a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.c.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        this.f41723a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f41723a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f41723a.setTransactionSuccessful();
                this.f41723a.endTransaction();
                this.d.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f41723a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.d.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }
}
