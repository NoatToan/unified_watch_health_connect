package com.xiaomi.fitness.health.ecg;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.ecg.net.EcgRequest;
import com.xiaomi.fitness.health.ecg.net.GetAccessTokenResult;
import com.xiaomi.fitness.health.ecg.net.GetPrivacyResult;
import com.xiaomi.fitness.health.ecg.net.GetVipInfoResult;
import com.xiaomi.fitness.health.ecg.net.SetPrivacyResult;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;", "", "ecgRequest", "Lcom/xiaomi/fitness/health/ecg/net/EcgRequest;", "<init>", "(Lcom/xiaomi/fitness/health/ecg/net/EcgRequest;)V", "setEcgDataPrivacyAgree", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShowPrivacyStatus", "getAccessToken", "Lcom/xiaomi/fitness/health/ecg/net/GetAccessTokenResult;", "needRefresh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVipInfo", "Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgAnalyzeRepository {

    @NotNull
    public static final String HLW_MODEL = "hlw";
    public static final int MI_REFRESH_TOKEN_EXPIRED = -34;

    @NotNull
    public static final String TAG = "EcgRepo";

    @NotNull
    private final EcgRequest ecgRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository$getAccessToken$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository", f = "EcgAnalyzeRepository.kt", i = {}, l = {50}, m = "getAccessToken", n = {}, s = {})
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
            return EcgAnalyzeRepository.this.getAccessToken(false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository$getShowPrivacyStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository", f = "EcgAnalyzeRepository.kt", i = {}, l = {37}, m = "getShowPrivacyStatus", n = {}, s = {})
    public static final class C24481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24481(Continuation<? super C24481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgAnalyzeRepository.this.getShowPrivacyStatus(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository$getVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository", f = "EcgAnalyzeRepository.kt", i = {}, l = {64}, m = "getVipInfo", n = {}, s = {})
    public static final class C24491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24491(Continuation<? super C24491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgAnalyzeRepository.this.getVipInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository$setEcgDataPrivacyAgree$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository", f = "EcgAnalyzeRepository.kt", i = {0}, l = {25}, m = "setEcgDataPrivacyAgree", n = {"agreeResult"}, s = {"I$0"})
    public static final class C24501 extends ContinuationImpl {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C24501(Continuation<? super C24501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgAnalyzeRepository.this.setEcgDataPrivacyAgree(this);
        }
    }

    public EcgAnalyzeRepository(@NotNull EcgRequest ecgRequest) {
        Intrinsics.checkNotNullParameter(ecgRequest, "ecgRequest");
        this.ecgRequest = ecgRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAccessToken(boolean z, @NotNull Continuation<? super GetAccessTokenResult> continuation) {
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
        Object ecgHlwAccessToken = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        GetAccessTokenResult getAccessTokenResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(ecgHlwAccessToken);
                Logger.i(TAG, "getAccessToken refresh " + z);
                EcgRequest ecgRequest = this.ecgRequest;
                anonymousClass1.label = 1;
                ecgHlwAccessToken = ecgRequest.getEcgHlwAccessToken("2882303761520200290", z, anonymousClass1);
                if (ecgHlwAccessToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(ecgHlwAccessToken);
            }
            GetAccessTokenResult getAccessTokenResult2 = (GetAccessTokenResult) ecgHlwAccessToken;
            try {
                Logger.i(TAG, "getAccessToken result " + getAccessTokenResult2);
                return getAccessTokenResult2;
            } catch (Exception e) {
                e = e;
                getAccessTokenResult = getAccessTokenResult2;
                Logger.i(TAG, "getAccessToken exception " + e);
                return e instanceof ApiException ? new GetAccessTokenResult(null, null, null, ((ApiException) e).getErrorCode(), 7, null) : getAccessTokenResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getShowPrivacyStatus(@NotNull Continuation<? super Boolean> continuation) {
        C24481 c24481;
        if (continuation instanceof C24481) {
            c24481 = (C24481) continuation;
            int i = c24481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24481.label = i - Integer.MIN_VALUE;
            } else {
                c24481 = new C24481(continuation);
            }
        } else {
            c24481 = new C24481(continuation);
        }
        Object ecgPrivacy = c24481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24481.label;
        boolean z = true;
        Boolean boolBoxBoolean = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(ecgPrivacy);
                EcgRequest ecgRequest = this.ecgRequest;
                c24481.label = 1;
                ecgPrivacy = ecgRequest.getEcgPrivacy(HLW_MODEL, c24481);
                if (ecgPrivacy == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(ecgPrivacy);
            }
            GetPrivacyResult getPrivacyResult = (GetPrivacyResult) ecgPrivacy;
            if (getPrivacyResult.getType() == 0) {
                z = false;
            }
            boolBoxBoolean = Boxing.boxBoolean(z);
            Logger.i(TAG, "getShowPrivacyStatus result " + getPrivacyResult);
            return boolBoxBoolean;
        } catch (Exception e) {
            Logger.i(TAG, "getShowPrivacyStatus exception " + e);
            return boolBoxBoolean;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getVipInfo(@NotNull Continuation<? super GetVipInfoResult> continuation) {
        C24491 c24491;
        if (continuation instanceof C24491) {
            c24491 = (C24491) continuation;
            int i = c24491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24491.label = i - Integer.MIN_VALUE;
            } else {
                c24491 = new C24491(continuation);
            }
        } else {
            c24491 = new C24491(continuation);
        }
        Object vipInfo = c24491.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24491.label;
        GetVipInfoResult getVipInfoResult = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(vipInfo);
                EcgRequest ecgRequest = this.ecgRequest;
                c24491.label = 1;
                vipInfo = ecgRequest.getVipInfo(c24491);
                if (vipInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(vipInfo);
            }
            GetVipInfoResult getVipInfoResult2 = (GetVipInfoResult) vipInfo;
            try {
                Logger.i(TAG, "getVipInfo result " + getVipInfoResult2);
                return getVipInfoResult2;
            } catch (Exception e) {
                getVipInfoResult = getVipInfoResult2;
                e = e;
                Logger.i(TAG, "getVipInfo exception " + e);
                return getVipInfoResult;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Nullable
    public final Object setEcgDataPrivacyAgree(@NotNull Continuation<? super Boolean> continuation) {
        C24501 c24501;
        ?? AreEqual;
        ?? r0;
        if (continuation instanceof C24501) {
            c24501 = (C24501) continuation;
            int i = c24501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24501.label = i - Integer.MIN_VALUE;
            } else {
                c24501 = new C24501(continuation);
            }
        } else {
            c24501 = new C24501(continuation);
        }
        C24501 c24502 = c24501;
        Object ecgDataPrivacy = c24502.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24502.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecgDataPrivacy);
            try {
                EcgRequest ecgRequest = this.ecgRequest;
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                c24502.I$0 = 0;
                c24502.label = 1;
                ecgDataPrivacy = ecgRequest.setEcgDataPrivacy(HLW_MODEL, true, jCurrentTimeMillis, c24502);
                if (ecgDataPrivacy == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e) {
                e = e;
                AreEqual = 0;
                Logger.i(TAG, "setEcgDataPrivacyAgree exception " + e);
                r0 = AreEqual;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AreEqual = c24502.I$0;
            try {
                ResultKt.throwOnFailure(ecgDataPrivacy);
            } catch (Exception e2) {
                e = e2;
                Logger.i(TAG, "setEcgDataPrivacyAgree exception " + e);
                r0 = AreEqual;
            }
        }
        SetPrivacyResult setPrivacyResult = (SetPrivacyResult) ecgDataPrivacy;
        AreEqual = Intrinsics.areEqual(SNSAuthProvider.VALUE_SNS_OK, setPrivacyResult.getResult());
        Logger.i(TAG, "setEcgDataPrivacyAgree result " + setPrivacyResult);
        r0 = AreEqual;
        return Boxing.boxBoolean(r0 != 0);
    }
}
