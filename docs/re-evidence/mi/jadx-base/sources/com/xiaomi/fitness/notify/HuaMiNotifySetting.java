package com.xiaomi.fitness.notify;

import com.xiaomi.fitness.settingitem.settingitem.AndroidappNotifySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifySetting;", "", "<init>", "()V", "switchStatus", "", "getSwitchStatus", "()Z", "setSwitchStatus", "(Z)V", "switchStatusOnScreenLock", "getSwitchStatusOnScreenLock", "setSwitchStatusOnScreenLock", "isScreenOnByNewNotificationSwitch", "setScreenOnByNewNotificationSwitch", "isAllNotificationSync", "setAllNotificationSync", "enableAppList", "", "", "getEnableAppList", "()Ljava/util/List;", "setEnableAppList", "(Ljava/util/List;)V", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiNotifySetting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String SPLIT_TAG = ",";

    @NotNull
    private List<String> enableAppList;
    private boolean isAllNotificationSync;
    private boolean isScreenOnByNewNotificationSwitch;
    private boolean switchStatus;
    private boolean switchStatusOnScreenLock;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/notify/HuaMiNotifySetting$Companion;", "", "<init>", "()V", "SPLIT_TAG", "", "convertFromSettingSync", "Lcom/xiaomi/fitness/notify/HuaMiNotifySetting;", "settingFromSync", "Lcom/xiaomi/fitness/settingitem/settingitem/AndroidappNotifySettings;", "convertToSettingSync", "setting", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHuaMiNotifySetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuaMiNotifySetting.kt\ncom/xiaomi/fitness/notify/HuaMiNotifySetting$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,62:1\n37#2:63\n36#2,3:64\n*S KotlinDebug\n*F\n+ 1 HuaMiNotifySetting.kt\ncom/xiaomi/fitness/notify/HuaMiNotifySetting$Companion\n*L\n28#1:63\n28#1:64,3\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HuaMiNotifySetting convertFromSettingSync(@Nullable AndroidappNotifySettings settingFromSync) {
            HuaMiNotifySetting huaMiNotifySetting = new HuaMiNotifySetting();
            if (settingFromSync != null) {
                huaMiNotifySetting.setSwitchStatus(settingFromSync.isNotifiOn());
                huaMiNotifySetting.setAllNotificationSync(settingFromSync.isAllNotifiOn());
                huaMiNotifySetting.setSwitchStatusOnScreenLock(settingFromSync.isScreenSleepOn());
                huaMiNotifySetting.setScreenOnByNewNotificationSwitch(settingFromSync.isScreenOnByNewNotificationSwitch());
                String apps = settingFromSync.getApps();
                if (apps != null) {
                    String[] strArr = (String[]) new Regex(",").split(apps, 0).toArray(new String[0]);
                    if (!(strArr.length == 0)) {
                        for (String str : strArr) {
                            huaMiNotifySetting.getEnableAppList().add(str);
                        }
                    }
                }
            }
            return huaMiNotifySetting;
        }

        @NotNull
        public final AndroidappNotifySettings convertToSettingSync(@Nullable HuaMiNotifySetting setting) {
            AndroidappNotifySettings androidappNotifySettings = new AndroidappNotifySettings();
            if (setting != null) {
                androidappNotifySettings.setNotifiOn(setting.getSwitchStatus());
                androidappNotifySettings.setAllNotifiOn(setting.getIsAllNotificationSync());
                androidappNotifySettings.setScreenSleepOn(setting.getSwitchStatusOnScreenLock());
                androidappNotifySettings.setScreenOnByNewNotificationSwitch(setting.getIsScreenOnByNewNotificationSwitch());
                if (!setting.getEnableAppList().isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = setting.getEnableAppList().iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(",");
                    }
                    androidappNotifySettings.setApps(sb.substring(0, sb.length() - 1));
                }
            }
            return androidappNotifySettings;
        }
    }

    public HuaMiNotifySetting() {
        this.enableAppList = new ArrayList();
        this.enableAppList = new ArrayList();
    }

    @NotNull
    public final List<String> getEnableAppList() {
        return this.enableAppList;
    }

    public final boolean getSwitchStatus() {
        return this.switchStatus;
    }

    public final boolean getSwitchStatusOnScreenLock() {
        return this.switchStatusOnScreenLock;
    }

    /* JADX INFO: renamed from: isAllNotificationSync, reason: from getter */
    public final boolean getIsAllNotificationSync() {
        return this.isAllNotificationSync;
    }

    /* JADX INFO: renamed from: isScreenOnByNewNotificationSwitch, reason: from getter */
    public final boolean getIsScreenOnByNewNotificationSwitch() {
        return this.isScreenOnByNewNotificationSwitch;
    }

    public final void setAllNotificationSync(boolean z) {
        this.isAllNotificationSync = z;
    }

    public final void setEnableAppList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.enableAppList = list;
    }

    public final void setScreenOnByNewNotificationSwitch(boolean z) {
        this.isScreenOnByNewNotificationSwitch = z;
    }

    public final void setSwitchStatus(boolean z) {
        this.switchStatus = z;
    }

    public final void setSwitchStatusOnScreenLock(boolean z) {
        this.switchStatusOnScreenLock = z;
    }
}
