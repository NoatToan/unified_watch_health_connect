package defpackage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nnr implements WorkTagDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f28099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<WorkTag> f28100b;
    public final SharedSQLiteStatement c;

    public class a extends EntityInsertionAdapter<WorkTag> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkTag workTag) {
            supportSQLiteStatement.bindString(1, workTag.getTag());
            supportSQLiteStatement.bindString(2, workTag.getWorkSpecId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public nnr(RoomDatabase roomDatabase) {
        this.f28099a = roomDatabase;
        this.f28100b = new a(roomDatabase);
        this.c = new b(roomDatabase);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(String str) {
        this.f28099a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        supportSQLiteStatementAcquire.bindString(1, str);
        try {
            this.f28099a.beginTransaction();
            try {
                supportSQLiteStatementAcquire.executeUpdateDelete();
                this.f28099a.setTransactionSuccessful();
                this.f28099a.endTransaction();
                this.c.release(supportSQLiteStatementAcquire);
            } catch (Throwable th) {
                this.f28099a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.c.release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getTagsForWorkSpecId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f28099a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f28099a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getWorkSpecIdsWithTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f28099a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f28099a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.WorkTagDao
    public void insert(WorkTag workTag) {
        this.f28099a.assertNotSuspendingTransaction();
        this.f28099a.beginTransaction();
        try {
            this.f28100b.insert(workTag);
            this.f28099a.setTransactionSuccessful();
        } finally {
            this.f28099a.endTransaction();
        }
    }
}
