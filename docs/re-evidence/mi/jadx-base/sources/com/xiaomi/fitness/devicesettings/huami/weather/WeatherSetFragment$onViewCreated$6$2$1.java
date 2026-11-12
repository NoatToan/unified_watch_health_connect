package com.xiaomi.fitness.devicesettings.huami.weather;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$onViewCreated$6$2$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$onViewCreated$6$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$onViewCreated$6$2$1(boolean z, WeatherSetFragment weatherSetFragment, int i, Continuation<? super WeatherSetFragment$onViewCreated$6$2$1> continuation) {
        super(2, continuation);
        this.$it = z;
        this.this$0 = weatherSetFragment;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$onViewCreated$6$2$1(this.$it, this.this$0, this.$position, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$it) {
            CityListTagAdapter cityListTagAdapter = this.this$0.mCityListTagAdapter;
            Intrinsics.checkNotNull(cityListTagAdapter);
            List<LocationKey> mCityList = cityListTagAdapter.getMCityList();
            if (this.$position < mCityList.size()) {
                mCityList.remove(this.$position);
                CityListTagAdapter cityListTagAdapter2 = this.this$0.mCityListTagAdapter;
                Intrinsics.checkNotNull(cityListTagAdapter2);
                cityListTagAdapter2.updateCityKeyList(mCityList);
            }
        } else {
            FragmentActivity mActivity = this.this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_delete_failure);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$onViewCreated$6$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
