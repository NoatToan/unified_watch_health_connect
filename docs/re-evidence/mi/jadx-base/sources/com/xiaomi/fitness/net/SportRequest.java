package com.xiaomi.fitness.net;

import com.xiaomi.fitness.detail.data.SportShareRes;
import com.xiaomi.fitness.net.SportRequest;
import com.xiaomi.fitness.net.SportShareResResult;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/net/SportRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/net/SportsRecordApiService;", "<init>", "()V", "getSportShareConfig", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/detail/data/SportShareRes;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRequest.kt\ncom/xiaomi/fitness/net/SportRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,25:1\n89#2,5:26\n*S KotlinDebug\n*F\n+ 1 SportRequest.kt\ncom/xiaomi/fitness/net/SportRequest\n*L\n13#1:26,5\n*E\n"})
public final class SportRequest extends BaseRequest<SportsRecordApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.SportRequest$getSportShareConfig$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/SportShareResResult;", "Lcom/xiaomi/fitness/detail/data/SportShareRes;", "it", "Lcom/xiaomi/fitness/net/SportsRecordApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.SportRequest$getSportShareConfig$2", f = "SportRequest.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SportsRecordApiService, Continuation<? super SportShareResResult<SportShareRes>>, Object> {
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
        public final Object invoke(SportsRecordApiService sportsRecordApiService, Continuation<? super SportShareResResult<SportShareRes>> continuation) {
            return ((AnonymousClass2) create(sportsRecordApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportsRecordApiService sportsRecordApiService = (SportsRecordApiService) this.L$0;
                this.label = 1;
                obj = sportsRecordApiService.getSportShareConfig(this);
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
    public static /* synthetic */ void getSportShareConfig$default(SportRequest sportRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: lzn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SportRequest.getSportShareConfig$lambda$0((ApiException) obj2);
                }
            };
        }
        sportRequest.getSportShareConfig(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportShareConfig$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportShareConfig$lambda$1(Function1 success, Function1 error, SportShareResResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        SportShareRes sportShareRes = (SportShareRes) it.getData();
        if (sportShareRes != null) {
            success.invoke2(sportShareRes);
        } else {
            error.invoke2(ApiException.INSTANCE.getEMPTY());
        }
        return Unit.INSTANCE;
    }

    public final void getSportShareConfig(@NotNull final Function1<? super SportShareRes, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(null)).error(error).success(new Function1() { // from class: kzn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRequest.getSportShareConfig$lambda$1(success, error, (SportShareResResult) obj);
            }
        });
    }
}
