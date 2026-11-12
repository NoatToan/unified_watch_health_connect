package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveAMedalsObserver;
import com.huawei.pluginachievement.manager.model.AchieveInfo;
import defpackage.osf;
import defpackage.otc;
import defpackage.otd;
import defpackage.ote;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class UserInfoDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AchieveAMedalsObserver f22019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22020b = "";
    private Context e;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22018c = new Object();

    public UserInfoDBMgr(Context context) {
        this.e = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return b(map.get("huid"));
    }

    private osf b(String str) {
        SQLiteException e;
        AchieveInfo achieveInfo;
        Throwable th;
        Cursor cursorRawQueryStorageData;
        synchronized (d) {
            Cursor cursor = null;
            achieveInfo = null;
            AchieveInfo achieveInfo2 = null;
            cursor = null;
            try {
                if (str == null) {
                    LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "UserInfoDBMgr, query ,id is null!return null.");
                    return null;
                }
                otd otdVarC = otd.c(this.e);
                if (otdVarC == null) {
                    LogUtil.d("PLGACHIEVE_UserInfoDBMgr", "achieveDBManager is null");
                    return null;
                }
                String str2 = "select *  from " + otdVarC.getTableFullName("achieve_info") + " where huid =? ";
                LogUtil.d("PLGACHIEVE_UserInfoDBMgr", "query selection=", str2);
                try {
                    try {
                        cursorRawQueryStorageData = otdVarC.rawQueryStorageData(1, str2, new String[]{ote.e(str)});
                        if (cursorRawQueryStorageData != null) {
                            while (cursorRawQueryStorageData.moveToNext()) {
                                try {
                                    try {
                                        AchieveInfo achieveInfo3 = new AchieveInfo();
                                        try {
                                            achieveInfo3.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                                            achieveInfo3.setUserLevel(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("reach_days")));
                                            achieveInfo3.setUserPoint(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("points")));
                                            achieveInfo3.saveMedals(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medal_id")));
                                            achieveInfo3.setUserReachStandardDays(ote.d(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("userReachStandardDays"))));
                                            achieveInfo3.setSyncTimestamp(ote.a(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("syncTimestamp"))));
                                            achieveInfo2 = achieveInfo3;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            achieveInfo2 = achieveInfo3;
                                            AchieveInfo achieveInfo4 = achieveInfo2;
                                            cursor = cursorRawQueryStorageData;
                                            achieveInfo = achieveInfo4;
                                            LogUtil.e("PLGACHIEVE_UserInfoDBMgr", "query: exception -> " + e.getMessage());
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            achieveInfo2 = achieveInfo;
                                            return achieveInfo2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursorRawQueryStorageData != null) {
                                        cursorRawQueryStorageData.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursorRawQueryStorageData = cursor;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    achieveInfo = null;
                }
                return achieveInfo2;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        synchronized (d) {
            try {
                if (osfVar == null) {
                    LogUtil.j("PLGACHIEVE_UserInfoDBMgr", "insert achieveData is null");
                    return -1L;
                }
                AchieveInfo achieveInfo = osfVar instanceof AchieveInfo ? (AchieveInfo) osfVar : null;
                if (achieveInfo == null) {
                    LogUtil.j("PLGACHIEVE_UserInfoDBMgr", "insert achieveInfo is null");
                    return -1L;
                }
                osf osfVarB = b(achieveInfo.getHuid());
                if (osfVarB instanceof AchieveInfo) {
                    this.f22020b = ((AchieveInfo) osfVarB).acquireMedals();
                    return update(osfVar);
                }
                if (otc.a(achieveInfo) == -1) {
                    LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "Column check not pass");
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("huid", achieveInfo.getHuid());
                contentValues.put("reach_days", Integer.valueOf(achieveInfo.getUserLevel()));
                contentValues.put("points", Integer.valueOf(achieveInfo.getUserPoint()));
                contentValues.put("medal_id", achieveInfo.acquireMedals());
                contentValues.put("userReachStandardDays", Double.valueOf(achieveInfo.getUserReachStandardDays()));
                contentValues.put("syncTimestamp", Long.valueOf(achieveInfo.getSyncTimestamp()));
                long jInsertStorageData = otd.c(this.e).insertStorageData("achieve_info", 1, contentValues);
                LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "insert result=", Long.valueOf(jInsertStorageData));
                if (0 == jInsertStorageData) {
                    d(achieveInfo.acquireMedals());
                }
                return jInsertStorageData;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(String str) {
        synchronized (f22018c) {
            if (this.f22019a != null) {
                LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "notifyAMRefresh!", str);
                this.f22019a.onMedalsChange(str);
            }
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        synchronized (d) {
            try {
                if (osfVar == null) {
                    LogUtil.j("PLGACHIEVE_UserInfoDBMgr", "delete achieveData is null");
                    return -1;
                }
                AchieveInfo achieveInfo = osfVar instanceof AchieveInfo ? (AchieveInfo) osfVar : null;
                if (achieveInfo == null) {
                    LogUtil.j("PLGACHIEVE_UserInfoDBMgr", "delete achieveInfo is null");
                    return -1;
                }
                String[] strArr = {ote.e(achieveInfo.getHuid())};
                LogUtil.d("PLGACHIEVE_UserInfoDBMgr", "delete selection=", "huid=?");
                return otd.c(this.e).deleteStorageData("achieve_info", 1, "huid=?", strArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            LogUtil.j("PLGACHIEVE_UserInfoDBMgr", "update achieveData is null");
            return -1;
        }
        AchieveInfo achieveInfo = osfVar instanceof AchieveInfo ? (AchieveInfo) osfVar : null;
        if (achieveInfo == null) {
            return -1;
        }
        if (otc.a(achieveInfo) == -1) {
            LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "update Column check not pass");
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", achieveInfo.getHuid());
        contentValues.put("reach_days", Integer.valueOf(achieveInfo.getUserLevel()));
        contentValues.put("points", Integer.valueOf(achieveInfo.getUserPoint()));
        String strC = otc.c(achieveInfo.acquireMedals(), this.f22020b);
        contentValues.put("medal_id", strC);
        contentValues.put("userReachStandardDays", Double.valueOf(achieveInfo.getUserReachStandardDays()));
        contentValues.put("syncTimestamp", Long.valueOf(achieveInfo.getSyncTimestamp()));
        int iUpdateStorageData = otd.c(this.e).updateStorageData("achieve_info", 1, contentValues, "huid=?", new String[]{ote.e(achieveInfo.getHuid())});
        LogUtil.a("PLGACHIEVE_UserInfoDBMgr", "update allMds ", "result :", strC);
        if (iUpdateStorageData == 0) {
            d(strC);
        }
        return iUpdateStorageData;
    }
}
