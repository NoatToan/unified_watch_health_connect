package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.tencent.connect.common.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyManager;
import health.compact.a.LogZipUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class ktn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f39434b = Arrays.asList("create_time", "modified_time", "start_time", "end_time", "sync_type_version", "modify_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AtomicBoolean f39433a = new AtomicBoolean(false);

    static class b {
        private static final ktn d = new ktn();
    }

    public static ktn c() {
        return b.d;
    }

    public boolean d(Context context, int i, String str) {
        try {
            try {
                LogUtil.a("HiH_HiExportManager", "Start to exportEncryptDB");
                if (!f39433a.compareAndSet(false, true)) {
                    LogUtil.a("HiH_HiExportManager", "Failed to export cause: the db is exporting...");
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                e(context, i, str, true);
                e(context, i, str, false);
                LogUtil.a("HiH_HiExportManager", "Success to exportEncryptDB totalTime=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return true;
            } catch (Exception e) {
                ReleaseLogUtil.e("HiH_HiExportManager", "Failed to export DB cause:", e.getMessage());
            }
        } finally {
            f39433a.compareAndSet(true, false);
        }
    }

    private void e(Context context, int i, String str, boolean z) throws Throwable {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase writableDatabase2;
        if (!z || CommonUtil.av()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                writableDatabase = HiHealthDBHelper.e("hihealth_sensitive.db").getWritableDatabase();
                writableDatabase2 = HiHealthDBHelper.e("hihealth_sensitive_export.db").getWritableDatabase();
            } else {
                writableDatabase = HiHealthDBHelper.e("hihealth_003.db").getWritableDatabase();
                writableDatabase2 = HiHealthDBHelper.e("hihealth_003_export.db").getWritableDatabase();
            }
            List<String> listA = a(writableDatabase, writableDatabase2);
            LogUtil.a("HiH_HiExportManager", "Success to createTable");
            d(writableDatabase, writableDatabase2);
            LogUtil.a("HiH_HiExportManager", "Success to createTableIndex");
            for (String str2 : listA) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                a(writableDatabase, writableDatabase2, str2, i);
                LogUtil.e("HiH_HiExportManager", "Success to migrate db, tableName=", str2, ", totalTime=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
            }
            File fileD = d(context, str, z);
            e(fileD);
            if (fileD != null && fileD.exists()) {
                fileD.delete();
            }
            LogUtil.a("HiH_HiExportManager", "Success to commonExportDb totalTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    private void e(File file) throws IOException {
        if (file == null) {
            return;
        }
        File file2 = new File(file.getCanonicalPath().replaceAll(".db", ".zip"));
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        LogZipUtil.e(file, file2);
        if (file.exists()) {
            file.delete();
        }
    }

    public boolean a() {
        try {
            File fileJ = LogConfig.j();
            if (fileJ == null) {
                LogUtil.c("HiH_HiExportManager", "Failed to removeTempDbFile, cause: file is null");
                return false;
            }
            boolean z = b(new File(fileJ, "hihealth_003_export.zip")) && b(new File(fileJ, "hihealth_sensitive_export.zip"));
            LogUtil.a("HiH_HiExportManager", "removeTempDbFile isSuccess=", Boolean.valueOf(z));
            return z;
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_HiExportManager", "Failed to removeTempDbFile cause:", e.getMessage());
            return false;
        }
    }

    private boolean b(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (System.currentTimeMillis() - file.lastModified() < 86400000) {
            LogUtil.a("HiH_HiExportManager", "No need to deleteFile lastModified=" + file.lastModified());
            return true;
        }
        return file.delete();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    private void a(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2, String str, int i) {
        long jE = lsl.e(System.currentTimeMillis(), i);
        str.hashCode();
        switch (str) {
            case "hihealth_stat_day":
                d(sQLiteDatabase, sQLiteDatabase2, str, lsl.c(System.currentTimeMillis(), -400), 5000);
                break;
            case "sample_point_health":
            case "sample_point":
            case "sample_point_health_stress":
                c(sQLiteDatabase, sQLiteDatabase2, str, jE, 10000);
                break;
            case "sample_session_health":
            case "sample_session":
            case "sample_session_core":
            case "sample_sequence":
                d(sQLiteDatabase, sQLiteDatabase2, str, jE, 5000);
                break;
            default:
                e(sQLiteDatabase, sQLiteDatabase2, str, 5000);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [net.zetetic.database.sqlcipher.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private File d(Context context, String str, boolean z) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        ?? r2 = 0;
        try {
            try {
                File databasePath = context.getDatabasePath(z ? "hihealth_sensitive_export.db" : "hihealth_003_export.db");
                if (databasePath != null && databasePath.exists() && !databasePath.isDirectory()) {
                    File fileJ = LogConfig.j();
                    if (fileJ == null) {
                        LogUtil.c("HiH_HiExportManager", "exportDatabase file is null");
                        return null;
                    }
                    File file = new File(fileJ, databasePath.getName());
                    if (file.exists()) {
                        LogUtil.a("HiH_HiExportManager", "exportDatabase targetFile exists, isDelete = ", Boolean.valueOf(file.delete()));
                    }
                    ltt.a(BaseApplication.getContext());
                    sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(databasePath, new String(KeyManager.a(13), StandardCharsets.UTF_8), (SQLiteDatabase.CursorFactory) null, (DatabaseErrorHandler) null);
                    try {
                        sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL("ATTACH DATABASE '" + file.getCanonicalPath() + "' AS plaintext KEY '" + str + "';", new Object[0]);
                        sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL("SELECT sqlcipher_export('plaintext');", new Object[0]);
                        sQLiteDatabaseOpenOrCreateDatabase.rawExecSQL("DETACH DATABASE plaintext;", new Object[0]);
                        LogUtil.a("HiH_HiExportManager", "success to exportDatabase");
                        if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                            sQLiteDatabaseOpenOrCreateDatabase.close();
                        }
                        return file;
                    } catch (Exception unused) {
                        ReleaseLogUtil.e("HiH_HiExportManager", "exportDatabase exception");
                        if (sQLiteDatabaseOpenOrCreateDatabase != null) {
                            sQLiteDatabaseOpenOrCreateDatabase.close();
                        }
                        return null;
                    }
                }
                LogUtil.c("HiH_HiExportManager", "exportDatabase databaseFile not exists");
                return null;
            } catch (Throwable th) {
                r2 = context;
                th = th;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            sQLiteDatabaseOpenOrCreateDatabase = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    private List<Integer> d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT distinct(type_id) as type_id FROM " + str, (String[]) null);
        ArrayList arrayList = new ArrayList(33);
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("type_id"))));
                } catch (Exception e) {
                    ReleaseLogUtil.e("HiH_HiExportManager", "Error to getAllTypeId: ", e.getMessage());
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        return arrayList;
    }

    private String a(String str, int i, int i2, int i3, long j) {
        StringBuffer stringBuffer = new StringBuffer("SELECT _id, start_time, end_time, value, client_id, merged, sync_status, timeZone, modified_time FROM ");
        stringBuffer.append(str).append(" where type_id = ").append(i).append(" and start_time >= ").append(j).append(" order by start_time asc limit ").append(i2).append(" , ").append(i3).append(";");
        return stringBuffer.toString();
    }

    private String e(String str, int i, int i2, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        if ("hihealth_stat_day".equals(str)) {
            stringBuffer.append("SELECT * FROM ").append(str).append(" where date >= ").append(HiDateUtil.d(j)).append(" order by date asc limit ").append(i).append(" , ").append(i2).append(";");
        } else if ("sample_sequence".equals(str)) {
            stringBuffer.append("SELECT start_time,end_time,type_id,sub_type_id,meta_data,simple_data,client_id,merged,sync_status,timeZone,modified_time,reserve FROM ").append(str).append(" where start_time >= ").append(j).append(" order by start_time asc limit ").append(i).append(" , ").append(i2).append(";");
        } else {
            stringBuffer.append("SELECT * FROM ").append(str).append(" where start_time >= ").append(j).append(" order by start_time asc limit ").append(i).append(" , ").append(i2).append(";");
        }
        return stringBuffer.toString();
    }

    private List<ContentValues> b(SQLiteDatabase sQLiteDatabase, String str, int i, int i2, int i3) {
        return a(sQLiteDatabase.rawQuery("SELECT * FROM " + str + " WHERE _id >" + i3 + " LIMIT " + i + " , " + i2 + ";", (String[]) null), str, i2);
    }

    private List<ContentValues> a(Cursor cursor, String str, int i) {
        if (cursor == null) {
            return new ArrayList(0);
        }
        try {
            ArrayList arrayList = new ArrayList(i);
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                int columnCount = cursor.getColumnCount();
                for (int i2 = 0; i2 < columnCount; i2++) {
                    String columnName = cursor.getColumnName(i2);
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        contentValues.putNull(columnName);
                    } else if (type != 1) {
                        if (type == 2) {
                            contentValues.put(columnName, Float.valueOf(cursor.getFloat(i2)));
                        } else if (type != 3) {
                            if (type != 4) {
                                LogUtil.c("HiH_HiExportManager", "Unknown field type: " + type);
                            } else {
                                contentValues.put(columnName, "");
                            }
                        } else if ("hihealth_account".equals(str) && Constants.PARAM_ACCESS_TOKEN.equals(columnName)) {
                            contentValues.put(columnName, "");
                        } else {
                            contentValues.put(columnName, cursor.getString(i2));
                        }
                    } else if (f39434b.contains(columnName)) {
                        contentValues.put(columnName, Long.valueOf(cursor.getLong(i2)));
                    } else {
                        contentValues.put(columnName, Integer.valueOf(cursor.getInt(i2)));
                    }
                }
                if ("sample_sequence".equals(str)) {
                    contentValues.put("data", "");
                }
                arrayList.add(contentValues);
            }
            return arrayList;
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_HiExportManager", "Error to queryByPage: ", e.getMessage());
            return new ArrayList(0);
        } finally {
            cursor.close();
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2, String str, long j, int i) {
        List<Integer> listD = d(sQLiteDatabase, str);
        if (listD.isEmpty()) {
            return;
        }
        for (final Integer num : listD) {
            boolean z = true;
            int i2 = 0;
            do {
                List<ContentValues> listA = a(sQLiteDatabase.rawQuery(a(str, num.intValue(), i2, i, j), (String[]) null), str, i);
                listA.forEach(new Consumer() { // from class: ktp
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ktn.b(num, (ContentValues) obj);
                    }
                });
                a(sQLiteDatabase2, str, listA);
                i2 += i;
                if (listA.size() < i) {
                    z = false;
                }
            } while (z);
        }
    }

    static /* synthetic */ void b(Integer num, ContentValues contentValues) {
        contentValues.put("type_id", num);
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, (Integer) 0);
    }

    private void d(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2, String str, long j, int i) {
        boolean z = true;
        int i2 = 0;
        do {
            List<ContentValues> listA = a(sQLiteDatabase.rawQuery(e(str, i2, i, j), (String[]) null), str, i);
            a(sQLiteDatabase2, str, listA);
            i2 += i;
            if (listA.size() < i) {
                z = false;
            }
        } while (z);
    }

    private void e(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2, String str, int i) {
        boolean z = true;
        int i2 = 0;
        int iIntValue = 0;
        do {
            List<ContentValues> listB = b(sQLiteDatabase, str, i2, i, iIntValue);
            a(sQLiteDatabase2, str, listB);
            i2 += i;
            if (listB.size() < i) {
                z = false;
            }
            if (listB.size() == i) {
                iIntValue = listB.get(i - 1).getAsInteger("_id").intValue();
            }
        } while (z);
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, List<ContentValues> list) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<ContentValues> it = list.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.insert(str, (String) null, it.next());
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_HiExportManager", "Failed to insertBatch,cause:", ExceptionUtils.c(e));
            new RuntimeException("Error insertBatch");
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static List<String> a(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name, sql FROM sqlite_master WHERE type='table';", (String[]) null);
        ArrayList arrayList = new ArrayList(33);
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name"));
                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sql"));
                    if (!string.equals("android_metadata")) {
                        arrayList.add(string);
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + string + ";");
                        sQLiteDatabase2.execSQL(string2);
                    }
                } catch (SQLiteException e) {
                    ReleaseLogUtil.e("HiH_HiExportManager", "Error to createTable: ", ExceptionUtils.c(e));
                    throw new RuntimeException("Error to createTable");
                }
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
        return arrayList;
    }

    private static void d(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master where type='index';", (String[]) null);
        while (cursorRawQuery.moveToNext()) {
            try {
                try {
                    sQLiteDatabase2.execSQL(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("sql")));
                } catch (Exception e) {
                    ReleaseLogUtil.e("HiH_HiExportManager", "Error to createTableIndex: ", ExceptionUtils.c(e));
                    throw new RuntimeException("Error to createTableIndex");
                }
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        cursorRawQuery.close();
    }
}
