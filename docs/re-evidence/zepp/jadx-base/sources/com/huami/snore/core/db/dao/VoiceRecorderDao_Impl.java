package com.huami.snore.core.db.dao;

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
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceRecorderDao_Impl implements VoiceRecorderDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<VoiceRecorderEntity> __insertionAdapterOfVoiceRecorderEntity;
    private final SharedSQLiteStatement __preparedStmtOfClean;
    private final SharedSQLiteStatement __preparedStmtOfDeleteWithinTimeData;
    private final EntityDeletionOrUpdateAdapter<VoiceRecorderEntity> __updateAdapterOfVoiceRecorderEntity;
    private final VoiceTypeConvert __voiceTypeConvert = new VoiceTypeConvert();
    private final DateConvert __dateConvert = new DateConvert();

    public VoiceRecorderDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfVoiceRecorderEntity = new EntityInsertionAdapter<VoiceRecorderEntity>(__db) { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `voice_recorder_table` (`id`,`uid`,`duration`,`type`,`start_time`,`file_path`,`uploaded`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, VoiceRecorderEntity voiceRecorderEntity) {
                supportSQLiteStatement.bindLong(1, voiceRecorderEntity.getId());
                if (voiceRecorderEntity.getUid() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, voiceRecorderEntity.getUid());
                }
                supportSQLiteStatement.bindLong(3, voiceRecorderEntity.getDuration());
                String string = VoiceRecorderDao_Impl.this.__voiceTypeConvert.toString(voiceRecorderEntity.getType());
                if (string == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, string);
                }
                Long l = VoiceRecorderDao_Impl.this.__dateConvert.toLong(voiceRecorderEntity.getStartTime());
                if (l == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, l.longValue());
                }
                if (voiceRecorderEntity.getFilePath() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, voiceRecorderEntity.getFilePath());
                }
                supportSQLiteStatement.bindLong(7, voiceRecorderEntity.getUploaded() ? 1L : 0L);
            }
        };
        this.__updateAdapterOfVoiceRecorderEntity = new EntityDeletionOrUpdateAdapter<VoiceRecorderEntity>(__db) { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR ABORT `voice_recorder_table` SET `id` = ?,`uid` = ?,`duration` = ?,`type` = ?,`start_time` = ?,`file_path` = ?,`uploaded` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, VoiceRecorderEntity voiceRecorderEntity) {
                supportSQLiteStatement.bindLong(1, voiceRecorderEntity.getId());
                if (voiceRecorderEntity.getUid() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, voiceRecorderEntity.getUid());
                }
                supportSQLiteStatement.bindLong(3, voiceRecorderEntity.getDuration());
                String string = VoiceRecorderDao_Impl.this.__voiceTypeConvert.toString(voiceRecorderEntity.getType());
                if (string == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, string);
                }
                Long l = VoiceRecorderDao_Impl.this.__dateConvert.toLong(voiceRecorderEntity.getStartTime());
                if (l == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindLong(5, l.longValue());
                }
                if (voiceRecorderEntity.getFilePath() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, voiceRecorderEntity.getFilePath());
                }
                supportSQLiteStatement.bindLong(7, voiceRecorderEntity.getUploaded() ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, voiceRecorderEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteWithinTimeData = new SharedSQLiteStatement(__db) { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM voice_recorder_table where start_time>=? and start_time<=? ";
            }
        };
        this.__preparedStmtOfClean = new SharedSQLiteStatement(__db) { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from voice_recorder_table";
            }
        };
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public void clean() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfClean.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfClean.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public int delete(final String... filePath) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM voice_recorder_table WHERE file_path = ");
        StringUtil.appendPlaceholders(sbNewStringBuilder, filePath.length);
        sbNewStringBuilder.append(" ");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.__db.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (String str : filePath) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public int deleteWithinTimeData(final Date startTime, final Date endTime) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteWithinTimeData.acquire();
        Long l = this.__dateConvert.toLong(startTime);
        if (l == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, l.longValue());
        }
        Long l2 = this.__dateConvert.toLong(endTime);
        if (l2 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindLong(2, l2.longValue());
        }
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteWithinTimeData.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public List<VoiceRecorderEntity> findAllData() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from voice_recorder_table a order by a.start_time desc", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_path");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                VoiceRecorderEntity voiceRecorderEntity = new VoiceRecorderEntity();
                voiceRecorderEntity.setId(cursorQuery.getLong(columnIndexOrThrow));
                voiceRecorderEntity.setUid(cursorQuery.getString(columnIndexOrThrow2));
                voiceRecorderEntity.setDuration(cursorQuery.getLong(columnIndexOrThrow3));
                voiceRecorderEntity.setType(this.__voiceTypeConvert.toType(cursorQuery.getString(columnIndexOrThrow4)));
                voiceRecorderEntity.setStartTime(this.__dateConvert.toDate(cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5))));
                voiceRecorderEntity.setFilePath(cursorQuery.getString(columnIndexOrThrow6));
                voiceRecorderEntity.setUploaded(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                arrayList.add(voiceRecorderEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public List<VoiceRecorderEntity> findByStartTime(final Date startTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from voice_recorder_table where start_time=?", 1);
        Long l = this.__dateConvert.toLong(startTime);
        if (l == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, l.longValue());
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_path");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                VoiceRecorderEntity voiceRecorderEntity = new VoiceRecorderEntity();
                voiceRecorderEntity.setId(cursorQuery.getLong(columnIndexOrThrow));
                voiceRecorderEntity.setUid(cursorQuery.getString(columnIndexOrThrow2));
                voiceRecorderEntity.setDuration(cursorQuery.getLong(columnIndexOrThrow3));
                voiceRecorderEntity.setType(this.__voiceTypeConvert.toType(cursorQuery.getString(columnIndexOrThrow4)));
                voiceRecorderEntity.setStartTime(this.__dateConvert.toDate(cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5))));
                voiceRecorderEntity.setFilePath(cursorQuery.getString(columnIndexOrThrow6));
                voiceRecorderEntity.setUploaded(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                arrayList.add(voiceRecorderEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public LiveData<Integer> getCountWithinTimeData(final Date startTime, final Date endTime) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select count(*)  from voice_recorder_table where start_time>=? and start_time<=?  order by start_time", 2);
        Long l = this.__dateConvert.toLong(startTime);
        if (l == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, l.longValue());
        }
        Long l2 = this.__dateConvert.toLong(endTime);
        if (l2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindLong(2, l2.longValue());
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"voice_recorder_table"}, false, new Callable<Integer>() { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.6
            public void finalize() {
                roomSQLiteQueryAcquire.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer numValueOf = null;
                Cursor cursorQuery = DBUtil.query(VoiceRecorderDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(0));
                    }
                    return numValueOf;
                } finally {
                    cursorQuery.close();
                }
            }
        });
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public void insert(final VoiceRecorderEntity... entity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfVoiceRecorderEntity.insert(entity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public DataSource.Factory<Integer, VoiceRecorderEntity> loadWithinTimeData(final Date startTime, final Date endTime) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from voice_recorder_table where start_time>=? and start_time<=?  order by start_time desc", 2);
        Long l = this.__dateConvert.toLong(startTime);
        if (l == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, l.longValue());
        }
        Long l2 = this.__dateConvert.toLong(endTime);
        if (l2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindLong(2, l2.longValue());
        }
        return new DataSource.Factory<Integer, VoiceRecorderEntity>() { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.5
            @Override // androidx.paging.DataSource.Factory
            public DataSource<Integer, VoiceRecorderEntity> create() {
                return new LimitOffsetDataSource<VoiceRecorderEntity>(VoiceRecorderDao_Impl.this.__db, roomSQLiteQueryAcquire, false, "voice_recorder_table") { // from class: com.huami.snore.core.db.dao.VoiceRecorderDao_Impl.5.1
                    @Override // androidx.room.paging.LimitOffsetDataSource
                    public List<VoiceRecorderEntity> convertRows(Cursor cursor) {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "uid");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "duration");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "type");
                        int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, "start_time");
                        int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "file_path");
                        int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "uploaded");
                        ArrayList arrayList = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            VoiceRecorderEntity voiceRecorderEntity = new VoiceRecorderEntity();
                            voiceRecorderEntity.setId(cursor.getLong(columnIndexOrThrow));
                            voiceRecorderEntity.setUid(cursor.getString(columnIndexOrThrow2));
                            voiceRecorderEntity.setDuration(cursor.getLong(columnIndexOrThrow3));
                            voiceRecorderEntity.setType(VoiceRecorderDao_Impl.this.__voiceTypeConvert.toType(cursor.getString(columnIndexOrThrow4)));
                            voiceRecorderEntity.setStartTime(VoiceRecorderDao_Impl.this.__dateConvert.toDate(cursor.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursor.getLong(columnIndexOrThrow5))));
                            voiceRecorderEntity.setFilePath(cursor.getString(columnIndexOrThrow6));
                            voiceRecorderEntity.setUploaded(cursor.getInt(columnIndexOrThrow7) != 0);
                            arrayList.add(voiceRecorderEntity);
                        }
                        return arrayList;
                    }
                };
            }
        };
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public List<VoiceRecorderEntity> loadWithinTimeDataList(final Date startTime, final Date endTime) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from voice_recorder_table where start_time>=? and start_time<=?  order by start_time desc", 2);
        Long l = this.__dateConvert.toLong(startTime);
        if (l == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, l.longValue());
        }
        Long l2 = this.__dateConvert.toLong(endTime);
        if (l2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindLong(2, l2.longValue());
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "duration");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "start_time");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_path");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uploaded");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                VoiceRecorderEntity voiceRecorderEntity = new VoiceRecorderEntity();
                voiceRecorderEntity.setId(cursorQuery.getLong(columnIndexOrThrow));
                voiceRecorderEntity.setUid(cursorQuery.getString(columnIndexOrThrow2));
                voiceRecorderEntity.setDuration(cursorQuery.getLong(columnIndexOrThrow3));
                voiceRecorderEntity.setType(this.__voiceTypeConvert.toType(cursorQuery.getString(columnIndexOrThrow4)));
                voiceRecorderEntity.setStartTime(this.__dateConvert.toDate(cursorQuery.isNull(columnIndexOrThrow5) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow5))));
                voiceRecorderEntity.setFilePath(cursorQuery.getString(columnIndexOrThrow6));
                voiceRecorderEntity.setUploaded(cursorQuery.getInt(columnIndexOrThrow7) != 0);
                arrayList.add(voiceRecorderEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.snore.core.db.dao.VoiceRecorderDao
    public int update(final VoiceRecorderEntity... entity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int iHandleMultiple = this.__updateAdapterOfVoiceRecorderEntity.handleMultiple(entity) + 0;
            this.__db.setTransactionSuccessful();
            return iHandleMultiple;
        } finally {
            this.__db.endTransaction();
        }
    }
}
