package com.huami.sky.lib.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.sky.lib.entity.UserMusicTag;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class MusicTagDao_Impl implements MusicTagDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<UserMusicTag> b;
    private final MusicTagsConverter c = new MusicTagsConverter();
    private final RelaxInfoListConverter d = new RelaxInfoListConverter();

    public class a extends EntityInsertionAdapter<UserMusicTag> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, UserMusicTag value) {
            if (value.getUserId() == null) {
                stmt.bindNull(1);
            } else {
                stmt.bindString(1, value.getUserId());
            }
            stmt.bindLong(2, value.getSleepStartTime());
            String string = MusicTagDao_Impl.this.c.toString(value.getMusicTags());
            if (string == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, string);
            }
            String string2 = MusicTagDao_Impl.this.d.toString(value.getScores());
            if (string2 == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, string2);
            }
            if (value.getDaysOfContinuous() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, value.getDaysOfContinuous());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `musicTag` (`userId`,`sleepStartTime`,`musicTags`,`scores`,`daysOfContinuous`) VALUES (?,?,?,?,?)";
        }
    }

    public class b implements Callable<UserMusicTag> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserMusicTag call() throws Exception {
            UserMusicTag userMusicTag = null;
            Cursor cursorQuery = DBUtil.query(MusicTagDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepStartTime");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "musicTags");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scores");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "daysOfContinuous");
                if (cursorQuery.moveToFirst()) {
                    userMusicTag = new UserMusicTag(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), MusicTagDao_Impl.this.c.fromString(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3)), MusicTagDao_Impl.this.d.fromString(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4)), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                }
                return userMusicTag;
            } finally {
                cursorQuery.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public MusicTagDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.sky.lib.room.MusicTagDao
    public Flow<UserMusicTag> getMusicTag(final String userId, final long sleepStartTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from musicTag where userId=? and sleepStartTime = ?", 2);
        if (userId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, userId);
        }
        roomSQLiteQueryAcquire.bindLong(2, sleepStartTime);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"musicTag"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.sky.lib.room.MusicTagDao
    public long insert(final UserMusicTag tag) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(tag);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }
}
