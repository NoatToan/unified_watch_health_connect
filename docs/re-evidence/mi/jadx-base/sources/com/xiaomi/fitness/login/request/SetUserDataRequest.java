package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.login.export.SetUserDataParamModel;
import com.xiaomi.fitness.login.export.SetUserDataResult;
import com.xiaomi.fitness.login.export.Setting;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.List;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/login/request/SetUserDataRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/login/request/SetUserDataService;", "<init>", "()V", "setUserGeneralData", "", "categoryKey", "", "settings", "", "Lcom/xiaomi/fitness/login/export/Setting;", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/login/export/SetUserDataResult;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSetUserDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetUserDataRequest.kt\ncom/xiaomi/fitness/login/request/SetUserDataRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,28:1\n89#2,5:29\n*S KotlinDebug\n*F\n+ 1 SetUserDataRequest.kt\ncom/xiaomi/fitness/login/request/SetUserDataRequest\n*L\n24#1:29,5\n*E\n"})
public final class SetUserDataRequest extends BaseRequest<SetUserDataService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.SetUserDataRequest$setUserGeneralData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/login/export/SetUserDataResult;", "it", "Lcom/xiaomi/fitness/login/request/SetUserDataService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.SetUserDataRequest$setUserGeneralData$1", f = "SetUserDataRequest.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SetUserDataService, Continuation<? super BaseResult<SetUserDataResult>>, Object> {
        final /* synthetic */ String $json;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$json = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$json, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SetUserDataService setUserDataService, Continuation<? super BaseResult<SetUserDataResult>> continuation) {
            return ((AnonymousClass1) create(setUserDataService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SetUserDataService setUserDataService = (SetUserDataService) this.L$0;
                String str = this.$json;
                Intrinsics.checkNotNull(str);
                this.label = 1;
                obj = setUserDataService.setUserData(str, this);
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

    public final void setUserGeneralData(@NotNull String categoryKey, @NotNull List<Setting> settings, @NotNull Function1<? super SetUserDataResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(getMGson().toJson(new SetUserDataParamModel(categoryKey, settings)), null)).error(onFail).success(onSuccess);
    }
}
