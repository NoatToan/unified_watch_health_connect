package com.xiaomi.hm.health.device.weather.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.locweather.WeatherAPINewKt;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J!\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/viewmodel/SearchCityViewModel;", "Landroidx/lifecycle/ViewModel;", "", "loadHotCity", "", "cityName", "", "hot", "searchCity", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "cityInfo", "cityNull", "setCity", "(Lcom/xiaomi/hm/health/locweather/model/CityInfo;Ljava/lang/Boolean;)V", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getHotCityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "hotCityLiveData", "b", "getCityResultLiveData", "cityResultLiveData", "c", "getSetCityLiveData", "setCityLiveData", GoogleApiAvailabilityLight.a, "getHotCitySearchLiveData", "hotCitySearchLiveData", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "e", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "getModule", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "module", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SearchCityViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<String>> hotCityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<CityInfo>> cityResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> setCityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CityInfo> hotCitySearchLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final WeatherModule module;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.weather.viewmodel.SearchCityViewModel$searchCity$1", f = "SearchCityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ SearchCityViewModel c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, SearchCityViewModel searchCityViewModel, boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = searchCityViewModel;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.b;
            if (str == null || m.isBlank(str)) {
                this.c.getCityResultLiveData().postValue(null);
                return Unit.INSTANCE;
            }
            List<CityInfo> listSearchCities = WeatherAPINewKt.searchCities(this.b, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI).getValue());
            if (this.d) {
                this.c.getHotCitySearchLiveData().postValue(listSearchCities != null ? (CityInfo) CollectionsKt.getOrNull(listSearchCities, 0) : null);
                return Unit.INSTANCE;
            }
            this.c.getCityResultLiveData().postValue(listSearchCities);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.weather.viewmodel.SearchCityViewModel$setCity$1", f = "SearchCityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ CityInfo b;
        public final /* synthetic */ SearchCityViewModel c;
        public final /* synthetic */ Boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CityInfo cityInfo, SearchCityViewModel searchCityViewModel, Boolean bool, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = cityInfo;
            this.c = searchCityViewModel;
            this.d = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            Boolean boolBoxBoolean2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = false;
            if (this.b == null) {
                this.c.getSetCityLiveData().postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(this.d, Boxing.boxBoolean(true)) && WeatherUtils.isKoreaUser()) {
                WeatherModule module = this.c.getModule();
                if (module != null && (boolBoxBoolean2 = Boxing.boxBoolean(module.updateWeatherSettings(new WeatherSetting(null, new City(this.b.getLocationKey(), this.b.getName()), null, 5, null)))) != null) {
                    zBooleanValue = boolBoxBoolean2.booleanValue();
                }
            } else {
                City city = new City(this.b.getLocationKey(), this.b.getName());
                WeatherModule module2 = this.c.getModule();
                if (module2 != null && (boolBoxBoolean = Boxing.boxBoolean(module2.modifyCity(city, true))) != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
            }
            this.c.getSetCityLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    public SearchCityViewModel() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        this.module = hMMiLiProDevice != null ? (WeatherModule) hMMiLiProDevice.getChannelModule(WeatherModule.class) : null;
    }

    public static /* synthetic */ void searchCity$default(SearchCityViewModel searchCityViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        searchCityViewModel.searchCity(str, z);
    }

    @NotNull
    public final MutableLiveData<List<CityInfo>> getCityResultLiveData() {
        return this.cityResultLiveData;
    }

    @NotNull
    public final MutableLiveData<List<String>> getHotCityLiveData() {
        return this.hotCityLiveData;
    }

    @NotNull
    public final MutableLiveData<CityInfo> getHotCitySearchLiveData() {
        return this.hotCitySearchLiveData;
    }

    @Nullable
    public final WeatherModule getModule() {
        return this.module;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetCityLiveData() {
        return this.setCityLiveData;
    }

    public final void loadHotCity() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_beijing));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_shenzhen));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_guangzhou));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_shanghai));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_hefei));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_nanjing));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_suzhou));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_hangzhou));
        arrayList.add(IntroduceShuffleFactoryKt.getString(R.string.hot_city_chengdu));
        this.hotCityLiveData.postValue(arrayList);
    }

    public final void searchCity(@Nullable String cityName, boolean hot) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(cityName, this, hot, null), 2, null);
    }

    public final void setCity(@Nullable CityInfo cityInfo, @Nullable Boolean cityNull) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(cityInfo, this, cityNull, null), 2, null);
    }
}
