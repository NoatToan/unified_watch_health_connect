package com.huami.assistant.ui.v2.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huami/assistant/ui/v2/db/MigrationHelper;", "", "", "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "a", "Landroidx/room/migration/Migration;", "MIGRATION_1_2", "b", "MIGRATION_2_3", "c", "MIGRATION_3_4", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class MigrationHelper {

    @NotNull
    public static final MigrationHelper INSTANCE = new MigrationHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: com.huami.assistant.ui.v2.db.MigrationHelper$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE schedule_event_model (id INTEGER PRIMARY KEY NOT NULL, event_sync_id TEXT NOT NULL, schedule_id INTEGER NOT NULL, title TEXT NOT NULL, summary TEXT NOT NULL, start_time INTEGER NOT NULL,stop_time INTEGER NOT NULL, repeat_mode INTEGER NOT NULL, repeat_stop_time INTEGER NOT NULL, alert_time INTEGER NOT NULL, is_all_day_event INTEGER NOT NULL)");
        }
    };

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.huami.assistant.ui.v2.db.MigrationHelper$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE schedule_model ADD COLUMN address TEXT NOT NULL DEFAULT ''");
        }
    };

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Migration MIGRATION_3_4 = new Migration() { // from class: com.huami.assistant.ui.v2.db.MigrationHelper$MIGRATION_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE vocation_model (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , requestTimestampInMs INTEGER NOT NULL DEFAULT 0, code TEXT NOT NULL DEFAULT '', year TEXT NOT NULL , isVocation INTEGER NOT NULL DEFAULT 0, date TEXT NOT NULL)");
        }
    };

    private MigrationHelper() {
    }

    @NotNull
    public final Migration[] getMigrations() {
        return new Migration[]{MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4};
    }
}
