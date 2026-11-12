package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.p008lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.PlanConverters;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.TrainingPlan;
import com.huami.training.db.po.TrainingPlanWithTrainings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class PlanDao_Impl implements PlanDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<TrainingPlan> b;
    private final PlanConverters c = new PlanConverters();
    private final DifficultyConverter d = new DifficultyConverter();
    private final EntityInsertionAdapter<PlanTraining> e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;

    public class a extends EntityInsertionAdapter<TrainingPlan> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, TrainingPlan trainingPlan) {
            supportSQLiteStatement.bindLong(1, trainingPlan.getId());
            if (trainingPlan.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, trainingPlan.getName());
            }
            if (trainingPlan.getListImageUrl() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, trainingPlan.getListImageUrl());
            }
            if (trainingPlan.getDetailImageUrl() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, trainingPlan.getDetailImageUrl());
            }
            supportSQLiteStatement.bindLong(5, trainingPlan.getConsumption());
            if (trainingPlan.getIntroduction() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, trainingPlan.getIntroduction());
            }
            Integer numPlanTypeToInt = PlanDao_Impl.this.c.planTypeToInt(trainingPlan.getType());
            if (numPlanTypeToInt == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, numPlanTypeToInt.intValue());
            }
            supportSQLiteStatement.bindLong(8, PlanDao_Impl.this.d.difficultyToInt(trainingPlan.getDifficulty()));
            supportSQLiteStatement.bindLong(9, trainingPlan.getDuration());
            supportSQLiteStatement.bindLong(10, trainingPlan.getTrainingDays());
            supportSQLiteStatement.bindLong(11, trainingPlan.getTotalDays());
            supportSQLiteStatement.bindLong(12, trainingPlan.getStartDay());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `TrainingPlan` (`id`,`name`,`listImageUrl`,`detailImageUrl`,`consumption`,`introduction`,`type`,`difficulty`,`duration`,`trainingDays`,`totalDays`,`startDay`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityInsertionAdapter<PlanTraining> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, PlanTraining planTraining) {
            supportSQLiteStatement.bindLong(1, planTraining.getPlanId());
            supportSQLiteStatement.bindLong(2, planTraining.getTrainingId());
            if (planTraining.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, planTraining.getName());
            }
            supportSQLiteStatement.bindLong(4, planTraining.getDayOfWeek());
            if (planTraining.getDuration() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, planTraining.getDuration().longValue());
            }
            if (planTraining.getConsumption() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, planTraining.getConsumption().intValue());
            }
            supportSQLiteStatement.bindLong(7, planTraining.isFinished() ? 1L : 0L);
            supportSQLiteStatement.bindLong(8, planTraining.getDayIndex());
            if (planTraining.getArticleId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindLong(9, planTraining.getArticleId().longValue());
            }
            if (planTraining.getArticleTitle() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, planTraining.getArticleTitle());
            }
            if (planTraining.getArticleDescription() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, planTraining.getArticleDescription());
            }
            if (planTraining.getArticleLink() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, planTraining.getArticleLink());
            }
            if (planTraining.getArticleImageUrl() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, planTraining.getArticleImageUrl());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `PlanTraining` (`planId`,`trainingId`,`name`,`dayOfWeek`,`duration`,`consumption`,`isFinished`,`dayIndex`,`articleId`,`articleTitle`,`articleDescription`,`articleLink`,`articleImageUrl`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM TrainingPlan";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM PlanTraining";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE PlanTraining SET isFinished = ? WHERE trainingId = ? AND dayIndex = ?";
        }
    }

    public class f implements Callable<TrainingPlanWithTrainings> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0111  */
        /* JADX WARN: Code duplicated, block: B:45:0x0113 A[Catch: all -> 0x017d, TryCatch #1 {all -> 0x017d, blocks: (B:4:0x0019, B:5:0x0066, B:7:0x006c, B:9:0x007a, B:12:0x008d, B:14:0x00a0, B:16:0x00a6, B:18:0x00ac, B:20:0x00b4, B:22:0x00ba, B:24:0x00c0, B:26:0x00c6, B:28:0x00cc, B:30:0x00d2, B:32:0x00d8, B:34:0x00de, B:36:0x00e4, B:42:0x00f3, B:46:0x011b, B:47:0x014e, B:49:0x015a, B:50:0x015f, B:52:0x0167, B:45:0x0113), top: B:63:0x0019, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x015a A[Catch: all -> 0x017d, TryCatch #1 {all -> 0x017d, blocks: (B:4:0x0019, B:5:0x0066, B:7:0x006c, B:9:0x007a, B:12:0x008d, B:14:0x00a0, B:16:0x00a6, B:18:0x00ac, B:20:0x00b4, B:22:0x00ba, B:24:0x00c0, B:26:0x00c6, B:28:0x00cc, B:30:0x00d2, B:32:0x00d8, B:34:0x00de, B:36:0x00e4, B:42:0x00f3, B:46:0x011b, B:47:0x014e, B:49:0x015a, B:50:0x015f, B:52:0x0167, B:45:0x0113), top: B:63:0x0019, outer: #0 }] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingPlanWithTrainings call() throws Exception {
            TrainingPlanWithTrainings trainingPlanWithTrainings;
            int i;
            int i2;
            TrainingPlan trainingPlan;
            ArrayList arrayList;
            Integer numValueOf;
            PlanDao_Impl.this.a.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(PlanDao_Impl.this.a, this.a, true, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "listImageUrl");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "detailImageUrl");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "consumption");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "introduction");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "difficulty");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainingDays");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "totalDays");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "startDay");
                    LongSparseArray longSparseArray = new LongSparseArray();
                    while (cursorQuery.moveToNext()) {
                        int i3 = columnIndexOrThrow3;
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        if (((ArrayList) longSparseArray.get(j)) == null) {
                            longSparseArray.put(j, new ArrayList());
                        }
                        columnIndexOrThrow3 = i3;
                        columnIndexOrThrow12 = columnIndexOrThrow12;
                    }
                    int i4 = columnIndexOrThrow3;
                    int i5 = columnIndexOrThrow12;
                    cursorQuery.moveToPosition(-1);
                    PlanDao_Impl.this.a(longSparseArray);
                    if (cursorQuery.moveToFirst()) {
                        if (cursorQuery.isNull(columnIndexOrThrow) && cursorQuery.isNull(columnIndexOrThrow2)) {
                            i = i4;
                            if (cursorQuery.isNull(i) && cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5) && cursorQuery.isNull(columnIndexOrThrow6) && cursorQuery.isNull(columnIndexOrThrow7) && cursorQuery.isNull(columnIndexOrThrow8) && cursorQuery.isNull(columnIndexOrThrow9) && cursorQuery.isNull(columnIndexOrThrow10) && cursorQuery.isNull(columnIndexOrThrow11)) {
                                i2 = i5;
                                if (cursorQuery.isNull(i2)) {
                                    trainingPlan = null;
                                }
                                arrayList = (ArrayList) longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow));
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                trainingPlanWithTrainings = new TrainingPlanWithTrainings(trainingPlan, arrayList);
                            }
                            long j2 = cursorQuery.getLong(columnIndexOrThrow);
                            String string = cursorQuery.getString(columnIndexOrThrow2);
                            String string2 = cursorQuery.getString(i);
                            String string3 = cursorQuery.getString(columnIndexOrThrow4);
                            int i6 = cursorQuery.getInt(columnIndexOrThrow5);
                            String string4 = cursorQuery.getString(columnIndexOrThrow6);
                            if (cursorQuery.isNull(columnIndexOrThrow7)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                            }
                            trainingPlan = new TrainingPlan(j2, string, string2, string3, i6, string4, PlanDao_Impl.this.c.intToPlanType(numValueOf), PlanDao_Impl.this.d.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8))), cursorQuery.getLong(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getLong(i2));
                            arrayList = (ArrayList) longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            trainingPlanWithTrainings = new TrainingPlanWithTrainings(trainingPlan, arrayList);
                        } else {
                            i = i4;
                        }
                        i2 = i5;
                        long j3 = cursorQuery.getLong(columnIndexOrThrow);
                        String string5 = cursorQuery.getString(columnIndexOrThrow2);
                        String string6 = cursorQuery.getString(i);
                        String string7 = cursorQuery.getString(columnIndexOrThrow4);
                        int i7 = cursorQuery.getInt(columnIndexOrThrow5);
                        String string8 = cursorQuery.getString(columnIndexOrThrow6);
                        if (cursorQuery.isNull(columnIndexOrThrow7)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        }
                        trainingPlan = new TrainingPlan(j3, string5, string6, string7, i7, string8, PlanDao_Impl.this.c.intToPlanType(numValueOf), PlanDao_Impl.this.d.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8))), cursorQuery.getLong(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), cursorQuery.getLong(i2));
                        arrayList = (ArrayList) longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        trainingPlanWithTrainings = new TrainingPlanWithTrainings(trainingPlan, arrayList);
                    } else {
                        trainingPlanWithTrainings = null;
                    }
                    PlanDao_Impl.this.a.setTransactionSuccessful();
                    cursorQuery.close();
                    PlanDao_Impl.this.a.endTransaction();
                    return trainingPlanWithTrainings;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                PlanDao_Impl.this.a.endTransaction();
                throw th2;
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public PlanDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.e = new b(roomDatabase);
        this.f = new c(roomDatabase);
        this.g = new d(roomDatabase);
        this.h = new e(roomDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LongSparseArray<ArrayList<PlanTraining>> longSparseArray) {
        Long lValueOf;
        Integer numValueOf;
        Long lValueOf2;
        int i;
        LongSparseArray<ArrayList<PlanTraining>> longSparseArray2 = longSparseArray;
        if (longSparseArray.isEmpty()) {
            return;
        }
        if (longSparseArray.size() > 999) {
            LongSparseArray<ArrayList<PlanTraining>> longSparseArray3 = new LongSparseArray<>(999);
            int size = longSparseArray.size();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                do {
                    if (i2 >= size) {
                        break loop0;
                    }
                    longSparseArray3.put(longSparseArray2.keyAt(i2), longSparseArray2.valueAt(i2));
                    i2++;
                    i++;
                } while (i != 999);
                a(longSparseArray3);
                longSparseArray3 = new LongSparseArray<>(999);
            }
            if (i > 0) {
                a(longSparseArray3);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `planId`,`trainingId`,`name`,`dayOfWeek`,`duration`,`consumption`,`isFinished`,`dayIndex`,`articleId`,`articleTitle`,`articleDescription`,`articleLink`,`articleImageUrl` FROM `PlanTraining` WHERE `planId` IN (");
        int size2 = longSparseArray.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2 + 0);
        int i3 = 1;
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            roomSQLiteQueryAcquire.bindLong(i3, longSparseArray2.keyAt(i4));
            i3++;
        }
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, BloodPressureConst.ParamKey.PLANID);
            if (columnIndex == -1) {
                return;
            }
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, BloodPressureConst.ParamKey.PLANID);
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "trainingId");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "name");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "dayOfWeek");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "consumption");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "isFinished");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "dayIndex");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "articleId");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "articleTitle");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "articleDescription");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "articleLink");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, "articleImageUrl");
            while (cursorQuery.moveToNext()) {
                int i5 = columnIndex12;
                int i6 = columnIndex13;
                ArrayList<PlanTraining> arrayList = longSparseArray2.get(cursorQuery.getLong(columnIndex));
                if (arrayList != null) {
                    int i7 = -1;
                    long j = columnIndex2 == -1 ? 0L : cursorQuery.getLong(columnIndex2);
                    long j2 = columnIndex3 != -1 ? cursorQuery.getLong(columnIndex3) : 0L;
                    String string = columnIndex4 == -1 ? null : cursorQuery.getString(columnIndex4);
                    int i8 = columnIndex5 == -1 ? 0 : cursorQuery.getInt(columnIndex5);
                    if (columnIndex6 == -1) {
                        lValueOf = null;
                    } else if (cursorQuery.isNull(columnIndex6)) {
                        i7 = -1;
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(cursorQuery.getLong(columnIndex6));
                        i7 = -1;
                    }
                    if (columnIndex7 == i7) {
                        numValueOf = null;
                    } else if (cursorQuery.isNull(columnIndex7)) {
                        i7 = -1;
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(columnIndex7));
                        i7 = -1;
                    }
                    boolean z = columnIndex8 == i7 ? false : cursorQuery.getInt(columnIndex8) != 0;
                    int i9 = columnIndex9 == i7 ? 0 : cursorQuery.getInt(columnIndex9);
                    if (columnIndex10 == i7) {
                        lValueOf2 = null;
                    } else if (cursorQuery.isNull(columnIndex10)) {
                        i7 = -1;
                        lValueOf2 = null;
                    } else {
                        lValueOf2 = Long.valueOf(cursorQuery.getLong(columnIndex10));
                        i7 = -1;
                    }
                    arrayList.add(new PlanTraining(j, j2, string, i8, lValueOf, numValueOf, z, i9, lValueOf2, columnIndex11 == i7 ? null : cursorQuery.getString(columnIndex11), i5 == i7 ? null : cursorQuery.getString(i5), i6 == i7 ? null : cursorQuery.getString(i6), columnIndex14 == i7 ? null : cursorQuery.getString(columnIndex14)));
                } else {
                    i6 = i6;
                }
                columnIndex13 = i6;
                columnIndex12 = i5;
                longSparseArray2 = longSparseArray;
            }
        } finally {
            cursorQuery.close();
        }
    }

    @Override // com.huami.training.db.dao.PlanDao
    public void clearPlan() {
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

    @Override // com.huami.training.db.dao.PlanDao
    public void clearPlanTrainings() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.g.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.g.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.PlanDao
    public void finishPlanTraining(long j, int i, boolean z) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        supportSQLiteStatementAcquire.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementAcquire.bindLong(2, j);
        supportSQLiteStatementAcquire.bindLong(3, i);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.h.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.PlanDao
    public void insertPlan(TrainingPlan trainingPlan) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(trainingPlan);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.PlanDao
    public void insertPlanTrainings(List<PlanTraining> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.PlanDao
    public LiveData<TrainingPlanWithTrainings> queryPlanWithTrainings() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"PlanTraining", "TrainingPlan"}, true, new f(RoomSQLiteQuery.acquire("SELECT * FROM TrainingPlan", 0)));
    }
}
