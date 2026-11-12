package com.xiaomi.fitness.notify.export;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.notify.data.FocusNotificationParam;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0006H&J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H&¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0015H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0015H&J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0015H&J\b\u0010!\u001a\u00020\u0006H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0015H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0015H&J\b\u0010%\u001a\u00020\u0003H&J(\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+H&J6\u0010,\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010)\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+H&JL\u0010.\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u001503H&J\u0018\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u000103H&J\u0018\u00108\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0003H&J\u001e\u0010:\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00152\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001503H&J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0015H&J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@H&J\n\u0010A\u001a\u0004\u0018\u00010@H&J\u0016\u0010B\u001a\u00020\u00062\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001503H&J\u0010\u0010D\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0003H&J\u0010\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0003H&J\u0012\u0010G\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015H&J\b\u0010H\u001a\u00020\u0006H&J\b\u0010I\u001a\u00020\u0003H&J\b\u0010J\u001a\u00020\u0006H&J\u0018\u0010K\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u0003H&J0\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00152\u0016\b\u0002\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010QH&J\u0012\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010#\u001a\u00020\u0015H&J\b\u0010T\u001a\u00020\u0003H&J\b\u0010U\u001a\u00020\u0015H&J \u0010V\u001a\u00020\u00062\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010QH&J\b\u0010X\u001a\u00020\u0003H&J\b\u0010Y\u001a\u00020\u0003H&J\u007f\u0010Z\u001a\u00020\u00062u\u0010[\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110\r¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(_\u0012\u0013\u0012\u00110\r¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(`\u0012\u0013\u0012\u00110\r¢\u0006\f\b]\u0012\b\b^\u0012\u0004\b\b(a\u0012\u0004\u0012\u00020\u00060\\H&J\u0010\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020dH&J \u0010e\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00152\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0001H&J&\u0010i\u001a\u00020\u00062\u0006\u0010c\u001a\u00020d2\u0006\u0010j\u001a\u00020\u00032\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060+H&J\b\u0010k\u001a\u00020lH&J\u0018\u0010m\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00012\u0006\u0010n\u001a\u00020\rH&J\u0018\u0010o\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00012\u0006\u0010p\u001a\u00020\u0003H&J\b\u0010q\u001a\u00020rH&¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/notify/export/NotificationManagerExportInter;", "", "isNotificationPolicyAccessGranted", "", "isNotificationListenersEnabled", "addNotifyRemindListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/notify/export/INotifyRemindListener;", "removeNotifyRemindListener", "onHideRemindBannerItemView", "onShowRemindBannerItemView", "remindType", "", "toGoalPage", "mContext", "Landroid/content/Context;", "getIsOutGoingCall", "gotoNotificationPolicyAccessSetting", "getFilterPhoneNotifyPermissionList", "", "", "switch", "global", "(ZZ)[Ljava/lang/String;", "getPhoneNotifyPermissionList", "()[Ljava/lang/String;", "getPhoneNotifyPermissionDescList", "getPermissionName", "permission", "isShowNotificationItemOpenAlert", "did", "hideNotificationItemOpenAlert", "gotoNotificationAccessSetting", "isTelApp", "packageName", "isDefaultApp", "isNotifyServiceRunning", "showGoSettingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "positiveCallback", "Lkotlin/Function0;", "showAlertPermissionDialog", "negativeCallback", "showDialog", "titleId", "positiveId", "negativeId", "defaultEnableNotificationAPPList", "", "updateNotificationSettings", "notifyEnabled", "allEnable", "getNotifyEnableList", "setNotifyEnable", "enable", "isNotifyEnable", "notifyEnableList", "setInCallNotifyConfig", "configStr", "setInCallResult", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCallResult", "setNotifyEnableList", "packageNameList", "updateNotifyRemindState", "updateInCallRemindState", "callEnable", "updateRemindWhenConnectDevice", "updateNotificationRemind", "isInCallOptimizationOpen", "setInCallOptimizationOpen", "updateNotificationOnlyLockscreen", "onlyLockscreen", "sendSmsExport", TSMAuthContants.PARAM_PHONE_NUMBER, "message", "callback", "Lkotlin/Function1;", "getCustomerSelectAppInfo", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "isDualCallWithOutBle", "accessibilityPackageName", "requestNotificationPermission", "resultCodeUnit", "isNotifySwitchStatusEnable", "isCallSwitchStatusEnable", "getNotificationSet", "callBack", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "screenOnNewNotification", "isNotifyStatusOnScreenLockEnable", "isOnlyWear", "showLastCloseAlert", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "handleFocusNotification", "focusNotificationParam", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "notifyData", "showNotificationNeedSettingDialog", "isMustShowRemindIfPowerLimit", "newNotifiFragment", "Landroidx/fragment/app/Fragment;", "handleFocusNotificationRemove", "reason", "handleFocusNotificationPostDisable", "updatable", "isSupportSendPhoneNotification", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "notify-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NotificationManagerExportInter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestNotificationPermission$default(NotificationManagerExportInter notificationManagerExportInter, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestNotificationPermission");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            notificationManagerExportInter.requestNotificationPermission(function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void sendSmsExport$default(NotificationManagerExportInter notificationManagerExportInter, String str, String str2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSmsExport");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            notificationManagerExportInter.sendSmsExport(str, str2, function1);
        }
    }

    @NotNull
    String accessibilityPackageName();

    void addNotifyRemindListener(@NotNull INotifyRemindListener listener);

    @NotNull
    List<String> defaultEnableNotificationAPPList();

    @Nullable
    InstallApplicationInfo getCustomerSelectAppInfo(@NotNull String packageName);

    @NotNull
    String[] getFilterPhoneNotifyPermissionList(boolean z, boolean global);

    @Nullable
    InCall getInCallResult();

    boolean getIsOutGoingCall();

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

    void handleFocusNotification(@NotNull String packageName, @NotNull FocusNotificationParam focusNotificationParam, @NotNull Object notifyData);

    boolean handleFocusNotificationPostDisable(@NotNull Object notifyData, boolean updatable);

    void handleFocusNotificationRemove(@NotNull Object notifyData, int reason);

    void hideNotificationItemOpenAlert(@NotNull String did);

    boolean isCallSwitchStatusEnable();

    boolean isDefaultApp(@NotNull String packageName);

    boolean isDualCallWithOutBle();

    boolean isInCallOptimizationOpen();

    boolean isNotificationListenersEnabled();

    boolean isNotificationPolicyAccessGranted();

    boolean isNotifyEnable(@NotNull String packageName, @NotNull List<String> notifyEnableList);

    boolean isNotifyServiceRunning();

    boolean isNotifySwitchStatusEnable();

    boolean isShowNotificationItemOpenAlert(@NotNull String did);

    @NotNull
    CapabilityModel isSupportSendPhoneNotification();

    boolean isTelApp(@NotNull String packageName);

    @NotNull
    Fragment newNotifiFragment();

    void onHideRemindBannerItemView();

    void onShowRemindBannerItemView(int remindType);

    void removeNotifyRemindListener();

    void requestNotificationPermission(@Nullable Function1<? super Integer, Unit> resultCodeUnit);

    void sendSmsExport(@NotNull String phoneNumber, @NotNull String message, @Nullable Function1<? super Boolean, Unit> callback);

    void setInCallNotifyConfig(@NotNull String configStr);

    void setInCallOptimizationOpen();

    void setInCallResult(@NotNull InCall inCall);

    void setNotifyEnable(@NotNull String packageName, boolean enable);

    void setNotifyEnableList(@NotNull List<String> packageNameList);

    void showAlertPermissionDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback);

    void showDialog(@NotNull FragmentManager fragmentManager, int titleId, int contentId, int positiveId, int negativeId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback);

    void showGoSettingDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback);

    void showLastCloseAlert(@NotNull FragmentActivity fragmentActivity);

    void showNotificationNeedSettingDialog(@NotNull FragmentActivity fragmentActivity, boolean isMustShowRemindIfPowerLimit, @NotNull Function0<Unit> callBack);

    void toGoalPage(@NotNull Context mContext);

    void updateInCallRemindState(boolean callEnable);

    void updateNotificationOnlyLockscreen(@NotNull String did, boolean onlyLockscreen);

    void updateNotificationRemind();

    void updateNotificationSettings(boolean notifyEnabled, boolean allEnable);

    void updateNotifyRemindState(boolean notifyEnabled);

    void updateRemindWhenConnectDevice(@Nullable String did);
}
