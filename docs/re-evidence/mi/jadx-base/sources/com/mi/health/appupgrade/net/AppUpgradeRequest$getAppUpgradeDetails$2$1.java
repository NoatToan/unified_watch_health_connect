package com.mi.health.appupgrade.net;

import com.mi.health.appupgrade.model.AppVersionDetailParams;
import com.mi.health.appupgrade.model.AppVersionDetailResult;
import com.xiaomi.fitness.net.response.BaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/appupgrade/model/AppVersionDetailResult;", "it", "Lcom/mi/health/appupgrade/net/AppUpgradeService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.mi.health.appupgrade.net.AppUpgradeRequest$getAppUpgradeDetails$2$1", f = "AppUpgradeRequest.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class AppUpgradeRequest$getAppUpgradeDetails$2$1 extends SuspendLambda implements Function2<AppUpgradeService, Continuation<? super BaseResult<AppVersionDetailResult>>, Object> {
    final /* synthetic */ AppVersionDetailParams $requestDetail;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppUpgradeRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpgradeRequest$getAppUpgradeDetails$2$1(AppUpgradeRequest appUpgradeRequest, AppVersionDetailParams appVersionDetailParams, Continuation<? super AppUpgradeRequest$getAppUpgradeDetails$2$1> continuation) {
        super(2, continuation);
        this.this$0 = appUpgradeRequest;
        this.$requestDetail = appVersionDetailParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppUpgradeRequest$getAppUpgradeDetails$2$1 appUpgradeRequest$getAppUpgradeDetails$2$1 = new AppUpgradeRequest$getAppUpgradeDetails$2$1(this.this$0, this.$requestDetail, continuation);
        appUpgradeRequest$getAppUpgradeDetails$2$1.L$0 = obj;
        return appUpgradeRequest$getAppUpgradeDetails$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AppUpgradeService appUpgradeService, Continuation<? super BaseResult<AppVersionDetailResult>> continuation) {
        return ((AppUpgradeRequest$getAppUpgradeDetails$2$1) create(appUpgradeService, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppUpgradeService appUpgradeService = (AppUpgradeService) this.L$0;
            String json = this.this$0.getMGson().toJson(this.$requestDetail);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            this.label = 1;
            obj = appUpgradeService.getAppVersionDetail(json, this);
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
