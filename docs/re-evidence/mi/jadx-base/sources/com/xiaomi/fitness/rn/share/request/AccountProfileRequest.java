package com.xiaomi.fitness.rn.share.request;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.rn.share.bean.UserBean;
import com.xiaomi.fitness.rn.share.request.AccountProfileRequest;
import defpackage.h4b;
import defpackage.vo6;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/rn/share/request/AccountProfileRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/rn/share/request/AccountProfileHttpService;", "<init>", "()V", "getUserProfile", "", "input", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "error", "Lkotlin/Function0;", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountProfileRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountProfileRequest.kt\ncom/xiaomi/fitness/rn/share/request/AccountProfileRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,28:1\n89#2,5:29\n*S KotlinDebug\n*F\n+ 1 AccountProfileRequest.kt\ncom/xiaomi/fitness/rn/share/request/AccountProfileRequest\n*L\n15#1:29,5\n*E\n"})
public final class AccountProfileRequest extends BaseRequest<AccountProfileHttpService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.share.request.AccountProfileRequest$getUserProfile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "it", "Lcom/xiaomi/fitness/rn/share/request/AccountProfileHttpService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.rn.share.request.AccountProfileRequest$getUserProfile$1", f = "AccountProfileRequest.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccountProfileHttpService, Continuation<? super UserBean>, Object> {
        final /* synthetic */ String $input;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$input, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountProfileHttpService accountProfileHttpService, Continuation<? super UserBean> continuation) {
            return ((AnonymousClass1) create(accountProfileHttpService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountProfileHttpService accountProfileHttpService = (AccountProfileHttpService) this.L$0;
                String strB = h4b.b(MapsKt__MapsKt.hashMapOf(TuplesKt.to("id", this.$input)));
                Intrinsics.checkNotNull(strB);
                this.label = 1;
                obj = accountProfileHttpService.userProfile(strB, this);
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
                return (UserBean) baseResult.getResult();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$0(Function0 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        vo6.b("getUserProfile", it);
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$1(Function1 success, UserBean bean) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(bean, "bean");
        success.invoke2(bean);
        return Unit.INSTANCE;
    }

    public final void getUserProfile(@NotNull String input, @NotNull final Function1<? super UserBean, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(input, null)).error(new Function1() { // from class: n90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountProfileRequest.getUserProfile$lambda$0(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: o90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountProfileRequest.getUserProfile$lambda$1(success, (UserBean) obj);
            }
        });
    }
}
