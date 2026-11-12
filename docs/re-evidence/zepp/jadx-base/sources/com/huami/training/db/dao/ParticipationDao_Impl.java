package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.p008lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.Participation;
import com.huami.training.dto.TrainingType;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes15.dex */
public final class ParticipationDao_Impl extends ParticipationDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Participation> b;
    private final EntityDeletionOrUpdateAdapter<Participation> c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final TrainingTypeConverter g = new TrainingTypeConverter();
    private final GenderPairConverter h = new GenderPairConverter();

    public class a extends EntityInsertionAdapter<Participation> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Participation participation) {
            supportSQLiteStatement.bindLong(1, participation.getTrainingId());
            supportSQLiteStatement.bindLong(2, participation.getTrainTimes());
            if (participation.getJoinedTime() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, participation.getJoinedTime().longValue());
            }
            if (participation.getLastTrainingTime() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, participation.getLastTrainingTime().longValue());
            }
            if (participation.getUpdateTime() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, participation.getUpdateTime().longValue());
            }
            if (participation.getExpiry() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, participation.getExpiry().longValue());
            }
            Integer numValueOf = participation.getHasDownloaded() == null ? null : Integer.valueOf(participation.getHasDownloaded().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, numValueOf.intValue());
            }
            supportSQLiteStatement.bindLong(8, participation.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Participation` (`trainingId`,`trainTimes`,`joinedTime`,`lastTrainingTime`,`updateTime`,`expiry`,`hasDownloaded`,`id`) VALUES (?,?,?,?,?,?,?,nullif(?, 0))";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<Participation> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Participation participation) {
            supportSQLiteStatement.bindLong(1, participation.getTrainingId());
            supportSQLiteStatement.bindLong(2, participation.getTrainTimes());
            if (participation.getJoinedTime() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindLong(3, participation.getJoinedTime().longValue());
            }
            if (participation.getLastTrainingTime() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindLong(4, participation.getLastTrainingTime().longValue());
            }
            if (participation.getUpdateTime() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindLong(5, participation.getUpdateTime().longValue());
            }
            if (participation.getExpiry() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, participation.getExpiry().longValue());
            }
            Integer numValueOf = participation.getHasDownloaded() == null ? null : Integer.valueOf(participation.getHasDownloaded().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, numValueOf.intValue());
            }
            supportSQLiteStatement.bindLong(8, participation.getId());
            supportSQLiteStatement.bindLong(9, participation.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `Participation` SET `trainingId` = ?,`trainTimes` = ?,`joinedTime` = ?,`lastTrainingTime` = ?,`updateTime` = ?,`expiry` = ?,`hasDownloaded` = ?,`id` = ? WHERE `id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE Participation SET hasDownloaded = ? WHERE trainingId = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Participation WHERE trainingId = ?";
        }
    }

    public class e extends SharedSQLiteStatement {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM Participation";
        }
    }

    public class f extends DataSource.Factory<Integer, JoinedTraining> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<JoinedTraining> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<JoinedTraining> convertRows(Cursor cursor) {
                Boolean boolValueOf;
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor2, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor2, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor2, "type");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor2, "trainTimes");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor2, "contentCount");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor2, "joinedTime");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor2, "lastTrainingTime");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor2, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor2, "expiry");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor2, "hasDownloaded");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor2, "squareImage");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    long j = cursor2.getLong(columnIndexOrThrow);
                    String string = cursor2.getString(columnIndexOrThrow2);
                    TrainingType trainingTypeIntToTrainingType = ParticipationDao_Impl.this.g.intToTrainingType(cursor2.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursor2.getInt(columnIndexOrThrow3)));
                    int i = cursor2.getInt(columnIndexOrThrow4);
                    Integer numValueOf = cursor2.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursor2.getInt(columnIndexOrThrow5));
                    Long lValueOf = cursor2.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow6));
                    Long lValueOf2 = cursor2.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow7));
                    Long lValueOf3 = cursor2.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow8));
                    Long lValueOf4 = cursor2.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursor2.getLong(columnIndexOrThrow9));
                    Integer numValueOf2 = cursor2.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(cursor2.getInt(columnIndexOrThrow10));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    arrayList.add(new JoinedTraining(j, trainingTypeIntToTrainingType, string, i, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, ParticipationDao_Impl.this.h.stringToGenderStringPair(cursor2.getString(columnIndexOrThrow11))));
                    cursor2 = cursor;
                }
                return arrayList;
            }
        }

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, JoinedTraining> create() {
            return new a(ParticipationDao_Impl.this.a, this.a, false, TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING);
        }
    }

    public class g implements Callable<List<JoinedTraining>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<JoinedTraining> call() throws Exception {
            Boolean boolValueOf;
            Integer num = null;
            Cursor cursorQuery = DBUtil.query(ParticipationDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    TrainingType trainingTypeIntToTrainingType = ParticipationDao_Impl.this.g.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow3) ? num : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)));
                    int i = cursorQuery.getInt(columnIndexOrThrow4);
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5));
                    Long lValueOf = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7));
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                    Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow10));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    arrayList.add(new JoinedTraining(j, trainingTypeIntToTrainingType, string, i, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, ParticipationDao_Impl.this.h.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow11))));
                    num = null;
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

    public class h implements Callable<List<JoinedTraining>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<JoinedTraining> call() throws Exception {
            Boolean boolValueOf;
            Integer num = null;
            Cursor cursorQuery = DBUtil.query(ParticipationDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    TrainingType trainingTypeIntToTrainingType = ParticipationDao_Impl.this.g.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow3) ? num : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)));
                    int i = cursorQuery.getInt(columnIndexOrThrow4);
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5));
                    Long lValueOf = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                    Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7));
                    Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                    Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                    Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow10));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    arrayList.add(new JoinedTraining(j, trainingTypeIntToTrainingType, string, i, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, ParticipationDao_Impl.this.h.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow11))));
                    num = null;
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

    public class i implements Callable<Integer> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public i(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            Integer numValueOf = null;
            Cursor cursorQuery = DBUtil.query(ParticipationDao_Impl.this.a, this.a, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                }
                return numValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public ParticipationDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
        this.d = new c(roomDatabase);
        this.e = new d(roomDatabase);
        this.f = new e(roomDatabase);
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public void deleteParticipation(long j) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j);
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public void deleteParticipations() {
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

    @Override // com.huami.training.db.dao.ParticipationDao
    public void deleteParticipationsNotIn(List<Long> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM Participation WHERE trainingId NOT IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        int i2 = 1;
        for (Long l : list) {
            if (l == null) {
                supportSQLiteStatementCompileStatement.bindNull(i2);
            } else {
                supportSQLiteStatementCompileStatement.bindLong(i2, l.longValue());
            }
            i2++;
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public void increaseParticipationTrainTimes(long j) {
        this.a.beginTransaction();
        try {
            super.increaseParticipationTrainTimes(j);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public void insertOrUpdateParticipation(Participation participation) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateParticipation(participation);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public void insertOrUpdateParticipations(List<Participation> list) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateParticipations(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public long insertParticipation(Participation participation) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(participation);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public List<Long> insertParticipations(List<Participation> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.b.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public LiveData<List<JoinedTraining>> queryAllJoinedTrainings() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING}, false, new h(RoomSQLiteQuery.acquire("SELECT * FROM JoinedTraining", 0)));
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public LiveData<Integer> queryAllJoinedTrainingsCount() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING}, false, new i(RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM JoinedTraining", 0)));
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public JoinedTraining queryJoinedTraining(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM JoinedTraining WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        JoinedTraining joinedTraining = null;
        Boolean boolValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
            if (cursorQuery.moveToFirst()) {
                long j2 = cursorQuery.getLong(columnIndexOrThrow);
                String string = cursorQuery.getString(columnIndexOrThrow2);
                TrainingType trainingTypeIntToTrainingType = this.g.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)));
                int i2 = cursorQuery.getInt(columnIndexOrThrow4);
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5));
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7));
                Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow10));
                if (numValueOf2 != null) {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                joinedTraining = new JoinedTraining(j2, trainingTypeIntToTrainingType, string, i2, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, this.h.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow11)));
            }
            return joinedTraining;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public List<JoinedTraining> queryJoinedTrainings() {
        Boolean boolValueOf;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM JoinedTraining", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "contentCount");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "squareImage");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(columnIndexOrThrow);
                String string = cursorQuery.getString(columnIndexOrThrow2);
                TrainingType trainingTypeIntToTrainingType = this.g.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow3) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow3)));
                int i2 = cursorQuery.getInt(columnIndexOrThrow4);
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5));
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow7) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow7));
                Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow8));
                Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow9));
                Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow10) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow10));
                if (numValueOf2 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                arrayList.add(new JoinedTraining(j, trainingTypeIntToTrainingType, string, i2, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf, this.h.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow11))));
                columnIndexOrThrow = columnIndexOrThrow;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public DataSource.Factory<Integer, JoinedTraining> queryJoinedTrainingsForPaging() {
        return new f(RoomSQLiteQuery.acquire("SELECT * FROM JoinedTraining", 0));
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public LiveData<List<JoinedTraining>> queryLatestTwoJoinedTrainings() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING}, false, new g(RoomSQLiteQuery.acquire("SELECT * FROM JoinedTraining LIMIT 2", 0)));
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public Participation queryParticipation(long j) {
        boolean z = true;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Participation WHERE trainingId = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        Participation participation = null;
        Boolean boolValueOf = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainingId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            if (cursorQuery.moveToFirst()) {
                long j2 = cursorQuery.getLong(columnIndexOrThrow);
                int i2 = cursorQuery.getInt(columnIndexOrThrow2);
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow3));
                Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4));
                Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                participation = new Participation(j2, i2, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf);
                participation.setId(cursorQuery.getInt(columnIndexOrThrow8));
            }
            return participation;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public List<Participation> queryParticipations() {
        Boolean boolValueOf;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Participation", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainingId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(columnIndexOrThrow);
                int i2 = cursorQuery.getInt(columnIndexOrThrow2);
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow3));
                Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4));
                Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Participation participation = new Participation(j, i2, lValueOf, lValueOf2, lValueOf3, lValueOf4, boolValueOf);
                participation.setId(cursorQuery.getInt(columnIndexOrThrow8));
                arrayList.add(participation);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public List<Participation> queryParticipationsIn(List<Long> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append("*");
        sbNewStringBuilder.append(" FROM Participation WHERE trainingId IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i2 = 1;
        for (Long l : list) {
            if (l == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindLong(i2, l.longValue());
            }
            i2++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainingId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trainTimes");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "joinedTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastTrainingTime");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, EcgData.TIMESTAMP_SERVER_UPDATED);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiry");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hasDownloaded");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(columnIndexOrThrow);
                int i3 = cursorQuery.getInt(columnIndexOrThrow2);
                Long lValueOf = cursorQuery.isNull(columnIndexOrThrow3) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow3));
                Long lValueOf2 = cursorQuery.isNull(columnIndexOrThrow4) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow4));
                Long lValueOf3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5));
                Long lValueOf4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow6));
                Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                Participation participation = new Participation(j, i3, lValueOf, lValueOf2, lValueOf3, lValueOf4, numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0));
                participation.setId(cursorQuery.getInt(columnIndexOrThrow8));
                arrayList.add(participation);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public int updateParticipation(Participation participation) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.c.handle(participation) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.ParticipationDao
    public int updateParticipationDownloadState(long j, boolean z) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        supportSQLiteStatementAcquire.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementAcquire.bindLong(2, j);
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.d.release(supportSQLiteStatementAcquire);
        }
    }
}
