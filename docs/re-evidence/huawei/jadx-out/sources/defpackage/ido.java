package defpackage;

import android.text.TextUtils;
import com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ido implements IFitRunVoiceContentConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37519c;
    private String d;
    private String e;

    public ido(String str, String str2, String str3) {
        this.f37519c = str;
        this.e = str2;
        this.d = str3;
    }

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
        return d(str, i, i2, "K002", targetConfig);
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeLastAction(String str, int i, int i2, TargetConfig targetConfig) {
        return d(str, i, i2, "K003", targetConfig);
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getChangeFirstAction(String str, int i, int i2, TargetConfig targetConfig) {
        return d(str, i, i2, "K001", targetConfig);
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
        return b("K023");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getPaceZoneUpperLimit() {
        return b("K022");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateUpperLimit() {
        return b("K031");
    }

    @Override // com.huawei.health.suggestion.ui.voice.IFitRunVoiceContentConstructor
    public Object getStepRateLowerLimit() {
        return b("K032");
    }

    private Object d(String str, int i, int i2, String str2, TargetConfig targetConfig) {
        String strB;
        if (str == null || "".equals(str)) {
            LogUtil.e("Suggestion_FitRunVoiceBaseContentConstructor", "getChangeAction null == nameUrl || \"\".equals(nameUrl)");
            return null;
        }
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "value = ", Integer.valueOf(i), "nameUrl = ", str, "measurementType = ", Integer.valueOf(i2), "firstAudio = ", str2, "intensityConfigId: = ", targetConfig == null ? Constants.NULL : targetConfig.getId());
        if (str.startsWith("http")) {
            strB = a(str);
        } else {
            strB = b(str);
            if (!new File(strB).exists()) {
                LogUtil.e("Suggestion_FitRunVoiceBaseContentConstructor", "getChangeAction !new File(audiosFilePath).exists() = true , audiosFilePath = ", strB);
                return null;
            }
        }
        String str3 = strB;
        if (i2 == 1) {
            return c(i, str2, str3, targetConfig);
        }
        if (i2 == 0) {
            return e(i, str2, str3, targetConfig);
        }
        if (i2 == 3) {
            return a(i, str2, str3, targetConfig);
        }
        if (i2 == 4 || i2 == 5) {
            return c(i, str2, str3, targetConfig, i2);
        }
        if (i2 != 255) {
            LogUtil.e("Suggestion_FitRunVoiceBaseContentConstructor", "getChangeAction other measurementType:", Integer.valueOf(i2));
            return null;
        }
        String[] strArr = {b(str2), str3};
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    public boolean b(TargetConfig targetConfig) {
        if (targetConfig == null || TextUtils.isEmpty(targetConfig.getId())) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "hasIntensityConfig intensityConfig false");
            return false;
        }
        int iJ = CommonUtils.j(targetConfig.getId());
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "hasIntensityConfig intensityConfigType :", Integer.valueOf(iJ));
        if (!CommonUtil.b(targetConfig.getValueL()) || !CommonUtil.b(targetConfig.getValueH())) {
            return iJ != 255 && hoy.c().e();
        }
        LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "hasIntensityConfig value == zero");
        return false;
    }

    private String[] c(int i, String str, String str2, TargetConfig targetConfig, int i2) {
        ArrayList arrayList = new ArrayList();
        List<String> listA = a(i);
        arrayList.add(str);
        arrayList.add(str2);
        if (i2 == 4) {
            arrayList.add("K024");
        } else {
            arrayList.add("K025");
        }
        arrayList.addAll(listA);
        arrayList.add("I013");
        String[] strArr = new String[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 == 1) {
                strArr[1] = str2;
            } else {
                strArr[i3] = b((String) arrayList.get(i3));
            }
        }
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    private String[] a(int i, String str, String str2, TargetConfig targetConfig) {
        ArrayList arrayList = new ArrayList();
        List<String> listA = a(i);
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add("K026");
        arrayList.addAll(listA);
        arrayList.add("I010");
        String[] strArr = new String[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 == 1) {
                strArr[1] = str2;
            } else {
                strArr[i2] = b((String) arrayList.get(i2));
            }
        }
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    private String[] e(int i, String str, String str2, TargetConfig targetConfig) {
        String[] strArrA;
        if (i < 1000) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(str2);
            arrayList.addAll(a(i));
            arrayList.add("I001");
            strArrA = new String[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 == 1) {
                    strArrA[i2] = str2;
                } else {
                    strArrA[i2] = b((String) arrayList.get(i2));
                }
            }
        } else {
            strArrA = a(i, str, str2);
        }
        return b(targetConfig) ? c(strArrA, targetConfig) : strArrA;
    }

    private String[] a(int i, String str, String str2) {
        int i2 = i / 1000;
        int i3 = (i % 1000) / 100;
        int i4 = (i % 100) / 10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.addAll(a(i2));
        if (i3 == 0 && i4 != 0) {
            arrayList.add("I017");
            arrayList.add("H999");
            arrayList.add(d(i4));
        } else if (i3 != 0 && i4 == 0) {
            arrayList.add("I017");
            arrayList.add(d(i3));
        } else if (i3 != 0) {
            arrayList.add("I017");
            arrayList.add(d(i3));
            arrayList.add(d(i4));
        } else {
            LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "handleTenThousandDistance hundredNum and tenNumber zero");
        }
        arrayList.add("I006");
        String[] strArr = new String[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (i5 == 1) {
                strArr[i5] = str2;
            } else {
                strArr[i5] = b((String) arrayList.get(i5));
            }
        }
        return strArr;
    }

    private String[] c(int i, String str, String str2, TargetConfig targetConfig) {
        String[] strArr;
        if (i < 60) {
            strArr = new String[]{b(str), str2, b(i < 10 ? "H00" + i : "H0" + i), b("I009")};
        } else {
            int i2 = i / 3600;
            int i3 = (i % 3600) / 60;
            int i4 = i % 60;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(str2);
            if (i2 != 0) {
                arrayList.add(d(i2));
                arrayList.add("I018");
            }
            if (i3 != 0) {
                arrayList.add(d(i3));
                arrayList.add("I007");
            }
            if (i4 != 0) {
                arrayList.add(d(i4));
                arrayList.add("I009");
            }
            strArr = new String[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (i5 == 1) {
                    strArr[i5] = str2;
                } else {
                    strArr[i5] = b((String) arrayList.get(i5));
                }
            }
        }
        return b(targetConfig) ? c(strArr, targetConfig) : strArr;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    private String[] c(String[] strArr, TargetConfig targetConfig) {
        String[] strArrE = null;
        if (strArr == null) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "combineAudios nextAudios == null");
            return null;
        }
        int iJ = CommonUtils.j(targetConfig.getId());
        if (iJ == 0 || iJ == 1 || iJ == 2 || iJ == 4 || iJ == 7 || iJ == 8) {
            strArrE = e(targetConfig);
        } else {
            switch (iJ) {
                case 13:
                case 15:
                    strArrE = a(targetConfig);
                    break;
                case 14:
                    if (hoy.c().b()) {
                        strArrE = e(targetConfig);
                    } else {
                        strArrE = a(targetConfig);
                    }
                    break;
                case 16:
                    strArrE = c(targetConfig);
                    break;
                case 17:
                    strArrE = e(targetConfig);
                    break;
                default:
                    LogUtil.e("Suggestion_FitRunVoiceBaseContentConstructor", "combineAudios other intensityConfig.getId():", targetConfig.getId());
                    break;
            }
        }
        if (strArrE == null) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "combineAudios intensityAudio == null");
            return strArr;
        }
        int length = strArr.length + strArrE.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            if (i < strArr.length) {
                strArr2[i] = strArr[i];
            } else {
                strArr2[i] = strArrE[strArrE.length - (length - i)];
            }
        }
        return strArr2;
    }

    private String[] a(TargetConfig targetConfig) {
        int iB;
        int iB2;
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "enter getPaceAudioFilePath intensityConfig.getId()", targetConfig.getId());
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
                LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "getPaceAudioFilePath valueLower:", Integer.valueOf(iB), "and valueUpper:", Integer.valueOf(iB2));
            } else {
                LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getPaceAudioFilePath paceZoneConfig == null");
                return null;
            }
        }
        String[] strArrE = e(iB);
        String[] strArrE2 = e(iB2);
        if (strArrE != null && strArrE2 != null) {
            String[] strArrE3 = e(strArrE, strArrE2);
            return strArrE3 != null ? strArrE3 : new String[]{b("K018"), b(strArrE[0]), b("I007"), b(strArrE[1]), b("I009"), b("K021"), b(strArrE2[0]), b("I007"), b(strArrE2[1]), b("I009"), b("I011")};
        }
        LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getPaceAudioFilePath", "lowerValue == null || upperValue == null");
        return null;
    }

    private String[] e(String[] strArr, String[] strArr2) {
        if ("H999".equals(strArr[1]) && !"H999".equals(strArr2[1])) {
            return new String[]{b("K018"), b(strArr[0]), b("I007"), b("K021"), b(strArr2[0]), b("I007"), b(strArr2[1]), b("I009"), b("I011")};
        }
        if (!"H999".equals(strArr[1]) && "H999".equals(strArr2[1])) {
            return new String[]{b("K018"), b(strArr[0]), b("I007"), b(strArr[1]), b("I009"), b("K021"), b(strArr2[0]), b("I007"), b("I011")};
        }
        if ("H999".equals(strArr[1])) {
            return new String[]{b("K018"), b(strArr[0]), b("I007"), b("K021"), b(strArr2[0]), b("I007"), b("I011")};
        }
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "dealZeroSecondVoice no FILE_HEAD_ZERO_NUMBER");
        return null;
    }

    private String[] e(TargetConfig targetConfig) {
        String str;
        String str2;
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "enter getZoneAudioFilePath intensityConfig.getId()", targetConfig.getId());
        int iC = c(targetConfig, (int) targetConfig.getValueL(), true);
        int iC2 = c(targetConfig, (int) targetConfig.getValueH(), false);
        if (iC <= 0 || iC2 <= 0) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getZoneAudioFilePath valueLower <= 0 || valueUpper <= 0");
            return null;
        }
        if (CommonUtils.j(targetConfig.getId()) == 0) {
            str2 = "K020";
            str = "I012";
        } else {
            str = "I013";
            str2 = "K019";
        }
        ArrayList arrayList = new ArrayList();
        List<String> listA = a(iC);
        arrayList.add(str2);
        arrayList.addAll(listA);
        arrayList.add("K021");
        List<String> listA2 = a(iC2);
        listA2.add(str);
        arrayList.addAll(listA2);
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = b((String) arrayList.get(i));
        }
        return strArr;
    }

    private String[] c(TargetConfig targetConfig) {
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "enter getZoneAudioFilePath intensityConfig.getId()", targetConfig.getId());
        int valueL = (int) targetConfig.getValueL();
        int valueH = (int) targetConfig.getValueH();
        if (valueL <= 0 || valueH <= 0) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getZoneAudioFilePath valueLower <= 0 || valueUpper <= 0");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<String> listA = a(valueL);
        arrayList.add("K045");
        arrayList.addAll(listA);
        arrayList.add("K021");
        List<String> listA2 = a(valueH);
        listA2.add("I013");
        arrayList.addAll(listA2);
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = b((String) arrayList.get(i));
        }
        return strArr;
    }

    public int c(TargetConfig targetConfig, int i, boolean z) {
        int iJ = CommonUtils.j(targetConfig.getId());
        if (iJ == 0) {
            return (int) ped.c(i);
        }
        if (iJ == 1 || iJ == 4 || iJ == 14 || iJ == 17 || iJ == 7 || iJ == 8) {
            i = ifk.c(hoy.c().a(), iJ, i, z);
        }
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "dealZoneLimitValue tempValue:", Integer.valueOf(i), "and isZoneLower:", Boolean.valueOf(z), " intensityId:", Integer.valueOf(iJ));
        return i;
    }

    private String[] e(int i) {
        String[] strArr = new String[2];
        int i2 = i / 60;
        int i3 = i % 60;
        if (i3 >= 10) {
            strArr[1] = "H0" + i3;
        } else if (i3 == 0) {
            strArr[1] = "H999";
        } else {
            strArr[1] = "H00" + i3;
        }
        if (i2 < 10) {
            strArr[0] = "H00" + i2;
            return strArr;
        }
        if (i2 <= 60) {
            strArr[0] = "H0" + i2;
            return strArr;
        }
        LogUtil.e("Suggestion_FitRunVoiceBaseContentConstructor", "MEASUREMENT TYPE_TIME minute = ", Integer.valueOf(i2));
        return null;
    }

    private String d(int i) {
        if (i >= 10) {
            return "H0" + i;
        }
        if (i == 0) {
            return "H999";
        }
        return "H00" + i;
    }

    private List<String> a(int i) {
        if (!LanguageUtil.o(BaseApplication.getContext())) {
            return c(i);
        }
        ArrayList arrayList = new ArrayList();
        if (i < 1000) {
            d(i, arrayList);
            return arrayList;
        }
        if (i < 10000) {
            int i2 = i / 1000;
            int i3 = i % 1000;
            arrayList.add("H00" + i2);
            arrayList.add("I005");
            if (i3 != 0) {
                if (i3 / 100 == 0) {
                    arrayList.add("H999");
                }
                d(i3, arrayList);
            }
            return arrayList;
        }
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "multiNumberAudio dealValue is greater than 10000");
        return arrayList;
    }

    private void d(int i, List<String> list) {
        if (i <= 60) {
            list.add(d(i));
            return;
        }
        if (i < 100) {
            int i2 = i / 10;
            int i3 = i % 10;
            list.add("H00" + i2);
            list.add("H010");
            if (i3 != 0) {
                list.add("H00" + i3);
                return;
            }
            return;
        }
        int i4 = i / 100;
        int i5 = (i / 10) % 10;
        int i6 = i % 10;
        list.add("H00" + i4);
        list.add("I004");
        if (i5 == 0 && i6 != 0) {
            list.add("H999");
        }
        if (i5 != 0) {
            list.add(d(i5));
            list.add("H010");
        }
        if (i6 != 0) {
            list.add("H00" + i6);
        }
    }

    private List<String> c(int i) {
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "multiNumberAudioForEnglish dealValue:", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        if (i < 1000) {
            c(i, arrayList);
            return arrayList;
        }
        if (i < 10000) {
            int i2 = i / 1000;
            int i3 = i % 1000;
            arrayList.add("H00" + i2);
            arrayList.add("I005");
            if (i3 != 0) {
                if (i3 / 100 == 0) {
                    arrayList.add("K021");
                }
                c(i3, arrayList);
            }
            return arrayList;
        }
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "multiNumberAudioForEnglish dealValue is greater than 10000");
        return arrayList;
    }

    private void c(int i, List<String> list) {
        if (i < 100) {
            a(i, list);
            return;
        }
        list.add("H00" + (i / 100));
        list.add("I004");
        if ((i / 10) % 10 == 0 && i % 10 == 0) {
            return;
        }
        list.add("K021");
        a(i % 100, list);
    }

    private void a(int i, List<String> list) {
        LogUtil.a("Suggestion_FitRunVoiceBaseContentConstructor", "twoDigitsForEnglish dealValue", Integer.valueOf(i));
        if (i <= 60) {
            list.add(d(i));
            return;
        }
        if (i < 100) {
            int i2 = i / 10;
            int i3 = i % 10;
            switch (i2) {
                case 6:
                    list.add("H060");
                    break;
                case 7:
                    list.add("H061");
                    break;
                case 8:
                    list.add("H062");
                    break;
                case 9:
                    list.add("H063");
                    break;
            }
            if (i3 != 0) {
                list.add("H00" + i3);
                return;
            }
            return;
        }
        LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "twoDigitsForEnglish error value:", Integer.valueOf(i));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getAudiosFilePath() audioId is null");
            return "";
        }
        return xkf.c(str);
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_FitRunVoiceBaseContentConstructor", "getAudiosBaseFilePath() audioId is null");
            return "";
        }
        return e(str, this.f37519c, this.e, this.d);
    }

    private String e(String str, String str2, String str3, String str4) {
        return xkf.b(str, str2, str3, str4);
    }
}
