package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class vde {
    public static int c(int i) {
        if (i < 2) {
            return -1;
        }
        if (i <= 14) {
            return 1;
        }
        return i <= 59 ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9 A[PHI: r2 r9
      0x00c9: PHI (r2v6 java.lang.String) = (r2v1 java.lang.String), (r2v7 java.lang.String) binds: [B:24:0x00be, B:29:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r9v6 android.database.Cursor) = (r9v4 android.database.Cursor), (r9v7 android.database.Cursor) binds: [B:24:0x00be, B:29:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    public static String b(int i, int i2, int i3, int i4) {
        LogUtil.d("HealthSuggestionsUtils", "getHealthSuggestionInfo dataType = ", Integer.valueOf(i), "; sex = ", Integer.valueOf(i2), "; ageType = ", Integer.valueOf(i3), "; indexLevel = ", Integer.valueOf(i4));
        dnd dndVarB = dnd.b();
        String string = "";
        if (dndVarB == null) {
            LogUtil.j("HealthSuggestionsUtils", "getHealthSuggestionInfo assetsDatabaseManager is null");
            return "";
        }
        SQLiteDatabase sQLiteDatabaseB = dndVarB.b("stand.db");
        if (sQLiteDatabaseB == null) {
            LogUtil.a("HealthSuggestionsUtils", "health suggestion db is null; and suggestions = ", "");
            return "";
        }
        if (!sQLiteDatabaseB.isOpen()) {
            sQLiteDatabaseB = dndVarB.d("stand.db");
        }
        String[] strArr = {i + "", i2 + "", i3 + "", i4 + ""};
        Cursor cursorRawQuery = null;
        if (sQLiteDatabaseB != null) {
            try {
                try {
                    cursorRawQuery = sQLiteDatabaseB.rawQuery("select * from data_suggestion_info where data_type = ? and sex = ? and age_level = ? and index_level = ?", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("suggestions"));
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (SQLException e) {
                    LogUtil.a("HealthSuggestionsUtils", "SQLException is", e.getMessage());
                    if (cursorRawQuery != null) {
                    }
                    dndVarB.c("stand.db");
                    return string;
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } else if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        dndVarB.c("stand.db");
        return string;
    }

    public static String b(String str, long j) {
        if (!TextUtils.isEmpty(str) && j >= 0) {
            String[] strArrSplit = str.split("\\$");
            int length = strArrSplit.length;
            LogUtil.a("HealthSuggestionsUtils", "getSuggest suggestion length = ", Integer.valueOf(length));
            int i = (int) (j % ((long) length));
            return njy.e(strArrSplit, i) ? "" : strArrSplit[i];
        }
        LogUtil.a("HealthSuggestionsUtils", "getSuggest health suggestions is null");
        return "";
    }
}
