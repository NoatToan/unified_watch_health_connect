package md;

import android.database.Cursor;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import p13.u;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int a(Cursor cursor, String str) {
        String strP;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strP = u.P(columnNames, null, null, null, null, 63);
        } catch (Exception unused) {
            strP = PrivacyUpdateRequestError.UNKNOWN;
        }
        vb.h.s(a0.j("column '", str, "' does not exist. Available columns: ", strP));
        return 0;
    }
}
