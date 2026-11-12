package com.huami.ai.speech.simplify.engine;

import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.simplify.auth.DeviceTokenManager;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\f\n\u0004\b\t\u0010\u0006\u0012\u0004\b\n\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0013\u0010\u0016\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0013\u0010\u0018\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\"\u0013\u0010\u001a\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\"\u0013\u0010\u001c\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\"\u0013\u0010\u001f\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010#\u001a\u0004\u0018\u00010 8F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u0004\u0018\u00010 8F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getCurrentDeviceSource", "", "deviceId", "getMiotDid", "CLIENT_ID", "Ljava/lang/String;", "getCLIENT_ID$annotations", "()V", "CLIENT_SECRET", "getCLIENT_SECRET$annotations", "XIAOMI_XIAOAI_DEVICE_OAUTH_CALL_BACK_URL", "MI_BAND_CLIENT_ID", "MI_BAND_CLIENT_SECRET", "", "a", "J", "CAPABILITY_VERSION_2", "b", "CAPABILITY_VERSION_4", "getCurrentClientId", "()Ljava/lang/String;", "currentClientId", "getCurrentClientSecret", "currentClientSecret", "getCurrentDeviceId", "currentDeviceId", "getCurrentMiotDid", "currentMiotDid", "getCurrentCapabilityVersion", "()J", "currentCapabilityVersion", "", "getCurrentDeviceProductID", "()Ljava/lang/Integer;", "currentDeviceProductID", "getCurrentDeviceVendorId", "currentDeviceVendorId", "speech-simplify_release"}, k = 2, mv = {1, 5, 1})
public final class XiaoAiConfigConstantsKt {

    @NotNull
    public static final String CLIENT_ID = "2882303761517383915";

    @NotNull
    public static final String CLIENT_SECRET = "G2zE/8Ujn1GYxnWP1EnLXQ==";

    @NotNull
    public static final String MI_BAND_CLIENT_ID = "428135909242707968";

    @NotNull
    public static final String MI_BAND_CLIENT_SECRET = "boL5CfhUo9ItWfyfQzIVwv_KITmpr5SFMi9IOyJRAQWeVpQyO9t-L3qSrdtdaPZt0Dk4WQXGJ-6ZhWwxTzwX5g";

    @NotNull
    public static final String XIAOMI_XIAOAI_DEVICE_OAUTH_CALL_BACK_URL = "https://api-mifit-cn.huami.com/huami.health.loginview.do";
    private static final long a = 2;
    private static final long b = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getCLIENT_ID$annotations() {
    }

    public static /* synthetic */ void getCLIENT_SECRET$annotations() {
    }

    public static final long getCurrentCapabilityVersion() {
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        HMDeviceSource mDeviceSource = hMBaseDevice != null ? hMBaseDevice.getMDeviceSource() : null;
        return (mDeviceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mDeviceSource.ordinal()]) == 1 ? 4L : 2L;
    }

    @NotNull
    public static final String getCurrentClientId() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        DeviceTokenManager deviceTokenManager = DeviceTokenManager.INSTANCE;
        return deviceTokenManager.isSupportDeviceToken(currentDeviceSource) ? deviceTokenManager.getClientId(currentDeviceSource) : MI_BAND_CLIENT_ID;
    }

    @NotNull
    public static final String getCurrentClientSecret() {
        HMDeviceSource currentDeviceSource = getCurrentDeviceSource();
        DeviceTokenManager deviceTokenManager = DeviceTokenManager.INSTANCE;
        return deviceTokenManager.isSupportDeviceToken(currentDeviceSource) ? deviceTokenManager.getSecret(currentDeviceSource) : MI_BAND_CLIENT_SECRET;
    }

    @NotNull
    public static final String getCurrentDeviceId() {
        DeviceInfo deviceInfo;
        String serialNumber;
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        return (hMBaseDevice == null || (deviceInfo = hMBaseDevice.getDeviceInfo()) == null || (serialNumber = deviceInfo.getSerialNumber()) == null) ? "" : serialNumber;
    }

    @Nullable
    public static final Integer getCurrentDeviceProductID() {
        DeviceInfo deviceInfo;
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        if (hMBaseDevice == null || (deviceInfo = hMBaseDevice.getDeviceInfo()) == null) {
            return null;
        }
        return Integer.valueOf(deviceInfo.getProductId());
    }

    @Nullable
    public static final HMDeviceSource getCurrentDeviceSource() {
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        if (hMBaseDevice == null) {
            return null;
        }
        return hMBaseDevice.getMDeviceSource();
    }

    @Nullable
    public static final Integer getCurrentDeviceVendorId() {
        DeviceInfo deviceInfo;
        HMBaseDevice hMBaseDevice = (HMBaseDevice) ((Function0) KoinHelperKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Function0.class), null, null)).invoke();
        if (hMBaseDevice == null || (deviceInfo = hMBaseDevice.getDeviceInfo()) == null) {
            return null;
        }
        return Integer.valueOf(deviceInfo.getVendorId());
    }

    @NotNull
    public static final String getCurrentMiotDid() {
        return getMiotDid(getCurrentDeviceId());
    }

    @NotNull
    public static final String getMiotDid(@Nullable String str) {
        String strStringPlus;
        return (str == null || (strStringPlus = Intrinsics.stringPlus("miotDid-", str)) == null) ? "" : strStringPlus;
    }
}
