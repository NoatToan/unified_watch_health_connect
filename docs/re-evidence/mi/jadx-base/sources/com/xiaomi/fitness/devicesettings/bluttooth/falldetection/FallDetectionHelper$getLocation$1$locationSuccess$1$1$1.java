package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.location.Address;
import com.xiaomi.fitness.common.log.Logger;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$getLocation$1$locationSuccess$1$1$1", f = "FallDetectionHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FallDetectionHelper$getLocation$1$locationSuccess$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Address> $addresses;
    final /* synthetic */ Function3<Double, Double, String, Unit> $position;
    final /* synthetic */ double[] $realPosition;
    int label;
    final /* synthetic */ FallDetectionHelper.C20681 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FallDetectionHelper$getLocation$1$locationSuccess$1$1$1(List<Address> list, Function3<? super Double, ? super Double, ? super String, Unit> function3, double[] dArr, FallDetectionHelper.C20681 c20681, Continuation<? super FallDetectionHelper$getLocation$1$locationSuccess$1$1$1> continuation) {
        super(2, continuation);
        this.$addresses = list;
        this.$position = function3;
        this.$realPosition = dArr;
        this.this$0 = c20681;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallDetectionHelper$getLocation$1$locationSuccess$1$1$1(this.$addresses, this.$position, this.$realPosition, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Address> list = this.$addresses;
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            Logger.d("FallDetectionHelper", "get address: " + this.$addresses.get(0));
            String addressLine = this.$addresses.get(0).getAddressLine(0);
            Logger.i("FallDetectionHelper", "get legal position wait, request tts and send message");
            Function3<Double, Double, String, Unit> function3 = this.$position;
            Double dBoxDouble = Boxing.boxDouble(this.$realPosition[0]);
            Double dBoxDouble2 = Boxing.boxDouble(this.$realPosition[1]);
            Intrinsics.checkNotNull(addressLine);
            function3.invoke(dBoxDouble, dBoxDouble2, addressLine);
        } else {
            this.this$0.locationFail("address is empty");
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FallDetectionHelper$getLocation$1$locationSuccess$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
