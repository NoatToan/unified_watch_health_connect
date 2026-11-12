package com.xiaomi.fitness.nfc.request;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.nfc.entity.MasterRegions;
import com.xiaomi.fitness.nfc.request.MasterRequest;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import defpackage.d7f;
import defpackage.vqg;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/nfc/request/MasterRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/nfc/request/MasterService;", "<init>", "()V", "initSupportMasterCardRegions", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMasterRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MasterRequest.kt\ncom/xiaomi/fitness/nfc/request/MasterRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,24:1\n89#2,5:25\n*S KotlinDebug\n*F\n+ 1 MasterRequest.kt\ncom/xiaomi/fitness/nfc/request/MasterRequest\n*L\n13#1:25,5\n*E\n"})
public final class MasterRequest extends BaseRequest<MasterService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.request.MasterRequest$initSupportMasterCardRegions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/nfc/entity/MasterRegions;", "it", "Lcom/xiaomi/fitness/nfc/request/MasterService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.request.MasterRequest$initSupportMasterCardRegions$1", f = "MasterRequest.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MasterService, Continuation<? super MasterRegions>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = MasterRequest.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MasterService masterService, Continuation<? super MasterRegions> continuation) {
            return ((AnonymousClass1) create(masterService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MasterService masterService = (MasterService) this.L$0;
                String json = MasterRequest.this.getMGson().toJson(new d7f());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = masterService.getSupportMasterRegions(json, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BaseResult baseResult = (BaseResult) obj;
            if (baseResult != null) {
                return (MasterRegions) baseResult.getResult();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSupportMasterCardRegions$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vqg.c("initSupportMasterCardRegions", it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSupportMasterCardRegions$lambda$1(MasterRequest this$0, MasterRegions result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        vqg.d("initSupportMasterCardRegions :" + this$0.getMGson().toJson(result));
        NfcPreference.INSTANCE.setSupportMasterRegins(this$0.getMGson().toJson(result));
        return Unit.INSTANCE;
    }

    public final void initSupportMasterCardRegions() {
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(null)).error(new Function1() { // from class: e7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterRequest.initSupportMasterCardRegions$lambda$0((ApiException) obj);
            }
        }).success(new Function1() { // from class: f7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterRequest.initSupportMasterCardRegions$lambda$1(this.f17496a, (MasterRegions) obj);
            }
        });
    }
}
