package com.huami.device.feature.health.settings;

import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.HrModeInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u0013\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/huami/device/feature/health/settings/HrModeSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "", "f", "Lcom/huami/device/feature/health/settings/HrModeSetting$a;", "g", "Landroid/content/SharedPreferences;", "e", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "onDeviceConnect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "syncUserConfigFromDevice", "syncUserConfigToDevice", "", "getItemTag", "Lcom/huami/device/feature/health/device/init/HrModeInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/HrModeInit;", "hrModeInit", "value", "getData", "()Ljava/lang/Integer;", "setData", "(I)V", "data", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/HrModeInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "Companion", "a", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HrModeSetting extends BaseSetting<Integer> {

    @NotNull
    private static final String e = "device_hr_mode";

    @NotNull
    private static final String f = "HrModeSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HrModeInit hrModeInit;

    /* JADX INFO: renamed from: com.huami.device.feature.health.settings.HrModeSetting$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"com/huami/device/feature/health/settings/HrModeSetting$a", "", "", "a", "b", "c", "isAllDayHr", "isRem", "isAtrial", "Lcom/huami/device/feature/health/settings/HrModeSetting$a;", GoogleApiAvailabilityLight.a, "", "toString", "", "hashCode", "other", "equals", "Z", "f", "()Z", "h", "g", "<init>", "(ZZZ)V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class HrSettings {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final boolean isAllDayHr;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final boolean isRem;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final boolean isAtrial;

        public HrSettings(boolean z, boolean z2, boolean z3) {
            this.isAllDayHr = z;
            this.isRem = z2;
            this.isAtrial = z3;
        }

        public static /* synthetic */ HrSettings e(HrSettings hrSettings, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hrSettings.isAllDayHr;
            }
            if ((i & 2) != 0) {
                z2 = hrSettings.isRem;
            }
            if ((i & 4) != 0) {
                z3 = hrSettings.isAtrial;
            }
            return hrSettings.d(z, z2, z3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsAllDayHr() {
            return this.isAllDayHr;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsRem() {
            return this.isRem;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAtrial() {
            return this.isAtrial;
        }

        @NotNull
        public final HrSettings d(boolean isAllDayHr, boolean isRem, boolean isAtrial) {
            return new HrSettings(isAllDayHr, isRem, isAtrial);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HrSettings)) {
                return false;
            }
            HrSettings hrSettings = (HrSettings) other;
            return this.isAllDayHr == hrSettings.isAllDayHr && this.isRem == hrSettings.isRem && this.isAtrial == hrSettings.isAtrial;
        }

        public final boolean f() {
            return this.isAllDayHr;
        }

        public final boolean g() {
            return this.isAtrial;
        }

        public final boolean h() {
            return this.isRem;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            boolean z = this.isAllDayHr;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.isRem;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.isAtrial;
            return i2 + (z3 ? 1 : z3);
        }

        @NotNull
        public String toString() {
            return "HrSettings(isAllDayHr=" + this.isAllDayHr + ", isRem=" + this.isRem + ", isAtrial=" + this.isAtrial + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.HrModeSetting", f = "HrModeSetting.kt", i = {}, l = {119}, m = "syncUserConfigFromDevice", n = {}, s = {})
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
            return HrModeSetting.this.syncUserConfigFromDevice(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncUserConfigFromDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.HrModeSetting", f = "HrModeSetting.kt", i = {0}, l = {127, 133}, m = "syncUserConfigToDevice", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HrModeSetting.this.syncUserConfigToDevice(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncUserConfigToDevice";
        }
    }

    public HrModeSetting(@NotNull HrModeInit hrModeInit, @NotNull HealthDevice healthDevice) {
        super(hrModeInit, healthDevice);
        this.hrModeInit = hrModeInit;
    }

    private final SharedPreferences e() {
        return HealthDetect.INSTANCE.getContext().getSharedPreferences(getDevice().getDeviceId() + "_device_hr_mode", 0);
    }

    private final List<Integer> f() {
        ArrayList arrayList = new ArrayList();
        if (getDevice().getDeviceSource() == 65) {
            arrayList.add(2);
            arrayList.add(0);
        } else {
            arrayList.add(2);
            arrayList.add(1);
            arrayList.add(3);
            if (HealthExt.INSTANCE.isSupportAtrial(getDevice())) {
                arrayList.add(4);
            }
            arrayList.add(0);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HrSettings g(int i) {
        if (i == 1) {
            return new HrSettings(false, true, false);
        }
        if (i == 2) {
            return new HrSettings(true, false, false);
        }
        if (i != 3) {
            return i != 4 ? new HrSettings(false, false, false) : new HrSettings(false, false, true);
        }
        return new HrSettings(true, true, false);
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.HrModeSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                return Boxing.boxBoolean(false);
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Integer> createSet$health_base_release() {
        return new HrModeSetting$createSet$1(this);
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return f;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Integer> getSettingData() {
        return new HealthSettingData<>(getData(), f());
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.OnDeviceConnect
    @Nullable
    public Object onDeviceConnect(@NotNull Continuation<? super Unit> continuation) {
        if (!getHasRestored()) {
            return Unit.INSTANCE;
        }
        SharedPreferences sharedPreferencesE = e();
        boolean zIsSupportAtrial = HealthExt.INSTANCE.isSupportAtrial(getDevice());
        if (sharedPreferencesE.contains(e) && zIsSupportAtrial == sharedPreferencesE.getBoolean(e, zIsSupportAtrial)) {
            return Unit.INSTANCE;
        }
        sharedPreferencesE.edit().putBoolean(e, zIsSupportAtrial).apply();
        Object objSyncUserConfigToDevice = syncUserConfigToDevice(continuation);
        return objSyncUserConfigToDevice == a.getCOROUTINE_SUSPENDED() ? objSyncUserConfigToDevice : Unit.INSTANCE;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Integer num) {
        setData(num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigFromDevice(@NotNull Continuation<? super Boolean> continuation) {
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
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info(f, c.a);
            SharedPreferences sharedPreferencesE = e();
            boolean zIsSupportAtrial = HealthExt.INSTANCE.isSupportAtrial(getDevice());
            if (!sharedPreferencesE.contains(e) || zIsSupportAtrial != sharedPreferencesE.getBoolean(e, zIsSupportAtrial)) {
                sharedPreferencesE.edit().putBoolean(e, zIsSupportAtrial).apply();
                bVar.c = 1;
                if (syncUserConfigToDevice(bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        HrModeSetting hrModeSetting;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objRecoverHrSettings = dVar.b;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRecoverHrSettings);
            HrSettings hrSettingsG = g(getData().intValue());
            HMLog.info(f, e.a);
            HrModeInit hrModeInit = this.hrModeInit;
            boolean zF = hrSettingsG.f();
            int freq = getUserConfig$health_base_release().getFreq();
            boolean zH = hrSettingsG.h();
            boolean zG = hrSettingsG.g();
            boolean zIsSupportAtrial = HealthExt.INSTANCE.isSupportAtrial(getDevice());
            dVar.a = this;
            dVar.d = 1;
            objRecoverHrSettings = hrModeInit.recoverHrSettings(zF, freq, zH, zG, zIsSupportAtrial, dVar);
            if (objRecoverHrSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
            hrModeSetting = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = dVar.a;
                ResultKt.throwOnFailure(objRecoverHrSettings);
                return obj;
            }
            hrModeSetting = (HrModeSetting) dVar.a;
            ResultKt.throwOnFailure(objRecoverHrSettings);
        }
        ((Boolean) objRecoverHrSettings).booleanValue();
        dVar.a = objRecoverHrSettings;
        dVar.d = 2;
        return super.syncUserConfigToDevice(dVar) == coroutine_suspended ? coroutine_suspended : objRecoverHrSettings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Integer getData() {
        return Integer.valueOf(getUserConfig$health_base_release().getHrDetectType());
    }

    public void setData(int i) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        userConfig$health_base_release.setHrDetectType(i);
        userConfig$health_base_release.save(true);
        notifyChange();
    }
}
