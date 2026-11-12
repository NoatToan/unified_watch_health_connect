package com.xiaomi.fitness.sport_eco.model;

import com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.LaunchSportModel$reqCourseRecommend$1$tag$1", f = "LaunchSportModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LaunchSportModel$reqCourseRecommend$1$tag$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ LaunchSportModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchSportModel$reqCourseRecommend$1$tag$1(LaunchSportModel launchSportModel, Continuation<? super LaunchSportModel$reqCourseRecommend$1$tag$1> continuation) {
        super(2, continuation);
        this.this$0 = launchSportModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchSportModel$reqCourseRecommend$1$tag$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CommonSportModelUtil.INSTANCE.getCourse30Tag(this.this$0.getSportType());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((LaunchSportModel$reqCourseRecommend$1$tag$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
