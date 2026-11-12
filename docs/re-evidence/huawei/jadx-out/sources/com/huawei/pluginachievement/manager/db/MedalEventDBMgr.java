package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.EventRecord;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalEventDBMgr implements IAchieveDBMgr {
    private Context d;

    public MedalEventDBMgr(Context context) {
        this.d = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return a(map.get("huid"), map.get("eventStatus"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return e(map.get("medalID"), map.get("huid"));
    }

    private osf e(String str, String str2) {
        EventRecord eventRecord = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalEventDBMgr", "MedalEventDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.d).getTableFullName("medal_event_record") + " where medalID =? and huid=?";
        LogUtil.d("PLGACHIEVE_MedalEventDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.d).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (eventRecord == null) {
                            eventRecord = new EventRecord();
                        }
                        eventRecord.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        eventRecord.saveEventType(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("eventType")));
                        eventRecord.saveMedalID(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalID")));
                        eventRecord.saveTimestamp(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp")));
                        eventRecord.saveKey(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(MedalConstants.EVENT_KEY)));
                        eventRecord.saveKeyType(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(MedalConstants.EVENT_KEYTYPE)));
                        eventRecord.saveTimezone(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("timeZone")));
                        eventRecord.saveValue(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value")));
                        eventRecord.saveMedalName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName")));
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
            return eventRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_MedalEventDBMgr", e.getMessage());
            return eventRecord;
        }
    }

    private List<osf> a(String str, String str2) {
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalEventDBMgr", "MedalEventDBMgr, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str3 = "select *  from " + otd.c(this.d).getTableFullName("medal_event_record") + " where eventStatus =? and huid=?";
        LogUtil.d("PLGACHIEVE_MedalEventDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.d).rawQueryStorageData(1, str3, new String[]{ote.e(str2), ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        EventRecord eventRecord = new EventRecord();
                        eventRecord.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("eventType"));
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalID"));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName"));
                        String string3 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("timeZone"));
                        String string4 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(MedalConstants.EVENT_KEY));
                        String string5 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"));
                        String string6 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(MedalConstants.EVENT_KEYTYPE));
                        long j = cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp"));
                        eventRecord.saveEventType(i);
                        eventRecord.saveMedalID(string);
                        eventRecord.saveTimestamp(j);
                        eventRecord.saveKey(string4);
                        eventRecord.saveValue(string5);
                        eventRecord.saveKeyType(string6);
                        eventRecord.saveTimezone(string3);
                        eventRecord.saveTimestamp(j);
                        eventRecord.saveMedalName(string2);
                        eventRecord.saveStartTime(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("startTime")));
                        eventRecord.saveEndTime(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("endTime")));
                        eventRecord.saveEventStatus(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("eventStatus")));
                        arrayList.add(eventRecord);
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
            LogUtil.j("PLGACHIEVE_MedalEventDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_MedalEventDBMgr", "query MedalEventDBMgr list=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        EventRecord eventRecord = osfVar instanceof EventRecord ? (EventRecord) osfVar : null;
        if (eventRecord == null) {
            return -1L;
        }
        if (e(eventRecord.acquireMedalID(), eventRecord.getHuid()) != null) {
            return update(osfVar);
        }
        return e(eventRecord) - 1;
    }

    private long e(EventRecord eventRecord) {
        ContentValues contentValues = new ContentValues();
        e(contentValues, eventRecord);
        long jInsertStorageData = otd.c(this.d).insertStorageData("medal_event_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_MedalEventDBMgr", "insert insertRecordResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        EventRecord eventRecord = osfVar instanceof EventRecord ? (EventRecord) osfVar : null;
        if (eventRecord == null) {
            return -1;
        }
        String[] strArr = {ote.e(eventRecord.acquireMedalID()), ote.e(eventRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalEventDBMgr", "delete selection=", "medalID=? and huid=?");
        int iDeleteStorageData = otd.c(this.d).deleteStorageData("medal_event_record", 1, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalEventDBMgr", "delete deleteRecordResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        EventRecord eventRecord = osfVar instanceof EventRecord ? (EventRecord) osfVar : null;
        if (eventRecord == null) {
            return -1;
        }
        return b(eventRecord) - 1;
    }

    private int b(EventRecord eventRecord) {
        ContentValues contentValues = new ContentValues();
        e(contentValues, eventRecord);
        String[] strArr = {ote.e(eventRecord.acquireMedalID()), ote.e(eventRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalEventDBMgr", "update selection=", "medalID=? and huid=?");
        int iUpdateStorageData = otd.c(this.d).updateStorageData("medal_event_record", 1, contentValues, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalEventDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private void e(ContentValues contentValues, EventRecord eventRecord) {
        if (eventRecord == null) {
            return;
        }
        contentValues.put("huid", eventRecord.getHuid());
        contentValues.put("eventType", Integer.valueOf(eventRecord.acquireEventType()));
        contentValues.put("medalID", eventRecord.acquireMedalID());
        contentValues.put("medalName", eventRecord.acquireMedalName());
        contentValues.put("timeZone", eventRecord.acquireTimezone());
        contentValues.put(MedalConstants.EVENT_KEY, eventRecord.acquireKey());
        contentValues.put(MedalConstants.EVENT_KEYTYPE, eventRecord.acquireKeyType());
        contentValues.put("value", eventRecord.acquireValue());
        contentValues.put("startTime", eventRecord.acquireStartTime());
        contentValues.put("endTime", eventRecord.acquireEndTime());
        contentValues.put("eventStatus", eventRecord.acquireEventStatus());
        contentValues.put("timestamp", Long.valueOf(eventRecord.acquireTimestamp()));
    }
}
