package com.huami.watchfacesstore.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes17.dex */
public final class WatchFaceDao_Impl implements WatchFaceDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<WatchFaceInfo> b;
    private final EntityDeletionOrUpdateAdapter<WatchFaceInfo> c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;

    public class a extends EntityInsertionAdapter<WatchFaceInfo> {
        public a(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WatchFaceInfo watchFaceInfo) {
            supportSQLiteStatement.bindLong(1, watchFaceInfo.getId());
            if (watchFaceInfo.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, watchFaceInfo.getName());
            }
            if (watchFaceInfo.getDescription() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, watchFaceInfo.getDescription());
            }
            supportSQLiteStatement.bindDouble(4, watchFaceInfo.getRating());
            supportSQLiteStatement.bindLong(5, watchFaceInfo.getPrice());
            supportSQLiteStatement.bindLong(6, watchFaceInfo.getCustomizable() ? 1L : 0L);
            supportSQLiteStatement.bindLong(7, watchFaceInfo.isFree() ? 1L : 0L);
            if (watchFaceInfo.getThumbnailImgPath() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, watchFaceInfo.getThumbnailImgPath());
            }
            if (watchFaceInfo.getDialPath() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, watchFaceInfo.getDialPath());
            }
            if (watchFaceInfo.getTransBackgroundPath() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, watchFaceInfo.getTransBackgroundPath());
            }
            if (watchFaceInfo.getGifPath() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, watchFaceInfo.getGifPath());
            }
            if (watchFaceInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, watchFaceInfo.getDeviceId());
            }
            if (watchFaceInfo.getMinimumFirmwareVersion() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, watchFaceInfo.getMinimumFirmwareVersion());
            }
            supportSQLiteStatement.bindLong(14, watchFaceInfo.getSize());
            supportSQLiteStatement.bindLong(15, watchFaceInfo.getCreateTime());
            if (watchFaceInfo.getBgPath() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, watchFaceInfo.getBgPath());
            }
            if (watchFaceInfo.getColor() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, watchFaceInfo.getColor().intValue());
            }
            if (watchFaceInfo.getPublisherId() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindLong(18, watchFaceInfo.getPublisherId().intValue());
            }
            if (watchFaceInfo.getVersion() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, watchFaceInfo.getVersion());
            }
            supportSQLiteStatement.bindDouble(20, watchFaceInfo.getRealPrice());
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR ABORT INTO `WatchFaceInfo` (`id`,`name`,`description`,`rating`,`price`,`customizable`,`is_free`,`thumbnail_image_path`,`dial_path`,`transparent_background_path`,`gif_img_path`,`device_id`,`minimum_firmware_version`,`size`,`create_time`,`bg_path`,`color`,`publisher_id`,`version`,`real_price`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class b extends EntityDeletionOrUpdateAdapter<WatchFaceInfo> {
        public b(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WatchFaceInfo watchFaceInfo) {
            supportSQLiteStatement.bindLong(1, watchFaceInfo.getId());
            if (watchFaceInfo.getName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, watchFaceInfo.getName());
            }
            if (watchFaceInfo.getDescription() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, watchFaceInfo.getDescription());
            }
            supportSQLiteStatement.bindDouble(4, watchFaceInfo.getRating());
            supportSQLiteStatement.bindLong(5, watchFaceInfo.getPrice());
            supportSQLiteStatement.bindLong(6, watchFaceInfo.getCustomizable() ? 1L : 0L);
            supportSQLiteStatement.bindLong(7, watchFaceInfo.isFree() ? 1L : 0L);
            if (watchFaceInfo.getThumbnailImgPath() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, watchFaceInfo.getThumbnailImgPath());
            }
            if (watchFaceInfo.getDialPath() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, watchFaceInfo.getDialPath());
            }
            if (watchFaceInfo.getTransBackgroundPath() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, watchFaceInfo.getTransBackgroundPath());
            }
            if (watchFaceInfo.getGifPath() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, watchFaceInfo.getGifPath());
            }
            if (watchFaceInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, watchFaceInfo.getDeviceId());
            }
            if (watchFaceInfo.getMinimumFirmwareVersion() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, watchFaceInfo.getMinimumFirmwareVersion());
            }
            supportSQLiteStatement.bindLong(14, watchFaceInfo.getSize());
            supportSQLiteStatement.bindLong(15, watchFaceInfo.getCreateTime());
            if (watchFaceInfo.getBgPath() == null) {
                supportSQLiteStatement.bindNull(16);
            } else {
                supportSQLiteStatement.bindString(16, watchFaceInfo.getBgPath());
            }
            if (watchFaceInfo.getColor() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, watchFaceInfo.getColor().intValue());
            }
            if (watchFaceInfo.getPublisherId() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindLong(18, watchFaceInfo.getPublisherId().intValue());
            }
            if (watchFaceInfo.getVersion() == null) {
                supportSQLiteStatement.bindNull(19);
            } else {
                supportSQLiteStatement.bindString(19, watchFaceInfo.getVersion());
            }
            supportSQLiteStatement.bindDouble(20, watchFaceInfo.getRealPrice());
            supportSQLiteStatement.bindLong(21, watchFaceInfo.getId());
            if (watchFaceInfo.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, watchFaceInfo.getDeviceId());
            }
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `WatchFaceInfo` SET `id` = ?,`name` = ?,`description` = ?,`rating` = ?,`price` = ?,`customizable` = ?,`is_free` = ?,`thumbnail_image_path` = ?,`dial_path` = ?,`transparent_background_path` = ?,`gif_img_path` = ?,`device_id` = ?,`minimum_firmware_version` = ?,`size` = ?,`create_time` = ?,`bg_path` = ?,`color` = ?,`publisher_id` = ?,`version` = ?,`real_price` = ? WHERE `id` = ? AND `device_id` = ?";
        }
    }

    public class c extends SharedSQLiteStatement {
        public c(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE WatchFaceInfo SET bg_path = ? WHERE device_id = ? AND id = ?";
        }
    }

    public class d extends SharedSQLiteStatement {
        public d(RoomDatabase database) {
            super(database);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE WatchFaceInfo SET color = ? WHERE device_id = ? AND id = ?";
        }
    }

    public class e implements Callable<List<WatchFaceInfo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public e(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WatchFaceInfo> call() throws Exception {
            e eVar;
            Cursor cursorQuery = DBUtil.query(WatchFaceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rating");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.PRICE);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customizable");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_free");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "thumbnail_image_path");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dial_path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transparent_background_path");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gif_img_path");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "device_id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_firmware_version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "create_time");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bg_path");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "color");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "publisher_id");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "real_price");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i2 = cursorQuery.getInt(columnIndexOrThrow);
                        String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        float f = cursorQuery.getFloat(columnIndexOrThrow4);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow5);
                        boolean z = cursorQuery.getInt(columnIndexOrThrow6) != 0;
                        boolean z2 = cursorQuery.getInt(columnIndexOrThrow7) != 0;
                        String string3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        String string4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        String string5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                        String string6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                        String string7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                        String string8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                        int i4 = cursorQuery.getInt(i);
                        int i5 = columnIndexOrThrow;
                        int i6 = columnIndexOrThrow15;
                        long j = cursorQuery.getLong(i6);
                        columnIndexOrThrow15 = i6;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        String string9 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                        Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17));
                        Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow18) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow18));
                        String string10 = cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow20);
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        arrayList.add(new WatchFaceInfo(i2, string, string2, f, i3, z, z2, string3, string4, string5, string6, string7, string8, i4, j, string9, numValueOf, numValueOf2, string10, f2));
                        columnIndexOrThrow = i5;
                        i = i;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    eVar = this;
                    cursorQuery.close();
                    eVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                eVar = this;
            }
        }
    }

    public class f implements Callable<WatchFaceInfo> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public f(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchFaceInfo call() throws Exception {
            WatchFaceInfo watchFaceInfo;
            f fVar = this;
            Cursor cursorQuery = DBUtil.query(WatchFaceDao_Impl.this.a, fVar.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rating");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.PRICE);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customizable");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_free");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "thumbnail_image_path");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dial_path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transparent_background_path");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gif_img_path");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "device_id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_firmware_version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "create_time");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bg_path");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "color");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "publisher_id");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "real_price");
                    if (cursorQuery.moveToFirst()) {
                        watchFaceInfo = new WatchFaceInfo(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6) != 0, cursorQuery.getInt(columnIndexOrThrow7) != 0, cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.getLong(columnIndexOrThrow15), cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16), cursorQuery.isNull(r18) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17)), cursorQuery.isNull(r19) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow18)), cursorQuery.isNull(r20) ? null : cursorQuery.getString(columnIndexOrThrow19), cursorQuery.getFloat(columnIndexOrThrow20));
                    } else {
                        watchFaceInfo = null;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return watchFaceInfo;
                } catch (Throwable th) {
                    th = th;
                    fVar = this;
                    cursorQuery.close();
                    fVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public class g implements Callable<List<WatchFaceInfo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public g(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WatchFaceInfo> call() throws Exception {
            g gVar;
            Cursor cursorQuery = DBUtil.query(WatchFaceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rating");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.PRICE);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customizable");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_free");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "thumbnail_image_path");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dial_path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transparent_background_path");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gif_img_path");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "device_id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_firmware_version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
                try {
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "create_time");
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bg_path");
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "color");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "publisher_id");
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "real_price");
                    int i = columnIndexOrThrow14;
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i2 = cursorQuery.getInt(columnIndexOrThrow);
                        String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        float f = cursorQuery.getFloat(columnIndexOrThrow4);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow5);
                        boolean z = cursorQuery.getInt(columnIndexOrThrow6) != 0;
                        boolean z2 = cursorQuery.getInt(columnIndexOrThrow7) != 0;
                        String string3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        String string4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        String string5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                        String string6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                        String string7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                        String string8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                        int i4 = cursorQuery.getInt(i);
                        int i5 = columnIndexOrThrow;
                        int i6 = columnIndexOrThrow15;
                        long j = cursorQuery.getLong(i6);
                        columnIndexOrThrow15 = i6;
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        String string9 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                        Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17));
                        Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow18) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow18));
                        String string10 = cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow20);
                        columnIndexOrThrow20 = columnIndexOrThrow20;
                        arrayList.add(new WatchFaceInfo(i2, string, string2, f, i3, z, z2, string3, string4, string5, string6, string7, string8, i4, j, string9, numValueOf, numValueOf2, string10, f2));
                        columnIndexOrThrow = i5;
                        i = i;
                    }
                    cursorQuery.close();
                    this.a.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    gVar = this;
                    cursorQuery.close();
                    gVar.a.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gVar = this;
            }
        }
    }

    public class h implements Callable<List<WatchFaceInfo>> {
        public final /* synthetic */ RoomSQLiteQuery a;

        public h(final RoomSQLiteQuery val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<WatchFaceInfo> call() throws Exception {
            Cursor cursorQuery = DBUtil.query(WatchFaceDao_Impl.this.a, this.a, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "description");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "rating");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.PRICE);
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "customizable");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_free");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "thumbnail_image_path");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dial_path");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transparent_background_path");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gif_img_path");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "device_id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_firmware_version");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "size");
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "create_time");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bg_path");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "color");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "publisher_id");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "version");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "real_price");
                int i = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i2 = cursorQuery.getInt(columnIndexOrThrow);
                    String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                    String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                    float f = cursorQuery.getFloat(columnIndexOrThrow4);
                    int i3 = cursorQuery.getInt(columnIndexOrThrow5);
                    boolean z = cursorQuery.getInt(columnIndexOrThrow6) != 0;
                    boolean z2 = cursorQuery.getInt(columnIndexOrThrow7) != 0;
                    String string3 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                    String string4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                    String string5 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                    String string6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                    String string7 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                    String string8 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                    int i4 = cursorQuery.getInt(i);
                    int i5 = columnIndexOrThrow;
                    int i6 = columnIndexOrThrow15;
                    long j = cursorQuery.getLong(i6);
                    columnIndexOrThrow15 = i6;
                    columnIndexOrThrow16 = columnIndexOrThrow16;
                    String string9 = cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16);
                    Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow17) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow17));
                    Integer numValueOf2 = cursorQuery.isNull(columnIndexOrThrow18) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow18));
                    String string10 = cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19);
                    float f2 = cursorQuery.getFloat(columnIndexOrThrow20);
                    columnIndexOrThrow20 = columnIndexOrThrow20;
                    arrayList.add(new WatchFaceInfo(i2, string, string2, f, i3, z, z2, string3, string4, string5, string6, string7, string8, i4, j, string9, numValueOf, numValueOf2, string10, f2));
                    columnIndexOrThrow = i5;
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

    public WatchFaceDao_Impl(RoomDatabase __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
        this.e = new d(__db);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public int deleteWatchFaceInfoByDevice(final List<String> deviceIds) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM WatchFaceInfo WHERE device_id IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, deviceIds.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (String str : deviceIds) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i, str);
            }
            i++;
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public int deleteWatchFaceInfoByIds(final String deviceId, final int[] ids) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM WatchFaceInfo WHERE id IN (");
        int length = ids.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND device_id = ");
        sbNewStringBuilder.append("?");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.a.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (int i2 : ids) {
            supportSQLiteStatementCompileStatement.bindLong(i, i2);
            i++;
        }
        int i3 = length + 1;
        if (deviceId == null) {
            supportSQLiteStatementCompileStatement.bindNull(i3);
        } else {
            supportSQLiteStatementCompileStatement.bindString(i3, deviceId);
        }
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public Object getWatchFaceDetailInfo(final String deviceId, final int watchFaceId, final Continuation<? super WatchFaceInfo> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM WatchFaceInfo WHERE device_id = ? AND id = ?", 2);
        if (deviceId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, deviceId);
        }
        roomSQLiteQueryAcquire.bindLong(2, watchFaceId);
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new f(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public Object getWatchFaceInfo(final String deviceId, final Continuation<? super List<WatchFaceInfo>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM WatchFaceInfo WHERE device_id = ? ORDER BY create_time DESC", 1);
        if (deviceId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, deviceId);
        }
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new e(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public Flow<List<WatchFaceInfo>> getWatchFaceInfoFlow(final String deviceId) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM WatchFaceInfo WHERE device_id = ? ORDER BY create_time DESC", 1);
        if (deviceId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, deviceId);
        }
        return CoroutinesRoom.createFlow(this.a, false, new String[]{"WatchFaceInfo"}, new h(roomSQLiteQueryAcquire));
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public void insertWatchInfo(final WatchFaceInfo... infos) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(infos);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public Object queryInfoByIds(final String deviceId, final List<Integer> ids, final Continuation<? super List<WatchFaceInfo>> continuation) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM WatchFaceInfo WHERE device_id = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND id IN (");
        int size = ids.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size + 1);
        if (deviceId == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, deviceId);
        }
        int i = 2;
        for (Integer num : ids) {
            if (num == null) {
                roomSQLiteQueryAcquire.bindNull(i);
            } else {
                roomSQLiteQueryAcquire.bindLong(i, num.intValue());
            }
            i++;
        }
        return CoroutinesRoom.execute(this.a, false, DBUtil.createCancellationSignal(), new g(roomSQLiteQueryAcquire), continuation);
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public int updateWatchFaceBgPath(final String deviceId, final int watchFaceId, final String bgPath) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.d.acquire();
        if (bgPath == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, bgPath);
        }
        if (deviceId == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, deviceId);
        }
        supportSQLiteStatementAcquire.bindLong(3, watchFaceId);
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

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public int updateWatchFaceColor(final String deviceId, final int watchFaceId, final Integer color) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.e.acquire();
        if (color == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, color.intValue());
        }
        if (deviceId == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, deviceId);
        }
        supportSQLiteStatementAcquire.bindLong(3, watchFaceId);
        this.a.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.a.endTransaction();
            this.e.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // com.huami.watchfacesstore.room.WatchFaceDao
    public int updateWatchFaceInfo(final WatchFaceInfo info) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            int iHandle = this.c.handle(info) + 0;
            this.a.setTransactionSuccessful();
            return iHandle;
        } finally {
            this.a.endTransaction();
        }
    }
}
