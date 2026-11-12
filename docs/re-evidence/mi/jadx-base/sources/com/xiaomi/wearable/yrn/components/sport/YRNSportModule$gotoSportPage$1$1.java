package com.xiaomi.wearable.yrn.components.sport;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$gotoSportPage$1$1", f = "YRNSportModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class YRNSportModule$gotoSportPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $currentActivity;
    final /* synthetic */ int $sportType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNSportModule$gotoSportPage$1$1(Activity activity, int i, Continuation<? super YRNSportModule$gotoSportPage$1$1> continuation) {
        super(2, continuation);
        this.$currentActivity = activity;
        this.$sportType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new YRNSportModule$gotoSportPage$1$1(this.$currentActivity, this.$sportType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).clickSportBanner((FragmentActivity) this.$currentActivity, this.$sportType);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((YRNSportModule$gotoSportPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
