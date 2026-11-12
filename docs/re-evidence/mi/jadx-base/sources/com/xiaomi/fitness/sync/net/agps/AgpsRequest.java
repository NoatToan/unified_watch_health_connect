package com.xiaomi.fitness.sync.net.agps;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sync.model.AgpsRes;
import com.xiaomi.fitness.sync.net.agps.AgpsRequest;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sync/net/agps/AgpsRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sync/net/agps/AgpsService;", "<init>", "()V", "getAgpsUrl", "", "data", "Lcom/xiaomi/fitness/sync/net/agps/AgpsRequestModel;", "online", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sync/model/AgpsRes$Result;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgpsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgpsRequest.kt\ncom/xiaomi/fitness/sync/net/agps/AgpsRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,29:1\n104#2,8:30\n104#2,8:38\n*S KotlinDebug\n*F\n+ 1 AgpsRequest.kt\ncom/xiaomi/fitness/sync/net/agps/AgpsRequest\n*L\n16#1:30,8\n22#1:38,8\n*E\n"})
public final class AgpsRequest extends BaseRequest<AgpsService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.agps.AgpsRequest$getAgpsUrl$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sync/model/AgpsRes$Result;", "it", "Lcom/xiaomi/fitness/sync/net/agps/AgpsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.agps.AgpsRequest$getAgpsUrl$2", f = "AgpsRequest.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AgpsService, Continuation<? super BaseResult<AgpsRes.Result>>, Object> {
        final /* synthetic */ AgpsRequestModel $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AgpsRequestModel agpsRequestModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = agpsRequestModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AgpsRequest.this.new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AgpsService agpsService, Continuation<? super BaseResult<AgpsRes.Result>> continuation) {
            return ((AnonymousClass2) create(agpsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AgpsService agpsService = (AgpsService) this.L$0;
                String json = AgpsRequest.this.getMGson().toJson(this.$data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = agpsService.getOnlineAgps(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.net.agps.AgpsRequest$getAgpsUrl$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sync/model/AgpsRes$Result;", "it", "Lcom/xiaomi/fitness/sync/net/agps/AgpsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.net.agps.AgpsRequest$getAgpsUrl$3", f = "AgpsRequest.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<AgpsService, Continuation<? super BaseResult<AgpsRes.Result>>, Object> {
        final /* synthetic */ AgpsRequestModel $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AgpsRequestModel agpsRequestModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$data = agpsRequestModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = AgpsRequest.this.new AnonymousClass3(this.$data, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AgpsService agpsService, Continuation<? super BaseResult<AgpsRes.Result>> continuation) {
            return ((AnonymousClass3) create(agpsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AgpsService agpsService = (AgpsService) this.L$0;
                String json = AgpsRequest.this.getMGson().toJson(this.$data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = agpsService.getOfflineAgps(json, this);
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
    public static /* synthetic */ void getAgpsUrl$default(AgpsRequest agpsRequest, AgpsRequestModel agpsRequestModel, boolean z, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: gz0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AgpsRequest.getAgpsUrl$lambda$0((ApiException) obj2);
                }
            };
        }
        agpsRequest.getAgpsUrl(agpsRequestModel, z, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAgpsUrl$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getAgpsUrl(@NotNull AgpsRequestModel data, boolean online, @NotNull Function1<? super AgpsRes.Result, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (online) {
            new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(data, null)).error(error).success(success);
        } else {
            new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass3(data, null)).error(error).success(success);
        }
    }
}
