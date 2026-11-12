package com.huami.training.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\b\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/room/migration/Migration;", "a", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_1_2", "b", "getMIGRATION_2_3", "MIGRATION_2_3", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class MigrationsKt {

    @NotNull
    private static final Migration a = new Migration() { // from class: com.huami.training.db.MigrationsKt$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("\n            CREATE TABLE IF NOT EXISTS `UserCourse` (\n                 `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                 `courseId` INTEGER NOT NULL,\n                 `userId` TEXT NOT NULL\n            )\n        ");
            database.execSQL("\n           CREATE UNIQUE INDEX `index_UserCourse_courseId_userId`\n           ON `UserCourse` (`courseId`, `userId`)\n        ");
        }
    };

    @NotNull
    private static final Migration b = new Migration() { // from class: com.huami.training.db.MigrationsKt$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("\n            DROP INDEX `index_Promotion_trainingId`\n        ");
            database.execSQL("\n            CREATE UNIQUE INDEX `index_Promotion_promotePlace_trainingId` ON `Promotion` (`promotePlace`, `trainingId`)\n        ");
        }
    };

    @NotNull
    public static final Migration getMIGRATION_1_2() {
        return a;
    }

    @NotNull
    public static final Migration getMIGRATION_2_3() {
        return b;
    }
}
