package com.huawei.pluginachievement.manager.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import defpackage.osf;
import defpackage.otd;
import defpackage.ote;
import defpackage.ozp;
import defpackage.paw;
import health.compact.a.Utils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class SingleDayRecordDBMgr implements IAchieveDBMgr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22016a;

    public SingleDayRecordDBMgr(Context context) {
        this.f22016a = context;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public osf query(Map<String, String> map) {
        return e(map.get("huid"));
    }

    private osf e(String str) {
        SingleDayRecord singleDayRecord = null;
        if (str == null) {
            LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "SingleDayRecordDBMgr, query ,id is null!return");
            return null;
        }
        try {
            Cursor cursorQueryStorageData = otd.c(this.f22016a).queryStorageData("single_day_record", 1, "huid='" + str + "'");
            if (cursorQueryStorageData != null) {
                while (cursorQueryStorageData.moveToNext()) {
                    try {
                        if (singleDayRecord == null) {
                            singleDayRecord = new SingleDayRecord();
                        }
                        singleDayRecord.setHuid(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                        c(singleDayRecord, cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("dataType")), cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("value")), cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("date")));
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
            }
            if (cursorQueryStorageData != null) {
                cursorQueryStorageData.close();
            }
            return singleDayRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", e.getMessage());
            return singleDayRecord;
        }
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public List<osf> queryAll(Map<String, String> map) {
        return Collections.EMPTY_LIST;
    }

    private osf a(String str, int i) throws Throwable {
        Throwable th;
        SingleDayRecord singleDayRecord = null;
        if (str == null) {
            LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", "SingleDayRecordDBMgr, query ,id is null!return");
            return null;
        }
        try {
            Cursor cursorQueryStorageData = otd.c(this.f22016a).queryStorageData("single_day_record", 1, "huid='" + str + "'");
            if (cursorQueryStorageData != null) {
                while (cursorQueryStorageData.moveToNext()) {
                    try {
                        if (i == cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("dataType"))) {
                            SingleDayRecord singleDayRecord2 = new SingleDayRecord();
                            try {
                                singleDayRecord2.setHuid(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                                c(singleDayRecord2, cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("dataType")), cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("value")), cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("date")));
                                singleDayRecord = singleDayRecord2;
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                singleDayRecord = singleDayRecord2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (cursorQueryStorageData == null) {
                        throw th;
                    }
                    try {
                        cursorQueryStorageData.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        throw th;
                    }
                }
            }
            if (cursorQueryStorageData != null) {
                cursorQueryStorageData.close();
            }
            return singleDayRecord;
        } catch (SQLException e) {
            LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", e.getMessage());
            return singleDayRecord;
        }
    }

    private void c(SingleDayRecord singleDayRecord, int i, String str, String str2) {
        switch (i) {
            case 1:
                e(singleDayRecord, str);
                break;
            case 2:
                singleDayRecord.saveBestRunDistance(str);
                break;
            case 3:
                singleDayRecord.saveBestRunPace(str);
                break;
            case 4:
                singleDayRecord.saveBestWalkDistance(str);
                break;
            case 5:
                singleDayRecord.saveBestCycleDistance(str);
                break;
            case 6:
                singleDayRecord.saveBestCycleSpeed(str);
                break;
            case 7:
                singleDayRecord.saveBestRun3KMPace(str);
                break;
            case 8:
                singleDayRecord.saveBestRun5KMPace(str);
                break;
            case 9:
                singleDayRecord.saveBestRun10KMPace(str);
                break;
            case 10:
                singleDayRecord.saveBestRunHMPace(str);
                break;
            case 11:
                singleDayRecord.saveBestRunFMPace(str);
                break;
            case 12:
                e(singleDayRecord, str, str2);
                break;
            case 13:
                c(singleDayRecord, str, str2);
                break;
            case 14:
                b(singleDayRecord, str, str2);
                break;
            default:
                e(singleDayRecord, i, str, str2);
                break;
        }
    }

    private void e(SingleDayRecord singleDayRecord, int i, String str, String str2) {
        switch (i) {
            case 15:
                singleDayRecord.saveBestRopeSingCount(str);
                break;
            case 16:
                singleDayRecord.saveBestRopeContinuousCount(str);
                break;
            case 17:
                singleDayRecord.saveBestRopeSpeed(str);
                break;
            case 18:
                singleDayRecord.saveBestRopeDuration(str);
                break;
            case 19:
                singleDayRecord.setNpeBestResult(str);
                break;
        }
    }

    private void b(SingleDayRecord singleDayRecord, String str, String str2) {
        singleDayRecord.setMatchSpeedDate(ote.a(str2));
        singleDayRecord.saveMatchSpeed((int) ote.d(str));
    }

    private void c(SingleDayRecord singleDayRecord, String str, String str2) {
        singleDayRecord.setDistanceDate(ote.a(str2));
        singleDayRecord.saveDistance(ote.d(str));
    }

    private void e(SingleDayRecord singleDayRecord, String str, String str2) {
        singleDayRecord.setStepsDate(ote.a(str2));
        singleDayRecord.setSteps((int) ote.d(str));
    }

    private void e(SingleDayRecord singleDayRecord, String str) {
        singleDayRecord.saveBestStepDay(str);
        ozp ozpVarH = paw.h(str);
        if (ozpVarH == null || Utils.o()) {
            return;
        }
        singleDayRecord.setSteps(ozpVarH.d());
        singleDayRecord.setStepsDate(ozpVarH.a());
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public long insert(osf osfVar) {
        if (osfVar != null) {
            SingleDayRecord singleDayRecord = osfVar instanceof SingleDayRecord ? (SingleDayRecord) osfVar : null;
            if (singleDayRecord != null) {
                osf osfVarE = e(singleDayRecord.getHuid());
                if (osfVarE != null) {
                    return d(osfVar, osfVarE);
                }
                long jA = a(singleDayRecord, 12, singleDayRecord.getSteps(), singleDayRecord.getStepsDate());
                long jA2 = a(singleDayRecord, 13, singleDayRecord.acquireDistance(), singleDayRecord.getDistanceDate());
                long jA3 = a(singleDayRecord, 14, singleDayRecord.acquireMatchSpeed(), singleDayRecord.getMatchSpeedDate());
                long jD = d(singleDayRecord, 1, singleDayRecord.acquireBestStepDay());
                long jD2 = d(singleDayRecord, 2, singleDayRecord.acquireBestRunDistance());
                long jD3 = d(singleDayRecord, 3, singleDayRecord.acquireBestRunPace());
                long jD4 = d(singleDayRecord, 4, singleDayRecord.acquireBestWalkDistance());
                long jD5 = d(singleDayRecord, 5, singleDayRecord.acquireBestCycleDistance());
                long jD6 = d(singleDayRecord, 6, singleDayRecord.acquireBestCycleSpeed());
                long jD7 = d(singleDayRecord, 7, singleDayRecord.acquireBestRun3KMPace());
                long jD8 = d(singleDayRecord, 8, singleDayRecord.acquireBestRun5KMPace());
                long jD9 = d(singleDayRecord, 9, singleDayRecord.acquireBestRun10KMPace());
                long jD10 = d(singleDayRecord, 10, singleDayRecord.acquireBestRunHMPace());
                long jD11 = d(singleDayRecord, 11, singleDayRecord.acquireBestRunFMPace());
                return (jA - 1) + jA2 + jA3 + jD + jD2 + jD3 + jD4 + jD5 + jD6 + jD7 + jD8 + jD9 + jD10 + jD11 + d(singleDayRecord, 15, singleDayRecord.acquireBestRopeSingCount()) + d(singleDayRecord, 16, singleDayRecord.acquireBestRopeContinuousCount()) + d(singleDayRecord, 17, singleDayRecord.acquireBestRopeSpeed()) + d(singleDayRecord, 18, singleDayRecord.acquireBestRopeDuration());
            }
        }
        return -1L;
    }

    private long d(SingleDayRecord singleDayRecord, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", singleDayRecord.getHuid());
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", str);
        contentValues.put("date", "");
        long jInsertStorageData = otd.c(this.f22016a).insertStorageData("single_day_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "insertSingle result=", Long.valueOf(jInsertStorageData), " dataType ", Integer.valueOf(i), " value ", str);
        return jInsertStorageData;
    }

    private long a(SingleDayRecord singleDayRecord, int i, double d, long j) {
        if (b(singleDayRecord, j) == -1) {
            LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "insert Column check not pass");
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", singleDayRecord.getHuid());
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("date", Long.valueOf(j));
        long jInsertStorageData = otd.c(this.f22016a).insertStorageData("single_day_record", 1, contentValues);
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "insertSingle insertSingleRecordResult=", Long.valueOf(jInsertStorageData), " dataType ", Integer.valueOf(i), " value ", Double.valueOf(d));
        return jInsertStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int delete(osf osfVar) {
        if (osfVar == null) {
            return -1;
        }
        SingleDayRecord singleDayRecord = osfVar instanceof SingleDayRecord ? (SingleDayRecord) osfVar : null;
        if (singleDayRecord == null) {
            return -1;
        }
        String[] strArr = {ote.e(singleDayRecord.getHuid())};
        LogUtil.d("PLGACHIEVE_SingleDayRecordDBMgr", "delete selection=", "huid=?");
        int iDeleteStorageData = otd.c(this.f22016a).deleteStorageData("single_day_record", 1, "huid=?", strArr);
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "delete deleteSingleRecordResult=", Integer.valueOf(iDeleteStorageData));
        return iDeleteStorageData;
    }

    @Override // com.huawei.pluginachievement.manager.db.IAchieveDBMgr
    public int update(osf osfVar) {
        osf osfVarE;
        if (osfVar == null) {
            return -1;
        }
        SingleDayRecord singleDayRecord = osfVar instanceof SingleDayRecord ? (SingleDayRecord) osfVar : null;
        if (singleDayRecord == null || (osfVarE = e(singleDayRecord.getHuid())) == null) {
            return -1;
        }
        return d(osfVar, osfVarE);
    }

    private int e(SingleDayRecord singleDayRecord, int i, double d, long j) {
        if (b(singleDayRecord, j) == -1) {
            LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "update Column check not pass");
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", singleDayRecord.getHuid());
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", Double.valueOf(d));
        contentValues.put("date", Long.valueOf(j));
        int iUpdateStorageData = otd.c(this.f22016a).updateStorageData("single_day_record", 1, contentValues, "huid=? and dataType=?", new String[]{ote.e(singleDayRecord.getHuid()), ote.e(Integer.valueOf(i))});
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "updateSingle result=", Integer.valueOf(iUpdateStorageData), " dataType ", Integer.valueOf(i), " value ", Double.valueOf(d), " date ", Long.valueOf(j));
        if (iUpdateStorageData == 0) {
            c(singleDayRecord, i, d, j);
        }
        return iUpdateStorageData;
    }

    private void c(SingleDayRecord singleDayRecord, int i, double d, long j) {
        if (a(singleDayRecord.getHuid(), i) == null) {
            LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", "dealUpdateFailItem no record！dataType ", Integer.valueOf(i));
            a(singleDayRecord, i, d, j);
        }
    }

    private void a(SingleDayRecord singleDayRecord, int i, String str) {
        if (a(singleDayRecord.getHuid(), i) == null) {
            LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", "dealUpdateFailItem no record！dataType ", Integer.valueOf(i));
            d(singleDayRecord, i, str);
        }
    }

    private int d(osf osfVar, osf osfVar2) {
        if (osfVar == null) {
            return -1;
        }
        SingleDayRecord singleDayRecord = osfVar instanceof SingleDayRecord ? (SingleDayRecord) osfVar : null;
        if (singleDayRecord == null) {
            return -1;
        }
        SingleDayRecord singleDayRecord2 = osfVar2 instanceof SingleDayRecord ? (SingleDayRecord) osfVar2 : null;
        if (singleDayRecord2 == null) {
            return -1;
        }
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "myAchieveDb oldSingleRecord ", singleDayRecord2.toString());
        return b(singleDayRecord, singleDayRecord2);
    }

    private int b(SingleDayRecord singleDayRecord, SingleDayRecord singleDayRecord2) {
        int iA = a(singleDayRecord, singleDayRecord2, 12);
        int iA2 = a(singleDayRecord, singleDayRecord2, 13);
        int iA3 = a(singleDayRecord, singleDayRecord2, 14);
        int iA4 = a(singleDayRecord, singleDayRecord2, 1);
        int iA5 = a(singleDayRecord, singleDayRecord2, 19);
        int iB = b(singleDayRecord, 2, singleDayRecord2.acquireBestRunDistance(), singleDayRecord.acquireBestRunDistance(), 3);
        int iB2 = b(singleDayRecord, 3, singleDayRecord2.acquireBestRunPace(), singleDayRecord.acquireBestRunPace(), 4);
        int iB3 = b(singleDayRecord, 4, singleDayRecord2.acquireBestWalkDistance(), singleDayRecord.acquireBestWalkDistance(), 1);
        int iB4 = b(singleDayRecord, 5, singleDayRecord2.acquireBestCycleDistance(), singleDayRecord.acquireBestCycleDistance(), 10);
        int iB5 = b(singleDayRecord, 6, singleDayRecord2.acquireBestCycleSpeed(), singleDayRecord.acquireBestCycleSpeed(), 11);
        int iB6 = b(singleDayRecord, 7, singleDayRecord2.acquireBestRun3KMPace(), singleDayRecord.acquireBestRun3KMPace(), 5);
        int iB7 = b(singleDayRecord, 8, singleDayRecord2.acquireBestRun5KMPace(), singleDayRecord.acquireBestRun5KMPace(), 6);
        int iB8 = b(singleDayRecord, 9, singleDayRecord2.acquireBestRun10KMPace(), singleDayRecord.acquireBestRun10KMPace(), 7);
        int iB9 = b(singleDayRecord, 10, singleDayRecord2.acquireBestRunHMPace(), singleDayRecord.acquireBestRunHMPace(), 8);
        int iB10 = b(singleDayRecord, 11, singleDayRecord2.acquireBestRunFMPace(), singleDayRecord.acquireBestRunFMPace(), 9);
        int iB11 = b(singleDayRecord, 15, singleDayRecord2.acquireBestRopeSingCount(), singleDayRecord.acquireBestRopeSingCount(), 12);
        int iB12 = b(singleDayRecord, 16, singleDayRecord2.acquireBestRopeContinuousCount(), singleDayRecord.acquireBestRopeContinuousCount(), 13);
        return (iA - 1) + iA2 + iA3 + iA4 + iA5 + iB + iB2 + iB3 + iB4 + iB5 + iB6 + iB7 + iB8 + iB9 + iB10 + iB11 + iB12 + b(singleDayRecord, 17, singleDayRecord2.acquireBestRopeSpeed(), singleDayRecord.acquireBestRopeSpeed(), 14) + b(singleDayRecord, 18, singleDayRecord2.acquireBestRopeDuration(), singleDayRecord.acquireBestRopeDuration(), 15);
    }

    private int a(SingleDayRecord singleDayRecord, SingleDayRecord singleDayRecord2, int i) {
        if (i == 1) {
            if (singleDayRecord.acquireBestStepDay() == null || singleDayRecord.acquireBestStepDay().equals(singleDayRecord2.acquireBestStepDay())) {
                return 0;
            }
            return e(singleDayRecord, 1, singleDayRecord.acquireBestStepDay());
        }
        if (i != 19) {
            switch (i) {
                case 12:
                    if (singleDayRecord.getSteps() == singleDayRecord2.getSteps()) {
                        return 0;
                    }
                    return e(singleDayRecord, i, singleDayRecord.getSteps(), singleDayRecord.getStepsDate());
                case 13:
                    if (paw.a(singleDayRecord.acquireDistance(), singleDayRecord2.acquireDistance()) == 0 && singleDayRecord.getDistanceDate() == singleDayRecord2.getDistanceDate()) {
                        return 0;
                    }
                    return e(singleDayRecord, i, singleDayRecord.acquireDistance(), singleDayRecord.getDistanceDate());
                case 14:
                    if (singleDayRecord.acquireMatchSpeed() == singleDayRecord2.acquireMatchSpeed() && singleDayRecord.getMatchSpeedDate() == singleDayRecord2.getMatchSpeedDate()) {
                        return 0;
                    }
                    return e(singleDayRecord, i, singleDayRecord.acquireMatchSpeed(), singleDayRecord.getMatchSpeedDate());
                default:
                    LogUtil.j("PLGACHIEVE_SingleDayRecordDBMgr", "updateRecord no branch.");
                    return 0;
            }
        }
        if (singleDayRecord.getNpeBestResult() == null || singleDayRecord.getNpeBestResult().equals(singleDayRecord2.getNpeBestResult())) {
            return 0;
        }
        return e(singleDayRecord, i, singleDayRecord.getNpeBestResult());
    }

    private int e(SingleDayRecord singleDayRecord, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", singleDayRecord.getHuid());
        contentValues.put("dataType", Integer.valueOf(i));
        contentValues.put("value", str);
        contentValues.put("date", "");
        int iUpdateStorageData = otd.c(this.f22016a).updateStorageData("single_day_record", 1, contentValues, "huid=? and dataType=?", new String[]{ote.e(singleDayRecord.getHuid()), ote.e(Integer.valueOf(i))});
        LogUtil.a("PLGACHIEVE_SingleDayRecordDBMgr", "updateSingle result=", Integer.valueOf(iUpdateStorageData), " dataType ", Integer.valueOf(i), " value ", str);
        if (iUpdateStorageData == 0) {
            a(singleDayRecord, i, str);
        }
        return iUpdateStorageData;
    }

    private int b(SingleDayRecord singleDayRecord, long j) {
        return (TextUtils.isEmpty(singleDayRecord.getHuid()) || singleDayRecord.acquireDataType() == -1 || j == -1 || singleDayRecord.getSteps() == -1 || singleDayRecord.acquireDistance() == -1.0d || singleDayRecord.acquireMatchSpeed() == -1) ? -1 : 0;
    }

    private int b(SingleDayRecord singleDayRecord, int i, String str, String str2, int i2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (!TextUtils.isEmpty(str) && str.equals(str2)) {
            return 0;
        }
        if (singleDayRecord.isDelete()) {
            return e(singleDayRecord, i, str2);
        }
        return e(singleDayRecord, i, ote.d(str, str2, i2));
    }
}
