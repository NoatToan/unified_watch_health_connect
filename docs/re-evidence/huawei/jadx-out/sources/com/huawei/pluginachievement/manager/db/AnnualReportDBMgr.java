package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.osf;
import defpackage.osx;
import defpackage.otb;
import defpackage.otd;
import defpackage.ote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AnnualReportDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22010c;

    public AnnualReportDBMgr(Context context) {
        this.f22010c = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return c(map.get("huid"), map.get("type"), map.get("year"));
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return b(map.get("type"), map.get("huid"), map.get(MedalConstants.EVENT_KEY), map.get("year"));
    }

    public osf b(String str, String str2, String str3, String str4) throws Throwable {
        String str5 = "select *  from " + otd.c(this.f22010c).getTableFullName("annual_info") + " where type =? and huid=? and key=? and year=?";
        LogUtil.d("PLGACHIEVE_AnnualReportDBMgr", "query selection=", str5);
        osf osfVar = null;
        try {
            Cursor cursorRawQueryStorageData = otd.c(this.f22010c).rawQueryStorageData(1, str5, new String[]{ote.e(str2), ote.e(str), ote.e(str3), ote.e(str4)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        osf osfVar2 = new osf(19);
                        try {
                            osfVar2.setHuid(str);
                            osfVar2.setType(str2);
                            osfVar2.setYear(otb.b(cursorRawQueryStorageData, "year"));
                            osfVar2.setKey(otb.b(cursorRawQueryStorageData, MedalConstants.EVENT_KEY));
                            osfVar2.setValues(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value")));
                            osfVar = osfVar2;
                        } catch (Throwable th) {
                            th = th;
                            osfVar = osfVar2;
                            if (cursorRawQueryStorageData != null) {
                                try {
                                    cursorRawQueryStorageData.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return osfVar;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_AnnualReportDBMgr", e.getMessage());
            return osfVar;
        }
    }

    public List<osf> c(String str, String str2, String str3) throws Throwable {
        List<Integer> listA = osx.a(str2, str3);
        if (listA == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(listA.size());
        Iterator<Integer> it = listA.iterator();
        while (it.hasNext()) {
            osf osfVarB = b(str, str2, String.valueOf(it.next().intValue()), str3);
            if (osfVarB != null) {
                arrayList.add(osfVarB);
            }
        }
        LogUtil.a("PLGACHIEVE_AnnualReportDBMgr", "querySetData size=", Integer.valueOf(arrayList.size()), " setType=", str2);
        return arrayList;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar == null) {
            return -1L;
        }
        String huid = osfVar.getHuid();
        String type = osfVar.getType();
        int key = osfVar.getKey();
        int year = osfVar.getYear();
        return d(huid, type, String.valueOf(key), String.valueOf(year), osfVar.getValues()) - 1;
    }

    public long d(String str, String str2, String str3, String str4, String str5) {
        if (b(str, str2, str3, str4) != null) {
            return c(str, str2, str3, str4, str5);
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("huid", str);
            contentValues.put("type", str2);
            contentValues.put("value", str5);
            contentValues.put(MedalConstants.EVENT_KEY, Integer.valueOf(str3));
            contentValues.put("year", Integer.valueOf(str4));
            return otd.c(this.f22010c).insertStorageData("annual_info", 1, contentValues) - 1;
        } catch (NumberFormatException e) {
            LogUtil.e("PLGACHIEVE_AnnualReportDBMgr", "insert error: ", e.getMessage());
            return 201000L;
        }
    }

    private int c(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str5) || otb.b(str2, str3, str4, str5)) {
            LogUtil.a("PLGACHIEVE_AnnualReportDBMgr", "update value null");
            return 1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("huid", str);
            contentValues.put("type", str2);
            contentValues.put(MedalConstants.EVENT_KEY, Integer.valueOf(str3));
            contentValues.put("year", Integer.valueOf(str4));
            contentValues.put("value", str5);
            int iUpdateStorageData = otd.c(this.f22010c).updateStorageData("annual_info", 1, contentValues, "type=? and huid=? and key=? and year=?", new String[]{ote.e(str2), ote.e(str), ote.e(str3), ote.e(str4)});
            LogUtil.a("PLGACHIEVE_AnnualReportDBMgr", "update result=", Integer.valueOf(iUpdateStorageData));
            return iUpdateStorageData;
        } catch (NumberFormatException e) {
            LogUtil.e("PLGACHIEVE_AnnualReportDBMgr", "update error: ", e.getMessage());
            return 201000;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        String huid = osfVar.getHuid();
        String[] strArr = {ote.e(osfVar.getType()), ote.e(huid), ote.e(String.valueOf(osfVar.getKey())), ote.e(String.valueOf(osfVar.getYear()))};
        LogUtil.d("PLGACHIEVE_AnnualReportDBMgr", "delete selection=", "type=? and huid=? and key=? and year=?");
        int iDeleteStorageData = otd.c(this.f22010c).deleteStorageData("annual_info", 1, "type=? and huid=? and key=? and year=?", strArr);
        LogUtil.a("PLGACHIEVE_AnnualReportDBMgr", "delete result=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        String huid = osfVar.getHuid();
        String type = osfVar.getType();
        int key = osfVar.getKey();
        int year = osfVar.getYear();
        return c(huid, type, String.valueOf(key), String.valueOf(year), osfVar.getValues());
    }
}
