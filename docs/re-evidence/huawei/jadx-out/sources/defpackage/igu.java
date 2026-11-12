package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Objects;

/* JADX INFO: loaded from: classes31.dex */
public class igu {
    private String b() {
        return igy.e().getTableFullName("health_life_task");
    }

    public boolean e(qfc qfcVar, String str) throws Throwable {
        if (qfcVar == null) {
            LogUtil.j("TaskPlatform_HealthLifeTaskDao", "insertOrUpdateTask lifeTask is null");
            return false;
        }
        qfc qfcVarD = d(qfcVar.b(), qfcVar.g(), str);
        if (qfcVarD == null) {
            LogUtil.a("TaskPlatform_HealthLifeTaskDao", "insertNewTask");
            return b(qfcVar, str);
        }
        if (Objects.equals(qfcVarD.d(), qfcVar.d())) {
            LogUtil.a("TaskPlatform_HealthLifeTaskDao", "no need to insert or update");
            return false;
        }
        if (d(qfcVar, qfcVarD, str)) {
            return true;
        }
        LogUtil.a("TaskPlatform_HealthLifeTaskDao", "updateTask");
        qfcVarD.d(qfcVar.d());
        return b(qfcVarD.b(), qfcVarD, str);
    }

    private boolean d(qfc qfcVar, qfc qfcVar2, String str) {
        if (qfcVar.b() == qfcVar2.b()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (qfcVar.b() == DateFormatUtil.a(jCurrentTimeMillis)) {
            qfcVar.e(qfcVar2.e());
            b(qfcVar, str);
            qfcVar2.e(DateFormatUtil.a(lsl.d(jCurrentTimeMillis, -1)));
            b(qfcVar2.b(), qfcVar2, str);
        } else {
            int iE = qfcVar2.e();
            qfcVar2.e(DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfcVar.b()), -1)));
            b(qfcVar2, str);
            qfcVar.e(qfcVar.b());
            b(qfcVar, str);
            int iB = qfcVar2.b();
            qfcVar2.a(DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfcVar.b()), 1)));
            qfcVar2.e(iE);
            b(iB, qfcVar2, str);
        }
        return true;
    }

    private boolean b(qfc qfcVar, String str) {
        if (qfcVar == null) {
            LogUtil.j("TaskPlatform_HealthLifeTaskDao", "insertNewTask lifeTask is null");
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("startDay", Integer.valueOf(qfcVar.b()));
        contentValues.put("endDay", Integer.valueOf(qfcVar.e()));
        contentValues.put("datasource", Integer.valueOf(qfcVar.c()));
        contentValues.put(ParsedFieldTag.TASKS, HiJsonUtil.d(qfcVar.d()));
        contentValues.put("status", (Integer) 0);
        contentValues.put("timeZone", qfcVar.g());
        contentValues.put("huid", str);
        long jInsertStorageData = igy.e().insertStorageData("health_life_task", 1, contentValues);
        LogUtil.a("TaskPlatform_HealthLifeTaskDao", "insertNewTask：", contentValues.toString());
        return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [igy] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public qfc d(int i, String str, String str2) throws Throwable {
        Throwable e;
        Cursor cursorRawQueryStorageData;
        String str3 = "select * from " + b() + " where startDay<=? and endDay>=? and huid=?";
        String[] strArr = {String.valueOf(i), String.valueOf(i), str2};
        ?? r2 = 0;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            Integer numA = lsu.a(ParsedFieldTag.TASKS, cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            Integer numA2 = lsu.a("startDay", cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            Integer numA3 = lsu.a("endDay", cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            Integer numA4 = lsu.a("datasource", cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            Integer numA5 = lsu.a("status", cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            Integer numA6 = lsu.a("timeZone", cursorRawQueryStorageData, "TaskPlatform_HealthLifeTaskDao");
                            String string = "";
                            String string2 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                            qfa qfaVar = !TextUtils.isEmpty(string2) ? (qfa) HiJsonUtil.d(string2, qfa.class) : null;
                            qfc qfcVar = new qfc();
                            qfcVar.a(numA2 == null ? 0 : cursorRawQueryStorageData.getInt(numA2.intValue()));
                            qfcVar.e(numA3 == null ? 0 : cursorRawQueryStorageData.getInt(numA3.intValue()));
                            qfcVar.d(numA4 == null ? 0 : cursorRawQueryStorageData.getInt(numA4.intValue()));
                            qfcVar.d(qfaVar);
                            qfcVar.c(numA5 == null ? 0 : cursorRawQueryStorageData.getInt(numA5.intValue()));
                            if (numA6 != null) {
                                string = cursorRawQueryStorageData.getString(numA6.intValue());
                            }
                            qfcVar.b(string);
                            igy.e().c(cursorRawQueryStorageData);
                            return qfcVar;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
                    } catch (JsonSyntaxException e3) {
                        e = e3;
                        LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
                    }
                }
            } catch (Throwable th) {
                r2 = strArr;
                th = th;
                igy.e().c(r2);
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (JsonSyntaxException e6) {
            e = e6;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (IllegalArgumentException e7) {
            e = e7;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthLifeTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (Throwable th2) {
            th = th2;
            igy.e().c(r2);
            throw th;
        }
        igy.e().c(cursorRawQueryStorageData);
        return null;
    }

    public boolean b(int i, qfc qfcVar, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("startDay", Integer.valueOf(qfcVar.b()));
        contentValues.put("endDay", Integer.valueOf(qfcVar.e()));
        contentValues.put("datasource", Integer.valueOf(qfcVar.c()));
        contentValues.put(ParsedFieldTag.TASKS, HiJsonUtil.d(qfcVar.d()));
        contentValues.put("timeZone", qfcVar.g());
        contentValues.put("status", Integer.valueOf(qfcVar.a()));
        int iUpdateStorageData = igy.e().updateStorageData("health_life_task", 1, contentValues, "startDay =? and huid=?", new String[]{String.valueOf(i), str});
        LogUtil.a("TaskPlatform_HealthLifeTaskDao", "updateTask result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }
}
