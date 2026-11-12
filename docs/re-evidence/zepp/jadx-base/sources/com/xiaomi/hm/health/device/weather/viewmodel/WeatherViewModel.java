package com.xiaomi.hm.health.device.weather.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.weather.model.WeatherSettingVo;
import com.xiaomi.hm.health.device.weather.model.WeatherVo;
import com.xiaomi.hm.health.device.weather.other.LiveDataExtKt;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R5\u0010!\u001a\u001e\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001c0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R+\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u001c0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "updateCity", "loadCityFromDevice", "loadWeatherSettingFromDevice", "", "alert", "setAlert", "", "tempUnit", "setTempUnit", "Lcom/xiaomi/hm/health/device/weather/model/WeatherVo;", "weatherVo", "deleteCity", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getCityListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "cityListLiveData", "Lcom/xiaomi/hm/health/device/weather/model/WeatherSettingVo;", "b", "weatherSettingLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "c", "Landroidx/lifecycle/LiveData;", "getCombineLiveData", "()Landroidx/lifecycle/LiveData;", "combineLiveData", GoogleApiAvailabilityLight.a, "getUpdateCityLiveData", "updateCityLiveData", "e", "getDeleteCityLiveData", "deleteCityLiveData", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "f", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "weatherModule", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "g", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "h", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "currCity", "<init>", "()V", "i", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherViewModel extends ViewModel {

    @NotNull
    private static final a i = new a(null);

    @Deprecated
    @NotNull
    private static final String j = "WeatherViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<WeatherVo>> cityListLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WeatherSettingVo> weatherSettingLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<List<WeatherVo>, WeatherSettingVo>> combineLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<City> updateCityLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<Boolean, WeatherVo>> deleteCityLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final WeatherModule weatherModule;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final SettingsModule settingsModule;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private City currCity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/weather/viewmodel/WeatherViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tempUnit: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.weather.viewmodel.WeatherViewModel$updateCity$1", f = "WeatherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ City b;
        public final /* synthetic */ WeatherViewModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "city same";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(City city, WeatherViewModel weatherViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = city;
            this.c = weatherViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.b, this.c.currCity)) {
                HMLog.info(WeatherViewModel.j, a.a);
                return Unit.INSTANCE;
            }
            WeatherModule weatherModule = this.c.weatherModule;
            boolean zBooleanValue = false;
            if (weatherModule != null && (boolBoxBoolean = Boxing.boxBoolean(weatherModule.updateWeatherSettings(new WeatherSetting(null, this.b, null, 5, null)))) != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
            if (zBooleanValue) {
                this.c.currCity = this.b;
                this.c.getUpdateCityLiveData().postValue(this.b);
            }
            return Unit.INSTANCE;
        }
    }

    public WeatherViewModel() {
        MutableLiveData<List<WeatherVo>> mutableLiveData = new MutableLiveData<>();
        this.cityListLiveData = mutableLiveData;
        MutableLiveData<WeatherSettingVo> mutableLiveData2 = new MutableLiveData<>();
        this.weatherSettingLiveData = mutableLiveData2;
        this.combineLiveData = LiveDataExtKt.combineLatest(mutableLiveData, mutableLiveData2);
        this.updateCityLiveData = new MutableLiveData<>();
        this.deleteCityLiveData = new MutableLiveData<>();
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        this.weatherModule = device == null ? null : (WeatherModule) device.getChannelModule(WeatherModule.class);
        HMBaseDevice device2 = HMDeviceManager.getInstance().getDevice(hMDeviceType);
        this.settingsModule = device2 != null ? (SettingsModule) device2.getChannelModule(SettingsModule.class) : null;
    }

    public final void deleteCity(@NotNull WeatherVo weatherVo) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$deleteCity$$inlined$safeLaunch$1(null, this, weatherVo), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<WeatherVo>> getCityListLiveData() {
        return this.cityListLiveData;
    }

    @NotNull
    public final LiveData<Pair<List<WeatherVo>, WeatherSettingVo>> getCombineLiveData() {
        return this.combineLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, WeatherVo>> getDeleteCityLiveData() {
        return this.deleteCityLiveData;
    }

    @NotNull
    public final MutableLiveData<City> getUpdateCityLiveData() {
        return this.updateCityLiveData;
    }

    public final void loadCityFromDevice() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void loadWeatherSettingFromDevice() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void setAlert(boolean alert) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$setAlert$$inlined$safeLaunch$1(null, this, alert), 2, null);
    }

    public final void setTempUnit(int tempUnit) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$setTempUnit$$inlined$safeLaunch$1(null, this, tempUnit), 2, null);
    }

    public final void updateCity(@Nullable City city) {
        if (city == null) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), null, null, new c(city, this, null), 3, null);
    }
}
