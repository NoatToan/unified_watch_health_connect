package com.xiaomi.fitness.devicesettings.huami.weather;

import com.xiaomi.fitness.settingitem.settingitem.WeatherSetting;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$onViewCreated$3$1$1$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$onViewCreated$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ boolean $updateSuc;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$onViewCreated$3$1$1$1(boolean z, WeatherSetFragment weatherSetFragment, boolean z2, Continuation<? super WeatherSetFragment$onViewCreated$3$1$1$1> continuation) {
        super(2, continuation);
        this.$updateSuc = z;
        this.this$0 = weatherSetFragment;
        this.$isChecked = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(boolean z, WeatherSetFragment weatherSetFragment, WeatherSetting weatherSetting) {
        weatherSetting.setAlerts(z);
        WeatherSetFragment.access$getMViewModel(weatherSetFragment).saveWeatherSetting(weatherSetting);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$onViewCreated$3$1$1$1(this.$updateSuc, this.this$0, this.$isChecked, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$updateSuc) {
            WeatherSetViewModel weatherSetViewModelAccess$getMViewModel = WeatherSetFragment.access$getMViewModel(this.this$0);
            final boolean z = this.$isChecked;
            final WeatherSetFragment weatherSetFragment = this.this$0;
            weatherSetViewModelAccess$getMViewModel.getHuamiWeatherSetting(new Function1() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return WeatherSetFragment$onViewCreated$3$1$1$1.invokeSuspend$lambda$0(z, weatherSetFragment, (WeatherSetting) obj2);
                }
            });
            WeatherSetFragment.access$getMBinding(this.this$0).A.setSwitch(this.$isChecked);
        } else {
            WeatherSetFragment.access$getMBinding(this.this$0).A.setSwitch(!this.$isChecked);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$onViewCreated$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
