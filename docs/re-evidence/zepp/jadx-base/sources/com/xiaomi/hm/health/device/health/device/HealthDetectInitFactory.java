package com.xiaomi.hm.health.device.health.device;

import androidx.fragment.app.Fragment;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.device.feature.health.HealthUi;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.device.HealthFuncKt;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.device.blood_pressure.IBloodPressureApi;
import com.huami.device.feature.health.device.init.AtrialSettingInit;
import com.huami.device.feature.health.device.init.AtrialSleepNotDisturbInit;
import com.huami.device.feature.health.device.init.BaseHealthInit;
import com.huami.device.feature.health.device.init.BloodPressureInit;
import com.huami.device.feature.health.device.init.HighHrAlertInit;
import com.huami.device.feature.health.device.init.HrIntervalInit;
import com.huami.device.feature.health.device.init.HrModeInit;
import com.huami.device.feature.health.device.init.LowHrAlertInit;
import com.huami.device.feature.health.device.init.LowSpo2AlertInit;
import com.huami.device.feature.health.device.init.OsaInit;
import com.huami.device.feature.health.device.init.PressureAlertInit;
import com.huami.device.feature.health.device.init.PressureInit;
import com.huami.device.feature.health.device.init.RemInit;
import com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit;
import com.huami.device.feature.health.device.init.SmartSpo2Init;
import com.huami.device.feature.health.device.init.SportHrInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.model.HrAlertParam;
import com.huami.device.feature.health.res.IAppRes;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.health.blood_pressure.BloodPressureUtil;
import com.xiaomi.hm.health.device.inject.HealthInjects;
import com.xiaomi.hm.health.device.setting.life.feature.bloodpressure.BloodPressureJsAppSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\bX\u0010YJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0013\u0010-\u001a\u00020*H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u001c\u00109\u001a\u0002058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010;R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001d\u0010W\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bT\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\²\u0006\u000e\u0010[\u001a\u00020Z8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/hm/health/device/health/device/HealthDetectInitFactory;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "device", "", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "r", "", DTransferConstants.SEARCH_KEY, "Lcom/huami/device/feature/health/device/init/AtrialSettingInit;", "b", "Lcom/huami/device/feature/health/device/init/AtrialSleepNotDisturbInit;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "health", "Lcom/huami/device/feature/health/device/init/HighHrAlertInit;", "e", "Lcom/huami/device/feature/health/device/init/HrIntervalInit;", "f", "Lcom/huami/device/feature/health/device/init/HrModeInit;", "g", "Lcom/huami/device/feature/health/device/init/LowHrAlertInit;", "h", "Lcom/huami/device/feature/health/device/init/LowSpo2AlertInit;", "i", "Lcom/huami/device/feature/health/device/init/OsaInit;", z.j, "Lcom/huami/device/feature/health/device/init/PressureInit;", "l", "Lcom/huami/device/feature/health/device/init/PressureAlertInit;", hl.k, "Lcom/huami/device/feature/health/device/init/RemInit;", "m", "Lcom/huami/device/feature/health/device/init/SmartSpo2Init;", "o", "Lcom/huami/device/feature/health/device/init/SportHrInit;", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/device/feature/health/device/init/BloodPressureInit;", "c", "Lcom/huami/device/feature/health/device/init/SleepingBloodPressureMonitorInit;", GoogleApiAvailabilityLight.b, "", "initHealth", "reInitBloodPressure", "updateFlags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", LogUtil.I, "TEST_HR_ALERT_MIN_VALUE", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "getAppApi", "()Lcom/huami/device/feature/health/device/IDeviceAppApi;", "setAppApi", "(Lcom/huami/device/feature/health/device/IDeviceAppApi;)V", "Lcom/huami/device/feature/health/res/IAppRes;", "appRes", "Lcom/huami/device/feature/health/res/IAppRes;", "getAppRes", "()Lcom/huami/device/feature/health/res/IAppRes;", "setAppRes", "(Lcom/huami/device/feature/health/res/IAppRes;)V", "Lkotlin/Function0;", "Landroidx/fragment/app/Fragment;", "getPersonInfoFragment", "Lkotlin/jvm/functions/Function0;", "getGetPersonInfoFragment", "()Lkotlin/jvm/functions/Function0;", "setGetPersonInfoFragment", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/xiaomi/hm/health/device/inject/HealthInjects;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/inject/HealthInjects;", "healthInject", "<init>", "()V", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "jsAppApi", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectInitFactory implements CoroutineScope, KoinComponentAdapter {

    @NotNull
    public static final HealthDetectInitFactory INSTANCE = new HealthDetectInitFactory();

    @NotNull
    public static final String TAG = "HealthDetectInitFactory";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final CompletableJob job;
    public static IDeviceAppApi appApi = null;
    public static IAppRes appRes = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int TEST_HR_ALERT_MIN_VALUE = 70;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy healthInject;
    public static Function0<? extends Fragment> getPersonInfoFragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/inject/HealthInjects;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HealthInjects> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthInjects invoke() {
            return new HealthInjects(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$reInitBloodPressure$1", f = "HealthDetectInitFactory.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthDetectInitFactory healthDetectInitFactory = HealthDetectInitFactory.INSTANCE;
                this.a = 1;
                if (healthDetectInitFactory.updateFlags(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory", f = "HealthDetectInitFactory.kt", i = {}, l = {83, 86}, m = "updateFlags", n = {}, s = {})
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
            return HealthDetectInitFactory.this.updateFlags(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device is install blood pressure app:" + this.a;
        }
    }

    static {
        CompletableJob completableJobD = JobKt__JobKt.d(null, 1, null);
        job = completableJobD;
        coroutineContext = completableJobD.plus(Dispatchers.getIO());
        healthInject = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private HealthDetectInitFactory() {
    }

    private final AtrialSleepNotDisturbInit a(final HMMiLiDevice device) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new AtrialSleepNotDisturbInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getAtrialAlertInit$1
            @Override // com.huami.device.feature.health.device.init.AtrialSleepNotDisturbInit
            @Nullable
            public Object get(@NotNull Continuation<? super HealthSettingData<Boolean>> continuation) {
                Boolean atrialAlertSleepNotDisturbEnable = device.getHeartHealthApi().getAtrialAlertSleepNotDisturbEnable();
                if (atrialAlertSleepNotDisturbEnable == null) {
                    return null;
                }
                return new HealthSettingData(Boxing.boxBoolean(atrialAlertSleepNotDisturbEnable.booleanValue()), null, 2, null);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return zHasFeature && AtrialManagerKt.isSupportAtrialFib(HMDeviceType.MILI);
            }

            @Override // com.huami.device.feature.health.device.init.AtrialSleepNotDisturbInit
            @Nullable
            public Object set(boolean z, @NotNull Continuation<? super Boolean> continuation) {
                return Boxing.boxBoolean(device.getHeartHealthApi().enableAtrialAlertSleepNotDisturb(z));
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return zHasFeature;
            }
        };
    }

    private final AtrialSettingInit b(final HMMiLiDevice device) {
        DeviceInfo deviceInfo = device.getDeviceInfo();
        final com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
        }
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new AtrialSettingInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getAtrialInit$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, boolean z2) {
                    super(0);
                    this.a = z;
                    this.b = z2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "AtrialSettingInit support read: " + this.a + "; isHuamiOs: " + this.b;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z, boolean z2) {
                    super(0);
                    this.a = z;
                    this.b = z2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "AtrialSettingInit support write: " + this.a + "; isHuamiOs: " + this.b;
                }
            }

            @Override // com.huami.device.feature.health.device.init.AtrialSettingInit
            @Nullable
            public Object get(@NotNull Continuation<? super HealthSettingData<Boolean>> continuation) {
                Boolean atrialFibEnable = device.getHeartHealthApi().getAtrialFibEnable();
                if (atrialFibEnable == null) {
                    return null;
                }
                return new HealthSettingData(Boxing.boxBoolean(atrialFibEnable.booleanValue()), null, 2, null);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return AtrialManagerKt.isSupportAtrialFib(HMDeviceType.MILI);
            }

            @Override // com.huami.device.feature.health.device.init.AtrialSettingInit
            @Nullable
            public Object set(boolean z, @NotNull Continuation<? super Boolean> continuation) {
                return Boxing.boxBoolean(device.getHeartHealthApi().setAtrialFibEnable(z));
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                boolean z = zHasFeature || deviceFeature.hasSw(34);
                HMLog.info(HealthDetectInitFactory.TAG, new a(z, zHasFeature));
                return z;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                boolean z = zHasFeature || deviceFeature.hasSw(34);
                HMLog.info(HealthDetectInitFactory.TAG, new b(z, zHasFeature));
                return z;
            }
        };
    }

    private final BloodPressureInit c(final HMMiLiDevice device) {
        return new BloodPressureInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getBloodPressureInit$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final IBloodPressureApi bloodPressureApi;

            {
                this.bloodPressureApi = new HealthDetectInitFactory$getBloodPressureInit$1$bloodPressureApi$1(this.b);
            }

            @Override // com.huami.device.feature.health.device.init.BloodPressureInit
            @NotNull
            public IBloodPressureApi getBloodPressureApi() {
                return this.bloodPressureApi;
            }

            @Override // com.huami.device.feature.health.device.init.BloodPressureInit
            @NotNull
            public Fragment getPersonInfoFragment() {
                return HealthDetectInitFactory.INSTANCE.getGetPersonInfoFragment().invoke();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return BloodPressureUtil.INSTANCE.isSupportBloodPressure(HMDeviceType.MILI);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return true;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return false;
            }
        };
    }

    private final HealthInjects d() {
        return (HealthInjects) healthInject.getValue();
    }

    private final HighHrAlertInit e(final HMMiLiDevice device, final Health health) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new HighHrAlertInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getHrAlertInit$1
            private final List<Integer> a() {
                EnumData hrTooHighRemindValue;
                Health health2 = health;
                ArrayList<Integer> enums = null;
                if (health2 != null && (hrTooHighRemindValue = health2.getHrTooHighRemindValue()) != null) {
                    enums = hrTooHighRemindValue.getEnums();
                }
                if (enums == null) {
                    return CollectionsKt___CollectionsKt.toList(e.step(new IntRange(DeviceXFunctionsKt.getBuildConfigApi().isSupportHrAlertTestRange() ? 70 : 100, 150), 10));
                }
                return enums;
            }

            @Override // com.huami.device.feature.health.device.init.HighHrAlertInit
            @Nullable
            public HealthSettingData<Integer> get(boolean isInit) {
                EnumData hrTooHighRemindValue;
                if (!device.isConnected()) {
                    return null;
                }
                if (!isInit) {
                    HMHrReminder hrReminder = device.getHeartHealthApi().getHrReminder();
                    if (hrReminder == null) {
                        return null;
                    }
                    return new HealthSettingData<>(Integer.valueOf(hrReminder.isEnable() ? hrReminder.getHr() : 0), a());
                }
                Health health2 = health;
                if (health2 == null || (hrTooHighRemindValue = health2.getHrTooHighRemindValue()) == null) {
                    return null;
                }
                return new HealthSettingData<>(Integer.valueOf(hrTooHighRemindValue.getValue()), hrTooHighRemindValue.getEnums());
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return HealthDetectInitFactory.INSTANCE.q(device);
            }

            @Override // com.huami.device.feature.health.device.init.HighHrAlertInit
            public boolean set(@NotNull HrAlertParam hrAlert) {
                HeartHealthApi heartHealthApi = device.getHeartHealthApi();
                HMHrReminder hMHrReminder = new HMHrReminder(hrAlert.getEnable());
                hMHrReminder.setHr(hrAlert.getValue());
                Unit unit = Unit.INSTANCE;
                return heartHealthApi.setHrReminder(hMHrReminder);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final HrIntervalInit f(final HMMiLiDevice device, final Health health) {
        return new HrIntervalInit(health) { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getHrIntervalInit$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isHealthDetect;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean supportDeviceChangeHr;
            public final /* synthetic */ Health d;

            {
                this.d = health;
                DeviceInfo deviceInfo = this.c.getDeviceInfo();
                com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
                this.isHealthDetect = (deviceFeature == null ? new com.xiaomi.hm.health.bt.profile.feature.Feature() : deviceFeature).hasSw(34);
                DeviceInfo deviceInfo2 = this.c.getDeviceInfo();
                com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature2 = deviceInfo2 != null ? deviceInfo2.getDeviceFeature() : null;
                this.supportDeviceChangeHr = (deviceFeature2 == null ? new com.xiaomi.hm.health.bt.profile.feature.Feature() : deviceFeature2).hasSw(28);
            }

            private final List<Integer> a() {
                EnumData hrAllayDetectionFrequency;
                Health health2 = this.d;
                ArrayList<Integer> enums = null;
                if (health2 != null && (hrAllayDetectionFrequency = health2.getHrAllayDetectionFrequency()) != null) {
                    enums = hrAllayDetectionFrequency.getEnums();
                }
                if (enums == null) {
                    return (this.c.isHuamiOs() || this.isHealthDetect) ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 5, 10, 30}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 5, 10, 30});
                }
                return enums;
            }

            @Override // com.huami.device.feature.health.device.init.HrIntervalInit
            @Nullable
            public HealthSettingData<Integer> get(boolean isInit) {
                EnumData hrAllayDetectionFrequency;
                HealthSettingData<Integer> healthSettingData = null;
                if (!isInit) {
                    HeartRateConfig heartRateConfig = this.c.getHeartHealthApi().getHeartRateConfig();
                    if (heartRateConfig == null) {
                        return null;
                    }
                    return new HealthSettingData<>(Integer.valueOf(heartRateConfig.getCheckCycle()), a());
                }
                Health health2 = this.d;
                if (health2 != null && (hrAllayDetectionFrequency = health2.getHrAllayDetectionFrequency()) != null) {
                    healthSettingData = new HealthSettingData<>(Integer.valueOf(hrAllayDetectionFrequency.getValue()), a());
                }
                return healthSettingData == null ? new HealthSettingData<>(0, a()) : healthSettingData;
            }

            public final boolean getSupportDeviceChangeHr() {
                return this.supportDeviceChangeHr;
            }

            /* JADX INFO: renamed from: isHealthDetect, reason: from getter */
            public final boolean getIsHealthDetect() {
                return this.isHealthDetect;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return true;
            }

            @Override // com.huami.device.feature.health.device.init.HrIntervalInit
            public boolean set(int interval) {
                return this.c.getHeartHealthApi().setHrInterval(interval);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return this.c.isHuamiOs() || this.isHealthDetect || this.supportDeviceChangeHr;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final HrModeInit g(final HMMiLiDevice device) {
        return new HrModeInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getHrModeInit$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ HMMiLiDevice c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, boolean z2, HMMiLiDevice hMMiLiDevice) {
                    super(0);
                    this.a = z;
                    this.b = z2;
                    this.c = hMMiLiDevice;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "support HrModeInit: " + this.a + ", isHuamiOs: " + this.b + ", source: " + this.c.getDeviceSource();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z, int i, boolean z2, boolean z3, boolean z4) {
                    super(0);
                    this.a = z;
                    this.b = i;
                    this.c = z2;
                    this.d = z3;
                    this.e = z4;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "recoverHrSettings, hrEnable: " + this.a + ", hrInterval: " + this.b + ", hrSleepEnable: " + this.c + ", atrialFibEnable: " + this.d + ", isSupportAtrial: " + this.e;
                }
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                DeviceInfo deviceInfo = device.getDeviceInfo();
                com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
                if (deviceFeature == null) {
                    deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
                }
                boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
                boolean z = (zHasFeature || deviceFeature.hasSw(34)) ? false : true;
                HMLog.info(HealthDetectInitFactory.TAG, new a(z, zHasFeature, device));
                return z;
            }

            @Override // com.huami.device.feature.health.device.init.HrModeInit
            @Nullable
            public Object recoverHrSettings(boolean z, int i, boolean z2, boolean z3, boolean z4, @NotNull Continuation<? super Boolean> continuation) {
                HMLog.info(HealthDetectInitFactory.TAG, new b(z, i, z2, z3, z4));
                return Boxing.boxBoolean(device.getHeartHealthApi().recoverHrSetting(z, i, z2, z3, z4));
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return false;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final LowHrAlertInit h(final HMMiLiDevice device, final Health health) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new LowHrAlertInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getLowHrAlertInit$1
            private final List<Integer> a() {
                EnumData hrTooLowRemindValue;
                Health health2 = health;
                ArrayList<Integer> enums = null;
                if (health2 != null && (hrTooLowRemindValue = health2.getHrTooLowRemindValue()) != null) {
                    enums = hrTooLowRemindValue.getEnums();
                }
                if (enums != null) {
                    return enums;
                }
                List mutableList = CollectionsKt___CollectionsKt.toMutableList(e.step(new IntRange(40, 50), 5));
                mutableList.add(0);
                return CollectionsKt___CollectionsKt.toList(mutableList);
            }

            @Override // com.huami.device.feature.health.device.init.LowHrAlertInit
            @Nullable
            public HealthSettingData<Integer> get(boolean isInit) {
                EnumData hrTooLowRemindValue;
                if (!device.isConnected()) {
                    return null;
                }
                if (!isInit) {
                    HMHrReminder lowHrReminder = device.getHeartHealthApi().getLowHrReminder();
                    if (lowHrReminder == null) {
                        return null;
                    }
                    return new HealthSettingData<>(Integer.valueOf(lowHrReminder.isEnable() ? lowHrReminder.getHr() : 0), a());
                }
                Health health2 = health;
                if (health2 == null || (hrTooLowRemindValue = health2.getHrTooLowRemindValue()) == null) {
                    return null;
                }
                return new HealthSettingData<>(Integer.valueOf(hrTooLowRemindValue.getValue()), a());
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.LowHrAlertInit
            public boolean set(@NotNull HrAlertParam hrAlert) {
                HeartHealthApi heartHealthApi = device.getHeartHealthApi();
                HMHrReminder hMHrReminder = new HMHrReminder(hrAlert.getEnable());
                hMHrReminder.setHr(hrAlert.getValue());
                Unit unit = Unit.INSTANCE;
                return heartHealthApi.setLowHrReminder(hMHrReminder);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return zHasFeature;
            }
        };
    }

    private final LowSpo2AlertInit i(final HMMiLiDevice device, final Health health) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new LowSpo2AlertInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getLowSpo2AlertInit$1
            private final List<Integer> a() {
                EnumData spo2LowLevelRemindValue;
                Health health2 = health;
                ArrayList<Integer> enums = null;
                if (health2 != null && (spo2LowLevelRemindValue = health2.getSpo2LowLevelRemindValue()) != null) {
                    enums = spo2LowLevelRemindValue.getEnums();
                }
                return enums == null ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 80, 85, 90}) : enums;
            }

            @Override // com.huami.device.feature.health.device.init.LowSpo2AlertInit
            @Nullable
            public HealthSettingData<Integer> get(boolean isInit) {
                EnumData spo2LowLevelRemindValue;
                if (!device.isConnected()) {
                    return null;
                }
                if (!isInit) {
                    Integer lowSpo2AlertValue = device.getHeartHealthApi().getLowSpo2AlertValue();
                    if (lowSpo2AlertValue == null) {
                        return null;
                    }
                    return new HealthSettingData<>(Integer.valueOf(lowSpo2AlertValue.intValue()), a());
                }
                Health health2 = health;
                if (health2 == null || (spo2LowLevelRemindValue = health2.getSpo2LowLevelRemindValue()) == null) {
                    return null;
                }
                return new HealthSettingData<>(Integer.valueOf(spo2LowLevelRemindValue.getValue()), a());
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.LowSpo2AlertInit
            public boolean set(int data) {
                return device.getHeartHealthApi().setLowSpo2AlertValue(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return zHasFeature;
            }
        };
    }

    private final OsaInit j(final HMMiLiDevice device) {
        DeviceInfo deviceInfo = device.getDeviceInfo();
        final com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
        }
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new OsaInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getOsaInit$1
            @Override // com.huami.device.feature.health.device.init.OsaInit
            @Nullable
            public Boolean get() {
                return device.getHeartHealthApi().getOsaEnable();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(21);
            }

            @Override // com.huami.device.feature.health.device.init.OsaInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().enableOsa(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(34);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final PressureAlertInit k(final HMMiLiDevice device) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new PressureAlertInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getPressureAlertInit$1
            @Override // com.huami.device.feature.health.device.init.PressureAlertInit
            @Nullable
            public Boolean get() {
                return device.getHeartHealthApi().getPressureAlertEnable();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.PressureAlertInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().enablePressureAlert(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return zHasFeature;
            }
        };
    }

    private final PressureInit l(final HMMiLiDevice device) {
        DeviceInfo deviceInfo = device.getDeviceInfo();
        final com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
        }
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        return new PressureInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getPressureInit$1
            @Override // com.huami.device.feature.health.device.init.PressureInit
            @Nullable
            public Boolean get() {
                return device.getHeartHealthApi().getPressureEnable();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(3);
            }

            @Override // com.huami.device.feature.health.device.init.PressureInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().enablePressure(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(34);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final RemInit m(final HMMiLiDevice device) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        DeviceInfo deviceInfo = device.getDeviceInfo();
        final com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
        }
        return new RemInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getRemInit$1
            @Override // com.huami.device.feature.health.device.init.RemInit
            @Nullable
            public Boolean get() {
                return device.getHeartHealthApi().getSleepAssistantEnable();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(7);
            }

            @Override // com.huami.device.feature.health.device.init.RemInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().setSleepAssistantEnable(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return zHasFeature || deviceFeature.hasSw(34);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final SleepingBloodPressureMonitorInit n(final HMMiLiDevice device) {
        return new SleepingBloodPressureMonitorInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getSleepingBloodPressureMonitorInit$1
            @Override // com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit
            public boolean deviceSupport() {
                return device.getHeartHealthApi().getSleepingBloodPressureMonitorEnable() != null;
            }

            @Override // com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit
            public boolean get() {
                Boolean sleepingBloodPressureMonitorEnable = device.getHeartHealthApi().getSleepingBloodPressureMonitorEnable();
                if (sleepingBloodPressureMonitorEnable == null) {
                    return false;
                }
                return sleepingBloodPressureMonitorEnable.booleanValue();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return BloodPressureUtil.INSTANCE.isSupportBloodPressure(HMDeviceType.MILI);
            }

            @Override // com.huami.device.feature.health.device.init.SleepingBloodPressureMonitorInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().setSleepingBloodPressureMonitorEnable(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return true;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final SmartSpo2Init o(final HMMiLiDevice device) {
        return new SmartSpo2Init() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getSmartSpo2Init$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isHuamiOs;

            {
                this.isHuamiOs = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, this.b.getDeviceSource());
            }

            @Override // com.huami.device.feature.health.device.init.SmartSpo2Init
            @Nullable
            public Boolean get() {
                return this.b.getHeartHealthApi().getSmartSpo2Enable();
            }

            /* JADX INFO: renamed from: isHuamiOs, reason: from getter */
            public final boolean getIsHuamiOs() {
                return this.isHuamiOs;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return this.isHuamiOs;
            }

            @Override // com.huami.device.feature.health.device.init.SmartSpo2Init
            public boolean set(boolean data) {
                return this.b.getHeartHealthApi().enableSmartSpo2(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead */
            public boolean getA() {
                return true;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    private final SportHrInit p(final HMMiLiDevice device) {
        final boolean zHasFeature = ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource());
        final boolean zHasFeature2 = ConfigHelperKt.hasFeature(Feature.SPORT_HR_DETECT, device.getDeviceSource());
        return new SportHrInit() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$getSportHrInit$1
            @Override // com.huami.device.feature.health.device.init.SportHrInit
            @Nullable
            public Boolean get() {
                return device.getHeartHealthApi().getSportHeartRateEnable();
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: isSupport */
            public boolean getA() {
                return zHasFeature || zHasFeature2;
            }

            @Override // com.huami.device.feature.health.device.init.SportHrInit
            public boolean set(boolean data) {
                return device.getHeartHealthApi().setSportHeartRateEnable(data);
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            /* JADX INFO: renamed from: supportRead, reason: from getter */
            public boolean getA() {
                return zHasFeature;
            }

            @Override // com.huami.device.feature.health.device.init.BaseHealthInit
            public boolean supportWrite() {
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(HMMiLiDevice device) {
        DeviceInfo deviceInfo = device.getDeviceInfo();
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo == null ? null : deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            deviceFeature = new com.xiaomi.hm.health.bt.profile.feature.Feature();
        }
        boolean zHasSw = deviceFeature.hasSw(34);
        boolean zHasMiliFeature = ConfigHelperKt.hasMiliFeature(Feature.HR_ALERT);
        if (ConfigHelperKt.hasMiliFeature(Feature.AMAZFIT_X_SOURCE_S)) {
            return zHasMiliFeature && zHasSw;
        }
        return zHasMiliFeature;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    private final List<BaseHealthInit> r(HMMiLiDevice device) {
        Object objN;
        Settings settings;
        Health health = null;
        if (ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getDeviceSource())) {
            SettingsModule settingsModule = (SettingsModule) device.getChannelModule(SettingsModule.class);
            if (settingsModule == null) {
                settings = null;
            } else {
                SettingsGroupType settingsGroupType = SettingsGroupType.HEALTH;
                HashMap<SettingsGroupType, Settings> mapQuerySettingsSync = settingsModule.querySettingsSync(true, new SettingsGroupType[]{settingsGroupType});
                if (mapQuerySettingsSync == null) {
                    settings = null;
                } else {
                    settings = mapQuerySettingsSync.get(settingsGroupType);
                }
            }
            if (settings instanceof Health) {
                health = (Health) settings;
            }
        }
        List<HealthFunc<?>> allFuncList = HealthFuncKt.getAllFuncList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allFuncList, 10));
        Iterator<T> it2 = allFuncList.iterator();
        while (it2.hasNext()) {
            HealthFunc healthFunc = (HealthFunc) it2.next();
            if (Intrinsics.areEqual(healthFunc, HealthFunc.ATRIAL.INSTANCE)) {
                objN = INSTANCE.b(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB.INSTANCE)) {
                objN = INSTANCE.a(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.HIGH_HR_ALERT.INSTANCE)) {
                objN = INSTANCE.e(device, health);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.HR_INTERVAL.INSTANCE)) {
                objN = INSTANCE.f(device, health);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.HR_MODE.INSTANCE)) {
                objN = INSTANCE.g(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.LOW_HR_ALERT.INSTANCE)) {
                objN = INSTANCE.h(device, health);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.LOW_SPO2_ALERT.INSTANCE)) {
                objN = INSTANCE.i(device, health);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.OSA.INSTANCE)) {
                objN = INSTANCE.j(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.PRESSURE.INSTANCE)) {
                objN = INSTANCE.l(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.PRESSURE_ALERT.INSTANCE)) {
                objN = INSTANCE.k(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.REM.INSTANCE)) {
                objN = INSTANCE.m(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.SMART_SPO2.INSTANCE)) {
                objN = INSTANCE.o(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.SPORT_HR.INSTANCE)) {
                objN = INSTANCE.p(device);
            } else if (Intrinsics.areEqual(healthFunc, HealthFunc.BLOOD_PRESSURE.INSTANCE)) {
                objN = INSTANCE.c(device);
            } else {
                if (!Intrinsics.areEqual(healthFunc, HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                objN = INSTANCE.n(device);
            }
            arrayList.add(objN);
        }
        return arrayList;
    }

    private static final JsAppApi s(Lazy<? extends JsAppApi> lazy) {
        return lazy.getValue();
    }

    @NotNull
    public final IDeviceAppApi getAppApi() {
        IDeviceAppApi iDeviceAppApi = appApi;
        Objects.requireNonNull(iDeviceAppApi);
        return iDeviceAppApi;
    }

    @NotNull
    public final IAppRes getAppRes() {
        IAppRes iAppRes = appRes;
        Objects.requireNonNull(iAppRes);
        return iAppRes;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    @NotNull
    public final Function0<Fragment> getGetPersonInfoFragment() {
        Function0 function0 = getPersonInfoFragment;
        Objects.requireNonNull(function0);
        return function0;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    public final synchronized void initHealth() {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        List<BaseHealthInit> listR = null;
        HMMiLiDevice hMMiLiDevice = miliDevice instanceof HMMiLiDevice ? (HMMiLiDevice) miliDevice : null;
        if (hMMiLiDevice != null) {
            listR = INSTANCE.r(hMMiLiDevice);
        }
        if (listR == null) {
            listR = CollectionsKt__CollectionsKt.emptyList();
        }
        HealthUi.INSTANCE.initConfig(DeviceXFunctionsKt.getContext(), new HealthInitConfigImpl(new HealthDeviceImpl(listR), getAppApi(), getAppRes()));
        d().load();
    }

    public final void reInitBloodPressure() {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void setAppApi(@NotNull IDeviceAppApi iDeviceAppApi) {
        appApi = iDeviceAppApi;
    }

    public final void setAppRes(@NotNull IAppRes iAppRes) {
        appRes = iAppRes;
    }

    public final void setGetPersonInfoFragment(@NotNull Function0<? extends Fragment> function0) {
        getPersonInfoFragment = function0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object updateFlags(@NotNull Continuation<? super Unit> continuation) {
        c cVar;
        BloodPressureApi bloodPressureApi;
        Long l;
        long jLongValue;
        BloodPressureSetting service;
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
        Object objHasJsAppInstalled = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                bloodPressureApi = (BloodPressureApi) cVar.a;
                ResultKt.throwOnFailure(objHasJsAppInstalled);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHasJsAppInstalled);
            }
            l = (Long) objHasJsAppInstalled;
            if (l != null) {
                jLongValue = l.longValue();
                service = HealthFunc.BLOOD_PRESSURE.INSTANCE.getService();
                if (service != null) {
                    service.setData(jLongValue);
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objHasJsAppInstalled);
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        HMMiLiDevice hMMiLiDevice = miliDevice instanceof HMMiLiDevice ? (HMMiLiDevice) miliDevice : null;
        if (hMMiLiDevice != null && (bloodPressureApi = hMMiLiDevice.getBloodPressureApi()) != null) {
            LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
            final Object[] objArr2 = objArr == true ? 1 : 0;
            JsAppApi jsAppApiS = s(LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<JsAppApi>() { // from class: com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory$updateFlags$$inlined$inject$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final JsAppApi invoke() {
                    KoinComponent koinComponent = this;
                    return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(JsAppApi.class), qualifier, objArr2);
                }
            }));
            cVar.a = bloodPressureApi;
            cVar.d = 1;
            objHasJsAppInstalled = jsAppApiS.hasJsAppInstalled(BloodPressureJsAppSubscriber.BLOOD_PRESSURE_APP_ID, cVar);
            if (objHasJsAppInstalled == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
        boolean zBooleanValue = ((Boolean) objHasJsAppInstalled).booleanValue();
        HMLog.info("BloodPressure", new d(zBooleanValue));
        BloodPressureUtil.INSTANCE.setIS_DEVICE_INSTALL_JS_APP(zBooleanValue);
        cVar.a = null;
        cVar.d = 2;
        objHasJsAppInstalled = bloodPressureApi.queryCorrectDate(cVar);
        if (objHasJsAppInstalled == coroutine_suspended) {
            return coroutine_suspended;
        }
        l = (Long) objHasJsAppInstalled;
        if (l != null) {
            jLongValue = l.longValue();
            service = HealthFunc.BLOOD_PRESSURE.INSTANCE.getService();
            if (service != null) {
                service.setData(jLongValue);
            }
        }
        return Unit.INSTANCE;
    }
}
