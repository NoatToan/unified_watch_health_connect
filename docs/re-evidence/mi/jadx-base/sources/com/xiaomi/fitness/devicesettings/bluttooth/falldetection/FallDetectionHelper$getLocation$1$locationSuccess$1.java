package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
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
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$getLocation$1$locationSuccess$1", f = "FallDetectionHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FallDetectionHelper$getLocation$1$locationSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Double, Double, String, Unit> $position;
    final /* synthetic */ double[] $realPosition;
    int label;
    final /* synthetic */ FallDetectionHelper.C20681 this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$getLocation$1$locationSuccess$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionHelper$getLocation$1$locationSuccess$1$2", f = "FallDetectionHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Address> $address;
        final /* synthetic */ Function3<Double, Double, String, Unit> $position;
        final /* synthetic */ double[] $realPosition;
        int label;
        final /* synthetic */ FallDetectionHelper.C20681 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Address> list, Function3<? super Double, ? super Double, ? super String, Unit> function3, double[] dArr, FallDetectionHelper.C20681 c20681, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$address = list;
            this.$position = function3;
            this.$realPosition = dArr;
            this.this$0 = c20681;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$address, this.$position, this.$realPosition, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Address> list = this.$address;
            if (list == null || !(!list.isEmpty())) {
                this.this$0.locationFail("address is empty");
            } else {
                if (AppUtil.INSTANCE.isDevChannel()) {
                    Logger.i("FallDetectionHelper", "get address: " + this.$address.get(0));
                }
                String addressLine = this.$address.get(0).getAddressLine(0);
                Logger.i("FallDetectionHelper", "get legal position, request tts and send message");
                Function3<Double, Double, String, Unit> function3 = this.$position;
                Double dBoxDouble = Boxing.boxDouble(this.$realPosition[0]);
                Double dBoxDouble2 = Boxing.boxDouble(this.$realPosition[1]);
                Intrinsics.checkNotNull(addressLine);
                function3.invoke(dBoxDouble, dBoxDouble2, addressLine);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FallDetectionHelper$getLocation$1$locationSuccess$1(double[] dArr, FallDetectionHelper.C20681 c20681, Function3<? super Double, ? super Double, ? super String, Unit> function3, Continuation<? super FallDetectionHelper$getLocation$1$locationSuccess$1> continuation) {
        super(2, continuation);
        this.$realPosition = dArr;
        this.this$0 = c20681;
        this.$position = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(Function3 function3, double[] dArr, FallDetectionHelper.C20681 c20681, List list) {
        AnyExtKt.main$default(null, new FallDetectionHelper$getLocation$1$locationSuccess$1$1$1(list, function3, dArr, c20681, null), 1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FallDetectionHelper$getLocation$1$locationSuccess$1(this.$realPosition, this.this$0, this.$position, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (Build.VERSION.SDK_INT >= 33) {
            Geocoder geocoder = new Geocoder(ApplicationExtKt.getApplication());
            final double[] dArr = this.$realPosition;
            double d = dArr[0];
            double d2 = dArr[1];
            final Function3<Double, Double, String, Unit> function3 = this.$position;
            final FallDetectionHelper.C20681 c20681 = this.this$0;
            geocoder.getFromLocation(d, d2, 1, new Geocoder.GeocodeListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.h
                @Override // android.location.Geocoder.GeocodeListener
                public final void onGeocode(List list) {
                    FallDetectionHelper$getLocation$1$locationSuccess$1.invokeSuspend$lambda$0(function3, dArr, c20681, list);
                }
            });
        } else {
            try {
                Geocoder geocoder2 = new Geocoder(ApplicationExtKt.getApplication());
                double[] dArr2 = this.$realPosition;
                AnyExtKt.main$default(null, new AnonymousClass2(geocoder2.getFromLocation(dArr2[0], dArr2[1], 1), this.$position, this.$realPosition, this.this$0, null), 1, null);
            } catch (Exception e) {
                e.printStackTrace();
                this.this$0.locationFail("getFromLocation catch exception: " + e);
                Unit unit = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FallDetectionHelper$getLocation$1$locationSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
