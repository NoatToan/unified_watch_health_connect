package com.smarthome.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Pair;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.device.SmartDeviceManager;
import com.smarthome.core.network.SmartTokenInfo;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.MMKVLogLevel;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.framework.redpoint.ServerTimerManager;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.network.NetworkDepApi;
import com.xiaomi.youpin.login.entity.account.LoginMiAccount;
import com.xiaomi.youpin.login.entity.account.MiServiceTokenInfo;
import defpackage.bkg;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016J\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001bJ\u0006\u0010\u001d\u001a\u00020\u0018J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/smarthome/core/SmartHomeSDK;", "", "()V", "METHOD_GET", "", "METHOD_POST", "TAG", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isInit", "", "isInit$smarthome_core_release", "()Z", "setInit$smarthome_core_release", "(Z)V", "mSmartConfig", "Lcom/smarthome/core/SmartConfig;", "sHostApi", "Lcom/smarthome/core/HostApi;", "smartDeviceManager", "Lcom/smarthome/core/device/SmartDeviceManager;", "getHostApi", "getServerTimeSync", "Landroid/util/Pair;", "", "getSmartManger", "init", "", "coreHostApi", q.f13857a, "isST", "onLoginSuccess", "smartTokenInfo", "Lcom/smarthome/core/network/SmartTokenInfo;", "onLogoutSuccess", "setHostApi", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class SmartHomeSDK {

    @Nullable
    private static Context context;
    private static boolean isInit;

    @Nullable
    private static SmartConfig mSmartConfig;

    @Nullable
    private static HostApi sHostApi;

    @NotNull
    public static final SmartHomeSDK INSTANCE = new SmartHomeSDK();

    @NotNull
    private static final String TAG = "SmartHomeSDK";

    @JvmField
    @NotNull
    public static String METHOD_GET = "GET";

    @JvmField
    @NotNull
    public static final String METHOD_POST = "POST";

    @NotNull
    private static final SmartDeviceManager smartDeviceManager = new SmartDeviceManager();

    private SmartHomeSDK() {
    }

    @Nullable
    public final Context getContext() {
        return context;
    }

    @Nullable
    public final HostApi getHostApi() {
        return sHostApi;
    }

    @Nullable
    public final Pair<Long, Boolean> getServerTimeSync() {
        return ServerTimerManager.getServerTimeSync();
    }

    @NotNull
    public final SmartDeviceManager getSmartManger() {
        if (!isInit) {
            MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, TAG, "getSmartManger not init");
        }
        return smartDeviceManager;
    }

    public final void init(@NotNull Context context2, @NotNull HostApi coreHostApi, @NotNull SmartConfig config) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(coreHostApi, "coreHostApi");
        Intrinsics.checkNotNullParameter(config, "config");
        MiJiaEnvironment.setEnvironment(new MiJiaEnvironment.Builder().setContext(context2).setIsDebugBuildType(false).setIsReleaseBuildType(true).setIsSdkBuildType(false).setIsInGreyPublish(false).setIsDevChannel(false).setMidPath("/healthapp").setOriginFrom(Constant.DeviceCategory.HEALTH).setWithOutPrefix(true).build());
        MMKV.B(context2, MMKVLogLevel.LevelError);
        MMKV.n();
        isInit = true;
        sHostApi = coreHostApi;
        mSmartConfig = config;
        context = context2;
        BluetoothContextManager.setContext(context2, true);
        NetworkDepApi.sInstance = new bkg();
    }

    public final boolean isInit$smarthome_core_release() {
        return isInit;
    }

    public final boolean isST() {
        SmartConfig smartConfig = mSmartConfig;
        if (smartConfig == null) {
            return false;
        }
        return smartConfig.getIsSt();
    }

    public final void onLoginSuccess(@NotNull SmartTokenInfo smartTokenInfo) {
        Intrinsics.checkNotNullParameter(smartTokenInfo, "smartTokenInfo");
        MiServiceTokenInfo miServiceTokenInfo = new MiServiceTokenInfo(smartTokenInfo.getSid(), smartTokenInfo.getCUserId(), smartTokenInfo.getServiceToken(), smartTokenInfo.getSsecurity(), smartTokenInfo.getDomain(), smartTokenInfo.getTimeDiff());
        LoginMiAccount loginMiAccount = new LoginMiAccount();
        ArrayList arrayList = new ArrayList();
        arrayList.add(miServiceTokenInfo);
        loginMiAccount.h(smartTokenInfo.getMiId(), smartTokenInfo.getPassToken(), true, arrayList);
        MiJiaAccountManager.getInstance().clearAllAccount();
        MiJiaAccountManager.getInstance().setMiAccount(loginMiAccount);
        MiJiaAccountManager.getInstance().saveAccount();
        if (mSmartConfig != null) {
            GlobalDynamicSettingManager globalDynamicSettingManager = GlobalDynamicSettingManager.getInstance();
            SmartConfig smartConfig = mSmartConfig;
            Intrinsics.checkNotNull(smartConfig);
            globalDynamicSettingManager.setServerEnv(smartConfig.getServerEnv());
            SmartConfig smartConfig2 = mSmartConfig;
            Intrinsics.checkNotNull(smartConfig2);
            if (smartConfig2.getIsSt()) {
                GlobalDynamicSettingManager.getInstance().setServer(new ServerBean("st", "st", "Staging"));
                return;
            }
            GlobalDynamicSettingManager globalDynamicSettingManager2 = GlobalDynamicSettingManager.getInstance();
            SmartConfig smartConfig3 = mSmartConfig;
            Intrinsics.checkNotNull(smartConfig3);
            globalDynamicSettingManager2.setServer(smartConfig3.getDefaultServer());
        }
    }

    public final void onLogoutSuccess() {
        MiJiaAccountManager.getInstance().clearAllAccount();
        mSmartConfig = null;
    }

    public final void setContext(@Nullable Context context2) {
        context = context2;
    }

    public final void setHostApi(@NotNull HostApi coreHostApi) {
        Intrinsics.checkNotNullParameter(coreHostApi, "coreHostApi");
        sHostApi = coreHostApi;
    }

    public final void setInit$smarthome_core_release(boolean z) {
        isInit = z;
    }
}
