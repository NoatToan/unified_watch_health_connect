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
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.training.db.AdConverter;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.CardPlace;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.LookAround;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.TodayTraining;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.SubjectPlace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class EntranceDao_Impl implements EntranceDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<CardPlace> b;
    private final EntityInsertionAdapter<Subject> d;
    private final EntityInsertionAdapter<Tag> e;
    private final EntityInsertionAdapter<TodayTraining> f;
    private final EntityInsertionAdapter<LookAround> g;
    private final EntityInsertionAdapter<EntranceKing> h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;
    private final SharedSQLiteStatement k;
    private final SharedSQLiteStatement l;
    private final SharedSQLiteStatement m;
    private final AdConverter c = new AdConverter();
    private final GenderPairConverter n = new GenderPairConverter();
    private final DifficultyConverter o = new DifficultyConverter();
    private final TrainingTypeConverter p = new TrainingTypeConverter();

    public class a extends SharedSQLiteStatement {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM LookAround";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM EntranceKing";
        }
    }

    public class c implements Callable<List<Subject>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Subject> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EntranceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "title");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, MessengerShareContentUtility.SUBTITLE);
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "imageUrl");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "targetUrl");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "targetMode");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "displayMode");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    arrayList.add(new Subject(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getString(columnIndexOrThrow5), EntranceDao_Impl.this.c.intToTargetMode(cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6))), EntranceDao_Impl.this.c.intToDisplayMode(cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)))));
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

    public class d implements Callable<List<Tag>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public d(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Tag> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EntranceDao_Impl.this.a, this.a, false, null);
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

    public class e implements Callable<List<Training>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Training> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EntranceDao_Impl.this.a, this.a, false, null);
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
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    GenderPair<String> genderPairStringToGenderStringPair = EntranceDao_Impl.this.n.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow2));
                    String string = cursorQuery.getString(columnIndexOrThrow3);
                    Difficulty difficultyIntToDifficulty = EntranceDao_Impl.this.o.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)));
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5));
                    arrayList.add(new Training(j, EntranceDao_Impl.this.p.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8))), string, genderPairStringToGenderStringPair, difficultyIntToDifficulty, cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), numValueOf, cursorQuery.getString(columnIndexOrThrow9), EntranceDao_Impl.this.n.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow10))));
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

    public class f extends DataSource.Factory<Integer, Training> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<Training> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<Training> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "type");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "listImage");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "difficulty");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "consumption");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "participants");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "contentCount");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor, "label");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor, "squareImage");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    int i = columnIndexOrThrow;
                    arrayList.add(new Training(cursor.getLong(columnIndexOrThrow), EntranceDao_Impl.this.p.intToTrainingType(cursor.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow2))), cursor.getString(columnIndexOrThrow3), EntranceDao_Impl.this.n.stringToGenderStringPair(cursor.getString(columnIndexOrThrow4)), EntranceDao_Impl.this.o.intToDifficulty(Integer.valueOf(cursor.getInt(columnIndexOrThrow5))), cursor.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow6)), cursor.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow7)), cursor.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow8)), cursor.getString(columnIndexOrThrow9), EntranceDao_Impl.this.n.stringToGenderStringPair(cursor.getString(columnIndexOrThrow10))));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, Training> create() {
            return new a(EntranceDao_Impl.this.a, this.a, false, "Training", "LookAround");
        }
    }

    public class g implements Callable<List<EntranceKing>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EntranceKing> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(EntranceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "iconUrl");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "jumpType");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    EntranceKing entranceKing = new EntranceKing(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getString(columnIndexOrThrow3));
                    entranceKing.setId(cursorQuery.getInt(columnIndexOrThrow4));
                    arrayList.add(entranceKing);
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

    public class h extends EntityInsertionAdapter<CardPlace> {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, CardPlace cardPlace) {
            Integer numSubjectPlaceToInt = EntranceDao_Impl.this.c.subjectPlaceToInt(cardPlace.getSubjectPlace());
            if (numSubjectPlaceToInt == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, numSubjectPlaceToInt.intValue());
            }
            if (cardPlace.getSubjectId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, cardPlace.getSubjectId());
            }
            supportSQLiteStatement.bindLong(3, cardPlace.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `CardPlace` (`subjectPlace`,`subjectId`,`id`) VALUES (?,?,nullif(?, 0))";
        }
    }

    public class i extends EntityInsertionAdapter<Subject> {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Subject subject) {
            if (subject.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, subject.getId());
            }
            if (subject.getTitle() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, subject.getTitle());
            }
            if (subject.getSubtitle() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, subject.getSubtitle());
            }
            if (subject.getImageUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, subject.getImageUrl());
            }
            if (subject.getTargetUrl() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, subject.getTargetUrl());
            }
            Integer numTargetModeToInt = EntranceDao_Impl.this.c.targetModeToInt(subject.getTargetMode());
            if (numTargetModeToInt == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, numTargetModeToInt.intValue());
            }
            Integer numDisplayModeToInt = EntranceDao_Impl.this.c.displayModeToInt(subject.getDisplayMode());
            if (numDisplayModeToInt == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, numDisplayModeToInt.intValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Subject` (`id`,`title`,`subtitle`,`imageUrl`,`targetUrl`,`targetMode`,`displayMode`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public class j extends EntityInsertionAdapter<Tag> {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Tag tag) {
            supportSQLiteStatement.bindLong(1, tag.getTagId());
            if (tag.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, tag.getName());
            }
            supportSQLiteStatement.bindLong(3, tag.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Tag` (`tagId`,`name`,`id`) VALUES (?,?,nullif(?, 0))";
        }
    }

    public class k extends EntityInsertionAdapter<TodayTraining> {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, TodayTraining todayTraining) {
            supportSQLiteStatement.bindLong(1, todayTraining.getTrainingId());
            supportSQLiteStatement.bindLong(2, todayTraining.getTagId());
            supportSQLiteStatement.bindLong(3, todayTraining.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `TodayTraining` (`trainingId`,`tagId`,`id`) VALUES (?,?,nullif(?, 0))";
        }
    }

    public class l extends EntityInsertionAdapter<LookAround> {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LookAround lookAround) {
            supportSQLiteStatement.bindLong(1, lookAround.getTrainingId());
            supportSQLiteStatement.bindLong(2, lookAround.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `LookAround` (`trainingId`,`id`) VALUES (?,nullif(?, 0))";
        }
    }

    public class m extends EntityInsertionAdapter<EntranceKing> {
        public m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, EntranceKing entranceKing) {
            if (entranceKing.getIconUrl() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, entranceKing.getIconUrl());
            }
            if (entranceKing.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, entranceKing.getName());
            }
            if (entranceKing.getJumpType() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, entranceKing.getJumpType());
            }
            supportSQLiteStatement.bindLong(4, entranceKing.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `EntranceKing` (`iconUrl`,`name`,`jumpType`,`id`) VALUES (?,?,?,nullif(?, 0))";
        }
    }

    public class n extends SharedSQLiteStatement {
        public n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM CardPlace WHERE subjectPlace = ?";
        }
    }

    public class o extends SharedSQLiteStatement {
        public o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Tag";
        }
    }

    public class p extends SharedSQLiteStatement {
        public p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM TodayTraining";
        }
    }

    public EntranceDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new h(roomDatabase);
        this.d = new i(roomDatabase);
        this.e = new j(roomDatabase);
        this.f = new k(roomDatabase);
        this.g = new l(roomDatabase);
        this.h = new m(roomDatabase);
        this.i = new n(roomDatabase);
        this.j = new o(roomDatabase);
        this.k = new p(roomDatabase);
        this.l = new a(roomDatabase);
        this.m = new b(roomDatabase);
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void clearKingList() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.m.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.m.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void clearLookAroundTrainings() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.l.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.l.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void clearTodayTag() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.j.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.j.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void clearTodayTraining() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.k.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.k.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void deleteSubjectPlaces(SubjectPlace subjectPlace) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.i.acquire();
        Integer numSubjectPlaceToInt = this.c.subjectPlaceToInt(subjectPlace);
        if (numSubjectPlaceToInt == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, numSubjectPlaceToInt.intValue());
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.i.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertKingList(List<EntranceKing> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.h.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertLookAroundTrainings(List<LookAround> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.g.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertSubjectPlaces(List<CardPlace> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertSubjects(List<Subject> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.d.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertTodayTag(List<Tag> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public void insertTodayTraining(List<TodayTraining> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public LiveData<List<EntranceKing>> queryKingList() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"EntranceKing"}, false, new g(RoomSQLiteQuery.acquire("SELECT * FROM EntranceKing", 0)));
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public DataSource.Factory<Integer, Training> queryLookAroundTrainings() {
        return new f(RoomSQLiteQuery.acquire("SELECT Training.id, type, name, listImage, difficulty, consumption, participants, contentCount, label, squareImage FROM Training INNER JOIN LookAround ON Training.id = LookAround.trainingId", 0));
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public LiveData<List<Subject>> querySubjects(SubjectPlace subjectPlace) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("\n        SELECT Subject.id, title, subtitle, imageUrl, targetUrl, targetMode, displayMode\n        FROM Subject INNER JOIN CardPlace\n        WHERE Subject.id = subjectId AND subjectPlace = ?\n    ", 1);
        Integer numSubjectPlaceToInt = this.c.subjectPlaceToInt(subjectPlace);
        if (numSubjectPlaceToInt == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, numSubjectPlaceToInt.intValue());
        }
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Subject", "CardPlace"}, false, new c(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public LiveData<List<Tag>> queryTodayTag() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Tag"}, false, new d(RoomSQLiteQuery.acquire("SELECT * FROM Tag LIMIT 0,8", 0)));
    }

    @Override // com.huami.training.db.dao.EntranceDao
    public LiveData<List<Training>> queryTodayTraining(long j2) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT Training.id,listImage, name, difficulty, contentCount, consumption, participants, type, label,squareImage FROM Training INNER JOIN TodayTraining WHERE tagId=? AND Training.id = trainingId", 1);
        roomSQLiteQueryAcquire.bindLong(1, j2);
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Training", "TodayTraining"}, false, new e(roomSQLiteQueryAcquire));
    }
}
