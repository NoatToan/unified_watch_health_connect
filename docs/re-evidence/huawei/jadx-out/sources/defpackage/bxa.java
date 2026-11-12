package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.basichealthmodel.database.HealthLifeSqLiteOpenHelper;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class bxa {
    public static Cursor c(String str, String[] strArr) throws IllegalStateException, SQLiteException {
        SQLiteDatabase sQLiteDatabaseB = HealthLifeSqLiteOpenHelper.a().b();
        if (TextUtils.isEmpty(str) || strArr == null || sQLiteDatabaseB == null) {
            LogUtil.j("HL_DatabaseHelper", "rawQuery sql ", str, " selectionArgs ", strArr, " database ", sQLiteDatabaseB);
            return null;
        }
        try {
            return sQLiteDatabaseB.rawQuery(str, strArr);
        } catch (SQLiteException | IllegalStateException | OutOfMemoryError e) {
            LogUtil.j("HL_DatabaseHelper", "rawQuery exception ", LogAnonymous.b(e));
            return null;
        }
    }

    public static int c(String str, String str2, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseB = HealthLifeSqLiteOpenHelper.a().b();
        if (sQLiteDatabaseB == null) {
            LogUtil.j("HL_DatabaseHelper", "delete database is null");
            return -1;
        }
        try {
            return sQLiteDatabaseB.delete(str, str2, strArr);
        } catch (SQLiteException | IllegalStateException | OutOfMemoryError e) {
            LogUtil.e("HL_DatabaseHelper", "delete exception ", LogAnonymous.b(e));
            return -1;
        }
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseB = HealthLifeSqLiteOpenHelper.a().b();
        if (sQLiteDatabaseB == null) {
            LogUtil.j("HL_DatabaseHelper", "update database is null");
            return -1;
        }
        try {
            return sQLiteDatabaseB.update(str, contentValues, str2, strArr);
        } catch (SQLiteException | IllegalStateException | OutOfMemoryError e) {
            LogUtil.e("HL_DatabaseHelper", "update exception ", LogAnonymous.b(e));
            return -1;
        }
    }

    public static long d(String str, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabaseB = HealthLifeSqLiteOpenHelper.a().b();
        if (sQLiteDatabaseB == null) {
            LogUtil.j("HL_DatabaseHelper", "insert database is null");
            return -1L;
        }
        try {
            return sQLiteDatabaseB.insert(str, (String) null, contentValues);
        } catch (SQLiteException | IllegalStateException | OutOfMemoryError e) {
            LogUtil.j("HL_DatabaseHelper", "insert exception ", LogAnonymous.b(e));
            return -1L;
        }
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_DatabaseHelper", "isTableExist database ", sQLiteDatabase, " tableName ", str);
            return false;
        }
        List<String> listD = d(sQLiteDatabase);
        if (njy.e(listD)) {
            return false;
        }
        for (String str2 : listD) {
            if (!TextUtils.isEmpty(str2) && str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r2 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<String> d(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", (String[]) null);
            try {
                if (cursorRawQuery == null) {
                    LogUtil.j("HL_DatabaseHelper", "getAllTableNameList cursor is null database ", sQLiteDatabase);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                        return arrayList;
                    }
                    return arrayList;
                }
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("HL_DatabaseHelper", "getAllTableNameList exception ", LogAnonymous.b(e));
        }
    }

    public static boolean e(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (sQLiteDatabase == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HL_DatabaseHelper", "isFieldExist database ", sQLiteDatabase, " tableName ", str, " fieldName ", str2);
            return false;
        }
        String strC = c(sQLiteDatabase, str);
        return !TextUtils.isEmpty(strC) && strC.contains(str2);
    }

    private static String c(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "select sql from sqlite_master where type = 'table' and name = '%s'", str), (String[]) null);
            try {
                if (cursorRawQuery == null) {
                    LogUtil.j("HL_DatabaseHelper", "getAllFieldName cursor is null database ", sQLiteDatabase, " tableName ", str);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return "";
                }
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return "";
                }
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sql"));
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return string;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("HL_DatabaseHelper", "getAllFieldName exception ", LogAnonymous.b(e));
        }
    }
}
