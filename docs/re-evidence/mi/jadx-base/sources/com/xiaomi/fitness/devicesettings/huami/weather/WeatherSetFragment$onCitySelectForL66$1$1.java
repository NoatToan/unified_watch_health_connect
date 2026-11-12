package com.xiaomi.fitness.devicesettings.huami.weather;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import defpackage.wzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$onCitySelectForL66$1$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$onCitySelectForL66$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ City $it;
    final /* synthetic */ LocationKey $selectLocationKey;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$onCitySelectForL66$1$1(WeatherSetFragment weatherSetFragment, City city, LocationKey locationKey, Continuation<? super WeatherSetFragment$onCitySelectForL66$1$1> continuation) {
        super(2, continuation);
        this.this$0 = weatherSetFragment;
        this.$it = city;
        this.$selectLocationKey = locationKey;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$onCitySelectForL66$1$1(this.this$0, this.$it, this.$selectLocationKey, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getMActivity() == null) {
            return Unit.INSTANCE;
        }
        if (this.$it != null) {
            CityListTagAdapter cityListTagAdapter = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter);
            List<LocationKey> mCityList = cityListTagAdapter.getMCityList();
            LocationKey locationKey = this.$selectLocationKey;
            if (locationKey.isUserAutoLocation) {
                mCityList.add(0, locationKey);
            } else {
                Boxing.boxBoolean(mCityList.add(locationKey));
            }
            CityListTagAdapter cityListTagAdapter2 = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter2);
            cityListTagAdapter2.updateCityKeyList(mCityList);
        } else {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.B1);
            }
        }
        this.this$0.hideLoading();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$onCitySelectForL66$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
