package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public abstract class el1 extends RoomDatabase.Callback {
    protected static final String TAG = "DB_Trans";
    private final SharedPreferences mAsyncMigration;
    private volatile boolean mAsyncProcessing;
    private final Context mContext;

    public el1(Context context) {
        Objects.requireNonNull(context);
        this.mContext = context;
        this.mAsyncMigration = context.getSharedPreferences("async_migration", 0);
    }

    private String getDatabaseName(SupportSQLiteDatabase supportSQLiteDatabase) {
        String path = supportSQLiteDatabase.getPath();
        return path.substring(path.lastIndexOf(47));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performMigrateData$0(SupportSQLiteDatabase supportSQLiteDatabase) {
        Logger.i(TAG, "performMigrateData: " + getDatabaseName(supportSQLiteDatabase));
        onAsyncCreate(supportSQLiteDatabase);
        if (migrationOnce()) {
            this.mAsyncMigration.edit().putBoolean(getDatabaseName(supportSQLiteDatabase), true).apply();
        }
        this.mAsyncProcessing = false;
    }

    private void performMigrateData(final SupportSQLiteDatabase supportSQLiteDatabase) {
        this.mAsyncProcessing = true;
        ExecutorHelper.runInBackground(new Runnable() { // from class: dl1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15643a.lambda$performMigrateData$0(supportSQLiteDatabase);
            }
        });
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean isMigrateSucc(SupportSQLiteDatabase supportSQLiteDatabase) {
        return this.mAsyncMigration.getBoolean(getDatabaseName(supportSQLiteDatabase), false);
    }

    public boolean migrationOnce() {
        return true;
    }

    public abstract void onAsyncCreate(SupportSQLiteDatabase supportSQLiteDatabase);

    @Override // androidx.room.RoomDatabase.Callback
    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onCreate(supportSQLiteDatabase);
        Logger.i(TAG, "onCreate: " + getDatabaseName(supportSQLiteDatabase));
        performMigrateData(supportSQLiteDatabase);
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onOpen(supportSQLiteDatabase);
        Logger.i(TAG, "onOpen: " + getDatabaseName(supportSQLiteDatabase) + ",mAsyncProcessing = " + this.mAsyncProcessing + ",isMigrateSucc = " + isMigrateSucc(supportSQLiteDatabase));
        if (this.mAsyncProcessing) {
            return;
        }
        if (!migrationOnce()) {
            Logger.i(TAG, "onOpen: always migrate");
            performMigrateData(supportSQLiteDatabase);
        } else {
            if (isMigrateSucc(supportSQLiteDatabase)) {
                return;
            }
            Logger.i(TAG, "onOpen: migrate once");
            performMigrateData(supportSQLiteDatabase);
        }
    }
}
