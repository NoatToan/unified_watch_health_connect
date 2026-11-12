package com.xiaomi.fitness.notify.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.notify.BleNotifyModel;
import com.xiaomi.fitness.notify.DeviceNotificationSettingManager;
import com.xiaomi.fitness.notify.HuaMiNotifySettingImpl;
import com.xiaomi.fitness.notify.data.InstallApplicationInfo;
import com.xiaomi.fitness.notify.di.NotifyModule;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.notification.NotificationManagerImpl;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import defpackage.q0j;
import defpackage.xni;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J&\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0016J4\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0016JL\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0016J\u007f\u0010)\u001a\u00020\f2u\u0010*\u001aq\u0012\u0013\u0012\u00110\t¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\t¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\f0+H\u0016J\b\u00103\u001a\u00020\tH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u00020\f2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0016J\b\u00107\u001a\u00020\tH\u0016J\u0010\u00108\u001a\u00020\f2\u0006\u00105\u001a\u00020\tH\u0016J\u0010\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010:H\u0016J\u0018\u0010;\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u00105\u001a\u00020\tH\u0016J\u001e\u0010<\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100>H\u0016J\u0010\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u0010H\u0016J\u0010\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020CH\u0016J\n\u0010D\u001a\u0004\u0018\u00010CH\u0016J\u0016\u0010E\u001a\u00020\f2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100>H\u0016J\u0010\u0010G\u001a\u00020\f2\u0006\u0010.\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010I\u001a\u00020\tH\u0016J\u0012\u0010J\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\tH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u0018\u0010Q\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\tH\u0016J.\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u00102\u0006\u0010U\u001a\u00020\u00102\u0014\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u001e\u0010`\u001a\u00020\f2\u0014\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0018\u00010WH\u0016J\b\u0010b\u001a\u00020\tH\u0016J\b\u0010c\u001a\u00020\u0010H\u0016J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00100>H\u0016J\u0010\u0010e\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0010H\u0016J\u0010\u00101\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0010H\u0016J\u0010\u00107\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u0010H\u0016J \u0010f\u001a\u00020\t2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\u0010H\u0016J\u0018\u0010h\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010i\u001a\u00020\tH\u0016J\u0018\u0010j\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\tH\u0016J\b\u0010l\u001a\u00020\fH\u0016J\b\u0010m\u001a\u00020\fH\u0016J\b\u0010n\u001a\u00020\fH\u0016J\b\u0010o\u001a\u00020\tH\u0016J\u0010\u0010p\u001a\u00020\f2\u0006\u0010i\u001a\u00020\tH\u0016J\b\u0010q\u001a\u00020\fH\u0016J\b\u0010r\u001a\u00020\fH\u0016J\b\u0010s\u001a\u00020\fH\u0016J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020Y0>H\u0016J\u0010\u0010u\u001a\u00020\f2\u0006\u0010v\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010Z\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b\\\u0010]¨\u0006w"}, d2 = {"Lcom/xiaomi/fitness/notify/notification/NotificationManagerImpl;", "Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isNotificationPolicyAccessGranted", "", "isNotificationListenersEnabled", "gotoNotificationAccessSetting", "", "gotoNotificationPolicyAccessSetting", "getFilterPhoneNotifyPermissionList", "", "", "switch", "global", "(ZZ)[Ljava/lang/String;", "getPhoneNotifyPermissionList", "()[Ljava/lang/String;", "getPhoneNotifyPermissionDescList", "getPermissionName", "", "permission", "isTelApp", "packageName", "isDefaultApp", "showGoSettingDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "contentId", "positiveCallback", "Lkotlin/Function0;", "showAlertPermissionDialog", "negativeCallback", "showDialog", "titleId", "positiveId", "negativeId", "getNotificationSet", "callBack", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "notifyEnabled", "allEnable", "screenOnNewNotification", "isNotifyStatusOnScreenLockEnable", "isOnlyWear", "isSyncAllNotifySwitchStatusEnable", "setSyncAllNotifySwitchStatusEnable", "enable", "updateNotificationSettings", "isNotifySwitchStatusEnable", "setNotifySwitchStatus", "getNotifyEnableList", "", "setNotifyEnable", "isNotifyEnable", "notifyEnableList", "", "setInCallNotifyConfig", "configStr", "setInCallResult", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getInCallResult", "setNotifyEnableList", "packageNameList", "updateNotifyRemindState", "updateInCallRemindState", "callEnable", "updateRemindWhenConnectDevice", "did", "getNotificationDelayTime", "", "updateNotificationRemind", "isInCallOptimizationOpen", "setInCallOptimizationOpen", "updateNotificationOnlyLockscreen", "onlyLockscreen", "sendSmsExport", TSMAuthContants.PARAM_PHONE_NUMBER, "message", "callback", "Lkotlin/Function1;", "getCustomerSelectAppInfo", "Lcom/xiaomi/fitness/notify/data/InstallApplicationInfo;", "notificationVerifyIntent", "Landroid/content/Intent;", "getNotificationVerifyIntent", "()Landroid/content/Intent;", "notificationVerifyIntent$delegate", "Lkotlin/Lazy;", "requestNotificationPermission", "resultCodeUnit", "isDualCallWithOutBle", "accessibilityPackageName", "defaultEnableNotificationAPPList", "isTelNotifyEnable", "isNotificationEnable", "notificationGroup", "setScreenOnByNewNotificationSwitch", BaseJavaModule.METHOD_TYPE_SYNC, "updateOnlyWearEnable", "checked", "getAllAppMuteStates", "loadSilenceWhileUsingPhone", "deAttachNotify", "isCallSyncResult", "setWearOSSettingCallSync", "loadWearOSCallSync", "deAttachCallNotify", "initWearOsAllSync", "getInstallApplicationList", "setNotifyStatusOnScreenLock", "isChecked", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationManagerImpl.kt\ncom/xiaomi/fitness/notify/notification/NotificationManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,604:1\n37#2:605\n36#2,3:606\n37#2:609\n36#2,3:610\n37#2:613\n36#2,3:614\n*S KotlinDebug\n*F\n+ 1 NotificationManagerImpl.kt\ncom/xiaomi/fitness/notify/notification/NotificationManagerImpl\n*L\n86#1:605\n86#1:606,3\n165#1:609\n165#1:610,3\n171#1:613\n171#1:614,3\n*E\n"})
public final class NotificationManagerImpl implements NotificationManagerInter {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: notificationVerifyIntent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy notificationVerifyIntent;

    public NotificationManagerImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.notificationVerifyIntent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gxg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationManagerImpl.notificationVerifyIntent_delegate$lambda$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCustomerSelectAppInfo$lambda$0(List infoList) {
        Intrinsics.checkNotNullParameter(infoList, "$infoList");
        return RomUtils.INSTANCE.isMiui() && (infoList.isEmpty() ^ true);
    }

    private final Intent getNotificationVerifyIntent() {
        return (Intent) this.notificationVerifyIntent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent notificationVerifyIntent_delegate$lambda$3() {
        return new Intent("miui.intent.action.NOTIFICATION_VERIFY").putExtra("component_name", ApplicationExtKt.getApplication().getPackageName() + (AppUtil.INSTANCE.isPlayChannel() ? "/com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "/com.xiaomi.fitness.notify.NotifySyncService")).putExtra("enable", true).putExtra(MiuiCursorConstants.CONTENT, ApplicationExtKt.getApplication().getString(q0j.R));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestNotificationPermission$lambda$4(Function1 function1, int i, Intent intent) {
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public String accessibilityPackageName() {
        return "com.miui.accessibility";
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void deAttachCallNotify() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.deAttachCallNotify();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void deAttachNotify() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.deAttachNotify();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public List<String> defaultEnableNotificationAPPList() {
        return ArraysKt___ArraysKt.toList(NotificationManagerInter.INSTANCE.getDEFAULT_OPEN_APP_LIST());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void getAllAppMuteStates() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.getAllAppMuteStates();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @Nullable
    public InstallApplicationInfo getCustomerSelectAppInfo(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!Intrinsics.areEqual(packageName, NotifyStartExtKt.getNotificationManagerImpl().accessibilityPackageName())) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(packageName, "com.miui.accessibility.environment.sound.recognition.Settings"));
        final List<ResolveInfo> listQueryIntentActivities = ApplicationExtKt.getApplication().getPackageManager().queryIntentActivities(intent, 1);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Logger.i("NotifyHelp", "accessibility show:" + new Function0() { // from class: fxg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NotificationManagerImpl.getCustomerSelectAppInfo$lambda$0(listQueryIntentActivities));
            }
        });
        if (!RomUtils.INSTANCE.isMiui() || !(!listQueryIntentActivities.isEmpty())) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        ActivityInfo activityInfo = new ActivityInfo();
        String packageName2 = NotifyStartExtKt.getNotificationManagerImpl().accessibilityPackageName();
        activityInfo.packageName = packageName2;
        resolveInfo.activityInfo = activityInfo;
        Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
        String string = ApplicationExtKt.getApplication().getString(q0j.b0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), xni.d);
        Intrinsics.checkNotNull(resourceDrawable);
        return new InstallApplicationInfo(packageName2, string, resourceDrawable, false, null, 0, 56, null);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public String[] getFilterPhoneNotifyPermissionList(boolean z, boolean global) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        } else {
            arrayList.add("android.permission.CALL_PHONE");
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        }
        arrayList.add("android.permission.READ_PHONE_STATE");
        arrayList.add("android.permission.READ_CONTACTS");
        if (global && z) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        if (i >= 28) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @Nullable
    public InCall getInCallResult() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return null;
        }
        return BleNotifyModel.INSTANCE.getInCallResult(wearableDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public List<InstallApplicationInfo> getInstallApplicationList() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null ? CollectionsKt__CollectionsKt.emptyList() : deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.getInstallApplicationList();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public long getNotificationDelayTime() {
        return NotifyPreference.INSTANCE.getNotificationDelayTime();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void getNotificationSet(@NotNull Function5<? super Boolean, ? super Boolean, ? super Integer, ? super Integer, ? super Integer, Unit> callBack) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager() == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        Intrinsics.checkNotNull(wearableDeviceModel);
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.getNotificationSettings(wearableDeviceModel.getDid(), callBack);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @Nullable
    public List<String> getNotifyEnableList() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.getNotifyEnableList(wearableDeviceModel.getDid()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2.equals("android.permission.CALL_PHONE") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r2.equals("android.permission.ANSWER_PHONE_CALLS") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return defpackage.q0j.S;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getPermissionName(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1921431796: goto L46;
                case -1674700861: goto L3a;
                case -5573545: goto L2e;
                case 52602690: goto L22;
                case 112197485: goto L19;
                case 1977429404: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L4e
        Ld:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L16
            goto L4e
        L16:
            int r2 = defpackage.q0j.X
            goto L52
        L19:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto L4e
        L22:
            java.lang.String r0 = "android.permission.SEND_SMS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L4e
        L2b:
            int r2 = defpackage.q0j.Z
            goto L52
        L2e:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
            goto L4e
        L37:
            int r2 = defpackage.q0j.T
            goto L52
        L3a:
            java.lang.String r0 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L43
            goto L4e
        L43:
            int r2 = defpackage.q0j.S
            goto L52
        L46:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L50
        L4e:
            r2 = -1
            goto L52
        L50:
            int r2 = defpackage.q0j.W
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.notify.notification.NotificationManagerImpl.getPermissionName(java.lang.String):int");
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public String[] getPhoneNotifyPermissionDescList() {
        return NotifyUtil.INSTANCE.getNeedRequestPhoneNotifyPermissionDescList();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    @NotNull
    public String[] getPhoneNotifyPermissionList() {
        return NotifyUtil.INSTANCE.getNeedRequestPhoneNotifyPermissionList();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void gotoNotificationAccessSetting() {
        try {
            Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            intent.addFlags(268435456);
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void gotoNotificationPolicyAccessSetting() {
        try {
            Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
            if (Build.VERSION.SDK_INT >= 28) {
                intent.addFlags(268435456);
            }
            this.context.startActivity(intent);
        } catch (Exception e) {
            Logger.i("dnd gotoNotificationPolicyAccessSetting exception = " + e, new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void initWearOsAllSync() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.initWearOsAllSync();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isCallSyncResult() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isCallSyncResult();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isDefaultApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        for (String str : NotificationManagerInter.INSTANCE.getDEFAULT_OPEN_APP_LIST()) {
            if (Intrinsics.areEqual(str, packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isDualCallWithOutBle() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel == null || !DeviceModelExtKt.isDual(wearableDeviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NO_HFP)) ? false : true;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isInCallOptimizationOpen() {
        return NotifyPreference.INSTANCE.isInCallOptimizationOpen();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotificationEnable(@NotNull String did, @NotNull String packageName, @NotNull String notificationGroup) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(notificationGroup, "notificationGroup");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isNotificationEnable(wearableDeviceModel.getDid(), packageName, notificationGroup);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotificationListenersEnabled() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        ComponentName componentName = wearableDeviceModel != null && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel) ? new ComponentName(this.context, "com.google.android.libraries.wear.companion.notification.service.CompanionNotificationListenerService") : new ComponentName(this.context, AppUtil.INSTANCE.isPlayChannel() ? "com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "com.xiaomi.fitness.notify.NotifySyncService");
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 27) {
            return notificationManager.isNotificationListenerAccessGranted(componentName);
        }
        String packageName = this.context.getPackageName();
        String string = Settings.Secure.getString(this.context.getContentResolver(), "enabled_notification_listeners");
        if (!TextUtils.isEmpty(string)) {
            Intrinsics.checkNotNull(string);
            String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) string, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
            for (String str : strArr) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && TextUtils.equals(packageName, componentNameUnflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotificationPolicyAccessGranted() {
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).isNotificationPolicyAccessGranted();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotifyEnable(@NotNull String packageName, @NotNull List<String> notifyEnableList) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(notifyEnableList, "notifyEnableList");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isNotificationEnable(wearableDeviceModel.getDid(), packageName, notifyEnableList);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotifyStatusOnScreenLockEnable(@NotNull String did) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isNotifyStatusOnScreenLockEnable(wearableDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotifySwitchStatusEnable() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isNotifySwitchStatusEnable(wearableDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isSyncAllNotifySwitchStatusEnable() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isSyncAllNotifySwitchStatusEnable(wearableDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isTelApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        for (String str : NotificationManagerInter.INSTANCE.getTELEPHONY_APP_LIST()) {
            if (Intrinsics.areEqual(str, packageName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isTelNotifyEnable(@NotNull String did) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isTelNotifyEnable(wearableDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void loadSilenceWhileUsingPhone() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.loadSilenceWhileUsingPhone();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void loadWearOSCallSync() {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.loadWearOSCallSync();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void requestNotificationPermission(@Nullable final Function1<? super Integer, Unit> resultCodeUnit) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) currentActivity;
        if (ApplicationExtKt.getApplication().getPackageManager().resolveActivity(getNotificationVerifyIntent(), 0) == null) {
            NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
            return;
        }
        try {
            baseActivity.startForActivityResult(getNotificationVerifyIntent(), new Function2() { // from class: exg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NotificationManagerImpl.requestNotificationPermission$lambda$4(resultCodeUnit, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } catch (SecurityException unused) {
            NotifyStartExtKt.getNotificationManagerImpl().gotoNotificationAccessSetting();
        }
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void sendSmsExport(@NotNull String phoneNumber, @NotNull String message, @Nullable Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(message, "message");
        com.xiaomi.fitness.notify.extension.DeviceModelExtKt.sendSms(phoneNumber, message, callback);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setInCallNotifyConfig(@NotNull String configStr) {
        Intrinsics.checkNotNullParameter(configStr, "configStr");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        NotifyPreference.INSTANCE.setInCallNotifyConfig(wearableDeviceModel.getDid(), configStr);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setInCallOptimizationOpen() {
        NotifyPreference.INSTANCE.isInCallOptimizationOpen(true);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setInCallResult(@NotNull InCall inCall) {
        Intrinsics.checkNotNullParameter(inCall, "inCall");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        HuaMiNotifySettingImpl.INSTANCE.getInstance().setInCall(wearableDeviceModel.getDid(), inCall);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setNotifyEnable(@NotNull String packageName, boolean enable) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setNotifyEnable(wearableDeviceModel.getDid(), packageName, enable);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setNotifyEnableList(@NotNull List<String> packageNameList) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(packageNameList, "packageNameList");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setNotifyEnableList(wearableDeviceModel.getDid(), packageNameList);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setNotifyStatusOnScreenLock(boolean isChecked) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setNotifyStatusOnScreenLock(wearableDeviceModel.getDid(), isChecked);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setNotifySwitchStatus(boolean enable) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setNotifySwitchStatus(wearableDeviceModel.getDid(), enable);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setScreenOnByNewNotificationSwitch(@NotNull String did, boolean sync) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setScreenOnByNewNotificationSwitch(wearableDeviceModel.getDid(), sync);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setSyncAllNotifySwitchStatusEnable(boolean enable) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setSyncAllNotifySwitchStatusEnable(wearableDeviceModel.getDid(), enable);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void setWearOSSettingCallSync(boolean sync) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager();
        if (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.setWearOSSettingCallSync(sync);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void showAlertPermissionDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        NotifyUtil.INSTANCE.showAlertPermissionDialog(fragmentManager, contentId, positiveCallback, negativeCallback);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void showDialog(@NotNull FragmentManager fragmentManager, int titleId, int contentId, int positiveId, int negativeId, @NotNull Function0<Unit> positiveCallback, @NotNull Function0<Unit> negativeCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        Intrinsics.checkNotNullParameter(negativeCallback, "negativeCallback");
        NotifyUtil.INSTANCE.showDialog(fragmentManager, titleId, contentId, positiveId, negativeId, positiveCallback, negativeCallback);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void showGoSettingDialog(@NotNull FragmentManager fragmentManager, int contentId, @NotNull Function0<Unit> positiveCallback) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(positiveCallback, "positiveCallback");
        NotifyUtil.INSTANCE.showGoSettingDialog(fragmentManager, contentId, positiveCallback);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateInCallRemindState(boolean callEnable) {
        NotifyModule.INSTANCE.updateInCallRemindState(callEnable);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateNotificationOnlyLockscreen(@NotNull String did, boolean onlyLockscreen) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyPreference.INSTANCE.setSyncNotificationOnlyScreenLock(did, onlyLockscreen);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateNotificationRemind() {
        NotifyModule.INSTANCE.updateNotificationRemind();
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateNotificationSettings(boolean notifyEnabled, boolean allEnable) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.updateNotificationSettings(wearableDeviceModel.getDid(), notifyEnabled, allEnable);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateNotifyRemindState(boolean notifyEnabled) {
        NotifyModule.INSTANCE.updateNotifyRemindState(notifyEnabled);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateOnlyWearEnable(@NotNull String did, boolean checked) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return;
        }
        deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.updateOnlyWearEnable(wearableDeviceModel.getDid(), checked);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public void updateRemindWhenConnectDevice(@Nullable String did) {
        NotifyModule.INSTANCE.updateNotifyRemindWhenConnectDevice(did);
    }

    @Override // com.xiaomi.fitness.notify.notification.NotificationManagerInter
    public boolean isNotifySwitchStatusEnable(@NotNull String did) {
        DeviceNotificationSettingManager deviceNotificationSettingManagerProvideDeviceNotificationSettingManager;
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (deviceNotificationSettingManagerProvideDeviceNotificationSettingManager = NotifyStartExtKt.getNotifyStartHelper().provideDeviceNotificationSettingManager()) == null) {
            return false;
        }
        return deviceNotificationSettingManagerProvideDeviceNotificationSettingManager.isNotifySwitchStatusEnable(wearableDeviceModel.getDid());
    }
}
