package com.huami.passport;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.huami.passport.entity.LoginToken;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u001f\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aD\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00172#\u0010\u001c\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010\u0017*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0019H\u0002¢\u0006\u0004\b\u001d\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/huami/passport/AccountManager;", "Landroid/app/Activity;", "activity", "", "provider", "countryCode", Configs.Params.COUNTRY_STATE, "Lcom/huami/passport/OperationResult;", "Lcom/huami/passport/entity/LoginToken;", "awaitRegistrationBase", "(Lcom/huami/passport/AccountManager;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accessToken", "awaitRegistration", "(Lcom/huami/passport/AccountManager;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "areaValue", "", "allowFastLogin", "awaitLoginWithoutRef", "(Lcom/huami/passport/AccountManager;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "username", "password", "awaitLogin", "(Lcom/huami/passport/AccountManager;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlin/ExtensionFunctionType;", "operation", "callbackWrapper", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/huami/passport/AccountManagerExt$callbackWrapper$3", "(Lkotlinx/coroutines/CancellableContinuation;)Lcom/huami/passport/AccountManagerExt$callbackWrapper$3;", "passport_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "AccountManagerExt")
public final class AccountManagerExt {
    @Nullable
    public static final Object awaitLogin(@NotNull final AccountManager accountManager, @NotNull final String str, @NotNull final String str2, final boolean z, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        return callbackWrapper(new Function1<CancellableContinuation<? super OperationResult<? extends LoginToken>>, Unit>() { // from class: com.huami.passport.AccountManagerExt.awaitLogin.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                invoke2(cancellableContinuation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                accountManager.login(str, str2, z, AccountManagerExt.callbackWrapper(cancellableContinuation));
            }
        }, continuation);
    }

    @Nullable
    public static final Object awaitLoginWithoutRef(@NotNull final AccountManager accountManager, @NotNull final Activity activity, @NotNull final String str, @NotNull final String str2, final boolean z, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        return callbackWrapper(new Function1<CancellableContinuation<? super OperationResult<? extends LoginToken>>, Unit>() { // from class: com.huami.passport.AccountManagerExt.awaitLoginWithoutRef.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                invoke2(cancellableContinuation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                accountManager.loginWithoutRef(activity, str, str2, z, AccountManagerExt.callbackWrapper(cancellableContinuation));
            }
        }, continuation);
    }

    @Nullable
    public static final Object awaitRegistration(@NotNull final AccountManager accountManager, @NotNull final Activity activity, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        return callbackWrapper(new Function1<CancellableContinuation<? super OperationResult<? extends LoginToken>>, Unit>() { // from class: com.huami.passport.AccountManagerExt.awaitRegistration.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                invoke2(cancellableContinuation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                accountManager.registration(activity, str, str2, str3, str4, AccountManagerExt.callbackWrapper(cancellableContinuation));
            }
        }, continuation);
    }

    @Nullable
    public static final Object awaitRegistrationBase(@NotNull final AccountManager accountManager, @NotNull final Activity activity, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull Continuation<? super OperationResult<? extends LoginToken>> continuation) {
        return callbackWrapper(new Function1<CancellableContinuation<? super OperationResult<? extends LoginToken>>, Unit>() { // from class: com.huami.passport.AccountManagerExt.awaitRegistrationBase.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                invoke2(cancellableContinuation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CancellableContinuation<? super OperationResult<? extends LoginToken>> cancellableContinuation) {
                accountManager.registrationBase(activity, str, str2, str3, AccountManagerExt.callbackWrapper(cancellableContinuation));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnonymousClass3 callbackWrapper(final CancellableContinuation<? super OperationResult<? extends T>> cancellableContinuation) {
        return new IAccount.Callback<T, ErrorCode>() { // from class: com.huami.passport.AccountManagerExt.callbackWrapper.3
            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(@Nullable T result) {
                CancellableContinuation<OperationResult<? extends T>> cancellableContinuation2 = cancellableContinuation;
                OperationResult operationResult = new OperationResult(result, null);
                Result.Companion companion = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m3845constructorimpl(operationResult));
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(@Nullable ErrorCode error) {
                CancellableContinuation<OperationResult<? extends T>> cancellableContinuation2 = cancellableContinuation;
                OperationResult operationResult = new OperationResult(null, error);
                Result.Companion companion = Result.Companion;
                cancellableContinuation2.resumeWith(Result.m3845constructorimpl(operationResult));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object callbackWrapper(Function1<? super CancellableContinuation<? super OperationResult<? extends T>>, Unit> function1, Continuation<? super OperationResult<? extends T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        function1.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
