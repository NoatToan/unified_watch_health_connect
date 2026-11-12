package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.PrimitiveListConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.FilterTraining;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class FilterDao_Impl implements FilterDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<FilterTraining> b;
    private final EntityInsertionAdapter<FilterMode> c;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final PrimitiveListConverter d = new PrimitiveListConverter();
    private final GenderPairConverter g = new GenderPairConverter();
    private final DifficultyConverter h = new DifficultyConverter();
    private final TrainingTypeConverter i = new TrainingTypeConverter();

    public class a extends EntityInsertionAdapter<FilterTraining> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, FilterTraining filterTraining) {
            if (filterTraining.getFilterMode() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, filterTraining.getFilterMode());
            }
            if (filterTraining.getFilterOrder() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, filterTraining.getFilterOrder());
            }
            supportSQLiteStatement.bindLong(3, filterTraining.getTrainingId());
            supportSQLiteStatement.bindLong(4, filterTraining.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `FilterTraining` (`filterMode`,`filterOrder`,`trainingId`,`id`) VALUES (?,?,?,nullif(?, 0))";
        }
    }

    public class b extends EntityInsertionAdapter<FilterMode> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, FilterMode filterMode) {
            if (filterMode.getText() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, filterMode.getText());
            }
            if (filterMode.getJumpType() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, filterMode.getJumpType());
            }
            if (filterMode.getDefaultOrder() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, filterMode.getDefaultOrder());
            }
            String strStringListToString = FilterDao_Impl.this.d.stringListToString(filterMode.getSupportOrders());
            if (strStringListToString == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strStringListToString);
            }
            supportSQLiteStatement.bindLong(5, filterMode.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `FilterMode` (`text`,`jumpType`,`defaultOrder`,`supportOrders`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM FilterTraining WHERE filterMode = ? AND filterOrder = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM FilterMode";
        }
    }

    public class e extends DataSource.Factory<Integer, Training> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<Training> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<Training> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "listImage");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "difficulty");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "contentCount");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "consumption");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "participants");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor, "label");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(columnIndexOrThrow);
                    GenderPair<String> genderPairStringToGenderStringPair = FilterDao_Impl.this.g.stringToGenderStringPair(cursor.getString(columnIndexOrThrow2));
                    String string = cursor.getString(columnIndexOrThrow3);
                    Difficulty difficultyIntToDifficulty = FilterDao_Impl.this.h.intToDifficulty(Integer.valueOf(cursor.getInt(columnIndexOrThrow4)));
                    Integer numValueOf = null;
                    Integer numValueOf2 = cursor.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow5));
                    Integer numValueOf3 = cursor.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow6));
                    Integer numValueOf4 = cursor.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow7));
                    if (!cursor.isNull(columnIndexOrThrow8)) {
                        numValueOf = Integer.valueOf(cursor.getInt(columnIndexOrThrow8));
                    }
                    arrayList.add(new Training(j, FilterDao_Impl.this.i.intToTrainingType(numValueOf), string, genderPairStringToGenderStringPair, difficultyIntToDifficulty, numValueOf3, numValueOf4, numValueOf2, cursor.getString(columnIndexOrThrow9), null));
                }
                return arrayList;
            }
        }

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, Training> create() {
            return new a(FilterDao_Impl.this.a, this.a, false, "Training", "FilterTraining");
        }
    }

    public class f implements Callable<List<FilterMode>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<FilterMode> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(FilterDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "text");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "jumpType");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "defaultOrder");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "supportOrders");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    FilterMode filterMode = new FilterMode(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), FilterDao_Impl.this.d.stringToStringList(cursorQuery.getString(columnIndexOrThrow4)));
                    filterMode.setId(cursorQuery.getInt(columnIndexOrThrow5));
                    arrayList.add(filterMode);
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public FilterDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.e = new c(roomDatabase);
        this.f = new d(roomDatabase);
    }

    @Override // com.huami.training.db.dao.FilterDao
    public void clearFilterModes() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.f.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.FilterDao
    public void deleteByFilterType(String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str2);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.FilterDao
    public void insertFilterMode(List<FilterMode> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.FilterDao
    public void insertFilterTrainings(List<FilterTraining> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.FilterDao
    public LiveData<List<FilterMode>> queryFilterMode() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"FilterMode"}, false, new f(RoomSQLiteQuery.acquire("SELECT * FROM FilterMode", 0)));
    }

    @Override // com.huami.training.db.dao.FilterDao
    public DataSource.Factory<Integer, Training> queryFilterTrainings(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT Training.id, listImage, name, difficulty, contentCount, consumption, participants, type, label FROM Training INNER JOIN FilterTraining WHERE filterMode = ? AND filterOrder = ? AND Training.id = trainingId ORDER BY FilterTraining.id", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        return new e(roomSQLiteQueryAcquire);
    }
}
