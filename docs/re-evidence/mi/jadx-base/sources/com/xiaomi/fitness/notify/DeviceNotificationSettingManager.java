package com.xiaomi.fitness.notify;

import com.facebook.react.bridge.BaseJavaModule;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH&J3\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00030\u001dH&J \u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH&J\u0087\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052u\u0010\u001c\u001aq\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030&H&J\u0018\u0010)\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u000bH&J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u000bH&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0007H&¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/notify/DeviceNotificationSettingManager;", "", "removeAllConfig", "", "did", "", "getNotifyEnableList", "", "setNotifyEnable", "packageName", "enable", "", "setNotifyEnableList", "packageNameList", "isNotificationEnable", "notificationGroup", "enableList", "setNotifySwitchStatus", BaseJavaModule.METHOD_TYPE_SYNC, "isNotifySwitchStatusEnable", "setSyncAllNotifySwitchStatusEnable", "isSyncAllNotifySwitchStatusEnable", "setNotifyStatusOnScreenLock", "only", "isNotifyStatusOnScreenLockEnable", "isTelNotifyEnable", "setScreenOnByNewNotificationSwitch", "isScreenOnByNewNotificationSwitch", "callBack", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "result", "updateNotificationSettings", "notifyEnabled", "allEnable", "getNotificationSettings", "Lkotlin/Function5;", "screenOnNewNotification", "isOnlyWear", "updateOnlyWearEnable", "checked", "getAllAppMuteStates", "loadSilenceWhileUsingPhone", "deAttachNotify", "isCallSyncResult", "setWearOSSettingCallSync", "loadWearOSCallSync", "deAttachCallNotify", "initWearOsAllSync", "getInstallApplicationList", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceNotificationSettingManager {
    void deAttachCallNotify();

    void deAttachNotify();

    void getAllAppMuteStates();

    @NotNull
    List<InstallApplicationInfo> getInstallApplicationList();

    void getNotificationSettings(@NotNull String did, @NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack);

    @NotNull
    List<String> getNotifyEnableList(@NotNull String did);

    void initWearOsAllSync();

    boolean isCallSyncResult();

    boolean isNotificationEnable(@NotNull String did, @NotNull String packageName);

    boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull String notificationGroup);

    boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull List<String> enableList);

    boolean isNotifyStatusOnScreenLockEnable(@NotNull String did);

    boolean isNotifySwitchStatusEnable(@NotNull String did);

    void isScreenOnByNewNotificationSwitch(@NotNull String did, @NotNull Function1<? super Integer, Unit> callBack);

    boolean isSyncAllNotifySwitchStatusEnable(@NotNull String did);

    boolean isTelNotifyEnable(@NotNull String did);

    void loadSilenceWhileUsingPhone();

    void loadWearOSCallSync();

    void removeAllConfig(@NotNull String did);

    void setNotifyEnable(@NotNull String did, @NotNull String packageName, boolean enable);

    void setNotifyEnableList(@NotNull String did, @NotNull List<String> packageNameList);

    void setNotifyStatusOnScreenLock(@NotNull String did, boolean only);

    void setNotifySwitchStatus(@NotNull String did, boolean sync);

    void setScreenOnByNewNotificationSwitch(@NotNull String did, boolean sync);

    void setSyncAllNotifySwitchStatusEnable(@NotNull String did, boolean sync);

    void setWearOSSettingCallSync(boolean sync);

    void updateNotificationSettings(@NotNull String did, boolean notifyEnabled, boolean allEnable);

    void updateOnlyWearEnable(@NotNull String did, boolean checked);
}
