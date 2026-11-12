package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.PromotePlaceConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.Promotion;
import com.huami.training.db.po.Training;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.PromotePlace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class PromotionDao_Impl implements PromotionDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Promotion> b;
    private final SharedSQLiteStatement d;
    private final PromotePlaceConverter c = new PromotePlaceConverter();
    private final GenderPairConverter e = new GenderPairConverter();
    private final DifficultyConverter f = new DifficultyConverter();
    private final TrainingTypeConverter g = new TrainingTypeConverter();

    public class a extends EntityInsertionAdapter<Promotion> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Promotion promotion) {
            Integer numPromotePlaceToInt = PromotionDao_Impl.this.c.promotePlaceToInt(promotion.getPromotePlace());
            if (numPromotePlaceToInt == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, numPromotePlaceToInt.intValue());
            }
            supportSQLiteStatement.bindLong(2, promotion.getTrainingId());
            supportSQLiteStatement.bindLong(3, promotion.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Promotion` (`promotePlace`,`trainingId`,`id`) VALUES (?,?,nullif(?, 0))";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Promotion WHERE promotePlace = ?";
        }
    }

    public class c implements Callable<List<Training>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Training> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(PromotionDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "listImage");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "difficulty");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "consumption");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "participants");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "label");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    GenderPair<String> genderPairStringToGenderStringPair = PromotionDao_Impl.this.e.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow2));
                    arrayList.add(new Training(j, PromotionDao_Impl.this.g.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8))), cursorQuery.getString(columnIndexOrThrow3), genderPairStringToGenderStringPair, PromotionDao_Impl.this.f.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4))), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5)), cursorQuery.getString(columnIndexOrThrow9), null));
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

    public PromotionDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.d = new b(roomDatabase);
    }

    @Override // com.huami.training.db.dao.PromotionDao
    public void deletePromotionalTrainings(PromotePlace promotePlace) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        Integer numPromotePlaceToInt = this.c.promotePlaceToInt(promotePlace);
        if (numPromotePlaceToInt == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, numPromotePlaceToInt.intValue());
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

    @Override // com.huami.training.db.dao.PromotionDao
    public void insertPromotions(List<Promotion> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.PromotionDao
    public LiveData<List<Training>> queryLatestThreePromotionalTrainings(PromotePlace promotePlace) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT Training.id, listImage, name, difficulty, contentCount, consumption, participants, type, label FROM Training INNER JOIN Promotion WHERE promotePlace = ? AND Training.id = trainingId ORDER BY Promotion.id LIMIT 3", 1);
        Integer numPromotePlaceToInt = this.c.promotePlaceToInt(promotePlace);
        if (numPromotePlaceToInt == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, numPromotePlaceToInt.intValue());
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Training", "Promotion"}, false, new c(roomSQLiteQueryAcquire));
    }
}
