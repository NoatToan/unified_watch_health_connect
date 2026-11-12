package com.xiaomi.fitness.notify.callnotify;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import defpackage.vxi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u000eR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/CallNotifyViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/notify/callnotify/CallNotifyModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", DeviceSettingConfigKey.KEY_INCALL, "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getIncall", "()Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "setIncall", "(Lcom/xiaomi/fitness/settingitem/settingitem/InCall;)V", "isHuaMiSupport", "", "()Z", "isBleDevice", "isDeviceSupportSMSReply", "isDelayNoticeSwitchOn", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "setDelayNoticeEnabled", "enabled", "setDelayTime", "delayTime", "", "getDelayTime", "getDelayNoticeTimeStr", "", "context", "Landroid/content/Context;", "checkDeviceConnected", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CallNotifyViewModel extends BaseViewModel<CallNotifyModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DELAY_SWITCH_OFF = 255;
    public static final int DELAY_SWITCH_ON = 256;
    public static final int DELAY_TIME_LOWER_LIMIT = 3;
    public static final int DELAY_TIME_UPPER_LIMIT = 30;
    public InCall incall;
    private final boolean isBleDevice;
    private final boolean isDeviceSupportSMSReply;
    private final boolean isHuaMiSupport;

    @Nullable
    private final WearableDeviceModel mDeviceModel;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/CallNotifyViewModel$Companion;", "", "<init>", "()V", "DELAY_SWITCH_ON", "", "DELAY_SWITCH_OFF", "DELAY_TIME_LOWER_LIMIT", "DELAY_TIME_UPPER_LIMIT", "isDelayNoticeSwitchOn", "", "inCall", "Lcom/xiaomi/fitness/settingitem/settingitem/InCall;", "getDelayTime", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int getDelayTime(@NotNull InCall inCall) {
            Intrinsics.checkNotNullParameter(inCall, "inCall");
            return inCall.getInComingCallNotifyTime() & 255;
        }

        @JvmStatic
        public final boolean isDelayNoticeSwitchOn(@NotNull InCall inCall) {
            Intrinsics.checkNotNullParameter(inCall, "inCall");
            return (inCall.getInComingCallNotifyTime() & 256) == 0;
        }
    }

    public CallNotifyViewModel() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.mDeviceModel = wearableDeviceModel;
        this.isHuaMiSupport = wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel) && (wearableDeviceModel == null || !DeviceModelExtKt.isKongMing(wearableDeviceModel));
        this.isBleDevice = wearableDeviceModel != null ? DeviceModelExtKt.isBluetooth(wearableDeviceModel) : false;
        this.isDeviceSupportSMSReply = wearableDeviceModel != null ? com.xiaomi.fitness.notify.extension.DeviceModelExtKt.isSupportSmsReply(wearableDeviceModel) : false;
    }

    @JvmStatic
    public static final int getDelayTime(@NotNull InCall inCall) {
        return INSTANCE.getDelayTime(inCall);
    }

    @JvmStatic
    public static final boolean isDelayNoticeSwitchOn(@NotNull InCall inCall) {
        return INSTANCE.isDelayNoticeSwitchOn(inCall);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return;
        }
        NotifyStartExtKt.getNotificationManagerImpl().loadWearOSCallSync();
    }

    public final boolean checkDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.isDeviceConnected();
        }
        return false;
    }

    @NotNull
    public final String getDelayNoticeTimeStr(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int inComingCallNotifyTime = getIncall().getInComingCallNotifyTime() & 255;
        String quantityString = context.getResources().getQuantityString(vxi.f37333a, inComingCallNotifyTime, Integer.valueOf(inComingCallNotifyTime));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @NotNull
    public final InCall getIncall() {
        InCall inCall = this.incall;
        if (inCall != null) {
            return inCall;
        }
        Intrinsics.throwUninitializedPropertyAccessException(DeviceSettingConfigKey.KEY_INCALL);
        return null;
    }

    /* JADX INFO: renamed from: isBleDevice, reason: from getter */
    public final boolean getIsBleDevice() {
        return this.isBleDevice;
    }

    /* JADX INFO: renamed from: isDeviceSupportSMSReply, reason: from getter */
    public final boolean getIsDeviceSupportSMSReply() {
        return this.isDeviceSupportSMSReply;
    }

    /* JADX INFO: renamed from: isHuaMiSupport, reason: from getter */
    public final boolean getIsHuaMiSupport() {
        return this.isHuaMiSupport;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return;
        }
        NotifyStartExtKt.getNotificationManagerImpl().deAttachCallNotify();
    }

    public final void setDelayNoticeEnabled(boolean enabled) {
        InCall incall = getIncall();
        int inComingCallNotifyTime = getIncall().getInComingCallNotifyTime();
        incall.setInComingCallNotifyTime(enabled ? inComingCallNotifyTime & 255 : inComingCallNotifyTime | 256);
    }

    public final void setDelayTime(int delayTime) {
        getIncall().setInComingCallNotifyTime(delayTime | (getIncall().getInComingCallNotifyTime() & 256));
    }

    public final void setIncall(@NotNull InCall inCall) {
        Intrinsics.checkNotNullParameter(inCall, "<set-?>");
        this.incall = inCall;
    }

    public final int getDelayTime() {
        return INSTANCE.getDelayTime(getIncall());
    }

    public final boolean isDelayNoticeSwitchOn() {
        return INSTANCE.isDelayNoticeSwitchOn(getIncall());
    }
}
