package health.compact.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.db.contentprovider.DbContentProvider;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class DbManager {
    public static final String e = "content://" + BaseApplication.getAppPackage() + ".data.access.provider/";

    private DbManager() {
    }

    public static int a(Context context, String str, String str2, int i, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("create table IF NOT EXISTS ");
        stringBuffer.append("module_" + str + "_" + str2 + Constants.LEFT_BRACKET_ONLY);
        stringBuffer.append(str3);
        stringBuffer.append(Constants.RIGHT_BRACKET_ONLY);
        try {
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE == null) {
                    health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "get database wrong, please check : ", str);
                    return 201000;
                }
                sQLiteDatabaseE.execSQL(String.valueOf(stringBuffer));
            } else {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_DbManager", "exec CreateTable Sql in provider,tableId= " + str2);
                DbContentProvider.b(context).c(String.valueOf(stringBuffer));
            }
            return 0;
        } catch (SQLiteException e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "createStorageDataTable SQLiteException =", ExceptionUtils.c(e2));
            return 201000;
        } catch (Exception unused) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "createStorageDataTable Exception");
            return 201000;
        }
    }

    public static boolean b(String str) {
        return DataBaseHelper.d(str).b();
    }

    public static int b(Context context, String str, String str2, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DROP TABLE IF EXISTS ");
        stringBuffer.append("module_" + str + "_" + str2);
        try {
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE == null) {
                    return 0;
                }
                sQLiteDatabaseE.execSQL(String.valueOf(stringBuffer));
                return 0;
            }
            DbContentProvider.b(context).c(String.valueOf(stringBuffer));
            return 0;
        } catch (SQLiteException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "deleteStorageDataTable SQLException =", e2.getMessage());
            return 201000;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "deleteStorageDataTable Exception");
            return 201000;
        }
    }

    public static int e(Context context, String str, String str2, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ");
            sb.append("module_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE == null) {
                    com.huawei.hwlogsmodel.LogUtil.e("DbManager", "clearStorageDataTable: database is null");
                    return 201000;
                }
                sQLiteDatabaseE.execSQL(String.valueOf(sb));
            } else {
                DbContentProvider.b(context).c(String.valueOf(sb));
            }
            return 0;
        } catch (Exception e2) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "clearStorageDataTable: exception -> " + e2.getMessage());
            return 201000;
        }
    }

    public static long c(Context context, String str, String str2, int i, ContentValues contentValues) {
        if (context == null || contentValues == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "insertStorageData context or values is null");
            return 200004L;
        }
        try {
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE == null) {
                    return 0L;
                }
                return sQLiteDatabaseE.insert("module_" + str + "_" + str2, (String) null, contentValues);
            }
            ContentResolver contentResolver = context.getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("module_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            if ((contentResolver.insert(Uri.parse(sb.toString()), contentValues) == null ? -1L : 0L) != -1) {
                return 0L;
            }
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "insertStorageData failed");
            return 201000L;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "insertStorageData insert() Exception");
            return 201000L;
        }
    }

    public static long c(d dVar, ContentValues contentValues, int i) {
        if (dVar == null || contentValues == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "insertStorageDataWithOnConflict params or values is null");
            return 200004L;
        }
        Context contextE = dVar.e();
        if (contextE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "insertStorageDataWithOnConflict context is null");
            return 200004L;
        }
        try {
            String strC = dVar.c();
            String strB = dVar.b();
            if (dVar.d() == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(strC).e();
                if (sQLiteDatabaseE == null) {
                    return 0L;
                }
                return sQLiteDatabaseE.insertWithOnConflict("module_" + strC + "_" + strB, null, contentValues, 5);
            }
            ContentResolver contentResolver = contextE.getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("module_");
            sb.append(strC);
            sb.append("_");
            sb.append(strB);
            if ((contentResolver.insert(Uri.parse(sb.toString()), contentValues) == null ? -1L : 0L) != -1) {
                return 0L;
            }
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "insertStorageDataWithOnConflict insert() failed");
            return 201000L;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "insertStorageDataWithOnConflict insert() Exception");
            return 201000L;
        }
    }

    public static int d(Context context, String str, String str2, int i, String str3) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "deleteStorageData context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        try {
            com.huawei.hwlogsmodel.LogUtil.d("DbManager", "deleteStorageData enter");
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE != null) {
                    sQLiteDatabaseE.delete("module_" + str + "_" + str2, str3, (String[]) null);
                }
            } else {
                context.getContentResolver().delete(Uri.parse(e + "module_" + str + "_" + str2), str3, null);
            }
            return 0;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "deleteStorageData Exception");
            return 201000;
        }
    }

    public static int d(d dVar, String str, String[] strArr) {
        if (dVar == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "deleteStorageData params is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        Context contextE = dVar.e();
        if (contextE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "deleteStorageData context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        try {
            com.huawei.hwlogsmodel.LogUtil.d("DbManager", "deleteStorageData start");
            String strC = dVar.c();
            String strB = dVar.b();
            if (dVar.d() == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(strC).e();
                if (sQLiteDatabaseE != null) {
                    sQLiteDatabaseE.delete("module_" + strC + "_" + strB, str, strArr);
                }
            } else {
                contextE.getContentResolver().delete(Uri.parse(e + "module_" + strC + "_" + strB), str, strArr);
            }
            return 0;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "deleteStorageData Exception");
            return 201000;
        }
    }

    public static int d(d dVar, ContentValues contentValues, String str, String[] strArr) {
        if (dVar == null || contentValues == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "updateStorageData params or values is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        Context contextE = dVar.e();
        if (contextE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "updateStorageData context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        try {
            com.huawei.hwlogsmodel.LogUtil.d("DbManager", "updateStorageData enter");
            String strC = dVar.c();
            String strB = dVar.b();
            if (dVar.d() == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(strC).e();
                if (sQLiteDatabaseE == null) {
                    return 0;
                }
                return sQLiteDatabaseE.update("module_" + strC + "_" + strB, contentValues, str, strArr);
            }
            contextE.getContentResolver().update(Uri.parse(e + "module_" + strC + "_" + strB), contentValues, str, strArr);
            return 0;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "updateStorageData Exception");
            return 201000;
        }
    }

    public static int d(d dVar, ContentValues contentValues, String str) {
        if (dVar == null || contentValues == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "updateStorageData params or values is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        Context contextE = dVar.e();
        if (contextE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "updateStorageData context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        try {
            com.huawei.hwlogsmodel.LogUtil.d("DbManager", "updateStorageData start");
            String strC = dVar.c();
            String strB = dVar.b();
            if (dVar.d() == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(strC).e();
                if (sQLiteDatabaseE != null) {
                    sQLiteDatabaseE.update("module_" + strC + "_" + strB, contentValues, str, null);
                }
            } else {
                contextE.getContentResolver().update(Uri.parse(e + "module_" + strC + "_" + strB), contentValues, str, null);
            }
            return 0;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "updateStorageData Exception");
            return 201000;
        }
    }

    public static Cursor c(Context context, String str, String str2, int i, String str3) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "queryStorageData context is null");
            return null;
        }
        try {
            if (i == 1) {
                SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
                if (sQLiteDatabaseE == null) {
                    return null;
                }
                return sQLiteDatabaseE.query("module_" + str + "_" + str2, null, str3, null, null, null, null);
            }
            return context.getContentResolver().query(Uri.parse(e + "module_" + str + "_" + str2), null, str3, null, null);
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "queryStorageData Exception");
            return null;
        }
    }

    public static Cursor b(d dVar, String str, String str2) {
        if (dVar == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "queryStorageDataToOrder params is null");
            return null;
        }
        Context contextE = dVar.e();
        String strC = dVar.c();
        String strB = dVar.b();
        if (contextE == null || TextUtils.isEmpty(strC) || TextUtils.isEmpty(strB)) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "queryStorageDataToOrder param is invalid");
            return null;
        }
        if (dVar.d() == 1) {
            SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(strC).e();
            if (sQLiteDatabaseE == null) {
                return null;
            }
            try {
                return sQLiteDatabaseE.query("module_" + strC + "_" + strB, null, str, null, null, null, str2);
            } catch (SQLException unused) {
                com.huawei.hwlogsmodel.LogUtil.e("DbManager", "queryStorageDataToOrder sqlcipher SQLException");
                return null;
            }
        }
        try {
            return contextE.getContentResolver().query(Uri.parse(e + "module_" + strC + "_" + strB), null, str, null, str2);
        } catch (SQLException unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "queryStorageDataToOrder android SQLException");
            return null;
        }
    }

    public static Cursor d(String str, int i, String str2, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseE;
        if (i != 1 || (sQLiteDatabaseE = DataBaseHelper.d(str).e()) == null) {
            return null;
        }
        try {
            return sQLiteDatabaseE.rawQuery(str2, strArr);
        } catch (SQLiteException e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "rawQueryStorageData SQLiteException ", ExceptionUtils.c(e2));
            return null;
        } catch (Exception e3) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "rawQueryStorageData Exception ", ExceptionUtils.c(e3));
            return null;
        }
    }

    public static boolean d(String str, String str2, String str3) {
        com.huawei.hwlogsmodel.LogUtil.a("DbManager", "checkColumnExist");
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
        Cursor cursorRawQuery = null;
        try {
            if (sQLiteDatabaseE != null) {
                try {
                    cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT * FROM " + str2 + " LIMIT 0", (String[]) null);
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("DbManager", "checkColumnExists exception");
                    return false;
                }
            }
            return (cursorRawQuery == null || cursorRawQuery.getColumnIndex(str3) == -1) ? false : true;
        } finally {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
        }
    }

    public static boolean i(String str) {
        SQLiteDatabase sQLiteDatabaseE;
        if (str == null || str.isEmpty() || (sQLiteDatabaseE = DataBaseHelper.d(str).e()) == null) {
            return false;
        }
        return sQLiteDatabaseE.inTransaction();
    }

    public static String d(String str, String str2) {
        return "module_" + str + "_" + str2;
    }

    public static void a(String str) {
        SQLiteDatabase sQLiteDatabaseE = DataBaseHelper.d(str).e();
        if (sQLiteDatabaseE != null) {
            sQLiteDatabaseE.beginTransaction();
        }
    }

    public static void d(String str) {
        if (DataBaseHelper.d(str).e() != null) {
            DataBaseHelper.d(str).e().setTransactionSuccessful();
            DataBaseHelper.d(str).e().endTransaction();
        }
    }

    public static void c(String str, String str2) {
        try {
            if (DataBaseHelper.d(str).e() != null) {
                DataBaseHelper.d(str).e().execSQL(str2);
            }
        } catch (SQLException e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "execSql SQLException", ExceptionUtils.c(e2));
        } catch (Exception e3) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("R_DbManager", "execSql Exception", ExceptionUtils.c(e3));
        }
    }

    public static List<String> e(String str) {
        Cursor cursorD = d(str, 1, "select name from sqlite_master where type='table' order by name", (String[]) null);
        if (cursorD == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "getAllTableNames, cursor == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursorD.moveToNext()) {
            try {
                try {
                    String string = cursorD.getString(0);
                    if (string != null && !string.isEmpty()) {
                        arrayList.add(string);
                    }
                } catch (SQLiteException unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("DbManager", "getAllTableNames, SQLiteException");
                    cursorD.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursorD.close();
                throw th;
            }
        }
        cursorD.close();
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public static String c(String str) {
        String string;
        Cursor cursorC = c(BaseApplication.getContext(), String.valueOf(1010), "commonPropertyTable", 2, "propertyDataKey='" + str + "'");
        if (cursorC != null) {
            try {
                if (cursorC.getCount() > 0 && cursorC.moveToFirst()) {
                    string = cursorC.getString(cursorC.getColumnIndex("propertyDataValue"));
                } else {
                    string = "";
                }
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            string = "";
        }
        if (cursorC != null) {
            cursorC.close();
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b A[Catch: all -> 0x007a, Exception -> 0x007c, SQLiteException -> 0x0089, Merged into TryCatch #2 {all -> 0x007a, SQLiteException -> 0x0089, Exception -> 0x007c, blocks: (B:8:0x0051, B:10:0x005b, B:11:0x006b, B:16:0x007c, B:20:0x008a), top: B:25:0x004f }, TRY_LEAVE] */
    public static int e(Context context, String str, String str2, int i, String str3) {
        Cursor cursorC = c(context, str, str2, i, (String) null);
        if (cursorC == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DbManager", "alterStorageDataTable table not exist !");
            return AwarenessConstants.ERROR_PARAMETER_CODE;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ALTER TABLE ");
        stringBuffer.append("module_" + str + "_" + str2 + " ");
        stringBuffer.append(str3);
        com.huawei.hwlogsmodel.LogUtil.d("DbManager", "alterStorageDataTable sql: ", str3);
        try {
            if (i == 1) {
                if (DataBaseHelper.d(str).e() != null) {
                    DataBaseHelper.d(str).e().execSQL(String.valueOf(stringBuffer));
                } else {
                    DbContentProvider.b(context).c(String.valueOf(stringBuffer));
                }
            } else {
                DbContentProvider.b(context).c(String.valueOf(stringBuffer));
            }
            return 0;
        } catch (SQLiteException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "alterStorageDataTable SQLiteException =", e2.getMessage());
            return 201000;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DbManager", "alterStorageDataTable Exception");
            return 201000;
        } finally {
            cursorC.close();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36538b;
        private Context d;
        private int e;

        Context e() {
            return this.d;
        }

        public void b(Context context) {
            this.d = context;
        }

        String c() {
            return this.f36538b;
        }

        public void c(String str) {
            this.f36538b = str;
        }

        String b() {
            return this.f36537a;
        }

        public void b(String str) {
            this.f36537a = str;
        }

        int d() {
            return this.e;
        }

        public void e(int i) {
            this.e = i;
        }

        public String toString() {
            return "DataBaseParams{context=" + this.d + ", moduleId='" + this.f36538b + "', tableId='" + this.f36537a + "', storageType=" + this.e + '}';
        }
    }
}
