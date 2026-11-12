package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ihb {
    private String e() {
        return igy.e().getTableFullName("health_plan");
    }

    public boolean b(qey qeyVar, String str) {
        if (qeyVar == null) {
            ReleaseLogUtil.e("TaskPlatform_HealthPlanDao", "insertPlan planDetail is null");
            return false;
        }
        LogUtil.a("TaskPlatform_HealthPlanDao", "insertPlan");
        if (e(qeyVar.h(), str) != null) {
            return a(qeyVar, str);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", qeyVar.h());
        contentValues.put("startDay", Integer.valueOf(qeyVar.i()));
        contentValues.put("endDay", Integer.valueOf(qeyVar.b()));
        contentValues.put("category", Integer.valueOf(qeyVar.e()));
        contentValues.put(Constants.AUTOCONTENT_SUBCATEGORY, Integer.valueOf(qeyVar.k()));
        contentValues.put("status", Integer.valueOf(qeyVar.f()));
        contentValues.put("timeZone", qeyVar.m());
        contentValues.put("plan", HiJsonUtil.d(qeyVar));
        contentValues.put("huid", str);
        long jInsertStorageData = igy.e().insertStorageData("health_plan", 1, contentValues);
        LogUtil.d("TaskPlatform_HealthPlanDao", "insertPlan：", contentValues.toString());
        return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [igy] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public qey e(String str, String str2) throws Throwable {
        Cursor cursorRawQueryStorageData;
        String[] strArr = {str, str2};
        ?? r5 = 0;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, "select * from " + e() + " where planId=? and huid=?", strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            Integer numA = lsu.a("plan", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA2 = lsu.a("planId", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA3 = lsu.a("startDay", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA4 = lsu.a("endDay", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA5 = lsu.a("category", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA6 = lsu.a(Constants.AUTOCONTENT_SUBCATEGORY, cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA7 = lsu.a("status", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            Integer numA8 = lsu.a("timeZone", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                            String string = "";
                            String string2 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                            qey qeyVar = !TextUtils.isEmpty(string2) ? (qey) HiJsonUtil.d(string2, qey.class) : null;
                            if (qeyVar == null) {
                                LogUtil.j("TaskPlatform_HealthPlanDao", "planDetail is null");
                                qeyVar = new qey();
                            }
                            qeyVar.d(numA2 == null ? str : cursorRawQueryStorageData.getString(numA2.intValue()));
                            qeyVar.d(numA3 == null ? 0 : cursorRawQueryStorageData.getInt(numA3.intValue()));
                            qeyVar.a(numA4 == null ? 0 : cursorRawQueryStorageData.getInt(numA4.intValue()));
                            qeyVar.e(numA5 == null ? 0 : cursorRawQueryStorageData.getInt(numA5.intValue()));
                            qeyVar.b(numA6 == null ? 0 : cursorRawQueryStorageData.getInt(numA6.intValue()));
                            qeyVar.c(numA7 == null ? 0 : cursorRawQueryStorageData.getInt(numA7.intValue()));
                            if (numA8 != null) {
                                string = cursorRawQueryStorageData.getString(numA8.intValue());
                            }
                            qeyVar.j(string);
                            igy.e().c(cursorRawQueryStorageData);
                            return qeyVar;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
                    } catch (JsonSyntaxException e2) {
                        e = e2;
                        LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
                    }
                }
            } catch (Throwable th) {
                th = th;
                r5 = strArr;
                igy.e().c(r5);
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (JsonSyntaxException e5) {
            e = e5;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (IllegalArgumentException e6) {
            e = e6;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_HealthPlanDao", "isPlanExist SQLException ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (Throwable th2) {
            th = th2;
            igy.e().c(r5);
            throw th;
        }
        igy.e().c(cursorRawQueryStorageData);
        return null;
    }

    public boolean a(qey qeyVar, String str) {
        ContentValues contentValues = new ContentValues();
        qeyVar.c(System.currentTimeMillis());
        contentValues.put("plan", HiJsonUtil.d(qeyVar));
        contentValues.put("category", Integer.valueOf(qeyVar.e()));
        contentValues.put(Constants.AUTOCONTENT_SUBCATEGORY, Integer.valueOf(qeyVar.k()));
        contentValues.put("startDay", Integer.valueOf(qeyVar.i()));
        contentValues.put("endDay", Integer.valueOf(qeyVar.b()));
        contentValues.put("status", Integer.valueOf(qeyVar.f()));
        contentValues.put("timeZone", qeyVar.m());
        int iUpdateStorageData = igy.e().updateStorageData("health_plan", 1, contentValues, "planId =? and huid=?", new String[]{qeyVar.h(), str});
        LogUtil.a("TaskPlatform_HealthPlanDao", "updatePlan result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public boolean a(String str, int i, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        int iUpdateStorageData = igy.e().updateStorageData("health_plan", 1, contentValues, "planId =? and huid=?", new String[]{str, str2});
        LogUtil.a("TaskPlatform_HealthPlanDao", "updatePlanStatus result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public List<qey> e(qev qevVar, String str) {
        String string;
        if (qevVar == null) {
            return new ArrayList();
        }
        String str2 = "select * from " + e() + " where category=? and subcategory=? and status=? and huid=?";
        String[] strArr = {String.valueOf(qevVar.b()), String.valueOf(qevVar.a()), String.valueOf(qevVar.c()), str};
        ArrayList arrayList = new ArrayList(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, str2, strArr);
                if (cursorRawQueryStorageData != null) {
                    Integer numA = lsu.a("plan", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA2 = lsu.a("planId", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA3 = lsu.a("startDay", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA4 = lsu.a("endDay", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA5 = lsu.a("category", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA6 = lsu.a(Constants.AUTOCONTENT_SUBCATEGORY, cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA7 = lsu.a("status", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    Integer numA8 = lsu.a("timeZone", cursorRawQueryStorageData, "TaskPlatform_HealthPlanDao");
                    while (cursorRawQueryStorageData.moveToNext()) {
                        String string2 = "";
                        String string3 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                        if (!TextUtils.isEmpty(string3)) {
                            qey qeyVar = (qey) HiJsonUtil.d(string3, qey.class);
                            if (qeyVar == null) {
                                LogUtil.j("TaskPlatform_HealthPlanDao", "planDetail is null");
                                qeyVar = new qey();
                            }
                            if (numA2 == null) {
                                string = "";
                            } else {
                                string = cursorRawQueryStorageData.getString(numA2.intValue());
                            }
                            qeyVar.d(string);
                            qeyVar.d(numA3 == null ? 0 : cursorRawQueryStorageData.getInt(numA3.intValue()));
                            qeyVar.a(numA4 == null ? 0 : cursorRawQueryStorageData.getInt(numA4.intValue()));
                            qeyVar.e(numA5 == null ? 0 : cursorRawQueryStorageData.getInt(numA5.intValue()));
                            qeyVar.b(numA6 == null ? 0 : cursorRawQueryStorageData.getInt(numA6.intValue()));
                            qeyVar.c(numA7 == null ? 0 : cursorRawQueryStorageData.getInt(numA7.intValue()));
                            if (numA8 != null) {
                                string2 = cursorRawQueryStorageData.getString(numA8.intValue());
                            }
                            qeyVar.j(string2);
                            arrayList.add(qeyVar);
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
            LogUtil.e("TaskPlatform_HealthPlanDao", "queryPlan Exception : ", ExceptionUtils.c(e));
        }
    }
}
