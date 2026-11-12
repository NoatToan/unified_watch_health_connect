package com.xiaomi.hm.health.device.healthsetting;

import android.app.Application;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.dataflow.HealthData;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\f\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/healthsetting/HealthSettingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lorg/koin/core/component/KoinComponent;", "", StatEvent.EventParams.TYPE_CARD_GOAL, "", "saveCalorieGoal", "", Constants.ENABLED, "saveLongSitRemind", "saveStepGoalRemind", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getLongSitRemindLiveData", "()Landroidx/lifecycle/MutableLiveData;", "longSitRemindLiveData", "b", "getStepGoalRemindLiveData", "stepGoalRemindLiveData", "Lcom/huami/watch/companion/arch/Result;", "c", "getSyncStatusLiveData", "syncStatusLiveData", GoogleApiAvailabilityLight.a, "getCalorieGoalLiveData", "calorieGoalLiveData", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/app/Application;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthSettingViewModel extends AndroidViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> longSitRemindLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> stepGoalRemindLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Result<Boolean>> syncStatusLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> calorieGoalLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthSettingViewModel(@NotNull Application application) {
        super(application);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.longSitRemindLiveData = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.stepGoalRemindLiveData = mutableLiveData2;
        this.syncStatusLiveData = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.calorieGoalLiveData = mutableLiveData3;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.healthsetting.HealthSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        mutableLiveData3.setValue(Integer.valueOf(HealthData.getUserGoalCal(application)));
        mutableLiveData.setValue(Boolean.valueOf(HealthData.isLongSitRemindEnable(application)));
        mutableLiveData2.setValue(Boolean.valueOf(HealthData.isStepGoalRemindEnable(application)));
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getCalorieGoalLiveData() {
        return this.calorieGoalLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getLongSitRemindLiveData() {
        return this.longSitRemindLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getStepGoalRemindLiveData() {
        return this.stepGoalRemindLiveData;
    }

    @NotNull
    public final MutableLiveData<Result<Boolean>> getSyncStatusLiveData() {
        return this.syncStatusLiveData;
    }

    public final void saveCalorieGoal(final int goal) {
        Integer value = this.calorieGoalLiveData.getValue();
        if (value != null && value.intValue() == goal) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            ((HMMiLiProDevice) device).setCalorieGoal(goal, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.healthsetting.HealthSettingViewModel.saveCalorieGoal.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (!result) {
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.error());
                    } else {
                        HealthSettingViewModel.this.getCalorieGoalLiveData().setValue(Integer.valueOf(goal));
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.success(Boolean.valueOf(result)));
                    }
                }
            });
        }
    }

    public final void saveLongSitRemind(final boolean enabled) {
        if (Intrinsics.areEqual(this.longSitRemindLiveData.getValue(), Boolean.valueOf(enabled))) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            HMSedentaryConfig hMSedentaryConfig = new HMSedentaryConfig();
            hMSedentaryConfig.setEnable(enabled);
            hMSedentaryConfig.setInterval((short) 0);
            hMSedentaryConfig.setPeriodEnable(false);
            hMSedentaryConfig.setStartIndex(0);
            hMSedentaryConfig.setStopIndex(0);
            ((HMMiLiProDevice) device).setSedentary(hMSedentaryConfig, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.healthsetting.HealthSettingViewModel.saveLongSitRemind.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (!result) {
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.error());
                    } else {
                        HealthSettingViewModel.this.getLongSitRemindLiveData().setValue(Boolean.valueOf(enabled));
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.success(Boolean.valueOf(result)));
                    }
                }
            });
        }
    }

    public final void saveStepGoalRemind(final boolean enabled) {
        if (Intrinsics.areEqual(this.stepGoalRemindLiveData.getValue(), Boolean.valueOf(enabled))) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            ((HMMiLiProDevice) device).enableGoalRemind(enabled, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.healthsetting.HealthSettingViewModel.saveStepGoalRemind.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (!result) {
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.error());
                    } else {
                        HealthSettingViewModel.this.getStepGoalRemindLiveData().setValue(Boolean.valueOf(enabled));
                        HealthSettingViewModel.this.getSyncStatusLiveData().postValue(Result.success(Boolean.valueOf(result)));
                    }
                }
            });
        }
    }
}
