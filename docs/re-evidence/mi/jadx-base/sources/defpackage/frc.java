package defpackage;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public interface frc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f18123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18124b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f18123a = timeUnit.toMillis(1L);
        f18124b = timeUnit.toMillis(3L);
    }

    default void deleteDbFile(String str) {
        if (FileUtils.isFileExists(str)) {
            SQLiteDatabase.deleteDatabase(new File(str));
            Logger.i("DB_Trans", "deleteDb: " + str);
        }
    }

    void doTransformation(SupportSQLiteDatabase supportSQLiteDatabase);
}
