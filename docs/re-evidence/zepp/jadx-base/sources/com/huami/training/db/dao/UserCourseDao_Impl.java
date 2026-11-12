package com.huami.training.db.dao;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.training.db.DifficultyConverter;
import com.huami.training.db.GenderPairConverter;
import com.huami.training.db.TrainingTypeConverter;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.UserCourse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class UserCourseDao_Impl implements UserCourseDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<UserCourse> b;
    private final SharedSQLiteStatement c;
    private final TrainingTypeConverter d = new TrainingTypeConverter();
    private final GenderPairConverter e = new GenderPairConverter();
    private final DifficultyConverter f = new DifficultyConverter();

    public class a extends EntityInsertionAdapter<UserCourse> {
        public a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, UserCourse userCourse) {
            supportSQLiteStatement.bindLong(1, userCourse.getCourseId());
            if (userCourse.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, userCourse.getUserId());
            }
            supportSQLiteStatement.bindLong(3, userCourse.getId());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `UserCourse` (`courseId`,`userId`,`id`) VALUES (?,?,nullif(?, 0))";
        }
    }

    public class b extends SharedSQLiteStatement {
        public b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM UserCourse WHERE userId = ?";
        }
    }

    public class c extends DataSource.Factory<Integer, Training> {
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
                    arrayList.add(new Training(cursor.getLong(columnIndexOrThrow), UserCourseDao_Impl.this.d.intToTrainingType(cursor.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow2))), cursor.getString(columnIndexOrThrow3), UserCourseDao_Impl.this.e.stringToGenderStringPair(cursor.getString(columnIndexOrThrow4)), UserCourseDao_Impl.this.f.intToDifficulty(Integer.valueOf(cursor.getInt(columnIndexOrThrow5))), cursor.isNull(columnIndexOrThrow6) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow6)), cursor.isNull(columnIndexOrThrow7) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow7)), cursor.isNull(columnIndexOrThrow8) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow8)), cursor.getString(columnIndexOrThrow9), UserCourseDao_Impl.this.e.stringToGenderStringPair(cursor.getString(columnIndexOrThrow10))));
                    columnIndexOrThrow = i;
                }
                return arrayList;
            }
        }

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, Training> create() {
            return new a(UserCourseDao_Impl.this.a, this.a, false, "UserCourse", "Training");
        }
    }

    public UserCourseDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(roomDatabase);
        this.c = new b(roomDatabase);
    }

    @Override // com.huami.training.db.dao.UserCourseDao
    public void deleteUserCoursesByUser(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.c.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.c.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.training.db.dao.UserCourseDao
    public List<Long> insertUserCourses(List<UserCourse> list) {
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

    @Override // com.huami.training.db.dao.UserCourseDao
    public DataSource.Factory<Integer, Training> queryFullUserCoursesForPaging(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("\n        SELECT Training.*\n        FROM UserCourse INNER JOIN Training\n        WHERE UserCourse.courseId = Training.id\n            AND UserCourse.userId = ?\n    ", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return new c(roomSQLiteQueryAcquire);
    }
}
