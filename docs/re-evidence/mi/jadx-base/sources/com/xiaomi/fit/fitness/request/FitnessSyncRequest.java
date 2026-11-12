package com.xiaomi.fit.fitness.request;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.request.FitnessSyncRequest;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086@¢\u0006\u0002\u0010\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fit/fitness/request/FitnessSyncRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fit/fitness/request/FitnessSyncService;", "<init>", "()V", "mFitnessSyncGson", "Lcom/google/gson/Gson;", "getMFitnessSyncGson", "()Lcom/google/gson/Gson;", "mFitnessSyncGson$delegate", "Lkotlin/Lazy;", "getLastSyncTime", "Lcom/xiaomi/fit/fitness/request/GetLastSyncItem;", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postLastSyncTime", "itemList", "", "Lcom/xiaomi/fit/fitness/request/LastSyncItem;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessSyncRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessSyncRequest.kt\ncom/xiaomi/fit/fitness/request/FitnessSyncRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,28:1\n141#2:29\n141#2:33\n31#3:30\n28#3,2:31\n31#3:34\n28#3,2:35\n*S KotlinDebug\n*F\n+ 1 FitnessSyncRequest.kt\ncom/xiaomi/fit/fitness/request/FitnessSyncRequest\n*L\n19#1:29\n26#1:33\n19#1:30\n19#1:31,2\n26#1:34\n26#1:35,2\n*E\n"})
public final class FitnessSyncRequest extends BaseRequest<FitnessSyncService> {

    /* JADX INFO: renamed from: mFitnessSyncGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessSyncGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mw9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessSyncRequest.mFitnessSyncGson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.request.FitnessSyncRequest$getLastSyncTime$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.request.FitnessSyncRequest", f = "FitnessSyncRequest.kt", i = {}, l = {19}, m = "getLastSyncTime", n = {}, s = {})
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
            return FitnessSyncRequest.this.getLastSyncTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.request.FitnessSyncRequest$postLastSyncTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.request.FitnessSyncRequest", f = "FitnessSyncRequest.kt", i = {}, l = {26}, m = "postLastSyncTime", n = {}, s = {})
    public static final class C17141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17141(Continuation<? super C17141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessSyncRequest.this.postLastSyncTime(null, null, this);
        }
    }

    private final Gson getMFitnessSyncGson() {
        return (Gson) this.mFitnessSyncGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mFitnessSyncGson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLastSyncTime(@NotNull String str, @NotNull Continuation<? super GetLastSyncItem> continuation) {
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
        Object lastSyncTime = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(lastSyncTime);
            String json = getMFitnessSyncGson().toJson(new GetLastSyncItemParams(str));
            FitnessLogUtils.i("FitnessSyncRequest", "getLastSyncTime PARAMS=" + json);
            FitnessSyncService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            lastSyncTime = mService.getLastSyncTime(json, anonymousClass1);
            if (lastSyncTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(lastSyncTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(lastSyncTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object postLastSyncTime(@NotNull String str, @NotNull List<LastSyncItem> list, @NotNull Continuation<? super String> continuation) {
        C17141 c17141;
        if (continuation instanceof C17141) {
            c17141 = (C17141) continuation;
            int i = c17141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17141.label = i - Integer.MIN_VALUE;
            } else {
                c17141 = new C17141(continuation);
            }
        } else {
            c17141 = new C17141(continuation);
        }
        Object lastSyncTime = c17141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c17141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(lastSyncTime);
            String json = getMFitnessSyncGson().toJson(new SetLastSyncItemParams(str, list));
            FitnessLogUtils.i("FitnessSyncRequest", "postLastSyncTime PARAMS=" + json);
            FitnessSyncService mService = getMService();
            Intrinsics.checkNotNull(json);
            c17141.label = 1;
            lastSyncTime = mService.setLastSyncTime(json, c17141);
            if (lastSyncTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(lastSyncTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(lastSyncTime);
    }
}
