package com.xiaomi.fitness.devicesettings.huami.screenwake;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0010H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0010H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/screenwake/ScreenWakeForHuamiViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "mHMLiftWristConfig", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "getMHMLiftWristConfig", "()Landroidx/lifecycle/MutableLiveData;", "setMHMLiftWristConfig", "(Landroidx/lifecycle/MutableLiveData;)V", "getScreenWakeConfig", "querySettingSync", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSetting", "syncLiftWristBrightConfig", "wristConfig", "convertToLiftWristBrightView", "syncConfig", "", "(Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToDisplayAndBrightnessV2", "wristBrightView", "convertToLiftWristConfig", "Lcom/xiaomi/hm/health/bt/model/HMLiftWristConfig;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenWakeForHuamiViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: thl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScreenWakeForHuamiViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<LiftWristBrightView> mHMLiftWristConfig = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$getScreenWakeConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$getScreenWakeConfig$1", f = "ScreenWakeForHuamiViewModel.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenWakeForHuamiViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        /* JADX WARN: Code duplicated, block: B:22:0x004f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiftWristBrightView liftWristBrightViewConvertToLiftWristBrightView;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                liftWristBrightViewConvertToLiftWristBrightView = (LiftWristBrightView) obj;
                if (liftWristBrightViewConvertToLiftWristBrightView != null) {
                    boolBoxBoolean = Boxing.boxBoolean(liftWristBrightViewConvertToLiftWristBrightView.isEnable());
                } else {
                    boolBoxBoolean = null;
                }
                Logger.i("getScreenWakeConfig querySettingSync liftWristBright isEnable = " + boolBoxBoolean, new Object[0]);
                if (liftWristBrightViewConvertToLiftWristBrightView == null) {
                    liftWristBrightViewConvertToLiftWristBrightView = new LiftWristBrightView();
                    liftWristBrightViewConvertToLiftWristBrightView.setEnable(false);
                    liftWristBrightViewConvertToLiftWristBrightView.setAllday(false);
                    liftWristBrightViewConvertToLiftWristBrightView.setSensitivity(0);
                    liftWristBrightViewConvertToLiftWristBrightView.setStart(420);
                    liftWristBrightViewConvertToLiftWristBrightView.setStop(1320);
                }
                ScreenWakeForHuamiViewModel.this.getMHMLiftWristConfig().postValue(liftWristBrightViewConvertToLiftWristBrightView);
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel mDeviceModel = ScreenWakeForHuamiViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                companion.sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW, liftWristBrightViewConvertToLiftWristBrightView);
                ScreenWakeForHuamiViewModel.this.postDataLoaded();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ScreenWakeForHuamiViewModel screenWakeForHuamiViewModel = ScreenWakeForHuamiViewModel.this;
            this.label = 1;
            obj = screenWakeForHuamiViewModel.querySettingSync(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            DisplayAndBrightnessV2 displayAndBrightnessV2 = (DisplayAndBrightnessV2) obj;
            if (displayAndBrightnessV2 == null) {
                ScreenWakeForHuamiViewModel screenWakeForHuamiViewModel2 = ScreenWakeForHuamiViewModel.this;
                this.label = 2;
                obj = screenWakeForHuamiViewModel2.getSetting(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liftWristBrightViewConvertToLiftWristBrightView = (LiftWristBrightView) obj;
            } else {
                liftWristBrightViewConvertToLiftWristBrightView = ScreenWakeForHuamiViewModel.this.convertToLiftWristBrightView(displayAndBrightnessV2);
            }
            if (liftWristBrightViewConvertToLiftWristBrightView != null) {
                boolBoxBoolean = Boxing.boxBoolean(liftWristBrightViewConvertToLiftWristBrightView.isEnable());
            } else {
                boolBoxBoolean = null;
            }
            Logger.i("getScreenWakeConfig querySettingSync liftWristBright isEnable = " + boolBoxBoolean, new Object[0]);
            if (liftWristBrightViewConvertToLiftWristBrightView == null) {
                liftWristBrightViewConvertToLiftWristBrightView = new LiftWristBrightView();
                liftWristBrightViewConvertToLiftWristBrightView.setEnable(false);
                liftWristBrightViewConvertToLiftWristBrightView.setAllday(false);
                liftWristBrightViewConvertToLiftWristBrightView.setSensitivity(0);
                liftWristBrightViewConvertToLiftWristBrightView.setStart(420);
                liftWristBrightViewConvertToLiftWristBrightView.setStop(1320);
            }
            ScreenWakeForHuamiViewModel.this.getMHMLiftWristConfig().postValue(liftWristBrightViewConvertToLiftWristBrightView);
            DeviceSettingManager companion2 = DeviceSettingManager.INSTANCE.getInstance();
            WearableDeviceModel mDeviceModel2 = ScreenWakeForHuamiViewModel.this.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel2);
            companion2.sendSettingItem(mDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW, liftWristBrightViewConvertToLiftWristBrightView);
            ScreenWakeForHuamiViewModel.this.postDataLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$querySettingSync$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$querySettingSync$2", f = "ScreenWakeForHuamiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DisplayAndBrightnessV2>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenWakeForHuamiViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel mDeviceModel = ScreenWakeForHuamiViewModel.this.getMDeviceModel();
            Settings settingsQuerySettingSync = mDeviceModel != null ? DeviceModelExtKt.querySettingSync(mDeviceModel, SettingsGroupType.DISPLAY) : null;
            Logger.i("getScreenWakeConfig querySettingSync displayAndBrightnessV2  = " + settingsQuerySettingSync, new Object[0]);
            if (settingsQuerySettingSync instanceof DisplayAndBrightnessV2) {
                return (DisplayAndBrightnessV2) settingsQuerySettingSync;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DisplayAndBrightnessV2> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$syncConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel", f = "ScreenWakeForHuamiViewModel.kt", i = {}, l = {128}, m = "syncConfig", n = {}, s = {})
    public static final class C21931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C21931(Continuation<? super C21931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScreenWakeForHuamiViewModel.this.syncConfig(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$syncLiftWristBrightConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiViewModel$syncLiftWristBrightConfig$1", f = "ScreenWakeForHuamiViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LiftWristBrightView $wristConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21941(LiftWristBrightView liftWristBrightView, Continuation<? super C21941> continuation) {
            super(2, continuation);
            this.$wristConfig = liftWristBrightView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScreenWakeForHuamiViewModel.this.new C21941(this.$wristConfig, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenWakeForHuamiViewModel screenWakeForHuamiViewModel = ScreenWakeForHuamiViewModel.this;
                LiftWristBrightView liftWristBrightView = this.$wristConfig;
                this.label = 1;
                obj = screenWakeForHuamiViewModel.syncConfig(liftWristBrightView, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel mDeviceModel = ScreenWakeForHuamiViewModel.this.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                companion.sendSettingItem(mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_LIFTWRISTBRIGHTVIEW, this.$wristConfig);
            }
            ScreenWakeForHuamiViewModel.this.postDataLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayAndBrightnessV2 convertToDisplayAndBrightnessV2(LiftWristBrightView wristBrightView) {
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        if (!wristBrightView.isEnable()) {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(0));
        } else if (wristBrightView.isAllday()) {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(2));
        } else {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(new EnumData(1));
        }
        displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(new EnumData(wristBrightView.getSensitivity()));
        displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(new Time(wristBrightView.getStart() / 60, wristBrightView.getStart() % 60));
        displayAndBrightnessV2.setScreenOnByTurningWristEndTime(new Time(wristBrightView.getStop() / 60, wristBrightView.getStop() % 60));
        return displayAndBrightnessV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiftWristBrightView convertToLiftWristBrightView(DisplayAndBrightnessV2 wristConfig) {
        LiftWristBrightView liftWristBrightView = new LiftWristBrightView();
        EnumData screenOnByTurningWristMode = wristConfig.getScreenOnByTurningWristMode();
        liftWristBrightView.setEnable(!(screenOnByTurningWristMode != null && screenOnByTurningWristMode.getValue() == 0));
        EnumData screenOnByTurningWristMode2 = wristConfig.getScreenOnByTurningWristMode();
        liftWristBrightView.setAllday(screenOnByTurningWristMode2 != null && screenOnByTurningWristMode2.getValue() == 2);
        Time screenOnByTurningWristBeginTime = wristConfig.getScreenOnByTurningWristBeginTime();
        Intrinsics.checkNotNull(screenOnByTurningWristBeginTime);
        int hour = screenOnByTurningWristBeginTime.getHour() * 60;
        Time screenOnByTurningWristBeginTime2 = wristConfig.getScreenOnByTurningWristBeginTime();
        Intrinsics.checkNotNull(screenOnByTurningWristBeginTime2);
        liftWristBrightView.setStart(hour + screenOnByTurningWristBeginTime2.getMinute());
        Time screenOnByTurningWristEndTime = wristConfig.getScreenOnByTurningWristEndTime();
        Intrinsics.checkNotNull(screenOnByTurningWristEndTime);
        int hour2 = screenOnByTurningWristEndTime.getHour() * 60;
        Time screenOnByTurningWristEndTime2 = wristConfig.getScreenOnByTurningWristEndTime();
        Intrinsics.checkNotNull(screenOnByTurningWristEndTime2);
        liftWristBrightView.setStop(hour2 + screenOnByTurningWristEndTime2.getMinute());
        EnumData screenOnByTurningWristActiveSpeed = wristConfig.getScreenOnByTurningWristActiveSpeed();
        Intrinsics.checkNotNull(screenOnByTurningWristActiveSpeed);
        liftWristBrightView.setSensitivity(screenOnByTurningWristActiveSpeed.getValue());
        return liftWristBrightView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMLiftWristConfig convertToLiftWristConfig(LiftWristBrightView wristBrightView) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSetting(Continuation<? super LiftWristBrightView> continuation) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel == null) {
            return null;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ScreenWakeForHuamiViewModel$getSetting$2$1(mDeviceModel, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : (LiftWristBrightView) objWithContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object querySettingSync(Continuation<? super DisplayAndBrightnessV2> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncConfig(LiftWristBrightView liftWristBrightView, Continuation<? super Boolean> continuation) {
        C21931 c21931;
        boolean zBooleanValue;
        if (continuation instanceof C21931) {
            c21931 = (C21931) continuation;
            int i = c21931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21931.label = i - Integer.MIN_VALUE;
            } else {
                c21931 = new C21931(continuation);
            }
        } else {
            c21931 = new C21931(continuation);
        }
        Object objWithContext = c21931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c21931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            if (mDeviceModel != null) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ScreenWakeForHuamiViewModel$syncConfig$2$1 screenWakeForHuamiViewModel$syncConfig$2$1 = new ScreenWakeForHuamiViewModel$syncConfig$2$1(mDeviceModel, this, liftWristBrightView, null);
                c21931.label = 1;
                objWithContext = BuildersKt.withContext(io2, screenWakeForHuamiViewModel$syncConfig$2$1, c21931);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWithContext);
        zBooleanValue = ((Boolean) objWithContext).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<LiftWristBrightView> getMHMLiftWristConfig() {
        return this.mHMLiftWristConfig;
    }

    public final void getScreenWakeConfig() {
        postDataOnLoading();
        if (getMDeviceModel() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setMHMLiftWristConfig(@NotNull MutableLiveData<LiftWristBrightView> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mHMLiftWristConfig = mutableLiveData;
    }

    public final void syncLiftWristBrightConfig(@NotNull LiftWristBrightView wristConfig) {
        Intrinsics.checkNotNullParameter(wristConfig, "wristConfig");
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21941(wristConfig, null), 3, null);
    }
}
