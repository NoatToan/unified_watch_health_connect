package com.huawei.hianalytics;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.DBUtil;
import com.huawei.hianalytics.core.storage.DaoManager;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.Property;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x011f  */
    public static void a(SQLiteDatabase sQLiteDatabase) {
        int i;
        String str;
        byte b2;
        HiLog.d("MigrationHelper", "start to generate temp table");
        DBUtil.rename(sQLiteDatabase, Event.TABLE_NAME, "EVENT_TEMP");
        HiLog.d("MigrationHelper", "end to generate temp table");
        DaoManager.getInstance().createEventTable(sQLiteDatabase);
        HiLog.d("MigrationHelper", "start to restore data");
        HiLog.si("MigrationHelper", "restoreData run");
        String strConcat = Event.TABLE_NAME.concat("_TEMP");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + strConcat + " limit 1", null);
            if (cursorRawQuery != null) {
                try {
                    arrayList3 = new ArrayList(Arrays.asList(cursorRawQuery.getColumnNames()));
                } catch (Throwable th) {
                    try {
                        cursorRawQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            while (true) {
                Property[] propertyArr = Event.PROPERTIES;
                if (i >= propertyArr.length) {
                    DBUtil.exec(sQLiteDatabase, "INSERT INTO EVENT (" + TextUtils.join(",", arrayList) + ") SELECT " + TextUtils.join(",", arrayList2) + " FROM " + strConcat + ";");
                    DBUtil.dropTable(sQLiteDatabase, strConcat);
                    HiLog.si("MigrationHelper", "restoreData success");
                    HiLog.d("MigrationHelper", "end to restore data");
                    return;
                }
                String str2 = propertyArr[i].columnName;
                if (arrayList3.contains(str2)) {
                    arrayList.add(str2);
                    arrayList2.add(str2);
                } else {
                    Class<?> cls = propertyArr[i].type;
                    if (cls == null) {
                        str = "";
                    } else if (cls.equals(String.class)) {
                        str = "TEXT";
                    } else if (cls.equals(Long.class) || cls.equals(Integer.class) || cls.equals(Long.TYPE) || cls.equals(Integer.TYPE)) {
                        str = "INTEGER";
                    } else if (cls.equals(Boolean.class) || cls.equals(Boolean.TYPE)) {
                        str = "BOOLEAN";
                    } else {
                        str = "";
                    }
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1618932450) {
                        if (iHashCode != 2571565) {
                            if (iHashCode == 782694408 && str.equals("BOOLEAN")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("TEXT")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("INTEGER")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        arrayList2.add("1 as " + str2);
                        arrayList.add(str2);
                    } else if (b2 == 1) {
                        arrayList2.add("'' as " + str2);
                        arrayList.add(str2);
                    } else if (b2 == 2) {
                        arrayList2.add("0 as " + str2);
                        arrayList.add(str2);
                    }
                }
                i++;
            }
        } catch (Exception unused) {
            HiLog.e("MigrationHelper", "getColumns error, tableName:" + strConcat);
        }
        i = 0;
    }
}
