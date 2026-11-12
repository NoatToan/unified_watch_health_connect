package com.xiaomi.fitness.sport.view.route;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport.route.detail.model.RouteSceneType;
import com.xiaomi.fitness.sport.viewmodel.CreateRouteViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectTargetFragment$initButtonState$2$1", f = "CreateRouteSelectTargetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CreateRouteSelectTargetFragment$initButtonState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreateRouteSelectTargetFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.route.CreateRouteSelectTargetFragment$initButtonState$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sport/viewmodel/CreateRouteViewModel$StatusCodes;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.route.CreateRouteSelectTargetFragment$initButtonState$2$1$1", f = "CreateRouteSelectTargetFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super CreateRouteViewModel.StatusCodes>, Object> {
        int label;
        final /* synthetic */ CreateRouteSelectTargetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CreateRouteSelectTargetFragment createRouteSelectTargetFragment, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = createRouteSelectTargetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessLogUtils.i(CreateRouteSelectTargetFragment.TAG, "OnClick  requestUserRouteStyleList");
                CreateRouteViewModel createRouteViewModel = this.this$0.createRouteViewModel;
                if (createRouteViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("createRouteViewModel");
                    createRouteViewModel = null;
                }
                RouteSceneType routeSceneType = RouteSceneType.RouteSceneTypeAi;
                this.label = 1;
                obj = createRouteViewModel.requestUserRouteStyleList(routeSceneType, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super CreateRouteViewModel.StatusCodes> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRouteSelectTargetFragment$initButtonState$2$1(CreateRouteSelectTargetFragment createRouteSelectTargetFragment, Continuation<? super CreateRouteSelectTargetFragment$initButtonState$2$1> continuation) {
        super(2, continuation);
        this.this$0 = createRouteSelectTargetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateRouteSelectTargetFragment$initButtonState$2$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CreateRouteActivity createRouteActivity = this.this$0.createRouteActivity;
        if (createRouteActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createRouteActivity");
            createRouteActivity = null;
        }
        createRouteActivity.replaceWithWait(null, null, new AnonymousClass1(this.this$0, null));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateRouteSelectTargetFragment$initButtonState$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
