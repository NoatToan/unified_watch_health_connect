package com.xiaomi.fitness.notify.notification;

import android.provider.Telephony;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\bf\u0018\u0000 k2\u00020\u0001:\u0001kJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\tH&J(\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH&J6\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH&JT\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010 \u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020\u00112\b\b\u0001\u0010\"\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH&J\u007f\u0010#\u001a\u00020\u00062u\u0010$\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00060%H&J\b\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0003H&J\u0018\u00100\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\u0010\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0003H&J\u0010\u00103\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000104H&J\u0018\u00105\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0003H&J\u001e\u00106\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\t08H&J\u0010\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\tH&J\u0010\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020=H&J\n\u0010>\u001a\u0004\u0018\u00010=H&J\u0016\u0010?\u001a\u00020\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t08H&J\u0010\u0010A\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0003H&J\u0010\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0003H&J\u0012\u0010D\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010\tH&J\b\u0010F\u001a\u00020GH&J\b\u0010H\u001a\u00020\u0006H&J\b\u0010I\u001a\u00020\u0003H&J\b\u0010J\u001a\u00020\u0006H&J\u0018\u0010K\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\t2\u0006\u0010L\u001a\u00020\u0003H&J0\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\t2\u0006\u0010O\u001a\u00020\t2\u0016\b\u0002\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010QH&J\u0012\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010\u0015\u001a\u00020\tH&J \u0010T\u001a\u00020\u00062\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010QH&J\b\u0010V\u001a\u00020\u0003H&J\b\u0010W\u001a\u00020\tH&J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020\t08H&J\u0010\u0010Y\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\tH&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\tH&J\u0010\u00101\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\tH&J \u0010Z\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010[\u001a\u00020\tH&J\u0018\u0010\\\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\t2\u0006\u0010]\u001a\u00020\u0003H&J\u0018\u0010^\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u0003H&J\b\u0010`\u001a\u00020\u0006H&J\b\u0010a\u001a\u00020\u0006H&J\b\u0010b\u001a\u00020\u0006H&J\b\u0010c\u001a\u00020\u0003H&J\u0010\u0010d\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0003H&J\b\u0010e\u001a\u00020\u0006H&J\b\u0010f\u001a\u00020\u0006H&J\b\u0010g\u001a\u00020\u0006H&J\u000e\u0010h\u001a\b\u0012\u0004\u0012\u00020S08H&J\u0010\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0003H&¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter;", "", "isNotificationPolicyAccessGranted", "", "isNotificationListenersEnabled", "gotoNotificationPolicyAccessSetting", "", "getFilterPhoneNotifyPermissionList", "", "", "switch", "global", "(ZZ)[Ljava/lang/String;", "getPhoneNotifyPermissionList", "()[Ljava/lang/String;", "getPhoneNotifyPermissionDescList", "getPermissionName", "", "permission", "gotoNotificationAccessSetting", "isTelApp", "packageName", "isDefaultApp", "showGoSettingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "positiveCallback", "Lkotlin/Function0;", "showAlertPermissionDialog", "negativeCallback", "showDialog", "titleId", "positiveId", "negativeId", "getNotificationSet", "callBack", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "notifyEnabled", "allEnable", "screenOnNewNotification", "isNotifyStatusOnScreenLockEnable", "isOnlyWear", "isSyncAllNotifySwitchStatusEnable", "setSyncAllNotifySwitchStatusEnable", "enable", "updateNotificationSettings", "isNotifySwitchStatusEnable", "setNotifySwitchStatus", "getNotifyEnableList", "", "setNotifyEnable", "isNotifyEnable", "notifyEnableList", "", "setInCallNotifyConfig", "configStr", "setInCallResult", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCallResult", "setNotifyEnableList", "packageNameList", "updateNotifyRemindState", "updateInCallRemindState", "callEnable", "updateRemindWhenConnectDevice", "did", "getNotificationDelayTime", "", "updateNotificationRemind", "isInCallOptimizationOpen", "setInCallOptimizationOpen", "updateNotificationOnlyLockscreen", "onlyLockscreen", "sendSmsExport", TSMAuthContants.PARAM_PHONE_NUMBER, "message", "callback", "Lkotlin/Function1;", "getCustomerSelectAppInfo", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "requestNotificationPermission", "resultCodeUnit", "isDualCallWithOutBle", "accessibilityPackageName", "defaultEnableNotificationAPPList", "isTelNotifyEnable", "isNotificationEnable", "notificationGroup", "setScreenOnByNewNotificationSwitch", BaseJavaModule.METHOD_TYPE_SYNC, "updateOnlyWearEnable", "checked", "getAllAppMuteStates", "loadSilenceWhileUsingPhone", "deAttachNotify", "isCallSyncResult", "setWearOSSettingCallSync", "loadWearOSCallSync", "deAttachCallNotify", "initWearOsAllSync", "getInstallApplicationList", "setNotifyStatusOnScreenLock", "isChecked", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NotificationManagerInter {

    @NotNull
    public static final String ACCESSIBILITY_APP = "com.miui.accessibility";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String TELEPHONY_APP = "telephony_app";

    @NotNull
    public static final String XIAOMI_XMSF = "com.xiaomi.xmsf";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR!\u0010\f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u00050\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter$Companion;", "", "<init>", "()V", "XIAOMI_XMSF", "", "TELEPHONY_APP", "TELEPHONY_APP_LIST", "", "getTELEPHONY_APP_LIST", "()[Ljava/lang/String;", "[Ljava/lang/String;", "DEFAULT_OPEN_APP_LIST", "kotlin.jvm.PlatformType", "getDEFAULT_OPEN_APP_LIST", "ACCESSIBILITY_APP", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String ACCESSIBILITY_APP = "com.miui.accessibility";

        @NotNull
        public static final String TELEPHONY_APP = "telephony_app";

        @NotNull
        public static final String XIAOMI_XMSF = "com.xiaomi.xmsf";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String[] TELEPHONY_APP_LIST = {"com.android.incallui", "com.android.server.telecom", "com.android.phone", "com.android.dialer", "com.samsung.android.incallui", "com.samsung.android.dialer", "com.google.android.dialer", MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "com.samsung.android.contacts"};

        @NotNull
        private static final String[] DEFAULT_OPEN_APP_LIST = {"com.tencent.mobileqq", "com.tencent.mm", Telephony.Sms.getDefaultSmsPackage(ApplicationExtKt.getApplication())};

        private Companion() {
        }

        @NotNull
        public final String[] getDEFAULT_OPEN_APP_LIST() {
            return DEFAULT_OPEN_APP_LIST;
        }

        @NotNull
        public final String[] getTELEPHONY_APP_LIST() {
            return TELEPHONY_APP_LIST;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestNotificationPermission$default(NotificationManagerInter notificationManagerInter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestNotificationPermission");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            notificationManagerInter.requestNotificationPermission(function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendSmsExport$default(NotificationManagerInter notificationManagerInter, String str, String str2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSmsExport");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            notificationManagerInter.sendSmsExport(str, str2, function1);
        }
    }

    @NotNull
    String accessibilityPackageName();

    void deAttachCallNotify();

    void deAttachNotify();

    @NotNull
    List<String> defaultEnableNotificationAPPList();

    void getAllAppMuteStates();

    @Nullable
    InstallApplicationInfo getCustomerSelectAppInfo(@NotNull String packageName);

    @NotNull
    String[] getFilterPhoneNotifyPermissionList(boolean z, boolean global);

    @Nullable
    InCall getInCallResult();

    @NotNull
    List<InstallApplicationInfo> getInstallApplicationList();

    long getNotificationDelayTime();

    void getNotificationSet(@NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack);

    @Nullable
    List<String> getNotifyEnableList();

    int getPermissionName(@NotNull String permission);

    @NotNull
    String[] getPhoneNotifyPermissionDescList();

    @NotNull
    String[] getPhoneNotifyPermissionList();

    void gotoNotificationAccessSetting();

    void gotoNotificationPolicyAccessSetting();

    void initWearOsAllSync();

    boolean isCallSyncResult();

    boolean isDefaultApp(@NotNull String packageName);

    boolean isDualCallWithOutBle();

    boolean isInCallOptimizationOpen();

    boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull String notificationGroup);

    boolean isNotificationListenersEnabled();

    boolean isNotificationPolicyAccessGranted();

    boolean isNotifyEnable(@NotNull String packageName, @NotNull List<String> notifyEnableList);

    boolean isNotifyStatusOnScreenLockEnable(@NotNull String did);

    boolean isNotifySwitchStatusEnable();

    boolean isNotifySwitchStatusEnable(@NotNull String did);

    boolean isSyncAllNotifySwitchStatusEnable();

    boolean isTelApp(@NotNull String packageName);

    boolean isTelNotifyEnable(@NotNull String did);

    void loadSilenceWhileUsingPhone();

    void loadWearOSCallSync();

    void requestNotificationPermission(@Nullable Function1<? super Integer, Unit> resultCodeUnit);

    void sendSmsExport(@NotNull String phoneNumber, @NotNull String message, @Nullable Function1<? super Boolean, Unit> callback);

    void setInCallNotifyConfig(@NotNull String configStr);

    void setInCallOptimizationOpen();

    void setInCallResult(@NotNull InCall inCall);

    void setNotifyEnable(@NotNull String packageName, boolean enable);

    void setNotifyEnableList(@NotNull List<String> packageNameList);

    void setNotifyStatusOnScreenLock(boolean isChecked);

    void setNotifySwitchStatus(boolean enable);

    void setScreenOnByNewNotificationSwitch(@NotNull String did, boolean sync);

    void setSyncAllNotifySwitchStatusEnable(boolean enable);

    void setWearOSSettingCallSync(boolean sync);

    void showAlertPermissionDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback);

    void showDialog(@NotNull FragmentManager fragmentManager, int titleId, int contentId, int positiveId, int negativeId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback);

    void showGoSettingDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback);

    void updateInCallRemindState(boolean callEnable);

    void updateNotificationOnlyLockscreen(@NotNull String did, boolean onlyLockscreen);

    void updateNotificationRemind();

    void updateNotificationSettings(boolean notifyEnabled, boolean allEnable);

    void updateNotifyRemindState(boolean notifyEnabled);

    void updateOnlyWearEnable(@NotNull String did, boolean checked);

    void updateRemindWhenConnectDevice(@Nullable String did);
}
