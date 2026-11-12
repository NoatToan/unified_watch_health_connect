package defpackage;

import androidx.media3.transformer.ExportException;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.pluginachievement.report.bean.AnnualReportCycle;
import com.huawei.pluginachievement.report.bean.AnnualReportFitness;
import com.huawei.pluginachievement.report.bean.AnnualReportInital;
import com.huawei.pluginachievement.report.bean.AnnualReportMarathon;
import com.huawei.pluginachievement.report.bean.AnnualReportReward;
import com.huawei.pluginachievement.report.bean.AnnualReportRun;
import com.huawei.pluginachievement.report.bean.AnnualReportSleep;
import com.huawei.pluginachievement.report.bean.AnnualReportStep;
import com.huawei.pluginachievement.report.bean.AnnualReportSumary;
import com.huawei.pluginachievement.report.bean.AnnualReportWeight;
import com.huawei.pluginachievement.report.bean.MarathonGradleDetail;
import com.huawei.pluginachievement.report.constant.EnumAnnual;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oww {
    public static int b(long j, AnnualReportStep annualReportStep, AnnualReportInital annualReportInital) {
        if (annualReportStep != null) {
            if (annualReportStep.acquireTotalStep() == 0) {
                return EnumAnnual.DATA_SYNC_FAIL.getValue();
            }
            return EnumAnnual.DATA_SUCCESS.getValue();
        }
        if (annualReportInital == null) {
            return EnumAnnual.DATA_NOT_ENOUGH.getValue();
        }
        long jAcquireFirstUseDate = annualReportInital.acquireFirstUseDate();
        if (jAcquireFirstUseDate < j && jAcquireFirstUseDate != 0) {
            return EnumAnnual.DATA_SYNC_FAIL.getValue();
        }
        return EnumAnnual.DATA_NOT_ENOUGH.getValue();
    }

    public static boolean a(osf osfVar, otl otlVar) {
        if (otlVar == null || osfVar == null) {
            LogUtil.a("PLGACHIEVE_AnnualDBManager", "insertData null");
            return false;
        }
        return otlVar.d(osfVar);
    }

    public static osf c(int i, String str, int i2) {
        osf osfVar = new osf(19);
        osfVar.setYear(i);
        osfVar.setType(str);
        osfVar.setKey(i2);
        return osfVar;
    }

    public static AnnualReportInital e(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportInital();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_INITAL.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (njy.e(listD)) {
            return null;
        }
        AnnualReportInital annualReportInital = new AnnualReportInital();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                switch (osfVar.getKey()) {
                    case 9001:
                        annualReportInital.saveFirstUseDate(oxi.d(osfVar.getValues()));
                        break;
                    case 9002:
                        annualReportInital.saveTotalDays(oxi.a(osfVar.getValues()));
                        break;
                    case 9003:
                        annualReportInital.saveTotalSportDistance(oxi.a(osfVar.getValues()));
                        break;
                }
            }
        }
        return annualReportInital;
    }

    public static AnnualReportRun j(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportRun();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_RUN.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (njy.e(listD)) {
            return null;
        }
        AnnualReportRun annualReportRun = new AnnualReportRun();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                int key = osfVar.getKey();
                if (key != 9007) {
                    switch (key) {
                        case 2001:
                            annualReportRun.saveTotalDistance(oxi.a(osfVar.getValues()));
                            break;
                        case 2002:
                            annualReportRun.saveNumberOfTimes(oxi.a(osfVar.getValues()));
                            break;
                        case 2003:
                            annualReportRun.saveMaxDistance(oxi.a(osfVar.getValues()));
                            break;
                        case 2004:
                            annualReportRun.saveMaxDistanceDay(oxi.d(osfVar.getValues()));
                            break;
                        case 2005:
                            annualReportRun.saveTimeOfDay(oxi.a(osfVar.getValues()));
                            break;
                        case 2006:
                            annualReportRun.saveDescription(oxi.a(osfVar.getValues()));
                            break;
                    }
                } else {
                    annualReportRun.saveYearSumDistances(osfVar.getValues());
                }
            }
        }
        return annualReportRun;
    }

    public static AnnualReportCycle a(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportCycle();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_CYCLE.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (njy.e(listD)) {
            return null;
        }
        AnnualReportCycle annualReportCycle = new AnnualReportCycle();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                switch (osfVar.getKey()) {
                    case 1001:
                        annualReportCycle.saveTotalDistance(oxi.a(osfVar.getValues()));
                        break;
                    case 1002:
                        annualReportCycle.saveNumberOfTimes(oxi.a(osfVar.getValues()));
                        break;
                    case 1003:
                        annualReportCycle.saveMaxDistance(oxi.a(osfVar.getValues()));
                        break;
                    case 1004:
                        annualReportCycle.saveMaxDistanceDay(oxi.d(osfVar.getValues()));
                        break;
                }
            }
        }
        return annualReportCycle;
    }

    public static AnnualReportStep f(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportStep();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_STEP.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (njy.e(listD)) {
            return null;
        }
        AnnualReportStep annualReportStep = new AnnualReportStep();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                int key = osfVar.getKey();
                if (key != 9006) {
                    switch (key) {
                        case 3001:
                            annualReportStep.saveTotalStep(oxi.a(osfVar.getValues()));
                            break;
                        case 3002:
                            annualReportStep.saveTotalStepDistance(oxi.a(osfVar.getValues()));
                            break;
                        case 3003:
                            annualReportStep.saveMaxStep(oxi.a(osfVar.getValues()));
                            break;
                        case 3004:
                            annualReportStep.saveMaxStepDay(osfVar.getValues());
                            break;
                        case IEventListener.EVENT_ID_DEVICE_DISCONN_SUCC /* 3005 */:
                            annualReportStep.saveMaxWalkMonth(oxi.a(osfVar.getValues()));
                            break;
                    }
                } else {
                    annualReportStep.saveYearAvgSteps(osfVar.getValues());
                }
            }
        }
        return annualReportStep;
    }

    public static AnnualReportFitness d(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportFitness();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_FITNESS.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        AnnualReportFitness annualReportFitness = new AnnualReportFitness();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                switch (osfVar.getKey()) {
                    case 4001:
                        annualReportFitness.saveTotalDuration(oxi.a(osfVar.getValues()));
                        break;
                    case 4002:
                        annualReportFitness.saveNumberOfTimes(oxi.a(osfVar.getValues()));
                        break;
                    case 4003:
                        annualReportFitness.saveMaxDuration(oxi.a(osfVar.getValues()));
                        break;
                    case 4004:
                        annualReportFitness.saveMaxDurationDay(oxi.d(osfVar.getValues()));
                        break;
                    case 4005:
                        annualReportFitness.saveDescription(oxi.a(osfVar.getValues()));
                        break;
                }
            }
        }
        return annualReportFitness;
    }

    public static AnnualReportSleep i(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportSleep();
        }
        HashMap map = new HashMap(2);
        map.put("type", EnumAnnualType.REPORT_SLEEP.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        AnnualReportSleep annualReportSleep = new AnnualReportSleep();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                switch (osfVar.getKey()) {
                    case 8001:
                        annualReportSleep.saveSleepScore(oxi.e(osfVar.getValues()));
                        break;
                    case 8002:
                        annualReportSleep.saveSleepDuration(oxi.a(osfVar.getValues()));
                        break;
                    case MainLoginCallBack.MSG_HMS_VERSION_ERROR /* 8003 */:
                        annualReportSleep.setBreLevel(oxi.a(osfVar.getValues()));
                        break;
                    case MainLoginCallBack.MSG_HWID_ACCOUNT_NOT_LOGIN /* 8004 */:
                        annualReportSleep.saveFallAsleepTime(osfVar.getValues());
                        break;
                    case MainLoginCallBack.MSG_NO_NETWORK /* 8005 */:
                        annualReportSleep.saveWakeupTime(osfVar.getValues());
                        break;
                    case MainLoginCallBack.MSG_HWID_STOPED /* 8006 */:
                        annualReportSleep.saveAnimalImage(oxi.a(osfVar.getValues()));
                        break;
                    case MainLoginCallBack.MSG_START_APK_SERVICE_ERROR /* 8007 */:
                        annualReportSleep.setSleepTimes(oxi.a(osfVar.getValues()));
                        break;
                }
            }
        }
        return annualReportSleep;
    }

    public static AnnualReportWeight l(otl otlVar, int i) {
        if (otlVar == null) {
            return new AnnualReportWeight();
        }
        HashMap map = new HashMap(8);
        map.put("type", EnumAnnualType.REPORT_WEIGHT.value());
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        AnnualReportWeight annualReportWeight = new AnnualReportWeight();
        for (osf osfVar : listD) {
            if (osfVar != null) {
                switch (osfVar.getKey()) {
                    case 7001:
                        annualReportWeight.setWeightChange(oxi.e(osfVar.getValues()));
                        break;
                    case ExportException.ERROR_CODE_MUXING_TIMEOUT /* 7002 */:
                        annualReportWeight.setMax(oxi.e(osfVar.getValues()));
                        break;
                    case ExportException.ERROR_CODE_MUXING_APPEND /* 7003 */:
                        annualReportWeight.setMin(oxi.e(osfVar.getValues()));
                        break;
                }
            }
        }
        return annualReportWeight;
    }

    public static AnnualReportMarathon b(otl otlVar, int i) {
        AnnualReportMarathon annualReportMarathon = new AnnualReportMarathon();
        if (otlVar != null) {
            HashMap map = new HashMap(8);
            map.put("type", EnumAnnualType.REPORT_MARATHON.value());
            map.put("year", String.valueOf(i));
            List<osf> listD = otlVar.d(19, map);
            if (listD != null && !listD.isEmpty()) {
                for (osf osfVar : listD) {
                    if (osfVar != null) {
                        int key = osfVar.getKey();
                        if (key == 9004) {
                            annualReportMarathon.setHalfMarathon((MarathonGradleDetail) HiJsonUtil.d(osfVar.getValues(), MarathonGradleDetail.class));
                        } else if (key == 9005) {
                            annualReportMarathon.setFullMarathon((MarathonGradleDetail) HiJsonUtil.d(osfVar.getValues(), MarathonGradleDetail.class));
                        }
                    }
                }
            }
        }
        return annualReportMarathon;
    }

    public static AnnualReportSumary h(otl otlVar, int i) {
        AnnualReportSumary annualReportSumary = new AnnualReportSumary();
        if (otlVar != null) {
            HashMap map = new HashMap(8);
            map.put("type", EnumAnnualType.REPORT_SUMARY.value());
            map.put("year", String.valueOf(i));
            List<osf> listD = otlVar.d(19, map);
            if (listD != null && !listD.isEmpty()) {
                for (osf osfVar : listD) {
                    if (osfVar != null) {
                        switch (osfVar.getKey()) {
                            case 6001:
                                annualReportSumary.saveMedalSum(oxi.a(osfVar.getValues()));
                                break;
                            case 6002:
                                annualReportSumary.saveCurrentLevel(oxi.a(osfVar.getValues()));
                                break;
                            case 6003:
                                annualReportSumary.saveTotalDistance(oxi.a(osfVar.getValues()));
                                break;
                            case 6004:
                                annualReportSumary.saveStepOverGoal(oxi.a(osfVar.getValues()));
                                break;
                            case 6005:
                                annualReportSumary.saveTotalCalorie(oxi.d(osfVar.getValues()));
                                break;
                        }
                    }
                }
            }
        }
        return annualReportSumary;
    }

    public static AnnualReportReward g(otl otlVar, int i) {
        AnnualReportReward annualReportReward = new AnnualReportReward();
        if (otlVar != null) {
            HashMap map = new HashMap(8);
            map.put("type", EnumAnnualType.REPORT_REWARD.value());
            map.put("year", String.valueOf(i));
            List<osf> listD = otlVar.d(19, map);
            if (listD == null || listD.isEmpty()) {
                return null;
            }
            for (osf osfVar : listD) {
                if (osfVar != null && osfVar.getKey() == 5001) {
                    annualReportReward.saveMedalIdList(osfVar.getValues());
                }
            }
        }
        return annualReportReward;
    }

    public static int d(long j, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null) {
            int i = jSONObject.getInt(owf.dv.a());
            ReleaseLogUtil.d("R_PLGACHIEVE_AnnualDBManager", "getReportSyncStatus: totalStep -> " + i);
            if (i == 0) {
                return EnumAnnual.DATA_SYNC_FAIL.getValue();
            }
            return EnumAnnual.DATA_SUCCESS.getValue();
        }
        if (jSONObject2 == null) {
            ReleaseLogUtil.e("R_PLGACHIEVE_AnnualDBManager", "getReportSyncStatus: annualReportInital is null");
            return EnumAnnual.DATA_NOT_ENOUGH.getValue();
        }
        long j2 = jSONObject2.getLong(owf.aj.a());
        ReleaseLogUtil.d("R_PLGACHIEVE_AnnualDBManager", "getReportSyncStatus: date -> " + j2);
        if (j2 < j && j2 != 0) {
            return EnumAnnual.DATA_SYNC_FAIL.getValue();
        }
        return EnumAnnual.DATA_NOT_ENOUGH.getValue();
    }

    public static JSONObject c(otl otlVar, int i) {
        List<String> annualPageByYear = new ows().e(i).getAnnualPageByYear();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : annualPageByYear) {
                jSONObject2.put(str, b(otlVar, i, str));
            }
            int iD = d(oxi.a(i, false), jSONObject2.getJSONObject(EnumAnnualType.REPORT_STEP.value()), jSONObject2.getJSONObject(EnumAnnualType.REPORT_INITAL.value()));
            jSONObject.put("reportData", jSONObject2);
            jSONObject.put("resultCode", iD);
            jSONObject.put("year", i);
            ReleaseLogUtil.d("R_PLGACHIEVE_AnnualDBManager", "getAnnualReport: year -> " + i + ", resultCode -> " + iD);
            return jSONObject;
        } catch (JSONException e) {
            ReleaseLogUtil.a("R_PLGACHIEVE_AnnualDBManager", "getAnnualReport: year -> " + i + ", exception -> " + e.getMessage());
            return jSONObject;
        }
    }

    public static JSONObject b(otl otlVar, int i, String str) {
        HashMap map = new HashMap(8);
        map.put("type", str);
        map.put("year", String.valueOf(i));
        List<osf> listD = otlVar.d(19, map);
        if (njy.e(listD)) {
            return null;
        }
        return a(listD);
    }

    private static JSONObject a(List<osf> list) {
        JSONObject jSONObject = new JSONObject();
        for (osf osfVar : list) {
            owf owfVarC = c(osfVar);
            if (owfVarC != null) {
                try {
                    jSONObject.put(owfVarC.a(), b(owfVarC.d(), osfVar.getValues()));
                } catch (JSONException unused) {
                    LogUtil.e("PLGACHIEVE_AnnualDBManager", "getFieldJSONObject");
                }
            }
        }
        return jSONObject;
    }

    private static owf c(osf osfVar) {
        if (osfVar != null) {
            return owh.e(osfVar.getKey());
        }
        return null;
    }

    private static Object b(int i, String str) {
        if (i == 1) {
            return Integer.valueOf(oxi.a(str));
        }
        if (i == 4) {
            return Long.valueOf(oxi.d(str));
        }
        if (i != 5) {
            return i != 6 ? str : oxi.b(str);
        }
        return Double.valueOf(oxi.e(str));
    }
}
