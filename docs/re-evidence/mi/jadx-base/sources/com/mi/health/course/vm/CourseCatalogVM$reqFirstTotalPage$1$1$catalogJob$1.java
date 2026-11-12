package com.mi.health.course.vm;

import com.mi.health.course.api.CourseRequestV3;
import com.mi.health.course.data.CourseCatalogResp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/mi/health/course/data/CourseCatalogResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.course.vm.CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1", f = "CourseCatalogVM.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CourseCatalogResp>, Object> {
    int label;
    final /* synthetic */ CourseCatalogVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1(CourseCatalogVM courseCatalogVM, Continuation<? super CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1> continuation) {
        super(2, continuation);
        this.this$0 = courseCatalogVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CourseRequestV3 request = this.this$0.getRequest();
            this.label = 1;
            obj = request.getCourseCatalog(this);
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CourseCatalogResp> continuation) {
        return ((CourseCatalogVM$reqFirstTotalPage$1$1$catalogJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
