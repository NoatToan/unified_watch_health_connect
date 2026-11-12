package com.xiaomi.hm.health.device.weather.viewmodel;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.device.weather.model.WeatherVo;
import com.xiaomi.hm.health.device.weather.other.WeatherItemType;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.weather.viewmodel.WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1", f = "WeatherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ WeatherViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1(Continuation continuation, WeatherViewModel weatherViewModel) {
        super(2, continuation);
        this.c = weatherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1 weatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1 = new WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1(continuation, this.c);
        weatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1.b = obj;
        return weatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WeatherViewModel$loadCityFromDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String string;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.c.weatherModule == null) {
            ArrayList arrayList = new ArrayList();
            City city = this.c.currCity;
            String name = city == null ? null : city.getName();
            string = Boxing.boxBoolean((name == null || m.isBlank(name)) ^ true).booleanValue() ? name : null;
            if (string == null) {
                string = DeviceXFunctionsKt.getString(R.string.locating);
            }
            arrayList.add(new WeatherVo(WeatherItemType.CITY_TITLE, "", ""));
            if (!WeatherUtils.isKoreaUser()) {
                arrayList.add(new WeatherVo(WeatherItemType.CURRENT_CITY, string, ""));
            }
            arrayList.add(new WeatherVo(WeatherItemType.ADD_CITY, "", ""));
            this.c.getCityListLiveData().postValue(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new WeatherVo(WeatherItemType.CITY_TITLE, "", ""));
            if (!WeatherUtils.isKoreaUser()) {
                City city2 = this.c.currCity;
                String name2 = city2 == null ? null : city2.getName();
                string = Boxing.boxBoolean((name2 == null || m.isBlank(name2)) ^ true).booleanValue() ? name2 : null;
                if (string == null) {
                    string = DeviceXFunctionsKt.getString(R.string.locating);
                }
                arrayList2.add(new WeatherVo(WeatherItemType.CURRENT_CITY, string, ""));
            }
            ArrayList<City> arrayListQueryCityList = this.c.weatherModule.queryCityList();
            if (arrayListQueryCityList != null) {
                for (City city3 : arrayListQueryCityList) {
                    arrayList2.add(new WeatherVo(WeatherItemType.CITY_LIST, city3.getName(), city3.getLocationKey()));
                }
            }
            arrayList2.add(new WeatherVo(WeatherItemType.ADD_CITY, "", ""));
            this.c.getCityListLiveData().postValue(arrayList2);
        }
        return Unit.INSTANCE;
    }
}
