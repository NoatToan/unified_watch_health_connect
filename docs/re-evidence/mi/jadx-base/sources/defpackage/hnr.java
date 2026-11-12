package defpackage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hnr implements WorkProgressDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f20269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<WorkProgress> f20270b;
    public final SharedSQLiteStatement c;
    public final SharedSQLiteStatement d;

    public class a extends EntityInsertionAdapter<WorkProgress> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkProgress workProgress) {
            supportSQLiteStatement.bindString(1, workProgress.getWorkSpecId());
            supportSQLiteStatement.bindBlob(2, Data.toByteArrayInternalV1(workProgress.getProgress()));
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public hnr(RoomDatabase roomDatabase) {
        this.f20269a = roomDatabase;
        this.f20270b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(String str) {
        this.f20269a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f20269a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f20269a.setTransactionSuccessful();
                this.f20269a.endTransaction();
                this.c.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f20269a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.c.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        this.f20269a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        try {
            this.f20269a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f20269a.setTransactionSuccessful();
                this.f20269a.endTransaction();
                this.d.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f20269a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.d.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f20269a.assertNotSuspendingTransaction();
        Data dataFromByteArray = null;
        Cursor cursorQuery = DBUtil.query(this.f20269a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                byte[] blob = cursorQuery.isNull(0) ? null : cursorQuery.getBlob(0);
                if (blob != null) {
                    dataFromByteArray = Data.fromByteArray(blob);
                }
            }
            return dataFromByteArray;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(WorkProgress workProgress) {
        this.f20269a.assertNotSuspendingTransaction();
        this.f20269a.beginTransaction();
        try {
            this.f20270b.insert(workProgress);
            this.f20269a.setTransactionSuccessful();
        } finally {
            this.f20269a.endTransaction();
        }
    }
}
