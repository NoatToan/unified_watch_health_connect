package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalLocationDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22014b;

    public MedalLocationDBMgr(Context context) {
        this.f22014b = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return b(map.get("huid"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("medalID"), map.get("huid"));
    }

    private osf c(String str, String str2) {
        MedalLocation medalLocation = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalLocationDBMgr", "MedalLocationDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.f22014b).getTableFullName("medal_location_record") + " where medalID =? and huid=?";
        LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22014b).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (medalLocation == null) {
                            medalLocation = new MedalLocation();
                        }
                        medalLocation.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        medalLocation.saveMedalName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName")));
                        medalLocation.saveMedalID(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalID")));
                        medalLocation.saveFirstTabDesc(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_TAB_DESC)));
                        medalLocation.saveFirstTabPriority(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_TAB_PRIORITY)));
                        medalLocation.saveSecondTabDesc(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.SECOND_TAB_DESC)));
                        medalLocation.saveSecondTabPriority(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.SECOND_TAB_PRIORITY)));
                        medalLocation.saveMedalWeight(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MEDAL_WEIGHT)));
                        medalLocation.saveTimestamp(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp")));
                        medalLocation.saveMedalGainedTime(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalGainedTime")));
                        medalLocation.saveGainedCount(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("gainedCount")));
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
            return medalLocation;
        } catch (SQLException e) {
            LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", e.getMessage());
            return medalLocation;
        }
    }

    private List<osf> b(String str) {
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalLocationDBMgr", "MedalLocationDBMgr, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str2 = "select *  from " + otd.c(this.f22014b).getTableFullName("medal_location_record") + " where huid=?";
        LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22014b).rawQueryStorageData(1, str2, new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        MedalLocation medalLocation = new MedalLocation();
                        medalLocation.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName"));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalID"));
                        int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_TAB_PRIORITY));
                        String string3 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.FIRST_TAB_DESC));
                        int i2 = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.SECOND_TAB_PRIORITY));
                        String string4 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.SECOND_TAB_DESC));
                        int i3 = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MEDAL_WEIGHT));
                        String string5 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalGainedTime"));
                        int i4 = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("gainedCount"));
                        long j = cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp"));
                        medalLocation.saveMedalName(string);
                        medalLocation.saveMedalID(string2);
                        medalLocation.saveFirstTabPriority(i);
                        medalLocation.saveFirstTabDesc(string3);
                        medalLocation.saveSecondTabDesc(string4);
                        medalLocation.saveSecondTabPriority(i2);
                        medalLocation.saveMedalWeight(i3);
                        medalLocation.saveMedalGainedTime(string5);
                        medalLocation.saveTimestamp(j);
                        medalLocation.saveGainedCount(i4);
                        arrayList.add(medalLocation);
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
        } catch (SQLException unused) {
            LogUtil.e("PLGACHIEVE_MedalLocationDBMgr", "query MedalLocationDBMgr SQLException");
        }
        LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", "query MedalLocationDBMgr=", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        MedalLocation medalLocation = osfVar instanceof MedalLocation ? (MedalLocation) osfVar : null;
        if (medalLocation == null) {
            return -1L;
        }
        osf osfVarC = c(medalLocation.acquireMedalID(), medalLocation.getHuid());
        if (osfVarC != null) {
            return b(osfVarC, osfVar);
        }
        return a(medalLocation) - 1;
    }

    private long a(MedalLocation medalLocation) {
        ContentValues contentValues = new ContentValues();
        if (!e(contentValues, medalLocation)) {
            return -1L;
        }
        long jInsertStorageData = otd.c(this.f22014b).insertStorageData("medal_location_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_MedalLocationDBMgr", "insert insertMedalLocationResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        MedalLocation medalLocation = osfVar instanceof MedalLocation ? (MedalLocation) osfVar : null;
        if (medalLocation == null) {
            return -1;
        }
        String[] strArr = {ote.e(medalLocation.acquireMedalID()), ote.e(medalLocation.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", "delete selection=", "medalID=? and huid=?");
        int iDeleteStorageData = otd.c(this.f22014b).deleteStorageData("medal_location_record", 1, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalLocationDBMgr", "delete deleteMedalLocationResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        osf osfVarC;
        if (osfVar != null) {
            MedalLocation medalLocation = osfVar instanceof MedalLocation ? (MedalLocation) osfVar : null;
            if (medalLocation == null || (osfVarC = c(medalLocation.acquireMedalID(), medalLocation.getHuid())) == null) {
                return -1;
            }
            return b(osfVarC, osfVar);
        }
        return -1;
    }

    public int b(osf osfVar, osf osfVar2) {
        if (osfVar2 == null) {
            return -1;
        }
        MedalLocation medalLocation = osfVar2 instanceof MedalLocation ? (MedalLocation) osfVar2 : null;
        if (medalLocation == null) {
            return -1;
        }
        return d(osfVar, medalLocation) - 1;
    }

    private int d(osf osfVar, MedalLocation medalLocation) {
        ContentValues contentValues = new ContentValues();
        if (!a(contentValues, medalLocation, osfVar)) {
            return -1;
        }
        String[] strArr = {ote.e(medalLocation.acquireMedalID()), ote.e(medalLocation.getHuid())};
        LogUtil.d("PLGACHIEVE_MedalLocationDBMgr", "update selection=", "medalID=? and huid=?");
        int iUpdateStorageData = otd.c(this.f22014b).updateStorageData("medal_location_record", 1, contentValues, "medalID=? and huid=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalLocationDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }

    private boolean a(ContentValues contentValues, MedalLocation medalLocation, osf osfVar) {
        if (medalLocation == null) {
            return false;
        }
        MedalLocation medalLocation2 = osfVar instanceof MedalLocation ? (MedalLocation) osfVar : null;
        if (medalLocation2 == null) {
            return false;
        }
        String strAcquireFirstTabDesc = medalLocation.acquireFirstTabDesc();
        contentValues.put("huid", medalLocation2.getHuid());
        contentValues.put("medalName", d(medalLocation2.acquireMedalName()));
        contentValues.put("medalID", medalLocation2.acquireMedalID());
        contentValues.put(ParsedFieldTag.FIRST_TAB_PRIORITY, Integer.valueOf(otd.c(medalLocation2.acquireFirstTabPriority(), medalLocation.acquireFirstTabPriority())));
        contentValues.put(ParsedFieldTag.FIRST_TAB_DESC, otd.d(medalLocation2.acquireFirstTabDesc(), strAcquireFirstTabDesc));
        contentValues.put(ParsedFieldTag.SECOND_TAB_PRIORITY, Integer.valueOf(otd.c(medalLocation2.acquireSecondTabPriority(), medalLocation.acquireSecondTabPriority())));
        contentValues.put(ParsedFieldTag.SECOND_TAB_DESC, otd.d(medalLocation2.acquireSecondTabDesc(), medalLocation.acquireSecondTabDesc()));
        contentValues.put(ParsedFieldTag.MEDAL_WEIGHT, Integer.valueOf(otd.c(medalLocation2.acquireMedalWeight(), medalLocation.acquireMedalWeight())));
        contentValues.put("medalGainedTime", b(medalLocation2.acquireMedalGainedTime(), medalLocation.acquireMedalGainedTime()));
        contentValues.put("gainedCount", Integer.valueOf(otd.c(medalLocation2.acquireGainedCount(), medalLocation.acquireGainedCount())));
        if (!TextUtils.isEmpty(strAcquireFirstTabDesc)) {
            contentValues.put("timestamp", Long.valueOf(medalLocation.acquireTimestamp()));
            return true;
        }
        contentValues.put("timestamp", Long.valueOf(medalLocation2.acquireTimestamp()));
        return true;
    }

    private boolean e(ContentValues contentValues, MedalLocation medalLocation) {
        if (medalLocation == null || medalLocation.acquireMedalID() == null || medalLocation.acquireFirstTabDesc() == null) {
            return false;
        }
        contentValues.put("huid", medalLocation.getHuid());
        contentValues.put("medalName", d(medalLocation.acquireMedalName()));
        contentValues.put("medalID", medalLocation.acquireMedalID());
        contentValues.put(ParsedFieldTag.FIRST_TAB_PRIORITY, Integer.valueOf(medalLocation.acquireFirstTabPriority()));
        contentValues.put(ParsedFieldTag.FIRST_TAB_DESC, d(medalLocation.acquireFirstTabDesc()));
        contentValues.put(ParsedFieldTag.SECOND_TAB_PRIORITY, Integer.valueOf(medalLocation.acquireSecondTabPriority()));
        contentValues.put(ParsedFieldTag.SECOND_TAB_DESC, d(medalLocation.acquireSecondTabDesc()));
        contentValues.put(ParsedFieldTag.MEDAL_WEIGHT, Integer.valueOf(medalLocation.acquireMedalWeight()));
        contentValues.put("medalGainedTime", d(medalLocation.acquireMedalGainedTime()));
        contentValues.put("gainedCount", Integer.valueOf(medalLocation.acquireGainedCount()));
        contentValues.put("timestamp", Long.valueOf(medalLocation.acquireTimestamp()));
        return true;
    }

    private static String d(String str) {
        return str == null ? "" : str;
    }

    private static String b(String str, String str2) {
        return !ote.b(str2) ? str : str2;
    }
}
