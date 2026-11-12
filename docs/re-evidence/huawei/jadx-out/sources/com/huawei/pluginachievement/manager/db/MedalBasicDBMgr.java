package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalBasic;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalBasicDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22012c;

    public MedalBasicDBMgr(Context context) {
        this.f22012c = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return a(map.get("huid"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("medalID"), map.get("huid"));
    }

    private osf c(String str, String str2) {
        MedalBasic medalBasic = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalBasicDBMgr", "MedalBasicDBMgr, query ,id is null!return");
            return null;
        }
        String str3 = "select *  from " + otd.c(this.f22012c).getTableFullName("medal_basic_record") + " where medalID =? and huid=?";
        LogUtil.d("PLGACHIEVE_MedalBasicDBMgr", "query selection=", str3);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22012c).rawQueryStorageData(1, str3, new String[]{ote.e(str), ote.e(str2)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        if (medalBasic == null) {
                            medalBasic = new MedalBasic();
                        }
                        medalBasic.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        medalBasic.saveMedalName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName")));
                        medalBasic.saveVeinUrl(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MEDAL_URL)));
                        medalBasic.saveTimestamp(otd.b(cursorRawQueryStorageData, "timeStamp"));
                        medalBasic.saveMedalID(otd.c(cursorRawQueryStorageData, "medalID"));
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
            return medalBasic;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_MedalBasicDBMgr", e.getMessage());
            return medalBasic;
        }
    }

    private List<osf> a(String str) {
        if (str == null) {
            LogUtil.a("PLGACHIEVE_MedalBasicDBMgr", "MedalLocationDBMgr, query ,id is null!return");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        String str2 = "select *  from " + otd.c(this.f22012c).getTableFullName("medal_basic_record") + " where huid=?";
        LogUtil.d("PLGACHIEVE_MedalBasicDBMgr", "query selection=", str2);
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22012c).rawQueryStorageData(1, str2, new String[]{ote.e(str)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        MedalBasic medalBasic = new MedalBasic();
                        medalBasic.setHuid(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid")));
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("medalName"));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.MEDAL_URL));
                        long jB = otd.b(cursorRawQueryStorageData, "timeStamp");
                        String strC = otd.c(cursorRawQueryStorageData, "medalID");
                        medalBasic.saveMedalName(string);
                        medalBasic.saveVeinUrl(string2);
                        medalBasic.saveTimestamp(jB);
                        medalBasic.saveMedalID(strC);
                        arrayList.add(medalBasic);
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
            LogUtil.j("PLGACHIEVE_MedalBasicDBMgr", e.getMessage());
        }
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        MedalBasic medalBasic = osfVar instanceof MedalBasic ? (MedalBasic) osfVar : null;
        if (medalBasic == null) {
            return -1L;
        }
        if (c(medalBasic.acquireMedalID(), medalBasic.getHuid()) != null) {
            return update(osfVar);
        }
        return b(medalBasic) - 1;
    }

    private long b(MedalBasic medalBasic) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", medalBasic.getHuid());
        contentValues.put("medalName", medalBasic.acquireMedalName());
        contentValues.put(ParsedFieldTag.MEDAL_URL, medalBasic.acquireVeinUrl());
        contentValues.put("timeStamp", Long.valueOf(medalBasic.acquireTimestamp()));
        contentValues.put("medalID", medalBasic.acquireMedalID());
        long jInsertStorageData = otd.c(this.f22012c).insertStorageData("medal_basic_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_MedalBasicDBMgr", "insert insertMedalResult=", Long.valueOf(jInsertStorageData));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        MedalBasic medalBasic = osfVar instanceof MedalBasic ? (MedalBasic) osfVar : null;
        if (medalBasic == null) {
            return -1;
        }
        String[] strArr = {ote.e(medalBasic.acquireMedalName())};
        LogUtil.d("PLGACHIEVE_MedalBasicDBMgr", "delete selection=", "medalName=?");
        int iDeleteStorageData = otd.c(this.f22012c).deleteStorageData("medal_basic_record", 1, "medalName=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalBasicDBMgr", "delete deleteMedalResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        MedalBasic medalBasic = osfVar instanceof MedalBasic ? (MedalBasic) osfVar : null;
        if (medalBasic == null) {
            return -1;
        }
        return d(medalBasic) - 1;
    }

    private int d(MedalBasic medalBasic) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", medalBasic.getHuid());
        contentValues.put("medalName", medalBasic.acquireMedalName());
        contentValues.put(ParsedFieldTag.MEDAL_URL, medalBasic.acquireVeinUrl());
        contentValues.put("timeStamp", Long.valueOf(medalBasic.acquireTimestamp()));
        contentValues.put("medalID", medalBasic.acquireMedalID());
        String[] strArr = {ote.e(medalBasic.acquireMedalID())};
        LogUtil.d("PLGACHIEVE_MedalBasicDBMgr", "update selection=", "medalID=?");
        int iUpdateStorageData = otd.c(this.f22012c).updateStorageData("medal_basic_record", 1, contentValues, "medalID=?", strArr);
        LogUtil.a("PLGACHIEVE_MedalBasicDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData;
    }
}
