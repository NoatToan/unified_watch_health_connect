package com.xiaomi.fitness.devicesettings.huami.weather;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import defpackage.wzi;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $code;
    final /* synthetic */ boolean $isSuc;
    final /* synthetic */ LocationKey $selectLocationKey;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1(WeatherSetFragment weatherSetFragment, boolean z, LocationKey locationKey, Integer num, Continuation<? super WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1> continuation) {
        super(2, continuation);
        this.this$0 = weatherSetFragment;
        this.$isSuc = z;
        this.$selectLocationKey = locationKey;
        this.$code = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1(this.this$0, this.$isSuc, this.$selectLocationKey, this.$code, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.getMActivity() == null) {
            return Unit.INSTANCE;
        }
        this.this$0.hideLoading();
        if (this.$isSuc) {
            CityListTagAdapter cityListTagAdapter = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter);
            List<LocationKey> mCityList = cityListTagAdapter.getMCityList();
            mCityList.add(this.$selectLocationKey);
            CityListTagAdapter cityListTagAdapter2 = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter2);
            cityListTagAdapter2.updateCityKeyList(mCityList);
            WeatherSetFragment.access$getMViewModel(this.this$0).blePostWeatherToDevice(this.$selectLocationKey);
        } else {
            WearableDeviceModel mDeviceModel = WeatherSetFragment.access$getMViewModel(this.this$0).getMDeviceModel();
            if (mDeviceModel == null || !DeviceModelExtKt.isWearOS(mDeviceModel) || (num = this.$code) == null || num.intValue() != 255) {
                FragmentActivity mActivity = this.this$0.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, wzi.B1);
                }
            } else {
                FragmentActivity mActivity2 = this.this$0.getMActivity();
                if (mActivity2 != null) {
                    ToastExtKt.toastShort(mActivity2, wzi.B9);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$onCitySelectForBLESupportMoreCity$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
