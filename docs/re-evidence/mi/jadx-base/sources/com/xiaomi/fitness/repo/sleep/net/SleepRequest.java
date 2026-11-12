package com.xiaomi.fitness.repo.sleep.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/net/SleepRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/repo/sleep/net/SleepService;", "<init>", "()V", "getSleepScoreUserDistribute", "Lcom/xiaomi/fitness/repo/sleep/net/SleepDistributeResult;", "age", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/SleepRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,30:1\n141#2:31\n31#3:32\n28#3,2:33\n*S KotlinDebug\n*F\n+ 1 SleepRequest.kt\ncom/xiaomi/fitness/repo/sleep/net/SleepRequest\n*L\n22#1:31\n22#1:32\n22#1:33,2\n*E\n"})
public final class SleepRequest extends BaseRequest<SleepService> {

    @NotNull
    public static final String TAG = "SleepRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.sleep.net.SleepRequest$getSleepScoreUserDistribute$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.sleep.net.SleepRequest", f = "SleepRequest.kt", i = {}, l = {21}, m = "getSleepScoreUserDistribute", n = {}, s = {})
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
            return SleepRequest.this.getSleepScoreUserDistribute(0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSleepScoreUserDistribute(int i, @NotNull Continuation<? super SleepDistributeResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object sleepUserDistributionConfig = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(sleepUserDistributionConfig);
                Logger.i(TAG, "getSleepScoreUserDistribute start .. param[" + i + "]");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("age", Boxing.boxInt(i));
                linkedHashMap.put("type", Boxing.boxInt(1));
                SleepService mService = getMService();
                String json = getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                anonymousClass1.label = 1;
                sleepUserDistributionConfig = mService.getSleepUserDistributionConfig(json, anonymousClass1);
                if (sleepUserDistributionConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(sleepUserDistributionConfig);
            }
            SleepDistributeResult sleepDistributeResult = (SleepDistributeResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sleepUserDistributionConfig);
            Logger.i(TAG, "getSleepScoreUserDistribute success " + sleepDistributeResult);
            return sleepDistributeResult;
        } catch (Exception e) {
            Logger.i(TAG, "getSleepScoreUserDistribute exception " + e);
            return null;
        }
    }
}
