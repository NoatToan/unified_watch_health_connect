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
import com.huawei.operation.utils.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ihc {
    private String c() {
        return igy.e().getTableFullName("health_task");
    }

    public boolean c(qfy qfyVar, String str) throws Throwable {
        if (qfyVar == null) {
            ReleaseLogUtil.e("TaskPlatform_HealthTaskDao", "insertTask task is null");
            return false;
        }
        LogUtil.a("TaskPlatform_HealthTaskDao", "insertTask");
        qfy qfyVarA = a(qfyVar.h(), str);
        if (qfyVarA != null) {
            return d(qfyVar, qfyVarA, str);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("taskId", qfyVar.h());
        contentValues.put("parentId", qfyVar.d());
        contentValues.put("task", HiJsonUtil.d(qfyVar));
        contentValues.put("huid", str);
        long jInsertStorageData = igy.e().insertStorageData("health_task", 1, contentValues);
        LogUtil.d("TaskPlatform_HealthTaskDao", "insertTask：", contentValues.toString());
        return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
    }

    private qfy a(String str, String str2) throws Throwable {
        SQLException e;
        Cursor cursorRawQueryStorageData;
        Cursor cursor = null;
        try {
            cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, "select * from " + c() + " where taskId=? and huid=?", new String[]{str, str2});
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            Integer numA = lsu.a("task", cursorRawQueryStorageData, "TaskPlatform_HealthTaskDao");
                            String string = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                            if (!TextUtils.isEmpty(string)) {
                                qfy qfyVar = (qfy) HiJsonUtil.d(string, qfy.class);
                                igy.e().c(cursorRawQueryStorageData);
                                return qfyVar;
                            }
                        }
                    } catch (SQLException e2) {
                        e = e2;
                        LogUtil.e("TaskPlatform_HealthTaskDao", "isTaskExist SQLException ", ExceptionUtils.c(e));
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

    public boolean d(qfy qfyVar, qfy qfyVar2, String str) {
        if (njy.b(qfyVar.n())) {
            qfyVar2.d(qfyVar.n());
        }
        if (njy.b(qfyVar.r())) {
            qfyVar2.a(qfyVar.r());
        }
        if (!TextUtils.isEmpty(qfyVar.a())) {
            qfyVar2.a(qfyVar.a());
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("task", HiJsonUtil.d(qfyVar2));
        contentValues.put("parentId", qfyVar.d());
        contentValues.put("status", Integer.valueOf(qfyVar.o()));
        int iUpdateStorageData = igy.e().updateStorageData("health_task", 1, contentValues, "taskId =? and huid=?", new String[]{qfyVar.h(), str});
        LogUtil.a("TaskPlatform_HealthTaskDao", "updateTask result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public List<qfy> e(List<String> list, String str) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("select * from " + c() + " where ");
        sb.append("huid=? and taskId in (");
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i))) {
                sb.append("?");
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                arrayList.add(list.get(i));
            }
        }
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        LogUtil.a("TaskPlatform_HealthTaskDao", "queryTask sql:", sb.toString());
        ArrayList arrayList2 = new ArrayList(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, sb.toString(), (String[]) arrayList.toArray(new String[0]));
                if (cursorRawQueryStorageData == null) {
                    ArrayList arrayList3 = new ArrayList();
                    igy.e().c(cursorRawQueryStorageData);
                    return arrayList3;
                }
                b(cursorRawQueryStorageData, arrayList2);
                Map<String, List<String>> mapC = c(list, str);
                if (!njy.e(mapC)) {
                    for (qfy qfyVar : arrayList2) {
                        qfyVar.a(mapC.get(qfyVar.h()));
                    }
                }
                igy.e().c(cursorRawQueryStorageData);
                return arrayList2;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | JsonSyntaxException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_HealthTaskDao", "queryTask Exception : ", ExceptionUtils.c(e));
        }
    }

    private void b(Cursor cursor, List<qfy> list) {
        String string;
        Integer numA = lsu.a("task", cursor, "TaskPlatform_HealthTaskDao");
        Integer numA2 = lsu.a("taskId", cursor, "TaskPlatform_HealthTaskDao");
        Integer numA3 = lsu.a("parentId", cursor, "TaskPlatform_HealthTaskDao");
        Integer numA4 = lsu.a("status", cursor, "TaskPlatform_HealthTaskDao");
        while (cursor.moveToNext()) {
            String string2 = "";
            String string3 = numA == null ? "" : cursor.getString(numA.intValue());
            if (!TextUtils.isEmpty(string3)) {
                qfy qfyVar = (qfy) HiJsonUtil.d(string3, qfy.class);
                if (qfyVar == null) {
                    LogUtil.j("TaskPlatform_HealthTaskDao", "taskDetail is null");
                    qfyVar = new qfy();
                }
                if (numA2 == null) {
                    string = "";
                } else {
                    string = cursor.getString(numA2.intValue());
                }
                qfyVar.f(string);
                if (numA3 != null) {
                    string2 = cursor.getString(numA3.intValue());
                }
                qfyVar.e(string2);
                qfyVar.a(numA4 == null ? 0 : cursor.getInt(numA4.intValue()));
                list.add(qfyVar);
            }
        }
    }

    private Map<String, List<String>> c(List<String> list, String str) {
        if (njy.e(list)) {
            return new HashMap();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("select parentId, taskId from ");
        sb.append(c());
        sb.append(" where huid=? and parentId in (");
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i))) {
                sb.append("?");
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                arrayList.add(list.get(i));
            }
        }
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        HashMap map = new HashMap();
        try {
            try {
                Cursor cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, sb.toString(), (String[]) arrayList.toArray(new String[0]));
                if (cursorRawQueryStorageData != null) {
                    Integer numA = lsu.a("parentId", cursorRawQueryStorageData, "TaskPlatform_HealthTaskDao");
                    Integer numA2 = lsu.a("taskId", cursorRawQueryStorageData, "TaskPlatform_HealthTaskDao");
                    while (cursorRawQueryStorageData.moveToNext()) {
                        String string = "";
                        String string2 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                        if (numA2 != null) {
                            string = cursorRawQueryStorageData.getString(numA2.intValue());
                        }
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string)) {
                            List arrayList2 = (List) map.get(string2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map.put(string2, arrayList2);
                            }
                            arrayList2.add(string);
                        }
                    }
                    igy.e().c(cursorRawQueryStorageData);
                    return map;
                }
                igy.e().c(cursorRawQueryStorageData);
                return map;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_HealthTaskDao", "querySubTaskIdsBatch Exception : ", e.toString());
            igy.e().c(null);
            return map;
        }
    }

    public List<qfz> d(List<String> list, String str) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("select * from " + c() + " where ");
        sb.append("huid=? and taskId in (");
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(list.get(i))) {
                sb.append("?");
                if (i < list.size() - 1) {
                    sb.append(",");
                }
                arrayList.add(list.get(i));
            }
        }
        sb.append(Constants.RIGHT_BRACKET_ONLY);
        LogUtil.a("TaskPlatform_HealthTaskDao", "queryTask sql:", sb.toString());
        ArrayList arrayList2 = new ArrayList(16);
        try {
            try {
                Cursor cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, sb.toString(), (String[]) arrayList.toArray(new String[0]));
                if (cursorRawQueryStorageData == null) {
                    ArrayList arrayList3 = new ArrayList();
                    igy.e().c(cursorRawQueryStorageData);
                    return arrayList3;
                }
                Integer numA = lsu.a("task", cursorRawQueryStorageData, "TaskPlatform_HealthTaskDao");
                Integer numA2 = lsu.a("taskId", cursorRawQueryStorageData, "TaskPlatform_HealthTaskDao");
                while (cursorRawQueryStorageData.moveToNext()) {
                    String string = "";
                    String string2 = numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue());
                    if (!TextUtils.isEmpty(string2)) {
                        qfz qfzVar = (qfz) HiJsonUtil.d(string2, qfz.class);
                        if (qfzVar == null) {
                            LogUtil.j("TaskPlatform_HealthTaskDao", "taskSchedule is null");
                            qfzVar = new qfz();
                        }
                        if (numA2 != null) {
                            string = cursorRawQueryStorageData.getString(numA2.intValue());
                        }
                        qfzVar.e(string);
                        arrayList2.add(qfzVar);
                    }
                }
                igy.e().c(cursorRawQueryStorageData);
                return arrayList2;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | JsonSyntaxException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_HealthTaskDao", "queryTask Exception : ", ExceptionUtils.c(e));
            igy.e().c(null);
            return arrayList2;
        }
    }
}
