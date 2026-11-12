package defpackage;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes21.dex */
public class rq extends Migration {
    public rq() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `analytics_event` ADD COLUMN `link_type` TEXT DEFAULT NULL");
    }
}
