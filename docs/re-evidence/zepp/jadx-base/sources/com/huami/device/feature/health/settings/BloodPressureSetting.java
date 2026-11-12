package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.blood_pressure.BloodPressureCorrectWatchStatus;
import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import com.huami.device.feature.health.device.init.BloodPressureInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.settings.device.SetToDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/huami/device/feature/health/settings/BloodPressureSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "syncUserConfigToDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getItemTag", "canNavigateToCorrect", "Lcom/huami/device/feature/health/device/init/BloodPressureInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/BloodPressureInit;", "getBloodPressureInit", "()Lcom/huami/device/feature/health/device/init/BloodPressureInit;", "bloodPressureInit", "value", "e", "J", "getData", "()Ljava/lang/Long;", "setData", "(J)V", "data", "Lcom/huami/device/feature/health/model/HealthSettingData;", "f", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/BloodPressureInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureSetting extends BaseSetting<Long> {

    @NotNull
    private static final String g = "BloodPressureSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureInit bloodPressureInit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long data;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final HealthSettingData<Long> settingData;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.BloodPressureSetting", f = "BloodPressureSetting.kt", i = {}, l = {60}, m = "canNavigateToCorrect", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureSetting.this.canNavigateToCorrect(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.BloodPressureSetting", f = "BloodPressureSetting.kt", i = {}, l = {51}, m = "syncUserConfigToDevice", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureSetting.this.syncUserConfigToDevice(this);
        }
    }

    public BloodPressureSetting(@NotNull BloodPressureInit bloodPressureInit, @NotNull HealthDevice healthDevice) {
        super(bloodPressureInit, healthDevice);
        this.bloodPressureInit = bloodPressureInit;
        this.settingData = new HealthSettingData<>(0L, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object canNavigateToCorrect(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQueryCorrectStatus = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQueryCorrectStatus);
            IBloodPressureApi bloodPressureApi = getBloodPressureInit().getBloodPressureApi();
            aVar.c = 1;
            objQueryCorrectStatus = bloodPressureApi.queryCorrectStatus(aVar);
            if (objQueryCorrectStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQueryCorrectStatus);
        }
        BloodPressureCorrectWatchStatus bloodPressureCorrectWatchStatus = (BloodPressureCorrectWatchStatus) objQueryCorrectStatus;
        if (!Intrinsics.areEqual(bloodPressureCorrectWatchStatus, BloodPressureCorrectWatchStatus.IDEL.INSTANCE) && !Intrinsics.areEqual(bloodPressureCorrectWatchStatus, BloodPressureCorrectWatchStatus.SUCCESS.INSTANCE)) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new BloodPressureSetting$createGet$1(this);
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Long> createSet$health_base_release() {
        return new SetToDevice<Long>() { // from class: com.huami.device.feature.health.settings.BloodPressureSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Long l, Continuation continuation) {
                return set(l.longValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(long j, @NotNull Continuation<? super Boolean> continuation) {
                this.a.setData(j);
                return Boxing.boxBoolean(true);
            }
        };
    }

    @NotNull
    public final BloodPressureInit getBloodPressureInit() {
        return this.bloodPressureInit;
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return g;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Long> getSettingData() {
        return this.settingData;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Long l) {
        setData(l.longValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            bVar.c = 1;
            if (super.syncUserConfigToDevice(bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Long getData() {
        return Long.valueOf(this.data);
    }

    public void setData(long j) {
        this.data = j;
        HealthDetect.INSTANCE.reload();
    }
}
