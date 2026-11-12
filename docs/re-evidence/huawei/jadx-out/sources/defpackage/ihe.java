package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ihe {
    private static final Object d = new Object();

    private String e() {
        return igy.e().getTableFullName("health_life_snapshot");
    }

    public boolean a(qfp qfpVar, String str) {
        if (qfpVar == null) {
            LogUtil.j("TaskPlatform_SnapShotDao", "insertSnap snapShotInfo is null");
            return false;
        }
        LogUtil.a("TaskPlatform_SnapShotDao", "insertSnap");
        if (a(qfpVar.a(), str)) {
            return c(qfpVar, str);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", qfpVar.b());
        contentValues.put(ParsedFieldTag.RECORD_DAY, Integer.valueOf(qfpVar.a()));
        contentValues.put("modifiedTime", Long.valueOf(qfpVar.e()));
        contentValues.put("timeZone", qfpVar.h());
        contentValues.put("deviceModel", qfpVar.d());
        contentValues.put("snapshotId", qfpVar.c());
        contentValues.put(ParsedFieldTag.TASKS, qfpVar.g());
        contentValues.put("syncStatus", Integer.valueOf(qfpVar.i()));
        contentValues.put("huid", str);
        long jInsertStorageData = igy.e().insertStorageData("health_life_snapshot", 1, contentValues);
        LogUtil.d("TaskPlatform_SnapShotDao", "insertSnap：", contentValues.toString());
        return (jInsertStorageData <= 0 || jInsertStorageData == 200004 || jInsertStorageData == 201000) ? false : true;
    }

    private boolean a(int i, String str) {
        boolean z = false;
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, "select * from " + e() + " where recordDay=? and huid=? and syncStatus=?", new String[]{String.valueOf(i), str, String.valueOf(0)});
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToFirst()) {
                    z = true;
                }
            } catch (SQLException e) {
                LogUtil.e("TaskPlatform_SnapShotDao", "isSnapExist SQLException ", ExceptionUtils.c(e));
            }
            return z;
        } finally {
            igy.e().c(cursorRawQueryStorageData);
        }
    }

    public boolean c(qfp qfpVar, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", qfpVar.b());
        contentValues.put("modifiedTime", Long.valueOf(qfpVar.e()));
        contentValues.put("timeZone", qfpVar.h());
        contentValues.put("deviceModel", qfpVar.d());
        contentValues.put("snapshotId", qfpVar.c());
        contentValues.put(ParsedFieldTag.TASKS, qfpVar.g());
        contentValues.put("syncStatus", Integer.valueOf(qfpVar.i()));
        int iUpdateStorageData = igy.e().updateStorageData("health_life_snapshot", 1, contentValues, "recordDay =? and huid=?", new String[]{String.valueOf(qfpVar.a()), str});
        LogUtil.a("TaskPlatform_SnapShotDao", "updateSnap result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public boolean b(List<String> list, int i, String str) {
        if (njy.e(list)) {
            LogUtil.j("TaskPlatform_SnapShotDao", "updateSnapStatus snapShotIds is empty");
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("syncStatus", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("huid=? and snapshotId in (");
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
        int iUpdateStorageData = igy.e().updateStorageData("health_life_snapshot", 1, contentValues, sb.toString(), (String[]) arrayList.toArray(new String[0]));
        LogUtil.a("TaskPlatform_SnapShotDao", "updateSnap result:", Integer.valueOf(iUpdateStorageData));
        return (iUpdateStorageData <= 0 || iUpdateStorageData == 200004 || iUpdateStorageData == 201000) ? false : true;
    }

    public List<qfp> d(String str) {
        StringBuilder sb = new StringBuilder("select * from " + e() + " where ");
        sb.append("huid=? and syncStatus=?");
        LogUtil.d("TaskPlatform_SnapShotDao", "queryTask sql:", sb.toString());
        int i = 0;
        try {
            try {
                Cursor cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, sb.toString(), new String[]{str, String.valueOf(0)});
                if (cursorRawQueryStorageData == null) {
                    ArrayList arrayList = new ArrayList();
                    igy.e().c(cursorRawQueryStorageData);
                    return arrayList;
                }
                Integer numA = lsu.a("planId", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA2 = lsu.a(ParsedFieldTag.RECORD_DAY, cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA3 = lsu.a("modifiedTime", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA4 = lsu.a("timeZone", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA5 = lsu.a("deviceModel", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA6 = lsu.a("snapshotId", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA7 = lsu.a(ParsedFieldTag.TASKS, cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                Integer numA8 = lsu.a("syncStatus", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                ArrayList arrayList2 = new ArrayList(16);
                while (cursorRawQueryStorageData.moveToNext()) {
                    qfp qfpVar = new qfp();
                    String string = "";
                    qfpVar.d(numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue()));
                    qfpVar.a(numA2 == null ? i : cursorRawQueryStorageData.getInt(numA2.intValue()));
                    qfpVar.c(numA3 == null ? 0L : cursorRawQueryStorageData.getLong(numA3.intValue()));
                    qfpVar.e(numA4 == null ? "" : cursorRawQueryStorageData.getString(numA4.intValue()));
                    qfpVar.a(numA5 == null ? "" : cursorRawQueryStorageData.getString(numA5.intValue()));
                    qfpVar.c(numA6 == null ? "" : cursorRawQueryStorageData.getString(numA6.intValue()));
                    if (numA7 != null) {
                        string = cursorRawQueryStorageData.getString(numA7.intValue());
                    }
                    qfpVar.b(string);
                    qfpVar.b(numA8 == null ? 0 : cursorRawQueryStorageData.getInt(numA8.intValue()));
                    arrayList2.add(qfpVar);
                    i = 0;
                }
                igy.e().c(cursorRawQueryStorageData);
                return arrayList2;
            } catch (Throwable th) {
                igy.e().c(null);
                throw th;
            }
        } catch (SQLiteException | JsonSyntaxException | IllegalArgumentException e) {
            LogUtil.e("TaskPlatform_SnapShotDao", "queryTask Exception : ", ExceptionUtils.c(e));
            igy.e().c(null);
            return new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [igy] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public qfp b(String str) throws Throwable {
        Throwable e;
        Cursor cursorRawQueryStorageData;
        String string;
        String string2;
        String string3;
        StringBuilder sb = new StringBuilder("select * from ");
        sb.append(e());
        sb.append(" where huid=? and syncStatus=? order by recordDay asc limit 1");
        LogUtil.d("TaskPlatform_SnapShotDao", "queryEarliestSnapshot sql:", sb.toString());
        String[] strArr = {str, String.valueOf(0)};
        ?? r4 = 0;
        try {
            try {
                cursorRawQueryStorageData = igy.e().rawQueryStorageData(1, sb.toString(), strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToFirst()) {
                            qfp qfpVar = new qfp();
                            Integer numA = lsu.a("planId", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA2 = lsu.a(ParsedFieldTag.RECORD_DAY, cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA3 = lsu.a("modifiedTime", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA4 = lsu.a("timeZone", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA5 = lsu.a("deviceModel", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA6 = lsu.a("snapshotId", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA7 = lsu.a(ParsedFieldTag.TASKS, cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            Integer numA8 = lsu.a("syncStatus", cursorRawQueryStorageData, "TaskPlatform_SnapShotDao");
                            String string4 = "";
                            qfpVar.d(numA == null ? "" : cursorRawQueryStorageData.getString(numA.intValue()));
                            qfpVar.a(numA2 == null ? 0 : cursorRawQueryStorageData.getInt(numA2.intValue()));
                            qfpVar.c(numA3 == null ? 0L : cursorRawQueryStorageData.getLong(numA3.intValue()));
                            if (numA4 == null) {
                                string = "";
                            } else {
                                string = cursorRawQueryStorageData.getString(numA4.intValue());
                            }
                            qfpVar.e(string);
                            if (numA5 == null) {
                                string2 = "";
                            } else {
                                string2 = cursorRawQueryStorageData.getString(numA5.intValue());
                            }
                            qfpVar.a(string2);
                            if (numA6 == null) {
                                string3 = "";
                            } else {
                                string3 = cursorRawQueryStorageData.getString(numA6.intValue());
                            }
                            qfpVar.c(string3);
                            if (numA7 != null) {
                                string4 = cursorRawQueryStorageData.getString(numA7.intValue());
                            }
                            qfpVar.b(string4);
                            qfpVar.b(numA8 == null ? 0 : cursorRawQueryStorageData.getInt(numA8.intValue()));
                            igy.e().c(cursorRawQueryStorageData);
                            return qfpVar;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
                    } catch (JsonSyntaxException e3) {
                        e = e3;
                        LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
                    }
                }
            } catch (Throwable th) {
                r4 = strArr;
                th = th;
                igy.e().c(r4);
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (JsonSyntaxException e6) {
            e = e6;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (IllegalArgumentException e7) {
            e = e7;
            e = e;
            cursorRawQueryStorageData = null;
            LogUtil.e("TaskPlatform_SnapShotDao", "queryEarliestSnapshot Exception : ", ExceptionUtils.c(e));
            igy.e().c(cursorRawQueryStorageData);
            return null;
        } catch (Throwable th2) {
            th = th2;
            igy.e().c(r4);
            throw th;
        }
        igy.e().c(cursorRawQueryStorageData);
        return null;
    }
}
