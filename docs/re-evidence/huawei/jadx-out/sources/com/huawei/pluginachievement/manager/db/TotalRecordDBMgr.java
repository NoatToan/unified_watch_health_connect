package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.TotalRecord;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import defpackage.paw;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class TotalRecordDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22017a;

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return null;
    }

    public TotalRecordDBMgr(Context context) {
        this.f22017a = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return c(map.get("huid"));
    }

    private osf c(String str) {
        TotalRecord totalRecord = null;
        try {
            Cursor cursorQueryStorageData = otd.c(this.f22017a).queryStorageData("total_record", 1, "huid='" + str + "'");
            if (cursorQueryStorageData != null) {
                while (cursorQueryStorageData.moveToNext()) {
                    try {
                        if (totalRecord == null) {
                            totalRecord = new TotalRecord();
                        }
                        totalRecord.setHuid(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                        totalRecord.setStartDate(ote.a(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex(Constants.START_DATE))));
                        totalRecord.setEndDate(ote.a(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("endDate"))));
                        a(totalRecord, cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("dataType")), cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("value")));
                        totalRecord.setStepsRanking(ote.d(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("stepsRanking"))));
                    } catch (Throwable th) {
                        if (cursorQueryStorageData != null) {
                            try {
                                cursorQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                cursorQueryStorageData.close();
            }
            if (cursorQueryStorageData != null) {
                cursorQueryStorageData.close();
            }
            return totalRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_TotalRecordDBMgr", e.getMessage());
            return totalRecord;
        }
    }

    private osf a(String str, int i) throws Throwable {
        TotalRecord totalRecord = null;
        try {
            Cursor cursorQueryStorageData = otd.c(this.f22017a).queryStorageData("total_record", 1, "huid='" + str + "'");
            if (cursorQueryStorageData != null) {
                while (cursorQueryStorageData.moveToNext()) {
                    try {
                        if (i == cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("dataType"))) {
                            TotalRecord totalRecord2 = new TotalRecord();
                            try {
                                totalRecord2.setHuid(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                                totalRecord2.setStartDate(ote.a(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex(Constants.START_DATE))));
                                totalRecord2.setEndDate(ote.a(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("endDate"))));
                                a(totalRecord2, i, cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("value")));
                                totalRecord2.setStepsRanking(ote.d(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("stepsRanking"))));
                                totalRecord = totalRecord2;
                                break;
                            } catch (Throwable th) {
                                th = th;
                                totalRecord = totalRecord2;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (cursorQueryStorageData != null) {
                        try {
                            cursorQueryStorageData.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
            }
            if (cursorQueryStorageData != null) {
                cursorQueryStorageData.close();
            }
            return totalRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_TotalRecordDBMgr", e.getMessage());
            return totalRecord;
        }
    }

    private void a(TotalRecord totalRecord, int i, String str) {
        switch (i) {
            case 1:
                totalRecord.setDays((int) ote.d(str));
                break;
            case 2:
                totalRecord.setDistance(ote.d(str));
                break;
            case 3:
                totalRecord.setSteps(ote.d(str));
                break;
            case 4:
                totalRecord.saveCalorie(ote.d(str));
                break;
            case 5:
                totalRecord.saveAccumulatedRunDistance(str);
                break;
            case 6:
                totalRecord.saveAccumulatedCycleDistance(str);
                break;
            case 7:
                totalRecord.saveAccumulatedWalkDistance(str);
                break;
            case 8:
                totalRecord.saveAccumulatedHealthTime(str);
                break;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar != null) {
            TotalRecord totalRecord = osfVar instanceof TotalRecord ? (TotalRecord) osfVar : null;
            if (totalRecord != null) {
                osf osfVarC = c(totalRecord.getHuid());
                if (osfVarC != null) {
                    return d(osfVar, osfVarC);
                }
                if (b(totalRecord) == -1) {
                    LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "insert Column check not pass");
                    return -1L;
                }
                long jA = a(totalRecord, 1, totalRecord.getDays());
                long jA2 = a(totalRecord, 2, totalRecord.getDistance());
                long jA3 = a(totalRecord, 3, totalRecord.getSteps());
                long jA4 = a(totalRecord, 4, totalRecord.acquireCalorie());
                return Math.max((jA - 1) + jA2 + jA3 + jA4 + d(totalRecord, 5, totalRecord.acquireAccumulatedRunDistance()) + d(totalRecord, 6, totalRecord.acquireAccumulatedCycleDistance()) + d(totalRecord, 7, totalRecord.acquireAccumulatedWalkDistance()) + d(totalRecord, 8, totalRecord.acquireAccumulatedHealthTime()), -1L);
            }
        }
        return -1L;
    }

    private long a(TotalRecord totalRecord, int i, double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", totalRecord.getHuid());
        contentValues.put(Constants.START_DATE, Long.valueOf(totalRecord.getStartDate()));
        contentValues.put("endDate", Long.valueOf(totalRecord.getEndDate()));
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("stepsRanking", Double.valueOf(totalRecord.getStepsRanking()));
        long jInsertStorageData = otd.c(this.f22017a).insertStorageData("total_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "insert result=", Long.valueOf(jInsertStorageData), " dataType ", Integer.valueOf(i), " value ", Double.valueOf(d));
        return jInsertStorageData;
    }

    private long d(TotalRecord totalRecord, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", totalRecord.getHuid());
        contentValues.put(Constants.START_DATE, Long.valueOf(totalRecord.getStartDate()));
        contentValues.put("endDate", Long.valueOf(totalRecord.getEndDate()));
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", str);
        contentValues.put("stepsRanking", Double.valueOf(totalRecord.getStepsRanking()));
        long jInsertStorageData = otd.c(this.f22017a).insertStorageData("total_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "insert insertTotalRecordResult=", Long.valueOf(jInsertStorageData), " dataType ", Integer.valueOf(i), " value ", str);
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        TotalRecord totalRecord = osfVar instanceof TotalRecord ? (TotalRecord) osfVar : null;
        if (totalRecord == null) {
            return -1;
        }
        String[] strArr = {ote.e(totalRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_TotalRecordDBMgr", "delete selection=", "huid =?");
        int iDeleteStorageData = otd.c(this.f22017a).deleteStorageData("total_record", 1, "huid =?", strArr);
        LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "delete deleteTotalRecordResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        if (osfVar != null) {
            TotalRecord totalRecord = osfVar instanceof TotalRecord ? (TotalRecord) osfVar : null;
            if (totalRecord != null) {
                if (b(totalRecord) == -1) {
                    LogUtil.j("PLGACHIEVE_TotalRecordDBMgr", "update Column check not pass");
                    return -1;
                }
                osf osfVarC = c(totalRecord.getHuid());
                if (osfVarC != null) {
                    return d(osfVar, osfVarC);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public int d(osf osfVar, osf osfVar2) {
        if (osfVar != null) {
            TotalRecord totalRecord = osfVar instanceof TotalRecord ? (TotalRecord) osfVar : null;
            if (totalRecord != null) {
                if (b(totalRecord) == -1) {
                    LogUtil.j("PLGACHIEVE_TotalRecordDBMgr", "update Column check not pass");
                    return -1;
                }
                TotalRecord totalRecord2 = osfVar2 instanceof TotalRecord ? (TotalRecord) osfVar2 : null;
                if (totalRecord2 != null) {
                    LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "myAchieveDb oldTotalRecord ", totalRecord2.toString());
                    TotalRecord totalRecord3 = totalRecord;
                    TotalRecord totalRecord4 = totalRecord2;
                    int iC = c(totalRecord3, totalRecord4, 1, totalRecord.getDays(), totalRecord2.getDays());
                    int iC2 = c(totalRecord3, totalRecord4, 2, totalRecord.getDistance(), totalRecord2.getDistance());
                    int iC3 = c(totalRecord3, totalRecord4, 3, totalRecord.getSteps(), totalRecord2.getSteps());
                    int iC4 = c(totalRecord3, totalRecord4, 4, totalRecord.acquireCalorie(), totalRecord2.acquireCalorie());
                    return Math.max((iC - 1) + iC2 + iC3 + iC4 + c(totalRecord3, totalRecord4, 5, totalRecord.acquireAccumulatedRunDistance(), totalRecord2.acquireAccumulatedRunDistance()) + c(totalRecord3, totalRecord4, 6, totalRecord.acquireAccumulatedCycleDistance(), totalRecord2.acquireAccumulatedCycleDistance()) + c(totalRecord3, totalRecord4, 7, totalRecord.acquireAccumulatedWalkDistance(), totalRecord2.acquireAccumulatedWalkDistance()) + c(totalRecord3, totalRecord4, 8, totalRecord.acquireAccumulatedHealthTime(), totalRecord2.acquireAccumulatedHealthTime()), -1);
                }
            }
        }
        return -1;
    }

    private int c(TotalRecord totalRecord, TotalRecord totalRecord2, int i, double d, double d2) {
        boolean z = BigDecimal.valueOf(d).equals(BigDecimal.valueOf(d2)) && totalRecord.getStartDate() == totalRecord2.getStartDate();
        if (d < 0.0d || z) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", totalRecord.getHuid());
        contentValues.put(Constants.START_DATE, Long.valueOf(totalRecord.getStartDate()));
        contentValues.put("endDate", Long.valueOf(totalRecord.getEndDate()));
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("stepsRanking", Double.valueOf(totalRecord.getStepsRanking()));
        int iUpdateStorageData = otd.c(this.f22017a).updateStorageData("total_record", 1, contentValues, "huid=? and dataType=?", new String[]{ote.e(totalRecord.getHuid()), ote.e(Integer.valueOf(i))});
        LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "update result=", Integer.valueOf(iUpdateStorageData), " dataType ", Integer.valueOf(i), " value ", Double.valueOf(d));
        if (iUpdateStorageData == 0) {
            c(totalRecord, i, d);
        }
        return iUpdateStorageData;
    }

    private void c(TotalRecord totalRecord, int i, double d) {
        if (a(totalRecord.getHuid(), i) == null) {
            LogUtil.j("PLGACHIEVE_TotalRecordDBMgr", "dealUpdateFailItem no record！");
            a(totalRecord, i, d);
        }
    }

    private int c(TotalRecord totalRecord, TotalRecord totalRecord2, int i, String str, String str2) {
        String str3 = str == null ? "" : str;
        if (str3.equals(str2) && totalRecord.getStartDate() == totalRecord2.getStartDate() && paw.b(totalRecord.getStepsRanking(), totalRecord2.getStepsRanking()) == 0) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", totalRecord.getHuid());
        contentValues.put(Constants.START_DATE, Long.valueOf(totalRecord.getStartDate()));
        contentValues.put("endDate", Long.valueOf(totalRecord.getEndDate()));
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", str3);
        contentValues.put("stepsRanking", Double.valueOf(totalRecord.getStepsRanking()));
        int iUpdateStorageData = otd.c(this.f22017a).updateStorageData("total_record", 1, contentValues, "huid=? and dataType=?", new String[]{ote.e(totalRecord.getHuid()), ote.e(Integer.valueOf(i))});
        LogUtil.a("PLGACHIEVE_TotalRecordDBMgr", "update result=", Integer.valueOf(iUpdateStorageData), " dataType ", Integer.valueOf(i), " value ", str3);
        return iUpdateStorageData;
    }

    private int b(TotalRecord totalRecord) {
        return (TextUtils.isEmpty(totalRecord.getHuid()) || totalRecord.acquireDataType() == -1 || totalRecord.getStartDate() == -1 || totalRecord.getEndDate() == -1 || totalRecord.getDistance() == -1.0d || totalRecord.getSteps() == -1.0d || totalRecord.getDays() == -1 || totalRecord.acquireCalorie() == -1.0d) ? -1 : 0;
    }
}
