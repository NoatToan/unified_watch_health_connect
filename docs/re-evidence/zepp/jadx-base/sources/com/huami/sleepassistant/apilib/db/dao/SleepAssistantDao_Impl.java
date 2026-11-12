package com.huami.sleepassistant.apilib.db.dao;

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
import com.huami.sleepassistant.apilib.bean.UpdateCollection;
import com.huami.sleepassistant.apilib.db.po.LiveMusic;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.utils.WebConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class SleepAssistantDao_Impl extends SleepAssistantDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<Music> b;
    private final EntityInsertionAdapter<Music> c;
    private final EntityInsertionAdapter<LiveMusic> d;
    private final EntityDeletionOrUpdateAdapter<Music> e;
    private final EntityDeletionOrUpdateAdapter<LiveMusic> f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;

    public class a extends DataSource.Factory<Integer, Music> {
        public final /* synthetic */ RoomSQLiteQuery a;

        /* JADX INFO: renamed from: com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao_Impl$a$a, reason: collision with other inner class name */
        public class C0592a extends LimitOffsetDataSource<Music> {
            public C0592a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, z2, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<Music> convertRows(Cursor cursor) {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor2, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor2, "whetherPay");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor2, "goodsId");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor2, "scIntroduction");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor2, "supportDevices");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor2, "deliveryApps");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor2, "deliveryTime");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor2, "expiredTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursor2, "languages");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursor2, "simpleChinese");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursor2, "bigImgUrl");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursor2, "smallImgUrl");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursor2, "audioUrl");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursor2, "sort");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursor2, "ispresence");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursor2, "playAddress");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursor2, "isPlay");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursor2, "progress");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = null;
                    String string2 = cursor2.isNull(columnIndexOrThrow) ? null : cursor2.getString(columnIndexOrThrow);
                    int i2 = cursor2.getInt(columnIndexOrThrow2);
                    String string3 = cursor2.isNull(columnIndexOrThrow3) ? null : cursor2.getString(columnIndexOrThrow3);
                    String string4 = cursor2.isNull(columnIndexOrThrow4) ? null : cursor2.getString(columnIndexOrThrow4);
                    String string5 = cursor2.isNull(columnIndexOrThrow5) ? null : cursor2.getString(columnIndexOrThrow5);
                    String string6 = cursor2.isNull(columnIndexOrThrow6) ? null : cursor2.getString(columnIndexOrThrow6);
                    String string7 = cursor2.isNull(columnIndexOrThrow7) ? null : cursor2.getString(columnIndexOrThrow7);
                    String string8 = cursor2.isNull(columnIndexOrThrow8) ? null : cursor2.getString(columnIndexOrThrow8);
                    String string9 = cursor2.isNull(columnIndexOrThrow9) ? null : cursor2.getString(columnIndexOrThrow9);
                    String string10 = cursor2.isNull(columnIndexOrThrow10) ? null : cursor2.getString(columnIndexOrThrow10);
                    String string11 = cursor2.isNull(columnIndexOrThrow11) ? null : cursor2.getString(columnIndexOrThrow11);
                    String string12 = cursor2.isNull(columnIndexOrThrow12) ? null : cursor2.getString(columnIndexOrThrow12);
                    String string13 = cursor2.isNull(columnIndexOrThrow13) ? null : cursor2.getString(columnIndexOrThrow13);
                    int i3 = cursor2.getInt(i);
                    int i4 = columnIndexOrThrow;
                    int i5 = cursor2.getInt(columnIndexOrThrow15);
                    int i6 = columnIndexOrThrow16;
                    if (!cursor2.isNull(i6)) {
                        string = cursor2.getString(i6);
                    }
                    columnIndexOrThrow16 = i6;
                    int i7 = columnIndexOrThrow17;
                    columnIndexOrThrow17 = i7;
                    arrayList.add(new Music(string2, i2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, i3, i5, string, cursor2.getInt(i7), cursor2.getInt(columnIndexOrThrow18)));
                    cursor2 = cursor;
                    columnIndexOrThrow = i4;
                    i = i;
                }
                return arrayList;
            }
        }

        public a(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, Music> create() {
            return new C0592a(SleepAssistantDao_Impl.this.a, this.a, false, true, "Music");
        }
    }

    public class b implements Callable<List<Music>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Music> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(SleepAssistantDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "whetherPay");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "goodsId");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scIntroduction");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "supportDevices");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryApps");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryTime");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiredTime");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "languages");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "simpleChinese");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bigImgUrl");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "smallImgUrl");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "audioUrl");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sort");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ispresence");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "playAddress");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPlay");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    int i2 = cursorQuery.getInt(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                    String string6 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string7 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string8 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    String string9 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                    String string11 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                    String string12 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    int i3 = cursorQuery.getInt(i);
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow15;
                    int i6 = cursorQuery.getInt(i5);
                    columnIndexOrThrow15 = i5;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    String string13 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                    int i7 = cursorQuery.getInt(columnIndexOrThrow17);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i8 = columnIndexOrThrow18;
                    columnIndexOrThrow18 = i8;
                    arrayList.add(new Music(string, i2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, i3, i6, string13, i7, cursorQuery.getInt(i8)));
                    columnIndexOrThrow = i4;
                    i = i;
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

    public class c extends DataSource.Factory<Integer, LiveMusic> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public class a extends LimitOffsetDataSource<LiveMusic> {
            public a(RoomDatabase roomDatabase, RoomSQLiteQuery roomSQLiteQuery, boolean z, boolean z2, String... strArr) {
                super(roomDatabase, roomSQLiteQuery, z, z2, strArr);
            }

            @Override // androidx.room.paging.LimitOffsetDataSource
            public List<LiveMusic> convertRows(Cursor cursor) {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursor, "sid");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursor, "userId");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursor, "name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursor, "description");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursor, WebConst.QueryParam.PLAY_TIME);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursor, "itemImgUrl");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursor, "isDown");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursor, "progress");
                ArrayList arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    arrayList.add(new LiveMusic(cursor.isNull(columnIndexOrThrow) ? null : cursor.getString(columnIndexOrThrow), cursor.isNull(columnIndexOrThrow2) ? null : cursor.getString(columnIndexOrThrow2), cursor.isNull(columnIndexOrThrow3) ? null : cursor.getString(columnIndexOrThrow3), cursor.isNull(columnIndexOrThrow4) ? null : cursor.getString(columnIndexOrThrow4), cursor.getInt(columnIndexOrThrow5), cursor.isNull(columnIndexOrThrow6) ? null : cursor.getString(columnIndexOrThrow6), cursor.getInt(columnIndexOrThrow7) != 0, cursor.getInt(columnIndexOrThrow8)));
                }
                return arrayList;
            }
        }

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.a = roomSQLiteQuery;
        }

        @Override // androidx.paging.DataSource.Factory
        public DataSource<Integer, LiveMusic> create() {
            return new a(SleepAssistantDao_Impl.this.a, this.a, false, true, "LiveMusic");
        }
    }

    public class d extends EntityInsertionAdapter<Music> {
        public d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Music music) {
            if (music.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, music.getId());
            }
            supportSQLiteStatement.bindLong(2, music.getWhetherPay());
            if (music.getGoodsId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, music.getGoodsId());
            }
            if (music.getScIntroduction() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, music.getScIntroduction());
            }
            if (music.getSupportDevices() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, music.getSupportDevices());
            }
            if (music.getDeliveryApps() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, music.getDeliveryApps());
            }
            if (music.getDeliveryTime() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, music.getDeliveryTime());
            }
            if (music.getExpiredTime() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, music.getExpiredTime());
            }
            if (music.getLanguages() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, music.getLanguages());
            }
            if (music.getSimpleChinese() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, music.getSimpleChinese());
            }
            if (music.getBigImgUrl() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, music.getBigImgUrl());
            }
            if (music.getSmallImgUrl() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, music.getSmallImgUrl());
            }
            if (music.getAudioUrl() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, music.getAudioUrl());
            }
            supportSQLiteStatement.bindLong(14, music.getSort());
            supportSQLiteStatement.bindLong(15, music.getIspresence());
            if (music.getPlayAddress() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, music.getPlayAddress());
            }
            supportSQLiteStatement.bindLong(17, music.isPlay());
            supportSQLiteStatement.bindLong(18, music.getProgress());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Music` (`id`,`whetherPay`,`goodsId`,`scIntroduction`,`supportDevices`,`deliveryApps`,`deliveryTime`,`expiredTime`,`languages`,`simpleChinese`,`bigImgUrl`,`smallImgUrl`,`audioUrl`,`sort`,`ispresence`,`playAddress`,`isPlay`,`progress`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class e extends EntityInsertionAdapter<Music> {
        public e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Music music) {
            if (music.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, music.getId());
            }
            supportSQLiteStatement.bindLong(2, music.getWhetherPay());
            if (music.getGoodsId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, music.getGoodsId());
            }
            if (music.getScIntroduction() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, music.getScIntroduction());
            }
            if (music.getSupportDevices() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, music.getSupportDevices());
            }
            if (music.getDeliveryApps() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, music.getDeliveryApps());
            }
            if (music.getDeliveryTime() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, music.getDeliveryTime());
            }
            if (music.getExpiredTime() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, music.getExpiredTime());
            }
            if (music.getLanguages() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, music.getLanguages());
            }
            if (music.getSimpleChinese() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, music.getSimpleChinese());
            }
            if (music.getBigImgUrl() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, music.getBigImgUrl());
            }
            if (music.getSmallImgUrl() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, music.getSmallImgUrl());
            }
            if (music.getAudioUrl() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, music.getAudioUrl());
            }
            supportSQLiteStatement.bindLong(14, music.getSort());
            supportSQLiteStatement.bindLong(15, music.getIspresence());
            if (music.getPlayAddress() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, music.getPlayAddress());
            }
            supportSQLiteStatement.bindLong(17, music.isPlay());
            supportSQLiteStatement.bindLong(18, music.getProgress());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Music` (`id`,`whetherPay`,`goodsId`,`scIntroduction`,`supportDevices`,`deliveryApps`,`deliveryTime`,`expiredTime`,`languages`,`simpleChinese`,`bigImgUrl`,`smallImgUrl`,`audioUrl`,`sort`,`ispresence`,`playAddress`,`isPlay`,`progress`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class f extends EntityInsertionAdapter<LiveMusic> {
        public f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LiveMusic liveMusic) {
            if (liveMusic.getSid() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, liveMusic.getSid());
            }
            if (liveMusic.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, liveMusic.getUserId());
            }
            if (liveMusic.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, liveMusic.getName());
            }
            if (liveMusic.getDescription() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, liveMusic.getDescription());
            }
            supportSQLiteStatement.bindLong(5, liveMusic.getPlayTime());
            if (liveMusic.getItemImgUrl() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, liveMusic.getItemImgUrl());
            }
            supportSQLiteStatement.bindLong(7, liveMusic.isDown() ? 1L : 0L);
            supportSQLiteStatement.bindLong(8, liveMusic.getProgress());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `LiveMusic` (`sid`,`userId`,`name`,`description`,`playTime`,`itemImgUrl`,`isDown`,`progress`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public class g extends EntityDeletionOrUpdateAdapter<Music> {
        public g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, Music music) {
            if (music.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, music.getId());
            }
            supportSQLiteStatement.bindLong(2, music.getWhetherPay());
            if (music.getGoodsId() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, music.getGoodsId());
            }
            if (music.getScIntroduction() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, music.getScIntroduction());
            }
            if (music.getSupportDevices() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, music.getSupportDevices());
            }
            if (music.getDeliveryApps() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, music.getDeliveryApps());
            }
            if (music.getDeliveryTime() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, music.getDeliveryTime());
            }
            if (music.getExpiredTime() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, music.getExpiredTime());
            }
            if (music.getLanguages() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, music.getLanguages());
            }
            if (music.getSimpleChinese() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, music.getSimpleChinese());
            }
            if (music.getBigImgUrl() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, music.getBigImgUrl());
            }
            if (music.getSmallImgUrl() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, music.getSmallImgUrl());
            }
            if (music.getAudioUrl() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, music.getAudioUrl());
            }
            supportSQLiteStatement.bindLong(14, music.getSort());
            supportSQLiteStatement.bindLong(15, music.getIspresence());
            if (music.getPlayAddress() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, music.getPlayAddress());
            }
            supportSQLiteStatement.bindLong(17, music.isPlay());
            supportSQLiteStatement.bindLong(18, music.getProgress());
            if (music.getId() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, music.getId());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `Music` SET `id` = ?,`whetherPay` = ?,`goodsId` = ?,`scIntroduction` = ?,`supportDevices` = ?,`deliveryApps` = ?,`deliveryTime` = ?,`expiredTime` = ?,`languages` = ?,`simpleChinese` = ?,`bigImgUrl` = ?,`smallImgUrl` = ?,`audioUrl` = ?,`sort` = ?,`ispresence` = ?,`playAddress` = ?,`isPlay` = ?,`progress` = ? WHERE `id` = ?";
        }
    }

    public class h extends EntityDeletionOrUpdateAdapter<LiveMusic> {
        public h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, LiveMusic liveMusic) {
            if (liveMusic.getSid() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, liveMusic.getSid());
            }
            if (liveMusic.getUserId() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, liveMusic.getUserId());
            }
            if (liveMusic.getName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, liveMusic.getName());
            }
            if (liveMusic.getDescription() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, liveMusic.getDescription());
            }
            supportSQLiteStatement.bindLong(5, liveMusic.getPlayTime());
            if (liveMusic.getItemImgUrl() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, liveMusic.getItemImgUrl());
            }
            supportSQLiteStatement.bindLong(7, liveMusic.isDown() ? 1L : 0L);
            supportSQLiteStatement.bindLong(8, liveMusic.getProgress());
            if (liveMusic.getSid() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, liveMusic.getSid());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `LiveMusic` SET `sid` = ?,`userId` = ?,`name` = ?,`description` = ?,`playTime` = ?,`itemImgUrl` = ?,`isDown` = ?,`progress` = ? WHERE `sid` = ?";
        }
    }

    public class i extends SharedSQLiteStatement {
        public i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE From Music";
        }
    }

    public class j extends SharedSQLiteStatement {
        public j(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE From LiveMusic";
        }
    }

    public class k extends SharedSQLiteStatement {
        public k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE From LiveMusic WHERE sid =?";
        }
    }

    public class l extends SharedSQLiteStatement {
        public l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "delete from LiveMusic";
        }
    }

    public SleepAssistantDao_Impl(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new d(roomDatabase);
        this.c = new e(roomDatabase);
        this.d = new f(roomDatabase);
        this.e = new g(roomDatabase);
        this.f = new h(roomDatabase);
        this.g = new i(roomDatabase);
        this.h = new j(roomDatabase);
        this.i = new k(roomDatabase);
        this.j = new l(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void clean() {
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

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public int deleteLiveMusic(String str) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.i.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.i.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void deleteLiveMusicListItems() {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.h.acquire();
        this.a.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.h.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void deleteMusicListItems() {
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

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<Long> insertLiveMusic(List<LiveMusic> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.d.insertAndReturnIdsList(list);
            this.a.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<Long> insertMusic(List<Music> list) {
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

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void insertOrReplaceMusic(Music music) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.insert(music);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void insertOrUpdateLiveMusic(List<LiveMusic> list) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateLiveMusic(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void insertOrUpdateMusic(List<Music> list) {
        this.a.beginTransaction();
        try {
            super.insertOrUpdateMusic(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<LiveMusic> queryLiveMusic() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM LiveMusic", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sid");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.PLAY_TIME);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemImgUrl");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isDown");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new LiveMusic(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7) != 0, cursorQuery.getInt(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<LiveMusic> queryLiveMusicIn(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM LiveMusic WHERE sid in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str);
            }
            i2++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sid");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.PLAY_TIME);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemImgUrl");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isDown");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new LiveMusic(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7) != 0, cursorQuery.getInt(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public DataSource.Factory<Integer, LiveMusic> queryLiveMusicListItemsByPaging() {
        return new c(RoomSQLiteQuery.acquire("SELECT * FROM LiveMusic", 0));
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public LiveData<List<Music>> queryMusicDataList() {
        return this.a.getInvalidationTracker().createLiveData(new String[]{"Music"}, false, new b(RoomSQLiteQuery.acquire("SELECT * FROM Music", 0)));
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<Music> queryMusicIn(List<String> list) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM Music WHERE id in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 0);
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i2);
            } else {
                roomSQLiteQueryAcquire.bindString(i2, str);
            }
            i2++;
        }
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "whetherPay");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "goodsId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scIntroduction");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "supportDevices");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryApps");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryTime");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiredTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "languages");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "simpleChinese");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bigImgUrl");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "smallImgUrl");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "audioUrl");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sort");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ispresence");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "playAddress");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPlay");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    int i4 = cursorQuery.getInt(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                    String string6 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string7 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string8 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    String string9 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                    String string11 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                    String string12 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    int i5 = cursorQuery.getInt(i3);
                    int i6 = columnIndexOrThrow;
                    int i7 = columnIndexOrThrow15;
                    int i8 = cursorQuery.getInt(i7);
                    columnIndexOrThrow15 = i7;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    String string13 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                    int i9 = cursorQuery.getInt(columnIndexOrThrow17);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i10 = columnIndexOrThrow18;
                    columnIndexOrThrow18 = i10;
                    arrayList.add(new Music(string, i4, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, i5, i8, string13, i9, cursorQuery.getInt(i10)));
                    columnIndexOrThrow = i6;
                    i3 = i3;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public List<Music> queryMusicList() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM Music", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "whetherPay");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "goodsId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "scIntroduction");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "supportDevices");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryApps");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "deliveryTime");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiredTime");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "languages");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "simpleChinese");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bigImgUrl");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "smallImgUrl");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "audioUrl");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sort");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ispresence");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "playAddress");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPlay");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                    String string6 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                    String string7 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string8 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    String string9 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                    String string10 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                    String string11 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                    String string12 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    int i4 = cursorQuery.getInt(i2);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    int i7 = cursorQuery.getInt(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    String string13 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                    int i8 = cursorQuery.getInt(columnIndexOrThrow17);
                    columnIndexOrThrow17 = columnIndexOrThrow17;
                    int i9 = columnIndexOrThrow18;
                    columnIndexOrThrow18 = i9;
                    arrayList.add(new Music(string, i3, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, i4, i7, string13, i8, cursorQuery.getInt(i9)));
                    columnIndexOrThrow = i5;
                    i2 = i2;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public DataSource.Factory<Integer, Music> queryMusicListItemsByPaging() {
        return new a(RoomSQLiteQuery.acquire("SELECT * FROM Music", 0));
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public void updateLiveMusic(UpdateCollection updateCollection) {
        this.a.beginTransaction();
        try {
            super.updateLiveMusic(updateCollection);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public int updateLiveMusicItem(LiveMusic liveMusic) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.f.handle(liveMusic) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public int updateMusicItem(Music music) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.e.handle(music) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.sleepassistant.apilib.db.dao.SleepAssistantDao
    public LiveMusic queryLiveMusic(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * From LiveMusic WHERE sid =?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        LiveMusic liveMusic = null;
        Cursor cursorQuery = DBUtil.query(this.a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "sid");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, WebConst.QueryParam.PLAY_TIME);
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "itemImgUrl");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isDown");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "progress");
            if (cursorQuery.moveToFirst()) {
                liveMusic = new LiveMusic(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7) != 0, cursorQuery.getInt(columnIndexOrThrow8));
            }
            return liveMusic;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }
}
