package com.tencent.wcdb.repair;

import android.text.TextUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.support.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DBDumpUtil {
    private static final String TAG = "WCDB.DBDumpUtil";

    public interface ExecuteSqlCallback {
        String preExecute(String str);
    }

    public static String buildColumnsString(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        System.out.println(string);
        return string;
    }

    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        return doRecoveryDb(sQLiteDatabase, str, str2, str3, null, null, null, true);
    }

    public static ArrayList<String> getColumnNamesFromSql(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).trim().split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            strArrSplit[i] = strTrim;
            arrayList.add(strArrSplit[i].substring(0, strTrim.indexOf(" ")));
        }
        return arrayList;
    }

    public static String getTableNameFromSql(String str) {
        if (str.length() > 100) {
            str = str.substring(0, 100);
        }
        String[] strArrSplit = str.split("\\s");
        if (strArrSplit == null || strArrSplit.length <= 1) {
            return null;
        }
        return strArrSplit[2].replaceAll("\"", "");
    }

    private static native boolean nativeDumpDB(String str, String str2, String str3);

    private static native boolean nativeIsSqlComplete(String str);

    public static byte[] readFromFile(String str) throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            Log.w(TAG, "readFromFile error, file is not exit, path = %s", str);
            return null;
        }
        try {
            int length = (int) file.length();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    byte[] bArr = new byte[length];
                    int i = fileInputStream.read(bArr);
                    if (i == length) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return bArr;
                    }
                    Log.w(TAG, "readFromFile error, size is not equal, path = %s, file length is %d, count is %d", str, Integer.valueOf(length), Integer.valueOf(i));
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return null;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    Log.e(TAG, "readFromFile failed!");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        fileInputStream2 = fileInputStream;
        if (fileInputStream2 != null) {
            try {
                fileInputStream2.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9 A[Catch: all -> 0x006a, IOException -> 0x01d4, TryCatch #4 {IOException -> 0x01d4, blocks: (B:12:0x002f, B:14:0x0039, B:19:0x0049, B:21:0x0061, B:38:0x0092, B:40:0x0098, B:41:0x00a0, B:43:0x00a6, B:61:0x00e6, B:49:0x00b9, B:51:0x00bf, B:52:0x00c7, B:54:0x00cd, B:28:0x0072, B:30:0x007c, B:32:0x0082, B:34:0x0088, B:83:0x0163, B:86:0x016b), top: B:134:0x002f, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6 A[Catch: all -> 0x006a, IOException -> 0x01d4, TRY_LEAVE, TryCatch #4 {IOException -> 0x01d4, blocks: (B:12:0x002f, B:14:0x0039, B:19:0x0049, B:21:0x0061, B:38:0x0092, B:40:0x0098, B:41:0x00a0, B:43:0x00a6, B:61:0x00e6, B:49:0x00b9, B:51:0x00bf, B:52:0x00c7, B:54:0x00cd, B:28:0x0072, B:30:0x007c, B:32:0x0082, B:34:0x0088, B:83:0x0163, B:86:0x016b), top: B:134:0x002f, outer: #5 }] */
    public static boolean doRecoveryDb(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, List<String> list, List<String> list2, ExecuteSqlCallback executeSqlCallback, boolean z) {
        boolean z2;
        String tableNameFromSql;
        boolean z3;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            Log.w(TAG, "Database is not open");
            return false;
        }
        if (!nativeDumpDB(str, str2, str3)) {
            return false;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str3));
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    HashMap map = new HashMap();
                    boolean z4 = false;
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    loop0: while (true) {
                        String line = null;
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                try {
                                    break loop0;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else if (z4) {
                                z2 = z4;
                                line = line + "\n" + line;
                                if (line.endsWith(";") && nativeIsSqlComplete(line)) {
                                    line = line;
                                    if (list2 == null || list2.size() <= 0) {
                                        if (list != null || list.size() <= 0) {
                                            tableNameFromSql = null;
                                        } else {
                                            tableNameFromSql = getTableNameFromSql(line);
                                            Iterator<String> it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (tableNameFromSql.equals(it.next())) {
                                                        line = "";
                                                        z3 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        z3 = false;
                                        break;
                                    }
                                    tableNameFromSql = getTableNameFromSql(line);
                                    Iterator<String> it2 = list2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z3 = true;
                                            break;
                                        }
                                        if (tableNameFromSql.equals(it2.next())) {
                                            z3 = false;
                                            break;
                                        }
                                    }
                                    line = line;
                                    if (z3) {
                                        Log.i(TAG, "filter table %s", tableNameFromSql);
                                        z4 = false;
                                    }
                                } else {
                                    z4 = z2;
                                }
                            } else {
                                z2 = z4;
                                if (!line.startsWith("INSERT") && !line.startsWith("CREATE TABLE")) {
                                    z4 = z2;
                                } else if (line.endsWith(";") && nativeIsSqlComplete(line)) {
                                    if (list2 == null) {
                                        if (list != null) {
                                            tableNameFromSql = null;
                                            z3 = false;
                                            break;
                                        }
                                        tableNameFromSql = null;
                                        z3 = false;
                                        break;
                                    }
                                    if (list != null) {
                                        tableNameFromSql = null;
                                        z3 = false;
                                        break;
                                    }
                                    tableNameFromSql = null;
                                    z3 = false;
                                    break;
                                    if (z3) {
                                        Log.i(TAG, "filter table %s", tableNameFromSql);
                                        z4 = false;
                                    }
                                } else {
                                    if (TextUtils.isEmpty(line)) {
                                        line = line;
                                    } else {
                                        line = line + "\n" + line;
                                    }
                                    z4 = true;
                                }
                            }
                        }
                        try {
                            if (line.startsWith("CREATE TABLE")) {
                                map.put(tableNameFromSql, buildColumnsString(getColumnNamesFromSql(line)));
                            } else if (line.startsWith("INSERT INTO")) {
                                String str4 = (String) map.get(tableNameFromSql);
                                if (!TextUtils.isEmpty(str4)) {
                                    StringBuilder sb = new StringBuilder("INSERT INTO ");
                                    sb.append("\"");
                                    sb.append(tableNameFromSql);
                                    sb.append("\"");
                                    String string = sb.toString();
                                    sb.append(str4);
                                    line = line.replace(string, sb.toString());
                                }
                            }
                            String strPreExecute = executeSqlCallback != null ? executeSqlCallback.preExecute(line) : null;
                            if (!TextUtils.isEmpty(strPreExecute)) {
                                line = strPreExecute;
                            }
                            i2++;
                            sQLiteDatabase.execSQL(line);
                            i3++;
                            if (i3 >= 100) {
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                sQLiteDatabase.beginTransaction();
                                i3 = 0;
                            }
                        } catch (Exception unused) {
                            i++;
                        }
                        z4 = false;
                    }
                    bufferedReader.close();
                    if (i2 <= i) {
                        return false;
                    }
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.setTransactionSuccessful();
                    }
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    if (z) {
                        File file = new File(str3);
                        if (file.exists()) {
                            file.delete();
                        }
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                    Log.i(TAG, "restore : %d , fail:%d ", Integer.valueOf(i2), Integer.valueOf(i));
                    return true;
                } catch (IOException unused2) {
                    Log.w(TAG, "I/O error in read sql file ");
                    try {
                        bufferedReader.close();
                        return false;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return false;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    throw th;
                }
            }
        } catch (FileNotFoundException unused3) {
            Log.w(TAG, "SQL file '%s' not found", str3);
            return false;
        }
    }
}
