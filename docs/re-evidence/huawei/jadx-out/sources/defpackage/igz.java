package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class igz {
    private String c() {
        return igy.e().getTableFullName("health_result");
    }

    public boolean d(String str, qfl qflVar, String str2) {
        if (qflVar == null) {
            ReleaseLogUtil.e("TaskPlatform_HealthResultDao", "insertResult task is null");
            return false;
        }
        if (!b(qflVar.h(), qflVar.g(), str2)) {
            LogUtil.a("TaskPlatform_HealthResultDao", "insertResult");
            ContentValues contentValues = new ContentValues();
            contentValues.put("planId", str);
            contentValues.put("taskId", qflVar.g());
            contentValues.put("scheduleId", qflVar.i());
            contentValues.put(ParsedFieldTag.RECORD_DAY, Integer.valueOf(qflVar.h()));
            contentValues.put("syncStatus", Integer.valueOf(qflVar.d()));
            contentValues.put("scheduleResult", HiJsonUtil.d(qflVar));
            contentValues.put("huid", str2);
            long jInsertStorageData = igy.e().insertStorageData("health_result", 1, contentValues);
            LogUtil.a("TaskPlatform_HealthResultDao", "insertResult：", contentValues.toString());
            return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
        }
        return b(qflVar, str2);
    }

    public List<qfl> b(int i, List<String> list, String str) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append("?");
            if (i2 < list.size() - 1) {
                sb.append(",");
            }
        }
        String str2 = "select * from " + c() + " where recordDay=? and scheduleId in (" + ((Object) sb) + ") and huid=?";
        ArrayList arrayList = new ArrayList(list.size() + 2);
        arrayList.add(String.valueOf(i));
        arrayList.addAll(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(16);
        try {
            try {
                Cursor cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, str2, (String[]) arrayList.toArray(new String[0]));
                if (cursorRawQueryStorageData == null) {
                    ArrayList arrayList3 = new ArrayList();
                    igy.e().c(cursorRawQueryStorageData);
                    return arrayList3;
                }
                a(cursorRawQueryStorageData, arrayList2);
                igy.e().c(cursorRawQueryStorageData);
                return arrayList2;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | JsonSyntaxException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_HealthResultDao", "queryResults Exception : ", ExceptionUtils.c(e));
            igy.e().c(null);
            return arrayList2;
        }
    }

    private static void a(Cursor cursor, List<qfl> list) {
        String string;
        Integer numA = lsu.a("scheduleResult", cursor, "TaskPlatform_HealthResultDao");
        Integer numA2 = lsu.a("scheduleId", cursor, "TaskPlatform_HealthResultDao");
        Integer numA3 = lsu.a("taskId", cursor, "TaskPlatform_HealthResultDao");
        Integer numA4 = lsu.a(ParsedFieldTag.RECORD_DAY, cursor, "TaskPlatform_HealthResultDao");
        Integer numA5 = lsu.a("syncStatus", cursor, "TaskPlatform_HealthResultDao");
        while (cursor.moveToNext()) {
            String string2 = "";
            String string3 = numA == null ? "" : cursor.getString(numA.intValue());
            if (!TextUtils.isEmpty(string3)) {
                qfl qflVar = (qfl) HiJsonUtil.d(string3, qfl.class);
                if (qflVar == null) {
                    LogUtil.j("TaskPlatform_HealthResultDao", "scheduleResult is null");
                    qflVar = new qfl();
                }
                if (numA2 == null) {
                    string = "";
                } else {
                    string = cursor.getString(numA2.intValue());
                }
                qflVar.b(string);
                if (numA3 != null) {
                    string2 = cursor.getString(numA3.intValue());
                }
                qflVar.e(string2);
                qflVar.b(numA4 == null ? 0 : cursor.getInt(numA4.intValue()));
                qflVar.d(numA5 != null ? cursor.getInt(numA5.intValue()) : 0);
                list.add(qflVar);
            }
        }
    }

    private boolean b(int i, String str, String str2) {
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, "select * from " + c() + " where recordDay=? and taskId=? and huid=?", new String[]{String.valueOf(i), str, str2});
                return cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToFirst();
            } catch (SQLException e) {
                LogUtil.e("TaskPlatform_HealthResultDao", "isScheduleResultExist SQLException ", ExceptionUtils.c(e));
                return false;
            }
        } finally {
            igy.e().c(cursorRawQueryStorageData);
        }
    }

    public boolean b(qfl qflVar, String str) {
        String strD;
        ContentValues contentValues = new ContentValues();
        contentValues.put("taskId", qflVar.g());
        contentValues.put("scheduleId", qflVar.i());
        contentValues.put("syncStatus", Integer.valueOf(qflVar.d()));
        contentValues.put("scheduleResult", HiJsonUtil.d(qflVar));
        contentValues.put("huid", str);
        int iUpdateStorageData = igy.e().updateStorageData("health_result", 1, contentValues, "recordDay=? and taskId =? and huid=?", new String[]{String.valueOf(qflVar.h()), qflVar.g(), str});
        if (!njy.b(qflVar.a())) {
            strD = "";
        } else {
            strD = qflVar.a().get(0).d();
        }
        String strG = qflVar.g();
        LogUtil.a("TaskPlatform_HealthResultDao", "updateScheduleResult taskId:", strG, " recordDay：", Integer.valueOf(qflVar.h()), " scheduleId:", qflVar.i(), " value", strD, " result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }
}
