package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class WeekOrMonthRecordDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22021b;

    public WeekOrMonthRecordDBMgr(Context context) {
        this.f22021b = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        return e(map.get("startTimestamp"), map.get("huid"), map.get("recentType"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        return c(map.get("startTimestamp"), map.get("endTimeStamp"), map.get("huid"), map.get("recentType"), map.get("dataSource"));
    }

    private osf e(String str, String str2, String str3) {
        WeekAndMonthRecord weekAndMonthRecordA;
        WeekAndMonthRecord weekAndMonthRecord = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "WeekOrMonthRecordDBMgr, query ,id is null!return");
            return null;
        }
        String str4 = "select *  from " + otd.c(this.f22021b).getTableFullName("week_and_month_record") + " where startTimestamp =? and huid =? and recentType=?";
        LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", "query selection=", str4);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22021b).rawQueryStorageData(1, str4, new String[]{ote.e(str), ote.e(str2), ote.e(str3)});
            if (cursorRawQueryStorageData != null) {
                weekAndMonthRecordA = null;
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        weekAndMonthRecordA = a(null, cursorRawQueryStorageData);
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                try {
                                    cursorRawQueryStorageData.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            } catch (SQLException e) {
                                e = e;
                                com.huawei.hwlogsmodel.LogUtil.j("PLGACHIEVE_WeekOrMonthRecordDBMgr", e.getMessage());
                                return weekAndMonthRecordA;
                            }
                        }
                        throw th;
                    }
                }
                weekAndMonthRecord = weekAndMonthRecordA;
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return weekAndMonthRecord;
        } catch (SQLException e2) {
            e = e2;
            weekAndMonthRecordA = weekAndMonthRecord;
        }
    }

    private WeekAndMonthRecord a(String str, Cursor cursor) {
        WeekAndMonthRecord weekAndMonthRecord = new WeekAndMonthRecord();
        weekAndMonthRecord.setHuid(cursor.getString(cursor.getColumnIndex("huid")));
        long j = cursor.getLong(cursor.getColumnIndex("startTimestamp"));
        long j2 = cursor.getLong(cursor.getColumnIndex("endTimeStamp"));
        String string = cursor.getString(cursor.getColumnIndex("britishValue"));
        int i = cursor.getInt(cursor.getColumnIndex("recentType"));
        int i2 = cursor.getInt(cursor.getColumnIndex("dataSource"));
        int i3 = cursor.getInt(cursor.getColumnIndex("maxReportNo"));
        int i4 = cursor.getInt(cursor.getColumnIndex(ParsedFieldTag.MIN_REPORT_NO));
        weekAndMonthRecord.setReportNo(cursor.getInt(cursor.getColumnIndex("reportNo")));
        weekAndMonthRecord.setBritishValue(string);
        weekAndMonthRecord.setDataSource(i2);
        weekAndMonthRecord.setMaxReportNo(i3);
        weekAndMonthRecord.setMinReportNo(i4);
        weekAndMonthRecord.setRecentType(i);
        weekAndMonthRecord.setStartTimestamp(Long.valueOf(j));
        weekAndMonthRecord.setEndTimestamp(Long.valueOf(j2));
        String string2 = cursor.getString(cursor.getColumnIndex("value"));
        if (str != null) {
            if (String.valueOf(2).equals(str)) {
                weekAndMonthRecord.setValue(string2);
                return weekAndMonthRecord;
            }
            if (!String.valueOf(1).equals(str)) {
                LogUtil.c("PLGACHIEVE_WeekOrMonthRecordDBMgr", "getWeekAndMonthRecord = null");
                return weekAndMonthRecord;
            }
            weekAndMonthRecord.setValueFromCloud(string2);
            return weekAndMonthRecord;
        }
        if (i2 == 2) {
            weekAndMonthRecord.setValue(string2);
            return weekAndMonthRecord;
        }
        if (i2 != 1) {
            LogUtil.c("PLGACHIEVE_WeekOrMonthRecordDBMgr", "getWeekAndMonthRecord = null");
            return weekAndMonthRecord;
        }
        weekAndMonthRecord.setValueFromCloud(string2);
        return weekAndMonthRecord;
    }

    private List<osf> c(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
            LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "WeekOrMonthRecordDBMgr, queryList ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str6 = "select *  from " + otd.c(this.f22021b).getTableFullName("week_and_month_record") + " where startTimestamp >=? and endTimeStamp <=? and huid =? and recentType=? and dataSource=? order by startTimestamp ASC";
        LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", "query selection=", str6);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22021b).rawQueryStorageData(1, str6, new String[]{ote.e(str), ote.e(str2), ote.e(str3), ote.e(str4), ote.e(str5)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        arrayList.add(a(null, cursorRawQueryStorageData));
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
                return arrayList;
            }
        } catch (SQLException e) {
            com.huawei.hwlogsmodel.LogUtil.j("PLGACHIEVE_WeekOrMonthRecordDBMgr", e.getMessage());
        }
        return arrayList;
    }

    private osf b(String str, String str2, String str3, String str4) {
        WeekAndMonthRecord weekAndMonthRecordA = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "WeekOrMonthRecordDBMgr, query ,id is null!return");
            return null;
        }
        String str5 = "select *  from " + otd.c(this.f22021b).getTableFullName("week_and_month_record") + " where startTimestamp =? and huid =? and recentType =? and dataSource=?";
        LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", "query selection=", str5);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22021b).rawQueryStorageData(1, str5, new String[]{ote.e(str), ote.e(str2), ote.e(str3), ote.e(str4)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        weekAndMonthRecordA = a(str4, cursorRawQueryStorageData);
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
            return weekAndMonthRecordA;
        } catch (SQLException e) {
            com.huawei.hwlogsmodel.LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", e.getMessage());
            return weekAndMonthRecordA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        int iD;
        long jB = -1;
        if (osfVar == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "insert achieveData is null");
            return -1L;
        }
        WeekAndMonthRecord weekAndMonthRecord = osfVar instanceof WeekAndMonthRecord ? (WeekAndMonthRecord) osfVar : null;
        if (weekAndMonthRecord == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "insert weekAndMonthRecord is null");
            return -1L;
        }
        if (!TextUtils.isEmpty(weekAndMonthRecord.getValueFromCloud())) {
            if (b(String.valueOf(weekAndMonthRecord.getStartTimestamp()), weekAndMonthRecord.getHuid(), String.valueOf(weekAndMonthRecord.getRecentType()), String.valueOf(1)) != null) {
                iD = d(weekAndMonthRecord);
            } else {
                jB = (-1) + b(weekAndMonthRecord);
                if (!TextUtils.isEmpty(weekAndMonthRecord.getValue())) {
                    return jB;
                }
                if (b(String.valueOf(weekAndMonthRecord.getStartTimestamp()), weekAndMonthRecord.getHuid(), String.valueOf(weekAndMonthRecord.getRecentType()), String.valueOf(2)) != null) {
                    iD = d(weekAndMonthRecord);
                } else {
                    return jB + b(weekAndMonthRecord);
                }
            }
        } else {
            if (!TextUtils.isEmpty(weekAndMonthRecord.getValue())) {
                return jB;
            }
            if (b(String.valueOf(weekAndMonthRecord.getStartTimestamp()), weekAndMonthRecord.getHuid(), String.valueOf(weekAndMonthRecord.getRecentType()), String.valueOf(2)) != null) {
                iD = d(weekAndMonthRecord);
            } else {
                return jB + b(weekAndMonthRecord);
            }
        }
        return iD;
    }

    private long b(WeekAndMonthRecord weekAndMonthRecord) {
        ContentValues contentValues = new ContentValues();
        if (!c(contentValues, weekAndMonthRecord)) {
            return -1L;
        }
        long jInsertStorageData = otd.c(this.f22021b).insertStorageData("week_and_month_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "insert result=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "delete achieveData is null");
            return -1;
        }
        WeekAndMonthRecord weekAndMonthRecord = osfVar instanceof WeekAndMonthRecord ? (WeekAndMonthRecord) osfVar : null;
        if (weekAndMonthRecord == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "delete weekAndMonthRecord is null");
            return -1;
        }
        String[] strArr = {ote.e(weekAndMonthRecord.getHuid())};
        LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", "delete selection=", "huid=?");
        int iDeleteStorageData = otd.c(this.f22021b).deleteStorageData("week_and_month_record", 1, "huid=?", strArr);
        LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "delete result=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "update achieveData is null");
            return -1;
        }
        WeekAndMonthRecord weekAndMonthRecord = osfVar instanceof WeekAndMonthRecord ? (WeekAndMonthRecord) osfVar : null;
        if (weekAndMonthRecord == null) {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "update weekAndMonthRecord is null");
            return -1;
        }
        if (b(String.valueOf(weekAndMonthRecord.getStartTimestamp()), weekAndMonthRecord.getHuid(), String.valueOf(weekAndMonthRecord.getRecentType()), String.valueOf(weekAndMonthRecord.getDataSource())) != null) {
            return d(weekAndMonthRecord);
        }
        return -1;
    }

    private int d(WeekAndMonthRecord weekAndMonthRecord) {
        ContentValues contentValues = new ContentValues();
        if (!c(contentValues, weekAndMonthRecord)) {
            return -1;
        }
        String[] strArr = {ote.e(Long.valueOf(weekAndMonthRecord.getStartTimestamp())), ote.e(weekAndMonthRecord.getHuid()), ote.e(Integer.valueOf(weekAndMonthRecord.getRecentType())), ote.e(Integer.valueOf(weekAndMonthRecord.getDataSource()))};
        LogUtil.e("PLGACHIEVE_WeekOrMonthRecordDBMgr", "update selection=", "startTimestamp=? and huid=? and recentType=? and dataSource=?");
        int iUpdateStorageData = otd.c(this.f22021b).updateStorageData("week_and_month_record", 1, contentValues, "startTimestamp=? and huid=? and recentType=? and dataSource=?", strArr);
        LogUtil.a("PLGACHIEVE_WeekOrMonthRecordDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private boolean c(ContentValues contentValues, WeekAndMonthRecord weekAndMonthRecord) {
        if (weekAndMonthRecord == null || weekAndMonthRecord.getStartTimestamp() == 0) {
            return false;
        }
        contentValues.put("huid", weekAndMonthRecord.getHuid());
        contentValues.put("startTimestamp", Long.valueOf(weekAndMonthRecord.getStartTimestamp()));
        contentValues.put("endTimeStamp", Long.valueOf(weekAndMonthRecord.getEndTimestamp()));
        if (!TextUtils.isEmpty(weekAndMonthRecord.getValue())) {
            contentValues.put("value", weekAndMonthRecord.getValue());
        } else if (!TextUtils.isEmpty(weekAndMonthRecord.getValueFromCloud())) {
            contentValues.put("value", weekAndMonthRecord.getValueFromCloud());
        } else {
            LogUtil.d("PLGACHIEVE_WeekOrMonthRecordDBMgr", "structContentData weekAndMonthRecord getValue/getValueFromCloud is empty");
        }
        contentValues.put("britishValue", weekAndMonthRecord.getBritishValue());
        contentValues.put("recentType", Integer.valueOf(weekAndMonthRecord.getRecentType()));
        contentValues.put("dataSource", Integer.valueOf(weekAndMonthRecord.getDataSource()));
        contentValues.put("maxReportNo", Integer.valueOf(weekAndMonthRecord.getMinReportNo()));
        contentValues.put(ParsedFieldTag.MIN_REPORT_NO, Integer.valueOf(weekAndMonthRecord.getMinReportNo()));
        contentValues.put("reportNo", Integer.valueOf(weekAndMonthRecord.getReportNo()));
        return true;
    }
}
