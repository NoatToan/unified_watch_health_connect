package com.huami.device.feature.health.settings;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.LowSpo2AlertInit;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/huami/device/feature/health/settings/LowSpo2AlertSetting;", "Lcom/huami/device/feature/health/settings/BaseSetting;", "", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "syncUserConfigToDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getItemTag", "Lcom/huami/device/feature/health/device/init/LowSpo2AlertInit;", GoogleApiAvailabilityLight.a, "Lcom/huami/device/feature/health/device/init/LowSpo2AlertInit;", "initItem", "", "e", "Lkotlin/Lazy;", "()Ljava/util/List;", "mSettingList", "value", "getData", "()Ljava/lang/Integer;", "setData", "(I)V", "data", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/init/LowSpo2AlertInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "f", "a", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class LowSpo2AlertSetting extends BaseSetting<Integer> {

    @NotNull
    private static final a f = new a(null);

    @Deprecated
    @NotNull
    private static final String g = "LowSpo2AlertSetting";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LowSpo2AlertInit initItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSettingList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/device/feature/health/settings/LowSpo2AlertSetting$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<Integer>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<Integer> invoke() {
            List<Integer> valueList;
            HealthSettingData<Integer> healthSettingData = LowSpo2AlertSetting.this.initItem.get(true);
            List<Integer> mutableList = null;
            if (healthSettingData != null && (valueList = healthSettingData.getValueList()) != null) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) valueList);
            }
            if (mutableList != null) {
                return mutableList;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            arrayList.add(80);
            arrayList.add(85);
            arrayList.add(90);
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.LowSpo2AlertSetting", f = "LowSpo2AlertSetting.kt", i = {}, l = {67}, m = "syncUserConfigToDevice", n = {}, s = {})
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
            return LowSpo2AlertSetting.this.syncUserConfigToDevice(this);
        }
    }

    public LowSpo2AlertSetting(@NotNull LowSpo2AlertInit lowSpo2AlertInit, @NotNull HealthDevice healthDevice) {
        super(lowSpo2AlertInit, healthDevice);
        this.initItem = lowSpo2AlertInit;
        this.mSettingList = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> e() {
        return (List) this.mSettingList.getValue();
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public ReadFromDevice createGet$health_base_release() {
        return new ReadFromDevice() { // from class: com.huami.device.feature.health.settings.LowSpo2AlertSetting$createGet$1
            @Override // com.huami.device.feature.health.settings.device.ReadFromDevice
            @Nullable
            public Object read(@NotNull Continuation<? super Boolean> continuation) {
                HealthSettingData healthSettingData = null;
                HealthSettingData healthSettingData2 = LowSpo2AlertInit.get$default(this.a.initItem, false, 1, null);
                if (healthSettingData2 != null) {
                    LowSpo2AlertSetting lowSpo2AlertSetting = this.a;
                    lowSpo2AlertSetting.e().clear();
                    lowSpo2AlertSetting.e().addAll(healthSettingData2.getValueList());
                    lowSpo2AlertSetting.setData(((Number) healthSettingData2.getValue()).intValue());
                    healthSettingData = healthSettingData2;
                }
                return Boxing.boxBoolean(healthSettingData != null);
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public SetToDevice<Integer> createSet$health_base_release() {
        return new SetToDevice<Integer>() { // from class: com.huami.device.feature.health.settings.LowSpo2AlertSetting$createSet$1
            @Override // com.huami.device.feature.health.settings.device.SetToDevice
            public /* bridge */ /* synthetic */ Object set(Integer num, Continuation continuation) {
                return set(num.intValue(), (Continuation<? super Boolean>) continuation);
            }

            @Nullable
            public Object set(int i, @NotNull Continuation<? super Boolean> continuation) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(this.a.initItem.set(i));
                LowSpo2AlertSetting lowSpo2AlertSetting = this.a;
                if (boolBoxBoolean.booleanValue()) {
                    lowSpo2AlertSetting.setData(i);
                }
                return boolBoxBoolean;
            }
        };
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object getItemTag(@NotNull Continuation<? super String> continuation) {
        return g;
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    @NotNull
    public HealthSettingData<Integer> getSettingData() {
        return new HealthSettingData<>(getData(), e());
    }

    @Override // com.huami.device.feature.health.settings.BaseSetting
    public /* bridge */ /* synthetic */ void setData(Integer num) {
        setData(num.intValue());
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
        return Integer.valueOf(getUserConfig$health_base_release().getLowSpo2AlertValue());
    }

    public void setData(int i) {
        HealthSettingConfig userConfig$health_base_release = getUserConfig$health_base_release();
        userConfig$health_base_release.setLowSpo2AlertValue(i);
        userConfig$health_base_release.save(true);
        notifyChange();
    }
}
