package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.ltb;
import defpackage.njy;
import defpackage.osa;
import defpackage.osf;
import defpackage.osg;
import defpackage.otd;
import defpackage.ote;
import defpackage.pap;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class KakaTaskRecordDBMgr implements IAchieveDBMgr {
    private Context e;

    public KakaTaskRecordDBMgr(Context context) {
        this.e = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(map.get("huid"))) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "queryAllKakaInfo, query, user id is null!return");
            return Collections.EMPTY_LIST;
        }
        StringBuilder sb = new StringBuilder("select *  from ");
        sb.append(otd.c(this.e).getTableFullName("kaka_task_record"));
        sb.append(" where ");
        String[] strArr = new String[map.size() + 3];
        int i = 0;
        long jM = 0;
        long jO = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (!TextUtils.isEmpty(value)) {
                String key = entry.getKey();
                try {
                    if ("taskStartTime".equals(key)) {
                        jM = Long.parseLong(value);
                    } else if ("taskEndTime".equals(key)) {
                        jO = Long.parseLong(value);
                    } else {
                        if ("taskRules".equals(key)) {
                            sb.append("taskRule in ? and ");
                        } else {
                            sb.append(key);
                            sb.append(CommonUtil.EQUAL_END);
                        }
                        strArr[i] = ote.e(value);
                        i++;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("PLGACHIEVE_KakaTaskRecordDBMgr", "queryAll: exception -> " + e.getMessage());
                }
            }
        }
        sb.append("timeZoneOffset =? and ");
        strArr[i] = ote.e(Integer.valueOf(TimeZone.getDefault().getRawOffset()));
        if (jM <= 0) {
            jM = ltb.m(new Date());
        }
        if (jO <= 0) {
            jO = ltb.o(new Date());
        }
        sb.append("taskSyncTimeStamp between ? and ? order by taskPriority desc");
        strArr[i + 1] = ote.e(Long.valueOf(jM * 1000));
        strArr[i + 2] = ote.e(Long.valueOf(jO * 1000));
        return c(sb.toString(), strArr);
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        List<osf> listQueryAll = queryAll(map);
        if (njy.e(listQueryAll)) {
            return null;
        }
        return listQueryAll.get(0);
    }

    private osf a(String str, String str2) {
        osg osgVar = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "KakaTaskRecordDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.e).getTableFullName("kaka_task_record") + " where taskId =? and huid=?";
        LogUtil.d("PLGACHIEVE_KakaTaskRecordDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.e).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (osgVar == null) {
                            osgVar = new osg();
                        }
                        osgVar.b(str);
                        c(cursorRawQueryStorageData, osgVar);
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return osgVar;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_KakaTaskRecordDBMgr", e.getMessage());
            return osgVar;
        }
    }

    private List<osf> c(String str, String[] strArr) {
        if (strArr == null) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "queryKakaInfoList, query ,param is null!return");
            return Collections.EMPTY_LIST;
        }
        String strE = osa.e(this.e, "cloudKakaTaskIds");
        LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "queryKakaInfoList: allTaskId is empty -> ", Boolean.valueOf(TextUtils.isEmpty(strE)));
        ArrayList arrayList = new ArrayList(8);
        LogUtil.d("PLGACHIEVE_KakaTaskRecordDBMgr", "query selection=", str);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.e).rawQueryStorageData(1, str, strArr);
            try {
                if (cursorRawQueryStorageData == null) {
                    LogUtil.e("PLGACHIEVE_KakaTaskRecordDBMgr", "queryKakaInfoList: cursor is null");
                    if (cursorRawQueryStorageData != null) {
                        cursorRawQueryStorageData.close();
                    }
                    return arrayList;
                }
                while (cursorRawQueryStorageData.moveToNext()) {
                    String strC = otd.c(cursorRawQueryStorageData, "taskId");
                    if (StringUtils.j(strE) && !strE.contains(strC)) {
                        LogUtil.j("PLGACHIEVE_KakaTaskRecordDBMgr", "queryKakaInfoList: differential taskId -> ", strC);
                    } else {
                        osg osgVar = new osg();
                        osgVar.b(strC);
                        c(cursorRawQueryStorageData, osgVar);
                        arrayList.add(osgVar);
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "queryKakaInfoList: size -> ", Integer.valueOf(arrayList.size()));
                return arrayList;
            } catch (Throwable th) {
                if (cursorRawQueryStorageData != null) {
                    try {
                        cursorRawQueryStorageData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.j("PLGACHIEVE_KakaTaskRecordDBMgr", e.getMessage());
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        osg osgVar = osfVar instanceof osg ? (osg) osfVar : null;
        if (osgVar == null) {
            return -1L;
        }
        osf osfVarA = a(osgVar.h(), osgVar.getHuid());
        if (osfVarA == null) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "queryAchieveData is null");
        }
        if (osfVarA instanceof osg) {
            return a(osgVar, (osg) osfVarA);
        }
        return d(osgVar) - 1;
    }

    private long d(osg osgVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", osgVar.getHuid());
        if (!c(contentValues, osgVar)) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "insert result is Invalid=", -1);
            return -1L;
        }
        long jInsertStorageData = otd.c(this.e).insertStorageData("kaka_task_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "insert insertKakaResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        osg osgVar = osfVar instanceof osg ? (osg) osfVar : null;
        if (osgVar == null) {
            return -1;
        }
        String[] strArr = {ote.e(osgVar.h())};
        LogUtil.d("PLGACHIEVE_KakaTaskRecordDBMgr", "delete selection=", "taskId=?");
        int iDeleteStorageData = otd.c(this.e).deleteStorageData("kaka_task_record", 1, "taskId=?", strArr);
        LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "delete deleteKakaResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        osg osgVar = osfVar instanceof osg ? (osg) osfVar : null;
        if (osgVar == null) {
            return -1;
        }
        osf osfVarA = a(osgVar.h(), osgVar.getHuid());
        if (osfVarA instanceof osg) {
            return a(osgVar, (osg) osfVarA) - 1;
        }
        return -1;
    }

    private int a(osg osgVar, osg osgVar2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", osgVar.getHuid());
        if (!e(contentValues, osgVar, osgVar2)) {
            LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "update status error");
            return -1;
        }
        String[] strArr = {ote.e(osgVar.h()), ote.e(osgVar.getHuid())};
        LogUtil.d("PLGACHIEVE_KakaTaskRecordDBMgr", "update selection=", "taskId=? and huid=?");
        int iUpdateStorageData = otd.c(this.e).updateStorageData("kaka_task_record", 1, contentValues, "taskId=? and huid=?", strArr);
        int iAc = osgVar.ac();
        LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "KakaTaskInfo update result=", Integer.valueOf(iUpdateStorageData), " sc ", Integer.valueOf(iAc), " name ", osgVar.i(), " status ", osgVar.t(), " modifyTime ", Long.valueOf(osgVar.a()));
        return iUpdateStorageData;
    }

    private osg c(Cursor cursor, osg osgVar) {
        osgVar.setHuid(cursor.getString(cursor.getColumnIndex("huid")));
        osgVar.h(otd.c(cursor, "taskStatus"));
        osgVar.j(otd.c(cursor, ParsedFieldTag.TASK_NAME));
        osgVar.d(otd.c(cursor, "taskDes"));
        osgVar.g(otd.c(cursor, "taskSpecification"));
        osgVar.c(otd.c(cursor, "taskDetailUrl"));
        osgVar.b(otd.d(cursor, "taskFrequency"));
        osgVar.d(otd.d(cursor, "taskRewardKaKa"));
        osgVar.a(otd.d(cursor, "taskRewardExperience"));
        osgVar.f(otd.d(cursor, "taskTypes"));
        osgVar.a(otd.c(cursor, "taskConditions"));
        osgVar.a(otd.b(cursor, "eventTimeStamp"));
        osgVar.d(otd.b(cursor, "taskSyncTimeStamp"));
        osgVar.c(otd.b(cursor, "lastTimeStamp"));
        osgVar.e(otd.b(cursor, "taskStartTime"));
        osgVar.b(otd.b(cursor, "taskEndTime"));
        osgVar.c(otd.d(cursor, "taskPriority"));
        osgVar.e(otd.c(cursor, ParsedFieldTag.TASK_ICON));
        osgVar.i(otd.d(cursor, "taskSyncStatus"));
        osgVar.e(otd.d(cursor, "taskIsShow"));
        osgVar.o(otd.c(cursor, "preButton"));
        osgVar.n(otd.c(cursor, "postButton"));
        osgVar.g(otd.d(cursor, "category"));
        osgVar.r(otd.d(cursor, ParsedFieldTag.KAKA_TASK_RULE));
        osgVar.k(otd.d(cursor, "level"));
        osgVar.h(otd.d(cursor, ParsedFieldTag.KAKA_TASK_BONUS_TYPE));
        osgVar.i(otd.b(cursor, "updateTime"));
        osgVar.g(otd.b(cursor, "timeZoneOffset"));
        osgVar.n(otd.d(cursor, ParsedFieldTag.KAKA_TASK_SCENARIO));
        osgVar.p(otd.d(cursor, ParsedFieldTag.KAKA_TASK_VIP_MATCH));
        osgVar.f(otd.c(cursor, "pictureUrl"));
        osgVar.i(otd.c(cursor, ParsedFieldTag.KAKA_TASK_BTN_COLOR));
        osgVar.o(otd.d(cursor, ParsedFieldTag.KAKA_TASK_LABLE_MATCH));
        return osgVar;
    }

    private boolean c(ContentValues contentValues, osg osgVar) {
        if (osgVar == null || TextUtils.isEmpty(osgVar.h())) {
            return false;
        }
        contentValues.put("taskId", osgVar.h());
        contentValues.put(ParsedFieldTag.TASK_NAME, osgVar.i());
        contentValues.put("taskStatus", osgVar.t());
        contentValues.put("taskDes", osgVar.e());
        contentValues.put("taskSpecification", osgVar.o());
        contentValues.put("taskDetailUrl", osgVar.c());
        contentValues.put("taskStartTime", Long.valueOf(osgVar.k()));
        contentValues.put("taskEndTime", Long.valueOf(osgVar.b()));
        contentValues.put("lastTimeStamp", Long.valueOf(osgVar.a()));
        contentValues.put("taskConditions", osgVar.d());
        contentValues.put("taskFrequency", Integer.valueOf(osgVar.g()));
        contentValues.put("taskRewardKaKa", Integer.valueOf(osgVar.m()));
        contentValues.put("taskRewardExperience", Integer.valueOf(osgVar.n()));
        contentValues.put("taskTypes", Integer.valueOf(osgVar.s()));
        contentValues.put("eventTimeStamp", Long.valueOf(osgVar.b()));
        contentValues.put("taskSyncTimeStamp", Long.valueOf(osgVar.q()));
        contentValues.put("taskPriority", Integer.valueOf(osgVar.l()));
        contentValues.put(ParsedFieldTag.TASK_ICON, osgVar.j());
        contentValues.put("taskSyncStatus", Integer.valueOf(osgVar.p()));
        contentValues.put("taskIsShow", Integer.valueOf(osgVar.f()));
        contentValues.put("preButton", osgVar.aa());
        contentValues.put("postButton", osgVar.ab());
        contentValues.put("category", Integer.valueOf(osgVar.v()));
        contentValues.put(ParsedFieldTag.KAKA_TASK_RULE, Integer.valueOf(osgVar.ai()));
        contentValues.put("level", Integer.valueOf(osgVar.ad()));
        contentValues.put(ParsedFieldTag.KAKA_TASK_BONUS_TYPE, Integer.valueOf(osgVar.x()));
        contentValues.put("updateTime", Long.valueOf(osgVar.ag()));
        contentValues.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getRawOffset()));
        contentValues.put(ParsedFieldTag.KAKA_TASK_SCENARIO, Integer.valueOf(osgVar.ac()));
        contentValues.put(ParsedFieldTag.KAKA_TASK_VIP_MATCH, Integer.valueOf(osgVar.ah()));
        contentValues.put("pictureUrl", osgVar.z());
        contentValues.put(ParsedFieldTag.KAKA_TASK_BTN_COLOR, osgVar.y());
        contentValues.put(ParsedFieldTag.KAKA_TASK_LABLE_MATCH, Integer.valueOf(osgVar.u()));
        return true;
    }

    private boolean e(ContentValues contentValues, osg osgVar, osg osgVar2) {
        if (osgVar2.b() >= osgVar.b()) {
            osgVar.a(osgVar2.b());
        }
        if (osgVar.r() == 1) {
            if (osgVar.ai() == 30008 && osgVar.g() > 0) {
                c(contentValues, osgVar);
                return true;
            }
            if (osgVar.t().compareTo(osgVar2.t()) < 0 && TimeZone.getDefault().getRawOffset() == osgVar2.ae() && c(osgVar)) {
                LogUtil.a("PLGACHIEVE_KakaTaskRecordDBMgr", "The cloud state is smaller than app, modifyTime ", Long.valueOf(osgVar.a()));
                osgVar.h(osgVar2.t());
            }
        }
        c(contentValues, osgVar);
        return true;
    }

    private boolean c(osg osgVar) {
        return (pap.e(osgVar.a(), System.currentTimeMillis()) && pap.e(osgVar.b(), System.currentTimeMillis())) ? false : true;
    }
}
