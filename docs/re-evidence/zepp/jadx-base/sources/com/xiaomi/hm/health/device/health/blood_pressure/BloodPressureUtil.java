package com.xiaomi.hm.health.device.health.blood_pressure;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/health/blood_pressure/BloodPressureUtil;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isSupportBloodPressure", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "a", "Ljava/lang/String;", "TAG", "b", "Z", "getIS_USER_JOIN_BP_RESEARCH", "()Z", "setIS_USER_JOIN_BP_RESEARCH", "(Z)V", "IS_USER_JOIN_BP_RESEARCH", "c", "getIS_DEVICE_INSTALL_JS_APP", "setIS_DEVICE_INSTALL_JS_APP", "IS_DEVICE_INSTALL_JS_APP", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureUtil implements KoinComponentAdapter {

    @NotNull
    public static final BloodPressureUtil INSTANCE = new BloodPressureUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BloodPressureUtil";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean IS_USER_JOIN_BP_RESEARCH;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean IS_DEVICE_INSTALL_JS_APP;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "is support blood pressure:" + this.a;
        }
    }

    private BloodPressureUtil() {
    }

    public static /* synthetic */ boolean isSupportBloodPressure$default(BloodPressureUtil bloodPressureUtil, HMDeviceType hMDeviceType, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        }
        return bloodPressureUtil.isSupportBloodPressure(hMDeviceType);
    }

    public final boolean getIS_DEVICE_INSTALL_JS_APP() {
        return IS_DEVICE_INSTALL_JS_APP;
    }

    public final boolean getIS_USER_JOIN_BP_RESEARCH() {
        return IS_USER_JOIN_BP_RESEARCH;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    public final boolean isSupportBloodPressure(@NotNull HMDeviceType type) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(type);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return false;
        }
        return isSupportBloodPressure(hMMiLiProDevice);
    }

    public final void setIS_DEVICE_INSTALL_JS_APP(boolean z) {
        IS_DEVICE_INSTALL_JS_APP = z;
    }

    public final void setIS_USER_JOIN_BP_RESEARCH(boolean z) {
        IS_USER_JOIN_BP_RESEARCH = z;
    }

    public final boolean isSupportBloodPressure(@NotNull HMMiLiProDevice device) {
        if (Language.isSimplifiedChinese() && DeviceXFunctionsKt.getBuildConfigApi().isSupportBloodPressure() && IS_USER_JOIN_BP_RESEARCH && IS_DEVICE_INSTALL_JS_APP) {
            boolean zSupportModule = device.supportModule(52);
            HMLog.info(TAG, new a(zSupportModule));
            if (zSupportModule) {
                return true;
            }
        }
        return false;
    }
}
