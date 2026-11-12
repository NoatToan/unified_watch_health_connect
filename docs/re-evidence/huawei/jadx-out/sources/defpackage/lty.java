package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lty {
    private static final String d = "MigrateDb";

    public void c(lub lubVar) {
        lubVar.createStorageDataTable("migrate_acc_tab_", 1, a());
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("_id integer,originalhuid  NVARCHAR(500) ,originalst  NVARCHAR(500) ,tohuid  NVARCHAR(500) ,time  NVARCHAR(500) ,sendcommondfinished  NVARCHAR(500) ,cloudfinished  NVARCHAR(500) ,localfinished  NVARCHAR(500) ,data1  NVARCHAR(500) ,data2  NVARCHAR(500) ,primary key(originalhuid ,tohuid)");
        return String.valueOf(sb);
    }

    public long a(lub lubVar, ltz ltzVar) {
        if (lubVar == null || ltzVar == null) {
            LogUtil.j(d, "insert param is null");
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("originalhuid", ltzVar.a());
            contentValues.put("originalst", ltzVar.e());
            contentValues.put("tohuid", ltzVar.b());
            contentValues.put("time", ltzVar.c());
            contentValues.put("sendcommondfinished", ltzVar.f() ? "true" : "false");
            contentValues.put("localfinished", ltzVar.j() ? "true" : "false");
            contentValues.put("localfinished", ltzVar.j() ? "true" : "false");
            return lubVar.insertStorageData("migrate_acc_tab_", 1, contentValues);
        } catch (Exception unused) {
            LogUtil.e(d, "insert Exception");
            return -1L;
        }
    }

    public int a(lub lubVar) {
        if (lubVar == null) {
            LogUtil.j(d, "deleteAll manager is null");
            return -1;
        }
        try {
            int iDeleteStorageData = lubVar.deleteStorageData("migrate_acc_tab_", 1, null);
            if (iDeleteStorageData == 0) {
                LogUtil.j(d, "deleteAll failed");
            }
            return iDeleteStorageData;
        } catch (Exception unused) {
            LogUtil.e(d, "deleteAll Exception");
            return -1;
        }
    }

    public int d(lub lubVar, String str, String str2) {
        if (lubVar == null) {
            LogUtil.j(d, "updateLocalToFinished manager is null");
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("localfinished", "true");
            return lubVar.updateStorageData("migrate_acc_tab_", 1, contentValues, "originalhuid=" + str + " and tohuid=" + str2);
        } catch (Exception unused) {
            LogUtil.e(d, "updateLocalToFinished Exception");
            return -1;
        }
    }

    public int c(lub lubVar, String str, String str2) {
        if (lubVar == null) {
            LogUtil.j(d, "updateLocalToNotFinished manager is null");
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("localfinished", "false");
            return lubVar.updateStorageData("migrate_acc_tab_", 1, contentValues, "originalhuid=" + str + " and tohuid=" + str2);
        } catch (Exception unused) {
            LogUtil.e(d, "updateLocalToNotFinished Exception");
            return -1;
        }
    }

    public int e(lub lubVar, String str, String str2) {
        if (lubVar == null) {
            LogUtil.j(d, "updateCloudToFinished manager is null");
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("cloudfinished", "true");
            return lubVar.updateStorageData("migrate_acc_tab_", 1, contentValues, "originalhuid=" + str + " and tohuid=" + str2);
        } catch (Exception unused) {
            LogUtil.e(d, "updateCloudToFinished Exception");
            return -1;
        }
    }

    public int b(lub lubVar, String str, String str2) {
        if (lubVar == null) {
            LogUtil.j(d, "updateCloudToNotFinished manager is null");
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("cloudfinished", "false");
            return lubVar.updateStorageData("migrate_acc_tab_", 1, contentValues, "originalhuid=" + str + " and tohuid=" + str2);
        } catch (Exception unused) {
            LogUtil.e(d, "updateCloudToNotFinished Exception");
            return -1;
        }
    }

    public int h(lub lubVar, String str, String str2) {
        if (lubVar == null) {
            LogUtil.j(d, "updateSendCommandFinished manager is null");
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendcommondfinished", "true");
            return lubVar.updateStorageData("migrate_acc_tab_", 1, contentValues, "originalhuid=" + str + " and tohuid=" + str2);
        } catch (Exception unused) {
            LogUtil.e(d, "updateSendCommandFinished Exception");
            return -1;
        }
    }

    public boolean a(lub lubVar, String str, String str2) {
        boolean z = false;
        if (lubVar == null) {
            LogUtil.j(d, "isExist manager is null");
            return false;
        }
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = lubVar.rawQueryStorageData(1, "SELECT  *  FROM " + lubVar.getTableFullName("migrate_acc_tab_") + " WHERE tohuid like ?  AND originalhuid like ? ", new String[]{str2, str});
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.getCount() > 0) {
                    LogUtil.d(d, "isExist cursor.getCount():", Integer.valueOf(cursorRawQueryStorageData.getCount()));
                    z = true;
                }
                return z;
            } catch (Exception unused) {
                LogUtil.e(d, "isExist Exception");
                return false;
            }
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public ArrayList<ltz> d(lub lubVar, String str) throws Throwable {
        Throwable th;
        Cursor cursorRawQueryStorageData;
        ArrayList<ltz> arrayList = new ArrayList<>();
        if (lubVar == null) {
            LogUtil.j(d, "fetch manager is null");
            return arrayList;
        }
        Cursor cursor = null;
        try {
            try {
                cursorRawQueryStorageData = lubVar.rawQueryStorageData(1, "SELECT  *  FROM " + lubVar.getTableFullName("migrate_acc_tab_") + " WHERE tohuid = ?", new String[]{str});
                try {
                    if (cursorRawQueryStorageData == null) {
                        LogUtil.j(d, "fetch cursor is null");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                    LogUtil.d(d, "fetch cursor.getCount():", Integer.valueOf(cursorRawQueryStorageData.getCount()));
                    while (cursorRawQueryStorageData.moveToNext()) {
                        ltz ltzVarA = a(cursorRawQueryStorageData);
                        LogUtil.d(d, "fetch migrateTable:", ltzVarA.toString());
                        arrayList.add(ltzVarA);
                    }
                    if (cursorRawQueryStorageData != null) {
                        cursorRawQueryStorageData.close();
                        return arrayList;
                    }
                    return arrayList;
                } catch (Exception unused) {
                    cursor = cursorRawQueryStorageData;
                    LogUtil.e(d, "fetch Exception");
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorRawQueryStorageData != null) {
                        cursorRawQueryStorageData.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryStorageData = cursor;
        }
    }

    private ltz a(Cursor cursor) {
        ltz ltzVar;
        synchronized (this) {
            ltzVar = new ltz();
            ltzVar.e(cursor.getString(cursor.getColumnIndex("originalhuid")));
            ltzVar.b(cursor.getString(cursor.getColumnIndex("originalst")));
            ltzVar.a(cursor.getString(cursor.getColumnIndex("tohuid")));
            ltzVar.c(cursor.getString(cursor.getColumnIndex("time")));
            if ("true".equals(cursor.getString(cursor.getColumnIndex("sendcommondfinished")))) {
                ltzVar.c(true);
            } else {
                ltzVar.c(false);
            }
            if ("true".equals(cursor.getString(cursor.getColumnIndex("cloudfinished")))) {
                ltzVar.d(true);
            } else {
                ltzVar.d(false);
            }
            if ("true".equals(cursor.getString(cursor.getColumnIndex("localfinished")))) {
                ltzVar.a(true);
            } else {
                ltzVar.a(false);
            }
        }
        return ltzVar;
    }
}
