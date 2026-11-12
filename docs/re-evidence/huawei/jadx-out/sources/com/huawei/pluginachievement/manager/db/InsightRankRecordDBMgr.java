package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.InsightRankRecord;
import defpackage.osf;
import defpackage.otd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public class InsightRankRecordDBMgr implements IAchieveDBMgr {
    private Context d;

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        return 0;
    }

    public InsightRankRecordDBMgr(Context context) {
        this.d = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        String str = map.get("ageSegment");
        String str2 = map.get(CommonConstant.KEY_GENDER);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PLGACHIEVE_InsightRankRecordDBMgr", "params is null");
            return Collections.EMPTY_LIST;
        }
        String str3 = "select *  from " + otd.c(this.d).getTableFullName("insight_rank") + " where ageSegment =? and gender =? ";
        LogUtil.d("PLGACHIEVE_InsightRankRecordDBMgr", "query selection=", str3);
        String[] strArr = {str, str2};
        ArrayList arrayList = new ArrayList(8);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.d).rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        InsightRankRecord insightRankRecord = new InsightRankRecord();
                        insightRankRecord.setRankType(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("rankType")));
                        insightRankRecord.setRankVersion(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("rankVersion")));
                        insightRankRecord.setAgeSegment(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("ageSegment")));
                        insightRankRecord.setGender(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(CommonConstant.KEY_GENDER)));
                        insightRankRecord.setInsightRankItemJsonArray(c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("insightRankItemList"))));
                        arrayList.add(insightRankRecord);
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
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_InsightRankRecordDBMgr", e.getMessage());
        }
        LogUtil.a("PLGACHIEVE_InsightRankRecordDBMgr", "query insightRankList =", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        String str = map.get("ageSegment");
        String str2 = map.get(CommonConstant.KEY_GENDER);
        String str3 = map.get("rankType");
        InsightRankRecord insightRankRecord = null;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PLGACHIEVE_InsightRankRecordDBMgr", "params is null");
            return null;
        }
        LogUtil.a("PLGACHIEVE_InsightRankRecordDBMgr", "query inSightRankRecord =", str3);
        String str4 = "select *  from " + otd.c(this.d).getTableFullName("insight_rank") + " where rankType =? and ageSegment =? and gender =? ";
        LogUtil.d("PLGACHIEVE_InsightRankRecordDBMgr", "query selection=", str4);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.d).rawQueryStorageData(1, str4, new String[]{str3, str, str2});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (insightRankRecord == null) {
                            insightRankRecord = new InsightRankRecord();
                        }
                        insightRankRecord.setRankType(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("rankType")));
                        insightRankRecord.setRankVersion(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("rankVersion")));
                        insightRankRecord.setAgeSegment(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("ageSegment")));
                        insightRankRecord.setGender(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(CommonConstant.KEY_GENDER)));
                        insightRankRecord.setInsightRankItemJsonArray(c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("insightRankItemList"))));
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
            return insightRankRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_InsightRankRecordDBMgr", e.getMessage());
            return insightRankRecord;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        InsightRankRecord insightRankRecord = osfVar instanceof InsightRankRecord ? (InsightRankRecord) osfVar : null;
        if (insightRankRecord == null) {
            return -1L;
        }
        HashMap map = new HashMap(10);
        map.put("rankType", insightRankRecord.getRankType());
        map.put("ageSegment", insightRankRecord.getAgeSegment());
        map.put(CommonConstant.KEY_GENDER, insightRankRecord.getGender());
        if (query(map) != null) {
            return update(insightRankRecord);
        }
        return otd.c(this.d).insertStorageData("insight_rank", 1, c(insightRankRecord));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        InsightRankRecord insightRankRecord = osfVar instanceof InsightRankRecord ? (InsightRankRecord) osfVar : null;
        if (insightRankRecord == null) {
            return -1;
        }
        StringBuffer stringBuffer = new StringBuffer(10);
        stringBuffer.append("rankType =? and ageSegment =? and gender =? ");
        int iUpdateStorageData = otd.c(this.d).updateStorageData("insight_rank", 1, c(insightRankRecord), stringBuffer.toString(), new String[]{insightRankRecord.getRankType(), insightRankRecord.getAgeSegment(), insightRankRecord.getGender()});
        LogUtil.d("PLGACHIEVE_InsightRankRecordDBMgr", "update result = ", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private ContentValues c(InsightRankRecord insightRankRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("rankType", insightRankRecord.getRankType());
        contentValues.put("rankVersion", Long.valueOf(insightRankRecord.getRankVersion()));
        contentValues.put("ageSegment", insightRankRecord.getAgeSegment());
        contentValues.put(CommonConstant.KEY_GENDER, insightRankRecord.getGender());
        contentValues.put("insightRankItemList", insightRankRecord.getInsightRankItemJsonArray().toString());
        return contentValues;
    }

    private static JSONArray c(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONArray(str);
            }
        } catch (JSONException e) {
            LogUtil.e("PLGACHIEVE_InsightRankRecordDBMgr", e.getMessage());
        }
        return jSONArray;
    }
}
