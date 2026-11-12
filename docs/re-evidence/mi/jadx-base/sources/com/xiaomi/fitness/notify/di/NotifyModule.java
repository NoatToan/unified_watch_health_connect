package com.xiaomi.fitness.notify.di;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.export.bean.TabDeviceBannerSettingsItem;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.notify.di.NotifyModule;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.notify.focus.NotificationFocusInterface;
import com.xiaomi.fitness.notify.focus.NotificationFocusManager;
import com.xiaomi.fitness.notify.notification.NotificationManagerExport;
import com.xiaomi.fitness.notify.notification.NotificationManagerImpl;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import com.xiaomi.fitness.notify.util.NotifyUtil;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import defpackage.d2m;
import defpackage.q0j;
import defpackage.xni;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH'¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/notify/di/NotifyModule;", "", "<init>", "()V", "bindNotificationFocusManager", "Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface;", "notificationFocusManager", "Lcom/xiaomi/fitness/notify/focus/NotificationFocusManager;", "bindNotificationManagerImpl", "Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter;", "notificationManagerImpl", "Lcom/xiaomi/fitness/notify/notification/NotificationManagerImpl;", "bindNotificationManagerExport", "Lcom/xiaomi/fitness/notify/export/NotificationManagerExportInter;", "Lcom/xiaomi/fitness/notify/notification/NotificationManagerExport;", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NotifyModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final long NOTIFICATION_DELAY_CLOSE_DURATION_TIME = 172800000;
    private static final long NOTIFICATION_UN_LIMIT_CLOSE_DURATION_TIME = 86400000;

    @NotNull
    public static final String TAG = "NotifyModule";

    @NotNull
    private static TabDeviceBannerSettingsItem deviceBannerSettingsItem;

    @NotNull
    private static final Lazy<Intent> intent$delegate;

    @Nullable
    private static TabContentItem mCallNotifyItem;

    @Nullable
    private static TabContentItem mNotifyItem;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0007J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dJ5\u0010 \u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001bH\u0002J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u0005J\u0006\u0010+\u001a\u00020\u001bJ\u001a\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J)\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001d2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001b03¢\u0006\u0002\b5H\u0002J!\u00106\u001a\u00020\u001b2\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001b03¢\u0006\u0002\b5H\u0002J\u0010\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u0005H\u0002J\b\u00109\u001a\u00020\u001bH\u0002J\u0016\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020<H\u0082@¢\u0006\u0002\u0010=J\u008a\u0001\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020(2\b\b\u0001\u0010@\u001a\u00020(2\b\b\u0001\u0010A\u001a\u00020(2\n\b\u0003\u0010B\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010C\u001a\u00020\u001d2\b\b\u0002\u0010D\u001a\u00020\u001d2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010F\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u001b\u0018\u0001032\u001b\b\u0002\u0010G\u001a\u0015\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u001d\u0018\u000103¢\u0006\u0002\b5H\u0002¢\u0006\u0002\u0010IR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/notify/di/NotifyModule$Companion;", "", "<init>", "()V", "TAG", "", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "intent$delegate", "Lkotlin/Lazy;", "NOTIFICATION_DELAY_CLOSE_DURATION_TIME", "", "NOTIFICATION_UN_LIMIT_CLOSE_DURATION_TIME", "provideBannerSettingsItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "deviceBannerSettingsItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabDeviceBannerSettingsItem;", "createBannerSettingsItem", "provideNotifyItem", "mNotifyItem", "createNotifyItem", "provideCallNotifyItem", "mCallNotifyItem", "createCallNotifyItem", "updateNotifyRemindState", "", "notifyEnabled", "", "updateInCallRemindState", "callEnable", "updateRemindType", "callEnabled", "showNotificationDelayRemind", "showUnLimitRemind", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "hideRemindBanner", "showRemindBanner", "remindType", "", "updateNotifyRemindWhenConnectDevice", "did", "updateNotificationRemind", "onActivityResultByRequestNotification", "resultCode", "data", "requestInCallPermission", "requestContactsPermission", "isInCallOptimizationOpen", "extension", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/MultiplePermissionsBuilder;", "Lkotlin/ExtensionFunctionType;", "requestPhonePermission", "showPermissionDeniedDialog", "permission", "openNotification", "getIgnoringBatteryOptimizations", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createFeatureItem", "type", "icon", "title", Column.SUBTITLE, "more", "remind", "remindText", "onClickListener", "itemVisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(IIILjava/lang/Integer;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TabDeviceBannerSettingsItem createBannerSettingsItem() {
            NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
            boolean z = false;
            int i = 1;
            final boolean z2 = notifyPreference.isNeedShowNotificationRemind() && !NotifyUtil.INSTANCE.getNotificationEnable();
            final boolean z3 = notifyPreference.isNeedShowInCallRemind() && !NotifyUtil.INSTANCE.getInCallEnable();
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (notifyPreference.getNotificationDelayTime() > 0 && System.currentTimeMillis() - notifyPreference.getNotificationDelayCloseTime() > NotifyModule.NOTIFICATION_DELAY_CLOSE_DURATION_TIME) {
                z = true;
            }
            booleanRef.element = z;
            AnyExtKt.main$default(null, new NotifyModule$Companion$createBannerSettingsItem$1(booleanRef, null), 1, null);
            TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem = new TabDeviceBannerSettingsItem(16, 200, 0, StringExtKt.toLiveData(""), null, false, null, null, new Function1() { // from class: c0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.createBannerSettingsItem$lambda$0((Context) obj);
                }
            }, null, null, new Function1() { // from class: n0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(NotifyModule.Companion.createBannerSettingsItem$lambda$1(z2, z3, booleanRef, (WearableDeviceModel) obj));
                }
            }, 1780, null);
            if (!z2) {
                if (booleanRef.element) {
                    i = 3;
                } else {
                    i = z3 ? 2 : -1;
                }
            }
            tabDeviceBannerSettingsItem.setRemindType(i);
            tabDeviceBannerSettingsItem.setOnCloseListener(new Function1() { // from class: v0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.createBannerSettingsItem$lambda$4$lambda$2((View) obj);
                }
            });
            tabDeviceBannerSettingsItem.setOnOpenListener(new Function1() { // from class: w0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.createBannerSettingsItem$lambda$4$lambda$3((View) obj);
                }
            });
            NotifyModule.deviceBannerSettingsItem = tabDeviceBannerSettingsItem;
            if (!z2 && !z3 && !booleanRef.element) {
                NotifyHelperExtKt.getNotificationManagerExport().onHideRemindBannerItemView();
            }
            return NotifyModule.deviceBannerSettingsItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createBannerSettingsItem$lambda$0(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean createBannerSettingsItem$lambda$1(boolean z, boolean z2, Ref.BooleanRef showNotificationDelayRemind, WearableDeviceModel TabDeviceBannerSettingsItem) {
            Intrinsics.checkNotNullParameter(showNotificationDelayRemind, "$showNotificationDelayRemind");
            Intrinsics.checkNotNullParameter(TabDeviceBannerSettingsItem, "$this$TabDeviceBannerSettingsItem");
            return z || z2 || showNotificationDelayRemind.element;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createBannerSettingsItem$lambda$4$lambda$2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null) {
                return Unit.INSTANCE;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                String string = ApplicationExtKt.getApplication().getString(q0j.e);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(fragmentActivity, string);
                return Unit.INSTANCE;
            }
            int i = NotifyModule.deviceBannerSettingsItem.getRemindType().get();
            if (i == 1) {
                NotifyPreference.INSTANCE.setNeedShowNotificationRemind(wearableDeviceModel.getDid(), false);
            } else if (i == 2) {
                NotifyPreference.INSTANCE.setNeedShowInCallRemind(wearableDeviceModel.getDid(), false);
            } else if (i == 3) {
                NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
                notifyPreference.setNotificationDelayCloseTime(System.currentTimeMillis());
                notifyPreference.setNotificationDelayTime(0L);
            } else if (i == 4) {
                NotifyPreference.INSTANCE.setRemindUnLimitCloseTime(System.currentTimeMillis());
            }
            NotifyPreference.INSTANCE.setNeedShowRemind(wearableDeviceModel.getDid(), false);
            NotifyModule.INSTANCE.hideRemindBanner();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createBannerSettingsItem$lambda$4$lambda$3(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null) {
                return Unit.INSTANCE;
            }
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                String string = ApplicationExtKt.getApplication().getString(q0j.e);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(fragmentActivity, string);
                return Unit.INSTANCE;
            }
            int i = NotifyModule.deviceBannerSettingsItem.getRemindType().get();
            if (i != 1) {
                if (i == 2) {
                    NotifyModule.INSTANCE.requestInCallPermission();
                } else if (i == 3) {
                    SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceKeepAliveGuideActivity(true);
                } else if (i == 4) {
                    if (!RomUtils.INSTANCE.isMiui() || Build.VERSION.SDK_INT > 32) {
                        SettingsPageUtilExtKt.getSettingsPageUtil().gotoDeviceKeepAliveGuideActivity(true);
                    } else {
                        d2m.v(fragmentActivity);
                    }
                }
            } else if (NotifyStartExtKt.getNotificationManagerImpl().isNotificationListenersEnabled()) {
                NotifyStartExtKt.getNotificationManagerImpl().updateNotificationSettings(true, true);
                NotifyModule.INSTANCE.updateNotifyRemindState(true);
                NotifyUtil.INSTANCE.goNotify(fragmentActivity, true);
            } else {
                NotifyModule.INSTANCE.openNotification();
            }
            return Unit.INSTANCE;
        }

        private final TabContentItem createCallNotifyItem() {
            String string;
            boolean inCallEnable = NotifyUtil.INSTANCE.getInCallEnable();
            int i = xni.e;
            String string2 = ApplicationExtKt.getApplication().getString(q0j.l);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            MutableLiveData<String> liveData = StringExtKt.toLiveData(string2);
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
                string = "";
            } else {
                string = inCallEnable ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A);
                Intrinsics.checkNotNull(string);
            }
            TabContentItem tabContentItem = new TabContentItem(11, 111, i, liveData, null, false, null, StringExtKt.toLiveData(string), null, new Function1() { // from class: uzg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.createCallNotifyItem$lambda$8((Context) obj);
                }
            }, new Function1() { // from class: vzg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(NotifyModule.Companion.createCallNotifyItem$lambda$9((WearableDeviceModel) obj));
                }
            }, null, null, 6512, null);
            NotifyModule.mCallNotifyItem = tabContentItem;
            return tabContentItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createCallNotifyItem$lambda$8(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22818"), "name", "device_tab_call_enter");
            NotifyUtil.goCallNotify$default(NotifyUtil.INSTANCE, it, false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean createCallNotifyItem$lambda$9(WearableDeviceModel TabContentItem) {
            Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
            return DeviceModelExtKt.isSupportFeature(TabContentItem, "notification");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        public final TabContentItem createFeatureItem(int type, int icon, int title, Integer subtitle, boolean more, boolean remind, String remindText, Function1<? super Context, Unit> onClickListener, Function1<? super WearableDeviceModel, Boolean> itemVisible) {
            MutableLiveData<String> liveData;
            if (subtitle != null) {
                String string = ApplicationExtKt.getApplication().getString(subtitle.intValue());
                if (string != null) {
                    liveData = StringExtKt.toLiveData(string);
                } else {
                    liveData = null;
                }
            } else {
                liveData = null;
            }
            String string2 = ApplicationExtKt.getApplication().getString(title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new TabContentItem(11, type, icon, StringExtKt.toLiveData(string2), liveData, more, new ObservableBoolean(remind), remindText != null ? StringExtKt.toLiveData(remindText) : null, null, onClickListener, itemVisible, null, null, 6400, null);
        }

        private final TabContentItem createNotifyItem() {
            boolean notificationEnable = NotifyUtil.INSTANCE.getNotificationEnable();
            int i = xni.f;
            String string = ApplicationExtKt.getApplication().getString(q0j.s);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            MutableLiveData<String> liveData = StringExtKt.toLiveData(string);
            String string2 = notificationEnable ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A);
            Intrinsics.checkNotNull(string2);
            TabContentItem tabContentItem = new TabContentItem(11, 110, i, liveData, null, false, null, StringExtKt.toLiveData(string2), null, new Function1() { // from class: k0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.createNotifyItem$lambda$5((Context) obj);
                }
            }, new Function1() { // from class: l0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(NotifyModule.Companion.createNotifyItem$lambda$6((WearableDeviceModel) obj));
                }
            }, null, null, 6512, null);
            NotifyModule.mNotifyItem = tabContentItem;
            return tabContentItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createNotifyItem$lambda$5(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", "56.50.1.1.22814"), "name", "device_tab_message_enter");
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null) {
                return Unit.INSTANCE;
            }
            NotifyUtil.goNotify$default(NotifyUtil.INSTANCE, fragmentActivity, false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean createNotifyItem$lambda$6(WearableDeviceModel TabContentItem) {
            Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
            return DeviceModelExtKt.isSupportFeature(TabContentItem, "notification");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getIgnoringBatteryOptimizations(Context context, Continuation<? super Boolean> continuation) {
            return BuildersKt.withContext(Dispatchers.getIO(), new NotifyModule$Companion$getIgnoringBatteryOptimizations$2(context, null), continuation);
        }

        private final Intent getIntent() {
            return (Intent) NotifyModule.intent$delegate.getValue();
        }

        private final void hideRemindBanner() {
            NotifyModule.deviceBannerSettingsItem.setRemindType(-1);
            NotifyHelperExtKt.getNotificationManagerExport().onHideRemindBannerItemView();
        }

        private final void onActivityResultByRequestNotification(int resultCode, Intent data) {
            if (resultCode == -1) {
                NotifyStartExtKt.getNotificationManagerImpl().updateNotificationSettings(true, true);
                updateNotifyRemindState(true);
                Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
                FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
                if (fragmentActivity == null) {
                    return;
                }
                NotifyUtil.INSTANCE.goNotify(fragmentActivity, true);
            }
        }

        private final void openNotification() {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
            BaseActivity baseActivity = (BaseActivity) currentActivity;
            if (ApplicationExtKt.getApplication().getPackageManager().resolveActivity(getIntent(), 0) == null) {
                NotifyUtil.goNotify$default(NotifyUtil.INSTANCE, baseActivity, false, 2, null);
                return;
            }
            try {
                baseActivity.startForActivityResult(getIntent(), new Function2() { // from class: rzg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NotifyModule.Companion.openNotification$lambda$39(((Integer) obj).intValue(), (Intent) obj2);
                    }
                });
            } catch (SecurityException unused) {
                NotifyUtil.goNotify$default(NotifyUtil.INSTANCE, baseActivity, false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit openNotification$lambda$39(int i, Intent intent) {
            NotifyModule.INSTANCE.onActivityResultByRequestNotification(i, intent);
            return Unit.INSTANCE;
        }

        private final void requestContactsPermission(boolean isInCallOptimizationOpen, final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
            String[] strArr = isInCallOptimizationOpen ? new String[]{"android.permission.READ_CONTACTS"} : new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
            PermissionExtKt.permissions(fragmentActivity, (String[]) Arrays.copyOf(strArr, strArr.length), isInCallOptimizationOpen ? new String[]{ResourceExtKt.getString(q0j.e0)} : new String[]{ResourceExtKt.getString(q0j.e0), ResourceExtKt.getString(q0j.i0)}, (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: p0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestContactsPermission$lambda$34(extension, (MultiplePermissionsBuilder) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestContactsPermission$lambda$34(Function1 extension, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(extension, "$extension");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            final MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
            extension.invoke2(multiplePermissionsBuilder);
            permissions.allGranted(new Function0() { // from class: wzg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestContactsPermission$lambda$34$lambda$32(multiplePermissionsBuilder);
                }
            });
            permissions.denied(new Function1() { // from class: xzg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestContactsPermission$lambda$34$lambda$33(multiplePermissionsBuilder, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestContactsPermission$lambda$34$lambda$32(MultiplePermissionsBuilder pb) {
            Intrinsics.checkNotNullParameter(pb, "$pb");
            pb.getAllGranted().invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestContactsPermission$lambda$34$lambda$33(MultiplePermissionsBuilder pb, List it) {
            Intrinsics.checkNotNullParameter(pb, "$pb");
            Intrinsics.checkNotNullParameter(it, "it");
            pb.getDenied().invoke2(it);
            return Unit.INSTANCE;
        }

        private final void requestInCallPermission() {
            if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null) {
                return;
            }
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            final FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null) {
                return;
            }
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            InCall inCall = notifyUtil.getInCall();
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
                final boolean z = Build.VERSION.SDK_INT < 31 || (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_PHONE_STATE") && NotifyPreference.INSTANCE.isInCallOptimizationOpen());
                if (PermissionExtKt.isPermissionGranted(ApplicationExtKt.getApplication(), "android.permission.READ_CONTACTS") && z) {
                    notifyUtil.updateInCallConfig(true);
                    NotifyPreference.INSTANCE.isInCallOptimizationOpen(true);
                    updateInCallRemindState(true);
                    notifyUtil.goCallNotify(fragmentActivity, true);
                    return;
                }
                if (PermissionExtKt.supportMiuiPermissionEnable()) {
                    requestContactsPermission(z, new Function1() { // from class: b0h
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return NotifyModule.Companion.requestInCallPermission$lambda$14(fragmentActivity, (MultiplePermissionsBuilder) obj);
                        }
                    });
                    return;
                }
                NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                notificationManagerImpl.showAlertPermissionDialog(supportFragmentManager, q0j.V, new Function0() { // from class: d0h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyModule.Companion.requestInCallPermission$lambda$19(z, fragmentActivity);
                    }
                }, new Function0() { // from class: e0h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
            Application application = ApplicationExtKt.getApplication();
            String[] filterPhoneNotifyPermissionList = NotifyHelperExtKt.getNotificationManagerExport().getFilterPhoneNotifyPermissionList(inCall.isIncallNotifyEnabled(), AppUtil.INSTANCE.isPlayChannel());
            if (PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(filterPhoneNotifyPermissionList, filterPhoneNotifyPermissionList.length)) && NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                notifyUtil.updateInCallConfig(true);
                updateInCallRemindState(true);
                notifyUtil.goCallNotify(fragmentActivity, true);
                return;
            }
            if (!NotifyStartExtKt.getNotificationManagerImpl().isNotificationPolicyAccessGranted()) {
                NotificationManagerInter notificationManagerImpl2 = NotifyStartExtKt.getNotificationManagerImpl();
                FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                notificationManagerImpl2.showGoSettingDialog(supportFragmentManager2, q0j.x, new Function0() { // from class: f0h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyModule.Companion.requestInCallPermission$lambda$21();
                    }
                });
                return;
            }
            Application application2 = ApplicationExtKt.getApplication();
            String[] phoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionList();
            if (PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(phoneNotifyPermissionList, phoneNotifyPermissionList.length))) {
                return;
            }
            if (PermissionExtKt.supportMiuiPermissionEnable()) {
                requestPhonePermission(new Function1() { // from class: g0h
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return NotifyModule.Companion.requestInCallPermission$lambda$25(fragmentActivity, (MultiplePermissionsBuilder) obj);
                    }
                });
                return;
            }
            NotificationManagerInter notificationManagerImpl3 = NotifyStartExtKt.getNotificationManagerImpl();
            FragmentManager supportFragmentManager3 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
            notificationManagerImpl3.showDialog(supportFragmentManager3, q0j.n, q0j.m, q0j.common_allow, q0j.common_reject, new Function0() { // from class: h0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$30(fragmentActivity);
                }
            }, new Function0() { // from class: i0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$14(final FragmentActivity curActivity, MultiplePermissionsBuilder requestContactsPermission) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(requestContactsPermission, "$this$requestContactsPermission");
            requestContactsPermission.allGranted(new Function0() { // from class: szg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$14$lambda$11(curActivity);
                }
            });
            requestContactsPermission.denied(new Function1() { // from class: tzg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$14$lambda$13(curActivity, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$14$lambda$11(FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            notifyUtil.updateInCallConfig(true);
            NotifyModule.INSTANCE.updateInCallRemindState(true);
            NotifyPreference.INSTANCE.isInCallOptimizationOpen(true);
            notifyUtil.goCallNotify(curActivity, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$14$lambda$13(FragmentActivity curActivity, final List it) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(it, "it");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), curActivity, it, null, null, new Function0() { // from class: z0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$14$lambda$13$lambda$12(it);
                }
            }, 24, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$14$lambda$13$lambda$12(List it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            NotifyModule.INSTANCE.showPermissionDeniedDialog((String) it.get(0));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$19(boolean z, final FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyModule.INSTANCE.requestContactsPermission(z, new Function1() { // from class: yzg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$19$lambda$18(curActivity, (MultiplePermissionsBuilder) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$19$lambda$18(final FragmentActivity curActivity, MultiplePermissionsBuilder requestContactsPermission) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(requestContactsPermission, "$this$requestContactsPermission");
            requestContactsPermission.allGranted(new Function0() { // from class: x0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$19$lambda$18$lambda$15(curActivity);
                }
            });
            requestContactsPermission.denied(new Function1() { // from class: y0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$19$lambda$18$lambda$17(curActivity, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$19$lambda$18$lambda$15(FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            notifyUtil.updateInCallConfig(true);
            NotifyModule.INSTANCE.updateInCallRemindState(true);
            NotifyPreference.INSTANCE.isInCallOptimizationOpen(true);
            notifyUtil.goCallNotify(curActivity, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$19$lambda$18$lambda$17(FragmentActivity curActivity, final List it) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(it, "it");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), curActivity, it, null, null, new Function0() { // from class: zzg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$19$lambda$18$lambda$17$lambda$16(it);
                }
            }, 24, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$19$lambda$18$lambda$17$lambda$16(List it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            NotifyModule.INSTANCE.showPermissionDeniedDialog((String) it.get(0));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$21() {
            NotifyHelperExtKt.getNotificationManagerExport().gotoNotificationPolicyAccessSetting();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$25(final FragmentActivity curActivity, MultiplePermissionsBuilder requestPhonePermission) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(requestPhonePermission, "$this$requestPhonePermission");
            requestPhonePermission.allGranted(new Function0() { // from class: a1h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$25$lambda$22(curActivity);
                }
            });
            requestPhonePermission.denied(new Function1() { // from class: b1h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$25$lambda$24(curActivity, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$25$lambda$22(FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            notifyUtil.updateInCallConfig(true);
            NotifyModule.INSTANCE.updateInCallRemindState(true);
            notifyUtil.goCallNotify(curActivity, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$25$lambda$24(FragmentActivity curActivity, final List it) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(it, "it");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), curActivity, it, null, null, new Function0() { // from class: u0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$25$lambda$24$lambda$23(it);
                }
            }, 24, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$25$lambda$24$lambda$23(List it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            NotifyModule.INSTANCE.showPermissionDeniedDialog((String) it.get(0));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$30(final FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyModule.INSTANCE.requestPhonePermission(new Function1() { // from class: q0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$30$lambda$29(curActivity, (MultiplePermissionsBuilder) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$30$lambda$29(final FragmentActivity curActivity, MultiplePermissionsBuilder requestPhonePermission) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(requestPhonePermission, "$this$requestPhonePermission");
            requestPhonePermission.allGranted(new Function0() { // from class: r0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$30$lambda$29$lambda$26(curActivity);
                }
            });
            requestPhonePermission.denied(new Function1() { // from class: s0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestInCallPermission$lambda$30$lambda$29$lambda$28(curActivity, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$30$lambda$29$lambda$26(FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            notifyUtil.updateInCallConfig(true);
            NotifyModule.INSTANCE.updateInCallRemindState(true);
            notifyUtil.goCallNotify(curActivity, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$30$lambda$29$lambda$28(FragmentActivity curActivity, final List it) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNullParameter(it, "it");
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), curActivity, it, null, null, new Function0() { // from class: a0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestInCallPermission$lambda$30$lambda$29$lambda$28$lambda$27(it);
                }
            }, 24, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestInCallPermission$lambda$30$lambda$29$lambda$28$lambda$27(List it) {
            Intrinsics.checkNotNullParameter(it, "$it");
            NotifyModule.INSTANCE.showPermissionDeniedDialog((String) it.get(0));
            return Unit.INSTANCE;
        }

        private final void requestPhonePermission(final Function1<? super MultiplePermissionsBuilder, Unit> extension) {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            String[] phoneNotifyPermissionList = NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionList();
            PermissionExtKt.permissions((FragmentActivity) currentActivity, (String[]) Arrays.copyOf(phoneNotifyPermissionList, phoneNotifyPermissionList.length), NotifyStartExtKt.getNotificationManagerImpl().getPhoneNotifyPermissionDescList(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: j0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestPhonePermission$lambda$37(extension, (MultiplePermissionsBuilder) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestPhonePermission$lambda$37(Function1 extension, MultiplePermissionsBuilder permissions) {
            Intrinsics.checkNotNullParameter(extension, "$extension");
            Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
            final MultiplePermissionsBuilder multiplePermissionsBuilder = new MultiplePermissionsBuilder();
            extension.invoke2(multiplePermissionsBuilder);
            permissions.allGranted(new Function0() { // from class: m0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.requestPhonePermission$lambda$37$lambda$35(multiplePermissionsBuilder);
                }
            });
            permissions.denied(new Function1() { // from class: o0h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return NotifyModule.Companion.requestPhonePermission$lambda$37$lambda$36(multiplePermissionsBuilder, (List) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestPhonePermission$lambda$37$lambda$35(MultiplePermissionsBuilder pb) {
            Intrinsics.checkNotNullParameter(pb, "$pb");
            pb.getAllGranted().invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestPhonePermission$lambda$37$lambda$36(MultiplePermissionsBuilder pb, List it) {
            Intrinsics.checkNotNullParameter(pb, "$pb");
            Intrinsics.checkNotNullParameter(it, "it");
            pb.getDenied().invoke2(it);
            return Unit.INSTANCE;
        }

        private final void showPermissionDeniedDialog(String permission) {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            final FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
            NotificationManagerInter notificationManagerImpl = NotifyStartExtKt.getNotificationManagerImpl();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            notificationManagerImpl.showGoSettingDialog(supportFragmentManager, NotifyStartExtKt.getNotificationManagerImpl().getPermissionName(permission), new Function0() { // from class: t0h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotifyModule.Companion.showPermissionDeniedDialog$lambda$38(fragmentActivity);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit showPermissionDeniedDialog$lambda$38(FragmentActivity curActivity) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            String packageName = curActivity.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            intent.setData(Uri.fromParts("package", packageName, null));
            curActivity.startActivity(intent);
            return Unit.INSTANCE;
        }

        private final void showRemindBanner(int remindType) {
            NotifyHelperExtKt.getNotificationManagerExport().onShowRemindBannerItemView(remindType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateRemindType(Boolean notifyEnabled, Boolean callEnabled, Boolean showNotificationDelayRemind, Boolean showUnLimitRemind) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                return;
            }
            NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
            boolean zIsNeedShowRemind = notifyPreference.isNeedShowRemind();
            boolean z = false;
            boolean z2 = notifyPreference.isNeedShowNotificationRemind() && !(notifyEnabled != null ? notifyEnabled.booleanValue() : NotifyUtil.INSTANCE.getNotificationEnable());
            boolean zBooleanValue = showUnLimitRemind != null ? showUnLimitRemind.booleanValue() : false;
            Logger.i(NotifyModule.TAG, "need show un limit =  " + zBooleanValue + " need show remind = " + zIsNeedShowRemind + " show notification remind = " + z2 + " show notification relay = " + showNotificationDelayRemind);
            if (!zIsNeedShowRemind) {
                hideRemindBanner();
                return;
            }
            if (zBooleanValue) {
                showRemindBanner(4);
                return;
            }
            if (z2) {
                showRemindBanner(1);
                return;
            }
            if (Intrinsics.areEqual(showNotificationDelayRemind, Boolean.TRUE)) {
                showRemindBanner(3);
                return;
            }
            boolean zBooleanValue2 = callEnabled != null ? callEnabled.booleanValue() : NotifyUtil.INSTANCE.getInCallEnable();
            if (notifyPreference.isNeedShowInCallRemind() && !zBooleanValue2) {
                z = true;
            }
            Logger.i(NotifyModule.TAG, "need show remind = " + zIsNeedShowRemind + " show in call remind = " + z);
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle() || DeviceModelExtKt.isWearOS(wearableDeviceModel) || !z) {
                hideRemindBanner();
            } else {
                showRemindBanner(2);
                Logger.i(NotifyModule.TAG, "showRemindBanner");
            }
        }

        @NotNull
        public final TabContentItem provideBannerSettingsItem() {
            return NotifyModule.deviceBannerSettingsItem;
        }

        @NotNull
        public final TabContentItem provideCallNotifyItem() {
            return createCallNotifyItem();
        }

        @NotNull
        public final TabContentItem provideNotifyItem() {
            return createNotifyItem();
        }

        public final void updateInCallRemindState(boolean callEnable) {
            MutableLiveData<String> remindText;
            MutableLiveData<String> remindText2;
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
                TabContentItem tabContentItem = NotifyModule.mCallNotifyItem;
                if (tabContentItem != null && (remindText2 = tabContentItem.getRemindText()) != null) {
                    remindText2.setValue("");
                }
            } else {
                TabContentItem tabContentItem2 = NotifyModule.mCallNotifyItem;
                if (tabContentItem2 != null && (remindText = tabContentItem2.getRemindText()) != null) {
                    remindText.setValue(callEnable ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A));
                }
            }
            updateRemindType(null, Boolean.valueOf(callEnable), null, null);
        }

        public final void updateNotificationRemind() {
            MutableLiveData<String> remindText;
            MutableLiveData<String> remindText2;
            MutableLiveData<String> remindText3;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                return;
            }
            NotifyUtil notifyUtil = NotifyUtil.INSTANCE;
            boolean notificationEnable = notifyUtil.getNotificationEnable();
            boolean inCallEnable = notifyUtil.getInCallEnable();
            TabContentItem tabContentItem = NotifyModule.mNotifyItem;
            if (tabContentItem != null && (remindText3 = tabContentItem.getRemindText()) != null) {
                remindText3.setValue(notificationEnable ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A));
            }
            if (NotifyStartExtKt.getNotificationManagerImpl().isDualCallWithOutBle()) {
                TabContentItem tabContentItem2 = NotifyModule.mCallNotifyItem;
                if (tabContentItem2 != null && (remindText2 = tabContentItem2.getRemindText()) != null) {
                    remindText2.setValue("");
                }
            } else {
                TabContentItem tabContentItem3 = NotifyModule.mCallNotifyItem;
                if (tabContentItem3 != null && (remindText = tabContentItem3.getRemindText()) != null) {
                    remindText.setValue(inCallEnable ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A));
                }
            }
            AnyExtKt.main$default(null, new NotifyModule$Companion$updateNotificationRemind$1(notificationEnable, inCallEnable, wearableDeviceModel, null), 1, null);
        }

        public final void updateNotifyRemindState(boolean notifyEnabled) {
            MutableLiveData<String> remindText;
            TabContentItem tabContentItem = NotifyModule.mNotifyItem;
            if (tabContentItem != null && (remindText = tabContentItem.getRemindText()) != null) {
                remindText.setValue(notifyEnabled ? ApplicationExtKt.getApplication().getResources().getString(q0j.z) : ApplicationExtKt.getApplication().getResources().getString(q0j.A));
            }
            updateRemindType(Boolean.valueOf(notifyEnabled), null, null, null);
        }

        public final void updateNotifyRemindWhenConnectDevice(@Nullable String did) {
            WearableDeviceModel wearableDeviceModel;
            if (did == null || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null || !wearableDeviceModel.getIsDeviceConnected()) {
                return;
            }
            NotifyPreference.INSTANCE.setNeedShowRemind(wearableDeviceModel.getDid(), true);
            updateNotificationRemind();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        intent$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qzg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotifyModule.intent_delegate$lambda$0();
            }
        });
        deviceBannerSettingsItem = companion.createBannerSettingsItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent intent_delegate$lambda$0() {
        return new Intent("miui.intent.action.NOTIFICATION_VERIFY").putExtra("component_name", ApplicationExtKt.getApplication().getPackageName() + (AppUtil.INSTANCE.isPlayChannel() ? "/com.xiaomi.wearable.home.devices.ble.sync.NotifySyncService" : "/com.xiaomi.fitness.notify.NotifySyncService")).putExtra("enable", true).putExtra(MiuiCursorConstants.CONTENT, ApplicationExtKt.getApplication().getString(q0j.R));
    }

    @NotNull
    public abstract NotificationFocusInterface bindNotificationFocusManager(@NotNull NotificationFocusManager notificationFocusManager);

    @NotNull
    public abstract NotificationManagerExportInter bindNotificationManagerExport(@NotNull NotificationManagerExport notificationManagerImpl);

    @NotNull
    public abstract NotificationManagerInter bindNotificationManagerImpl(@NotNull NotificationManagerImpl notificationManagerImpl);
}
