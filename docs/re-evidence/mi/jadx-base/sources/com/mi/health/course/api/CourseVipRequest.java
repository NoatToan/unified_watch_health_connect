package com.mi.health.course.api;

import com.google.gson.Gson;
import com.mi.health.course.api.CourseVipRequest;
import com.mi.health.course.export.CourseVipExtKt;
import com.mi.health.course.export.data.CourseMembership;
import com.mi.health.course.export.data.CourseVipInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/mi/health/course/api/CourseVipRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/course/api/CourseVipService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "getCourseVip", "Lcom/mi/health/course/export/data/CourseMembership;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCourseVipInfo", "", "success", "Lkotlin/Function1;", "Lcom/mi/health/course/export/data/CourseVipInfo;", "error", "Lkotlin/Function0;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCourseVipRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseVipRequest.kt\ncom/mi/health/course/api/CourseVipRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,36:1\n141#2:37\n89#2,5:41\n31#3:38\n28#3,2:39\n*S KotlinDebug\n*F\n+ 1 CourseVipRequest.kt\ncom/mi/health/course/api/CourseVipRequest\n*L\n16#1:37\n24#1:41,5\n16#1:38\n16#1:39,2\n*E\n"})
public final class CourseVipRequest extends BaseRequest<CourseVipService> {
    public Gson gson;

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseVipRequest$getCourseVip$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseVipRequest", f = "CourseVipRequest.kt", i = {}, l = {16}, m = "getCourseVip", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CourseVipRequest.this.getCourseVip(this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.course.api.CourseVipRequest$getCourseVipInfo$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/course/export/data/CourseVipInfo;", "it", "Lcom/mi/health/course/api/CourseVipService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.course.api.CourseVipRequest$getCourseVipInfo$3", f = "CourseVipRequest.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CourseVipService, Continuation<? super BaseResult<CourseVipInfo>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CourseVipService courseVipService, Continuation<? super BaseResult<CourseVipInfo>> continuation) {
            return ((AnonymousClass3) create(courseVipService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CourseVipService courseVipService = (CourseVipService) this.L$0;
                this.label = 1;
                obj = courseVipService.getCourseVip(this);
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
    public static /* synthetic */ void getCourseVipInfo$default(CourseVipRequest courseVipRequest, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: uz4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return CourseVipRequest.getCourseVipInfo$lambda$0((CourseVipInfo) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: vz4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        courseVipRequest.getCourseVipInfo(function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseVipInfo$lambda$0(CourseVipInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseVipInfo$lambda$2(Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        it.printStackTrace();
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCourseVipInfo$lambda$3(Function1 success, CourseVipInfo it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        CourseVipExtKt.saveCourseVipInfo(it);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCourseVip(@NotNull Continuation<? super CourseMembership> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object courseMemberships = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(courseMemberships);
            CourseVipService mService = getMService();
            anonymousClass1.label = 1;
            courseMemberships = mService.getCourseMemberships(anonymousClass1);
            if (courseMemberships == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(courseMemberships);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(courseMemberships);
    }

    public final void getCourseVipInfo(@NotNull final Function1<? super CourseVipInfo, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass3(null)).error(new Function1() { // from class: wz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipRequest.getCourseVipInfo$lambda$2(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: xz4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseVipRequest.getCourseVipInfo$lambda$3(success, (CourseVipInfo) obj);
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

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }
}
