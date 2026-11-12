package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.AchieveLevelTotalInfo;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class LevelNumbersDBMgr implements IAchieveDBMgr {
    private Context e;

    public LevelNumbersDBMgr(Context context) {
        this.e = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return c(map.get("huid"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("level"), map.get("huid"));
    }

    private osf c(String str, String str2) {
        AchieveLevelTotalInfo achieveLevelTotalInfo = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_LevelNumbersDBMgr", "MedalBasicDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.e).getTableFullName("level_number_record") + " where level =? and huid=?";
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.e).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (achieveLevelTotalInfo == null) {
                            achieveLevelTotalInfo = new AchieveLevelTotalInfo();
                        }
                        achieveLevelTotalInfo.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        achieveLevelTotalInfo.saveLevel(otd.d(cursorRawQueryStorageData, "level"));
                        achieveLevelTotalInfo.saveUserNumber(otd.d(cursorRawQueryStorageData, "levelUserNumber"));
                        achieveLevelTotalInfo.saveSyncTime(otd.b(cursorRawQueryStorageData, "timeStamp"));
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
        } catch (Exception e) {
            LogUtil.j("PLGACHIEVE_LevelNumbersDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "query achieveLevelTotalInfo=", achieveLevelTotalInfo == null ? Constants.NULL : achieveLevelTotalInfo);
        return achieveLevelTotalInfo;
    }

    private List<osf> c(String str) {
        if (str == null) {
            LogUtil.a("PLGACHIEVE_LevelNumbersDBMgr", "AchieveLevelTotalInfo, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str2 = "select *  from " + otd.c(this.e).getTableFullName("level_number_record") + " where huid=?";
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.e).rawQueryStorageData(1, str2, new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        AchieveLevelTotalInfo achieveLevelTotalInfo = new AchieveLevelTotalInfo();
                        achieveLevelTotalInfo.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        achieveLevelTotalInfo.saveLevel(otd.d(cursorRawQueryStorageData, "level"));
                        achieveLevelTotalInfo.saveUserNumber(otd.d(cursorRawQueryStorageData, "levelUserNumber"));
                        achieveLevelTotalInfo.saveSyncTime(otd.b(cursorRawQueryStorageData, "timeStamp"));
                        arrayList.add(achieveLevelTotalInfo);
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
            LogUtil.j("PLGACHIEVE_LevelNumbersDBMgr", e.getMessage());
        }
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "query medalBasic medalBasicList=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        AchieveLevelTotalInfo achieveLevelTotalInfo = osfVar instanceof AchieveLevelTotalInfo ? (AchieveLevelTotalInfo) osfVar : null;
        if (achieveLevelTotalInfo == null) {
            return -1L;
        }
        if (c(String.valueOf(achieveLevelTotalInfo.acquireLevel()), achieveLevelTotalInfo.getHuid()) != null) {
            return update(osfVar);
        }
        return d(achieveLevelTotalInfo) - 1;
    }

    private long d(AchieveLevelTotalInfo achieveLevelTotalInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveLevelTotalInfo.getHuid());
        contentValues.put("level", Integer.valueOf(achieveLevelTotalInfo.acquireLevel()));
        contentValues.put("levelUserNumber", Integer.valueOf(achieveLevelTotalInfo.acquireUserNumber()));
        contentValues.put("timeStamp", Long.valueOf(achieveLevelTotalInfo.acquireSyncTime()));
        long jInsertStorageData = otd.c(this.e).insertStorageData("level_number_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_LevelNumbersDBMgr", "insert totalLevelResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        AchieveLevelTotalInfo achieveLevelTotalInfo = osfVar instanceof AchieveLevelTotalInfo ? (AchieveLevelTotalInfo) osfVar : null;
        if (achieveLevelTotalInfo == null) {
            return -1;
        }
        String[] strArr = {ote.e(Integer.valueOf(achieveLevelTotalInfo.acquireLevel()))};
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "delete selection=", "level=?");
        int iDeleteStorageData = otd.c(this.e).deleteStorageData("level_number_record", 1, "level=?", strArr);
        LogUtil.a("PLGACHIEVE_LevelNumbersDBMgr", "delete deleteTotalLevelResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        AchieveLevelTotalInfo achieveLevelTotalInfo = osfVar instanceof AchieveLevelTotalInfo ? (AchieveLevelTotalInfo) osfVar : null;
        if (achieveLevelTotalInfo == null) {
            return -1;
        }
        return e(achieveLevelTotalInfo) - 1;
    }

    private int e(AchieveLevelTotalInfo achieveLevelTotalInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveLevelTotalInfo.getHuid());
        contentValues.put("level", Integer.valueOf(achieveLevelTotalInfo.acquireLevel()));
        contentValues.put("levelUserNumber", Integer.valueOf(achieveLevelTotalInfo.acquireUserNumber()));
        contentValues.put("timeStamp", Long.valueOf(achieveLevelTotalInfo.acquireSyncTime()));
        String[] strArr = {ote.e(Integer.valueOf(achieveLevelTotalInfo.acquireLevel())), ote.e(achieveLevelTotalInfo.getHuid())};
        LogUtil.d("PLGACHIEVE_LevelNumbersDBMgr", "update selection=", "level=? and huid=?");
        int iUpdateStorageData = otd.c(this.e).updateStorageData("level_number_record", 1, contentValues, "level=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_LevelNumbersDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }
}
