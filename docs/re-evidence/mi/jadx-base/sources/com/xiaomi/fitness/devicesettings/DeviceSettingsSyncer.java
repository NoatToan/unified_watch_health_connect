package com.xiaomi.fitness.devicesettings;

import android.media.AudioManager;
import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.UserProfileExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer;
import com.xiaomi.fitness.devicesettings.base.worldclock.CityTimeZoneHelper;
import com.xiaomi.fitness.devicesettings.base.worldclock.TimeZoneItem;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockUtils;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsSyncHelperImplKt;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuamiAppSortHelperKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.utils.HrUtils;
import com.xiaomi.fitness.devicesettings.huami.nightmode.NightModeHelper;
import com.xiaomi.fitness.devicesettings.huami.shortcut.HuamiShortcutHelper;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.devicesettings.utils.HuamiDeviceTool;
import com.xiaomi.fitness.devicesettings.utils.LanguageHelper;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManager;
import com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.AlarmNotifyEnabled;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.settingitem.settingitem.AppSort;
import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinder;
import com.xiaomi.fitness.settingitem.settingitem.EventReMinderItem;
import com.xiaomi.fitness.settingitem.settingitem.GoalRemindSetting;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.fitness.settingitem.settingitem.LanguageSetting;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import com.xiaomi.fitness.settingitem.settingitem.NightMode;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreen;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreenItem;
import com.xiaomi.fitness.settingitem.settingitem.SedentaryConfig;
import com.xiaomi.fitness.settingitem.settingitem.UnlockLaptop;
import com.xiaomi.fitness.settingitem.settingitem.UnwearSetting;
import com.xiaomi.fitness.settingitem.settingitem.WearHand;
import com.xiaomi.fitness.settingitem.settingitem.WorldclockSetting;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.onetrack.c.q;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vxo;
import defpackage.zwo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\fJ\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0016\u00100\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u0002022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010E\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010F\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u000e\u0010G\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006H"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/DeviceSettingsSyncer;", "", "<init>", "()V", "TAG", "", "syncZenModeMode", "", "syncDeviceDid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverHuamiSettings", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PaiData.LAST_SYNC_TIME, "", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "syncHuamiSettings", "did", "syncHuamiAppSort", "syncHuamiHeartInfo", "isFirstSync", "", "syncHeartInfoL66", "syncHeartInfoKongmingPangu", "syncHuamiAlarmClocks", "syncAlarmsFromDevice", "syncAlarmsFromRemote", "syncUnWearLock", "syncBluetoothLanguage", "currentDeviceModel", "syncHuamiLanguage", "isLocalChange", "syncEventMinders", "syncShortcut", "syncAlarmNotifyEnabled", "syncInCall", "syncWearHand", "syncLiftWristBrightConfig", "syncGoalRemindConfig", "syncNightModel", "syncSedentaryConfig", "syncPhoneMuteState", "syncUnlockLaptop", "syncWorldClock", "setDeviceAlarmSyncSrc", "source", "", "getDeviceAlarmSyncSrc", "convertToSettingsLanguageV2", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "languageSetting", "Lcom/xiaomi/fitness/settingitem/settingitem/LanguageSetting;", "convertToDisplayAndBrightnessV2", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "wristBrightView", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "convertToLiftWristConfig", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "getHuaMiSedentaryConfig", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/SedentaryConfig;", "getHMSedentaryConfig", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "syncHuamiSchedule", "syncDeviceLanguageWhenLocalChange", "syncWorldClockWhenLocalChange", "syncNotificationSetting", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingsSyncer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsSyncer.kt\ncom/xiaomi/fitness/devicesettings/DeviceSettingsSyncer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,898:1\n1#2:899\n*E\n"})
public final class DeviceSettingsSyncer {

    @NotNull
    public static final DeviceSettingsSyncer INSTANCE = new DeviceSettingsSyncer();

    @NotNull
    public static final String TAG = "DeviceSettingsSyncer";
    private static long lastSyncTime;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$recoverHuamiSettings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$recoverHuamiSettings$2", f = "DeviceSettingsSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i(DeviceSettingsSyncer.TAG, "recoverHuamiSettings");
            DeviceSettingsSyncer deviceSettingsSyncer = DeviceSettingsSyncer.INSTANCE;
            deviceSettingsSyncer.syncHuamiHeartInfo(this.$deviceModel, true);
            deviceSettingsSyncer.syncHuamiAppSort(this.$deviceModel);
            deviceSettingsSyncer.syncHuamiLanguage(this.$deviceModel, false);
            deviceSettingsSyncer.syncAlarmsFromRemote(this.$deviceModel.getDid());
            if (!DeviceModelExtKt.isSupportFeature(this.$deviceModel, Feature.MASTERCARD)) {
                deviceSettingsSyncer.syncUnWearLock(this.$deviceModel.getDid());
            }
            deviceSettingsSyncer.syncEventMinders(this.$deviceModel);
            deviceSettingsSyncer.syncShortcut(this.$deviceModel);
            deviceSettingsSyncer.syncAlarmNotifyEnabled(this.$deviceModel);
            deviceSettingsSyncer.syncInCall(this.$deviceModel);
            deviceSettingsSyncer.syncWearHand(this.$deviceModel);
            deviceSettingsSyncer.syncLiftWristBrightConfig(this.$deviceModel);
            deviceSettingsSyncer.syncGoalRemindConfig(this.$deviceModel);
            deviceSettingsSyncer.syncNightModel(this.$deviceModel);
            deviceSettingsSyncer.syncSedentaryConfig(this.$deviceModel);
            deviceSettingsSyncer.syncUnlockLaptop(this.$deviceModel);
            deviceSettingsSyncer.syncWorldClock(this.$deviceModel);
            deviceSettingsSyncer.syncHuamiSchedule(this.$deviceModel);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncDeviceLanguageWhenLocalChange$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncDeviceLanguageWhenLocalChange$2", f = "DeviceSettingsSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19952 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19952(WearableDeviceModel wearableDeviceModel, Continuation<? super C19952> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19952(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (DeviceModelExtKt.isL66(this.$deviceModel)) {
                DeviceSettingsSyncer.INSTANCE.syncHuamiLanguage(this.$deviceModel, true);
            } else {
                DeviceSettingsSyncer.INSTANCE.syncBluetoothLanguage(this.$deviceModel);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncHuamiSettings$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncHuamiSettings$2", f = "DeviceSettingsSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19962(String str, Continuation<? super C19962> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19962(this.$did, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i(DeviceSettingsSyncer.TAG, "syncHuamiSettings:" + this.$did);
            long jCurrentTimeMillis = System.currentTimeMillis();
            DeviceSettingsSyncer deviceSettingsSyncer = DeviceSettingsSyncer.INSTANCE;
            if (jCurrentTimeMillis - deviceSettingsSyncer.getLastSyncTime() < 60000) {
                Logger.i(DeviceSettingsSyncer.TAG, "sync huami settings less than 1min, stop sync");
                return Unit.INSTANCE;
            }
            deviceSettingsSyncer.setLastSyncTime(System.currentTimeMillis());
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(this.$did);
            if (wearableDeviceModel == null) {
                return Unit.INSTANCE;
            }
            deviceSettingsSyncer.syncHuamiHeartInfo(wearableDeviceModel, false);
            deviceSettingsSyncer.syncAlarmsFromDevice(this.$did);
            deviceSettingsSyncer.syncHuamiAppSort(wearableDeviceModel);
            deviceSettingsSyncer.syncShortcut(wearableDeviceModel);
            deviceSettingsSyncer.syncNightModel(wearableDeviceModel);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncWorldClockWhenLocalChange$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer$syncWorldClockWhenLocalChange$2", f = "DeviceSettingsSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19972(WearableDeviceModel wearableDeviceModel, Continuation<? super C19972> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19972(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (DeviceModelExtKt.isL66(this.$deviceModel)) {
                DeviceSettingsSyncer.INSTANCE.syncWorldClock(this.$deviceModel);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private DeviceSettingsSyncer() {
    }

    private final DisplayAndBrightnessV2 convertToDisplayAndBrightnessV2(LiftWristBrightView wristBrightView) {
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        if (!wristBrightView.isEnable()) {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(0));
        } else if (wristBrightView.isAllday()) {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(2));
        } else {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(1));
        }
        displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(new EnumData(wristBrightView.getSensitivity()));
        int start = wristBrightView.getStart();
        int stop = wristBrightView.getStop();
        displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(new Time(start / 60, start % 60));
        displayAndBrightnessV2.setScreenOnByTurningWristEndTime(new Time(stop / 60, stop % 60));
        return displayAndBrightnessV2;
    }

    private final HMLiftWristConfig convertToLiftWristConfig(LiftWristBrightView wristBrightView) {
        HMLiftWristConfig hMLiftWristConfig = new HMLiftWristConfig();
        hMLiftWristConfig.setEnable(wristBrightView.isEnable());
        hMLiftWristConfig.setAllDay(wristBrightView.isAllday());
        hMLiftWristConfig.setSensitivity(wristBrightView.getSensitivity());
        int start = wristBrightView.getStart();
        hMLiftWristConfig.setStartHour(start / 60);
        hMLiftWristConfig.setStartMinutes(start % 60);
        int stop = wristBrightView.getStop();
        hMLiftWristConfig.setStopHour(stop / 60);
        hMLiftWristConfig.setStopMinutes(stop % 60);
        return hMLiftWristConfig;
    }

    private final int getDeviceAlarmSyncSrc(String did) {
        return DeviceSettingsSyncHelperImplKt.getHuamiDeviceAlarmSyncSrc(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE), did);
    }

    private final HMSedentaryConfig getHMSedentaryConfig(SedentaryConfig config) {
        HMSedentaryConfig hMSedentaryConfig = new HMSedentaryConfig();
        hMSedentaryConfig.setEnable(config.enable);
        hMSedentaryConfig.setInterval((short) 60);
        List<SedentaryConfig.MiddayRest> list = config.middayRest;
        boolean z = false;
        if (list != null && (!list.isEmpty()) && list.get(0).enable) {
            z = true;
        }
        hMSedentaryConfig.setPeriodEnable(z);
        hMSedentaryConfig.setDndStart(HMSedentaryConfig.INGORE_START_INDEX);
        hMSedentaryConfig.setDndStop(HMSedentaryConfig.INGORE_STOP_INDEX);
        hMSedentaryConfig.setStartIndex(config.workSt);
        hMSedentaryConfig.setStopIndex(config.workEd);
        return hMSedentaryConfig;
    }

    private final StandAlertConfig getHuaMiSedentaryConfig(SedentaryConfig config) {
        Time time;
        List<SedentaryConfig.MiddayRest> list = config.middayRest;
        boolean z = (list == null || list.isEmpty()) ? false : config.middayRest.get(0).enable;
        Time time2 = new Time(12, 0);
        Time time3 = new Time(14, 0);
        List<SedentaryConfig.MiddayRest> list2 = config.middayRest;
        if (list2 == null || list2.isEmpty() || config.middayRest.get(0) == null) {
            time = time2;
        } else {
            SedentaryConfig.MiddayRest middayRest = config.middayRest.get(0);
            int i = middayRest.start;
            Time time4 = new Time(i / 60, i % 60);
            int i2 = middayRest.stop;
            time3 = new Time(i2 / 60, i2 % 60);
            time = time4;
        }
        Time time5 = time3;
        boolean z2 = config.enable;
        int i3 = config.workSt;
        Time time6 = new Time(i3 / 60, i3 % 60);
        int i4 = config.workEd;
        return new StandAlertConfig(z2, 60, time6, new Time(i4 / 60, i4 % 60), z, time, time5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncAlarmNotifyEnabled(final WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_ALARM_NOTIFY_ENABLED).valueToObject(AlarmNotifyEnabled.class);
        final AlarmNotifyEnabled alarmNotifyEnabled = objValueToObject instanceof AlarmNotifyEnabled ? (AlarmNotifyEnabled) objValueToObject : null;
        if (alarmNotifyEnabled == null) {
            return;
        }
        MiBleDeviceManager.INSTANCE.createManager(ApplicationExtKt.getApplication(), new MiBleDeviceManagerListener() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer.syncAlarmNotifyEnabled.1
            @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
            public void onDestroy() {
            }

            @Override // com.xiaomi.fitness.mijia.sdk.MiBleDeviceManagerListener
            public void onInit(MiBleDeviceManager manager) {
                Intrinsics.checkNotNullParameter(manager, "manager");
                try {
                    if (manager.getSettingsBoolean(DeviceModelExtKt.getMac(deviceModel), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED) != alarmNotifyEnabled.isEnable()) {
                        manager.setSettings(DeviceModelExtKt.getMac(deviceModel), MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED, alarmNotifyEnabled.isEnable());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                manager.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncAlarmsFromDevice(String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel != null) {
            AlarmSetting defaultAlarmClocks = HuamiDeviceTool.INSTANCE.getDefaultAlarmClocks();
            HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
            List<AlarmClockExt> alarms = huamiDevice != null ? huamiDevice.getAlarms() : null;
            Logger.i(TAG, "syncAlarmsFromDevice " + (alarms != null ? Integer.valueOf(alarms.size()) : null));
            if (alarms != null) {
                Intrinsics.checkNotNull(alarms);
                for (AlarmClockExt alarmClockExt : alarms) {
                    HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
                    Intrinsics.checkNotNull(alarmClockExt);
                    AlarmSettingItem alarmSettingItemClockExtToClockBean = huamiDeviceTool.clockExtToClockBean(alarmClockExt);
                    defaultAlarmClocks.replaceItem(alarmSettingItemClockExtToClockBean, alarmSettingItemClockExtToClockBean.getId());
                }
            }
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            companion.saveDeviceSetItem(true, did, DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, defaultAlarmClocks);
            companion.sendSettingItem(did, DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, defaultAlarmClocks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncAlarmsFromRemote(String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel != null) {
            DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
            Object objValueToObject = companion.getInstance().readSettingItem(did, DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK).valueToObject(AlarmSetting.class);
            AlarmSetting defaultAlarmClocks = objValueToObject instanceof AlarmSetting ? (AlarmSetting) objValueToObject : null;
            if (defaultAlarmClocks == null || defaultAlarmClocks.getAlarmItems() == null) {
                defaultAlarmClocks = HuamiDeviceTool.INSTANCE.getDefaultAlarmClocks();
            } else {
                INSTANCE.setDeviceAlarmSyncSrc(did, 2);
                HuamiDeviceTool huamiDeviceTool = HuamiDeviceTool.INSTANCE;
                List<Integer> indexList = huamiDeviceTool.getIndexList(defaultAlarmClocks);
                if (!indexList.isEmpty()) {
                    defaultAlarmClocks = huamiDeviceTool.completeAlarmClocks(defaultAlarmClocks, indexList);
                    companion.getInstance().saveDeviceSetItem(true, did, DeviceSettingConfigKey.BIG_KEY_ALARMCLOCK, defaultAlarmClocks);
                }
            }
            List<AlarmClockExt> alarmClockExt = HuamiDeviceTool.INSTANCE.getAlarmClockExt(defaultAlarmClocks);
            HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
            Logger.i(TAG, "syncAlarmsFromRemote " + (huamiDevice != null ? Boolean.valueOf(huamiDevice.setAlarmSync(alarmClockExt)) : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final void syncEventMinders(WearableDeviceModel deviceModel) {
        List<? extends HMReminderInfo> arrayList;
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_EVENT_REMINDER).valueToObject(EventReMinder.class);
        EventReMinder eventReMinder = objValueToObject instanceof EventReMinder ? (EventReMinder) objValueToObject : null;
        if (eventReMinder != null) {
            List<EventReMinderItem> mindItems = eventReMinder.getMindItems();
            Intrinsics.checkNotNullExpressionValue(mindItems, "getMindItems(...)");
            arrayList = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHMReminderList(mindItems);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        } else {
            arrayList = new ArrayList<>();
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i("syncEventMinders result: " + (huaMiApiCaller != null ? huaMiApiCaller.setReminderSync(arrayList) : false), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncGoalRemindConfig(WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_GOAL_REMIND).valueToObject(GoalRemindSetting.class);
        GoalRemindSetting goalRemindSetting = objValueToObject instanceof GoalRemindSetting ? (GoalRemindSetting) objValueToObject : null;
        if (goalRemindSetting == null) {
            return;
        }
        int rainbowItemGoal = UserProfileExtKt.getRainbowItemGoal(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false), 1);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i("syncGoalRemindConfig result: " + (huaMiApiCaller != null ? huaMiApiCaller.enableGoalRemind(goalRemindSetting.isEnable(), rainbowItemGoal) : false), new Object[0]);
    }

    private final void syncHeartInfoKongmingPangu(WearableDeviceModel deviceModel) {
        Logger.i(TAG, "syncHeartInfoKongmingPangu start");
        if (com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel) == null) {
            Logger.w(TAG, "syncHeartInfoKongmingPangu error:HuamiApiCaller is null");
            return;
        }
        boolean z = !DeviceModelExtKt.isKongMing(deviceModel);
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT).valueToObject(HRDetect.class);
        HRDetect hRDetectDefaultKongMingConfig = objValueToObject instanceof HRDetect ? (HRDetect) objValueToObject : null;
        if (hRDetectDefaultKongMingConfig == null) {
            hRDetectDefaultKongMingConfig = z ? HrUtils.INSTANCE.defaultKongMingConfig() : HrUtils.INSTANCE.defaultPanguConfig(deviceModel);
        }
        HrUtils.INSTANCE.syncSetting2device(deviceModel, hRDetectDefaultKongMingConfig, z);
    }

    private final void syncHeartInfoL66(WearableDeviceModel deviceModel, boolean isFirstSync) {
        Logger.i(TAG, "syncHeartInfoL66 start");
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        if (huamiDevice == null) {
            Logger.w(TAG, "syncHeartInfoL66 error:HuamiApiCaller is null");
            return;
        }
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT).valueToObject(HRDetect.class);
        HRDetect hRDetect = objValueToObject instanceof HRDetect ? (HRDetect) objValueToObject : null;
        if (isFirstSync && hRDetect != null) {
            Logger.i(TAG, "syncHeartInfoL66 firstSync remoteInfo:" + hRDetect);
            HrUtils.INSTANCE.syncSetting2device(deviceModel, hRDetect, false);
            return;
        }
        HRDetect hRDetectDefaultL66Config = HrUtils.INSTANCE.defaultL66Config(deviceModel);
        int heartRateConfig = huamiDevice.getHeartRateConfig();
        boolean atrialFibEnable = huamiDevice.getAtrialFibEnable();
        int hrReminder = huamiDevice.getHrReminder();
        boolean hrReminderEnable = huamiDevice.getHrReminderEnable();
        int lowHrReminder = huamiDevice.getLowHrReminder();
        boolean lowHrReminderEnable = huamiDevice.getLowHrReminderEnable();
        boolean smartSpo2Enable = huamiDevice.getSmartSpo2Enable();
        int lowSpo2AlertValue = huamiDevice.getLowSpo2AlertValue();
        boolean sleepAssistantEnable = huamiDevice.getSleepAssistantEnable();
        boolean osaEnable = huamiDevice.getOsaEnable();
        boolean pressureEnable = huamiDevice.getPressureEnable();
        boolean pressureAlertEnable = huamiDevice.getPressureAlertEnable();
        Logger.i(TAG, "syncHeartInfoL66  hrMode " + heartRateConfig + " \natrialFibEnable:" + atrialFibEnable + " \nhrReminder:" + hrReminder + " \nhrReminderEnable:" + hrReminderEnable + " \nlowHrReminder:" + lowHrReminder + " \nlowHrReminderEnable:" + lowHrReminderEnable + " \nsmartSpo2Enable:" + smartSpo2Enable + " \nlowSpo2AlertValue:" + lowSpo2AlertValue + " \nsleepAssistantEnable:" + sleepAssistantEnable + " \nsleepBreathQualityEnable:" + osaEnable + " \npressureEnable:" + pressureEnable + " \npressureAlertEnable:" + pressureAlertEnable + " \n");
        if (heartRateConfig != 0) {
            if (heartRateConfig != 255) {
                hRDetectDefaultL66Config.setType(sleepAssistantEnable ? 3 : 2);
                hRDetectDefaultL66Config.setFreq(heartRateConfig);
            } else {
                hRDetectDefaultL66Config.setType(sleepAssistantEnable ? 3 : 2);
                hRDetectDefaultL66Config.setFreq(255);
            }
        } else {
            hRDetectDefaultL66Config.setType(sleepAssistantEnable ? 1 : 0);
        }
        hRDetectDefaultL66Config.setAbnormalHeartbeatEnable(atrialFibEnable);
        hRDetectDefaultL66Config.setWarningValue(hrReminder);
        hRDetectDefaultL66Config.setWarningEnable(hrReminderEnable);
        hRDetectDefaultL66Config.setLowWarningValue(lowHrReminder);
        hRDetectDefaultL66Config.setLowWarningEnable(lowHrReminderEnable);
        hRDetectDefaultL66Config.setSpo2Enable(smartSpo2Enable);
        hRDetectDefaultL66Config.setLowSpo2WarningEnable(lowSpo2AlertValue != 0);
        hRDetectDefaultL66Config.setLowSpo2WarningValue(lowSpo2AlertValue);
        hRDetectDefaultL66Config.setSleepBreathQualityEnable(osaEnable);
        hRDetectDefaultL66Config.setPressureEnable(pressureEnable);
        hRDetectDefaultL66Config.setRelaxReminder(pressureAlertEnable);
        Logger.i(TAG, "syncHeartInfoL66 l66Config:" + hRDetectDefaultL66Config);
        companion.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT, hRDetectDefaultL66Config);
    }

    private final void syncHuamiAlarmClocks(String did) {
        int deviceAlarmSyncSrc = getDeviceAlarmSyncSrc(did);
        Logger.i(TAG, "syncAlarmClocks " + deviceAlarmSyncSrc);
        if (deviceAlarmSyncSrc == 1) {
            syncAlarmsFromRemote(did);
        } else {
            if (deviceAlarmSyncSrc != 2) {
                return;
            }
            syncAlarmsFromDevice(did);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHuamiAppSort(WearableDeviceModel deviceModel) {
        boolean z;
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_APPSORT).valueToObject(AppSort.class);
        AppSort defaultAppSort = objValueToObject instanceof AppSort ? (AppSort) objValueToObject : null;
        boolean displayListSync = false;
        if (defaultAppSort == null) {
            defaultAppSort = HuamiAppSortHelperKt.getDefaultAppSort(deviceModel);
            z = true;
        } else {
            z = false;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (DeviceModelExtKt.isPanGu(deviceModel)) {
            List<AppSortItem> appsort = defaultAppSort.getAppsort();
            Intrinsics.checkNotNullExpressionValue(appsort, "getAppsort(...)");
            List<AppSortItem> listAddPatch = HuamiAppSortHelperKt.addPatch(appsort);
            if (huaMiApiCaller != null) {
                displayListSync = huaMiApiCaller.setAppSort(HuamiAppSortHelperKt.convert2AppItemUnderPangu(listAddPatch, deviceModel));
            }
        } else if (DeviceModelExtKt.isKongMing(deviceModel)) {
            List<AppSortItem> appsort2 = defaultAppSort.getAppsort();
            Intrinsics.checkNotNullExpressionValue(appsort2, "getAppsort(...)");
            List<AppSortItem> listAddPatch2 = HuamiAppSortHelperKt.addPatch(appsort2);
            if (huaMiApiCaller != null) {
                displayListSync = huaMiApiCaller.setAppSort(HuamiAppSortHelperKt.convertAppSortItemToAppItem(listAddPatch2));
            }
        } else {
            AppSort appSort = new AppSort();
            if (z) {
                Logger.i(TAG, "syncHuamiAppSort isFirst, sync device to cloud");
                companion.getInstance().sendSettingItem(deviceModel.getDeviceInfo().getDid(), DeviceSettingConfigKey.KEY_APPSORT, HuamiAppSortHelperKt.getDefaultAppSort(deviceModel));
            } else {
                List<AppSortItem> l66AppSortFromDevice = HuamiAppSortHelperKt.getL66AppSortFromDevice(deviceModel);
                if (l66AppSortFromDevice == null) {
                    return;
                }
                if (defaultAppSort.getAppsort().size() != l66AppSortFromDevice.size()) {
                    Logger.i(TAG, "syncHuamiAppSort ota new item, sync device to cloud: old: " + defaultAppSort.getAppsort().size() + " new: " + l66AppSortFromDevice.size());
                    appSort.setAppsort(l66AppSortFromDevice);
                    companion.getInstance().sendSettingItem(deviceModel.getDeviceInfo().getDid(), DeviceSettingConfigKey.KEY_APPSORT, appSort);
                    if (huaMiApiCaller != null) {
                        List<AppSortItem> appsort3 = appSort.getAppsort();
                        Intrinsics.checkNotNullExpressionValue(appsort3, "getAppsort(...)");
                        displayListSync = huaMiApiCaller.setDisplayListSync(1, HuamiAppSortHelperKt.convertAppItem2DisplayBean(appsort3, deviceModel));
                    }
                } else if (huaMiApiCaller != null) {
                    List<AppSortItem> appsort4 = defaultAppSort.getAppsort();
                    Intrinsics.checkNotNullExpressionValue(appsort4, "getAppsort(...)");
                    displayListSync = huaMiApiCaller.setDisplayListSync(1, HuamiAppSortHelperKt.convertAppItem2DisplayBean(appsort4, deviceModel));
                }
            }
        }
        Logger.i(TAG, "syncHuamiAppSort " + DeviceModelExtKt.getModel(deviceModel) + " result:" + displayListSync);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHuamiHeartInfo(WearableDeviceModel deviceModel, boolean isFirstSync) {
        boolean zIsKongMing = DeviceModelExtKt.isKongMing(deviceModel);
        boolean zIsPanGu = DeviceModelExtKt.isPanGu(deviceModel);
        if (zIsKongMing || zIsPanGu) {
            syncHeartInfoKongmingPangu(deviceModel);
        } else {
            syncHeartInfoL66(deviceModel, isFirstSync);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHuamiLanguage(WearableDeviceModel deviceModel, boolean isLocalChange) {
        LanguageSetting languageSetting;
        HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel);
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), "language").valueToObject(LanguageSetting.class);
        boolean language = false;
        if (objValueToObject != null) {
            languageSetting = (LanguageSetting) objValueToObject;
        } else {
            languageSetting = new LanguageSetting();
            DeviceInfoExt deviceInfo = huamiDevice != null ? huamiDevice.getDeviceInfo() : null;
            Intrinsics.checkNotNull(deviceInfo);
            languageSetting.setDeviceSource(deviceInfo.getDeviceSource());
            languageSetting.setLanguageFollowMobilePhoneSwitch(false);
            languageSetting.setDeviceLanguage(LanguageHelper.INSTANCE.getHuaMiDefaultLanguage().getLanguage());
        }
        if (DeviceModelExtKt.isL66(deviceModel) && languageSetting.isLanguageFollowMobilePhoneSwitch()) {
            int language2 = LanguageHelper.INSTANCE.getHuaMiDefaultLanguage().getLanguage();
            Logger.i(TAG, "is isLocalChange, settings deviceLanguage = " + languageSetting.getDeviceLanguage() + ",localLanguage " + language2);
            if (languageSetting.getDeviceLanguage() != language2) {
                languageSetting.setDeviceLanguage(language2);
                companion.getInstance().sendSettingItem(deviceModel.getDid(), "language", languageSetting);
            }
        }
        if (!DeviceModelExtKt.isL66(deviceModel)) {
            HMLanguage hMLanguage = new HMLanguage(languageSetting.getDeviceLanguage());
            hMLanguage.setLang(LanguageHelper.INSTANCE.getHuaMiLanguageStrByTag(hMLanguage.getLanguage()));
            if (huamiDevice != null) {
                language = huamiDevice.setLanguage(hMLanguage);
            }
        } else if (huamiDevice != null) {
            language = huamiDevice.writeSettingSync(INSTANCE.convertToSettingsLanguageV2(languageSetting));
        }
        Logger.i(TAG, "syncHuamiLanguage result: " + language + ", settings deviceLanguage = " + languageSetting.getDeviceLanguage() + ", isLanguageFollowMobilePhoneSwitch = " + languageSetting.isLanguageFollowMobilePhoneSwitch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncHuamiSchedule(WearableDeviceModel deviceModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncInCall(WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_INCALL).valueToObject(InCall.class);
        if (objValueToObject == null) {
            return;
        }
        DeviceSettingsPreference.INSTANCE.setKEY_IN_CALL_NOTIFY_CONFIG(deviceModel.getDid() + new Gson().toJson(objValueToObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncLiftWristBrightConfig(WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW).valueToObject(LiftWristBrightView.class);
        Boolean boolValueOf = null;
        LiftWristBrightView liftWristBrightView = objValueToObject instanceof LiftWristBrightView ? (LiftWristBrightView) objValueToObject : null;
        if (liftWristBrightView == null) {
            return;
        }
        if (DeviceModelExtKt.isL66(deviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            boolValueOf = Boolean.valueOf(huaMiApiCaller != null ? huaMiApiCaller.writeSettingSync(convertToDisplayAndBrightnessV2(liftWristBrightView)) : false);
        } else {
            HuamiApiCaller huaMiApiCaller2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            if (huaMiApiCaller2 != null) {
                boolValueOf = Boolean.valueOf(huaMiApiCaller2.enableWristBright(convertToLiftWristConfig(liftWristBrightView)));
            }
        }
        Logger.i("syncLiftWristBrightConfig result: " + boolValueOf, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncNightModel(WearableDeviceModel deviceModel) {
        boolean autoBacklight;
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_NIGHTMODE).valueToObject(NightMode.class);
        NightMode nightMode = objValueToObject instanceof NightMode ? (NightMode) objValueToObject : null;
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller == null) {
            return;
        }
        Settings settingsQuerySettingSync = huaMiApiCaller.querySettingSync(SettingsGroupType.GENERAL);
        General general = settingsQuerySettingSync instanceof General ? (General) settingsQuerySettingSync : null;
        Logger.i(TAG, "syncNightModel from device: " + (general != null ? general.getNightMode() : null) + " " + (general != null ? general.getNightModeStartTime() : null) + " " + (general != null ? general.getNightModeStopTime() : null));
        StringBuilder sb = new StringBuilder();
        sb.append("syncNightModel from cloud: ");
        sb.append(nightMode);
        Logger.i(TAG, sb.toString());
        if (nightMode == null) {
            NightModeHelper nightModeHelper = NightModeHelper.INSTANCE;
            NightMode defaultNightMode = nightModeHelper.getDefaultNightMode();
            HMAutoBacklightInfo hMAutoBacklightInfoConvertToAutoBackLightInfo = nightModeHelper.convertToAutoBackLightInfo(defaultNightMode);
            if (!DeviceModelExtKt.isL66(deviceModel) || huaMiApiCaller.supportNightModeSetting()) {
                autoBacklight = huaMiApiCaller.setAutoBacklight(hMAutoBacklightInfoConvertToAutoBackLightInfo);
                if (autoBacklight) {
                    companion.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_NIGHTMODE, defaultNightMode);
                }
            } else {
                autoBacklight = false;
            }
        } else {
            NightModeHelper nightModeHelper2 = NightModeHelper.INSTANCE;
            boolean zNightModelChangeByDevice = nightModeHelper2.nightModelChangeByDevice(general, nightMode);
            if (DeviceModelExtKt.isL66(deviceModel) && zNightModelChangeByDevice) {
                companion.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_NIGHTMODE, general != null ? nightModeHelper2.convertGeneralToMode(general) : null);
                autoBacklight = true;
            } else if (nightModeHelper2.needFormatNightMode(nightMode)) {
                NightMode nightMode2 = nightModeHelper2.formatNightMode(nightMode);
                boolean autoBacklight2 = huaMiApiCaller.setAutoBacklight(nightModeHelper2.convertToAutoBackLightInfo(nightMode2));
                if (autoBacklight2) {
                    companion.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_NIGHTMODE, nightMode2);
                }
                autoBacklight = autoBacklight2;
            } else {
                autoBacklight = huaMiApiCaller.setAutoBacklight(nightModeHelper2.convertToAutoBackLightInfo(nightMode));
            }
        }
        Logger.i("syncNightModel result: " + autoBacklight, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncNotificationSetting$lambda$11(boolean z, boolean z2, int i, int i2, int i3) {
        Logger.i(TAG, "syncNotificationSetting notifyEnabled:" + z + " allEnable:" + z2 + " screenOnNewNotification:" + i + " isNotifyStatusOnScreenLockEnable:" + i2 + " isOnlyWear:" + i3);
        return Unit.INSTANCE;
    }

    private final void syncPhoneMuteState(WearableDeviceModel deviceModel) {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            return;
        }
        boolean z = audioManager.getRingerMode() == 0;
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i("syncPhoneMuteState result: " + (huaMiApiCaller != null ? huaMiApiCaller.updatePhoneMuteState(z) : false), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncSedentaryConfig(WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_SEDENTARY_REMIND).valueToObject(SedentaryConfig.class);
        SedentaryConfig sedentaryConfig = objValueToObject instanceof SedentaryConfig ? (SedentaryConfig) objValueToObject : null;
        if (sedentaryConfig == null) {
            return;
        }
        boolean sedentary = false;
        if (DeviceModelExtKt.isL66(deviceModel)) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            if (huaMiApiCaller != null) {
                sedentary = huaMiApiCaller.syncStandAlertConfig(getHuaMiSedentaryConfig(sedentaryConfig));
            }
        } else {
            HuamiApiCaller huaMiApiCaller2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            if (huaMiApiCaller2 != null) {
                sedentary = huaMiApiCaller2.setSedentary(getHMSedentaryConfig(sedentaryConfig));
            }
        }
        Logger.i(TAG, "Device Sync syncSedentaryConfig enable = " + sedentaryConfig.enable + ", res = " + sedentary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncShortcut(WearableDeviceModel deviceModel) {
        boolean z;
        boolean shortcutApp;
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(deviceModel.getDid(), "secondaryscreen").valueToObject(SecondaryScreen.class);
        SecondaryScreen defaultSecondaryScreen = objValueToObject instanceof SecondaryScreen ? (SecondaryScreen) objValueToObject : null;
        if (defaultSecondaryScreen == null) {
            defaultSecondaryScreen = HuamiShortcutHelper.INSTANCE.getDefaultSecondaryScreen(deviceModel);
            z = true;
        } else {
            z = false;
        }
        List<SecondaryScreenItem> secondaryscreen = defaultSecondaryScreen.getSecondaryscreen();
        HuamiShortcutHelper huamiShortcutHelper = HuamiShortcutHelper.INSTANCE;
        Intrinsics.checkNotNull(secondaryscreen);
        huamiShortcutHelper.addPatch(secondaryscreen);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (DeviceModelExtKt.isKongMing(deviceModel) || DeviceModelExtKt.isPanGu(deviceModel)) {
            shortcutApp = huaMiApiCaller != null ? huaMiApiCaller.setShortcutApp(huamiShortcutHelper.convertSecondaryScreenItemToShortcutItem(secondaryscreen)) : false;
        } else {
            SecondaryScreen secondaryScreen = new SecondaryScreen();
            if (z) {
                Logger.i(TAG, "syncShortcut isFirst, sync device to cloud");
                companion.getInstance().sendSettingItem(deviceModel.getDid(), "secondaryscreen", huamiShortcutHelper.getDefaultSecondaryScreen(deviceModel));
            } else {
                List<SecondaryScreenItem> l66ShortcutFromDevice = huamiShortcutHelper.getL66ShortcutFromDevice(deviceModel);
                if (l66ShortcutFromDevice == null) {
                    return;
                }
                if (defaultSecondaryScreen.getSecondaryscreen().size() != l66ShortcutFromDevice.size()) {
                    Logger.i(TAG, "syncShortcut ota new item, sync device to cloud: old: " + defaultSecondaryScreen.getSecondaryscreen().size() + " new: " + l66ShortcutFromDevice.size());
                    secondaryScreen.setSecondaryscreen(l66ShortcutFromDevice);
                    companion.getInstance().sendSettingItem(deviceModel.getDid(), "secondaryscreen", secondaryScreen);
                } else if (huaMiApiCaller != null) {
                    shortcutApp = huaMiApiCaller.setDisplayListSync(2, huamiShortcutHelper.convertSecondaryScreenItemToDisplayBean(secondaryscreen));
                }
            }
        }
        Logger.i("syncShortcut result: " + shortcutApp, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncUnWearLock(String did) {
        String password;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD)) {
            return;
        }
        if (DeviceModelExtKt.isKongMing(wearableDeviceModel) || DeviceModelExtKt.isPanGu(wearableDeviceModel)) {
            Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(did, DeviceSettingConfigKey.KEY_UNWAER_SETTING).valueToObject(UnwearSetting.class);
            HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(wearableDeviceModel);
            if (objValueToObject != null) {
                UnwearSetting unwearSetting = (UnwearSetting) objValueToObject;
                String password2 = (unwearSetting.isEnable() || !((password = unwearSetting.getPassword()) == null || password.length() == 0)) ? unwearSetting.getPassword() : "123456";
                if (huamiDevice != null) {
                    huamiDevice.setUnwearPassword(unwearSetting.isEnable(), password2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncUnlockLaptop(WearableDeviceModel deviceModel) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_UNLOCK_LAPTOP).valueToObject(UnlockLaptop.class);
        UnlockLaptop unlockLaptop = objValueToObject instanceof UnlockLaptop ? (UnlockLaptop) objValueToObject : null;
        if (unlockLaptop != null) {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
            if ((huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.enableMultiLink(unlockLaptop.isEnable())) : null) != null) {
                return;
            }
        }
        HuamiApiCaller huaMiApiCaller2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller2 != null) {
            huaMiApiCaller2.enableMultiLink(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWearHand(WearableDeviceModel deviceModel) {
        boolean wearLocation;
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KEY_WEARHAND).valueToObject(WearHand.class);
        WearHand wearHand = objValueToObject instanceof WearHand ? (WearHand) objValueToObject : null;
        if (wearHand == null) {
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller != null) {
            wearLocation = huaMiApiCaller.setWearLocation(wearHand.getWay() == WearHand.Way.LEFT_HAND);
        } else {
            wearLocation = false;
        }
        Logger.i("syncWearHand result: " + wearLocation, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWorldClock(WearableDeviceModel deviceModel) {
        TimeZoneItem cityTimezoneItemById;
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_WORLDCLOCK).valueToObject(WorldclockSetting.class);
        WorldclockSetting worldclockSetting = objValueToObject instanceof WorldclockSetting ? (WorldclockSetting) objValueToObject : null;
        if (worldclockSetting == null) {
            return;
        }
        CityTimeZoneHelper companion = CityTimeZoneHelper.INSTANCE.getInstance();
        if (companion != null) {
            companion.init(ApplicationExtKt.getApplication());
        }
        ArrayList arrayList = new ArrayList();
        List<String> cityIds = worldclockSetting.getCityIds();
        int size = cityIds.size();
        for (int i = 0; i < size; i++) {
            String str = cityIds.get(i);
            CityTimeZoneHelper companion2 = CityTimeZoneHelper.INSTANCE.getInstance();
            if (companion2 != null) {
                Intrinsics.checkNotNull(str);
                cityTimezoneItemById = companion2.getCityTimezoneItemById(str);
            } else {
                cityTimezoneItemById = null;
            }
            if (cityTimezoneItemById != null) {
                arrayList.add(cityTimezoneItemById);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = arrayList.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            arrayList2.add(WorldClockUtils.convertTimeZoneItem2WorldTime((TimeZoneItem) obj, i2));
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        Logger.i("syncWorldClock result: " + (huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.setWorldClock(arrayList2)) : null), new Object[0]);
    }

    @NotNull
    public final SettingsLanguageV2 convertToSettingsLanguageV2(@NotNull LanguageSetting languageSetting) {
        Intrinsics.checkNotNullParameter(languageSetting, "languageSetting");
        SettingsLanguageV2 settingsLanguageV2 = new SettingsLanguageV2();
        settingsLanguageV2.setLanguage(new EnumData(languageSetting.getDeviceLanguage()));
        settingsLanguageV2.setLanguageFollowMobilePhoneSwitch(Boolean.valueOf(languageSetting.isLanguageFollowMobilePhoneSwitch()));
        return settingsLanguageV2;
    }

    public final long getLastSyncTime() {
        return lastSyncTime;
    }

    @Nullable
    public final Object recoverHuamiSettings(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(wearableDeviceModel, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void setDeviceAlarmSyncSrc(@NotNull String did, int source) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).setHuamiDeviceAlarmSyncSrc(did, source);
    }

    public final void setLastSyncTime(long j) {
        lastSyncTime = j;
    }

    public final void syncBluetoothLanguage(@Nullable WearableDeviceModel currentDeviceModel) {
        if (currentDeviceModel == null) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 6;
        txo txoVar = new txo();
        zwo zwoVar = new zwo();
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        Logger.i(TAG, "syncBluetoothLanguage = " + currentLocale$default);
        zwoVar.c = currentLocale$default;
        txoVar.a0(zwoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), currentDeviceModel.getDid(), s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
    }

    @Nullable
    public final Object syncDeviceLanguageWhenLocalChange(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C19952(wearableDeviceModel, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object syncHuamiSettings(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C19962(str, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void syncNotificationSetting(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        NotifyHelperExtKt.getNotificationManagerExport().getNotificationSet(new Function5() { // from class: vm6
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return DeviceSettingsSyncer.syncNotificationSetting$lambda$11(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue());
            }
        });
    }

    @Nullable
    public final Object syncWorldClockWhenLocalChange(@NotNull WearableDeviceModel wearableDeviceModel, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C19972(wearableDeviceModel, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object syncZenModeMode(@NotNull final String str, @NotNull Continuation<? super Unit> continuation) {
        Logger.i(ZenUtils.sTag, "sync ble syncZenModeMode");
        if (NotifyHelperExtKt.getNotificationManagerExport().isNotificationPolicyAccessGranted() && ZenUtils.INSTANCE.isSupportZenMode((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(str))) {
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 14;
            vxo.i iVar = new vxo.i();
            iVar.c = 2;
            txo txoVar = new txo();
            txoVar.n0(iVar);
            s7rVar.c0(txoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.DeviceSettingsSyncer.syncZenModeMode.2
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    if (code == 1 && DeviceSettingsPreference.INSTANCE.isZenModeOpen(str)) {
                        AnyExtKt.io$default(null, new DeviceSettingsSyncer$syncZenModeMode$2$onError$1(null), 1, null);
                    }
                    DeviceSettingsSyncer.INSTANCE.syncNotificationSetting(str);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    vxo.b bVar;
                    s7r packet;
                    txo txoVarE;
                    vxo vxoVarI = (result == null || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null) ? null : txoVarE.I();
                    if (vxoVarI != null && (bVar = vxoVarI.d) != null && bVar.c) {
                        AnyExtKt.io$default(null, new DeviceSettingsSyncer$syncZenModeMode$2$onSuccess$1(null), 1, null);
                    }
                    DeviceSettingsSyncer.INSTANCE.syncNotificationSetting(str);
                }
            }, 0, 8, null);
        }
        return Unit.INSTANCE;
    }
}
