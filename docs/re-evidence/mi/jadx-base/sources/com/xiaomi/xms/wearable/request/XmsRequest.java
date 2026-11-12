package com.xiaomi.xms.wearable.request;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.xms.wearable.ui.appshop.model.GetWeichatLicense;
import defpackage.h4b;
import defpackage.lg1;
import defpackage.xg1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/xms/wearable/request/XmsRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/xms/wearable/request/ThirdAppService;", "<init>", "()V", "getWeichatLicense", "", "did", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/GetWeichatLicense;", "Lkotlin/Function1;", "onFail", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXmsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmsRequest.kt\ncom/xiaomi/xms/wearable/request/XmsRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,36:1\n89#2,5:37\n*S KotlinDebug\n*F\n+ 1 XmsRequest.kt\ncom/xiaomi/xms/wearable/request/XmsRequest\n*L\n25#1:37,5\n*E\n"})
public final class XmsRequest extends BaseRequest<ThirdAppService> {

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.request.XmsRequest$getWeichatLicense$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/xms/wearable/ui/appshop/model/GetWeichatLicense;", "it", "Lcom/xiaomi/xms/wearable/request/ThirdAppService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.request.XmsRequest$getWeichatLicense$1", f = "XmsRequest.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ThirdAppService, Continuation<? super GetWeichatLicense>, Object> {
        final /* synthetic */ String $did;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$did, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThirdAppService thirdAppService, Continuation<? super GetWeichatLicense> continuation) {
            return ((AnonymousClass1) create(thirdAppService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ThirdAppService thirdAppService = (ThirdAppService) this.L$0;
                String strB = h4b.b(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("did", this.$did)));
                lg1.d("getWatchAppList dataJson:" + strB);
                Intrinsics.checkNotNull(strB);
                this.label = 1;
                obj = thirdAppService.getWeichatLicense(strB, this);
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

    public final void getWeichatLicense(@NotNull final String did, @NotNull Function1<? super GetWeichatLicense, Unit> onSuccess, @NotNull final Function1<? super String, Unit> onFail) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(did, null)).error(new Function1<ApiException, Unit>() { // from class: com.xiaomi.xms.wearable.request.XmsRequest.getWeichatLicense.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                xg1.b(p1.toString());
                onFail.invoke2(did);
            }
        }).success(onSuccess);
    }
}
