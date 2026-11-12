package defpackage;

import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.braintreepayments.api.AnalyticsDatabase;

/* JADX INFO: loaded from: classes21.dex */
public class rs extends Migration {
    private final AutoMigrationSpec d;

    public rs() {
        super(6, 7);
        this.d = new AnalyticsDatabase.DeleteAnalyticsEventTableAutoMigration();
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("DROP TABLE `analytics_event`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `analytics_event_blob` (`json_string` TEXT NOT NULL, `_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        this.d.onPostMigrate(supportSQLiteDatabase);
    }
}
