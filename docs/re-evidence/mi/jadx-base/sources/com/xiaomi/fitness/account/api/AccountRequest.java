package com.xiaomi.fitness.account.api;

import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.GetPersonalQrCodeResult;
import com.xiaomi.fitness.account.api.bean.QrInfo;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.response.ErrorCode;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJB\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/account/api/AccountRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/account/api/AccountService;", "<init>", "()V", "getUserProfile", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "setUserProfile", "info", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "", "getPersonalQrCode", "Lcom/xiaomi/fitness/account/api/bean/QrInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRequest.kt\ncom/xiaomi/fitness/account/api/AccountRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,54:1\n110#2,2:55\n110#2,2:57\n*S KotlinDebug\n*F\n+ 1 AccountRequest.kt\ncom/xiaomi/fitness/account/api/AccountRequest\n*L\n30#1:55,2\n46#1:57,2\n*E\n"})
public final class AccountRequest extends BaseRequest<AccountService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.api.AccountRequest$getPersonalQrCode$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.api.AccountRequest", f = "AccountRequest.kt", i = {}, l = {52}, m = "getPersonalQrCode", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountRequest.this.getPersonalQrCode(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.api.AccountRequest$getUserProfile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "it", "Lcom/xiaomi/fitness/account/api/AccountService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.api.AccountRequest$getUserProfile$2", f = "AccountRequest.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AccountService, Continuation<? super BaseResult<UserInfoProfile>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountService accountService, Continuation<? super BaseResult<UserInfoProfile>> continuation) {
            return ((AnonymousClass2) create(accountService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountService accountService = (AccountService) this.L$0;
                this.label = 1;
                obj = accountService.getUserProfile(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.api.AccountRequest$setUserProfile$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "it", "Lcom/xiaomi/fitness/account/api/AccountService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.api.AccountRequest$setUserProfile$2", f = "AccountRequest.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C17592 extends SuspendLambda implements Function2<AccountService, Continuation<? super BaseResult<Boolean>>, Object> {
        final /* synthetic */ UserProfile $info;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17592(UserProfile userProfile, Continuation<? super C17592> continuation) {
            super(2, continuation);
            this.$info = userProfile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17592 c17592 = new C17592(this.$info, continuation);
            c17592.L$0 = obj;
            return c17592;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountService accountService, Continuation<? super BaseResult<Boolean>> continuation) {
            return ((C17592) create(accountService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountService accountService = (AccountService) this.L$0;
                String requestObject = AccountManagerExtKt.toRequestObject(this.$info);
                this.label = 1;
                obj = accountService.updateUserProfile(requestObject, this);
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
    public static /* synthetic */ void getUserProfile$default(AccountRequest accountRequest, CoroutineScope coroutineScope, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: qc0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccountRequest.getUserProfile$lambda$0((ApiException) obj2);
                }
            };
        }
        accountRequest.getUserProfile(coroutineScope, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserProfile$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUserProfile$default(AccountRequest accountRequest, CoroutineScope coroutineScope, UserProfile userProfile, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: pc0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AccountRequest.setUserProfile$lambda$1((ApiException) obj2);
                }
            };
        }
        accountRequest.setUserProfile(coroutineScope, userProfile, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserProfile$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPersonalQrCode(@NotNull Continuation<? super QrInfo> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object personalQrCode = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(personalQrCode);
            AccountV1Request companion = AccountV1Request.INSTANCE.getInstance();
            anonymousClass1.label = 1;
            personalQrCode = companion.getPersonalQrCode(anonymousClass1);
            if (personalQrCode == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(personalQrCode);
        }
        return ((GetPersonalQrCodeResult) personalQrCode).getQrInfo();
    }

    public final void getUserProfile(@NotNull CoroutineScope scope, @NotNull Function1<? super UserInfoProfile, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            error.invoke2(new ApiException("not login", ErrorCode.NO_TOKEN));
        } else {
            new HttpFlow(scope, getMService(), new AnonymousClass2(null)).error(error).success(success);
        }
    }

    public final void setUserProfile(@NotNull CoroutineScope scope, @NotNull UserProfile info, @NotNull Function1<? super Boolean, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            error.invoke2(new ApiException("not login", ErrorCode.NO_TOKEN));
        } else {
            new HttpFlow(scope, getMService(), new C17592(info, null)).error(error).success(success);
        }
    }
}
