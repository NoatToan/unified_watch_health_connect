package com.mi.health.course.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mi.health.course.api.CourseVipActivityRequest;
import com.mi.health.course.export.data.CourseExchangeBenefits;
import com.mi.health.course.export.data.CourseNewEquipmentBenefit;
import com.mi.health.course.export.data.CourseNewEquipmentBenefits;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J:\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mi/health/course/api/CourseVipActivityRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/course/api/CourseVipActivityService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "TAG", "", "getNewEquipmentBenefits", "", "success", "Lkotlin/Function1;", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "error", "Lkotlin/Function0;", "exchangeCourseBenefits", "code", "Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "Lcom/xiaomi/fitness/net/response/ApiException;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseVipActivityRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVipActivityRequest.kt\ncom/mi/health/course/api/CourseVipActivityRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,60:1\n89#2,5:61\n89#2,5:66\n*S KotlinDebug\n*F\n+ 1 CourseVipActivityRequest.kt\ncom/mi/health/course/api/CourseVipActivityRequest\n*L\n24#1:61,5\n46#1:66,5\n*E\n"})
public final class CourseVipActivityRequest extends BaseRequest<CourseVipActivityService> {

    @NotNull
    private final String TAG = "CourseVipActivityRequest";
    public Gson gson;

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseVipActivityRequest$exchangeCourseBenefits$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseExchangeBenefits;", "it", "Lcom/mi/health/course/api/CourseVipActivityService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseVipActivityRequest$exchangeCourseBenefits$3", f = "CourseVipActivityRequest.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CourseVipActivityService, Continuation<? super BaseResult<CourseExchangeBenefits>>, Object> {
        final /* synthetic */ String $code;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$code, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CourseVipActivityService courseVipActivityService, Continuation<? super BaseResult<CourseExchangeBenefits>> continuation) {
            return ((AnonymousClass3) create(courseVipActivityService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseVipActivityService courseVipActivityService = (CourseVipActivityService) this.L$0;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("code", this.$code);
                String string = jsonObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = courseVipActivityService.exchangeBenefits(string, this);
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
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseVipActivityRequest$getNewEquipmentBenefits$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefit;", "it", "Lcom/mi/health/course/api/CourseVipActivityService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseVipActivityRequest$getNewEquipmentBenefits$3", f = "CourseVipActivityRequest.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14493 extends SuspendLambda implements Function2<CourseVipActivityService, Continuation<? super BaseResult<CourseNewEquipmentBenefit>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C14493(Continuation<? super C14493> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14493 c14493 = new C14493(continuation);
            c14493.L$0 = obj;
            return c14493;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CourseVipActivityService courseVipActivityService, Continuation<? super BaseResult<CourseNewEquipmentBenefit>> continuation) {
            return ((C14493) create(courseVipActivityService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseVipActivityService courseVipActivityService = (CourseVipActivityService) this.L$0;
                this.label = 1;
                obj = courseVipActivityService.getNewEquipmentBenefits(this);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void exchangeCourseBenefits$default(CourseVipActivityRequest courseVipActivityRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: jz4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CourseVipActivityRequest.exchangeCourseBenefits$lambda$4((CourseExchangeBenefits) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: kz4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CourseVipActivityRequest.exchangeCourseBenefits$lambda$5((ApiException) obj2);
                }
            };
        }
        courseVipActivityRequest.exchangeCourseBenefits(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exchangeCourseBenefits$lambda$4(CourseExchangeBenefits it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exchangeCourseBenefits$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exchangeCourseBenefits$lambda$6(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exchangeCourseBenefits$lambda$7(Function1 success, CourseExchangeBenefits it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getNewEquipmentBenefits$default(CourseVipActivityRequest courseVipActivityRequest, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: nz4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CourseVipActivityRequest.getNewEquipmentBenefits$lambda$0((CourseNewEquipmentBenefits) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: oz4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        courseVipActivityRequest.getNewEquipmentBenefits(function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNewEquipmentBenefits$lambda$0(CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNewEquipmentBenefits$lambda$2(CourseVipActivityRequest this$0, Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.w(this$0.TAG, "http getNewEquipmentBenefits error");
        it.printStackTrace();
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getNewEquipmentBenefits$lambda$3(CourseVipActivityRequest this$0, Function1 success, CourseNewEquipmentBenefit it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.w(this$0.TAG, "http getNewEquipmentBenefits:" + it);
        success.invoke2(it.getBenefit());
        return Unit.INSTANCE;
    }

    public final void exchangeCourseBenefits(@NotNull String code, @NotNull final Function1<? super CourseExchangeBenefits, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass3(code, null)).error(new Function1() { // from class: pz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivityRequest.exchangeCourseBenefits$lambda$6(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: qz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivityRequest.exchangeCourseBenefits$lambda$7(success, (CourseExchangeBenefits) obj);
            }
        });
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    public final void getNewEquipmentBenefits(@NotNull final Function1<? super CourseNewEquipmentBenefits, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.w(this.TAG, " getNewEquipmentBenefits");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C14493(null)).error(new Function1() { // from class: lz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivityRequest.getNewEquipmentBenefits$lambda$2(this.f25573a, error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: mz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipActivityRequest.getNewEquipmentBenefits$lambda$3(this.f27364a, success, (CourseNewEquipmentBenefit) obj);
            }
        });
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
