package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.PressureInit;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/device/feature/health/settings/PressureSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "syncUserConfigToDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getItemTag", "Lcom/huami/device/feature/health/device/init/PressureInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/PressureInit;", "initItem", "value", "getData", "()Ljava/lang/Boolean;", "setData", "(Z)V", "data", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/PressureInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class PressureSetting extends BaseSetting<Boolean> {

    @NotNull
    private static final String e = "PressureSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PressureInit initItem;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.PressureSetting", f = "PressureSetting.kt", i = {}, l = {54}, m = "syncUserConfigToDevice", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return PressureSetting.this.syncUserConfigToDevice(this);
        }
    }

    public PressureSetting(@NotNull PressureInit pressureInit, @NotNull HealthDevice healthDevice) {
        super(pressureInit, healthDevice);
        this.initItem = pressureInit;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.PressureSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                Boolean bool = this.a.initItem.get();
                if (bool == null) {
                    bool = null;
                } else {
                    this.a.setData(bool.booleanValue());
                }
                return Boxing.boxBoolean(bool != null);
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Boolean> createSet$health_base_release() {
        return new SetToDevice<Boolean>() { // from class: com.huami.device.feature.health.settings.PressureSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Boolean bool, Continuation continuation) {
                return set(bool.booleanValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(boolean z, @NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.initItem.set(z));
                PressureSetting pressureSetting = this.a;
                if (boolBoxBoolean.booleanValue()) {
                    pressureSetting.setData(z);
                }
                return boolBoxBoolean;
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return e;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Boolean> getSettingData() {
        return new HealthSettingData<>(getData(), null, 2, null);
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Boolean bool) {
        setData(bool.booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) aVar.a;
            ResultKt.throwOnFailure(obj);
            return bool;
        }
        ResultKt.throwOnFailure(obj);
        Boolean boolBoxBoolean = Boxing.boxBoolean(this.initItem.set(getData().booleanValue()));
        boolBoxBoolean.booleanValue();
        aVar.a = boolBoxBoolean;
        aVar.d = 1;
        return super.syncUserConfigToDevice(aVar) == coroutine_suspended ? coroutine_suspended : boolBoxBoolean;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Boolean getData() {
        return Boolean.valueOf(getUserConfig$health_base_release().getPressureEnable());
    }

    public void setData(boolean z) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        userConfig$health_base_release.setPressureEnable(z);
        userConfig$health_base_release.save(true);
    }
}
