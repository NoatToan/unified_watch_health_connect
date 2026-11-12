package defpackage;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.braintreepayments.api.AnalyticsEventBlobDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ry implements AnalyticsEventBlobDao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter<sa> f47829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EntityInsertionAdapter<sa> f47830c;
    private final RoomDatabase d;

    public ry(RoomDatabase roomDatabase) {
        this.d = roomDatabase;
        this.f47830c = new EntityInsertionAdapter<sa>(roomDatabase) { // from class: ry.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR ABORT INTO `analytics_event_blob` (`json_string`,`_id`) VALUES (?,nullif(?, 0))";
            }

            @Override // androidx.room.EntityInsertionAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, sa saVar) {
                if (saVar.getF47890b() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, saVar.getF47890b());
                }
                supportSQLiteStatement.bindLong(2, saVar.getF47891c());
            }
        };
        this.f47829b = new EntityDeletionOrUpdateAdapter<sa>(roomDatabase) { // from class: ry.5
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `analytics_event_blob` WHERE `_id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, sa saVar) {
                supportSQLiteStatement.bindLong(1, saVar.getF47891c());
            }
        };
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public void insertEventBlob(sa saVar) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.f47830c.insert(saVar);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public void deleteEventBlobs(List<sa> list) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.f47829b.handleMultiple(list);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // com.braintreepayments.api.AnalyticsEventBlobDao
    public List<sa> getAllEventBlobs() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM analytics_event_blob", 0);
        this.d.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.d, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "json_string");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "_id");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new sa(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static List<Class<?>> a() {
        return Collections.EMPTY_LIST;
    }
}
