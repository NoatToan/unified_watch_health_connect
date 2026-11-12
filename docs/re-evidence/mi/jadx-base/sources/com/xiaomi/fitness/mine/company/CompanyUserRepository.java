package com.xiaomi.fitness.mine.company;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;", "", "<init>", "()V", "companyUserRequest", "Lcom/xiaomi/fitness/mine/company/CompanyUserRequest;", "getCompanyUserRequest", "()Lcom/xiaomi/fitness/mine/company/CompanyUserRequest;", "setCompanyUserRequest", "(Lcom/xiaomi/fitness/mine/company/CompanyUserRequest;)V", "getCompanyUserEntrance", "Lcom/xiaomi/fitness/mine/company/CompanyUserEntranceResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompanyUserRepository {

    @NotNull
    public static final String TAG = "ThirdPartyCompanyRepository";
    public CompanyUserRequest companyUserRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.company.CompanyUserRepository$getCompanyUserEntrance$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.company.CompanyUserRepository", f = "CompanyUserRepository.kt", i = {}, l = {20}, m = "getCompanyUserEntrance", n = {}, s = {})
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
            return CompanyUserRepository.this.getCompanyUserEntrance(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCompanyUserEntrance(@NotNull Continuation<? super CompanyUserEntranceResult> continuation) {
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
        Object companyUserEntrance = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        CompanyUserEntranceResult companyUserEntranceResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(companyUserEntrance);
                CompanyUserRequest companyUserRequest = getCompanyUserRequest();
                anonymousClass1.label = 1;
                companyUserEntrance = companyUserRequest.getCompanyUserEntrance(anonymousClass1);
                if (companyUserEntrance == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(companyUserEntrance);
            }
            CompanyUserEntranceResult companyUserEntranceResult2 = (CompanyUserEntranceResult) companyUserEntrance;
            try {
                Logger.i(TAG, "getCompanyUserEntrance succeeded. result=" + companyUserEntranceResult2);
                return companyUserEntranceResult2;
            } catch (Exception e) {
                companyUserEntranceResult = companyUserEntranceResult2;
                e = e;
                Logger.i(TAG, "getCompanyUserEntrance failed. e=" + e);
                return companyUserEntranceResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @NotNull
    public final CompanyUserRequest getCompanyUserRequest() {
        CompanyUserRequest companyUserRequest = this.companyUserRequest;
        if (companyUserRequest != null) {
            return companyUserRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("companyUserRequest");
        return null;
    }

    public final void setCompanyUserRequest(@NotNull CompanyUserRequest companyUserRequest) {
        Intrinsics.checkNotNullParameter(companyUserRequest, "<set-?>");
        this.companyUserRequest = companyUserRequest;
    }
}
