package com.xiaomi.hm.health.weather.other;

import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010*\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b!\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u00101\u001a\u00020.8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/weather/other/ZeppOSWeatherHandler;", "Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/locweather/model/WeatherInfos;", "weatherInfo", "", "f", "e", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "module", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "b", "a", "handleAutoLocate", "clearCache", "handleFailed", "fillWeatherCities", "", "supportLocation", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "lastCity", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "failedAction", "", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getWeatherProtocolVersion", "()Ljava/lang/Integer;", "setWeatherProtocolVersion", "(Ljava/lang/Integer;)V", "weatherProtocolVersion", "Lkotlinx/coroutines/Job;", "()Lkotlinx/coroutines/Job;", "job", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFillWeatherCities", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ZeppOSWeatherHandler implements IZeppOSWeatherHandler, CoroutineScope, KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "ZeppOSWeatherHandler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private City lastCity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Boolean> failedAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Integer weatherProtocolVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isFillWeatherCities;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/weather/other/ZeppOSWeatherHandler$Companion;", "", "Lcom/xiaomi/hm/health/device/model/WeatherSetting;", HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "cityInfo", "", "shouldUpdateWeatherSetting", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldUpdateWeatherSetting(@NotNull WeatherSetting weatherSetting, @NotNull CityInfo cityInfo) {
            return (TextUtils.equals(weatherSetting.getLocationKey(), cityInfo.getLocationKey()) ^ true) || (TextUtils.equals(weatherSetting.getCity(), cityInfo.getName()) ^ true) || (TextUtils.equals(weatherSetting.getAffiliation(), cityInfo.getAffiliation()) ^ true);
        }
    }

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
            return "fillV1DeviceCity located city failed as city is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillV1DeviceCity not allow located city result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillV1DeviceCity modify result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fill default city return as not null";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillV2DeviceCity failed as targetDefaultCity is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillV2DeviceCity result: " + this.a + " ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "fillWeatherCities module is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.other.ZeppOSWeatherHandler$fillWeatherCities$2", f = "ZeppOSWeatherHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeatherModule c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "protocolVersion: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(WeatherModule weatherModule, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = weatherModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ZeppOSWeatherHandler.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Integer weatherProtocolVersion = ZeppOSWeatherHandler.this.getWeatherProtocolVersion();
            if (weatherProtocolVersion == null) {
                return Unit.INSTANCE;
            }
            int iIntValue = weatherProtocolVersion.intValue();
            HMLog.info(ZeppOSWeatherHandler.g, new a(iIntValue));
            com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSettingQueryWeatherSettings = this.c.queryWeatherSettings();
            if (iIntValue < 2) {
                ZeppOSWeatherHandler.this.a(this.c, weatherSettingQueryWeatherSettings);
            } else {
                ZeppOSWeatherHandler.this.b(this.c, weatherSettingQueryWeatherSettings);
            }
            ZeppOSWeatherHandler.this.isFillWeatherCities.set(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.other.ZeppOSWeatherHandler$handleAutoLocate$1", f = "ZeppOSWeatherHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeatherInfos c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WeatherInfos weatherInfos, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = weatherInfos;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ZeppOSWeatherHandler.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ZeppOSWeatherHandler.this.f(this.c);
            ZeppOSWeatherHandler.this.e(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.other.ZeppOSWeatherHandler$handleFailed$1", f = "ZeppOSWeatherHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "handleFailed: " + this.a;
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ZeppOSWeatherHandler.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function0 function0 = ZeppOSWeatherHandler.this.failedAction;
            Boolean bool = function0 == null ? null : (Boolean) function0.getA();
            HMLog.info(ZeppOSWeatherHandler.g, new a(bool));
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                ZeppOSWeatherHandler.this.failedAction = null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<CompletableJob> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleAutoLocate, city null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "handleAutoLocate, city same";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ City b;

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
                return "updateDeviceCity not connected";
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
                return "WeatherModule null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "updateWeatherSettings: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(City city) {
            super(0);
            this.b = city;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            HMBaseDevice device = ZeppOSWeatherHandler.this.c().getDevice();
            if (!(device != null && device.isConnected())) {
                HMLog.info(ZeppOSWeatherHandler.g, a.a);
                return false;
            }
            HMBaseDevice device2 = ZeppOSWeatherHandler.this.c().getDevice();
            HMMiLiProDevice hMMiLiProDevice = device2 instanceof HMMiLiProDevice ? (HMMiLiProDevice) device2 : null;
            WeatherModule weatherModule = hMMiLiProDevice != null ? (WeatherModule) hMMiLiProDevice.getChannelModule(WeatherModule.class) : null;
            if (weatherModule == null) {
                HMLog.info(ZeppOSWeatherHandler.g, b.a);
                return false;
            }
            com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSetting = new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(null, this.b, null, 5, null);
            ZeppOSWeatherHandler zeppOSWeatherHandler = ZeppOSWeatherHandler.this;
            City city = this.b;
            boolean zUpdateWeatherSettings = weatherModule.updateWeatherSettings(weatherSetting);
            if (zUpdateWeatherSettings) {
                zeppOSWeatherHandler.lastCity = city;
            }
            HMLog.info(ZeppOSWeatherHandler.g, new c(zUpdateWeatherSettings));
            return zUpdateWeatherSettings;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZeppOSWeatherHandler() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.weather.other.ZeppOSWeatherHandler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
        this.job = LazyKt__LazyJVMKt.lazy(k.a);
        this.isFillWeatherCities = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(WeatherModule module, com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSetting) {
        City currentLocatedCity;
        String locationKey;
        boolean zIsBlank = (weatherSetting == null || (currentLocatedCity = weatherSetting.getCurrentLocatedCity()) == null || (locationKey = currentLocatedCity.getLocationKey()) == null) ? false : kotlin.text.m.isBlank(locationKey);
        boolean zSupportLocation = supportLocation();
        if (!zIsBlank || zSupportLocation) {
            return;
        }
        ArrayList<City> arrayListQueryCityList = module.queryCityList();
        City city = arrayListQueryCityList == null ? null : (City) CollectionsKt.firstOrNull((List) arrayListQueryCityList);
        if (city == null) {
            HMLog.info(g, a.a);
            return;
        }
        boolean zUpdateWeatherSettings = module.updateWeatherSettings(new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(null, city, null, 5, null));
        HMLog.info(g, new b(zUpdateWeatherSettings));
        if (zUpdateWeatherSettings) {
            HMLog.info(g, new c(module.modifyCity(city, false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(WeatherModule module, com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting weatherSetting) {
        City city;
        if ((weatherSetting == null ? null : weatherSetting.getDefaultCity()) != null) {
            HMLog.info(g, d.a);
            return;
        }
        City currentLocatedCity = weatherSetting == null ? null : weatherSetting.getCurrentLocatedCity();
        if (currentLocatedCity == null) {
            ArrayList<City> arrayListQueryCityList = module.queryCityList();
            city = arrayListQueryCityList != null ? (City) CollectionsKt.firstOrNull((List) arrayListQueryCityList) : null;
        } else {
            city = currentLocatedCity;
        }
        if (city == null) {
            HMLog.info(g, e.a);
        } else {
            HMLog.info(g, new f(module.updateWeatherSettings(new com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting(null, null, city, 3, null))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceCenter c() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    private final Job d() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(WeatherInfos weatherInfo) {
        CityInfo cityInfo = weatherInfo.getCityInfo();
        if (cityInfo == null || TextUtils.isEmpty(cityInfo.getName()) || HMPersonInfo.getInstance().getUserInfo() == null) {
            return;
        }
        WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
        if (weatherSettingFromJsonString.getAutoLocate() && INSTANCE.shouldUpdateWeatherSetting(weatherSettingFromJsonString, cityInfo)) {
            weatherSettingFromJsonString.setCity(cityInfo.getName());
            weatherSettingFromJsonString.setAffiliation(cityInfo.getAffiliation());
            weatherSettingFromJsonString.setLocationKey(cityInfo.getLocationKey());
            HMPersonInfo.getInstance().getMiliConfig().setWeatherSetting(weatherSettingFromJsonString.toJsonString());
            HMPersonInfo.getInstance().saveInfo(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void f(WeatherInfos weatherInfo) {
        City bleModel = ZeppOSWeatherHandlerKt.toBleModel(weatherInfo.getCityInfo());
        if (bleModel == null) {
            HMLog.info(g, l.a);
            return;
        }
        if (Intrinsics.areEqual(bleModel, this.lastCity)) {
            HMLog.info(g, m.a);
            return;
        }
        n nVar = new n(bleModel);
        if (nVar.getA().booleanValue()) {
            nVar = null;
        }
        this.failedAction = nVar;
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public void clearCache() {
        this.lastCity = null;
        this.failedAction = null;
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public void fillWeatherCities(@Nullable WeatherModule module) {
        if (module == null) {
            HMLog.info(g, g.a);
        } else if (this.isFillWeatherCities.compareAndSet(false, true)) {
            kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new h(module, null), 2, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return d().plus(Dispatchers.getIO());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    @Nullable
    public Integer getWeatherProtocolVersion() {
        return this.weatherProtocolVersion;
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public void handleAutoLocate(@NotNull WeatherInfos weatherInfo) {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new i(weatherInfo, null), 2, null);
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public synchronized void handleFailed() {
        kotlinx.coroutines.e.f(this, null, null, new j(null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public void setWeatherProtocolVersion(@Nullable Integer num) {
        this.weatherProtocolVersion = num;
    }

    @Override // com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler
    public boolean supportLocation() {
        return !WeatherUtils.isKoreaUser();
    }
}
