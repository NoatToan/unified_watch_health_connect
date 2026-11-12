package com.huami.sky.lib.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.entity.MusicInfo;
import com.huami.sky.lib.entity.MusicTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public final class MusicInfoDao_Impl implements MusicInfoDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<MusicEntity> b;
    private final MusicTagsConverter c = new MusicTagsConverter();

    public class a extends EntityInsertionAdapter<MusicEntity> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement stmt, MusicEntity value) {
            stmt.bindLong(1, value.getTime());
            if (value.getAnimationUrl() == null) {
                stmt.bindNull(2);
            } else {
                stmt.bindString(2, value.getAnimationUrl());
            }
            String string = MusicInfoDao_Impl.this.c.toString(value.getTags());
            if (string == null) {
                stmt.bindNull(3);
            } else {
                stmt.bindString(3, string);
            }
            MusicInfo musicClip = value.getMusicClip();
            if (musicClip == null) {
                stmt.bindNull(4);
                stmt.bindNull(5);
                return;
            }
            if (musicClip.getClipId() == null) {
                stmt.bindNull(4);
            } else {
                stmt.bindString(4, musicClip.getClipId());
            }
            if (musicClip.getUrl() == null) {
                stmt.bindNull(5);
            } else {
                stmt.bindString(5, musicClip.getUrl());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `music_entity` (`time`,`animationUrl`,`tags`,`clipId`,`url`) VALUES (?,?,?,?,?)";
        }
    }

    public class b implements Callable<List<MusicEntity>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<MusicEntity> call() throws Exception {
            MusicInfo musicInfo;
            Cursor cursorQuery = DBUtil.query(MusicInfoDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "time");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "animationUrl");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tags");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConstant.QueryParam.CLIP_ID);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "url");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    List<MusicTags> listFromString = MusicInfoDao_Impl.this.c.fromString(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                    if (cursorQuery.isNull(columnIndexOrThrow4) && cursorQuery.isNull(columnIndexOrThrow5)) {
                        musicInfo = null;
                    } else {
                        musicInfo = new MusicInfo(cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5));
                    }
                    arrayList.add(new MusicEntity(j, musicInfo, string, listFromString));
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

    public MusicInfoDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.sky.lib.room.MusicInfoDao
    public Flow<List<MusicEntity>> getMusicInfoLimit(final int count) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from music_entity order by time desc limit ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, count);
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"music_entity"}, new b(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.sky.lib.room.MusicInfoDao
    public long insert(final MusicEntity info) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            long jInsertAndReturnId = this.b.insertAndReturnId(info);
            this.a.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.a.endTransaction();
        }
    }
}
