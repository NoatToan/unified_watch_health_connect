package com.xiaomi.fitness.net;

import com.google.gson.Gson;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.model.SportReportDivingInfo;
import com.xiaomi.fitness.net.SportRecordDivingPointRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.trail.diving.GetCommonInfoRequestDiveItem;
import com.xiaomi.fitness.trail.diving.GetCommonInfoRequestParam;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/net/SportRecordDivingPointRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/net/SportsRecordDivingPointApiService;", "<init>", "()V", "getSportReportDivingPointName", "", "point", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/detail/model/SportReportDivingInfo;", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportRecordDivingPointRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordDivingPointRequest.kt\ncom/xiaomi/fitness/net/SportRecordDivingPointRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,39:1\n89#2,5:40\n*S KotlinDebug\n*F\n+ 1 SportRecordDivingPointRequest.kt\ncom/xiaomi/fitness/net/SportRecordDivingPointRequest\n*L\n27#1:40,5\n*E\n"})
public final class SportRecordDivingPointRequest extends BaseRequest<SportsRecordDivingPointApiService> {

    @NotNull
    public static final String TAG = "SportRecordDivingPointRequest";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SportRecordDivingPointRequest instance = new SportRecordDivingPointRequest();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/SportRecordDivingPointRequest$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/net/SportRecordDivingPointRequest;", "getInstance", "()Lcom/xiaomi/fitness/net/SportRecordDivingPointRequest;", "TAG", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportRecordDivingPointRequest getInstance() {
            return SportRecordDivingPointRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.net.SportRecordDivingPointRequest$getSportReportDivingPointName$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/detail/model/SportReportDivingInfo;", "it", "Lcom/xiaomi/fitness/net/SportsRecordDivingPointApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.net.SportRecordDivingPointRequest$getSportReportDivingPointName$1", f = "SportRecordDivingPointRequest.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SportsRecordDivingPointApiService, Continuation<? super BaseResult<SportReportDivingInfo>>, Object> {
        final /* synthetic */ int $point;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$point = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$point, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SportsRecordDivingPointApiService sportsRecordDivingPointApiService, Continuation<? super BaseResult<SportReportDivingInfo>> continuation) {
            return ((AnonymousClass1) create(sportsRecordDivingPointApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SportsRecordDivingPointApiService sportsRecordDivingPointApiService = (SportsRecordDivingPointApiService) this.L$0;
                String json = new Gson().toJson(new GetCommonInfoRequestParam(new GetCommonInfoRequestDiveItem(CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(this.$point)))));
                Logger.i(SportRecordDivingPointRequest.TAG, "request = " + json);
                Intrinsics.checkNotNull(json);
                this.label = 1;
                obj = sportsRecordDivingPointApiService.getSportsRecordDivingPointData(json, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportReportDivingPointName$lambda$0(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSportReportDivingPointName$lambda$1(Function1 success, SportReportDivingInfo it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    public final void getSportReportDivingPointName(int point, @NotNull final Function1<? super SportReportDivingInfo, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(point, null)).error(new Function1() { // from class: vtn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDivingPointRequest.getSportReportDivingPointName$lambda$0(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: wtn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordDivingPointRequest.getSportReportDivingPointName$lambda$1(success, (SportReportDivingInfo) obj);
            }
        });
    }
}
