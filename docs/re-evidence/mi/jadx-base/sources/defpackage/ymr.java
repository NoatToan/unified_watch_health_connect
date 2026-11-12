package defpackage;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class ymr extends Migration {
    public ymr() {
        super(22, 23);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
