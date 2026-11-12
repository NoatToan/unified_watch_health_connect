package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.RecentMonthRecord;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class RecentMonthRecordDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22015b;

    public RecentMonthRecordDBMgr(Context context) {
        this.f22015b = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return a(map.get("huid"), map.get("reportNo"));
    }

    private osf a(String str, String str2) {
        RecentMonthRecord recentMonthRecord = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "RecentMonthRecordDBMgr, query ,id is null!return null.");
            return null;
        }
        String tableFullName = otd.c(this.f22015b).getTableFullName("recent");
        String str3 = "select *  from " + tableFullName + " where huid = ? and recentType = 2 and reportNo = ? ";
        String[] strArr = {ote.e(str), ote.e(str2)};
        if ("0".equals(str2) || TextUtils.isEmpty(str2)) {
            strArr = new String[]{ote.e(str)};
            str3 = "select *  from " + tableFullName + " where huid = ? and recentType = 2 and reportNo = (select reportNo from " + tableFullName + " where recentType = 2 order by  reportNo desc limit 1)";
        }
        LogUtil.d("PLGACHIEVE_RecentMonthRecordDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22015b).rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (recentMonthRecord == null) {
                            recentMonthRecord = new RecentMonthRecord();
                        }
                        recentMonthRecord.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_DATE));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("endDate"));
                        recentMonthRecord.saveFirstDate(ote.a(string));
                        recentMonthRecord.saveEndDate(ote.a(string2));
                        d(cursorRawQueryStorageData, recentMonthRecord, cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("dataType")), ote.d(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"))));
                        String string3 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("stepsRanking"));
                        String string4 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("distanceRanking"));
                        recentMonthRecord.setStepsRanking(ote.d(string3));
                        recentMonthRecord.setDistanceRanking(ote.d(string4));
                        recentMonthRecord.setMinReportNo(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MIN_REPORT_NO)));
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
            return recentMonthRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_RecentMonthRecordDBMgr", e.getMessage());
            return recentMonthRecord;
        }
    }

    private void d(Cursor cursor, RecentMonthRecord recentMonthRecord, int i, double d) {
        if (i == 1) {
            recentMonthRecord.setSteps(d);
        } else if (i == 2) {
            recentMonthRecord.setDistance(d);
        } else {
            LogUtil.j("PLGACHIEVE_RecentMonthRecordDBMgr", "setMonthRecord type error:", Integer.valueOf(i));
        }
        recentMonthRecord.setReportNo(cursor.getInt(cursor.getColumnIndex("reportNo")));
        recentMonthRecord.setKakaNum(cursor.getInt(cursor.getColumnIndex("kakaNum")));
        recentMonthRecord.setPrice(cursor.getInt(cursor.getColumnIndex(ParsedFieldTag.PRICE)));
        recentMonthRecord.setMedals(cursor.getString(cursor.getColumnIndex("medal_id")));
        recentMonthRecord.setComments1(cursor.getString(cursor.getColumnIndex("comments1_id")));
        recentMonthRecord.setComments2(cursor.getString(cursor.getColumnIndex("commentS2_id")));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar != null) {
            RecentMonthRecord recentMonthRecord = osfVar instanceof RecentMonthRecord ? (RecentMonthRecord) osfVar : null;
            if (recentMonthRecord != null) {
                if (a(recentMonthRecord.getHuid(), String.valueOf(recentMonthRecord.acquireReportNo())) != null) {
                    return update(osfVar);
                }
                if (c(recentMonthRecord) == -1) {
                    LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "insert Column check not pass");
                    return -1L;
                }
                return (b(recentMonthRecord, 1, recentMonthRecord.acquireSteps()) - 1) + b(recentMonthRecord, 2, recentMonthRecord.acquireDistance());
            }
        }
        return -1L;
    }

    private long b(RecentMonthRecord recentMonthRecord, int i, double d) {
        ContentValues contentValues = new ContentValues();
        a(contentValues, recentMonthRecord);
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        long jInsertStorageData = otd.c(this.f22015b).insertStorageData("recent", 1, contentValues);
        LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "insert insertMonthRecordResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        RecentMonthRecord recentMonthRecord = osfVar instanceof RecentMonthRecord ? (RecentMonthRecord) osfVar : null;
        if (recentMonthRecord == null) {
            return -1;
        }
        String[] strArr = {ote.e(recentMonthRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_RecentMonthRecordDBMgr", "delete selection=", "huid=? and recentType='2'");
        int iDeleteStorageData = otd.c(this.f22015b).deleteStorageData("recent", 1, "huid=? and recentType='2'", strArr);
        LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "delete deleteMonthRecordResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar != null) {
            RecentMonthRecord recentMonthRecord = osfVar instanceof RecentMonthRecord ? (RecentMonthRecord) osfVar : null;
            if (recentMonthRecord != null) {
                if (c(recentMonthRecord) == -1) {
                    LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "update Column check not pass");
                    return -1;
                }
                return (c(recentMonthRecord, 1, recentMonthRecord.acquireSteps()) - 1) + c(recentMonthRecord, 2, recentMonthRecord.acquireDistance());
            }
        }
        return -1;
    }

    private int c(RecentMonthRecord recentMonthRecord, int i, double d) {
        ContentValues contentValues = new ContentValues();
        a(contentValues, recentMonthRecord);
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        String[] strArr = {ote.e(recentMonthRecord.getHuid()), ote.e(Integer.valueOf(i)), ote.e(Double.valueOf(d))};
        LogUtil.d("PLGACHIEVE_RecentMonthRecordDBMgr", "update selection=", "huid=? and recentType='2' and dataType=? and reportNo=?");
        int iUpdateStorageData = otd.c(this.f22015b).updateStorageData("recent", 1, contentValues, "huid=? and recentType='2' and dataType=? and reportNo=?", strArr);
        LogUtil.a("PLGACHIEVE_RecentMonthRecordDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private int c(RecentMonthRecord recentMonthRecord) {
        return (TextUtils.isEmpty(recentMonthRecord.getHuid()) || recentMonthRecord.acquireDataType() == -1 || recentMonthRecord.acquireSteps() == -1.0d || recentMonthRecord.acquireDistance() == -1.0d || recentMonthRecord.acquireReportNo() == -1 || recentMonthRecord.getKakaNum() == -1 || recentMonthRecord.acquirePrice() == -1 || recentMonthRecord.acquireFirstDate() == -1 || recentMonthRecord.acquireEndDate() == -1) ? -1 : 0;
    }

    private void a(ContentValues contentValues, RecentMonthRecord recentMonthRecord) {
        if (recentMonthRecord == null) {
            return;
        }
        contentValues.put("huid", recentMonthRecord.getHuid());
        contentValues.put("recentType", (Integer) 2);
        contentValues.put(ParsedFieldTag.FIRST_DATE, Long.valueOf(recentMonthRecord.acquireFirstDate()));
        contentValues.put("endDate", Long.valueOf(recentMonthRecord.acquireEndDate()));
        contentValues.put("reportNo", Integer.valueOf(recentMonthRecord.acquireReportNo()));
        contentValues.put("kakaNum", Integer.valueOf(recentMonthRecord.getKakaNum()));
        contentValues.put(ParsedFieldTag.PRICE, Integer.valueOf(recentMonthRecord.acquirePrice()));
        contentValues.put("medal_id", recentMonthRecord.acquireMedals());
        contentValues.put("comments1_id", recentMonthRecord.getComments1());
        contentValues.put("commentS2_id", recentMonthRecord.getComments2());
        contentValues.put("stepsRanking", Double.valueOf(recentMonthRecord.acquireStepsRanking()));
        contentValues.put("distanceRanking", Double.valueOf(recentMonthRecord.acquireDistanceRanking()));
        contentValues.put(ParsedFieldTag.MIN_REPORT_NO, Integer.valueOf(recentMonthRecord.acquireMinReportNo()));
    }
}
