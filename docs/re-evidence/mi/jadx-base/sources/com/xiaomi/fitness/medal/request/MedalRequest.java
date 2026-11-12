package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.PopMedalList;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.model.MedalResult;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJ8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJ0\u0010\u0012\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJ8\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/medal/request/MedalService;", "<init>", "()V", "getUserDetailMedal", "", "id", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "postClientAssist", "data", "", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "getLatestMedal", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "turnMedalDone", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedalRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalRequest.kt\ncom/xiaomi/fitness/medal/request/MedalRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,80:1\n89#2,5:81\n89#2,5:86\n89#2,5:91\n89#2,5:96\n*S KotlinDebug\n*F\n+ 1 MedalRequest.kt\ncom/xiaomi/fitness/medal/request/MedalRequest\n*L\n22#1:81,5\n39#1:86,5\n52#1:91,5\n69#1:96,5\n*E\n"})
public final class MedalRequest extends BaseRequest<MedalService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalRequest$getLatestMedal$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalResult;", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "it", "Lcom/xiaomi/fitness/medal/request/MedalService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalRequest$getLatestMedal$2", f = "MedalRequest.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MedalService, Continuation<? super MedalResult<PopMedalData>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalService medalService, Continuation<? super MedalResult<PopMedalData>> continuation) {
            return ((AnonymousClass2) create(medalService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalService medalService = (MedalService) this.L$0;
                this.label = 1;
                obj = medalService.getLatestMedal(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalRequest$getUserDetailMedal$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalResult;", "Lcom/xiaomi/fitness/medal/bean/MedalDetail;", "it", "Lcom/xiaomi/fitness/medal/request/MedalService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalRequest$getUserDetailMedal$2", f = "MedalRequest.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25982 extends SuspendLambda implements Function2<MedalService, Continuation<? super MedalResult<MedalDetail>>, Object> {
        final /* synthetic */ long $id;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25982(long j, Continuation<? super C25982> continuation) {
            super(2, continuation);
            this.$id = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25982 c25982 = new C25982(this.$id, continuation);
            c25982.L$0 = obj;
            return c25982;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalService medalService, Continuation<? super MedalResult<MedalDetail>> continuation) {
            return ((C25982) create(medalService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalService medalService = (MedalService) this.L$0;
                long j = this.$id;
                this.label = 1;
                obj = medalService.getMedalDetail(j, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalRequest$postClientAssist$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalResult;", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "it", "Lcom/xiaomi/fitness/medal/request/MedalService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalRequest$postClientAssist$2", f = "MedalRequest.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25992 extends SuspendLambda implements Function2<MedalService, Continuation<? super MedalResult<MedalAssistResult>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25992(String str, Continuation<? super C25992> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25992 c25992 = new C25992(this.$data, continuation);
            c25992.L$0 = obj;
            return c25992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalService medalService, Continuation<? super MedalResult<MedalAssistResult>> continuation) {
            return ((C25992) create(medalService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalService medalService = (MedalService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = medalService.postClientAssist(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalRequest$turnMedalDone$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/medal/request/model/MedalResult;", "Lcom/xiaomi/fitness/medal/bean/PopMedalList;", "it", "Lcom/xiaomi/fitness/medal/request/MedalService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalRequest$turnMedalDone$2", f = "MedalRequest.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26002 extends SuspendLambda implements Function2<MedalService, Continuation<? super MedalResult<PopMedalList>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26002(String str, Continuation<? super C26002> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26002 c26002 = new C26002(this.$data, continuation);
            c26002.L$0 = obj;
            return c26002;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalService medalService, Continuation<? super MedalResult<PopMedalList>> continuation) {
            return ((C26002) create(medalService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalService medalService = (MedalService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = medalService.turnMedalDone(str, this);
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
    public static /* synthetic */ void getLatestMedal$default(MedalRequest medalRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: qgf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalRequest.getLatestMedal$lambda$4((ApiException) obj2);
                }
            };
        }
        medalRequest.getLatestMedal(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestMedal$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLatestMedal$lambda$5(Function1 success, Function1 error, MedalResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        PopMedalData popMedalData = (PopMedalData) it.getData();
        if (popMedalData != null) {
            success.invoke2(popMedalData);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUserDetailMedal$default(MedalRequest medalRequest, long j, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: rgf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalRequest.getUserDetailMedal$lambda$0((ApiException) obj2);
                }
            };
        }
        medalRequest.getUserDetailMedal(j, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserDetailMedal$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserDetailMedal$lambda$1(Function1 success, Function1 error, MedalResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        MedalDetail medalDetail = (MedalDetail) it.getData();
        if (medalDetail != null) {
            success.invoke2(medalDetail);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postClientAssist$default(MedalRequest medalRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: vgf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalRequest.postClientAssist$lambda$2((ApiException) obj2);
                }
            };
        }
        medalRequest.postClientAssist(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postClientAssist$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postClientAssist$lambda$3(Function1 success, Function1 error, MedalResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        MedalAssistResult medalAssistResult = (MedalAssistResult) it.getData();
        if (medalAssistResult != null) {
            success.invoke2(medalAssistResult);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void turnMedalDone$default(MedalRequest medalRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: ugf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalRequest.turnMedalDone$lambda$6((ApiException) obj2);
                }
            };
        }
        medalRequest.turnMedalDone(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnMedalDone$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit turnMedalDone$lambda$7(Function1 success, Function1 error, MedalResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        PopMedalList popMedalList = (PopMedalList) it.getData();
        if (popMedalList != null) {
            success.invoke2(popMedalList);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    public final void getLatestMedal(@NotNull final Function1<? super PopMedalData, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(error).success(new Function1() { // from class: xgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalRequest.getLatestMedal$lambda$5(success, error, (MedalResult) obj);
            }
        });
    }

    public final void getUserDetailMedal(long id, @NotNull final Function1<? super MedalDetail, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C25982(id, null)).error(error).success(new Function1() { // from class: sgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalRequest.getUserDetailMedal$lambda$1(success, error, (MedalResult) obj);
            }
        });
    }

    public final void postClientAssist(@NotNull String data, @NotNull final Function1<? super MedalAssistResult, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C25992(data, null)).error(error).success(new Function1() { // from class: tgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalRequest.postClientAssist$lambda$3(success, error, (MedalResult) obj);
            }
        });
    }

    public final void turnMedalDone(@NotNull String data, @NotNull final Function1<? super PopMedalList, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26002(data, null)).error(error).success(new Function1() { // from class: wgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalRequest.turnMedalDone$lambda$7(success, error, (MedalResult) obj);
            }
        });
    }
}
