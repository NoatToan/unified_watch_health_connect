package com.cmcc.server;

import com.mi.fitness.lpamanagement.request.LpaManagementApiRequest;
import com.mi.fitness.lpamanagement.request.data.DecryptResult;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.response.ApiException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.cmcc.server.ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1", f = "ICMCCRemoteService.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $activationCode;
    int label;
    final /* synthetic */ ICMCCRemoteService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1(ICMCCRemoteService iCMCCRemoteService, String str, Continuation<? super ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1> continuation) {
        super(2, continuation);
        this.this$0 = iCMCCRemoteService;
        this.$activationCode = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ICMCCRemoteService iCMCCRemoteService, DecryptResult decryptResult) {
        Logger.i("ICMCCRemoteService", "decrypt activationCode success");
        iCMCCRemoteService.downloadESim(decryptResult.getPlainText(), 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ApiException apiException) {
        Logger.i("ICMCCRemoteService", "decrypt activationCode fail: " + apiException);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1(this.this$0, this.$activationCode, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LpaManagementApiRequest lpaManagementApiRequest = this.this$0.getLpaManagementApiRequest();
            String str = this.$activationCode;
            final ICMCCRemoteService iCMCCRemoteService = this.this$0;
            Function1<? super DecryptResult, Unit> function1 = new Function1() { // from class: com.cmcc.server.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1.invokeSuspend$lambda$0(iCMCCRemoteService, (DecryptResult) obj2);
                }
            };
            Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.cmcc.server.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1.invokeSuspend$lambda$1((ApiException) obj2);
                }
            };
            this.label = 1;
            if (lpaManagementApiRequest.decrypt(1, str, function1, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ICMCCRemoteService$mOpenMultiSimBinder$1$downloadEsimProfile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
