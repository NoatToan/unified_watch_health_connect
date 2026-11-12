package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.Training;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class TrainingDao_Impl extends TrainingDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Training> b;
    private final TrainingTypeConverter c = new TrainingTypeConverter();
    private final GenderPairConverter d = new GenderPairConverter();
    private final DifficultyConverter e = new DifficultyConverter();
    private final EntityDeletionOrUpdateAdapter<Training> f;

    public class a extends EntityInsertionAdapter<Training> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Training training) {
            supportSQLiteStatement.bindLong(1, training.getId());
            Integer numTrainingTypeToInt = TrainingDao_Impl.this.c.trainingTypeToInt(training.getType());
            if (numTrainingTypeToInt == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, numTrainingTypeToInt.intValue());
            }
            if (training.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, training.getName());
            }
            String strGenderStringPairToString = TrainingDao_Impl.this.d.genderStringPairToString(training.getListImage());
            if (strGenderStringPairToString == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strGenderStringPairToString);
            }
            supportSQLiteStatement.bindLong(5, TrainingDao_Impl.this.e.difficultyToInt(training.getDifficulty()));
            if (training.getConsumption() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, training.getConsumption().intValue());
            }
            if (training.getParticipants() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, training.getParticipants().intValue());
            }
            if (training.getContentCount() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, training.getContentCount().intValue());
            }
            if (training.getLabel() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, training.getLabel());
            }
            String strGenderStringPairToString2 = TrainingDao_Impl.this.d.genderStringPairToString(training.getSquareImage());
            if (strGenderStringPairToString2 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, strGenderStringPairToString2);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Training` (`id`,`type`,`name`,`listImage`,`difficulty`,`consumption`,`participants`,`contentCount`,`label`,`squareImage`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<Training> {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Training training) {
            supportSQLiteStatement.bindLong(1, training.getId());
            Integer numTrainingTypeToInt = TrainingDao_Impl.this.c.trainingTypeToInt(training.getType());
            if (numTrainingTypeToInt == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, numTrainingTypeToInt.intValue());
            }
            if (training.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, training.getName());
            }
            String strGenderStringPairToString = TrainingDao_Impl.this.d.genderStringPairToString(training.getListImage());
            if (strGenderStringPairToString == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, strGenderStringPairToString);
            }
            supportSQLiteStatement.bindLong(5, TrainingDao_Impl.this.e.difficultyToInt(training.getDifficulty()));
            if (training.getConsumption() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindLong(6, training.getConsumption().intValue());
            }
            if (training.getParticipants() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, training.getParticipants().intValue());
            }
            if (training.getContentCount() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindLong(8, training.getContentCount().intValue());
            }
            if (training.getLabel() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, training.getLabel());
            }
            String strGenderStringPairToString2 = TrainingDao_Impl.this.d.genderStringPairToString(training.getSquareImage());
            if (strGenderStringPairToString2 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, strGenderStringPairToString2);
            }
            supportSQLiteStatement.bindLong(11, training.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `Training` SET `id` = ?,`type` = ?,`name` = ?,`listImage` = ?,`difficulty` = ?,`consumption` = ?,`participants` = ?,`contentCount` = ?,`label` = ?,`squareImage` = ? WHERE `id` = ?";
        }
    }

    public TrainingDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.f = new b(roomDatabase);
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public void insertOrUpdateTraining(Training training) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateTraining(training);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public void insertOrUpdateTrainings(List<Training> list) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateTrainings(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public long insertTraining(Training training) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(training);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public List<Long> insertTrainings(List<Training> list) {
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

    @Override // com.huami.training.db.dao.TrainingDao
    public Training queryTraining(long j) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Training WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        this.a.assertNotSuspendingTransaction();
        Training training = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
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
            if (cursorQuery.moveToFirst()) {
                training = new Training(cursorQuery.getLong(columnIndexOrThrow), this.c.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2))), cursorQuery.getString(columnIndexOrThrow3), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow4)), this.e.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5))), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8)), cursorQuery.getString(columnIndexOrThrow9), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow10)));
            }
            return training;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public List<Training> queryTrainings() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Training", 0);
        this.a.assertNotSuspendingTransaction();
        Integer num = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
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
                arrayList.add(new Training(cursorQuery.getLong(columnIndexOrThrow), this.c.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow2) ? num : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2))), cursorQuery.getString(columnIndexOrThrow3), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow4)), this.e.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5))), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8)), cursorQuery.getString(columnIndexOrThrow9), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow10))));
                num = null;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public List<Training> queryTrainingsIn(List<Long> list) {
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
        this.a.assertNotSuspendingTransaction();
        Integer num = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
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
                arrayList.add(new Training(cursorQuery.getLong(columnIndexOrThrow), this.c.intToTrainingType(cursorQuery.isNull(columnIndexOrThrow2) ? num : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow2))), cursorQuery.getString(columnIndexOrThrow3), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow4)), this.e.intToDifficulty(Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow5))), cursorQuery.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow6)), cursorQuery.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7)), cursorQuery.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow8)), cursorQuery.getString(columnIndexOrThrow9), this.d.stringToGenderStringPair(cursorQuery.getString(columnIndexOrThrow10))));
                num = null;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public void updateTraining(Training training) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f.handle(training);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.training.db.dao.TrainingDao
    public void updateTrainings(List<Training> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f.handleMultiple(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }
}
