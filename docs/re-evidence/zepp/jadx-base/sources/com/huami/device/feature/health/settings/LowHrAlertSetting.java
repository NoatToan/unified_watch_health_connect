package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.LowHrAlertInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.model.HrAlertParam;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/huami/device/feature/health/settings/LowHrAlertSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "data", "Lcom/huami/device/feature/health/model/HrAlertParam;", "e", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "syncUserConfigToDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getItemTag", "Lcom/huami/device/feature/health/device/init/LowHrAlertInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/LowHrAlertInit;", "initItem", "", "Lkotlin/Lazy;", "f", "()Ljava/util/List;", "mSettingList", "value", "getData", "()Ljava/lang/Integer;", "setData", "(I)V", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/LowHrAlertInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class LowHrAlertSetting extends BaseSetting<Integer> {
    public static final int MAX_VALUE = 50;
    public static final int MIN_VALUE = 40;
    public static final int STEP = 5;

    @NotNull
    private static final String f = "LowHrAlertSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LowHrAlertInit initItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSettingList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<Integer>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<Integer> invoke() {
            List<Integer> valueList;
            HealthSettingData<Integer> healthSettingData = LowHrAlertSetting.this.initItem.get(true);
            List<Integer> mutableList = null;
            if (healthSettingData != null && (valueList = healthSettingData.getValueList()) != null) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) valueList);
            }
            if (mutableList != null) {
                return mutableList;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(CollectionsKt___CollectionsKt.toList(e.step(new IntRange(40, 50), 5)));
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.LowHrAlertSetting", f = "LowHrAlertSetting.kt", i = {}, l = {70}, m = "syncUserConfigToDevice", n = {}, s = {})
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
            return LowHrAlertSetting.this.syncUserConfigToDevice(this);
        }
    }

    public LowHrAlertSetting(@NotNull LowHrAlertInit lowHrAlertInit, @NotNull HealthDevice healthDevice) {
        super(lowHrAlertInit, healthDevice);
        this.initItem = lowHrAlertInit;
        this.mSettingList = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HrAlertParam e(int data) {
        return new HrAlertParam(data > 0, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> f() {
        return (List) this.mSettingList.getValue();
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.LowHrAlertSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                HealthSettingData healthSettingData = null;
                HealthSettingData healthSettingData2 = LowHrAlertInit.get$default(this.a.initItem, false, 1, null);
                if (healthSettingData2 != null) {
                    LowHrAlertSetting lowHrAlertSetting = this.a;
                    lowHrAlertSetting.f().clear();
                    lowHrAlertSetting.f().addAll(healthSettingData2.getValueList());
                    lowHrAlertSetting.setData(((Number) healthSettingData2.getValue()).intValue());
                    healthSettingData = healthSettingData2;
                }
                return Boxing.boxBoolean(healthSettingData != null);
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Integer> createSet$health_base_release() {
        return new SetToDevice<Integer>() { // from class: com.huami.device.feature.health.settings.LowHrAlertSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Integer num, Continuation continuation) {
                return set(num.intValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(int i, @NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.initItem.set(this.a.e(i)));
                LowHrAlertSetting lowHrAlertSetting = this.a;
                if (boolBoxBoolean.booleanValue()) {
                    lowHrAlertSetting.setData(i);
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
        return new HealthSettingData<>(getData(), f());
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Integer num) {
        setData(num.intValue());
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
        Boolean boolBoxBoolean = Boxing.boxBoolean(this.initItem.set(e(getData().intValue())));
        boolBoxBoolean.booleanValue();
        bVar.a = boolBoxBoolean;
        bVar.d = 1;
        return super.syncUserConfigToDevice(bVar) == coroutine_suspended ? coroutine_suspended : boolBoxBoolean;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public Integer getData() {
        return Integer.valueOf(getUserConfig$health_base_release().getLowWarningValue());
    }

    public void setData(int i) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        userConfig$health_base_release.setLowWarningValue(i);
        userConfig$health_base_release.save(true);
        notifyChange();
    }
}
