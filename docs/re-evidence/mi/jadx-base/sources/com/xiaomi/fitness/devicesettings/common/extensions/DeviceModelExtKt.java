package com.xiaomi.fitness.devicesettings.common.extensions;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.DeviceSettingsComponent;
import com.xiaomi.fitness.devicesettings.common.eventremind.EventMinderUtil;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.eu6;
import defpackage.j5h;
import defpackage.k14;
import defpackage.l14;
import defpackage.lwo;
import defpackage.m14;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.s7r;
import defpackage.txo;
import defpackage.v4h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0019\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0019\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0016\u001a!\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0011\u001a\u0019\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0016\u001a\u0019\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0016\u001a+\u0010'\u001a\u00020\u0006*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010)\u001a\u00020\u0006*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\u0006*\u00020\u00002\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u0016\u001a\u0019\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010-\u001a\u00020\u0006¢\u0006\u0004\b/\u0010\u0016\u001a\u0019\u00102\u001a\u00020\u0006*\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\u001a\u0019\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u00101\u001a\u000204¢\u0006\u0004\b5\u00106\u001a\u0019\u00109\u001a\u00020\u0006*\u00020\u00002\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:\u001a)\u0010?\u001a\u00020>*\u00020\u00002\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010A\u001a\u00020>*\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bC\u0010\u0013\u001a\u0011\u0010D\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bD\u0010\u0013\u001a\u0011\u0010E\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bE\u0010\u0013\u001a\u0011\u0010F\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bF\u0010\u0013\u001a\u0011\u0010G\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bG\u0010\u0013\u001a\u0011\u0010H\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bH\u0010\u0013\u001a\u0019\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010I*\u00020\u0000¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010M\u001a\u0004\u0018\u00010L*\u00020\u0000¢\u0006\u0004\bM\u0010N\u001a\u0019\u0010O\u001a\u00020>*\u00020\u00002\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bO\u0010B\u001a'\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060R*\u00020\u00002\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010I¢\u0006\u0004\bS\u0010T\u001a!\u0010W\u001a\b\u0012\u0004\u0012\u00020V0I2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020P0I¢\u0006\u0004\bW\u0010X\u001a#\u0010Z\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010I2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0I¢\u0006\u0004\bZ\u0010X\u001a\u001f\u0010]\u001a\u00020>*\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\\0[¢\u0006\u0004\b]\u0010^\u001a/\u0010b\u001a\u00020>*\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[¢\u0006\u0004\bb\u0010c\u001a-\u0010e\u001a\u00020>*\u00020\u00002\f\u0010d\u001a\b\u0012\u0004\u0012\u00020_0I2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[¢\u0006\u0004\be\u0010f\u001a/\u0010h\u001a\u00020>*\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010g\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[¢\u0006\u0004\bh\u0010c\u001a+\u0010i\u001a\u00020>2\u0006\u0010`\u001a\u00020_2\u0006\u0010g\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[¢\u0006\u0004\bi\u0010j\u001a1\u0010k\u001a\u00020>*\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010g\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\bk\u0010c\u001a+\u0010l\u001a\u00020>2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020_0I2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\bl\u0010m\u001a/\u0010n\u001a\u00020>*\u00020\u00002\f\u0010d\u001a\b\u0012\u0004\u0012\u00020_0I2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\bn\u0010f\u001a-\u0010o\u001a\u00020>2\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\bo\u0010j\u001a1\u0010p\u001a\u00020>*\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010\u0019\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\bp\u0010c\u001a!\u0010q\u001a\u00020>*\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0002¢\u0006\u0004\bq\u0010^\u001a!\u0010r\u001a\u00020>*\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0002¢\u0006\u0004\br\u0010^\u001a!\u0010t\u001a\b\u0012\u0004\u0012\u00020_0I2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020_0I¢\u0006\u0004\bt\u0010X¨\u0006u"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "settings", "", "writeSettingSync", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;)Z", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "settingsGroupType", "querySettingSync", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "enable", "", "freq", "setHighHr", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZI)Z", "supportHrDetection", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "setLowHr", "enableSportHeartRate", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)Z", "enableOsa", "enablePressure", "checked", "setAtrialFibEnable", "step", "enableGoalRemind", "isLeft", "setWearLocation", "isLimit", "disableBind", "Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "vibrateType", "", "s", "", "times", "setVibrate", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;S[S)Z", "defaultVibrate", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;)Z", "testVibrate", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;[S)Z", "isEnabled", "enableConnectedAdv", "enableHrBroadcast", "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "info", "setAutoBacklight", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;)Z", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "enableWristBright", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;)Z", "Lcom/huami/bluetooth/profile/ecf/data/HidStatus;", "hidStatus", "setHidStatus", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/huami/bluetooth/profile/ecf/data/HidStatus;)Z", "deviceType", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callback", "", "setAuthorizeUnlock", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;IZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "getAuthorizeUnlock", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "isSupportUnlockPhone", "isSupportUnlockLaptop", "isSupportXiaoAi", "isSupportWristScreenWake", "isSupportNightMode", "isSupportWorldClock", "", "getRssiArray", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Ljava/util/List;", "", "getAlias", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Ljava/lang/String;", "doFactoryDump", "Lcom/xiaomi/fitness/settingitem/settingitem/EventReMinderItem;", "minderList", "Lo4h;", "syncEventMinders", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/util/List;)Lo4h;", "mindItemList", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "getHMReminderList", "(Ljava/util/List;)Ljava/util/List;", "hmReminderInfos", "toEventMinderList", "Leu6;", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSetting;", "getAlarmClocks", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Leu6;)V", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "item", "isChecked", "syncRemoteAlarmData", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;ZLeu6;)V", "list", "deleteAlarms", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/util/List;Leu6;)V", "isAdd", "addOrUpdateAlarmData", "addOrUpdateProtoAlarmData", "(Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;ZLeu6;)V", "addOrUpdateHuamiAlarmData", "deleteProtoAlarms", "(Ljava/util/List;Leu6;)V", "deleteHuamiAlarms", "syncProtoAlarm", "syncHuamiAlarm", "getAlarmsByProto", "getHuamiAlarms", "alarmClockBeanList", "getVisibleAlarmClock", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class DeviceModelExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt$deleteHuamiAlarms$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt$deleteHuamiAlarms$1", f = "DeviceModelExt.kt", i = {0, 1}, l = {524, 544}, m = "invokeSuspend", n = {"alarmClocks", "alarmClocks"}, s = {"L$0", "L$0"})
    public static final class C21351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ eu6<Boolean> $callback;
        final /* synthetic */ List<AlarmSettingItem> $list;
        final /* synthetic */ WearableDeviceModel $this_deleteHuamiAlarms;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21351(eu6<Boolean> eu6Var, List<? extends AlarmSettingItem> list, WearableDeviceModel wearableDeviceModel, Continuation<? super C21351> continuation) {
            super(2, continuation);
            this.$callback = eu6Var;
            this.$list = list;
            this.$this_deleteHuamiAlarms = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21351(this.$callback, this.$list, this.$this_deleteHuamiAlarms, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v22, types: [T, com.xiaomi.fitness.settingitem.settingitem.AlarmSetting] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            T t;
            Ref.ObjectRef objectRef3;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.L$1;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objectRef2 = objectRef4;
                    objectRef = objectRef5;
                    t = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(this.$this_deleteHuamiAlarms.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, objectRef3.element);
                Logger.i(" sync deleteHuamiAlarms result:%b", Boxing.boxBoolean(zBooleanValue));
                this.$callback.onResult(Boxing.boxBoolean(zBooleanValue));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DeviceModelExtKt$deleteHuamiAlarms$1$alarmClocks$1 deviceModelExtKt$deleteHuamiAlarms$1$alarmClocks$1 = new DeviceModelExtKt$deleteHuamiAlarms$1$alarmClocks$1(this.$this_deleteHuamiAlarms, null);
            this.L$0 = objectRef;
            this.L$1 = objectRef;
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(io2, deviceModelExtKt$deleteHuamiAlarms$1$alarmClocks$1, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
            t = objWithContext;
            objectRef2.element = t;
            T t2 = objectRef.element;
            if (t2 == 0 || ((AlarmSetting) t2).getAlarmItems().isEmpty()) {
                this.$callback.onResult(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            if (((AlarmSetting) objectRef.element).getAlarmItems().size() < 10) {
                HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
                List<AlarmSettingItem> alarmItems = ((AlarmSetting) objectRef.element).getAlarmItems();
                Intrinsics.checkNotNullExpressionValue(alarmItems, "getAlarmItems(...)");
                objectRef.element = huamiDeviceTool.completeAlarmSetting(alarmItems);
            }
            for (AlarmSettingItem alarmSettingItem : ((AlarmSetting) objectRef.element).getAlarmItems()) {
                if (this.$list.contains(alarmSettingItem)) {
                    alarmSettingItem.setVisible(false);
                    alarmSettingItem.setEnable(false);
                }
            }
            Logger.i("start delete alarm", new Object[0]);
            CoroutineDispatcher io3 = Dispatchers.getIO();
            DeviceModelExtKt$deleteHuamiAlarms$1$result$1 deviceModelExtKt$deleteHuamiAlarms$1$result$1 = new DeviceModelExtKt$deleteHuamiAlarms$1$result$1(this.$this_deleteHuamiAlarms, objectRef, null);
            this.L$0 = objectRef;
            this.L$1 = null;
            this.label = 2;
            Object objWithContext2 = BuildersKt.withContext(io3, deviceModelExtKt$deleteHuamiAlarms$1$result$1, this);
            if (objWithContext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef3 = objectRef;
            obj2 = objWithContext2;
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            DeviceSettingManager.INSTANCE.getInstance().sendBigSettingItem(this.$this_deleteHuamiAlarms.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, objectRef3.element);
            Logger.i(" sync deleteHuamiAlarms result:%b", Boxing.boxBoolean(zBooleanValue2));
            this.$callback.onResult(Boxing.boxBoolean(zBooleanValue2));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void addOrUpdateAlarmData(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull AlarmSettingItem item, boolean z, @NotNull eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            addOrUpdateHuamiAlarmData(wearableDeviceModel, item, z, callback);
        } else {
            addOrUpdateProtoAlarmData(item, z, callback);
        }
    }

    private static final void addOrUpdateHuamiAlarmData(WearableDeviceModel wearableDeviceModel, AlarmSettingItem alarmSettingItem, boolean z, eu6<Boolean> eu6Var) {
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK).valueToObject(AlarmSetting.class);
        AlarmSetting alarmSettingCompleteAlarmSetting = objValueToObject instanceof AlarmSetting ? (AlarmSetting) objValueToObject : null;
        if (alarmSettingCompleteAlarmSetting == null) {
            alarmSettingCompleteAlarmSetting = HuamiDeviceTool.INSTANCE.getDefaultAlarmClocks();
        }
        if (alarmSettingCompleteAlarmSetting.getAlarmItems().size() < 10) {
            HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
            List<AlarmSettingItem> alarmItems = alarmSettingCompleteAlarmSetting.getAlarmItems();
            Intrinsics.checkNotNullExpressionValue(alarmItems, "getAlarmItems(...)");
            alarmSettingCompleteAlarmSetting = huamiDeviceTool.completeAlarmSetting(alarmItems);
        }
        if (z) {
            HuamiDeviceTool huamiDeviceTool2 = HuamiDeviceTool.INSTANCE;
            List<AlarmSettingItem> alarmItems2 = alarmSettingCompleteAlarmSetting.getAlarmItems();
            Intrinsics.checkNotNullExpressionValue(alarmItems2, "getAlarmItems(...)");
            int nextID = huamiDeviceTool2.getNextID(alarmItems2);
            if (nextID == -1) {
                eu6Var.onError(1);
                Logger.i("addOrUpdateAlarmData new id == -1", new Object[0]);
                return;
            } else {
                alarmSettingItem.setId(nextID);
                alarmSettingCompleteAlarmSetting.updateItem(alarmSettingItem, nextID);
            }
        } else {
            alarmSettingCompleteAlarmSetting.updateItem(alarmSettingItem);
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
        boolean alarmSync = huaMiApiCaller != null ? huaMiApiCaller.setAlarmSync(HuamiDeviceTool.INSTANCE.getAlarmClockExt(alarmSettingCompleteAlarmSetting)) : false;
        Logger.d("syncAlarmClock result:" + alarmSync, new Object[0]);
        if (alarmSync) {
            companion.getInstance().sendSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, alarmSettingCompleteAlarmSetting);
        }
        eu6Var.onResult(Boolean.valueOf(alarmSync));
    }

    public static final void addOrUpdateProtoAlarmData(@NotNull final AlarmSettingItem item, final boolean z, @NotNull final eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = z ? 1 : 2;
        k14 k14Var = new k14();
        if (z) {
            k14Var.C(AlarmSettingItem.parse(item).d);
        } else {
            k14Var.F(AlarmSettingItem.parse(item));
            k14Var.q().d.f = true;
        }
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.addOrUpdateProtoAlarmData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("addOrUpdateProtoAlarmData error " + code, new Object[0]);
                callback.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                k14 k14VarQ;
                Logger.d("addOrUpdateProtoAlarmData onSuccess " + result, new Object[0]);
                if (result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null || !k14VarQ.z()) {
                    callback.onError(-1);
                    return;
                }
                if (z) {
                    AlarmSettingItem alarmSettingItem = item;
                    s7r packet2 = result.getPacket();
                    Intrinsics.checkNotNull(packet2);
                    alarmSettingItem.setId(packet2.q().s());
                }
                item.setEnable(true);
                item.setNextAlarmTimeIfReOpen();
                callback.onResult(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    public static final boolean defaultVibrate(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable VibrateType vibrateType) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.defaultVibrate(vibrateType);
        }
        return false;
    }

    public static final void deleteAlarms(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull List<? extends AlarmSettingItem> list, @NotNull eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (list.isEmpty()) {
            callback.onResult(Boolean.FALSE);
        } else if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            deleteHuamiAlarms(wearableDeviceModel, list, callback);
        } else {
            deleteProtoAlarms(list, callback);
        }
    }

    private static final void deleteHuamiAlarms(WearableDeviceModel wearableDeviceModel, List<? extends AlarmSettingItem> list, eu6<Boolean> eu6Var) {
        ScopeExtKt.scope$default(null, new C21351(eu6Var, list, wearableDeviceModel, null), 1, null);
    }

    private static final void deleteProtoAlarms(List<? extends AlarmSettingItem> list, final eu6<Boolean> eu6Var) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 4;
        l14 l14Var = new l14();
        l14Var.c = new int[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l14Var.c[i] = list.get(i).getId();
        }
        k14 k14Var = new k14();
        k14Var.E(l14Var);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.deleteProtoAlarms.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                eu6Var.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                eu6Var.onResult(Boolean.valueOf(result != null ? SyncResultExitKt.isSuccess(result) : false));
            }
        }, 0, 8, null);
    }

    public static final boolean disableBind(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.disableBind(z);
        }
        return false;
    }

    public static final void doFactoryDump(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            s7r s7rVar = new s7r();
            s7rVar.e = 13;
            s7rVar.f = 2;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, callback, 0, 8, null);
        }
    }

    public static final boolean enableConnectedAdv(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableConnectedAdv(z);
        }
        return false;
    }

    public static final boolean enableGoalRemind(@NotNull WearableDeviceModel wearableDeviceModel, boolean z, int i) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableGoalRemind(z, i);
        }
        return false;
    }

    public static final boolean enableHrBroadcast(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableHrBroadcast(z);
        }
        return false;
    }

    public static final boolean enableOsa(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableOsa(z);
        }
        return false;
    }

    public static final boolean enablePressure(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enablePressure(z);
        }
        return false;
    }

    public static final boolean enableSportHeartRate(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableSportHeartRate(z);
        }
        return false;
    }

    public static final boolean enableWristBright(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull HMLiftWristConfig info) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.enableWristBright(info);
        }
        return false;
    }

    public static final void getAlarmClocks(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull eu6<AlarmSetting> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            getHuamiAlarms(wearableDeviceModel, callback);
        } else {
            getAlarmsByProto(wearableDeviceModel, callback);
        }
    }

    private static final void getAlarmsByProto(WearableDeviceModel wearableDeviceModel, final eu6<AlarmSetting> eu6Var) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getAlarmsByProto.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("getAlarmsByProto error " + code, new Object[0]);
                eu6Var.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                m14[] m14VarArr;
                s7r packet;
                k14 k14VarQ;
                AlarmSetting alarmSetting = new AlarmSetting();
                ArrayList arrayList = new ArrayList();
                m14.b bVarR = (result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null) ? null : k14VarQ.r();
                if (bVarR != null && (m14VarArr = bVarR.c) != null) {
                    for (m14 m14Var : m14VarArr) {
                        AlarmSettingItem alarmSettingItem = AlarmSettingItem.parse(m14Var);
                        alarmSettingItem.setVisible(alarmSettingItem.isEnable());
                        alarmSettingItem.setNextAlarmTimeIfReOpen();
                        Intrinsics.checkNotNull(alarmSettingItem);
                        arrayList.add(alarmSettingItem);
                    }
                }
                alarmSetting.setAlarmItems(arrayList);
                alarmSetting.setSupportHoliday(bVarR != null ? bVarR.e : false);
                alarmSetting.setSupportIntelligence(bVarR != null ? bVarR.f : false);
                alarmSetting.setSupportMaxClocks(bVarR != null ? bVarR.d : 0);
                eu6Var.onResult(alarmSetting);
            }
        }, 0, 16, (Object) null);
    }

    @Nullable
    public static final String getAlias(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        String alias = wearableDeviceModel.getProduct().getAlias();
        return (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) && alias == null) ? "kongming" : alias;
    }

    public static final void getAuthorizeUnlock(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 19;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, callback, 0, 8, null);
    }

    @NotNull
    public static final List<HMReminderInfo> getHMReminderList(@NotNull List<? extends EventReMinderItem> mindItemList) {
        Intrinsics.checkNotNullParameter(mindItemList, "mindItemList");
        ArrayList arrayList = new ArrayList();
        for (EventReMinderItem eventReMinderItem : mindItemList) {
            HMReminderInfo hMReminderInfo = new HMReminderInfo();
            boolean z = false;
            hMReminderInfo.setEnable(eventReMinderItem.getOp() == 1);
            hMReminderInfo.setId(eventReMinderItem.getId());
            String from = eventReMinderItem.getFrom();
            Intrinsics.checkNotNullExpressionValue(from, "getFrom(...)");
            hMReminderInfo.setFrom(Integer.parseInt(from));
            if (eventReMinderItem.getLoop().equals(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD)) {
                hMReminderInfo.removeFlag(HMReminderInfo.FLAG_LOOP);
                hMReminderInfo.setStopTime(null);
            } else {
                EventMinderUtil eventMinderUtil = EventMinderUtil.INSTANCE;
                String loop = eventReMinderItem.getLoop();
                Intrinsics.checkNotNullExpressionValue(loop, "getLoop(...)");
                hMReminderInfo.addFlag((short) eventMinderUtil.toFlag(loop));
            }
            if (eventReMinderItem.getOp() == 2) {
                z = true;
            }
            hMReminderInfo.setDelete(z);
            hMReminderInfo.setRemindBody(eventReMinderItem.getTitle());
            hMReminderInfo.setRemindStr("", eventReMinderItem.getTitle());
            EventMinderUtil eventMinderUtil2 = EventMinderUtil.INSTANCE;
            String loop2 = eventReMinderItem.getLoop();
            Intrinsics.checkNotNullExpressionValue(loop2, "getLoop(...)");
            Date date = new Date(eventMinderUtil2.getNextReminderTime(loop2, eventReMinderItem.getStartDateLong()));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            hMReminderInfo.setStartTime(calendar);
            arrayList.add(hMReminderInfo);
        }
        return arrayList;
    }

    private static final void getHuamiAlarms(WearableDeviceModel wearableDeviceModel, eu6<AlarmSetting> eu6Var) {
        List<AlarmSettingItem> alarmItems;
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK).valueToObject(AlarmSetting.class);
        AlarmSetting alarmSetting = objValueToObject instanceof AlarmSetting ? (AlarmSetting) objValueToObject : null;
        AlarmSetting alarmSetting2 = new AlarmSetting();
        alarmSetting2.setSupportMaxClocks(10);
        if (alarmSetting != null && (alarmItems = alarmSetting.getAlarmItems()) != null) {
            alarmSetting2.setAlarmItems(getVisibleAlarmClock(alarmItems));
        }
        eu6Var.onResult(alarmSetting2);
    }

    @Nullable
    public static final HuamiApiCaller getHuamiDevice(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
        }
        return null;
    }

    @Nullable
    public static final List<Integer> getRssiArray(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return wearableDeviceModel.getProduct().getRssiArray();
    }

    @NotNull
    public static final List<AlarmSettingItem> getVisibleAlarmClock(@NotNull List<? extends AlarmSettingItem> alarmClockBeanList) {
        Intrinsics.checkNotNullParameter(alarmClockBeanList, "alarmClockBeanList");
        ArrayList arrayList = new ArrayList();
        for (AlarmSettingItem alarmSettingItem : alarmClockBeanList) {
            if (alarmSettingItem.getAlarmType() == 0) {
                alarmSettingItem.setEnable(System.currentTimeMillis() - alarmSettingItem.getNextAlarmTimeLong() < 0);
            }
            if (alarmSettingItem.isVisible()) {
                arrayList.add(alarmSettingItem);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public static final boolean isSupportNightMode(@NotNull WearableDeviceModel wearableDeviceModel) {
        boolean zSupportNightModeSetting;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.NIGHT_MODE);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(wearableDeviceModel)) {
            DeviceSettingsPreference deviceSettingsPreference = DeviceSettingsPreference.INSTANCE;
            int l66SupportNightMode = deviceSettingsPreference.getL66SupportNightMode(wearableDeviceModel.getDid());
            if (l66SupportNightMode == 0) {
                HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
                zSupportNightModeSetting = huaMiApiCaller != null ? huaMiApiCaller.supportNightModeSetting() : false;
                deviceSettingsPreference.setL66SupportNightMode(wearableDeviceModel.getDid(), zSupportNightModeSetting ? 1 : 2);
            } else if (l66SupportNightMode != 1) {
                zSupportNightModeSetting = false;
            } else {
                zSupportNightModeSetting = true;
            }
        } else {
            zSupportNightModeSetting = true;
        }
        return zIsSupportFeature && zSupportNightModeSetting;
    }

    public static final boolean isSupportUnlockLaptop(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.AUTH_UNLOCK);
        }
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.AUTH_UNLOCK) | AppUtil.INSTANCE.isDevChannel();
    }

    public static final boolean isSupportUnlockPhone(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.UNLOCK_PHONE);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(Constants.SETTINGS_PACKAGE, "com.android.settings.MiuiSecurityBluetoothSettings"));
        Logger.i("DeviceModel", "isSupportUnlockPhone by feature:" + zIsSupportFeature);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            List<ResolveInfo> listQueryIntentActivities = ApplicationExtKt.getApplication().getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            return (!listQueryIntentActivities.isEmpty()) & zIsSupportFeature;
        }
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel) || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
            return DeviceSettingsComponent.INSTANCE.isSupportUnlockPhone() & zIsSupportFeature;
        }
        return false;
    }

    public static final boolean isSupportWorldClock(@NotNull WearableDeviceModel wearableDeviceModel) {
        boolean zHasSoftwareFeature;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WORLD_CLOCK);
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isL66(wearableDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            zHasSoftwareFeature = huaMiApiCaller != null ? huaMiApiCaller.hasSoftwareFeature(53) : false;
        } else {
            zHasSoftwareFeature = true;
        }
        return zIsSupportFeature && zHasSoftwareFeature;
    }

    public static final boolean isSupportWristScreenWake(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        return com.xiaomi.fitness.device.manager.DeviceModelExtKt.isWearOS(wearableDeviceModel) ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "wrist") : com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "wrist");
    }

    public static final boolean isSupportXiaoAi(@NotNull WearableDeviceModel wearableDeviceModel) {
        boolean zHasSoftwareFeature;
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        boolean zIsSupportFeature = com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "xiaoai");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            zHasSoftwareFeature = huaMiApiCaller != null ? huaMiApiCaller.hasSoftwareFeature(17) : false;
        } else {
            zHasSoftwareFeature = true;
        }
        Logger.d("isSupportXiaoAi " + com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) + " " + zIsSupportFeature + " " + wearableDeviceModel.getIsDeviceConnected() + " " + zHasSoftwareFeature, new Object[0]);
        return zIsSupportFeature && zHasSoftwareFeature;
    }

    @Nullable
    public static final Settings querySettingSync(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull SettingsGroupType settingsGroupType) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(settingsGroupType, "settingsGroupType");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.querySettingSync(settingsGroupType);
        }
        return null;
    }

    public static final boolean setAtrialFibEnable(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.setAtrialFibEnable(z);
        }
        return false;
    }

    public static final void setAuthorizeUnlock(@NotNull WearableDeviceModel wearableDeviceModel, int i, boolean z, @NotNull OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 20;
        lwo lwoVar = new lwo();
        lwoVar.c = i;
        lwoVar.d = z;
        txo txoVar = new txo();
        txoVar.W(lwoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, callback, 0, 8, null);
    }

    public static final boolean setAutoBacklight(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull HMAutoBacklightInfo info) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.setAutoBacklight(info);
        }
        return false;
    }

    public static final boolean setHidStatus(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull HidStatus hidStatus) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(hidStatus, "hidStatus");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.setHidStatus(hidStatus);
        }
        return false;
    }

    public static final boolean setHighHr(@NotNull WearableDeviceModel wearableDeviceModel, boolean z, int i) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        boolean highHr = huamiDevice != null ? huamiDevice.setHighHr(z, i) : false;
        Logger.i("DeviceModel", "setHrReminder " + z + " " + i + ":" + highHr);
        return highHr;
    }

    public static final boolean setLowHr(@NotNull WearableDeviceModel wearableDeviceModel, boolean z, int i) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        boolean lowHr = huamiDevice != null ? huamiDevice.setLowHr(z, i) : false;
        Logger.i("DeviceModel", "setLowHrReminder " + z + " " + i + ":" + lowHr);
        return lowHr;
    }

    public static final boolean setVibrate(@NotNull WearableDeviceModel wearableDeviceModel, @Nullable VibrateType vibrateType, short s, @NotNull short[] times) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(times, "times");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.setVibrate(vibrateType, s, times);
        }
        return false;
    }

    public static final boolean setWearLocation(@NotNull WearableDeviceModel wearableDeviceModel, boolean z) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.setWearLocation(z);
        }
        return false;
    }

    public static final boolean supportHrDetection(@NotNull WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        boolean zSupportHrDetection = huamiDevice != null ? huamiDevice.supportHrDetection() : false;
        Logger.i("DeviceModel", "supportHrDetection:" + zSupportHrDetection);
        return zSupportHrDetection;
    }

    @NotNull
    public static final o4h<Boolean> syncEventMinders(@NotNull final WearableDeviceModel wearableDeviceModel, @Nullable final List<? extends EventReMinderItem> list) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        if (!com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel) || list == null || list.isEmpty()) {
            o4h<Boolean> o4hVarE = o4h.E(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(o4hVarE, "just(...)");
            return o4hVarE;
        }
        o4h<Boolean> o4hVarS = o4h.f(new j5h() { // from class: oa6
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                DeviceModelExtKt.syncEventMinders$lambda$9(list, wearableDeviceModel, v4hVar);
            }
        }).S(ofl.c());
        Intrinsics.checkNotNullExpressionValue(o4hVarS, "subscribeOn(...)");
        return o4hVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncEventMinders$lambda$9(List list, WearableDeviceModel this_syncEventMinders, v4h emitter) {
        Intrinsics.checkNotNullParameter(this_syncEventMinders, "$this_syncEventMinders");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        List<HMReminderInfo> hMReminderList = getHMReminderList(list);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(this_syncEventMinders));
        emitter.onNext(Boolean.valueOf(huaMiApiCaller != null ? huaMiApiCaller.setReminderSync(hMReminderList) : false));
        emitter.onComplete();
    }

    private static final void syncHuamiAlarm(WearableDeviceModel wearableDeviceModel, AlarmSettingItem alarmSettingItem, boolean z, eu6<Boolean> eu6Var) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK).valueToObject(AlarmSetting.class);
        AlarmSetting alarmSetting = objValueToObject instanceof AlarmSetting ? (AlarmSetting) objValueToObject : null;
        if (alarmSetting == null) {
            eu6Var.onResult(Boolean.FALSE);
        } else if (alarmSetting.getAlarmItems().isEmpty()) {
            eu6Var.onResult(Boolean.FALSE);
        } else {
            alarmSetting.switchState(alarmSettingItem, z);
            ScopeExtKt.scope$default(null, new DeviceModelExtKt$syncHuamiAlarm$1$1(wearableDeviceModel, alarmSetting, eu6Var, null), 1, null);
        }
    }

    private static final void syncProtoAlarm(final AlarmSettingItem alarmSettingItem, final boolean z, final eu6<Boolean> eu6Var) {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 5;
        m14 m14Var = AlarmSettingItem.parse(alarmSettingItem);
        m14.a aVar = m14Var.d;
        aVar.f = z;
        aVar.h = alarmSettingItem.isIsSmart() ? 1 : 2;
        k14 k14Var = new k14();
        k14Var.F(m14Var);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.syncProtoAlarm.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(" sync syncProtoAlarm onError " + code, new Object[0]);
                eu6Var.onResult(Boolean.FALSE);
                eu6Var.onError(code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(" sync syncProtoAlarm onSuccess", new Object[0]);
                alarmSettingItem.setEnable(z);
                eu6Var.onResult(Boolean.TRUE);
            }
        }, 0, 8, null);
    }

    public static final void syncRemoteAlarmData(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull AlarmSettingItem item, boolean z, @NotNull eu6<Boolean> callback) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            syncHuamiAlarm(wearableDeviceModel, item, z, callback);
        } else {
            syncProtoAlarm(item, z, callback);
        }
    }

    public static final boolean testVibrate(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull short[] times) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(times, "times");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.testVibrate(times);
        }
        return false;
    }

    @Nullable
    public static final List<EventReMinderItem> toEventMinderList(@NotNull List<? extends HMReminderInfo> hmReminderInfos) {
        Intrinsics.checkNotNullParameter(hmReminderInfos, "hmReminderInfos");
        ArrayList arrayList = new ArrayList();
        for (HMReminderInfo hMReminderInfo : hmReminderInfos) {
            if (!hMReminderInfo.isDelete()) {
                EventReMinderItem eventReMinderItem = new EventReMinderItem();
                eventReMinderItem.setOp(hMReminderInfo.isEnable() ? 1 : 0);
                eventReMinderItem.setId(hMReminderInfo.getId());
                eventReMinderItem.setFrom(String.valueOf(hMReminderInfo.getFrom()));
                eventReMinderItem.setTitle(hMReminderInfo.getRemindBody());
                int flag = hMReminderInfo.getFlag();
                if (((flag >> 13) & 1) == 1) {
                    eventReMinderItem.setLoop(UserConfig.KEY_LITE_SCENE_ORDER);
                } else if (((flag >> 12) & 1) == 1) {
                    eventReMinderItem.setLoop(UserConfig.KEY_MI_BRAIN_SETTING);
                } else if (flag < 32) {
                    eventReMinderItem.setLoop(b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
                } else {
                    StringBuilder sb = new StringBuilder();
                    int i = 1;
                    boolean z = true;
                    while (i < 8) {
                        if (((flag >> (i + 4)) & 1) == 1) {
                            sb.append(i);
                            sb.append(",");
                        } else {
                            z = false;
                        }
                        i++;
                        z = z;
                    }
                    if (sb.length() > 0) {
                        String strSubstring = sb.substring(0, sb.length() - 1);
                        if (z) {
                            eventReMinderItem.setLoop("0");
                        } else {
                            eventReMinderItem.setLoop(strSubstring);
                        }
                    }
                }
                Calendar startTime = hMReminderInfo.getStartTime();
                if (startTime == null) {
                    Logger.i("DeviceModel", "toEventMinderList,calendar = null");
                } else {
                    eventReMinderItem.setStartDateLong(startTime.getTimeInMillis());
                    arrayList.add(eventReMinderItem);
                }
            }
        }
        return arrayList;
    }

    public static final boolean writeSettingSync(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
        Intrinsics.checkNotNullParameter(settings, "settings");
        HuamiApiCaller huamiDevice = getHuamiDevice(wearableDeviceModel);
        if (huamiDevice != null) {
            return huamiDevice.writeSettingSync(settings);
        }
        return false;
    }
}
