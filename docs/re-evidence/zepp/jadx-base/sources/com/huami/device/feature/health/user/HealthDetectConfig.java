package com.huami.device.feature.health.user;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.model.UserHealthConfigKey;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\u0018\u0000 O2\u00020\u0001:\u0001OB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\bM\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\"\u0010(\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\"\u0010,\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\"\u00100\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R\"\u00104\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\"\u00108\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR\"\u0010<\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001aR\"\u0010@\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\"\u0010D\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R\"\u0010H\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\"\u0010L\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001c\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 ¨\u0006P"}, d2 = {"Lcom/huami/device/feature/health/user/HealthDetectConfig;", "Lcom/huami/device/feature/health/user/BaseHealthSettingConfig;", "", b.r, "", DTransferConstants.SEARCH_KEY, "r", "", "u", "t", SOAP.XMLNS, "syncToServer", "", "commitChange", "resetToDefault", "resetOnBind", "Lcom/huami/device/feature/health/device/HealthDevice;", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", LogUtil.I, "getHrDetectType", "()I", "setHrDetectType", "(I)V", "hrDetectType", "Z", "getHrEnable", "()Z", "setHrEnable", "(Z)V", HealthDetectConfig.F, "getFreq", "setFreq", HealthDetectConfig.G, "v", "getAtrialFibEnable", "setAtrialFibEnable", HealthDetectConfig.H, "w", "getAtrialSleepNotDisturb", "setAtrialSleepNotDisturb", HealthDetectConfig.N, "x", "getWarningEnable", "setWarningEnable", HealthDetectConfig.I, "y", "getWarningValue", "setWarningValue", HealthDetectConfig.J, "z", "getHighWarningValue", "setHighWarningValue", "highWarningValue", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getLowWarningValue", "setLowWarningValue", "lowWarningValue", "B", "getHrSleepEnable", "setHrSleepEnable", HealthDetectConfig.K, "C", "getSleepAssistEnable", "setSleepAssistEnable", HealthDetectConfig.L, LogUtil.D, "getSportHrCheckEnable", "setSportHrCheckEnable", HealthDetectConfig.M, "E", "getNeedMigrationHRWay", "setNeedMigrationHRWay", "needMigrationHRWay", "<init>", "(Lcom/huami/device/feature/health/device/HealthDevice;Lcom/huami/device/feature/health/device/IDeviceAppApi;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectConfig extends BaseHealthSettingConfig {

    @NotNull
    private static final String F = "hrEnable";

    @NotNull
    private static final String G = "freq";

    @NotNull
    private static final String H = "atrialFibEnable";

    @NotNull
    private static final String I = "warningEnable";

    @NotNull
    private static final String J = "warningValue";

    @NotNull
    private static final String K = "hrSleepEnable";

    @NotNull
    private static final String L = "sleepAssistEnable";

    @NotNull
    private static final String M = "sportHrCheckEnable";

    @NotNull
    private static final String N = "atrialSleepNotDisturb";

    @NotNull
    private static final String O = "highHrWarningValue";

    @NotNull
    private static final String P = "lowHrWarningValue";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int lowWarningValue;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean hrSleepEnable;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean sleepAssistEnable;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean sportHrCheckEnable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean needMigrationHRWay;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final IDeviceAppApi appApi;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int hrDetectType;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean hrEnable;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int freq;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean atrialFibEnable;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean atrialSleepNotDisturb;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean warningEnable;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int warningValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int highWarningValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save user property:" + this.a + ", value:" + this.b;
        }
    }

    public HealthDetectConfig(@NotNull HealthDevice healthDevice, @NotNull IDeviceAppApi iDeviceAppApi) {
        super(healthDevice, iDeviceAppApi);
        this.device = healthDevice;
        this.appApi = iDeviceAppApi;
        boolean z = true;
        this.hrEnable = true;
        this.freq = 10;
        this.warningEnable = true;
        this.warningValue = r();
        this.hrSleepEnable = q();
        this.sportHrCheckEnable = true;
        String userProperty = iDeviceAppApi.getUserProperty(UserHealthConfigKey.HEALTH_DETECT_KEY.INSTANCE.getKey());
        if (!(userProperty.length() > 0)) {
            if (t()) {
                return;
            }
            HrDetectSettingConfig hrDetectSettingConfig = new HrDetectSettingConfig(healthDevice, iDeviceAppApi);
            setHrEnable(hrDetectSettingConfig.getHrDetectType() == 2 || hrDetectSettingConfig.getHrDetectType() == 3);
            setFreq(hrDetectSettingConfig.getFreq());
            setAtrialFibEnable(hrDetectSettingConfig.getHrDetectType() == 4);
            setWarningEnable(hrDetectSettingConfig.getCom.huami.device.feature.health.user.HrDetectSettingConfig.E java.lang.String());
            setWarningValue(hrDetectSettingConfig.getWarningValue());
            if (hrDetectSettingConfig.getHrDetectType() != 1 && hrDetectSettingConfig.getHrDetectType() != 3) {
                z = false;
            }
            setHrSleepEnable(z);
            setSleepAssistEnable(hrDetectSettingConfig.getCom.huami.device.feature.health.user.HrDetectSettingConfig.G java.lang.String());
            setSportHrCheckEnable(hrDetectSettingConfig.getSportHrCheckEnable());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(userProperty);
            setHrEnable(jSONObject.optBoolean(F, true));
            setFreq(jSONObject.optInt(G, p()));
            setAtrialFibEnable(jSONObject.optBoolean(H, false));
            setAtrialSleepNotDisturb(jSONObject.optBoolean(N, false));
            setHighWarningValue(jSONObject.optInt(O, 0));
            setLowWarningValue(jSONObject.optInt(P, 0));
            setWarningEnable(jSONObject.optBoolean(I, true));
            setWarningValue(jSONObject.optInt(J, getWarningValue()));
            setHrSleepEnable(jSONObject.optBoolean(K, q()));
            setSleepAssistEnable(jSONObject.optBoolean(L, false));
            setSportHrCheckEnable(jSONObject.optBoolean(M, true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final int p() {
        return (this.device.isMifit() && this.device.isHuamiOs()) ? 255 : 10;
    }

    private final boolean q() {
        return this.device.isHuamiOs() && !this.device.isMifit();
    }

    private final int r() {
        return this.device.isComoDevice() ? 0 : 150;
    }

    private final String s() {
        return (HealthExt.INSTANCE.isSupportAtrial(this.device) ? UserHealthConfigKey.HR_DETECT_ATRIAL_KEY.INSTANCE : UserHealthConfigKey.HR_DETECT_KEY.INSTANCE).getKey();
    }

    private final boolean t() {
        return this.appApi.getUserProperty(s()).length() == 0;
    }

    private final String u() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(F, getHrEnable());
            jSONObject.put(G, getFreq());
            jSONObject.put(H, getAtrialFibEnable());
            jSONObject.put(I, getCom.huami.device.feature.health.user.HrDetectSettingConfig.E java.lang.String());
            jSONObject.put(J, getWarningValue());
            jSONObject.put(K, getHrSleepEnable());
            jSONObject.put(L, getCom.huami.device.feature.health.user.HrDetectSettingConfig.G java.lang.String());
            jSONObject.put(M, getSportHrCheckEnable());
            jSONObject.put(N, getAtrialSleepNotDisturb());
            jSONObject.put(O, getHighWarningValue());
            jSONObject.put(P, getLowWarningValue());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void commitChange(boolean syncToServer) {
        String strU = u();
        if (strU == null) {
            return;
        }
        String key = UserHealthConfigKey.HEALTH_DETECT_KEY.INSTANCE.getKey();
        HMLog.info(getTAG(), new a(key, strU));
        this.appApi.saveUserProperty(key, strU);
        this.appApi.uploadUserProperty(key);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getAtrialFibEnable() {
        return this.atrialFibEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getAtrialSleepNotDisturb() {
        return this.atrialSleepNotDisturb;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getFreq() {
        return this.freq;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getHighWarningValue() {
        return this.highWarningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getHrDetectType() {
        return this.hrDetectType;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getHrEnable() {
        return this.hrEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getHrSleepEnable() {
        return this.hrSleepEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getLowWarningValue() {
        return this.lowWarningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    /* JADX INFO: renamed from: getNeedMigrationHRWay, reason: from getter */
    public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.H java.lang.String() {
        return this.needMigrationHRWay;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    /* JADX INFO: renamed from: getSleepAssistEnable, reason: from getter */
    public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.G java.lang.String() {
        return this.sleepAssistEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public boolean getSportHrCheckEnable() {
        return this.sportHrCheckEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    /* JADX INFO: renamed from: getWarningEnable, reason: from getter */
    public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.E java.lang.String() {
        return this.warningEnable;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public int getWarningValue() {
        return this.warningValue;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void resetOnBind() {
        if (this.device.isForceHrAndRemEnable()) {
            if (getHrEnable() && getHrSleepEnable() && getFreq() == 1) {
                return;
            }
            setHrEnable(true);
            setHrSleepEnable(true);
            setFreq(1);
            save(false);
        }
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void resetToDefault() throws JSONException {
        setHrEnable(true);
        setFreq(p());
        setAtrialFibEnable(false);
        setAtrialSleepNotDisturb(false);
        setWarningEnable(true);
        setWarningValue(r());
        setHighWarningValue(0);
        setLowWarningValue(0);
        setHrSleepEnable(q());
        setSleepAssistEnable(false);
        setSportHrCheckEnable(true);
        setNeedMigrationHRWay(false);
        setOsaEnable(false);
        setSmartSpo2Enable(false);
        setLowSpo2AlertValue(0);
        setPressureEnable(false);
        setPressureAlertEnable(false);
        setSleepingBloodPressureMonitorEnable(false);
        save(true);
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setAtrialFibEnable(boolean z) {
        this.atrialFibEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setAtrialSleepNotDisturb(boolean z) {
        this.atrialSleepNotDisturb = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setFreq(int i) {
        this.freq = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHighWarningValue(int i) {
        this.highWarningValue = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrDetectType(int i) {
        this.hrDetectType = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrEnable(boolean z) {
        this.hrEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setHrSleepEnable(boolean z) {
        this.hrSleepEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setLowWarningValue(int i) {
        this.lowWarningValue = i;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setNeedMigrationHRWay(boolean z) {
        this.needMigrationHRWay = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSleepAssistEnable(boolean z) {
        this.sleepAssistEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setSportHrCheckEnable(boolean z) {
        this.sportHrCheckEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setWarningEnable(boolean z) {
        this.warningEnable = z;
    }

    @Override // com.huami.device.feature.health.user.HealthSettingConfig
    public void setWarningValue(int i) {
        this.warningValue = i;
    }
}
