package com.xiaomi.fitness.account.api;

import com.xiaomi.fitness.account.api.bean.GetPersonalQrCodeResult;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/account/api/AccountV1Request;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/account/api/AccountV1Service;", "<init>", "()V", "getPersonalQrCode", "Lcom/xiaomi/fitness/account/api/bean/GetPersonalQrCodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountV1Request.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountV1Request.kt\ncom/xiaomi/fitness/account/api/AccountV1Request\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,15:1\n141#2:16\n31#3:17\n28#3,2:18\n*S KotlinDebug\n*F\n+ 1 AccountV1Request.kt\ncom/xiaomi/fitness/account/api/AccountV1Request\n*L\n13#1:16\n13#1:17\n13#1:18,2\n*E\n"})
public final class AccountV1Request extends BaseRequest<AccountV1Service> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AccountV1Request instance = new AccountV1Request();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/account/api/AccountV1Request$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/account/api/AccountV1Request;", "getInstance", "()Lcom/xiaomi/fitness/account/api/AccountV1Request;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AccountV1Request getInstance() {
            return AccountV1Request.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.account.api.AccountV1Request$getPersonalQrCode$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.account.api.AccountV1Request", f = "AccountV1Request.kt", i = {}, l = {13}, m = "getPersonalQrCode", n = {}, s = {})
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
            return AccountV1Request.this.getPersonalQrCode(this);
        }
    }

    private AccountV1Request() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPersonalQrCode(@NotNull Continuation<? super GetPersonalQrCodeResult> continuation) {
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
            AccountV1Service mService = getMService();
            anonymousClass1.label = 1;
            personalQrCode = mService.getPersonalQrCode(anonymousClass1);
            if (personalQrCode == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(personalQrCode);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(personalQrCode);
    }
}
