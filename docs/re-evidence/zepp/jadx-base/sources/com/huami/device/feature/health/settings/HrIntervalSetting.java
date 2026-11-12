package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.HrIntervalInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.user.HealthSettingConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "f", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "onDeviceConnect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "syncUserConfigFromDevice", "", "getItemTag", "syncUserConfigToDevice", "Lcom/huami/device/feature/health/device/init/HrIntervalInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/HrIntervalInit;", "initItem", "", "e", "Lkotlin/Lazy;", "()Ljava/util/List;", "mSettingList", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "value", "getData", "()Ljava/lang/Integer;", "setData", "(I)V", "data", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/HrIntervalInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HrIntervalSetting extends BaseSetting<Integer> {

    @NotNull
    private static final String f = "HrIntervalSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HrIntervalInit initItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSettingList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<Integer>> {
        public final /* synthetic */ HealthDevice b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HealthDevice healthDevice) {
            super(0);
            this.b = healthDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<Integer> invoke() {
            List<Integer> valueList;
            HealthSettingData<Integer> healthSettingData = HrIntervalSetting.this.initItem.get(true);
            List<Integer> arrayList = null;
            if (healthSettingData != null && (valueList = healthSettingData.getValueList()) != null) {
                arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) valueList);
            }
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                if (this.b.isHealthDetect()) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                arrayList.add(5);
                arrayList.add(10);
                arrayList.add(30);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.HrIntervalSetting", f = "HrIntervalSetting.kt", i = {}, l = {92}, m = "syncUserConfigFromDevice", n = {}, s = {})
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
            return HrIntervalSetting.this.syncUserConfigFromDevice(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.HrIntervalSetting", f = "HrIntervalSetting.kt", i = {}, l = {104}, m = "syncUserConfigToDevice", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HrIntervalSetting.this.syncUserConfigToDevice(this);
        }
    }

    public HrIntervalSetting(@NotNull HrIntervalInit hrIntervalInit, @NotNull HealthDevice healthDevice) {
        super(hrIntervalInit, healthDevice);
        this.initItem = hrIntervalInit;
        this.mSettingList = LazyKt__LazyJVMKt.lazy(new a(healthDevice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> e() {
        return (List) this.mSettingList.getValue();
    }

    private final int f(int i) {
        boolean z = getDevice().isHuamiOs() && getDevice().isMifit();
        if (z && i == 5) {
            return 255;
        }
        if (z || i != 255) {
            return i;
        }
        return 10;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.HrIntervalSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                HealthSettingData healthSettingData = null;
                HealthSettingData healthSettingData2 = HrIntervalInit.get$default(this.a.initItem, false, 1, null);
                if (healthSettingData2 != null) {
                    HrIntervalSetting hrIntervalSetting = this.a;
                    hrIntervalSetting.e().clear();
                    hrIntervalSetting.e().addAll(healthSettingData2.getValueList());
                    hrIntervalSetting.setData(((Number) healthSettingData2.getValue()).intValue());
                    healthSettingData = healthSettingData2;
                }
                return Boxing.boxBoolean(healthSettingData != null);
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Integer> createSet$health_base_release() {
        return new SetToDevice<Integer>() { // from class: com.huami.device.feature.health.settings.HrIntervalSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Integer num, Continuation continuation) {
                return set(num.intValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(int i, @NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.initItem.set(i));
                HrIntervalSetting hrIntervalSetting = this.a;
                if (boolBoxBoolean.booleanValue()) {
                    hrIntervalSetting.setData(i);
                }
                return boolBoxBoolean;
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return f;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Integer> getSettingData() {
        return new HealthSettingData<>(getData(), e());
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.OnDeviceConnect
    @Nullable
    public Object onDeviceConnect(@NotNull Continuation<? super Unit> continuation) {
        ReadFromDevice readFromDevice;
        if (!getHasRestored()) {
            return Unit.INSTANCE;
        }
        if ((!getDevice().isHealthDetect() && !getDevice().isHuamiOs()) || (readFromDevice = getReadFromDevice()) == null) {
            return Unit.INSTANCE;
        }
        Object obj = readFromDevice.read(continuation);
        return obj == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
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
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (getDevice().isHealthDetect() || getDevice().isHuamiOs()) {
                ReadFromDevice readFromDevice = getReadFromDevice();
                if (readFromDevice != null) {
                    bVar.c = 1;
                    obj = readFromDevice.read(bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                zBooleanValue = true;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.device.feature.health.settings.BaseSetting, com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Boolean bool = (Boolean) cVar.a;
            ResultKt.throwOnFailure(obj);
            return bool;
        }
        ResultKt.throwOnFailure(obj);
        Boolean boolBoxBoolean = Boxing.boxBoolean(this.initItem.set(getData().intValue()));
        boolBoxBoolean.booleanValue();
        cVar.a = boolBoxBoolean;
        cVar.d = 1;
        return super.syncUserConfigToDevice(cVar) == coroutine_suspended ? coroutine_suspended : boolBoxBoolean;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Integer getData() {
        int iF;
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        if (getDevice().isForceHrAndRemEnable()) {
            iF = 1;
        } else {
            iF = (userConfig$health_base_release.getHrEnable() || !getDevice().isHealthDetect()) ? f(userConfig$health_base_release.getFreq()) : 0;
        }
        return Integer.valueOf(iF);
    }

    public void setData(int i) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        if (getDevice().isHealthDetect()) {
            userConfig$health_base_release.setHrEnable(i > 0);
        }
        if (!getDevice().isHealthDetect() || userConfig$health_base_release.getHrEnable()) {
            userConfig$health_base_release.setFreq(f(i));
        }
        userConfig$health_base_release.save(true);
        notifyChange();
    }
}
