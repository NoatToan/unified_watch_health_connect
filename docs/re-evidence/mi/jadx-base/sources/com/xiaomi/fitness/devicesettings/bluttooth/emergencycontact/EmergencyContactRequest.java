package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import com.google.gson.Gson;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactRequest;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JM\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2 \u0010\t\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\r¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactApiService;", "<init>", "()V", "getGuideJson", "", "param", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmergencyContactRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyContactRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,19:1\n89#2,5:20\n*S KotlinDebug\n*F\n+ 1 EmergencyContactRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactRequest\n*L\n12#1:20,5\n*E\n"})
public final class EmergencyContactRequest extends BaseRequest<EmergencyContactApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactRequest$getGuideJson$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactRequest$getGuideJson$1", f = "EmergencyContactRequest.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<EmergencyContactApiService, Continuation<? super Object>, Object> {
        final /* synthetic */ String $param;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$param = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$param, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(EmergencyContactApiService emergencyContactApiService, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(emergencyContactApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmergencyContactApiService emergencyContactApiService = (EmergencyContactApiService) this.L$0;
                String str = this.$param;
                this.label = 1;
                obj = emergencyContactApiService.getGuideJson(str, this);
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(EmergencyContactApiService emergencyContactApiService, Continuation<? super Object> continuation) {
            return invoke2(emergencyContactApiService, (Continuation<Object>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getGuideJson$lambda$0(Function1 success, Object it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(new Gson().toJson(it));
        return Unit.INSTANCE;
    }

    public final void getGuideJson(@NotNull String param, @NotNull final Function1<? super String, Unit> success, @NotNull Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(param, null)).error(fail).success(new Function1() { // from class: h88
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactRequest.getGuideJson$lambda$0(success, obj);
            }
        });
    }
}
