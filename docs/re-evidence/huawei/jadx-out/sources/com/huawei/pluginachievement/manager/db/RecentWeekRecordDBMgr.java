package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.RecentWeekRecord;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class RecentWeekRecordDBMgr implements IAchieveDBMgr {
    private Context e;

    public RecentWeekRecordDBMgr(Context context) {
        this.e = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return e(map.get("huid"), map.get("reportNo"));
    }

    private osf e(String str, String str2) {
        RecentWeekRecord recentWeekRecord = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "RecentWeekRecordDBMgr, query ,id is null!return null.");
            return null;
        }
        String tableFullName = otd.c(this.e).getTableFullName("recent");
        String str3 = "select *  from " + tableFullName + " where huid = ? and recentType = 1 and reportNo = ? ";
        String[] strArr = {ote.e(str), ote.e(str2)};
        if ("0".equals(str2) || TextUtils.isEmpty(str2)) {
            strArr = new String[]{ote.e(str)};
            str3 = "select *  from " + tableFullName + " where huid = ? and recentType = 1 and reportNo = (select reportNo from " + tableFullName + " where recentType = 1 order by  reportNo desc limit 1)";
        }
        LogUtil.d("PLGACHIEVE_RecentWeekRecordDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.e).rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (recentWeekRecord == null) {
                            recentWeekRecord = new RecentWeekRecord();
                        }
                        recentWeekRecord.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_DATE));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("endDate"));
                        recentWeekRecord.saveFirstDate(ote.a(string));
                        recentWeekRecord.saveEndDate(ote.a(string2));
                        c(cursorRawQueryStorageData, recentWeekRecord, cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("dataType")), ote.d(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"))));
                        String string3 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("stepsRanking"));
                        String string4 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("distanceRanking"));
                        recentWeekRecord.setStepsRanking(ote.d(string3));
                        recentWeekRecord.setDistanceRanking(ote.d(string4));
                        recentWeekRecord.setMinReportNo(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MIN_REPORT_NO)));
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
            return recentWeekRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_RecentWeekRecordDBMgr", e.getMessage());
            return recentWeekRecord;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    private void c(Cursor cursor, RecentWeekRecord recentWeekRecord, int i, double d) {
        if (i == 1) {
            recentWeekRecord.setSteps(d);
        } else if (i == 2) {
            recentWeekRecord.setDistance(d);
        } else {
            LogUtil.j("PLGACHIEVE_RecentWeekRecordDBMgr", "setWeekRecord type error:", Integer.valueOf(i));
        }
        recentWeekRecord.setReportNo(cursor.getInt(cursor.getColumnIndex("reportNo")));
        recentWeekRecord.setKakaNum(cursor.getInt(cursor.getColumnIndex("kakaNum")));
        recentWeekRecord.setPrice(cursor.getInt(cursor.getColumnIndex(ParsedFieldTag.PRICE)));
        recentWeekRecord.setUserMedals(cursor.getString(cursor.getColumnIndex("medal_id")));
        recentWeekRecord.setComments1(cursor.getString(cursor.getColumnIndex("comments1_id")));
        recentWeekRecord.setComments2(cursor.getString(cursor.getColumnIndex("commentS2_id")));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar != null) {
            RecentWeekRecord recentWeekRecord = osfVar instanceof RecentWeekRecord ? (RecentWeekRecord) osfVar : null;
            if (recentWeekRecord != null) {
                if (e(recentWeekRecord.getHuid(), String.valueOf(recentWeekRecord.acquireReportNo())) != null) {
                    return update(osfVar);
                }
                if (c(recentWeekRecord) == -1) {
                    LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "insert Column check not pass");
                    return -1L;
                }
                return (e(recentWeekRecord, 1, recentWeekRecord.acquireSteps()) - 1) + e(recentWeekRecord, 2, recentWeekRecord.acquireDistance());
            }
        }
        return -1L;
    }

    private long e(RecentWeekRecord recentWeekRecord, int i, double d) {
        ContentValues contentValues = new ContentValues();
        c(contentValues, recentWeekRecord);
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("dataType", Integer.valueOf(i));
        long jInsertStorageData = otd.c(this.e).insertStorageData("recent", 1, contentValues);
        LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "insert insertWeekResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        RecentWeekRecord recentWeekRecord = osfVar instanceof RecentWeekRecord ? (RecentWeekRecord) osfVar : null;
        if (recentWeekRecord == null) {
            return -1;
        }
        String[] strArr = {ote.e(recentWeekRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_RecentWeekRecordDBMgr", "delete selection=", "huid=? and recentType='1'");
        int iDeleteStorageData = otd.c(this.e).deleteStorageData("recent", 1, "huid=? and recentType='1'", strArr);
        LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "delete deleteWeekResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar != null) {
            RecentWeekRecord recentWeekRecord = osfVar instanceof RecentWeekRecord ? (RecentWeekRecord) osfVar : null;
            if (recentWeekRecord != null) {
                if (c(recentWeekRecord) == -1) {
                    LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "update Column check not pass");
                    return -1;
                }
                return (c(recentWeekRecord, 1, recentWeekRecord.acquireSteps()) - 1) + c(recentWeekRecord, 2, recentWeekRecord.acquireDistance());
            }
        }
        return -1;
    }

    private int c(RecentWeekRecord recentWeekRecord, int i, double d) {
        ContentValues contentValues = new ContentValues();
        c(contentValues, recentWeekRecord);
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("dataType", Integer.valueOf(i));
        String[] strArr = {ote.e(recentWeekRecord.getHuid()), ote.e(Integer.valueOf(i)), ote.e(Double.valueOf(d))};
        LogUtil.d("PLGACHIEVE_RecentWeekRecordDBMgr", "update selection=", "huid=? and recentType='1' and dataType=? and reportNo=?");
        int iUpdateStorageData = otd.c(this.e).updateStorageData("recent", 1, contentValues, "huid=? and recentType='1' and dataType=? and reportNo=?", strArr);
        LogUtil.a("PLGACHIEVE_RecentWeekRecordDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private int c(RecentWeekRecord recentWeekRecord) {
        return (TextUtils.isEmpty(recentWeekRecord.getHuid()) || recentWeekRecord.acquireDataType() == -1 || recentWeekRecord.acquireSteps() == -1.0d || recentWeekRecord.acquireDistance() == -1.0d || recentWeekRecord.acquireReportNo() == -1 || recentWeekRecord.acquireKakaNum() == -1 || recentWeekRecord.acquirePrice() == -1 || recentWeekRecord.acquireFirstDate() == -1 || recentWeekRecord.acquireEndDate() == -1) ? -1 : 0;
    }

    private void c(ContentValues contentValues, RecentWeekRecord recentWeekRecord) {
        if (recentWeekRecord == null) {
            return;
        }
        contentValues.put("huid", recentWeekRecord.getHuid());
        contentValues.put("recentType", (Integer) 1);
        contentValues.put(ParsedFieldTag.FIRST_DATE, Long.valueOf(recentWeekRecord.acquireFirstDate()));
        contentValues.put("endDate", Long.valueOf(recentWeekRecord.acquireEndDate()));
        contentValues.put("reportNo", Integer.valueOf(recentWeekRecord.acquireReportNo()));
        contentValues.put("kakaNum", Integer.valueOf(recentWeekRecord.acquireKakaNum()));
        contentValues.put(ParsedFieldTag.PRICE, Integer.valueOf(recentWeekRecord.acquirePrice()));
        contentValues.put("medal_id", recentWeekRecord.acquireUserMedals());
        contentValues.put("comments1_id", recentWeekRecord.acquireComments1());
        contentValues.put("commentS2_id", recentWeekRecord.getComments2());
        contentValues.put("stepsRanking", Double.valueOf(recentWeekRecord.acquireStepsRanking()));
        contentValues.put("distanceRanking", Double.valueOf(recentWeekRecord.acquireDistanceRanking()));
        contentValues.put(ParsedFieldTag.MIN_REPORT_NO, Integer.valueOf(recentWeekRecord.acquireMinReportNo()));
    }
}
