package com.huami.watchfacesstore.room;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/watchfacesstore/room/Migration2to3;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "migrate", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Migration2to3 extends Migration {
    public Migration2to3() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase database) {
        database.execSQL("ALTER TABLE WatchFaceInfo ADD COLUMN `publisher_id` INTEGER");
        database.execSQL("CREATE TABLE IF NOT EXISTS `PublisherInfo` (`id` INTEGER NOT NULL, `name` TEXT, `icon` TEXT, `description` TEXT, PRIMARY KEY(`id`))");
    }
}
