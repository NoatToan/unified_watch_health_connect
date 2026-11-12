package rd2;

import android.database.sqlite.SQLiteDatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152072a = LoggerFactory.getLogger("DeviceDeleteQuery");

    public static boolean d(long j8) {
        SQLiteDatabase sQLiteDatabaseB = a.b();
        Logger logger = f152072a;
        if (sQLiteDatabaseB == null) {
            logger.error("byUnitID: database not initialized");
            return false;
        }
        sQLiteDatabaseB.beginTransaction();
        try {
            try {
                sQLiteDatabaseB.delete("devices", "unit_id=?", new String[]{String.valueOf(j8)});
                h.d().getClass();
                qd2.a.b().f144484a.delete("device_permission", "unit_id=?", new String[]{String.valueOf(j8)});
                sQLiteDatabaseB.setTransactionSuccessful();
                sQLiteDatabaseB.endTransaction();
                f.b();
                return true;
            } catch (Exception e4) {
                logger.error("byUnitID(" + j8 + ")", (Throwable) e4);
                sQLiteDatabaseB.endTransaction();
                return false;
            }
        } catch (Throwable th3) {
            sQLiteDatabaseB.endTransaction();
            throw th3;
        }
    }
}
