package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iha {
    private String b() {
        return igy.e().getTableFullName("health_schedule");
    }

    public boolean c(String str, int i, qfk qfkVar, String str2) throws Throwable {
        if (qfkVar == null) {
            LogUtil.j("TaskPlatform_HealthScheduleDao", "insertSchedule schedule is null");
            return false;
        }
        LogUtil.a("TaskPlatform_HealthScheduleDao", "insertSchedule");
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        qfk qfkVarC = c(qfkVar.ab(), i, str2);
        if (qfkVarC == null) {
            qfkVar.h(iA == i ? qfkVar.s() : i);
            if (iA == i) {
                i = qfkVar.h();
            }
            qfkVar.d(i);
            return a(str, qfkVar.ab(), qfkVar, str2);
        }
        if (TextUtils.equals(qfkVarC.v(), qfkVar.v())) {
            LogUtil.a("TaskPlatform_HealthScheduleDao", "insertSchedule same schedule, no need to update");
            return true;
        }
        qfkVar.h(i);
        if (iA == i) {
            i = qfkVar.h();
        }
        qfkVar.d(i);
        return e(str, qfkVar.ab(), qfkVar, qfkVarC, str2);
    }

    private boolean e(String str, String str2, qfk qfkVar, qfk qfkVar2, String str3) {
        if (qfkVar.s() == qfkVar2.s() && qfkVar.h() == qfkVar2.h()) {
            e(qfkVar2.v(), qfkVar2.s(), str3);
            return a(str, str2, qfkVar, str3);
        }
        if (qfkVar.s() == qfkVar2.s() && qfkVar.h() < qfkVar2.h()) {
            int iA = DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfkVar.h()), 1));
            int iS = qfkVar2.s();
            qfkVar2.h(iA);
            a(iS, qfkVar2, str3);
            return a(str, str2, qfkVar, str3);
        }
        if (qfkVar.s() > qfkVar2.s() && qfkVar.h() < qfkVar2.h()) {
            int iS2 = qfkVar2.s();
            qfkVar2.h(DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfkVar.h()), 1)));
            a(iS2, qfkVar2, str3);
            qfkVar2.h(iS2);
            qfkVar2.d(DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfkVar.s()), -1)));
            a(str, str2, qfkVar2, str3);
            return a(str, str2, qfkVar, str3);
        }
        if (qfkVar.s() <= qfkVar2.s() || qfkVar.h() < qfkVar2.h()) {
            return false;
        }
        qfkVar2.d(DateFormatUtil.a(lsl.d(DateFormatUtil.d(qfkVar.s()), -1)));
        a(qfkVar2.s(), qfkVar2, str3);
        return a(str, str2, qfkVar, str3);
    }

    private boolean a(String str, String str2, qfk qfkVar, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", str);
        contentValues.put("taskId", str2);
        contentValues.put("scheduleId", qfkVar.v());
        contentValues.put("startDay", Integer.valueOf(qfkVar.s()));
        contentValues.put("endDay", Integer.valueOf(qfkVar.h()));
        contentValues.put("schedule", HiJsonUtil.d(qfkVar));
        contentValues.put("huid", str3);
        long jInsertStorageData = igy.e().insertStorageData("health_schedule", 1, contentValues);
        LogUtil.d("TaskPlatform_HealthScheduleDao", "insertSchedule：", contentValues.toString());
        return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
    }

    private qfk c(String str, int i, String str2) throws Throwable {
        SQLException e;
        Cursor cursorRawQueryStorageData;
        String string;
        Cursor cursor = null;
        try {
            cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, "select * from " + b() + " where taskId=? and huid=? and startDay <=? and endDay >=?", new String[]{str, str2, String.valueOf(i), String.valueOf(i)});
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            Integer numA = lsu.a("schedule", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                            Integer numA2 = lsu.a("scheduleId", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                            Integer numA3 = lsu.a("taskId", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                            Integer numA4 = lsu.a("startDay", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                            Integer numA5 = lsu.a("endDay", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                            String string2 = "";
                            String string3 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                            if (!TextUtils.isEmpty(string3)) {
                                qfk qfkVar = (qfk) HiJsonUtil.d(string3, qfk.class);
                                if (qfkVar == null) {
                                    LogUtil.j("TaskPlatform_HealthScheduleDao", "scheduleDetail is null");
                                    qfkVar = new qfk();
                                }
                                if (numA2 == null) {
                                    string = "";
                                } else {
                                    string = cursorRawQueryStorageData.getString(numA2.intValue());
                                }
                                qfkVar.i(string);
                                if (numA3 != null) {
                                    string2 = cursorRawQueryStorageData.getString(numA3.intValue());
                                }
                                qfkVar.h(string2);
                                qfkVar.h(numA4 == null ? 0 : cursorRawQueryStorageData.getInt(numA4.intValue()));
                                qfkVar.d(numA5 == null ? 0 : cursorRawQueryStorageData.getInt(numA5.intValue()));
                                igy.e().c(cursorRawQueryStorageData);
                                return qfkVar;
                            }
                            igy.e().c(cursorRawQueryStorageData);
                            return null;
                        }
                    } catch (SQLException e2) {
                        e = e2;
                        LogUtil.e("TaskPlatform_HealthScheduleDao", "isScheduleExist SQLException ", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    cursor = cursorRawQueryStorageData;
                    th = th;
                    igy.e().c(cursor);
                    throw th;
                }
            }
        } catch (SQLException e3) {
            e = e3;
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            igy.e().c(cursor);
            throw th;
        }
        igy.e().c(cursorRawQueryStorageData);
        return null;
    }

    private boolean a(int i, qfk qfkVar, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("startDay", Integer.valueOf(qfkVar.s()));
        contentValues.put("endDay", Integer.valueOf(qfkVar.h()));
        contentValues.put("schedule", HiJsonUtil.d(qfkVar));
        int iUpdateStorageData = igy.e().updateStorageData("health_schedule", 1, contentValues, "taskId=? and huid=? and startDay <=? and endDay >=?", new String[]{qfkVar.ab(), str, String.valueOf(i), String.valueOf(i)});
        LogUtil.a("TaskPlatform_HealthScheduleDao", "updateTask result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public List<qfk> e(List<String> list, int i, String str) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i));
        arrayList.add(String.valueOf(i));
        StringBuilder sb = new StringBuilder("select * from " + b() + " where ");
        sb.append("huid=? and startDay <=? and endDay >=? and taskId in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!TextUtils.isEmpty(list.get(i2))) {
                sb.append("?");
                if (i2 < list.size() - 1) {
                    sb.append(",");
                }
                arrayList.add(list.get(i2));
            }
        }
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        LogUtil.a("TaskPlatform_HealthScheduleDao", "queryPlanSchedules sql:", sb.toString());
        return c(sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }

    private List<qfk> c(String str, String[] strArr) {
        String string;
        ArrayList arrayList = new ArrayList(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, str, strArr);
                if (cursorRawQueryStorageData != null) {
                    Integer numA = lsu.a("schedule", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                    Integer numA2 = lsu.a("scheduleId", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                    Integer numA3 = lsu.a("taskId", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                    Integer numA4 = lsu.a("startDay", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                    Integer numA5 = lsu.a("endDay", cursorRawQueryStorageData, "TaskPlatform_HealthScheduleDao");
                    while (cursorRawQueryStorageData.moveToNext()) {
                        String string2 = "";
                        String string3 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                        if (!TextUtils.isEmpty(string3)) {
                            qfk qfkVar = (qfk) HiJsonUtil.d(string3, qfk.class);
                            if (qfkVar == null) {
                                LogUtil.j("TaskPlatform_HealthScheduleDao", "scheduleDetail is null");
                                qfkVar = new qfk();
                            }
                            if (numA2 == null) {
                                string = "";
                            } else {
                                string = cursorRawQueryStorageData.getString(numA2.intValue());
                            }
                            qfkVar.i(string);
                            if (numA3 != null) {
                                string2 = cursorRawQueryStorageData.getString(numA3.intValue());
                            }
                            qfkVar.h(string2);
                            qfkVar.h(numA4 == null ? 0 : cursorRawQueryStorageData.getInt(numA4.intValue()));
                            qfkVar.d(numA5 == null ? 0 : cursorRawQueryStorageData.getInt(numA5.intValue()));
                            arrayList.add(qfkVar);
                        }
                    }
                    igy.e().c(cursorRawQueryStorageData);
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                igy.e().c(cursorRawQueryStorageData);
                return arrayList2;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | JsonSyntaxException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_HealthScheduleDao", "querySchedule Exception : ", ExceptionUtils.c(e));
        }
    }

    public void d(String str, String str2) throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.d(jCurrentTimeMillis, -1));
        qfk qfkVarC = c(str, iA, str2);
        if (qfkVarC == null) {
            return;
        }
        if (qfkVarC.s() > iA2) {
            e(qfkVarC.v(), iA, str2);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("endDay", Integer.valueOf(iA2));
        LogUtil.a("TaskPlatform_HealthScheduleDao", "deleteTodaySchedule result:", Integer.valueOf(igy.e().updateStorageData("health_schedule", 1, contentValues, "taskId=? and huid=? and startDay <=? and endDay >=?", new String[]{str, str2, String.valueOf(iA), String.valueOf(iA)})));
    }

    private void e(String str, int i, String str2) {
        LogUtil.a("TaskPlatform_HealthScheduleDao", "deleteSchedule scheduleId=", str, " day:", Integer.valueOf(i), ", result is :", Integer.valueOf(igy.e().deleteStorageData("health_schedule", 1, "scheduleId=? and startDay <=? and endDay >=? and huid=?", new String[]{str, String.valueOf(i), String.valueOf(i), str2})));
    }
}
