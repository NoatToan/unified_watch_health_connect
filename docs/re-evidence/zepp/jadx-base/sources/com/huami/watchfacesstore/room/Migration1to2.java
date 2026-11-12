package com.huami.watchfacesstore.room;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/room/Migration1to2;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "migrate", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Migration1to2 extends Migration {
    public Migration1to2() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase database) {
        database.execSQL("CREATE TABLE IF NOT EXISTS `WatchFaceInfoNew` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `rating` REAL NOT NULL, `price` INTEGER NOT NULL, `customizable` INTEGER NOT NULL, `is_free` INTEGER NOT NULL, `thumbnail_image_path` TEXT, `dial_path` TEXT NOT NULL, `transparent_background_path` TEXT, `gif_img_path` TEXT, `device_id` TEXT NOT NULL, `minimum_firmware_version` TEXT NOT NULL, `size` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `bg_path` TEXT, `color` INTEGER, PRIMARY KEY(`id`, `device_id`))");
        database.execSQL("INSERT INTO WatchFaceInfoNew SELECT * FROM WatchFaceInfo");
        database.execSQL("DROP TABLE WatchFaceInfo");
        database.execSQL("ALTER TABLE WatchFaceInfoNew RENAME TO WatchFaceInfo");
    }
}
