package com.xiaomi.hm.health.device.recover;

import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.device.introduce.recocver.IRecover;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitLogicKt;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitMode;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/recover/LongSitRecover;", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/model/HMSedentaryConfig;", "config", "", "c", "device", "notRecover", "recover", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "()Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "accountWebExtApi", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class LongSitRecover implements IRecover, KoinComponentAdapter {

    @NotNull
    private static final String c = "LongSitRecover";
    private static final long d = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy accountWebExtApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "personInfo null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "miliConfig null!";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "sedentaryRemind null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "config: " + this.a + ", ret: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "before: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LongSitRecover() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.recover.LongSitRecover$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.accountWebExtApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AccountWebExtApi>() { // from class: com.xiaomi.hm.health.device.recover.LongSitRecover$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.AccountWebExtApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AccountWebExtApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccountWebExtApi.class), objArr2, objArr3);
            }
        });
    }

    private final AccountWebExtApi a() {
        return (AccountWebExtApi) this.accountWebExtApi.getValue();
    }

    private final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final boolean c(HMMiLiProDevice hMMiLiProDevice, HMSedentaryConfig hMSedentaryConfig) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new LongSitRecover$setLongSitRemindSync$1(hMMiLiProDevice, hMSedentaryConfig, null), 1, null)).booleanValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.introduce.recocver.IRecover
    public boolean notRecover(@NotNull HMMiLiProDevice device) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (hMPersonInfo == null) {
            HMLog.error$default(c, null, null, a.a, 6, null);
            return false;
        }
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        if (miliConfig == null) {
            HMLog.error$default(c, null, null, b.a, 6, null);
            return false;
        }
        String sedentaryRemind = miliConfig.getSedentaryRemind();
        if (sedentaryRemind == null) {
            HMLog.error$default(c, null, null, c.a, 6, null);
            return false;
        }
        LongSitMode longSitMode$default = LongSitLogicKt.getLongSitMode$default(null, 1, null);
        DeviceUtilsApi deviceUtilsApiB = b();
        HMLog.info(c, new e(sedentaryRemind));
        Unit unit = Unit.INSTANCE;
        HMSedentaryConfig hMSedentaryConfigFromSedentaryConfig = deviceUtilsApiB.fromSedentaryConfig(sedentaryRemind);
        hMSedentaryConfigFromSedentaryConfig.setEnable(true);
        hMSedentaryConfigFromSedentaryConfig.setPeriodEnable(true);
        boolean standAlertConfig = longSitMode$default.isStandAlert() ? device.setStandAlertConfig(StandAlertConfig.INSTANCE.toStandAlertConfig(hMSedentaryConfigFromSedentaryConfig)) : c(device, hMSedentaryConfigFromSedentaryConfig);
        String sedentaryString = b().toSedentaryString(hMSedentaryConfigFromSedentaryConfig);
        HMLog.info$default(null, new d(sedentaryString, standAlertConfig), 1, null);
        if (standAlertConfig) {
            miliConfig.setSedentaryRemind(sedentaryString);
            hMPersonInfo.saveInfo(2);
            a().updateProfile(false);
        }
        return standAlertConfig;
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        return true;
    }
}
