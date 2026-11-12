package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.AchieveUserLevelInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveUserLevelDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22009a;

    public AchieveUserLevelDBMgr(Context context) {
        this.f22009a = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("huid"));
    }

    private osf c(String str) {
        AchieveUserLevelInfo achieveUserLevelInfo = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_AchieveUserLevelDBMgr", "AchieveUserLevelDBMgr, query ,huid is null!return");
            return null;
        }
        String str2 = "select *  from " + otd.c(this.f22009a).getTableFullName("level_info_record") + " where huid=?";
        LogUtil.d("PLGACHIEVE_AchieveUserLevelDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22009a).rawQueryStorageData(1, str2, new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (achieveUserLevelInfo == null) {
                            achieveUserLevelInfo = new AchieveUserLevelInfo();
                        }
                        achieveUserLevelInfo.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        achieveUserLevelInfo.saveUserLevel(otd.d(cursorRawQueryStorageData, ParsedFieldTag.USER_LEVEL));
                        achieveUserLevelInfo.saveUserExperience(otd.d(cursorRawQueryStorageData, ParsedFieldTag.USER_EXPERIENCE));
                        achieveUserLevelInfo.saveUserReachDays(ote.d(otd.c(cursorRawQueryStorageData, "userReachDays")));
                        achieveUserLevelInfo.saveSyncTimestamp(otd.b(cursorRawQueryStorageData, "syncTimestamp"));
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
            LogUtil.j("PLGACHIEVE_AchieveUserLevelDBMgr", e.getMessage());
        }
        LogUtil.a("PLGACHIEVE_AchieveUserLevelDBMgr", "query AchieveUserLevelInfo=", achieveUserLevelInfo == null ? Constants.NULL : achieveUserLevelInfo);
        return achieveUserLevelInfo;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar != null) {
            AchieveUserLevelInfo achieveUserLevelInfo = osfVar instanceof AchieveUserLevelInfo ? (AchieveUserLevelInfo) osfVar : null;
            if (achieveUserLevelInfo != null) {
                if (c(achieveUserLevelInfo.getHuid()) != null) {
                    return update(osfVar);
                }
                return Math.max(e(achieveUserLevelInfo) - 1, -1L);
            }
        }
        return -1L;
    }

    private long e(AchieveUserLevelInfo achieveUserLevelInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveUserLevelInfo.getHuid());
        contentValues.put(ParsedFieldTag.USER_LEVEL, Integer.valueOf(achieveUserLevelInfo.acquireUserLevel()));
        contentValues.put(ParsedFieldTag.USER_EXPERIENCE, Integer.valueOf(achieveUserLevelInfo.acquireUserExperience()));
        contentValues.put("syncTimestamp", Long.valueOf(achieveUserLevelInfo.acquireSyncTimestamp()));
        contentValues.put("userReachDays", String.valueOf(achieveUserLevelInfo.acquireUserReachDays()));
        long jInsertStorageData = otd.c(this.f22009a).insertStorageData("level_info_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_AchieveUserLevelDBMgr", "insert insertUserLevelResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        AchieveUserLevelInfo achieveUserLevelInfo = osfVar instanceof AchieveUserLevelInfo ? (AchieveUserLevelInfo) osfVar : null;
        if (achieveUserLevelInfo == null) {
            return -1;
        }
        String[] strArr = {ote.e(Integer.valueOf(achieveUserLevelInfo.acquireUserLevel()))};
        LogUtil.d("PLGACHIEVE_AchieveUserLevelDBMgr", "delete selection=", "userLevel=?");
        int iDeleteStorageData = otd.c(this.f22009a).deleteStorageData("level_info_record", 1, "userLevel=?", strArr);
        LogUtil.a("PLGACHIEVE_AchieveUserLevelDBMgr", "delete deleteUserResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar != null) {
            AchieveUserLevelInfo achieveUserLevelInfo = osfVar instanceof AchieveUserLevelInfo ? (AchieveUserLevelInfo) osfVar : null;
            if (achieveUserLevelInfo != null) {
                return Math.max(c(achieveUserLevelInfo) - 1, -1);
            }
        }
        return -1;
    }

    private int c(AchieveUserLevelInfo achieveUserLevelInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveUserLevelInfo.getHuid());
        contentValues.put(ParsedFieldTag.USER_LEVEL, Integer.valueOf(achieveUserLevelInfo.acquireUserLevel()));
        contentValues.put(ParsedFieldTag.USER_EXPERIENCE, Integer.valueOf(achieveUserLevelInfo.acquireUserExperience()));
        contentValues.put("userReachDays", String.valueOf(achieveUserLevelInfo.acquireUserReachDays()));
        contentValues.put("syncTimestamp", Long.valueOf(achieveUserLevelInfo.acquireSyncTimestamp()));
        String[] strArr = {ote.e(achieveUserLevelInfo.getHuid())};
        LogUtil.d("PLGACHIEVE_AchieveUserLevelDBMgr", "update selection=", "huid=?");
        int iUpdateStorageData = otd.c(this.f22009a).updateStorageData("level_info_record", 1, contentValues, "huid=?", strArr);
        LogUtil.a("PLGACHIEVE_AchieveUserLevelDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }
}
