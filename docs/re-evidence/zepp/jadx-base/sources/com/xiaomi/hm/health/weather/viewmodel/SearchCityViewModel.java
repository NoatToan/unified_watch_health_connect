package com.xiaomi.hm.health.weather.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.locweather.WeatherAPINewKt;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007R%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR!\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/weather/viewmodel/SearchCityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "loadHotCity", "", "cityName", "", "hot", "searchCity", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getHotCityLiveData", "()Landroidx/lifecycle/MutableLiveData;", "hotCityLiveData", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "b", "getCityResultLiveData", "cityResultLiveData", "c", "getHotCitySearchLiveData", "hotCitySearchLiveData", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManager", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SearchCityViewModel extends ViewModel implements KoinComponentAdapter {

    @NotNull
    private static final String e = "SearchCityViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<String>> hotCityLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<CityInfo>> cityResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CityInfo> hotCitySearchLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.viewmodel.SearchCityViewModel$searchCity$1", f = "SearchCityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ SearchCityViewModel c;
        public final /* synthetic */ boolean d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.weather.viewmodel.SearchCityViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1041a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<CityInfo> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1041a(List<? extends CityInfo> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "cityList: " + this.a;
            }
        }

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
            List<CityInfo> listSearchCities = WeatherAPINewKt.searchCities(this.b, this.c.a().getBoundDeviceSource(HMDeviceType.MILI).getValue());
            HMLog.info(SearchCityViewModel.e, new C1041a(listSearchCities));
            if (this.d) {
                this.c.getHotCitySearchLiveData().postValue(listSearchCities != null ? (CityInfo) CollectionsKt.getOrNull(listSearchCities, 0) : null);
                return Unit.INSTANCE;
            }
            this.c.getCityResultLiveData().postValue(listSearchCities);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCityViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.weather.viewmodel.SearchCityViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManager.getValue();
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

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
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
}
