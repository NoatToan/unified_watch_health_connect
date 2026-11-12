package com.xiaomi.fitness.health.ecg.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.login.bean.PrivacyAgreeModel;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.onetrack.c.q;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/net/EcgRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/health/ecg/net/EcgApiService;", "<init>", "()V", "setEcgDataPrivacy", "Lcom/xiaomi/fitness/health/ecg/net/SetPrivacyResult;", "model", "", PrivacyAgreeModel.TYPE_ACCEPT, "", "timeSeconds", "", "(Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEcgPrivacy", "Lcom/xiaomi/fitness/health/ecg/net/GetPrivacyResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEcgHlwAccessToken", "Lcom/xiaomi/fitness/health/ecg/net/GetAccessTokenResult;", q.f13858b, "needRefresh", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVipInfo", "Lcom/xiaomi/fitness/health/ecg/net/GetVipInfoResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcgRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgRequest.kt\ncom/xiaomi/fitness/health/ecg/net/EcgRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,44:1\n141#2:45\n141#2:49\n141#2:53\n141#2:57\n141#2:61\n31#3:46\n28#3,2:47\n31#3:50\n28#3,2:51\n31#3:54\n28#3,2:55\n31#3:58\n28#3,2:59\n31#3:62\n28#3,2:63\n*S KotlinDebug\n*F\n+ 1 EcgRequest.kt\ncom/xiaomi/fitness/health/ecg/net/EcgRequest\n*L\n23#1:45\n28#1:49\n35#1:53\n37#1:57\n42#1:61\n23#1:46\n23#1:47,2\n28#1:50\n28#1:51,2\n35#1:54\n35#1:55,2\n37#1:58\n37#1:59,2\n42#1:62\n42#1:63,2\n*E\n"})
public final class EcgRequest extends BaseRequest<EcgApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.net.EcgRequest$getEcgHlwAccessToken$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.net.EcgRequest", f = "EcgRequest.kt", i = {}, l = {35, 37}, m = "getEcgHlwAccessToken", n = {}, s = {})
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
            return EcgRequest.this.getEcgHlwAccessToken(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.net.EcgRequest$getEcgPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.net.EcgRequest", f = "EcgRequest.kt", i = {}, l = {28}, m = "getEcgPrivacy", n = {}, s = {})
    public static final class C24621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24621(Continuation<? super C24621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRequest.this.getEcgPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.net.EcgRequest$getVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.net.EcgRequest", f = "EcgRequest.kt", i = {}, l = {42}, m = "getVipInfo", n = {}, s = {})
    public static final class C24631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24631(Continuation<? super C24631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRequest.this.getVipInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.net.EcgRequest$setEcgDataPrivacy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.net.EcgRequest", f = "EcgRequest.kt", i = {}, l = {23}, m = "setEcgDataPrivacy", n = {}, s = {})
    public static final class C24641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C24641(Continuation<? super C24641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgRequest.this.setEcgDataPrivacy(null, false, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getEcgHlwAccessToken(@NotNull String str, boolean z, @NotNull Continuation<? super GetAccessTokenResult> continuation) {
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
        Object accessToken = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(accessToken);
                return (GetAccessTokenResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(accessToken);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(accessToken);
            return (GetAccessTokenResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(accessToken);
        }
        ResultKt.throwOnFailure(accessToken);
        String json = getMGson().toJson(new GetAccessTokenRequestParams(str));
        if (z) {
            EcgApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            accessToken = mService.refreshAccessToken(json, anonymousClass1);
            if (accessToken == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (GetAccessTokenResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(accessToken);
        }
        EcgApiService mService2 = getMService();
        Intrinsics.checkNotNull(json);
        anonymousClass1.label = 2;
        accessToken = mService2.getAccessToken(json, anonymousClass1);
        if (accessToken == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (GetAccessTokenResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(accessToken);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getEcgPrivacy(@NotNull String str, @NotNull Continuation<? super GetPrivacyResult> continuation) {
        C24621 c24621;
        if (continuation instanceof C24621) {
            c24621 = (C24621) continuation;
            int i = c24621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24621.label = i - Integer.MIN_VALUE;
            } else {
                c24621 = new C24621(continuation);
            }
        } else {
            c24621 = new C24621(continuation);
        }
        Object ecgPrivacyChange = c24621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24621.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecgPrivacyChange);
            GetPrivacyRequestParams getPrivacyRequestParams = new GetPrivacyRequestParams(str);
            EcgApiService mService = getMService();
            String json = getMGson().toJson(getPrivacyRequestParams);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c24621.label = 1;
            ecgPrivacyChange = mService.getEcgPrivacyChange(json, c24621);
            if (ecgPrivacyChange == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(ecgPrivacyChange);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(ecgPrivacyChange);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getVipInfo(@NotNull Continuation<? super GetVipInfoResult> continuation) {
        C24631 c24631;
        if (continuation instanceof C24631) {
            c24631 = (C24631) continuation;
            int i = c24631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24631.label = i - Integer.MIN_VALUE;
            } else {
                c24631 = new C24631(continuation);
            }
        } else {
            c24631 = new C24631(continuation);
        }
        Object vipInfo = c24631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(vipInfo);
            EcgApiService mService = getMService();
            c24631.label = 1;
            vipInfo = mService.getVipInfo(c24631);
            if (vipInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(vipInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(vipInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setEcgDataPrivacy(@NotNull String str, boolean z, long j, @NotNull Continuation<? super SetPrivacyResult> continuation) {
        C24641 c24641;
        if (continuation instanceof C24641) {
            c24641 = (C24641) continuation;
            int i = c24641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24641.label = i - Integer.MIN_VALUE;
            } else {
                c24641 = new C24641(continuation);
            }
        } else {
            c24641 = new C24641(continuation);
        }
        Object ecgDataPrivacy = c24641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c24641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecgDataPrivacy);
            String json = getMGson().toJson(new SetPrivacyRequestParams(str, z ? PrivacyAgreeModel.TYPE_ACCEPT : "remove", j, AppVersionUtil.INSTANCE.getAppVersionName()));
            EcgApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c24641.label = 1;
            ecgDataPrivacy = mService.setEcgDataPrivacy(json, c24641);
            if (ecgDataPrivacy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(ecgDataPrivacy);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(ecgDataPrivacy);
    }
}
