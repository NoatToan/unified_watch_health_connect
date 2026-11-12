package cl0;

import android.database.Cursor;
import android.database.SQLException;
import androidx.fragment.app.m;
import org.slf4j.Logger;
import rd2.l;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static String a(m mVar, double d14, int i14, int i15) {
        if (mVar == null || Double.isNaN(d14)) {
            return null;
        }
        if (d14 < 0.0d) {
            i14 = i15;
        }
        return mVar.getString(i14);
    }

    public static boolean b() {
        int i14;
        l.e().getClass();
        Logger logger = l.f152081a;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = qd2.a.b().f144484a.rawQuery("select count(distinct global_layout_id) from golf_downloaded_course", null);
                i14 = (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) ? 0 : cursorRawQuery.getInt(0);
                rd2.a.a(cursorRawQuery);
            } catch (SQLException e4) {
                logger.error("getCount (without filter)", (Throwable) e4);
                rd2.a.a(cursorRawQuery);
                i14 = 0;
            }
            return i14 >= 100;
        } catch (Throwable th3) {
            rd2.a.a(cursorRawQuery);
            throw th3;
        }
    }
}
