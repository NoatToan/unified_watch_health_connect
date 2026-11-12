package com.xiaomi.fitness.devicesettings.huami.weather;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import defpackage.be1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel$startLocation$1$locationSuccess$1", f = "WeatherSelectCityViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSelectCityViewModel$startLocation$1$locationSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $data;
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    int label;
    final /* synthetic */ WeatherSelectCityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSelectCityViewModel$startLocation$1$locationSuccess$1(double d, double d2, String str, WeatherSelectCityViewModel weatherSelectCityViewModel, Continuation<? super WeatherSelectCityViewModel$startLocation$1$locationSuccess$1> continuation) {
        super(2, continuation);
        this.$latitude = d;
        this.$longitude = d2;
        this.$data = str;
        this.this$0 = weatherSelectCityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSelectCityViewModel$startLocation$1$locationSuccess$1(this.$latitude, this.$longitude, this.$data, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WeatherSyncManager syncExtKt = SyncExtKt.getInstance(WeatherSyncManager.INSTANCE);
            final double d = this.$latitude;
            final double d2 = this.$longitude;
            final String str = this.$data;
            final WeatherSelectCityViewModel weatherSelectCityViewModel = this.this$0;
            be1<WeatherResp.Weather> be1Var = new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel$startLocation$1$locationSuccess$1.1
                @Override // defpackage.be1
                public void onFailure() {
                    Logger.i(WeatherSelectCityViewModel.TAG, "requestLocationon fail  =" + str);
                    weatherSelectCityViewModel.getLocationInfo().postValue(null);
                }

                @Override // defpackage.be1
                public void onResponse(WeatherResp.Weather response) {
                    Logger.i(WeatherSelectCityViewModel.TAG, "requestLocationon suc  =" + str);
                    if (response == null) {
                        weatherSelectCityViewModel.getLocationInfo().postValue(null);
                        return;
                    }
                    LocationKey locationKey = new LocationKey();
                    locationKey.latitude = d;
                    locationKey.longitude = d2;
                    locationKey.locationName = response.location_name;
                    locationKey.affiliation = response.affiliation;
                    locationKey.locationKey = response.locationKey;
                    locationKey.isUserAutoLocation = true;
                    weatherSelectCityViewModel.getLocationInfo().postValue(locationKey);
                }
            };
            this.label = 1;
            if (syncExtKt.performWeatherRequest(null, d, d2, be1Var, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSelectCityViewModel$startLocation$1$locationSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
