package defpackage;

import android.text.TextUtils;
import com.huawei.health.suggestion.ui.fitness.helper.FitnessRunAudioScenarioId;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtils;
import health.compact.a.UnitUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class idp extends ido {
    private final Map<String, FitnessRunAudioScenarioId> d;

    public idp(String str, String str2, String str3) {
        super(str, str2, str3);
        this.d = new HashMap();
        pqj.b().init(pqp.c(pqj.e(), pqj.b().d(pqj.e()), "Sport", BaseApplication.getContext().getResources().getConfiguration().locale));
        d();
    }

    private void d() {
        b("G001", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("G012", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("G013", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("G014", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("G015", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("RD006", FitnessRunAudioScenarioId.SLOW_WALKING);
        b("G002", FitnessRunAudioScenarioId.FAST_WALK);
        b("G016", FitnessRunAudioScenarioId.FAST_WALK);
        b("G017", FitnessRunAudioScenarioId.FAST_WALK);
        b("G018", FitnessRunAudioScenarioId.FAST_WALK);
        b("G019", FitnessRunAudioScenarioId.FAST_WALK);
        b("G020", FitnessRunAudioScenarioId.FAST_WALK);
        b("G021", FitnessRunAudioScenarioId.FAST_WALK);
        b("RD007", FitnessRunAudioScenarioId.FAST_WALK);
        b("G003", FitnessRunAudioScenarioId.JOGGING);
        b("G006", FitnessRunAudioScenarioId.JOGGING);
        b("G011", FitnessRunAudioScenarioId.JOGGING);
        b("G022", FitnessRunAudioScenarioId.JOGGING);
        b("RD008", FitnessRunAudioScenarioId.JOGGING);
        b("G004", FitnessRunAudioScenarioId.MODERATE_RUNNING);
        b("G023", FitnessRunAudioScenarioId.MODERATE_RUNNING);
        b("RD009", FitnessRunAudioScenarioId.MODERATE_RUNNING);
        b("RD001", FitnessRunAudioScenarioId.WARM_UP);
        b("RD002", FitnessRunAudioScenarioId.RUNNING);
        b("RD003", FitnessRunAudioScenarioId.WALKING);
        b("RD004", FitnessRunAudioScenarioId.HAVE_A_REST);
        b("RD005", FitnessRunAudioScenarioId.RELAX);
        b("RD010", FitnessRunAudioScenarioId.FAST_RUNNING);
        b("RD011", FitnessRunAudioScenarioId.SLOW_WALK);
        b("RD012", FitnessRunAudioScenarioId.SPRINT);
        b("RD013", FitnessRunAudioScenarioId.BASIC_AEROBIC_RUN);
        b("RD014", FitnessRunAudioScenarioId.ADVANCED_AEROBIC_RUN);
        b("RD015", FitnessRunAudioScenarioId.TEMPO_RUN);
        b("RD016", FitnessRunAudioScenarioId.ANAEROBIC_ENDURANCE_RUN);
        b("RD017", FitnessRunAudioScenarioId.HIGH_INTENSITY_INTERVAL_RUN);
        b("RD018", FitnessRunAudioScenarioId.SPRINT_RUN);
    }

    private void b(String str, FitnessRunAudioScenarioId fitnessRunAudioScenarioId) {
        this.d.put(str, fitnessRunAudioScenarioId);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getSpeedLowerLimit() {
        return d(FitnessRunAudioScenarioId.SPEED_SLOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getSpeedUpperLimit() {
        return d(FitnessRunAudioScenarioId.SPEED_FAST_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getRelativeLowerLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_LOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getRelativeUpperLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_HIGH_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getAbsoluteLowerLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_LOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getAbsoluteUpperLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_HIGH_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getHeartRateDeviceError() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_DEVICE_CONNECTION_EXCEPTION);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getHeartRateDeviceConnected() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_DEVICE_CONNECTED);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalHeartRate() {
        return d(FitnessRunAudioScenarioId.CURRENT_HEART_RATE_IN_TARGET_RANGE);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalPace() {
        return d(FitnessRunAudioScenarioId.CURRENT_PACE_IN_TARGET_RANGE);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalSpeed() {
        return d(FitnessRunAudioScenarioId.CURRENT_SPEED_IN_TARGET_RANGE);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalStepRate() {
        return d(FitnessRunAudioScenarioId.CURRENT_STEP_FREQUENCY_IN_TARGET_RANGE);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRLowerLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_LOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRUpperLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_HIGH_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRIntervalLowerLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_LOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRIntervalUpperLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_HIGH_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getMAF180LowerLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_LOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getMAF180UpperLimit() {
        return d(FitnessRunAudioScenarioId.HEART_RATE_HIGH_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getPaceZoneLowerLimit() {
        return d(FitnessRunAudioScenarioId.PACE_SLOW_SPEED_UP);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getPaceZoneUpperLimit() {
        return d(FitnessRunAudioScenarioId.PACE_FAST_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateUpperLimit() {
        return d(FitnessRunAudioScenarioId.STEP_FREQUENCY_FAST_SLOW_DOWN);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateLowerLimit() {
        return d(FitnessRunAudioScenarioId.STEP_FREQUENCY_SLOW_HURRY);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeNextAction(String str, int i, int i2, TargetConfig targetConfig) {
        return c(str, i, i2, FitnessRunAudioScenarioId.NEXT_ACTION_RUN, targetConfig);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeLastAction(String str, int i, int i2, TargetConfig targetConfig) {
        return c(str, i, i2, FitnessRunAudioScenarioId.LAST_ACTION_RUN, targetConfig);
    }

    @Override // defpackage.ido, com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeFirstAction(String str, int i, int i2, TargetConfig targetConfig) {
        return c(str, i, i2, FitnessRunAudioScenarioId.FIRST_ACTION_RUN, targetConfig);
    }

    private Object c(String str, int i, int i2, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, TargetConfig targetConfig) {
        String strB;
        if (TextUtils.isEmpty(str) || targetConfig == null) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getChangeAction() nameUrl or intensityConfig is null");
            return null;
        }
        LogUtil.a("Suggestion_MultilingualRunContentConstructor", "getChangeAction===", "value = ", Integer.valueOf(i), "nameUrl = ", str, "measurementType = ", Integer.valueOf(i2), "firstAudio = ", fitnessRunAudioScenarioId);
        if (str.startsWith("http")) {
            strB = a(str);
        } else if (pqj.b().b(BaseApplication.getContext()) && this.d.containsKey(str)) {
            strB = d(this.d.get(str));
        } else {
            strB = b(str);
        }
        String str2 = strB;
        if (!new File(str2).exists()) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getChangeAction() is no exist audiosFilePath:", str2);
            return null;
        }
        if (i2 == 0) {
            return c(i, fitnessRunAudioScenarioId, str2, targetConfig);
        }
        if (i2 == 1) {
            return d(i, fitnessRunAudioScenarioId, str2, targetConfig);
        }
        if (i2 == 3) {
            return e(i, fitnessRunAudioScenarioId, str2, targetConfig);
        }
        if (i2 == 4 || i2 == 5) {
            return c(i, fitnessRunAudioScenarioId, str2, targetConfig, i2);
        }
        if (i2 == 255) {
            a(fitnessRunAudioScenarioId, str2, targetConfig);
            return null;
        }
        LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getChangeAction() measurementType:", Integer.valueOf(i2));
        return null;
    }

    private String[] d(int i, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, String str, TargetConfig targetConfig) {
        String[] strArrC = c(str, fitnessRunAudioScenarioId, i, FitnessRunAudioScenarioId.FIRST_ACTION_RUN_SEC);
        return b(targetConfig) ? c(strArrC, targetConfig) : strArrC;
    }

    private String[] c(int i, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, String str, TargetConfig targetConfig) {
        String[] strArrB;
        if (i % 1000 == 0) {
            strArrB = c(str, fitnessRunAudioScenarioId, i / 1000, FitnessRunAudioScenarioId.FIRST_ACTION_RUN_KM);
        } else {
            strArrB = b(str, fitnessRunAudioScenarioId, UnitUtil.d((((double) i) * 1.0d) / 1000.0d, 2), FitnessRunAudioScenarioId.FIRST_ACTION_RUN_KM);
        }
        return b(targetConfig) ? c(strArrB, targetConfig) : strArrB;
    }

    private String[] e(int i, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, String str, TargetConfig targetConfig) {
        String[] strArrC = c(str, fitnessRunAudioScenarioId, i, FitnessRunAudioScenarioId.FIRST_ACTION_RUN_KCAL);
        return b(targetConfig) ? c(strArrC, targetConfig) : strArrC;
    }

    private String[] c(int i, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, String str, TargetConfig targetConfig, int i2) {
        List<String> scenarioAudioPaths;
        pqk pqkVar = new pqk();
        pqkVar.a(str);
        List<String> scenarioAudioPaths2 = pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar);
        pqk pqkVar2 = new pqk();
        pqkVar2.e(Integer.valueOf(i));
        if (i2 == 4) {
            scenarioAudioPaths = pqj.b().getScenarioAudioPaths(FitnessRunAudioScenarioId.FIRST_ACTION_RUN_HEART_RATE_UP.getId(), pqkVar2);
        } else {
            scenarioAudioPaths = pqj.b().getScenarioAudioPaths(FitnessRunAudioScenarioId.FIRST_ACTION_RUN_HEART_RATE_LOW.getId(), pqkVar2);
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(scenarioAudioPaths2);
        arrayList.addAll(scenarioAudioPaths);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    private String[] a(FitnessRunAudioScenarioId fitnessRunAudioScenarioId, String str, TargetConfig targetConfig) {
        pqk pqkVar = new pqk();
        pqkVar.a(str);
        String[] strArr = (String[]) pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar).toArray(new String[0]);
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    private String[] c(String str, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, int i, FitnessRunAudioScenarioId fitnessRunAudioScenarioId2) {
        pqk pqkVar = new pqk();
        pqkVar.a(str);
        List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar);
        pqk pqkVar2 = new pqk();
        pqkVar2.e(Integer.valueOf(i));
        scenarioAudioPaths.addAll(pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId2.getId(), pqkVar2));
        return (String[]) scenarioAudioPaths.toArray(new String[0]);
    }

    private String[] b(String str, FitnessRunAudioScenarioId fitnessRunAudioScenarioId, double d, FitnessRunAudioScenarioId fitnessRunAudioScenarioId2) {
        pqk pqkVar = new pqk();
        pqkVar.a(str);
        List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar);
        pqk pqkVar2 = new pqk();
        pqkVar2.d(Double.valueOf(d));
        scenarioAudioPaths.addAll(pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId2.getId(), pqkVar2));
        return (String[]) scenarioAudioPaths.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    private String[] c(String[] strArr, TargetConfig targetConfig) {
        String[] strArrC = null;
        if (strArr == null) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "combineAudios nextAudios == null");
            return null;
        }
        int iJ = CommonUtils.j(targetConfig.getId());
        if (iJ == 0 || iJ == 1 || iJ == 2 || iJ == 4 || iJ == 7 || iJ == 8) {
            strArrC = c(targetConfig);
        } else {
            switch (iJ) {
                case 13:
                case 15:
                    strArrC = d(targetConfig);
                    break;
                case 14:
                    if (hoy.c().b()) {
                        strArrC = c(targetConfig);
                    } else {
                        strArrC = d(targetConfig);
                    }
                    break;
                case 16:
                    strArrC = e(targetConfig);
                    break;
                case 17:
                    strArrC = c(targetConfig);
                    break;
                default:
                    LogUtil.j("Suggestion_MultilingualRunContentConstructor", "combineAudios() other intensityConfig.getId():", targetConfig.getId());
                    break;
            }
        }
        if (strArrC == null) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "combineAudios() intensityAudio == null");
            return strArr;
        }
        int length = strArr.length + strArrC.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            if (i < strArr.length) {
                strArr2[i] = strArr[i];
            } else {
                strArr2[i] = strArrC[strArrC.length - (length - i)];
            }
        }
        return strArr2;
    }

    private String[] d(TargetConfig targetConfig) {
        int iB;
        int iB2;
        LogUtil.a("Suggestion_MultilingualRunContentConstructor", "getPaceAudioFilePath() intensityConfig.getId()", targetConfig.getId());
        int valueL = (int) targetConfig.getValueL();
        int valueH = (int) targetConfig.getValueH();
        if (CommonUtils.j(targetConfig.getId()) == 15) {
            iB = valueL / 1000;
            iB2 = valueH / 1000;
        } else {
            gzf gzfVarD = hoy.c().d();
            if (gzfVarD != null && gzfVarD.g() != 0) {
                iB = gzfVarD.b(valueL, true);
                iB2 = gzfVarD.b(valueH, false);
                LogUtil.a("Suggestion_MultilingualRunContentConstructor", "getPaceAudioFilePath() valueLower:", Integer.valueOf(iB), "and valueUpper:", Integer.valueOf(iB2));
            } else {
                LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getPaceAudioFilePath() paceZoneConfig == null");
                return null;
            }
        }
        List<String> listA = a(iB, iB2, FitnessRunAudioScenarioId.FIRST_ACTION_RUN_PACING_SCOPE);
        if (njy.e(listA)) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getPaceAudioFilePath() scenarioAudioPaths is null");
            return null;
        }
        return (String[]) listA.toArray(new String[0]);
    }

    private String[] c(TargetConfig targetConfig) {
        FitnessRunAudioScenarioId fitnessRunAudioScenarioId;
        LogUtil.a("Suggestion_MultilingualRunContentConstructor", "getZoneAudioFilePath() intensityConfig.getId()", targetConfig.getId());
        int iC = c(targetConfig, (int) targetConfig.getValueL(), true);
        int iC2 = c(targetConfig, (int) targetConfig.getValueH(), false);
        if (iC <= 0 || iC2 <= 0) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getZoneAudioFilePath() valueLower <= 0 || valueUpper <= 0");
            return null;
        }
        if (CommonUtils.j(targetConfig.getId()) == 0) {
            fitnessRunAudioScenarioId = FitnessRunAudioScenarioId.FIRST_ACTION_RUN_SPEED_SCOPE;
        } else {
            fitnessRunAudioScenarioId = FitnessRunAudioScenarioId.FIRST_ACTION_RUN_HEART_RATE_SCOPE;
        }
        List<String> listA = a(iC, iC2, fitnessRunAudioScenarioId);
        if (njy.e(listA)) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getZoneAudioFilePath() scenarioAudioPaths is null");
            return null;
        }
        return (String[]) listA.toArray(new String[0]);
    }

    private String[] e(TargetConfig targetConfig) {
        LogUtil.a("Suggestion_MultilingualRunContentConstructor", "getZoneAudioFilePath() intensityConfig.getId()", targetConfig.getId());
        int valueL = (int) targetConfig.getValueL();
        int valueH = (int) targetConfig.getValueH();
        if (valueL <= 0 || valueH <= 0) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getStepRateAudioFilePath() valueLower <= 0 || valueUpper <= 0");
            return null;
        }
        List<String> listA = a(valueL, valueH, FitnessRunAudioScenarioId.FIRST_ACTION_RUN_STEP_FREQUENCY_SCOPE);
        if (njy.e(listA)) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getStepRateAudioFilePath() scenarioAudioPaths is null");
            return null;
        }
        return (String[]) listA.toArray(new String[0]);
    }

    private List<String> a(int i, int i2, FitnessRunAudioScenarioId fitnessRunAudioScenarioId) {
        pqk pqkVar = new pqk();
        pqkVar.e(Integer.valueOf(i));
        pqkVar.e(Integer.valueOf(i2));
        return pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), pqkVar);
    }

    private String d(FitnessRunAudioScenarioId fitnessRunAudioScenarioId) {
        List<String> scenarioAudioPaths = pqj.b().getScenarioAudioPaths(fitnessRunAudioScenarioId.getId(), new pqk());
        if (njy.e(scenarioAudioPaths)) {
            LogUtil.j("Suggestion_MultilingualRunContentConstructor", "getSingleVoicePath() scenarioAudioPaths is null");
            return "";
        }
        return scenarioAudioPaths.get(0);
    }
}
