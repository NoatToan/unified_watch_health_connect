package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.modules.appstate.AppStateModule;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eJ\u001e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000eJ\u001e\u0010*\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010+J\u000e\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020'J\u000e\u00104\u001a\u00020\u00162\u0006\u00100\u001a\u00020'J\u0006\u00108\u001a\u000209J6\u0010:\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020'2\u0006\u0010>\u001a\u00020\u000eR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0010R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001a\u0010\u0010R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001f\u0010\u0010R\u001b\u0010!\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b\"\u0010#R!\u0010,\u001a\b\u0012\u0004\u0012\u00020'0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b-\u0010\u0010R!\u00101\u001a\b\u0012\u0004\u0012\u00020'0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b2\u0010\u0010R\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\r¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0010¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device$delegate", "Lkotlin/Lazy;", "configManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", "type", "Landroidx/lifecycle/MutableLiveData;", "", "getType", "()Landroidx/lifecycle/MutableLiveData;", "modeObserver", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "getModeObserver", "modeObserver$delegate", "syncMode", "", "mode", "interval", "freqObserver", "getFreqObserver", "freqObserver$delegate", "syncInterval", "warnObserver", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel$WarnRet;", "getWarnObserver", "warnObserver$delegate", "warnRet", "getWarnRet", "()Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel$WarnRet;", "warnRet$delegate", "syncWarn", "isSwitch", "", "open", "hr", "setMode", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activeObserver", "getActiveObserver", "activeObserver$delegate", "syncActive", "checked", "pressureObserver", "getPressureObserver", "pressureObserver$delegate", "syncPressure", "configObserver", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "getConfigObserver", "readConfig", "Lkotlinx/coroutines/Job;", "save2Remote", AppStateModule.APP_STATE_ACTIVE, "pressure", "warnState", Constants.KEY_RECHARGE_WARN_VALUE, "WarnRet", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrHuaMiSettingViewModel extends BaseLoadableBindingViewModel {

    /* JADX INFO: renamed from: activeObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activeObserver;

    @NotNull
    private final MutableLiveData<HRDetect> configObserver;

    /* JADX INFO: renamed from: freqObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy freqObserver;

    /* JADX INFO: renamed from: modeObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy modeObserver;

    /* JADX INFO: renamed from: pressureObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pressureObserver;

    @NotNull
    private final MutableLiveData<Integer> type;

    /* JADX INFO: renamed from: warnObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy warnObserver;

    /* JADX INFO: renamed from: warnRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy warnRet;

    /* JADX INFO: renamed from: device$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy device = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dcc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HrHuaMiSettingViewModel.device_delegate$lambda$0();
        }
    });

    @NotNull
    private final DeviceSettingManager configManager = DeviceSettingManager.INSTANCE.getInstance();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel$WarnRet;", "", "isSwitch", "", "success", "hr", "", "<init>", "(ZZI)V", "()Z", "setSwitch", "(Z)V", "getSuccess", "setSuccess", "getHr", "()I", "setHr", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarnRet {
        private int hr;
        private boolean isSwitch;
        private boolean success;

        public WarnRet(boolean z, boolean z2, int i) {
            this.isSwitch = z;
            this.success = z2;
            this.hr = i;
        }

        public static /* synthetic */ WarnRet copy$default(WarnRet warnRet, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = warnRet.isSwitch;
            }
            if ((i2 & 2) != 0) {
                z2 = warnRet.success;
            }
            if ((i2 & 4) != 0) {
                i = warnRet.hr;
            }
            return warnRet.copy(z, z2, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSwitch() {
            return this.isSwitch;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getHr() {
            return this.hr;
        }

        @NotNull
        public final WarnRet copy(boolean isSwitch, boolean success, int hr) {
            return new WarnRet(isSwitch, success, hr);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WarnRet)) {
                return false;
            }
            WarnRet warnRet = (WarnRet) other;
            return this.isSwitch == warnRet.isSwitch && this.success == warnRet.success && this.hr == warnRet.hr;
        }

        public final int getHr() {
            return this.hr;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isSwitch) * 31) + Boolean.hashCode(this.success)) * 31) + Integer.hashCode(this.hr);
        }

        public final boolean isSwitch() {
            return this.isSwitch;
        }

        public final void setHr(int i) {
            this.hr = i;
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }

        public final void setSwitch(boolean z) {
            this.isSwitch = z;
        }

        @NotNull
        public String toString() {
            return "WarnRet(isSwitch=" + this.isSwitch + ", success=" + this.success + ", hr=" + this.hr + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$readConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$readConfig$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0042  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HRDetect hRDetect;
            String string;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel device = HrHuaMiSettingViewModel.this.getDevice();
                hRDetect = null;
                if (device != null) {
                    HrHuaMiSettingViewModel hrHuaMiSettingViewModel = HrHuaMiSettingViewModel.this;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    HrHuaMiSettingViewModel$readConfig$1$config$1$1 hrHuaMiSettingViewModel$readConfig$1$config$1$1 = new HrHuaMiSettingViewModel$readConfig$1$config$1$1(hrHuaMiSettingViewModel, device, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, hrHuaMiSettingViewModel$readConfig$1$config$1$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (hRDetect != null || (string = hRDetect.toString()) == null) {
                    string = "itemInfo null";
                }
                Logger.i("HrHuaMiSettingViewModel", "readConfig: " + string);
                HrHuaMiSettingViewModel.this.getConfigObserver().postValue(hRDetect);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hRDetect = (HRDetect) obj;
            if (hRDetect != null) {
                string = "itemInfo null";
            } else {
                string = "itemInfo null";
            }
            Logger.i("HrHuaMiSettingViewModel", "readConfig: " + string);
            HrHuaMiSettingViewModel.this.getConfigObserver().postValue(hRDetect);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$setMode$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$setMode$2", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ int $interval;
        final /* synthetic */ HrMode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HrMode hrMode, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$mode = hrMode;
            this.$interval = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$mode, this.$interval, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HuamiApiCaller huamiDevice;
            boolean zEnableHeartAndSleep;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.d("HeartHuaMi", "setMode: mode = " + this.$mode + "; interval = " + this.$interval);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (huamiDevice = DeviceModelExtKt.getHuamiDevice(wearableDeviceModel)) == null) {
                return Boxing.boxBoolean(false);
            }
            HrMode hrMode = this.$mode;
            if (Intrinsics.areEqual(hrMode, HrMode.Auto.INSTANCE)) {
                zEnableHeartAndSleep = huamiDevice.enableHeart(true, this.$interval);
            } else if (Intrinsics.areEqual(hrMode, HrMode.Sleep.INSTANCE)) {
                zEnableHeartAndSleep = huamiDevice.enableSleep(true);
            } else {
                zEnableHeartAndSleep = Intrinsics.areEqual(hrMode, HrMode.Full.INSTANCE) ? huamiDevice.enableHeartAndSleep(true, this.$interval) : huamiDevice.enableHeartAndSleep(false, this.$interval);
            }
            return Boxing.boxBoolean(zEnableHeartAndSleep);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncActive$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncActive$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncActive$1$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $checked;
            int label;
            final /* synthetic */ HrHuaMiSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05001(HrHuaMiSettingViewModel hrHuaMiSettingViewModel, boolean z, Continuation<? super C05001> continuation) {
                super(2, continuation);
                this.this$0 = hrHuaMiSettingViewModel;
                this.$checked = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05001(this.this$0, this.$checked, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableLiveData<Boolean> activeObserver = this.this$0.getActiveObserver();
                WearableDeviceModel device = this.this$0.getDevice();
                activeObserver.postValue(device != null ? Boxing.boxBoolean(DeviceModelExtKt.enableSportHeartRate(device, this.$checked)) : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21671(boolean z, Continuation<? super C21671> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new C21671(this.$checked, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05001 c05001 = new C05001(HrHuaMiSettingViewModel.this, this.$checked, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05001, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncInterval$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncInterval$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $interval;
        final /* synthetic */ HrMode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21681(HrMode hrMode, int i, Continuation<? super C21681> continuation) {
            super(2, continuation);
            this.$mode = hrMode;
            this.$interval = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new C21681(this.$mode, this.$interval, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrHuaMiSettingViewModel hrHuaMiSettingViewModel = HrHuaMiSettingViewModel.this;
                HrMode hrMode = this.$mode;
                int i2 = this.$interval;
                this.label = 1;
                obj = hrHuaMiSettingViewModel.setMode(hrMode, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HrHuaMiSettingViewModel.this.getFreqObserver().setValue(Boxing.boxInt(((Boolean) obj).booleanValue() ? this.$interval : -1));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncMode$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $interval;
        final /* synthetic */ HrMode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21691(HrMode hrMode, int i, Continuation<? super C21691> continuation) {
            super(2, continuation);
            this.$mode = hrMode;
            this.$interval = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new C21691(this.$mode, this.$interval, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrHuaMiSettingViewModel hrHuaMiSettingViewModel = HrHuaMiSettingViewModel.this;
                HrMode hrMode = this.$mode;
                int i2 = this.$interval;
                this.label = 1;
                obj = hrHuaMiSettingViewModel.setMode(hrMode, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HrHuaMiSettingViewModel.this.getModeObserver().setValue(((Boolean) obj).booleanValue() ? this.$mode : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncPressure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncPressure$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncPressure$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncPressure$1$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $checked;
            int label;
            final /* synthetic */ HrHuaMiSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05011(HrHuaMiSettingViewModel hrHuaMiSettingViewModel, boolean z, Continuation<? super C05011> continuation) {
                super(2, continuation);
                this.this$0 = hrHuaMiSettingViewModel;
                this.$checked = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05011(this.this$0, this.$checked, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableLiveData<Boolean> pressureObserver = this.this$0.getPressureObserver();
                WearableDeviceModel device = this.this$0.getDevice();
                pressureObserver.postValue(device != null ? Boxing.boxBoolean(DeviceModelExtKt.enablePressure(device, this.$checked)) : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21701(boolean z, Continuation<? super C21701> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new C21701(this.$checked, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05011 c05011 = new C05011(HrHuaMiSettingViewModel.this, this.$checked, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05011, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncWarn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel$syncWarn$1", f = "HrHuaMiSettingViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $hr;
        final /* synthetic */ boolean $isSwitch;
        final /* synthetic */ boolean $open;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21711(boolean z, int i, boolean z2, Continuation<? super C21711> continuation) {
            super(2, continuation);
            this.$isSwitch = z;
            this.$hr = i;
            this.$open = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HrHuaMiSettingViewModel.this.new C21711(this.$isSwitch, this.$hr, this.$open, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HrHuaMiSettingViewModel.this.getWarnRet().setSwitch(this.$isSwitch);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                HrHuaMiSettingViewModel$syncWarn$1$ret$1 hrHuaMiSettingViewModel$syncWarn$1$ret$1 = new HrHuaMiSettingViewModel$syncWarn$1$ret$1(HrHuaMiSettingViewModel.this, this.$open, this.$hr, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, hrHuaMiSettingViewModel$syncWarn$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HrHuaMiSettingViewModel.this.getWarnRet().setSuccess(((Boolean) obj).booleanValue());
            HrHuaMiSettingViewModel.this.getWarnRet().setHr(this.$hr);
            HrHuaMiSettingViewModel.this.getWarnObserver().setValue(HrHuaMiSettingViewModel.this.getWarnRet());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HrHuaMiSettingViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.type = mutableLiveData;
        mutableLiveData.postValue(1);
        this.modeObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ecc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.modeObserver_delegate$lambda$1();
            }
        });
        this.freqObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fcc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.freqObserver_delegate$lambda$2();
            }
        });
        this.warnObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gcc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.warnObserver_delegate$lambda$3();
            }
        });
        this.warnRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hcc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.warnRet_delegate$lambda$4();
            }
        });
        this.activeObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: icc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.activeObserver_delegate$lambda$5();
            }
        });
        this.pressureObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jcc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingViewModel.pressureObserver_delegate$lambda$6();
            }
        });
        this.configObserver = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData activeObserver_delegate$lambda$5() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel device_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData freqObserver_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) this.device.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WarnRet getWarnRet() {
        return (WarnRet) this.warnRet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData modeObserver_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pressureObserver_delegate$lambda$6() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setMode(HrMode hrMode, int i, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(hrMode, i, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData warnObserver_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WarnRet warnRet_delegate$lambda$4() {
        return new WarnRet(false, false, 0);
    }

    @NotNull
    public final MutableLiveData<Boolean> getActiveObserver() {
        return (MutableLiveData) this.activeObserver.getValue();
    }

    @NotNull
    public final MutableLiveData<HRDetect> getConfigObserver() {
        return this.configObserver;
    }

    @NotNull
    public final MutableLiveData<Integer> getFreqObserver() {
        return (MutableLiveData) this.freqObserver.getValue();
    }

    @NotNull
    public final MutableLiveData<HrMode> getModeObserver() {
        return (MutableLiveData) this.modeObserver.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getPressureObserver() {
        return (MutableLiveData) this.pressureObserver.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getType() {
        return this.type;
    }

    @NotNull
    public final MutableLiveData<WarnRet> getWarnObserver() {
        return (MutableLiveData) this.warnObserver.getValue();
    }

    @NotNull
    public final Job readConfig() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void save2Remote(int mode, int interval, boolean active, boolean pressure, boolean warnState, int warnValue) {
        HRDetect hRDetect = new HRDetect();
        hRDetect.setType(mode);
        hRDetect.setFreq(interval);
        hRDetect.setActiveEnable(active);
        hRDetect.setPressureEnable(pressure);
        hRDetect.setWarningEnable(warnState);
        hRDetect.setWarningValue(warnValue);
        Logger.d("HrHuaMiSettingViewModel", "save2Remote: " + hRDetect);
        WearableDeviceModel device = getDevice();
        if (device != null) {
            this.configManager.sendSettingItem(device.getDid(), DeviceSettingConfigKey.KE_HRDETECT, hRDetect);
        }
    }

    public final void syncActive(boolean checked) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21671(checked, null), 3, null);
    }

    public final void syncInterval(@NotNull HrMode mode, int interval) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21681(mode, interval, null), 3, null);
    }

    public final void syncMode(@NotNull HrMode mode, int interval) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21691(mode, interval, null), 3, null);
    }

    public final void syncPressure(boolean checked) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21701(checked, null), 3, null);
    }

    public final void syncWarn(boolean isSwitch, boolean open, int hr) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C21711(isSwitch, hr, open, null), 3, null);
    }
}
