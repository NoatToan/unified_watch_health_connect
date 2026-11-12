package com.xiaomi.fitness.about.request;

import com.xiaomi.fitness.about.bean.LogOffRequest;
import com.xiaomi.fitness.about.bean.LogOffResult;
import com.xiaomi.fitness.about.request.AboutRequest;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JB\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/about/request/AboutRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/about/request/AboutService;", "<init>", "()V", "logOffService", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "identityToken", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/about/bean/LogOffResult;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAboutRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutRequest.kt\ncom/xiaomi/fitness/about/request/AboutRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,34:1\n110#2,2:35\n*S KotlinDebug\n*F\n+ 1 AboutRequest.kt\ncom/xiaomi/fitness/about/request/AboutRequest\n*L\n28#1:35,2\n*E\n"})
public final class AboutRequest extends BaseRequest<AboutService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.about.request.AboutRequest$logOffService$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/about/bean/LogOffResult;", "it", "Lcom/xiaomi/fitness/about/request/AboutService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.about.request.AboutRequest$logOffService$2", f = "AboutRequest.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AboutService, Continuation<? super BaseResult<LogOffResult>>, Object> {
        final /* synthetic */ LogOffRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LogOffRequest logOffRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = logOffRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = AboutRequest.this.new AnonymousClass2(this.$request, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AboutService aboutService, Continuation<? super BaseResult<LogOffResult>> continuation) {
            return ((AnonymousClass2) create(aboutService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AboutService aboutService = (AboutService) this.L$0;
                String json = AboutRequest.this.getMGson().toJson(this.$request);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                this.label = 1;
                obj = aboutService.logOffService(json, currentLocale$default, this);
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
    public static /* synthetic */ void logOffService$default(AboutRequest aboutRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: fz
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AboutRequest.logOffService$lambda$0((ApiException) obj2);
                }
            };
        }
        aboutRequest.logOffService(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOffService$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void logOffService(@NotNull CoroutineScope scope, @NotNull String identityToken, @NotNull Function1<? super LogOffResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(identityToken, "identityToken");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        LogOffRequest logOffRequest = new LogOffRequest();
        logOffRequest.setIdentityToken(identityToken);
        new HttpFlow(scope, getMService(), new AnonymousClass2(logOffRequest, null)).error(error).success(success);
    }
}
