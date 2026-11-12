package com.xiaomi.fit.fitness.persist.server;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.persist.server.data.FDSItem;
import com.xiaomi.fit.fitness.persist.server.data.FDSRequestParam;
import com.xiaomi.fit.fitness.persist.server.data.FDSResultValue;
import com.xiaomi.fit.fitness.persist.server.data.GetAlgoFileUrlParam;
import com.xiaomi.fit.fitness.persist.server.service.FDSApiService;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.prk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fit/fitness/persist/server/service/FDSApiService;", "", "sid", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FDSItem;", "items", "", "upload", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FDSResultValue;", "getFDSUrl", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "item", "getFDSUploadUrl", "(Ljava/lang/String;[Lcom/xiaomi/fit/fitness/persist/server/data/FDSItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFDSDownloadUrl", "url", "Lkotlinx/coroutines/flow/Flow;", "Lprk;", "Lokhttp3/ResponseBody;", "getRouteFDSUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "dataId", "fileName", "getSleepSrcDataUploadUrl", "(Ljava/lang/String;Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFitnessFDSRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessFDSRequest.kt\ncom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,69:1\n141#2:70\n141#2:74\n141#2:78\n31#3:71\n28#3,2:72\n31#3:75\n28#3,2:76\n31#3:79\n28#3,2:80\n*S KotlinDebug\n*F\n+ 1 FitnessFDSRequest.kt\ncom/xiaomi/fit/fitness/persist/server/FitnessFDSRequest\n*L\n43#1:70\n45#1:74\n66#1:78\n43#1:71\n43#1:72,2\n45#1:75\n45#1:76,2\n66#1:79\n66#1:80,2\n*E\n"})
public final class FitnessFDSRequest extends BaseRequest<FDSApiService> {

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest$getFDSUrl$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest", f = "FitnessFDSRequest.kt", i = {}, l = {43, 45}, m = "getFDSUrl", n = {}, s = {})
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
            return FitnessFDSRequest.this.getFDSUrl(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest$getSleepSrcDataUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessFDSRequest", f = "FitnessFDSRequest.kt", i = {}, l = {66}, m = "getSleepSrcDataUploadUrl", n = {}, s = {})
    public static final class C16951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16951(Continuation<? super C16951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessFDSRequest.this.getSleepSrcDataUploadUrl(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getFDSUrl(String str, List<FDSItem> list, boolean z, Continuation<? super Map<String, FDSResultValue>> continuation) {
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
        Object fDSDownloadUrl = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(fDSDownloadUrl);
                return (Map) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fDSDownloadUrl);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(fDSDownloadUrl);
            return (Map) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fDSDownloadUrl);
        }
        ResultKt.throwOnFailure(fDSDownloadUrl);
        String json = FitnessPersistUtils.INSTANCE.toJson(new FDSRequestParam(str, list));
        if (z) {
            FDSApiService mService = getMService();
            anonymousClass1.label = 1;
            fDSDownloadUrl = mService.getFDSUploadUrl(json, anonymousClass1);
            if (fDSDownloadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Map) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fDSDownloadUrl);
        }
        FDSApiService mService2 = getMService();
        anonymousClass1.label = 2;
        fDSDownloadUrl = mService2.getFDSDownloadUrl(json, anonymousClass1);
        if (fDSDownloadUrl == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Map) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fDSDownloadUrl);
    }

    @Nullable
    public final Object getFDSDownloadUrl(@NotNull String str, @NotNull FDSItem[] fDSItemArr, @NotNull Continuation<? super Map<String, FDSResultValue>> continuation) {
        return getFDSUrl(str, ArraysKt___ArraysJvmKt.asList(fDSItemArr), false, continuation);
    }

    @Nullable
    public final Object getFDSUploadUrl(@NotNull String str, @NotNull FDSItem[] fDSItemArr, @NotNull Continuation<? super Map<String, FDSResultValue>> continuation) {
        return getFDSUrl(str, ArraysKt___ArraysJvmKt.asList(fDSItemArr), true, continuation);
    }

    @Nullable
    public final Object getRouteFDSUrl(@NotNull String str, @NotNull Continuation<? super Flow<prk<ResponseBody>>> continuation) {
        return getMService().downloadRoute(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSleepSrcDataUploadUrl(@NotNull String str, @NotNull FitnessDataId fitnessDataId, @NotNull String str2, @NotNull Continuation<? super FDSResultValue> continuation) {
        C16951 c16951;
        if (continuation instanceof C16951) {
            c16951 = (C16951) continuation;
            int i = c16951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16951.label = i - Integer.MIN_VALUE;
            } else {
                c16951 = new C16951(continuation);
            }
        } else {
            c16951 = new C16951(continuation);
        }
        Object algoFileUploadUrl = c16951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(algoFileUploadUrl);
            String json = FitnessPersistUtils.INSTANCE.toJson(GetAlgoFileUrlParam.INSTANCE.createSleepSrcDataUrl(str, fitnessDataId.getTimeStamp(), str2, fitnessDataId.getTzOffsetInSec()));
            FDSApiService mService = getMService();
            c16951.label = 1;
            algoFileUploadUrl = mService.getAlgoFileUploadUrl(json, c16951);
            if (algoFileUploadUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(algoFileUploadUrl);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(algoFileUploadUrl);
    }
}
