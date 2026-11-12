package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", GoogleApiAvailabilityLight.a, "", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "", "f", "Lcom/huami/bluetooth/profile/ecf/data/StandAlertConfig;", "config", "setConfig", "", "enable", "setEnable", "time", "setStart", "setEnd", "setDndEnable", "setDndStart", "setDndEnd", "setTargetAchieveAlertEnable", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "()Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "accountWebExtApi", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "c", "()Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "mSedentaryConfig", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StandAlertConfigManager implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<StandAlertConfigManager> d = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountWebExtApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSedentaryConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager$Companion;", "", "Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager;", "sInstance$delegate", "Lkotlin/Lazy;", "getSInstance", "()Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager;", "sInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "sInstance", "getSInstance()Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StandAlertConfigManager getSInstance() {
            return (StandAlertConfigManager) StandAlertConfigManager.d.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/StandAlertConfigManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<StandAlertConfigManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StandAlertConfigManager invoke() {
            return new StandAlertConfigManager(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMSedentaryConfig> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMSedentaryConfig invoke() {
            return StandAlertConfigManager.this.b().fromSedentaryConfig(StandAlertConfigManager.this.d().getMiliConfig().getSedentaryRemind());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StandAlertConfigManager() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.health.StandAlertConfigManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.accountWebExtApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AccountWebExtApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.health.StandAlertConfigManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.AccountWebExtApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccountWebExtApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccountWebExtApi.class), objArr2, objArr3);
            }
        });
        this.mSedentaryConfig = LazyKt__LazyJVMKt.lazy(new b());
    }

    public /* synthetic */ StandAlertConfigManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final AccountWebExtApi a() {
        return (AccountWebExtApi) this.accountWebExtApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final HMSedentaryConfig c() {
        return (HMSedentaryConfig) this.mSedentaryConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMPersonInfo d() {
        return HMPersonInfo.getInstance();
    }

    private final void e() {
        HMPersonInfo hMPersonInfoD = d();
        hMPersonInfoD.getMiliConfig().setSedentaryRemind(b().toSedentaryString(c()));
        hMPersonInfoD.saveInfo(2);
        a().updateProfile(false);
    }

    private final int f(Time time) {
        return (time.getHour() * 60) + time.getMinute();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void setConfig(@NotNull StandAlertConfig config) {
        c().setEnable(config.getEnable());
        Integer numValueOf = Integer.valueOf(f(config.getStartTime()));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            c().setStartIndex(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(f(config.getEndTime()));
        if (!(numValueOf2.intValue() > 0)) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            c().setStopIndex(numValueOf2.intValue());
        }
        c().setPeriodEnable(config.getEnableDnd());
        Integer numValueOf3 = Integer.valueOf(f(config.getDndStartTime()));
        if (!(numValueOf3.intValue() > 0)) {
            numValueOf3 = null;
        }
        if (numValueOf3 != null) {
            c().setDndStart(numValueOf3.intValue());
        }
        Integer numValueOf4 = Integer.valueOf(f(config.getDndEndTime()));
        Integer num = numValueOf4.intValue() > 0 ? numValueOf4 : null;
        if (num != null) {
            c().setDndStop(num.intValue());
        }
        e();
    }

    public final void setDndEnable(boolean enable) {
        c().setPeriodEnable(enable);
        e();
    }

    public final void setDndEnd(@NotNull Time time) {
        Integer numValueOf = Integer.valueOf(f(time));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        c().setDndStop(numValueOf.intValue());
        e();
    }

    public final void setDndStart(@NotNull Time time) {
        Integer numValueOf = Integer.valueOf(f(time));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        c().setDndStart(numValueOf.intValue());
        e();
    }

    public final void setEnable(boolean enable) {
        c().setEnable(enable);
        e();
    }

    public final void setEnd(@NotNull Time time) {
        Integer numValueOf = Integer.valueOf(f(time));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        c().setStopIndex(numValueOf.intValue());
        e();
    }

    public final void setStart(@NotNull Time time) {
        Integer numValueOf = Integer.valueOf(f(time));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return;
        }
        c().setStartIndex(numValueOf.intValue());
        e();
    }

    public final void setTargetAchieveAlertEnable(boolean enable) {
        HMPersonInfo hMPersonInfoD = d();
        hMPersonInfoD.getMiliConfig().setGoalRemind(enable);
        hMPersonInfoD.saveInfo(2);
        a().updateProfile(false);
    }
}
