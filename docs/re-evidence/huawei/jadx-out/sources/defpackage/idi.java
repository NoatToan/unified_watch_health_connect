package defpackage;

import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.TargetConfig;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class idi implements IFitRunVoiceContentConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37512b;
    private String d;

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getSpeedLowerLimit() {
        return b("K013");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getSpeedUpperLimit() {
        return b("K012");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getRelativeLowerLimit() {
        return b("K015");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getRelativeUpperLimit() {
        return b("K014");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getAbsoluteLowerLimit() {
        return b("K015");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getAbsoluteUpperLimit() {
        return b("K014");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getHeartRateDeviceError() {
        return b("K016");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getHeartRateDeviceConnected() {
        return b("K017");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalHeartRate() {
        return b("K027");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalPace() {
        return b("K028");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalSpeed() {
        return b("K029");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getNormalStepRate() {
        return b("K030");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeNextAction(String str, int i, int i2, TargetConfig targetConfig) {
        return e(str, i, i2, "K002");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeLastAction(String str, int i, int i2, TargetConfig targetConfig) {
        return e(str, i, i2, "K003");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeFirstAction(String str, int i, int i2, TargetConfig targetConfig) {
        return e(str, i, i2, "K001");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRLowerLimit() {
        return b("K015");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRUpperLimit() {
        return b("K014");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRIntervalLowerLimit() {
        return b("K015");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getReserveHRIntervalUpperLimit() {
        return b("K014");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getMAF180LowerLimit() {
        return b("K015");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getMAF180UpperLimit() {
        return b("K014");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getPaceZoneLowerLimit() {
        return b("K022");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getPaceZoneUpperLimit() {
        return b("K022");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateLowerLimit() {
        return b("K032");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateUpperLimit() {
        return b("K031");
    }

    private Object e(String str, int i, int i2, String str2) {
        String strB;
        if (str == null || "".equals(str)) {
            LogUtil.e("Suggestion_ChineseFitRunVoiceContentConstructor", "getChangeAction nameUrl == NULL || \"\".equals(nameUrl)");
            return null;
        }
        LogUtil.a("Suggestion_ChineseFitRunVoiceContentConstructor", "value = ", Integer.valueOf(i), "nameUrl = ", str, "measurementType = ", Integer.valueOf(i2), "firstAudio = ", str2);
        if (str.startsWith("http")) {
            strB = c(str);
        } else {
            strB = b(str);
            if (!new File(strB).exists()) {
                LogUtil.e("Suggestion_ChineseFitRunVoiceContentConstructor", "getChangeAction !new File(audiosFilePath).exists() = true , audiosFilePath = ", strB);
                return null;
            }
        }
        if (i2 == 1) {
            return b(i, str2, strB);
        }
        if (i2 == 0) {
            return e(i, str2, strB);
        }
        return null;
    }

    private String[] b(int i, String str, String str2) {
        String str3;
        String str4;
        if (i < 60) {
            if (i < 10) {
                str4 = "H00" + i;
            } else {
                str4 = "H0" + i;
            }
            return new String[]{b(str), str2, b(str4), b("I009")};
        }
        int i2 = i / 60;
        if (i2 > 0 && i2 < 10) {
            str3 = "H00" + i2;
        } else if (i2 >= 10 && i2 <= 60) {
            str3 = "H0" + i2;
        } else {
            LogUtil.j("Suggestion_ChineseFitRunVoiceContentConstructor", "MEASUREMENT TYPE_TIME value = ", Integer.valueOf(i));
            return null;
        }
        return new String[]{b(str), str2, b(str3), b("I007")};
    }

    private String[] e(int i, String str, String str2) {
        if (i > 100 && i < 1000) {
            return new String[]{b(str), str2, b("H00" + (i / 100)), b("I002")};
        }
        if (i >= 1000 && i < 10000) {
            int i2 = i / 1000;
            int i3 = (i % 1000) / 100;
            if (i3 == 0) {
                return new String[]{b(str), str2, b("H00" + i2), b("I003")};
            }
            return new String[]{b(str), str2, b("H00" + i2), b("I005"), b("H00" + i3), b("I002")};
        }
        LogUtil.j("Suggestion_ChineseFitRunVoiceContentConstructor", "MEASUREMENT TYPE_DISTANCE value = ", Integer.valueOf(i));
        return null;
    }

    public static String c(String str) {
        return xkf.c(str);
    }

    private String b(String str) {
        return e(str, this.f37512b, this.f37511a, this.d);
    }

    private String e(String str, String str2, String str3, String str4) {
        return xkf.b(str, str2, str3, str4);
    }
}
