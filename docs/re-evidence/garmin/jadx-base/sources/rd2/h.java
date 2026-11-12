package rd2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152073a = LoggerFactory.getLogger("DevicePermissionDAO");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f152074b;

    private h() {
    }

    public static h d() {
        if (f152074b == null) {
            f152074b = new h();
        }
        return f152074b;
    }

    public static boolean e(int i14, long j8) {
        Logger logger = f152073a;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = qd2.a.b().f144484a.rawQuery("select 1 from device_permission where unit_id=? and perm_id=? and perm_val=1", new String[]{String.valueOf(j8), String.valueOf(i14)});
                boolean z14 = cursorRawQuery.getCount() > 0;
                cursorRawQuery.close();
                return z14;
            } catch (SQLException e4) {
                logger.error("hasPermission", (Throwable) e4);
                a.a(cursorRawQuery);
                return false;
            } catch (NullPointerException e14) {
                logger.error("hasPermission", (Throwable) e14);
                a.a(cursorRawQuery);
                return false;
            }
        } catch (Throwable th3) {
            a.a(cursorRawQuery);
            throw th3;
        }
    }

    public static long f(int i14, long j8) {
        String[] strArr = {String.valueOf(j8), String.valueOf(i14)};
        long j14 = -1;
        Cursor cursorQuery = null;
        try {
            cursorQuery = qd2.a.b().f144484a.query("device_permission", null, "unit_id=? and perm_id=?", strArr, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                j14 = cursorQuery.getLong(0);
            }
            return j14;
        } catch (SQLException e4) {
            f152073a.error("recordExists", (Throwable) e4);
            return -1L;
        } finally {
            a.a(cursorQuery);
        }
    }

    public static void g(long j8, int i14, boolean z14) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("unit_id", String.valueOf(j8));
        contentValues.put("perm_id", Integer.valueOf(i14));
        contentValues.put("perm_val", Integer.valueOf(z14 ? 1 : 0));
        long jF = f(i14, j8);
        if (jF == -1) {
            qd2.a.b().f144484a.insert("device_permission", null, contentValues);
        } else {
            qd2.a.b().f144484a.update("device_permission", contentValues, "_id=?", new String[]{String.valueOf(jF)});
        }
    }
}
