package com.xiaomi.fitness.devicesettings.huami.weather;

import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$updateBleSyncState$1$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$updateBleSyncState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocationKey $locationKey;
    final /* synthetic */ List<LocationKey> $updateCityList;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$updateBleSyncState$1$1(WeatherSetFragment weatherSetFragment, List<LocationKey> list, LocationKey locationKey, Continuation<? super WeatherSetFragment$updateBleSyncState$1$1> continuation) {
        super(2, continuation);
        this.this$0 = weatherSetFragment;
        this.$updateCityList = list;
        this.$locationKey = locationKey;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$updateBleSyncState$1$1(this.this$0, this.$updateCityList, this.$locationKey, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (WeatherSetFragment.access$getMViewModel(this.this$0).getIsSupportMoreCity()) {
            RightArrowTwoLineTextView cityView = WeatherSetFragment.access$getMBinding(this.this$0).C;
            Intrinsics.checkNotNullExpressionValue(cityView, "cityView");
            ViewExtKt.visible(cityView);
            RecyclerView cityListView = WeatherSetFragment.access$getMBinding(this.this$0).B;
            Intrinsics.checkNotNullExpressionValue(cityListView, "cityListView");
            ViewExtKt.visible(cityListView);
            CityListTagAdapter cityListTagAdapter = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter);
            cityListTagAdapter.updateCityKeyList(this.$updateCityList);
        } else {
            LocationKey locationKey = this.$locationKey;
            if (locationKey != null && locationKey.isUserAutoLocation) {
                SyncPreference syncPreference = SyncPreference.INSTANCE;
                String json = new Gson().toJson(this.$locationKey);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                syncPreference.setWeatherLocation(json);
            }
            RightArrowTwoLineTextView cityView2 = WeatherSetFragment.access$getMBinding(this.this$0).C;
            Intrinsics.checkNotNullExpressionValue(cityView2, "cityView");
            ViewExtKt.gone(cityView2);
            RecyclerView cityListView2 = WeatherSetFragment.access$getMBinding(this.this$0).B;
            Intrinsics.checkNotNullExpressionValue(cityListView2, "cityListView");
            ViewExtKt.gone(cityListView2);
            WeatherSetFragment.access$getMViewModel(this.this$0).syncWeather();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$updateBleSyncState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
