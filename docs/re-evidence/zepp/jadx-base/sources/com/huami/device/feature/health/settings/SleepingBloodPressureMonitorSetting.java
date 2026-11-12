package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.user.HealthSettingConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "syncUserConfigToDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getItemTag", "Lcom/huami/device/feature/health/device/init/SleepingBloodPressureMonitorInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/SleepingBloodPressureMonitorInit;", "getInitItem", "()Lcom/huami/device/feature/health/device/init/SleepingBloodPressureMonitorInit;", "initItem", "Lcom/huami/device/feature/health/model/HealthSettingData;", "e", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "value", "getData", "()Ljava/lang/Boolean;", "setData", "(Z)V", "data", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/SleepingBloodPressureMonitorInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "f", "a", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class SleepingBloodPressureMonitorSetting extends BaseSetting<Boolean> {

    @NotNull
    private static final a f = new a(null);

    @Deprecated
    @NotNull
    private static final String g = "SleepingBloodPressureMonitorSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SleepingBloodPressureMonitorInit initItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final HealthSettingData<Boolean> settingData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting", f = "SleepingBloodPressureMonitorSetting.kt", i = {}, l = {53}, m = "syncUserConfigToDevice", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SleepingBloodPressureMonitorSetting.this.syncUserConfigToDevice(this);
        }
    }

    public SleepingBloodPressureMonitorSetting(@NotNull SleepingBloodPressureMonitorInit sleepingBloodPressureMonitorInit, @NotNull HealthDevice healthDevice) {
        super(sleepingBloodPressureMonitorInit, healthDevice);
        this.initItem = sleepingBloodPressureMonitorInit;
        this.settingData = new HealthSettingData<>(getData(), null, 2, null);
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.getInitItem().get());
                this.a.setData(boolBoxBoolean.booleanValue());
                return boolBoxBoolean;
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Boolean> createSet$health_base_release() {
        return new SetToDevice<Boolean>() { // from class: com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Boolean bool, Continuation continuation) {
                return set(bool.booleanValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(boolean z, @NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.getInitItem().set(z));
                SleepingBloodPressureMonitorSetting sleepingBloodPressureMonitorSetting = this.a;
                if (boolBoxBoolean.booleanValue()) {
                    sleepingBloodPressureMonitorSetting.setData(z);
                }
                return boolBoxBoolean;
            }
        };
    }

    @NotNull
    public final SleepingBloodPressureMonitorInit getInitItem() {
        return this.initItem;
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return g;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Boolean> getSettingData() {
        return this.settingData;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Boolean bool) {
        setData(bool.booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) bVar.a;
            ResultKt.throwOnFailure(obj);
            return bool;
        }
        ResultKt.throwOnFailure(obj);
        Boolean boolBoxBoolean = Boxing.boxBoolean(getInitItem().set(getData().booleanValue()));
        boolBoxBoolean.booleanValue();
        bVar.a = boolBoxBoolean;
        bVar.d = 1;
        return super.syncUserConfigToDevice(bVar) == coroutine_suspended ? coroutine_suspended : boolBoxBoolean;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Boolean getData() {
        return Boolean.valueOf(getUserConfig$health_base_release().getSleepingBloodPressureMonitorEnable());
    }

    public void setData(boolean z) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        boolean sleepingBloodPressureMonitorEnable = userConfig$health_base_release.getSleepingBloodPressureMonitorEnable();
        userConfig$health_base_release.setSleepingBloodPressureMonitorEnable(z);
        userConfig$health_base_release.save(sleepingBloodPressureMonitorEnable != z);
    }
}
