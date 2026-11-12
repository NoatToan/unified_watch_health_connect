package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.PrimitiveListConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.SearchResult;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.Training;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class SearchDao_Impl extends SearchDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<SearchResult> b;
    private final SharedSQLiteStatement d;
    private final PrimitiveListConverter c = new PrimitiveListConverter();
    private final TrainingTypeConverter e = new TrainingTypeConverter();
    private final GenderPairConverter f = new GenderPairConverter();
    private final DifficultyConverter g = new DifficultyConverter();

    public class a extends EntityInsertionAdapter<SearchResult> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, SearchResult searchResult) {
            if (searchResult.getQuery() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, searchResult.getQuery());
            }
            if (searchResult.getMode() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, searchResult.getMode());
            }
            String strLongListToString = SearchDao_Impl.this.c.longListToString(searchResult.getIds());
            if (strLongListToString == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, strLongListToString);
            }
            if (searchResult.getNext() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, searchResult.getNext().longValue());
            }
            supportSQLiteStatement.bindLong(5, searchResult.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SearchResult` (`query`,`mode`,`ids`,`next`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM SearchResult WHERE `query` = ? AND mode = ?";
        }
    }

    public class c implements Callable<List<Tag>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Tag> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SearchDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tagId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    Tag tag = new Tag(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2));
                    tag.setId(cursorQuery.getInt(columnIndexOrThrow3));
                    arrayList.add(tag);
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

    public class d implements Callable<SearchResult> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SearchResult call() throws Exception {
            SearchResult searchResult = null;
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(SearchDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "query");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mode");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ids");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    String string2 = cursorQuery.getString(columnIndexOrThrow2);
                    List<Long> listStringToLongList = SearchDao_Impl.this.c.stringToLongList(cursorQuery.getString(columnIndexOrThrow3));
                    if (!cursorQuery.isNull(columnIndexOrThrow4)) {
                        lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4));
                    }
                    SearchResult searchResult2 = new SearchResult(string, string2, listStringToLongList, lValueOf);
                    searchResult2.setId(cursorQuery.getInt(columnIndexOrThrow5));
                    searchResult = searchResult2;
                }
                return searchResult;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public class e implements Callable<List<Training>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Training> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SearchDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "listImage");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "difficulty");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "consumption");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "participants");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "label");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new Training(cursorQuery.getLong(columnIndexOrThrow), SearchDao_Impl.this.e.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2))), cursorQuery.getString(columnIndexOrThrow3), SearchDao_Impl.this.f.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow4)), SearchDao_Impl.this.g.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5))), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8)), cursorQuery.getString(columnIndexOrThrow9), SearchDao_Impl.this.f.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow10))));
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public SearchDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    @Override // com.huami.training.db.dao.SearchDao
    public void deleteSearchResult(String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
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
            this.d.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.SearchDao
    public void insertSearchResult(SearchResult searchResult) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(searchResult);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.SearchDao
    public LiveData<List<Training>> loadById(List<Long> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" FROM Training WHERE id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindLong(i, l.longValue());
            }
            i++;
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Training"}, false, new e(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.training.db.dao.SearchDao
    public LiveData<List<Tag>> loadHotSearchResults() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Tag"}, false, new c(RoomSQLiteQuery.acquire("SELECT * FROM Tag", 0)));
    }

    @Override // com.huami.training.db.dao.SearchDao
    public SearchResult querySearchResult(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SearchResult WHERE `query` = ? AND mode = ?", 2);
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
        this.a.assertNotSuspendingTransaction();
        SearchResult searchResult = null;
        Long lValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "query");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mode");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ids");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "next");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            if (cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(columnIndexOrThrow);
                String string2 = cursorQuery.getString(columnIndexOrThrow2);
                List<Long> listStringToLongList = this.c.stringToLongList(cursorQuery.getString(columnIndexOrThrow3));
                if (!cursorQuery.isNull(columnIndexOrThrow4)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4));
                }
                SearchResult searchResult2 = new SearchResult(string, string2, listStringToLongList, lValueOf);
                searchResult2.setId(cursorQuery.getInt(columnIndexOrThrow5));
                searchResult = searchResult2;
            }
            return searchResult;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.SearchDao
    public LiveData<SearchResult> search(String str, String str2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SearchResult WHERE `query` = ? AND mode = ?", 2);
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
        return this.a.getInvalidationTracker().createLiveData(new String[]{"SearchResult"}, false, new d(roomSQLiteQueryAcquire));
    }
}
