package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.utils.HrUtils;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.hm.health.bt.sdk.data.HrFreq;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 ?*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002>?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J(\u0010/\u001a\u00020,2\u0006\u00100\u001a\u0002012\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b03J\u001a\u00104\u001a\u00020,2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,06J\b\u00107\u001a\u00020\u0017H\u0004J\u0010\u00108\u001a\u0004\u0018\u00010,H\u0084@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u00020,2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<H\u0004J\u0012\u0010=\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u00028\u00008\u0006@\u0006X\u0087.¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010\u0018¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "T", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mModel", "getMModel", "()Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "setMModel", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;)V", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "isSupportEndurance", "", "()Z", "mEnduranceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "type", "getType", "()Landroidx/lifecycle/MutableLiveData;", "mConfig", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "getMConfig", "()Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "setMConfig", "(Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;)V", "curHrFreq", "Lcom/xiaomi/hm/health/bt/sdk/data/HrFreq;", "getCurHrFreq", "()Lcom/xiaomi/hm/health/bt/sdk/data/HrFreq;", "isDeviceConnected", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "observerEndurancePair", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "readDeviceConfig", "callback", "Lkotlin/Function1;", "syncMode", "syncRemote", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncModelConfig", "sync2Device", "Lkotlin/Function0;", "defaultConfig", "SwitchParams", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseHuamiHealthMonitorViewModel<T extends BaseHuamiHealthMonitorModel> extends BaseLoadableBindingViewModel {
    public static final int DETECTION_MODE_ALL = 3;
    public static final int DETECTION_MODE_CLOSE = 0;
    public static final int DETECTION_MODE_HR = 2;
    public static final int DETECTION_MODE_SLEEP = 1;
    public static final int HR_FREQ_CLOSE = 0;
    public static final int HR_FREQ_INTELLIGENT = 255;
    public static final int WARNING_INTERVAL_CLOSE = 0;

    @Nullable
    private WearableDeviceModel deviceModel;
    public T mModel;

    @NotNull
    private final String TAG = "BaseHuamiHealthMonitorViewModel";

    @NotNull
    private final MutableLiveData<Pair<Integer, String>> mEnduranceLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> type = new MutableLiveData<>();

    @NotNull
    private HRDetect mConfig = new HRDetect();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$readDeviceConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$readDeviceConfig$1", f = "BaseHuamiHealthMonitorViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<HRDetect, Unit> $callback;
        int label;
        final /* synthetic */ BaseHuamiHealthMonitorViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel, Function1<? super HRDetect, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseHuamiHealthMonitorViewModel;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1 baseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1 = new BaseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1(this.this$0, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, baseHuamiHealthMonitorViewModel$readDeviceConfig$1$config$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HRDetect hRDetectDefaultConfig = (HRDetect) obj;
            this.this$0.postDataLoaded();
            BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel = this.this$0;
            if (hRDetectDefaultConfig == null) {
                hRDetectDefaultConfig = baseHuamiHealthMonitorViewModel.defaultConfig(baseHuamiHealthMonitorViewModel.getDeviceModel());
            }
            baseHuamiHealthMonitorViewModel.setMConfig(hRDetectDefaultConfig);
            Logger.i(this.this$0.getTAG(), "readDeviceConfig:" + this.this$0.getMConfig());
            this.this$0.getMModel().onConfigChanged(this.this$0.getMConfig());
            this.$callback.invoke2(this.this$0.getMConfig());
            ((BaseHuamiHealthMonitorViewModel) this.this$0).mEnduranceLiveData.postValue(EnduranceHelper.INSTANCE.getLevelPair(this.this$0.getMConfig()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$syncModelConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$syncModelConfig$1", f = "BaseHuamiHealthMonitorViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class C21651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Boolean> $sync2Device;
        int label;
        final /* synthetic */ BaseHuamiHealthMonitorViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21651(BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel, Function0<Boolean> function0, Continuation<? super C21651> continuation) {
            super(2, continuation);
            this.this$0 = baseHuamiHealthMonitorViewModel;
            this.$sync2Device = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21651(this.this$0, this.$sync2Device, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.postDataOnLoading();
                if (this.$sync2Device.invoke().booleanValue()) {
                    this.this$0.getMModel().onConfigChanged(this.this$0.getMConfig());
                    this.this$0.postDataLoaded();
                    BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel = this.this$0;
                    this.label = 1;
                    obj = baseHuamiHealthMonitorViewModel.syncRemote(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.this$0.postLoadStatus(5);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$syncRemote$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel$syncRemote$2", f = "BaseHuamiHealthMonitorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BaseHuamiHealthMonitorViewModel<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseHuamiHealthMonitorViewModel<T> baseHuamiHealthMonitorViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = baseHuamiHealthMonitorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((BaseHuamiHealthMonitorViewModel) this.this$0).mEnduranceLiveData.postValue(EnduranceHelper.INSTANCE.getLevelPair(this.this$0.getMConfig()));
            WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
            if (deviceModel == null) {
                return null;
            }
            DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT, this.this$0.getMConfig());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HRDetect defaultConfig(WearableDeviceModel deviceModel) {
        if (deviceModel == null || !DeviceModelExtKt.isKongMing(deviceModel)) {
            return (deviceModel == null || !DeviceModelExtKt.isPanGu(deviceModel)) ? HrUtils.INSTANCE.defaultL66Config(deviceModel) : HrUtils.INSTANCE.defaultPanguConfig(deviceModel);
        }
        return HrUtils.INSTANCE.defaultKongMingConfig();
    }

    private final HrFreq getCurHrFreq() {
        int freq = this.mConfig.getFreq();
        if (freq == 1) {
            return HrFreq.FREQ_1;
        }
        if (freq == 5) {
            return HrFreq.FREQ_5;
        }
        if (freq != 10) {
            return freq != 255 ? HrFreq.FREQ_30 : HrFreq.FREQ_SMART;
        }
        return HrFreq.FREQ_10;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final HRDetect getMConfig() {
        return this.mConfig;
    }

    @NotNull
    public final T getMModel() {
        T t = this.mModel;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mModel");
        return null;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final MutableLiveData<Integer> getType() {
        return this.type;
    }

    public final boolean isDeviceConnected() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.isDeviceConnected();
        }
        return false;
    }

    public boolean isSupportEndurance() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isPanGu(wearableDeviceModel);
        }
        return false;
    }

    public final void observerEndurancePair(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Pair<Integer, String>> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mEnduranceLiveData.observe(lifecycleOwner, observer);
    }

    public final void readDeviceConfig(@NotNull Function1<? super HRDetect, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        postDataOnLoading();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(this, callback, null), 3, null);
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setMConfig(@NotNull HRDetect hRDetect) {
        Intrinsics.checkNotNullParameter(hRDetect, "<set-?>");
        this.mConfig = hRDetect;
    }

    public final void setMModel(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.mModel = t;
    }

    public final boolean syncMode() {
        boolean zEnableSleep;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        if (huaMiApiCaller == null) {
            return false;
        }
        int type = this.mConfig.getType();
        if (type == 1) {
            huaMiApiCaller.enableHeart(false, this.mConfig.getFreq());
            zEnableSleep = huaMiApiCaller.enableSleep(true);
        } else if (type != 2) {
            zEnableSleep = type != 3 ? huaMiApiCaller.enableHeartAndSleep(false, this.mConfig.getFreq()) : huaMiApiCaller.enableHeartAndSleep(true, this.mConfig.getFreq());
        } else {
            huaMiApiCaller.enableHeart(true, this.mConfig.getFreq());
            zEnableSleep = huaMiApiCaller.enableSleep(false);
        }
        Logger.i(getTAG(), "syncMode " + this.mConfig.isSleepAssistEnable() + " " + this.mConfig.getType() + " " + zEnableSleep);
        return zEnableSleep;
    }

    public final void syncModelConfig(@NotNull Function0<Boolean> sync2Device) {
        Intrinsics.checkNotNullParameter(sync2Device, "sync2Device");
        if (isDeviceConnected()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C21651(this, sync2Device, null), 2, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    @Nullable
    public final Object syncRemote(@NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this, null), continuation);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel$SwitchParams;", "", "titleRes", "", "msgRes", "needNotice", "", "<init>", "(IIZ)V", "getTitleRes", "()I", "getMsgRes", "getNeedNotice", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwitchParams {
        private final int msgRes;
        private final boolean needNotice;
        private final int titleRes;

        public SwitchParams(int i, int i2, boolean z) {
            this.titleRes = i;
            this.msgRes = i2;
            this.needNotice = z;
        }

        public static /* synthetic */ SwitchParams copy$default(SwitchParams switchParams, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = switchParams.titleRes;
            }
            if ((i3 & 2) != 0) {
                i2 = switchParams.msgRes;
            }
            if ((i3 & 4) != 0) {
                z = switchParams.needNotice;
            }
            return switchParams.copy(i, i2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMsgRes() {
            return this.msgRes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getNeedNotice() {
            return this.needNotice;
        }

        @NotNull
        public final SwitchParams copy(int titleRes, int msgRes, boolean needNotice) {
            return new SwitchParams(titleRes, msgRes, needNotice);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwitchParams)) {
                return false;
            }
            SwitchParams switchParams = (SwitchParams) other;
            return this.titleRes == switchParams.titleRes && this.msgRes == switchParams.msgRes && this.needNotice == switchParams.needNotice;
        }

        public final int getMsgRes() {
            return this.msgRes;
        }

        public final boolean getNeedNotice() {
            return this.needNotice;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.msgRes)) * 31) + Boolean.hashCode(this.needNotice);
        }

        @NotNull
        public String toString() {
            return "SwitchParams(titleRes=" + this.titleRes + ", msgRes=" + this.msgRes + ", needNotice=" + this.needNotice + ")";
        }

        public /* synthetic */ SwitchParams(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? true : z);
        }
    }
}
