package defpackage;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gz5 implements DependencyDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f19484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<Dependency> f19485b;

    public class a extends EntityInsertionAdapter<Dependency> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Dependency dependency) {
            supportSQLiteStatement.bindString(1, dependency.getWorkSpecId());
            supportSQLiteStatement.bindString(2, dependency.getPrerequisiteId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public gz5(RoomDatabase roomDatabase) {
        this.f19484a = roomDatabase;
        this.f19485b = new a(roomDatabase);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getDependentWorkIds(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f19484a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f19484a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getPrerequisites(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f19484a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.f19484a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f19484a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorQuery = DBUtil.query(this.f19484a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z = cursorQuery.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f19484a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorQuery = DBUtil.query(this.f19484a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z = cursorQuery.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(Dependency dependency) {
        this.f19484a.assertNotSuspendingTransaction();
        this.f19484a.beginTransaction();
        try {
            this.f19485b.insert(dependency);
            this.f19484a.setTransactionSuccessful();
        } finally {
            this.f19484a.endTransaction();
        }
    }
}
