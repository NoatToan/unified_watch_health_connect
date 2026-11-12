package com.xiaomi.fitness.notify.notification;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.capability.export.model.CapabilityModel;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.notify.Constant;
import com.xiaomi.fitness.notify.NotifyFragment;
import com.xiaomi.fitness.notify.data.FocusNotificationParam;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.di.NotifyModule;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.export.INotifyRemindListener;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.focus.RemoveNotification;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import defpackage.av6;
import defpackage.d2m;
import defpackage.q0j;
import defpackage.rxg;
import defpackage.sxg;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0018H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J&\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0016J4\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0016JL\u00101\u001a\u00020\n2\u0006\u0010*\u001a\u00020+2\u0006\u00102\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u001806H\u0016J\u0018\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0016J\u0010\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000106H\u0016J\u0018\u0010;\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u0005H\u0016J\u001e\u0010=\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00182\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001806H\u0016J\u0010\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020CH\u0016J\n\u0010D\u001a\u0004\u0018\u00010CH\u0016J\u0016\u0010E\u001a\u00020\n2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001806H\u0016J\u0010\u0010G\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0005H\u0016J\u0012\u0010J\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010K\u001a\u00020\nH\u0016J\b\u0010L\u001a\u00020\u0005H\u0016J\b\u0010M\u001a\u00020\nH\u0016J\u0018\u0010N\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u0005H\u0016J.\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00182\u0006\u0010R\u001a\u00020\u00182\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010&\u001a\u00020\u0018H\u0016J\b\u0010W\u001a\u00020\u0005H\u0016J\b\u0010X\u001a\u00020\u0018H\u0016J\u001e\u0010Y\u001a\u00020\n2\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010TH\u0016J\b\u0010[\u001a\u00020\u0005H\u0016J\b\u0010\\\u001a\u00020\u0005H\u0016J\u007f\u0010]\u001a\u00020\n2u\u0010^\u001aq\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(9\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(b\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(c\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020\n0_H\u0016J\u0010\u0010e\u001a\u00020\n2\u0006\u0010f\u001a\u00020gH\u0016J&\u0010h\u001a\u00020\n2\u0006\u0010f\u001a\u00020g2\u0006\u0010i\u001a\u00020\u00052\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0.H\u0016J\b\u0010j\u001a\u00020kH\u0016J\u0018\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u0010H\u0016J\u0018\u0010p\u001a\u00020\u00052\u0006\u0010m\u001a\u00020n2\u0006\u0010q\u001a\u00020\u0005H\u0016J\u0006\u0010r\u001a\u00020\u0005J\u0006\u0010s\u001a\u00020\u0005J\b\u0010t\u001a\u00020uH\u0016J \u0010v\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010w\u001a\u00020x2\u0006\u0010m\u001a\u00020nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006y"}, d2 = {"Lcom/xiaomi/fitness/notify/notification/NotificationManagerExport;", "Lcom/xiaomi/fitness/notify/export/NotificationManagerExportInter;", "<init>", "()V", "isNotificationPolicyAccessGranted", "", "isNotificationListenersEnabled", "notifyRemindListener", "Lcom/xiaomi/fitness/notify/export/INotifyRemindListener;", "addNotifyRemindListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeNotifyRemindListener", "onHideRemindBannerItemView", "onShowRemindBannerItemView", "remindType", "", "toGoalPage", "mContext", "Landroid/content/Context;", "getIsOutGoingCall", "gotoNotificationPolicyAccessSetting", "getFilterPhoneNotifyPermissionList", "", "", "switch", "global", "(ZZ)[Ljava/lang/String;", "getPhoneNotifyPermissionList", "()[Ljava/lang/String;", "getPhoneNotifyPermissionDescList", "getPermissionName", "permission", "isShowNotificationItemOpenAlert", "did", "hideNotificationItemOpenAlert", "gotoNotificationAccessSetting", "isTelApp", "packageName", "isDefaultApp", "isNotifyServiceRunning", "showGoSettingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "positiveCallback", "Lkotlin/Function0;", "showAlertPermissionDialog", "negativeCallback", "showDialog", "titleId", "positiveId", "negativeId", "defaultEnableNotificationAPPList", "", "updateNotificationSettings", "notifyEnabled", "allEnable", "getNotifyEnableList", "setNotifyEnable", "enable", "isNotifyEnable", "notifyEnableList", "setInCallNotifyConfig", "configStr", "setInCallResult", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCallResult", "setNotifyEnableList", "packageNameList", "updateNotifyRemindState", "updateInCallRemindState", "callEnable", "updateRemindWhenConnectDevice", "updateNotificationRemind", "isInCallOptimizationOpen", "setInCallOptimizationOpen", "updateNotificationOnlyLockscreen", "onlyLockscreen", "sendSmsExport", TSMAuthContants.PARAM_PHONE_NUMBER, "message", "callback", "Lkotlin/Function1;", "getCustomerSelectAppInfo", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "isDualCallWithOutBle", "accessibilityPackageName", "requestNotificationPermission", "resultCodeUnit", "isNotifySwitchStatusEnable", "isCallSwitchStatusEnable", "getNotificationSet", "callBack", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "screenOnNewNotification", "isNotifyStatusOnScreenLockEnable", "isOnlyWear", "showLastCloseAlert", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "showNotificationNeedSettingDialog", "isMustShowRemindIfPowerLimit", "newNotifiFragment", "Landroidx/fragment/app/Fragment;", "handleFocusNotificationRemove", "notifyData", "", "reason", "handleFocusNotificationPostDisable", "updatable", "isNeedHFPDisconnect", "isHFPConnect", "isSupportSendPhoneNotification", "Lcom/mi/fitness/capability/export/model/CapabilityModel;", "handleFocusNotification", "focusNotificationParam", "Lcom/xiaomi/fitness/notify/data/FocusNotificationParam;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationManagerExport implements NotificationManagerExportInter {

    @Nullable
    private INotifyRemindListener notifyRemindListener;

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public String accessibilityPackageName() {
        return NotifyStartExtKt.getNotificationManagerImpl().accessibilityPackageName();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void addNotifyRemindListener(@NotNull INotifyRemindListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.notifyRemindListener == null) {
            this.notifyRemindListener = listener;
        }
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public List<String> defaultEnableNotificationAPPList() {
        return NotifyStartExtKt.getNotificationManagerImpl().defaultEnableNotificationAPPList();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @Nullable
    public InstallApplicationInfo getCustomerSelectAppInfo(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return NotifyStartExtKt.getNotificationManagerImpl().getCustomerSelectAppInfo(packageName);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public String[] getFilterPhoneNotifyPermissionList(boolean z, boolean global) {
        return NotifyStartExtKt.getNotificationManagerImpl().getFilterPhoneNotifyPermissionList(z, global);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @Nullable
    public InCall getInCallResult() {
        return NotifyStartExtKt.getNotificationManagerImpl().getInCallResult();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean getIsOutGoingCall() {
        return Constant.INSTANCE.isInOutGoingCall();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void getNotificationSet(@NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        NotifyStartExtKt.getNotificationManagerImpl().getNotificationSet(callBack);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @Nullable
    public List<String> getNotifyEnableList() {
        return NotifyStartExtKt.getNotificationManagerImpl().getNotifyEnableList();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public int getPermissionName(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return NotifyStartExtKt.getNotificationManagerImpl().getPermissionName(permission);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public String[] getPhoneNotifyPermissionDescList() {
        return NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionDescList();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public String[] getPhoneNotifyPermissionList() {
        return NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionList();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void gotoNotificationAccessSetting() {
        NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void gotoNotificationPolicyAccessSetting() {
        NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationPolicyAccessSetting();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void handleFocusNotification(@NotNull String packageName, @NotNull FocusNotificationParam focusNotificationParam, @NotNull Object notifyData) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(focusNotificationParam, "focusNotificationParam");
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        NotifyStartExtKt.getNotificationFocusManager().handleFocusNotification(packageName, focusNotificationParam, (rxg) notifyData);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean handleFocusNotificationPostDisable(@NotNull Object notifyData, boolean updatable) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        return NotifyStartExtKt.getNotificationFocusManager().handleFocusNotificationPostDisable((rxg) notifyData, updatable);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void handleFocusNotificationRemove(@NotNull Object notifyData, int reason) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        rxg rxgVar = (rxg) notifyData;
        sxg sxgVar = new sxg();
        sxgVar.c = rxgVar.i;
        sxgVar.d = rxgVar.c;
        sxgVar.e = rxgVar.j;
        sxgVar.f = rxgVar.f33036k;
        NotifyStartExtKt.getNotificationFocusManager().handleFocusNotificationRemove(CollectionsKt__CollectionsKt.mutableListOf(new RemoveNotification(reason, sxgVar)));
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void hideNotificationItemOpenAlert(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference.INSTANCE.hideNotificationItemOpenAlert(did);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isCallSwitchStatusEnable() {
        InCall inCallResult;
        InCall inCallResult2;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            if (!NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
                WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                if (wearableDeviceModel2 != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
                    DeviceSettingManager companion2 = DeviceSettingManager.INSTANCE.getInstance();
                    T currentDeviceModel = DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
                    Intrinsics.checkNotNull(currentDeviceModel);
                    Object objValueToObject = companion2.readSettingItem(((WearableDeviceModel) currentDeviceModel).getDid(), DeviceSettingConfigKey.KEY_INCALL).valueToObject(InCall.class);
                    InCall inCall = objValueToObject instanceof InCall ? (InCall) objValueToObject : null;
                    if (inCall == null || !inCall.isIncallNotifyEnabled()) {
                        return false;
                    }
                } else {
                    if (!NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                        return false;
                    }
                    Application application = ApplicationExtKt.getApplication();
                    NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                    InCall inCallResult3 = NotifyStartExtKt.getNotificationManagerImpl().getInCallResult();
                    String[] filterPhoneNotifyPermissionList = notificationManagerImpl.getFilterPhoneNotifyPermissionList(inCallResult3 != null && inCallResult3.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
                    if (!PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length)) || (inCallResult = NotifyStartExtKt.getNotificationManagerImpl().getInCallResult()) == null || !inCallResult.isIncallNotifyEnabled() || (inCallResult2 = NotifyStartExtKt.getNotificationManagerImpl().getInCallResult()) == null || !inCallResult2.isIncallNameDisplayEnabled()) {
                        return false;
                    }
                }
            }
        } else {
            if (!NotifyStartExtKt.getNotificationManagerImpl().isCallSyncResult()) {
                return false;
            }
            Application application2 = ApplicationExtKt.getApplication();
            String[] wearOsCallpermissionList = NotifyUtil.INSTANCE.getWearOsCallpermissionList();
            if (!PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(wearOsCallpermissionList, wearOsCallpermissionList.length))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isDefaultApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        for (String str : NotificationManagerInter.INSTANCE.getDEFAULT_OPEN_APP_LIST()) {
            if (Intrinsics.areEqual(str, packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isDualCallWithOutBle() {
        return NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle();
    }

    public final boolean isHFPConnect() {
        return ConfigPreference.INSTANCE.getIS_HFP_CONNECT();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isInCallOptimizationOpen() {
        return NotifyStartExtKt.getNotificationManagerImpl().isInCallOptimizationOpen();
    }

    public final boolean isNeedHFPDisconnect() {
        int i = SystemProperties.INSTANCE.getInt("ro.build.date.utc", 0);
        Logger.i(NotifyModule.TAG, "dataUTC :" + i);
        boolean z = i > 1740758400;
        boolean z2 = Build.VERSION.SDK_INT > 34;
        Logger.i(NotifyModule.TAG, "buildDateSufficient :" + z + ", isAboveAndroidU :" + z2 + " , isHFPConnect :" + isHFPConnect());
        return z && z2 && !isHFPConnect();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isNotificationListenersEnabled() {
        return NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isNotificationPolicyAccessGranted() {
        return NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isNotifyEnable(@NotNull String packageName, @NotNull List<String> notifyEnableList) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(notifyEnableList, "notifyEnableList");
        return NotifyStartExtKt.getNotificationManagerImpl().isNotifyEnable(packageName, notifyEnableList);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isNotifyServiceRunning() {
        return Constant.INSTANCE.isServiceCreated();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isNotifySwitchStatusEnable() {
        return NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable() && NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isShowNotificationItemOpenAlert(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return NotifyPreference.INSTANCE.isShowNotificationItemOpenAlert(did);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public CapabilityModel isSupportSendPhoneNotification() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 2;
        if (i2 >= 31) {
            if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE")) {
                Logger.i(NotifyModule.TAG, "provideSendPhoneCallNotification Android S READ_PHONE_STATE permission granted");
            } else {
                Logger.i(NotifyModule.TAG, "provideSendPhoneCallNotification Android S  READ_PHONE_STATE permission not granted");
                i3 = 0;
            }
        }
        if (RomUtils.isXiaomi() && i2 > 32 && !isNeedHFPDisconnect()) {
            try {
                String string = Settings.Global.getString(AppUtil.getApp().getContentResolver(), "bluetooth_wearable_watch_hfp_active_switch");
                Logger.i(NotifyModule.TAG, "hfpswitch :" + string);
                i = (string == null || !Intrinsics.areEqual(string, "true")) ? i3 : 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new CapabilityModel(i);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public boolean isTelApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return NotifyStartExtKt.getNotificationManagerImpl().isTelApp(packageName);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    @NotNull
    public Fragment newNotifiFragment() {
        NotifyFragment notifyFragment = new NotifyFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(NotifyFragment.sIsUBoxUI, true);
        notifyFragment.setArguments(bundle);
        return notifyFragment;
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void onHideRemindBannerItemView() {
        INotifyRemindListener iNotifyRemindListener = this.notifyRemindListener;
        if (iNotifyRemindListener == null || iNotifyRemindListener == null) {
            return;
        }
        iNotifyRemindListener.onHideRemindBannerItemView();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void onShowRemindBannerItemView(int remindType) {
        INotifyRemindListener iNotifyRemindListener = this.notifyRemindListener;
        if (iNotifyRemindListener == null || iNotifyRemindListener == null) {
            return;
        }
        iNotifyRemindListener.onShowRemindBannerItemView(remindType);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void removeNotifyRemindListener() {
        this.notifyRemindListener = null;
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void requestNotificationPermission(@Nullable Function1<? super Integer, Unit> resultCodeUnit) {
        NotifyStartExtKt.getNotificationManagerImpl().requestNotificationPermission(resultCodeUnit);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void sendSmsExport(@NotNull String phoneNumber, @NotNull String message, @Nullable Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(message, "message");
        NotifyStartExtKt.getNotificationManagerImpl().sendSmsExport(phoneNumber, message, callback);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void setInCallNotifyConfig(@NotNull String configStr) {
        Intrinsics.checkNotNullParameter(configStr, "configStr");
        NotifyStartExtKt.getNotificationManagerImpl().setInCallNotifyConfig(configStr);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void setInCallOptimizationOpen() {
        NotifyStartExtKt.getNotificationManagerImpl().setInCallOptimizationOpen();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void setInCallResult(@NotNull InCall inCall) {
        Intrinsics.checkNotNullParameter(inCall, "inCall");
        NotifyStartExtKt.getNotificationManagerImpl().setInCallResult(inCall);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void setNotifyEnable(@NotNull String packageName, boolean enable) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        NotifyStartExtKt.getNotificationManagerImpl().setNotifyEnable(packageName, enable);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void setNotifyEnableList(@NotNull List<String> packageNameList) {
        Intrinsics.checkNotNullParameter(packageNameList, "packageNameList");
        NotifyStartExtKt.getNotificationManagerImpl().setNotifyEnableList(packageNameList);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void showAlertPermissionDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        NotifyStartExtKt.getNotificationManagerImpl().showAlertPermissionDialog(fragmentManager, contentId, positiveCallback, negativeCallback);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void showDialog(@NotNull FragmentManager fragmentManager, int titleId, int contentId, int positiveId, int negativeId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        NotifyStartExtKt.getNotificationManagerImpl().showDialog(fragmentManager, titleId, contentId, positiveId, negativeId, positiveCallback, negativeCallback);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void showGoSettingDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        NotifyStartExtKt.getNotificationManagerImpl().showGoSettingDialog(fragmentManager, contentId, positiveCallback);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void showLastCloseAlert(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        new CommonDialog.c("lastCloseAlertDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(q0j.M, new Object[0])).setNeutralText(q0j.common_known).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.notification.NotificationManagerExport.showLastCloseAlert.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else if (which == -1 && dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(supportFragmentManager, "");
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void showNotificationNeedSettingDialog(@NotNull FragmentActivity fragmentActivity, boolean isMustShowRemindIfPowerLimit, @NotNull final Function0<Unit> callBack) {
        DialogParams.DialogDescriptionString dialogDescriptionString;
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (!isMustShowRemindIfPowerLimit && DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() == 0) {
            callBack.invoke();
            return;
        }
        if (AppUtil.INSTANCE.isPlayChannel()) {
            callBack.invoke();
            return;
        }
        boolean zY = RomUtils.isXiaomi() ? true : d2m.y(fragmentActivity);
        Logger.i(NotifyModule.TAG, "showIgnoringBatteryOptimizationsDialog isIgnoringBatteryOptimizations :" + zY);
        if (zY) {
            callBack.invoke();
            return;
        }
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        long remindPowerIgnoreTime = notifyPreference.getRemindPowerIgnoreTime();
        RomUtils romUtils = RomUtils.INSTANCE;
        long j = (romUtils.isVivo() || romUtils.isOppo()) ? 86400L : 259200L;
        if (!isMustShowRemindIfPowerLimit && (System.currentTimeMillis() / ((long) 1000)) - remindPowerIgnoreTime < j) {
            callBack.invoke();
            return;
        }
        notifyPreference.setRemindPowerIgnoreTime(System.currentTimeMillis() / ((long) 1000));
        if (romUtils.isOppo()) {
            dialogDescriptionString = new DialogParams.DialogDescriptionString(q0j.J, new Object[0]);
        } else {
            dialogDescriptionString = romUtils.isVivo() ? new DialogParams.DialogDescriptionString(q0j.H, new Object[0]) : new DialogParams.DialogDescriptionString(q0j.G, new Object[0]);
        }
        CommonDialog.c canceledOnTouchOutside = new CommonDialog.c("showAllowBackgroundActivitySettingDialog").setDialogTitle(q0j.I).setDialogDescriptionString(dialogDescriptionString).setPositiveText((romUtils.isOppo() || romUtils.isVivo()) ? q0j.K : q0j.B).setCanceledOnTouchOutside(true);
        if (!romUtils.isOppo() && !romUtils.isVivo()) {
            canceledOnTouchOutside.setNegativeText(q0j.common_cancel);
        }
        canceledOnTouchOutside.create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.notification.NotificationManagerExport.showNotificationNeedSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    callBack.invoke();
                } else {
                    if (which != -1) {
                        return;
                    }
                    RomUtils romUtils2 = RomUtils.INSTANCE;
                    if (!romUtils2.isOppo() && !romUtils2.isVivo()) {
                        SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceKeepAliveGuideActivity(true);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(fragmentActivity.getSupportFragmentManager(), "");
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void toGoalPage(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        if (GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).isShowGoalGuid()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(mContext, null, bundle);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateInCallRemindState(boolean callEnable) {
        NotifyStartExtKt.getNotificationManagerImpl().updateInCallRemindState(callEnable);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateNotificationOnlyLockscreen(@NotNull String did, boolean onlyLockscreen) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyStartExtKt.getNotificationManagerImpl().updateNotificationOnlyLockscreen(did, onlyLockscreen);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateNotificationRemind() {
        NotifyStartExtKt.getNotificationManagerImpl().updateNotificationRemind();
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateNotificationSettings(boolean notifyEnabled, boolean allEnable) {
        NotifyStartExtKt.getNotificationManagerImpl().updateNotificationSettings(notifyEnabled, allEnable);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateNotifyRemindState(boolean notifyEnabled) {
        NotifyStartExtKt.getNotificationManagerImpl().updateNotifyRemindState(notifyEnabled);
    }

    @Override // com.xiaomi.fitness.notify.export.NotificationManagerExportInter
    public void updateRemindWhenConnectDevice(@Nullable String did) {
        NotifyStartExtKt.getNotificationManagerImpl().updateRemindWhenConnectDevice(did);
    }
}
