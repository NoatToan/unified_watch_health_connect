package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.AchieveLevelEventInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveLevelEventDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22008c;

    public AchieveLevelEventDBMgr(Context context) {
        this.f22008c = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return a(map.get("huid"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return e(map.get("taskId"), map.get("huid"));
    }

    private osf e(String str, String str2) {
        AchieveLevelEventInfo achieveLevelEventInfo = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelEventDBMgr", "AchieveLevelEventDBMgr, query ,taskId is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.f22008c).getTableFullName("level_event_record") + " where taskId =? and huid=?";
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22008c).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (achieveLevelEventInfo == null) {
                            achieveLevelEventInfo = new AchieveLevelEventInfo();
                        }
                        achieveLevelEventInfo.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        achieveLevelEventInfo.saveTaskId(otd.c(cursorRawQueryStorageData, "taskId"));
                        achieveLevelEventInfo.saveRewardExperience(otd.d(cursorRawQueryStorageData, ParsedFieldTag.TASK_REWARD_EXPERIENCE));
                        achieveLevelEventInfo.saveTaskCount(otd.d(cursorRawQueryStorageData, "taskCount"));
                        achieveLevelEventInfo.saveLastModifyTime(otd.b(cursorRawQueryStorageData, "lastModifyTime"));
                        achieveLevelEventInfo.saveTaskSumCount(otd.d(cursorRawQueryStorageData, "taskSumCount"));
                        achieveLevelEventInfo.saveSyncTime(otd.b(cursorRawQueryStorageData, "SyncTime"));
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
            LogUtil.j("PLGACHIEVE_AchieveLevelEventDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "query achieveLevelEventInfo=", achieveLevelEventInfo == null ? Constants.NULL : achieveLevelEventInfo);
        return achieveLevelEventInfo;
    }

    private List<osf> a(String str) {
        if (str == null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelEventDBMgr", "achieveLevelEventInfo, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str2 = "select *  from " + otd.c(this.f22008c).getTableFullName("level_event_record") + " where huid=?";
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22008c).rawQueryStorageData(1, str2, new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        AchieveLevelEventInfo achieveLevelEventInfo = new AchieveLevelEventInfo();
                        achieveLevelEventInfo.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        achieveLevelEventInfo.saveTaskId(otd.c(cursorRawQueryStorageData, "taskId"));
                        achieveLevelEventInfo.saveRewardExperience(otd.d(cursorRawQueryStorageData, ParsedFieldTag.TASK_REWARD_EXPERIENCE));
                        achieveLevelEventInfo.saveTaskCount(otd.d(cursorRawQueryStorageData, "taskCount"));
                        achieveLevelEventInfo.saveLastModifyTime(otd.b(cursorRawQueryStorageData, "lastModifyTime"));
                        achieveLevelEventInfo.saveTaskSumCount(otd.d(cursorRawQueryStorageData, "taskSumCount"));
                        achieveLevelEventInfo.saveSyncTime(otd.b(cursorRawQueryStorageData, "SyncTime"));
                        arrayList.add(achieveLevelEventInfo);
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
            LogUtil.j("PLGACHIEVE_AchieveLevelEventDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "query achieveLevelEventInfo List=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        AchieveLevelEventInfo achieveLevelEventInfo = osfVar instanceof AchieveLevelEventInfo ? (AchieveLevelEventInfo) osfVar : null;
        if (achieveLevelEventInfo == null) {
            return -1L;
        }
        if (e(String.valueOf(achieveLevelEventInfo.acquireTaskId()), achieveLevelEventInfo.getHuid()) != null) {
            return update(osfVar);
        }
        return a(achieveLevelEventInfo) - 1;
    }

    private long a(AchieveLevelEventInfo achieveLevelEventInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveLevelEventInfo.getHuid());
        contentValues.put("taskId", String.valueOf(achieveLevelEventInfo.acquireTaskId()));
        contentValues.put(ParsedFieldTag.TASK_REWARD_EXPERIENCE, Integer.valueOf(achieveLevelEventInfo.acquireRewardExperience()));
        contentValues.put("taskSumCount", String.valueOf(achieveLevelEventInfo.acquireTaskSumCount()));
        contentValues.put("taskCount", Integer.valueOf(achieveLevelEventInfo.acquireTaskCount()));
        contentValues.put("SyncTime", Long.valueOf(achieveLevelEventInfo.acquireSyncTime()));
        contentValues.put("lastModifyTime", Long.valueOf(achieveLevelEventInfo.acquireLastModifyTime()));
        long jInsertStorageData = otd.c(this.f22008c).insertStorageData("level_event_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_AchieveLevelEventDBMgr", "insert insertLevelResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        AchieveLevelEventInfo achieveLevelEventInfo = osfVar instanceof AchieveLevelEventInfo ? (AchieveLevelEventInfo) osfVar : null;
        if (achieveLevelEventInfo == null) {
            return -1;
        }
        String[] strArr = {ote.e(achieveLevelEventInfo.acquireTaskId())};
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "delete selection=", "taskId=?");
        int iDeleteStorageData = otd.c(this.f22008c).deleteStorageData("level_event_record", 1, "taskId=?", strArr);
        LogUtil.a("PLGACHIEVE_AchieveLevelEventDBMgr", "delete deleteLevelResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        AchieveLevelEventInfo achieveLevelEventInfo = osfVar instanceof AchieveLevelEventInfo ? (AchieveLevelEventInfo) osfVar : null;
        if (achieveLevelEventInfo == null) {
            return -1;
        }
        return d(achieveLevelEventInfo) - 1;
    }

    private int d(AchieveLevelEventInfo achieveLevelEventInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveLevelEventInfo.getHuid());
        contentValues.put("taskId", String.valueOf(achieveLevelEventInfo.acquireTaskId()));
        contentValues.put(ParsedFieldTag.TASK_REWARD_EXPERIENCE, Integer.valueOf(achieveLevelEventInfo.acquireRewardExperience()));
        contentValues.put("taskCount", Integer.valueOf(achieveLevelEventInfo.acquireTaskCount()));
        contentValues.put("lastModifyTime", Long.valueOf(achieveLevelEventInfo.acquireLastModifyTime()));
        contentValues.put("taskSumCount", String.valueOf(achieveLevelEventInfo.acquireTaskSumCount()));
        contentValues.put("SyncTime", Long.valueOf(achieveLevelEventInfo.acquireSyncTime()));
        String[] strArr = {ote.e(achieveLevelEventInfo.acquireTaskId()), ote.e(achieveLevelEventInfo.getHuid())};
        LogUtil.d("PLGACHIEVE_AchieveLevelEventDBMgr", "update selection=", "taskId=? and huid=?");
        int iUpdateStorageData = otd.c(this.f22008c).updateStorageData("level_event_record", 1, contentValues, "taskId=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_AchieveLevelEventDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }
}
