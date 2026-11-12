package com.xiaomi.fitness.request;

import com.google.gson.Gson;
import com.xiaomi.fit.fitness.parser.data.DivingOutInPosition;
import com.xiaomi.fit.fitness.parser.data.OneDivingIdReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.request.SportHttpRequest;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/request/SportHttpRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/request/SportHttpService;", "<init>", "()V", "getDivingIDData", "", "lat", "Lcom/xiaomi/fit/fitness/parser/data/DivingOutInPosition;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fit/fitness/parser/data/OneDivingIdReport;", "fail", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthHttpRequest.kt\ncom/xiaomi/fitness/request/SportHttpRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,32:1\n89#2,5:33\n*S KotlinDebug\n*F\n+ 1 HealthHttpRequest.kt\ncom/xiaomi/fitness/request/SportHttpRequest\n*L\n19#1:33,5\n*E\n"})
public final class SportHttpRequest extends BaseRequest<SportHttpService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.request.SportHttpRequest$getDivingIDData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fit/fitness/parser/data/OneDivingIdReport;", "it", "Lcom/xiaomi/fitness/request/SportHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.request.SportHttpRequest$getDivingIDData$1", f = "HealthHttpRequest.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SportHttpService, Continuation<? super OneDivingIdReport>, Object> {
        final /* synthetic */ DivingOutInPosition $lat;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DivingOutInPosition divingOutInPosition, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$lat = divingOutInPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lat, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SportHttpService sportHttpService, Continuation<? super OneDivingIdReport> continuation) {
            return ((AnonymousClass1) create(sportHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportHttpService sportHttpService = (SportHttpService) this.L$0;
                String json = new Gson().toJson(this.$lat);
                Logger.i("ReportHttpRequest getDivingIDData", "lat:" + this.$lat + ", data " + json);
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = sportHttpService.getDiveAreaData(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((BaseResult) obj).getResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDivingIDData$lambda$0(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("reportHttpRequest getDivingIDData", "it:" + it);
        fail.invoke2(String.valueOf(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDivingIDData$lambda$1(Function1 success, OneDivingIdReport result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    public final void getDivingIDData(@NotNull DivingOutInPosition lat, @NotNull final Function1<? super OneDivingIdReport, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(lat, "lat");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(lat, null)).error(new Function1() { // from class: qon
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportHttpRequest.getDivingIDData$lambda$0(fail, (ApiException) obj);
            }
        }).success(new Function1() { // from class: ron
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportHttpRequest.getDivingIDData$lambda$1(success, (OneDivingIdReport) obj);
            }
        });
    }
}
