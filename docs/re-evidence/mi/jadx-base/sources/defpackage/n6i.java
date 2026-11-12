package defpackage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class n6i implements PreferenceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f27597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntityInsertionAdapter<Preference> f27598b;

    public class a extends EntityInsertionAdapter<Preference> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
            supportSQLiteStatement.bindString(1, preference.getKey());
            if (preference.getValue() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, preference.getValue().longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public class b implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f27600a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f27600a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(n6i.this.f27597a, this.f27600a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.f27600a.release();
        }
    }

    public n6i(RoomDatabase roomDatabase) {
        this.f27597a = roomDatabase;
        this.f27598b = new a(roomDatabase);
    }

    public static List<Class<?>> b() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        this.f27597a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.f27597a, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public LiveData<Long> getObservableLongValue(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        roomSQLiteQueryAcquire.bindString(1, str);
        return this.f27597a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, (Callable) new b(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(Preference preference) {
        this.f27597a.assertNotSuspendingTransaction();
        this.f27597a.beginTransaction();
        try {
            this.f27598b.insert(preference);
            this.f27597a.setTransactionSuccessful();
        } finally {
            this.f27597a.endTransaction();
        }
    }
}
